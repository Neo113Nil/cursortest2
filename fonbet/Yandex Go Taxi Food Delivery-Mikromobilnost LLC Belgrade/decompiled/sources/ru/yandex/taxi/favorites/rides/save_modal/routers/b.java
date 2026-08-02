package ru.yandex.taxi.favorites.rides.save_modal.routers;

import defpackage.tje;

/* loaded from: classes5.dex */
public final class b {
    public final /* synthetic */ c a;

    public b(c cVar) {
        this.a = cVar;
    }

    public final void a() {
        c cVar = this.a;
        tje.N(cVar.o(), null, null, new SaveFavoriteRideRootRouterImpl$SaveFavoriteRideNavigatorImpl$dismiss$1(cVar, null), 3);
    }

    public final void b() {
        c cVar = this.a;
        tje.N(cVar.F, null, null, new SaveFavoriteRideRootRouterImpl$SaveFavoriteRideNavigatorImpl$showFailedNotification$1(cVar, null), 3);
    }

    public final void c(String str, String str2) {
        c cVar = this.a;
        tje.N(cVar.F, null, null, new SaveFavoriteRideRootRouterImpl$SaveFavoriteRideNavigatorImpl$showSuccessNotificationAndExit$1(cVar, str, str2, null), 3);
    }
}
