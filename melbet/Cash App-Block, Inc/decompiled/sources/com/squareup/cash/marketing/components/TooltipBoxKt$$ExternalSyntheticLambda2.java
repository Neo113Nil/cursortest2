package com.squareup.cash.marketing.components;

import android.content.Context;
import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$1$invoke$$inlined$onDispose$1;
import androidx.core.text.TextUtilsCompat;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.api.ApiResult;
import app.cash.local.db.Local_tab_content;
import app.cash.local.presenters.LocalCashBalancePresenter;
import app.cash.sqldelight.EnumColumnAdapter;
import app.cash.sqldelight.driver.android.AndroidCursor;
import app.cash.sqldelight.driver.android.AndroidStatement;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.ImageLoader$Builder;
import com.fillr.e0;
import com.google.android.gms.internal.measurement.zzlj;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.compose.CameraPositionState;
import com.nimbusds.jose.util.X509CertUtils;
import com.squareup.cash.R;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.components.RealSegmentedControlScope;
import com.squareup.cash.arcade.components.cell.RealCellActivityAccessoryScope;
import com.squareup.cash.boost.db.RewardSlotQueries;
import com.squareup.cash.checks.VerifyCheckDialogPresenter;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.common.messaging.api.ErrorMessaging;
import com.squareup.cash.common.messaging.screens.FailureMessageScreen;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.db.WireAdapter;
import com.squareup.cash.db.WireRepeatedAdapter;
import com.squareup.cash.db2.BlockersConfig;
import com.squareup.cash.db2.StampsConfig;
import com.squareup.cash.family.profileselection.api.FamilyProfile;
import com.squareup.cash.genericelements.components.GenericTreeElementsView;
import com.squareup.cash.genericelements.viewmodels.GenericTreeElementsViewModel;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.cash.investing.components.teengraduation.StocksTransferEtaFullScreenView;
import com.squareup.cash.investing.components.welcome.InvestingStocksWelcomeView;
import com.squareup.cash.investing.db.InvestingDiscoveryQueries;
import com.squareup.cash.investing.db.InvestingDiscoveryQueries$selectDiscoveries$2;
import com.squareup.cash.investing.db.InvestingEntityPriceCacheQueries$selectAll$2;
import com.squareup.cash.investing.db.InvestingNewsArticleQueries$articles$2;
import com.squareup.cash.investing.db.InvestingSettingsQueries$select$2;
import com.squareup.cash.investing.db.Investing_settings;
import com.squareup.cash.investing.db.InvestmentEntityQueries;
import com.squareup.cash.investing.db.InvestmentPerformanceQueries$forEntityToken$2;
import com.squareup.cash.investing.db.Investment_entity;
import com.squareup.cash.investing.db.SelectDiscoveries;
import com.squareup.cash.investing.db.categories.CategorySearchQueries$performSearch$2;
import com.squareup.cash.investing.presenters.stockdetails.InvestingStockDetailsPresenter;
import com.squareup.cash.investing.primitives.InvestmentEntityToken;
import com.squareup.cash.investing.primitives.NewsKind;
import com.squareup.cash.investing.viewmodels.categories.InvestingCategoryFilterViewModel;
import com.squareup.cash.investing.viewmodels.holdings.Holding;
import com.squareup.cash.investing.viewmodels.metrics.InvestingFinancialViewModel$Content;
import com.squareup.cash.investingcrypto.viewmodels.news.InvestingCryptoNewsArticleViewModel;
import com.squareup.cash.localization.db.LocalizationConfig;
import com.squareup.cash.localization.db.LocalizationConfigQueries$select$2;
import com.squareup.cash.maps.viewmodels.CashMapViewModel;
import com.squareup.cash.maps.viewmodels.LocationViewModel;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.merchant.screens.MerchantScreen$MerchantBlockingScreen;
import com.squareup.cash.money.applets.db.PromotedAppletTileQueries$selectAll$2;
import com.squareup.cash.money.viewmodels.InstalledAppletTileHeaderModel;
import com.squareup.cash.offers.db.OffersSheetQueries$ForSheetKeyQuery;
import com.squareup.cash.pools.views.PoolCreateViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.contour.YInt;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.SyncInvestmentEntity;
import com.squareup.protos.franklin.investing.resources.CustomOrderConfiguration;
import com.squareup.protos.franklin.investing.resources.InvestmentEntityStatus;
import com.squareup.protos.franklin.investing.resources.InvestmentEntityType;
import com.squareup.protos.franklin.investing.resources.LearnMoreConfiguration;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import net.oneformapp.schema.SchemaFactory;

/* loaded from: classes6.dex */
public final /* synthetic */ class TooltipBoxKt$$ExternalSyntheticLambda2 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ TooltipBoxKt$$ExternalSyntheticLambda2(RewardSlotQueries rewardSlotQueries) {
        this.$r8$classId = 18;
        CategorySearchQueries$performSearch$2 categorySearchQueries$performSearch$2 = CategorySearchQueries$performSearch$2.INSTANCE;
        this.f$0 = rewardSlotQueries;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0197 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0173 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v86, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v18, types: [byte[], java.io.Serializable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v33, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v9, types: [byte[], java.io.Serializable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v15, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r4v16, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r4v17, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r4v18, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r4v19, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r4v20, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r4v21, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r6v1, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r6v14, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r6v2, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r8v2, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r9v6, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r9v8, types: [byte[], java.io.Serializable] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Object stock;
        Object obj2;
        String str;
        int i = this.$r8$classId;
        int i2 = 23;
        int i3 = 7;
        int i4 = 5;
        final int i5 = 1;
        int i6 = 0;
        Object obj3 = this.f$0;
        switch (i) {
            case 0:
                TooltipState tooltipState = (TooltipState) obj3;
                ArrowOrientation arrowOrientation = (ArrowOrientation) obj;
                arrowOrientation.getClass();
                tooltipState.getClass();
                tooltipState.orientation$delegate.setValue(arrowOrientation);
                return Unit.INSTANCE;
            case 1:
                RealCellActivityAccessoryScope realCellActivityAccessoryScope = (RealCellActivityAccessoryScope) obj;
                realCellActivityAccessoryScope.getClass();
                realCellActivityAccessoryScope.amount(new ComposableLambdaImpl(new CashMapViewKt$$ExternalSyntheticLambda5((Holding) obj3, i3), true, 2014522744));
                return Unit.INSTANCE;
            case 2:
                final X509CertUtils x509CertUtils = (X509CertUtils) obj3;
                RealSegmentedControlScope realSegmentedControlScope = (RealSegmentedControlScope) obj;
                realSegmentedControlScope.getClass();
                final int i7 = 0;
                ComposableLambdaImpl composableLambdaImpl = new ComposableLambdaImpl(new Function2() { // from class: com.squareup.cash.investing.components.metrics.InvestingFinancialTileKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj4, Object obj5) {
                        int i8 = i7;
                        X509CertUtils x509CertUtils2 = x509CertUtils;
                        switch (i8) {
                            case 0:
                                Composer composer = (Composer) obj4;
                                int intValue = ((Integer) obj5).intValue();
                                GapComposer gapComposer = (GapComposer) composer;
                                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((InvestingFinancialViewModel$Content) x509CertUtils2).annualButtonLabel, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer2 = (Composer) obj4;
                                int intValue2 = ((Integer) obj5).intValue();
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((InvestingFinancialViewModel$Content) x509CertUtils2).quarterlyButtonLabel, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, true, 891871896);
                SnapshotStateList snapshotStateList = realSegmentedControlScope.segments;
                snapshotStateList.add(composableLambdaImpl);
                snapshotStateList.add(new ComposableLambdaImpl(new Function2() { // from class: com.squareup.cash.investing.components.metrics.InvestingFinancialTileKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj4, Object obj5) {
                        int i8 = i5;
                        X509CertUtils x509CertUtils2 = x509CertUtils;
                        switch (i8) {
                            case 0:
                                Composer composer = (Composer) obj4;
                                int intValue = ((Integer) obj5).intValue();
                                GapComposer gapComposer = (GapComposer) composer;
                                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((InvestingFinancialViewModel$Content) x509CertUtils2).annualButtonLabel, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer2 = (Composer) obj4;
                                int intValue2 = ((Integer) obj5).intValue();
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((InvestingFinancialViewModel$Content) x509CertUtils2).quarterlyButtonLabel, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, true, -1576381311));
                return Unit.INSTANCE;
            case 3:
                RealCellActivityAccessoryScope realCellActivityAccessoryScope2 = (RealCellActivityAccessoryScope) obj;
                realCellActivityAccessoryScope2.getClass();
                String str2 = ((InvestingCryptoNewsArticleViewModel) obj3).timestamp;
                if (str2 != null) {
                    realCellActivityAccessoryScope2.amount(new ComposableLambdaImpl(new PoolCreateViewKt$$ExternalSyntheticLambda5(str2, i4), true, -1132185058));
                }
                return Unit.INSTANCE;
            case 4:
                ((Context) obj).getClass();
                return ((StocksTransferEtaFullScreenView) obj3).formView;
            case 5:
                InvestingStocksWelcomeView investingStocksWelcomeView = (InvestingStocksWelcomeView) obj3;
                return new YInt(investingStocksWelcomeView.m3810bottomdBGyhoQ(investingStocksWelcomeView.heroView));
            case 6:
                InvestingDiscoveryQueries$selectDiscoveries$2 investingDiscoveryQueries$selectDiscoveries$2 = InvestingDiscoveryQueries$selectDiscoveries$2.INSTANCE;
                zzlj zzljVar = ((InvestingDiscoveryQueries) obj3).investment_entityAdapter;
                AndroidCursor androidCursor = (AndroidCursor) obj;
                String m1431m = re$$ExternalSyntheticOutline0.m1431m(androidCursor, 0);
                String string2 = androidCursor.getString(1);
                string2.getClass();
                String string3 = androidCursor.getString(2);
                String string4 = androidCursor.getString(3);
                string4.getClass();
                Long l = androidCursor.getLong(4);
                l.getClass();
                String string5 = androidCursor.getString(5);
                Boolean bool = androidCursor.getBoolean(6);
                Boolean bool2 = androidCursor.getBoolean(7);
                bool2.getClass();
                Long l2 = androidCursor.getLong(8);
                l2.getClass();
                String string6 = androidCursor.getString(9);
                string6.getClass();
                String string7 = androidCursor.getString(10);
                Boolean bool3 = androidCursor.getBoolean(11);
                bool3.getClass();
                ?? bytes = androidCursor.getBytes(12);
                Color color = bytes != 0 ? (Color) ((WireAdapter) zzljVar.zze).decode(bytes) : null;
                ?? bytes2 = androidCursor.getBytes(13);
                Image image = bytes2 != 0 ? (Image) ((WireAdapter) zzljVar.zzd).decode(bytes2) : null;
                Long l3 = androidCursor.getLong(14);
                String string8 = androidCursor.getString(15);
                SyncInvestmentEntity.ReleaseStage releaseStage = string8 != null ? (SyncInvestmentEntity.ReleaseStage) ((EnumColumnAdapter) zzljVar.zzf).decode(string8) : null;
                long longValue = l.longValue();
                boolean booleanValue = bool2.booleanValue();
                long longValue2 = l2.longValue();
                boolean booleanValue2 = bool3.booleanValue();
                m1431m.getClass();
                string2.getClass();
                string4.getClass();
                string6.getClass();
                return new SelectDiscoveries(m1431m, string2, string3, string4, longValue, string5, bool, booleanValue, longValue2, string6, string7, booleanValue2, color, image, l3, releaseStage);
            case 7:
                AndroidStatement androidStatement = (AndroidStatement) obj;
                androidStatement.getClass();
                androidStatement.bindBoolean(0, Boolean.valueOf(((InvestingDiscoveryQueries.SelectDiscoveriesQuery) obj3).in_search_category));
                return Unit.INSTANCE;
            case 8:
                InvestingEntityPriceCacheQueries$selectAll$2 investingEntityPriceCacheQueries$selectAll$2 = InvestingEntityPriceCacheQueries$selectAll$2.INSTANCE;
                AndroidCursor androidCursor2 = (AndroidCursor) obj;
                String m1431m2 = re$$ExternalSyntheticOutline0.m1431m(androidCursor2, 0);
                WireAdapter wireAdapter = ((BlockersConfig.Adapter) ((GpsConfigQueries) obj3).gpsConfigAdapter).target_balance_amountAdapter;
                ?? bytes3 = androidCursor2.getBytes(1);
                bytes3.getClass();
                return investingEntityPriceCacheQueries$selectAll$2.invoke(m1431m2, wireAdapter.decode(bytes3));
            case 9:
                InvestingNewsArticleQueries$articles$2 investingNewsArticleQueries$articles$2 = InvestingNewsArticleQueries$articles$2.INSTANCE;
                GpsConfigQueries gpsConfigQueries = (GpsConfigQueries) obj3;
                AndroidCursor androidCursor3 = (AndroidCursor) obj;
                androidCursor3.getClass();
                ((Local_tab_content.Adapter) gpsConfigQueries.gpsConfigAdapter).getClass();
                String string9 = androidCursor3.getString(0);
                string9.getClass();
                if (string9.equals("StocksPortfolio")) {
                    obj2 = NewsKind.StocksPortfolio.INSTANCE;
                } else {
                    if (!string9.equals("BitcoinPortfolio")) {
                        stock = new NewsKind.Stock(new InvestmentEntityToken(string9));
                        String string10 = androidCursor3.getString(1);
                        string10.getClass();
                        Object m = BalanceFeedKt$$ExternalSyntheticOutline0.m(androidCursor3, 2, ((Local_tab_content.Adapter) gpsConfigQueries.gpsConfigAdapter).responseAdapter);
                        String string11 = androidCursor3.getString(3);
                        string11.getClass();
                        Long l4 = androidCursor3.getLong(4);
                        String string12 = androidCursor3.getString(5);
                        Boolean bool4 = androidCursor3.getBoolean(6);
                        bool4.getClass();
                        Long l5 = androidCursor3.getLong(7);
                        l5.getClass();
                        return investingNewsArticleQueries$articles$2.invoke(stock, string10, m, string11, l4, string12, bool4, l5);
                    }
                    obj2 = NewsKind.BitcoinPortfolio.INSTANCE;
                }
                stock = obj2;
                String string102 = androidCursor3.getString(1);
                string102.getClass();
                Object m2 = BalanceFeedKt$$ExternalSyntheticOutline0.m(androidCursor3, 2, ((Local_tab_content.Adapter) gpsConfigQueries.gpsConfigAdapter).responseAdapter);
                String string112 = androidCursor3.getString(3);
                string112.getClass();
                Long l42 = androidCursor3.getLong(4);
                String string122 = androidCursor3.getString(5);
                Boolean bool42 = androidCursor3.getBoolean(6);
                bool42.getClass();
                Long l52 = androidCursor3.getLong(7);
                l52.getClass();
                return investingNewsArticleQueries$articles$2.invoke(stock, string102, m2, string112, l42, string122, bool42, l52);
            case 10:
                InvestingSettingsQueries$select$2 investingSettingsQueries$select$2 = InvestingSettingsQueries$select$2.INSTANCE;
                ImageLoader$Builder imageLoader$Builder = (ImageLoader$Builder) ((GpsConfigQueries) obj3).gpsConfigAdapter;
                AndroidCursor androidCursor4 = (AndroidCursor) obj;
                androidCursor4.getClass();
                ?? bytes4 = androidCursor4.getBytes(0);
                Money money = bytes4 != 0 ? (Money) ((WireAdapter) imageLoader$Builder.application).decode(bytes4) : null;
                ?? bytes5 = androidCursor4.getBytes(1);
                Money money2 = bytes5 != 0 ? (Money) ((WireAdapter) imageLoader$Builder.defaults).decode(bytes5) : null;
                String string13 = androidCursor4.getString(2);
                String string14 = androidCursor4.getString(3);
                String string15 = androidCursor4.getString(4);
                String string16 = androidCursor4.getString(5);
                String string17 = androidCursor4.getString(6);
                ?? bytes6 = androidCursor4.getBytes(7);
                LearnMoreConfiguration learnMoreConfiguration = bytes6 != 0 ? (LearnMoreConfiguration) ((WireAdapter) imageLoader$Builder.mainCoroutineContextLazy).decode(bytes6) : null;
                ?? bytes7 = androidCursor4.getBytes(8);
                List list = bytes7 != 0 ? (List) ((WireRepeatedAdapter) imageLoader$Builder.memoryCacheLazy).decode(bytes7) : null;
                ?? bytes8 = androidCursor4.getBytes(9);
                LearnMoreConfiguration learnMoreConfiguration2 = bytes8 != 0 ? (LearnMoreConfiguration) ((WireAdapter) imageLoader$Builder.diskCacheLazy).decode(bytes8) : null;
                ?? bytes9 = androidCursor4.getBytes(10);
                Money money3 = bytes9 != 0 ? (Money) ((WireAdapter) imageLoader$Builder.eventListenerFactory).decode(bytes9) : null;
                ?? bytes10 = androidCursor4.getBytes(11);
                Money money4 = bytes10 != 0 ? (Money) ((WireAdapter) imageLoader$Builder.componentRegistry).decode(bytes10) : null;
                ?? bytes11 = androidCursor4.getBytes(12);
                CustomOrderConfiguration customOrderConfiguration = bytes11 != 0 ? (CustomOrderConfiguration) ((WireAdapter) imageLoader$Builder.extras).decode(bytes11) : null;
                String string18 = androidCursor4.getString(13);
                String string19 = androidCursor4.getString(14);
                String string20 = androidCursor4.getString(15);
                String string21 = androidCursor4.getString(16);
                String string22 = androidCursor4.getString(17);
                String string23 = androidCursor4.getString(18);
                String string24 = androidCursor4.getString(19);
                Boolean bool5 = androidCursor4.getBoolean(20);
                bool5.getClass();
                Object[] objArr = {money, money2, string13, string14, string15, string16, string17, learnMoreConfiguration, list, learnMoreConfiguration2, money3, money4, customOrderConfiguration, string18, string19, string20, string21, string22, string23, string24, bool5, androidCursor4.getString(21), androidCursor4.getString(22), androidCursor4.getString(23), androidCursor4.getString(24)};
                if (objArr.length == 25) {
                    return new Investing_settings((Money) objArr[0], (Money) objArr[1], (String) objArr[2], (String) objArr[3], (String) objArr[4], (String) objArr[5], (String) objArr[6], (LearnMoreConfiguration) objArr[7], (List) objArr[8], (LearnMoreConfiguration) objArr[9], (Money) objArr[10], (Money) objArr[11], (CustomOrderConfiguration) objArr[12], (String) objArr[13], (String) objArr[14], (String) objArr[15], (String) objArr[16], (String) objArr[17], (String) objArr[18], (String) objArr[19], ((Boolean) objArr[20]).booleanValue(), (String) objArr[21], (String) objArr[22], (String) objArr[23], (String) objArr[24]);
                }
                a$$ExternalSyntheticBUOutline0.m$3("Expected 25 arguments");
                return null;
            case 11:
                AndroidStatement androidStatement2 = (AndroidStatement) obj;
                androidStatement2.getClass();
                androidStatement2.bindString(0, ((InvestmentEntityQueries.ForTokenQuery) obj3).token);
                return Unit.INSTANCE;
            case 12:
                AndroidStatement androidStatement3 = (AndroidStatement) obj;
                androidStatement3.getClass();
                Iterator it = ((Collection) ((OffersSheetQueries$ForSheetKeyQuery) obj3).sheet_key).iterator();
                while (it.hasNext()) {
                    androidStatement3.bindString(i6, (String) it.next());
                    i6++;
                }
                return Unit.INSTANCE;
            case 13:
                AndroidStatement androidStatement4 = (AndroidStatement) obj;
                androidStatement4.getClass();
                androidStatement4.bindString(0, ((InvestmentEntityQueries.ForTokenQuery) obj3).token);
                return Unit.INSTANCE;
            case 14:
                AndroidStatement androidStatement5 = (AndroidStatement) obj;
                androidStatement5.getClass();
                androidStatement5.bindString(0, (String) ((OffersSheetQueries$ForSheetKeyQuery) obj3).sheet_key);
                return Unit.INSTANCE;
            case 15:
                InvestmentPerformanceQueries$forEntityToken$2 investmentPerformanceQueries$forEntityToken$2 = InvestmentPerformanceQueries$forEntityToken$2.INSTANCE;
                AndroidCursor androidCursor5 = (AndroidCursor) obj;
                String m1431m3 = re$$ExternalSyntheticOutline0.m1431m(androidCursor5, 0);
                String string25 = androidCursor5.getString(1);
                WireRepeatedAdapter wireRepeatedAdapter = ((StampsConfig.Adapter) ((GpsConfigQueries) obj3).gpsConfigAdapter).stampsAdapter;
                ?? bytes12 = androidCursor5.getBytes(2);
                bytes12.getClass();
                return investmentPerformanceQueries$forEntityToken$2.invoke(m1431m3, string25, wireRepeatedAdapter.decode(bytes12));
            case 16:
                AndroidStatement androidStatement6 = (AndroidStatement) obj;
                androidStatement6.getClass();
                androidStatement6.bindString(0, (String) ((OffersSheetQueries$ForSheetKeyQuery) obj3).sheet_key);
                return Unit.INSTANCE;
            case 17:
                AndroidStatement androidStatement7 = (AndroidStatement) obj;
                androidStatement7.getClass();
                androidStatement7.bindString(0, (String) ((OffersSheetQueries$ForSheetKeyQuery) obj3).sheet_key);
                return Unit.INSTANCE;
            case 18:
                CategorySearchQueries$performSearch$2 categorySearchQueries$performSearch$2 = CategorySearchQueries$performSearch$2.INSTANCE;
                RewardSlotQueries rewardSlotQueries = (RewardSlotQueries) obj3;
                AndroidCursor androidCursor6 = (AndroidCursor) obj;
                Long m3 = re$$ExternalSyntheticOutline0.m(androidCursor6, 0);
                String string26 = androidCursor6.getString(1);
                String m4 = Matcher$$ExternalSyntheticOutline0.m(string26, androidCursor6, 2);
                Enum m5 = NavAction$$ExternalSyntheticOutline0.m(androidCursor6, 3, (EnumColumnAdapter) ((zzlj) rewardSlotQueries.rewardAdapter).zza);
                String string27 = androidCursor6.getString(4);
                string27.getClass();
                String string28 = androidCursor6.getString(5);
                Long l6 = androidCursor6.getLong(6);
                String string29 = androidCursor6.getString(7);
                zzlj zzljVar2 = (zzlj) rewardSlotQueries.rewardAdapter;
                Enum m6 = NavAction$$ExternalSyntheticOutline0.m(androidCursor6, 8, (EnumColumnAdapter) zzljVar2.zzb);
                String string30 = androidCursor6.getString(9);
                ?? bytes13 = androidCursor6.getBytes(10);
                List list2 = bytes13 != 0 ? (List) ((WireRepeatedAdapter) zzljVar2.zzc).decode(bytes13) : null;
                Long l7 = androidCursor6.getLong(11);
                Boolean bool6 = androidCursor6.getBoolean(12);
                bool6.getClass();
                ?? bytes14 = androidCursor6.getBytes(13);
                Color color2 = bytes14 != 0 ? (Color) ((WireAdapter) zzljVar2.zze).decode(bytes14) : null;
                ?? bytes15 = androidCursor6.getBytes(14);
                Image image2 = bytes15 != 0 ? (Image) ((WireAdapter) zzljVar2.zzd).decode(bytes15) : null;
                String string31 = androidCursor6.getString(15);
                SyncInvestmentEntity.ReleaseStage releaseStage2 = string31 != null ? (SyncInvestmentEntity.ReleaseStage) ((EnumColumnAdapter) zzljVar2.zzf).decode(string31) : null;
                long longValue3 = m3.longValue();
                InvestmentEntityType investmentEntityType = (InvestmentEntityType) m5;
                InvestmentEntityStatus investmentEntityStatus = (InvestmentEntityStatus) m6;
                List list3 = list2;
                boolean booleanValue3 = bool6.booleanValue();
                string26.getClass();
                m4.getClass();
                investmentEntityType.getClass();
                string27.getClass();
                investmentEntityStatus.getClass();
                return new Investment_entity(longValue3, string26, m4, investmentEntityType, string27, string28, l6, string29, investmentEntityStatus, string30, list3, l7, booleanValue3, color2, image2, releaseStage2);
            case 19:
                AndroidStatement androidStatement8 = (AndroidStatement) obj;
                androidStatement8.getClass();
                androidStatement8.bindString(0, (String) ((OffersSheetQueries$ForSheetKeyQuery) obj3).sheet_key);
                return Unit.INSTANCE;
            case 20:
                String str3 = (String) obj;
                str3.getClass();
                List<InvestingCategoryFilterViewModel.Content.FilterOption> list4 = ((InvestingCategoryFilterViewModel.Content.FilterSection) obj3).options;
                ArrayList arrayList = new ArrayList();
                for (InvestingCategoryFilterViewModel.Content.FilterOption filterOption : list4) {
                    if (!(filterOption instanceof InvestingCategoryFilterViewModel.Content.FilterOption.Checkbox)) {
                        if (!(filterOption instanceof InvestingCategoryFilterViewModel.Content.FilterOption.Selection)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        InvestingCategoryFilterViewModel.Content.FilterOption.Selection selection = (InvestingCategoryFilterViewModel.Content.FilterOption.Selection) filterOption;
                        if (Intrinsics.areEqual(selection.token, str3)) {
                            str = selection.selectedOption;
                            if (str == null) {
                                arrayList.add(str);
                            }
                        }
                    }
                    str = null;
                    if (str == null) {
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (((String) next).length() > 0) {
                        arrayList2.add(next);
                    }
                }
                return CollectionsKt.joinToString$default(arrayList2, "|", null, null, 0, null, null, 62);
            case 21:
                InvestingStockDetailsPresenter investingStockDetailsPresenter = (InvestingStockDetailsPresenter) obj3;
                return SchemaFactory.displayTextForTickActivities(investingStockDetailsPresenter.stringManager, (List) obj, investingStockDetailsPresenter.moneyFormatterFactory);
            case 22:
                int i8 = LocalizationConfigQueries$select$2.$r8$clinit;
                GpsConfigQueries gpsConfigQueries2 = (GpsConfigQueries) obj3;
                AndroidCursor androidCursor7 = (AndroidCursor) obj;
                androidCursor7.getClass();
                ?? bytes16 = androidCursor7.getBytes(0);
                return new LocalizationConfig(bytes16 != 0 ? (com.squareup.protos.franklin.common.LocalizationConfig) ((BlockersConfig.Adapter) gpsConfigQueries2.gpsConfigAdapter).target_balance_amountAdapter.decode(bytes16) : null);
            case 23:
                CameraPositionState cameraPositionState = (CameraPositionState) obj;
                cameraPositionState.getClass();
                LocationViewModel locationViewModel = ((CashMapViewModel) obj3).locationViewModel;
                cameraPositionState.setPosition(new CameraPosition(new LatLng(locationViewModel.lat, locationViewModel.lng), locationViewModel.zoom, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE));
                return Unit.INSTANCE;
            case 24:
                ((DisposableEffectScope) obj).getClass();
                return new AndroidPopup_androidKt$Popup$2$1$invoke$$inlined$onDispose$1((VerifyCheckDialogPresenter) obj3, i2);
            case 25:
                LocalCashBalancePresenter localCashBalancePresenter = (LocalCashBalancePresenter) obj3;
                ErrorMessaging errorMessaging = TextUtilsCompat.errorMessaging((AndroidStringManager) localCashBalancePresenter.stringManager, (ApiResult.Failure) obj, null);
                ((BetterNavigator.ScreenNavigator) localCashBalancePresenter.navigator).goTo(new FailureMessageScreen(errorMessaging.title, errorMessaging.message, null, (MerchantScreen$MerchantBlockingScreen) localCashBalancePresenter.service, null, 20));
                return Unit.INSTANCE;
            case 26:
                GenericTreeElementsView genericTreeElementsView = (GenericTreeElementsView) obj;
                genericTreeElementsView.getClass();
                genericTreeElementsView.setModel((GenericTreeElementsViewModel) obj3);
                return Unit.INSTANCE;
            case 27:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, ((InstalledAppletTileHeaderModel) obj3).title);
                return Unit.INSTANCE;
            case 28:
                PromotedAppletTileQueries$selectAll$2 promotedAppletTileQueries$selectAll$2 = PromotedAppletTileQueries$selectAll$2.INSTANCE;
                GpsConfigQueries gpsConfigQueries3 = (GpsConfigQueries) obj3;
                AndroidCursor androidCursor8 = (AndroidCursor) obj;
                String m1431m4 = re$$ExternalSyntheticOutline0.m1431m(androidCursor8, 0);
                Long l8 = androidCursor8.getLong(1);
                l8.getClass();
                String string32 = androidCursor8.getString(2);
                String string33 = androidCursor8.getString(3);
                ?? bytes17 = androidCursor8.getBytes(4);
                return promotedAppletTileQueries$selectAll$2.invoke(m1431m4, l8, string32, string33, bytes17 != 0 ? (Image) ((Local_tab_content.Adapter) gpsConfigQueries3.gpsConfigAdapter).responseAdapter.decode(bytes17) : null);
            default:
                AndroidStringManager androidStringManager = (AndroidStringManager) ((e0) obj3).c;
                FamilyProfile familyProfile = (FamilyProfile) obj;
                familyProfile.getClass();
                if (familyProfile.equals(FamilyProfile.Standard.INSTANCE)) {
                    return androidStringManager.get(R.string.money_tab_title_adult);
                }
                if (!(familyProfile instanceof FamilyProfile.ManagedAccount)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                String str4 = ((FamilyProfile.ManagedAccount) familyProfile).firstName;
                if (str4 == null || StringsKt.isBlank(str4)) {
                    return androidStringManager.get(R.string.money_tab_title_adult);
                }
                Map mapOf = MapsKt__MapsJVMKt.mapOf(new Pair("firstName", str4));
                mapOf.getClass();
                Resources resources = androidStringManager.resources;
                resources.getClass();
                String format2 = new MessageFormat(resources.getString(R.string.money_tab_title_managed_account)).format(mapOf);
                format2.getClass();
                return format2;
        }
    }

    public /* synthetic */ TooltipBoxKt$$ExternalSyntheticLambda2(GpsConfigQueries gpsConfigQueries) {
        this.$r8$classId = 8;
        InvestingEntityPriceCacheQueries$selectAll$2 investingEntityPriceCacheQueries$selectAll$2 = InvestingEntityPriceCacheQueries$selectAll$2.INSTANCE;
        this.f$0 = gpsConfigQueries;
    }

    public /* synthetic */ TooltipBoxKt$$ExternalSyntheticLambda2(GpsConfigQueries gpsConfigQueries, byte b) {
        this.$r8$classId = 9;
        InvestingNewsArticleQueries$articles$2 investingNewsArticleQueries$articles$2 = InvestingNewsArticleQueries$articles$2.INSTANCE;
        this.f$0 = gpsConfigQueries;
    }

    public /* synthetic */ TooltipBoxKt$$ExternalSyntheticLambda2(GpsConfigQueries gpsConfigQueries, byte b, boolean z) {
        this.$r8$classId = 28;
        PromotedAppletTileQueries$selectAll$2 promotedAppletTileQueries$selectAll$2 = PromotedAppletTileQueries$selectAll$2.INSTANCE;
        this.f$0 = gpsConfigQueries;
    }

    public /* synthetic */ TooltipBoxKt$$ExternalSyntheticLambda2(GpsConfigQueries gpsConfigQueries, char c) {
        this.$r8$classId = 10;
        InvestingSettingsQueries$select$2 investingSettingsQueries$select$2 = InvestingSettingsQueries$select$2.INSTANCE;
        this.f$0 = gpsConfigQueries;
    }

    public /* synthetic */ TooltipBoxKt$$ExternalSyntheticLambda2(GpsConfigQueries gpsConfigQueries, int i) {
        this.$r8$classId = 15;
        InvestmentPerformanceQueries$forEntityToken$2 investmentPerformanceQueries$forEntityToken$2 = InvestmentPerformanceQueries$forEntityToken$2.INSTANCE;
        this.f$0 = gpsConfigQueries;
    }

    public /* synthetic */ TooltipBoxKt$$ExternalSyntheticLambda2(GpsConfigQueries gpsConfigQueries, short s) {
        this.$r8$classId = 22;
        int i = LocalizationConfigQueries$select$2.$r8$clinit;
        this.f$0 = gpsConfigQueries;
    }

    public /* synthetic */ TooltipBoxKt$$ExternalSyntheticLambda2(InvestingDiscoveryQueries investingDiscoveryQueries) {
        this.$r8$classId = 6;
        InvestingDiscoveryQueries$selectDiscoveries$2 investingDiscoveryQueries$selectDiscoveries$2 = InvestingDiscoveryQueries$selectDiscoveries$2.INSTANCE;
        this.f$0 = investingDiscoveryQueries;
    }

    public /* synthetic */ TooltipBoxKt$$ExternalSyntheticLambda2(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }
}
