package defpackage;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.selection.j;

/* loaded from: classes10.dex */
public final class zny0 implements yly0 {
    public final /* synthetic */ j a;

    public zny0(j jVar) {
        this.a = jVar;
    }

    @Override // defpackage.yly0
    public final void a() {
    }

    @Override // defpackage.yly0
    public final void b(long j) {
        ery0 d;
        w6u w6uVar;
        j jVar = this.a;
        jVar.q = wu60.f(jVar.q, j);
        oay oayVar = jVar.d;
        if (oayVar == null || (d = oayVar.d()) == null) {
            return;
        }
        jVar.s.setValue(new wu60(wu60.f(jVar.o, jVar.q)));
        int j2 = jVar.b.j(d.b(jVar.j().a, true));
        long c = eja1.c(j2, j2);
        if (asy0.b(c, jVar.o().b)) {
            return;
        }
        oay oayVar2 = jVar.d;
        if ((oayVar2 == null || ((Boolean) oayVar2.q.getValue()).booleanValue()) && (w6uVar = jVar.k) != null) {
            ((lvc0) w6uVar).a(9);
        }
        jVar.c.invoke(j.e(jVar.o().a, c));
        jVar.w = new asy0(c);
    }

    @Override // defpackage.yly0
    public final void c(long j, dkq0 dkq0Var) {
        ery0 d;
        j jVar = this.a;
        long a = qkq0.a(jVar.m(true));
        oay oayVar = jVar.d;
        if (oayVar == null || (d = oayVar.d()) == null) {
            return;
        }
        long e = d.e(a);
        jVar.o = e;
        jVar.s.setValue(new wu60(e));
        jVar.q = 0L;
        jVar.r.setValue(Handle.Cursor);
        jVar.u(false);
    }

    @Override // defpackage.yly0
    public final void d() {
        j jVar = this.a;
        jVar.r.setValue(null);
        jVar.s.setValue(null);
    }

    @Override // defpackage.yly0
    public final void onCancel() {
    }

    @Override // defpackage.yly0
    public final void onStop() {
        j jVar = this.a;
        jVar.r.setValue(null);
        jVar.s.setValue(null);
    }
}
