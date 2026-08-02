package com.squareup.cash.card.onboarding;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.icu.text.MessageFormat;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.media3.common.util.StuckPlayerDetector;
import androidx.paging.FlowExtKt;
import androidx.paging.GenerationalViewportHint;
import androidx.paging.LoadType;
import androidx.recyclerview.widget.RecyclerView;
import androidx.webkit.internal.AssetHelper;
import app.cash.badging.backend.FormattedResources;
import app.cash.local.presenters.LocalPresenterFactoryKt;
import app.cash.local.primitives.ComputedOrderSummaryKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.n;
import com.google.android.gms.maps.GoogleMap;
import com.google.maps.android.clustering.ClusterManager;
import com.squareup.cash.R;
import com.squareup.cash.banking.viewmodels.RecurringDepositsViewModel;
import com.squareup.cash.boost.db.Reward$Adapter;
import com.squareup.cash.boost.db.RewardWithSelection;
import com.squareup.cash.borrow.backend.RealBorrowDataManager;
import com.squareup.cash.cashoclock.api.v1_0.syncvalues.CashOClockPreference;
import com.squareup.cash.cashoclock.api.v1_0.syncvalues.RecurringSchedule;
import com.squareup.cash.cashoclock.api.v1_0.syncvalues.ScheduledReload;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.crypto.backend.balance.RealRestrictedBalanceStore;
import com.squareup.cash.crypto.backend.balance.RestrictedBalance;
import com.squareup.cash.data.contacts.ContactModifiablePermissions;
import com.squareup.cash.data.contacts.ContactsSyncState;
import com.squareup.cash.data.db.RealAppConfigManager;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options;
import com.squareup.cash.instruments.common.BalanceSnapshot;
import com.squareup.cash.instruments.common.Instrument;
import com.squareup.cash.investing.backend.api.NetworkStatus;
import com.squareup.cash.investing.backend.api.PolledData;
import com.squareup.cash.investing.backend.real.RealEntityPriceRefresher;
import com.squareup.cash.investing.backend.real.RealHistoricalPriceTickRefresher;
import com.squareup.cash.investing.backend.real.RealInvestingHistoricalData;
import com.squareup.cash.investing.backend.real.RealInvestmentEntitiesKt;
import com.squareup.cash.investing.db.Investing_news_article;
import com.squareup.cash.investingcrypto.presenters.news.InvestingCryptoNewsPresenter$NewsKindDetails;
import com.squareup.cash.investingcrypto.viewmodels.news.InvestingCryptoNewsArticleViewModel;
import com.squareup.cash.investingcrypto.viewmodels.news.InvestingCryptoNewsViewModel;
import com.squareup.cash.investingcrypto.viewmodels.news.InvestingCryptoViewAllNewsModel;
import com.squareup.cash.moneybot.presenters.MoneybotHomePresenter;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.offers.backend.api.OffersAnalyticsHelper$RewardMetadata;
import com.squareup.cash.paymentpad.presenters.RealPaymentTabSettings;
import com.squareup.cash.paymentpad.viewmodels.PaymentPadTheme;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.sharesheet.RealShareTargetsManager$TargetPreparationState;
import com.squareup.cash.sharesheet.ShareTarget;
import com.squareup.cash.support.chat.backend.api.MessageStatus$Failed;
import com.squareup.cash.support.chat.backend.api.PendingMessage;
import com.squareup.cash.support.chat.backend.api.RecordedMessage;
import com.squareup.cash.support.chat.backend.api.Transcript;
import com.squareup.cash.support.chat.backend.real.PendingTranscript;
import com.squareup.cash.support.chat.backend.real.RealConversationService;
import com.squareup.cash.support.chat.backend.real.RecordedTranscript;
import com.squareup.cash.transfers.backend.api.BalanceBasedAddCashPreference;
import com.squareup.cash.transfers.backend.api.RecurringSchedule;
import com.squareup.cash.transfers.backend.api.ScheduledReloadsPreference;
import com.squareup.cash.transfers.backend.real.RealBalanceBasedAddCashManager;
import com.squareup.cash.transfers.backend.real.RealScheduledReloadsManager;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.wallet.data.CashAppTag;
import com.squareup.cash.wallet.data.RealCashAppTagManager;
import com.squareup.cash.wallet.data.TagFormFactor;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.cash.wallet.views.HeroCardViewKt;
import com.squareup.cash.work.data.api.ClockInEssentials;
import com.squareup.cash.work.data.api.LoaderState;
import com.squareup.cash.work.identifiers.MerchantIdentifier;
import com.squareup.cash.work.presenters.RealSellerCardViewModelProducer;
import com.squareup.cash.work.tinygraph.models.Job;
import com.squareup.cash.work.tinygraph.models.Location;
import com.squareup.cash.work.tinygraph.models.Merchant;
import com.squareup.moshi.LinkedHashTreeMap;
import com.squareup.protos.cash.api.Error;
import com.squareup.protos.cash.balancebasedaddcash.api.v1_0.syncvalues.BalanceBasedAddCashPreference;
import com.squareup.protos.cash.balancebasedaddcash.api.v1_0.syncvalues.BalanceBasedAddCashPreference$Preference$Disabled;
import com.squareup.protos.cash.balancebasedaddcash.api.v1_0.syncvalues.BalanceBasedAddCashPreference$Preference$Enabled;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.marketprices.service.GetInvestmentEntityHistoricalDataResponse;
import com.squareup.protos.cash.portfolios.GetPortfoliosHistoricalDataResponse;
import com.squareup.protos.cash.taply.syncvalues.CashAppTag;
import com.squareup.protos.cash.taply.syncvalues.PhysicalTagOrderState;
import com.squareup.protos.cash.taply.syncvalues.TagThemeDefinition;
import com.squareup.protos.cash.taply.syncvalues.TagThemeDefinitions;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.app.GetHistoricalExchangeDataResponse;
import com.squareup.protos.lending.sync_values.BorrowData;
import com.squareup.protos.lending.sync_values.Tile;
import com.squareup.protos.repeatedly.common.ScheduledTransactionPreference;
import com.squareup.protos.timecards.scheduling.ShiftSchedule;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.text.DateFormatSymbols;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import papa.SafeTrace;
import squareup.cash.cryptocurrency.BitcoinDisplayUnits;

/* loaded from: classes6.dex */
public final class CardModelView$getActiveHeat$2$2 extends SuspendLambda implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardModelView$getActiveHeat$2$2(CardSchemeViewModel.Module.Accessory.Button button, MutableState mutableState, MutableFloatState mutableFloatState, Continuation continuation) {
        super(3, continuation);
        this.$r8$classId = 22;
        this.L$0 = button;
        this.L$1 = mutableState;
        this.this$0 = mutableFloatState;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        Object obj4 = this.this$0;
        switch (i) {
            case 0:
                CardModelView$getActiveHeat$2$2 cardModelView$getActiveHeat$2$2 = new CardModelView$getActiveHeat$2$2((CardModelView) obj4, (Continuation) obj3, 0);
                cardModelView$getActiveHeat$2$2.L$0 = (Bitmap) obj;
                cardModelView$getActiveHeat$2$2.L$1 = (PointF) obj2;
                return cardModelView$getActiveHeat$2$2.invokeSuspend(Unit.INSTANCE);
            case 1:
                CardModelView$getActiveHeat$2$2 cardModelView$getActiveHeat$2$22 = new CardModelView$getActiveHeat$2$2((LoadType) obj4, (Continuation) obj3, 1);
                cardModelView$getActiveHeat$2$22.L$0 = (GenerationalViewportHint) obj;
                cardModelView$getActiveHeat$2$22.L$1 = (GenerationalViewportHint) obj2;
                return cardModelView$getActiveHeat$2$22.invokeSuspend(Unit.INSTANCE);
            case 2:
                CardModelView$getActiveHeat$2$2 cardModelView$getActiveHeat$2$23 = new CardModelView$getActiveHeat$2$2((MutableState) this.L$1, (Context) obj4, (Continuation) obj3);
                cardModelView$getActiveHeat$2$23.L$0 = (GoogleMap) obj2;
                return cardModelView$getActiveHeat$2$23.invokeSuspend(Unit.INSTANCE);
            case 3:
                CardModelView$getActiveHeat$2$2 cardModelView$getActiveHeat$2$24 = new CardModelView$getActiveHeat$2$2((n) obj4, (Continuation) obj3, 3);
                cardModelView$getActiveHeat$2$24.L$0 = (ScheduledReloadsPreference) obj;
                cardModelView$getActiveHeat$2$24.L$1 = (List) obj2;
                return cardModelView$getActiveHeat$2$24.invokeSuspend(Unit.INSTANCE);
            case 4:
                CardModelView$getActiveHeat$2$2 cardModelView$getActiveHeat$2$25 = new CardModelView$getActiveHeat$2$2((RealBorrowDataManager) obj4, (Continuation) obj3, 4);
                cardModelView$getActiveHeat$2$25.L$0 = (Map) obj;
                cardModelView$getActiveHeat$2$25.L$1 = (List) obj2;
                return cardModelView$getActiveHeat$2$25.invokeSuspend(Unit.INSTANCE);
            case 5:
                CardModelView$getActiveHeat$2$2 cardModelView$getActiveHeat$2$26 = new CardModelView$getActiveHeat$2$2((RealRestrictedBalanceStore) obj4, (Continuation) obj3, 5);
                cardModelView$getActiveHeat$2$26.L$0 = (String) obj;
                cardModelView$getActiveHeat$2$26.L$1 = (List) obj2;
                return cardModelView$getActiveHeat$2$26.invokeSuspend(Unit.INSTANCE);
            case 6:
                CardModelView$getActiveHeat$2$2 cardModelView$getActiveHeat$2$27 = new CardModelView$getActiveHeat$2$2((ContactModifiablePermissions) obj4, (Continuation) obj3, 6);
                cardModelView$getActiveHeat$2$27.L$0 = (ContactModifiablePermissions.PermissionTuple) obj;
                cardModelView$getActiveHeat$2$27.L$1 = (ContactModifiablePermissions.PermissionTuple) obj2;
                return cardModelView$getActiveHeat$2$27.invokeSuspend(Unit.INSTANCE);
            case 7:
                CardModelView$getActiveHeat$2$2 cardModelView$getActiveHeat$2$28 = new CardModelView$getActiveHeat$2$2((RealAppConfigManager) obj4, (Continuation) obj3, 7);
                cardModelView$getActiveHeat$2$28.L$0 = (BitcoinDisplayUnits) obj;
                cardModelView$getActiveHeat$2$28.L$1 = (ScheduledTransactionPreference) obj2;
                return cardModelView$getActiveHeat$2$28.invokeSuspend(Unit.INSTANCE);
            case 8:
                CardModelView$getActiveHeat$2$2 cardModelView$getActiveHeat$2$29 = new CardModelView$getActiveHeat$2$2((Reward$Adapter) obj4, (Continuation) obj3, 8);
                cardModelView$getActiveHeat$2$29.L$0 = (GetHistoricalExchangeDataResponse) obj;
                cardModelView$getActiveHeat$2$29.L$1 = (NetworkStatus) obj2;
                return cardModelView$getActiveHeat$2$29.invokeSuspend(Unit.INSTANCE);
            case 9:
                CardModelView$getActiveHeat$2$2 cardModelView$getActiveHeat$2$210 = new CardModelView$getActiveHeat$2$2((RealEntityPriceRefresher) obj4, (Continuation) obj3, 9);
                cardModelView$getActiveHeat$2$210.L$0 = (Map) obj;
                cardModelView$getActiveHeat$2$210.L$1 = (NetworkStatus) obj2;
                return cardModelView$getActiveHeat$2$210.invokeSuspend(Unit.INSTANCE);
            case 10:
                CardModelView$getActiveHeat$2$2 cardModelView$getActiveHeat$2$211 = new CardModelView$getActiveHeat$2$2((RealHistoricalPriceTickRefresher) obj4, (Continuation) obj3, 10);
                cardModelView$getActiveHeat$2$211.L$0 = (GetPortfoliosHistoricalDataResponse) obj;
                cardModelView$getActiveHeat$2$211.L$1 = (NetworkStatus) obj2;
                return cardModelView$getActiveHeat$2$211.invokeSuspend(Unit.INSTANCE);
            case 11:
                CardModelView$getActiveHeat$2$2 cardModelView$getActiveHeat$2$212 = new CardModelView$getActiveHeat$2$2((RealInvestingHistoricalData) obj4, (Continuation) obj3, 11);
                cardModelView$getActiveHeat$2$212.L$0 = (GetHistoricalExchangeDataResponse) obj;
                cardModelView$getActiveHeat$2$212.L$1 = (NetworkStatus) obj2;
                return cardModelView$getActiveHeat$2$212.invokeSuspend(Unit.INSTANCE);
            case 12:
                CardModelView$getActiveHeat$2$2 cardModelView$getActiveHeat$2$213 = new CardModelView$getActiveHeat$2$2((RealInvestingHistoricalData) obj4, (Continuation) obj3, 12);
                cardModelView$getActiveHeat$2$213.L$0 = (GetInvestmentEntityHistoricalDataResponse) obj;
                cardModelView$getActiveHeat$2$213.L$1 = (NetworkStatus) obj2;
                return cardModelView$getActiveHeat$2$213.invokeSuspend(Unit.INSTANCE);
            case 13:
                CardModelView$getActiveHeat$2$2 cardModelView$getActiveHeat$2$214 = new CardModelView$getActiveHeat$2$2((RealInvestingHistoricalData) obj4, (Continuation) obj3, 13);
                cardModelView$getActiveHeat$2$214.L$0 = (GetPortfoliosHistoricalDataResponse) obj;
                cardModelView$getActiveHeat$2$214.L$1 = (NetworkStatus) obj2;
                return cardModelView$getActiveHeat$2$214.invokeSuspend(Unit.INSTANCE);
            case 14:
                CardModelView$getActiveHeat$2$2 cardModelView$getActiveHeat$2$215 = new CardModelView$getActiveHeat$2$2((MoneybotHomePresenter) obj4, (Continuation) obj3, 14);
                cardModelView$getActiveHeat$2$215.L$0 = (List) obj;
                cardModelView$getActiveHeat$2$215.L$1 = (InvestingCryptoNewsPresenter$NewsKindDetails) obj2;
                return cardModelView$getActiveHeat$2$215.invokeSuspend(Unit.INSTANCE);
            case 15:
                CardModelView$getActiveHeat$2$2 cardModelView$getActiveHeat$2$216 = new CardModelView$getActiveHeat$2$2((RewardWithSelection) obj4, (Continuation) obj3, 15);
                cardModelView$getActiveHeat$2$216.L$0 = (String) obj;
                cardModelView$getActiveHeat$2$216.L$1 = (List) obj2;
                return cardModelView$getActiveHeat$2$216.invokeSuspend(Unit.INSTANCE);
            case 16:
                CardModelView$getActiveHeat$2$2 cardModelView$getActiveHeat$2$217 = new CardModelView$getActiveHeat$2$2((RealPaymentTabSettings) obj4, (Continuation) obj3, 16);
                cardModelView$getActiveHeat$2$217.L$0 = (FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options) obj;
                cardModelView$getActiveHeat$2$217.L$1 = (String) obj2;
                return cardModelView$getActiveHeat$2$217.invokeSuspend(Unit.INSTANCE);
            case 17:
                CardModelView$getActiveHeat$2$2 cardModelView$getActiveHeat$2$218 = new CardModelView$getActiveHeat$2$2((StuckPlayerDetector) obj4, (Continuation) obj3, 17);
                cardModelView$getActiveHeat$2$218.L$0 = (String) obj;
                cardModelView$getActiveHeat$2$218.L$1 = (String) obj2;
                return cardModelView$getActiveHeat$2$218.invokeSuspend(Unit.INSTANCE);
            case 18:
                CardModelView$getActiveHeat$2$2 cardModelView$getActiveHeat$2$219 = new CardModelView$getActiveHeat$2$2((RealConversationService) obj4, (Continuation) obj3, 18);
                cardModelView$getActiveHeat$2$219.L$0 = (PendingTranscript) obj;
                cardModelView$getActiveHeat$2$219.L$1 = (RecordedTranscript) obj2;
                return cardModelView$getActiveHeat$2$219.invokeSuspend(Unit.INSTANCE);
            case 19:
                CardModelView$getActiveHeat$2$2 cardModelView$getActiveHeat$2$220 = new CardModelView$getActiveHeat$2$2((RealBalanceBasedAddCashManager) obj4, (Continuation) obj3, 19);
                cardModelView$getActiveHeat$2$220.L$0 = (BalanceBasedAddCashPreference) obj;
                cardModelView$getActiveHeat$2$220.L$1 = (List) obj2;
                return cardModelView$getActiveHeat$2$220.invokeSuspend(Unit.INSTANCE);
            case 20:
                CardModelView$getActiveHeat$2$2 cardModelView$getActiveHeat$2$221 = new CardModelView$getActiveHeat$2$2((RealScheduledReloadsManager) obj4, (Continuation) obj3, 20);
                cardModelView$getActiveHeat$2$221.L$0 = (CashOClockPreference) obj;
                cardModelView$getActiveHeat$2$221.L$1 = (List) obj2;
                return cardModelView$getActiveHeat$2$221.invokeSuspend(Unit.INSTANCE);
            case 21:
                CardModelView$getActiveHeat$2$2 cardModelView$getActiveHeat$2$222 = new CardModelView$getActiveHeat$2$2((RealCashAppTagManager) obj4, (Continuation) obj3, 21);
                cardModelView$getActiveHeat$2$222.L$0 = (CashAppTag) obj;
                cardModelView$getActiveHeat$2$222.L$1 = (TagThemeDefinitions) obj2;
                return cardModelView$getActiveHeat$2$222.invokeSuspend(Unit.INSTANCE);
            case 22:
                ((Number) obj2).floatValue();
                return new CardModelView$getActiveHeat$2$2((CardSchemeViewModel.Module.Accessory.Button) this.L$0, (MutableState) this.L$1, (MutableFloatState) obj4, (Continuation) obj3).invokeSuspend(Unit.INSTANCE);
            case 23:
                CardModelView$getActiveHeat$2$2 cardModelView$getActiveHeat$2$223 = new CardModelView$getActiveHeat$2$2((ShiftSchedule) obj4, (Continuation) obj3, 23);
                cardModelView$getActiveHeat$2$223.L$0 = (Location) obj;
                cardModelView$getActiveHeat$2$223.L$1 = (Job) obj2;
                return cardModelView$getActiveHeat$2$223.invokeSuspend(Unit.INSTANCE);
            default:
                CardModelView$getActiveHeat$2$2 cardModelView$getActiveHeat$2$224 = new CardModelView$getActiveHeat$2$2((RealSellerCardViewModelProducer) obj4, (Continuation) obj3, 24);
                cardModelView$getActiveHeat$2$224.L$0 = (List) obj;
                cardModelView$getActiveHeat$2$224.L$1 = (LoaderState) obj2;
                return cardModelView$getActiveHeat$2$224.invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x092c  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0940  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0957  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0959  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x094b  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0933  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x018f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        String str;
        String str2;
        String str3;
        int ordinal;
        RecurringDepositsViewModel.ScheduledAddCash.Source source;
        String str4;
        Object obj3;
        ColorModel colorModel;
        List list;
        MoneybotHomePresenter moneybotHomePresenter;
        String str5;
        String format2;
        ArrayList plus;
        BalanceBasedAddCashPreference.Enabled enabled;
        BalanceBasedAddCashPreference.Disabled disabled;
        String str6;
        String str7;
        BalanceBasedAddCashPreference.State state;
        String str8;
        String str9;
        String str10;
        RecurringSchedule.Frequency frequency;
        String str11;
        List<CashAppTag.Tag> list2;
        CashAppTag.TagLifecycleState tagLifecycleState;
        int i;
        CashAppTag.PhysicalTagOrderState physicalTagOrderState;
        TagThemeDefinition.TagFormFactor tagFormFactor;
        CashAppTag.PhysicalTagOrderState physicalTagOrderState2;
        CashAppTag.TagLifecycleState tagLifecycleState2;
        LocalizedString localizedString;
        String str12;
        Map map;
        int i2 = this.$r8$classId;
        int i3 = -1;
        float f = RecyclerView.DECELERATION_RATE;
        r10 = null;
        ArrayList arrayList = null;
        r10 = null;
        RecurringSchedule recurringSchedule = null;
        Object obj4 = this.this$0;
        switch (i2) {
            case 0:
                Bitmap bitmap = (Bitmap) this.L$0;
                PointF pointF = (PointF) this.L$1;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (pointF != null) {
                    BitmapsKt.applyHeat(bitmap, 971.0f * pointF.x, 1307.0f * pointF.y);
                    new Canvas(bitmap).drawBitmap((Bitmap) ((CardModelView) obj4).moodSkin$delegate.getValue(), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, CardModelView.REMOVE_PAINT);
                    return bitmap;
                }
                Bitmap coolHeat = BitmapsKt.coolHeat(bitmap);
                coolHeat.getClass();
                return coolHeat;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                GenerationalViewportHint generationalViewportHint = (GenerationalViewportHint) this.L$0;
                GenerationalViewportHint generationalViewportHint2 = (GenerationalViewportHint) this.L$1;
                LoadType loadType = (LoadType) obj4;
                generationalViewportHint2.getClass();
                generationalViewportHint.getClass();
                int i4 = generationalViewportHint2.generationId;
                int i5 = generationalViewportHint.generationId;
                if (i4 > i5) {
                    r8 = true;
                } else if (i4 >= i5) {
                    r8 = FlowExtKt.shouldPrioritizeOver(generationalViewportHint2.hint, generationalViewportHint.hint, loadType);
                }
                return r8 ? generationalViewportHint2 : generationalViewportHint;
            case 2:
                GoogleMap googleMap = (GoogleMap) this.L$0;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((MutableState) this.L$1).setValue(new ClusterManager((Context) obj4, googleMap));
                return Unit.INSTANCE;
            case 3:
                ScheduledReloadsPreference scheduledReloadsPreference = (ScheduledReloadsPreference) this.L$0;
                List list3 = (List) this.L$1;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Iterator it = list3.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (((Instrument) obj2).defaultForInstrumentType) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                Instrument instrument = (Instrument) obj2;
                n nVar = (n) obj4;
                String str13 = instrument != null ? instrument.displayNameCompact : null;
                if (str13 == null) {
                    str13 = "";
                }
                AndroidStringManager androidStringManager = (AndroidStringManager) nVar.a;
                Resources resources = androidStringManager.resources;
                ScheduledReloadsPreference.State state2 = scheduledReloadsPreference.state;
                boolean z = state2 instanceof ScheduledReloadsPreference.State.Enabled;
                ScheduledReloadsPreference.State.Disabled disabled2 = ScheduledReloadsPreference.State.Disabled.INSTANCE;
                if (state2.equals(disabled2)) {
                    str = androidStringManager.get(R.string.recurring_transfer_default_value);
                } else {
                    if (!z) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    Money money = ((ScheduledReloadsPreference.State.Enabled) state2).amount;
                    if (money == null || (str = ((MoneyFormatter) nVar.d).format(money)) == null) {
                        str = androidStringManager.get(R.string.recurring_transfer_default_value);
                    }
                }
                ScheduledReloadsPreference.State state3 = scheduledReloadsPreference.state;
                if (!state3.equals(disabled2)) {
                    if (!(state3 instanceof ScheduledReloadsPreference.State.Enabled)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    RecurringSchedule recurringSchedule2 = ((ScheduledReloadsPreference.State.Enabled) state3).recurringSchedule;
                    if (recurringSchedule2 != null) {
                        List list4 = recurringSchedule2.daysOfPeriod;
                        int ordinal2 = recurringSchedule2.frequency.ordinal();
                        if (ordinal2 == 0) {
                            str2 = androidStringManager.get(R.string.blockers_recurring_transfer_frequency_daily);
                        } else if (ordinal2 == 1) {
                            int intValue = ((Number) list4.get(0)).intValue() + 1;
                            if (intValue == 8) {
                                intValue = 1;
                            }
                            String str14 = DateFormatSymbols.getInstance(Locale.getDefault()).getWeekdays()[intValue];
                            str14.getClass();
                            resources.getClass();
                            str2 = new MessageFormat(resources.getString(R.string.blockers_recurring_transfer_frequency_weekly_single)).format(new Object[]{str14});
                            str2.getClass();
                        } else if (ordinal2 != 3) {
                            str2 = androidStringManager.get(R.string.recurring_transfer_default_value);
                        } else {
                            Long[] lArr = {Long.valueOf(((Number) list4.get(0)).intValue())};
                            resources.getClass();
                            str2 = new MessageFormat(resources.getString(R.string.blockers_recurring_transfer_frequency_monthly_single)).format(lArr);
                            str2.getClass();
                        }
                        if (z || str2 == null || str13.length() <= 0) {
                            str3 = scheduledReloadsPreference.subtitle;
                        } else {
                            if (str2.length() > 0) {
                                StringBuilder sb = new StringBuilder();
                                String valueOf = String.valueOf(str2.charAt(0));
                                valueOf.getClass();
                                String lowerCase = valueOf.toLowerCase(Locale.ROOT);
                                lowerCase.getClass();
                                sb.append((Object) lowerCase);
                                sb.append(str2.substring(1));
                                str4 = sb.toString();
                            } else {
                                str4 = str2;
                            }
                            str.getClass();
                            resources.getClass();
                            str3 = new MessageFormat(resources.getString(R.string.recurring_transfer_arcade_scheduled_body)).format(new Object[]{str, str4, str13});
                            str3.getClass();
                        }
                        String str15 = str3;
                        RecurringDepositsViewModel.ScheduledAddCash.State enabled2 = !z ? new RecurringDepositsViewModel.ScheduledAddCash.State.Enabled(str, str2) : RecurringDepositsViewModel.ScheduledAddCash.State.Disabled.INSTANCE;
                        String str16 = scheduledReloadsPreference.title;
                        ordinal = scheduledReloadsPreference.source.ordinal();
                        if (ordinal != 0) {
                            source = RecurringDepositsViewModel.ScheduledAddCash.Source.SYNC_VALUE;
                        } else {
                            if (ordinal != 1) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            source = RecurringDepositsViewModel.ScheduledAddCash.Source.PROFILE;
                        }
                        return new RecurringDepositsViewModel.ScheduledAddCash(enabled2, str16, str15, source, z ? androidStringManager.get(R.string.recurring_transfer_set_up_button) : null);
                    }
                }
                str2 = null;
                if (z) {
                }
                str3 = scheduledReloadsPreference.subtitle;
                String str152 = str3;
                RecurringDepositsViewModel.ScheduledAddCash.State enabled22 = !z ? new RecurringDepositsViewModel.ScheduledAddCash.State.Enabled(str, str2) : RecurringDepositsViewModel.ScheduledAddCash.State.Disabled.INSTANCE;
                String str162 = scheduledReloadsPreference.title;
                ordinal = scheduledReloadsPreference.source.ordinal();
                if (ordinal != 0) {
                }
                return new RecurringDepositsViewModel.ScheduledAddCash(enabled22, str162, str152, source, z ? androidStringManager.get(R.string.recurring_transfer_set_up_button) : null);
            case 4:
                Map map2 = (Map) this.L$0;
                List list5 = (List) this.L$1;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                RealBorrowDataManager realBorrowDataManager = (RealBorrowDataManager) obj4;
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = list5.iterator();
                while (it2.hasNext()) {
                    Iterable iterable = (List) map2.get((BorrowData.TileType) it2.next());
                    if (iterable == null) {
                        iterable = EmptyList.INSTANCE;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj5 : iterable) {
                        if (AssetHelper.matchesAny(realBorrowDataManager.appVersion, ((Tile) obj5).app_supports)) {
                            arrayList3.add(obj5);
                        }
                    }
                    CollectionsKt__MutableCollectionsKt.addAll(arrayList3, arrayList2);
                }
                return arrayList2;
            case 5:
                String str17 = (String) this.L$0;
                List list6 = (List) this.L$1;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (str17 != null) {
                    Iterator it3 = list6.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            obj3 = it3.next();
                            if (Intrinsics.areEqual(((BalanceSnapshot) obj3).token, str17)) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    BalanceSnapshot balanceSnapshot = (BalanceSnapshot) obj3;
                    if (balanceSnapshot != null) {
                        ((RealRestrictedBalanceStore) obj4).getClass();
                        return new RestrictedBalance(balanceSnapshot.balance, balanceSnapshot.token);
                    }
                }
                return null;
            case 6:
                ContactModifiablePermissions.PermissionTuple permissionTuple = (ContactModifiablePermissions.PermissionTuple) this.L$0;
                ContactModifiablePermissions.PermissionTuple permissionTuple2 = (ContactModifiablePermissions.PermissionTuple) this.L$1;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (permissionTuple.granted || !permissionTuple2.granted) {
                    return permissionTuple2;
                }
                ContactsSyncState contactsSyncState = permissionTuple2.syncState;
                ContactsSyncState contactsSyncState2 = ContactsSyncState.ON;
                if (contactsSyncState == contactsSyncState2) {
                    return permissionTuple2;
                }
                ((ContactModifiablePermissions) obj4).contactsSyncPreference.set(contactsSyncState2);
                return new ContactModifiablePermissions.PermissionTuple(permissionTuple2.granted, contactsSyncState2);
            case 7:
                BitcoinDisplayUnits bitcoinDisplayUnits = (BitcoinDisplayUnits) this.L$0;
                ScheduledTransactionPreference scheduledTransactionPreference = (ScheduledTransactionPreference) this.L$1;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return RealAppConfigManager.createClientData(bitcoinDisplayUnits, ((RealAppConfigManager) obj4).clock, scheduledTransactionPreference);
            case 8:
                GetHistoricalExchangeDataResponse getHistoricalExchangeDataResponse = (GetHistoricalExchangeDataResponse) this.L$0;
                NetworkStatus networkStatus = (NetworkStatus) this.L$1;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return new PolledData(getHistoricalExchangeDataResponse, networkStatus.ageMillis((AndroidClock) ((Reward$Adapter) obj4).boost_detail_bottom_upsellAdapter) >= Duration.m4167getInWholeMillisecondsimpl(RealInvestmentEntitiesKt.INVESTING_STALENESS_THRESHOLD));
            case 9:
                Map map3 = (Map) this.L$0;
                NetworkStatus networkStatus2 = (NetworkStatus) this.L$1;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return new PolledData(map3, networkStatus2.ageMillis(((RealEntityPriceRefresher) obj4).clock) >= Duration.m4167getInWholeMillisecondsimpl(RealInvestmentEntitiesKt.INVESTING_STALENESS_THRESHOLD));
            case 10:
                GetPortfoliosHistoricalDataResponse getPortfoliosHistoricalDataResponse = (GetPortfoliosHistoricalDataResponse) this.L$0;
                NetworkStatus networkStatus3 = (NetworkStatus) this.L$1;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return new PolledData(getPortfoliosHistoricalDataResponse, networkStatus3.ageMillis(((RealHistoricalPriceTickRefresher) obj4).clock) >= Duration.m4167getInWholeMillisecondsimpl(RealInvestmentEntitiesKt.INVESTING_STALENESS_THRESHOLD));
            case 11:
                GetHistoricalExchangeDataResponse getHistoricalExchangeDataResponse2 = (GetHistoricalExchangeDataResponse) this.L$0;
                NetworkStatus networkStatus4 = (NetworkStatus) this.L$1;
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return new PolledData(getHistoricalExchangeDataResponse2, networkStatus4.ageMillis(((RealInvestingHistoricalData) obj4).clock) >= Duration.m4167getInWholeMillisecondsimpl(RealInvestmentEntitiesKt.INVESTING_STALENESS_THRESHOLD));
            case 12:
                GetInvestmentEntityHistoricalDataResponse getInvestmentEntityHistoricalDataResponse = (GetInvestmentEntityHistoricalDataResponse) this.L$0;
                NetworkStatus networkStatus5 = (NetworkStatus) this.L$1;
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return new PolledData(getInvestmentEntityHistoricalDataResponse, networkStatus5.ageMillis(((RealInvestingHistoricalData) obj4).clock) >= Duration.m4167getInWholeMillisecondsimpl(RealInvestmentEntitiesKt.INVESTING_STALENESS_THRESHOLD));
            case 13:
                GetPortfoliosHistoricalDataResponse getPortfoliosHistoricalDataResponse2 = (GetPortfoliosHistoricalDataResponse) this.L$0;
                NetworkStatus networkStatus6 = (NetworkStatus) this.L$1;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return new PolledData(getPortfoliosHistoricalDataResponse2, networkStatus6.ageMillis(((RealInvestingHistoricalData) obj4).clock) >= Duration.m4167getInWholeMillisecondsimpl(RealInvestmentEntitiesKt.INVESTING_STALENESS_THRESHOLD));
            case 14:
                List list7 = (List) this.L$0;
                InvestingCryptoNewsPresenter$NewsKindDetails investingCryptoNewsPresenter$NewsKindDetails = (InvestingCryptoNewsPresenter$NewsKindDetails) this.L$1;
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                String str18 = investingCryptoNewsPresenter$NewsKindDetails.title;
                ColorModel colorModel2 = investingCryptoNewsPresenter$NewsKindDetails.accentColor;
                List<Investing_news_article> list8 = list7;
                MoneybotHomePresenter moneybotHomePresenter2 = (MoneybotHomePresenter) obj4;
                ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list8, 10));
                for (Investing_news_article investing_news_article : list8) {
                    String str19 = investing_news_article.provider;
                    Image image = investing_news_article.provider_avatar;
                    String str20 = investing_news_article.headline;
                    String str21 = investing_news_article.url;
                    str21.getClass();
                    Long l = investing_news_article.published_at_millis;
                    if (l != null) {
                        long longValue = l.longValue();
                        Resources resources2 = ((AndroidStringManager) moneybotHomePresenter2.widgetManager).resources;
                        long millis = ((AndroidClock) moneybotHomePresenter2.nextBestActionManager).millis() - longValue;
                        long duration = DurationKt.toDuration(millis >= 0 ? millis : 0L, DurationUnit.MILLISECONDS);
                        Duration.Companion companion = Duration.Companion;
                        DurationUnit durationUnit = DurationUnit.HOURS;
                        moneybotHomePresenter = moneybotHomePresenter2;
                        if (Duration.m4164compareToLRDsOJo(duration, DurationKt.toDuration(1, durationUnit)) < 0) {
                            Object[] objArr = {Integer.valueOf(Math.max(1, (int) Duration.m4176toLongimpl(duration, DurationUnit.MINUTES)))};
                            resources2.getClass();
                            format2 = new MessageFormat(resources2.getString(R.string.investing_crypto_news_timestamp_minutes)).format(objArr);
                            format2.getClass();
                            colorModel = colorModel2;
                            list = list7;
                        } else {
                            DurationUnit durationUnit2 = DurationUnit.DAYS;
                            colorModel = colorModel2;
                            list = list7;
                            if (Duration.m4164compareToLRDsOJo(duration, DurationKt.toDuration(1, durationUnit2)) < 0) {
                                Object[] objArr2 = {Integer.valueOf((int) Duration.m4176toLongimpl(duration, durationUnit))};
                                resources2.getClass();
                                format2 = new MessageFormat(resources2.getString(R.string.investing_crypto_news_timestamp_hours)).format(objArr2);
                                format2.getClass();
                            } else if (Duration.m4164compareToLRDsOJo(duration, DurationKt.toDuration(7, durationUnit2)) < 0) {
                                Object[] objArr3 = {Integer.valueOf(Math.max(1, (int) Duration.m4176toLongimpl(duration, durationUnit2)))};
                                resources2.getClass();
                                format2 = new MessageFormat(resources2.getString(R.string.investing_crypto_news_timestamp_days)).format(objArr3);
                                format2.getClass();
                            } else {
                                Object[] objArr4 = {Integer.valueOf(((int) Duration.m4176toLongimpl(duration, durationUnit2)) / 7)};
                                resources2.getClass();
                                format2 = new MessageFormat(resources2.getString(R.string.investing_crypto_news_timestamp_weeks)).format(objArr4);
                                format2.getClass();
                            }
                        }
                        str5 = format2;
                    } else {
                        colorModel = colorModel2;
                        list = list7;
                        moneybotHomePresenter = moneybotHomePresenter2;
                        str5 = null;
                    }
                    colorModel2 = colorModel;
                    arrayList4.add(new InvestingCryptoNewsArticleViewModel(image, str19, str20, str5, str21, colorModel));
                    moneybotHomePresenter2 = moneybotHomePresenter;
                    list7 = list;
                }
                return new InvestingCryptoNewsViewModel(arrayList4, str18, !list7.isEmpty() ? new InvestingCryptoViewAllNewsModel(colorModel2) : null);
            case 15:
                String str22 = (String) this.L$0;
                List list9 = (List) this.L$1;
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                RewardWithSelection rewardWithSelection = (RewardWithSelection) obj4;
                return new OffersAnalyticsHelper$RewardMetadata(rewardWithSelection.token, rewardWithSelection.discount_text, rewardWithSelection.offerly_token, list9 != null ? (String) CollectionsKt.firstOrNull(list9) : null, str22);
            case 16:
                FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options featureFlag$EnabledDisabledUnassignedFeatureFlag$Options = (FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options) this.L$0;
                String str23 = (String) this.L$1;
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return featureFlag$EnabledDisabledUnassignedFeatureFlag$Options.enabled() ? PaymentPadTheme.GLITTER : PaymentPadTheme.valueOf(str23);
            case 17:
                String str24 = (String) this.L$0;
                String str25 = (String) this.L$1;
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                AndroidStringManager androidStringManager2 = (AndroidStringManager) ((StuckPlayerDetector) obj4).clock;
                str25.getClass();
                Resources resources3 = androidStringManager2.resources;
                resources3.getClass();
                String format3 = new MessageFormat(resources3.getString(R.string.copy_cashtag_link)).format(new Object[]{str25});
                format3.getClass();
                return new RealShareTargetsManager$TargetPreparationState.Ready(new ShareTarget.CopyToClipboard(format3, new ShareTarget.CopyToClipboard.Content(str24)));
            case 18:
                PendingTranscript pendingTranscript = (PendingTranscript) this.L$0;
                RecordedTranscript recordedTranscript = (RecordedTranscript) this.L$1;
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Collection values = recordedTranscript.messages.values();
                ArrayList arrayList5 = new ArrayList();
                Iterator it4 = values.iterator();
                while (it4.hasNext()) {
                    String str26 = ((RecordedMessage) it4.next()).idempotenceToken;
                    if (str26 != null) {
                        arrayList5.add(str26);
                    }
                }
                Collection values2 = MapsKt__MapsKt.minus((Map) pendingTranscript.messagesMap, (Iterable) arrayList5).values();
                if (((RealConversationService) obj4).chatUiUpliftEnabled) {
                    ArrayList arrayList6 = new ArrayList();
                    ArrayList arrayList7 = new ArrayList();
                    for (Object obj6 : values2) {
                        if (((PendingMessage) obj6).status instanceof MessageStatus$Failed) {
                            arrayList6.add(obj6);
                        } else {
                            arrayList7.add(obj6);
                        }
                    }
                    plus = CollectionsKt.plus((Iterable) arrayList7, (Collection) CollectionsKt.sortedWith(CollectionsKt.plus((Iterable) arrayList6, values), new LinkedHashTreeMap.AnonymousClass1(13)));
                } else {
                    plus = CollectionsKt.plus((Iterable) values2, values);
                }
                return new Transcript(plus, recordedTranscript.pagingStatus, recordedTranscript.conversation);
            case 19:
                com.squareup.protos.cash.balancebasedaddcash.api.v1_0.syncvalues.BalanceBasedAddCashPreference balanceBasedAddCashPreference = (com.squareup.protos.cash.balancebasedaddcash.api.v1_0.syncvalues.BalanceBasedAddCashPreference) this.L$0;
                List list10 = (List) this.L$1;
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                AndroidStringManager androidStringManager3 = ((RealBalanceBasedAddCashManager) obj4).stringManager;
                BalanceBasedAddCashPreference.State state4 = BalanceBasedAddCashPreference.State.Disabled.INSTANCE;
                if (balanceBasedAddCashPreference == null) {
                    return new com.squareup.cash.transfers.backend.api.BalanceBasedAddCashPreference(androidStringManager3.get(R.string.balance_based_add_cash_preference_title), androidStringManager3.get(R.string.balance_based_add_cash_preference_disabled_subtitle), state4);
                }
                LocalizedString localizedString2 = balanceBasedAddCashPreference.subtitle;
                ComputedOrderSummaryKt computedOrderSummaryKt = balanceBasedAddCashPreference.preference;
                if (computedOrderSummaryKt != null) {
                    BalanceBasedAddCashPreference$Preference$Enabled balanceBasedAddCashPreference$Preference$Enabled = computedOrderSummaryKt instanceof BalanceBasedAddCashPreference$Preference$Enabled ? (BalanceBasedAddCashPreference$Preference$Enabled) computedOrderSummaryKt : null;
                    if (balanceBasedAddCashPreference$Preference$Enabled != null) {
                        enabled = balanceBasedAddCashPreference$Preference$Enabled.value;
                        if (computedOrderSummaryKt != null) {
                            BalanceBasedAddCashPreference$Preference$Disabled balanceBasedAddCashPreference$Preference$Disabled = computedOrderSummaryKt instanceof BalanceBasedAddCashPreference$Preference$Disabled ? (BalanceBasedAddCashPreference$Preference$Disabled) computedOrderSummaryKt : null;
                            if (balanceBasedAddCashPreference$Preference$Disabled != null) {
                                disabled = balanceBasedAddCashPreference$Preference$Disabled.value;
                                if ((enabled != null ? enabled : disabled) == null) {
                                    a$$ExternalSyntheticBUOutline0.m$3("One of enabled or disabled must be provided");
                                    return null;
                                }
                                r8 = enabled != null;
                                LocalizedString localizedString3 = balanceBasedAddCashPreference.title;
                                if (localizedString3 == null || (str6 = localizedString3.translated_value) == null) {
                                    str6 = androidStringManager3.get(R.string.balance_based_add_cash_preference_title);
                                }
                                if (r8) {
                                    Instrument instrument2 = (Instrument) CollectionsKt.firstOrNull(list10);
                                    if (instrument2 != null) {
                                        localizedString2.getClass();
                                        String str27 = localizedString2.translated_value;
                                        str27.getClass();
                                        Map mapOf = MapsKt__MapsJVMKt.mapOf(new Pair("instrument_details", instrument2.displayName));
                                        mapOf.getClass();
                                        str7 = MessageFormat.format(str27, (Map<String, Object>) mapOf);
                                        str7.getClass();
                                    } else {
                                        str7 = androidStringManager3.get(R.string.balance_based_add_cash_preference_enabled_subtitle);
                                    }
                                } else if (localizedString2 == null || (str7 = localizedString2.translated_value) == null) {
                                    str7 = androidStringManager3.get(R.string.balance_based_add_cash_preference_disabled_subtitle);
                                }
                                if (r8) {
                                    enabled.getClass();
                                    Money money2 = enabled.minimum_balance_amount;
                                    if (money2 == null) {
                                        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                                        return null;
                                    }
                                    Money money3 = enabled.increment_amount;
                                    if (money3 == null) {
                                        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                                        return null;
                                    }
                                    state = new BalanceBasedAddCashPreference.State.Enabled(money2, money3);
                                } else {
                                    disabled.getClass();
                                    if (Intrinsics.areEqual(disabled.is_locked, Boolean.TRUE)) {
                                        BalanceBasedAddCashPreference.DialogBox dialogBox = disabled.locked_dialog_box;
                                        dialogBox.getClass();
                                        LocalizedString localizedString4 = dialogBox.title;
                                        localizedString4.getClass();
                                        String str28 = localizedString4.translated_value;
                                        str28.getClass();
                                        LocalizedString localizedString5 = dialogBox.description;
                                        localizedString5.getClass();
                                        String str29 = localizedString5.translated_value;
                                        str29.getClass();
                                        LocalizedString localizedString6 = dialogBox.button_text;
                                        localizedString6.getClass();
                                        String str30 = localizedString6.translated_value;
                                        str30.getClass();
                                        LocalizedString localizedString7 = dialogBox.dismiss_button_text;
                                        localizedString7.getClass();
                                        String str31 = localizedString7.translated_value;
                                        str31.getClass();
                                        String str32 = dialogBox.client_route;
                                        str32.getClass();
                                        state4 = new BalanceBasedAddCashPreference.State.Locked(str28, str29, str30, str31, str32);
                                    }
                                    state = state4;
                                }
                                return new com.squareup.cash.transfers.backend.api.BalanceBasedAddCashPreference(str6, str7, state);
                            }
                        }
                        disabled = 0;
                        if ((enabled != null ? enabled : disabled) == null) {
                        }
                    }
                }
                enabled = null;
                if (computedOrderSummaryKt != null) {
                }
                disabled = 0;
                if ((enabled != null ? enabled : disabled) == null) {
                }
                break;
            case 20:
                RealScheduledReloadsManager realScheduledReloadsManager = (RealScheduledReloadsManager) obj4;
                CashOClockPreference cashOClockPreference = (CashOClockPreference) this.L$0;
                List list11 = (List) this.L$1;
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Instrument instrument3 = (Instrument) CollectionsKt.firstOrNull(list11);
                if (instrument3 == null || (str8 = instrument3.displayName) == null) {
                    str8 = realScheduledReloadsManager.stringManager.get(R.string.recurring_transfer_preference_default_source);
                }
                if (cashOClockPreference == null) {
                    return RealScheduledReloadsManager.disabledPreference$default(realScheduledReloadsManager, null, ScheduledReloadsPreference.Source.SYNC_VALUE, 3);
                }
                ScheduledReloadsPreference.Source source2 = ScheduledReloadsPreference.Source.SYNC_VALUE;
                LocalizedString localizedString8 = cashOClockPreference.title;
                if (localizedString8 == null || (str9 = localizedString8.translated_value) == null) {
                    str9 = realScheduledReloadsManager.stringManager.get(R.string.recurring_transfer_preference);
                }
                ScheduledReload scheduledReload = cashOClockPreference.scheduled_reload;
                if (scheduledReload != null && Intrinsics.areEqual(scheduledReload.enabled, Boolean.TRUE)) {
                    LocalizedString localizedString9 = cashOClockPreference.subtitle;
                    if (localizedString9 == null || (str11 = localizedString9.translated_value) == null) {
                        str10 = null;
                    } else {
                        Map mapOf2 = MapsKt__MapsJVMKt.mapOf(new Pair("instrument_details", str8));
                        mapOf2.getClass();
                        str10 = MessageFormat.format(str11, (Map<String, Object>) mapOf2);
                        str10.getClass();
                    }
                    Instant instant = scheduledReload.next_auto_cash_in_date;
                    Long valueOf2 = instant != null ? Long.valueOf(instant.toEpochMilli()) : null;
                    if (str10 == null) {
                        str10 = realScheduledReloadsManager.buildEnabledSubtitle(valueOf2, str8);
                    }
                    Money money4 = scheduledReload.amount;
                    com.squareup.cash.cashoclock.api.v1_0.syncvalues.RecurringSchedule recurringSchedule3 = scheduledReload.recurring_schedule;
                    if (recurringSchedule3 != null) {
                        RecurringSchedule.Frequency frequency2 = recurringSchedule3.frequency;
                        int i6 = frequency2 == null ? -1 : RealScheduledReloadsManager.WhenMappings.$EnumSwitchMapping$0[frequency2.ordinal()];
                        if (i6 == 1) {
                            frequency = RecurringSchedule.Frequency.EVERY_DAY;
                        } else if (i6 == 2) {
                            frequency = RecurringSchedule.Frequency.EVERY_WEEK;
                        } else if (i6 == 3) {
                            frequency = RecurringSchedule.Frequency.EVERY_TWO_WEEKS;
                        } else if (i6 == 4) {
                            frequency = RecurringSchedule.Frequency.EVERY_MONTH;
                        }
                        recurringSchedule = new com.squareup.cash.transfers.backend.api.RecurringSchedule(frequency, recurringSchedule3.day_within_period, recurringSchedule3.timezone, null);
                    }
                    return new ScheduledReloadsPreference(str9, str10, new ScheduledReloadsPreference.State.Enabled(money4, str8, valueOf2, recurringSchedule), source2);
                }
                return RealScheduledReloadsManager.disabledPreference$default(realScheduledReloadsManager, str9, source2, 2);
            case 21:
                com.squareup.protos.cash.taply.syncvalues.CashAppTag cashAppTag = (com.squareup.protos.cash.taply.syncvalues.CashAppTag) this.L$0;
                TagThemeDefinitions tagThemeDefinitions = (TagThemeDefinitions) this.L$1;
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (cashAppTag != null && (list2 = cashAppTag.tags) != null) {
                    ArrayList arrayList8 = new ArrayList();
                    for (CashAppTag.Tag tag : list2) {
                        TagThemeDefinition tagThemeDefinition = (tagThemeDefinitions == null || (map = tagThemeDefinitions.tag_theme_definitions) == null) ? null : (TagThemeDefinition) map.get(tag.tag_theme_token);
                        String str33 = tag.device_id;
                        String str34 = tag.tag_theme_token;
                        Image image2 = tag.background_image;
                        String str35 = (tagThemeDefinition == null || (localizedString = tagThemeDefinition.name) == null || (str12 = localizedString.translated_value) == null || StringsKt.isBlank(str12)) ? null : str12;
                        CashAppTag.TagLifecycleState tagLifecycleState3 = tag.lifecycle_state;
                        int i7 = tagLifecycleState3 == null ? i3 : RealCashAppTagManager.WhenMappings.$EnumSwitchMapping$0[tagLifecycleState3.ordinal()];
                        if (i7 != i3) {
                            if (i7 == 1) {
                                tagLifecycleState2 = CashAppTag.TagLifecycleState.ACTIVE;
                            } else if (i7 == 2) {
                                tagLifecycleState2 = CashAppTag.TagLifecycleState.INACTIVE;
                            } else if (i7 == 3) {
                                tagLifecycleState2 = CashAppTag.TagLifecycleState.PENDING_FIRST_ACTIVATION;
                            } else if (i7 != 4) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            tagLifecycleState = tagLifecycleState2;
                            PhysicalTagOrderState physicalTagOrderState3 = tag.tag_order_state;
                            i = physicalTagOrderState3 != null ? i3 : RealCashAppTagManager.WhenMappings.$EnumSwitchMapping$1[physicalTagOrderState3.ordinal()];
                            if (i != i3) {
                                if (i == 1) {
                                    physicalTagOrderState2 = CashAppTag.PhysicalTagOrderState.PREPARING;
                                } else if (i == 2) {
                                    physicalTagOrderState2 = CashAppTag.PhysicalTagOrderState.SHIPPED;
                                } else if (i == 3) {
                                    physicalTagOrderState2 = CashAppTag.PhysicalTagOrderState.PENDING_ACTIVATION;
                                } else if (i == 4) {
                                    physicalTagOrderState2 = CashAppTag.PhysicalTagOrderState.COMPLETE;
                                } else if (i != 5) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                physicalTagOrderState = physicalTagOrderState2;
                                TagFormFactor appTagFormFactor = (tagThemeDefinition != null || (tagFormFactor = tagThemeDefinition.form_factor) == null) ? null : FormattedResources.toAppTagFormFactor(tagFormFactor);
                                Boolean bool = tag.is_locked;
                                Boolean bool2 = tag.is_sponsor_locked;
                                boolean booleanValue = bool2 != null ? bool2.booleanValue() : false;
                                Boolean bool3 = tag.is_expired;
                                arrayList8.add(new com.squareup.cash.wallet.data.CashAppTag(str33, str34, image2, str35, tagLifecycleState, physicalTagOrderState, appTagFormFactor, bool, booleanValue, bool3 != null ? bool3.booleanValue() : false));
                                i3 = -1;
                            }
                            physicalTagOrderState = null;
                            if (tagThemeDefinition != null) {
                            }
                            Boolean bool4 = tag.is_locked;
                            Boolean bool22 = tag.is_sponsor_locked;
                            if (bool22 != null) {
                            }
                            Boolean bool32 = tag.is_expired;
                            arrayList8.add(new com.squareup.cash.wallet.data.CashAppTag(str33, str34, image2, str35, tagLifecycleState, physicalTagOrderState, appTagFormFactor, bool4, booleanValue, bool32 != null ? bool32.booleanValue() : false));
                            i3 = -1;
                        }
                        tagLifecycleState = null;
                        PhysicalTagOrderState physicalTagOrderState32 = tag.tag_order_state;
                        if (physicalTagOrderState32 != null) {
                        }
                        if (i != i3) {
                        }
                        physicalTagOrderState = null;
                        if (tagThemeDefinition != null) {
                        }
                        Boolean bool42 = tag.is_locked;
                        Boolean bool222 = tag.is_sponsor_locked;
                        if (bool222 != null) {
                        }
                        Boolean bool322 = tag.is_expired;
                        arrayList8.add(new com.squareup.cash.wallet.data.CashAppTag(str33, str34, image2, str35, tagLifecycleState, physicalTagOrderState, appTagFormFactor, bool42, booleanValue, bool322 != null ? bool322.booleanValue() : false));
                        i3 = -1;
                    }
                    arrayList = arrayList8;
                }
                return arrayList == null ? EmptyList.INSTANCE : arrayList;
            case 22:
                MutableFloatState mutableFloatState = (MutableFloatState) obj4;
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                MutableState mutableState = (MutableState) this.L$1;
                int i8 = HeroCardViewKt.$r8$clinit;
                if ((!((Boolean) mutableState.getValue()).booleanValue() || ((ParcelableSnapshotMutableFloatState) mutableFloatState).getFloatValue() >= 0.5d) && (((Boolean) mutableState.getValue()).booleanValue() || ((ParcelableSnapshotMutableFloatState) mutableFloatState).getFloatValue() <= 0.5d)) {
                    if (((Boolean) mutableState.getValue()).booleanValue()) {
                        f = 1.0f;
                    }
                    ((ParcelableSnapshotMutableFloatState) mutableFloatState).setFloatValue(f);
                } else {
                    ((CardSchemeViewModel.Module.Accessory.Button) this.L$0).onClick.invoke();
                }
                return Unit.INSTANCE;
            case 23:
                Location location = (Location) this.L$0;
                Job job = (Job) this.L$1;
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return new ClockInEssentials.NextShift((ShiftSchedule) obj4, job, location);
            default:
                List<Merchant> list12 = (List) this.L$0;
                LoaderState loaderState = (LoaderState) this.L$1;
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Map asBrandDetailsMap = Error.Code.Companion.asBrandDetailsMap(loaderState);
                MapBuilder mapBuilder = new MapBuilder();
                for (Merchant merchant : list12) {
                    MerchantIdentifier identifier = LocalPresenterFactoryKt.getIdentifier(merchant);
                    if (identifier != null) {
                        mapBuilder.put(identifier, Error.Code.Companion.toSellerCardViewModel(merchant, asBrandDetailsMap));
                    }
                }
                return mapBuilder.build();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardModelView$getActiveHeat$2$2(MutableState mutableState, Context context, Continuation continuation) {
        super(3, continuation);
        this.$r8$classId = 2;
        this.L$1 = mutableState;
        this.this$0 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CardModelView$getActiveHeat$2$2(Object obj, Continuation continuation, int i) {
        super(3, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
    }
}
