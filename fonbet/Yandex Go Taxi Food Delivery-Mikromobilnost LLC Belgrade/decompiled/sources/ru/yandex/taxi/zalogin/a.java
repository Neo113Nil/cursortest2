package ru.yandex.taxi.zalogin;

import defpackage.kj;
import defpackage.rjy;
import defpackage.tje;
import ru.yandex.taxi.analytics.Events$Zalogin$LinkageContext;

/* loaded from: classes10.dex */
public final class a implements rjy {
    public final /* synthetic */ d a;

    public a(d dVar) {
        this.a = dVar;
    }

    @Override // defpackage.rjy
    public final void a() {
        this.a.a();
    }

    @Override // defpackage.rjy
    public final void b() {
        this.a.a();
    }

    @Override // defpackage.rjy
    public final void c() {
        this.a.d(true);
    }

    @Override // defpackage.rjy
    public final void d(kj kjVar, Events$Zalogin$LinkageContext events$Zalogin$LinkageContext, Runnable runnable) {
        d dVar = this.a;
        tje.N(dVar.a, null, null, new CoreAccountLinker$loginPortalAndLink$1(dVar, events$Zalogin$LinkageContext, kjVar, runnable, null), 3);
    }

    @Override // defpackage.rjy
    public final void e() {
        this.a.a();
    }
}
