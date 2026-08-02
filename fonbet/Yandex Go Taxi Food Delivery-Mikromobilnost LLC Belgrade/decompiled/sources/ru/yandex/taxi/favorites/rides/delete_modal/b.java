package ru.yandex.taxi.favorites.rides.delete_modal;

import defpackage.tje;

/* loaded from: classes5.dex */
public final class b {
    public final /* synthetic */ c a;

    public b(c cVar) {
        this.a = cVar;
    }

    public final void a() {
        c cVar = this.a;
        tje.N(cVar.o(), null, null, new DeleteModalRouterImpl$DeleteModalNavigatorImpl$dismiss$1(cVar, null), 3);
    }

    public final void b() {
        c cVar = this.a;
        tje.N(cVar.o(), null, null, new DeleteModalRouterImpl$DeleteModalNavigatorImpl$showFailedNotification$1(cVar, null), 3);
    }
}
