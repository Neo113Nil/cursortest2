package y1;

import java.util.ArrayList;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d extends b {

    /* renamed from: e, reason: collision with root package name */
    public static d f8492e;

    /* renamed from: f, reason: collision with root package name */
    public static final r2.j f8493f = r2.j.f6029h;

    /* renamed from: g, reason: collision with root package name */
    public static final r2.j f8494g = r2.j.f6028g;

    /* renamed from: c, reason: collision with root package name */
    public h2.e0 f8495c;

    /* renamed from: d, reason: collision with root package name */
    public e2.n f8496d;

    @Override // y1.b
    public final int[] a(int i10) {
        int i11;
        if (c().length() <= 0 || i10 >= c().length()) {
            return null;
        }
        try {
            e2.n nVar = this.f8496d;
            if (nVar == null) {
                pc.j.k("node");
                throw null;
            }
            e1.c g8 = nVar.g();
            int round = Math.round(g8.f1934d - g8.f1932b);
            if (i10 <= 0) {
                i10 = 0;
            }
            h2.e0 e0Var = this.f8495c;
            if (e0Var == null) {
                pc.j.k("layoutResult");
                throw null;
            }
            int a6 = e0Var.a(i10);
            h2.e0 e0Var2 = this.f8495c;
            if (e0Var2 == null) {
                pc.j.k("layoutResult");
                throw null;
            }
            float d10 = e0Var2.d(a6) + round;
            h2.e0 e0Var3 = this.f8495c;
            if (e0Var3 == null) {
                pc.j.k("layoutResult");
                throw null;
            }
            if (e0Var3 == null) {
                pc.j.k("layoutResult");
                throw null;
            }
            if (d10 < e0Var3.d(e0Var3.f2652b.f889b - 1)) {
                h2.e0 e0Var4 = this.f8495c;
                if (e0Var4 == null) {
                    pc.j.k("layoutResult");
                    throw null;
                }
                i11 = e0Var4.b(d10);
            } else {
                h2.e0 e0Var5 = this.f8495c;
                if (e0Var5 == null) {
                    pc.j.k("layoutResult");
                    throw null;
                }
                i11 = e0Var5.f2652b.f889b;
            }
            return b(i10, e(i11 - 1, f8494g) + 1);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @Override // y1.b
    public final int[] d(int i10) {
        int i11;
        if (c().length() <= 0 || i10 <= 0) {
            return null;
        }
        try {
            e2.n nVar = this.f8496d;
            if (nVar == null) {
                pc.j.k("node");
                throw null;
            }
            e1.c g8 = nVar.g();
            int round = Math.round(g8.f1934d - g8.f1932b);
            int length = c().length();
            if (length <= i10) {
                i10 = length;
            }
            h2.e0 e0Var = this.f8495c;
            if (e0Var == null) {
                pc.j.k("layoutResult");
                throw null;
            }
            int a6 = e0Var.a(i10);
            h2.e0 e0Var2 = this.f8495c;
            if (e0Var2 == null) {
                pc.j.k("layoutResult");
                throw null;
            }
            float d10 = e0Var2.d(a6) - round;
            if (d10 > 0.0f) {
                h2.e0 e0Var3 = this.f8495c;
                if (e0Var3 == null) {
                    pc.j.k("layoutResult");
                    throw null;
                }
                i11 = e0Var3.b(d10);
            } else {
                i11 = 0;
            }
            if (i10 == c().length() && i11 < a6) {
                i11++;
            }
            return b(e(i11, f8493f), i10);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public final int e(int i10, r2.j jVar) {
        h2.e0 e0Var = this.f8495c;
        if (e0Var == null) {
            pc.j.k("layoutResult");
            throw null;
        }
        int c3 = e0Var.c(i10);
        h2.e0 e0Var2 = this.f8495c;
        if (e0Var2 == null) {
            pc.j.k("layoutResult");
            throw null;
        }
        if (jVar != e0Var2.e(c3)) {
            h2.e0 e0Var3 = this.f8495c;
            if (e0Var3 != null) {
                return e0Var3.c(i10);
            }
            pc.j.k("layoutResult");
            throw null;
        }
        h2.e0 e0Var4 = this.f8495c;
        if (e0Var4 == null) {
            pc.j.k("layoutResult");
            throw null;
        }
        b0.s0 s0Var = e0Var4.f2652b;
        s0Var.g(i10);
        ArrayList arrayList = (ArrayList) s0Var.f892e;
        h2.a aVar = ((h2.n) arrayList.get(h2.z.d(i10, arrayList))).f2686a;
        return (aVar.f2609d.e(i10 - r6.f2689d) + r6.f2687b) - 1;
    }
}
