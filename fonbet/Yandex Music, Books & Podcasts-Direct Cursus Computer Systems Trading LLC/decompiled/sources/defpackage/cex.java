package defpackage;

/* loaded from: classes.dex */
public final class cex implements iex {
    public final lax a;
    public final itk b;

    public cex(itk itkVar, lax laxVar) {
        jwl jwlVar = rbx.a;
        this.b = itkVar;
        this.a = laxVar;
    }

    @Override // defpackage.iex
    public final void a(Object obj) {
        this.b.getClass();
        sex sexVar = ((mcx) obj).zzc;
        if (sexVar.e) {
            sexVar.e = false;
        }
        jwl jwlVar = rbx.a;
        throw ouj.g(obj);
    }

    @Override // defpackage.iex
    public final void b(Object obj, gao gaoVar) {
        throw ouj.g(obj);
    }

    @Override // defpackage.iex
    public final void c(Object obj, Object obj2) {
        jex.p(obj, obj2);
    }

    @Override // defpackage.iex
    public final boolean d(mcx mcxVar, mcx mcxVar2) {
        return mcxVar.zzc.equals(mcxVar2.zzc);
    }

    @Override // defpackage.iex
    public final int e(mcx mcxVar) {
        return mcxVar.zzc.hashCode();
    }

    @Override // defpackage.iex
    public final boolean f(Object obj) {
        throw ouj.g(obj);
    }

    @Override // defpackage.iex
    public final mcx g() {
        lax laxVar = this.a;
        if (laxVar instanceof mcx) {
            return (mcx) ((mcx) laxVar).d(4);
        }
        ecx ecxVar = (ecx) ((mcx) laxVar).d(5);
        boolean c = ecxVar.b.c();
        mcx mcxVar = ecxVar.b;
        if (!c) {
            return mcxVar;
        }
        mcxVar.getClass();
        fex.c.a(mcxVar.getClass()).a(mcxVar);
        mcxVar.j();
        return ecxVar.b;
    }

    @Override // defpackage.iex
    public final int h(lax laxVar) {
        sex sexVar = ((mcx) laxVar).zzc;
        int i = sexVar.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < sexVar.a; i3++) {
            int i4 = sexVar.b[i3] >>> 3;
            gbx gbxVar = (gbx) sexVar.c[i3];
            int q = kbx.q(8);
            int q2 = kbx.q(i4) + kbx.q(16);
            int q3 = kbx.q(24);
            int n = gbxVar.n();
            i2 += q + q + q2 + v3w.a(n, n, q3);
        }
        sexVar.d = i2;
        return i2;
    }

    @Override // defpackage.iex
    public final void i(Object obj, byte[] bArr, int i, int i2, vx0 vx0Var) {
        mcx mcxVar = (mcx) obj;
        if (mcxVar.zzc == sex.f) {
            mcxVar.zzc = sex.b();
        }
        throw ouj.g(obj);
    }
}
