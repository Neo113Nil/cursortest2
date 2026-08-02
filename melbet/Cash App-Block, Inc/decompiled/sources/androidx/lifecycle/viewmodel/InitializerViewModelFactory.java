package androidx.lifecycle.viewmodel;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider$Factory;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.maps.zzai;
import com.google.android.gms.wallet.PaymentsClient;
import com.google.android.instantapps.InstantApps;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.phoneplans.backend.RealEsimChecker$$ExternalSyntheticLambda0;
import com.squareup.scannerview.TextSetter;
import com.stripe.android.DefaultCardBrandFilter;
import com.stripe.android.DefaultCardFundingFilter;
import com.stripe.android.GooglePayJsonFactory;
import com.stripe.android.GooglePayJsonFactory_Factory;
import com.stripe.android.core.Logger$Companion;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.core.networking.JsonUtilsKt;
import com.stripe.android.core.utils.CreationExtrasKtxKt;
import com.stripe.android.core.utils.DurationProvider;
import com.stripe.android.googlepaylauncher.DefaultGooglePayRepository;
import com.stripe.android.googlepaylauncher.DefaultPaymentsClientFactory_Factory;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher$Config;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContractV2;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherViewModel;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.ConfirmSetupIntentParams;
import com.stripe.android.model.ConfirmStripeIntentParams;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.Stripe3ds2Fingerprint;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory_Factory;
import com.stripe.android.networking.RequestSurface;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.networking.StripeApiRepository_Factory;
import com.stripe.android.payments.DefaultReturnUrl;
import com.stripe.android.payments.PaymentIntentFlowResultProcessor_Factory;
import com.stripe.android.payments.SetupIntentFlowResultProcessor_Factory;
import com.stripe.android.payments.bankaccount.domain.AttachFinancialConnectionsSession;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import com.stripe.android.payments.bankaccount.ui.CollectBankAccountActivity$$ExternalSyntheticLambda0;
import com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel;
import com.stripe.android.payments.core.authentication.DefaultPaymentNextActionHandlerRegistry;
import com.stripe.android.payments.core.authentication.threeds2.DefaultStripe3ds2ChallengeResultProcessor;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity$$ExternalSyntheticLambda0;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModel;
import com.stripe.android.payments.core.injection.Stripe3DSNextActionHandlerModule_Companion_ProvidePaymentAuthConfigFactory$InstanceHolder;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherConfirmationActivity$$ExternalSyntheticLambda1;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherContract;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel;
import com.stripe.android.stripe3ds2.init.ui.StripeUiCustomization;
import com.stripe.android.stripe3ds2.observability.DefaultErrorReporter;
import com.stripe.android.stripe3ds2.observability.Stripe3ds2ErrorReporterConfig;
import com.stripe.android.stripe3ds2.security.DefaultMessageTransformer;
import com.stripe.android.stripe3ds2.service.StripeThreeDs2ServiceImpl;
import com.stripe.android.stripe3ds2.transaction.DefaultJwsValidator;
import com.stripe.android.stripe3ds2.transaction.Logger;
import com.stripe.android.stripe3ds2.transaction.MessageVersionRegistry;
import com.stripe.android.stripe3ds2.transaction.SdkTransactionId;
import com.stripe.android.stripe3ds2.views.ImageRepository$ImageSupplier$Default;
import com.stripe.android.uicore.utils.StateFlowsKt$$ExternalSyntheticLambda2;
import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.camera.CameraModule_CameraStatsManagerFactory;
import com.withpersona.sdk2.camera.CameraPreview_Factory;
import com.withpersona.sdk2.camera.SelfieDirectionFeed_Factory;
import com.withpersona.sdk2.inquiry.device.DeviceModule_AppSetIdHelperFactory;
import com.withpersona.sdk2.inquiry.featureflag.FeatureFlagManager_Factory;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.renderers.GovIdCaptureRenderer_Factory;
import com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper_Factory;
import com.withpersona.sdk2.inquiry.sandbox.SandboxFlags_Factory;
import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.InstanceFactory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import io.noties.markwon.LinkResolverDef;
import java.io.ByteArrayInputStream;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.Charsets;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.android.HandlerContext;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import net.idrnd.face.iad.capture.Plane;
import net.idrnd.face.iad.capture.internal.o0;
import net.idrnd.face.iad.capture.internal.y0;
import net.idrnd.misnap.iad.Payload;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class InitializerViewModelFactory implements ViewModelProvider$Factory {
    public final /* synthetic */ int $r8$classId;
    public final Object initializers;

    public InitializerViewModelFactory(GooglePayPaymentMethodLauncherContractV2.Args args) {
        this.$r8$classId = 1;
        args.getClass();
        this.initializers = args;
    }

    @Override // androidx.lifecycle.ViewModelProvider$Factory
    public final ViewModel create(Class cls, CreationExtras creationExtras) {
        ViewModelInitializer viewModelInitializer;
        Function1 function1;
        boolean z;
        int i = this.$r8$classId;
        int i2 = 3;
        Object obj = this.initializers;
        int i3 = 10;
        final int i4 = 0;
        final int i5 = 1;
        switch (i) {
            case 0:
                creationExtras.getClass();
                KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(cls);
                ViewModelInitializer[] viewModelInitializerArr = (ViewModelInitializer[]) obj;
                ViewModelInitializer[] viewModelInitializerArr2 = (ViewModelInitializer[]) Arrays.copyOf(viewModelInitializerArr, viewModelInitializerArr.length);
                int length = viewModelInitializerArr2.length;
                while (true) {
                    if (i4 < length) {
                        viewModelInitializer = viewModelInitializerArr2[i4];
                        if (!Intrinsics.areEqual(viewModelInitializer.clazz, orCreateKotlinClass)) {
                            i4++;
                        }
                    } else {
                        viewModelInitializer = null;
                    }
                }
                ViewModel viewModel = (viewModelInitializer == null || (function1 = viewModelInitializer.initializer) == null) ? null : (ViewModel) function1.invoke(creationExtras);
                if (viewModel != null) {
                    return viewModel;
                }
                Path$$ExternalSyntheticBUOutline0.m$3(orCreateKotlinClass.getQualifiedName(), "No initializer set for given class ");
                return null;
            case 1:
                creationExtras.getClass();
                Application requireApplication = CreationExtrasKtxKt.requireApplication(creationExtras);
                SavedStateHandle createSavedStateHandle = SavedStateHandleSupport.createSavedStateHandle(creationExtras);
                StateFlowsKt$$ExternalSyntheticLambda2 stateFlowsKt$$ExternalSyntheticLambda2 = new StateFlowsKt$$ExternalSyntheticLambda2(3, this, requireApplication);
                RealEsimChecker$$ExternalSyntheticLambda0 realEsimChecker$$ExternalSyntheticLambda0 = new RealEsimChecker$$ExternalSyntheticLambda0(requireApplication, 1);
                Set of = SetsKt__SetsJVMKt.setOf("GooglePayPaymentMethodLauncher");
                GooglePayPaymentMethodLauncherContractV2.Args args = (GooglePayPaymentMethodLauncherContractV2.Args) obj;
                GooglePayPaymentMethodLauncher$Config googlePayPaymentMethodLauncher$Config = args.config;
                DefaultCardBrandFilter defaultCardBrandFilter = args.cardBrandFilter;
                DefaultCardFundingFilter defaultCardFundingFilter = args.cardFundingFilter;
                of.getClass();
                googlePayPaymentMethodLauncher$Config.getClass();
                defaultCardBrandFilter.getClass();
                defaultCardFundingFilter.getClass();
                int i6 = 10;
                LinkResolverDef linkResolverDef = new LinkResolverDef(i6);
                Plane plane = new Plane(i6);
                Boolean bool = Boolean.FALSE;
                InstanceFactory create = InstanceFactory.create(googlePayPaymentMethodLauncher$Config);
                InstanceFactory create2 = InstanceFactory.create(requireApplication);
                Provider provider = DoubleCheck.provider(new SelfieDirectionFeed_Factory(create, DoubleCheck.provider(new DefaultPaymentsClientFactory_Factory(create2, 0)), 21));
                InstanceFactory create3 = InstanceFactory.create(stateFlowsKt$$ExternalSyntheticLambda2);
                InstanceFactory create4 = InstanceFactory.create(realEsimChecker$$ExternalSyntheticLambda0);
                InstanceFactory create5 = InstanceFactory.create(defaultCardBrandFilter);
                InstanceFactory create6 = InstanceFactory.create(defaultCardFundingFilter);
                Provider provider2 = DoubleCheck.provider(new GooglePayJsonFactory_Factory(create3, create4, create, create5, create6));
                int i7 = 1;
                DeviceModule_AppSetIdHelperFactory deviceModule_AppSetIdHelperFactory = new DeviceModule_AppSetIdHelperFactory(plane, InstanceFactory.create(bool), i7);
                return new GooglePayPaymentMethodLauncherViewModel((PaymentsClient) provider.get(), new ApiRequest.Options(stateFlowsKt$$ExternalSyntheticLambda2, realEsimChecker$$ExternalSyntheticLambda0), args, new StripeApiRepository(requireApplication, stateFlowsKt$$ExternalSyntheticLambda2, RequestSurface.PaymentElement, CameraPreview_Factory.provideWorkContext(linkResolverDef), of, new PaymentAnalyticsRequestFactory(requireApplication, stateFlowsKt$$ExternalSyntheticLambda2, of), new DefaultAnalyticsRequestExecutor(DeviceModule_AppSetIdHelperFactory.provideLogger(plane, false), CameraPreview_Factory.provideWorkContext(linkResolverDef)), DeviceModule_AppSetIdHelperFactory.provideLogger(plane, false)), (GooglePayJsonFactory) provider2.get(), (DefaultGooglePayRepository) DoubleCheck.provider(new InquiryApiHelper_Factory(create2, create, deviceModule_AppSetIdHelperFactory, DoubleCheck.provider(new SelfieDirectionFeed_Factory(new SelfieDirectionFeed_Factory(deviceModule_AppSetIdHelperFactory, new CameraPreview_Factory(linkResolverDef, i7), 3), DoubleCheck.provider(new PaymentAnalyticsRequestFactory_Factory(create2, create3, InstanceFactory.create(of), 0)), 22)), create5, create6, 1)).get(), createSavedStateHandle);
            case 2:
                creationExtras.getClass();
                Application requireApplication2 = CreationExtrasKtxKt.requireApplication(creationExtras);
                SavedStateHandle createSavedStateHandle2 = SavedStateHandleSupport.createSavedStateHandle(creationExtras);
                SharedFlowImpl MutableSharedFlow$default = FlowKt.MutableSharedFlow$default(0, 0, null, 7);
                CollectBankAccountContract.Args args2 = (CollectBankAccountContract.Args) ((CollectBankAccountActivity$$ExternalSyntheticLambda0) obj).invoke();
                int i8 = 10;
                TextSetter textSetter = new TextSetter(new LinkResolverDef(i8), new y0(), new Plane(i8), requireApplication2, MutableSharedFlow$default, createSavedStateHandle2, args2);
                return new CollectBankAccountViewModel(args2, MutableSharedFlow$default, new o0(textSetter.stripeApiRepository(), 8), new AttachFinancialConnectionsSession(textSetter.stripeApiRepository()), new Payload(textSetter.stripeApiRepository(), 6), createSavedStateHandle2, Logger$Companion.NOOP_LOGGER);
            case 3:
                creationExtras.getClass();
                Stripe3ds2TransactionContract.Args args3 = (Stripe3ds2TransactionContract.Args) ((Stripe3ds2TransactionActivity$$ExternalSyntheticLambda0) obj).invoke();
                Application requireApplication3 = CreationExtrasKtxKt.requireApplication(creationExtras);
                SavedStateHandle createSavedStateHandle3 = SavedStateHandleSupport.createSavedStateHandle(creationExtras);
                boolean z2 = args3.enableLogging;
                HCaptcha$$ExternalSyntheticLambda0 hCaptcha$$ExternalSyntheticLambda0 = new HCaptcha$$ExternalSyntheticLambda0(args3, 20);
                Set set = args3.productUsage;
                boolean isInstantApp = InstantApps.isInstantApp(requireApplication3);
                set.getClass();
                y0 y0Var = new y0();
                LinkResolverDef linkResolverDef2 = new LinkResolverDef(i3);
                Plane plane2 = new Plane(i3);
                Boolean valueOf = Boolean.valueOf(z2);
                InstanceFactory create7 = InstanceFactory.create(requireApplication3);
                InstanceFactory create8 = InstanceFactory.create(valueOf);
                CameraPreview_Factory cameraPreview_Factory = new CameraPreview_Factory(linkResolverDef2, 1);
                Provider provider3 = DoubleCheck.provider(new FeatureFlagManager_Factory(create7, create8, cameraPreview_Factory, 4));
                Provider provider4 = DoubleCheck.provider(Stripe3DSNextActionHandlerModule_Companion_ProvidePaymentAuthConfigFactory$InstanceHolder.INSTANCE$1);
                InstanceFactory create9 = InstanceFactory.create(hCaptcha$$ExternalSyntheticLambda0);
                SandboxFlags_Factory sandboxFlags_Factory = new SandboxFlags_Factory(y0Var, 5);
                InstanceFactory create10 = InstanceFactory.create(set);
                PaymentAnalyticsRequestFactory_Factory paymentAnalyticsRequestFactory_Factory = new PaymentAnalyticsRequestFactory_Factory(create7, create9, create10, 0);
                DeviceModule_AppSetIdHelperFactory deviceModule_AppSetIdHelperFactory2 = new DeviceModule_AppSetIdHelperFactory(plane2, create8, 1);
                SelfieDirectionFeed_Factory selfieDirectionFeed_Factory = new SelfieDirectionFeed_Factory(deviceModule_AppSetIdHelperFactory2, cameraPreview_Factory, 3);
                Provider provider5 = DoubleCheck.provider(new InquiryApiHelper_Factory(new StripeApiRepository_Factory(create7, create9, sandboxFlags_Factory, cameraPreview_Factory, create10, paymentAnalyticsRequestFactory_Factory, selfieDirectionFeed_Factory, deviceModule_AppSetIdHelperFactory2), selfieDirectionFeed_Factory, paymentAnalyticsRequestFactory_Factory, DoubleCheck.provider(JsonUtilsKt.INSTANCE), deviceModule_AppSetIdHelperFactory2, cameraPreview_Factory, 2));
                StripeApiRepository stripeApiRepository = new StripeApiRepository(requireApplication3, hCaptcha$$ExternalSyntheticLambda0, RequestSurface.PaymentElement, CameraPreview_Factory.provideWorkContext(linkResolverDef2), set, new PaymentAnalyticsRequestFactory(requireApplication3, hCaptcha$$ExternalSyntheticLambda0, set), new DefaultAnalyticsRequestExecutor(DeviceModule_AppSetIdHelperFactory.provideLogger(plane2, z2), CameraPreview_Factory.provideWorkContext(linkResolverDef2)), DeviceModule_AppSetIdHelperFactory.provideLogger(plane2, z2));
                DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor = new DefaultAnalyticsRequestExecutor(DeviceModule_AppSetIdHelperFactory.provideLogger(plane2, z2), CameraPreview_Factory.provideWorkContext(linkResolverDef2));
                PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory = new PaymentAnalyticsRequestFactory(requireApplication3, hCaptcha$$ExternalSyntheticLambda0, set);
                StripeThreeDs2ServiceImpl stripeThreeDs2ServiceImpl = (StripeThreeDs2ServiceImpl) provider3.get();
                MessageVersionRegistry messageVersionRegistry = (MessageVersionRegistry) provider4.get();
                DefaultStripe3ds2ChallengeResultProcessor defaultStripe3ds2ChallengeResultProcessor = (DefaultStripe3ds2ChallengeResultProcessor) provider5.get();
                CoroutineContext provideWorkContext = CameraPreview_Factory.provideWorkContext(linkResolverDef2);
                boolean isLiveMode = args3.stripeIntent.isLiveMode();
                SdkTransactionId sdkTransactionId = args3.sdkTransactionId;
                StripeUiCustomization stripeUiCustomization = args3.config.uiCustomization.uiCustomization;
                StripeIntent.NextActionData.SdkData.Use3DS2 use3DS2 = args3.nextActionData;
                use3DS2.getClass();
                String str = use3DS2.source;
                String str2 = use3DS2.serverName;
                String str3 = use3DS2.transactionId;
                StripeIntent.NextActionData.SdkData.Use3DS2.DirectoryServerEncryption directoryServerEncryption = use3DS2.serverEncryption;
                String str4 = directoryServerEncryption.directoryServerId;
                String str5 = directoryServerEncryption.dsCertificateData;
                List list = directoryServerEncryption.rootCertsData;
                String str6 = directoryServerEncryption.keyId;
                str4.getClass();
                str5.getClass();
                list.getClass();
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                byte[] bytes = str5.getBytes(Charsets.UTF_8);
                bytes.getClass();
                Certificate generateCertificate = certificateFactory.generateCertificate(new ByteArrayInputStream(bytes));
                generateCertificate.getClass();
                PublicKey publicKey = ((X509Certificate) generateCertificate).getPublicKey();
                publicKey.getClass();
                List list2 = list;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    String str7 = (String) it.next();
                    Iterator it2 = it;
                    CertificateFactory certificateFactory2 = CertificateFactory.getInstance("X.509");
                    byte[] bytes2 = str7.getBytes(Charsets.UTF_8);
                    bytes2.getClass();
                    Certificate generateCertificate2 = certificateFactory2.generateCertificate(new ByteArrayInputStream(bytes2));
                    generateCertificate2.getClass();
                    arrayList.add((X509Certificate) generateCertificate2);
                    it = it2;
                    requireApplication3 = requireApplication3;
                    paymentAnalyticsRequestFactory = paymentAnalyticsRequestFactory;
                }
                PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory2 = paymentAnalyticsRequestFactory;
                Application application = requireApplication3;
                Stripe3ds2Fingerprint.DirectoryServerEncryption directoryServerEncryption2 = new Stripe3ds2Fingerprint.DirectoryServerEncryption(str4, publicKey, arrayList, str6);
                re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
                sdkTransactionId.getClass();
                stripeUiCustomization.getClass();
                Logger.Noop noop = z2 ? Logger.Noop.INSTANCE$1 : Logger.Noop.INSTANCE;
                DefaultErrorReporter defaultErrorReporter = new DefaultErrorReporter(application, new Stripe3ds2ErrorReporterConfig(sdkTransactionId), provideWorkContext, noop, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
                DefaultJwsValidator defaultJwsValidator = new DefaultJwsValidator(isLiveMode, directoryServerEncryption2.rootCerts, defaultErrorReporter);
                DefaultMessageTransformer defaultMessageTransformer = new DefaultMessageTransformer(isLiveMode);
                o0 o0Var = new o0(defaultErrorReporter, 9);
                ImageRepository$ImageSupplier$Default imageRepository$ImageSupplier$Default = new ImageRepository$ImageSupplier$Default(defaultErrorReporter, provideWorkContext, 1);
                Payload payload = new Payload(provideWorkContext, 7);
                sdkTransactionId.getClass();
                stripeUiCustomization.getClass();
                zzai zzaiVar = new zzai();
                zzaiVar.zaa = sdkTransactionId;
                zzaiVar.zab = defaultJwsValidator;
                zzaiVar.zac = defaultMessageTransformer;
                zzaiVar.zad = o0Var;
                zzaiVar.zza = imageRepository$ImageSupplier$Default;
                zzaiVar.zzb = payload;
                zzaiVar.zzc = stripeUiCustomization;
                zzaiVar.zzd = defaultErrorReporter;
                zzaiVar.zze = noop;
                return new Stripe3ds2TransactionViewModel(application, args3, stripeApiRepository, defaultAnalyticsRequestExecutor, paymentAnalyticsRequestFactory2, stripeThreeDs2ServiceImpl, messageVersionRegistry, defaultStripe3ds2ChallengeResultProcessor, zzaiVar, CameraPreview_Factory.provideWorkContext(linkResolverDef2), createSavedStateHandle3, isInstantApp);
            default:
                creationExtras.getClass();
                final PaymentLauncherContract.Args args4 = (PaymentLauncherContract.Args) ((PaymentLauncherConfirmationActivity$$ExternalSyntheticLambda1) obj).invoke();
                Application requireApplication4 = CreationExtrasKtxKt.requireApplication(creationExtras);
                SavedStateHandle createSavedStateHandle4 = SavedStateHandleSupport.createSavedStateHandle(creationExtras);
                boolean enableLogging = args4.getEnableLogging();
                Function0 function0 = new Function0() { // from class: com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel$Factory$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i9 = i4;
                        PaymentLauncherContract.Args args5 = args4;
                        switch (i9) {
                            case 0:
                                return args5.getPublishableKey();
                            default:
                                return args5.getStripeAccountId();
                        }
                    }
                };
                Function0 function02 = new Function0() { // from class: com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel$Factory$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i9 = i5;
                        PaymentLauncherContract.Args args5 = args4;
                        switch (i9) {
                            case 0:
                                return args5.getPublishableKey();
                            default:
                                return args5.getStripeAccountId();
                        }
                    }
                };
                Set productUsage = args4.getProductUsage();
                boolean includePaymentSheetNextHandlers = args4.getIncludePaymentSheetNextHandlers();
                productUsage.getClass();
                Plane plane3 = new Plane(16);
                y0 y0Var2 = new y0();
                LinkResolverDef linkResolverDef3 = new LinkResolverDef(i3);
                Plane plane4 = new Plane(i3);
                Boolean valueOf2 = Boolean.valueOf(enableLogging);
                Boolean valueOf3 = Boolean.valueOf(includePaymentSheetNextHandlers);
                InstanceFactory create11 = InstanceFactory.create(requireApplication4);
                InstanceFactory create12 = InstanceFactory.create(valueOf2);
                CameraPreview_Factory cameraPreview_Factory2 = new CameraPreview_Factory(linkResolverDef3, i5);
                SandboxFlags_Factory sandboxFlags_Factory2 = new SandboxFlags_Factory(linkResolverDef3, i2);
                InstanceFactory create13 = InstanceFactory.create(function0);
                InstanceFactory create14 = InstanceFactory.create(productUsage);
                PaymentAnalyticsRequestFactory_Factory paymentAnalyticsRequestFactory_Factory2 = new PaymentAnalyticsRequestFactory_Factory(create11, create13, create14, i4);
                Provider provider6 = DoubleCheck.provider(new GovIdCaptureRenderer_Factory(plane3, create11, create12, cameraPreview_Factory2, sandboxFlags_Factory2, paymentAnalyticsRequestFactory_Factory2, create13, create14, new CameraModule_CameraStatsManagerFactory(plane3, create11, 28), InstanceFactory.create(valueOf3)));
                Provider provider7 = DoubleCheck.provider(new CameraModule_CameraStatsManagerFactory(plane3, create11, 27));
                InstanceFactory create15 = InstanceFactory.create(function02);
                SandboxFlags_Factory sandboxFlags_Factory3 = new SandboxFlags_Factory(y0Var2, 5);
                DeviceModule_AppSetIdHelperFactory deviceModule_AppSetIdHelperFactory3 = new DeviceModule_AppSetIdHelperFactory(plane4, create12, 1);
                StripeApiRepository_Factory stripeApiRepository_Factory = new StripeApiRepository_Factory(create11, create13, sandboxFlags_Factory3, cameraPreview_Factory2, create14, paymentAnalyticsRequestFactory_Factory2, new SelfieDirectionFeed_Factory(deviceModule_AppSetIdHelperFactory3, cameraPreview_Factory2, 3), deviceModule_AppSetIdHelperFactory3);
                Provider provider8 = DoubleCheck.provider(new PaymentIntentFlowResultProcessor_Factory(create11, create13, stripeApiRepository_Factory, deviceModule_AppSetIdHelperFactory3, cameraPreview_Factory2));
                Provider provider9 = DoubleCheck.provider(new SetupIntentFlowResultProcessor_Factory(create11, create13, stripeApiRepository_Factory, deviceModule_AppSetIdHelperFactory3, cameraPreview_Factory2, 0));
                Provider provider10 = DoubleCheck.provider(new SandboxFlags_Factory(plane3, 6));
                if (args4 instanceof PaymentLauncherContract.Args.IntentConfirmationArgs) {
                    ConfirmStripeIntentParams confirmStripeIntentParams = ((PaymentLauncherContract.Args.IntentConfirmationArgs) args4).confirmStripeIntentParams;
                    if (!(confirmStripeIntentParams instanceof ConfirmPaymentIntentParams)) {
                        if (!(confirmStripeIntentParams instanceof ConfirmSetupIntentParams)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        z = false;
                    }
                    z = true;
                } else {
                    if (!(args4 instanceof PaymentLauncherContract.Args.HashedPaymentIntentNextActionArgs) && !(args4 instanceof PaymentLauncherContract.Args.PaymentIntentNextActionArgs)) {
                        if (!(args4 instanceof PaymentLauncherContract.Args.SetupIntentNextActionArgs)) {
                            if (!(args4 instanceof PaymentLauncherContract.Args.StripeIntentNextActionWithIntentArgs)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            z = ((PaymentLauncherContract.Args.StripeIntentNextActionWithIntentArgs) args4).stripeIntent instanceof PaymentIntent;
                        }
                        z = false;
                    }
                    z = true;
                }
                SelfieDirectionFeed_Factory selfieDirectionFeed_Factory2 = new SelfieDirectionFeed_Factory(create13, create15, 2);
                StripeApiRepository stripeApiRepository2 = new StripeApiRepository(requireApplication4, function0, RequestSurface.PaymentElement, CameraPreview_Factory.provideWorkContext(linkResolverDef3), productUsage, new PaymentAnalyticsRequestFactory(requireApplication4, function0, productUsage), new DefaultAnalyticsRequestExecutor(DeviceModule_AppSetIdHelperFactory.provideLogger(plane4, enableLogging), CameraPreview_Factory.provideWorkContext(linkResolverDef3)), DeviceModule_AppSetIdHelperFactory.provideLogger(plane4, enableLogging));
                DefaultPaymentNextActionHandlerRegistry defaultPaymentNextActionHandlerRegistry = (DefaultPaymentNextActionHandlerRegistry) provider6.get();
                DefaultReturnUrl defaultReturnUrl = (DefaultReturnUrl) provider7.get();
                Lazy lazy = DoubleCheck.lazy(provider8);
                Lazy lazy2 = DoubleCheck.lazy(provider9);
                DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor2 = new DefaultAnalyticsRequestExecutor(DeviceModule_AppSetIdHelperFactory.provideLogger(plane4, enableLogging), CameraPreview_Factory.provideWorkContext(linkResolverDef3));
                PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory3 = new PaymentAnalyticsRequestFactory(requireApplication4, function0, productUsage);
                DefaultScheduler defaultScheduler = Dispatchers.Default;
                HandlerContext handlerContext = MainDispatcherLoader.dispatcher;
                Preconditions.checkNotNullFromProvides(handlerContext);
                return new PaymentLauncherViewModel(z, stripeApiRepository2, defaultPaymentNextActionHandlerRegistry, defaultReturnUrl, selfieDirectionFeed_Factory2, lazy, lazy2, defaultAnalyticsRequestExecutor2, paymentAnalyticsRequestFactory3, handlerContext, createSavedStateHandle4, InstantApps.isInstantApp(requireApplication4), (DurationProvider) provider10.get());
        }
    }

    public /* synthetic */ InitializerViewModelFactory(Object obj, int i) {
        this.$r8$classId = i;
        this.initializers = obj;
    }
}
