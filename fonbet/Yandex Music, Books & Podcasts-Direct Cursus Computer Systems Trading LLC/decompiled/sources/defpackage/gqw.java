package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.ranges.IntRange;

/* loaded from: classes4.dex */
public final class gqw extends hqw {
    public final jbq f;
    public final rjq g;
    public final um6 h;
    public final jyr i;

    public gqw(diw diwVar, fpw fpwVar, jbq jbqVar) {
        super(diwVar, jbqVar);
        this.f = jbqVar;
        rjq b = hyf.b();
        this.g = b;
        this.h = hld.s(b, dm6.b);
        this.i = diwVar.b(hag.I(hiw.class), true);
    }

    @Override // defpackage.hqw
    public final void c(vpw vpwVar) {
        this.g.g();
        ox6.B(zsd.C(zsd.M0(new f9l(29, new ypw(vpwVar, 1)), new j0v((Continuation) null, this, 9)), 0), this.h, new lot(29, this));
    }

    @Override // defpackage.hqw
    public final void d() {
        this.g.V();
    }

    public final void e(int i) {
        naq p;
        mqs mqsVar;
        long j;
        ssg.a(4, "YnisonRemoteQueue", "setPosition originalPosition=".concat(gxj.a(i)), null);
        jbq jbqVar = this.f;
        IntRange m = yhn.m(0, jbqVar.n().size() + (!jbqVar.q().isEmpty()));
        int i2 = m.a;
        int i3 = m.b;
        if (i2 > i || i > i3 || (p = jbqVar.p(i)) == null || (mqsVar = p.e) == null) {
            return;
        }
        mlw b = b();
        jyr jyrVar = this.d;
        Long a = ((msw) jyrVar.getValue()).a(mqsVar);
        if (a != null) {
            Long l = (((msw) jyrVar.getValue()).a == null || !r1l.c(a.longValue(), mqsVar.e)) ? a : null;
            if (l != null) {
                j = l.longValue();
                b.c.a(new qpw(j, mqsVar.e, i, a().b()));
            }
        }
        j = 0;
        b.c.a(new qpw(j, mqsVar.e, i, a().b()));
    }

    public final void f(boolean z) {
        ArrayList arrayList = null;
        k5r.v("shuffle ", z, 4, "YnisonRemoteQueue", null);
        mlw b = b();
        if (z) {
            arrayList = CollectionsKt.x0(u75.f(this.f.n()));
            Collections.shuffle(arrayList);
        }
        b.c.a(new rpw(arrayList, a().b()));
    }

    public final void g() {
        int i;
        naq p;
        mqs mqsVar;
        long j;
        ssg.a(4, "YnisonRemoteQueue", "skip queue", null);
        jbq jbqVar = this.f;
        gxj t = jbqVar.t(1);
        if (t == null || (p = jbqVar.p((i = t.a))) == null || (mqsVar = p.e) == null) {
            return;
        }
        jyr jyrVar = this.d;
        Long a = ((msw) jyrVar.getValue()).a(mqsVar);
        if (a != null) {
            Long l = (((msw) jyrVar.getValue()).a == null || !r1l.c(a.longValue(), mqsVar.e)) ? a : null;
            if (l != null) {
                j = l.longValue();
                b().c.a(new npw(j, mqsVar.e, i, a().b()));
            }
        }
        j = 0;
        b().c.a(new npw(j, mqsVar.e, i, a().b()));
    }
}
