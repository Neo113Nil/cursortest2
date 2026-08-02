package ru.kinopoisk.sdk.easylogin.internal.di;

import defpackage.a4g;
import defpackage.f9f;
import defpackage.hn5;
import defpackage.rzm;
import defpackage.szm;
import java.util.Map;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC0969a8;
import ru.kinopoisk.sdk.easylogin.internal.T7;

/* loaded from: classes5.dex */
public final class NavigationActivityModule_Companion_ActivityRouterFactory implements rzm {
    private final szm activityClassProvider;
    private final szm activityRoutersMapProvider;
    private final szm factoryProvider;

    public NavigationActivityModule_Companion_ActivityRouterFactory(szm szmVar, szm szmVar2, szm szmVar3) {
        this.factoryProvider = szmVar;
        this.activityClassProvider = szmVar2;
        this.activityRoutersMapProvider = szmVar3;
    }

    public static T7 activityRouter(InterfaceC0969a8<T7> interfaceC0969a8, f9f f9fVar, Map<Class<? extends hn5>, szm> map) {
        T7 activityRouter = NavigationActivityModule.INSTANCE.activityRouter(interfaceC0969a8, f9fVar, map);
        a4g.t(activityRouter);
        return activityRouter;
    }

    public static NavigationActivityModule_Companion_ActivityRouterFactory create(szm szmVar, szm szmVar2, szm szmVar3) {
        return new NavigationActivityModule_Companion_ActivityRouterFactory(szmVar, szmVar2, szmVar3);
    }

    @Override // defpackage.szm
    public T7 get() {
        return activityRouter((InterfaceC0969a8) this.factoryProvider.get(), (f9f) this.activityClassProvider.get(), (Map) this.activityRoutersMapProvider.get());
    }
}
