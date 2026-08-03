package v1;

import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class v implements t0 {

    /* renamed from: g, reason: collision with root package name */
    public s2.l f7144g = s2.l.f6397h;

    /* renamed from: h, reason: collision with root package name */
    public float f7145h;

    /* renamed from: i, reason: collision with root package name */
    public float f7146i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ a0 f7147j;

    public v(a0 a0Var) {
        this.f7147j = a0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0079  */
    @Override // v1.t0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List O(Object obj, oc.e eVar) {
        Object obj2;
        a0 a0Var = this.f7147j;
        a0Var.d();
        x1.g0 g0Var = a0Var.f7052g;
        x1.c0 c0Var = g0Var.J.f8091d;
        x1.c0 c0Var2 = x1.c0.f7982i;
        x1.c0 c0Var3 = x1.c0.f7980g;
        if (c0Var != c0Var3 && c0Var != c0Var2 && c0Var != x1.c0.f7981h && c0Var != x1.c0.f7983j) {
            u1.a.b("subcompose can only be used inside the measure or layout blocks");
        }
        s.g0 g0Var2 = a0Var.f7058m;
        Object g8 = g0Var2.g(obj);
        if (g8 == null) {
            g8 = (x1.g0) a0Var.f7061p.k(obj);
            if (g8 != null) {
                if (a0Var.f7066u <= 0) {
                    u1.a.b("Check failed.");
                }
                a0Var.f7066u--;
            } else {
                g8 = a0Var.i(obj);
                if (g8 == null) {
                    int i10 = a0Var.f7055j;
                    x1.g0 g0Var3 = new x1.g0(2);
                    g0Var.f8055u = true;
                    g0Var.z(i10, g0Var3);
                    g0Var.f8055u = false;
                    g8 = g0Var3;
                }
            }
            g0Var2.m(obj, g8);
        }
        x1.g0 g0Var4 = (x1.g0) g8;
        List n7 = g0Var.n();
        int i11 = a0Var.f7055j;
        if (i11 >= 0) {
            o0.b bVar = (o0.b) n7;
            if (i11 < bVar.f5128g.f5136i) {
                obj2 = bVar.get(i11);
                if (obj2 != g0Var4) {
                    int i12 = ((o0.b) g0Var.n()).f5128g.i(g0Var4);
                    if (i12 < a0Var.f7055j) {
                        u1.a.a("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
                    }
                    int i13 = a0Var.f7055j;
                    if (i13 != i12) {
                        g0Var.f8055u = true;
                        g0Var.K(i12, i13, 1);
                        g0Var.f8055u = false;
                    }
                }
                a0Var.f7055j++;
                a0Var.h(g0Var4, obj, eVar);
                return (c0Var != c0Var3 || c0Var == c0Var2) ? g0Var4.J.f8103p.T() : g0Var4.l();
            }
        }
        obj2 = null;
        if (obj2 != g0Var4) {
        }
        a0Var.f7055j++;
        a0Var.h(g0Var4, obj, eVar);
        if (c0Var != c0Var3) {
        }
    }

    @Override // v1.g0
    public final f0 R(int i10, int i11, Map map, oc.c cVar, oc.c cVar2) {
        if ((i10 & (-16777216)) != 0 || ((-16777216) & i11) != 0) {
            u1.a.b("Size(" + i10 + " x " + i11 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new u(i10, i11, map, cVar, this, this.f7147j, cVar2);
    }

    @Override // s2.c
    public final float c() {
        return this.f7145h;
    }

    @Override // v1.g0
    public final s2.l getLayoutDirection() {
        return this.f7144g;
    }

    @Override // s2.c
    public final float m() {
        return this.f7146i;
    }

    @Override // v1.g0
    public final boolean t() {
        x1.c0 c0Var = this.f7147j.f7052g.J.f8091d;
        return c0Var == x1.c0.f7983j || c0Var == x1.c0.f7981h;
    }
}
