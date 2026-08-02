package com.squareup.cash.google.pay;

import android.app.Activity;
import androidx.emoji2.text.MetadataRepo;
import androidx.lifecycle.LifecycleOwner;
import androidx.media3.ui.compose.PlayerSurfaceKt;
import app.cash.broadway.navigation.Navigator;
import com.google.android.gms.common.api.internal.zacn;
import com.google.android.gms.internal.tapandpay.zzag;
import com.google.crypto.tink.internal.PrimitiveRegistry$$ExternalSyntheticLambda0;
import com.google.mlkit.vision.text.zzb;
import com.squareup.cash.appintro.presenters.AlternativeNewSponsorAliasPresenter$Factory$Impl;
import com.squareup.cash.appintro.presenters.SponsorshipRequestReferralIntroPresenter$Factory$Impl;
import com.squareup.cash.blockers.scenarioplan.presenters.ScenarioPlanErrorPresenter$Factory$Impl;
import com.squareup.cash.blockers.scenarioplan.presenters.ScenarioPlanLoadingPresenter$Factory$Impl;
import com.squareup.cash.cashapplite.presenters.ActivityAppletTilePresenter$Factory$Impl;
import com.squareup.cash.cashapplite.presenters.KycAppletTilePresenter$Factory$Impl;
import com.squareup.cash.cashapplite.views.KycAppletTileKt;
import com.squareup.cash.cashapppay.presenters.CashAppPayPresenterFactory;
import com.squareup.cash.cashapppay.presenters.GrantPresenter$Factory$Impl;
import com.squareup.cash.cashapppay.presenters.StatusInterstitialPresenter$Factory$Impl;
import com.squareup.cash.fidesmo.presenters.FidesmoDeprovisioningPresenter$Factory$Impl;
import com.squareup.cash.fidesmo.presenters.FidesmoProvisioningPresenter$Factory$Impl;
import com.squareup.cash.formview.components.FormCashtag;
import com.squareup.cash.growtools.presenters.manager.GrowToolsManagerPresenter$Factory$Impl;
import com.squareup.cash.growtools.presenters.manager.activity.GrowToolsCompleteActivityPresenter$Factory$Impl;
import com.squareup.cash.initialscreenloader.backend.RealInitialScreenLoader$Factory$Impl;
import com.squareup.cash.money.presenters.HypeWelcomePresenter$Factory$Impl;
import com.squareup.cash.money.presenters.MoneyPresenterFactory;
import com.squareup.cash.money.presenters.MoneyTabPresenter$Factory$Impl;
import com.squareup.cash.prepurchasecashcard.presenters.PrepurchaseCashCardFAQPresenter$Factory$Impl;
import com.squareup.cash.prepurchasecashcard.presenters.PrepurchaseCashCardPlanningPresenter$Factory$Impl;
import com.squareup.cash.retro.presenters.PaymentPlanDataBlockerPresenter$Factory$Impl;
import com.squareup.cash.retro.presenters.SelectPaymentPlanBlockerPresenter$Factory$Impl;
import com.squareup.cash.shopping.autofill.presenters.AutofillPresenter$Factory$Impl;
import com.squareup.cash.shopping.autofill.presenters.EditAutofillPresenter$Factory$Impl;
import com.squareup.cash.transactionpicker.presenters.RealTransactionLoader$Factory$Impl;
import dev.zacsweers.metro.internal.Factory;
import dev.zacsweers.metro.internal.InstanceFactory;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.rx3.RxAwaitKt$await$5$1;

/* loaded from: classes6.dex */
public final class RealGooglePayer {
    public final Activity activity;
    public final Flow activityResults;
    public final Lazy apiClient$delegate = LazyKt.lazy(new RealGooglePayer$$ExternalSyntheticLambda0(this, 0));

    /* loaded from: classes.dex */
    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId;
        public final InstanceFactory activity;
        public final InstanceFactory activityResults;

        public /* synthetic */ MetroFactory(InstanceFactory instanceFactory, InstanceFactory instanceFactory2, int i) {
            this.$r8$classId = i;
            this.activity = instanceFactory;
            this.activityResults = instanceFactory2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            int i2 = 1;
            InstanceFactory instanceFactory = this.activityResults;
            InstanceFactory instanceFactory2 = this.activity;
            switch (i) {
                case 0:
                    Activity activity = (Activity) instanceFactory2.value;
                    Flow flow = (Flow) instanceFactory.value;
                    activity.getClass();
                    flow.getClass();
                    return new RealGooglePayer(activity, flow);
                case 1:
                    Integer num = 1;
                    int intValue = num.intValue();
                    Flow flow2 = (Flow) instanceFactory2.value;
                    Activity activity2 = (Activity) instanceFactory.value;
                    flow2.getClass();
                    activity2.getClass();
                    return new MetadataRepo(intValue, "DWXJ7J9B91YMR", flow2, activity2);
                case 2:
                    SponsorshipRequestReferralIntroPresenter$Factory$Impl sponsorshipRequestReferralIntroPresenter$Factory$Impl = (SponsorshipRequestReferralIntroPresenter$Factory$Impl) instanceFactory2.value;
                    AlternativeNewSponsorAliasPresenter$Factory$Impl alternativeNewSponsorAliasPresenter$Factory$Impl = (AlternativeNewSponsorAliasPresenter$Factory$Impl) instanceFactory.value;
                    sponsorshipRequestReferralIntroPresenter$Factory$Impl.getClass();
                    alternativeNewSponsorAliasPresenter$Factory$Impl.getClass();
                    return new MoneyPresenterFactory(i2, sponsorshipRequestReferralIntroPresenter$Factory$Impl, alternativeNewSponsorAliasPresenter$Factory$Impl);
                case 3:
                    ScenarioPlanLoadingPresenter$Factory$Impl scenarioPlanLoadingPresenter$Factory$Impl = (ScenarioPlanLoadingPresenter$Factory$Impl) instanceFactory2.value;
                    ScenarioPlanErrorPresenter$Factory$Impl scenarioPlanErrorPresenter$Factory$Impl = (ScenarioPlanErrorPresenter$Factory$Impl) instanceFactory.value;
                    scenarioPlanLoadingPresenter$Factory$Impl.getClass();
                    scenarioPlanErrorPresenter$Factory$Impl.getClass();
                    return new MoneyPresenterFactory(2, scenarioPlanLoadingPresenter$Factory$Impl, scenarioPlanErrorPresenter$Factory$Impl);
                case 4:
                    ActivityAppletTilePresenter$Factory$Impl activityAppletTilePresenter$Factory$Impl = (ActivityAppletTilePresenter$Factory$Impl) instanceFactory2.value;
                    LifecycleOwner lifecycleOwner = (LifecycleOwner) instanceFactory.value;
                    activityAppletTilePresenter$Factory$Impl.getClass();
                    lifecycleOwner.getClass();
                    return KycAppletTileKt.activityApplet(activityAppletTilePresenter$Factory$Impl, lifecycleOwner);
                case 5:
                    KycAppletTilePresenter$Factory$Impl kycAppletTilePresenter$Factory$Impl = (KycAppletTilePresenter$Factory$Impl) instanceFactory2.value;
                    LifecycleOwner lifecycleOwner2 = (LifecycleOwner) instanceFactory.value;
                    kycAppletTilePresenter$Factory$Impl.getClass();
                    lifecycleOwner2.getClass();
                    return KycAppletTileKt.liteKycApplet(kycAppletTilePresenter$Factory$Impl, lifecycleOwner2);
                case 6:
                    GrantPresenter$Factory$Impl grantPresenter$Factory$Impl = (GrantPresenter$Factory$Impl) instanceFactory2.value;
                    StatusInterstitialPresenter$Factory$Impl statusInterstitialPresenter$Factory$Impl = (StatusInterstitialPresenter$Factory$Impl) instanceFactory.value;
                    grantPresenter$Factory$Impl.getClass();
                    statusInterstitialPresenter$Factory$Impl.getClass();
                    return new CashAppPayPresenterFactory(grantPresenter$Factory$Impl, statusInterstitialPresenter$Factory$Impl);
                case 7:
                    FidesmoProvisioningPresenter$Factory$Impl fidesmoProvisioningPresenter$Factory$Impl = (FidesmoProvisioningPresenter$Factory$Impl) instanceFactory2.value;
                    FidesmoDeprovisioningPresenter$Factory$Impl fidesmoDeprovisioningPresenter$Factory$Impl = (FidesmoDeprovisioningPresenter$Factory$Impl) instanceFactory.value;
                    fidesmoProvisioningPresenter$Factory$Impl.getClass();
                    fidesmoDeprovisioningPresenter$Factory$Impl.getClass();
                    return new MoneyPresenterFactory(4, fidesmoProvisioningPresenter$Factory$Impl, fidesmoDeprovisioningPresenter$Factory$Impl);
                case 8:
                    GrowToolsManagerPresenter$Factory$Impl growToolsManagerPresenter$Factory$Impl = (GrowToolsManagerPresenter$Factory$Impl) instanceFactory2.value;
                    GrowToolsCompleteActivityPresenter$Factory$Impl growToolsCompleteActivityPresenter$Factory$Impl = (GrowToolsCompleteActivityPresenter$Factory$Impl) instanceFactory.value;
                    growToolsManagerPresenter$Factory$Impl.getClass();
                    growToolsCompleteActivityPresenter$Factory$Impl.getClass();
                    return new MoneyPresenterFactory(5, growToolsManagerPresenter$Factory$Impl, growToolsCompleteActivityPresenter$Factory$Impl);
                case 9:
                    MoneyTabPresenter$Factory$Impl moneyTabPresenter$Factory$Impl = (MoneyTabPresenter$Factory$Impl) instanceFactory2.value;
                    HypeWelcomePresenter$Factory$Impl hypeWelcomePresenter$Factory$Impl = (HypeWelcomePresenter$Factory$Impl) instanceFactory.value;
                    moneyTabPresenter$Factory$Impl.getClass();
                    hypeWelcomePresenter$Factory$Impl.getClass();
                    return new MoneyPresenterFactory(0, moneyTabPresenter$Factory$Impl, hypeWelcomePresenter$Factory$Impl);
                case 10:
                    PrepurchaseCashCardPlanningPresenter$Factory$Impl prepurchaseCashCardPlanningPresenter$Factory$Impl = (PrepurchaseCashCardPlanningPresenter$Factory$Impl) instanceFactory2.value;
                    PrepurchaseCashCardFAQPresenter$Factory$Impl prepurchaseCashCardFAQPresenter$Factory$Impl = (PrepurchaseCashCardFAQPresenter$Factory$Impl) instanceFactory.value;
                    prepurchaseCashCardPlanningPresenter$Factory$Impl.getClass();
                    prepurchaseCashCardFAQPresenter$Factory$Impl.getClass();
                    return new MoneyPresenterFactory(7, prepurchaseCashCardPlanningPresenter$Factory$Impl, prepurchaseCashCardFAQPresenter$Factory$Impl);
                case 11:
                    PaymentPlanDataBlockerPresenter$Factory$Impl paymentPlanDataBlockerPresenter$Factory$Impl = (PaymentPlanDataBlockerPresenter$Factory$Impl) instanceFactory2.value;
                    SelectPaymentPlanBlockerPresenter$Factory$Impl selectPaymentPlanBlockerPresenter$Factory$Impl = (SelectPaymentPlanBlockerPresenter$Factory$Impl) instanceFactory.value;
                    paymentPlanDataBlockerPresenter$Factory$Impl.getClass();
                    selectPaymentPlanBlockerPresenter$Factory$Impl.getClass();
                    return new MoneyPresenterFactory(8, paymentPlanDataBlockerPresenter$Factory$Impl, selectPaymentPlanBlockerPresenter$Factory$Impl);
                case 12:
                    AutofillPresenter$Factory$Impl autofillPresenter$Factory$Impl = (AutofillPresenter$Factory$Impl) instanceFactory2.value;
                    EditAutofillPresenter$Factory$Impl editAutofillPresenter$Factory$Impl = (EditAutofillPresenter$Factory$Impl) instanceFactory.value;
                    autofillPresenter$Factory$Impl.getClass();
                    editAutofillPresenter$Factory$Impl.getClass();
                    return new MoneyPresenterFactory(10, autofillPresenter$Factory$Impl, editAutofillPresenter$Factory$Impl);
                case 13:
                    RealTransactionLoader$Factory$Impl realTransactionLoader$Factory$Impl = (RealTransactionLoader$Factory$Impl) instanceFactory2.value;
                    CoroutineScope coroutineScope = (CoroutineScope) instanceFactory.value;
                    realTransactionLoader$Factory$Impl.getClass();
                    coroutineScope.getClass();
                    return PlayerSurfaceKt.provideTransactionLoader(realTransactionLoader$Factory$Impl, coroutineScope);
                default:
                    RealInitialScreenLoader$Factory$Impl realInitialScreenLoader$Factory$Impl = (RealInitialScreenLoader$Factory$Impl) instanceFactory2.value;
                    Navigator navigator = (Navigator) instanceFactory.value;
                    realInitialScreenLoader$Factory$Impl.getClass();
                    navigator.getClass();
                    return new PrimitiveRegistry$$ExternalSyntheticLambda0(3, realInitialScreenLoader$Factory$Impl, navigator);
            }
        }
    }

    public RealGooglePayer(Activity activity, Flow flow) {
        this.activity = activity;
        this.activityResults = flow;
    }

    public final Object getActiveWalletId(FormCashtag.AnonymousClass8.AnonymousClass2 anonymousClass2) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(anonymousClass2));
        cancellableContinuationImpl.initCancellability();
        zzag apiClient = getApiClient();
        apiClient.getClass();
        zacn builder = zacn.builder();
        builder.zaa = new zzb(apiClient);
        builder.zac = 2103;
        apiClient.zae(0, builder.build()).addOnCompleteListener(new RxAwaitKt$await$5$1(cancellableContinuationImpl, 3));
        Object result = cancellableContinuationImpl.getResult();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return result;
    }

    public final zzag getApiClient() {
        Object value = this.apiClient$delegate.getValue();
        value.getClass();
        return (zzag) value;
    }
}
