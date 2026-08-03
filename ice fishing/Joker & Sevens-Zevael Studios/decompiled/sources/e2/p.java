package e2;

import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import s.a0;
import x1.g0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final g0 f2002a;

    /* renamed from: b, reason: collision with root package name */
    public final d f2003b;

    /* renamed from: c, reason: collision with root package name */
    public final s.k f2004c;

    /* renamed from: d, reason: collision with root package name */
    public final a0 f2005d = new a0(2);

    public p(g0 g0Var, d dVar, s.u uVar) {
        this.f2002a = g0Var;
        this.f2003b = dVar;
        this.f2004c = uVar;
    }

    public final n a() {
        return new n(this.f2003b, false, this.f2002a, new j());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0099 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(g0 g0Var, j jVar) {
        String str;
        boolean z10;
        boolean z11;
        a0 a0Var = this.f2005d;
        Object[] objArr = a0Var.f6219a;
        int i10 = a0Var.f6220b;
        for (int i11 = 0; i11 < i10; i11++) {
            z0.b bVar = (z0.b) objArr[i11];
            s.v vVar = bVar.f9056g;
            y1.r rVar = bVar.f9052c;
            m7.g gVar = bVar.f9050a;
            j u10 = g0Var.u();
            int i12 = g0Var.f8042h;
            String str2 = null;
            if (jVar != null) {
                Object g8 = jVar.f1985g.g(s.B);
                if (g8 == null) {
                    g8 = null;
                }
                h2.e eVar = (h2.e) g8;
                if (eVar != null) {
                    str = eVar.f2648h;
                    if (u10 != null) {
                        Object g10 = u10.f1985g.g(s.B);
                        if (g10 == null) {
                            g10 = null;
                        }
                        h2.e eVar2 = (h2.e) g10;
                        if (eVar2 != null) {
                            str2 = eVar2.f2648h;
                        }
                    }
                    if (str != str2) {
                        if (str == null) {
                            gVar.q(rVar, i12, true);
                        } else if (str2 == null) {
                            gVar.q(rVar, i12, false);
                        } else if (pc.j.a((z0.c) q.d(u10, s.f2042r), z0.k.f9061a)) {
                            ((AutofillManager) gVar.f4957h).notifyValueChanged(rVar, i12, AutofillValue.forText(str2.toString()));
                        }
                    }
                    z10 = jVar == null && jVar.f1985g.b(s.f2041q);
                    z11 = u10 == null && u10.f1985g.b(s.f2041q);
                    if (z10 != z11) {
                        if (z11) {
                            vVar.a(i12);
                        } else {
                            vVar.e(i12);
                        }
                    }
                }
            }
            str = null;
            if (u10 != null) {
            }
            if (str != str2) {
            }
            if (jVar == null) {
            }
            if (u10 == null) {
            }
            if (z10 != z11) {
            }
        }
    }
}
