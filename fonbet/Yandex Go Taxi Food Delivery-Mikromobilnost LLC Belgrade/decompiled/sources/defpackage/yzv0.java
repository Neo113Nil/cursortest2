package defpackage;

import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;

/* loaded from: classes.dex */
public final class yzv0 implements xzv0, o631 {
    public final fva0 a;
    public final lx4 b;
    public final o631 c;

    public yzv0(fva0 fva0Var, lx4 lx4Var, o631 o631Var) {
        this.a = fva0Var;
        this.b = lx4Var;
        this.c = o631Var;
    }

    @Override // defpackage.o631
    public final void a(long j, String str) {
        this.c.a(j, str);
        m(j, "Fetching", str);
    }

    @Override // defpackage.o631
    public final void b(long j, String str) {
        this.c.b(j, str);
    }

    @Override // defpackage.o631
    public final void c(long j, String str) {
        this.c.c(j, str);
        m(j, "PatchPartCaches", str);
    }

    @Override // defpackage.o631
    public final void d(long j, String str) {
        this.c.d(j, str);
        m(j, "DecodingSection", str);
    }

    @Override // defpackage.o631
    public final void e(long j, String str) {
        this.c.e(j, str);
    }

    @Override // defpackage.o631
    public final void f(int i, String str) {
        this.c.f(i, str);
        i d = ((j) this.b).d("SuperappMain.FlexDecoding.HitchRatio");
        d.a.put("name", str);
        d.b(i, "percentage");
        d.m();
    }

    @Override // defpackage.o631
    public final void g(long j, String str) {
        this.c.g(j, str);
        m(j, "Rendering", str);
    }

    @Override // defpackage.o631
    public final void h(long j, String str) {
        this.c.h(j, str);
    }

    @Override // defpackage.o631
    public final void i(long j, String str) {
        this.c.i(j, str);
    }

    @Override // defpackage.o631
    public final void j(long j, String str) {
        this.c.j(j, str);
    }

    @Override // defpackage.o631
    public final void k(long j, String str) {
        this.c.k(j, str);
        m(j, "DecodingDocument", str);
    }

    public final void l(String str, String str2) {
        i d = ((j) this.b).d("SuperappMain.FlexLayout.".concat(str));
        d.a.put("client_request_id", str2);
        d.i();
        d.m();
    }

    public final void m(long j, String str, String str2) {
        i d = ((j) this.b).d("SuperappMain.FlexDecoding.".concat(str));
        d.a.put("name", str2);
        d.c(j, "duration");
        d.m();
    }
}
