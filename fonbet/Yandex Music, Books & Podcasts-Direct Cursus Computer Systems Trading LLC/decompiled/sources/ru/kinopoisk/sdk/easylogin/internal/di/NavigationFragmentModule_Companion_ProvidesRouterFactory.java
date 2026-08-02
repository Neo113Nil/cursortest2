package ru.kinopoisk.sdk.easylogin.internal.di;

import defpackage.a4g;
import defpackage.rzm;
import defpackage.szm;
import ru.kinopoisk.sdk.easylogin.internal.T7;

/* loaded from: classes5.dex */
public final class NavigationFragmentModule_Companion_ProvidesRouterFactory implements rzm {
    private final szm activityRouterProvider;

    public NavigationFragmentModule_Companion_ProvidesRouterFactory(szm szmVar) {
        this.activityRouterProvider = szmVar;
    }

    public static NavigationFragmentModule_Companion_ProvidesRouterFactory create(szm szmVar) {
        return new NavigationFragmentModule_Companion_ProvidesRouterFactory(szmVar);
    }

    public static T7 providesRouter(T7 t7) {
        T7 providesRouter = NavigationFragmentModule.INSTANCE.providesRouter(t7);
        a4g.t(providesRouter);
        return providesRouter;
    }

    @Override // defpackage.szm
    public T7 get() {
        return providesRouter((T7) this.activityRouterProvider.get());
    }
}
