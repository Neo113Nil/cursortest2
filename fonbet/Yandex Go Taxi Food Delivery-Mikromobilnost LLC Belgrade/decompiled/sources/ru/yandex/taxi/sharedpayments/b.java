package ru.yandex.taxi.sharedpayments;

import defpackage.kj;
import defpackage.rjy;
import ru.yandex.taxi.analytics.Events$Zalogin$LinkageContext;

/* loaded from: classes6.dex */
public final class b implements rjy {
    public final /* synthetic */ c a;

    public b(c cVar) {
        this.a = cVar;
    }

    @Override // defpackage.rjy
    public final void a() {
        c.a(this.a);
    }

    @Override // defpackage.rjy
    public final void b() {
        c cVar = this.a;
        cVar.y.c();
        c.a(cVar);
    }

    @Override // defpackage.rjy
    public final void c() {
    }

    @Override // defpackage.rjy
    public final void d(kj kjVar, Events$Zalogin$LinkageContext events$Zalogin$LinkageContext, Runnable runnable) {
        c cVar = this.a;
        cVar.F = com.yandex.go.coroutines.b.g(cVar.a, null, null, new CoreFamilyAccountLinker$openLoginAndLink$1(cVar, runnable, null), 3);
    }

    @Override // defpackage.rjy
    public final void e() {
        c.a(this.a);
    }
}
