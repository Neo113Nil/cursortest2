package d1;

import d.x;
import s.a0;
import s.h0;
import s.p0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final i f1570a;

    /* renamed from: b, reason: collision with root package name */
    public final y1.r f1571b;

    /* renamed from: c, reason: collision with root package name */
    public final h0 f1572c;

    /* renamed from: d, reason: collision with root package name */
    public final h0 f1573d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1574e;

    public f(i iVar, y1.r rVar) {
        this.f1570a = iVar;
        this.f1571b = rVar;
        int i10 = p0.f6316a;
        this.f1572c = new h0();
        this.f1573d = new h0();
    }

    public final void a() {
        if (this.f1574e) {
            return;
        }
        x xVar = new x(0, this, f.class, "invalidateNodes", "invalidateNodes()V", 0, 0, 2);
        a0 a0Var = this.f1571b.f8645z0;
        if (a0Var.f(xVar) < 0) {
            a0Var.a(xVar);
        }
        this.f1574e = true;
    }
}
