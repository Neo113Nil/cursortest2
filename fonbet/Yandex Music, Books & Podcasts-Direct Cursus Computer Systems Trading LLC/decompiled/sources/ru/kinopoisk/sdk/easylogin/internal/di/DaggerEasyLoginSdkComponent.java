package ru.kinopoisk.sdk.easylogin.internal.di;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.o;
import defpackage.a4g;
import defpackage.avw;
import defpackage.dfu;
import defpackage.ern;
import defpackage.f9f;
import defpackage.ff7;
import defpackage.gfu;
import defpackage.hn5;
import defpackage.ik0;
import defpackage.jj4;
import defpackage.nbt;
import defpackage.rzm;
import defpackage.szm;
import defpackage.t8a;
import defpackage.uuw;
import defpackage.vuw;
import defpackage.wuw;
import defpackage.xq0;
import defpackage.xuw;
import defpackage.yuw;
import defpackage.zuw;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import ru.kinopoisk.sdk.easylogin.api.CurrentAccountInfoProvider;
import ru.kinopoisk.sdk.easylogin.api.EasyLoginAnalytics;
import ru.kinopoisk.sdk.easylogin.api.EasyLoginAnalyticsFactory;
import ru.kinopoisk.sdk.easylogin.api.EasyLoginDependencies;
import ru.kinopoisk.sdk.easylogin.api.EasyLoginThemeProvider;
import ru.kinopoisk.sdk.easylogin.internal.A1;
import ru.kinopoisk.sdk.easylogin.internal.Aa;
import ru.kinopoisk.sdk.easylogin.internal.B2;
import ru.kinopoisk.sdk.easylogin.internal.B3;
import ru.kinopoisk.sdk.easylogin.internal.B9;
import ru.kinopoisk.sdk.easylogin.internal.Ba;
import ru.kinopoisk.sdk.easylogin.internal.Bc;
import ru.kinopoisk.sdk.easylogin.internal.C0965a4;
import ru.kinopoisk.sdk.easylogin.internal.C0972ab;
import ru.kinopoisk.sdk.easylogin.internal.C0974b;
import ru.kinopoisk.sdk.easylogin.internal.C0979b4;
import ru.kinopoisk.sdk.easylogin.internal.C0993c4;
import ru.kinopoisk.sdk.easylogin.internal.C0999ca;
import ru.kinopoisk.sdk.easylogin.internal.C1002d;
import ru.kinopoisk.sdk.easylogin.internal.C1005d2;
import ru.kinopoisk.sdk.easylogin.internal.C1006d3;
import ru.kinopoisk.sdk.easylogin.internal.C1007d4;
import ru.kinopoisk.sdk.easylogin.internal.C1021e4;
import ru.kinopoisk.sdk.easylogin.internal.C1022e5;
import ru.kinopoisk.sdk.easylogin.internal.C1027ea;
import ru.kinopoisk.sdk.easylogin.internal.C1030f;
import ru.kinopoisk.sdk.easylogin.internal.C1033f2;
import ru.kinopoisk.sdk.easylogin.internal.C1035f4;
import ru.kinopoisk.sdk.easylogin.internal.C1049g4;
import ru.kinopoisk.sdk.easylogin.internal.C1055ga;
import ru.kinopoisk.sdk.easylogin.internal.C1058h;
import ru.kinopoisk.sdk.easylogin.internal.C1063h4;
import ru.kinopoisk.sdk.easylogin.internal.C1065h6;
import ru.kinopoisk.sdk.easylogin.internal.C1077i4;
import ru.kinopoisk.sdk.easylogin.internal.C1078i5;
import ru.kinopoisk.sdk.easylogin.internal.C1090j3;
import ru.kinopoisk.sdk.easylogin.internal.C1096j9;
import ru.kinopoisk.sdk.easylogin.internal.C1097ja;
import ru.kinopoisk.sdk.easylogin.internal.C1098jb;
import ru.kinopoisk.sdk.easylogin.internal.C1103k2;
import ru.kinopoisk.sdk.easylogin.internal.C1133m4;
import ru.kinopoisk.sdk.easylogin.internal.C1147n4;
import ru.kinopoisk.sdk.easylogin.internal.C1153na;
import ru.kinopoisk.sdk.easylogin.internal.C1161o4;
import ru.kinopoisk.sdk.easylogin.internal.C1166o9;
import ru.kinopoisk.sdk.easylogin.internal.C1167oa;
import ru.kinopoisk.sdk.easylogin.internal.C1175p4;
import ru.kinopoisk.sdk.easylogin.internal.C1180p9;
import ru.kinopoisk.sdk.easylogin.internal.C1189q4;
import ru.kinopoisk.sdk.easylogin.internal.C1195qa;
import ru.kinopoisk.sdk.easylogin.internal.C1201r3;
import ru.kinopoisk.sdk.easylogin.internal.C1202r4;
import ru.kinopoisk.sdk.easylogin.internal.C1208ra;
import ru.kinopoisk.sdk.easylogin.internal.C1216s4;
import ru.kinopoisk.sdk.easylogin.internal.C1222sa;
import ru.kinopoisk.sdk.easylogin.internal.C1223sb;
import ru.kinopoisk.sdk.easylogin.internal.C1230t4;
import ru.kinopoisk.sdk.easylogin.internal.C1244u4;
import ru.kinopoisk.sdk.easylogin.internal.C1250ua;
import ru.kinopoisk.sdk.easylogin.internal.C1257v4;
import ru.kinopoisk.sdk.easylogin.internal.C1270w4;
import ru.kinopoisk.sdk.easylogin.internal.C1275w9;
import ru.kinopoisk.sdk.easylogin.internal.C1276wa;
import ru.kinopoisk.sdk.easylogin.internal.C1282x3;
import ru.kinopoisk.sdk.easylogin.internal.C1283x4;
import ru.kinopoisk.sdk.easylogin.internal.C1288x9;
import ru.kinopoisk.sdk.easylogin.internal.C1300y8;
import ru.kinopoisk.sdk.easylogin.internal.C1306z1;
import ru.kinopoisk.sdk.easylogin.internal.C1315za;
import ru.kinopoisk.sdk.easylogin.internal.C6;
import ru.kinopoisk.sdk.easylogin.internal.Ca;
import ru.kinopoisk.sdk.easylogin.internal.D2;
import ru.kinopoisk.sdk.easylogin.internal.D3;
import ru.kinopoisk.sdk.easylogin.internal.D6;
import ru.kinopoisk.sdk.easylogin.internal.D9;
import ru.kinopoisk.sdk.easylogin.internal.E3;
import ru.kinopoisk.sdk.easylogin.internal.E6;
import ru.kinopoisk.sdk.easylogin.internal.EasyLoginActivity;
import ru.kinopoisk.sdk.easylogin.internal.EasyLoginActivity_MembersInjector;
import ru.kinopoisk.sdk.easylogin.internal.EasyLoginSdkDirections;
import ru.kinopoisk.sdk.easylogin.internal.F0;
import ru.kinopoisk.sdk.easylogin.internal.F1;
import ru.kinopoisk.sdk.easylogin.internal.F2;
import ru.kinopoisk.sdk.easylogin.internal.F4;
import ru.kinopoisk.sdk.easylogin.internal.F6;
import ru.kinopoisk.sdk.easylogin.internal.F7;
import ru.kinopoisk.sdk.easylogin.internal.G;
import ru.kinopoisk.sdk.easylogin.internal.Gb;
import ru.kinopoisk.sdk.easylogin.internal.H1;
import ru.kinopoisk.sdk.easylogin.internal.H4;
import ru.kinopoisk.sdk.easylogin.internal.Hb;
import ru.kinopoisk.sdk.easylogin.internal.Hc;
import ru.kinopoisk.sdk.easylogin.internal.I4;
import ru.kinopoisk.sdk.easylogin.internal.I9;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC0969a8;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1023e6;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1093j6;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1138m9;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1185q0;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1188q3;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1192q7;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1228t2;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1229t3;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1236ta;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1256v3;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1269w3;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1294y2;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1305z0;
import ru.kinopoisk.sdk.easylogin.internal.J3;
import ru.kinopoisk.sdk.easylogin.internal.K;
import ru.kinopoisk.sdk.easylogin.internal.La;
import ru.kinopoisk.sdk.easylogin.internal.N5;
import ru.kinopoisk.sdk.easylogin.internal.Na;
import ru.kinopoisk.sdk.easylogin.internal.O2;
import ru.kinopoisk.sdk.easylogin.internal.O3;
import ru.kinopoisk.sdk.easylogin.internal.O6;
import ru.kinopoisk.sdk.easylogin.internal.P1;
import ru.kinopoisk.sdk.easylogin.internal.Q1;
import ru.kinopoisk.sdk.easylogin.internal.Q2;
import ru.kinopoisk.sdk.easylogin.internal.R2;
import ru.kinopoisk.sdk.easylogin.internal.R3;
import ru.kinopoisk.sdk.easylogin.internal.Sc;
import ru.kinopoisk.sdk.easylogin.internal.T7;
import ru.kinopoisk.sdk.easylogin.internal.Tc;
import ru.kinopoisk.sdk.easylogin.internal.U3;
import ru.kinopoisk.sdk.easylogin.internal.V3;
import ru.kinopoisk.sdk.easylogin.internal.V9;
import ru.kinopoisk.sdk.easylogin.internal.W1;
import ru.kinopoisk.sdk.easylogin.internal.W3;
import ru.kinopoisk.sdk.easylogin.internal.X3;
import ru.kinopoisk.sdk.easylogin.internal.X8;
import ru.kinopoisk.sdk.easylogin.internal.Xa;
import ru.kinopoisk.sdk.easylogin.internal.Y1;
import ru.kinopoisk.sdk.easylogin.internal.Y3;
import ru.kinopoisk.sdk.easylogin.internal.Z3;
import ru.kinopoisk.sdk.easylogin.internal.Z4;
import ru.kinopoisk.sdk.easylogin.internal.di.HostActivityComponentImpl;
import ru.kinopoisk.sdk.easylogin.internal.di.HostActivityViewModelComponentImpl;
import ru.kinopoisk.sdk.easylogin.internal.di.HostFragmentComponentImpl;
import ru.kinopoisk.sdk.easylogin.internal.di.HostFragmentViewModelComponentImpl;
import ru.kinopoisk.sdk.easylogin.internal.impl.AnalyticsErrorMapperImpl_AnalyticsErrorMapper_ApplicationComponent_BindingModule_0911859e_ProvideAnalyticsErrorMapperFactory;
import ru.kinopoisk.sdk.easylogin.internal.impl.AppInfoProviderImpl_AppInfoProvider_ApplicationComponent_BindingModule_a965c50c_ProvideAppInfoProviderFactory;
import ru.kinopoisk.sdk.easylogin.internal.impl.CastTrackerImpl;
import ru.kinopoisk.sdk.easylogin.internal.impl.ConfigProviderImpl;
import ru.kinopoisk.sdk.easylogin.internal.impl.ConnectingTrackerImpl;
import ru.kinopoisk.sdk.easylogin.internal.impl.ConnectionErrorTrackerImpl;
import ru.kinopoisk.sdk.easylogin.internal.impl.ConnectionSuccessTrackerImpl;
import ru.kinopoisk.sdk.easylogin.internal.impl.CurrentPuidProviderImpl;
import ru.kinopoisk.sdk.easylogin.internal.impl.EasyLoginAnalyticsErrorMapperImpl_EasyLoginAnalyticsErrorMapper_ApplicationComponent_BindingModule_ef449d6b_ProvideEasyLoginAnalyticsErrorMapperFactory;
import ru.kinopoisk.sdk.easylogin.internal.impl.EasyLoginGenaGlobalParamsProvider;
import ru.kinopoisk.sdk.easylogin.internal.impl.EasyLoginGenaPlatformParamsProvider;
import ru.kinopoisk.sdk.easylogin.internal.impl.EnterCodeTrackerImpl;
import ru.kinopoisk.sdk.easylogin.internal.impl.EvgenEasyLoginAnalytics;
import ru.kinopoisk.sdk.easylogin.internal.impl.EvgenEasyLoginAnalyticsGlobalParamsProvider;
import ru.kinopoisk.sdk.easylogin.internal.impl.EvgenEasyLoginAnalyticsPlatformParamsProvider;
import ru.kinopoisk.sdk.easylogin.internal.impl.EvgenEasyLoginAnalyticsTracker;
import ru.kinopoisk.sdk.easylogin.internal.impl.FoundTvStubTrackerImpl;
import ru.kinopoisk.sdk.easylogin.internal.impl.GenaGlobalParamsProvider;
import ru.kinopoisk.sdk.easylogin.internal.impl.GenaPlatformParamsProvider;
import ru.kinopoisk.sdk.easylogin.internal.impl.InstallTvAppTrackerImpl;
import ru.kinopoisk.sdk.easylogin.internal.impl.MockTvProviderImpl_MockTvProvider_ApplicationComponent_BindingModule_2da70ff7_ProvideMockTvProviderFactory;
import ru.kinopoisk.sdk.easylogin.internal.impl.StubAuthTokenProvider_AuthTokenProvider_ApplicationComponent_BindingModule_b176c799_ProvideAuthTokenProviderFactory;
import ru.kinopoisk.sdk.easylogin.internal.impl.TvAuthManagerImpl_TvAuthManager_ApplicationComponent_BindingModule_cc37b3cc_ProvideTvAuthManagerFactory;
import ru.kinopoisk.sdk.easylogin.internal.impl.TvAuthTrackerImpl;
import ru.kinopoisk.sdk.easylogin.internal.impl.TvDiscoveryTrackerImpl;
import ru.kinopoisk.sdk.easylogin.internal.impl.UpdateCodeTrackerImpl;

/* loaded from: classes5.dex */
public final class DaggerEasyLoginSdkComponent {

    public static final class Builder {
        private EasyLoginDependencies easyLoginDependencies;

        public /* synthetic */ Builder(int i) {
            this();
        }

        public EasyLoginSdkComponent build() {
            a4g.q(EasyLoginDependencies.class, this.easyLoginDependencies);
            return new EasyLoginSdkComponentImpl(this.easyLoginDependencies, 0);
        }

        public Builder easyLoginDependencies(EasyLoginDependencies easyLoginDependencies) {
            easyLoginDependencies.getClass();
            this.easyLoginDependencies = easyLoginDependencies;
            return this;
        }

        private Builder() {
        }
    }

    private DaggerEasyLoginSdkComponent() {
    }

    public static Builder builder() {
        return new Builder(0);
    }

    public static final class HostFragmentComponentImplImpl implements HostFragmentComponentImpl {
        private final EasyLoginSdkComponentImpl easyLoginSdkComponentImpl;
        private final HostActivityViewModelComponentImplImpl hostActivityViewModelComponentImplImpl;
        private final HostFragmentComponentImplImpl hostFragmentComponentImplImpl;
        private final HostFragmentViewModelComponentImplImpl hostFragmentViewModelComponentImplImpl;

        private HostFragmentComponentImplImpl(EasyLoginSdkComponentImpl easyLoginSdkComponentImpl, HostActivityViewModelComponentImplImpl hostActivityViewModelComponentImplImpl, HostFragmentViewModelComponentImplImpl hostFragmentViewModelComponentImplImpl, o oVar) {
            this.hostFragmentComponentImplImpl = this;
            this.easyLoginSdkComponentImpl = easyLoginSdkComponentImpl;
            this.hostActivityViewModelComponentImplImpl = hostActivityViewModelComponentImplImpl;
            this.hostFragmentViewModelComponentImplImpl = hostFragmentViewModelComponentImplImpl;
        }

        private uuw injectConnectingFragment(uuw uuwVar) {
            C1058h.a(uuwVar, this.hostFragmentViewModelComponentImplImpl.viewModelProviderFactory());
            Q1 connectingScreenArgs = this.hostFragmentViewModelComponentImplImpl.connectingScreenArgs();
            P1.a.getClass();
            uuwVar.getClass();
            connectingScreenArgs.getClass();
            uuwVar.g = connectingScreenArgs;
            nbt resProvider = this.easyLoginSdkComponentImpl.easyLoginDependencies.getResProvider();
            a4g.s(resProvider);
            uuwVar.h = resProvider;
            return uuwVar;
        }

        private vuw injectConnectionErrorFragment(vuw vuwVar) {
            C1058h.a(vuwVar, this.hostFragmentViewModelComponentImplImpl.viewModelProviderFactory());
            B2 b2 = (B2) this.hostFragmentViewModelComponentImplImpl.provideDetectedScreenArgsProvider.get();
            Y1.a.getClass();
            vuwVar.getClass();
            b2.getClass();
            vuwVar.g = b2;
            nbt resProvider = this.easyLoginSdkComponentImpl.easyLoginDependencies.getResProvider();
            a4g.s(resProvider);
            vuwVar.h = resProvider;
            return vuwVar;
        }

        private wuw injectConnectionSuccessFragment(wuw wuwVar) {
            C1058h.a(wuwVar, this.hostFragmentViewModelComponentImplImpl.viewModelProviderFactory());
            B2 b2 = (B2) this.hostFragmentViewModelComponentImplImpl.provideDetectedScreenArgsProvider.get();
            C1033f2.a.getClass();
            wuwVar.getClass();
            b2.getClass();
            wuwVar.g = b2;
            nbt resProvider = this.easyLoginSdkComponentImpl.easyLoginDependencies.getResProvider();
            a4g.s(resProvider);
            wuwVar.h = resProvider;
            return wuwVar;
        }

        private xuw injectEnterCodeFragment(xuw xuwVar) {
            C1058h.a(xuwVar, this.hostFragmentViewModelComponentImplImpl.viewModelProviderFactory());
            B2 b2 = (B2) this.hostFragmentViewModelComponentImplImpl.provideDetectedScreenArgsProvider.get();
            C1006d3.a.getClass();
            xuwVar.getClass();
            b2.getClass();
            b2.getClass();
            xuwVar.g = b2;
            return xuwVar;
        }

        private yuw injectFoundTvStubFragment(yuw yuwVar) {
            C1058h.a(yuwVar, this.hostFragmentViewModelComponentImplImpl.viewModelProviderFactory());
            B2 b2 = (B2) this.hostFragmentViewModelComponentImplImpl.provideDetectedScreenArgsProvider.get();
            J3.a.getClass();
            yuwVar.getClass();
            b2.getClass();
            yuwVar.g = b2;
            K k = (K) this.easyLoginSdkComponentImpl.provideApplicationConfigProvider.get();
            k.getClass();
            yuwVar.h = k;
            nbt resProvider = this.easyLoginSdkComponentImpl.easyLoginDependencies.getResProvider();
            a4g.s(resProvider);
            yuwVar.i = resProvider;
            return yuwVar;
        }

        private zuw injectInstallTvAppFragment(zuw zuwVar) {
            C1058h.a(zuwVar, this.hostFragmentViewModelComponentImplImpl.viewModelProviderFactory());
            B2 b2 = (B2) this.hostFragmentViewModelComponentImplImpl.provideDetectedScreenArgsProvider.get();
            Z4.a.getClass();
            zuwVar.getClass();
            b2.getClass();
            zuwVar.g = b2;
            nbt resProvider = this.easyLoginSdkComponentImpl.easyLoginDependencies.getResProvider();
            a4g.s(resProvider);
            zuwVar.h = resProvider;
            return zuwVar;
        }

        private C1180p9 injectTvAuthBottomSheetFragment(C1180p9 c1180p9) {
            gfu viewModelProviderFactory = this.hostFragmentViewModelComponentImplImpl.viewModelProviderFactory();
            C0974b.a.getClass();
            c1180p9.getClass();
            viewModelProviderFactory.getClass();
            c1180p9.a = viewModelProviderFactory;
            nbt resProvider = this.easyLoginSdkComponentImpl.easyLoginDependencies.getResProvider();
            a4g.s(resProvider);
            C1275w9.a.getClass();
            c1180p9.d = resProvider;
            C1166o9 tvAuthArgs = this.hostFragmentViewModelComponentImplImpl.tvAuthArgs();
            tvAuthArgs.getClass();
            c1180p9.e = tvAuthArgs;
            return c1180p9;
        }

        private V9 injectTvAuthTabletDialogFragment(V9 v9) {
            gfu viewModelProviderFactory = this.hostFragmentViewModelComponentImplImpl.viewModelProviderFactory();
            C1030f.a.getClass();
            v9.getClass();
            viewModelProviderFactory.getClass();
            v9.a = viewModelProviderFactory;
            nbt resProvider = this.easyLoginSdkComponentImpl.easyLoginDependencies.getResProvider();
            a4g.s(resProvider);
            C0999ca.a.getClass();
            v9.d = resProvider;
            C1166o9 tvAuthArgs = this.hostFragmentViewModelComponentImplImpl.tvAuthArgs();
            tvAuthArgs.getClass();
            v9.e = tvAuthArgs;
            return v9;
        }

        private C1055ga injectTvDetectedBottomSheetFragment(C1055ga c1055ga) {
            gfu viewModelProviderFactory = this.hostFragmentViewModelComponentImplImpl.viewModelProviderFactory();
            C0974b.a.getClass();
            c1055ga.getClass();
            viewModelProviderFactory.getClass();
            c1055ga.getClass();
            viewModelProviderFactory.getClass();
            c1055ga.a = viewModelProviderFactory;
            C1153na c1153na = (C1153na) this.hostActivityViewModelComponentImplImpl.tvDetectedContainerRouterProvider.get();
            C1097ja.a.getClass();
            c1153na.getClass();
            c1153na.getClass();
            c1055ga.c = c1153na;
            return c1055ga;
        }

        private C1276wa injectTvDetectedTabletDialogFragment(C1276wa c1276wa) {
            gfu viewModelProviderFactory = this.hostFragmentViewModelComponentImplImpl.viewModelProviderFactory();
            C1030f.a.getClass();
            c1276wa.getClass();
            viewModelProviderFactory.getClass();
            c1276wa.getClass();
            viewModelProviderFactory.getClass();
            c1276wa.a = viewModelProviderFactory;
            C1153na c1153na = (C1153na) this.hostActivityViewModelComponentImplImpl.tvDetectedContainerRouterProvider.get();
            C1315za.a.getClass();
            c1153na.getClass();
            c1153na.getClass();
            c1276wa.e = c1153na;
            return c1276wa;
        }

        private Ca injectTvDiscoveryBottomSheetFragment(Ca ca) {
            gfu viewModelProviderFactory = this.hostFragmentViewModelComponentImplImpl.viewModelProviderFactory();
            C0974b.a.getClass();
            ca.getClass();
            viewModelProviderFactory.getClass();
            ca.a = viewModelProviderFactory;
            K k = (K) this.easyLoginSdkComponentImpl.provideApplicationConfigProvider.get();
            La.a.getClass();
            k.getClass();
            ca.d = k;
            nbt resProvider = this.easyLoginSdkComponentImpl.easyLoginDependencies.getResProvider();
            a4g.s(resProvider);
            ca.e = resProvider;
            return ca;
        }

        private C0972ab injectTvDiscoveryTabletDialogFragment(C0972ab c0972ab) {
            gfu viewModelProviderFactory = this.hostFragmentViewModelComponentImplImpl.viewModelProviderFactory();
            C1030f.a.getClass();
            c0972ab.getClass();
            viewModelProviderFactory.getClass();
            c0972ab.a = viewModelProviderFactory;
            K k = (K) this.easyLoginSdkComponentImpl.provideApplicationConfigProvider.get();
            C1098jb.a.getClass();
            k.getClass();
            c0972ab.d = k;
            nbt resProvider = this.easyLoginSdkComponentImpl.easyLoginDependencies.getResProvider();
            a4g.s(resProvider);
            c0972ab.e = resProvider;
            return c0972ab;
        }

        private avw injectUpdateCodeFragment(avw avwVar) {
            C1058h.a(avwVar, this.hostFragmentViewModelComponentImplImpl.viewModelProviderFactory());
            B2 b2 = (B2) this.hostFragmentViewModelComponentImplImpl.provideDetectedScreenArgsProvider.get();
            Bc.a.getClass();
            avwVar.getClass();
            b2.getClass();
            avwVar.g = b2;
            nbt resProvider = this.easyLoginSdkComponentImpl.easyLoginDependencies.getResProvider();
            a4g.s(resProvider);
            avwVar.h = resProvider;
            return avwVar;
        }

        @Override // ru.kinopoisk.sdk.easylogin.internal.di.HostFragmentComponentImpl, ru.kinopoisk.sdk.easylogin.internal.InterfaceC1069ha
        public void inject(C1055ga c1055ga) {
            injectTvDetectedBottomSheetFragment(c1055ga);
        }

        @Override // ru.kinopoisk.sdk.easylogin.internal.di.HostFragmentComponentImpl, ru.kinopoisk.sdk.easylogin.internal.InterfaceC1289xa
        public void inject(C1276wa c1276wa) {
            injectTvDetectedTabletDialogFragment(c1276wa);
        }

        @Override // ru.kinopoisk.sdk.easylogin.internal.di.HostFragmentComponentImpl, ru.kinopoisk.sdk.easylogin.internal.O1
        public void inject(uuw uuwVar) {
            injectConnectingFragment(uuwVar);
        }

        @Override // ru.kinopoisk.sdk.easylogin.internal.di.HostFragmentComponentImpl, ru.kinopoisk.sdk.easylogin.internal.X1
        public void inject(vuw vuwVar) {
            injectConnectionErrorFragment(vuwVar);
        }

        @Override // ru.kinopoisk.sdk.easylogin.internal.di.HostFragmentComponentImpl, ru.kinopoisk.sdk.easylogin.internal.InterfaceC1019e2
        public void inject(wuw wuwVar) {
            injectConnectionSuccessFragment(wuwVar);
        }

        @Override // ru.kinopoisk.sdk.easylogin.internal.di.HostFragmentComponentImpl, ru.kinopoisk.sdk.easylogin.internal.InterfaceC0992c3
        public void inject(xuw xuwVar) {
            injectEnterCodeFragment(xuwVar);
        }

        @Override // ru.kinopoisk.sdk.easylogin.internal.di.HostFragmentComponentImpl, ru.kinopoisk.sdk.easylogin.internal.I3
        public void inject(yuw yuwVar) {
            injectFoundTvStubFragment(yuwVar);
        }

        @Override // ru.kinopoisk.sdk.easylogin.internal.di.HostFragmentComponentImpl, ru.kinopoisk.sdk.easylogin.internal.Y4
        public void inject(zuw zuwVar) {
            injectInstallTvAppFragment(zuwVar);
        }

        @Override // ru.kinopoisk.sdk.easylogin.internal.di.HostFragmentComponentImpl, ru.kinopoisk.sdk.easylogin.internal.Ac
        public void inject(avw avwVar) {
            injectUpdateCodeFragment(avwVar);
        }

        public /* synthetic */ HostFragmentComponentImplImpl(EasyLoginSdkComponentImpl easyLoginSdkComponentImpl, HostActivityViewModelComponentImplImpl hostActivityViewModelComponentImplImpl, HostFragmentViewModelComponentImplImpl hostFragmentViewModelComponentImplImpl, o oVar, int i) {
            this(easyLoginSdkComponentImpl, hostActivityViewModelComponentImplImpl, hostFragmentViewModelComponentImplImpl, oVar);
        }

        @Override // ru.kinopoisk.sdk.easylogin.internal.di.HostFragmentComponentImpl, ru.kinopoisk.sdk.easylogin.internal.InterfaceC1249u9
        public void inject(C1180p9 c1180p9) {
            injectTvAuthBottomSheetFragment(c1180p9);
        }

        @Override // ru.kinopoisk.sdk.easylogin.internal.di.HostFragmentComponentImpl, ru.kinopoisk.sdk.easylogin.internal.InterfaceC0971aa
        public void inject(V9 v9) {
            injectTvAuthTabletDialogFragment(v9);
        }

        @Override // ru.kinopoisk.sdk.easylogin.internal.di.HostFragmentComponentImpl, ru.kinopoisk.sdk.easylogin.internal.Ja
        public void inject(Ca ca) {
            injectTvDiscoveryBottomSheetFragment(ca);
        }

        @Override // ru.kinopoisk.sdk.easylogin.internal.di.HostFragmentComponentImpl, ru.kinopoisk.sdk.easylogin.internal.InterfaceC1070hb
        public void inject(C0972ab c0972ab) {
            injectTvDiscoveryTabletDialogFragment(c0972ab);
        }
    }

    public static final class HostActivityViewModelComponentImplFactory implements HostActivityViewModelComponentImpl.Factory {
        private final EasyLoginSdkComponentImpl easyLoginSdkComponentImpl;

        private HostActivityViewModelComponentImplFactory(EasyLoginSdkComponentImpl easyLoginSdkComponentImpl) {
            this.easyLoginSdkComponentImpl = easyLoginSdkComponentImpl;
        }

        @Override // ru.kinopoisk.sdk.easylogin.internal.di.HostActivityViewModelComponentImpl.Factory, defpackage.dvw
        public HostActivityViewModelComponentImpl create(f9f f9fVar, Bundle bundle) {
            f9fVar.getClass();
            return new HostActivityViewModelComponentImplImpl(this.easyLoginSdkComponentImpl, f9fVar, bundle, 0);
        }

        public /* synthetic */ HostActivityViewModelComponentImplFactory(EasyLoginSdkComponentImpl easyLoginSdkComponentImpl, int i) {
            this(easyLoginSdkComponentImpl);
        }
    }

    public static final class HostActivityComponentImplFactory implements HostActivityComponentImpl.Factory {
        private final EasyLoginSdkComponentImpl easyLoginSdkComponentImpl;
        private final HostActivityViewModelComponentImplImpl hostActivityViewModelComponentImplImpl;

        private HostActivityComponentImplFactory(EasyLoginSdkComponentImpl easyLoginSdkComponentImpl, HostActivityViewModelComponentImplImpl hostActivityViewModelComponentImplImpl) {
            this.easyLoginSdkComponentImpl = easyLoginSdkComponentImpl;
            this.hostActivityViewModelComponentImplImpl = hostActivityViewModelComponentImplImpl;
        }

        @Override // ru.kinopoisk.sdk.easylogin.internal.di.HostActivityComponentImpl.Factory, defpackage.luw
        public HostActivityComponentImpl create(hn5 hn5Var) {
            hn5Var.getClass();
            return new HostActivityComponentImplImpl(this.easyLoginSdkComponentImpl, this.hostActivityViewModelComponentImplImpl, hn5Var, 0);
        }

        public /* synthetic */ HostActivityComponentImplFactory(EasyLoginSdkComponentImpl easyLoginSdkComponentImpl, HostActivityViewModelComponentImplImpl hostActivityViewModelComponentImplImpl, int i) {
            this(easyLoginSdkComponentImpl, hostActivityViewModelComponentImplImpl);
        }
    }

    public static final class HostFragmentViewModelComponentImplFactory implements HostFragmentViewModelComponentImpl.Factory {
        private final EasyLoginSdkComponentImpl easyLoginSdkComponentImpl;
        private final HostActivityViewModelComponentImplImpl hostActivityViewModelComponentImplImpl;

        private HostFragmentViewModelComponentImplFactory(EasyLoginSdkComponentImpl easyLoginSdkComponentImpl, HostActivityViewModelComponentImplImpl hostActivityViewModelComponentImplImpl) {
            this.easyLoginSdkComponentImpl = easyLoginSdkComponentImpl;
            this.hostActivityViewModelComponentImplImpl = hostActivityViewModelComponentImplImpl;
        }

        @Override // ru.kinopoisk.sdk.easylogin.internal.di.HostFragmentViewModelComponentImpl.Factory, defpackage.kvw
        public HostFragmentViewModelComponentImpl create(f9f f9fVar, Bundle bundle, R3 r3) {
            f9fVar.getClass();
            return new HostFragmentViewModelComponentImplImpl(this.easyLoginSdkComponentImpl, this.hostActivityViewModelComponentImplImpl, f9fVar, bundle, r3, 0);
        }

        public /* synthetic */ HostFragmentViewModelComponentImplFactory(EasyLoginSdkComponentImpl easyLoginSdkComponentImpl, HostActivityViewModelComponentImplImpl hostActivityViewModelComponentImplImpl, int i) {
            this(easyLoginSdkComponentImpl, hostActivityViewModelComponentImplImpl);
        }
    }

    public static final class HostActivityComponentImplImpl implements HostActivityComponentImpl {
        private final EasyLoginSdkComponentImpl easyLoginSdkComponentImpl;
        private final HostActivityComponentImplImpl hostActivityComponentImplImpl;
        private final HostActivityViewModelComponentImplImpl hostActivityViewModelComponentImplImpl;

        private HostActivityComponentImplImpl(EasyLoginSdkComponentImpl easyLoginSdkComponentImpl, HostActivityViewModelComponentImplImpl hostActivityViewModelComponentImplImpl, hn5 hn5Var) {
            this.hostActivityComponentImplImpl = this;
            this.easyLoginSdkComponentImpl = easyLoginSdkComponentImpl;
            this.hostActivityViewModelComponentImplImpl = hostActivityViewModelComponentImplImpl;
        }

        private EasyLoginActivity injectEasyLoginActivity(EasyLoginActivity easyLoginActivity) {
            T7 t7 = (T7) this.hostActivityViewModelComponentImplImpl.activityRouterProvider.get();
            C1002d.a.getClass();
            easyLoginActivity.getClass();
            t7.getClass();
            easyLoginActivity.setRouter(t7);
            gfu viewModelProviderFactory = this.hostActivityViewModelComponentImplImpl.viewModelProviderFactory();
            viewModelProviderFactory.getClass();
            easyLoginActivity.setViewModelsFactory(viewModelProviderFactory);
            EasyLoginActivity_MembersInjector.injectDispatchersProvider(easyLoginActivity, (Q2) this.easyLoginSdkComponentImpl.bindDispatchersProvider.get());
            EasyLoginActivity_MembersInjector.injectDirections(easyLoginActivity, (EasyLoginSdkDirections) this.hostActivityViewModelComponentImplImpl.easyLoginSdkDirectionsProvider.get());
            EasyLoginThemeProvider themeProvider = this.easyLoginSdkComponentImpl.easyLoginDependencies.getThemeProvider();
            a4g.s(themeProvider);
            EasyLoginActivity_MembersInjector.injectThemeProvider(easyLoginActivity, themeProvider);
            EasyLoginActivity_MembersInjector.injectScreenResultDispatcher(easyLoginActivity, (C1300y8) this.easyLoginSdkComponentImpl.provideScreenResultDispatcherProvider.get());
            return easyLoginActivity;
        }

        @Override // ru.kinopoisk.sdk.easylogin.internal.EasyLoginActivityComponent
        public void inject(EasyLoginActivity easyLoginActivity) {
            injectEasyLoginActivity(easyLoginActivity);
        }

        public /* synthetic */ HostActivityComponentImplImpl(EasyLoginSdkComponentImpl easyLoginSdkComponentImpl, HostActivityViewModelComponentImplImpl hostActivityViewModelComponentImplImpl, hn5 hn5Var, int i) {
            this(easyLoginSdkComponentImpl, hostActivityViewModelComponentImplImpl, hn5Var);
        }
    }

    public static final class HostFragmentComponentImplFactory implements HostFragmentComponentImpl.Factory {
        private final EasyLoginSdkComponentImpl easyLoginSdkComponentImpl;
        private final HostActivityViewModelComponentImplImpl hostActivityViewModelComponentImplImpl;
        private final HostFragmentViewModelComponentImplImpl hostFragmentViewModelComponentImplImpl;

        private HostFragmentComponentImplFactory(EasyLoginSdkComponentImpl easyLoginSdkComponentImpl, HostActivityViewModelComponentImplImpl hostActivityViewModelComponentImplImpl, HostFragmentViewModelComponentImplImpl hostFragmentViewModelComponentImplImpl) {
            this.easyLoginSdkComponentImpl = easyLoginSdkComponentImpl;
            this.hostActivityViewModelComponentImplImpl = hostActivityViewModelComponentImplImpl;
            this.hostFragmentViewModelComponentImplImpl = hostFragmentViewModelComponentImplImpl;
        }

        @Override // ru.kinopoisk.sdk.easylogin.internal.di.HostFragmentComponentImpl.Factory, defpackage.ivw
        public HostFragmentComponentImpl create(o oVar) {
            oVar.getClass();
            return new HostFragmentComponentImplImpl(this.easyLoginSdkComponentImpl, this.hostActivityViewModelComponentImplImpl, this.hostFragmentViewModelComponentImplImpl, oVar, 0);
        }

        public /* synthetic */ HostFragmentComponentImplFactory(EasyLoginSdkComponentImpl easyLoginSdkComponentImpl, HostActivityViewModelComponentImplImpl hostActivityViewModelComponentImplImpl, HostFragmentViewModelComponentImplImpl hostFragmentViewModelComponentImplImpl, int i) {
            this(easyLoginSdkComponentImpl, hostActivityViewModelComponentImplImpl, hostFragmentViewModelComponentImplImpl);
        }
    }

    public static final class HostActivityViewModelComponentImplImpl implements HostActivityViewModelComponentImpl {
        private final f9f activityClass;
        private rzm activityRouterProvider;
        private final EasyLoginSdkComponentImpl easyLoginSdkComponentImpl;
        private rzm easyLoginSdkDirectionsProvider;
        private final HostActivityViewModelComponentImplImpl hostActivityViewModelComponentImplImpl;
        private rzm tvDetectedContainerRouterProvider;

        public static final class SwitchingProvider<T> implements rzm {
            private final EasyLoginSdkComponentImpl easyLoginSdkComponentImpl;
            private final HostActivityViewModelComponentImplImpl hostActivityViewModelComponentImplImpl;
            private final int id;

            public SwitchingProvider(EasyLoginSdkComponentImpl easyLoginSdkComponentImpl, HostActivityViewModelComponentImplImpl hostActivityViewModelComponentImplImpl, int i) {
                this.easyLoginSdkComponentImpl = easyLoginSdkComponentImpl;
                this.hostActivityViewModelComponentImplImpl = hostActivityViewModelComponentImplImpl;
                this.id = i;
            }

            @Override // defpackage.szm
            public T get() {
                int i = this.id;
                if (i == 0) {
                    return (T) NavigationActivityModule_Companion_ActivityRouterFactory.activityRouter(this.easyLoginSdkComponentImpl.routerFactoryOfRouter(), this.hostActivityViewModelComponentImplImpl.activityClass, Collections.EMPTY_MAP);
                }
                if (i == 1) {
                    return (T) new EasyLoginSdkDirections((F2) this.easyLoginSdkComponentImpl.bindDeviceSpecificationProvider.get(), (T7) this.hostActivityViewModelComponentImplImpl.activityRouterProvider.get());
                }
                if (i == 2) {
                    return (T) new C1153na((E3) this.easyLoginSdkComponentImpl.providesFeaturesRegistryProvider.get());
                }
                throw new AssertionError(i);
            }
        }

        private HostActivityViewModelComponentImplImpl(EasyLoginSdkComponentImpl easyLoginSdkComponentImpl, f9f f9fVar, Bundle bundle) {
            this.hostActivityViewModelComponentImplImpl = this;
            this.easyLoginSdkComponentImpl = easyLoginSdkComponentImpl;
            this.activityClass = f9fVar;
            initialize(f9fVar, bundle);
        }

        private void initialize(f9f f9fVar, Bundle bundle) {
            this.activityRouterProvider = t8a.b(new SwitchingProvider(this.easyLoginSdkComponentImpl, this.hostActivityViewModelComponentImplImpl, 0));
            this.easyLoginSdkDirectionsProvider = t8a.b(new SwitchingProvider(this.easyLoginSdkComponentImpl, this.hostActivityViewModelComponentImplImpl, 1));
            this.tvDetectedContainerRouterProvider = t8a.b(new SwitchingProvider(this.easyLoginSdkComponentImpl, this.hostActivityViewModelComponentImplImpl, 2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public gfu viewModelProviderFactory() {
            Set set = Collections.EMPTY_SET;
            Tc.a.getClass();
            set.getClass();
            gfu a = Sc.a.a(set);
            a4g.r(a, "Cannot return null from a non-@Nullable @Provides method");
            return a;
        }

        @Override // ru.kinopoisk.sdk.easylogin.internal.di.HostActivityViewModelComponentImpl, defpackage.fvw
        public HostActivityComponentImpl.Factory activityComponentFactory() {
            return new HostActivityComponentImplFactory(this.easyLoginSdkComponentImpl, this.hostActivityViewModelComponentImplImpl, 0);
        }

        @Override // ru.kinopoisk.sdk.easylogin.internal.di.HostActivityViewModelComponentImpl, defpackage.fvw
        public HostFragmentViewModelComponentImpl.Factory fragmentViewModelComponentFactory() {
            return new HostFragmentViewModelComponentImplFactory(this.easyLoginSdkComponentImpl, this.hostActivityViewModelComponentImplImpl, 0);
        }

        public /* synthetic */ HostActivityViewModelComponentImplImpl(EasyLoginSdkComponentImpl easyLoginSdkComponentImpl, f9f f9fVar, Bundle bundle, int i) {
            this(easyLoginSdkComponentImpl, f9fVar, bundle);
        }
    }

    public static final class EasyLoginSdkComponentImpl implements EasyLoginSdkComponent {
        private rzm bindCompositeErrorReporterProvider;
        private rzm bindCompositeLogReporterProvider;
        private rzm bindDeviceSpecificationProvider;
        private rzm bindDispatchersProvider;
        private rzm compositeErrorReporterProvider;
        private rzm compositeLogReporterProvider;
        private rzm configProviderImplProvider;
        private rzm currentPuidProviderImplProvider;
        private rzm dispatchersProviderImplProvider;
        private final EasyLoginDependencies easyLoginDependencies;
        private rzm easyLoginGenaGlobalParamsProvider;
        private rzm easyLoginGenaPlatformParamsProvider;
        private final EasyLoginSdkComponentImpl easyLoginSdkComponentImpl;
        private rzm genaGlobalParamsProvider;
        private rzm genaPlatformParamsProvider;
        private rzm getUserCodeVerifierProvider;
        private rzm googleCastSettingProviderImplProvider;
        private rzm provideAndroidTvInteractorFactoryProvider;
        private rzm provideAppSessionIdProvider;
        private rzm provideApplicationConfigProvider;
        private rzm provideCastAvailabilityProvider;
        private rzm provideCastDevicesManagerProvider;
        private rzm provideCastDevicesManagerProvider2;
        private rzm provideCastDevicesManagerProvider3;
        private rzm provideCastDevicesManagerProvider4;
        private rzm provideCastLoggerProvider;
        private rzm provideCombinedCastDeviceManagerProvider;
        private rzm provideConfigProviderFactoryProvider;
        private rzm provideDeferredConfigProvider;
        private rzm provideDeviceIdentifierProvider;
        private rzm provideEasyLoginAnalyticsProvider;
        private rzm provideEvgenAnalyticsProvider;
        private rzm provideEvgenEasyLoginAnalyticsProvider;
        private rzm provideExpsProvider;
        private rzm provideGoogleCastDevicesManagerProvider;
        private rzm provideLgDiscoveryManagerDelegateProvider;
        private rzm provideLgTvInteractorFactoryProvider;
        private rzm provideLocalSessionIdProvider;
        private rzm provideNetworkStateProvider;
        private rzm providePairingManagerProvider;
        private rzm provideSamsungTvInteractorFactoryProvider;
        private rzm provideScreenResultDispatcherProvider;
        private rzm provideSharedPreferencesProvider;
        private rzm providesFeaturesRegistryProvider;

        public static final class SwitchingProvider<T> implements rzm {
            private final EasyLoginSdkComponentImpl easyLoginSdkComponentImpl;
            private final int id;

            public SwitchingProvider(EasyLoginSdkComponentImpl easyLoginSdkComponentImpl, int i) {
                this.easyLoginSdkComponentImpl = easyLoginSdkComponentImpl;
                this.id = i;
            }

            @Override // defpackage.szm
            public T get() {
                int i = this.id;
                switch (i) {
                    case 0:
                        Context context = this.easyLoginSdkComponentImpl.easyLoginDependencies.getContext();
                        a4g.s(context);
                        return (T) new I4(context);
                    case 1:
                        return (T) NavigationModule_Companion_ProvidesFeaturesRegistryFactory.providesFeaturesRegistry(this.easyLoginSdkComponentImpl.setOfFeatureInitializer());
                    case 2:
                        return (T) new R2();
                    case 3:
                        Context context2 = this.easyLoginSdkComponentImpl.easyLoginDependencies.getContext();
                        a4g.s(context2);
                        return (T) LibraryModule_Companion_BindDeviceSpecificationProviderFactory.bindDeviceSpecificationProvider(context2);
                    case 4:
                        return (T) NavigationModule_Companion_ProvideScreenResultDispatcherFactory.provideScreenResultDispatcher();
                    case 5:
                        T t = (T) this.easyLoginSdkComponentImpl.easyLoginDependencies.getUserCodeVerifier();
                        a4g.s(t);
                        return t;
                    case 6:
                        return (T) new ConfigProviderImpl(this.easyLoginSdkComponentImpl.easyLoginDependencies);
                    case 7:
                        return (T) LgCastModule_ProvideLgTvInteractorFactoryFactory.provideLgTvInteractorFactory((N5) this.easyLoginSdkComponentImpl.provideLgDiscoveryManagerDelegateProvider.get(), (Q2) this.easyLoginSdkComponentImpl.bindDispatchersProvider.get(), (F0) this.easyLoginSdkComponentImpl.provideCastLoggerProvider.get());
                    case 8:
                        Context context3 = this.easyLoginSdkComponentImpl.easyLoginDependencies.getContext();
                        a4g.s(context3);
                        return (T) LgCastModule_ProvideLgDiscoveryManagerDelegateFactory.provideLgDiscoveryManagerDelegate(context3);
                    case 9:
                        return (T) CastModule_Companion_ProvideCastLoggerFactory.provideCastLogger((InterfaceC1188q3) this.easyLoginSdkComponentImpl.bindCompositeErrorReporterProvider.get(), (InterfaceC1093j6) this.easyLoginSdkComponentImpl.bindCompositeLogReporterProvider.get(), (SharedPreferences) this.easyLoginSdkComponentImpl.provideSharedPreferencesProvider.get());
                    case 10:
                        return (T) new C1306z1(this.easyLoginSdkComponentImpl.setOfErrorReporter());
                    case 11:
                        return (T) new A1(this.easyLoginSdkComponentImpl.setOfLogReporter());
                    case 12:
                        Context context4 = this.easyLoginSdkComponentImpl.easyLoginDependencies.getContext();
                        a4g.s(context4);
                        return (T) EvgenAnalyticsModule_ProvideSharedPreferencesFactory.provideSharedPreferences(context4);
                    case 13:
                        Context context5 = this.easyLoginSdkComponentImpl.easyLoginDependencies.getContext();
                        a4g.s(context5);
                        return (T) SamsungCastModule_ProvideSamsungTvInteractorFactoryFactory.provideSamsungTvInteractorFactory(context5, (Q2) this.easyLoginSdkComponentImpl.bindDispatchersProvider.get());
                    case 14:
                        return (T) GoogleCastModule_ProvideAndroidTvInteractorFactoryFactory.provideAndroidTvInteractorFactory((Q2) this.easyLoginSdkComponentImpl.bindDispatchersProvider.get(), (F4) this.easyLoginSdkComponentImpl.provideGoogleCastDevicesManagerProvider.get(), (InterfaceC1192q7) this.easyLoginSdkComponentImpl.providePairingManagerProvider.get());
                    case 15:
                        Context context6 = this.easyLoginSdkComponentImpl.easyLoginDependencies.getContext();
                        a4g.s(context6);
                        return (T) GoogleCastModule_ProvideGoogleCastDevicesManagerFactory.provideGoogleCastDevicesManager(context6, (H4) this.easyLoginSdkComponentImpl.googleCastSettingProviderImplProvider.get(), (F0) this.easyLoginSdkComponentImpl.provideCastLoggerProvider.get(), (Q2) this.easyLoginSdkComponentImpl.bindDispatchersProvider.get());
                    case 16:
                        Context context7 = this.easyLoginSdkComponentImpl.easyLoginDependencies.getContext();
                        a4g.s(context7);
                        return (T) KinopoiskCastModule_ProvidePairingManagerFactory.providePairingManager(context7, (O6) this.easyLoginSdkComponentImpl.provideNetworkStateProvider.get(), (Q2) this.easyLoginSdkComponentImpl.bindDispatchersProvider.get());
                    case 17:
                        Context context8 = this.easyLoginSdkComponentImpl.easyLoginDependencies.getContext();
                        a4g.s(context8);
                        return (T) NetworkModule_Companion_ProvideNetworkStateProviderFactory.provideNetworkStateProvider(context8);
                    case 18:
                        CurrentAccountInfoProvider currentAccountInfoProvider = this.easyLoginSdkComponentImpl.easyLoginDependencies.getCurrentAccountInfoProvider();
                        a4g.s(currentAccountInfoProvider);
                        return (T) new CurrentPuidProviderImpl(currentAccountInfoProvider);
                    case 19:
                        return (T) EvgenAnalyticsModule_ProvideEvgenEasyLoginAnalyticsFactory.provideEvgenEasyLoginAnalytics(this.easyLoginSdkComponentImpl.evgenEasyLoginAnalyticsTracker(), (EvgenEasyLoginAnalyticsGlobalParamsProvider) this.easyLoginSdkComponentImpl.easyLoginGenaGlobalParamsProvider.get(), (EvgenEasyLoginAnalyticsPlatformParamsProvider) this.easyLoginSdkComponentImpl.easyLoginGenaPlatformParamsProvider.get());
                    case 20:
                        EasyLoginAnalyticsFactory analyticsFactory = this.easyLoginSdkComponentImpl.easyLoginDependencies.getAnalyticsFactory();
                        a4g.s(analyticsFactory);
                        return (T) EvgenAnalyticsModule_ProvideEasyLoginAnalyticsFactory.provideEasyLoginAnalytics(analyticsFactory);
                    case 21:
                        return (T) new EasyLoginGenaGlobalParamsProvider((InterfaceC1228t2) this.easyLoginSdkComponentImpl.currentPuidProviderImplProvider.get(), (Q2) this.easyLoginSdkComponentImpl.bindDispatchersProvider.get(), (D2) this.easyLoginSdkComponentImpl.provideDeviceIdentifierProvider.get(), (B3) this.easyLoginSdkComponentImpl.provideExpsProvider.get(), this.easyLoginSdkComponentImpl.evgenFeatureFlagsProvider(), (F2) this.easyLoginSdkComponentImpl.bindDeviceSpecificationProvider.get(), (G) this.easyLoginSdkComponentImpl.provideAppSessionIdProvider.get());
                    case 22:
                        return (T) LibraryModule_Companion_ProvideDeviceIdentifierProviderFactory.provideDeviceIdentifierProvider();
                    case 23:
                        return (T) ConfigModule_ProvideExpsProviderFactory.provideExpsProvider((H1) this.easyLoginSdkComponentImpl.provideConfigProviderFactoryProvider.get());
                    case 24:
                        Context context9 = this.easyLoginSdkComponentImpl.easyLoginDependencies.getContext();
                        a4g.s(context9);
                        return (T) ConfigModule_ProvideConfigProviderFactoryFactory.provideConfigProviderFactory(context9, ConfigModule_ProvideDescriptorsProviderFactory.provideDescriptorsProvider(), (Q2) this.easyLoginSdkComponentImpl.bindDispatchersProvider.get(), ConfigModule.INSTANCE.provideRemoteConfigDiagnosticsCallback());
                    case 25:
                        return (T) ConfigModule_ProvideDeferredConfigProviderFactory.provideDeferredConfigProvider((H1) this.easyLoginSdkComponentImpl.provideConfigProviderFactoryProvider.get());
                    case 26:
                        return (T) LibraryModule_Companion_ProvideAppSessionIdProviderFactory.provideAppSessionIdProvider();
                    case 27:
                        return (T) new EasyLoginGenaPlatformParamsProvider();
                    case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                        return (T) CastModule_Companion_ProvideCombinedCastDeviceManagerFactory.provideCombinedCastDeviceManager((InterfaceC1185q0) this.easyLoginSdkComponentImpl.provideCastAvailabilityProvider.get(), this.easyLoginSdkComponentImpl.mapOfCastTypeAndProviderOfCastDevicesManager(), (F0) this.easyLoginSdkComponentImpl.provideCastLoggerProvider.get(), this.easyLoginSdkComponentImpl.castTrackerImpl());
                    case 29:
                        return (T) CastModule_Companion_ProvideCastAvailabilityProviderFactory.provideCastAvailabilityProvider();
                    case 30:
                        return (T) GoogleCastModule_ProvideCastDevicesManagerFactory.provideCastDevicesManager((F4) this.easyLoginSdkComponentImpl.provideGoogleCastDevicesManagerProvider.get());
                    case com.yandex.pulse.metrics.o.LOW_ENTROPY_SOURCE_FIELD_NUMBER /* 31 */:
                        Context context10 = this.easyLoginSdkComponentImpl.easyLoginDependencies.getContext();
                        a4g.s(context10);
                        return (T) LgCastModule_ProvideCastDevicesManagerFactory.provideCastDevicesManager(context10, StubAuthTokenProvider_AuthTokenProvider_ApplicationComponent_BindingModule_b176c799_ProvideAuthTokenProviderFactory.provideAuthTokenProvider(), (O6) this.easyLoginSdkComponentImpl.provideNetworkStateProvider.get(), (F0) this.easyLoginSdkComponentImpl.provideCastLoggerProvider.get(), (Q2) this.easyLoginSdkComponentImpl.bindDispatchersProvider.get(), (N5) this.easyLoginSdkComponentImpl.provideLgDiscoveryManagerDelegateProvider.get());
                    case 32:
                        Context context11 = this.easyLoginSdkComponentImpl.easyLoginDependencies.getContext();
                        a4g.s(context11);
                        return (T) SamsungCastModule_ProvideCastDevicesManagerFactory.provideCastDevicesManager(context11, StubAuthTokenProvider_AuthTokenProvider_ApplicationComponent_BindingModule_b176c799_ProvideAuthTokenProviderFactory.provideAuthTokenProvider(), (O6) this.easyLoginSdkComponentImpl.provideNetworkStateProvider.get(), (F0) this.easyLoginSdkComponentImpl.provideCastLoggerProvider.get(), (Q2) this.easyLoginSdkComponentImpl.bindDispatchersProvider.get());
                    case com.yandex.pulse.metrics.o.CLIENT_ID_WAS_USED_FOR_TRIAL_ASSIGNMENT_FIELD_NUMBER /* 33 */:
                        return (T) KinopoiskCastModule_ProvideCastDevicesManagerFactory.provideCastDevicesManager(StubAuthTokenProvider_AuthTokenProvider_ApplicationComponent_BindingModule_b176c799_ProvideAuthTokenProviderFactory.provideAuthTokenProvider(), (O6) this.easyLoginSdkComponentImpl.provideNetworkStateProvider.get(), (F0) this.easyLoginSdkComponentImpl.provideCastLoggerProvider.get(), (Q2) this.easyLoginSdkComponentImpl.bindDispatchersProvider.get(), (InterfaceC1192q7) this.easyLoginSdkComponentImpl.providePairingManagerProvider.get());
                    case com.yandex.pulse.metrics.o.CLIENT_UUID_FIELD_NUMBER /* 34 */:
                        return (T) EvgenAnalyticsModule_ProvideEvgenAnalyticsFactory.provideEvgenAnalytics(this.easyLoginSdkComponentImpl.evgenAnalyticsTracker(), (InterfaceC1229t3) this.easyLoginSdkComponentImpl.genaGlobalParamsProvider.get(), (InterfaceC1256v3) this.easyLoginSdkComponentImpl.genaPlatformParamsProvider.get());
                    case 35:
                        return (T) new GenaGlobalParamsProvider((InterfaceC1228t2) this.easyLoginSdkComponentImpl.currentPuidProviderImplProvider.get(), (Q2) this.easyLoginSdkComponentImpl.bindDispatchersProvider.get(), (D2) this.easyLoginSdkComponentImpl.provideDeviceIdentifierProvider.get(), (B3) this.easyLoginSdkComponentImpl.provideExpsProvider.get(), this.easyLoginSdkComponentImpl.evgenFeatureFlagsProvider(), (F2) this.easyLoginSdkComponentImpl.bindDeviceSpecificationProvider.get(), (G) this.easyLoginSdkComponentImpl.provideAppSessionIdProvider.get(), (InterfaceC1023e6) this.easyLoginSdkComponentImpl.provideLocalSessionIdProvider.get());
                    case com.yandex.pulse.metrics.o.IS_EXTENDED_STABLE_CHANNEL_FIELD_NUMBER /* 36 */:
                        return (T) LibraryModule_Companion_ProvideLocalSessionIdProviderFactory.provideLocalSessionIdProvider();
                    case 37:
                        return (T) new GenaPlatformParamsProvider(AppInfoProviderImpl_AppInfoProvider_ApplicationComponent_BindingModule_a965c50c_ProvideAppInfoProviderFactory.provideAppInfoProvider());
                    case 38:
                        return (T) LibraryModule_Companion_ProvideApplicationConfigFactory.provideApplicationConfig();
                    default:
                        throw new AssertionError(i);
                }
            }
        }

        private EasyLoginSdkComponentImpl(EasyLoginDependencies easyLoginDependencies) {
            this.easyLoginSdkComponentImpl = this;
            this.easyLoginDependencies = easyLoginDependencies;
            initialize(easyLoginDependencies);
            initialize2(easyLoginDependencies);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public CastTrackerImpl castTrackerImpl() {
            return new CastTrackerImpl((C1201r3) this.provideEvgenAnalyticsProvider.get(), AnalyticsErrorMapperImpl_AnalyticsErrorMapper_ApplicationComponent_BindingModule_0911859e_ProvideAnalyticsErrorMapperFactory.provideAnalyticsErrorMapper());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public InterfaceC1269w3 evgenAnalyticsTracker() {
            return EvgenAnalyticsModule_ProvideEvgenAnalyticsTrackerFactory.provideEvgenAnalyticsTracker((EasyLoginAnalytics) this.provideEasyLoginAnalyticsProvider.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public EvgenEasyLoginAnalyticsTracker evgenEasyLoginAnalyticsTracker() {
            return EvgenAnalyticsModule_ProvideEvgenEasyLoginAnalyticsTrackerFactory.provideEvgenEasyLoginAnalyticsTracker((EasyLoginAnalytics) this.provideEasyLoginAnalyticsProvider.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public C1282x3 evgenFeatureFlagsProvider() {
            return new C1282x3((F1) this.configProviderImplProvider.get(), (InterfaceC1294y2) this.provideDeferredConfigProvider.get(), ConfigModule_ProvideDescriptorsProviderFactory.provideDescriptorsProvider(), (Q2) this.bindDispatchersProvider.get());
        }

        private void initialize(EasyLoginDependencies easyLoginDependencies) {
            this.googleCastSettingProviderImplProvider = t8a.b(new SwitchingProvider(this.easyLoginSdkComponentImpl, 0));
            this.providesFeaturesRegistryProvider = t8a.b(new SwitchingProvider(this.easyLoginSdkComponentImpl, 1));
            SwitchingProvider switchingProvider = new SwitchingProvider(this.easyLoginSdkComponentImpl, 2);
            this.dispatchersProviderImplProvider = switchingProvider;
            this.bindDispatchersProvider = t8a.b(switchingProvider);
            this.bindDeviceSpecificationProvider = t8a.b(new SwitchingProvider(this.easyLoginSdkComponentImpl, 3));
            this.provideScreenResultDispatcherProvider = t8a.b(new SwitchingProvider(this.easyLoginSdkComponentImpl, 4));
            this.getUserCodeVerifierProvider = new SwitchingProvider(this.easyLoginSdkComponentImpl, 5);
            this.configProviderImplProvider = t8a.b(new SwitchingProvider(this.easyLoginSdkComponentImpl, 6));
            this.provideLgDiscoveryManagerDelegateProvider = t8a.b(new SwitchingProvider(this.easyLoginSdkComponentImpl, 8));
            SwitchingProvider switchingProvider2 = new SwitchingProvider(this.easyLoginSdkComponentImpl, 10);
            this.compositeErrorReporterProvider = switchingProvider2;
            this.bindCompositeErrorReporterProvider = t8a.b(switchingProvider2);
            SwitchingProvider switchingProvider3 = new SwitchingProvider(this.easyLoginSdkComponentImpl, 11);
            this.compositeLogReporterProvider = switchingProvider3;
            this.bindCompositeLogReporterProvider = t8a.b(switchingProvider3);
            this.provideSharedPreferencesProvider = t8a.b(new SwitchingProvider(this.easyLoginSdkComponentImpl, 12));
            this.provideCastLoggerProvider = t8a.b(new SwitchingProvider(this.easyLoginSdkComponentImpl, 9));
            this.provideLgTvInteractorFactoryProvider = t8a.b(new SwitchingProvider(this.easyLoginSdkComponentImpl, 7));
            this.provideSamsungTvInteractorFactoryProvider = t8a.b(new SwitchingProvider(this.easyLoginSdkComponentImpl, 13));
            this.provideGoogleCastDevicesManagerProvider = t8a.b(new SwitchingProvider(this.easyLoginSdkComponentImpl, 15));
            this.provideNetworkStateProvider = t8a.b(new SwitchingProvider(this.easyLoginSdkComponentImpl, 17));
            this.providePairingManagerProvider = t8a.b(new SwitchingProvider(this.easyLoginSdkComponentImpl, 16));
            this.provideAndroidTvInteractorFactoryProvider = t8a.b(new SwitchingProvider(this.easyLoginSdkComponentImpl, 14));
            this.currentPuidProviderImplProvider = t8a.b(new SwitchingProvider(this.easyLoginSdkComponentImpl, 18));
            this.provideEasyLoginAnalyticsProvider = t8a.b(new SwitchingProvider(this.easyLoginSdkComponentImpl, 20));
            this.provideDeviceIdentifierProvider = t8a.b(new SwitchingProvider(this.easyLoginSdkComponentImpl, 22));
            this.provideConfigProviderFactoryProvider = t8a.b(new SwitchingProvider(this.easyLoginSdkComponentImpl, 24));
        }

        private void initialize2(EasyLoginDependencies easyLoginDependencies) {
            this.provideExpsProvider = t8a.b(new SwitchingProvider(this.easyLoginSdkComponentImpl, 23));
            this.provideDeferredConfigProvider = t8a.b(new SwitchingProvider(this.easyLoginSdkComponentImpl, 25));
            this.provideAppSessionIdProvider = t8a.b(new SwitchingProvider(this.easyLoginSdkComponentImpl, 26));
            this.easyLoginGenaGlobalParamsProvider = t8a.b(new SwitchingProvider(this.easyLoginSdkComponentImpl, 21));
            this.easyLoginGenaPlatformParamsProvider = t8a.b(new SwitchingProvider(this.easyLoginSdkComponentImpl, 27));
            this.provideEvgenEasyLoginAnalyticsProvider = t8a.b(new SwitchingProvider(this.easyLoginSdkComponentImpl, 19));
            this.provideCastAvailabilityProvider = t8a.b(new SwitchingProvider(this.easyLoginSdkComponentImpl, 29));
            this.provideCastDevicesManagerProvider = new SwitchingProvider(this.easyLoginSdkComponentImpl, 30);
            this.provideCastDevicesManagerProvider2 = new SwitchingProvider(this.easyLoginSdkComponentImpl, 31);
            this.provideCastDevicesManagerProvider3 = new SwitchingProvider(this.easyLoginSdkComponentImpl, 32);
            this.provideCastDevicesManagerProvider4 = new SwitchingProvider(this.easyLoginSdkComponentImpl, 33);
            this.provideLocalSessionIdProvider = t8a.b(new SwitchingProvider(this.easyLoginSdkComponentImpl, 36));
            this.genaGlobalParamsProvider = t8a.b(new SwitchingProvider(this.easyLoginSdkComponentImpl, 35));
            this.genaPlatformParamsProvider = t8a.b(new SwitchingProvider(this.easyLoginSdkComponentImpl, 37));
            this.provideEvgenAnalyticsProvider = t8a.b(new SwitchingProvider(this.easyLoginSdkComponentImpl, 34));
            this.provideCombinedCastDeviceManagerProvider = t8a.b(new SwitchingProvider(this.easyLoginSdkComponentImpl, 28));
            this.provideApplicationConfigProvider = t8a.b(new SwitchingProvider(this.easyLoginSdkComponentImpl, 38));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<InterfaceC1305z0.c, szm> mapOfCastTypeAndProviderOfCastDevicesManager() {
            LinkedHashMap J = ff7.J(4);
            J.put(InterfaceC1305z0.c.GoogleCast, this.provideCastDevicesManagerProvider);
            J.put(InterfaceC1305z0.c.LgCast, this.provideCastDevicesManagerProvider2);
            J.put(InterfaceC1305z0.c.SamsungCast, this.provideCastDevicesManagerProvider3);
            J.put(InterfaceC1305z0.c.KinopoiskCast, this.provideCastDevicesManagerProvider4);
            return J.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(J);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public InterfaceC0969a8<T7> routerFactoryOfRouter() {
            return NavigationModule_Companion_AppRouterFactoryFactory.appRouterFactory((E3) this.providesFeaturesRegistryProvider.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Set<InterfaceC1188q3> setOfErrorReporter() {
            return Collections.singleton(new C1065h6());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Set<D3> setOfFeatureInitializer() {
            ArrayList arrayList = new ArrayList(4);
            C1250ua c1250ua = C1250ua.a;
            a4g.r(c1250ua, "Cannot return null from a non-@Nullable @Provides method");
            arrayList.add(c1250ua);
            B9 b9 = B9.a;
            a4g.r(b9, "Cannot return null from a non-@Nullable @Provides method");
            arrayList.add(b9);
            Na na = Na.a;
            a4g.r(na, "Cannot return null from a non-@Nullable @Provides method");
            arrayList.add(na);
            Xa xa = Xa.a;
            a4g.r(xa, "Cannot return null from a non-@Nullable @Provides method");
            arrayList.add(xa);
            return arrayList.isEmpty() ? Collections.EMPTY_SET : arrayList.size() == 1 ? Collections.singleton(arrayList.get(0)) : Collections.unmodifiableSet(new HashSet(arrayList));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Set<InterfaceC1093j6> setOfLogReporter() {
            return Collections.singleton(new C1096j9());
        }

        @Override // ru.kinopoisk.sdk.easylogin.internal.di.EasyLoginSdkComponent, defpackage.gvw
        public HostActivityViewModelComponentImpl.Factory activityViewModelComponentFactory() {
            return new HostActivityViewModelComponentImplFactory(this.easyLoginSdkComponentImpl, 0);
        }

        @Override // ru.kinopoisk.sdk.easylogin.internal.di.EasyLoginSdkComponent, ru.kinopoisk.sdk.easylogin.internal.G4
        public H4 getGoogleCastSettingProvider() {
            return (H4) this.googleCastSettingProviderImplProvider.get();
        }

        public /* synthetic */ EasyLoginSdkComponentImpl(EasyLoginDependencies easyLoginDependencies, int i) {
            this(easyLoginDependencies);
        }
    }

    public static final class HostFragmentViewModelComponentImplImpl implements HostFragmentViewModelComponentImpl {
        private final Bundle arguments;
        private rzm connectingViewModelProvider;
        private rzm connectionErrorViewModelProvider;
        private rzm connectionSuccessViewModelProvider;
        private final EasyLoginSdkComponentImpl easyLoginSdkComponentImpl;
        private rzm enterCodeViewModelProvider;
        private rzm foundTvStubViewModelProvider;
        private final f9f fragmentClass;
        private final HostActivityViewModelComponentImplImpl hostActivityViewModelComponentImplImpl;
        private final HostFragmentViewModelComponentImplImpl hostFragmentViewModelComponentImplImpl;
        private rzm installTvAppViewModelProvider;
        private rzm multiSelectViewModelProvider;
        private final R3 parentFragmentViewModelComponent;
        private rzm provideDetectedScreenArgsProvider;
        private rzm provideIsAuthFlowSuccessfulHolderProvider;
        private rzm provideTvAuthScenarioManagerProvider;
        private rzm provideTvDetectedRouterProvider;
        private rzm stateStorageViewModelProvider;
        private rzm tvAuthConfigProvider;
        private rzm tvAuthViewModelProvider;
        private rzm tvDetectedViewModelProvider;
        private rzm tvDiscoveryViewModelProvider;
        private rzm updateCodeViewModelProvider;

        public static final class SwitchingProvider<T> implements rzm {
            private final EasyLoginSdkComponentImpl easyLoginSdkComponentImpl;
            private final HostActivityViewModelComponentImplImpl hostActivityViewModelComponentImplImpl;
            private final HostFragmentViewModelComponentImplImpl hostFragmentViewModelComponentImplImpl;
            private final int id;

            public SwitchingProvider(EasyLoginSdkComponentImpl easyLoginSdkComponentImpl, HostActivityViewModelComponentImplImpl hostActivityViewModelComponentImplImpl, HostFragmentViewModelComponentImplImpl hostFragmentViewModelComponentImplImpl, int i) {
                this.easyLoginSdkComponentImpl = easyLoginSdkComponentImpl;
                this.hostActivityViewModelComponentImplImpl = hostActivityViewModelComponentImplImpl;
                this.hostFragmentViewModelComponentImplImpl = hostFragmentViewModelComponentImplImpl;
                this.id = i;
            }

            @Override // defpackage.szm
            public T get() {
                T t;
                T t2;
                T7 fragmentRouter;
                int i = this.id;
                switch (i) {
                    case 0:
                        HostFragmentViewModelComponentImplImpl hostFragmentViewModelComponentImplImpl = this.hostFragmentViewModelComponentImplImpl;
                        f9f f9fVar = hostFragmentViewModelComponentImplImpl.fragmentClass;
                        R3 r3 = hostFragmentViewModelComponentImplImpl.parentFragmentViewModelComponent;
                        C1208ra.a.getClass();
                        f9fVar.getClass();
                        if (f9fVar.equals(ern.a(C1055ga.class)) ? true : f9fVar.equals(ern.a(C1276wa.class))) {
                            t = (T) new C1078i5();
                        } else {
                            r3.getClass();
                            t = (T) ((InterfaceC1236ta) r3).isAuthFlowSuccessfulHolder();
                        }
                        a4g.r(t, "Cannot return null from a non-@Nullable @Provides method");
                        return t;
                    case 1:
                        HostFragmentViewModelComponentImplImpl hostFragmentViewModelComponentImplImpl2 = this.hostFragmentViewModelComponentImplImpl;
                        f9f f9fVar2 = hostFragmentViewModelComponentImplImpl2.fragmentClass;
                        R3 r32 = hostFragmentViewModelComponentImplImpl2.parentFragmentViewModelComponent;
                        Bundle bundle = hostFragmentViewModelComponentImplImpl2.arguments;
                        C1195qa.a.getClass();
                        f9fVar2.getClass();
                        if (!(f9fVar2.equals(ern.a(C1055ga.class)) ? true : f9fVar2.equals(ern.a(C1276wa.class)))) {
                            r32.getClass();
                            t2 = (T) ((InterfaceC1236ta) r32).detectedScreenArgs();
                        } else {
                            if (bundle == null) {
                                xq0.x("Required value was null.");
                                return null;
                            }
                            Parcelable parcelable = bundle.getParcelable("args");
                            if (parcelable == null) {
                                jj4.j("null cannot be cast to non-null type ru.kinopoisk.tvauth.detected.DetectedScreenArgs");
                                return null;
                            }
                            t2 = (T) ((B2) parcelable);
                        }
                        a4g.r(t2, "Cannot return null from a non-@Nullable @Provides method");
                        return t2;
                    case 2:
                        HostFragmentViewModelComponentImplImpl hostFragmentViewModelComponentImplImpl3 = this.hostFragmentViewModelComponentImplImpl;
                        f9f f9fVar3 = hostFragmentViewModelComponentImplImpl3.fragmentClass;
                        R3 r33 = hostFragmentViewModelComponentImplImpl3.parentFragmentViewModelComponent;
                        rzm rzmVar = hostFragmentViewModelComponentImplImpl3.provideDetectedScreenArgsProvider;
                        EasyLoginSdkComponentImpl easyLoginSdkComponentImpl = this.easyLoginSdkComponentImpl;
                        return (T) TvDetectedScreenDependenciesModule_ProvideTvAuthScenarioManagerFactory.provideTvAuthScenarioManager(f9fVar3, r33, rzmVar, easyLoginSdkComponentImpl.getUserCodeVerifierProvider, hostFragmentViewModelComponentImplImpl3.tvAuthConfigProvider, easyLoginSdkComponentImpl.provideLgTvInteractorFactoryProvider, easyLoginSdkComponentImpl.provideSamsungTvInteractorFactoryProvider, easyLoginSdkComponentImpl.provideAndroidTvInteractorFactoryProvider, easyLoginSdkComponentImpl.configProviderImplProvider, easyLoginSdkComponentImpl.currentPuidProviderImplProvider, easyLoginSdkComponentImpl.provideSharedPreferencesProvider, easyLoginSdkComponentImpl.bindDispatchersProvider);
                    case 3:
                        return (T) new C1288x9((F1) this.easyLoginSdkComponentImpl.configProviderImplProvider.get());
                    case 4:
                        return (T) new C6(this.hostFragmentViewModelComponentImplImpl.multiSelectViewModelConfig());
                    case 5:
                        return (T) new X8();
                    case 6:
                        return (T) new Aa((B2) this.hostFragmentViewModelComponentImplImpl.provideDetectedScreenArgsProvider.get(), (C1167oa) this.hostFragmentViewModelComponentImplImpl.provideTvDetectedRouterProvider.get(), (I9) this.hostFragmentViewModelComponentImplImpl.provideTvAuthScenarioManagerProvider.get(), (C1078i5) this.hostFragmentViewModelComponentImplImpl.provideIsAuthFlowSuccessfulHolderProvider.get(), TvAuthManagerImpl_TvAuthManager_ApplicationComponent_BindingModule_cc37b3cc_ProvideTvAuthManagerFactory.provideTvAuthManager(), (C1288x9) this.hostFragmentViewModelComponentImplImpl.tvAuthConfigProvider.get());
                    case 7:
                        C1153na c1153na = (C1153na) this.hostActivityViewModelComponentImplImpl.tvDetectedContainerRouterProvider.get();
                        HostFragmentViewModelComponentImplImpl hostFragmentViewModelComponentImplImpl4 = this.hostFragmentViewModelComponentImplImpl;
                        rzm rzmVar2 = hostFragmentViewModelComponentImplImpl4.provideDetectedScreenArgsProvider;
                        R3 r34 = hostFragmentViewModelComponentImplImpl4.parentFragmentViewModelComponent;
                        T7 t7 = (T7) this.hostActivityViewModelComponentImplImpl.activityRouterProvider.get();
                        F7 popUpModeProvider = this.hostFragmentViewModelComponentImplImpl.popUpModeProvider();
                        C1222sa.a.getClass();
                        c1153na.getClass();
                        rzmVar2.getClass();
                        t7.getClass();
                        popUpModeProvider.getClass();
                        InterfaceC1236ta interfaceC1236ta = r34 instanceof InterfaceC1236ta ? (InterfaceC1236ta) r34 : null;
                        if (interfaceC1236ta != null && (fragmentRouter = interfaceC1236ta.fragmentRouter()) != null) {
                            t7 = fragmentRouter;
                        }
                        Object obj = rzmVar2.get();
                        obj.getClass();
                        return (T) new C1167oa((B2) obj, c1153na, t7, popUpModeProvider);
                    case 8:
                        return (T) new W1(this.hostFragmentViewModelComponentImplImpl.connectingScreenArgs(), (C1167oa) this.hostFragmentViewModelComponentImplImpl.provideTvDetectedRouterProvider.get(), this.hostFragmentViewModelComponentImplImpl.connectingTrackerImpl(), (I9) this.hostFragmentViewModelComponentImplImpl.provideTvAuthScenarioManagerProvider.get(), this.hostFragmentViewModelComponentImplImpl.tvAppInstallResolver());
                    case 9:
                        return (T) new C1005d2((C1167oa) this.hostFragmentViewModelComponentImplImpl.provideTvDetectedRouterProvider.get(), this.hostFragmentViewModelComponentImplImpl.connectionErrorTrackerImpl());
                    case 10:
                        return (T) new C1103k2((C1167oa) this.hostFragmentViewModelComponentImplImpl.provideTvDetectedRouterProvider.get(), this.hostFragmentViewModelComponentImplImpl.connectionSuccessTrackerImpl(), TvAuthManagerImpl_TvAuthManager_ApplicationComponent_BindingModule_cc37b3cc_ProvideTvAuthManagerFactory.provideTvAuthManager(), (C1078i5) this.hostFragmentViewModelComponentImplImpl.provideIsAuthFlowSuccessfulHolderProvider.get());
                    case 11:
                        return (T) new C1090j3((C1167oa) this.hostFragmentViewModelComponentImplImpl.provideTvDetectedRouterProvider.get(), this.hostFragmentViewModelComponentImplImpl.enterCodeTrackerImpl(), (I9) this.hostFragmentViewModelComponentImplImpl.provideTvAuthScenarioManagerProvider.get(), (C1288x9) this.hostFragmentViewModelComponentImplImpl.tvAuthConfigProvider.get(), (C1300y8) this.easyLoginSdkComponentImpl.provideScreenResultDispatcherProvider.get());
                    case 12:
                        return (T) new O3((C1167oa) this.hostFragmentViewModelComponentImplImpl.provideTvDetectedRouterProvider.get(), TvAuthManagerImpl_TvAuthManager_ApplicationComponent_BindingModule_cc37b3cc_ProvideTvAuthManagerFactory.provideTvAuthManager(), this.hostFragmentViewModelComponentImplImpl.foundTvStubTrackerImpl());
                    case 13:
                        return (T) new C1022e5((C1167oa) this.hostFragmentViewModelComponentImplImpl.provideTvDetectedRouterProvider.get(), this.hostFragmentViewModelComponentImplImpl.installTvAppTrackerImpl(), (I9) this.hostFragmentViewModelComponentImplImpl.provideTvAuthScenarioManagerProvider.get(), (C1288x9) this.hostFragmentViewModelComponentImplImpl.tvAuthConfigProvider.get());
                    case 14:
                        return (T) new Hc((B2) this.hostFragmentViewModelComponentImplImpl.provideDetectedScreenArgsProvider.get(), (C1167oa) this.hostFragmentViewModelComponentImplImpl.provideTvDetectedRouterProvider.get(), this.hostFragmentViewModelComponentImplImpl.updateCodeTrackerImpl(), (I9) this.hostFragmentViewModelComponentImplImpl.provideTvAuthScenarioManagerProvider.get(), this.hostFragmentViewModelComponentImplImpl.tvAppInstallResolver());
                    case 15:
                        return (T) new C1027ea(this.hostFragmentViewModelComponentImplImpl.tvAuthDirections(), TvAuthManagerImpl_TvAuthManager_ApplicationComponent_BindingModule_cc37b3cc_ProvideTvAuthManagerFactory.provideTvAuthManager(), this.hostFragmentViewModelComponentImplImpl.tvAuthTrackerImpl());
                    case 16:
                        return (T) new C1223sb(this.hostFragmentViewModelComponentImplImpl.discoveryDirections(), this.hostFragmentViewModelComponentImplImpl.tvSearchManager(), (Q2) this.easyLoginSdkComponentImpl.bindDispatchersProvider.get(), this.hostFragmentViewModelComponentImplImpl.tvShowInDiscoveryResolver(), (C1288x9) this.hostFragmentViewModelComponentImplImpl.tvAuthConfigProvider.get(), this.hostFragmentViewModelComponentImplImpl.tvDiscoveryTrackerImpl(), this.hostFragmentViewModelComponentImplImpl.tvDiscoveryArgs());
                    default:
                        throw new AssertionError(i);
                }
            }
        }

        private HostFragmentViewModelComponentImplImpl(EasyLoginSdkComponentImpl easyLoginSdkComponentImpl, HostActivityViewModelComponentImplImpl hostActivityViewModelComponentImplImpl, f9f f9fVar, Bundle bundle, R3 r3) {
            this.hostFragmentViewModelComponentImplImpl = this;
            this.easyLoginSdkComponentImpl = easyLoginSdkComponentImpl;
            this.hostActivityViewModelComponentImplImpl = hostActivityViewModelComponentImplImpl;
            this.fragmentClass = f9fVar;
            this.parentFragmentViewModelComponent = r3;
            this.arguments = bundle;
            initialize(f9fVar, bundle, r3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Q1 connectingScreenArgs() {
            Bundle bundle = this.arguments;
            U3.a.getClass();
            if (bundle == null) {
                xq0.x("Required value was null.");
                return null;
            }
            Parcelable parcelable = bundle.getParcelable("args");
            parcelable.getClass();
            return (Q1) parcelable;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ConnectingTrackerImpl connectingTrackerImpl() {
            return new ConnectingTrackerImpl((B2) this.provideDetectedScreenArgsProvider.get(), (EvgenEasyLoginAnalytics) this.easyLoginSdkComponentImpl.provideEvgenEasyLoginAnalyticsProvider.get(), EasyLoginAnalyticsErrorMapperImpl_EasyLoginAnalyticsErrorMapper_ApplicationComponent_BindingModule_ef449d6b_ProvideEasyLoginAnalyticsErrorMapperFactory.provideEasyLoginAnalyticsErrorMapper());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ConnectionErrorTrackerImpl connectionErrorTrackerImpl() {
            return new ConnectionErrorTrackerImpl((B2) this.provideDetectedScreenArgsProvider.get(), (EvgenEasyLoginAnalytics) this.easyLoginSdkComponentImpl.provideEvgenEasyLoginAnalyticsProvider.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ConnectionSuccessTrackerImpl connectionSuccessTrackerImpl() {
            return new ConnectionSuccessTrackerImpl((B2) this.provideDetectedScreenArgsProvider.get(), (EvgenEasyLoginAnalytics) this.easyLoginSdkComponentImpl.provideEvgenEasyLoginAnalyticsProvider.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public O2 discoveryDirections() {
            return new O2(fragmentRouter(), popUpModeProvider());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public EnterCodeTrackerImpl enterCodeTrackerImpl() {
            return new EnterCodeTrackerImpl((B2) this.provideDetectedScreenArgsProvider.get(), (EvgenEasyLoginAnalytics) this.easyLoginSdkComponentImpl.provideEvgenEasyLoginAnalyticsProvider.get(), EasyLoginAnalyticsErrorMapperImpl_EasyLoginAnalyticsErrorMapper_ApplicationComponent_BindingModule_ef449d6b_ProvideEasyLoginAnalyticsErrorMapperFactory.provideEasyLoginAnalyticsErrorMapper());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public FoundTvStubTrackerImpl foundTvStubTrackerImpl() {
            return new FoundTvStubTrackerImpl((B2) this.provideDetectedScreenArgsProvider.get(), (EvgenEasyLoginAnalytics) this.easyLoginSdkComponentImpl.provideEvgenEasyLoginAnalyticsProvider.get());
        }

        private void initialize(f9f f9fVar, Bundle bundle, R3 r3) {
            this.provideIsAuthFlowSuccessfulHolderProvider = t8a.b(new SwitchingProvider(this.easyLoginSdkComponentImpl, this.hostActivityViewModelComponentImplImpl, this.hostFragmentViewModelComponentImplImpl, 0));
            this.provideDetectedScreenArgsProvider = t8a.b(new SwitchingProvider(this.easyLoginSdkComponentImpl, this.hostActivityViewModelComponentImplImpl, this.hostFragmentViewModelComponentImplImpl, 1));
            this.tvAuthConfigProvider = new SwitchingProvider(this.easyLoginSdkComponentImpl, this.hostActivityViewModelComponentImplImpl, this.hostFragmentViewModelComponentImplImpl, 3);
            this.provideTvAuthScenarioManagerProvider = t8a.b(new SwitchingProvider(this.easyLoginSdkComponentImpl, this.hostActivityViewModelComponentImplImpl, this.hostFragmentViewModelComponentImplImpl, 2));
            this.multiSelectViewModelProvider = t8a.b(new SwitchingProvider(this.easyLoginSdkComponentImpl, this.hostActivityViewModelComponentImplImpl, this.hostFragmentViewModelComponentImplImpl, 4));
            this.stateStorageViewModelProvider = new SwitchingProvider(this.easyLoginSdkComponentImpl, this.hostActivityViewModelComponentImplImpl, this.hostFragmentViewModelComponentImplImpl, 5);
            this.provideTvDetectedRouterProvider = t8a.b(new SwitchingProvider(this.easyLoginSdkComponentImpl, this.hostActivityViewModelComponentImplImpl, this.hostFragmentViewModelComponentImplImpl, 7));
            this.tvDetectedViewModelProvider = new SwitchingProvider(this.easyLoginSdkComponentImpl, this.hostActivityViewModelComponentImplImpl, this.hostFragmentViewModelComponentImplImpl, 6);
            this.connectingViewModelProvider = new SwitchingProvider(this.easyLoginSdkComponentImpl, this.hostActivityViewModelComponentImplImpl, this.hostFragmentViewModelComponentImplImpl, 8);
            this.connectionErrorViewModelProvider = new SwitchingProvider(this.easyLoginSdkComponentImpl, this.hostActivityViewModelComponentImplImpl, this.hostFragmentViewModelComponentImplImpl, 9);
            this.connectionSuccessViewModelProvider = new SwitchingProvider(this.easyLoginSdkComponentImpl, this.hostActivityViewModelComponentImplImpl, this.hostFragmentViewModelComponentImplImpl, 10);
            this.enterCodeViewModelProvider = new SwitchingProvider(this.easyLoginSdkComponentImpl, this.hostActivityViewModelComponentImplImpl, this.hostFragmentViewModelComponentImplImpl, 11);
            this.foundTvStubViewModelProvider = new SwitchingProvider(this.easyLoginSdkComponentImpl, this.hostActivityViewModelComponentImplImpl, this.hostFragmentViewModelComponentImplImpl, 12);
            this.installTvAppViewModelProvider = new SwitchingProvider(this.easyLoginSdkComponentImpl, this.hostActivityViewModelComponentImplImpl, this.hostFragmentViewModelComponentImplImpl, 13);
            this.updateCodeViewModelProvider = new SwitchingProvider(this.easyLoginSdkComponentImpl, this.hostActivityViewModelComponentImplImpl, this.hostFragmentViewModelComponentImplImpl, 14);
            this.tvAuthViewModelProvider = new SwitchingProvider(this.easyLoginSdkComponentImpl, this.hostActivityViewModelComponentImplImpl, this.hostFragmentViewModelComponentImplImpl, 15);
            this.tvDiscoveryViewModelProvider = new SwitchingProvider(this.easyLoginSdkComponentImpl, this.hostActivityViewModelComponentImplImpl, this.hostFragmentViewModelComponentImplImpl, 16);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public InstallTvAppTrackerImpl installTvAppTrackerImpl() {
            return new InstallTvAppTrackerImpl((B2) this.provideDetectedScreenArgsProvider.get(), (EvgenEasyLoginAnalytics) this.easyLoginSdkComponentImpl.provideEvgenEasyLoginAnalyticsProvider.get(), EasyLoginAnalyticsErrorMapperImpl_EasyLoginAnalyticsErrorMapper_ApplicationComponent_BindingModule_ef449d6b_ProvideEasyLoginAnalyticsErrorMapperFactory.provideEasyLoginAnalyticsErrorMapper());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public D6 multiSelectViewModelConfig() {
            Map map = Collections.EMPTY_MAP;
            f9f f9fVar = this.fragmentClass;
            F6.a.getClass();
            map.getClass();
            f9fVar.getClass();
            D6 a = E6.a.a(map, f9fVar);
            a4g.r(a, "Cannot return null from a non-@Nullable @Provides method");
            return a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public F7 popUpModeProvider() {
            return new F7((F2) this.easyLoginSdkComponentImpl.bindDeviceSpecificationProvider.get());
        }

        private dfu provideConnectingViewModelInitializer() {
            rzm rzmVar = this.connectingViewModelProvider;
            C1133m4.a.getClass();
            rzmVar.getClass();
            rzmVar.getClass();
            return new dfu(W1.class, new X3(rzmVar));
        }

        private dfu provideConnectionErrorViewModelInitializer() {
            rzm rzmVar = this.connectionErrorViewModelProvider;
            C1147n4.a.getClass();
            rzmVar.getClass();
            rzmVar.getClass();
            return new dfu(C1005d2.class, new Y3(rzmVar));
        }

        private dfu provideConnectionSuccessViewModelInitializer() {
            rzm rzmVar = this.connectionSuccessViewModelProvider;
            C1161o4.a.getClass();
            rzmVar.getClass();
            rzmVar.getClass();
            return new dfu(C1103k2.class, new Z3(rzmVar));
        }

        private dfu provideEnterCodeViewModelInitializer() {
            rzm rzmVar = this.enterCodeViewModelProvider;
            C1175p4.a.getClass();
            rzmVar.getClass();
            rzmVar.getClass();
            return new dfu(C1090j3.class, new C0965a4(rzmVar));
        }

        private dfu provideFoundTvStubViewModelInitializer() {
            rzm rzmVar = this.foundTvStubViewModelProvider;
            C1189q4.a.getClass();
            rzmVar.getClass();
            rzmVar.getClass();
            return new dfu(O3.class, new C0979b4(rzmVar));
        }

        private dfu provideInstallTvAppViewModelInitializer() {
            rzm rzmVar = this.installTvAppViewModelProvider;
            C1202r4.a.getClass();
            rzmVar.getClass();
            rzmVar.getClass();
            return new dfu(C1022e5.class, new C0993c4(rzmVar));
        }

        private dfu provideMultiSelectViewModelInitializer() {
            rzm rzmVar = this.multiSelectViewModelProvider;
            C1216s4.a.getClass();
            rzmVar.getClass();
            rzmVar.getClass();
            return new dfu(C6.class, new C1007d4(rzmVar));
        }

        private dfu provideStateStorageViewModelInitializer() {
            rzm rzmVar = this.stateStorageViewModelProvider;
            C1230t4.a.getClass();
            rzmVar.getClass();
            rzmVar.getClass();
            return new dfu(X8.class, new C1021e4(rzmVar));
        }

        private dfu provideTvAuthViewModelInitializer() {
            rzm rzmVar = this.tvAuthViewModelProvider;
            C1244u4.a.getClass();
            rzmVar.getClass();
            rzmVar.getClass();
            return new dfu(C1027ea.class, new C1035f4(rzmVar));
        }

        private dfu provideTvDetectedViewModelInitializer() {
            rzm rzmVar = this.tvDetectedViewModelProvider;
            C1257v4.a.getClass();
            rzmVar.getClass();
            rzmVar.getClass();
            return new dfu(Aa.class, new C1049g4(rzmVar));
        }

        private dfu provideTvDiscoveryViewModelInitializer() {
            rzm rzmVar = this.tvDiscoveryViewModelProvider;
            C1270w4.a.getClass();
            rzmVar.getClass();
            rzmVar.getClass();
            return new dfu(C1223sb.class, new C1063h4(rzmVar));
        }

        private dfu provideUpdateCodeViewModelInitializer() {
            rzm rzmVar = this.updateCodeViewModelProvider;
            C1283x4.a.getClass();
            rzmVar.getClass();
            rzmVar.getClass();
            return new dfu(Hc.class, new C1077i4(rzmVar));
        }

        private Set<dfu> setOfViewModelInitializerOf() {
            ik0 ik0Var = new ik0();
            ik0Var.a = new ArrayList(12);
            ik0Var.d(provideMultiSelectViewModelInitializer());
            ik0Var.d(provideStateStorageViewModelInitializer());
            ik0Var.d(provideTvDetectedViewModelInitializer());
            ik0Var.d(provideConnectingViewModelInitializer());
            ik0Var.d(provideConnectionErrorViewModelInitializer());
            ik0Var.d(provideConnectionSuccessViewModelInitializer());
            ik0Var.d(provideEnterCodeViewModelInitializer());
            ik0Var.d(provideFoundTvStubViewModelInitializer());
            ik0Var.d(provideInstallTvAppViewModelInitializer());
            ik0Var.d(provideUpdateCodeViewModelInitializer());
            ik0Var.d(provideTvAuthViewModelInitializer());
            ik0Var.d(provideTvDiscoveryViewModelInitializer());
            ArrayList arrayList = ik0Var.a;
            return arrayList.isEmpty() ? Collections.EMPTY_SET : arrayList.size() == 1 ? Collections.singleton(arrayList.get(0)) : Collections.unmodifiableSet(new HashSet(arrayList));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public InterfaceC1138m9 tvAppInstallResolver() {
            return TvDetectedScreenDependenciesModule_ProvideTvAppInstallResolverFactory.provideTvAppInstallResolver((C1288x9) this.tvAuthConfigProvider.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public C1166o9 tvAuthArgs() {
            Bundle bundle = this.arguments;
            V3.a.getClass();
            if (bundle == null) {
                xq0.x("Required value was null.");
                return null;
            }
            Parcelable parcelable = bundle.getParcelable("args");
            parcelable.getClass();
            return (C1166o9) parcelable;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public D9 tvAuthDirections() {
            return new D9(fragmentRouter(), popUpModeProvider());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public TvAuthTrackerImpl tvAuthTrackerImpl() {
            return new TvAuthTrackerImpl((EvgenEasyLoginAnalytics) this.easyLoginSdkComponentImpl.provideEvgenEasyLoginAnalyticsProvider.get(), tvAuthArgs());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Ba tvDiscoveryArgs() {
            Bundle bundle = this.arguments;
            W3.a.getClass();
            if (bundle == null) {
                xq0.x("Required value was null.");
                return null;
            }
            Parcelable parcelable = bundle.getParcelable("args");
            parcelable.getClass();
            return (Ba) parcelable;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public TvDiscoveryTrackerImpl tvDiscoveryTrackerImpl() {
            return new TvDiscoveryTrackerImpl((EvgenEasyLoginAnalytics) this.easyLoginSdkComponentImpl.provideEvgenEasyLoginAnalyticsProvider.get(), EasyLoginAnalyticsErrorMapperImpl_EasyLoginAnalyticsErrorMapper_ApplicationComponent_BindingModule_ef449d6b_ProvideEasyLoginAnalyticsErrorMapperFactory.provideEasyLoginAnalyticsErrorMapper());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Gb tvSearchManager() {
            return new Gb((InterfaceC1305z0) this.easyLoginSdkComponentImpl.provideCombinedCastDeviceManagerProvider.get(), (Q2) this.easyLoginSdkComponentImpl.bindDispatchersProvider.get(), (F4) this.easyLoginSdkComponentImpl.provideGoogleCastDevicesManagerProvider.get(), (InterfaceC1192q7) this.easyLoginSdkComponentImpl.providePairingManagerProvider.get(), tvDiscoveryTrackerImpl(), MockTvProviderImpl_MockTvProvider_ApplicationComponent_BindingModule_2da70ff7_ProvideMockTvProviderFactory.provideMockTvProvider());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Hb tvShowInDiscoveryResolver() {
            return TvDiscoveryScreenDependenciesModule_ProvideTvShowInDiscoveryResolverFactory.provideTvShowInDiscoveryResolver((C1288x9) this.tvAuthConfigProvider.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public UpdateCodeTrackerImpl updateCodeTrackerImpl() {
            return new UpdateCodeTrackerImpl((B2) this.provideDetectedScreenArgsProvider.get(), (EvgenEasyLoginAnalytics) this.easyLoginSdkComponentImpl.provideEvgenEasyLoginAnalyticsProvider.get(), EasyLoginAnalyticsErrorMapperImpl_EasyLoginAnalyticsErrorMapper_ApplicationComponent_BindingModule_ef449d6b_ProvideEasyLoginAnalyticsErrorMapperFactory.provideEasyLoginAnalyticsErrorMapper());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public gfu viewModelProviderFactory() {
            Set<dfu> ofViewModelInitializerOf = setOfViewModelInitializerOf();
            Tc.a.getClass();
            ofViewModelInitializerOf.getClass();
            gfu a = Sc.a.a(ofViewModelInitializerOf);
            a4g.r(a, "Cannot return null from a non-@Nullable @Provides method");
            return a;
        }

        @Override // ru.kinopoisk.sdk.easylogin.internal.di.HostFragmentViewModelComponentImpl, ru.kinopoisk.sdk.easylogin.internal.InterfaceC1236ta
        public B2 detectedScreenArgs() {
            return (B2) this.provideDetectedScreenArgsProvider.get();
        }

        @Override // ru.kinopoisk.sdk.easylogin.internal.di.HostFragmentViewModelComponentImpl, defpackage.lvw
        public HostFragmentComponentImpl.Factory fragmentComponentFactory() {
            return new HostFragmentComponentImplFactory(this.easyLoginSdkComponentImpl, this.hostActivityViewModelComponentImplImpl, this.hostFragmentViewModelComponentImplImpl, 0);
        }

        @Override // ru.kinopoisk.sdk.easylogin.internal.di.HostFragmentViewModelComponentImpl, ru.kinopoisk.sdk.easylogin.internal.InterfaceC1236ta
        public T7 fragmentRouter() {
            return NavigationFragmentModule_Companion_ProvidesRouterFactory.providesRouter((T7) this.hostActivityViewModelComponentImplImpl.activityRouterProvider.get());
        }

        @Override // ru.kinopoisk.sdk.easylogin.internal.di.HostFragmentViewModelComponentImpl, ru.kinopoisk.sdk.easylogin.internal.InterfaceC1236ta
        public C1078i5 isAuthFlowSuccessfulHolder() {
            return (C1078i5) this.provideIsAuthFlowSuccessfulHolderProvider.get();
        }

        @Override // ru.kinopoisk.sdk.easylogin.internal.di.HostFragmentViewModelComponentImpl, ru.kinopoisk.sdk.easylogin.internal.InterfaceC1236ta
        public I9 tvAuthScenarioManager() {
            return (I9) this.provideTvAuthScenarioManagerProvider.get();
        }

        public /* synthetic */ HostFragmentViewModelComponentImplImpl(EasyLoginSdkComponentImpl easyLoginSdkComponentImpl, HostActivityViewModelComponentImplImpl hostActivityViewModelComponentImplImpl, f9f f9fVar, Bundle bundle, R3 r3, int i) {
            this(easyLoginSdkComponentImpl, hostActivityViewModelComponentImplImpl, f9fVar, bundle, r3);
        }
    }
}
