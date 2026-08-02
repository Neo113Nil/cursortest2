package app.cash.local.presenters.pos;

import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1;
import androidx.lifecycle.BlockRunner$cancel$1;
import app.cash.broadway.presenter.molecule.AnswerDispatcher;
import app.cash.broadway.presenter.molecule.AnswersKt;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.local.navigation.LocalInstalledStore;
import app.cash.local.presenters.internal.LocalsKt;
import app.cash.local.primitives.LocalCurrencyCode;
import app.cash.local.primitives.LocalMoney;
import app.cash.local.screens.app.LocalPosLocalCashRedemptionScreen;
import app.cash.local.service.LocalService;
import app.cash.local.store.real.RealLocalInstalledStore;
import app.cash.local.store.real.RealLocalInstalledStore$hideBrands$$inlined$map$1;
import app.cash.local.viewmodels.pos.LocalPosLocalCashRedemptionViewModel;
import app.cash.redwood.treehouse.EventBridge$sendEvent$1;
import com.google.android.gms.internal.mlkit_genai_prompt.zzmo;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.featureflags.AmplitudeExperiments$ClientP2pPlatformPay;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LocalFeatureFlags$NeighborhoodsPosCanUnlink;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.instruments.backend.real.RealInstrumentRowLoader;
import com.squareup.cash.instruments.viewmodels.InstrumentSelectionRowViewModel;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.paychecks.views.HelpSheetView$$ExternalSyntheticLambda0;
import com.squareup.cash.payments.RealPaymentInitiator;
import com.squareup.cash.payments.screens.PaymentScreens;
import com.squareup.cash.payments.viewmodels.NearbyPaymentKeypadViewModel;
import com.squareup.cash.payments.views.MainPaymentView$Content$2$1;
import com.squareup.cash.payments.views.MainPaymentViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.phoneplans.PhonePlansHomePresenter$models$1$1;
import com.squareup.cash.recipients.data.Recipient;
import com.squareup.cash.recipients.viewmodels.RecipientViewModel;
import com.squareup.cash.session.backend.DbSessionManager$updateDb$2;
import com.squareup.cash.support.presenters.ArticlePresenter$models$$inlined$AnswerHandler$1;
import com.squareup.cash.util.money.Moneys;
import com.squareup.protos.cash.local.client.app.v1.poscheckin.LocalPOSCheckIn;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.protos.cash.local.client.v1.LocalMiniCard;
import com.squareup.protos.cash.local.client.v1.POSLocalCashRedemption;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.InstrumentSelection;
import com.squareup.wire.GrpcStatus;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes3.dex */
public final class LocalPosLocalCashRedemptionPresenter implements MoleculePresenter {
    public final /* synthetic */ int $r8$classId = 0;
    public final Analytics analytics;
    public final boolean canAbandonCheckIn;
    public final Parcelable localCashRedemption;
    public final BetterNavigator.ScreenNavigator navigator;
    public final Object service;
    public final Object store;

    public LocalPosLocalCashRedemptionPresenter(Analytics analytics, LocalInstalledStore localInstalledStore, LocalService localService, FeatureFlagManager featureFlagManager, LocalPosLocalCashRedemptionScreen localPosLocalCashRedemptionScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        localPosLocalCashRedemptionScreen.getClass();
        this.analytics = analytics;
        this.store = localInstalledStore;
        this.service = localService;
        this.navigator = screenNavigator;
        this.localCashRedemption = localPosLocalCashRedemptionScreen.posLocalCashRedemption;
        this.canAbandonCheckIn = ((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(LocalFeatureFlags$NeighborhoodsPosCanUnlink.INSTANCE)).enabled();
    }

    public static final Money access$models$rawAmountAsMoney(MutableState mutableState) {
        return (((String) mutableState.getValue()).length() == 0 || Intrinsics.areEqual((String) mutableState.getValue(), "0")) ? Moneys.zero(CurrencyCode.USD) : Moneys.parseMoneyFromString$default((String) mutableState.getValue(), CurrencyCode.USD);
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        LocalImage localImage;
        LocalPOSCheckIn localPOSCheckIn;
        Object phonePlansHomePresenter$models$1$1;
        InstrumentSelection instrumentSelection;
        String str;
        MutableState mutableState;
        MutableState mutableState2;
        LocalPosLocalCashRedemptionPresenter localPosLocalCashRedemptionPresenter = this;
        int i2 = localPosLocalCashRedemptionPresenter.$r8$classId;
        int i3 = 10;
        int i4 = 15;
        Parcelable parcelable = localPosLocalCashRedemptionPresenter.localCashRedemption;
        Object obj = Composer.Companion.Empty;
        switch (i2) {
            case 0:
                POSLocalCashRedemption pOSLocalCashRedemption = (POSLocalCashRedemption) parcelable;
                LocalInstalledStore localInstalledStore = (LocalInstalledStore) localPosLocalCashRedemptionPresenter.store;
                flow.getClass();
                GapComposer gapComposer = (GapComposer) composer;
                gapComposer.startReplaceGroup(911614846);
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == obj) {
                    Object realLocalInstalledStore$hideBrands$$inlined$map$1 = new RealLocalInstalledStore$hideBrands$$inlined$map$1(((RealLocalInstalledStore) localInstalledStore).syncValueReader.getAllValues(AndroidSyncValueSpecs.LocalPosCheckIn), i4);
                    gapComposer.updateRememberedValue(realLocalInstalledStore$hideBrands$$inlined$map$1);
                    rememberedValue = realLocalInstalledStore$hideBrands$$inlined$map$1;
                }
                MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue, null, null, gapComposer, 48, 2);
                Object rememberedValue2 = gapComposer.rememberedValue();
                int i5 = 3;
                if (rememberedValue2 == obj) {
                    rememberedValue2 = new DataStoreImpl$data$1$invokeSuspend$$inlined$map$1(new RealLocalInstalledStore$hideBrands$$inlined$map$1(((RealLocalInstalledStore) localInstalledStore).syncValueReader.getSingleValue(AndroidSyncValueSpecs.LocalCashBalance), 12), i5);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue2, null, null, gapComposer, 48, 2);
                Continuation continuation = null;
                if (((Long) collectAsState2.getValue()) != null) {
                    gapComposer.startReplaceGroup(840078027);
                    Unit unit = Unit.INSTANCE;
                    boolean changedInstance = gapComposer.changedInstance(localPosLocalCashRedemptionPresenter) | gapComposer.changed(collectAsState2);
                    Object rememberedValue3 = gapComposer.rememberedValue();
                    if (changedInstance || rememberedValue3 == obj) {
                        rememberedValue3 = new EventBridge$sendEvent$1(localPosLocalCashRedemptionPresenter, collectAsState2, continuation, 8);
                        gapComposer.updateRememberedValue(rememberedValue3);
                    }
                    Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue3);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(840286564);
                    gapComposer.end(false);
                }
                Updater.LaunchedEffect(gapComposer, flow, new zzmo(flow, continuation, localPosLocalCashRedemptionPresenter, collectAsState, 10));
                Unit unit2 = Unit.INSTANCE;
                boolean changedInstance2 = gapComposer.changedInstance(localPosLocalCashRedemptionPresenter);
                Object rememberedValue4 = gapComposer.rememberedValue();
                if (changedInstance2 || rememberedValue4 == obj) {
                    rememberedValue4 = new BlockRunner$cancel$1(localPosLocalCashRedemptionPresenter, continuation, 13);
                    gapComposer.updateRememberedValue(rememberedValue4);
                }
                Updater.LaunchedEffect(gapComposer, unit2, (Function2) rememberedValue4);
                boolean z = localPosLocalCashRedemptionPresenter.canAbandonCheckIn && (localPOSCheckIn = (LocalPOSCheckIn) collectAsState.getValue()) != null && LocalsKt.getCheckedIn(localPOSCheckIn);
                LocalMiniCard localMiniCard = pOSLocalCashRedemption.mini_card;
                if (localMiniCard != null) {
                    LocalImage localImage2 = localMiniCard.artwork_image;
                    if (localImage2 == null) {
                        localImage2 = localMiniCard.icon;
                    }
                    localImage = localImage2;
                } else {
                    localImage = null;
                }
                LocalColor localColor = pOSLocalCashRedemption.foreground_color;
                LocalColor localColor2 = localMiniCard != null ? localMiniCard.background_color : null;
                Long l = (Long) collectAsState2.getValue();
                String prettyPrint$default = LocalsKt.prettyPrint$default(new LocalMoney(l != null ? l.longValue() : 0L, LocalCurrencyCode.USD), false, null, 3);
                List<POSLocalCashRedemption.Coupon> list = pOSLocalCashRedemption.coupons;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                for (POSLocalCashRedemption.Coupon coupon : list) {
                    arrayList.add(new LocalPosLocalCashRedemptionViewModel.Coupon(coupon.icon, coupon.title, coupon.code));
                }
                LocalPosLocalCashRedemptionViewModel localPosLocalCashRedemptionViewModel = new LocalPosLocalCashRedemptionViewModel(z, localImage, localColor, localColor2, prettyPrint$default, arrayList);
                gapComposer.end(false);
                return localPosLocalCashRedemptionViewModel;
            default:
                flow.getClass();
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startReplaceGroup(-1915369375);
                PaymentScreens.NearbyPaymentKeypad nearbyPaymentKeypad = (PaymentScreens.NearbyPaymentKeypad) parcelable;
                String str2 = nearbyPaymentKeypad.flowToken;
                String str3 = str2 == null ? "" : str2;
                Unit unit3 = Unit.INSTANCE;
                boolean changedInstance3 = gapComposer2.changedInstance(localPosLocalCashRedemptionPresenter) | gapComposer2.changed(str3);
                Object rememberedValue5 = gapComposer2.rememberedValue();
                Continuation continuation2 = null;
                if (changedInstance3 || rememberedValue5 == obj) {
                    rememberedValue5 = new MainPaymentView$Content$2$1(localPosLocalCashRedemptionPresenter, str3, continuation2, i4);
                    gapComposer2.updateRememberedValue(rememberedValue5);
                }
                Updater.LaunchedEffect(gapComposer2, unit3, (Function2) rememberedValue5);
                Object[] objArr = new Object[0];
                Object rememberedValue6 = gapComposer2.rememberedValue();
                if (rememberedValue6 == obj) {
                    rememberedValue6 = new MainPaymentViewKt$$ExternalSyntheticLambda0(i3);
                    gapComposer2.updateRememberedValue(rememberedValue6);
                }
                MutableState mutableState3 = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue6, gapComposer2, 48);
                Object rememberedValue7 = gapComposer2.rememberedValue();
                if (rememberedValue7 == obj) {
                    rememberedValue7 = Updater.mutableStateOf$default(Boolean.FALSE);
                    gapComposer2.updateRememberedValue(rememberedValue7);
                }
                MutableState mutableState4 = (MutableState) rememberedValue7;
                Object rememberedValue8 = gapComposer2.rememberedValue();
                if (rememberedValue8 == obj) {
                    rememberedValue8 = Updater.mutableStateOf$default(null);
                    gapComposer2.updateRememberedValue(rememberedValue8);
                }
                MutableState mutableState5 = (MutableState) rememberedValue8;
                Object rememberedValue9 = gapComposer2.rememberedValue();
                if (rememberedValue9 == obj) {
                    rememberedValue9 = Updater.mutableStateOf$default(null);
                    gapComposer2.updateRememberedValue(rememberedValue9);
                }
                MutableState mutableState6 = (MutableState) rememberedValue9;
                String str4 = (String) mutableState3.getValue();
                InstrumentSelection instrumentSelection2 = (InstrumentSelection) mutableState5.getValue();
                boolean changedInstance4 = gapComposer2.changedInstance(localPosLocalCashRedemptionPresenter) | gapComposer2.changed(mutableState3);
                Object rememberedValue10 = gapComposer2.rememberedValue();
                if (changedInstance4 || rememberedValue10 == obj) {
                    instrumentSelection = instrumentSelection2;
                    str = str4;
                    phonePlansHomePresenter$models$1$1 = new PhonePlansHomePresenter$models$1$1(this, mutableState3, mutableState5, mutableState6, null, 5);
                    localPosLocalCashRedemptionPresenter = this;
                    mutableState = mutableState5;
                    mutableState2 = mutableState6;
                    gapComposer2.updateRememberedValue(phonePlansHomePresenter$models$1$1);
                } else {
                    mutableState = mutableState5;
                    phonePlansHomePresenter$models$1$1 = rememberedValue10;
                    str = str4;
                    mutableState2 = mutableState6;
                    instrumentSelection = instrumentSelection2;
                }
                Updater.LaunchedEffect(str, instrumentSelection, (Function2) phonePlansHomePresenter$models$1$1, gapComposer2);
                boolean changedInstance5 = gapComposer2.changedInstance(localPosLocalCashRedemptionPresenter) | gapComposer2.changed(str3);
                Object rememberedValue11 = gapComposer2.rememberedValue();
                if (changedInstance5 || rememberedValue11 == obj) {
                    rememberedValue11 = new HelpSheetView$$ExternalSyntheticLambda0(29, localPosLocalCashRedemptionPresenter, str3, mutableState);
                    gapComposer2.updateRememberedValue(rememberedValue11);
                }
                Function2 function2 = (Function2) rememberedValue11;
                AnswerDispatcher answerDispatcher = (AnswerDispatcher) gapComposer2.consume(AnswersKt.LocalAnswerDispatcher);
                boolean changed = gapComposer2.changed(function2) | gapComposer2.changedInstance(answerDispatcher);
                Object rememberedValue12 = gapComposer2.rememberedValue();
                if (changed || rememberedValue12 == obj) {
                    rememberedValue12 = new ArticlePresenter$models$$inlined$AnswerHandler$1(function2, answerDispatcher, 11);
                    gapComposer2.updateRememberedValue(rememberedValue12);
                }
                Updater.DisposableEffect(answerDispatcher, (Function1) rememberedValue12, gapComposer2);
                Updater.LaunchedEffect(gapComposer2, flow, new DbSessionManager$updateDb$2(flow, null, localPosLocalCashRedemptionPresenter, str3, mutableState4, mutableState3, mutableState, 22));
                Object rememberedValue13 = gapComposer2.rememberedValue();
                if (rememberedValue13 == obj) {
                    Recipient recipient = (Recipient) nearbyPaymentKeypad.recipient.getValue();
                    String str5 = recipient.displayName;
                    String str6 = str5 == null ? "" : str5;
                    String str7 = recipient.customerId;
                    rememberedValue13 = new RecipientViewModel(str7 == null ? "" : str7, recipient, str6, new RecipientViewModel.Avatar.PhotoImageAvatar(recipient.photo), GrpcStatus.Companion.monogram(str6), null, false, false, false, recipient.getAccentColor(), false, 7648);
                    gapComposer2.updateRememberedValue(rememberedValue13);
                }
                RecipientViewModel recipientViewModel = (RecipientViewModel) rememberedValue13;
                CurrencyCode currencyCode = CurrencyCode.USD;
                String str8 = (String) mutableState3.getValue();
                String str9 = str8.length() == 0 ? "0" : str8;
                InstrumentSelectionRowViewModel instrumentSelectionRowViewModel = (InstrumentSelectionRowViewModel) mutableState2.getValue();
                String str10 = instrumentSelectionRowViewModel != null ? instrumentSelectionRowViewModel.subtitle : null;
                String str11 = str10 == null ? "" : str10;
                InstrumentSelectionRowViewModel instrumentSelectionRowViewModel2 = (InstrumentSelectionRowViewModel) mutableState2.getValue();
                String str12 = instrumentSelectionRowViewModel2 != null ? instrumentSelectionRowViewModel2.balance : null;
                String str13 = str12 == null ? "" : str12;
                boolean z2 = ((String) mutableState3.getValue()).length() > 0 && !Intrinsics.areEqual((String) mutableState3.getValue(), "0");
                InstrumentSelectionRowViewModel instrumentSelectionRowViewModel3 = (InstrumentSelectionRowViewModel) mutableState2.getValue();
                NearbyPaymentKeypadViewModel nearbyPaymentKeypadViewModel = new NearbyPaymentKeypadViewModel(recipientViewModel, currencyCode, str9, str11, str13, z2, instrumentSelectionRowViewModel3 != null ? instrumentSelectionRowViewModel3.instrumentAvatarViewModel : null);
                gapComposer2.end(false);
                return nearbyPaymentKeypadViewModel;
        }
    }

    public LocalPosLocalCashRedemptionPresenter(RealPaymentInitiator realPaymentInitiator, RealUuidGenerator realUuidGenerator, Analytics analytics, RealInstrumentRowLoader realInstrumentRowLoader, FeatureFlagManager featureFlagManager, PaymentScreens.NearbyPaymentKeypad nearbyPaymentKeypad, BetterNavigator.ScreenNavigator screenNavigator) {
        nearbyPaymentKeypad.getClass();
        this.store = realPaymentInitiator;
        this.analytics = analytics;
        this.service = realInstrumentRowLoader;
        this.localCashRedemption = nearbyPaymentKeypad;
        this.navigator = screenNavigator;
        this.canAbandonCheckIn = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) featureFlagManager).currentValue(AmplitudeExperiments$ClientP2pPlatformPay.INSTANCE)).enabled();
    }
}
