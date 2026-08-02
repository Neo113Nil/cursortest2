package com.google.android.gms.internal.mlkit_genai_prompt;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import coil3.RealImageLoader;
import com.google.mlkit.vision.common.zzb;
import com.squareup.cash.checks.VerifyCheckDepositKt$$ExternalSyntheticLambda14;
import com.squareup.cash.core.views.ArcadeBottomNavigationKt$$ExternalSyntheticLambda3;
import com.squareup.cash.earnings.views.home.EarningsHomeKt$$ExternalSyntheticLambda2;
import com.squareup.cash.family.applets.data.RealAllowanceAppletTileRepository;
import com.squareup.cash.family.applets.data.RealApprovedContactsAppletTileRepository;
import com.squareup.cash.family.applets.data.RealFamilyAppletTileRepository;
import com.squareup.cash.family.applets.presenters.AllowanceAppletTilePresenter$Factory$Impl;
import com.squareup.cash.family.applets.presenters.ApprovedContactsAppletTilePresenter$Factory$Impl;
import com.squareup.cash.family.applets.presenters.DependentActivityAppletTilePresenter$Factory$Impl;
import com.squareup.cash.family.applets.presenters.FamilyAppletTilePresenter$Factory$Impl;
import com.squareup.cash.money.applets.viewmodels.Applet;
import com.squareup.cash.money.core.ids.AppletId;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.util.coroutines.DerivedStateFlow;
import com.stripe.android.financialconnections.domain.LookupAccount_Factory;
import com.stripe.android.googlepaylauncher.DefaultPaymentsClientFactory_Factory;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory_Factory;
import com.stripe.android.payments.core.authentication.DefaultPaymentNextActionHandlerRegistry;
import com.stripe.android.payments.core.injection.Stripe3DSNextActionHandlerModule_Companion_ProvidePaymentAuthConfigFactory$InstanceHolder;
import com.withpersona.sdk2.camera.CameraModule_CameraStatsManagerFactory;
import com.withpersona.sdk2.camera.CameraPreview_Factory;
import com.withpersona.sdk2.camera.SelfieDirectionFeed_Factory;
import com.withpersona.sdk2.inquiry.device.DeviceModule_AppSetIdHelperFactory;
import com.withpersona.sdk2.inquiry.featureflag.FeatureFlagManager_Factory;
import com.withpersona.sdk2.inquiry.governmentid.capture.CaptureRenderer_Factory;
import dagger.internal.DelegateFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.InstanceFactory;
import dagger.internal.MapFactory;
import dagger.internal.Provider;
import dagger.internal.SetBuilder;
import io.noties.markwon.LinkResolverDef;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import net.idrnd.face.iad.capture.Plane;

/* loaded from: classes8.dex */
public abstract class zzjo {
    public static Applet approvedContactsApplet(RealApprovedContactsAppletTileRepository realApprovedContactsAppletTileRepository, ApprovedContactsAppletTilePresenter$Factory$Impl approvedContactsAppletTilePresenter$Factory$Impl, LifecycleOwner lifecycleOwner) {
        return new Applet(AppletId.APPROVED_CONTACTS, realApprovedContactsAppletTileRepository.availabilityState, new ArcadeBottomNavigationKt$$ExternalSyntheticLambda3(28, approvedContactsAppletTilePresenter$Factory$Impl, lifecycleOwner));
    }

    public static DefaultPaymentNextActionHandlerRegistry createInstance(Context context, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, boolean z, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, Function0 function0, Set set, boolean z2, boolean z3) {
        set.getClass();
        LinkResolverDef linkResolverDef = new LinkResolverDef(16);
        Plane plane = new Plane(10);
        Boolean valueOf = Boolean.valueOf(z);
        Boolean valueOf2 = Boolean.valueOf(z2);
        Boolean valueOf3 = Boolean.valueOf(z3);
        DelegateFactory delegateFactory = new DelegateFactory();
        Provider provider = DoubleCheck.provider(new CameraPreview_Factory(delegateFactory, 5));
        Provider provider2 = DoubleCheck.provider(new CameraModule_CameraStatsManagerFactory(provider, 25));
        CameraModule_CameraStatsManagerFactory cameraModule_CameraStatsManagerFactory = new CameraModule_CameraStatsManagerFactory(linkResolverDef, DoubleCheck.provider(new CameraModule_CameraStatsManagerFactory(provider, 26)), 29);
        InstanceFactory create = InstanceFactory.create(context);
        Provider provider3 = DoubleCheck.provider(new DefaultPaymentsClientFactory_Factory(create, 6));
        int i = 3;
        Provider provider4 = DoubleCheck.provider(new DeviceModule_AppSetIdHelperFactory(delegateFactory, provider3, i));
        InstanceFactory create2 = InstanceFactory.create(valueOf);
        int i2 = 1;
        DeviceModule_AppSetIdHelperFactory deviceModule_AppSetIdHelperFactory = new DeviceModule_AppSetIdHelperFactory(plane, create2, i2);
        InstanceFactory create3 = InstanceFactory.create(coroutineContext);
        SelfieDirectionFeed_Factory selfieDirectionFeed_Factory = new SelfieDirectionFeed_Factory(deviceModule_AppSetIdHelperFactory, create3, i);
        InstanceFactory create4 = InstanceFactory.create(paymentAnalyticsRequestFactory);
        InstanceFactory create5 = InstanceFactory.create(coroutineContext2);
        InstanceFactory create6 = InstanceFactory.create(function0);
        Provider provider5 = DoubleCheck.provider(new CaptureRenderer_Factory(provider4, selfieDirectionFeed_Factory, create4, create2, create5, create6, InstanceFactory.create(valueOf2), provider3, new DefaultPaymentsClientFactory_Factory(create3, 5)));
        Provider provider6 = DoubleCheck.provider(new PaymentAnalyticsRequestFactory_Factory(provider5, provider2, create, i2));
        InstanceFactory create7 = InstanceFactory.create(set);
        FeatureFlagManager_Factory featureFlagManager_Factory = new FeatureFlagManager_Factory(create6, create7, create5, i2);
        Provider provider7 = DoubleCheck.provider(new LookupAccount_Factory(DoubleCheck.provider(Stripe3DSNextActionHandlerModule_Companion_ProvidePaymentAuthConfigFactory$InstanceHolder.INSTANCE), create2, create6, create7, 5));
        int i3 = MapFactory.$r8$clinit;
        SetBuilder setBuilder = new SetBuilder(11);
        setBuilder.put$dagger$internal$AbstractMapFactory$Builder(StripeIntent.NextActionData.WeChatPayRedirect.class, cameraModule_CameraStatsManagerFactory);
        setBuilder.put$dagger$internal$AbstractMapFactory$Builder(StripeIntent.NextActionData.RedirectToUrl.class, provider5);
        setBuilder.put$dagger$internal$AbstractMapFactory$Builder(StripeIntent.NextActionData.AlipayRedirect.class, provider5);
        setBuilder.put$dagger$internal$AbstractMapFactory$Builder(StripeIntent.NextActionData.DisplayMultibancoDetails.class, provider6);
        setBuilder.put$dagger$internal$AbstractMapFactory$Builder(StripeIntent.NextActionData.DisplayOxxoDetails.class, provider6);
        setBuilder.put$dagger$internal$AbstractMapFactory$Builder(StripeIntent.NextActionData.DisplayKonbiniDetails.class, provider6);
        setBuilder.put$dagger$internal$AbstractMapFactory$Builder(StripeIntent.NextActionData.DisplayBoletoDetails.class, provider6);
        setBuilder.put$dagger$internal$AbstractMapFactory$Builder(StripeIntent.NextActionData.CashAppRedirect.class, provider5);
        setBuilder.put$dagger$internal$AbstractMapFactory$Builder(StripeIntent.NextActionData.SwishRedirect.class, provider5);
        setBuilder.put$dagger$internal$AbstractMapFactory$Builder(StripeIntent.NextActionData.SdkData.IntentConfirmationChallenge.class, featureFlagManager_Factory);
        setBuilder.put$dagger$internal$AbstractMapFactory$Builder(StripeIntent.NextActionData.SdkData.Use3DS2.class, provider7);
        DelegateFactory.setDelegate(delegateFactory, DoubleCheck.provider(new LookupAccount_Factory(provider2, new MapFactory((LinkedHashMap) setBuilder.contributions), InstanceFactory.create(valueOf3), create, 4)));
        return (DefaultPaymentNextActionHandlerRegistry) delegateFactory.get();
    }

    public static Applet dependentActivityApplet(zzb zzbVar, DependentActivityAppletTilePresenter$Factory$Impl dependentActivityAppletTilePresenter$Factory$Impl, LifecycleOwner lifecycleOwner, RealImageLoader realImageLoader, RealCashVibrator realCashVibrator) {
        return new Applet(AppletId.KIDS_ACTIVITY, (DerivedStateFlow) zzbVar.zza, new VerifyCheckDepositKt$$ExternalSyntheticLambda14(dependentActivityAppletTilePresenter$Factory$Impl, lifecycleOwner, realImageLoader, realCashVibrator, 29));
    }

    public static Applet familiesApplet(RealFamilyAppletTileRepository realFamilyAppletTileRepository, FamilyAppletTilePresenter$Factory$Impl familyAppletTilePresenter$Factory$Impl, LifecycleOwner lifecycleOwner, RealImageLoader realImageLoader) {
        return new Applet(AppletId.FAMILY, realFamilyAppletTileRepository.availabilityState, new EarningsHomeKt$$ExternalSyntheticLambda2(13, familyAppletTilePresenter$Factory$Impl, lifecycleOwner, realImageLoader));
    }

    public static Applet provideAllowanceApplet(RealAllowanceAppletTileRepository realAllowanceAppletTileRepository, AllowanceAppletTilePresenter$Factory$Impl allowanceAppletTilePresenter$Factory$Impl, LifecycleOwner lifecycleOwner) {
        return new Applet(AppletId.ALLOWANCE, realAllowanceAppletTileRepository.availabilityState, new ArcadeBottomNavigationKt$$ExternalSyntheticLambda3(27, allowanceAppletTilePresenter$Factory$Impl, lifecycleOwner));
    }

    public abstract int zza(zzjw zzjwVar);

    public abstract void zzb(zzjw zzjwVar, Set set);
}
