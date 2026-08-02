package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.gfu;
import defpackage.szm;
import defpackage.wwh;
import ru.kinopoisk.sdk.easylogin.api.EasyLoginThemeProvider;

/* loaded from: classes5.dex */
public final class EasyLoginActivity_MembersInjector implements wwh {
    private final szm directionsProvider;
    private final szm dispatchersProvider;
    private final szm routerProvider;
    private final szm screenResultDispatcherProvider;
    private final szm themeProvider;
    private final szm viewModelsFactoryProvider;

    public EasyLoginActivity_MembersInjector(szm szmVar, szm szmVar2, szm szmVar3, szm szmVar4, szm szmVar5, szm szmVar6) {
        this.routerProvider = szmVar;
        this.viewModelsFactoryProvider = szmVar2;
        this.dispatchersProvider = szmVar3;
        this.directionsProvider = szmVar4;
        this.themeProvider = szmVar5;
        this.screenResultDispatcherProvider = szmVar6;
    }

    public static wwh create(szm szmVar, szm szmVar2, szm szmVar3, szm szmVar4, szm szmVar5, szm szmVar6) {
        return new EasyLoginActivity_MembersInjector(szmVar, szmVar2, szmVar3, szmVar4, szmVar5, szmVar6);
    }

    public static void injectDirections(EasyLoginActivity easyLoginActivity, EasyLoginSdkDirections easyLoginSdkDirections) {
        easyLoginActivity.directions = easyLoginSdkDirections;
    }

    public static void injectDispatchersProvider(EasyLoginActivity easyLoginActivity, Q2 q2) {
        easyLoginActivity.dispatchersProvider = q2;
    }

    public static void injectScreenResultDispatcher(EasyLoginActivity easyLoginActivity, C1300y8 c1300y8) {
        easyLoginActivity.screenResultDispatcher = c1300y8;
    }

    public static void injectThemeProvider(EasyLoginActivity easyLoginActivity, EasyLoginThemeProvider easyLoginThemeProvider) {
        easyLoginActivity.themeProvider = easyLoginThemeProvider;
    }

    public void injectMembers(EasyLoginActivity easyLoginActivity) {
        T7 t7 = (T7) this.routerProvider.get();
        C1002d.a.getClass();
        easyLoginActivity.getClass();
        t7.getClass();
        easyLoginActivity.setRouter(t7);
        gfu gfuVar = (gfu) this.viewModelsFactoryProvider.get();
        gfuVar.getClass();
        easyLoginActivity.setViewModelsFactory(gfuVar);
        injectDispatchersProvider(easyLoginActivity, (Q2) this.dispatchersProvider.get());
        injectDirections(easyLoginActivity, (EasyLoginSdkDirections) this.directionsProvider.get());
        injectThemeProvider(easyLoginActivity, (EasyLoginThemeProvider) this.themeProvider.get());
        injectScreenResultDispatcher(easyLoginActivity, (C1300y8) this.screenResultDispatcherProvider.get());
    }
}
