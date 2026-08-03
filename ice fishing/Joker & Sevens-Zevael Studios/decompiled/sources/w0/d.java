package w0;

import java.util.Arrays;
import java.util.HashMap;
import s.h0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d extends c {

    /* renamed from: o, reason: collision with root package name */
    public final c f7553o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f7554p;

    public d(long j3, k kVar, oc.c cVar, oc.c cVar2, c cVar3) {
        super(j3, kVar, cVar, cVar2);
        this.f7553o = cVar3;
        cVar3.k();
    }

    @Override // w0.c, w0.g
    public final void c() {
        if (this.f7561c) {
            return;
        }
        super.c();
        if (this.f7554p) {
            return;
        }
        this.f7554p = true;
        this.f7553o.l();
    }

    @Override // w0.c
    public final r w() {
        d dVar;
        c cVar = this.f7553o;
        if (cVar.f7552m || cVar.f7561c) {
            return new h();
        }
        h0 h0Var = this.f7547h;
        long j3 = this.f7560b;
        HashMap c3 = h0Var != null ? m.c(cVar.g(), this, this.f7553o.d()) : null;
        Object obj = m.f7580c;
        synchronized (obj) {
            try {
                m.d(this);
            } catch (Throwable th) {
                th = th;
            }
            try {
                if (h0Var == null || h0Var.f6277d == 0) {
                    dVar = this;
                    a();
                } else {
                    dVar = this;
                    r z10 = dVar.z(this.f7553o.g(), h0Var, c3, this.f7553o.d());
                    if (!z10.equals(i.f7563b)) {
                        return z10;
                    }
                    h0 x10 = dVar.f7553o.x();
                    if (x10 != null) {
                        x10.j(h0Var);
                    } else {
                        dVar.f7553o.B(h0Var);
                        dVar.f7547h = null;
                    }
                }
                if (pc.j.g(dVar.f7553o.g(), j3) < 0) {
                    dVar.f7553o.v();
                }
                c cVar2 = dVar.f7553o;
                cVar2.r(cVar2.d().b(j3).a(dVar.f7549j));
                dVar.f7553o.A(j3);
                c cVar3 = dVar.f7553o;
                int i10 = dVar.f7562d;
                dVar.f7562d = -1;
                if (i10 >= 0) {
                    int[] iArr = cVar3.f7550k;
                    pc.j.e(iArr, "<this>");
                    int length = iArr.length;
                    int[] copyOf = Arrays.copyOf(iArr, length + 1);
                    copyOf[length] = i10;
                    cVar3.f7550k = copyOf;
                } else {
                    cVar3.getClass();
                }
                c cVar4 = dVar.f7553o;
                k kVar = dVar.f7549j;
                cVar4.getClass();
                synchronized (obj) {
                    cVar4.f7549j = cVar4.f7549j.d(kVar);
                    c cVar5 = dVar.f7553o;
                    int[] iArr2 = dVar.f7550k;
                    cVar5.getClass();
                    if (iArr2.length != 0) {
                        int[] iArr3 = cVar5.f7550k;
                        if (iArr3.length != 0) {
                            int length2 = iArr3.length;
                            int length3 = iArr2.length;
                            int[] copyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                            System.arraycopy(iArr2, 0, copyOf2, length2, length3);
                            pc.j.b(copyOf2);
                            iArr2 = copyOf2;
                        }
                        cVar5.f7550k = iArr2;
                    }
                }
                dVar.f7552m = true;
                if (!dVar.f7554p) {
                    dVar.f7554p = true;
                    dVar.f7553o.l();
                }
                return i.f7563b;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }
}
