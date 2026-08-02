package com.yandex.passport.internal.di.component;

import android.app.Activity;
import android.content.Context;
import com.yandex.passport.data.network.a2;
import com.yandex.passport.data.network.cb;
import com.yandex.passport.data.network.d0;
import com.yandex.passport.data.network.e7;
import com.yandex.passport.data.network.h9;
import com.yandex.passport.data.network.k7;
import com.yandex.passport.data.network.n8;
import com.yandex.passport.data.network.o4;
import com.yandex.passport.data.network.q9;
import com.yandex.passport.data.network.qa;
import com.yandex.passport.data.network.r7;
import com.yandex.passport.data.network.r9;
import com.yandex.passport.data.network.s7;
import com.yandex.passport.data.network.t1;
import com.yandex.passport.data.network.t8;
import com.yandex.passport.data.network.u4;
import com.yandex.passport.data.network.w;
import com.yandex.passport.data.network.z0;
import com.yandex.passport.data.network.z3;
import com.yandex.passport.internal.analytics.n0;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.di.module.k;
import com.yandex.passport.internal.di.module.u;
import com.yandex.passport.internal.flags.i;
import com.yandex.passport.internal.methods.performer.e1;
import com.yandex.passport.internal.methods.performer.k0;
import com.yandex.passport.internal.methods.performer.p1;
import com.yandex.passport.internal.methods.performer.t0;
import com.yandex.passport.internal.properties.v;
import com.yandex.passport.internal.push.l0;
import com.yandex.passport.internal.push.m0;
import com.yandex.passport.internal.report.reporters.f1;
import com.yandex.passport.internal.report.reporters.g;
import com.yandex.passport.internal.report.reporters.h0;
import com.yandex.passport.internal.report.reporters.h1;
import com.yandex.passport.internal.report.reporters.i0;
import com.yandex.passport.internal.report.reporters.l1;
import com.yandex.passport.internal.report.reporters.o1;
import com.yandex.passport.internal.report.reporters.u0;
import com.yandex.passport.internal.report.reporters.z;
import com.yandex.passport.internal.report.xe;
import com.yandex.passport.internal.social.esia.w0;
import com.yandex.passport.internal.ui.authsdk.d;
import com.yandex.passport.internal.ui.authsdk.e;
import com.yandex.passport.internal.ui.authsdk.f;
import com.yandex.passport.internal.ui.authsdk.n;
import com.yandex.passport.internal.ui.bouncer.BouncerActivity;
import com.yandex.passport.internal.ui.bouncer.chooser.r;
import com.yandex.passport.internal.ui.bouncer.model.a1;
import com.yandex.passport.internal.ui.bouncer.model.y0;
import com.yandex.passport.internal.ui.bouncer.s;
import com.yandex.passport.internal.ui.bouncer.t;
import com.yandex.passport.internal.ui.challenge.c0;
import com.yandex.passport.internal.ui.challenge.delete.i1;
import com.yandex.passport.internal.ui.challenge.delete.k1;
import com.yandex.passport.internal.ui.challenge.delete.p0;
import com.yandex.passport.internal.ui.challenge.delete.q0;
import com.yandex.passport.internal.ui.challenge.delete.q1;
import com.yandex.passport.internal.ui.challenge.delete.s0;
import com.yandex.passport.internal.ui.challenge.logout.bottomsheet.LogoutBottomSheetActivity;
import com.yandex.passport.internal.ui.challenge.logout.bottomsheet.b0;
import com.yandex.passport.internal.ui.challenge.logout.j;
import com.yandex.passport.internal.ui.challenge.vpn.a0;
import com.yandex.passport.internal.ui.sloth.authsdk.f0;
import com.yandex.passport.internal.ui.sloth.authsdk.g0;
import com.yandex.passport.internal.ui.sloth.authsdk.j0;
import com.yandex.passport.internal.ui.sloth.authsdk.l;
import com.yandex.passport.internal.ui.sloth.authsdk.o;
import com.yandex.passport.internal.ui.sloth.authsdk.p;
import com.yandex.passport.internal.ui.sloth.authsdk.x;
import com.yandex.passport.internal.ui.sloth.ebs.a;
import com.yandex.passport.internal.ui.sloth.ebs.b;
import com.yandex.passport.internal.ui.sloth.ebs.c;
import com.yandex.passport.internal.ui.sloth.ebs.r0;
import com.yandex.passport.internal.usecase.b1;
import com.yandex.passport.internal.usecase.d1;
import com.yandex.passport.internal.usecase.e0;
import com.yandex.passport.internal.usecase.e2;
import com.yandex.passport.internal.usecase.f2;
import com.yandex.passport.internal.usecase.g1;
import com.yandex.passport.internal.usecase.h;
import com.yandex.passport.internal.usecase.i2;
import com.yandex.passport.internal.usecase.l2;
import com.yandex.passport.internal.usecase.m1;
import com.yandex.passport.internal.usecase.o2;
import com.yandex.passport.internal.usecase.r1;
import com.yandex.passport.internal.usecase.s1;
import com.yandex.passport.internal.usecase.ui.n1;
import com.yandex.passport.internal.usecase.v2;
import com.yandex.passport.internal.usecase.x0;
import com.yandex.passport.internal.usecase.x2;
import com.yandex.passport.sloth.c1;
import com.yandex.passport.sloth.data.m;
import com.yandex.passport.sloth.data.o0;
import com.yandex.passport.sloth.data.y;
import com.yandex.passport.sloth.ui.dependencies.q;
import defpackage.a4g;
import defpackage.agv;
import defpackage.bfu;
import defpackage.d13;
import defpackage.ff7;
import defpackage.kdk;
import defpackage.o9h;
import defpackage.rp2;
import defpackage.rzm;
import defpackage.szm;
import defpackage.t75;
import defpackage.t8a;
import defpackage.toe;
import defpackage.tv7;
import defpackage.zo0;
import io.appmetrica.analytics.IReporterYandex;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import okhttp3.OkHttpClient;

/* loaded from: classes4.dex */
public final class DaggerPassportProcessGlobalComponent {

    public static final class AuthSdkActivityComponentImpl implements d {
        private final AuthSdkActivityComponentImpl authSdkActivityComponentImpl = this;
        rzm authSdkUiProvider;
        rzm errorSlabDetailsUiProvider;
        rzm errorSlabMessageUiProvider;
        rzm errorSlabUiProvider;
        rzm getActivityProvider;
        rzm getProgressPropertiesProvider;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;

        public AuthSdkActivityComponentImpl(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, e eVar) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            initialize(eVar);
        }

        private void initialize(e eVar) {
            rzm b = t8a.b(new f(eVar, 0));
            this.getActivityProvider = b;
            this.errorSlabDetailsUiProvider = new l1(b, 17);
            rzm b2 = t8a.b(new f(eVar, 1));
            this.getProgressPropertiesProvider = b2;
            rzm rzmVar = this.getActivityProvider;
            h1 h1Var = new h1(rzmVar, b2, 18);
            this.errorSlabMessageUiProvider = h1Var;
            rzm b3 = t8a.b(new com.yandex.passport.internal.badges.f(rzmVar, this.errorSlabDetailsUiProvider, (rzm) h1Var, 4));
            this.errorSlabUiProvider = b3;
            rzm rzmVar2 = this.getActivityProvider;
            PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl = this.passportProcessGlobalComponentImpl;
            this.authSdkUiProvider = t8a.b(new w(rzmVar2, b3, passportProcessGlobalComponentImpl.bindApplicationDetailsProvider, passportProcessGlobalComponentImpl.provideAnalyticalIdentifiersProvider, passportProcessGlobalComponentImpl.provideClipboardControllerProvider, 9));
        }

        @Override // com.yandex.passport.internal.ui.authsdk.d
        public i getFlagRepository() {
            return (i) this.passportProcessGlobalComponentImpl.flagRepositoryProvider.get();
        }

        public v getProgressProperties() {
            return (v) this.getProgressPropertiesProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.authsdk.d
        public g getReporter() {
            return (g) this.passportProcessGlobalComponentImpl.authSdkReporterProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.authsdk.d
        public n getUi() {
            return (n) this.authSdkUiProvider.get();
        }
    }

    public static final class AuthSdkSlothComponentImpl implements l {
        private final AuthSdkSlothComponentImpl authSdkSlothComponentImpl = this;
        rzm authSdkSlothSlabProvider;
        rzm authSdkSlothUiProvider;
        rzm getActivityProvider;
        rzm getParametersProvider;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        rzm slothDebugInformationDelegateImplProvider;
        rzm slothNetworkStatusImplProvider;
        rzm slothSslErrorHandlerProvider;
        rzm slothStringRepositoryImplProvider;
        rzm slothUiDependenciesFactoryProvider;
        rzm standaloneWishConsumerProvider;

        public AuthSdkSlothComponentImpl(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, f0 f0Var) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            initialize(f0Var);
        }

        private void initialize(f0 f0Var) {
            rzm b = t8a.b(new g0(f0Var, 0));
            this.getActivityProvider = b;
            com.yandex.passport.common.coroutine.d dVar = new com.yandex.passport.common.coroutine.d(13);
            this.slothStringRepositoryImplProvider = dVar;
            PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl = this.passportProcessGlobalComponentImpl;
            com.yandex.passport.internal.ui.bouncer.sloth.i iVar = new com.yandex.passport.internal.ui.bouncer.sloth.i(passportProcessGlobalComponentImpl.provideDebugInfoUtilProvider, 9);
            this.slothDebugInformationDelegateImplProvider = iVar;
            rzm rzmVar = passportProcessGlobalComponentImpl.provideCoroutineScopesProvider;
            h1 h1Var = new h1(b, rzmVar, 7);
            this.slothNetworkStatusImplProvider = h1Var;
            com.yandex.passport.internal.ui.bouncer.sloth.i iVar2 = new com.yandex.passport.internal.ui.bouncer.sloth.i(passportProcessGlobalComponentImpl.setApplicationContextProvider, 10);
            this.slothSslErrorHandlerProvider = iVar2;
            this.slothUiDependenciesFactoryProvider = new com.yandex.passport.internal.ui.sloth.i(b, dVar, rzmVar, iVar, h1Var, passportProcessGlobalComponentImpl.applicationDetailsProviderImplProvider, iVar2, passportProcessGlobalComponentImpl.slothUrlProviderImplProvider, 0);
            rzm b2 = t8a.b(new com.yandex.passport.internal.ui.bouncer.sloth.i(b, 13));
            this.standaloneWishConsumerProvider = b2;
            rzm b3 = t8a.b(new com.yandex.passport.internal.ui.bouncer.roundabout.d(this.slothUiDependenciesFactoryProvider, b2, 7));
            this.authSdkSlothSlabProvider = b3;
            this.authSdkSlothUiProvider = t8a.b(new com.yandex.passport.internal.ui.bouncer.sloth.i(b3, 14));
            this.getParametersProvider = t8a.b(new g0(f0Var, 1));
        }

        @Override // com.yandex.passport.internal.ui.sloth.authsdk.l
        public m getParams() {
            return (m) this.getParametersProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.sloth.authsdk.l
        public j0 getUi() {
            return (j0) this.authSdkSlothUiProvider.get();
        }
    }

    public static final class AuthSdkSlothComposeComponentBuilder implements com.yandex.passport.internal.ui.sloth.authsdk.n {
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private Activity setActivity;
        private com.yandex.passport.common.ui.progress.g setProgressProperties;
        private m setSlothParams;

        private AuthSdkSlothComposeComponentBuilder(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
        }

        @Override // com.yandex.passport.internal.ui.sloth.authsdk.n
        public o build() {
            a4g.q(m.class, this.setSlothParams);
            a4g.q(com.yandex.passport.common.ui.progress.g.class, this.setProgressProperties);
            a4g.q(Activity.class, this.setActivity);
            return new AuthSdkSlothComposeComponentImpl(this.passportProcessGlobalComponentImpl, new com.yandex.passport.internal.ui.common.e(), new p(), this.setSlothParams, this.setProgressProperties, this.setActivity);
        }

        @Override // com.yandex.passport.internal.ui.sloth.authsdk.n
        public AuthSdkSlothComposeComponentBuilder setActivity(Activity activity) {
            activity.getClass();
            this.setActivity = activity;
            return this;
        }

        @Override // com.yandex.passport.internal.ui.sloth.authsdk.n
        public AuthSdkSlothComposeComponentBuilder setProgressProperties(com.yandex.passport.common.ui.progress.g gVar) {
            gVar.getClass();
            this.setProgressProperties = gVar;
            return this;
        }

        @Override // com.yandex.passport.internal.ui.sloth.authsdk.n
        public AuthSdkSlothComposeComponentBuilder setSlothParams(m mVar) {
            mVar.getClass();
            this.setSlothParams = mVar;
            return this;
        }
    }

    public static final class AuthSdkSlothComposeComponentImpl implements o {
        private final AuthSdkSlothComposeComponentImpl authSdkSlothComposeComponentImpl = this;
        private final p authSdkSlothComposeModule;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        rzm providePerformConfigurationProvider;
        rzm setActivityProvider;
        private final com.yandex.passport.common.ui.progress.g setProgressProperties;
        private final m setSlothParams;
        private final com.yandex.passport.internal.ui.common.e storeFactoryModule;

        public AuthSdkSlothComposeComponentImpl(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, com.yandex.passport.internal.ui.common.e eVar, p pVar, m mVar, com.yandex.passport.common.ui.progress.g gVar, Activity activity) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            this.storeFactoryModule = eVar;
            this.authSdkSlothComposeModule = pVar;
            this.setSlothParams = mVar;
            this.setProgressProperties = gVar;
            initialize(eVar, pVar, mVar, gVar, activity);
        }

        private void initialize(com.yandex.passport.internal.ui.common.e eVar, p pVar, m mVar, com.yandex.passport.common.ui.progress.g gVar, Activity activity) {
            this.providePerformConfigurationProvider = new k(pVar, this.passportProcessGlobalComponentImpl.slothStandalonePerformConfigurationProvider, 9);
            this.setActivityProvider = toe.a(activity);
        }

        public com.yandex.passport.internal.ui.sloth.authsdk.w authSdkSlothComposeStoreFactory() {
            return new com.yandex.passport.internal.ui.sloth.authsdk.w(com.yandex.passport.internal.ui.common.f.a(this.storeFactoryModule), (o1) this.passportProcessGlobalComponentImpl.webAmReporterProvider.get(), uid());
        }

        @Override // com.yandex.passport.internal.ui.sloth.authsdk.o
        public m getSlothParams() {
            return this.setSlothParams;
        }

        @Override // com.yandex.passport.internal.ui.sloth.authsdk.o
        public com.yandex.passport.internal.ui.sloth.screen.e getSlothScreenComponentBuilder() {
            return new cypiuss4_SlothScreenComponentBuilder(this.passportProcessGlobalComponentImpl, this.authSdkSlothComposeComponentImpl);
        }

        @Override // com.yandex.passport.internal.ui.sloth.authsdk.o
        public x getViewModelFactory() {
            return new x(authSdkSlothComposeStoreFactory());
        }

        @Override // com.yandex.passport.internal.ui.sloth.authsdk.o
        public boolean isWhiteLabel() {
            return this.passportProcessGlobalComponentImpl.whiteLabelBoolean();
        }

        public com.yandex.passport.common.core.f uid() {
            p pVar = this.authSdkSlothComposeModule;
            m mVar = this.setSlothParams;
            pVar.getClass();
            mVar.getClass();
            o0 o0Var = mVar.a;
            o0Var.getClass();
            com.yandex.passport.common.core.f fVar = ((y) o0Var).f;
            a4g.t(fVar);
            return fVar;
        }
    }

    public static final class BiometricVerificationComponentBuilder implements a {
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private Activity setActivity;
        private com.yandex.passport.common.ui.progress.g setProgressProperties;
        private com.yandex.passport.internal.ui.sloth.ebs.f setProperties;

        private BiometricVerificationComponentBuilder(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
        }

        @Override // com.yandex.passport.internal.ui.sloth.ebs.a
        public b build() {
            a4g.q(com.yandex.passport.internal.ui.sloth.ebs.f.class, this.setProperties);
            a4g.q(com.yandex.passport.common.ui.progress.g.class, this.setProgressProperties);
            a4g.q(Activity.class, this.setActivity);
            return new BiometricVerificationComponentImpl(this.passportProcessGlobalComponentImpl, new com.yandex.passport.internal.ui.common.e(), new c(), this.setProperties, this.setProgressProperties, this.setActivity);
        }

        @Override // com.yandex.passport.internal.ui.sloth.ebs.a
        public BiometricVerificationComponentBuilder setActivity(Activity activity) {
            activity.getClass();
            this.setActivity = activity;
            return this;
        }

        @Override // com.yandex.passport.internal.ui.sloth.ebs.a
        public BiometricVerificationComponentBuilder setProgressProperties(com.yandex.passport.common.ui.progress.g gVar) {
            gVar.getClass();
            this.setProgressProperties = gVar;
            return this;
        }

        @Override // com.yandex.passport.internal.ui.sloth.ebs.a
        public BiometricVerificationComponentBuilder setProperties(com.yandex.passport.internal.ui.sloth.ebs.f fVar) {
            fVar.getClass();
            this.setProperties = fVar;
            return this;
        }
    }

    public static final class BiometricVerificationComponentImpl implements b {
        private final BiometricVerificationComponentImpl biometricVerificationComponentImpl = this;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        rzm providePerformConfigurationProvider;
        rzm setActivityProvider;
        private final com.yandex.passport.common.ui.progress.g setProgressProperties;
        private final com.yandex.passport.internal.ui.sloth.ebs.f setProperties;
        private final com.yandex.passport.internal.ui.common.e storeFactoryModule;

        public BiometricVerificationComponentImpl(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, com.yandex.passport.internal.ui.common.e eVar, c cVar, com.yandex.passport.internal.ui.sloth.ebs.f fVar, com.yandex.passport.common.ui.progress.g gVar, Activity activity) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            this.storeFactoryModule = eVar;
            this.setProperties = fVar;
            this.setProgressProperties = gVar;
            initialize(eVar, cVar, fVar, gVar, activity);
        }

        private void initialize(com.yandex.passport.internal.ui.common.e eVar, c cVar, com.yandex.passport.internal.ui.sloth.ebs.f fVar, com.yandex.passport.common.ui.progress.g gVar, Activity activity) {
            this.providePerformConfigurationProvider = new k(cVar, this.passportProcessGlobalComponentImpl.slothStandalonePerformConfigurationProvider, 10);
            this.setActivityProvider = toe.a(activity);
        }

        public com.yandex.passport.internal.ui.sloth.ebs.j0 biometricVerificationStoreFactory() {
            return new com.yandex.passport.internal.ui.sloth.ebs.j0(this.passportProcessGlobalComponentImpl.setApplicationContext, com.yandex.passport.internal.ui.common.f.a(this.storeFactoryModule), this.setProperties, (com.yandex.passport.common.ebs.k) this.passportProcessGlobalComponentImpl.providePassportBiometricApiProvider.get(), (com.yandex.passport.internal.usecase.e) this.passportProcessGlobalComponentImpl.biometricTrackInitUseCaseProvider.get(), (r1) this.passportProcessGlobalComponentImpl.makeJwtTokenUseCaseProvider.get(), (i2) this.passportProcessGlobalComponentImpl.startBiometricSessionUseCaseProvider.get(), (h) this.passportProcessGlobalComponentImpl.checkAgeByTrackIdUseCaseProvider.get(), cryptoSdkInitializationStorage(), (com.yandex.passport.internal.report.reporters.v) this.passportProcessGlobalComponentImpl.ebsReporterProvider.get());
        }

        public com.yandex.passport.internal.usecase.o cryptoSdkInitializationStorage() {
            return new com.yandex.passport.internal.usecase.o(this.passportProcessGlobalComponentImpl.setApplicationContext);
        }

        @Override // com.yandex.passport.internal.ui.sloth.ebs.b
        public com.yandex.passport.common.ebs.k getBiometricApi() {
            return (com.yandex.passport.common.ebs.k) this.passportProcessGlobalComponentImpl.providePassportBiometricApiProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.sloth.ebs.b
        public com.yandex.passport.common.ui.progress.g getProgressProperties() {
            return this.setProgressProperties;
        }

        @Override // com.yandex.passport.internal.ui.sloth.ebs.b
        public com.yandex.passport.internal.ui.sloth.screen.e getSlothScreenComponentBuilder() {
            return new cypiuss5_SlothScreenComponentBuilder(this.passportProcessGlobalComponentImpl, this.biometricVerificationComponentImpl);
        }

        @Override // com.yandex.passport.internal.ui.sloth.ebs.b
        public r0 getViewModelFactory() {
            return new r0(biometricVerificationStoreFactory(), (com.yandex.passport.common.ebs.k) this.passportProcessGlobalComponentImpl.providePassportBiometricApiProvider.get());
        }

        @Override // com.yandex.passport.internal.ui.sloth.ebs.b
        public boolean isWhiteLabel() {
            return this.passportProcessGlobalComponentImpl.whiteLabelBoolean();
        }
    }

    public static final class BouncerActivityComponentImpl implements com.yandex.passport.internal.ui.bouncer.c {
        rzm accountDeleteDialogProvider;
        rzm accountSlabProvider;
        rzm addNewSlabProvider;
        rzm baseSlothUiSettingsProvider;
        private final BouncerActivityComponentImpl bouncerActivityComponentImpl = this;
        private final com.yandex.passport.internal.ui.bouncer.d bouncerActivityModule;
        rzm bouncerActivityRendererProvider;
        rzm bouncerActivityUiProvider;
        rzm bouncerComposeViewProvider;
        rzm bouncerMasterChooserSlabProvider;
        rzm bouncerSlothComposeSlabProvider;
        rzm bouncerSlothSlabProvider;
        rzm bouncerSlothWishConsumerProvider;
        rzm bouncerWishSourceProvider;
        rzm createProfileSlabProvider;
        rzm customLogoSlabProvider;
        rzm errorSlabDetailsUiProvider;
        rzm errorSlabMessageUiProvider;
        rzm errorSlabProvider;
        rzm errorSlabUiProvider;
        rzm fallbackSlabProvider;
        rzm getActivityProvider;
        rzm getBouncerActivityProvider;
        rzm getBouncerMasterChooserComponentBuilderProvider;
        rzm getBouncerSlothComposeComponentBuilderProvider;
        rzm getComponentActivityProvider;
        rzm getLoginPropertiesProvider;
        rzm getProgressPropertiesProvider;
        rzm getRendererComponentBuilderProvider;
        rzm getTimeTrackerProvider;
        rzm loadingSlabProvider;
        rzm loadingUiProvider;
        rzm loadingWithBackgroundSlabProvider;
        rzm loadingWithBackgroundUiProvider;
        rzm memberAccountSlabProvider;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        rzm phonishSlabProvider;
        rzm provideAppThemeProvider;
        rzm provideBouncerRendererProvider;
        rzm provideRendererProvider;
        rzm provideSlothWebViewSettingsProvider;
        rzm roundaboutAccountProcessingProvider;
        rzm roundaboutAdapterProvider;
        rzm roundaboutBottomsheetUiProvider;
        rzm roundaboutFullscreenUiProvider;
        rzm roundaboutInnerSlabProvider;
        rzm roundaboutInnerUiProvider;
        rzm roundaboutSlabProvider;
        rzm slothDebugInformationDelegateImplProvider;
        rzm slothNetworkStatusImplProvider;
        rzm slothSslErrorHandlerProvider;
        rzm slothStringRepositoryImplProvider;
        rzm slothUiDependenciesFactoryProvider;
        rzm waitConnectionSlabProvider;
        rzm waitConnectionUiProvider;
        rzm webUrlCheckerProvider;
        rzm webViewControllerProvider;
        rzm webViewSlabProvider;
        rzm webViewUiProvider;
        rzm whiteLabelLogoSlabProvider;
        rzm wrongAccountSlabProvider;
        rzm yandexLogoSlabProvider;

        public BouncerActivityComponentImpl(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, com.yandex.passport.internal.ui.bouncer.d dVar) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            this.bouncerActivityModule = dVar;
            initialize(dVar);
            initialize2(dVar);
            initialize3(dVar);
        }

        private void initialize(com.yandex.passport.internal.ui.bouncer.d dVar) {
            rzm b = t8a.b(new com.yandex.passport.internal.ui.bouncer.e(dVar, 2));
            this.getComponentActivityProvider = b;
            this.bouncerWishSourceProvider = t8a.b(new l1(b, 16));
            rzm b2 = t8a.b(new com.yandex.passport.internal.ui.bouncer.e(dVar, 0));
            this.getActivityProvider = b2;
            com.yandex.passport.common.coroutine.d dVar2 = new com.yandex.passport.common.coroutine.d(13);
            this.slothStringRepositoryImplProvider = dVar2;
            PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl = this.passportProcessGlobalComponentImpl;
            com.yandex.passport.internal.ui.bouncer.sloth.i iVar = new com.yandex.passport.internal.ui.bouncer.sloth.i(passportProcessGlobalComponentImpl.provideDebugInfoUtilProvider, 9);
            this.slothDebugInformationDelegateImplProvider = iVar;
            rzm rzmVar = passportProcessGlobalComponentImpl.provideCoroutineScopesProvider;
            h1 h1Var = new h1(b2, rzmVar, 7);
            this.slothNetworkStatusImplProvider = h1Var;
            com.yandex.passport.internal.ui.bouncer.sloth.i iVar2 = new com.yandex.passport.internal.ui.bouncer.sloth.i(passportProcessGlobalComponentImpl.setApplicationContextProvider, 10);
            this.slothSslErrorHandlerProvider = iVar2;
            this.slothUiDependenciesFactoryProvider = new com.yandex.passport.internal.ui.sloth.i(b2, dVar2, rzmVar, iVar, h1Var, passportProcessGlobalComponentImpl.applicationDetailsProviderImplProvider, iVar2, passportProcessGlobalComponentImpl.slothUrlProviderImplProvider, 0);
            rzm b3 = t8a.b(new com.yandex.passport.internal.ui.bouncer.e(dVar, 4));
            this.getProgressPropertiesProvider = b3;
            this.baseSlothUiSettingsProvider = t8a.b(new com.yandex.passport.internal.ui.bouncer.roundabout.d(b3, this.passportProcessGlobalComponentImpl.setPropertiesProvider, 5));
            this.bouncerSlothWishConsumerProvider = t8a.b(new com.yandex.passport.internal.ui.bouncer.sloth.i(this.bouncerWishSourceProvider, 0));
            rzm b4 = t8a.b(new com.yandex.passport.internal.ui.bouncer.e(dVar, 3));
            this.getLoginPropertiesProvider = b4;
            rzm b5 = t8a.b(new com.yandex.passport.internal.ui.bouncer.f(dVar, b4, 2));
            this.provideSlothWebViewSettingsProvider = b5;
            this.bouncerSlothSlabProvider = t8a.b(new w(this.slothUiDependenciesFactoryProvider, this.baseSlothUiSettingsProvider, this.bouncerSlothWishConsumerProvider, b5, this.passportProcessGlobalComponentImpl.setPropertiesProvider, 11));
            rzm b6 = t8a.b(new com.yandex.passport.internal.ui.bouncer.e(dVar, 1));
            this.getBouncerActivityProvider = b6;
            this.bouncerActivityUiProvider = t8a.b(new l1(b6, 15));
            rzm rzmVar2 = this.getActivityProvider;
            rzm rzmVar3 = this.bouncerWishSourceProvider;
            this.createProfileSlabProvider = new s7(rzmVar2, rzmVar3, this.passportProcessGlobalComponentImpl.createProfileReporterProvider, 26);
            this.addNewSlabProvider = new com.yandex.passport.internal.ui.bouncer.roundabout.d(rzmVar2, rzmVar3, 3);
            rzm b7 = t8a.b(new com.yandex.passport.internal.ui.bouncer.roundabout.d(rzmVar2, rzmVar3, 0));
            this.accountDeleteDialogProvider = b7;
            rzm rzmVar4 = this.getActivityProvider;
            rzm rzmVar5 = this.bouncerWishSourceProvider;
            s7 s7Var = new s7(rzmVar4, rzmVar5, b7, 27);
            this.phonishSlabProvider = s7Var;
            s7 s7Var2 = new s7(rzmVar4, rzmVar5, b7, 25);
            this.accountSlabProvider = s7Var2;
            com.yandex.passport.internal.ui.bouncer.roundabout.d dVar3 = new com.yandex.passport.internal.ui.bouncer.roundabout.d(rzmVar4, rzmVar5, 4);
            this.memberAccountSlabProvider = dVar3;
            rzm b8 = t8a.b(new com.yandex.passport.data.network.n(this.createProfileSlabProvider, this.addNewSlabProvider, s7Var, s7Var2, dVar3, 22));
            this.roundaboutAdapterProvider = b8;
            this.roundaboutInnerUiProvider = t8a.b(new com.yandex.passport.internal.ui.bouncer.roundabout.d(this.getActivityProvider, b8, 1));
            this.whiteLabelLogoSlabProvider = t8a.b(new l1(this.getActivityProvider, 29));
        }

        private void initialize2(com.yandex.passport.internal.ui.bouncer.d dVar) {
            this.yandexLogoSlabProvider = t8a.b(new com.yandex.passport.internal.ui.bouncer.roundabout.d(this.getActivityProvider, this.passportProcessGlobalComponentImpl.bindUiLanguageProvider, 2));
            rzm b = t8a.b(new l1(this.getActivityProvider, 26));
            this.customLogoSlabProvider = b;
            this.roundaboutInnerSlabProvider = t8a.b(new h9(this.roundaboutInnerUiProvider, this.bouncerWishSourceProvider, this.whiteLabelLogoSlabProvider, this.yandexLogoSlabProvider, b, this.passportProcessGlobalComponentImpl.setPropertiesProvider, 5));
            this.roundaboutFullscreenUiProvider = t8a.b(new l1(this.getActivityProvider, 28));
            this.roundaboutBottomsheetUiProvider = t8a.b(new l1(this.getActivityProvider, 27));
            PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl = this.passportProcessGlobalComponentImpl;
            rzm b2 = t8a.b(new z0(passportProcessGlobalComponentImpl.provideCoroutineDispatchersProvider, this.roundaboutAdapterProvider, passportProcessGlobalComponentImpl.bouncerReporterProvider, passportProcessGlobalComponentImpl.flagRepositoryProvider, 19));
            this.roundaboutAccountProcessingProvider = b2;
            rzm rzmVar = this.getBouncerActivityProvider;
            rzm rzmVar2 = this.roundaboutInnerSlabProvider;
            rzm rzmVar3 = this.roundaboutFullscreenUiProvider;
            rzm rzmVar4 = this.roundaboutBottomsheetUiProvider;
            rzm rzmVar5 = this.bouncerWishSourceProvider;
            PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl2 = this.passportProcessGlobalComponentImpl;
            this.roundaboutSlabProvider = t8a.b(new com.yandex.passport.internal.core.accounts.b(rzmVar, rzmVar2, rzmVar3, rzmVar4, b2, rzmVar5, passportProcessGlobalComponentImpl2.bouncerReporterProvider, passportProcessGlobalComponentImpl2.badgesReporterProvider, 4));
            rzm b3 = t8a.b(new s7(this.getActivityProvider, this.getProgressPropertiesProvider, this.passportProcessGlobalComponentImpl.setPropertiesProvider, 21));
            this.loadingUiProvider = b3;
            this.loadingSlabProvider = t8a.b(new h1(b3, this.bouncerWishSourceProvider, 20));
            rzm b4 = t8a.b(new s7(this.getActivityProvider, this.getProgressPropertiesProvider, this.passportProcessGlobalComponentImpl.setPropertiesProvider, 22));
            this.loadingWithBackgroundUiProvider = b4;
            this.loadingWithBackgroundSlabProvider = t8a.b(new h1(b4, this.bouncerWishSourceProvider, 21));
            rzm rzmVar6 = this.getActivityProvider;
            l1 l1Var = new l1(rzmVar6, 17);
            this.errorSlabDetailsUiProvider = l1Var;
            h1 h1Var = new h1(rzmVar6, this.getProgressPropertiesProvider, 18);
            this.errorSlabMessageUiProvider = h1Var;
            rzm b5 = t8a.b(new com.yandex.passport.internal.badges.f(rzmVar6, (rzm) l1Var, (rzm) h1Var, 4));
            this.errorSlabUiProvider = b5;
            rzm rzmVar7 = this.bouncerWishSourceProvider;
            PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl3 = this.passportProcessGlobalComponentImpl;
            this.errorSlabProvider = t8a.b(new h9(b5, rzmVar7, passportProcessGlobalComponentImpl3.bindApplicationDetailsProvider, passportProcessGlobalComponentImpl3.provideAnalyticalIdentifiersProvider, passportProcessGlobalComponentImpl3.provideClipboardControllerProvider, passportProcessGlobalComponentImpl3.setPropertiesProvider, 4));
            this.fallbackSlabProvider = t8a.b(new s7(this.getBouncerActivityProvider, this.bouncerWishSourceProvider, this.passportProcessGlobalComponentImpl.bouncerReporterProvider, 20));
            rzm b6 = t8a.b(new com.yandex.passport.internal.ui.common.c(this.passportProcessGlobalComponentImpl.setPropertiesProvider, this.getActivityProvider, this.getProgressPropertiesProvider, 1));
            this.webViewUiProvider = b6;
            rzm b7 = t8a.b(new com.yandex.passport.internal.ui.bouncer.sloth.i(b6, 5));
            this.webViewControllerProvider = b7;
            PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl4 = this.passportProcessGlobalComponentImpl;
            com.yandex.passport.internal.ui.bouncer.sloth.i iVar = new com.yandex.passport.internal.ui.bouncer.sloth.i(passportProcessGlobalComponentImpl4.urlCheckerProvider, 4);
            this.webUrlCheckerProvider = iVar;
            this.webViewSlabProvider = t8a.b(new com.yandex.passport.data.network.n(this.webViewUiProvider, this.getActivityProvider, b7, passportProcessGlobalComponentImpl4.provideEventReporterProvider, iVar, 24));
            this.wrongAccountSlabProvider = t8a.b(new h1(this.errorSlabUiProvider, this.bouncerWishSourceProvider, 19));
            s7 s7Var = new s7(this.getActivityProvider, this.getProgressPropertiesProvider, this.passportProcessGlobalComponentImpl.setPropertiesProvider, 23);
            this.waitConnectionUiProvider = s7Var;
            this.waitConnectionSlabProvider = t8a.b(new com.yandex.passport.internal.badges.f(s7Var, this.bouncerWishSourceProvider, this.slothNetworkStatusImplProvider));
            this.getTimeTrackerProvider = t8a.b(new com.yandex.passport.internal.ui.bouncer.e(dVar, 5));
            this.getBouncerMasterChooserComponentBuilderProvider = new rzm() { // from class: com.yandex.passport.internal.di.component.DaggerPassportProcessGlobalComponent.BouncerActivityComponentImpl.1
                @Override // defpackage.szm
                public com.yandex.passport.internal.ui.bouncer.chooser.a get() {
                    return new BouncerMasterChooserComponentBuilder(BouncerActivityComponentImpl.this.passportProcessGlobalComponentImpl, BouncerActivityComponentImpl.this.bouncerActivityComponentImpl);
                }
            };
        }

        private void initialize3(com.yandex.passport.internal.ui.bouncer.d dVar) {
            this.bouncerMasterChooserSlabProvider = new z0(this.getBouncerActivityProvider, this.bouncerWishSourceProvider, this.getBouncerMasterChooserComponentBuilderProvider, this.passportProcessGlobalComponentImpl.createProfileReporterProvider, 15);
            rzm rzmVar = new rzm() { // from class: com.yandex.passport.internal.di.component.DaggerPassportProcessGlobalComponent.BouncerActivityComponentImpl.2
                @Override // defpackage.szm
                public com.yandex.passport.internal.ui.bouncer.sloth.b get() {
                    return new BouncerSlothComposeComponentBuilder(BouncerActivityComponentImpl.this.passportProcessGlobalComponentImpl, BouncerActivityComponentImpl.this.bouncerActivityComponentImpl);
                }
            };
            this.getBouncerSlothComposeComponentBuilderProvider = rzmVar;
            rzm rzmVar2 = this.getActivityProvider;
            PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl = this.passportProcessGlobalComponentImpl;
            s7 s7Var = new s7(rzmVar2, passportProcessGlobalComponentImpl.provideIsWhiteLabelProvider, rzmVar, 28);
            this.bouncerSlothComposeSlabProvider = s7Var;
            this.bouncerActivityRendererProvider = t8a.b(new com.yandex.passport.internal.push.n(rzmVar2, this.bouncerSlothSlabProvider, this.bouncerActivityUiProvider, this.bouncerWishSourceProvider, this.roundaboutSlabProvider, this.loadingSlabProvider, this.loadingWithBackgroundSlabProvider, this.errorSlabProvider, this.fallbackSlabProvider, this.webViewSlabProvider, this.wrongAccountSlabProvider, this.waitConnectionSlabProvider, passportProcessGlobalComponentImpl.bouncerReporterProvider, this.getTimeTrackerProvider, passportProcessGlobalComponentImpl.flagRepositoryProvider, this.getProgressPropertiesProvider, this.bouncerMasterChooserSlabProvider, s7Var, 1));
            rzm rzmVar3 = new rzm() { // from class: com.yandex.passport.internal.di.component.DaggerPassportProcessGlobalComponent.BouncerActivityComponentImpl.3
                @Override // defpackage.szm
                public t get() {
                    return new RendererComponentBuilder(BouncerActivityComponentImpl.this.passportProcessGlobalComponentImpl, BouncerActivityComponentImpl.this.bouncerActivityComponentImpl);
                }
            };
            this.getRendererComponentBuilderProvider = rzmVar3;
            com.yandex.passport.internal.ui.bouncer.f fVar = new com.yandex.passport.internal.ui.bouncer.f(dVar, this.getLoginPropertiesProvider, 0);
            this.provideAppThemeProvider = fVar;
            rzm rzmVar4 = this.getBouncerActivityProvider;
            PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl2 = this.passportProcessGlobalComponentImpl;
            rzm b = t8a.b(new com.yandex.passport.internal.di.module.g(rzmVar3, rzmVar4, passportProcessGlobalComponentImpl2.provideIsWhiteLabelProvider, fVar, this.getTimeTrackerProvider, passportProcessGlobalComponentImpl2.bouncerReporterProvider, 4, false));
            this.bouncerComposeViewProvider = b;
            rzm b2 = t8a.b(new d0(dVar, this.passportProcessGlobalComponentImpl.flagRepositoryProvider, this.bouncerActivityRendererProvider, b, 22));
            this.provideBouncerRendererProvider = b2;
            this.provideRendererProvider = t8a.b(new com.yandex.passport.internal.ui.bouncer.f(dVar, b2, 1));
        }

        public com.yandex.passport.internal.ui.bouncer.chooser.a getBouncerMasterChooserComponentBuilder() {
            return new BouncerMasterChooserComponentBuilder(this.passportProcessGlobalComponentImpl, this.bouncerActivityComponentImpl);
        }

        @Override // com.yandex.passport.internal.ui.bouncer.c
        public com.yandex.passport.internal.ui.bouncer.m getBouncerRenderer() {
            return (com.yandex.passport.internal.ui.bouncer.m) this.provideBouncerRendererProvider.get();
        }

        public com.yandex.passport.internal.ui.bouncer.sloth.b getBouncerSlothComposeComponentBuilder() {
            return new BouncerSlothComposeComponentBuilder(this.passportProcessGlobalComponentImpl, this.bouncerActivityComponentImpl);
        }

        public com.yandex.passport.internal.properties.l getLoginProperties() {
            return (com.yandex.passport.internal.properties.l) this.getLoginPropertiesProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.bouncer.c
        public com.yandex.passport.common.mvi.f getRenderer() {
            return (com.yandex.passport.common.mvi.f) this.provideRendererProvider.get();
        }

        public t getRendererComponentBuilder() {
            return new RendererComponentBuilder(this.passportProcessGlobalComponentImpl, this.bouncerActivityComponentImpl);
        }

        @Override // com.yandex.passport.internal.ui.bouncer.c
        public s getWishSource() {
            return (s) this.bouncerWishSourceProvider.get();
        }

        public com.yandex.passport.common.ui.progress.g progressProperties() {
            com.yandex.passport.internal.ui.bouncer.d dVar = this.bouncerActivityModule;
            com.yandex.passport.internal.properties.l lVar = (com.yandex.passport.internal.properties.l) this.getLoginPropertiesProvider.get();
            dVar.getClass();
            lVar.getClass();
            return com.yandex.plus.core.locale.b.C(lVar.p.n);
        }

        public com.yandex.passport.internal.ui.sloth.d slothDebugInformationDelegateImpl() {
            return new com.yandex.passport.internal.ui.sloth.d((com.yandex.passport.internal.util.d) this.passportProcessGlobalComponentImpl.provideDebugInfoUtilProvider.get());
        }

        public com.yandex.passport.internal.sloth.n slothNetworkStatusImpl() {
            return new com.yandex.passport.internal.sloth.n((Activity) this.getActivityProvider.get(), (com.yandex.passport.common.coroutine.e) this.passportProcessGlobalComponentImpl.provideCoroutineScopesProvider.get());
        }

        public com.yandex.passport.internal.ui.sloth.g slothStringRepositoryImpl() {
            return new com.yandex.passport.internal.ui.sloth.g(new com.yandex.passport.internal.ui.e());
        }
    }

    public static final class BouncerChallengeComponentBuilder implements com.yandex.passport.internal.ui.bouncer.challenge.a {
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private c0 setWebCase;

        private BouncerChallengeComponentBuilder(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
        }

        @Override // com.yandex.passport.internal.ui.bouncer.challenge.a
        public com.yandex.passport.internal.ui.bouncer.challenge.b build() {
            a4g.q(c0.class, this.setWebCase);
            return new BouncerChallengeComponentImpl(this.passportProcessGlobalComponentImpl, new com.yandex.passport.internal.ui.common.e(), this.setWebCase);
        }

        @Override // com.yandex.passport.internal.ui.bouncer.challenge.a
        public BouncerChallengeComponentBuilder setWebCase(c0 c0Var) {
            c0Var.getClass();
            this.setWebCase = c0Var;
            return this;
        }
    }

    public static final class BouncerChallengeComponentImpl implements com.yandex.passport.internal.ui.bouncer.challenge.b {
        private final BouncerChallengeComponentImpl bouncerChallengeComponentImpl = this;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private final c0 setWebCase;
        private final com.yandex.passport.internal.ui.common.e storeFactoryModule;

        public BouncerChallengeComponentImpl(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, com.yandex.passport.internal.ui.common.e eVar, c0 c0Var) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            this.storeFactoryModule = eVar;
            this.setWebCase = c0Var;
        }

        public com.yandex.passport.internal.ui.bouncer.challenge.m bouncerChallengeStoreFactory() {
            return new com.yandex.passport.internal.ui.bouncer.challenge.m(com.yandex.passport.internal.ui.common.f.a(this.storeFactoryModule), this.setWebCase);
        }

        @Override // com.yandex.passport.internal.ui.bouncer.challenge.b
        public com.yandex.passport.internal.analytics.o0 getEventReporter() {
            return (com.yandex.passport.internal.analytics.o0) this.passportProcessGlobalComponentImpl.provideEventReporterProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.bouncer.challenge.b
        public com.yandex.passport.internal.ui.common.web.d getUrlChecker() {
            return new com.yandex.passport.internal.ui.common.web.d(this.passportProcessGlobalComponentImpl.urlChecker());
        }

        @Override // com.yandex.passport.internal.ui.bouncer.challenge.b
        public com.yandex.passport.internal.ui.bouncer.challenge.o getViewModelFactory() {
            return new com.yandex.passport.internal.ui.bouncer.challenge.o(bouncerChallengeStoreFactory());
        }
    }

    public static final class BouncerMasterChooserComponentImpl implements com.yandex.passport.internal.ui.bouncer.chooser.b {
        private final BouncerActivityComponentImpl bouncerActivityComponentImpl;
        private final BouncerMasterChooserComponentImpl bouncerMasterChooserComponentImpl = this;
        private final com.yandex.passport.internal.ui.bouncer.chooser.c bouncerMasterChooserModule;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private final Boolean setCreateMasterEnterPhoneNumberOption;
        private final List<y0> setMasters;
        private final com.yandex.passport.internal.ui.common.e storeFactoryModule;

        public BouncerMasterChooserComponentImpl(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, BouncerActivityComponentImpl bouncerActivityComponentImpl, com.yandex.passport.internal.ui.bouncer.chooser.c cVar, com.yandex.passport.internal.ui.common.e eVar, List<y0> list, Boolean bool) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            this.bouncerActivityComponentImpl = bouncerActivityComponentImpl;
            this.storeFactoryModule = eVar;
            this.setMasters = list;
            this.setCreateMasterEnterPhoneNumberOption = bool;
            this.bouncerMasterChooserModule = cVar;
        }

        public r bouncerMasterChooserStoreFactory() {
            return new r(com.yandex.passport.internal.ui.common.f.a(this.storeFactoryModule), this.passportProcessGlobalComponentImpl.findMasterUidAccountUseCase(), this.setMasters, this.setCreateMasterEnterPhoneNumberOption.booleanValue());
        }

        @Override // com.yandex.passport.internal.ui.bouncer.chooser.b
        public com.yandex.passport.api.d getBranding() {
            com.yandex.passport.internal.ui.bouncer.chooser.c cVar = this.bouncerMasterChooserModule;
            com.yandex.passport.internal.properties.l lVar = (com.yandex.passport.internal.properties.l) this.bouncerActivityComponentImpl.getLoginPropertiesProvider.get();
            cVar.getClass();
            lVar.getClass();
            com.yandex.passport.api.d dVar = lVar.p.m.b;
            a4g.t(dVar);
            return dVar;
        }

        @Override // com.yandex.passport.internal.ui.bouncer.chooser.b
        public com.yandex.passport.common.ui.progress.g getProgressProperties() {
            return this.bouncerActivityComponentImpl.progressProperties();
        }

        @Override // com.yandex.passport.internal.ui.bouncer.chooser.b
        public com.yandex.passport.common.ui.lang.b getUiLanguageProvider() {
            return (com.yandex.passport.common.ui.lang.b) this.passportProcessGlobalComponentImpl.bindUiLanguageProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.bouncer.chooser.b
        public com.yandex.passport.internal.ui.bouncer.chooser.s getViewModelFactory() {
            return new com.yandex.passport.internal.ui.bouncer.chooser.s(bouncerMasterChooserStoreFactory());
        }

        @Override // com.yandex.passport.internal.ui.bouncer.chooser.b
        public boolean isWhiteLabel() {
            return this.passportProcessGlobalComponentImpl.whiteLabelBoolean();
        }
    }

    public static final class BouncerModelComponentImpl implements a1 {
        rzm accountSortUseCaseProvider;
        rzm additionalInfoSaverProvider;
        rzm bouncerActorsProvider;
        rzm bouncerEventsProvider;
        rzm bouncerMiddlewaresProvider;
        private final BouncerModelComponentImpl bouncerModelComponentImpl = this;
        rzm bouncerModelProvider;
        rzm bouncerReducerProvider;
        rzm bouncerWishMapperProvider;
        rzm challengeFinishMiddlewareProvider;
        rzm challengeStartMiddlewareProvider;
        rzm checkConnectionMiddlewareProvider;
        rzm createProfileActorProvider;
        rzm deleteAccountActorProvider;
        rzm deleteBlockedMiddlewareProvider;
        rzm finishRegistrationActorProvider;
        rzm getChildrenInfoUseCaseProvider;
        rzm getClientTokenActorProvider;
        rzm getTimeTrackerProvider;
        rzm loadAccountsMiddlewareProvider;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        rzm processEventActorProvider;
        rzm processFallbackResultMiddlewareProvider;
        rzm reloginActorProvider;
        rzm restartActorProvider;
        rzm routeActorProvider;
        rzm selectAccountByUidActorProvider;
        rzm selectAccountMiddlewareProvider;
        rzm setCurrentAccountMiddlewareProvider;
        rzm showMansionMiddlewareProvider;
        rzm slothSessionFactoryProvider;
        rzm sortAccountsMiddlewareProvider;
        rzm startSlothMiddlewareProvider;
        rzm verifyResultActorProvider;

        public BouncerModelComponentImpl(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, com.yandex.passport.internal.ui.bouncer.h hVar) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            initialize(hVar);
            initialize2(hVar);
        }

        private void initialize(com.yandex.passport.internal.ui.bouncer.h hVar) {
            this.bouncerReducerProvider = t8a.b(com.yandex.passport.internal.ui.bouncer.model.b.b);
            this.deleteAccountActorProvider = t8a.b(new l1(this.passportProcessGlobalComponentImpl.deleteAccountUseCaseProvider, 21));
            PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl = this.passportProcessGlobalComponentImpl;
            this.getClientTokenActorProvider = t8a.b(new z0(passportProcessGlobalComponentImpl.getClientTokenUseCaseProvider, passportProcessGlobalComponentImpl.findMasterUidAccountUseCaseProvider, passportProcessGlobalComponentImpl.authByMuidTokenUseCaseProvider, passportProcessGlobalComponentImpl.flagRepositoryProvider, 16));
            PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl2 = this.passportProcessGlobalComponentImpl;
            this.verifyResultActorProvider = t8a.b(new z0(passportProcessGlobalComponentImpl2.flagRepositoryProvider, passportProcessGlobalComponentImpl2.provideBaseUrlDispatcherProvider, passportProcessGlobalComponentImpl2.currentAccountManagerProvider, passportProcessGlobalComponentImpl2.accountFilterRepositoryProvider, 18));
            PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl3 = this.passportProcessGlobalComponentImpl;
            this.finishRegistrationActorProvider = t8a.b(new h1(passportProcessGlobalComponentImpl3.getUpgradeUrlUseCaseProvider, passportProcessGlobalComponentImpl3.accountUpgradeReporterProvider, 24));
            PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl4 = this.passportProcessGlobalComponentImpl;
            this.processEventActorProvider = t8a.b(new h1(passportProcessGlobalComponentImpl4.bindPhoneNumberReporterProvider, passportProcessGlobalComponentImpl4.loadAccountsUseCaseProvider, 25));
            this.routeActorProvider = t8a.b(new l1(this.passportProcessGlobalComponentImpl.currentAccountManagerProvider, 22));
            this.restartActorProvider = t8a.b(com.yandex.passport.internal.ui.bouncer.model.middleware.h.c);
            PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl5 = this.passportProcessGlobalComponentImpl;
            this.reloginActorProvider = t8a.b(new s7(passportProcessGlobalComponentImpl5.setPropertiesProvider, passportProcessGlobalComponentImpl5.provideAccountsRetrieverProvider, passportProcessGlobalComponentImpl5.flagRepositoryProvider, 24));
            PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl6 = this.passportProcessGlobalComponentImpl;
            this.selectAccountByUidActorProvider = t8a.b(new h1(passportProcessGlobalComponentImpl6.provideAccountsRetrieverProvider, passportProcessGlobalComponentImpl6.memberAccountRepositoryProvider, 27));
            rzm b = t8a.b(new l1(this.passportProcessGlobalComponentImpl.findMasterUidAccountUseCaseProvider, 20));
            this.createProfileActorProvider = b;
            this.bouncerActorsProvider = t8a.b(new com.yandex.passport.internal.ui.bouncer.model.middleware.b(this.deleteAccountActorProvider, this.getClientTokenActorProvider, this.verifyResultActorProvider, this.finishRegistrationActorProvider, this.processEventActorProvider, this.routeActorProvider, this.restartActorProvider, this.reloginActorProvider, this.selectAccountByUidActorProvider, b, 0));
            PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl7 = this.passportProcessGlobalComponentImpl;
            com.yandex.passport.internal.ui.bouncer.roundabout.d dVar = new com.yandex.passport.internal.ui.bouncer.roundabout.d(passportProcessGlobalComponentImpl7.provideCoroutineDispatchersProvider, passportProcessGlobalComponentImpl7.provideDatabaseHelperProvider, 16);
            this.getChildrenInfoUseCaseProvider = dVar;
            this.loadAccountsMiddlewareProvider = t8a.b(new com.yandex.passport.internal.di.module.g(passportProcessGlobalComponentImpl7.loadAccountsUseCaseProvider, dVar, passportProcessGlobalComponentImpl7.getAllowedBadgesUseCaseProvider, passportProcessGlobalComponentImpl7.getBadgesForAccountUseCaseProvider, passportProcessGlobalComponentImpl7.getNotLoggedInMembersUseCaseProvider, passportProcessGlobalComponentImpl7.flagRepositoryProvider));
            PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl8 = this.passportProcessGlobalComponentImpl;
            com.yandex.passport.internal.ui.bouncer.roundabout.d dVar2 = new com.yandex.passport.internal.ui.bouncer.roundabout.d(passportProcessGlobalComponentImpl8.provideCoroutineDispatchersProvider, passportProcessGlobalComponentImpl8.flagRepositoryProvider, 14);
            this.accountSortUseCaseProvider = dVar2;
            this.sortAccountsMiddlewareProvider = t8a.b(new com.yandex.passport.internal.flags.experiments.h(7, dVar2));
            this.selectAccountMiddlewareProvider = t8a.b(new l1(this.passportProcessGlobalComponentImpl.badgesReporterProvider, 23));
            PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl9 = this.passportProcessGlobalComponentImpl;
            this.showMansionMiddlewareProvider = t8a.b(new z0(passportProcessGlobalComponentImpl9.setPropertiesProvider, passportProcessGlobalComponentImpl9.flagRepositoryProvider, passportProcessGlobalComponentImpl9.bindPhoneNumberReporterProvider, passportProcessGlobalComponentImpl9.immediateAccountsRetrieverProvider, 17));
            PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl10 = this.passportProcessGlobalComponentImpl;
            this.slothSessionFactoryProvider = t8a.b(new h1(passportProcessGlobalComponentImpl10.slothDependenciesFactoryProvider, passportProcessGlobalComponentImpl10.slothBouncerPerformConfigurationProvider, 29));
            this.additionalInfoSaverProvider = t8a.b(com.yandex.passport.internal.ui.bouncer.model.b.a);
            rzm b2 = t8a.b(new com.yandex.passport.internal.flags.experiments.h(6, hVar));
            this.getTimeTrackerProvider = b2;
            rzm b3 = t8a.b(new h1(this.additionalInfoSaverProvider, b2, 22));
            this.bouncerEventsProvider = b3;
            this.startSlothMiddlewareProvider = t8a.b(new h1(this.slothSessionFactoryProvider, b3, 28));
            this.processFallbackResultMiddlewareProvider = t8a.b(new h1(this.bouncerEventsProvider, this.passportProcessGlobalComponentImpl.bouncerReporterProvider, 26));
            this.challengeStartMiddlewareProvider = t8a.b(new l1(this.passportProcessGlobalComponentImpl.challengeHelperProvider, 19));
        }

        private void initialize2(com.yandex.passport.internal.ui.bouncer.h hVar) {
            this.challengeFinishMiddlewareProvider = t8a.b(com.yandex.passport.internal.ui.bouncer.model.middleware.h.a);
            this.setCurrentAccountMiddlewareProvider = t8a.b(new l1(this.passportProcessGlobalComponentImpl.setCurrentAccountUseCaseProvider, 24));
            PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl = this.passportProcessGlobalComponentImpl;
            this.deleteBlockedMiddlewareProvider = t8a.b(new h1(passportProcessGlobalComponentImpl.provideAccountsRetrieverProvider, passportProcessGlobalComponentImpl.deleteAccountUseCaseProvider, 23));
            rzm b = t8a.b(com.yandex.passport.internal.ui.bouncer.model.middleware.h.b);
            this.checkConnectionMiddlewareProvider = b;
            this.bouncerMiddlewaresProvider = t8a.b(new com.yandex.passport.internal.ui.bouncer.model.middleware.d(this.loadAccountsMiddlewareProvider, this.sortAccountsMiddlewareProvider, this.selectAccountMiddlewareProvider, this.showMansionMiddlewareProvider, this.startSlothMiddlewareProvider, this.processFallbackResultMiddlewareProvider, this.challengeStartMiddlewareProvider, this.challengeFinishMiddlewareProvider, this.setCurrentAccountMiddlewareProvider, this.deleteBlockedMiddlewareProvider, b));
            rzm b2 = t8a.b(new l1(this.passportProcessGlobalComponentImpl.bindPhoneNumberReporterProvider, 18));
            this.bouncerWishMapperProvider = b2;
            this.bouncerModelProvider = t8a.b(new w(this.bouncerReducerProvider, this.bouncerActorsProvider, this.bouncerMiddlewaresProvider, b2, this.bouncerEventsProvider, 10));
        }

        @Override // com.yandex.passport.internal.ui.bouncer.model.a1
        public com.yandex.passport.internal.ui.bouncer.model.z0 getModel() {
            return (com.yandex.passport.internal.ui.bouncer.model.z0) this.bouncerModelProvider.get();
        }
    }

    public static final class BouncerSlothComposeComponentBuilder implements com.yandex.passport.internal.ui.bouncer.sloth.b {
        private final BouncerActivityComponentImpl bouncerActivityComponentImpl;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private com.yandex.passport.sloth.ui.a1 slothUiInteractor;

        private BouncerSlothComposeComponentBuilder(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, BouncerActivityComponentImpl bouncerActivityComponentImpl) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            this.bouncerActivityComponentImpl = bouncerActivityComponentImpl;
        }

        @Override // com.yandex.passport.internal.ui.bouncer.sloth.b
        public com.yandex.passport.internal.ui.bouncer.sloth.c build() {
            a4g.q(com.yandex.passport.sloth.ui.a1.class, this.slothUiInteractor);
            return new BouncerSlothComposeComponentImpl(this.passportProcessGlobalComponentImpl, this.bouncerActivityComponentImpl, new com.yandex.passport.internal.ui.bouncer.sloth.d(), this.slothUiInteractor);
        }

        @Override // com.yandex.passport.internal.ui.bouncer.sloth.b
        public BouncerSlothComposeComponentBuilder slothUiInteractor(com.yandex.passport.sloth.ui.a1 a1Var) {
            a1Var.getClass();
            this.slothUiInteractor = a1Var;
            return this;
        }
    }

    public static final class BouncerSlothComposeComponentImpl implements com.yandex.passport.internal.ui.bouncer.sloth.c {
        private final BouncerActivityComponentImpl bouncerActivityComponentImpl;
        private final BouncerSlothComposeComponentImpl bouncerSlothComposeComponentImpl = this;
        private final com.yandex.passport.internal.ui.bouncer.sloth.d bouncerSlothComposeModule;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private final com.yandex.passport.sloth.ui.a1 slothUiInteractor;

        public BouncerSlothComposeComponentImpl(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, BouncerActivityComponentImpl bouncerActivityComponentImpl, com.yandex.passport.internal.ui.bouncer.sloth.d dVar, com.yandex.passport.sloth.ui.a1 a1Var) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            this.bouncerActivityComponentImpl = bouncerActivityComponentImpl;
            this.slothUiInteractor = a1Var;
            this.bouncerSlothComposeModule = dVar;
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.common.common.a getApplicationDetailsProvider() {
            return (com.yandex.passport.common.common.a) this.passportProcessGlobalComponentImpl.bindApplicationDetailsProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.common.ui.progress.g getProgressProperties() {
            return this.bouncerActivityComponentImpl.progressProperties();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.g getSlothComposeUIReporter() {
            com.yandex.passport.internal.ui.bouncer.sloth.d dVar = this.bouncerSlothComposeModule;
            com.yandex.passport.internal.ui.sloth.c slothComposeUiReporterImpl = slothComposeUiReporterImpl();
            dVar.getClass();
            slothComposeUiReporterImpl.getClass();
            return slothComposeUiReporterImpl;
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.dependencies.d getSlothDebugInformationDelegate() {
            com.yandex.passport.internal.ui.bouncer.sloth.d dVar = this.bouncerSlothComposeModule;
            com.yandex.passport.internal.ui.sloth.d slothDebugInformationDelegateImpl = this.bouncerActivityComponentImpl.slothDebugInformationDelegateImpl();
            dVar.getClass();
            slothDebugInformationDelegateImpl.getClass();
            return slothDebugInformationDelegateImpl;
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.l getSlothNetworkStatus() {
            com.yandex.passport.internal.ui.bouncer.sloth.d dVar = this.bouncerSlothComposeModule;
            com.yandex.passport.internal.sloth.n slothNetworkStatusImpl = this.bouncerActivityComponentImpl.slothNetworkStatusImpl();
            dVar.getClass();
            slothNetworkStatusImpl.getClass();
            return slothNetworkStatusImpl;
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.a1 getSlothUiInteractor() {
            return this.slothUiInteractor;
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.dependencies.i getSlothUrlProvider() {
            com.yandex.passport.internal.ui.bouncer.sloth.d dVar = this.bouncerSlothComposeModule;
            com.yandex.passport.internal.sloth.w wVar = (com.yandex.passport.internal.sloth.w) this.passportProcessGlobalComponentImpl.slothUrlProviderImplProvider.get();
            dVar.getClass();
            wVar.getClass();
            return wVar;
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public o0 getSlothVariant() {
            com.yandex.passport.internal.ui.bouncer.sloth.d dVar = this.bouncerSlothComposeModule;
            com.yandex.passport.sloth.ui.a1 a1Var = this.slothUiInteractor;
            dVar.getClass();
            a1Var.getClass();
            o0 o0Var = ((c1) a1Var).a;
            a4g.t(o0Var);
            return o0Var;
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.dependencies.p getSlothWebViewSettings() {
            return (com.yandex.passport.sloth.ui.dependencies.p) this.bouncerActivityComponentImpl.provideSlothWebViewSettingsProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public q getSlothWishConsumer() {
            com.yandex.passport.internal.ui.bouncer.sloth.d dVar = this.bouncerSlothComposeModule;
            com.yandex.passport.internal.ui.bouncer.sloth.h hVar = (com.yandex.passport.internal.ui.bouncer.sloth.h) this.bouncerActivityComponentImpl.bouncerSlothWishConsumerProvider.get();
            dVar.getClass();
            hVar.getClass();
            return hVar;
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.string.b getStringRepository() {
            com.yandex.passport.internal.ui.bouncer.sloth.d dVar = this.bouncerSlothComposeModule;
            com.yandex.passport.internal.ui.sloth.g slothStringRepositoryImpl = this.bouncerActivityComponentImpl.slothStringRepositoryImpl();
            dVar.getClass();
            slothStringRepositoryImpl.getClass();
            return slothStringRepositoryImpl;
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public agv getWebViewSslErrorHandler() {
            com.yandex.passport.internal.ui.bouncer.sloth.d dVar = this.bouncerSlothComposeModule;
            Context context = this.passportProcessGlobalComponentImpl.setApplicationContext;
            dVar.getClass();
            context.getClass();
            return new com.yandex.passport.internal.ui.sloth.e(context);
        }

        public boolean isWhiteLabel() {
            return this.passportProcessGlobalComponentImpl.whiteLabelBoolean();
        }

        public com.yandex.passport.internal.ui.sloth.c slothComposeUiReporterImpl() {
            return new com.yandex.passport.internal.ui.sloth.c(this.passportProcessGlobalComponentImpl.getSlothReportDelegate());
        }
    }

    public static final class Builder implements PassportProcessGlobalComponent.Builder {
        private com.yandex.passport.internal.di.module.h networkModule;
        private com.yandex.passport.internal.di.module.p serviceModule;
        private Context setApplicationContext;
        private IReporterYandex setIReporterInternal;
        private com.yandex.passport.internal.properties.x setProperties;

        private Builder() {
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent.Builder
        public PassportProcessGlobalComponent build() {
            a4g.q(Context.class, this.setApplicationContext);
            a4g.q(IReporterYandex.class, this.setIReporterInternal);
            a4g.q(com.yandex.passport.internal.properties.x.class, this.setProperties);
            if (this.networkModule == null) {
                this.networkModule = new com.yandex.passport.internal.di.module.h();
            }
            if (this.serviceModule == null) {
                this.serviceModule = new com.yandex.passport.internal.di.module.p();
            }
            return new PassportProcessGlobalComponentImpl(new com.yandex.passport.internal.di.module.a(), new com.yandex.passport.internal.di.module.e(), this.networkModule, this.serviceModule, this.setApplicationContext, this.setIReporterInternal, this.setProperties);
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent.Builder
        public Builder networkModule(com.yandex.passport.internal.di.module.h hVar) {
            hVar.getClass();
            this.networkModule = hVar;
            return this;
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent.Builder
        public Builder serviceModule(com.yandex.passport.internal.di.module.p pVar) {
            pVar.getClass();
            this.serviceModule = pVar;
            return this;
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent.Builder
        public Builder setApplicationContext(Context context) {
            context.getClass();
            this.setApplicationContext = context;
            return this;
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent.Builder
        public Builder setIReporterInternal(IReporterYandex iReporterYandex) {
            iReporterYandex.getClass();
            this.setIReporterInternal = iReporterYandex;
            return this;
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent.Builder
        public Builder setProperties(com.yandex.passport.internal.properties.x xVar) {
            xVar.getClass();
            this.setProperties = xVar;
            return this;
        }
    }

    public static final class DeleteAccountComponentBuilder implements com.yandex.passport.internal.ui.challenge.delete.a {
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private Activity setActivity;
        private com.yandex.passport.internal.ui.challenge.delete.d setDeleteAccountProperties;

        private DeleteAccountComponentBuilder(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
        }

        @Override // com.yandex.passport.internal.ui.challenge.delete.a
        public com.yandex.passport.internal.ui.challenge.delete.b build() {
            a4g.q(com.yandex.passport.internal.ui.challenge.delete.d.class, this.setDeleteAccountProperties);
            a4g.q(Activity.class, this.setActivity);
            return new DeleteAccountComponentImpl(this.passportProcessGlobalComponentImpl, new com.yandex.passport.internal.ui.common.e(), new com.yandex.passport.internal.ui.challenge.delete.c(), this.setDeleteAccountProperties, this.setActivity);
        }

        @Override // com.yandex.passport.internal.ui.challenge.delete.a
        public DeleteAccountComponentBuilder setActivity(Activity activity) {
            activity.getClass();
            this.setActivity = activity;
            return this;
        }

        @Override // com.yandex.passport.internal.ui.challenge.delete.a
        public DeleteAccountComponentBuilder setDeleteAccountProperties(com.yandex.passport.internal.ui.challenge.delete.d dVar) {
            dVar.getClass();
            this.setDeleteAccountProperties = dVar;
            return this;
        }
    }

    public static final class DeleteAccountComponentImpl implements com.yandex.passport.internal.ui.challenge.delete.b {
        private final DeleteAccountComponentImpl deleteAccountComponentImpl = this;
        private final com.yandex.passport.internal.ui.challenge.delete.c deleteAccountModule;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        rzm providePerformConfigurationProvider;
        rzm setActivityProvider;
        private final com.yandex.passport.internal.ui.challenge.delete.d setDeleteAccountProperties;
        private final com.yandex.passport.internal.ui.common.e storeFactoryModule;

        public DeleteAccountComponentImpl(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, com.yandex.passport.internal.ui.common.e eVar, com.yandex.passport.internal.ui.challenge.delete.c cVar, com.yandex.passport.internal.ui.challenge.delete.d dVar, Activity activity) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            this.storeFactoryModule = eVar;
            this.deleteAccountModule = cVar;
            this.setDeleteAccountProperties = dVar;
            initialize(eVar, cVar, dVar, activity);
        }

        private void initialize(com.yandex.passport.internal.ui.common.e eVar, com.yandex.passport.internal.ui.challenge.delete.c cVar, com.yandex.passport.internal.ui.challenge.delete.d dVar, Activity activity) {
            this.providePerformConfigurationProvider = new k(cVar, this.passportProcessGlobalComponentImpl.slothStandalonePerformConfigurationProvider, 5);
            this.setActivityProvider = toe.a(activity);
        }

        public com.yandex.passport.internal.ui.challenge.delete.t deleteAccountStoreFactory() {
            return new com.yandex.passport.internal.ui.challenge.delete.t(com.yandex.passport.internal.ui.common.f.a(this.storeFactoryModule), uid(), getTheme(), (com.yandex.passport.internal.core.accounts.e) this.passportProcessGlobalComponentImpl.provideAccountsRetrieverProvider.get(), (com.yandex.passport.internal.usecase.ui.t) this.passportProcessGlobalComponentImpl.deleteAccountUseCaseProvider.get(), (com.yandex.passport.internal.account.b) this.passportProcessGlobalComponentImpl.currentAccountStorageProvider.get(), (com.yandex.passport.internal.usecase.ui.w) this.passportProcessGlobalComponentImpl.deletePhonishForeverUseCaseProvider.get(), (o1) this.passportProcessGlobalComponentImpl.webAmReporterProvider.get());
        }

        @Override // com.yandex.passport.internal.ui.challenge.delete.b
        public com.yandex.passport.internal.ui.challenge.delete.d getProperties() {
            return this.setDeleteAccountProperties;
        }

        @Override // com.yandex.passport.internal.ui.challenge.delete.b
        public com.yandex.passport.internal.ui.sloth.screen.e getSlothScreenComponentBuilder() {
            return new cypiuss_SlothScreenComponentBuilder(this.passportProcessGlobalComponentImpl, this.deleteAccountComponentImpl);
        }

        public com.yandex.passport.common.ui.a getTheme() {
            com.yandex.passport.internal.ui.challenge.delete.c cVar = this.deleteAccountModule;
            com.yandex.passport.internal.ui.challenge.delete.d dVar = this.setDeleteAccountProperties;
            cVar.getClass();
            dVar.getClass();
            return dVar.c;
        }

        @Override // com.yandex.passport.internal.ui.challenge.delete.b
        public com.yandex.passport.internal.ui.challenge.delete.y getViewModelFactory() {
            return new com.yandex.passport.internal.ui.challenge.delete.y(deleteAccountStoreFactory());
        }

        @Override // com.yandex.passport.internal.ui.challenge.delete.b
        public boolean isWhiteLabel() {
            return this.passportProcessGlobalComponentImpl.whiteLabelBoolean();
        }

        public com.yandex.passport.common.ui.progress.g progressProperties() {
            com.yandex.passport.internal.ui.challenge.delete.c cVar = this.deleteAccountModule;
            com.yandex.passport.internal.ui.challenge.delete.d dVar = this.setDeleteAccountProperties;
            cVar.getClass();
            dVar.getClass();
            return dVar.b;
        }

        public com.yandex.passport.common.core.f uid() {
            com.yandex.passport.internal.ui.challenge.delete.c cVar = this.deleteAccountModule;
            com.yandex.passport.internal.ui.challenge.delete.d dVar = this.setDeleteAccountProperties;
            cVar.getClass();
            dVar.getClass();
            return dVar.a;
        }
    }

    public static final class DeleteForeverActivityComponentImpl implements com.yandex.passport.internal.ui.challenge.delete.o0 {
        rzm baseSlothUiSettingsProvider;
        rzm challengeUiProvider;
        private final DeleteForeverActivityComponentImpl deleteForeverActivityComponentImpl = this;
        rzm deleteForeverSlothSlabProvider;
        rzm deleteForeverSlothUiProvider;
        rzm getActivityProvider;
        rzm getProgressPropertiesProvider;
        rzm getPropertiesProvider;
        rzm loadingUiProvider;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        rzm provideSlothWebViewSettingsProvider;
        rzm slothDebugInformationDelegateImplProvider;
        rzm slothNetworkStatusImplProvider;
        rzm slothSslErrorHandlerProvider;
        rzm slothStringRepositoryImplProvider;
        rzm slothUiDependenciesFactoryProvider;
        rzm standaloneWishConsumerProvider;
        rzm webUrlCheckerProvider;
        rzm webViewControllerProvider;
        rzm webViewSlabProvider;
        rzm webViewUiProvider;

        public DeleteForeverActivityComponentImpl(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, p0 p0Var) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            initialize(p0Var);
        }

        private void initialize(p0 p0Var) {
            this.getActivityProvider = t8a.b(new com.yandex.passport.internal.flags.experiments.h(4, p0Var));
            rzm b = t8a.b(new q0(p0Var, 0));
            this.getProgressPropertiesProvider = b;
            rzm b2 = t8a.b(new com.yandex.passport.internal.ui.common.c(this.passportProcessGlobalComponentImpl.setPropertiesProvider, this.getActivityProvider, b, 1));
            this.webViewUiProvider = b2;
            rzm b3 = t8a.b(new com.yandex.passport.internal.ui.bouncer.sloth.i(b2, 5));
            this.webViewControllerProvider = b3;
            PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl = this.passportProcessGlobalComponentImpl;
            com.yandex.passport.internal.ui.bouncer.sloth.i iVar = new com.yandex.passport.internal.ui.bouncer.sloth.i(passportProcessGlobalComponentImpl.urlCheckerProvider, 4);
            this.webUrlCheckerProvider = iVar;
            this.webViewSlabProvider = t8a.b(new com.yandex.passport.data.network.n(this.webViewUiProvider, this.getActivityProvider, b3, passportProcessGlobalComponentImpl.provideEventReporterProvider, iVar, 24));
            this.challengeUiProvider = t8a.b(new com.yandex.passport.internal.ui.bouncer.sloth.i(this.getActivityProvider, 1));
            this.loadingUiProvider = t8a.b(new com.yandex.passport.internal.ui.common.c(this.getActivityProvider, this.passportProcessGlobalComponentImpl.setPropertiesProvider, this.getProgressPropertiesProvider, 0));
            com.yandex.passport.common.coroutine.d dVar = new com.yandex.passport.common.coroutine.d(13);
            this.slothStringRepositoryImplProvider = dVar;
            PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl2 = this.passportProcessGlobalComponentImpl;
            com.yandex.passport.internal.ui.bouncer.sloth.i iVar2 = new com.yandex.passport.internal.ui.bouncer.sloth.i(passportProcessGlobalComponentImpl2.provideDebugInfoUtilProvider, 9);
            this.slothDebugInformationDelegateImplProvider = iVar2;
            rzm rzmVar = this.getActivityProvider;
            rzm rzmVar2 = passportProcessGlobalComponentImpl2.provideCoroutineScopesProvider;
            h1 h1Var = new h1(rzmVar, rzmVar2, 7);
            this.slothNetworkStatusImplProvider = h1Var;
            com.yandex.passport.internal.ui.bouncer.sloth.i iVar3 = new com.yandex.passport.internal.ui.bouncer.sloth.i(passportProcessGlobalComponentImpl2.setApplicationContextProvider, 10);
            this.slothSslErrorHandlerProvider = iVar3;
            this.slothUiDependenciesFactoryProvider = new com.yandex.passport.internal.ui.sloth.i(rzmVar, dVar, rzmVar2, iVar2, h1Var, passportProcessGlobalComponentImpl2.applicationDetailsProviderImplProvider, iVar3, passportProcessGlobalComponentImpl2.slothUrlProviderImplProvider, 0);
            this.baseSlothUiSettingsProvider = t8a.b(new com.yandex.passport.internal.ui.bouncer.roundabout.d(this.getProgressPropertiesProvider, passportProcessGlobalComponentImpl2.setPropertiesProvider, 5));
            this.standaloneWishConsumerProvider = t8a.b(new com.yandex.passport.internal.ui.bouncer.sloth.i(this.getActivityProvider, 13));
            rzm b4 = t8a.b(new q0(p0Var, 1));
            this.getPropertiesProvider = b4;
            rzm b5 = t8a.b(new k(p0Var, b4, 6));
            this.provideSlothWebViewSettingsProvider = b5;
            rzm b6 = t8a.b(new z0(this.slothUiDependenciesFactoryProvider, this.baseSlothUiSettingsProvider, this.standaloneWishConsumerProvider, b5, 20));
            this.deleteForeverSlothSlabProvider = b6;
            this.deleteForeverSlothUiProvider = t8a.b(new com.yandex.passport.internal.ui.bouncer.sloth.i(b6, 2));
        }

        @Override // com.yandex.passport.internal.ui.challenge.delete.o0
        public k1 getDeleteForeverSlothUi() {
            return (k1) this.deleteForeverSlothUiProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.challenge.delete.o0
        public x0 getGetLocationIdUseCase() {
            return (x0) this.passportProcessGlobalComponentImpl.getLocationIdUseCaseProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.challenge.f
        public com.yandex.passport.internal.ui.common.b getLoader() {
            return (com.yandex.passport.internal.ui.common.b) this.loadingUiProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.challenge.delete.o0
        public com.yandex.passport.internal.properties.r getProperties() {
            return (com.yandex.passport.internal.properties.r) this.getPropertiesProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.challenge.f
        public com.yandex.passport.internal.ui.challenge.w getUi() {
            return (com.yandex.passport.internal.ui.challenge.w) this.challengeUiProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.challenge.f
        public com.yandex.passport.internal.ui.common.web.g getWebSlab() {
            return (com.yandex.passport.internal.ui.common.web.g) this.webViewSlabProvider.get();
        }
    }

    public static final class DeleteForeverComponentBuilder implements com.yandex.passport.internal.ui.challenge.delete.r0 {
        private com.yandex.passport.internal.ui.challenge.o challengeData;
        private Boolean isChallengeNeeded;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private q1 viewModel;

        private DeleteForeverComponentBuilder(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
        }

        @Override // com.yandex.passport.internal.ui.challenge.delete.r0
        public s0 build() {
            a4g.q(com.yandex.passport.internal.ui.challenge.o.class, this.challengeData);
            a4g.q(Boolean.class, this.isChallengeNeeded);
            a4g.q(q1.class, this.viewModel);
            return new DeleteForeverComponentImpl(this.passportProcessGlobalComponentImpl, this.challengeData, this.isChallengeNeeded, this.viewModel);
        }

        @Override // com.yandex.passport.internal.ui.challenge.delete.r0
        public DeleteForeverComponentBuilder challengeData(com.yandex.passport.internal.ui.challenge.o oVar) {
            oVar.getClass();
            this.challengeData = oVar;
            return this;
        }

        @Override // com.yandex.passport.internal.ui.challenge.delete.r0
        public DeleteForeverComponentBuilder isChallengeNeeded(boolean z) {
            this.isChallengeNeeded = Boolean.valueOf(z);
            return this;
        }

        @Override // com.yandex.passport.internal.ui.challenge.delete.r0
        public DeleteForeverComponentBuilder viewModel(q1 q1Var) {
            q1Var.getClass();
            this.viewModel = q1Var;
            return this;
        }
    }

    public static final class DeleteForeverComponentImpl implements s0 {
        rzm challengeDataProvider;
        private final DeleteForeverComponentImpl deleteForeverComponentImpl = this;
        rzm deleteForeverModelProvider;
        rzm isChallengeNeededProvider;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        rzm viewModelProvider;

        public DeleteForeverComponentImpl(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, com.yandex.passport.internal.ui.challenge.o oVar, Boolean bool, q1 q1Var) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            initialize(oVar, bool, q1Var);
        }

        private void initialize(com.yandex.passport.internal.ui.challenge.o oVar, Boolean bool, q1 q1Var) {
            this.challengeDataProvider = toe.a(oVar);
            this.viewModelProvider = toe.a(q1Var);
            toe a = toe.a(bool);
            this.isChallengeNeededProvider = a;
            rzm rzmVar = this.challengeDataProvider;
            rzm rzmVar2 = this.viewModelProvider;
            PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl = this.passportProcessGlobalComponentImpl;
            this.deleteForeverModelProvider = new i1(rzmVar, rzmVar2, passportProcessGlobalComponentImpl.challengeHelperProvider, a, passportProcessGlobalComponentImpl.provideAccountsRetrieverProvider, passportProcessGlobalComponentImpl.deletePhonishForeverUseCaseProvider, passportProcessGlobalComponentImpl.deleteAccountUseCaseProvider, passportProcessGlobalComponentImpl.currentAccountStorageProvider, passportProcessGlobalComponentImpl.flagRepositoryProvider);
        }

        @Override // com.yandex.passport.internal.ui.challenge.delete.s0
        public szm getSessionProvider() {
            return this.deleteForeverModelProvider;
        }
    }

    public static final class DomikComponentImpl implements com.yandex.passport.internal.ui.domik.di.a {
        rzm authRouterProvider;
        private final DomikComponentImpl domikComponentImpl = this;
        rzm domikDesignProvider;
        rzm domikRouterProvider;
        rzm getCommonViewModelProvider;
        rzm getLoginPropertiesProvider;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        rzm phonishReporterProvider;
        rzm regRouterProvider;

        public DomikComponentImpl(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, com.yandex.passport.internal.ui.domik.di.b bVar) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            initialize(bVar);
        }

        private void initialize(com.yandex.passport.internal.ui.domik.di.b bVar) {
            this.getCommonViewModelProvider = t8a.b(new com.yandex.passport.internal.ui.domik.di.c(bVar, 0));
            rzm b = t8a.b(new com.yandex.passport.internal.ui.domik.di.c(bVar, 1));
            this.getLoginPropertiesProvider = b;
            PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl = this.passportProcessGlobalComponentImpl;
            com.yandex.passport.internal.provider.communication.w wVar = new com.yandex.passport.internal.provider.communication.w(passportProcessGlobalComponentImpl.eventReporterProvider, passportProcessGlobalComponentImpl.reportingFeatureProvider, 21);
            this.phonishReporterProvider = wVar;
            this.domikRouterProvider = t8a.b(new com.yandex.passport.data.network.n(this.getCommonViewModelProvider, passportProcessGlobalComponentImpl.flagRepositoryProvider, b, passportProcessGlobalComponentImpl.domikStatefulReporterProvider, wVar, 25));
            this.domikDesignProvider = t8a.b(com.yandex.passport.internal.ui.domik.m.a);
            this.regRouterProvider = t8a.b(new com.yandex.passport.internal.ui.bouncer.sloth.i(this.getCommonViewModelProvider, 7));
            this.authRouterProvider = t8a.b(new com.yandex.passport.internal.ui.bouncer.sloth.i(this.getCommonViewModelProvider, 6));
        }

        @Override // com.yandex.passport.internal.ui.domik.di.a
        public com.yandex.passport.internal.ui.domik.l getDomikDesignProvider() {
            return (com.yandex.passport.internal.ui.domik.l) this.domikDesignProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.domik.di.a
        public com.yandex.passport.internal.ui.domik.v getDomikRouter() {
            return (com.yandex.passport.internal.ui.domik.v) this.domikRouterProvider.get();
        }

        public com.yandex.passport.internal.properties.l getLoginProperties() {
            return (com.yandex.passport.internal.properties.l) this.getLoginPropertiesProvider.get();
        }

        public u0 getPhonishReporter() {
            return new u0((com.yandex.passport.internal.report.g) this.passportProcessGlobalComponentImpl.eventReporterProvider.get(), (com.yandex.passport.internal.features.a) this.passportProcessGlobalComponentImpl.reportingFeatureProvider.get());
        }

        @Override // com.yandex.passport.internal.ui.domik.di.a
        public com.yandex.passport.internal.ui.domik.smsauth.b newAuthBySmsViewModel() {
            return new com.yandex.passport.internal.ui.domik.smsauth.b((com.yandex.passport.internal.network.mappers.b) this.passportProcessGlobalComponentImpl.environmentDataMapperProvider.get(), (cb) this.passportProcessGlobalComponentImpl.smsCodeVerificationRequestProvider.get(), (com.yandex.passport.internal.helper.g) this.passportProcessGlobalComponentImpl.domikLoginHelperProvider.get(), (com.yandex.passport.internal.ui.domik.v) this.domikRouterProvider.get(), (n0) this.passportProcessGlobalComponentImpl.domikStatefulReporterProvider.get(), (com.yandex.passport.internal.usecase.ui.r0) this.passportProcessGlobalComponentImpl.requestSmsUseCaseProvider2.get(), getPhonishReporter(), (com.yandex.passport.internal.properties.l) this.getLoginPropertiesProvider.get());
        }

        public com.yandex.passport.internal.ui.domik.call.a newCallConfirmViewModel() {
            return new com.yandex.passport.internal.ui.domik.call.a((com.yandex.passport.internal.helper.g) this.passportProcessGlobalComponentImpl.domikLoginHelperProvider.get(), (cb) this.passportProcessGlobalComponentImpl.smsCodeVerificationRequestProvider.get(), (com.yandex.passport.internal.ui.domik.v) this.domikRouterProvider.get(), (com.yandex.passport.internal.network.mappers.b) this.passportProcessGlobalComponentImpl.environmentDataMapperProvider.get(), (com.yandex.passport.internal.ui.domik.y) this.regRouterProvider.get(), (n0) this.passportProcessGlobalComponentImpl.domikStatefulReporterProvider.get(), (n1) this.passportProcessGlobalComponentImpl.startRegistrationUseCaseProvider.get());
        }

        @Override // com.yandex.passport.internal.ui.domik.di.a
        public com.yandex.passport.internal.ui.domik.extaction.b newExternalActionViewModel() {
            return new com.yandex.passport.internal.ui.domik.extaction.b((com.yandex.passport.internal.usecase.authorize.c) this.passportProcessGlobalComponentImpl.authByCookieUseCaseProvider.get(), (com.yandex.passport.internal.analytics.o0) this.passportProcessGlobalComponentImpl.provideEventReporterProvider.get(), (com.yandex.passport.internal.ui.domik.v) this.domikRouterProvider.get(), (com.yandex.passport.common.coroutine.a) this.passportProcessGlobalComponentImpl.provideCoroutineDispatchersProvider.get(), (n0) this.passportProcessGlobalComponentImpl.domikStatefulReporterProvider.get());
        }

        @Override // com.yandex.passport.internal.ui.domik.di.a
        public com.yandex.passport.internal.ui.domik.identifier.d newIdentifierCredentialManagerViewModel() {
            return new com.yandex.passport.internal.ui.domik.identifier.d();
        }

        @Override // com.yandex.passport.internal.ui.domik.di.a
        public com.yandex.passport.internal.ui.domik.phone_number.b newPhoneNumberViewModel() {
            return new com.yandex.passport.internal.ui.domik.phone_number.b((com.yandex.passport.internal.ui.domik.y) this.regRouterProvider.get(), (n0) this.passportProcessGlobalComponentImpl.domikStatefulReporterProvider.get(), (n1) this.passportProcessGlobalComponentImpl.startRegistrationUseCaseProvider.get(), getPhonishReporter(), (com.yandex.passport.internal.properties.l) this.getLoginPropertiesProvider.get());
        }

        @Override // com.yandex.passport.internal.ui.domik.di.a
        public com.yandex.passport.internal.ui.domik.relogin.d newReloginViewModel() {
            return new com.yandex.passport.internal.ui.domik.relogin.d((com.yandex.passport.internal.ui.domik.v) this.domikRouterProvider.get(), (com.yandex.passport.internal.ui.domik.b) this.authRouterProvider.get(), (n0) this.passportProcessGlobalComponentImpl.domikStatefulReporterProvider.get(), (com.yandex.passport.internal.usecase.ui.r0) this.passportProcessGlobalComponentImpl.requestSmsUseCaseProvider2.get(), (com.yandex.passport.internal.usecase.ui.i1) this.passportProcessGlobalComponentImpl.startAuthorizationUseCaseProvider.get());
        }

        @Override // com.yandex.passport.internal.ui.domik.di.a
        public com.yandex.passport.internal.ui.domik.sms.b newSmsViewModel() {
            return new com.yandex.passport.internal.ui.domik.sms.b((com.yandex.passport.internal.helper.g) this.passportProcessGlobalComponentImpl.domikLoginHelperProvider.get(), (com.yandex.passport.internal.analytics.o0) this.passportProcessGlobalComponentImpl.provideEventReporterProvider.get(), (com.yandex.passport.internal.ui.domik.v) this.domikRouterProvider.get(), (cb) this.passportProcessGlobalComponentImpl.smsCodeVerificationRequestProvider.get(), (com.yandex.passport.internal.network.mappers.b) this.passportProcessGlobalComponentImpl.environmentDataMapperProvider.get(), (n0) this.passportProcessGlobalComponentImpl.domikStatefulReporterProvider.get(), (com.yandex.passport.internal.usecase.ui.r0) this.passportProcessGlobalComponentImpl.requestSmsUseCaseProvider.get(), (com.yandex.passport.internal.ui.domik.y) this.regRouterProvider.get(), getPhonishReporter(), (com.yandex.passport.internal.properties.l) this.getLoginPropertiesProvider.get(), (com.yandex.passport.internal.core.accounts.e) this.passportProcessGlobalComponentImpl.provideAccountsRetrieverProvider.get());
        }

        @Override // com.yandex.passport.internal.ui.domik.di.a
        public com.yandex.passport.internal.ui.domik.username.b newUsernameInputViewModel() {
            return new com.yandex.passport.internal.ui.domik.username.b(upgradePhonishUseCase(), (com.yandex.passport.internal.ui.domik.v) this.domikRouterProvider.get());
        }

        public r9 phonishToNeophonishRequest() {
            return new r9((com.yandex.passport.common.coroutine.a) this.passportProcessGlobalComponentImpl.provideCoroutineDispatchersProvider.get(), (com.yandex.passport.common.network.j0) this.passportProcessGlobalComponentImpl.provideRetryingOkHttpUseCaseProvider.get(), (com.yandex.passport.internal.network.b) this.passportProcessGlobalComponentImpl.provideBackendReporterWrapperProvider.get(), requestFactory(), (com.yandex.passport.data.network.core.s) this.passportProcessGlobalComponentImpl.provideMasterTokenTombstoneManagerProvider.get());
        }

        public q9 requestFactory() {
            return new q9((com.yandex.passport.data.network.core.t) this.passportProcessGlobalComponentImpl.requestCreatorProvider.get(), (com.yandex.passport.data.network.core.l) this.passportProcessGlobalComponentImpl.commonBackendQueryProvider.get());
        }

        public com.yandex.passport.internal.usecase.ui.q1 upgradePhonishUseCase() {
            return new com.yandex.passport.internal.usecase.ui.q1((com.yandex.passport.common.coroutine.a) this.passportProcessGlobalComponentImpl.provideCoroutineDispatchersProvider.get(), phonishToNeophonishRequest(), (com.yandex.passport.internal.network.mappers.b) this.passportProcessGlobalComponentImpl.environmentDataMapperProvider.get(), getPhonishReporter(), (com.yandex.passport.internal.usecase.s0) this.passportProcessGlobalComponentImpl.getClientTokenUseCaseProvider.get(), new com.yandex.passport.data.network.token.i(14), this.passportProcessGlobalComponentImpl.fetchAndSaveModernAccountUseCase());
        }
    }

    public static final class EsiaBindComponentImpl implements com.yandex.passport.internal.social.esia.e {
        private final EsiaBindComponentImpl esiaBindComponentImpl = this;
        private final com.yandex.passport.internal.social.esia.f esiaBindModule;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private final com.yandex.passport.internal.social.esia.q0 setEsiaInternalBindProperties;
        private final com.yandex.passport.internal.ui.common.e storeFactoryModule;

        public EsiaBindComponentImpl(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, com.yandex.passport.internal.ui.common.e eVar, com.yandex.passport.internal.social.esia.f fVar, com.yandex.passport.internal.social.esia.q0 q0Var) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            this.storeFactoryModule = eVar;
            this.esiaBindModule = fVar;
            this.setEsiaInternalBindProperties = q0Var;
        }

        public com.yandex.passport.internal.social.esia.x esiaBindStoreFactory() {
            return new com.yandex.passport.internal.social.esia.x(com.yandex.passport.internal.ui.common.f.a(this.storeFactoryModule), (e0) this.passportProcessGlobalComponentImpl.getAuthorizationUrlUseCaseProvider.get(), (com.yandex.passport.common.ui.lang.b) this.passportProcessGlobalComponentImpl.bindUiLanguageProvider.get(), socialismUrlProvider(), (z) this.passportProcessGlobalComponentImpl.esiaBindingReporterProvider.get(), esiaReturnUrlProvider());
        }

        public com.yandex.passport.internal.social.esia.r0 esiaReturnUrlProvider() {
            com.yandex.passport.internal.social.esia.f fVar = this.esiaBindModule;
            Context context = this.passportProcessGlobalComponentImpl.setApplicationContext;
            fVar.getClass();
            context.getClass();
            return new com.yandex.passport.internal.social.esia.r0(context);
        }

        @Override // com.yandex.passport.internal.social.esia.e
        public z getEsiaBindingReporter() {
            return (z) this.passportProcessGlobalComponentImpl.esiaBindingReporterProvider.get();
        }

        @Override // com.yandex.passport.internal.social.esia.e
        public com.yandex.passport.internal.social.esia.y getViewModelFactory() {
            return new com.yandex.passport.internal.social.esia.y(esiaBindStoreFactory(), this.setEsiaInternalBindProperties, (i) this.passportProcessGlobalComponentImpl.flagRepositoryProvider.get());
        }

        public w0 socialismUrlProvider() {
            return new w0((com.yandex.passport.data.network.core.l) this.passportProcessGlobalComponentImpl.commonBackendQueryProvider.get());
        }
    }

    public static final class LogoutActivityComponentImpl implements com.yandex.passport.internal.ui.challenge.logout.b {
        rzm challengeUiProvider;
        rzm getActivityProvider;
        rzm getProgressPropertiesProvider;
        rzm loadingUiProvider;
        private final LogoutActivityComponentImpl logoutActivityComponentImpl = this;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        rzm webUrlCheckerProvider;
        rzm webViewControllerProvider;
        rzm webViewSlabProvider;
        rzm webViewUiProvider;

        public LogoutActivityComponentImpl(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, com.yandex.passport.internal.ui.challenge.logout.c cVar) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            initialize(cVar);
        }

        private void initialize(com.yandex.passport.internal.ui.challenge.logout.c cVar) {
            this.getActivityProvider = t8a.b(new com.yandex.passport.internal.flags.experiments.h(4, cVar));
            rzm b = t8a.b(new com.yandex.passport.internal.flags.experiments.h(8, cVar));
            this.getProgressPropertiesProvider = b;
            rzm b2 = t8a.b(new com.yandex.passport.internal.ui.common.c(this.passportProcessGlobalComponentImpl.setPropertiesProvider, this.getActivityProvider, b, 1));
            this.webViewUiProvider = b2;
            rzm b3 = t8a.b(new com.yandex.passport.internal.ui.bouncer.sloth.i(b2, 5));
            this.webViewControllerProvider = b3;
            PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl = this.passportProcessGlobalComponentImpl;
            com.yandex.passport.internal.ui.bouncer.sloth.i iVar = new com.yandex.passport.internal.ui.bouncer.sloth.i(passportProcessGlobalComponentImpl.urlCheckerProvider, 4);
            this.webUrlCheckerProvider = iVar;
            this.webViewSlabProvider = t8a.b(new com.yandex.passport.data.network.n(this.webViewUiProvider, this.getActivityProvider, b3, passportProcessGlobalComponentImpl.provideEventReporterProvider, iVar, 24));
            this.challengeUiProvider = t8a.b(new com.yandex.passport.internal.ui.bouncer.sloth.i(this.getActivityProvider, 1));
            this.loadingUiProvider = t8a.b(new com.yandex.passport.internal.ui.common.c(this.getActivityProvider, this.passportProcessGlobalComponentImpl.setPropertiesProvider, this.getProgressPropertiesProvider, 0));
        }

        @Override // com.yandex.passport.internal.ui.challenge.f
        public com.yandex.passport.internal.ui.common.b getLoader() {
            return (com.yandex.passport.internal.ui.common.b) this.loadingUiProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.challenge.f
        public com.yandex.passport.internal.ui.challenge.w getUi() {
            return (com.yandex.passport.internal.ui.challenge.w) this.challengeUiProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.challenge.f
        public com.yandex.passport.internal.ui.common.web.g getWebSlab() {
            return (com.yandex.passport.internal.ui.common.web.g) this.webViewSlabProvider.get();
        }
    }

    public static final class LogoutBottomSheetActivityComponentBuilder implements com.yandex.passport.internal.ui.challenge.logout.bottomsheet.l {
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;

        private LogoutBottomSheetActivityComponentBuilder(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
        }

        @Override // com.yandex.passport.internal.ui.challenge.logout.bottomsheet.l
        public com.yandex.passport.internal.ui.challenge.logout.bottomsheet.m build() {
            return new LogoutBottomSheetActivityComponentImpl(this.passportProcessGlobalComponentImpl);
        }
    }

    public static final class LogoutBottomSheetActivityComponentImpl implements com.yandex.passport.internal.ui.challenge.logout.bottomsheet.m {
        private final LogoutBottomSheetActivityComponentImpl logoutBottomSheetActivityComponentImpl = this;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;

        public LogoutBottomSheetActivityComponentImpl(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
        }

        private LogoutBottomSheetActivity injectLogoutBottomSheetActivity(LogoutBottomSheetActivity logoutBottomSheetActivity) {
            logoutBottomSheetActivity.a = (i) this.passportProcessGlobalComponentImpl.flagRepositoryProvider.get();
            logoutBottomSheetActivity.b = logoutReporterImpl();
            return logoutBottomSheetActivity;
        }

        @Override // com.yandex.passport.internal.ui.challenge.logout.bottomsheet.m
        public void inject(LogoutBottomSheetActivity logoutBottomSheetActivity) {
            injectLogoutBottomSheetActivity(logoutBottomSheetActivity);
        }

        public i0 logoutReporterImpl() {
            return new i0((com.yandex.passport.internal.report.g) this.passportProcessGlobalComponentImpl.eventReporterProvider.get());
        }
    }

    public static final class LogoutBottomSheetComposeComponentBuilder implements com.yandex.passport.internal.ui.challenge.logout.bottomsheet.o {
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private com.yandex.passport.internal.ui.challenge.logout.t setProperties;

        private LogoutBottomSheetComposeComponentBuilder(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
        }

        @Override // com.yandex.passport.internal.ui.challenge.logout.bottomsheet.o
        public com.yandex.passport.internal.ui.challenge.logout.bottomsheet.p build() {
            a4g.q(com.yandex.passport.internal.ui.challenge.logout.t.class, this.setProperties);
            return new LogoutBottomSheetComposeComponentImpl(this.passportProcessGlobalComponentImpl, new com.yandex.passport.internal.ui.challenge.logout.bottomsheet.q(), new com.yandex.passport.internal.ui.common.e(), this.setProperties);
        }

        @Override // com.yandex.passport.internal.ui.challenge.logout.bottomsheet.o
        public LogoutBottomSheetComposeComponentBuilder setProperties(com.yandex.passport.internal.ui.challenge.logout.t tVar) {
            tVar.getClass();
            this.setProperties = tVar;
            return this;
        }
    }

    public static final class LogoutBottomSheetComposeComponentImpl implements com.yandex.passport.internal.ui.challenge.logout.bottomsheet.p {
        private final LogoutBottomSheetComposeComponentImpl logoutBottomSheetComposeComponentImpl = this;
        private final com.yandex.passport.internal.ui.challenge.logout.bottomsheet.q logoutBottomSheetComposeModule;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private final com.yandex.passport.internal.ui.challenge.logout.t setProperties;
        private final com.yandex.passport.internal.ui.common.e storeFactoryModule;

        public LogoutBottomSheetComposeComponentImpl(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, com.yandex.passport.internal.ui.challenge.logout.bottomsheet.q qVar, com.yandex.passport.internal.ui.common.e eVar, com.yandex.passport.internal.ui.challenge.logout.t tVar) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            this.storeFactoryModule = eVar;
            this.setProperties = tVar;
            this.logoutBottomSheetComposeModule = qVar;
        }

        @Override // com.yandex.passport.internal.ui.challenge.logout.bottomsheet.p
        public i getFlagRepository() {
            return (i) this.passportProcessGlobalComponentImpl.flagRepositoryProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.challenge.logout.bottomsheet.p
        public h0 getLogoutReporter() {
            com.yandex.passport.internal.ui.challenge.logout.bottomsheet.q qVar = this.logoutBottomSheetComposeModule;
            i0 logoutReporterImpl = logoutReporterImpl();
            qVar.getClass();
            logoutReporterImpl.getClass();
            return logoutReporterImpl;
        }

        @Override // com.yandex.passport.internal.ui.challenge.logout.bottomsheet.p
        public com.yandex.passport.internal.ui.challenge.logout.bottomsheet.d0 getViewModelFactory() {
            return new com.yandex.passport.internal.ui.challenge.logout.bottomsheet.d0(logoutBottomSheetComposeStoreFactory());
        }

        public b0 logoutBottomSheetComposeStoreFactory() {
            return new b0(com.yandex.passport.internal.ui.common.f.a(this.storeFactoryModule), (com.yandex.passport.internal.core.accounts.e) this.passportProcessGlobalComponentImpl.provideAccountsRetrieverProvider.get(), (i) this.passportProcessGlobalComponentImpl.flagRepositoryProvider.get(), (com.yandex.passport.internal.core.accounts.s) this.passportProcessGlobalComponentImpl.memberAccountRepositoryProvider.get(), this.setProperties, this.passportProcessGlobalComponentImpl.whiteLabelBoolean());
        }

        public i0 logoutReporterImpl() {
            return new i0((com.yandex.passport.internal.report.g) this.passportProcessGlobalComponentImpl.eventReporterProvider.get());
        }
    }

    public static final class LogoutComponentBuilder implements com.yandex.passport.internal.ui.challenge.logout.e {
        private com.yandex.passport.internal.ui.challenge.logout.d behaviour;
        private com.yandex.passport.internal.ui.challenge.o challengeData;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private com.yandex.passport.internal.ui.challenge.logout.f0 viewModel;

        private LogoutComponentBuilder(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
        }

        @Override // com.yandex.passport.internal.ui.challenge.logout.e
        public LogoutComponentBuilder behaviour(com.yandex.passport.internal.ui.challenge.logout.d dVar) {
            dVar.getClass();
            this.behaviour = dVar;
            return this;
        }

        @Override // com.yandex.passport.internal.ui.challenge.logout.e
        public com.yandex.passport.internal.ui.challenge.logout.f build() {
            a4g.q(com.yandex.passport.internal.ui.challenge.o.class, this.challengeData);
            a4g.q(com.yandex.passport.internal.ui.challenge.logout.f0.class, this.viewModel);
            a4g.q(com.yandex.passport.internal.ui.challenge.logout.d.class, this.behaviour);
            return new LogoutComponentImpl(this.passportProcessGlobalComponentImpl, this.challengeData, this.viewModel, this.behaviour);
        }

        @Override // com.yandex.passport.internal.ui.challenge.logout.e
        public LogoutComponentBuilder challengeData(com.yandex.passport.internal.ui.challenge.o oVar) {
            oVar.getClass();
            this.challengeData = oVar;
            return this;
        }

        @Override // com.yandex.passport.internal.ui.challenge.logout.e
        public LogoutComponentBuilder viewModel(com.yandex.passport.internal.ui.challenge.logout.f0 f0Var) {
            f0Var.getClass();
            this.viewModel = f0Var;
            return this;
        }
    }

    public static final class LogoutComponentImpl implements com.yandex.passport.internal.ui.challenge.logout.f {
        rzm behaviourProvider;
        rzm challengeDataProvider;
        private final LogoutComponentImpl logoutComponentImpl = this;
        rzm logoutModelProvider;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        rzm viewModelProvider;

        public LogoutComponentImpl(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, com.yandex.passport.internal.ui.challenge.o oVar, com.yandex.passport.internal.ui.challenge.logout.f0 f0Var, com.yandex.passport.internal.ui.challenge.logout.d dVar) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            initialize(oVar, f0Var, dVar);
        }

        private void initialize(com.yandex.passport.internal.ui.challenge.o oVar, com.yandex.passport.internal.ui.challenge.logout.f0 f0Var, com.yandex.passport.internal.ui.challenge.logout.d dVar) {
            this.challengeDataProvider = toe.a(oVar);
            this.viewModelProvider = toe.a(f0Var);
            toe a = toe.a(dVar);
            this.behaviourProvider = a;
            rzm rzmVar = this.challengeDataProvider;
            rzm rzmVar2 = this.viewModelProvider;
            PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl = this.passportProcessGlobalComponentImpl;
            this.logoutModelProvider = new com.yandex.passport.internal.di.module.n(rzmVar, rzmVar2, passportProcessGlobalComponentImpl.challengeHelperProvider, passportProcessGlobalComponentImpl.logoutUseCaseProvider, a, passportProcessGlobalComponentImpl.findModernAccountUseCaseProvider, passportProcessGlobalComponentImpl.deleteAccountUseCaseProvider);
        }

        @Override // com.yandex.passport.internal.ui.challenge.logout.f
        public szm getSessionProvider() {
            return this.logoutModelProvider;
        }
    }

    public static final class LogoutComposeComponentBuilder implements com.yandex.passport.internal.ui.challenge.logout.i {
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private com.yandex.passport.internal.ui.challenge.logout.d setLogoutBehaviour;
        private com.yandex.passport.common.ui.progress.g setProgressProperties;
        private com.yandex.passport.common.ui.a setTheme;
        private com.yandex.passport.common.core.f setUid;

        private LogoutComposeComponentBuilder(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
        }

        @Override // com.yandex.passport.internal.ui.challenge.logout.i
        public j build() {
            a4g.q(com.yandex.passport.common.core.f.class, this.setUid);
            a4g.q(com.yandex.passport.common.ui.a.class, this.setTheme);
            a4g.q(com.yandex.passport.common.ui.progress.g.class, this.setProgressProperties);
            a4g.q(com.yandex.passport.internal.ui.challenge.logout.d.class, this.setLogoutBehaviour);
            return new LogoutComposeComponentImpl(this.passportProcessGlobalComponentImpl, new com.yandex.passport.internal.ui.common.e(), this.setUid, this.setTheme, this.setProgressProperties, this.setLogoutBehaviour);
        }

        @Override // com.yandex.passport.internal.ui.challenge.logout.i
        public LogoutComposeComponentBuilder setLogoutBehaviour(com.yandex.passport.internal.ui.challenge.logout.d dVar) {
            dVar.getClass();
            this.setLogoutBehaviour = dVar;
            return this;
        }

        @Override // com.yandex.passport.internal.ui.challenge.logout.i
        public LogoutComposeComponentBuilder setProgressProperties(com.yandex.passport.common.ui.progress.g gVar) {
            gVar.getClass();
            this.setProgressProperties = gVar;
            return this;
        }

        @Override // com.yandex.passport.internal.ui.challenge.logout.i
        public LogoutComposeComponentBuilder setTheme(com.yandex.passport.common.ui.a aVar) {
            aVar.getClass();
            this.setTheme = aVar;
            return this;
        }

        @Override // com.yandex.passport.internal.ui.challenge.logout.i
        public LogoutComposeComponentBuilder setUid(com.yandex.passport.common.core.f fVar) {
            fVar.getClass();
            this.setUid = fVar;
            return this;
        }
    }

    public static final class LogoutComposeComponentImpl implements j {
        private final LogoutComposeComponentImpl logoutComposeComponentImpl = this;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private final com.yandex.passport.internal.ui.challenge.logout.d setLogoutBehaviour;
        private final com.yandex.passport.common.ui.progress.g setProgressProperties;
        private final com.yandex.passport.common.ui.a setTheme;
        private final com.yandex.passport.common.core.f setUid;
        private final com.yandex.passport.internal.ui.common.e storeFactoryModule;

        public LogoutComposeComponentImpl(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, com.yandex.passport.internal.ui.common.e eVar, com.yandex.passport.common.core.f fVar, com.yandex.passport.common.ui.a aVar, com.yandex.passport.common.ui.progress.g gVar, com.yandex.passport.internal.ui.challenge.logout.d dVar) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            this.storeFactoryModule = eVar;
            this.setUid = fVar;
            this.setTheme = aVar;
            this.setLogoutBehaviour = dVar;
            this.setProgressProperties = gVar;
        }

        public com.yandex.passport.internal.ui.challenge.m challengeChecker() {
            return new com.yandex.passport.internal.ui.challenge.m((com.yandex.passport.internal.ui.challenge.s) this.passportProcessGlobalComponentImpl.challengeHelperProvider.get());
        }

        @Override // com.yandex.passport.internal.ui.challenge.logout.j
        public com.yandex.passport.internal.analytics.o0 getEventReporter() {
            return (com.yandex.passport.internal.analytics.o0) this.passportProcessGlobalComponentImpl.provideEventReporterProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.challenge.logout.j
        public com.yandex.passport.common.ui.progress.g getProgressProperties() {
            return this.setProgressProperties;
        }

        @Override // com.yandex.passport.internal.ui.challenge.logout.j
        public com.yandex.passport.internal.ui.challenge.logout.m getViewModelFactory() {
            return new com.yandex.passport.internal.ui.challenge.logout.m(logoutStoreFactory());
        }

        @Override // com.yandex.passport.internal.ui.challenge.logout.j
        public com.yandex.passport.internal.ui.common.web.d getWebUrlChecker() {
            return new com.yandex.passport.internal.ui.common.web.d(this.passportProcessGlobalComponentImpl.urlChecker());
        }

        @Override // com.yandex.passport.internal.ui.challenge.logout.j
        public boolean isWhiteLabel() {
            return this.passportProcessGlobalComponentImpl.whiteLabelBoolean();
        }

        public com.yandex.passport.internal.ui.challenge.logout.e0 logoutStoreFactory() {
            return new com.yandex.passport.internal.ui.challenge.logout.e0(com.yandex.passport.internal.ui.common.f.a(this.storeFactoryModule), challengeChecker(), (m1) this.passportProcessGlobalComponentImpl.logoutUseCaseProvider.get(), (com.yandex.passport.internal.usecase.v) this.passportProcessGlobalComponentImpl.findModernAccountUseCaseProvider.get(), (com.yandex.passport.internal.usecase.ui.t) this.passportProcessGlobalComponentImpl.deleteAccountUseCaseProvider.get(), this.setUid, this.setTheme, this.setLogoutBehaviour);
        }
    }

    public static final class ManagingPlusDevicesComponentBuilder implements com.yandex.passport.internal.ui.sloth.plusdevices.a {
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private Activity setActivity;
        private com.yandex.passport.common.ui.progress.g setProgressProperties;
        private com.yandex.passport.internal.ui.sloth.plusdevices.l setProperties;

        private ManagingPlusDevicesComponentBuilder(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
        }

        @Override // com.yandex.passport.internal.ui.sloth.plusdevices.a
        public com.yandex.passport.internal.ui.sloth.plusdevices.b build() {
            a4g.q(com.yandex.passport.internal.ui.sloth.plusdevices.l.class, this.setProperties);
            a4g.q(com.yandex.passport.common.ui.progress.g.class, this.setProgressProperties);
            a4g.q(Activity.class, this.setActivity);
            return new ManagingPlusDevicesComponentImpl(this.passportProcessGlobalComponentImpl, new com.yandex.passport.internal.ui.common.e(), new com.yandex.passport.internal.ui.sloth.plusdevices.k(), this.setProperties, this.setProgressProperties, this.setActivity);
        }

        @Override // com.yandex.passport.internal.ui.sloth.plusdevices.a
        public ManagingPlusDevicesComponentBuilder setActivity(Activity activity) {
            activity.getClass();
            this.setActivity = activity;
            return this;
        }

        @Override // com.yandex.passport.internal.ui.sloth.plusdevices.a
        public ManagingPlusDevicesComponentBuilder setProgressProperties(com.yandex.passport.common.ui.progress.g gVar) {
            gVar.getClass();
            this.setProgressProperties = gVar;
            return this;
        }

        @Override // com.yandex.passport.internal.ui.sloth.plusdevices.a
        public ManagingPlusDevicesComponentBuilder setProperties(com.yandex.passport.internal.ui.sloth.plusdevices.l lVar) {
            lVar.getClass();
            this.setProperties = lVar;
            return this;
        }
    }

    public static final class ManagingPlusDevicesComponentImpl implements com.yandex.passport.internal.ui.sloth.plusdevices.b {
        private final ManagingPlusDevicesComponentImpl managingPlusDevicesComponentImpl = this;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        rzm providePerformConfigurationProvider;
        rzm setActivityProvider;
        private final com.yandex.passport.common.ui.progress.g setProgressProperties;
        private final com.yandex.passport.internal.ui.sloth.plusdevices.l setProperties;
        private final com.yandex.passport.internal.ui.common.e storeFactoryModule;

        public ManagingPlusDevicesComponentImpl(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, com.yandex.passport.internal.ui.common.e eVar, com.yandex.passport.internal.ui.sloth.plusdevices.k kVar, com.yandex.passport.internal.ui.sloth.plusdevices.l lVar, com.yandex.passport.common.ui.progress.g gVar, Activity activity) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            this.storeFactoryModule = eVar;
            this.setProperties = lVar;
            this.setProgressProperties = gVar;
            initialize(eVar, kVar, lVar, gVar, activity);
        }

        private void initialize(com.yandex.passport.internal.ui.common.e eVar, com.yandex.passport.internal.ui.sloth.plusdevices.k kVar, com.yandex.passport.internal.ui.sloth.plusdevices.l lVar, com.yandex.passport.common.ui.progress.g gVar, Activity activity) {
            this.providePerformConfigurationProvider = new k(kVar, this.passportProcessGlobalComponentImpl.slothStandalonePerformConfigurationProvider, 12);
            this.setActivityProvider = toe.a(activity);
        }

        @Override // com.yandex.passport.internal.ui.sloth.plusdevices.b
        public com.yandex.passport.common.ui.progress.g getProgressProperties() {
            return this.setProgressProperties;
        }

        @Override // com.yandex.passport.internal.ui.sloth.plusdevices.b
        public com.yandex.passport.internal.ui.sloth.screen.e getSlothScreenComponentBuilder() {
            return new cypiuss2_SlothScreenComponentBuilder(this.passportProcessGlobalComponentImpl, this.managingPlusDevicesComponentImpl);
        }

        @Override // com.yandex.passport.internal.ui.sloth.plusdevices.b
        public com.yandex.passport.internal.ui.sloth.plusdevices.g0 getViewModelFactory() {
            return new com.yandex.passport.internal.ui.sloth.plusdevices.g0(managingPlusDevicesStoreFactory());
        }

        @Override // com.yandex.passport.internal.ui.sloth.plusdevices.b
        public boolean isWhiteLabel() {
            return this.passportProcessGlobalComponentImpl.whiteLabelBoolean();
        }

        public com.yandex.passport.internal.ui.sloth.plusdevices.e0 managingPlusDevicesStoreFactory() {
            return new com.yandex.passport.internal.ui.sloth.plusdevices.e0(com.yandex.passport.internal.ui.common.f.a(this.storeFactoryModule), this.setProperties, (com.yandex.passport.internal.report.reporters.j0) this.passportProcessGlobalComponentImpl.managingPlusDevicesReporterProvider.get(), (o2) this.passportProcessGlobalComponentImpl.tryAddPlusDeviceUseCaseProvider.get(), (x0) this.passportProcessGlobalComponentImpl.getLocationIdUseCaseProvider.get());
        }
    }

    public static final class PassportProcessGlobalComponentImpl implements PassportProcessGlobalComponent {
        rzm accountFilterRepositoryProvider;
        rzm accountLastActionHelperProvider;
        rzm accountLoadingReporterProvider;
        rzm accountSharingConfigStorageProvider;
        rzm accountSharingReporterProvider;
        rzm accountSynchronizerProvider;
        rzm accountTrackerProvider;
        rzm accountUpdateReporterProvider;
        rzm accountUpgradeLaunchUseCaseProvider;
        rzm accountUpgradeReporterProvider;
        rzm accountUpgraderViewModelProvider;
        rzm accountsBackuperProvider;
        rzm accountsChangesAnnouncerProvider;
        rzm accountsChangesSelfAnnouncerProvider;
        rzm accountsSaverProvider;
        rzm announcementReporterProvider;
        rzm announcingHelperProvider;
        rzm appBackgroundStateWrapperImplProvider;
        rzm appBindReporterProvider;
        rzm applicationDetailsProviderImplProvider;
        rzm authByCookieUseCaseProvider;
        rzm authByMuidTokenUseCaseProvider;
        rzm authByTrackReporterProvider;
        rzm authQrUseCaseProvider;
        rzm authSdkProviderHelperProvider;
        rzm authSdkReporterProvider;
        rzm authenticatorProvider;
        rzm authorizationInTrackHelperProvider;
        rzm authorizationReporterProvider;
        rzm authorizationResultDataMapperProvider;
        rzm authorizeByCodeUseCaseProvider;
        rzm authorizeByMailOAuthTaskIdUseCaseProvider;
        rzm authorizeByMasterTokenUseCaseProvider;
        rzm authorizeByPasswordRequestProvider;
        rzm authorizeByPasswordUseCaseProvider;
        rzm authorizeByXTokenRequestProvider;
        rzm autoLoginParametersConfigStorageProvider;
        rzm autoLoginReporterProvider;
        rzm autoLoginUseCaseProvider;
        rzm backendReporterProvider;
        rzm backendReporterWrapperImplProvider;
        rzm backendUrlDispatcherImplProvider;
        rzm badgesReporterProvider;
        rzm badgesStorageProvider;
        rzm baseUrlDispatcherImplProvider;
        rzm beginChangePasswordFlowCommandPerformerProvider;
        rzm bindAppBackgroundStateWrapperProvider;
        rzm bindApplicationDetailsProvider;
        rzm bindDeviceInfoProvider;
        rzm bindNetworkWrapperProvider;
        rzm bindPhoneNumberReporterProvider;
        rzm bindUiLanguageProvider;
        rzm biometricTrackInitRequestProvider;
        rzm biometricTrackInitUseCaseProvider;
        rzm bootstrapHelperProvider;
        rzm bouncerReporterProvider;
        rzm challengeHelperProvider;
        rzm challengeReporterProvider;
        rzm changePasswordUseCaseProvider;
        rzm checkAgeByTrackIdRequestProvider;
        rzm checkAgeByTrackIdUseCaseProvider;
        rzm checkLinkageRequestProvider;
        rzm checkLocationIdUseCaseProvider;
        rzm checkVpnBlockRequestProvider;
        rzm checkVpnStatusUseCaseProvider;
        rzm clientTokenDroppingInteractorProvider;
        rzm clientTokenDroppingWrapperProvider;
        rzm clipboardControllerImplProvider;
        rzm commonBackendQueryProvider;
        rzm commonConfigPrefsProvider;
        rzm commonDecryptUseCaseProvider;
        rzm commonEncryptUseCaseProvider;
        private final com.yandex.passport.internal.di.module.a commonModule;
        rzm commonParamsProvider;
        rzm completeStatusRequestProvider;
        rzm configReporterProvider;
        rzm configStatusStorageProvider;
        rzm configStorageProvider;
        rzm connectionTypeImplProvider;
        rzm contextUtilsProvider;
        rzm cookieByTokenReporterProvider;
        rzm coroutineDispatchersImplProvider;
        rzm coroutineScopesImplProvider;
        rzm corruptedAccountRepairerProvider;
        rzm countrySuggestionRequestProvider;
        rzm countrySuggestionUseCaseProvider;
        rzm createProfileReporterProvider;
        rzm currentAccountAnalyticsHelperProvider;
        rzm currentAccountManagerProvider;
        rzm currentAccountStorageProvider;
        rzm dataStoreManagerImplProvider;
        rzm debugOnlyGetSmsVerificationHashPerformerProvider;
        rzm delayedAccountProvider;
        rzm delayedAccountReporterProvider;
        rzm deleteAccountUseCaseProvider;
        rzm deletePhonishForeverUseCaseProvider;
        rzm dependenciesReporterProvider;
        rzm deviceAuthorizationCommitRequestProvider;
        rzm deviceAuthorizationHelperProvider;
        rzm deviceAuthorizationSubmitRequestProvider;
        rzm deviceInfoProviderImplProvider;
        rzm diaryArgumentsRecorderProvider;
        rzm diaryEntityRecorderProvider;
        rzm diaryRecorderProvider;
        rzm diaryReporterProvider;
        rzm diaryUploadDaoWrapperProvider;
        rzm diaryUploadUseCaseProvider;
        rzm disableAutoLoginUseCaseProvider;
        rzm disablePhonishRequestProvider;
        rzm domikLoginHelperProvider;
        rzm domikStatefulReporterProvider;
        rzm ebsConfigStorageProvider;
        rzm ebsReporterProvider;
        rzm encryptReporterProvider;
        rzm environmentDataMapperProvider;
        rzm environmentReporterProvider;
        rzm esiaBindingReporterProvider;
        rzm eventReporterProvider;
        rzm executeCheckVpnStatusPerformerProvider;
        rzm experimentHolderReporterProvider;
        rzm experimentReporterProvider;
        rzm experimentsFetcherProvider;
        rzm experimentsFilterProvider;
        rzm experimentsOverridesProvider;
        rzm experimentsParserProvider;
        rzm experimentsRequestProvider;
        rzm experimentsUpdaterProvider;
        rzm factoryProvider;
        rzm featureFlagResolverProvider;
        rzm fetchAndSaveModernAccountUseCaseProvider;
        rzm fetchAuthCookieUseCaseProvider;
        rzm fetchModernAccountUseCaseProvider;
        rzm filterRulesStorageProvider;
        rzm findMasterUidAccountUseCaseProvider;
        rzm findModernAccountUseCaseProvider;
        rzm finishWithItemCommandPerformerProvider;
        rzm flagRepositoryProvider;
        rzm getAllUserInfoUseCaseProvider;
        rzm getAllowedBadgesUseCaseProvider;
        rzm getAntirobotAnswerUseCaseProvider;
        rzm getAppAccountVisibilityConfigUseCaseProvider;
        rzm getAuthorizationUrlReporterProvider;
        rzm getAuthorizationUrlUseCaseProvider;
        rzm getBadgesForAccountUseCaseProvider;
        rzm getBadgesSpecificationRequestProvider;
        rzm getChallengeRequestProvider;
        rzm getChallengeUseCaseProvider;
        rzm getChildCodeByUidParentRequestProvider;
        rzm getClientOrMasterTokenByMasterTokenRequestProvider;
        rzm getClientTokenUseCaseProvider;
        rzm getCodeByCookieRequestProvider;
        rzm getCodeByMasterTokenRequestProvider;
        rzm getConfigRequestProvider;
        rzm getConfigUseCaseProvider;
        rzm getCookieByTokenRequestProvider;
        rzm getCookieByTokenUseCaseProvider;
        rzm getCustomEulaStringsCommandPerformerProvider;
        rzm getDeviceCodeRequestProvider;
        rzm getLocationIdUseCaseProvider;
        rzm getMasterTokenByCodeRequestProvider;
        rzm getMasterTokenByCookieRequestProvider;
        rzm getMasterTokenByDeviceCodeRequestProvider;
        rzm getMasterTokenByMailishSocialTaskIdRequestProvider;
        rzm getMasterTokenByMasterTokenUseCaseProvider;
        rzm getMasterTokenByMemberTokenRequestProvider;
        rzm getMasterTokenByTrackIdRequestProvider;
        rzm getMasterTokenForwardByTrackRequestProvider;
        rzm getNotLoggedInMembersUseCaseProvider;
        rzm getOrderedAccountsForAutoLoginUseCaseProvider;
        rzm getOtpCommandPerformerProvider;
        rzm getPhoneRegionCodeCommandPerformerProvider;
        rzm getPush2faCodeRequestProvider;
        rzm getQrLinkRequestProvider;
        rzm getSecretsUseCaseProvider;
        rzm getSmsCommandPerformerProvider;
        rzm getSsoConfigRequestProvider;
        rzm getTrackFromMagicRequestProvider;
        rzm getTrackPayloadRequestProvider;
        rzm getUpgradeStatusUseCaseProvider;
        rzm getUpgradeUrlUseCaseProvider;
        rzm getUserInfoRequestProvider;
        rzm getXTokenClientIdCommandPerformerProvider;
        rzm greatAgainPushSubscriptionManagerProvider;
        rzm handleVpnAppBackgroundStateUseCaseProvider;
        rzm hashEncoderProvider;
        rzm hostDispatcherProvider;
        rzm iPCImplProvider;
        rzm iPCPropertiesHolderProvider;
        rzm immediateAccountsRetrieverProvider;
        rzm internalProviderHelperProvider;
        rzm itemClickCommandPerformerProvider;
        rzm limitedDependenciesReportUseCaseProvider;
        rzm limitedPassportInitReportUseCaseProvider;
        rzm limitedUpdatedPropertiesReportUseCaseProvider;
        rzm linkAuthReporterProvider;
        rzm linkHandlingReporterProvider;
        rzm linkageCandidateFinderProvider;
        rzm linkagePerformerProvider;
        rzm linkageRefresherProvider;
        rzm linkageUpdaterProvider;
        rzm loadAccountsUseCaseProvider;
        rzm localeHelperProvider;
        rzm loginControllerProvider;
        rzm logoutUseCaseProvider;
        rzm makeJwtTokenRequestProvider;
        rzm makeJwtTokenUseCaseProvider;
        rzm makeTokenMasterCoolDownStorageProvider;
        rzm manageAccountsVisibilityForBlacklistedAppsUseCaseProvider;
        rzm managingPlusDevicesReporterProvider;
        rzm mapOfIntegerAndBackendClientProvider;
        rzm mapOfIntegerAndFrontendClientProvider;
        rzm masterCredentialsProvider;
        rzm masterTokenEncrypterProvider;
        rzm masterTokenRotationReporterProvider;
        rzm masterTokenRotationUseCaseProvider;
        rzm masterTokenTombstoneManagerImplProvider;
        rzm memberAccountRepositoryProvider;
        rzm metricaReporterProvider;
        rzm modernAccountMapperProvider;
        rzm networkWrapperImplProvider;
        rzm notificationHelperProvider;
        rzm notificationPictureBuilderProvider;
        rzm otpWaReporterProvider;
        rzm passportInitReporterProvider;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl = this;
        rzm passportPushRegistrationUseCaseProvider;
        rzm passportRequestsMapperProvider;
        rzm passportRequestsProcessorProvider;
        rzm personProfileHelperProvider;
        rzm pictureIdToBitmapMapperProvider;
        rzm picturePushUrlUseCaseProvider;
        rzm preferenceStorageProvider;
        rzm primarySlothPerformBinderProvider;
        rzm processAuthorizationResultUseCaseProvider;
        rzm propertyUpdaterProvider;
        rzm provideAccountParserJsonProvider;
        rzm provideAccountsRetrieverProvider;
        rzm provideAccountsUpdaterProvider;
        rzm provideAmVersionProvider;
        rzm provideAnalyticalIdentifiersProvider;
        rzm provideAnalyticsHelperProvider;
        rzm provideAnalyticsTrackerWrapperProvider;
        rzm provideAndroidAccountManagerHelperProvider;
        rzm provideAuthCookieDaoProvider;
        rzm provideAuthCookieDaoWrapperProvider;
        rzm provideAuthorizationReporterWrapperProvider;
        rzm provideBackendClientChooserProvider;
        rzm provideBackendParserProvider;
        rzm provideBackendReporterProvider;
        rzm provideBackendReporterWrapperProvider;
        rzm provideBackendUrlDispatcherProvider;
        rzm provideBaseOkHttpUseCaseProvider;
        rzm provideBaseUrlDispatcherProvider;
        rzm provideClientTokenDaoProvider;
        rzm provideClipboardControllerProvider;
        rzm provideClipboardManagerProvider;
        rzm provideClockProvider;
        rzm provideCommonBackendParamsProvider;
        rzm provideCoolDownUidStorageProvider;
        rzm provideCoroutineDispatchersProvider;
        rzm provideCoroutineScopesProvider;
        rzm provideDataStoreManagerProvider;
        rzm provideDataStoreProvider;
        rzm provideDatabaseHelperProvider;
        rzm provideDebugInfoUtilProvider;
        rzm provideDeviceDensityProvider;
        rzm provideDiaryMethodDaoProvider;
        rzm provideDiaryUploadDaoProvider;
        rzm provideEventReporterProvider;
        rzm provideExperimentsCurrentSessionProvider;
        rzm provideExperimentsExcluderProvider;
        rzm provideExperimentsHolderProvider;
        rzm provideGcmSubscriptionsDaoProvider;
        rzm provideIPCApiProvider;
        rzm provideImageLoadingClientProvider;
        rzm provideIsWhiteLabelProvider;
        rzm provideMasterTokenTombstoneManagerProvider;
        rzm provideModernAccountRefresherProvider;
        rzm provideNotificationDndManagerProvider;
        rzm provideOkHttpClientProvider;
        rzm providePassportBiometricApiProvider;
        rzm providePassportDatabaseProvider;
        rzm providePermissionManagerProvider;
        rzm provideProductionBackendClientProvider;
        rzm provideProductionFrontendClientProvider;
        rzm provideRcBackendClientProvider;
        rzm provideRcFrontendClientProvider;
        rzm provideReporterProvider;
        rzm provideRetryingOkHttpUseCaseProvider;
        rzm provideSlothReportDelegateProvider;
        rzm provideSmartLockInterfaceProvider;
        rzm provideSyncHelperProvider;
        rzm provideTeamFrontendClientProvider;
        rzm provideTeamProductionBackendClientProvider;
        rzm provideTeamTestingBackendClientProvider;
        rzm provideTeamTestingFrontendClientProvider;
        rzm provideTestingBackendClientProvider;
        rzm provideTestingFrontendClientProvider;
        rzm provideTimeProvider;
        rzm provideTwoFactorOtpProvider;
        rzm provideUrlTemplateDataStoreProvider;
        rzm provideUserInfoMapperProvider;
        rzm provideWebAuthNClientProvider;
        rzm pushAvailabilityDetectorProvider;
        rzm pushIntentProvider;
        rzm pushOpenUrlInBrowserReporterProvider;
        rzm pushPayloadFactoryProvider;
        rzm pushPayloadStorageProvider;
        rzm pushReporterProvider;
        rzm pushSubscribeRequestProvider;
        rzm pushSubscriberProvider;
        rzm pushSubscriptionSchedulerProvider;
        rzm pushSubscriptionTimeDispatcherProvider;
        rzm pushUnsubscribeRequestProvider;
        rzm quarantineMasterTokenStorageProvider;
        rzm registerPhonishRequestProvider;
        rzm registerPhonishUseCaseProvider;
        rzm removeAccountUseCaseProvider;
        rzm reportingFeatureProvider;
        rzm requestCreatorProvider;
        rzm requestFactoryProvider;
        rzm requestFactoryProvider10;
        rzm requestFactoryProvider11;
        rzm requestFactoryProvider12;
        rzm requestFactoryProvider13;
        rzm requestFactoryProvider14;
        rzm requestFactoryProvider15;
        rzm requestFactoryProvider16;
        rzm requestFactoryProvider17;
        rzm requestFactoryProvider18;
        rzm requestFactoryProvider19;
        rzm requestFactoryProvider2;
        rzm requestFactoryProvider20;
        rzm requestFactoryProvider21;
        rzm requestFactoryProvider22;
        rzm requestFactoryProvider23;
        rzm requestFactoryProvider24;
        rzm requestFactoryProvider25;
        rzm requestFactoryProvider26;
        rzm requestFactoryProvider27;
        rzm requestFactoryProvider28;
        rzm requestFactoryProvider29;
        rzm requestFactoryProvider3;
        rzm requestFactoryProvider30;
        rzm requestFactoryProvider31;
        rzm requestFactoryProvider32;
        rzm requestFactoryProvider33;
        rzm requestFactoryProvider34;
        rzm requestFactoryProvider35;
        rzm requestFactoryProvider36;
        rzm requestFactoryProvider37;
        rzm requestFactoryProvider38;
        rzm requestFactoryProvider39;
        rzm requestFactoryProvider4;
        rzm requestFactoryProvider40;
        rzm requestFactoryProvider41;
        rzm requestFactoryProvider42;
        rzm requestFactoryProvider43;
        rzm requestFactoryProvider44;
        rzm requestFactoryProvider45;
        rzm requestFactoryProvider46;
        rzm requestFactoryProvider5;
        rzm requestFactoryProvider6;
        rzm requestFactoryProvider7;
        rzm requestFactoryProvider8;
        rzm requestFactoryProvider9;
        rzm requestLoginCredentialsCommandPerformerProvider;
        rzm requestMagicLinkParamsCommandPerformerProvider;
        rzm requestSavedExperimentsCommandPerformerProvider;
        rzm requestSmsUseCaseProvider;
        rzm requestSmsUseCaseProvider2;
        rzm responseTransformerProvider;
        rzm responseTransformerProvider2;
        rzm resultTransformerProvider;
        rzm retryingProvider;
        rzm retryingProvider2;
        rzm revokeMasterTokenRequestProvider;
        rzm revokeMasterTokenUseCaseProvider;
        rzm revokeMasterTokenWrapperProvider;
        rzm saveLoginCredentialsCommandPerformerProvider;
        rzm savedExperimentsProvider;
        rzm scopeAuthUrlUseCaseProvider;
        rzm scopeUrlUseCaseProvider;
        rzm sendAuthToTrackReporterProvider;
        rzm sendAuthToTrackRequestProvider;
        private final com.yandex.passport.internal.di.module.p serviceModule;
        private final Context setApplicationContext;
        rzm setApplicationContextProvider;
        rzm setCurrentAccountUseCaseProvider;
        rzm setIReporterInternalProvider;
        rzm setPopupSizeCommandPerformerProvider;
        private final com.yandex.passport.internal.properties.x setProperties;
        rzm setPropertiesProvider;
        rzm setVpnChallengeActivityDisabledPerformerProvider;
        rzm showAuthCodeUseCaseProvider;
        rzm silentPushReporterProvider;
        rzm slothAuthCookieProviderImplProvider;
        rzm slothAuthDelegateImplProvider;
        rzm slothBaseUrlProviderImplProvider;
        rzm slothBouncerPerformConfigurationProvider;
        rzm slothDependenciesFactoryProvider;
        rzm slothEulaSupportProvider;
        rzm slothReportDelegateImplProvider;
        rzm slothStandalonePerformConfigurationProvider;
        rzm slothUrlCheckerImplProvider;
        rzm slothUrlProviderImplProvider;
        rzm slothUserMenuPerformConfigurationProvider;
        rzm slothWebCardPerformConfigurationProvider;
        rzm slothWebParamsProviderImplProvider;
        rzm smsCodeSendingRequestProvider;
        rzm smsCodeSendingUseCaseProvider;
        rzm smsCodeVerificationRequestProvider;
        rzm smsRetrieverHelperProvider;
        rzm socialBrowserReporterProvider;
        rzm socialReporterProvider;
        rzm ssoAccountsSyncHelperProvider;
        rzm ssoAnnouncerProvider;
        rzm ssoApplicationsResolverProvider;
        rzm ssoBootstrapHelperProvider;
        rzm ssoContentProviderClientProvider;
        rzm ssoContentProviderHelperProvider;
        rzm ssoDisablerProvider;
        rzm standaloneReporterProvider;
        rzm startAuthorizationUseCaseProvider;
        rzm startBiometricSessionRequestProvider;
        rzm startBiometricSessionUseCaseProvider;
        rzm startRegistrationUseCaseProvider;
        rzm stashReporterProvider;
        rzm storageReporterProvider;
        rzm subscriptionEnqueuePerformerProvider;
        rzm suggestedLanguageReporterProvider;
        rzm suggestedLanguageRequestProvider;
        rzm suggestedLanguageUseCaseProvider;
        rzm syncAdapterProvider;
        rzm syncReporterProvider;
        rzm tldResolverProvider;
        rzm tokenActionReporterProvider;
        rzm tombstoneReporterProvider;
        rzm tryAddPlusDeviceRequestProvider;
        rzm tryAddPlusDeviceUseCaseProvider;
        rzm tryGetMasterCredentialsByAccountProvider;
        rzm uiLanguageProviderImplProvider;
        rzm updateAvatarRequestProvider;
        rzm updateAvatarUseCaseProvider;
        rzm updateBadgesConfigUseCaseProvider;
        rzm updateEnqueuePerformerProvider;
        rzm updateMasterTokenReporterProvider;
        rzm upgradeStatusStashUpdaterProvider;
        rzm urlCheckerProvider;
        rzm urlRestorerProvider;
        rzm urlTemplateRepositoryProvider;
        rzm userInfoReporterProvider;
        rzm userMenuEventSenderProvider;
        rzm userMenuSlothPerformBinderProvider;
        rzm usingMasterTokenRequestUseCaseProvider;
        rzm usingMasterTokenRequestUseCaseProvider2;
        rzm usingMasterTokenRequestUseCaseProvider3;
        rzm usingMasterTokenRequestUseCaseProvider4;
        rzm validatePhoneNumberRequestProvider;
        rzm vpnChallengeReporterProvider;
        rzm vpnChallengeStoreFactoryProvider;
        com.yandex.passport.internal.ui.challenge.vpn.z vpnChallengeViewModelProvider;
        rzm vpnConfigRepositoryProvider;
        rzm vpnCookieRepositoryProvider;
        rzm warmUpWebViewReporterProvider;
        rzm webAmReporterProvider;
        rzm webAuthNAuthPerformerProvider;
        rzm webAuthNAvailabilityPerformerProvider;
        rzm webAuthNRegisterPerformerProvider;
        rzm webAuthNReporterProvider;
        rzm webCardEventSenderProvider;
        rzm webCardReporterProvider;
        rzm webCardSlothPerformBinderProvider;
        rzm whiteListRegexConfigStorageProvider;

        public PassportProcessGlobalComponentImpl(com.yandex.passport.internal.di.module.a aVar, com.yandex.passport.internal.di.module.e eVar, com.yandex.passport.internal.di.module.h hVar, com.yandex.passport.internal.di.module.p pVar, Context context, IReporterYandex iReporterYandex, com.yandex.passport.internal.properties.x xVar) {
            this.setProperties = xVar;
            this.setApplicationContext = context;
            this.commonModule = aVar;
            this.serviceModule = pVar;
            initialize(aVar, eVar, hVar, pVar, context, iReporterYandex, xVar);
            initialize2(aVar, eVar, hVar, pVar, context, iReporterYandex, xVar);
            initialize3(aVar, eVar, hVar, pVar, context, iReporterYandex, xVar);
            initialize4(aVar, eVar, hVar, pVar, context, iReporterYandex, xVar);
            initialize5(aVar, eVar, hVar, pVar, context, iReporterYandex, xVar);
            initialize6(aVar, eVar, hVar, pVar, context, iReporterYandex, xVar);
            initialize7(aVar, eVar, hVar, pVar, context, iReporterYandex, xVar);
            initialize8(aVar, eVar, hVar, pVar, context, iReporterYandex, xVar);
            initialize9(aVar, eVar, hVar, pVar, context, iReporterYandex, xVar);
            initialize10(aVar, eVar, hVar, pVar, context, iReporterYandex, xVar);
            initialize11(aVar, eVar, hVar, pVar, context, iReporterYandex, xVar);
            initialize12(aVar, eVar, hVar, pVar, context, iReporterYandex, xVar);
            initialize13(aVar, eVar, hVar, pVar, context, iReporterYandex, xVar);
            initialize14(aVar, eVar, hVar, pVar, context, iReporterYandex, xVar);
            initialize15(aVar, eVar, hVar, pVar, context, iReporterYandex, xVar);
            initialize16(aVar, eVar, hVar, pVar, context, iReporterYandex, xVar);
            initialize17(aVar, eVar, hVar, pVar, context, iReporterYandex, xVar);
            initialize18(aVar, eVar, hVar, pVar, context, iReporterYandex, xVar);
            initialize19(aVar, eVar, hVar, pVar, context, iReporterYandex, xVar);
        }

        private void initialize(com.yandex.passport.internal.di.module.a aVar, com.yandex.passport.internal.di.module.e eVar, com.yandex.passport.internal.di.module.h hVar, com.yandex.passport.internal.di.module.p pVar, Context context, IReporterYandex iReporterYandex, com.yandex.passport.internal.properties.x xVar) {
            this.setApplicationContextProvider = toe.a(context);
            toe a = toe.a(xVar);
            this.setPropertiesProvider = a;
            rzm b = t8a.b(new com.yandex.passport.internal.helper.i(a, 0));
            this.localeHelperProvider = b;
            rzm b2 = t8a.b(new qa(this.setApplicationContextProvider, b, 15));
            this.contextUtilsProvider = b2;
            this.commonParamsProvider = t8a.b(new com.yandex.passport.internal.provider.communication.w(b2, this.setPropertiesProvider, 3));
            this.setIReporterInternalProvider = toe.a(iReporterYandex);
            rzm b3 = t8a.b(com.yandex.passport.common.coroutine.c.a);
            this.coroutineDispatchersImplProvider = b3;
            rzm b4 = t8a.b(new com.yandex.passport.common.coroutine.g(b3, 0));
            this.coroutineScopesImplProvider = b4;
            this.provideCoroutineScopesProvider = t8a.b(new com.yandex.passport.common.coroutine.g(b4, 28));
            rzm b5 = t8a.b(new com.yandex.passport.common.coroutine.g(this.coroutineDispatchersImplProvider, 27));
            this.provideCoroutineDispatchersProvider = b5;
            rzm b6 = t8a.b(new com.yandex.passport.internal.di.module.s(pVar, this.setApplicationContextProvider, this.provideCoroutineScopesProvider, b5, 0));
            this.provideAnalyticalIdentifiersProvider = b6;
            rzm b7 = t8a.b(new com.yandex.passport.internal.di.module.s(pVar, this.setApplicationContextProvider, b6, this.setPropertiesProvider, 1));
            this.provideAnalyticsHelperProvider = b7;
            rzm b8 = t8a.b(new z0(this.setApplicationContextProvider, this.commonParamsProvider, this.setIReporterInternalProvider, b7, 11));
            this.metricaReporterProvider = b8;
            this.provideReporterProvider = t8a.b(new com.yandex.passport.internal.di.module.t(pVar, b8, 7));
            this.featureFlagResolverProvider = t8a.b(com.yandex.passport.internal.flags.e.a);
            this.provideClockProvider = t8a.b(new com.yandex.passport.internal.di.module.q(pVar, 1));
            com.yandex.passport.internal.di.module.t tVar = new com.yandex.passport.internal.di.module.t(pVar, this.setApplicationContextProvider, 4);
            this.provideExperimentsExcluderProvider = tVar;
            this.experimentsFilterProvider = new com.yandex.passport.internal.flags.experiments.h(0, tVar);
            rzm b9 = t8a.b(new com.yandex.passport.internal.di.module.d(this.setIReporterInternalProvider, 13));
            this.environmentReporterProvider = b9;
            this.experimentHolderReporterProvider = t8a.b(new com.yandex.passport.internal.di.module.d(b9, 24));
            rzm b10 = t8a.b(new com.yandex.passport.internal.di.module.t(pVar, this.setApplicationContextProvider, 3));
            this.provideExperimentsCurrentSessionProvider = b10;
            this.provideExperimentsHolderProvider = t8a.b(new u(pVar, this.setApplicationContextProvider, this.provideClockProvider, this.experimentsFilterProvider, this.experimentHolderReporterProvider, this.commonParamsProvider, b10, 1));
            rzm b11 = t8a.b(new com.yandex.passport.internal.di.module.d(this.setApplicationContextProvider, 3));
            this.experimentsOverridesProvider = b11;
            rzm b12 = t8a.b(new z0(this.featureFlagResolverProvider, this.provideExperimentsHolderProvider, b11, this.provideExperimentsCurrentSessionProvider, 7));
            this.flagRepositoryProvider = b12;
            this.reportingFeatureProvider = t8a.b(new com.yandex.passport.internal.di.module.d(b12, 2));
        }

        private void initialize10(com.yandex.passport.internal.di.module.a aVar, com.yandex.passport.internal.di.module.e eVar, com.yandex.passport.internal.di.module.h hVar, com.yandex.passport.internal.di.module.p pVar, Context context, IReporterYandex iReporterYandex, com.yandex.passport.internal.properties.x xVar) {
            this.configStatusStorageProvider = new s7(this.commonConfigPrefsProvider, this.provideTimeProvider, this.bindApplicationDetailsProvider, 2);
            rzm rzmVar = this.setApplicationContextProvider;
            this.whiteListRegexConfigStorageProvider = new com.yandex.passport.common.coroutine.g(rzmVar, 21);
            this.ebsConfigStorageProvider = new com.yandex.passport.common.coroutine.g(rzmVar, 19);
            rzm b = t8a.b(new l1(this.eventReporterProvider, 0));
            this.vpnChallengeReporterProvider = b;
            this.vpnConfigRepositoryProvider = t8a.b(new s7(this.commonConfigPrefsProvider, this.bindApplicationDetailsProvider, b, 3));
            rzm b2 = t8a.b(new com.yandex.passport.common.coroutine.g(this.commonConfigPrefsProvider, 17));
            this.autoLoginParametersConfigStorageProvider = b2;
            rzm b3 = t8a.b(new com.yandex.passport.internal.config.m(this.provideCoroutineDispatchersProvider, this.configStorageProvider, this.getConfigRequestProvider, this.configReporterProvider, this.configStatusStorageProvider, this.environmentDataMapperProvider, this.accountFilterRepositoryProvider, this.urlTemplateRepositoryProvider, this.whiteListRegexConfigStorageProvider, this.ebsConfigStorageProvider, this.vpnConfigRepositoryProvider, b2, 0));
            this.getConfigUseCaseProvider = b3;
            this.checkLocationIdUseCaseProvider = t8a.b(new com.yandex.passport.internal.ui.common.c(this.provideCoroutineDispatchersProvider, b3, this.configStorageProvider, 6));
            qa qaVar = new qa(this.requestCreatorProvider, this.commonBackendQueryProvider, 10);
            this.requestFactoryProvider13 = qaVar;
            rzm b4 = t8a.b(new com.yandex.passport.data.network.n(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, qaVar, this.provideMasterTokenTombstoneManagerProvider, 14));
            this.getMasterTokenByCookieRequestProvider = b4;
            this.authByCookieUseCaseProvider = t8a.b(new com.yandex.passport.internal.analytics.d0(this.provideCoroutineDispatchersProvider, this.checkLocationIdUseCaseProvider, this.fetchAndSaveModernAccountUseCaseProvider, b4, this.tokenActionReporterProvider, this.masterCredentialsProvider, this.environmentDataMapperProvider, 5));
            this.socialReporterProvider = t8a.b(new com.yandex.passport.internal.provider.communication.w(this.eventReporterProvider, this.reportingFeatureProvider, 25));
            this.linkageCandidateFinderProvider = t8a.b(new qa(this.provideAccountsRetrieverProvider, this.provideClockProvider, 22));
            this.linkagePerformerProvider = t8a.b(new z0(this.provideAccountsRetrieverProvider, this.provideAccountsUpdaterProvider, this.provideBackendClientChooserProvider, this.modernAccountMapperProvider, 5));
            rzm b5 = t8a.b(new s7(this.setApplicationContextProvider, this.provideBackendClientChooserProvider, this.provideAccountsRetrieverProvider, 8));
            this.authorizationInTrackHelperProvider = b5;
            this.internalProviderHelperProvider = t8a.b(new com.yandex.passport.internal.provider.b(this.preferenceStorageProvider, this.provideAccountsRetrieverProvider, this.provideAccountsUpdaterProvider, this.provideBackendClientChooserProvider, this.provideEventReporterProvider, this.clientTokenDroppingInteractorProvider, this.pushSubscriptionSchedulerProvider, this.linkageCandidateFinderProvider, this.linkagePerformerProvider, this.provideDebugInfoUtilProvider, this.personProfileHelperProvider, b5, this.experimentsOverridesProvider, 0));
            rzm b6 = t8a.b(new com.yandex.passport.internal.di.module.f(eVar, this.setApplicationContextProvider, 5));
            this.providePassportDatabaseProvider = b6;
            this.provideDiaryMethodDaoProvider = t8a.b(new com.yandex.passport.internal.di.module.f(eVar, b6, 2));
            rzm b7 = t8a.b(new com.yandex.passport.internal.di.module.d(this.eventReporterProvider, 14));
            this.diaryReporterProvider = b7;
            rzm b8 = t8a.b(new s7(this.provideCoroutineDispatchersProvider, this.provideDiaryMethodDaoProvider, b7, 13));
            this.diaryEntityRecorderProvider = b8;
            rzm b9 = t8a.b(new com.yandex.passport.internal.provider.communication.w(this.provideClockProvider, b8, 4));
            this.diaryArgumentsRecorderProvider = b9;
            this.diaryRecorderProvider = t8a.b(new w(this.flagRepositoryProvider, this.provideClockProvider, this.diaryEntityRecorderProvider, b9, this.provideCoroutineDispatchersProvider, 7));
            this.requestFactoryProvider14 = new com.yandex.passport.data.network.o(this.requestCreatorProvider, this.commonBackendQueryProvider, 5);
            rzm b10 = t8a.b(new qa(this.provideCoroutineDispatchersProvider, this.provideMasterTokenTombstoneManagerProvider, 8));
            this.usingMasterTokenRequestUseCaseProvider2 = b10;
            this.completeStatusRequestProvider = t8a.b(new w(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, this.requestFactoryProvider14, b10, 1));
        }

        private void initialize11(com.yandex.passport.internal.di.module.a aVar, com.yandex.passport.internal.di.module.e eVar, com.yandex.passport.internal.di.module.h hVar, com.yandex.passport.internal.di.module.p pVar, Context context, IReporterYandex iReporterYandex, com.yandex.passport.internal.properties.x xVar) {
            this.upgradeStatusStashUpdaterProvider = t8a.b(new com.yandex.passport.internal.ui.bouncer.roundabout.d(this.provideAccountsUpdaterProvider, this.provideClockProvider, 10));
            rzm b = t8a.b(new com.yandex.passport.internal.provider.communication.w(this.eventReporterProvider, this.reportingFeatureProvider, 6));
            this.accountUpgradeReporterProvider = b;
            this.getUpgradeStatusUseCaseProvider = t8a.b(new com.yandex.passport.internal.analytics.d0(this.provideCoroutineDispatchersProvider, this.provideAccountsRetrieverProvider, this.completeStatusRequestProvider, this.contextUtilsProvider, this.upgradeStatusStashUpdaterProvider, b, this.environmentDataMapperProvider, 2));
            com.yandex.passport.data.network.o oVar = new com.yandex.passport.data.network.o(this.requestCreatorProvider, this.commonBackendQueryProvider, 16);
            this.requestFactoryProvider15 = oVar;
            this.getCodeByMasterTokenRequestProvider = t8a.b(new com.yandex.passport.data.network.n(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, oVar, this.provideMasterTokenTombstoneManagerProvider, 5));
            com.yandex.passport.data.network.o oVar2 = new com.yandex.passport.data.network.o(this.requestCreatorProvider, this.commonBackendQueryProvider, 12);
            this.requestFactoryProvider16 = oVar2;
            rzm rzmVar = this.provideCoroutineDispatchersProvider;
            this.getChallengeRequestProvider = new d0(rzmVar, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, (rzm) oVar2, 6);
            this.findModernAccountUseCaseProvider = t8a.b(new com.yandex.passport.internal.ui.bouncer.roundabout.d(rzmVar, this.provideAccountsRetrieverProvider, 12));
            rzm b2 = t8a.b(new com.yandex.passport.internal.di.module.f(eVar, this.provideDatabaseHelperProvider, 1));
            this.provideClientTokenDaoProvider = b2;
            rzm b3 = t8a.b(new com.yandex.passport.internal.ui.bouncer.model.middleware.b(this.provideCoroutineDispatchersProvider, this.setPropertiesProvider, b2, this.provideAccountsUpdaterProvider, this.getClientOrMasterTokenByMasterTokenRequestProvider, this.provideDatabaseHelperProvider, this.pushSubscriptionSchedulerProvider, this.tokenActionReporterProvider, this.pushSubscriberProvider, this.environmentDataMapperProvider, 1));
            this.getClientTokenUseCaseProvider = b3;
            this.getChallengeUseCaseProvider = t8a.b(new com.yandex.passport.internal.analytics.d0(this.provideCoroutineDispatchersProvider, this.getChallengeRequestProvider, this.provideBaseUrlDispatcherProvider, this.findModernAccountUseCaseProvider, b3, this.bindApplicationDetailsProvider, this.environmentDataMapperProvider, 4));
            rzm b4 = t8a.b(new com.yandex.passport.internal.ui.bouncer.roundabout.d(this.provideCoroutineDispatchersProvider, this.preferenceStorageProvider, 11));
            this.disableAutoLoginUseCaseProvider = b4;
            this.logoutUseCaseProvider = t8a.b(new com.yandex.passport.internal.ui.bouncer.model.middleware.b(this.provideCoroutineDispatchersProvider, this.provideAccountsRetrieverProvider, this.clientTokenDroppingInteractorProvider, this.currentAccountStorageProvider, this.provideEventReporterProvider, b4, this.memberAccountRepositoryProvider, this.flagRepositoryProvider, this.pushSubscriberProvider, this.pushSubscriptionSchedulerProvider, 2));
            this.autoLoginReporterProvider = t8a.b(new com.yandex.passport.internal.provider.communication.w(this.eventReporterProvider, this.reportingFeatureProvider, 10));
            rzm b5 = t8a.b(new com.yandex.passport.internal.di.module.d(this.eventReporterProvider, 18));
            this.badgesReporterProvider = b5;
            rzm rzmVar2 = this.setApplicationContextProvider;
            rzm rzmVar3 = this.provideCoroutineDispatchersProvider;
            z0 z0Var = new z0(rzmVar2, rzmVar3, this.provideTimeProvider, b5, 3);
            this.badgesStorageProvider = z0Var;
            com.yandex.passport.internal.badges.f fVar = new com.yandex.passport.internal.badges.f(rzmVar3, rzmVar2, (rzm) z0Var, 0);
            this.getAllowedBadgesUseCaseProvider = fVar;
            com.yandex.passport.common.coroutine.g gVar = new com.yandex.passport.common.coroutine.g(rzmVar3, 12);
            this.getBadgesForAccountUseCaseProvider = gVar;
            this.getOrderedAccountsForAutoLoginUseCaseProvider = t8a.b(new zo0(rzmVar3, this.provideAccountsRetrieverProvider, fVar, gVar, this.autoLoginParametersConfigStorageProvider, this.bindApplicationDetailsProvider, this.flagRepositoryProvider, this.memberAccountRepositoryProvider, 2));
            com.yandex.passport.data.network.o oVar3 = new com.yandex.passport.data.network.o(this.requestCreatorProvider, this.commonBackendQueryProvider, 20);
            this.requestFactoryProvider17 = oVar3;
            rzm b6 = t8a.b(new d0(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, (rzm) oVar3, 11));
            this.getMasterTokenByMemberTokenRequestProvider = b6;
            rzm rzmVar4 = this.provideCoroutineDispatchersProvider;
            com.yandex.passport.internal.analytics.d0 d0Var = new com.yandex.passport.internal.analytics.d0(rzmVar4, this.checkLocationIdUseCaseProvider, this.fetchAndSaveModernAccountUseCaseProvider, b6, this.environmentDataMapperProvider, this.masterCredentialsProvider, this.tokenActionReporterProvider, 7);
            this.authByMuidTokenUseCaseProvider = d0Var;
            com.yandex.passport.internal.ui.common.c cVar = new com.yandex.passport.internal.ui.common.c(rzmVar4, this.memberAccountRepositoryProvider, this.provideAccountsRetrieverProvider, 15);
            this.findMasterUidAccountUseCaseProvider = cVar;
            this.autoLoginUseCaseProvider = t8a.b(new zo0(rzmVar4, this.preferenceStorageProvider, this.setPropertiesProvider, this.autoLoginReporterProvider, this.getClientTokenUseCaseProvider, this.getOrderedAccountsForAutoLoginUseCaseProvider, d0Var, cVar, 1));
            this.checkVpnBlockRequestProvider = t8a.b(new z0(this.provideCoroutineDispatchersProvider, this.provideBaseOkHttpUseCaseProvider, this.requestCreatorProvider, this.commonBackendQueryProvider, 0));
        }

        private void initialize12(com.yandex.passport.internal.di.module.a aVar, com.yandex.passport.internal.di.module.e eVar, com.yandex.passport.internal.di.module.h hVar, com.yandex.passport.internal.di.module.p pVar, Context context, IReporterYandex iReporterYandex, com.yandex.passport.internal.properties.x xVar) {
            rzm b = t8a.b(new com.yandex.passport.common.coroutine.g(this.setApplicationContextProvider, 14));
            this.deviceInfoProviderImplProvider = b;
            this.bindDeviceInfoProvider = t8a.b(new com.yandex.passport.internal.di.module.b(aVar, b, 2));
            rzm b2 = t8a.b(new com.yandex.passport.common.coroutine.g(this.commonConfigPrefsProvider, 20));
            this.vpnCookieRepositoryProvider = b2;
            this.getAntirobotAnswerUseCaseProvider = t8a.b(new com.yandex.passport.internal.provider.b(this.provideCoroutineDispatchersProvider, this.autoLoginUseCaseProvider, this.currentAccountManagerProvider, this.provideAccountsRetrieverProvider, this.setPropertiesProvider, this.propertyUpdaterProvider, this.getClientTokenUseCaseProvider, this.checkVpnBlockRequestProvider, this.environmentDataMapperProvider, this.bindDeviceInfoProvider, this.bindApplicationDetailsProvider, b2, this.provideIPCApiProvider, 1));
            rzm b3 = t8a.b(new com.yandex.passport.common.coroutine.g(this.setApplicationContextProvider, 15));
            this.networkWrapperImplProvider = b3;
            this.bindNetworkWrapperProvider = t8a.b(new com.yandex.passport.internal.di.module.b(aVar, b3, 3));
            rzm b4 = t8a.b(new l1(this.setApplicationContextProvider, 2));
            this.connectionTypeImplProvider = b4;
            rzm b5 = t8a.b(new com.yandex.passport.internal.ui.bouncer.model.middleware.b(this.provideCoroutineDispatchersProvider, this.provideCoroutineScopesProvider, this.getAntirobotAnswerUseCaseProvider, this.bindNetworkWrapperProvider, this.vpnConfigRepositoryProvider, this.flagRepositoryProvider, this.currentAccountStorageProvider, b4, this.propertyUpdaterProvider, this.vpnChallengeReporterProvider, 3));
            this.checkVpnStatusUseCaseProvider = b5;
            this.executeCheckVpnStatusPerformerProvider = t8a.b(new com.yandex.passport.internal.di.module.d(b5, 5));
            this.clientTokenDroppingWrapperProvider = t8a.b(new s7(this.provideDatabaseHelperProvider, this.provideAccountsRetrieverProvider, this.clientTokenDroppingInteractorProvider, 5));
            this.setCurrentAccountUseCaseProvider = t8a.b(new z0(this.provideCoroutineDispatchersProvider, this.provideAccountsRetrieverProvider, this.currentAccountStorageProvider, this.provideEventReporterProvider, 28));
            this.requestFactoryProvider18 = new qa(this.requestCreatorProvider, this.commonBackendQueryProvider, 0);
            rzm b6 = t8a.b(new qa(this.provideCoroutineDispatchersProvider, this.provideMasterTokenTombstoneManagerProvider, 8));
            this.usingMasterTokenRequestUseCaseProvider3 = b6;
            this.sendAuthToTrackRequestProvider = t8a.b(new w(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, this.requestFactoryProvider18, b6, 2));
            com.yandex.passport.data.network.o oVar = new com.yandex.passport.data.network.o(this.requestCreatorProvider, this.commonBackendQueryProvider, 19);
            this.requestFactoryProvider19 = oVar;
            this.getDeviceCodeRequestProvider = t8a.b(new d0(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, (rzm) oVar, 10));
            rzm b7 = t8a.b(new com.yandex.passport.internal.provider.communication.w(this.eventReporterProvider, this.reportingFeatureProvider, 24));
            this.sendAuthToTrackReporterProvider = b7;
            this.deviceAuthorizationHelperProvider = t8a.b(new com.yandex.passport.internal.core.accounts.b(this.provideBackendClientChooserProvider, this.provideAccountsRetrieverProvider, this.sendAuthToTrackRequestProvider, this.getDeviceCodeRequestProvider, b7, this.environmentDataMapperProvider, this.provideAnalyticsTrackerWrapperProvider, this.masterCredentialsProvider, 1));
            com.yandex.passport.data.network.o oVar2 = new com.yandex.passport.data.network.o(this.requestCreatorProvider, this.commonBackendQueryProvider, 15);
            this.requestFactoryProvider20 = oVar2;
            this.getCodeByCookieRequestProvider = t8a.b(new d0(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, (rzm) oVar2, 8));
            qa qaVar = new qa(this.requestCreatorProvider, this.commonBackendQueryProvider, 11);
            this.requestFactoryProvider21 = qaVar;
            this.getMasterTokenByDeviceCodeRequestProvider = t8a.b(new com.yandex.passport.data.network.n(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, qaVar, this.provideMasterTokenTombstoneManagerProvider, 15));
            qa qaVar2 = new qa(this.requestCreatorProvider, this.commonBackendQueryProvider, 9);
            this.requestFactoryProvider22 = qaVar2;
            rzm b8 = t8a.b(new com.yandex.passport.data.network.n(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, qaVar2, this.provideMasterTokenTombstoneManagerProvider, 13));
            this.getMasterTokenByCodeRequestProvider = b8;
            this.authorizeByCodeUseCaseProvider = t8a.b(new h9(this.provideCoroutineDispatchersProvider, this.checkLocationIdUseCaseProvider, this.fetchAndSaveModernAccountUseCaseProvider, b8, this.masterCredentialsProvider, this.environmentDataMapperProvider, 8));
        }

        private void initialize13(com.yandex.passport.internal.di.module.a aVar, com.yandex.passport.internal.di.module.e eVar, com.yandex.passport.internal.di.module.h hVar, com.yandex.passport.internal.di.module.p pVar, Context context, IReporterYandex iReporterYandex, com.yandex.passport.internal.properties.x xVar) {
            qa qaVar = new qa(this.requestCreatorProvider, this.commonBackendQueryProvider, 6);
            this.requestFactoryProvider23 = qaVar;
            rzm rzmVar = this.provideCoroutineDispatchersProvider;
            com.yandex.passport.data.network.n nVar = new com.yandex.passport.data.network.n(rzmVar, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, qaVar, this.provideMasterTokenTombstoneManagerProvider, 12);
            this.updateAvatarRequestProvider = nVar;
            this.updateAvatarUseCaseProvider = t8a.b(new com.yandex.passport.internal.di.module.g(this.setApplicationContextProvider, rzmVar, nVar, this.provideAccountsRetrieverProvider, this.accountSynchronizerProvider, this.environmentDataMapperProvider, 7));
            rzm b = t8a.b(new com.yandex.passport.internal.di.module.f(eVar, this.providePassportDatabaseProvider, 3));
            this.provideDiaryUploadDaoProvider = b;
            rzm b2 = t8a.b(new com.yandex.passport.internal.provider.communication.w(b, this.provideCoroutineDispatchersProvider, 5));
            this.diaryUploadDaoWrapperProvider = b2;
            this.diaryUploadUseCaseProvider = t8a.b(new w(this.provideCoroutineDispatchersProvider, this.flagRepositoryProvider, b2, this.provideClockProvider, this.diaryReporterProvider, 8));
            com.yandex.passport.data.network.o oVar = new com.yandex.passport.data.network.o(this.requestCreatorProvider, this.commonBackendQueryProvider, 8);
            this.requestFactoryProvider24 = oVar;
            this.deviceAuthorizationSubmitRequestProvider = t8a.b(new com.yandex.passport.data.network.n(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, oVar, this.provideMasterTokenTombstoneManagerProvider, 2));
            com.yandex.passport.data.network.o oVar2 = new com.yandex.passport.data.network.o(this.requestCreatorProvider, this.commonBackendQueryProvider, 7);
            this.requestFactoryProvider25 = oVar2;
            this.deviceAuthorizationCommitRequestProvider = t8a.b(new com.yandex.passport.data.network.n(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, oVar2, this.provideMasterTokenTombstoneManagerProvider, 1));
            this.authorizeByMasterTokenUseCaseProvider = t8a.b(new com.yandex.passport.internal.ui.common.c(this.provideCoroutineDispatchersProvider, this.fetchModernAccountUseCaseProvider, this.accountsSaverProvider, 5));
            com.yandex.passport.data.network.o oVar3 = new com.yandex.passport.data.network.o(this.requestCreatorProvider, this.commonBackendQueryProvider, 13);
            this.requestFactoryProvider26 = oVar3;
            this.getChildCodeByUidParentRequestProvider = t8a.b(new d0(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, (rzm) oVar3, 7));
            com.yandex.passport.data.network.o oVar4 = new com.yandex.passport.data.network.o(this.requestCreatorProvider, this.commonBackendQueryProvider, 23);
            this.requestFactoryProvider27 = oVar4;
            this.getTrackPayloadRequestProvider = t8a.b(new com.yandex.passport.data.network.n(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, oVar4, this.provideMasterTokenTombstoneManagerProvider, 8));
            rzm b3 = t8a.b(new com.yandex.passport.common.coroutine.g(this.provideBackendUrlDispatcherProvider, 4));
            this.hostDispatcherProvider = b3;
            s7 s7Var = new s7(this.requestCreatorProvider, this.commonBackendQueryProvider, b3, 0);
            this.requestFactoryProvider28 = s7Var;
            this.getQrLinkRequestProvider = t8a.b(new d0(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, (rzm) s7Var, 12));
            this.linkAuthReporterProvider = t8a.b(new com.yandex.passport.internal.provider.communication.w(this.eventReporterProvider, this.reportingFeatureProvider, 18));
            qa qaVar2 = new qa(this.requestCreatorProvider, this.commonBackendQueryProvider, 13);
            this.requestFactoryProvider29 = qaVar2;
            this.getMasterTokenByTrackIdRequestProvider = t8a.b(new com.yandex.passport.data.network.n(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, qaVar2, this.provideMasterTokenTombstoneManagerProvider, 17));
            s7 s7Var2 = new s7(this.requestCreatorProvider, this.commonBackendQueryProvider, this.hostDispatcherProvider, 1);
            this.requestFactoryProvider30 = s7Var2;
            this.getTrackFromMagicRequestProvider = t8a.b(new d0(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, (rzm) s7Var2, 13));
            rzm b4 = t8a.b(new com.yandex.passport.internal.di.module.f(eVar, this.providePassportDatabaseProvider, 0));
            this.provideAuthCookieDaoProvider = b4;
            this.provideAuthCookieDaoWrapperProvider = t8a.b(new com.yandex.passport.internal.di.module.g(eVar, b4, this.provideCoroutineDispatchersProvider, this.commonDecryptUseCaseProvider, this.commonEncryptUseCaseProvider, this.flagRepositoryProvider));
        }

        private void initialize14(com.yandex.passport.internal.di.module.a aVar, com.yandex.passport.internal.di.module.e eVar, com.yandex.passport.internal.di.module.h hVar, com.yandex.passport.internal.di.module.p pVar, Context context, IReporterYandex iReporterYandex, com.yandex.passport.internal.properties.x xVar) {
            com.yandex.passport.data.network.o oVar = new com.yandex.passport.data.network.o(this.requestCreatorProvider, this.commonBackendQueryProvider, 18);
            this.requestFactoryProvider31 = oVar;
            this.getCookieByTokenRequestProvider = t8a.b(new com.yandex.passport.data.network.n(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, oVar, this.provideMasterTokenTombstoneManagerProvider, 6));
            rzm b = t8a.b(new com.yandex.passport.internal.di.module.d(this.eventReporterProvider, 20));
            this.cookieByTokenReporterProvider = b;
            this.getCookieByTokenUseCaseProvider = t8a.b(new w(this.provideCoroutineDispatchersProvider, this.provideAccountsRetrieverProvider, this.getCookieByTokenRequestProvider, this.environmentDataMapperProvider, b, 15));
            this.getLocationIdUseCaseProvider = t8a.b(new com.yandex.passport.internal.ui.bouncer.roundabout.d(this.provideCoroutineDispatchersProvider, this.provideAccountsRetrieverProvider, 13));
            rzm b2 = t8a.b(new com.yandex.passport.internal.core.accounts.d(this.setApplicationContextProvider, this.provideAndroidAccountManagerHelperProvider, this.provideAccountsRetrieverProvider, this.pushAvailabilityDetectorProvider, this.provideMasterTokenTombstoneManagerProvider, this.baseUrlDispatcherImplProvider, this.eventReporterProvider, this.reportingFeatureProvider, this.modernAccountMapperProvider, 3));
            this.passportInitReporterProvider = b2;
            this.limitedUpdatedPropertiesReportUseCaseProvider = t8a.b(new z0(this.setApplicationContextProvider, this.provideCoroutineDispatchersProvider, this.provideTimeProvider, b2, 25));
            this.requestFactoryProvider32 = new qa(this.requestCreatorProvider, this.commonBackendQueryProvider, 5);
            rzm b3 = t8a.b(new qa(this.provideCoroutineDispatchersProvider, this.provideMasterTokenTombstoneManagerProvider, 8));
            this.usingMasterTokenRequestUseCaseProvider4 = b3;
            this.tryAddPlusDeviceRequestProvider = new w(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, this.requestFactoryProvider32, b3, 3);
            rzm b4 = t8a.b(new com.yandex.passport.internal.provider.communication.w(this.eventReporterProvider, this.reportingFeatureProvider, 19));
            this.managingPlusDevicesReporterProvider = b4;
            this.tryAddPlusDeviceUseCaseProvider = t8a.b(new w(this.provideCoroutineDispatchersProvider, this.tryAddPlusDeviceRequestProvider, this.provideAccountsRetrieverProvider, this.environmentDataMapperProvider, b4, 18));
            this.getAuthorizationUrlReporterProvider = t8a.b(new com.yandex.passport.internal.provider.communication.w(this.eventReporterProvider, this.reportingFeatureProvider, 17));
            this.slothWebParamsProviderImplProvider = t8a.b(new z0(this.provideAnalyticsHelperProvider, this.bindApplicationDetailsProvider, this.commonParamsProvider, this.setPropertiesProvider, 12));
            rzm b5 = t8a.b(com.yandex.passport.internal.common.c.a);
            this.appBackgroundStateWrapperImplProvider = b5;
            this.bindAppBackgroundStateWrapperProvider = t8a.b(new com.yandex.passport.internal.di.module.b(aVar, b5, 0));
            this.setVpnChallengeActivityDisabledPerformerProvider = t8a.b(new s7(this.setApplicationContextProvider, this.checkVpnStatusUseCaseProvider, this.vpnConfigRepositoryProvider, 9));
            qa qaVar = new qa(this.requestCreatorProvider, this.commonBackendQueryProvider, 14);
            this.requestFactoryProvider33 = qaVar;
            this.getMasterTokenForwardByTrackRequestProvider = t8a.b(new com.yandex.passport.data.network.n(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, qaVar, this.provideMasterTokenTombstoneManagerProvider, 18));
            this.slothAuthDelegateImplProvider = t8a.b(new l1(this.authByCookieUseCaseProvider, 3));
            z0 z0Var = new z0(this.setApplicationContextProvider, this.provideAnalyticsHelperProvider, this.localeHelperProvider, this.bindApplicationDetailsProvider, 10);
            this.urlRestorerProvider = z0Var;
            rzm b6 = t8a.b(new com.yandex.passport.data.network.n(this.provideCoroutineDispatchersProvider, z0Var, this.clientTokenDroppingWrapperProvider, this.getAuthorizationUrlUseCaseProvider, this.bindUiLanguageProvider, 26, false));
            this.authQrUseCaseProvider = b6;
            rzm rzmVar = this.provideCoroutineDispatchersProvider;
            this.retryingProvider = new com.yandex.passport.internal.ui.bouncer.roundabout.d(rzmVar, b6, 15);
            rzm b7 = t8a.b(new com.yandex.passport.internal.usecase.ui.n0(rzmVar, this.urlRestorerProvider, this.getAuthorizationUrlUseCaseProvider, this.bindUiLanguageProvider, 1));
            this.showAuthCodeUseCaseProvider = b7;
            this.retryingProvider2 = new com.yandex.passport.internal.ui.bouncer.roundabout.d(this.provideCoroutineDispatchersProvider, b7, 18);
        }

        private void initialize15(com.yandex.passport.internal.di.module.a aVar, com.yandex.passport.internal.di.module.e eVar, com.yandex.passport.internal.di.module.h hVar, com.yandex.passport.internal.di.module.p pVar, Context context, IReporterYandex iReporterYandex, com.yandex.passport.internal.properties.x xVar) {
            rzm b = t8a.b(new com.yandex.passport.internal.ui.common.c(this.provideCoroutineDispatchersProvider, this.bindUiLanguageProvider, this.provideBaseUrlDispatcherProvider, 16));
            this.scopeUrlUseCaseProvider = b;
            this.scopeAuthUrlUseCaseProvider = t8a.b(new w(this.provideCoroutineDispatchersProvider, this.getAuthorizationUrlUseCaseProvider, this.bindUiLanguageProvider, this.clientTokenDroppingWrapperProvider, b, 21));
            rzm b2 = t8a.b(new com.yandex.passport.internal.ui.bouncer.roundabout.d(this.provideCoroutineDispatchersProvider, this.urlRestorerProvider, 17));
            this.picturePushUrlUseCaseProvider = b2;
            this.slothUrlProviderImplProvider = t8a.b(new com.yandex.passport.internal.analytics.d0(this.getAuthorizationUrlUseCaseProvider, this.retryingProvider, this.retryingProvider2, this.scopeAuthUrlUseCaseProvider, this.scopeUrlUseCaseProvider, b2, this.urlRestorerProvider, 1));
            this.slothBaseUrlProviderImplProvider = t8a.b(new l1(this.provideBaseUrlDispatcherProvider, 4));
            this.slothReportDelegateImplProvider = t8a.b(new h1(this.provideReporterProvider, this.reportingFeatureProvider, 8));
            h1 h1Var = new h1(this.setApplicationContextProvider, this.setPropertiesProvider, 6);
            this.slothEulaSupportProvider = h1Var;
            com.yandex.passport.internal.badges.f fVar = new com.yandex.passport.internal.badges.f(this.whiteListRegexConfigStorageProvider, h1Var, this.provideBaseUrlDispatcherProvider);
            this.urlCheckerProvider = fVar;
            this.slothUrlCheckerImplProvider = t8a.b(new k(this.configStorageProvider, fVar, 4));
            rzm b3 = t8a.b(new h1(this.eventReporterProvider, this.reportingFeatureProvider, 3));
            this.webAmReporterProvider = b3;
            rzm rzmVar = this.provideCoroutineDispatchersProvider;
            com.yandex.passport.internal.ui.common.c cVar = new com.yandex.passport.internal.ui.common.c(rzmVar, this.getCookieByTokenUseCaseProvider, b3, 14);
            this.fetchAuthCookieUseCaseProvider = cVar;
            com.yandex.passport.internal.flags.experiments.h hVar2 = new com.yandex.passport.internal.flags.experiments.h(2, cVar);
            this.slothAuthCookieProviderImplProvider = hVar2;
            this.slothDependenciesFactoryProvider = t8a.b(new kdk(this.setApplicationContextProvider, rzmVar, this.slothAuthDelegateImplProvider, this.slothUrlProviderImplProvider, this.slothBaseUrlProviderImplProvider, this.flagRepositoryProvider, this.slothReportDelegateImplProvider, this.bindUiLanguageProvider, this.slothWebParamsProviderImplProvider, this.slothUrlCheckerImplProvider, hVar2, this.connectionTypeImplProvider, 1));
            this.getCustomEulaStringsCommandPerformerProvider = new l1(this.slothEulaSupportProvider, 6);
            rzm b4 = t8a.b(new com.yandex.passport.internal.di.module.t(pVar, this.setPropertiesProvider, 9));
            this.provideTwoFactorOtpProvider = b4;
            this.getOtpCommandPerformerProvider = new l1(b4, 7);
            rzm rzmVar2 = this.setApplicationContextProvider;
            this.getPhoneRegionCodeCommandPerformerProvider = new l1(rzmVar2, 8);
            this.getSmsCommandPerformerProvider = new z0(rzmVar2, this.smsRetrieverHelperProvider, this.domikStatefulReporterProvider, this.provideCoroutineScopesProvider, 13);
            this.debugOnlyGetSmsVerificationHashPerformerProvider = new l1(rzmVar2, 5);
            this.getXTokenClientIdCommandPerformerProvider = new l1(this.setPropertiesProvider, 9);
            rzm b5 = t8a.b(new com.yandex.passport.internal.di.module.l(hVar, this.setIReporterInternalProvider, rzmVar2, 2));
            this.provideSmartLockInterfaceProvider = b5;
            this.requestLoginCredentialsCommandPerformerProvider = new h1(b5, this.setApplicationContextProvider, 9);
            this.requestMagicLinkParamsCommandPerformerProvider = new h1(this.setPropertiesProvider, this.provideAnalyticsHelperProvider, 10);
            qa qaVar = new qa(this.experimentsOverridesProvider, this.flagRepositoryProvider, 27);
            this.savedExperimentsProvider = qaVar;
            this.requestSavedExperimentsCommandPerformerProvider = new com.yandex.passport.internal.flags.experiments.h(3, qaVar);
        }

        private void initialize16(com.yandex.passport.internal.di.module.a aVar, com.yandex.passport.internal.di.module.e eVar, com.yandex.passport.internal.di.module.h hVar, com.yandex.passport.internal.di.module.p pVar, Context context, IReporterYandex iReporterYandex, com.yandex.passport.internal.properties.x xVar) {
            rzm rzmVar = this.provideSmartLockInterfaceProvider;
            rzm rzmVar2 = this.setApplicationContextProvider;
            this.saveLoginCredentialsCommandPerformerProvider = new h1(rzmVar, rzmVar2, 11);
            this.provideWebAuthNClientProvider = t8a.b(new com.yandex.passport.internal.di.module.l(hVar, rzmVar2, this.flagRepositoryProvider, 3));
            rzm b = t8a.b(new l1(this.eventReporterProvider, 1));
            this.webAuthNReporterProvider = b;
            rzm rzmVar3 = this.provideWebAuthNClientProvider;
            h1 h1Var = new h1(rzmVar3, b, 12);
            this.webAuthNAuthPerformerProvider = h1Var;
            h1 h1Var2 = new h1(rzmVar3, b, 13);
            this.webAuthNRegisterPerformerProvider = h1Var2;
            s7 s7Var = new s7(rzmVar3, this.setPropertiesProvider, b, 16);
            this.webAuthNAvailabilityPerformerProvider = s7Var;
            rzm b2 = t8a.b(new d13(this.getCustomEulaStringsCommandPerformerProvider, this.getOtpCommandPerformerProvider, this.getPhoneRegionCodeCommandPerformerProvider, this.getSmsCommandPerformerProvider, this.debugOnlyGetSmsVerificationHashPerformerProvider, this.getXTokenClientIdCommandPerformerProvider, this.requestLoginCredentialsCommandPerformerProvider, this.requestMagicLinkParamsCommandPerformerProvider, this.requestSavedExperimentsCommandPerformerProvider, this.saveLoginCredentialsCommandPerformerProvider, h1Var, h1Var2, s7Var, 2));
            this.primarySlothPerformBinderProvider = b2;
            this.slothStandalonePerformConfigurationProvider = t8a.b(new com.yandex.passport.internal.ui.bouncer.sloth.i(b2, 11));
            this.webCardEventSenderProvider = t8a.b(com.yandex.passport.internal.sloth.performers.webcard.h.a);
            rzm b3 = t8a.b(new h9(this.provideCoroutineDispatchersProvider, this.provideAccountsRetrieverProvider, this.provideBackendClientChooserProvider, this.bindUiLanguageProvider, this.tldResolverProvider, this.getAuthorizationUrlUseCaseProvider, 9));
            this.changePasswordUseCaseProvider = b3;
            rzm rzmVar4 = this.webCardEventSenderProvider;
            h1 h1Var3 = new h1(rzmVar4, b3, 14);
            this.beginChangePasswordFlowCommandPerformerProvider = h1Var3;
            h1 h1Var4 = new h1(rzmVar4, this.flagRepositoryProvider, 15);
            this.setPopupSizeCommandPerformerProvider = h1Var4;
            rzm b4 = t8a.b(new com.yandex.passport.internal.di.module.n(h1Var3, h1Var4, this.getPhoneRegionCodeCommandPerformerProvider, this.requestSavedExperimentsCommandPerformerProvider, this.getCustomEulaStringsCommandPerformerProvider, this.requestLoginCredentialsCommandPerformerProvider, this.webAuthNAvailabilityPerformerProvider));
            this.webCardSlothPerformBinderProvider = b4;
            this.slothWebCardPerformConfigurationProvider = t8a.b(new com.yandex.passport.internal.ui.bouncer.sloth.i(b4, 17));
            rzm b5 = t8a.b(com.yandex.passport.internal.sloth.performers.usermenu.i.a);
            this.userMenuEventSenderProvider = b5;
            l1 l1Var = new l1(b5, 10);
            this.finishWithItemCommandPerformerProvider = l1Var;
            int i = 11;
            l1 l1Var2 = new l1(b5, i);
            this.itemClickCommandPerformerProvider = l1Var2;
            rzm b6 = t8a.b(new k(l1Var, l1Var2, i));
            this.userMenuSlothPerformBinderProvider = b6;
            this.slothUserMenuPerformConfigurationProvider = t8a.b(new com.yandex.passport.internal.ui.bouncer.sloth.i(b6, 15));
            this.bouncerReporterProvider = t8a.b(new s7(this.eventReporterProvider, this.reportingFeatureProvider, this.provideAccountsRetrieverProvider, 14));
            this.linkHandlingReporterProvider = t8a.b(new com.yandex.passport.internal.di.module.d(this.eventReporterProvider, 25));
            com.yandex.passport.data.network.o oVar = new com.yandex.passport.data.network.o(this.requestCreatorProvider, this.commonBackendQueryProvider, 11);
            this.requestFactoryProvider34 = oVar;
            rzm b7 = t8a.b(new d0(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, (rzm) oVar, 5));
            this.getBadgesSpecificationRequestProvider = b7;
            this.updateBadgesConfigUseCaseProvider = t8a.b(new w(this.provideCoroutineDispatchersProvider, this.badgesStorageProvider, b7, this.badgesReporterProvider, this.environmentDataMapperProvider, 4));
            this.requestFactoryProvider35 = new com.yandex.passport.data.network.o(this.requestCreatorProvider, this.commonBackendQueryProvider, 22);
        }

        private void initialize17(com.yandex.passport.internal.di.module.a aVar, com.yandex.passport.internal.di.module.e eVar, com.yandex.passport.internal.di.module.h hVar, com.yandex.passport.internal.di.module.p pVar, Context context, IReporterYandex iReporterYandex, com.yandex.passport.internal.properties.x xVar) {
            rzm b = t8a.b(new z0(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, this.requestFactoryProvider35, 1));
            this.getSsoConfigRequestProvider = b;
            this.getAppAccountVisibilityConfigUseCaseProvider = t8a.b(new h9(this.provideCoroutineDispatchersProvider, b, this.configReporterProvider, this.configStatusStorageProvider, this.environmentDataMapperProvider, this.accountSharingConfigStorageProvider, 1));
            rzm b2 = t8a.b(new com.yandex.passport.internal.di.module.d(this.eventReporterProvider, 16));
            this.accountSharingReporterProvider = b2;
            this.manageAccountsVisibilityForBlacklistedAppsUseCaseProvider = t8a.b(new z0(this.provideCoroutineDispatchersProvider, this.accountSharingConfigStorageProvider, this.provideAndroidAccountManagerHelperProvider, b2, 26));
            qa qaVar = new qa(this.requestCreatorProvider, this.commonBackendQueryProvider, 12);
            this.requestFactoryProvider36 = qaVar;
            rzm b3 = t8a.b(new com.yandex.passport.data.network.n(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, qaVar, this.provideMasterTokenTombstoneManagerProvider, 16));
            this.getMasterTokenByMailishSocialTaskIdRequestProvider = b3;
            this.authorizeByMailOAuthTaskIdUseCaseProvider = t8a.b(new w(this.provideCoroutineDispatchersProvider, this.fetchAndSaveModernAccountUseCaseProvider, b3, this.masterCredentialsProvider, this.environmentDataMapperProvider, 19));
            rzm b4 = t8a.b(new z0(this.provideAccountsRetrieverProvider, this.completeStatusRequestProvider, this.environmentDataMapperProvider, this.contextUtilsProvider, 22));
            this.getUpgradeUrlUseCaseProvider = b4;
            rzm rzmVar = this.provideCoroutineDispatchersProvider;
            z0 z0Var = new z0(rzmVar, b4, this.provideAccountsRetrieverProvider, this.accountUpgradeReporterProvider, 21);
            this.accountUpgradeLaunchUseCaseProvider = z0Var;
            this.accountUpgraderViewModelProvider = new com.yandex.passport.internal.flags.experiments.h(5, z0Var);
            this.limitedPassportInitReportUseCaseProvider = t8a.b(new z0(this.setApplicationContextProvider, rzmVar, this.provideTimeProvider, this.passportInitReporterProvider, 24));
            rzm b5 = t8a.b(new s7(this.setApplicationContextProvider, this.eventReporterProvider, this.flagRepositoryProvider, 15));
            this.dependenciesReporterProvider = b5;
            this.limitedDependenciesReportUseCaseProvider = t8a.b(new com.yandex.passport.internal.ui.common.c(this.setApplicationContextProvider, this.provideCoroutineDispatchersProvider, b5, 10));
            this.authSdkReporterProvider = t8a.b(new com.yandex.passport.internal.provider.communication.w(this.eventReporterProvider, this.reportingFeatureProvider, 8));
            this.standaloneReporterProvider = t8a.b(new com.yandex.passport.internal.provider.communication.w(this.eventReporterProvider, this.reportingFeatureProvider, 26));
            this.warmUpWebViewReporterProvider = t8a.b(new h1(this.eventReporterProvider, this.reportingFeatureProvider, 2));
            rzm b6 = t8a.b(new com.yandex.passport.common.coroutine.g(this.setApplicationContextProvider, 29));
            this.provideCoolDownUidStorageProvider = b6;
            this.makeTokenMasterCoolDownStorageProvider = t8a.b(new l1(b6, 12));
            this.updateMasterTokenReporterProvider = t8a.b(new com.yandex.passport.internal.di.module.d(this.eventReporterProvider, 29));
            this.otpWaReporterProvider = t8a.b(new com.yandex.passport.internal.di.module.d(this.eventReporterProvider, 26));
            this.handleVpnAppBackgroundStateUseCaseProvider = t8a.b(new com.yandex.passport.internal.ui.common.c(this.checkVpnStatusUseCaseProvider, this.bindNetworkWrapperProvider, this.flagRepositoryProvider, 18));
            s7 s7Var = new s7(this.checkVpnStatusUseCaseProvider, this.vpnCookieRepositoryProvider, this.vpnChallengeReporterProvider, 29);
            this.vpnChallengeStoreFactoryProvider = s7Var;
            com.yandex.passport.internal.ui.challenge.vpn.z zVar = new com.yandex.passport.internal.ui.challenge.vpn.z(s7Var);
            this.vpnChallengeViewModelProvider = zVar;
            this.factoryProvider = toe.a(new a0(zVar));
            this.challengeReporterProvider = t8a.b(new com.yandex.passport.internal.provider.communication.w(this.eventReporterProvider, this.reportingFeatureProvider, 13));
        }

        private void initialize18(com.yandex.passport.internal.di.module.a aVar, com.yandex.passport.internal.di.module.e eVar, com.yandex.passport.internal.di.module.h hVar, com.yandex.passport.internal.di.module.p pVar, Context context, IReporterYandex iReporterYandex, com.yandex.passport.internal.properties.x xVar) {
            this.challengeHelperProvider = t8a.b(new h9(this.provideBaseUrlDispatcherProvider, this.getChallengeUseCaseProvider, this.getAuthorizationUrlUseCaseProvider, this.bindUiLanguageProvider, this.flagRepositoryProvider, this.challengeReporterProvider, 6));
            this.deleteAccountUseCaseProvider = t8a.b(new z0(this.provideCoroutineDispatchersProvider, this.removeAccountUseCaseProvider, this.provideEventReporterProvider, this.provideDatabaseHelperProvider, 29));
            com.yandex.passport.data.network.o oVar = new com.yandex.passport.data.network.o(this.requestCreatorProvider, this.commonBackendQueryProvider, 9);
            this.requestFactoryProvider37 = oVar;
            rzm b = t8a.b(new com.yandex.passport.data.network.n(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, oVar, this.provideMasterTokenTombstoneManagerProvider, 3));
            this.disablePhonishRequestProvider = b;
            this.deletePhonishForeverUseCaseProvider = t8a.b(new com.yandex.passport.internal.ui.common.c(this.provideCoroutineDispatchersProvider, b, this.environmentDataMapperProvider, 13));
            this.esiaBindingReporterProvider = t8a.b(new com.yandex.passport.internal.di.module.d(this.eventReporterProvider, 23));
            this.provideSlothReportDelegateProvider = new com.yandex.passport.internal.di.module.t(pVar, this.slothReportDelegateImplProvider, 8);
            this.webCardReporterProvider = t8a.b(new h1(this.eventReporterProvider, this.reportingFeatureProvider, 4));
            this.providePassportBiometricApiProvider = t8a.b(new com.yandex.passport.internal.di.module.c(aVar, 1));
            com.yandex.passport.data.network.o oVar2 = new com.yandex.passport.data.network.o(this.requestCreatorProvider, this.commonBackendQueryProvider, 2);
            this.requestFactoryProvider38 = oVar2;
            this.biometricTrackInitRequestProvider = t8a.b(new d0(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, (rzm) oVar2, 0));
            rzm b2 = t8a.b(new com.yandex.passport.internal.di.module.d(this.eventReporterProvider, 22));
            this.ebsReporterProvider = b2;
            this.biometricTrackInitUseCaseProvider = t8a.b(new w(this.provideCoroutineDispatchersProvider, this.provideAccountsRetrieverProvider, this.biometricTrackInitRequestProvider, this.environmentDataMapperProvider, b2, 12));
            com.yandex.passport.data.network.o oVar3 = new com.yandex.passport.data.network.o(this.requestCreatorProvider, this.commonBackendQueryProvider, 25);
            this.requestFactoryProvider39 = oVar3;
            rzm b3 = t8a.b(new d0(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, (rzm) oVar3, 14));
            this.makeJwtTokenRequestProvider = b3;
            this.makeJwtTokenUseCaseProvider = t8a.b(new w(this.provideCoroutineDispatchersProvider, this.provideAccountsRetrieverProvider, b3, this.environmentDataMapperProvider, this.ebsReporterProvider, 16));
            qa qaVar = new qa(this.requestCreatorProvider, this.commonBackendQueryProvider, 3);
            this.requestFactoryProvider40 = qaVar;
            rzm b4 = t8a.b(new d0(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, (rzm) qaVar, 18));
            this.startBiometricSessionRequestProvider = b4;
            this.startBiometricSessionUseCaseProvider = t8a.b(new h9(this.provideCoroutineDispatchersProvider, this.provideAccountsRetrieverProvider, b4, this.environmentDataMapperProvider, this.ebsConfigStorageProvider, this.ebsReporterProvider, 7));
            com.yandex.passport.data.network.o oVar4 = new com.yandex.passport.data.network.o(this.requestCreatorProvider, this.commonBackendQueryProvider, 3);
            this.requestFactoryProvider41 = oVar4;
            rzm b5 = t8a.b(new d0(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, (rzm) oVar4, 1));
            this.checkAgeByTrackIdRequestProvider = b5;
            this.checkAgeByTrackIdUseCaseProvider = t8a.b(new w(this.provideCoroutineDispatchersProvider, this.provideAccountsRetrieverProvider, b5, this.environmentDataMapperProvider, this.ebsReporterProvider, 13));
            qa qaVar2 = new qa(this.requestCreatorProvider, this.commonBackendQueryProvider, 1);
            this.requestFactoryProvider42 = qaVar2;
            rzm b6 = t8a.b(new d0(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, (rzm) qaVar2, 16));
            this.smsCodeSendingRequestProvider = b6;
            this.smsCodeSendingUseCaseProvider = t8a.b(new com.yandex.passport.internal.usecase.ui.n0(this.provideCoroutineDispatchersProvider, b6, this.bindApplicationDetailsProvider, this.environmentDataMapperProvider, 2));
        }

        private void initialize19(com.yandex.passport.internal.di.module.a aVar, com.yandex.passport.internal.di.module.e eVar, com.yandex.passport.internal.di.module.h hVar, com.yandex.passport.internal.di.module.p pVar, Context context, IReporterYandex iReporterYandex, com.yandex.passport.internal.properties.x xVar) {
            qa qaVar = new qa(this.requestCreatorProvider, this.commonBackendQueryProvider, 7);
            this.requestFactoryProvider43 = qaVar;
            rzm b = t8a.b(new d0(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, (rzm) qaVar, 20));
            this.validatePhoneNumberRequestProvider = b;
            this.startRegistrationUseCaseProvider = t8a.b(new h9(this.loginControllerProvider, this.smsCodeSendingUseCaseProvider, this.provideCoroutineDispatchersProvider, this.suggestedLanguageUseCaseProvider, b, this.environmentDataMapperProvider, 10));
            com.yandex.passport.common.coroutine.g gVar = new com.yandex.passport.common.coroutine.g(this.provideClockProvider, 3);
            this.responseTransformerProvider2 = gVar;
            com.yandex.passport.data.network.o oVar = new com.yandex.passport.data.network.o(this.requestCreatorProvider, this.commonBackendQueryProvider, 28);
            this.requestFactoryProvider44 = oVar;
            rzm b2 = t8a.b(new com.yandex.passport.data.network.n(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, gVar, oVar, 10));
            this.registerPhonishRequestProvider = b2;
            rzm b3 = t8a.b(new com.yandex.passport.internal.usecase.ui.n0(this.provideCoroutineDispatchersProvider, b2, this.environmentDataMapperProvider, this.provideUserInfoMapperProvider, 0));
            this.registerPhonishUseCaseProvider = b3;
            this.domikLoginHelperProvider = t8a.b(new z0(this.provideBackendClientChooserProvider, this.setPropertiesProvider, this.loginControllerProvider, b3, 9));
            qa qaVar2 = new qa(this.requestCreatorProvider, this.commonBackendQueryProvider, 2);
            this.requestFactoryProvider45 = qaVar2;
            this.smsCodeVerificationRequestProvider = t8a.b(new d0(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, (rzm) qaVar2, 17));
            com.yandex.passport.data.network.o oVar2 = new com.yandex.passport.data.network.o(this.requestCreatorProvider, this.commonBackendQueryProvider, 6);
            this.requestFactoryProvider46 = oVar2;
            rzm b4 = t8a.b(new d0(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, (rzm) oVar2, 3));
            this.countrySuggestionRequestProvider = b4;
            rzm b5 = t8a.b(new com.yandex.passport.internal.ui.common.c(this.provideCoroutineDispatchersProvider, b4, this.environmentDataMapperProvider, 12));
            this.countrySuggestionUseCaseProvider = b5;
            this.requestSmsUseCaseProvider = t8a.b(new w(this.smsCodeSendingUseCaseProvider, this.contextUtilsProvider, this.suggestedLanguageUseCaseProvider, b5, this.provideCoroutineDispatchersProvider, 20));
            this.requestSmsUseCaseProvider2 = t8a.b(new w(this.smsCodeSendingUseCaseProvider, this.contextUtilsProvider, this.suggestedLanguageUseCaseProvider, this.countrySuggestionUseCaseProvider, this.provideCoroutineDispatchersProvider, 20));
            this.startAuthorizationUseCaseProvider = t8a.b(new com.yandex.passport.internal.ui.common.c(this.loginControllerProvider, this.suggestedLanguageUseCaseProvider, this.provideCoroutineDispatchersProvider, 17));
            this.createProfileReporterProvider = t8a.b(new com.yandex.passport.internal.di.module.d(this.eventReporterProvider, 21));
            rzm b6 = t8a.b(new com.yandex.passport.internal.di.module.t(pVar, this.setApplicationContextProvider, 1));
            this.provideClipboardManagerProvider = b6;
            com.yandex.passport.common.coroutine.g gVar2 = new com.yandex.passport.common.coroutine.g(b6, 13);
            this.clipboardControllerImplProvider = gVar2;
            this.provideClipboardControllerProvider = t8a.b(new k(pVar, gVar2, 3));
            this.provideIsWhiteLabelProvider = new com.yandex.passport.internal.di.module.b(aVar, this.setPropertiesProvider, 6);
            this.bindPhoneNumberReporterProvider = t8a.b(new com.yandex.passport.internal.provider.communication.w(this.eventReporterProvider, this.reportingFeatureProvider, 12));
            this.getNotLoggedInMembersUseCaseProvider = new com.yandex.passport.internal.ui.bouncer.sloth.i(this.memberAccountRepositoryProvider, 18);
            this.slothBouncerPerformConfigurationProvider = t8a.b(new l1(this.primarySlothPerformBinderProvider, 25));
        }

        private void initialize2(com.yandex.passport.internal.di.module.a aVar, com.yandex.passport.internal.di.module.e eVar, com.yandex.passport.internal.di.module.h hVar, com.yandex.passport.internal.di.module.p pVar, Context context, IReporterYandex iReporterYandex, com.yandex.passport.internal.properties.x xVar) {
            rzm b = t8a.b(new s7(this.provideReporterProvider, this.commonParamsProvider, this.reportingFeatureProvider, 12));
            this.eventReporterProvider = b;
            rzm b2 = t8a.b(new com.yandex.passport.internal.provider.communication.w(b, this.reportingFeatureProvider, 15));
            this.encryptReporterProvider = b2;
            rzm b3 = t8a.b(new com.yandex.passport.internal.ui.bouncer.sloth.i(b2, 19));
            this.getSecretsUseCaseProvider = b3;
            this.commonEncryptUseCaseProvider = t8a.b(new com.yandex.passport.internal.ui.common.c(b3, this.flagRepositoryProvider, this.encryptReporterProvider, 8));
            this.commonDecryptUseCaseProvider = t8a.b(new com.yandex.passport.internal.ui.common.c(this.getSecretsUseCaseProvider, this.encryptReporterProvider, this.flagRepositoryProvider, 7));
            rzm b4 = t8a.b(new com.yandex.passport.internal.di.module.q(pVar, 0));
            this.provideAccountParserJsonProvider = b4;
            com.yandex.passport.internal.di.module.t tVar = new com.yandex.passport.internal.di.module.t(pVar, b4, 10);
            this.provideUserInfoMapperProvider = tVar;
            com.yandex.passport.internal.flags.experiments.h hVar2 = new com.yandex.passport.internal.flags.experiments.h(1, tVar);
            this.modernAccountMapperProvider = hVar2;
            this.provideDatabaseHelperProvider = t8a.b(new com.yandex.passport.internal.di.module.g(eVar, this.setApplicationContextProvider, this.commonEncryptUseCaseProvider, this.commonDecryptUseCaseProvider, hVar2, this.flagRepositoryProvider));
            this.provideOkHttpClientProvider = t8a.b(new com.yandex.passport.internal.di.module.j(hVar, this.setPropertiesProvider, this.setApplicationContextProvider, this.flagRepositoryProvider, 1));
            this.propertyUpdaterProvider = t8a.b(new com.yandex.passport.internal.di.module.d(this.setPropertiesProvider, 8));
            rzm rzmVar = this.setApplicationContextProvider;
            this.commonConfigPrefsProvider = new com.yandex.passport.common.coroutine.g(rzmVar, 18);
            rzm b5 = t8a.b(new qa(rzmVar, this.setPropertiesProvider, 18));
            this.applicationDetailsProviderImplProvider = b5;
            rzm b6 = t8a.b(new com.yandex.passport.internal.di.module.b(aVar, b5, 1));
            this.bindApplicationDetailsProvider = b6;
            this.configStorageProvider = new qa(this.commonConfigPrefsProvider, b6, 19);
            this.provideDeviceDensityProvider = t8a.b(new com.yandex.passport.internal.di.module.b(aVar, this.setApplicationContextProvider, 5));
            rzm b7 = t8a.b(new com.yandex.passport.internal.di.module.d(this.setApplicationContextProvider, 1));
            this.provideUrlTemplateDataStoreProvider = b7;
            com.yandex.passport.common.coroutine.g gVar = new com.yandex.passport.common.coroutine.g(b7, 22);
            this.urlTemplateRepositoryProvider = gVar;
            com.yandex.passport.data.network.n nVar = new com.yandex.passport.data.network.n(this.propertyUpdaterProvider, this.configStorageProvider, this.flagRepositoryProvider, this.provideDeviceDensityProvider, gVar, 21);
            this.baseUrlDispatcherImplProvider = nVar;
            this.provideBaseUrlDispatcherProvider = t8a.b(new k(hVar, nVar, 2));
            this.provideAnalyticsTrackerWrapperProvider = t8a.b(new com.yandex.passport.internal.di.module.t(pVar, this.setIReporterInternalProvider, 0));
            rzm b8 = t8a.b(new com.yandex.passport.internal.provider.communication.w(this.eventReporterProvider, this.reportingFeatureProvider, 29));
            this.tokenActionReporterProvider = b8;
            this.provideBackendParserProvider = t8a.b(new com.yandex.passport.internal.di.module.j(hVar, this.provideAnalyticsTrackerWrapperProvider, this.provideClockProvider, b8, 0));
            this.provideBackendReporterProvider = t8a.b(new com.yandex.passport.internal.di.module.i(hVar, this.provideAnalyticsTrackerWrapperProvider, 1));
            this.masterCredentialsProvider = t8a.b(new com.yandex.passport.common.coroutine.g(this.setPropertiesProvider, 26));
        }

        private void initialize3(com.yandex.passport.internal.di.module.a aVar, com.yandex.passport.internal.di.module.e eVar, com.yandex.passport.internal.di.module.h hVar, com.yandex.passport.internal.di.module.p pVar, Context context, IReporterYandex iReporterYandex, com.yandex.passport.internal.properties.x xVar) {
            this.provideProductionBackendClientProvider = t8a.b(new com.yandex.passport.internal.di.module.m(hVar, this.provideOkHttpClientProvider, this.provideBaseUrlDispatcherProvider, this.provideBackendParserProvider, this.provideBackendReporterProvider, this.provideAnalyticsHelperProvider, this.contextUtilsProvider, this.bindApplicationDetailsProvider, this.masterCredentialsProvider, 0));
            this.provideTeamProductionBackendClientProvider = t8a.b(new com.yandex.passport.internal.di.module.m(hVar, this.provideOkHttpClientProvider, this.provideBaseUrlDispatcherProvider, this.provideBackendParserProvider, this.provideBackendReporterProvider, this.provideAnalyticsHelperProvider, this.contextUtilsProvider, this.bindApplicationDetailsProvider, this.masterCredentialsProvider, 2));
            this.provideTestingBackendClientProvider = t8a.b(new com.yandex.passport.internal.di.module.m(hVar, this.provideOkHttpClientProvider, this.provideBaseUrlDispatcherProvider, this.provideBackendParserProvider, this.provideBackendReporterProvider, this.provideAnalyticsHelperProvider, this.contextUtilsProvider, this.bindApplicationDetailsProvider, this.masterCredentialsProvider, 4));
            this.provideTeamTestingBackendClientProvider = t8a.b(new com.yandex.passport.internal.di.module.m(hVar, this.provideOkHttpClientProvider, this.provideBaseUrlDispatcherProvider, this.provideBackendParserProvider, this.provideBackendReporterProvider, this.provideAnalyticsHelperProvider, this.contextUtilsProvider, this.bindApplicationDetailsProvider, this.masterCredentialsProvider, 3));
            this.provideRcBackendClientProvider = t8a.b(new com.yandex.passport.internal.di.module.m(hVar, this.provideOkHttpClientProvider, this.provideBaseUrlDispatcherProvider, this.provideBackendParserProvider, this.provideBackendReporterProvider, this.provideAnalyticsHelperProvider, this.contextUtilsProvider, this.bindApplicationDetailsProvider, this.masterCredentialsProvider, 1));
            int i = o9h.b;
            LinkedHashMap J = ff7.J(5);
            rzm rzmVar = this.provideProductionBackendClientProvider;
            a4g.r(rzmVar, "provider");
            J.put(1, rzmVar);
            rzm rzmVar2 = this.provideTeamProductionBackendClientProvider;
            a4g.r(rzmVar2, "provider");
            J.put(2, rzmVar2);
            rzm rzmVar3 = this.provideTestingBackendClientProvider;
            a4g.r(rzmVar3, "provider");
            J.put(3, rzmVar3);
            rzm rzmVar4 = this.provideTeamTestingBackendClientProvider;
            a4g.r(rzmVar4, "provider");
            J.put(4, rzmVar4);
            rzm rzmVar5 = this.provideRcBackendClientProvider;
            a4g.r(rzmVar5, "provider");
            J.put(5, rzmVar5);
            this.mapOfIntegerAndBackendClientProvider = new o9h(J);
            rzm b = t8a.b(new com.yandex.passport.internal.ui.bouncer.roundabout.d(this.setApplicationContextProvider, this.localeHelperProvider, 6));
            this.uiLanguageProviderImplProvider = b;
            this.bindUiLanguageProvider = t8a.b(new com.yandex.passport.internal.di.module.b(aVar, b, 4));
            rzm b2 = t8a.b(com.yandex.passport.internal.common.c.b);
            this.tldResolverProvider = b2;
            this.provideProductionFrontendClientProvider = t8a.b(new com.yandex.passport.internal.di.module.n(hVar, this.bindUiLanguageProvider, this.provideAnalyticsHelperProvider, b2, this.provideBaseUrlDispatcherProvider, this.bindApplicationDetailsProvider, this.masterCredentialsProvider));
            this.provideTestingFrontendClientProvider = t8a.b(new com.yandex.passport.internal.di.module.o(hVar, this.bindUiLanguageProvider, this.provideAnalyticsHelperProvider, this.tldResolverProvider, this.provideBaseUrlDispatcherProvider, this.bindApplicationDetailsProvider, this.masterCredentialsProvider, this.configStorageProvider, 3));
            this.provideTeamFrontendClientProvider = t8a.b(new com.yandex.passport.internal.di.module.o(hVar, this.bindUiLanguageProvider, this.provideAnalyticsHelperProvider, this.tldResolverProvider, this.provideBaseUrlDispatcherProvider, this.bindApplicationDetailsProvider, this.masterCredentialsProvider, this.configStorageProvider, 1));
            this.provideTeamTestingFrontendClientProvider = t8a.b(new com.yandex.passport.internal.di.module.o(hVar, this.bindUiLanguageProvider, this.provideAnalyticsHelperProvider, this.tldResolverProvider, this.provideBaseUrlDispatcherProvider, this.bindApplicationDetailsProvider, this.masterCredentialsProvider, this.configStorageProvider, 2));
            this.provideRcFrontendClientProvider = t8a.b(new com.yandex.passport.internal.di.module.o(hVar, this.bindUiLanguageProvider, this.provideAnalyticsHelperProvider, this.tldResolverProvider, this.provideBaseUrlDispatcherProvider, this.bindApplicationDetailsProvider, this.masterCredentialsProvider, this.configStorageProvider, 0));
            LinkedHashMap J2 = ff7.J(5);
            rzm rzmVar6 = this.provideProductionFrontendClientProvider;
            a4g.r(rzmVar6, "provider");
            J2.put(1, rzmVar6);
            rzm rzmVar7 = this.provideTestingFrontendClientProvider;
            a4g.r(rzmVar7, "provider");
            J2.put(3, rzmVar7);
            rzm rzmVar8 = this.provideTeamFrontendClientProvider;
            a4g.r(rzmVar8, "provider");
            J2.put(2, rzmVar8);
            rzm rzmVar9 = this.provideTeamTestingFrontendClientProvider;
            a4g.r(rzmVar9, "provider");
            J2.put(4, rzmVar9);
            rzm rzmVar10 = this.provideRcFrontendClientProvider;
            a4g.r(rzmVar10, "provider");
            J2.put(5, rzmVar10);
            o9h o9hVar = new o9h(J2);
            this.mapOfIntegerAndFrontendClientProvider = o9hVar;
            this.provideBackendClientChooserProvider = t8a.b(new com.yandex.passport.internal.badges.f(hVar, this.mapOfIntegerAndBackendClientProvider, o9hVar, 1));
            rzm b3 = t8a.b(new l1(this.setApplicationContextProvider, 13));
            this.preferenceStorageProvider = b3;
            this.masterTokenEncrypterProvider = t8a.b(new qa(this.setApplicationContextProvider, b3, 21));
            this.provideEventReporterProvider = t8a.b(new com.yandex.passport.internal.di.module.t(pVar, this.provideAnalyticsTrackerWrapperProvider, 2));
            this.stashReporterProvider = t8a.b(new com.yandex.passport.internal.provider.communication.w(this.eventReporterProvider, this.reportingFeatureProvider, 27));
            rzm b4 = t8a.b(new com.yandex.passport.internal.di.module.d(this.eventReporterProvider, 28));
            this.storageReporterProvider = b4;
            rzm b5 = t8a.b(new qa(this.setApplicationContextProvider, b4, 25));
            this.provideDataStoreProvider = b5;
            rzm b6 = t8a.b(new l1(b5, 14));
            this.dataStoreManagerImplProvider = b6;
            this.provideDataStoreManagerProvider = t8a.b(new com.yandex.passport.internal.di.module.d(b6, 0));
            this.tombstoneReporterProvider = t8a.b(new h1(this.eventReporterProvider, this.reportingFeatureProvider, 0));
        }

        private void initialize4(com.yandex.passport.internal.di.module.a aVar, com.yandex.passport.internal.di.module.e eVar, com.yandex.passport.internal.di.module.h hVar, com.yandex.passport.internal.di.module.p pVar, Context context, IReporterYandex iReporterYandex, com.yandex.passport.internal.properties.x xVar) {
            rzm b = t8a.b(new s7(this.provideDataStoreManagerProvider, this.bindApplicationDetailsProvider, this.tombstoneReporterProvider, 10));
            this.masterTokenTombstoneManagerImplProvider = b;
            this.provideMasterTokenTombstoneManagerProvider = t8a.b(new com.yandex.passport.internal.di.module.i(hVar, b, 4));
            rzm b2 = t8a.b(new com.yandex.passport.internal.provider.communication.w(this.eventReporterProvider, this.reportingFeatureProvider, 14));
            this.delayedAccountReporterProvider = b2;
            this.provideAndroidAccountManagerHelperProvider = t8a.b(new rp2(pVar, this.setApplicationContextProvider, this.masterTokenEncrypterProvider, this.provideEventReporterProvider, this.stashReporterProvider, this.preferenceStorageProvider, this.provideClockProvider, this.provideMasterTokenTombstoneManagerProvider, this.provideDatabaseHelperProvider, b2, 3));
            rzm b3 = t8a.b(new com.yandex.passport.internal.di.module.l(hVar, this.provideCoroutineDispatchersProvider, this.provideOkHttpClientProvider, 0));
            this.provideBaseOkHttpUseCaseProvider = b3;
            this.provideRetryingOkHttpUseCaseProvider = t8a.b(new com.yandex.passport.internal.di.module.l(hVar, this.provideCoroutineDispatchersProvider, b3, 1));
            rzm b4 = t8a.b(new com.yandex.passport.internal.provider.communication.w(this.eventReporterProvider, this.reportingFeatureProvider, 11));
            this.backendReporterProvider = b4;
            com.yandex.passport.internal.di.module.d dVar = new com.yandex.passport.internal.di.module.d(b4, 6);
            this.backendReporterWrapperImplProvider = dVar;
            this.provideBackendReporterWrapperProvider = t8a.b(new k(hVar, dVar, 0));
            rzm b5 = t8a.b(com.yandex.passport.internal.network.mappers.c.a);
            this.environmentDataMapperProvider = b5;
            qa qaVar = new qa(this.provideBaseUrlDispatcherProvider, b5, 28);
            this.backendUrlDispatcherImplProvider = qaVar;
            rzm b6 = t8a.b(new k(hVar, qaVar, 1));
            this.provideBackendUrlDispatcherProvider = b6;
            this.requestCreatorProvider = t8a.b(new com.yandex.passport.common.coroutine.g(b6, 5));
            rzm b7 = t8a.b(new com.yandex.passport.internal.di.module.i(hVar, this.commonParamsProvider, 2));
            this.provideCommonBackendParamsProvider = b7;
            rzm b8 = t8a.b(new z0(this.provideAnalyticalIdentifiersProvider, this.bindApplicationDetailsProvider, this.provideClockProvider, b7, 2));
            this.commonBackendQueryProvider = b8;
            com.yandex.passport.data.network.o oVar = new com.yandex.passport.data.network.o(this.requestCreatorProvider, b8, 29);
            this.requestFactoryProvider = oVar;
            this.revokeMasterTokenRequestProvider = t8a.b(new com.yandex.passport.data.network.n(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, oVar, this.provideMasterTokenTombstoneManagerProvider, 11));
            this.tryGetMasterCredentialsByAccountProvider = t8a.b(new com.yandex.passport.internal.ui.common.c(this.provideCoroutineDispatchersProvider, this.masterCredentialsProvider, this.provideAndroidAccountManagerHelperProvider, 11));
            this.clientTokenDroppingInteractorProvider = t8a.b(new qa(this.provideDatabaseHelperProvider, this.provideEventReporterProvider, 24));
            com.yandex.passport.data.network.o oVar2 = new com.yandex.passport.data.network.o(this.requestCreatorProvider, this.commonBackendQueryProvider, 26);
            this.requestFactoryProvider2 = oVar2;
            this.pushSubscribeRequestProvider = t8a.b(new com.yandex.passport.data.network.n(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, oVar2, this.provideMasterTokenTombstoneManagerProvider, 9));
            com.yandex.passport.data.network.o oVar3 = new com.yandex.passport.data.network.o(this.requestCreatorProvider, this.commonBackendQueryProvider, 27);
            this.requestFactoryProvider3 = oVar3;
            this.pushUnsubscribeRequestProvider = t8a.b(new d0(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, (rzm) oVar3, 15));
            this.provideGcmSubscriptionsDaoProvider = t8a.b(new com.yandex.passport.internal.di.module.f(eVar, this.provideDatabaseHelperProvider, 4));
            this.pushSubscriptionTimeDispatcherProvider = t8a.b(new com.yandex.passport.internal.provider.communication.w(this.provideClockProvider, this.flagRepositoryProvider, 2));
        }

        private void initialize5(com.yandex.passport.internal.di.module.a aVar, com.yandex.passport.internal.di.module.e eVar, com.yandex.passport.internal.di.module.h hVar, com.yandex.passport.internal.di.module.p pVar, Context context, IReporterYandex iReporterYandex, com.yandex.passport.internal.properties.x xVar) {
            this.hashEncoderProvider = t8a.b(com.yandex.passport.internal.util.l.a);
            rzm b = t8a.b(new com.yandex.passport.internal.provider.communication.w(this.eventReporterProvider, this.reportingFeatureProvider, 23));
            this.pushReporterProvider = b;
            this.pushSubscriberProvider = t8a.b(new com.yandex.passport.internal.core.accounts.d(this.pushSubscribeRequestProvider, this.pushUnsubscribeRequestProvider, this.provideGcmSubscriptionsDaoProvider, this.pushSubscriptionTimeDispatcherProvider, this.hashEncoderProvider, this.preferenceStorageProvider, this.flagRepositoryProvider, b, this.environmentDataMapperProvider, 2));
            this.providePermissionManagerProvider = t8a.b(new com.yandex.passport.internal.di.module.t(pVar, this.setApplicationContextProvider, 6));
            this.delayedAccountProvider = t8a.b(new qa(this.provideDatabaseHelperProvider, this.modernAccountMapperProvider, 20));
            this.provideSyncHelperProvider = t8a.b(new com.yandex.passport.internal.di.module.s(pVar, this.setApplicationContextProvider, this.provideClockProvider, this.flagRepositoryProvider, 2));
            rzm b2 = t8a.b(new com.yandex.passport.internal.provider.communication.w(this.eventReporterProvider, this.reportingFeatureProvider, 7));
            this.announcementReporterProvider = b2;
            rzm rzmVar = this.setApplicationContextProvider;
            com.yandex.passport.common.coroutine.g gVar = new com.yandex.passport.common.coroutine.g(rzmVar, 16);
            this.accountSharingConfigStorageProvider = gVar;
            this.announcingHelperProvider = t8a.b(new com.yandex.passport.data.network.n(rzmVar, this.provideClockProvider, b2, this.provideAnalyticalIdentifiersProvider, gVar, 20));
            this.accountsBackuperProvider = new tv7();
            this.pushSubscriptionSchedulerProvider = new tv7();
            this.accountsChangesSelfAnnouncerProvider = t8a.b(new com.yandex.passport.common.coroutine.g(this.setApplicationContextProvider, 24));
            this.ssoApplicationsResolverProvider = t8a.b(new s7(this.setApplicationContextProvider, this.accountSharingConfigStorageProvider, this.provideEventReporterProvider, 17));
            this.ssoDisablerProvider = t8a.b(new h1(this.setPropertiesProvider, this.flagRepositoryProvider, 17));
            this.ssoContentProviderClientProvider = t8a.b(new s7(this.setApplicationContextProvider, this.provideEventReporterProvider, this.ssoApplicationsResolverProvider, 19));
            this.accountsChangesAnnouncerProvider = new tv7();
            this.revokeMasterTokenUseCaseProvider = new tv7();
            this.accountUpdateReporterProvider = t8a.b(new com.yandex.passport.internal.di.module.d(this.eventReporterProvider, 17));
            rzm b3 = t8a.b(new com.yandex.passport.common.coroutine.g(this.preferenceStorageProvider, 6));
            this.currentAccountStorageProvider = b3;
            rzm b4 = t8a.b(new d13(pVar, this.provideAndroidAccountManagerHelperProvider, this.accountsChangesAnnouncerProvider, this.provideEventReporterProvider, this.revokeMasterTokenUseCaseProvider, this.stashReporterProvider, this.tokenActionReporterProvider, this.accountUpdateReporterProvider, this.setPropertiesProvider, this.provideDatabaseHelperProvider, this.delayedAccountReporterProvider, b3, this.modernAccountMapperProvider, 1));
            this.provideAccountsUpdaterProvider = b4;
            tv7 tv7Var = new tv7();
            this.immediateAccountsRetrieverProvider = tv7Var;
            this.accountsSaverProvider = t8a.b(new com.yandex.passport.data.network.n(b4, tv7Var, this.provideEventReporterProvider, this.flagRepositoryProvider, this.modernAccountMapperProvider, 19, false));
            rzm b5 = t8a.b(new com.yandex.passport.internal.di.module.d(this.eventReporterProvider, 15));
            this.accountLoadingReporterProvider = b5;
            rzm b6 = t8a.b(new com.yandex.passport.common.coroutine.g(b5, 23));
            this.memberAccountRepositoryProvider = b6;
            this.removeAccountUseCaseProvider = new z0(this.provideAccountsUpdaterProvider, b6, this.immediateAccountsRetrieverProvider, this.flagRepositoryProvider, 4);
        }

        private void initialize6(com.yandex.passport.internal.di.module.a aVar, com.yandex.passport.internal.di.module.e eVar, com.yandex.passport.internal.di.module.h hVar, com.yandex.passport.internal.di.module.p pVar, Context context, IReporterYandex iReporterYandex, com.yandex.passport.internal.properties.x xVar) {
            rzm b = t8a.b(new s7(this.provideDatabaseHelperProvider, this.provideClockProvider, this.modernAccountMapperProvider, 7));
            this.accountLastActionHelperProvider = b;
            rzm b2 = t8a.b(new com.yandex.passport.internal.core.accounts.b(this.accountsSaverProvider, this.removeAccountUseCaseProvider, this.immediateAccountsRetrieverProvider, b, this.ssoContentProviderClientProvider, this.ssoDisablerProvider, this.provideEventReporterProvider, this.modernAccountMapperProvider, 3));
            this.ssoAccountsSyncHelperProvider = b2;
            rzm b3 = t8a.b(new h9(this.setApplicationContextProvider, this.ssoApplicationsResolverProvider, this.ssoDisablerProvider, this.provideEventReporterProvider, this.ssoContentProviderClientProvider, b2, 3));
            this.ssoAnnouncerProvider = b3;
            tv7.a(this.accountsChangesAnnouncerProvider, t8a.b(new h9(this.announcingHelperProvider, this.accountsBackuperProvider, this.pushSubscriptionSchedulerProvider, this.accountsChangesSelfAnnouncerProvider, b3, this.accountLastActionHelperProvider, 2)));
            tv7.a(this.accountsBackuperProvider, t8a.b(new com.yandex.passport.internal.core.accounts.d(this.provideAndroidAccountManagerHelperProvider, this.delayedAccountProvider, this.provideDatabaseHelperProvider, this.provideSyncHelperProvider, this.accountsChangesAnnouncerProvider, this.preferenceStorageProvider, this.provideEventReporterProvider, this.setPropertiesProvider, this.flagRepositoryProvider, 0)));
            rzm b4 = t8a.b(new s7(this.provideAccountsUpdaterProvider, this.provideBackendClientChooserProvider, this.provideEventReporterProvider, 4));
            this.corruptedAccountRepairerProvider = b4;
            tv7.a(this.immediateAccountsRetrieverProvider, t8a.b(new com.yandex.passport.internal.core.accounts.d(this.provideAndroidAccountManagerHelperProvider, this.delayedAccountProvider, this.provideDatabaseHelperProvider, this.accountsBackuperProvider, b4, this.provideEventReporterProvider, this.provideClockProvider, this.modernAccountMapperProvider, this.preferenceStorageProvider, 1)));
            rzm b5 = t8a.b(new s7(this.ssoApplicationsResolverProvider, this.ssoAnnouncerProvider, this.ssoAccountsSyncHelperProvider, 18));
            this.ssoBootstrapHelperProvider = b5;
            rzm b6 = t8a.b(new z0(this.setApplicationContextProvider, this.preferenceStorageProvider, b5, this.ssoDisablerProvider, 8));
            this.bootstrapHelperProvider = b6;
            this.provideAccountsRetrieverProvider = t8a.b(new com.yandex.passport.internal.di.module.r(pVar, this.immediateAccountsRetrieverProvider, b6, 0));
            this.pushAvailabilityDetectorProvider = t8a.b(new com.yandex.passport.internal.di.module.d(this.setApplicationContextProvider, 11));
            rzm b7 = t8a.b(com.yandex.passport.internal.provider.communication.d.c);
            this.passportRequestsMapperProvider = b7;
            this.passportRequestsProcessorProvider = t8a.b(new com.yandex.passport.internal.provider.communication.w(this.setApplicationContextProvider, b7, 0));
            rzm b8 = t8a.b(com.yandex.passport.internal.provider.communication.d.b);
            this.iPCPropertiesHolderProvider = b8;
            rzm b9 = t8a.b(new qa(this.passportRequestsProcessorProvider, b8, 29));
            this.iPCImplProvider = b9;
            this.provideIPCApiProvider = t8a.b(new com.yandex.passport.internal.di.module.t(pVar, b9, 5));
            rzm b10 = t8a.b(new com.yandex.passport.internal.di.module.r(pVar, this.pushSubscriptionSchedulerProvider, this.setApplicationContextProvider, 1));
            this.provideNotificationDndManagerProvider = b10;
            rzm b11 = t8a.b(new com.yandex.passport.internal.config.m(this.setPropertiesProvider, this.pushSubscriberProvider, this.provideAccountsRetrieverProvider, this.provideGcmSubscriptionsDaoProvider, this.hashEncoderProvider, this.pushAvailabilityDetectorProvider, this.pushReporterProvider, this.provideDatabaseHelperProvider, this.flagRepositoryProvider, this.provideIPCApiProvider, b10, this.iPCPropertiesHolderProvider, 1));
            this.greatAgainPushSubscriptionManagerProvider = b11;
            rzm b12 = t8a.b(new s7(this.provideCoroutineDispatchersProvider, this.preferenceStorageProvider, b11, 11));
            this.passportPushRegistrationUseCaseProvider = b12;
            rzm b13 = t8a.b(new com.yandex.passport.internal.push.g0(this.setApplicationContextProvider, this.provideCoroutineScopesProvider, this.provideCoroutineDispatchersProvider, b12, 1));
            this.subscriptionEnqueuePerformerProvider = b13;
            tv7.a(this.pushSubscriptionSchedulerProvider, t8a.b(new w(this.setApplicationContextProvider, this.setPropertiesProvider, this.providePermissionManagerProvider, this.flagRepositoryProvider, b13, 6)));
            tv7.a(this.revokeMasterTokenUseCaseProvider, t8a.b(new com.yandex.passport.internal.core.accounts.d(this.provideCoroutineDispatchersProvider, this.revokeMasterTokenRequestProvider, this.tryGetMasterCredentialsByAccountProvider, this.masterCredentialsProvider, this.tokenActionReporterProvider, this.environmentDataMapperProvider, this.clientTokenDroppingInteractorProvider, this.pushSubscriberProvider, this.pushSubscriptionSchedulerProvider, 4)));
            rzm b14 = t8a.b(new com.yandex.passport.internal.ui.bouncer.sloth.i(this.revokeMasterTokenUseCaseProvider, 20));
            this.revokeMasterTokenWrapperProvider = b14;
            this.authenticatorProvider = t8a.b(new w(this.setApplicationContextProvider, b14, this.provideDatabaseHelperProvider, this.accountsChangesAnnouncerProvider, this.currentAccountStorageProvider, 5));
            this.responseTransformerProvider = new com.yandex.passport.common.coroutine.g(this.provideClockProvider, 2);
        }

        private void initialize7(com.yandex.passport.internal.di.module.a aVar, com.yandex.passport.internal.di.module.e eVar, com.yandex.passport.internal.di.module.h hVar, com.yandex.passport.internal.di.module.p pVar, Context context, IReporterYandex iReporterYandex, com.yandex.passport.internal.properties.x xVar) {
            this.requestFactoryProvider4 = new com.yandex.passport.data.network.o(this.requestCreatorProvider, this.commonBackendQueryProvider, 24);
            rzm b = t8a.b(new qa(this.provideCoroutineDispatchersProvider, this.provideMasterTokenTombstoneManagerProvider, 8));
            this.usingMasterTokenRequestUseCaseProvider = b;
            this.getUserInfoRequestProvider = t8a.b(new h9(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, this.responseTransformerProvider, this.requestFactoryProvider4, b, 0));
            com.yandex.passport.data.network.o oVar = new com.yandex.passport.data.network.o(this.requestCreatorProvider, this.commonBackendQueryProvider, 14);
            this.requestFactoryProvider5 = oVar;
            rzm b2 = t8a.b(new com.yandex.passport.data.network.n(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, oVar, this.provideMasterTokenTombstoneManagerProvider, 4));
            this.getClientOrMasterTokenByMasterTokenRequestProvider = b2;
            this.getMasterTokenByMasterTokenUseCaseProvider = t8a.b(new z0(this.provideCoroutineDispatchersProvider, this.setPropertiesProvider, b2, this.environmentDataMapperProvider, 23));
            rzm b3 = t8a.b(new com.yandex.passport.internal.provider.communication.w(this.eventReporterProvider, this.reportingFeatureProvider, 20));
            this.masterTokenRotationReporterProvider = b3;
            h1 h1Var = new h1(this.setApplicationContextProvider, b3, 5);
            this.quarantineMasterTokenStorageProvider = h1Var;
            rzm b4 = t8a.b(new com.yandex.passport.internal.di.module.g(this.provideCoroutineDispatchersProvider, this.getMasterTokenByMasterTokenUseCaseProvider, this.revokeMasterTokenUseCaseProvider, b3, h1Var, this.masterCredentialsProvider));
            this.masterTokenRotationUseCaseProvider = b4;
            rzm b5 = t8a.b(new com.yandex.passport.internal.analytics.d0(this.provideCoroutineDispatchersProvider, this.getUserInfoRequestProvider, this.provideAccountsRetrieverProvider, this.flagRepositoryProvider, b4, this.environmentDataMapperProvider, this.provideUserInfoMapperProvider, 3));
            this.getAllUserInfoUseCaseProvider = b5;
            this.provideModernAccountRefresherProvider = t8a.b(new i1(pVar, this.provideAccountsUpdaterProvider, this.provideClockProvider, b5, this.provideDatabaseHelperProvider, this.bindUiLanguageProvider, this.flagRepositoryProvider, this.memberAccountRepositoryProvider, this.provideUserInfoMapperProvider, 2));
            this.linkageUpdaterProvider = t8a.b(new com.yandex.passport.common.coroutine.g(this.provideAccountsUpdaterProvider, 25));
            com.yandex.passport.data.network.o oVar2 = new com.yandex.passport.data.network.o(this.requestCreatorProvider, this.commonBackendQueryProvider, 4);
            this.requestFactoryProvider6 = oVar2;
            rzm b6 = t8a.b(new d0(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, (rzm) oVar2, 2));
            this.checkLinkageRequestProvider = b6;
            this.linkageRefresherProvider = t8a.b(new z0(this.linkageUpdaterProvider, b6, this.masterCredentialsProvider, this.environmentDataMapperProvider, 6));
            rzm b7 = t8a.b(new com.yandex.passport.common.coroutine.g(this.provideAnalyticsTrackerWrapperProvider, 11));
            this.syncReporterProvider = b7;
            rzm b8 = t8a.b(new com.yandex.passport.internal.core.accounts.b(this.setApplicationContextProvider, this.provideAndroidAccountManagerHelperProvider, this.provideModernAccountRefresherProvider, this.corruptedAccountRepairerProvider, this.linkageRefresherProvider, this.provideAccountsRetrieverProvider, b7, this.modernAccountMapperProvider, 0));
            this.accountSynchronizerProvider = b8;
            this.syncAdapterProvider = t8a.b(new qa(this.setApplicationContextProvider, b8, 23));
            this.processAuthorizationResultUseCaseProvider = new z0(this.provideCoroutineDispatchersProvider, this.accountsSaverProvider, this.provideDatabaseHelperProvider, this.tokenActionReporterProvider, 27);
            rzm b9 = t8a.b(new com.yandex.passport.internal.provider.communication.w(this.eventReporterProvider, this.reportingFeatureProvider, 9));
            this.authorizationReporterProvider = b9;
            rzm b10 = t8a.b(new com.yandex.passport.internal.di.module.i(hVar, b9, 0));
            this.provideAuthorizationReporterWrapperProvider = b10;
            com.yandex.passport.common.coroutine.g gVar = new com.yandex.passport.common.coroutine.g(b10, 1);
            this.resultTransformerProvider = gVar;
            com.yandex.passport.data.network.o oVar3 = new com.yandex.passport.data.network.o(this.requestCreatorProvider, this.commonBackendQueryProvider, 0);
            this.requestFactoryProvider7 = oVar3;
            this.authorizeByPasswordRequestProvider = new com.yandex.passport.data.network.n(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, gVar, oVar3, 0);
            this.authorizationResultDataMapperProvider = t8a.b(new com.yandex.passport.internal.di.module.d(this.provideUserInfoMapperProvider, 7));
        }

        private void initialize8(com.yandex.passport.internal.di.module.a aVar, com.yandex.passport.internal.di.module.e eVar, com.yandex.passport.internal.di.module.h hVar, com.yandex.passport.internal.di.module.p pVar, Context context, IReporterYandex iReporterYandex, com.yandex.passport.internal.properties.x xVar) {
            rzm rzmVar = this.provideCoroutineDispatchersProvider;
            this.authorizeByPasswordUseCaseProvider = new com.yandex.passport.internal.analytics.d0(rzmVar, this.processAuthorizationResultUseCaseProvider, this.authorizeByPasswordRequestProvider, this.authorizationReporterProvider, this.setPropertiesProvider, this.environmentDataMapperProvider, this.authorizationResultDataMapperProvider, 6);
            this.fetchModernAccountUseCaseProvider = new w(rzmVar, this.getAllUserInfoUseCaseProvider, this.tokenActionReporterProvider, this.provideDatabaseHelperProvider, this.bindUiLanguageProvider, 14);
            qa qaVar = new qa(this.requestCreatorProvider, this.commonBackendQueryProvider, 4);
            this.requestFactoryProvider8 = qaVar;
            this.suggestedLanguageRequestProvider = t8a.b(new d0(rzmVar, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, (rzm) qaVar, 19));
            rzm b = t8a.b(new com.yandex.passport.internal.provider.communication.w(this.eventReporterProvider, this.reportingFeatureProvider, 28));
            this.suggestedLanguageReporterProvider = b;
            rzm b2 = t8a.b(new w(this.provideCoroutineDispatchersProvider, this.bindUiLanguageProvider, this.suggestedLanguageRequestProvider, b, this.environmentDataMapperProvider, 17));
            this.suggestedLanguageUseCaseProvider = b2;
            rzm rzmVar2 = this.provideCoroutineDispatchersProvider;
            rzm rzmVar3 = this.fetchModernAccountUseCaseProvider;
            rzm rzmVar4 = this.accountsSaverProvider;
            com.yandex.passport.internal.ui.common.c cVar = new com.yandex.passport.internal.ui.common.c(rzmVar2, rzmVar3, rzmVar4, 9);
            this.fetchAndSaveModernAccountUseCaseProvider = cVar;
            this.loginControllerProvider = t8a.b(new rp2(this.provideBackendClientChooserProvider, rzmVar4, this.setPropertiesProvider, this.provideDatabaseHelperProvider, this.tokenActionReporterProvider, this.provideBackendParserProvider, this.authorizeByPasswordUseCaseProvider, rzmVar3, b2, cVar, 2));
            rzm b3 = t8a.b(new qa(this.setApplicationContextProvider, this.storageReporterProvider, 26));
            this.filterRulesStorageProvider = b3;
            com.yandex.passport.internal.di.module.c cVar2 = new com.yandex.passport.internal.di.module.c(aVar, 0);
            this.provideAmVersionProvider = cVar2;
            com.yandex.passport.internal.badges.f fVar = new com.yandex.passport.internal.badges.f(b3, this.bindApplicationDetailsProvider, (rzm) cVar2, 2);
            this.accountFilterRepositoryProvider = fVar;
            this.loadAccountsUseCaseProvider = t8a.b(new com.yandex.passport.internal.badges.f(this.provideCoroutineDispatchersProvider, this.provideAccountsRetrieverProvider, (rzm) fVar, 8));
            this.provideImageLoadingClientProvider = t8a.b(new com.yandex.passport.internal.di.module.i(hVar, this.provideOkHttpClientProvider, 3));
            this.accountTrackerProvider = t8a.b(new com.yandex.passport.internal.ui.bouncer.roundabout.d(this.provideAndroidAccountManagerHelperProvider, this.provideEventReporterProvider, 19));
            this.authSdkProviderHelperProvider = t8a.b(new qa(this.provideAccountsRetrieverProvider, this.accountFilterRepositoryProvider, 17));
            this.smsRetrieverHelperProvider = t8a.b(new h1(this.setApplicationContextProvider, this.preferenceStorageProvider, 16));
            this.silentPushReporterProvider = t8a.b(new com.yandex.passport.internal.di.module.d(this.eventReporterProvider, 27));
            com.yandex.passport.data.network.o oVar = new com.yandex.passport.data.network.o(this.requestCreatorProvider, this.commonBackendQueryProvider, 21);
            this.requestFactoryProvider9 = oVar;
            this.getPush2faCodeRequestProvider = t8a.b(new com.yandex.passport.data.network.n(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, oVar, this.provideMasterTokenTombstoneManagerProvider, 7));
            this.pushPayloadFactoryProvider = new com.yandex.passport.internal.di.module.d(this.pushReporterProvider, 12);
            this.pushPayloadStorageProvider = t8a.b(m0.a);
            rzm rzmVar5 = this.setApplicationContextProvider;
            com.yandex.passport.internal.push.g0 g0Var = new com.yandex.passport.internal.push.g0(rzmVar5, this.bindApplicationDetailsProvider, this.provideAnalyticalIdentifiersProvider, this.flagRepositoryProvider, 0);
            this.pushIntentProvider = g0Var;
            com.yandex.passport.internal.provider.communication.w wVar = new com.yandex.passport.internal.provider.communication.w(rzmVar5, this.provideBaseUrlDispatcherProvider, 1);
            this.pictureIdToBitmapMapperProvider = wVar;
            this.notificationPictureBuilderProvider = t8a.b(new com.yandex.passport.internal.badges.f(rzmVar5, (rzm) wVar, (rzm) g0Var, 3));
            this.requestFactoryProvider10 = new com.yandex.passport.data.network.o(this.requestCreatorProvider, this.commonBackendQueryProvider, 1);
        }

        private void initialize9(com.yandex.passport.internal.di.module.a aVar, com.yandex.passport.internal.di.module.e eVar, com.yandex.passport.internal.di.module.h hVar, com.yandex.passport.internal.di.module.p pVar, Context context, IReporterYandex iReporterYandex, com.yandex.passport.internal.properties.x xVar) {
            rzm rzmVar = this.provideCoroutineDispatchersProvider;
            w wVar = new w(rzmVar, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, this.requestFactoryProvider10, this.provideMasterTokenTombstoneManagerProvider, 0);
            this.authorizeByXTokenRequestProvider = wVar;
            this.getAuthorizationUrlUseCaseProvider = t8a.b(new com.yandex.passport.internal.di.module.g(rzmVar, this.provideAccountsRetrieverProvider, this.provideBaseUrlDispatcherProvider, wVar, this.authorizationReporterProvider, this.environmentDataMapperProvider, 6, false));
            rzm b = t8a.b(new com.yandex.passport.internal.provider.communication.w(this.eventReporterProvider, this.reportingFeatureProvider, 22));
            this.pushOpenUrlInBrowserReporterProvider = b;
            this.notificationHelperProvider = t8a.b(new com.yandex.passport.internal.push.n(this.setApplicationContextProvider, this.provideAccountsRetrieverProvider, this.pushReporterProvider, this.silentPushReporterProvider, this.provideAnalyticalIdentifiersProvider, this.bindApplicationDetailsProvider, this.pushSubscriberProvider, this.getPush2faCodeRequestProvider, this.pushAvailabilityDetectorProvider, this.provideCoroutineDispatchersProvider, this.flagRepositoryProvider, this.environmentDataMapperProvider, this.pushPayloadFactoryProvider, this.pushPayloadStorageProvider, this.pushIntentProvider, this.notificationPictureBuilderProvider, this.getAuthorizationUrlUseCaseProvider, b, 0));
            com.yandex.passport.data.network.o oVar = new com.yandex.passport.data.network.o(this.requestCreatorProvider, this.commonBackendQueryProvider, 10);
            this.requestFactoryProvider11 = oVar;
            this.experimentsRequestProvider = t8a.b(new d0(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, (rzm) oVar, 4));
            rzm b2 = t8a.b(new com.yandex.passport.internal.provider.communication.w(this.eventReporterProvider, this.reportingFeatureProvider, 16));
            this.experimentReporterProvider = b2;
            com.yandex.passport.internal.di.module.d dVar = new com.yandex.passport.internal.di.module.d(b2, 4);
            this.experimentsParserProvider = dVar;
            this.experimentsFetcherProvider = t8a.b(new com.yandex.passport.internal.di.module.g(this.experimentsRequestProvider, this.provideExperimentsHolderProvider, dVar, b2, this.provideAnalyticalIdentifiersProvider, this.environmentDataMapperProvider, 2));
            s7 s7Var = new s7(this.setApplicationContextProvider, this.provideCoroutineScopesProvider, this.provideCoroutineDispatchersProvider, 6);
            this.updateEnqueuePerformerProvider = s7Var;
            this.experimentsUpdaterProvider = t8a.b(new d0(this.provideExperimentsHolderProvider, this.provideClockProvider, this.providePermissionManagerProvider, (rzm) s7Var, 21));
            this.domikStatefulReporterProvider = t8a.b(new com.yandex.passport.common.coroutine.g(this.provideAnalyticsTrackerWrapperProvider, 9));
            this.provideDebugInfoUtilProvider = t8a.b(new u(pVar, this.setApplicationContextProvider, this.provideAnalyticsHelperProvider, this.provideAndroidAccountManagerHelperProvider, this.provideAccountsRetrieverProvider, this.provideExperimentsHolderProvider, this.modernAccountMapperProvider, 0));
            rzm b3 = t8a.b(new qa(this.provideAccountsRetrieverProvider, this.currentAccountStorageProvider, 16));
            this.currentAccountManagerProvider = b3;
            this.currentAccountAnalyticsHelperProvider = t8a.b(new com.yandex.passport.internal.analytics.d0(this.setApplicationContextProvider, this.preferenceStorageProvider, b3, this.provideDatabaseHelperProvider, this.provideEventReporterProvider, this.setPropertiesProvider, this.provideClockProvider, 0));
            rzm b4 = t8a.b(new h1(this.eventReporterProvider, this.reportingFeatureProvider, 1));
            this.userInfoReporterProvider = b4;
            this.personProfileHelperProvider = t8a.b(new com.yandex.passport.internal.core.accounts.b(this.provideAccountsRetrieverProvider, this.provideBackendClientChooserProvider, this.accountSynchronizerProvider, this.preferenceStorageProvider, this.provideClockProvider, this.contextUtilsProvider, b4, this.getAuthorizationUrlUseCaseProvider, 2));
            this.ssoContentProviderHelperProvider = t8a.b(new z0(this.ssoApplicationsResolverProvider, this.ssoAccountsSyncHelperProvider, this.tokenActionReporterProvider, this.modernAccountMapperProvider, 14));
            this.appBindReporterProvider = t8a.b(new com.yandex.passport.common.coroutine.g(this.provideAnalyticsTrackerWrapperProvider, 7));
            this.socialBrowserReporterProvider = t8a.b(new com.yandex.passport.common.coroutine.g(this.provideAnalyticsTrackerWrapperProvider, 10));
            this.authByTrackReporterProvider = t8a.b(new com.yandex.passport.common.coroutine.g(this.provideAnalyticsTrackerWrapperProvider, 8));
            com.yandex.passport.data.network.o oVar2 = new com.yandex.passport.data.network.o(this.requestCreatorProvider, this.commonBackendQueryProvider, 17);
            this.requestFactoryProvider12 = oVar2;
            this.getConfigRequestProvider = t8a.b(new d0(this.provideCoroutineDispatchersProvider, this.provideRetryingOkHttpUseCaseProvider, this.provideBackendReporterWrapperProvider, (rzm) oVar2, 9));
            this.configReporterProvider = t8a.b(new com.yandex.passport.internal.di.module.d(this.eventReporterProvider, 19));
            this.provideTimeProvider = t8a.b(new com.yandex.passport.internal.di.module.q(pVar, 2));
        }

        public com.yandex.passport.internal.methods.performer.c acceptDeviceAuthorizationPerformer() {
            return new com.yandex.passport.internal.methods.performer.c((com.yandex.passport.internal.core.accounts.e) this.provideAccountsRetrieverProvider.get(), (com.yandex.passport.common.ui.lang.b) this.bindUiLanguageProvider.get(), (a2) this.deviceAuthorizationSubmitRequestProvider.get(), (t1) this.deviceAuthorizationCommitRequestProvider.get(), (com.yandex.passport.internal.credentials.g) this.masterCredentialsProvider.get(), new com.yandex.passport.data.network.token.i(14), (com.yandex.passport.internal.network.mappers.b) this.environmentDataMapperProvider.get());
        }

        public com.yandex.passport.internal.methods.performer.d addAccountPerformer() {
            return new com.yandex.passport.internal.methods.performer.d((com.yandex.passport.internal.usecase.b) this.authorizeByMasterTokenUseCaseProvider.get(), new com.yandex.passport.data.network.token.i(14));
        }

        public com.yandex.passport.internal.usecase.ui.e authByMuidTokenUseCase() {
            return new com.yandex.passport.internal.usecase.ui.e((com.yandex.passport.common.coroutine.a) this.provideCoroutineDispatchersProvider.get(), (com.yandex.passport.internal.usecase.k) this.checkLocationIdUseCaseProvider.get(), fetchAndSaveModernAccountUseCase(), (e7) this.getMasterTokenByMemberTokenRequestProvider.get(), (com.yandex.passport.internal.network.mappers.b) this.environmentDataMapperProvider.get(), (com.yandex.passport.internal.credentials.g) this.masterCredentialsProvider.get(), (f1) this.tokenActionReporterProvider.get());
        }

        public com.yandex.passport.internal.methods.performer.e authByQrLinkPerformer() {
            return new com.yandex.passport.internal.methods.performer.e(authorizeByTrackIdUseCase(), new com.yandex.passport.data.network.token.i(14), (com.yandex.passport.internal.report.reporters.e0) this.linkAuthReporterProvider.get());
        }

        public com.yandex.passport.internal.methods.performer.f authorizeByCodePerformer() {
            return new com.yandex.passport.internal.methods.performer.f((com.yandex.passport.internal.usecase.authorize.f) this.authorizeByCodeUseCaseProvider.get(), new com.yandex.passport.data.network.token.i(14));
        }

        public com.yandex.passport.internal.methods.performer.g authorizeByCookiePerformer() {
            return new com.yandex.passport.internal.methods.performer.g((com.yandex.passport.internal.usecase.authorize.c) this.authByCookieUseCaseProvider.get(), new com.yandex.passport.data.network.token.i(14));
        }

        public com.yandex.passport.internal.methods.performer.h authorizeByDeviceCodePerformer() {
            return new com.yandex.passport.internal.methods.performer.h(authorizeByDeviceCodeUseCase(), new com.yandex.passport.data.network.token.i(14));
        }

        public com.yandex.passport.internal.usecase.authorize.i authorizeByDeviceCodeUseCase() {
            return new com.yandex.passport.internal.usecase.authorize.i((com.yandex.passport.common.coroutine.a) this.provideCoroutineDispatchersProvider.get(), (com.yandex.passport.internal.usecase.k) this.checkLocationIdUseCaseProvider.get(), fetchAndSaveModernAccountUseCase(), (com.yandex.passport.data.network.token.s) this.getMasterTokenByDeviceCodeRequestProvider.get(), (com.yandex.passport.internal.network.mappers.b) this.environmentDataMapperProvider.get(), (com.yandex.passport.internal.credentials.g) this.masterCredentialsProvider.get());
        }

        public com.yandex.passport.internal.methods.performer.i authorizeByForwardTrackPerformer() {
            return new com.yandex.passport.internal.methods.performer.i(getAuthorizeByForwardTrackUseCase(), new com.yandex.passport.data.network.token.i(14));
        }

        public com.yandex.passport.internal.methods.performer.j authorizeByRawJsonPerformer() {
            return new com.yandex.passport.internal.methods.performer.j((com.yandex.passport.internal.account.d) this.loginControllerProvider.get());
        }

        public com.yandex.passport.internal.usecase.authorize.r authorizeByTrackIdUseCase() {
            return new com.yandex.passport.internal.usecase.authorize.r((com.yandex.passport.common.coroutine.a) this.provideCoroutineDispatchersProvider.get(), (com.yandex.passport.internal.usecase.k) this.checkLocationIdUseCaseProvider.get(), fetchAndSaveModernAccountUseCase(), (com.yandex.passport.data.network.token.h0) this.getMasterTokenByTrackIdRequestProvider.get(), (f1) this.tokenActionReporterProvider.get(), (com.yandex.passport.internal.network.mappers.b) this.environmentDataMapperProvider.get(), (com.yandex.passport.internal.credentials.g) this.masterCredentialsProvider.get());
        }

        public com.yandex.passport.internal.methods.performer.k authorizeByUserCredentialsPerformer() {
            return new com.yandex.passport.internal.methods.performer.k((com.yandex.passport.internal.account.d) this.loginControllerProvider.get(), new com.yandex.passport.data.network.token.i(14));
        }

        public com.yandex.passport.internal.autologin.d autoLoginPerformer() {
            return new com.yandex.passport.internal.autologin.d((com.yandex.passport.internal.autologin.k) this.autoLoginUseCaseProvider.get(), (com.yandex.passport.internal.core.accounts.e) this.provideAccountsRetrieverProvider.get(), (com.yandex.passport.internal.report.reporters.i) this.autoLoginReporterProvider.get(), new com.yandex.passport.data.network.token.i(14), getAccountFilterRepository());
        }

        public com.yandex.passport.internal.methods.performer.l corruptMasterTokenPerformer() {
            return new com.yandex.passport.internal.methods.performer.l((com.yandex.passport.internal.core.accounts.e) this.provideAccountsRetrieverProvider.get(), (com.yandex.passport.internal.core.accounts.i) this.provideAccountsUpdaterProvider.get());
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public d createAuthSdkActivityComponent(e eVar) {
            eVar.getClass();
            return new AuthSdkActivityComponentImpl(this.passportProcessGlobalComponentImpl, eVar);
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public l createAuthSdkSlothComponent(f0 f0Var) {
            f0Var.getClass();
            return new AuthSdkSlothComponentImpl(this.passportProcessGlobalComponentImpl, f0Var);
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.ui.sloth.authsdk.n createAuthSdkSlothComposeComponentBuilder() {
            return new AuthSdkSlothComposeComponentBuilder(this.passportProcessGlobalComponentImpl);
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public a createBiometricVerificationComponentBuilder() {
            return new BiometricVerificationComponentBuilder(this.passportProcessGlobalComponentImpl);
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.ui.bouncer.challenge.a createBouncerChallengeComponentBuilder() {
            return new BouncerChallengeComponentBuilder(this.passportProcessGlobalComponentImpl);
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.ui.challenge.delete.a createDeleteAccountComponentBuilder() {
            return new DeleteAccountComponentBuilder(this.passportProcessGlobalComponentImpl);
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.ui.challenge.delete.r0 createDeleteForever() {
            return new DeleteForeverComponentBuilder(this.passportProcessGlobalComponentImpl);
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.ui.challenge.delete.o0 createDeleteForeverActivityComponent(p0 p0Var) {
            p0Var.getClass();
            return new DeleteForeverActivityComponentImpl(this.passportProcessGlobalComponentImpl, p0Var);
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.ui.domik.di.a createDomikComponent(com.yandex.passport.internal.ui.domik.di.b bVar) {
            bVar.getClass();
            return new DomikComponentImpl(this.passportProcessGlobalComponentImpl, bVar);
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.social.esia.d createEsiaBindComponentBuilder() {
            return new EsiaBindComponentBuilder(this.passportProcessGlobalComponentImpl);
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.ui.bouncer.c createLoginActivityComponent(com.yandex.passport.internal.ui.bouncer.d dVar) {
            dVar.getClass();
            return new BouncerActivityComponentImpl(this.passportProcessGlobalComponentImpl, dVar);
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public a1 createLoginModelComponent(com.yandex.passport.internal.ui.bouncer.h hVar) {
            hVar.getClass();
            return new BouncerModelComponentImpl(this.passportProcessGlobalComponentImpl, hVar);
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.ui.challenge.logout.b createLogoutActivityComponent(com.yandex.passport.internal.ui.challenge.logout.c cVar) {
            cVar.getClass();
            return new LogoutActivityComponentImpl(this.passportProcessGlobalComponentImpl, cVar);
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.ui.challenge.logout.bottomsheet.l createLogoutBottomSheetActivityComponent() {
            return new LogoutBottomSheetActivityComponentBuilder(this.passportProcessGlobalComponentImpl);
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.ui.challenge.logout.bottomsheet.o createLogoutBottomSheetComposeComponentBuilder() {
            return new LogoutBottomSheetComposeComponentBuilder(this.passportProcessGlobalComponentImpl);
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.ui.challenge.logout.e createLogoutComponent() {
            return new LogoutComponentBuilder(this.passportProcessGlobalComponentImpl);
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.ui.challenge.logout.i createLogoutComposeComponentBuilder() {
            return new LogoutComposeComponentBuilder(this.passportProcessGlobalComponentImpl);
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.ui.sloth.plusdevices.a createManagingPlusDevicesComponentBuilder() {
            return new ManagingPlusDevicesComponentBuilder(this.passportProcessGlobalComponentImpl);
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.ui.sloth.webauthn.a createRegisterWebAuthNComponentBuilder() {
            return new RegisterWebAuthNComponentBuilder(this.passportProcessGlobalComponentImpl);
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.ui.challenge.changecurrent.b createSetCurrentAccountActivityComponent(com.yandex.passport.internal.ui.challenge.changecurrent.c cVar) {
            cVar.getClass();
            return new SetCurrentAccountActivityComponentImpl(this.passportProcessGlobalComponentImpl, cVar);
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.ui.challenge.changecurrent.e createSetCurrentAccountComponent() {
            return new SetCurrentAccountComponentBuilder(this.passportProcessGlobalComponentImpl);
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.ui.challenge.changecurrent.m createSetCurrentComposeComponentBuilder() {
            return new SetCurrentComposeComponentBuilder(this.passportProcessGlobalComponentImpl);
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.ui.sloth.s createStandaloneSlothComponent(com.yandex.passport.internal.ui.sloth.a0 a0Var) {
            a0Var.getClass();
            return new StandaloneSlothComponentImpl(this.passportProcessGlobalComponentImpl, a0Var);
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.ui.sloth.v createStandaloneSlothComposeComponentBuilder() {
            return new StandaloneSlothComposeComponentBuilder(this.passportProcessGlobalComponentImpl);
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.ui.sloth.menu.e createUserMenuActivityComponent(com.yandex.passport.internal.ui.sloth.menu.f fVar) {
            fVar.getClass();
            return new UserMenuActivityComponentImpl(this.passportProcessGlobalComponentImpl, fVar);
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.ui.sloth.webcard.e createWebCardComposeComponentBuilder() {
            return new WebCardComposeComponentBuilder(this.passportProcessGlobalComponentImpl);
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.ui.sloth.webcard.w0 createWebCardSlothComponent(com.yandex.passport.internal.ui.sloth.webcard.x0 x0Var) {
            x0Var.getClass();
            return new WebCardSlothComponentImpl(this.passportProcessGlobalComponentImpl, x0Var);
        }

        public com.yandex.passport.internal.methods.performer.m deleteSavedPushPayloadPerformer() {
            return new com.yandex.passport.internal.methods.performer.m(getPushPayloadFactory(), (l0) this.pushPayloadStorageProvider.get(), (com.yandex.passport.internal.report.reporters.z0) this.silentPushReporterProvider.get());
        }

        public com.yandex.passport.internal.methods.performer.n dropTokenPerformer() {
            return new com.yandex.passport.internal.methods.performer.n((com.yandex.passport.internal.core.tokens.b) this.clientTokenDroppingWrapperProvider.get());
        }

        public com.yandex.passport.internal.usecase.r fetchAndSaveModernAccountUseCase() {
            return new com.yandex.passport.internal.usecase.r((com.yandex.passport.common.coroutine.a) this.provideCoroutineDispatchersProvider.get(), fetchModernAccountUseCase(), (com.yandex.passport.internal.core.accounts.f) this.accountsSaverProvider.get());
        }

        public com.yandex.passport.internal.usecase.u fetchModernAccountUseCase() {
            return new com.yandex.passport.internal.usecase.u((com.yandex.passport.common.coroutine.a) this.provideCoroutineDispatchersProvider.get(), (com.yandex.passport.internal.usecase.z) this.getAllUserInfoUseCaseProvider.get(), (f1) this.tokenActionReporterProvider.get(), (com.yandex.passport.internal.database.d) this.provideDatabaseHelperProvider.get(), (com.yandex.passport.common.ui.lang.b) this.bindUiLanguageProvider.get());
        }

        public com.yandex.passport.internal.usecase.ui.b0 findMasterUidAccountUseCase() {
            return new com.yandex.passport.internal.usecase.ui.b0((com.yandex.passport.common.coroutine.a) this.provideCoroutineDispatchersProvider.get(), (com.yandex.passport.internal.core.accounts.s) this.memberAccountRepositoryProvider.get(), (com.yandex.passport.internal.core.accounts.e) this.provideAccountsRetrieverProvider.get());
        }

        public com.yandex.passport.internal.methods.performer.p getAccountByMachineReadableLoginPerformer() {
            return new com.yandex.passport.internal.methods.performer.p((com.yandex.passport.internal.core.accounts.e) this.provideAccountsRetrieverProvider.get());
        }

        public com.yandex.passport.internal.methods.performer.q getAccountByNamePerformer() {
            return new com.yandex.passport.internal.methods.performer.q((com.yandex.passport.internal.core.accounts.e) this.provideAccountsRetrieverProvider.get());
        }

        public com.yandex.passport.internal.methods.performer.r getAccountByUidPerformer() {
            return new com.yandex.passport.internal.methods.performer.r((com.yandex.passport.internal.core.accounts.e) this.provideAccountsRetrieverProvider.get());
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.filter.l getAccountFilterRepository() {
            com.yandex.passport.internal.filter.r rVar = (com.yandex.passport.internal.filter.r) this.filterRulesStorageProvider.get();
            com.yandex.passport.common.common.a aVar = (com.yandex.passport.common.common.a) this.bindApplicationDetailsProvider.get();
            this.commonModule.getClass();
            return new com.yandex.passport.internal.filter.l(rVar, aVar, "7.54.1", new com.yandex.passport.data.network.token.i(12));
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.config.a getAccountSharingConfigStorage() {
            return new com.yandex.passport.internal.config.a(this.setApplicationContext);
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.core.accounts.a getAccountSynchronizer() {
            return (com.yandex.passport.internal.core.accounts.a) this.accountSynchronizerProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.legacy.analytics.a getAccountTracker() {
            return (com.yandex.passport.legacy.analytics.a) this.accountTrackerProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.upgrader.e getAccountUpgradeRefuseUseCase() {
            return new com.yandex.passport.internal.upgrader.e((com.yandex.passport.common.coroutine.a) this.provideCoroutineDispatchersProvider.get(), (com.yandex.passport.internal.core.accounts.e) this.provideAccountsRetrieverProvider.get(), (com.yandex.passport.internal.upgrader.q) this.upgradeStatusStashUpdaterProvider.get(), (com.yandex.passport.internal.report.reporters.e) this.accountUpgradeReporterProvider.get());
        }

        public com.yandex.passport.internal.methods.performer.ui.b getAccountUpgradeStatusPerformer() {
            return new com.yandex.passport.internal.methods.performer.ui.b((com.yandex.passport.internal.core.accounts.e) this.provideAccountsRetrieverProvider.get(), (com.yandex.passport.internal.upgrader.k) this.getUpgradeStatusUseCaseProvider.get(), (com.yandex.passport.internal.report.reporters.e) this.accountUpgradeReporterProvider.get());
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.upgrader.f getAccountUpgradeSuccessUseCase() {
            return new com.yandex.passport.internal.upgrader.f((com.yandex.passport.common.coroutine.a) this.provideCoroutineDispatchersProvider.get(), (com.yandex.passport.internal.upgrader.q) this.upgradeStatusStashUpdaterProvider.get(), (com.yandex.passport.internal.core.accounts.e) this.provideAccountsRetrieverProvider.get());
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.core.accounts.c getAccountsBackuper() {
            return (com.yandex.passport.internal.core.accounts.c) this.accountsBackuperProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.core.announcing.b getAccountsChangesAnnouncer() {
            return (com.yandex.passport.internal.core.announcing.b) this.accountsChangesAnnouncerProvider.get();
        }

        public com.yandex.passport.internal.methods.performer.s getAccountsListPerformer() {
            return new com.yandex.passport.internal.methods.performer.s((com.yandex.passport.internal.core.accounts.e) this.provideAccountsRetrieverProvider.get(), getAccountFilterRepository());
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.core.accounts.e getAccountsRetriever() {
            return (com.yandex.passport.internal.core.accounts.e) this.provideAccountsRetrieverProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.core.accounts.f getAccountsSaver() {
            return (com.yandex.passport.internal.core.accounts.f) this.accountsSaverProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.core.accounts.i getAccountsUpdater() {
            return (com.yandex.passport.internal.core.accounts.i) this.provideAccountsUpdaterProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public String getAmVersion() {
            this.commonModule.getClass();
            return "7.54.1";
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.common.analytics.f getAnalyticalIdentifiersProvider() {
            return (com.yandex.passport.common.analytics.f) this.provideAnalyticalIdentifiersProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.common.analytics.k getAnalyticsHelper() {
            return (com.yandex.passport.common.analytics.k) this.provideAnalyticsHelperProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.analytics.w getAnalyticsTrackerWrapper() {
            return (com.yandex.passport.internal.analytics.w) this.provideAnalyticsTrackerWrapperProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.core.accounts.k getAndroidAccountManagerHelper() {
            return (com.yandex.passport.internal.core.accounts.k) this.provideAndroidAccountManagerHelperProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.report.reporters.f getAnnouncementReporter() {
            return (com.yandex.passport.internal.report.reporters.f) this.announcementReporterProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.core.announcing.e getAnnouncingHelper() {
            return (com.yandex.passport.internal.core.announcing.e) this.announcingHelperProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.common.a getAppBackgroundStateWrapper() {
            return (com.yandex.passport.internal.common.a) this.bindAppBackgroundStateWrapperProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.analytics.x getAppBindReporter() {
            return (com.yandex.passport.internal.analytics.x) this.appBindReporterProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public Context getApplicationContext() {
            return this.setApplicationContext;
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.common.common.a getApplicationDetailsProvider() {
            return (com.yandex.passport.common.common.a) this.bindApplicationDetailsProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.usecase.authorize.f getAuthByCodeUseCase() {
            return (com.yandex.passport.internal.usecase.authorize.f) this.authorizeByCodeUseCaseProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.usecase.authorize.c getAuthByCookieUseCase() {
            return (com.yandex.passport.internal.usecase.authorize.c) this.authByCookieUseCaseProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.analytics.y getAuthByTrackReporter() {
            return (com.yandex.passport.internal.analytics.y) this.authByTrackReporterProvider.get();
        }

        public com.yandex.passport.internal.methods.performer.t getAuthCookiePerformer() {
            return new com.yandex.passport.internal.methods.performer.t((com.yandex.passport.internal.database.auth_cookie.b) this.provideAuthCookieDaoWrapperProvider.get(), new com.yandex.passport.data.network.token.i(14), (com.yandex.passport.internal.report.reporters.p) this.cookieByTokenReporterProvider.get());
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.ui.tv.d getAuthInWebViewViewModel() {
            return new com.yandex.passport.internal.ui.tv.d((com.yandex.passport.internal.usecase.authorize.c) this.authByCookieUseCaseProvider.get(), (com.yandex.passport.internal.analytics.o0) this.provideEventReporterProvider.get());
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public g getAuthSdkReporter() {
            return (g) this.authSdkReporterProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.core.auth.a getAuthenticator() {
            return (com.yandex.passport.internal.core.auth.a) this.authenticatorProvider.get();
        }

        public com.yandex.passport.internal.methods.performer.u getAuthorizationUrlPerformer() {
            return new com.yandex.passport.internal.methods.performer.u((e0) this.getAuthorizationUrlUseCaseProvider.get(), new com.yandex.passport.data.network.token.i(14), (com.yandex.passport.common.ui.lang.b) this.bindUiLanguageProvider.get(), (com.yandex.passport.internal.report.reporters.d0) this.getAuthorizationUrlReporterProvider.get());
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.usecase.authorize.l getAuthorizeByForwardTrackUseCase() {
            return new com.yandex.passport.internal.usecase.authorize.l((com.yandex.passport.common.coroutine.a) this.provideCoroutineDispatchersProvider.get(), (com.yandex.passport.internal.usecase.k) this.checkLocationIdUseCaseProvider.get(), fetchAndSaveModernAccountUseCase(), (com.yandex.passport.data.network.token.n0) this.getMasterTokenForwardByTrackRequestProvider.get(), (f1) this.tokenActionReporterProvider.get(), (com.yandex.passport.internal.credentials.g) this.masterCredentialsProvider.get(), (com.yandex.passport.internal.network.mappers.b) this.environmentDataMapperProvider.get());
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.usecase.ui.l getAuthorizeByMailOAuthTaskIdUseCase() {
            return (com.yandex.passport.internal.usecase.ui.l) this.authorizeByMailOAuthTaskIdUseCaseProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.autologin.k getAutoLoginUseCase() {
            return (com.yandex.passport.internal.autologin.k) this.autoLoginUseCaseProvider.get();
        }

        public com.yandex.passport.internal.methods.performer.v getAvailableAccountsPerformer() {
            return new com.yandex.passport.internal.methods.performer.v((com.yandex.passport.internal.core.accounts.e) this.provideAccountsRetrieverProvider.get(), getAccountFilterRepository(), getNotLoggedInMembersUseCase(), (i) this.flagRepositoryProvider.get());
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.network.a getBackendParser() {
            return (com.yandex.passport.internal.network.a) this.provideBackendParserProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.analytics.z getBackendReporter() {
            return (com.yandex.passport.internal.analytics.z) this.provideBackendReporterProvider.get();
        }

        public com.yandex.passport.internal.methods.performer.x getBooleanFlagPerformer() {
            return new com.yandex.passport.internal.methods.performer.x((i) this.flagRepositoryProvider.get());
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.report.reporters.m getBouncerReporter() {
            return (com.yandex.passport.internal.report.reporters.m) this.bouncerReporterProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.usecase.vpn.e getCheckVpnStatusUseCase() {
            return (com.yandex.passport.internal.usecase.vpn.e) this.checkVpnStatusUseCaseProvider.get();
        }

        public com.yandex.passport.internal.methods.performer.y getChildCodeByUidParentPerformer() {
            return new com.yandex.passport.internal.methods.performer.y(getChildCodeByUidParentUseCase(), new com.yandex.passport.data.network.token.i(14));
        }

        public com.yandex.passport.internal.usecase.n0 getChildCodeByUidParentUseCase() {
            return new com.yandex.passport.internal.usecase.n0((com.yandex.passport.common.coroutine.a) this.provideCoroutineDispatchersProvider.get(), (z3) this.getChildCodeByUidParentRequestProvider.get(), this.setProperties, (com.yandex.passport.internal.core.accounts.e) this.provideAccountsRetrieverProvider.get(), (com.yandex.passport.internal.network.mappers.b) this.environmentDataMapperProvider.get());
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.network.client.h getClientChooser() {
            return (com.yandex.passport.internal.network.client.h) this.provideBackendClientChooserProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.common.a getClock() {
            return (com.yandex.passport.common.a) this.provideClockProvider.get();
        }

        public com.yandex.passport.internal.methods.performer.z getCodeByCookiePerformer() {
            return new com.yandex.passport.internal.methods.performer.z((o4) this.getCodeByCookieRequestProvider.get(), new com.yandex.passport.data.network.token.i(14), (com.yandex.passport.internal.credentials.g) this.masterCredentialsProvider.get(), (com.yandex.passport.internal.network.mappers.b) this.environmentDataMapperProvider.get());
        }

        public com.yandex.passport.internal.methods.performer.a0 getCodeByUidPerformer() {
            return new com.yandex.passport.internal.methods.performer.a0((com.yandex.passport.internal.core.accounts.e) this.provideAccountsRetrieverProvider.get(), (com.yandex.passport.internal.core.accounts.i) this.provideAccountsUpdaterProvider.get(), (u4) this.getCodeByMasterTokenRequestProvider.get(), this.setProperties, (com.yandex.passport.internal.network.mappers.b) this.environmentDataMapperProvider.get(), new com.yandex.passport.data.network.token.i(14));
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.report.d getCommonParamsProvider() {
            return (com.yandex.passport.internal.report.d) this.commonParamsProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.f getContextUtils() {
            return (com.yandex.passport.internal.f) this.contextUtilsProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.common.coroutine.a getCoroutineDispatchers() {
            return (com.yandex.passport.common.coroutine.a) this.provideCoroutineDispatchersProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.common.coroutine.e getCoroutineScopes() {
            return (com.yandex.passport.common.coroutine.e) this.provideCoroutineScopesProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.sloth.credentialmanager.d getCredentialManagerInterface() {
            return (com.yandex.passport.internal.sloth.credentialmanager.d) this.provideSmartLockInterfaceProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.analytics.c0 getCurrentAccountAnalyticsHelper() {
            return (com.yandex.passport.internal.analytics.c0) this.currentAccountAnalyticsHelperProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.account.a getCurrentAccountManager() {
            return (com.yandex.passport.internal.account.a) this.currentAccountManagerProvider.get();
        }

        public com.yandex.passport.internal.methods.performer.b0 getCurrentAccountPerformer() {
            return new com.yandex.passport.internal.methods.performer.b0((com.yandex.passport.internal.account.a) this.currentAccountManagerProvider.get());
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.database.d getDatabaseHelper() {
            return (com.yandex.passport.internal.database.d) this.provideDatabaseHelperProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.util.d getDebugInfoUtil() {
            return (com.yandex.passport.internal.util.d) this.provideDebugInfoUtilProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.core.accounts.n getDelayedAccountRepairer() {
            return new com.yandex.passport.internal.core.accounts.n((com.yandex.passport.internal.core.accounts.m) this.delayedAccountProvider.get(), (com.yandex.passport.internal.core.accounts.f) this.accountsSaverProvider.get(), (com.yandex.passport.internal.core.accounts.k) this.provideAndroidAccountManagerHelperProvider.get(), (com.yandex.passport.internal.report.reporters.r) this.delayedAccountReporterProvider.get());
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.report.reporters.r getDelayedAccountReporter() {
            return (com.yandex.passport.internal.report.reporters.r) this.delayedAccountReporterProvider.get();
        }

        public com.yandex.passport.internal.methods.performer.c0 getDeviceCodePerformer() {
            return new com.yandex.passport.internal.methods.performer.c0((com.yandex.passport.internal.helper.f) this.deviceAuthorizationHelperProvider.get(), new com.yandex.passport.data.network.token.i(14));
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.report.diary.m0 getDiaryRecorder() {
            return (com.yandex.passport.internal.report.diary.m0) this.diaryRecorderProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.report.diary.w0 getDiaryUploadUseCase() {
            return (com.yandex.passport.internal.report.diary.w0) this.diaryUploadUseCaseProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.analytics.o0 getEventReporter() {
            return (com.yandex.passport.internal.analytics.o0) this.provideEventReporterProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.report.reporters.a0 getExitReasonReporter() {
            return new com.yandex.passport.internal.report.reporters.a0((com.yandex.passport.internal.report.g) this.eventReporterProvider.get(), (com.yandex.passport.internal.features.a) this.reportingFeatureProvider.get());
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.flags.experiments.f getExperimentsFetcher() {
            return (com.yandex.passport.internal.flags.experiments.f) this.experimentsFetcherProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.flags.experiments.i getExperimentsHolder() {
            return (com.yandex.passport.internal.flags.experiments.i) this.provideExperimentsHolderProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.flags.experiments.k getExperimentsOverrides() {
            return (com.yandex.passport.internal.flags.experiments.k) this.experimentsOverridesProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.flags.experiments.q getExperimentsUpdater() {
            return (com.yandex.passport.internal.flags.experiments.q) this.experimentsUpdaterProvider.get();
        }

        public com.yandex.passport.internal.methods.performer.d0 getFlagCredentialManagerForAutoLoginPerformer() {
            return new com.yandex.passport.internal.methods.performer.d0((i) this.flagRepositoryProvider.get());
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public i getFlagRepository() {
            return (i) this.flagRepositoryProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.config.j getGetAppAccountVisibilityConfigUseCase() {
            return (com.yandex.passport.internal.config.j) this.getAppAccountVisibilityConfigUseCaseProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public e0 getGetAuthorizationUrlUseCase() {
            return (e0) this.getAuthorizationUrlUseCaseProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public x0 getGetLocationIdUseCase() {
            return (x0) this.getLocationIdUseCaseProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.usecase.vpn.k getHandleVpnAppBackgroundStateUseCase() {
            return (com.yandex.passport.internal.usecase.vpn.k) this.handleVpnAppBackgroundStateUseCaseProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.util.k getHashEncoder() {
            return (com.yandex.passport.internal.util.k) this.hashEncoderProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.network.requester.e getImageLoadingClient() {
            return (com.yandex.passport.internal.network.requester.e) this.provideImageLoadingClientProvider.get();
        }

        public com.yandex.passport.internal.methods.performer.e0 getInvalidateCookiesAndDeleteAuthCookiesPerformer() {
            return new com.yandex.passport.internal.methods.performer.e0((com.yandex.passport.internal.database.auth_cookie.b) this.provideAuthCookieDaoWrapperProvider.get(), new com.yandex.passport.data.network.token.i(14), (com.yandex.passport.internal.report.reporters.p) this.cookieByTokenReporterProvider.get());
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public g1 getLimitedDependenciesReportUseCase() {
            return (g1) this.limitedDependenciesReportUseCaseProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.usecase.i1 getLimitedPassportInitReportUseCase() {
            return (com.yandex.passport.internal.usecase.i1) this.limitedPassportInitReportUseCaseProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.report.reporters.g0 getLinkHandlingReporter() {
            return (com.yandex.passport.internal.report.reporters.g0) this.linkHandlingReporterProvider.get();
        }

        public com.yandex.passport.internal.methods.performer.g0 getLinkageStatePerformer() {
            return new com.yandex.passport.internal.methods.performer.g0((com.yandex.passport.data.network.p0) this.checkLinkageRequestProvider.get(), new com.yandex.passport.data.network.token.i(14), (com.yandex.passport.internal.core.accounts.e) this.provideAccountsRetrieverProvider.get(), (com.yandex.passport.internal.credentials.g) this.masterCredentialsProvider.get(), (com.yandex.passport.internal.network.mappers.b) this.environmentDataMapperProvider.get());
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.usecase.ui.h0 getLoadAccountsUseCase() {
            return (com.yandex.passport.internal.usecase.ui.h0) this.loadAccountsUseCaseProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.helper.h getLocaleHelper() {
            return (com.yandex.passport.internal.helper.h) this.localeHelperProvider.get();
        }

        public com.yandex.passport.internal.methods.performer.h0 getLocationIdPerformer() {
            return new com.yandex.passport.internal.methods.performer.h0((x0) this.getLocationIdUseCaseProvider.get());
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.account.d getLoginController() {
            return (com.yandex.passport.internal.account.d) this.loginControllerProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.authsdk.a getLoginSdkProviderHelper() {
            return (com.yandex.passport.internal.authsdk.a) this.authSdkProviderHelperProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.usecase.o1 getMakeAllTokenMasterRelatedUseCase() {
            return new com.yandex.passport.internal.usecase.o1((com.yandex.passport.internal.core.accounts.e) this.provideAccountsRetrieverProvider.get(), (com.yandex.passport.internal.storage.c) this.makeTokenMasterCoolDownStorageProvider.get(), updateMasterTokenIfPossibleUseCase(), (i) this.flagRepositoryProvider.get(), (com.yandex.passport.internal.report.reporters.i1) this.updateMasterTokenReporterProvider.get());
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public s1 getManageAccountsVisibilityForBlacklistedAppsUseCase() {
            return (s1) this.manageAccountsVisibilityForBlacklistedAppsUseCaseProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.report.reporters.j0 getManagingPlusDevicesReporter() {
            return (com.yandex.passport.internal.report.reporters.j0) this.managingPlusDevicesReporterProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.core.accounts.q getMasterTokenEncrypter() {
            return (com.yandex.passport.internal.core.accounts.q) this.masterTokenEncrypterProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.data.network.core.s getMasterTokenTombstoneManager() {
            return (com.yandex.passport.data.network.core.s) this.provideMasterTokenTombstoneManagerProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.core.accounts.s getMemberAccountRepository() {
            return (com.yandex.passport.internal.core.accounts.s) this.memberAccountRepositoryProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.methods.performer.y0 getMethodPerformDispatcher() {
            return new com.yandex.passport.internal.methods.performer.y0((com.yandex.passport.internal.provider.a) this.internalProviderHelperProvider.get(), (com.yandex.passport.internal.report.diary.m0) this.diaryRecorderProvider.get(), getAccountUpgradeStatusPerformer(), getCodeByUidPerformer(), onAccountUpgradeDeclinedPerformer(), logoutPerformer(), performSyncPerformer(), (com.yandex.passport.internal.methods.performer.o) this.executeCheckVpnStatusPerformerProvider.get(), corruptMasterTokenPerformer(), dropTokenPerformer(), removeAccountPerformer(), getPersonProfilePerformer(), setCurrentAccountPerformer(), getUidByNormalizedLoginPerformer(), authorizeByRawJsonPerformer(), authorizeByUserCredentialsPerformer(), sendAuthToTrackPerformer(), getCodeByCookiePerformer(), authorizeByForwardTrackPerformer(), getDeviceCodePerformer(), authorizeByDeviceCodePerformer(), authorizeByCookiePerformer(), authorizeByCodePerformer(), updateAvatarPerformer(), uploadDiaryPerformer(), getAccountsListPerformer(), getAccountByUidPerformer(), getAccountByNamePerformer(), getCurrentAccountPerformer(), getAccountByMachineReadableLoginPerformer(), isMasterTokenValidPerformer(), acceptDeviceAuthorizationPerformer(), getTokenPerformer(), addAccountPerformer(), getChildCodeByUidParentPerformer(), autoLoginPerformer(), getLinkageStatePerformer(), getTrackPayloadPerformer(), getQrLinkPerformer(), authByQrLinkPerformer(), trackFromMagicPerformer(), updateAuthCookiePerformer(), getAuthCookiePerformer(), getInvalidateCookiesAndDeleteAuthCookiesPerformer(), getLocationIdPerformer(), getFlagCredentialManagerForAutoLoginPerformer(), updatePropertiesPerformer(), onPushMessageReceivedPerformer(), onNewPushTokenPerformer(), getPushCodePerformer(), getSilentPushConfigPerformer(), getSavedPushPayloadPerformer(), deleteSavedPushPayloadPerformer(), tryAddPlusDevicePerformer(), getAvailableAccountsPerformer(), pushProviderSupportedPlatformsPerformer(), getAuthorizationUrlPerformer(), getUserIdUrlPerformer(), getOtpByTrackPerformer(), removeAccountExplicitlyPerformer(), getBooleanFlagPerformer(), onAppBackgroundStateChangedPerformer(), (com.yandex.passport.internal.methods.performer.l1) this.setVpnChallengeActivityDisabledPerformerProvider.get());
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public xe getMetricaReporter() {
            return (xe) this.metricaReporterProvider.get();
        }

        public b1 getNotLoggedInMembersUseCase() {
            return new b1((com.yandex.passport.internal.core.accounts.s) this.memberAccountRepositoryProvider.get());
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.push.m getNotificationHelper() {
            return (com.yandex.passport.internal.push.m) this.notificationHelperProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public OkHttpClient getOkHttpClient() {
            return (OkHttpClient) this.provideOkHttpClientProvider.get();
        }

        public com.yandex.passport.internal.methods.performer.i0 getOtpByTrackPerformer() {
            return new com.yandex.passport.internal.methods.performer.i0(getOtpByTrackUseCase(), new com.yandex.passport.data.network.token.i(14));
        }

        public d1 getOtpByTrackUseCase() {
            return new d1((com.yandex.passport.common.coroutine.a) this.provideCoroutineDispatchersProvider.get(), (k7) this.getPush2faCodeRequestProvider.get(), (com.yandex.passport.internal.core.accounts.e) this.provideAccountsRetrieverProvider.get(), (com.yandex.passport.internal.network.mappers.b) this.environmentDataMapperProvider.get(), (com.yandex.passport.internal.report.reporters.z0) this.silentPushReporterProvider.get());
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.report.reporters.l0 getOtpWaReporter() {
            return (com.yandex.passport.internal.report.reporters.l0) this.otpWaReporterProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.provider.communication.v getPassportRequestsProcessor() {
            return (com.yandex.passport.internal.provider.communication.v) this.passportRequestsProcessorProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.helper.j getPersonProfileHelper() {
            return (com.yandex.passport.internal.helper.j) this.personProfileHelperProvider.get();
        }

        public com.yandex.passport.internal.methods.performer.j0 getPersonProfilePerformer() {
            return new com.yandex.passport.internal.methods.performer.j0((com.yandex.passport.internal.helper.j) this.personProfileHelperProvider.get(), new com.yandex.passport.data.network.token.i(14));
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.storage.m getPreferenceStorage() {
            return (com.yandex.passport.internal.storage.m) this.preferenceStorageProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.properties.x getProperties() {
            return this.setProperties;
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.properties.y getPropertyUpdater() {
            return (com.yandex.passport.internal.properties.y) this.propertyUpdaterProvider.get();
        }

        public k0 getPushCodePerformer() {
            return new k0(getOtpByTrackUseCase());
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.push.i0 getPushPayloadFactory() {
            return new com.yandex.passport.internal.push.i0((com.yandex.passport.internal.report.reporters.w0) this.pushReporterProvider.get());
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.report.reporters.w0 getPushReporter() {
            return (com.yandex.passport.internal.report.reporters.w0) this.pushReporterProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.push.g getPushSubscriptionManager() {
            return (com.yandex.passport.internal.push.g) this.greatAgainPushSubscriptionManagerProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.push.u0 getPushSubscriptionScheduler() {
            return (com.yandex.passport.internal.push.u0) this.pushSubscriptionSchedulerProvider.get();
        }

        public com.yandex.passport.internal.methods.performer.l0 getQrLinkPerformer() {
            return new com.yandex.passport.internal.methods.performer.l0((r7) this.getQrLinkRequestProvider.get(), new com.yandex.passport.data.network.token.i(14), (com.yandex.passport.internal.report.reporters.e0) this.linkAuthReporterProvider.get(), (com.yandex.passport.internal.network.mappers.b) this.environmentDataMapperProvider.get());
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.rotation.j getRevokeQuarantineMasterTokenUseCase() {
            return new com.yandex.passport.internal.rotation.j((com.yandex.passport.common.coroutine.a) this.provideCoroutineDispatchersProvider.get(), quarantineMasterTokenStorage(), (com.yandex.passport.internal.usecase.a2) this.revokeMasterTokenUseCaseProvider.get(), (com.yandex.passport.internal.core.accounts.e) this.provideAccountsRetrieverProvider.get(), (com.yandex.passport.internal.report.reporters.k0) this.masterTokenRotationReporterProvider.get());
        }

        public com.yandex.passport.internal.methods.performer.m0 getSavedPushPayloadPerformer() {
            return new com.yandex.passport.internal.methods.performer.m0((i) this.flagRepositoryProvider.get(), getPushPayloadFactory(), (l0) this.pushPayloadStorageProvider.get(), (com.yandex.passport.internal.report.reporters.z0) this.silentPushReporterProvider.get());
        }

        public com.yandex.passport.internal.methods.performer.n0 getSilentPushConfigPerformer() {
            return new com.yandex.passport.internal.methods.performer.n0((i) this.flagRepositoryProvider.get());
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.sloth.k getSlothDependenciesFactory() {
            return (com.yandex.passport.internal.sloth.k) this.slothDependenciesFactoryProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.sloth.dependencies.h getSlothReportDelegate() {
            com.yandex.passport.internal.di.module.p pVar = this.serviceModule;
            com.yandex.passport.internal.sloth.o oVar = (com.yandex.passport.internal.sloth.o) this.slothReportDelegateImplProvider.get();
            pVar.getClass();
            oVar.getClass();
            return oVar;
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.ui.sloth.f getSlothStandalonePerformConfiguration() {
            return (com.yandex.passport.internal.ui.sloth.f) this.slothStandalonePerformConfigurationProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.ui.sloth.menu.a getSlothUserMenuPerformConfiguration() {
            return (com.yandex.passport.internal.ui.sloth.menu.a) this.slothUserMenuPerformConfigurationProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.ui.sloth.webcard.b getSlothWebCardPerformConfiguration() {
            return (com.yandex.passport.internal.ui.sloth.webcard.b) this.slothWebCardPerformConfigurationProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.smsretriever.b getSmsRetrieverHelper() {
            return (com.yandex.passport.internal.smsretriever.b) this.smsRetrieverHelperProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.analytics.q0 getSocialBrowserReporter() {
            return (com.yandex.passport.internal.analytics.q0) this.socialBrowserReporterProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.report.reporters.a1 getSocialReporter() {
            return (com.yandex.passport.internal.report.reporters.a1) this.socialReporterProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.sso.announcing.c getSsoAccountsSyncHelper() {
            return (com.yandex.passport.internal.sso.announcing.c) this.ssoAccountsSyncHelperProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.sso.k getSsoContentProviderHelper() {
            return (com.yandex.passport.internal.sso.k) this.ssoContentProviderHelperProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.report.reporters.b1 getStandaloneReporter() {
            return (com.yandex.passport.internal.report.reporters.b1) this.standaloneReporterProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.report.reporters.c1 getStashReporter() {
            return (com.yandex.passport.internal.report.reporters.c1) this.stashReporterProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public n0 getStatefulReporter() {
            return (n0) this.domikStatefulReporterProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public l2 getSuggestedLanguageUseCase() {
            return (l2) this.suggestedLanguageUseCaseProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.core.sync.a getSyncAdapter() {
            return (com.yandex.passport.internal.core.sync.a) this.syncAdapterProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.core.sync.b getSyncHelper() {
            return (com.yandex.passport.internal.core.sync.b) this.provideSyncHelperProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public f1 getTokenActionReporter() {
            return (f1) this.tokenActionReporterProvider.get();
        }

        public com.yandex.passport.internal.methods.performer.o0 getTokenPerformer() {
            return new com.yandex.passport.internal.methods.performer.o0((com.yandex.passport.internal.core.accounts.e) this.provideAccountsRetrieverProvider.get(), (com.yandex.passport.internal.usecase.s0) this.getClientTokenUseCaseProvider.get(), new com.yandex.passport.data.network.token.i(14));
        }

        public com.yandex.passport.internal.methods.performer.q0 getTrackPayloadPerformer() {
            return new com.yandex.passport.internal.methods.performer.q0((com.yandex.passport.internal.core.accounts.e) this.provideAccountsRetrieverProvider.get(), (t8) this.getTrackPayloadRequestProvider.get(), new com.yandex.passport.data.network.token.i(14), (com.yandex.passport.internal.network.mappers.b) this.environmentDataMapperProvider.get());
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public o2 getTryAddPlusDeviceUseCase() {
            return (o2) this.tryAddPlusDeviceUseCaseProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.common.ui.lang.b getUiLanguageProvider() {
            return (com.yandex.passport.common.ui.lang.b) this.bindUiLanguageProvider.get();
        }

        public com.yandex.passport.internal.methods.performer.r0 getUidByNormalizedLoginPerformer() {
            return new com.yandex.passport.internal.methods.performer.r0((com.yandex.passport.internal.core.accounts.e) this.provideAccountsRetrieverProvider.get());
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.badges.j getUpdateBadgesConfigUseCase() {
            return (com.yandex.passport.internal.badges.j) this.updateBadgesConfigUseCaseProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.config.l getUpdateConfigUseCase() {
            return (com.yandex.passport.internal.config.l) this.getConfigUseCaseProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.network.d getUrlDispatcher() {
            return (com.yandex.passport.internal.network.d) this.provideBaseUrlDispatcherProvider.get();
        }

        public com.yandex.passport.internal.methods.performer.s0 getUserIdUrlPerformer() {
            return new com.yandex.passport.internal.methods.performer.s0((com.yandex.passport.internal.account.a) this.currentAccountManagerProvider.get(), (com.yandex.passport.internal.network.d) this.provideBaseUrlDispatcherProvider.get(), (e0) this.getAuthorizationUrlUseCaseProvider.get(), (com.yandex.passport.common.ui.lang.b) this.bindUiLanguageProvider.get(), (com.yandex.passport.internal.sloth.z) this.slothWebParamsProviderImplProvider.get());
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.sloth.performers.usermenu.h getUserMenuEventSender() {
            return (com.yandex.passport.internal.sloth.performers.usermenu.h) this.userMenuEventSenderProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.di.module.v getViewModelsFactory() {
            return new com.yandex.passport.internal.di.module.v(mapOfClassOfAndProviderOfViewModel());
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.ui.challenge.vpn.o getVpnChallengeViewModelFactory() {
            return (com.yandex.passport.internal.ui.challenge.vpn.o) this.factoryProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.report.reporters.m1 getWarmUpWebViewReporter() {
            return (com.yandex.passport.internal.report.reporters.m1) this.warmUpWebViewReporterProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public o1 getWebAmReporter() {
            return (o1) this.webAmReporterProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.sloth.webauthn.e getWebAuthN() {
            return (com.yandex.passport.internal.sloth.webauthn.e) this.provideWebAuthNClientProvider.get();
        }

        @Override // com.yandex.passport.internal.di.component.PassportProcessGlobalComponent
        public com.yandex.passport.internal.ui.webview.webcases.y getWebCaseFactory() {
            return new com.yandex.passport.internal.ui.webview.webcases.y((com.yandex.passport.internal.network.client.h) this.provideBackendClientChooserProvider.get());
        }

        public t0 isMasterTokenValidPerformer() {
            return new t0((com.yandex.passport.internal.core.accounts.e) this.provideAccountsRetrieverProvider.get(), (com.yandex.passport.data.network.core.s) this.provideMasterTokenTombstoneManagerProvider.get());
        }

        public com.yandex.passport.internal.methods.performer.u0 logoutPerformer() {
            return new com.yandex.passport.internal.methods.performer.u0((com.yandex.passport.internal.usecase.k0) this.getChallengeUseCaseProvider.get(), (m1) this.logoutUseCaseProvider.get());
        }

        public Map<Class<? extends bfu>, szm> mapOfClassOfAndProviderOfViewModel() {
            return Collections.singletonMap(com.yandex.passport.internal.ui.account_upgrade.j.class, this.accountUpgraderViewModelProvider);
        }

        public com.yandex.passport.internal.methods.performer.a1 onAccountUpgradeDeclinedPerformer() {
            return new com.yandex.passport.internal.methods.performer.a1(getAccountUpgradeRefuseUseCase());
        }

        public com.yandex.passport.internal.methods.performer.b1 onAppBackgroundStateChangedPerformer() {
            return new com.yandex.passport.internal.methods.performer.b1((com.yandex.passport.internal.common.a) this.bindAppBackgroundStateWrapperProvider.get());
        }

        public com.yandex.passport.internal.methods.performer.c1 onNewPushTokenPerformer() {
            return new com.yandex.passport.internal.methods.performer.c1((com.yandex.passport.internal.push.u0) this.pushSubscriptionSchedulerProvider.get());
        }

        public com.yandex.passport.internal.methods.performer.d1 onPushMessageReceivedPerformer() {
            return new com.yandex.passport.internal.methods.performer.d1((com.yandex.passport.internal.push.m) this.notificationHelperProvider.get(), (com.yandex.passport.internal.report.reporters.w0) this.pushReporterProvider.get());
        }

        public e1 performSyncPerformer() {
            return new e1((com.yandex.passport.internal.helper.j) this.personProfileHelperProvider.get(), new com.yandex.passport.data.network.token.i(14));
        }

        public com.yandex.passport.internal.link_auth.d pollingStorage() {
            return new com.yandex.passport.internal.link_auth.d(this.setApplicationContext, (com.yandex.passport.common.coroutine.a) this.provideCoroutineDispatchersProvider.get(), (i) this.flagRepositoryProvider.get(), (com.yandex.passport.common.a) this.provideClockProvider.get());
        }

        public com.yandex.passport.internal.methods.performer.f1 pushProviderSupportedPlatformsPerformer() {
            return new com.yandex.passport.internal.methods.performer.f1((com.yandex.passport.internal.provider.communication.q) this.iPCPropertiesHolderProvider.get());
        }

        public com.yandex.passport.internal.rotation.h quarantineMasterTokenStorage() {
            return new com.yandex.passport.internal.rotation.h(this.setApplicationContext, (com.yandex.passport.internal.report.reporters.k0) this.masterTokenRotationReporterProvider.get());
        }

        public com.yandex.passport.internal.methods.performer.g1 removeAccountExplicitlyPerformer() {
            return new com.yandex.passport.internal.methods.performer.g1(removeAccountUseCase(), (com.yandex.passport.internal.core.accounts.p) this.immediateAccountsRetrieverProvider.get());
        }

        public com.yandex.passport.internal.methods.performer.h1 removeAccountPerformer() {
            return new com.yandex.passport.internal.methods.performer.h1(this.setApplicationContext, (com.yandex.passport.internal.analytics.o0) this.provideEventReporterProvider.get(), removeAccountUseCase(), (com.yandex.passport.internal.core.accounts.p) this.immediateAccountsRetrieverProvider.get());
        }

        public com.yandex.passport.internal.core.accounts.y removeAccountUseCase() {
            return new com.yandex.passport.internal.core.accounts.y((com.yandex.passport.internal.core.accounts.i) this.provideAccountsUpdaterProvider.get(), (com.yandex.passport.internal.core.accounts.s) this.memberAccountRepositoryProvider.get(), (com.yandex.passport.internal.core.accounts.p) this.immediateAccountsRetrieverProvider.get(), (i) this.flagRepositoryProvider.get());
        }

        public com.yandex.passport.internal.methods.performer.i1 sendAuthToTrackPerformer() {
            return new com.yandex.passport.internal.methods.performer.i1((com.yandex.passport.internal.helper.f) this.deviceAuthorizationHelperProvider.get(), new com.yandex.passport.data.network.token.i(14));
        }

        public com.yandex.passport.internal.methods.performer.k1 setCurrentAccountPerformer() {
            return new com.yandex.passport.internal.methods.performer.k1((com.yandex.passport.internal.usecase.k0) this.getChallengeUseCaseProvider.get(), (com.yandex.passport.internal.account.a) this.currentAccountManagerProvider.get(), (f2) this.setCurrentAccountUseCaseProvider.get());
        }

        public com.yandex.passport.internal.sloth.m slothEulaSupport() {
            return new com.yandex.passport.internal.sloth.m(this.setApplicationContext, this.setProperties);
        }

        public com.yandex.passport.internal.methods.performer.m1 trackFromMagicPerformer() {
            return new com.yandex.passport.internal.methods.performer.m1((n8) this.getTrackFromMagicRequestProvider.get(), new com.yandex.passport.data.network.token.i(14), pollingStorage(), (com.yandex.passport.internal.report.reporters.e0) this.linkAuthReporterProvider.get(), (com.yandex.passport.internal.network.mappers.b) this.environmentDataMapperProvider.get());
        }

        public com.yandex.passport.internal.methods.performer.n1 tryAddPlusDevicePerformer() {
            return new com.yandex.passport.internal.methods.performer.n1((o2) this.tryAddPlusDeviceUseCaseProvider.get(), new com.yandex.passport.data.network.token.i(14));
        }

        public p1 updateAuthCookiePerformer() {
            return new p1((com.yandex.passport.internal.database.auth_cookie.b) this.provideAuthCookieDaoWrapperProvider.get(), new com.yandex.passport.data.network.token.i(14), (com.yandex.passport.internal.usecase.w0) this.getCookieByTokenUseCaseProvider.get());
        }

        public com.yandex.passport.internal.methods.performer.q1 updateAvatarPerformer() {
            return new com.yandex.passport.internal.methods.performer.q1((v2) this.updateAvatarUseCaseProvider.get(), new com.yandex.passport.data.network.token.i(14));
        }

        public x2 updateMasterTokenIfPossibleUseCase() {
            return new x2(authByMuidTokenUseCase(), (com.yandex.passport.internal.storage.c) this.makeTokenMasterCoolDownStorageProvider.get(), (com.yandex.passport.internal.report.reporters.i1) this.updateMasterTokenReporterProvider.get(), (i) this.flagRepositoryProvider.get(), (com.yandex.passport.internal.core.accounts.s) this.memberAccountRepositoryProvider.get());
        }

        public com.yandex.passport.internal.methods.performer.r1 updatePropertiesPerformer() {
            return new com.yandex.passport.internal.methods.performer.r1((com.yandex.passport.internal.properties.y) this.propertyUpdaterProvider.get(), (com.yandex.passport.internal.usecase.k1) this.limitedUpdatedPropertiesReportUseCaseProvider.get(), (com.yandex.passport.internal.report.reporters.t0) this.passportInitReporterProvider.get());
        }

        public com.yandex.passport.internal.methods.performer.s1 uploadDiaryPerformer() {
            return new com.yandex.passport.internal.methods.performer.s1((com.yandex.passport.internal.report.diary.w0) this.diaryUploadUseCaseProvider.get());
        }

        public com.yandex.passport.internal.ui.common.web.a urlChecker() {
            return new com.yandex.passport.internal.ui.common.web.a(whiteListRegexConfigStorage(), slothEulaSupport(), (com.yandex.passport.internal.network.d) this.provideBaseUrlDispatcherProvider.get());
        }

        public boolean whiteLabelBoolean() {
            com.yandex.passport.internal.di.module.a aVar = this.commonModule;
            com.yandex.passport.internal.properties.x xVar = this.setProperties;
            aVar.getClass();
            xVar.getClass();
            return xVar.x;
        }

        public com.yandex.passport.internal.config.p whiteListRegexConfigStorage() {
            return new com.yandex.passport.internal.config.p(this.setApplicationContext);
        }
    }

    public static final class RegisterWebAuthNComponentBuilder implements com.yandex.passport.internal.ui.sloth.webauthn.a {
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private Activity setActivity;
        private com.yandex.passport.common.ui.progress.g setProgressProperties;
        private com.yandex.passport.internal.ui.sloth.webauthn.f setProperties;

        private RegisterWebAuthNComponentBuilder(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
        }

        @Override // com.yandex.passport.internal.ui.sloth.webauthn.a
        public com.yandex.passport.internal.ui.sloth.webauthn.b build() {
            a4g.q(com.yandex.passport.internal.ui.sloth.webauthn.f.class, this.setProperties);
            a4g.q(com.yandex.passport.common.ui.progress.g.class, this.setProgressProperties);
            a4g.q(Activity.class, this.setActivity);
            return new RegisterWebAuthNComponentImpl(this.passportProcessGlobalComponentImpl, new com.yandex.passport.internal.ui.common.e(), new com.yandex.passport.internal.ui.sloth.webauthn.c(), this.setProperties, this.setProgressProperties, this.setActivity);
        }

        @Override // com.yandex.passport.internal.ui.sloth.webauthn.a
        public RegisterWebAuthNComponentBuilder setActivity(Activity activity) {
            activity.getClass();
            this.setActivity = activity;
            return this;
        }

        @Override // com.yandex.passport.internal.ui.sloth.webauthn.a
        public RegisterWebAuthNComponentBuilder setProgressProperties(com.yandex.passport.common.ui.progress.g gVar) {
            gVar.getClass();
            this.setProgressProperties = gVar;
            return this;
        }

        @Override // com.yandex.passport.internal.ui.sloth.webauthn.a
        public RegisterWebAuthNComponentBuilder setProperties(com.yandex.passport.internal.ui.sloth.webauthn.f fVar) {
            fVar.getClass();
            this.setProperties = fVar;
            return this;
        }
    }

    public static final class RegisterWebAuthNComponentImpl implements com.yandex.passport.internal.ui.sloth.webauthn.b {
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        rzm providePerformConfigurationProvider;
        private final RegisterWebAuthNComponentImpl registerWebAuthNComponentImpl = this;
        rzm setActivityProvider;
        private final com.yandex.passport.common.ui.progress.g setProgressProperties;
        private final com.yandex.passport.internal.ui.sloth.webauthn.f setProperties;
        private final com.yandex.passport.internal.ui.common.e storeFactoryModule;

        public RegisterWebAuthNComponentImpl(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, com.yandex.passport.internal.ui.common.e eVar, com.yandex.passport.internal.ui.sloth.webauthn.c cVar, com.yandex.passport.internal.ui.sloth.webauthn.f fVar, com.yandex.passport.common.ui.progress.g gVar, Activity activity) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            this.storeFactoryModule = eVar;
            this.setProperties = fVar;
            this.setProgressProperties = gVar;
            initialize(eVar, cVar, fVar, gVar, activity);
        }

        private void initialize(com.yandex.passport.internal.ui.common.e eVar, com.yandex.passport.internal.ui.sloth.webauthn.c cVar, com.yandex.passport.internal.ui.sloth.webauthn.f fVar, com.yandex.passport.common.ui.progress.g gVar, Activity activity) {
            this.providePerformConfigurationProvider = new k(cVar, this.passportProcessGlobalComponentImpl.slothStandalonePerformConfigurationProvider, 17);
            this.setActivityProvider = toe.a(activity);
        }

        @Override // com.yandex.passport.internal.ui.sloth.webauthn.b
        public com.yandex.passport.common.ui.progress.g getProgressProperties() {
            return this.setProgressProperties;
        }

        @Override // com.yandex.passport.internal.ui.sloth.webauthn.b
        public com.yandex.passport.internal.ui.sloth.screen.e getSlothScreenComponentBuilder() {
            return new cypiuss6_SlothScreenComponentBuilder(this.passportProcessGlobalComponentImpl, this.registerWebAuthNComponentImpl);
        }

        @Override // com.yandex.passport.internal.ui.sloth.webauthn.b
        public com.yandex.passport.internal.ui.sloth.webauthn.r getViewModelFactory() {
            return new com.yandex.passport.internal.ui.sloth.webauthn.r(registerWebAuthNStoreFactory());
        }

        @Override // com.yandex.passport.internal.ui.sloth.webauthn.b
        public com.yandex.passport.internal.sloth.webauthn.e getWebAuthN() {
            return (com.yandex.passport.internal.sloth.webauthn.e) this.passportProcessGlobalComponentImpl.provideWebAuthNClientProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.sloth.webauthn.b
        public com.yandex.passport.internal.report.reporters.p1 getWebAuthNReporter() {
            return (com.yandex.passport.internal.report.reporters.p1) this.passportProcessGlobalComponentImpl.webAuthNReporterProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.sloth.webauthn.b
        public boolean isWhiteLabel() {
            return this.passportProcessGlobalComponentImpl.whiteLabelBoolean();
        }

        public com.yandex.passport.internal.ui.sloth.webauthn.p registerWebAuthNStoreFactory() {
            return new com.yandex.passport.internal.ui.sloth.webauthn.p(com.yandex.passport.internal.ui.common.f.a(this.storeFactoryModule), this.setProperties, (com.yandex.passport.internal.core.accounts.e) this.passportProcessGlobalComponentImpl.provideAccountsRetrieverProvider.get(), (com.yandex.passport.internal.report.reporters.p1) this.passportProcessGlobalComponentImpl.webAuthNReporterProvider.get());
        }
    }

    public static final class RendererComponentBuilder implements t {
        private final BouncerActivityComponentImpl bouncerActivityComponentImpl;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;

        private RendererComponentBuilder(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, BouncerActivityComponentImpl bouncerActivityComponentImpl) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            this.bouncerActivityComponentImpl = bouncerActivityComponentImpl;
        }

        @Override // com.yandex.passport.internal.ui.bouncer.t
        public com.yandex.passport.internal.ui.bouncer.u build() {
            return new RendererComponentImpl(this.passportProcessGlobalComponentImpl, this.bouncerActivityComponentImpl, new com.yandex.passport.internal.ui.bouncer.r());
        }
    }

    public static final class RendererComponentImpl implements com.yandex.passport.internal.ui.bouncer.u {
        private final BouncerActivityComponentImpl bouncerActivityComponentImpl;
        private final com.yandex.passport.internal.ui.bouncer.r bouncerRendererModule;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private final RendererComponentImpl rendererComponentImpl = this;

        public RendererComponentImpl(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, BouncerActivityComponentImpl bouncerActivityComponentImpl, com.yandex.passport.internal.ui.bouncer.r rVar) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            this.bouncerActivityComponentImpl = bouncerActivityComponentImpl;
            this.bouncerRendererModule = rVar;
        }

        @Override // com.yandex.passport.internal.ui.bouncer.u
        public Activity getActivity() {
            return (Activity) this.bouncerActivityComponentImpl.getActivityProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.bouncer.u
        public com.yandex.passport.internal.report.reporters.k getBadgesReporter() {
            return (com.yandex.passport.internal.report.reporters.k) this.passportProcessGlobalComponentImpl.badgesReporterProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.bouncer.u
        public BouncerActivity getBouncerActivity() {
            return (BouncerActivity) this.bouncerActivityComponentImpl.getBouncerActivityProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.bouncer.u
        public szm getBouncerMasterChooserComponentBuilderProvider() {
            return this.bouncerActivityComponentImpl.getBouncerMasterChooserComponentBuilderProvider;
        }

        @Override // com.yandex.passport.internal.ui.bouncer.u
        public szm getBouncerSlothComposeComponentBuilderProvider() {
            return this.bouncerActivityComponentImpl.getBouncerSlothComposeComponentBuilderProvider;
        }

        @Override // com.yandex.passport.internal.ui.bouncer.u
        public com.yandex.passport.common.coroutine.a getCoroutineDispatchers() {
            return (com.yandex.passport.common.coroutine.a) this.passportProcessGlobalComponentImpl.provideCoroutineDispatchersProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.bouncer.u
        public com.yandex.passport.internal.report.reporters.q getCreateProfileReporter() {
            return (com.yandex.passport.internal.report.reporters.q) this.passportProcessGlobalComponentImpl.createProfileReporterProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.bouncer.u
        public i getFlagRepository() {
            return (i) this.passportProcessGlobalComponentImpl.flagRepositoryProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.bouncer.u
        public com.yandex.passport.sloth.ui.l getNetworkObserver() {
            com.yandex.passport.internal.ui.bouncer.r rVar = this.bouncerRendererModule;
            com.yandex.passport.internal.sloth.n slothNetworkStatusImpl = this.bouncerActivityComponentImpl.slothNetworkStatusImpl();
            rVar.getClass();
            slothNetworkStatusImpl.getClass();
            return slothNetworkStatusImpl;
        }

        @Override // com.yandex.passport.internal.ui.bouncer.u
        public com.yandex.passport.internal.properties.x getPassportProperties() {
            return this.passportProcessGlobalComponentImpl.setProperties;
        }

        @Override // com.yandex.passport.internal.ui.bouncer.u
        public com.yandex.passport.common.ui.progress.g getProgressProperties() {
            return this.bouncerActivityComponentImpl.progressProperties();
        }

        @Override // com.yandex.passport.internal.ui.bouncer.u
        public com.yandex.passport.internal.report.reporters.m getReporter() {
            return (com.yandex.passport.internal.report.reporters.m) this.passportProcessGlobalComponentImpl.bouncerReporterProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.bouncer.u
        public com.yandex.passport.common.ui.lang.b getUiLanguageProvider() {
            return (com.yandex.passport.common.ui.lang.b) this.passportProcessGlobalComponentImpl.bindUiLanguageProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.bouncer.u
        public s getWishSource() {
            return (s) this.bouncerActivityComponentImpl.bouncerWishSourceProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.bouncer.u
        public boolean isWhiteLabel() {
            return this.passportProcessGlobalComponentImpl.whiteLabelBoolean();
        }
    }

    public static final class SetCurrentAccountActivityComponentImpl implements com.yandex.passport.internal.ui.challenge.changecurrent.b {
        rzm challengeUiProvider;
        rzm getActivityProvider;
        rzm getProgressPropertiesProvider;
        rzm getPropertiesProvider;
        rzm loadingUiProvider;
        rzm loadingWithDelaySlabProvider;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private final SetCurrentAccountActivityComponentImpl setCurrentAccountActivityComponentImpl = this;
        rzm webUrlCheckerProvider;
        rzm webViewControllerProvider;
        rzm webViewSlabProvider;
        rzm webViewUiProvider;

        public SetCurrentAccountActivityComponentImpl(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, com.yandex.passport.internal.ui.challenge.changecurrent.c cVar) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            initialize(cVar);
        }

        private void initialize(com.yandex.passport.internal.ui.challenge.changecurrent.c cVar) {
            this.getActivityProvider = t8a.b(new com.yandex.passport.internal.flags.experiments.h(4, cVar));
            rzm b = t8a.b(new com.yandex.passport.internal.ui.challenge.changecurrent.d(cVar, 0));
            this.getProgressPropertiesProvider = b;
            rzm b2 = t8a.b(new com.yandex.passport.internal.ui.common.c(this.passportProcessGlobalComponentImpl.setPropertiesProvider, this.getActivityProvider, b, 1));
            this.webViewUiProvider = b2;
            rzm b3 = t8a.b(new com.yandex.passport.internal.ui.bouncer.sloth.i(b2, 5));
            this.webViewControllerProvider = b3;
            PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl = this.passportProcessGlobalComponentImpl;
            com.yandex.passport.internal.ui.bouncer.sloth.i iVar = new com.yandex.passport.internal.ui.bouncer.sloth.i(passportProcessGlobalComponentImpl.urlCheckerProvider, 4);
            this.webUrlCheckerProvider = iVar;
            this.webViewSlabProvider = t8a.b(new com.yandex.passport.data.network.n(this.webViewUiProvider, this.getActivityProvider, b3, passportProcessGlobalComponentImpl.provideEventReporterProvider, iVar, 24));
            this.challengeUiProvider = t8a.b(new com.yandex.passport.internal.ui.bouncer.sloth.i(this.getActivityProvider, 1));
            rzm b4 = t8a.b(new com.yandex.passport.internal.ui.common.c(this.getActivityProvider, this.passportProcessGlobalComponentImpl.setPropertiesProvider, this.getProgressPropertiesProvider, 0));
            this.loadingUiProvider = b4;
            this.loadingWithDelaySlabProvider = t8a.b(new com.yandex.passport.internal.ui.bouncer.sloth.i(b4, 3));
            this.getPropertiesProvider = t8a.b(new com.yandex.passport.internal.ui.challenge.changecurrent.d(cVar, 1));
        }

        @Override // com.yandex.passport.internal.ui.challenge.changecurrent.b
        public com.yandex.passport.internal.ui.common.d getDelayedLoadingSlab() {
            return (com.yandex.passport.internal.ui.common.d) this.loadingWithDelaySlabProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.challenge.f
        public com.yandex.passport.internal.ui.common.b getLoader() {
            return (com.yandex.passport.internal.ui.common.b) this.loadingUiProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.challenge.changecurrent.b
        public com.yandex.passport.internal.properties.c0 getProperties() {
            return (com.yandex.passport.internal.properties.c0) this.getPropertiesProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.challenge.f
        public com.yandex.passport.internal.ui.challenge.w getUi() {
            return (com.yandex.passport.internal.ui.challenge.w) this.challengeUiProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.challenge.f
        public com.yandex.passport.internal.ui.common.web.g getWebSlab() {
            return (com.yandex.passport.internal.ui.common.web.g) this.webViewSlabProvider.get();
        }
    }

    public static final class SetCurrentAccountComponentBuilder implements com.yandex.passport.internal.ui.challenge.changecurrent.e {
        private com.yandex.passport.internal.ui.challenge.n challengeData;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private com.yandex.passport.internal.ui.challenge.changecurrent.j viewModel;

        private SetCurrentAccountComponentBuilder(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
        }

        @Override // com.yandex.passport.internal.ui.challenge.changecurrent.e
        public com.yandex.passport.internal.ui.challenge.changecurrent.f build() {
            a4g.q(com.yandex.passport.internal.ui.challenge.n.class, this.challengeData);
            a4g.q(com.yandex.passport.internal.ui.challenge.changecurrent.j.class, this.viewModel);
            return new SetCurrentAccountComponentImpl(this.passportProcessGlobalComponentImpl, this.challengeData, this.viewModel);
        }

        @Override // com.yandex.passport.internal.ui.challenge.changecurrent.e
        public SetCurrentAccountComponentBuilder challengeData(com.yandex.passport.internal.ui.challenge.n nVar) {
            nVar.getClass();
            this.challengeData = nVar;
            return this;
        }

        @Override // com.yandex.passport.internal.ui.challenge.changecurrent.e
        public SetCurrentAccountComponentBuilder viewModel(com.yandex.passport.internal.ui.challenge.changecurrent.j jVar) {
            jVar.getClass();
            this.viewModel = jVar;
            return this;
        }
    }

    public static final class SetCurrentAccountComponentImpl implements com.yandex.passport.internal.ui.challenge.changecurrent.f {
        rzm challengeDataProvider;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private final SetCurrentAccountComponentImpl setCurrentAccountComponentImpl = this;
        rzm setCurrentAccountModelProvider;
        rzm viewModelProvider;

        public SetCurrentAccountComponentImpl(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, com.yandex.passport.internal.ui.challenge.n nVar, com.yandex.passport.internal.ui.challenge.changecurrent.j jVar) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            initialize(nVar, jVar);
        }

        private void initialize(com.yandex.passport.internal.ui.challenge.n nVar, com.yandex.passport.internal.ui.challenge.changecurrent.j jVar) {
            this.challengeDataProvider = toe.a(nVar);
            toe a = toe.a(jVar);
            this.viewModelProvider = a;
            rzm rzmVar = this.challengeDataProvider;
            PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl = this.passportProcessGlobalComponentImpl;
            this.setCurrentAccountModelProvider = new com.yandex.passport.data.network.n(rzmVar, a, passportProcessGlobalComponentImpl.challengeHelperProvider, passportProcessGlobalComponentImpl.setCurrentAccountUseCaseProvider, passportProcessGlobalComponentImpl.currentAccountManagerProvider, 23, false);
        }

        @Override // com.yandex.passport.internal.ui.challenge.changecurrent.f
        public szm getSessionProvider() {
            return this.setCurrentAccountModelProvider;
        }
    }

    public static final class SetCurrentComposeComponentBuilder implements com.yandex.passport.internal.ui.challenge.changecurrent.m {
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private com.yandex.passport.internal.ui.challenge.changecurrent.i setProperties;

        private SetCurrentComposeComponentBuilder(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
        }

        @Override // com.yandex.passport.internal.ui.challenge.changecurrent.m
        public com.yandex.passport.internal.ui.challenge.changecurrent.n build() {
            a4g.q(com.yandex.passport.internal.ui.challenge.changecurrent.i.class, this.setProperties);
            return new SetCurrentComposeComponentImpl(this.passportProcessGlobalComponentImpl, new com.yandex.passport.internal.ui.common.e(), this.setProperties);
        }

        @Override // com.yandex.passport.internal.ui.challenge.changecurrent.m
        public SetCurrentComposeComponentBuilder setProperties(com.yandex.passport.internal.ui.challenge.changecurrent.i iVar) {
            iVar.getClass();
            this.setProperties = iVar;
            return this;
        }
    }

    public static final class SetCurrentComposeComponentImpl implements com.yandex.passport.internal.ui.challenge.changecurrent.n {
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private final SetCurrentComposeComponentImpl setCurrentComposeComponentImpl = this;
        private final com.yandex.passport.internal.ui.challenge.changecurrent.i setProperties;
        private final com.yandex.passport.internal.ui.common.e storeFactoryModule;

        public SetCurrentComposeComponentImpl(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, com.yandex.passport.internal.ui.common.e eVar, com.yandex.passport.internal.ui.challenge.changecurrent.i iVar) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            this.storeFactoryModule = eVar;
            this.setProperties = iVar;
        }

        public com.yandex.passport.internal.ui.challenge.m challengeChecker() {
            return new com.yandex.passport.internal.ui.challenge.m((com.yandex.passport.internal.ui.challenge.s) this.passportProcessGlobalComponentImpl.challengeHelperProvider.get());
        }

        @Override // com.yandex.passport.internal.ui.challenge.changecurrent.n
        public com.yandex.passport.internal.analytics.o0 getEventReporter() {
            return (com.yandex.passport.internal.analytics.o0) this.passportProcessGlobalComponentImpl.provideEventReporterProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.challenge.changecurrent.n
        public com.yandex.passport.internal.ui.common.web.d getUrlChecker() {
            return new com.yandex.passport.internal.ui.common.web.d(this.passportProcessGlobalComponentImpl.urlChecker());
        }

        @Override // com.yandex.passport.internal.ui.challenge.changecurrent.n
        public com.yandex.passport.internal.ui.challenge.changecurrent.q getViewModelFactory() {
            return new com.yandex.passport.internal.ui.challenge.changecurrent.q(setCurrentStoreFactory());
        }

        public com.yandex.passport.internal.ui.challenge.changecurrent.g0 setCurrentStoreFactory() {
            return new com.yandex.passport.internal.ui.challenge.changecurrent.g0(com.yandex.passport.internal.ui.common.f.a(this.storeFactoryModule), challengeChecker(), (f2) this.passportProcessGlobalComponentImpl.setCurrentAccountUseCaseProvider.get(), (com.yandex.passport.internal.account.a) this.passportProcessGlobalComponentImpl.currentAccountManagerProvider.get(), this.setProperties);
        }
    }

    public static final class StandaloneSlothComponentImpl implements com.yandex.passport.internal.ui.sloth.s {
        rzm getActivityProvider;
        rzm getParametersProvider;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        rzm provideSlothUiSettingsProvider;
        rzm slothDebugInformationDelegateImplProvider;
        rzm slothNetworkStatusImplProvider;
        rzm slothSslErrorHandlerProvider;
        rzm slothStringRepositoryImplProvider;
        rzm slothUiDependenciesFactoryProvider;
        private final StandaloneSlothComponentImpl standaloneSlothComponentImpl = this;
        rzm standaloneSlothSlabProvider;
        rzm standaloneSlothUiProvider;
        rzm standaloneWishConsumerProvider;

        public StandaloneSlothComponentImpl(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, com.yandex.passport.internal.ui.sloth.a0 a0Var) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            initialize(a0Var);
        }

        private void initialize(com.yandex.passport.internal.ui.sloth.a0 a0Var) {
            rzm b = t8a.b(new com.yandex.passport.internal.ui.sloth.b0(a0Var, 0));
            this.getActivityProvider = b;
            com.yandex.passport.common.coroutine.d dVar = new com.yandex.passport.common.coroutine.d(13);
            this.slothStringRepositoryImplProvider = dVar;
            PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl = this.passportProcessGlobalComponentImpl;
            com.yandex.passport.internal.ui.bouncer.sloth.i iVar = new com.yandex.passport.internal.ui.bouncer.sloth.i(passportProcessGlobalComponentImpl.provideDebugInfoUtilProvider, 9);
            this.slothDebugInformationDelegateImplProvider = iVar;
            rzm rzmVar = passportProcessGlobalComponentImpl.provideCoroutineScopesProvider;
            h1 h1Var = new h1(b, rzmVar, 7);
            this.slothNetworkStatusImplProvider = h1Var;
            com.yandex.passport.internal.ui.bouncer.sloth.i iVar2 = new com.yandex.passport.internal.ui.bouncer.sloth.i(passportProcessGlobalComponentImpl.setApplicationContextProvider, 10);
            this.slothSslErrorHandlerProvider = iVar2;
            this.slothUiDependenciesFactoryProvider = new com.yandex.passport.internal.ui.sloth.i(b, dVar, rzmVar, iVar, h1Var, passportProcessGlobalComponentImpl.applicationDetailsProviderImplProvider, iVar2, passportProcessGlobalComponentImpl.slothUrlProviderImplProvider, 0);
            this.standaloneWishConsumerProvider = t8a.b(new com.yandex.passport.internal.ui.bouncer.sloth.i(b, 13));
            rzm b2 = t8a.b(new k(a0Var, this.passportProcessGlobalComponentImpl.setPropertiesProvider, 8));
            this.provideSlothUiSettingsProvider = b2;
            rzm b3 = t8a.b(new com.yandex.passport.internal.ui.common.c(this.slothUiDependenciesFactoryProvider, this.standaloneWishConsumerProvider, b2, 2));
            this.standaloneSlothSlabProvider = b3;
            this.standaloneSlothUiProvider = t8a.b(new com.yandex.passport.internal.ui.bouncer.sloth.i(b3, 12));
            this.getParametersProvider = t8a.b(new com.yandex.passport.internal.ui.sloth.b0(a0Var, 1));
        }

        @Override // com.yandex.passport.internal.ui.sloth.s
        public m getParams() {
            return (m) this.getParametersProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.sloth.s
        public com.yandex.passport.internal.ui.sloth.f0 getUi() {
            return (com.yandex.passport.internal.ui.sloth.f0) this.standaloneSlothUiProvider.get();
        }
    }

    public static final class StandaloneSlothComposeComponentBuilder implements com.yandex.passport.internal.ui.sloth.v {
        private Activity activity;
        private m params;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private com.yandex.passport.common.ui.progress.g progressProperties;

        private StandaloneSlothComposeComponentBuilder(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
        }

        @Override // com.yandex.passport.internal.ui.sloth.v
        public StandaloneSlothComposeComponentBuilder activity(Activity activity) {
            activity.getClass();
            this.activity = activity;
            return this;
        }

        @Override // com.yandex.passport.internal.ui.sloth.v
        public com.yandex.passport.internal.ui.sloth.w build() {
            a4g.q(m.class, this.params);
            a4g.q(com.yandex.passport.common.ui.progress.g.class, this.progressProperties);
            a4g.q(Activity.class, this.activity);
            return new StandaloneSlothComposeComponentImpl(this.passportProcessGlobalComponentImpl, new com.yandex.passport.internal.ui.sloth.x(), this.params, this.progressProperties, this.activity);
        }

        @Override // com.yandex.passport.internal.ui.sloth.v
        public StandaloneSlothComposeComponentBuilder params(m mVar) {
            mVar.getClass();
            this.params = mVar;
            return this;
        }

        @Override // com.yandex.passport.internal.ui.sloth.v
        public StandaloneSlothComposeComponentBuilder progressProperties(com.yandex.passport.common.ui.progress.g gVar) {
            gVar.getClass();
            this.progressProperties = gVar;
            return this;
        }
    }

    public static final class StandaloneSlothComposeComponentImpl implements com.yandex.passport.internal.ui.sloth.w {
        private final Activity activity;
        private final m params;
        rzm paramsProvider;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private final com.yandex.passport.common.ui.progress.g progressProperties;
        rzm provideSlothDependenciesProvider;
        rzm provideSlothSessionProvider;
        private final StandaloneSlothComposeComponentImpl standaloneSlothComposeComponentImpl = this;
        private final com.yandex.passport.internal.ui.sloth.x standaloneSlothComposeModule;

        public StandaloneSlothComposeComponentImpl(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, com.yandex.passport.internal.ui.sloth.x xVar, m mVar, com.yandex.passport.common.ui.progress.g gVar, Activity activity) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            this.standaloneSlothComposeModule = xVar;
            this.activity = activity;
            this.progressProperties = gVar;
            this.params = mVar;
            initialize(xVar, mVar, gVar, activity);
        }

        private void initialize(com.yandex.passport.internal.ui.sloth.x xVar, m mVar, com.yandex.passport.common.ui.progress.g gVar, Activity activity) {
            this.paramsProvider = toe.a(mVar);
            rzm b = t8a.b(new k(xVar, this.passportProcessGlobalComponentImpl.slothDependenciesFactoryProvider, 7));
            this.provideSlothDependenciesProvider = b;
            this.provideSlothSessionProvider = t8a.b(new d0(xVar, this.paramsProvider, b, this.passportProcessGlobalComponentImpl.slothStandalonePerformConfigurationProvider, 23));
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.common.common.a getApplicationDetailsProvider() {
            return (com.yandex.passport.common.common.a) this.passportProcessGlobalComponentImpl.bindApplicationDetailsProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.common.ui.progress.g getProgressProperties() {
            return this.progressProperties;
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.g getSlothComposeUIReporter() {
            com.yandex.passport.internal.ui.sloth.x xVar = this.standaloneSlothComposeModule;
            com.yandex.passport.internal.ui.sloth.c slothComposeUiReporterImpl = slothComposeUiReporterImpl();
            xVar.getClass();
            slothComposeUiReporterImpl.getClass();
            return slothComposeUiReporterImpl;
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.dependencies.d getSlothDebugInformationDelegate() {
            com.yandex.passport.internal.ui.sloth.x xVar = this.standaloneSlothComposeModule;
            com.yandex.passport.internal.ui.sloth.d slothDebugInformationDelegateImpl = slothDebugInformationDelegateImpl();
            xVar.getClass();
            slothDebugInformationDelegateImpl.getClass();
            return slothDebugInformationDelegateImpl;
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.l getSlothNetworkStatus() {
            com.yandex.passport.internal.ui.sloth.x xVar = this.standaloneSlothComposeModule;
            com.yandex.passport.internal.sloth.n slothNetworkStatusImpl = slothNetworkStatusImpl();
            xVar.getClass();
            slothNetworkStatusImpl.getClass();
            return slothNetworkStatusImpl;
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.a1 getSlothUiInteractor() {
            com.yandex.passport.internal.ui.sloth.x xVar = this.standaloneSlothComposeModule;
            com.yandex.passport.sloth.d1 d1Var = (com.yandex.passport.sloth.d1) this.provideSlothSessionProvider.get();
            xVar.getClass();
            d1Var.getClass();
            return d1Var.j;
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.dependencies.i getSlothUrlProvider() {
            com.yandex.passport.internal.ui.sloth.x xVar = this.standaloneSlothComposeModule;
            com.yandex.passport.sloth.dependencies.b bVar = (com.yandex.passport.sloth.dependencies.b) this.provideSlothDependenciesProvider.get();
            xVar.getClass();
            bVar.getClass();
            com.yandex.passport.sloth.dependencies.i iVar = bVar.d;
            a4g.t(iVar);
            return iVar;
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public o0 getSlothVariant() {
            com.yandex.passport.internal.ui.sloth.x xVar = this.standaloneSlothComposeModule;
            m mVar = this.params;
            xVar.getClass();
            mVar.getClass();
            o0 o0Var = mVar.a;
            a4g.t(o0Var);
            return o0Var;
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.dependencies.p getSlothWebViewSettings() {
            this.standaloneSlothComposeModule.getClass();
            return new com.yandex.passport.internal.ui.sloth.j();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public q getSlothWishConsumer() {
            com.yandex.passport.internal.ui.sloth.x xVar = this.standaloneSlothComposeModule;
            com.yandex.passport.internal.ui.sloth.k slothWishConsumerImpl = slothWishConsumerImpl();
            xVar.getClass();
            slothWishConsumerImpl.getClass();
            return slothWishConsumerImpl;
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.string.b getStringRepository() {
            com.yandex.passport.internal.ui.sloth.x xVar = this.standaloneSlothComposeModule;
            com.yandex.passport.internal.ui.sloth.g slothStringRepositoryImpl = slothStringRepositoryImpl();
            xVar.getClass();
            slothStringRepositoryImpl.getClass();
            return slothStringRepositoryImpl;
        }

        @Override // com.yandex.passport.internal.ui.sloth.w
        public com.yandex.passport.internal.ui.sloth.y getViewModelFactory() {
            return new com.yandex.passport.internal.ui.sloth.y((com.yandex.passport.sloth.d1) this.provideSlothSessionProvider.get());
        }

        @Override // com.yandex.passport.internal.ui.sloth.w
        public o1 getWebAmReporter() {
            return (o1) this.passportProcessGlobalComponentImpl.webAmReporterProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public agv getWebViewSslErrorHandler() {
            com.yandex.passport.internal.ui.sloth.x xVar = this.standaloneSlothComposeModule;
            Context context = this.passportProcessGlobalComponentImpl.setApplicationContext;
            xVar.getClass();
            context.getClass();
            return new com.yandex.passport.internal.ui.sloth.e(context);
        }

        @Override // com.yandex.passport.internal.ui.sloth.w
        public boolean isWhiteLabel() {
            return this.passportProcessGlobalComponentImpl.whiteLabelBoolean();
        }

        public com.yandex.passport.internal.ui.sloth.c slothComposeUiReporterImpl() {
            return new com.yandex.passport.internal.ui.sloth.c(this.passportProcessGlobalComponentImpl.getSlothReportDelegate());
        }

        public com.yandex.passport.internal.ui.sloth.d slothDebugInformationDelegateImpl() {
            return new com.yandex.passport.internal.ui.sloth.d((com.yandex.passport.internal.util.d) this.passportProcessGlobalComponentImpl.provideDebugInfoUtilProvider.get());
        }

        public com.yandex.passport.internal.sloth.n slothNetworkStatusImpl() {
            return new com.yandex.passport.internal.sloth.n(this.activity, (com.yandex.passport.common.coroutine.e) this.passportProcessGlobalComponentImpl.provideCoroutineScopesProvider.get());
        }

        public com.yandex.passport.internal.ui.sloth.g slothStringRepositoryImpl() {
            return new com.yandex.passport.internal.ui.sloth.g(new com.yandex.passport.internal.ui.e());
        }

        public com.yandex.passport.internal.ui.sloth.k slothWishConsumerImpl() {
            return new com.yandex.passport.internal.ui.sloth.k(this.activity);
        }
    }

    public static final class UserMenuActivityComponentImpl implements com.yandex.passport.internal.ui.sloth.menu.e {
        rzm baseSlothUiSettingsProvider;
        rzm getActivityProvider;
        rzm getProgressPropertiesProvider;
        rzm getPropertiesProvider;
        rzm getStringRepositoryProvider;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        rzm provideUserMenuRequestsProcessorProvider;
        rzm slothDebugInformationDelegateImplProvider;
        rzm slothNetworkStatusImplProvider;
        rzm slothSslErrorHandlerProvider;
        rzm slothStringRepositoryImplProvider;
        private final UserMenuActivityComponentImpl userMenuActivityComponentImpl = this;
        rzm userMenuActivityUiProvider;
        rzm userMenuMessageMapperProvider;
        rzm userMenuSlothDependenciesFactoryProvider;
        rzm userMenuSlothSlabProvider;
        rzm userMenuUiControllerProvider;
        rzm userMenuWishConsumerProvider;

        public UserMenuActivityComponentImpl(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, com.yandex.passport.internal.ui.sloth.menu.f fVar) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            initialize(fVar);
        }

        private void initialize(com.yandex.passport.internal.ui.sloth.menu.f fVar) {
            rzm b = t8a.b(new com.yandex.passport.internal.ui.sloth.menu.g(fVar, 0));
            this.getActivityProvider = b;
            com.yandex.passport.common.coroutine.d dVar = new com.yandex.passport.common.coroutine.d(13);
            this.slothStringRepositoryImplProvider = dVar;
            PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl = this.passportProcessGlobalComponentImpl;
            com.yandex.passport.internal.ui.bouncer.sloth.i iVar = new com.yandex.passport.internal.ui.bouncer.sloth.i(passportProcessGlobalComponentImpl.provideDebugInfoUtilProvider, 9);
            this.slothDebugInformationDelegateImplProvider = iVar;
            rzm rzmVar = passportProcessGlobalComponentImpl.provideCoroutineScopesProvider;
            h1 h1Var = new h1(b, rzmVar, 7);
            this.slothNetworkStatusImplProvider = h1Var;
            com.yandex.passport.internal.ui.bouncer.sloth.i iVar2 = new com.yandex.passport.internal.ui.bouncer.sloth.i(passportProcessGlobalComponentImpl.setApplicationContextProvider, 10);
            this.slothSslErrorHandlerProvider = iVar2;
            this.userMenuSlothDependenciesFactoryProvider = new com.yandex.passport.internal.ui.sloth.i(b, dVar, rzmVar, iVar, h1Var, passportProcessGlobalComponentImpl.applicationDetailsProviderImplProvider, iVar2, passportProcessGlobalComponentImpl.slothUrlProviderImplProvider, 1);
            rzm b2 = t8a.b(new com.yandex.passport.internal.ui.sloth.menu.g(fVar, 1));
            this.getProgressPropertiesProvider = b2;
            this.baseSlothUiSettingsProvider = t8a.b(new com.yandex.passport.internal.ui.bouncer.roundabout.d(b2, this.passportProcessGlobalComponentImpl.setPropertiesProvider, 5));
            rzm b3 = t8a.b(new com.yandex.passport.internal.ui.bouncer.sloth.i(this.getActivityProvider, 16));
            this.userMenuWishConsumerProvider = b3;
            this.userMenuSlothSlabProvider = t8a.b(new com.yandex.passport.internal.ui.common.c(this.userMenuSlothDependenciesFactoryProvider, this.baseSlothUiSettingsProvider, b3, 4));
            rzm b4 = t8a.b(new com.yandex.passport.internal.ui.sloth.menu.h(fVar, this.slothStringRepositoryImplProvider, 0));
            this.getStringRepositoryProvider = b4;
            rzm b5 = t8a.b(new com.yandex.passport.internal.ui.common.c(this.userMenuSlothSlabProvider, this.getActivityProvider, b4, 3));
            this.userMenuActivityUiProvider = b5;
            this.userMenuUiControllerProvider = t8a.b(new com.yandex.passport.internal.ui.bouncer.roundabout.d(b5, this.getStringRepositoryProvider, 8));
            rzm b6 = t8a.b(com.yandex.passport.internal.ui.sloth.menu.k.a);
            this.userMenuMessageMapperProvider = b6;
            this.provideUserMenuRequestsProcessorProvider = t8a.b(new com.yandex.passport.internal.ui.sloth.menu.h(fVar, b6, 1));
            this.getPropertiesProvider = t8a.b(new com.yandex.passport.internal.ui.sloth.menu.g(fVar, 2));
        }

        @Override // com.yandex.passport.internal.ui.sloth.menu.e
        public com.yandex.passport.internal.ui.sloth.menu.p getUiController() {
            return (com.yandex.passport.internal.ui.sloth.menu.p) this.userMenuUiControllerProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.sloth.menu.e
        public com.yandex.passport.internal.properties.j0 getUserMenuProperties() {
            return (com.yandex.passport.internal.properties.j0) this.getPropertiesProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.sloth.menu.e
        public com.yandex.passport.internal.ui.sloth.menu.l getUserMenuRequestsProcessor() {
            return (com.yandex.passport.internal.ui.sloth.menu.l) this.provideUserMenuRequestsProcessorProvider.get();
        }
    }

    public static final class WebCardComposeComponentBuilder implements com.yandex.passport.internal.ui.sloth.webcard.e {
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private Activity setActivity;
        private com.yandex.passport.internal.ui.sloth.webcard.l0 setInputParams;

        private WebCardComposeComponentBuilder(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
        }

        @Override // com.yandex.passport.internal.ui.sloth.webcard.e
        public com.yandex.passport.internal.ui.sloth.webcard.f build() {
            a4g.q(com.yandex.passport.internal.ui.sloth.webcard.l0.class, this.setInputParams);
            a4g.q(Activity.class, this.setActivity);
            return new WebCardComposeComponentImpl(this.passportProcessGlobalComponentImpl, new com.yandex.passport.internal.ui.common.e(), new com.yandex.passport.internal.ui.sloth.webcard.g(), this.setInputParams, this.setActivity);
        }

        @Override // com.yandex.passport.internal.ui.sloth.webcard.e
        public WebCardComposeComponentBuilder setActivity(Activity activity) {
            activity.getClass();
            this.setActivity = activity;
            return this;
        }

        @Override // com.yandex.passport.internal.ui.sloth.webcard.e
        public WebCardComposeComponentBuilder setInputParams(com.yandex.passport.internal.ui.sloth.webcard.l0 l0Var) {
            l0Var.getClass();
            this.setInputParams = l0Var;
            return this;
        }
    }

    public static final class WebCardComposeComponentImpl implements com.yandex.passport.internal.ui.sloth.webcard.f {
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        rzm providePerformConfigurationProvider;
        rzm setActivityProvider;
        private final com.yandex.passport.internal.ui.sloth.webcard.l0 setInputParams;
        private final com.yandex.passport.internal.ui.common.e storeFactoryModule;
        private final WebCardComposeComponentImpl webCardComposeComponentImpl = this;
        private final com.yandex.passport.internal.ui.sloth.webcard.g webCardComposeModule;

        public WebCardComposeComponentImpl(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, com.yandex.passport.internal.ui.common.e eVar, com.yandex.passport.internal.ui.sloth.webcard.g gVar, com.yandex.passport.internal.ui.sloth.webcard.l0 l0Var, Activity activity) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            this.storeFactoryModule = eVar;
            this.setInputParams = l0Var;
            this.webCardComposeModule = gVar;
            initialize(eVar, gVar, l0Var, activity);
        }

        private void initialize(com.yandex.passport.internal.ui.common.e eVar, com.yandex.passport.internal.ui.sloth.webcard.g gVar, com.yandex.passport.internal.ui.sloth.webcard.l0 l0Var, Activity activity) {
            this.providePerformConfigurationProvider = new k(gVar, this.passportProcessGlobalComponentImpl.slothWebCardPerformConfigurationProvider, 18);
            this.setActivityProvider = toe.a(activity);
        }

        @Override // com.yandex.passport.internal.ui.sloth.webcard.f
        public com.yandex.passport.common.ui.progress.g getProgressProperties() {
            this.webCardComposeModule.getClass();
            com.yandex.passport.common.ui.progress.g gVar = com.yandex.passport.common.ui.progress.g.e;
            a4g.t(gVar);
            return gVar;
        }

        public com.yandex.passport.sloth.dependencies.g getSlothPerformConfiguration() {
            com.yandex.passport.internal.ui.sloth.webcard.g gVar = this.webCardComposeModule;
            com.yandex.passport.internal.ui.sloth.webcard.b bVar = (com.yandex.passport.internal.ui.sloth.webcard.b) this.passportProcessGlobalComponentImpl.slothWebCardPerformConfigurationProvider.get();
            gVar.getClass();
            bVar.getClass();
            return new com.yandex.passport.sloth.dependencies.g(t75.c(bVar.a));
        }

        @Override // com.yandex.passport.internal.ui.sloth.webcard.f
        public com.yandex.passport.internal.ui.sloth.screen.e getSlothScreenComponentBuilder() {
            return new cypiuss3_SlothScreenComponentBuilder(this.passportProcessGlobalComponentImpl, this.webCardComposeComponentImpl);
        }

        @Override // com.yandex.passport.internal.ui.sloth.webcard.f
        public com.yandex.passport.internal.ui.sloth.webcard.b0 getViewModelFactory() {
            return new com.yandex.passport.internal.ui.sloth.webcard.b0(webCardComposeStoreFactory());
        }

        @Override // com.yandex.passport.internal.ui.sloth.webcard.f
        public boolean isWhiteLabel() {
            return this.passportProcessGlobalComponentImpl.whiteLabelBoolean();
        }

        public e2 selectPushPictureUseCase() {
            return new e2((com.yandex.passport.common.coroutine.a) this.passportProcessGlobalComponentImpl.provideCoroutineDispatchersProvider.get(), (com.yandex.passport.internal.helper.f) this.passportProcessGlobalComponentImpl.deviceAuthorizationHelperProvider.get());
        }

        public com.yandex.passport.internal.ui.sloth.webcard.x webCardComposeStoreFactory() {
            return new com.yandex.passport.internal.ui.sloth.webcard.x(com.yandex.passport.internal.ui.common.f.a(this.storeFactoryModule), (com.yandex.passport.internal.sloth.performers.webcard.g) this.passportProcessGlobalComponentImpl.webCardEventSenderProvider.get(), (com.yandex.passport.internal.report.reporters.r1) this.passportProcessGlobalComponentImpl.webCardReporterProvider.get(), this.setInputParams, (o1) this.passportProcessGlobalComponentImpl.webAmReporterProvider.get(), (com.yandex.passport.internal.push.m) this.passportProcessGlobalComponentImpl.notificationHelperProvider.get(), selectPushPictureUseCase());
        }
    }

    public static final class WebCardSlothComponentImpl implements com.yandex.passport.internal.ui.sloth.webcard.w0 {
        rzm getActivityProvider;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        rzm provideInputParamsProvider;
        rzm provideSlothUiSettingsProvider;
        rzm slothDebugInformationDelegateImplProvider;
        rzm slothNetworkStatusImplProvider;
        rzm slothSslErrorHandlerProvider;
        rzm slothStringRepositoryImplProvider;
        rzm slothUiDependenciesFactoryProvider;
        rzm standaloneWishConsumerProvider;
        private final WebCardSlothComponentImpl webCardSlothComponentImpl = this;
        private final com.yandex.passport.internal.ui.sloth.webcard.x0 webCardSlothModule;
        rzm webCardSlothSlabProvider;
        rzm webCardSlothUiProvider;

        public WebCardSlothComponentImpl(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, com.yandex.passport.internal.ui.sloth.webcard.x0 x0Var) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            this.webCardSlothModule = x0Var;
            initialize(x0Var);
        }

        private void initialize(com.yandex.passport.internal.ui.sloth.webcard.x0 x0Var) {
            rzm b = t8a.b(new com.yandex.passport.internal.ui.sloth.webcard.y0(x0Var, 0));
            this.getActivityProvider = b;
            com.yandex.passport.common.coroutine.d dVar = new com.yandex.passport.common.coroutine.d(13);
            this.slothStringRepositoryImplProvider = dVar;
            PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl = this.passportProcessGlobalComponentImpl;
            com.yandex.passport.internal.ui.bouncer.sloth.i iVar = new com.yandex.passport.internal.ui.bouncer.sloth.i(passportProcessGlobalComponentImpl.provideDebugInfoUtilProvider, 9);
            this.slothDebugInformationDelegateImplProvider = iVar;
            rzm rzmVar = passportProcessGlobalComponentImpl.provideCoroutineScopesProvider;
            h1 h1Var = new h1(b, rzmVar, 7);
            this.slothNetworkStatusImplProvider = h1Var;
            com.yandex.passport.internal.ui.bouncer.sloth.i iVar2 = new com.yandex.passport.internal.ui.bouncer.sloth.i(passportProcessGlobalComponentImpl.setApplicationContextProvider, 10);
            this.slothSslErrorHandlerProvider = iVar2;
            this.slothUiDependenciesFactoryProvider = new com.yandex.passport.internal.ui.sloth.i(b, dVar, rzmVar, iVar, h1Var, passportProcessGlobalComponentImpl.applicationDetailsProviderImplProvider, iVar2, passportProcessGlobalComponentImpl.slothUrlProviderImplProvider, 0);
            rzm b2 = t8a.b(new com.yandex.passport.internal.ui.bouncer.sloth.i(b, 13));
            this.standaloneWishConsumerProvider = b2;
            com.yandex.passport.internal.ui.sloth.webcard.y0 y0Var = new com.yandex.passport.internal.ui.sloth.webcard.y0(x0Var, 1);
            this.provideInputParamsProvider = y0Var;
            k kVar = new k(x0Var, y0Var, 19);
            this.provideSlothUiSettingsProvider = kVar;
            rzm b3 = t8a.b(new com.yandex.passport.internal.badges.f(this.slothUiDependenciesFactoryProvider, b2, (rzm) kVar, 7));
            this.webCardSlothSlabProvider = b3;
            this.webCardSlothUiProvider = t8a.b(new com.yandex.passport.internal.ui.bouncer.roundabout.d(this.getActivityProvider, b3, 9));
        }

        @Override // com.yandex.passport.internal.ui.sloth.webcard.w0
        public com.yandex.passport.internal.ui.sloth.webcard.e1 getUi() {
            return (com.yandex.passport.internal.ui.sloth.webcard.e1) this.webCardSlothUiProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.sloth.webcard.w0
        public com.yandex.passport.internal.ui.sloth.webcard.g1 getViewModelFactory() {
            com.yandex.passport.internal.ui.sloth.webcard.l0 l0Var = this.webCardSlothModule.b;
            a4g.t(l0Var);
            return new com.yandex.passport.internal.ui.sloth.webcard.g1(l0Var, slothSessionFactory(), (com.yandex.passport.internal.push.m) this.passportProcessGlobalComponentImpl.notificationHelperProvider.get(), (com.yandex.passport.internal.sloth.performers.webcard.g) this.passportProcessGlobalComponentImpl.webCardEventSenderProvider.get(), (com.yandex.passport.internal.report.reporters.r1) this.passportProcessGlobalComponentImpl.webCardReporterProvider.get(), selectPushPictureUseCase());
        }

        @Override // com.yandex.passport.internal.ui.sloth.webcard.w0
        public o1 getWebAmReporter() {
            return (o1) this.passportProcessGlobalComponentImpl.webAmReporterProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.sloth.webcard.w0
        public com.yandex.passport.internal.report.reporters.r1 getWebCardReporter() {
            return (com.yandex.passport.internal.report.reporters.r1) this.passportProcessGlobalComponentImpl.webCardReporterProvider.get();
        }

        public e2 selectPushPictureUseCase() {
            return new e2((com.yandex.passport.common.coroutine.a) this.passportProcessGlobalComponentImpl.provideCoroutineDispatchersProvider.get(), (com.yandex.passport.internal.helper.f) this.passportProcessGlobalComponentImpl.deviceAuthorizationHelperProvider.get());
        }

        public com.yandex.passport.internal.ui.sloth.webcard.a slothSessionFactory() {
            com.yandex.passport.internal.ui.sloth.webcard.x0 x0Var = this.webCardSlothModule;
            com.yandex.passport.internal.ui.sloth.webcard.b bVar = (com.yandex.passport.internal.ui.sloth.webcard.b) this.passportProcessGlobalComponentImpl.slothWebCardPerformConfigurationProvider.get();
            com.yandex.passport.internal.sloth.k kVar = (com.yandex.passport.internal.sloth.k) this.passportProcessGlobalComponentImpl.slothDependenciesFactoryProvider.get();
            x0Var.getClass();
            bVar.getClass();
            kVar.getClass();
            return new com.yandex.passport.common.network.n(18, bVar, kVar);
        }
    }

    public static final class cypiuss2_SlothScreenComponentImpl implements com.yandex.passport.internal.ui.sloth.screen.f {
        private final cypiuss2_SlothScreenComponentImpl _cypiuss2_SlothScreenComponentImpl = this;
        private final ManagingPlusDevicesComponentImpl managingPlusDevicesComponentImpl;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        rzm provideDebugInformationDelegateProvider;
        rzm provideSlothComposeUiReporterProvider;
        rzm provideSlothDependenciesProvider;
        rzm provideSlothNetworkStatusProvider;
        rzm provideSlothSSLErrorHandlerProvider;
        rzm provideSlothSessionProvider;
        rzm provideSlothUiInteractorProvider;
        rzm provideSlothUrlProvider;
        rzm provideSlothVariantProvider;
        rzm provideSlothWebViewSettingsProvider;
        rzm provideStringRepositoryProvider;
        rzm provideWishConsumerProvider;
        rzm setOnSlothUiWishProvider;
        rzm setSlothHeadersProvider;
        rzm setSlothParamsProvider;
        rzm slothComposeUiReporterImplProvider;
        rzm slothDebugInformationDelegateImplProvider;
        rzm slothNetworkStatusImplProvider;
        rzm slothStringRepositoryImplProvider;

        public cypiuss2_SlothScreenComponentImpl(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, ManagingPlusDevicesComponentImpl managingPlusDevicesComponentImpl, com.yandex.passport.internal.ui.sloth.screen.b bVar, m mVar, Map<String, String> map, Function1<? super com.yandex.passport.sloth.ui.e1, Unit> function1) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            this.managingPlusDevicesComponentImpl = managingPlusDevicesComponentImpl;
            initialize(bVar, mVar, map, function1);
        }

        private void initialize(com.yandex.passport.internal.ui.sloth.screen.b bVar, m mVar, Map<String, String> map, Function1<? super com.yandex.passport.sloth.ui.e1, Unit> function1) {
            this.setSlothParamsProvider = toe.a(mVar);
            rzm b = t8a.b(new com.yandex.passport.internal.ui.sloth.screen.c(bVar, this.passportProcessGlobalComponentImpl.slothDependenciesFactoryProvider, 0));
            this.provideSlothDependenciesProvider = b;
            rzm b2 = t8a.b(new d0(bVar, this.setSlothParamsProvider, b, this.managingPlusDevicesComponentImpl.providePerformConfigurationProvider, 24));
            this.provideSlothSessionProvider = b2;
            this.provideSlothUiInteractorProvider = t8a.b(new com.yandex.passport.internal.ui.sloth.screen.c(bVar, b2, 2));
            toe a = toe.a(map);
            this.setSlothHeadersProvider = a;
            this.provideSlothWebViewSettingsProvider = t8a.b(new com.yandex.passport.internal.ui.sloth.screen.d(bVar, a, 0));
            this.provideSlothSSLErrorHandlerProvider = t8a.b(new com.yandex.passport.internal.ui.sloth.screen.c(bVar, this.passportProcessGlobalComponentImpl.setApplicationContextProvider, 1));
            this.provideSlothUrlProvider = t8a.b(new com.yandex.passport.internal.ui.sloth.screen.c(bVar, this.provideSlothDependenciesProvider, 3));
            toe a2 = toe.a(function1);
            this.setOnSlothUiWishProvider = a2;
            this.provideWishConsumerProvider = t8a.b(new com.yandex.passport.internal.ui.sloth.screen.d(bVar, a2, 1));
            com.yandex.passport.common.coroutine.d dVar = new com.yandex.passport.common.coroutine.d(13);
            this.slothStringRepositoryImplProvider = dVar;
            this.provideStringRepositoryProvider = t8a.b(new k(bVar, dVar, 16));
            com.yandex.passport.internal.ui.bouncer.sloth.i iVar = new com.yandex.passport.internal.ui.bouncer.sloth.i(this.passportProcessGlobalComponentImpl.provideDebugInfoUtilProvider, 9);
            this.slothDebugInformationDelegateImplProvider = iVar;
            this.provideDebugInformationDelegateProvider = t8a.b(new k(bVar, iVar, 13));
            h1 h1Var = new h1(this.managingPlusDevicesComponentImpl.setActivityProvider, this.passportProcessGlobalComponentImpl.provideCoroutineScopesProvider, 7);
            this.slothNetworkStatusImplProvider = h1Var;
            this.provideSlothNetworkStatusProvider = t8a.b(new k(bVar, h1Var, 15));
            this.provideSlothVariantProvider = t8a.b(new com.yandex.passport.internal.ui.sloth.screen.c(bVar, this.setSlothParamsProvider, 4));
            com.yandex.passport.internal.ui.bouncer.sloth.i iVar2 = new com.yandex.passport.internal.ui.bouncer.sloth.i(this.passportProcessGlobalComponentImpl.provideSlothReportDelegateProvider, 8);
            this.slothComposeUiReporterImplProvider = iVar2;
            this.provideSlothComposeUiReporterProvider = t8a.b(new k(bVar, iVar2, 14));
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.common.common.a getApplicationDetailsProvider() {
            return (com.yandex.passport.common.common.a) this.passportProcessGlobalComponentImpl.bindApplicationDetailsProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.common.ui.progress.g getProgressProperties() {
            return this.managingPlusDevicesComponentImpl.setProgressProperties;
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.g getSlothComposeUIReporter() {
            return (com.yandex.passport.sloth.ui.g) this.provideSlothComposeUiReporterProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.dependencies.d getSlothDebugInformationDelegate() {
            return (com.yandex.passport.sloth.ui.dependencies.d) this.provideDebugInformationDelegateProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.l getSlothNetworkStatus() {
            return (com.yandex.passport.sloth.ui.l) this.provideSlothNetworkStatusProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.a1 getSlothUiInteractor() {
            return (com.yandex.passport.sloth.ui.a1) this.provideSlothUiInteractorProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.dependencies.i getSlothUrlProvider() {
            return (com.yandex.passport.sloth.dependencies.i) this.provideSlothUrlProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public o0 getSlothVariant() {
            return (o0) this.provideSlothVariantProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.dependencies.p getSlothWebViewSettings() {
            return (com.yandex.passport.sloth.ui.dependencies.p) this.provideSlothWebViewSettingsProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public q getSlothWishConsumer() {
            return (q) this.provideWishConsumerProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.string.b getStringRepository() {
            return (com.yandex.passport.sloth.ui.string.b) this.provideStringRepositoryProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.sloth.screen.f
        public com.yandex.passport.internal.ui.sloth.screen.h getViewModelFactory() {
            return new com.yandex.passport.internal.ui.sloth.screen.h((com.yandex.passport.sloth.d1) this.provideSlothSessionProvider.get());
        }

        public o1 getWebAmReporter() {
            return (o1) this.passportProcessGlobalComponentImpl.webAmReporterProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public agv getWebViewSslErrorHandler() {
            return (agv) this.provideSlothSSLErrorHandlerProvider.get();
        }

        public boolean isWhiteLabel() {
            return this.passportProcessGlobalComponentImpl.whiteLabelBoolean();
        }
    }

    public static final class cypiuss3_SlothScreenComponentImpl implements com.yandex.passport.internal.ui.sloth.screen.f {
        private final cypiuss3_SlothScreenComponentImpl _cypiuss3_SlothScreenComponentImpl = this;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        rzm provideDebugInformationDelegateProvider;
        rzm provideSlothComposeUiReporterProvider;
        rzm provideSlothDependenciesProvider;
        rzm provideSlothNetworkStatusProvider;
        rzm provideSlothSSLErrorHandlerProvider;
        rzm provideSlothSessionProvider;
        rzm provideSlothUiInteractorProvider;
        rzm provideSlothUrlProvider;
        rzm provideSlothVariantProvider;
        rzm provideSlothWebViewSettingsProvider;
        rzm provideStringRepositoryProvider;
        rzm provideWishConsumerProvider;
        rzm setOnSlothUiWishProvider;
        rzm setSlothHeadersProvider;
        rzm setSlothParamsProvider;
        rzm slothComposeUiReporterImplProvider;
        rzm slothDebugInformationDelegateImplProvider;
        rzm slothNetworkStatusImplProvider;
        rzm slothStringRepositoryImplProvider;
        private final WebCardComposeComponentImpl webCardComposeComponentImpl;

        public cypiuss3_SlothScreenComponentImpl(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, WebCardComposeComponentImpl webCardComposeComponentImpl, com.yandex.passport.internal.ui.sloth.screen.b bVar, m mVar, Map<String, String> map, Function1<? super com.yandex.passport.sloth.ui.e1, Unit> function1) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            this.webCardComposeComponentImpl = webCardComposeComponentImpl;
            initialize(bVar, mVar, map, function1);
        }

        private void initialize(com.yandex.passport.internal.ui.sloth.screen.b bVar, m mVar, Map<String, String> map, Function1<? super com.yandex.passport.sloth.ui.e1, Unit> function1) {
            this.setSlothParamsProvider = toe.a(mVar);
            rzm b = t8a.b(new com.yandex.passport.internal.ui.sloth.screen.c(bVar, this.passportProcessGlobalComponentImpl.slothDependenciesFactoryProvider, 0));
            this.provideSlothDependenciesProvider = b;
            rzm b2 = t8a.b(new d0(bVar, this.setSlothParamsProvider, b, this.webCardComposeComponentImpl.providePerformConfigurationProvider, 24));
            this.provideSlothSessionProvider = b2;
            this.provideSlothUiInteractorProvider = t8a.b(new com.yandex.passport.internal.ui.sloth.screen.c(bVar, b2, 2));
            toe a = toe.a(map);
            this.setSlothHeadersProvider = a;
            this.provideSlothWebViewSettingsProvider = t8a.b(new com.yandex.passport.internal.ui.sloth.screen.d(bVar, a, 0));
            this.provideSlothSSLErrorHandlerProvider = t8a.b(new com.yandex.passport.internal.ui.sloth.screen.c(bVar, this.passportProcessGlobalComponentImpl.setApplicationContextProvider, 1));
            this.provideSlothUrlProvider = t8a.b(new com.yandex.passport.internal.ui.sloth.screen.c(bVar, this.provideSlothDependenciesProvider, 3));
            toe a2 = toe.a(function1);
            this.setOnSlothUiWishProvider = a2;
            this.provideWishConsumerProvider = t8a.b(new com.yandex.passport.internal.ui.sloth.screen.d(bVar, a2, 1));
            com.yandex.passport.common.coroutine.d dVar = new com.yandex.passport.common.coroutine.d(13);
            this.slothStringRepositoryImplProvider = dVar;
            this.provideStringRepositoryProvider = t8a.b(new k(bVar, dVar, 16));
            com.yandex.passport.internal.ui.bouncer.sloth.i iVar = new com.yandex.passport.internal.ui.bouncer.sloth.i(this.passportProcessGlobalComponentImpl.provideDebugInfoUtilProvider, 9);
            this.slothDebugInformationDelegateImplProvider = iVar;
            this.provideDebugInformationDelegateProvider = t8a.b(new k(bVar, iVar, 13));
            h1 h1Var = new h1(this.webCardComposeComponentImpl.setActivityProvider, this.passportProcessGlobalComponentImpl.provideCoroutineScopesProvider, 7);
            this.slothNetworkStatusImplProvider = h1Var;
            this.provideSlothNetworkStatusProvider = t8a.b(new k(bVar, h1Var, 15));
            this.provideSlothVariantProvider = t8a.b(new com.yandex.passport.internal.ui.sloth.screen.c(bVar, this.setSlothParamsProvider, 4));
            com.yandex.passport.internal.ui.bouncer.sloth.i iVar2 = new com.yandex.passport.internal.ui.bouncer.sloth.i(this.passportProcessGlobalComponentImpl.provideSlothReportDelegateProvider, 8);
            this.slothComposeUiReporterImplProvider = iVar2;
            this.provideSlothComposeUiReporterProvider = t8a.b(new k(bVar, iVar2, 14));
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.common.common.a getApplicationDetailsProvider() {
            return (com.yandex.passport.common.common.a) this.passportProcessGlobalComponentImpl.bindApplicationDetailsProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.common.ui.progress.g getProgressProperties() {
            this.webCardComposeComponentImpl.webCardComposeModule.getClass();
            com.yandex.passport.common.ui.progress.g gVar = com.yandex.passport.common.ui.progress.g.e;
            a4g.t(gVar);
            return gVar;
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.g getSlothComposeUIReporter() {
            return (com.yandex.passport.sloth.ui.g) this.provideSlothComposeUiReporterProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.dependencies.d getSlothDebugInformationDelegate() {
            return (com.yandex.passport.sloth.ui.dependencies.d) this.provideDebugInformationDelegateProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.l getSlothNetworkStatus() {
            return (com.yandex.passport.sloth.ui.l) this.provideSlothNetworkStatusProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.a1 getSlothUiInteractor() {
            return (com.yandex.passport.sloth.ui.a1) this.provideSlothUiInteractorProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.dependencies.i getSlothUrlProvider() {
            return (com.yandex.passport.sloth.dependencies.i) this.provideSlothUrlProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public o0 getSlothVariant() {
            return (o0) this.provideSlothVariantProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.dependencies.p getSlothWebViewSettings() {
            return (com.yandex.passport.sloth.ui.dependencies.p) this.provideSlothWebViewSettingsProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public q getSlothWishConsumer() {
            return (q) this.provideWishConsumerProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.string.b getStringRepository() {
            return (com.yandex.passport.sloth.ui.string.b) this.provideStringRepositoryProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.sloth.screen.f
        public com.yandex.passport.internal.ui.sloth.screen.h getViewModelFactory() {
            return new com.yandex.passport.internal.ui.sloth.screen.h((com.yandex.passport.sloth.d1) this.provideSlothSessionProvider.get());
        }

        public o1 getWebAmReporter() {
            return (o1) this.passportProcessGlobalComponentImpl.webAmReporterProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public agv getWebViewSslErrorHandler() {
            return (agv) this.provideSlothSSLErrorHandlerProvider.get();
        }

        public boolean isWhiteLabel() {
            return this.passportProcessGlobalComponentImpl.whiteLabelBoolean();
        }
    }

    public static final class cypiuss4_SlothScreenComponentImpl implements com.yandex.passport.internal.ui.sloth.screen.f {
        private final cypiuss4_SlothScreenComponentImpl _cypiuss4_SlothScreenComponentImpl = this;
        private final AuthSdkSlothComposeComponentImpl authSdkSlothComposeComponentImpl;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        rzm provideDebugInformationDelegateProvider;
        rzm provideSlothComposeUiReporterProvider;
        rzm provideSlothDependenciesProvider;
        rzm provideSlothNetworkStatusProvider;
        rzm provideSlothSSLErrorHandlerProvider;
        rzm provideSlothSessionProvider;
        rzm provideSlothUiInteractorProvider;
        rzm provideSlothUrlProvider;
        rzm provideSlothVariantProvider;
        rzm provideSlothWebViewSettingsProvider;
        rzm provideStringRepositoryProvider;
        rzm provideWishConsumerProvider;
        rzm setOnSlothUiWishProvider;
        rzm setSlothHeadersProvider;
        rzm setSlothParamsProvider;
        rzm slothComposeUiReporterImplProvider;
        rzm slothDebugInformationDelegateImplProvider;
        rzm slothNetworkStatusImplProvider;
        rzm slothStringRepositoryImplProvider;

        public cypiuss4_SlothScreenComponentImpl(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, AuthSdkSlothComposeComponentImpl authSdkSlothComposeComponentImpl, com.yandex.passport.internal.ui.sloth.screen.b bVar, m mVar, Map<String, String> map, Function1<? super com.yandex.passport.sloth.ui.e1, Unit> function1) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            this.authSdkSlothComposeComponentImpl = authSdkSlothComposeComponentImpl;
            initialize(bVar, mVar, map, function1);
        }

        private void initialize(com.yandex.passport.internal.ui.sloth.screen.b bVar, m mVar, Map<String, String> map, Function1<? super com.yandex.passport.sloth.ui.e1, Unit> function1) {
            this.setSlothParamsProvider = toe.a(mVar);
            rzm b = t8a.b(new com.yandex.passport.internal.ui.sloth.screen.c(bVar, this.passportProcessGlobalComponentImpl.slothDependenciesFactoryProvider, 0));
            this.provideSlothDependenciesProvider = b;
            rzm b2 = t8a.b(new d0(bVar, this.setSlothParamsProvider, b, this.authSdkSlothComposeComponentImpl.providePerformConfigurationProvider, 24));
            this.provideSlothSessionProvider = b2;
            this.provideSlothUiInteractorProvider = t8a.b(new com.yandex.passport.internal.ui.sloth.screen.c(bVar, b2, 2));
            toe a = toe.a(map);
            this.setSlothHeadersProvider = a;
            this.provideSlothWebViewSettingsProvider = t8a.b(new com.yandex.passport.internal.ui.sloth.screen.d(bVar, a, 0));
            this.provideSlothSSLErrorHandlerProvider = t8a.b(new com.yandex.passport.internal.ui.sloth.screen.c(bVar, this.passportProcessGlobalComponentImpl.setApplicationContextProvider, 1));
            this.provideSlothUrlProvider = t8a.b(new com.yandex.passport.internal.ui.sloth.screen.c(bVar, this.provideSlothDependenciesProvider, 3));
            toe a2 = toe.a(function1);
            this.setOnSlothUiWishProvider = a2;
            this.provideWishConsumerProvider = t8a.b(new com.yandex.passport.internal.ui.sloth.screen.d(bVar, a2, 1));
            com.yandex.passport.common.coroutine.d dVar = new com.yandex.passport.common.coroutine.d(13);
            this.slothStringRepositoryImplProvider = dVar;
            this.provideStringRepositoryProvider = t8a.b(new k(bVar, dVar, 16));
            com.yandex.passport.internal.ui.bouncer.sloth.i iVar = new com.yandex.passport.internal.ui.bouncer.sloth.i(this.passportProcessGlobalComponentImpl.provideDebugInfoUtilProvider, 9);
            this.slothDebugInformationDelegateImplProvider = iVar;
            this.provideDebugInformationDelegateProvider = t8a.b(new k(bVar, iVar, 13));
            h1 h1Var = new h1(this.authSdkSlothComposeComponentImpl.setActivityProvider, this.passportProcessGlobalComponentImpl.provideCoroutineScopesProvider, 7);
            this.slothNetworkStatusImplProvider = h1Var;
            this.provideSlothNetworkStatusProvider = t8a.b(new k(bVar, h1Var, 15));
            this.provideSlothVariantProvider = t8a.b(new com.yandex.passport.internal.ui.sloth.screen.c(bVar, this.setSlothParamsProvider, 4));
            com.yandex.passport.internal.ui.bouncer.sloth.i iVar2 = new com.yandex.passport.internal.ui.bouncer.sloth.i(this.passportProcessGlobalComponentImpl.provideSlothReportDelegateProvider, 8);
            this.slothComposeUiReporterImplProvider = iVar2;
            this.provideSlothComposeUiReporterProvider = t8a.b(new k(bVar, iVar2, 14));
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.common.common.a getApplicationDetailsProvider() {
            return (com.yandex.passport.common.common.a) this.passportProcessGlobalComponentImpl.bindApplicationDetailsProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.common.ui.progress.g getProgressProperties() {
            return this.authSdkSlothComposeComponentImpl.setProgressProperties;
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.g getSlothComposeUIReporter() {
            return (com.yandex.passport.sloth.ui.g) this.provideSlothComposeUiReporterProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.dependencies.d getSlothDebugInformationDelegate() {
            return (com.yandex.passport.sloth.ui.dependencies.d) this.provideDebugInformationDelegateProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.l getSlothNetworkStatus() {
            return (com.yandex.passport.sloth.ui.l) this.provideSlothNetworkStatusProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.a1 getSlothUiInteractor() {
            return (com.yandex.passport.sloth.ui.a1) this.provideSlothUiInteractorProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.dependencies.i getSlothUrlProvider() {
            return (com.yandex.passport.sloth.dependencies.i) this.provideSlothUrlProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public o0 getSlothVariant() {
            return (o0) this.provideSlothVariantProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.dependencies.p getSlothWebViewSettings() {
            return (com.yandex.passport.sloth.ui.dependencies.p) this.provideSlothWebViewSettingsProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public q getSlothWishConsumer() {
            return (q) this.provideWishConsumerProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.string.b getStringRepository() {
            return (com.yandex.passport.sloth.ui.string.b) this.provideStringRepositoryProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.sloth.screen.f
        public com.yandex.passport.internal.ui.sloth.screen.h getViewModelFactory() {
            return new com.yandex.passport.internal.ui.sloth.screen.h((com.yandex.passport.sloth.d1) this.provideSlothSessionProvider.get());
        }

        public o1 getWebAmReporter() {
            return (o1) this.passportProcessGlobalComponentImpl.webAmReporterProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public agv getWebViewSslErrorHandler() {
            return (agv) this.provideSlothSSLErrorHandlerProvider.get();
        }

        public boolean isWhiteLabel() {
            return this.passportProcessGlobalComponentImpl.whiteLabelBoolean();
        }
    }

    public static final class cypiuss5_SlothScreenComponentImpl implements com.yandex.passport.internal.ui.sloth.screen.f {
        private final cypiuss5_SlothScreenComponentImpl _cypiuss5_SlothScreenComponentImpl = this;
        private final BiometricVerificationComponentImpl biometricVerificationComponentImpl;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        rzm provideDebugInformationDelegateProvider;
        rzm provideSlothComposeUiReporterProvider;
        rzm provideSlothDependenciesProvider;
        rzm provideSlothNetworkStatusProvider;
        rzm provideSlothSSLErrorHandlerProvider;
        rzm provideSlothSessionProvider;
        rzm provideSlothUiInteractorProvider;
        rzm provideSlothUrlProvider;
        rzm provideSlothVariantProvider;
        rzm provideSlothWebViewSettingsProvider;
        rzm provideStringRepositoryProvider;
        rzm provideWishConsumerProvider;
        rzm setOnSlothUiWishProvider;
        rzm setSlothHeadersProvider;
        rzm setSlothParamsProvider;
        rzm slothComposeUiReporterImplProvider;
        rzm slothDebugInformationDelegateImplProvider;
        rzm slothNetworkStatusImplProvider;
        rzm slothStringRepositoryImplProvider;

        public cypiuss5_SlothScreenComponentImpl(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, BiometricVerificationComponentImpl biometricVerificationComponentImpl, com.yandex.passport.internal.ui.sloth.screen.b bVar, m mVar, Map<String, String> map, Function1<? super com.yandex.passport.sloth.ui.e1, Unit> function1) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            this.biometricVerificationComponentImpl = biometricVerificationComponentImpl;
            initialize(bVar, mVar, map, function1);
        }

        private void initialize(com.yandex.passport.internal.ui.sloth.screen.b bVar, m mVar, Map<String, String> map, Function1<? super com.yandex.passport.sloth.ui.e1, Unit> function1) {
            this.setSlothParamsProvider = toe.a(mVar);
            rzm b = t8a.b(new com.yandex.passport.internal.ui.sloth.screen.c(bVar, this.passportProcessGlobalComponentImpl.slothDependenciesFactoryProvider, 0));
            this.provideSlothDependenciesProvider = b;
            rzm b2 = t8a.b(new d0(bVar, this.setSlothParamsProvider, b, this.biometricVerificationComponentImpl.providePerformConfigurationProvider, 24));
            this.provideSlothSessionProvider = b2;
            this.provideSlothUiInteractorProvider = t8a.b(new com.yandex.passport.internal.ui.sloth.screen.c(bVar, b2, 2));
            toe a = toe.a(map);
            this.setSlothHeadersProvider = a;
            this.provideSlothWebViewSettingsProvider = t8a.b(new com.yandex.passport.internal.ui.sloth.screen.d(bVar, a, 0));
            this.provideSlothSSLErrorHandlerProvider = t8a.b(new com.yandex.passport.internal.ui.sloth.screen.c(bVar, this.passportProcessGlobalComponentImpl.setApplicationContextProvider, 1));
            this.provideSlothUrlProvider = t8a.b(new com.yandex.passport.internal.ui.sloth.screen.c(bVar, this.provideSlothDependenciesProvider, 3));
            toe a2 = toe.a(function1);
            this.setOnSlothUiWishProvider = a2;
            this.provideWishConsumerProvider = t8a.b(new com.yandex.passport.internal.ui.sloth.screen.d(bVar, a2, 1));
            com.yandex.passport.common.coroutine.d dVar = new com.yandex.passport.common.coroutine.d(13);
            this.slothStringRepositoryImplProvider = dVar;
            this.provideStringRepositoryProvider = t8a.b(new k(bVar, dVar, 16));
            com.yandex.passport.internal.ui.bouncer.sloth.i iVar = new com.yandex.passport.internal.ui.bouncer.sloth.i(this.passportProcessGlobalComponentImpl.provideDebugInfoUtilProvider, 9);
            this.slothDebugInformationDelegateImplProvider = iVar;
            this.provideDebugInformationDelegateProvider = t8a.b(new k(bVar, iVar, 13));
            h1 h1Var = new h1(this.biometricVerificationComponentImpl.setActivityProvider, this.passportProcessGlobalComponentImpl.provideCoroutineScopesProvider, 7);
            this.slothNetworkStatusImplProvider = h1Var;
            this.provideSlothNetworkStatusProvider = t8a.b(new k(bVar, h1Var, 15));
            this.provideSlothVariantProvider = t8a.b(new com.yandex.passport.internal.ui.sloth.screen.c(bVar, this.setSlothParamsProvider, 4));
            com.yandex.passport.internal.ui.bouncer.sloth.i iVar2 = new com.yandex.passport.internal.ui.bouncer.sloth.i(this.passportProcessGlobalComponentImpl.provideSlothReportDelegateProvider, 8);
            this.slothComposeUiReporterImplProvider = iVar2;
            this.provideSlothComposeUiReporterProvider = t8a.b(new k(bVar, iVar2, 14));
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.common.common.a getApplicationDetailsProvider() {
            return (com.yandex.passport.common.common.a) this.passportProcessGlobalComponentImpl.bindApplicationDetailsProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.common.ui.progress.g getProgressProperties() {
            return this.biometricVerificationComponentImpl.setProgressProperties;
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.g getSlothComposeUIReporter() {
            return (com.yandex.passport.sloth.ui.g) this.provideSlothComposeUiReporterProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.dependencies.d getSlothDebugInformationDelegate() {
            return (com.yandex.passport.sloth.ui.dependencies.d) this.provideDebugInformationDelegateProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.l getSlothNetworkStatus() {
            return (com.yandex.passport.sloth.ui.l) this.provideSlothNetworkStatusProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.a1 getSlothUiInteractor() {
            return (com.yandex.passport.sloth.ui.a1) this.provideSlothUiInteractorProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.dependencies.i getSlothUrlProvider() {
            return (com.yandex.passport.sloth.dependencies.i) this.provideSlothUrlProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public o0 getSlothVariant() {
            return (o0) this.provideSlothVariantProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.dependencies.p getSlothWebViewSettings() {
            return (com.yandex.passport.sloth.ui.dependencies.p) this.provideSlothWebViewSettingsProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public q getSlothWishConsumer() {
            return (q) this.provideWishConsumerProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.string.b getStringRepository() {
            return (com.yandex.passport.sloth.ui.string.b) this.provideStringRepositoryProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.sloth.screen.f
        public com.yandex.passport.internal.ui.sloth.screen.h getViewModelFactory() {
            return new com.yandex.passport.internal.ui.sloth.screen.h((com.yandex.passport.sloth.d1) this.provideSlothSessionProvider.get());
        }

        public o1 getWebAmReporter() {
            return (o1) this.passportProcessGlobalComponentImpl.webAmReporterProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public agv getWebViewSslErrorHandler() {
            return (agv) this.provideSlothSSLErrorHandlerProvider.get();
        }

        public boolean isWhiteLabel() {
            return this.passportProcessGlobalComponentImpl.whiteLabelBoolean();
        }
    }

    public static final class cypiuss6_SlothScreenComponentImpl implements com.yandex.passport.internal.ui.sloth.screen.f {
        private final cypiuss6_SlothScreenComponentImpl _cypiuss6_SlothScreenComponentImpl = this;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        rzm provideDebugInformationDelegateProvider;
        rzm provideSlothComposeUiReporterProvider;
        rzm provideSlothDependenciesProvider;
        rzm provideSlothNetworkStatusProvider;
        rzm provideSlothSSLErrorHandlerProvider;
        rzm provideSlothSessionProvider;
        rzm provideSlothUiInteractorProvider;
        rzm provideSlothUrlProvider;
        rzm provideSlothVariantProvider;
        rzm provideSlothWebViewSettingsProvider;
        rzm provideStringRepositoryProvider;
        rzm provideWishConsumerProvider;
        private final RegisterWebAuthNComponentImpl registerWebAuthNComponentImpl;
        rzm setOnSlothUiWishProvider;
        rzm setSlothHeadersProvider;
        rzm setSlothParamsProvider;
        rzm slothComposeUiReporterImplProvider;
        rzm slothDebugInformationDelegateImplProvider;
        rzm slothNetworkStatusImplProvider;
        rzm slothStringRepositoryImplProvider;

        public cypiuss6_SlothScreenComponentImpl(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, RegisterWebAuthNComponentImpl registerWebAuthNComponentImpl, com.yandex.passport.internal.ui.sloth.screen.b bVar, m mVar, Map<String, String> map, Function1<? super com.yandex.passport.sloth.ui.e1, Unit> function1) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            this.registerWebAuthNComponentImpl = registerWebAuthNComponentImpl;
            initialize(bVar, mVar, map, function1);
        }

        private void initialize(com.yandex.passport.internal.ui.sloth.screen.b bVar, m mVar, Map<String, String> map, Function1<? super com.yandex.passport.sloth.ui.e1, Unit> function1) {
            this.setSlothParamsProvider = toe.a(mVar);
            rzm b = t8a.b(new com.yandex.passport.internal.ui.sloth.screen.c(bVar, this.passportProcessGlobalComponentImpl.slothDependenciesFactoryProvider, 0));
            this.provideSlothDependenciesProvider = b;
            rzm b2 = t8a.b(new d0(bVar, this.setSlothParamsProvider, b, this.registerWebAuthNComponentImpl.providePerformConfigurationProvider, 24));
            this.provideSlothSessionProvider = b2;
            this.provideSlothUiInteractorProvider = t8a.b(new com.yandex.passport.internal.ui.sloth.screen.c(bVar, b2, 2));
            toe a = toe.a(map);
            this.setSlothHeadersProvider = a;
            this.provideSlothWebViewSettingsProvider = t8a.b(new com.yandex.passport.internal.ui.sloth.screen.d(bVar, a, 0));
            this.provideSlothSSLErrorHandlerProvider = t8a.b(new com.yandex.passport.internal.ui.sloth.screen.c(bVar, this.passportProcessGlobalComponentImpl.setApplicationContextProvider, 1));
            this.provideSlothUrlProvider = t8a.b(new com.yandex.passport.internal.ui.sloth.screen.c(bVar, this.provideSlothDependenciesProvider, 3));
            toe a2 = toe.a(function1);
            this.setOnSlothUiWishProvider = a2;
            this.provideWishConsumerProvider = t8a.b(new com.yandex.passport.internal.ui.sloth.screen.d(bVar, a2, 1));
            com.yandex.passport.common.coroutine.d dVar = new com.yandex.passport.common.coroutine.d(13);
            this.slothStringRepositoryImplProvider = dVar;
            this.provideStringRepositoryProvider = t8a.b(new k(bVar, dVar, 16));
            com.yandex.passport.internal.ui.bouncer.sloth.i iVar = new com.yandex.passport.internal.ui.bouncer.sloth.i(this.passportProcessGlobalComponentImpl.provideDebugInfoUtilProvider, 9);
            this.slothDebugInformationDelegateImplProvider = iVar;
            this.provideDebugInformationDelegateProvider = t8a.b(new k(bVar, iVar, 13));
            h1 h1Var = new h1(this.registerWebAuthNComponentImpl.setActivityProvider, this.passportProcessGlobalComponentImpl.provideCoroutineScopesProvider, 7);
            this.slothNetworkStatusImplProvider = h1Var;
            this.provideSlothNetworkStatusProvider = t8a.b(new k(bVar, h1Var, 15));
            this.provideSlothVariantProvider = t8a.b(new com.yandex.passport.internal.ui.sloth.screen.c(bVar, this.setSlothParamsProvider, 4));
            com.yandex.passport.internal.ui.bouncer.sloth.i iVar2 = new com.yandex.passport.internal.ui.bouncer.sloth.i(this.passportProcessGlobalComponentImpl.provideSlothReportDelegateProvider, 8);
            this.slothComposeUiReporterImplProvider = iVar2;
            this.provideSlothComposeUiReporterProvider = t8a.b(new k(bVar, iVar2, 14));
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.common.common.a getApplicationDetailsProvider() {
            return (com.yandex.passport.common.common.a) this.passportProcessGlobalComponentImpl.bindApplicationDetailsProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.common.ui.progress.g getProgressProperties() {
            return this.registerWebAuthNComponentImpl.setProgressProperties;
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.g getSlothComposeUIReporter() {
            return (com.yandex.passport.sloth.ui.g) this.provideSlothComposeUiReporterProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.dependencies.d getSlothDebugInformationDelegate() {
            return (com.yandex.passport.sloth.ui.dependencies.d) this.provideDebugInformationDelegateProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.l getSlothNetworkStatus() {
            return (com.yandex.passport.sloth.ui.l) this.provideSlothNetworkStatusProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.a1 getSlothUiInteractor() {
            return (com.yandex.passport.sloth.ui.a1) this.provideSlothUiInteractorProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.dependencies.i getSlothUrlProvider() {
            return (com.yandex.passport.sloth.dependencies.i) this.provideSlothUrlProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public o0 getSlothVariant() {
            return (o0) this.provideSlothVariantProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.dependencies.p getSlothWebViewSettings() {
            return (com.yandex.passport.sloth.ui.dependencies.p) this.provideSlothWebViewSettingsProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public q getSlothWishConsumer() {
            return (q) this.provideWishConsumerProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.string.b getStringRepository() {
            return (com.yandex.passport.sloth.ui.string.b) this.provideStringRepositoryProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.sloth.screen.f
        public com.yandex.passport.internal.ui.sloth.screen.h getViewModelFactory() {
            return new com.yandex.passport.internal.ui.sloth.screen.h((com.yandex.passport.sloth.d1) this.provideSlothSessionProvider.get());
        }

        public o1 getWebAmReporter() {
            return (o1) this.passportProcessGlobalComponentImpl.webAmReporterProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public agv getWebViewSslErrorHandler() {
            return (agv) this.provideSlothSSLErrorHandlerProvider.get();
        }

        public boolean isWhiteLabel() {
            return this.passportProcessGlobalComponentImpl.whiteLabelBoolean();
        }
    }

    public static final class cypiuss_SlothScreenComponentImpl implements com.yandex.passport.internal.ui.sloth.screen.f {
        private final cypiuss_SlothScreenComponentImpl _cypiuss_SlothScreenComponentImpl = this;
        private final DeleteAccountComponentImpl deleteAccountComponentImpl;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        rzm provideDebugInformationDelegateProvider;
        rzm provideSlothComposeUiReporterProvider;
        rzm provideSlothDependenciesProvider;
        rzm provideSlothNetworkStatusProvider;
        rzm provideSlothSSLErrorHandlerProvider;
        rzm provideSlothSessionProvider;
        rzm provideSlothUiInteractorProvider;
        rzm provideSlothUrlProvider;
        rzm provideSlothVariantProvider;
        rzm provideSlothWebViewSettingsProvider;
        rzm provideStringRepositoryProvider;
        rzm provideWishConsumerProvider;
        rzm setOnSlothUiWishProvider;
        rzm setSlothHeadersProvider;
        rzm setSlothParamsProvider;
        rzm slothComposeUiReporterImplProvider;
        rzm slothDebugInformationDelegateImplProvider;
        rzm slothNetworkStatusImplProvider;
        rzm slothStringRepositoryImplProvider;

        public cypiuss_SlothScreenComponentImpl(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, DeleteAccountComponentImpl deleteAccountComponentImpl, com.yandex.passport.internal.ui.sloth.screen.b bVar, m mVar, Map<String, String> map, Function1<? super com.yandex.passport.sloth.ui.e1, Unit> function1) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            this.deleteAccountComponentImpl = deleteAccountComponentImpl;
            initialize(bVar, mVar, map, function1);
        }

        private void initialize(com.yandex.passport.internal.ui.sloth.screen.b bVar, m mVar, Map<String, String> map, Function1<? super com.yandex.passport.sloth.ui.e1, Unit> function1) {
            this.setSlothParamsProvider = toe.a(mVar);
            rzm b = t8a.b(new com.yandex.passport.internal.ui.sloth.screen.c(bVar, this.passportProcessGlobalComponentImpl.slothDependenciesFactoryProvider, 0));
            this.provideSlothDependenciesProvider = b;
            rzm b2 = t8a.b(new d0(bVar, this.setSlothParamsProvider, b, this.deleteAccountComponentImpl.providePerformConfigurationProvider, 24));
            this.provideSlothSessionProvider = b2;
            this.provideSlothUiInteractorProvider = t8a.b(new com.yandex.passport.internal.ui.sloth.screen.c(bVar, b2, 2));
            toe a = toe.a(map);
            this.setSlothHeadersProvider = a;
            this.provideSlothWebViewSettingsProvider = t8a.b(new com.yandex.passport.internal.ui.sloth.screen.d(bVar, a, 0));
            this.provideSlothSSLErrorHandlerProvider = t8a.b(new com.yandex.passport.internal.ui.sloth.screen.c(bVar, this.passportProcessGlobalComponentImpl.setApplicationContextProvider, 1));
            this.provideSlothUrlProvider = t8a.b(new com.yandex.passport.internal.ui.sloth.screen.c(bVar, this.provideSlothDependenciesProvider, 3));
            toe a2 = toe.a(function1);
            this.setOnSlothUiWishProvider = a2;
            this.provideWishConsumerProvider = t8a.b(new com.yandex.passport.internal.ui.sloth.screen.d(bVar, a2, 1));
            com.yandex.passport.common.coroutine.d dVar = new com.yandex.passport.common.coroutine.d(13);
            this.slothStringRepositoryImplProvider = dVar;
            this.provideStringRepositoryProvider = t8a.b(new k(bVar, dVar, 16));
            com.yandex.passport.internal.ui.bouncer.sloth.i iVar = new com.yandex.passport.internal.ui.bouncer.sloth.i(this.passportProcessGlobalComponentImpl.provideDebugInfoUtilProvider, 9);
            this.slothDebugInformationDelegateImplProvider = iVar;
            this.provideDebugInformationDelegateProvider = t8a.b(new k(bVar, iVar, 13));
            h1 h1Var = new h1(this.deleteAccountComponentImpl.setActivityProvider, this.passportProcessGlobalComponentImpl.provideCoroutineScopesProvider, 7);
            this.slothNetworkStatusImplProvider = h1Var;
            this.provideSlothNetworkStatusProvider = t8a.b(new k(bVar, h1Var, 15));
            this.provideSlothVariantProvider = t8a.b(new com.yandex.passport.internal.ui.sloth.screen.c(bVar, this.setSlothParamsProvider, 4));
            com.yandex.passport.internal.ui.bouncer.sloth.i iVar2 = new com.yandex.passport.internal.ui.bouncer.sloth.i(this.passportProcessGlobalComponentImpl.provideSlothReportDelegateProvider, 8);
            this.slothComposeUiReporterImplProvider = iVar2;
            this.provideSlothComposeUiReporterProvider = t8a.b(new k(bVar, iVar2, 14));
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.common.common.a getApplicationDetailsProvider() {
            return (com.yandex.passport.common.common.a) this.passportProcessGlobalComponentImpl.bindApplicationDetailsProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.common.ui.progress.g getProgressProperties() {
            return this.deleteAccountComponentImpl.progressProperties();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.g getSlothComposeUIReporter() {
            return (com.yandex.passport.sloth.ui.g) this.provideSlothComposeUiReporterProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.dependencies.d getSlothDebugInformationDelegate() {
            return (com.yandex.passport.sloth.ui.dependencies.d) this.provideDebugInformationDelegateProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.l getSlothNetworkStatus() {
            return (com.yandex.passport.sloth.ui.l) this.provideSlothNetworkStatusProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.a1 getSlothUiInteractor() {
            return (com.yandex.passport.sloth.ui.a1) this.provideSlothUiInteractorProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.dependencies.i getSlothUrlProvider() {
            return (com.yandex.passport.sloth.dependencies.i) this.provideSlothUrlProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public o0 getSlothVariant() {
            return (o0) this.provideSlothVariantProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.dependencies.p getSlothWebViewSettings() {
            return (com.yandex.passport.sloth.ui.dependencies.p) this.provideSlothWebViewSettingsProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public q getSlothWishConsumer() {
            return (q) this.provideWishConsumerProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public com.yandex.passport.sloth.ui.string.b getStringRepository() {
            return (com.yandex.passport.sloth.ui.string.b) this.provideStringRepositoryProvider.get();
        }

        @Override // com.yandex.passport.internal.ui.sloth.screen.f
        public com.yandex.passport.internal.ui.sloth.screen.h getViewModelFactory() {
            return new com.yandex.passport.internal.ui.sloth.screen.h((com.yandex.passport.sloth.d1) this.provideSlothSessionProvider.get());
        }

        public o1 getWebAmReporter() {
            return (o1) this.passportProcessGlobalComponentImpl.webAmReporterProvider.get();
        }

        @Override // com.yandex.passport.sloth.ui.dependencies.c
        public agv getWebViewSslErrorHandler() {
            return (agv) this.provideSlothSSLErrorHandlerProvider.get();
        }

        public boolean isWhiteLabel() {
            return this.passportProcessGlobalComponentImpl.whiteLabelBoolean();
        }
    }

    private DaggerPassportProcessGlobalComponent() {
    }

    public static PassportProcessGlobalComponent.Builder builder() {
        return new Builder();
    }

    public static final class EsiaBindComponentBuilder implements com.yandex.passport.internal.social.esia.d {
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private com.yandex.passport.internal.social.esia.q0 setEsiaInternalBindProperties;

        private EsiaBindComponentBuilder(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
        }

        @Override // com.yandex.passport.internal.social.esia.d
        public com.yandex.passport.internal.social.esia.e build() {
            return new EsiaBindComponentImpl(this.passportProcessGlobalComponentImpl, new com.yandex.passport.internal.ui.common.e(), new com.yandex.passport.internal.social.esia.f(), this.setEsiaInternalBindProperties);
        }

        @Override // com.yandex.passport.internal.social.esia.d
        public EsiaBindComponentBuilder setEsiaInternalBindProperties(com.yandex.passport.internal.social.esia.q0 q0Var) {
            this.setEsiaInternalBindProperties = q0Var;
            return this;
        }
    }

    public static final class BouncerMasterChooserComponentBuilder implements com.yandex.passport.internal.ui.bouncer.chooser.a {
        private final BouncerActivityComponentImpl bouncerActivityComponentImpl;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private Boolean setCreateMasterEnterPhoneNumberOption;
        private List<y0> setMasters;

        private BouncerMasterChooserComponentBuilder(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, BouncerActivityComponentImpl bouncerActivityComponentImpl) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            this.bouncerActivityComponentImpl = bouncerActivityComponentImpl;
        }

        @Override // com.yandex.passport.internal.ui.bouncer.chooser.a
        public com.yandex.passport.internal.ui.bouncer.chooser.b build() {
            a4g.q(List.class, this.setMasters);
            a4g.q(Boolean.class, this.setCreateMasterEnterPhoneNumberOption);
            return new BouncerMasterChooserComponentImpl(this.passportProcessGlobalComponentImpl, this.bouncerActivityComponentImpl, new com.yandex.passport.internal.ui.bouncer.chooser.c(), new com.yandex.passport.internal.ui.common.e(), this.setMasters, this.setCreateMasterEnterPhoneNumberOption);
        }

        @Override // com.yandex.passport.internal.ui.bouncer.chooser.a
        public BouncerMasterChooserComponentBuilder setCreateMasterEnterPhoneNumberOption(boolean z) {
            this.setCreateMasterEnterPhoneNumberOption = Boolean.valueOf(z);
            return this;
        }

        @Override // com.yandex.passport.internal.ui.bouncer.chooser.a
        public BouncerMasterChooserComponentBuilder setMasters(List<y0> list) {
            list.getClass();
            this.setMasters = list;
            return this;
        }

        @Override // com.yandex.passport.internal.ui.bouncer.chooser.a
        public /* bridge */ /* synthetic */ com.yandex.passport.internal.ui.bouncer.chooser.a setMasters(List list) {
            return setMasters((List<y0>) list);
        }
    }

    public static final class cypiuss2_SlothScreenComponentBuilder implements com.yandex.passport.internal.ui.sloth.screen.e {
        private final ManagingPlusDevicesComponentImpl managingPlusDevicesComponentImpl;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private Function1<? super com.yandex.passport.sloth.ui.e1, Unit> setOnSlothUiWish;
        private Map<String, String> setSlothHeaders;
        private m setSlothParams;

        private cypiuss2_SlothScreenComponentBuilder(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, ManagingPlusDevicesComponentImpl managingPlusDevicesComponentImpl) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            this.managingPlusDevicesComponentImpl = managingPlusDevicesComponentImpl;
        }

        @Override // com.yandex.passport.internal.ui.sloth.screen.e
        public com.yandex.passport.internal.ui.sloth.screen.f build() {
            a4g.q(m.class, this.setSlothParams);
            a4g.q(Map.class, this.setSlothHeaders);
            a4g.q(Function1.class, this.setOnSlothUiWish);
            return new cypiuss2_SlothScreenComponentImpl(this.passportProcessGlobalComponentImpl, this.managingPlusDevicesComponentImpl, new com.yandex.passport.internal.ui.sloth.screen.b(), this.setSlothParams, this.setSlothHeaders, this.setOnSlothUiWish);
        }

        @Override // com.yandex.passport.internal.ui.sloth.screen.e
        public cypiuss2_SlothScreenComponentBuilder setOnSlothUiWish(Function1<? super com.yandex.passport.sloth.ui.e1, Unit> function1) {
            function1.getClass();
            this.setOnSlothUiWish = function1;
            return this;
        }

        @Override // com.yandex.passport.internal.ui.sloth.screen.e
        public cypiuss2_SlothScreenComponentBuilder setSlothHeaders(Map<String, String> map) {
            map.getClass();
            this.setSlothHeaders = map;
            return this;
        }

        @Override // com.yandex.passport.internal.ui.sloth.screen.e
        public cypiuss2_SlothScreenComponentBuilder setSlothParams(m mVar) {
            mVar.getClass();
            this.setSlothParams = mVar;
            return this;
        }

        @Override // com.yandex.passport.internal.ui.sloth.screen.e
        public /* bridge */ /* synthetic */ com.yandex.passport.internal.ui.sloth.screen.e setOnSlothUiWish(Function1 function1) {
            return setOnSlothUiWish((Function1<? super com.yandex.passport.sloth.ui.e1, Unit>) function1);
        }

        @Override // com.yandex.passport.internal.ui.sloth.screen.e
        public /* bridge */ /* synthetic */ com.yandex.passport.internal.ui.sloth.screen.e setSlothHeaders(Map map) {
            return setSlothHeaders((Map<String, String>) map);
        }
    }

    public static final class cypiuss3_SlothScreenComponentBuilder implements com.yandex.passport.internal.ui.sloth.screen.e {
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private Function1<? super com.yandex.passport.sloth.ui.e1, Unit> setOnSlothUiWish;
        private Map<String, String> setSlothHeaders;
        private m setSlothParams;
        private final WebCardComposeComponentImpl webCardComposeComponentImpl;

        private cypiuss3_SlothScreenComponentBuilder(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, WebCardComposeComponentImpl webCardComposeComponentImpl) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            this.webCardComposeComponentImpl = webCardComposeComponentImpl;
        }

        @Override // com.yandex.passport.internal.ui.sloth.screen.e
        public com.yandex.passport.internal.ui.sloth.screen.f build() {
            a4g.q(m.class, this.setSlothParams);
            a4g.q(Map.class, this.setSlothHeaders);
            a4g.q(Function1.class, this.setOnSlothUiWish);
            return new cypiuss3_SlothScreenComponentImpl(this.passportProcessGlobalComponentImpl, this.webCardComposeComponentImpl, new com.yandex.passport.internal.ui.sloth.screen.b(), this.setSlothParams, this.setSlothHeaders, this.setOnSlothUiWish);
        }

        @Override // com.yandex.passport.internal.ui.sloth.screen.e
        public cypiuss3_SlothScreenComponentBuilder setOnSlothUiWish(Function1<? super com.yandex.passport.sloth.ui.e1, Unit> function1) {
            function1.getClass();
            this.setOnSlothUiWish = function1;
            return this;
        }

        @Override // com.yandex.passport.internal.ui.sloth.screen.e
        public cypiuss3_SlothScreenComponentBuilder setSlothHeaders(Map<String, String> map) {
            map.getClass();
            this.setSlothHeaders = map;
            return this;
        }

        @Override // com.yandex.passport.internal.ui.sloth.screen.e
        public cypiuss3_SlothScreenComponentBuilder setSlothParams(m mVar) {
            mVar.getClass();
            this.setSlothParams = mVar;
            return this;
        }

        @Override // com.yandex.passport.internal.ui.sloth.screen.e
        public /* bridge */ /* synthetic */ com.yandex.passport.internal.ui.sloth.screen.e setOnSlothUiWish(Function1 function1) {
            return setOnSlothUiWish((Function1<? super com.yandex.passport.sloth.ui.e1, Unit>) function1);
        }

        @Override // com.yandex.passport.internal.ui.sloth.screen.e
        public /* bridge */ /* synthetic */ com.yandex.passport.internal.ui.sloth.screen.e setSlothHeaders(Map map) {
            return setSlothHeaders((Map<String, String>) map);
        }
    }

    public static final class cypiuss4_SlothScreenComponentBuilder implements com.yandex.passport.internal.ui.sloth.screen.e {
        private final AuthSdkSlothComposeComponentImpl authSdkSlothComposeComponentImpl;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private Function1<? super com.yandex.passport.sloth.ui.e1, Unit> setOnSlothUiWish;
        private Map<String, String> setSlothHeaders;
        private m setSlothParams;

        private cypiuss4_SlothScreenComponentBuilder(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, AuthSdkSlothComposeComponentImpl authSdkSlothComposeComponentImpl) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            this.authSdkSlothComposeComponentImpl = authSdkSlothComposeComponentImpl;
        }

        @Override // com.yandex.passport.internal.ui.sloth.screen.e
        public com.yandex.passport.internal.ui.sloth.screen.f build() {
            a4g.q(m.class, this.setSlothParams);
            a4g.q(Map.class, this.setSlothHeaders);
            a4g.q(Function1.class, this.setOnSlothUiWish);
            return new cypiuss4_SlothScreenComponentImpl(this.passportProcessGlobalComponentImpl, this.authSdkSlothComposeComponentImpl, new com.yandex.passport.internal.ui.sloth.screen.b(), this.setSlothParams, this.setSlothHeaders, this.setOnSlothUiWish);
        }

        @Override // com.yandex.passport.internal.ui.sloth.screen.e
        public cypiuss4_SlothScreenComponentBuilder setOnSlothUiWish(Function1<? super com.yandex.passport.sloth.ui.e1, Unit> function1) {
            function1.getClass();
            this.setOnSlothUiWish = function1;
            return this;
        }

        @Override // com.yandex.passport.internal.ui.sloth.screen.e
        public cypiuss4_SlothScreenComponentBuilder setSlothHeaders(Map<String, String> map) {
            map.getClass();
            this.setSlothHeaders = map;
            return this;
        }

        @Override // com.yandex.passport.internal.ui.sloth.screen.e
        public cypiuss4_SlothScreenComponentBuilder setSlothParams(m mVar) {
            mVar.getClass();
            this.setSlothParams = mVar;
            return this;
        }

        @Override // com.yandex.passport.internal.ui.sloth.screen.e
        public /* bridge */ /* synthetic */ com.yandex.passport.internal.ui.sloth.screen.e setOnSlothUiWish(Function1 function1) {
            return setOnSlothUiWish((Function1<? super com.yandex.passport.sloth.ui.e1, Unit>) function1);
        }

        @Override // com.yandex.passport.internal.ui.sloth.screen.e
        public /* bridge */ /* synthetic */ com.yandex.passport.internal.ui.sloth.screen.e setSlothHeaders(Map map) {
            return setSlothHeaders((Map<String, String>) map);
        }
    }

    public static final class cypiuss5_SlothScreenComponentBuilder implements com.yandex.passport.internal.ui.sloth.screen.e {
        private final BiometricVerificationComponentImpl biometricVerificationComponentImpl;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private Function1<? super com.yandex.passport.sloth.ui.e1, Unit> setOnSlothUiWish;
        private Map<String, String> setSlothHeaders;
        private m setSlothParams;

        private cypiuss5_SlothScreenComponentBuilder(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, BiometricVerificationComponentImpl biometricVerificationComponentImpl) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            this.biometricVerificationComponentImpl = biometricVerificationComponentImpl;
        }

        @Override // com.yandex.passport.internal.ui.sloth.screen.e
        public com.yandex.passport.internal.ui.sloth.screen.f build() {
            a4g.q(m.class, this.setSlothParams);
            a4g.q(Map.class, this.setSlothHeaders);
            a4g.q(Function1.class, this.setOnSlothUiWish);
            return new cypiuss5_SlothScreenComponentImpl(this.passportProcessGlobalComponentImpl, this.biometricVerificationComponentImpl, new com.yandex.passport.internal.ui.sloth.screen.b(), this.setSlothParams, this.setSlothHeaders, this.setOnSlothUiWish);
        }

        @Override // com.yandex.passport.internal.ui.sloth.screen.e
        public cypiuss5_SlothScreenComponentBuilder setOnSlothUiWish(Function1<? super com.yandex.passport.sloth.ui.e1, Unit> function1) {
            function1.getClass();
            this.setOnSlothUiWish = function1;
            return this;
        }

        @Override // com.yandex.passport.internal.ui.sloth.screen.e
        public cypiuss5_SlothScreenComponentBuilder setSlothHeaders(Map<String, String> map) {
            map.getClass();
            this.setSlothHeaders = map;
            return this;
        }

        @Override // com.yandex.passport.internal.ui.sloth.screen.e
        public cypiuss5_SlothScreenComponentBuilder setSlothParams(m mVar) {
            mVar.getClass();
            this.setSlothParams = mVar;
            return this;
        }

        @Override // com.yandex.passport.internal.ui.sloth.screen.e
        public /* bridge */ /* synthetic */ com.yandex.passport.internal.ui.sloth.screen.e setOnSlothUiWish(Function1 function1) {
            return setOnSlothUiWish((Function1<? super com.yandex.passport.sloth.ui.e1, Unit>) function1);
        }

        @Override // com.yandex.passport.internal.ui.sloth.screen.e
        public /* bridge */ /* synthetic */ com.yandex.passport.internal.ui.sloth.screen.e setSlothHeaders(Map map) {
            return setSlothHeaders((Map<String, String>) map);
        }
    }

    public static final class cypiuss6_SlothScreenComponentBuilder implements com.yandex.passport.internal.ui.sloth.screen.e {
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private final RegisterWebAuthNComponentImpl registerWebAuthNComponentImpl;
        private Function1<? super com.yandex.passport.sloth.ui.e1, Unit> setOnSlothUiWish;
        private Map<String, String> setSlothHeaders;
        private m setSlothParams;

        private cypiuss6_SlothScreenComponentBuilder(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, RegisterWebAuthNComponentImpl registerWebAuthNComponentImpl) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            this.registerWebAuthNComponentImpl = registerWebAuthNComponentImpl;
        }

        @Override // com.yandex.passport.internal.ui.sloth.screen.e
        public com.yandex.passport.internal.ui.sloth.screen.f build() {
            a4g.q(m.class, this.setSlothParams);
            a4g.q(Map.class, this.setSlothHeaders);
            a4g.q(Function1.class, this.setOnSlothUiWish);
            return new cypiuss6_SlothScreenComponentImpl(this.passportProcessGlobalComponentImpl, this.registerWebAuthNComponentImpl, new com.yandex.passport.internal.ui.sloth.screen.b(), this.setSlothParams, this.setSlothHeaders, this.setOnSlothUiWish);
        }

        @Override // com.yandex.passport.internal.ui.sloth.screen.e
        public cypiuss6_SlothScreenComponentBuilder setOnSlothUiWish(Function1<? super com.yandex.passport.sloth.ui.e1, Unit> function1) {
            function1.getClass();
            this.setOnSlothUiWish = function1;
            return this;
        }

        @Override // com.yandex.passport.internal.ui.sloth.screen.e
        public cypiuss6_SlothScreenComponentBuilder setSlothHeaders(Map<String, String> map) {
            map.getClass();
            this.setSlothHeaders = map;
            return this;
        }

        @Override // com.yandex.passport.internal.ui.sloth.screen.e
        public cypiuss6_SlothScreenComponentBuilder setSlothParams(m mVar) {
            mVar.getClass();
            this.setSlothParams = mVar;
            return this;
        }

        @Override // com.yandex.passport.internal.ui.sloth.screen.e
        public /* bridge */ /* synthetic */ com.yandex.passport.internal.ui.sloth.screen.e setOnSlothUiWish(Function1 function1) {
            return setOnSlothUiWish((Function1<? super com.yandex.passport.sloth.ui.e1, Unit>) function1);
        }

        @Override // com.yandex.passport.internal.ui.sloth.screen.e
        public /* bridge */ /* synthetic */ com.yandex.passport.internal.ui.sloth.screen.e setSlothHeaders(Map map) {
            return setSlothHeaders((Map<String, String>) map);
        }
    }

    public static final class cypiuss_SlothScreenComponentBuilder implements com.yandex.passport.internal.ui.sloth.screen.e {
        private final DeleteAccountComponentImpl deleteAccountComponentImpl;
        private final PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl;
        private Function1<? super com.yandex.passport.sloth.ui.e1, Unit> setOnSlothUiWish;
        private Map<String, String> setSlothHeaders;
        private m setSlothParams;

        private cypiuss_SlothScreenComponentBuilder(PassportProcessGlobalComponentImpl passportProcessGlobalComponentImpl, DeleteAccountComponentImpl deleteAccountComponentImpl) {
            this.passportProcessGlobalComponentImpl = passportProcessGlobalComponentImpl;
            this.deleteAccountComponentImpl = deleteAccountComponentImpl;
        }

        @Override // com.yandex.passport.internal.ui.sloth.screen.e
        public com.yandex.passport.internal.ui.sloth.screen.f build() {
            a4g.q(m.class, this.setSlothParams);
            a4g.q(Map.class, this.setSlothHeaders);
            a4g.q(Function1.class, this.setOnSlothUiWish);
            return new cypiuss_SlothScreenComponentImpl(this.passportProcessGlobalComponentImpl, this.deleteAccountComponentImpl, new com.yandex.passport.internal.ui.sloth.screen.b(), this.setSlothParams, this.setSlothHeaders, this.setOnSlothUiWish);
        }

        @Override // com.yandex.passport.internal.ui.sloth.screen.e
        public cypiuss_SlothScreenComponentBuilder setOnSlothUiWish(Function1<? super com.yandex.passport.sloth.ui.e1, Unit> function1) {
            function1.getClass();
            this.setOnSlothUiWish = function1;
            return this;
        }

        @Override // com.yandex.passport.internal.ui.sloth.screen.e
        public cypiuss_SlothScreenComponentBuilder setSlothHeaders(Map<String, String> map) {
            map.getClass();
            this.setSlothHeaders = map;
            return this;
        }

        @Override // com.yandex.passport.internal.ui.sloth.screen.e
        public cypiuss_SlothScreenComponentBuilder setSlothParams(m mVar) {
            mVar.getClass();
            this.setSlothParams = mVar;
            return this;
        }

        @Override // com.yandex.passport.internal.ui.sloth.screen.e
        public /* bridge */ /* synthetic */ com.yandex.passport.internal.ui.sloth.screen.e setOnSlothUiWish(Function1 function1) {
            return setOnSlothUiWish((Function1<? super com.yandex.passport.sloth.ui.e1, Unit>) function1);
        }

        @Override // com.yandex.passport.internal.ui.sloth.screen.e
        public /* bridge */ /* synthetic */ com.yandex.passport.internal.ui.sloth.screen.e setSlothHeaders(Map map) {
            return setSlothHeaders((Map<String, String>) map);
        }
    }
}
