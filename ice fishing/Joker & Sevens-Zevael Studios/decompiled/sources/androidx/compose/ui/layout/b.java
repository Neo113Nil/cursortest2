package androidx.compose.ui.layout;

import s.u;
import v1.n;
import v1.o;
import v1.p0;
import v1.v0;
import v1.w0;
import v1.x0;
import x1.l0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final u f598a;

    /* renamed from: b, reason: collision with root package name */
    public static final w0[] f599b;

    /* renamed from: c, reason: collision with root package name */
    public static final u f600c;

    static {
        u uVar = new u(8);
        w0.f7163a.getClass();
        x0 x0Var = v0.f7154g;
        uVar.h(1, x0Var);
        x0 x0Var2 = v0.f7153f;
        uVar.h(2, x0Var2);
        x0 x0Var3 = v0.f7149b;
        uVar.h(4, x0Var3);
        x0 x0Var4 = v0.f7151d;
        uVar.h(8, x0Var4);
        x0 x0Var5 = v0.f7155h;
        uVar.h(16, x0Var5);
        x0 x0Var6 = v0.f7152e;
        uVar.h(32, x0Var6);
        x0 x0Var7 = v0.f7156i;
        uVar.h(64, x0Var7);
        f598a = uVar;
        f599b = new w0[]{x0Var, x0Var2, x0Var3, x0Var7, x0Var5, x0Var6, x0Var4, v0.f7157j, v0.f7150c};
        u uVar2 = new u(7);
        uVar2.h(1, x0Var);
        uVar2.h(2, x0Var2);
        uVar2.h(4, x0Var3);
        uVar2.h(16, x0Var5);
        uVar2.h(64, x0Var7);
        uVar2.h(32, x0Var6);
        uVar2.h(8, x0Var4);
        f600c = uVar2;
    }

    public static final void a(l0 l0Var, n nVar, long j3, int i10, int i11) {
        if (p0.f(j3, -1L)) {
            return;
        }
        l0Var.a(nVar.b(), (int) ((j3 >>> 48) & 65535));
        l0Var.a(nVar.d(), (int) ((j3 >>> 32) & 65535));
        l0Var.a(nVar.c(), i10 - ((int) ((j3 >>> 16) & 65535)));
        l0Var.a(nVar.a(), i11 - ((int) (j3 & 65535)));
    }

    public static final y0.n b(o oVar) {
        return new RulerProviderModifierElement(oVar);
    }
}
