package defpackage;

/* loaded from: classes.dex */
public final class ln7 implements ffh {
    public final /* synthetic */ int a;
    public final ffh b;
    public final Enum c;
    public final Enum d;

    public /* synthetic */ ln7(ffh ffhVar, Enum r2, Enum r3, int i) {
        this.a = i;
        this.b = ffhVar;
        this.c = r2;
        this.d = r3;
    }

    @Override // defpackage.ffh
    public final int G(int i) {
        switch (this.a) {
        }
        return this.b.G(i);
    }

    @Override // defpackage.ffh
    public final int J(int i) {
        switch (this.a) {
        }
        return this.b.J(i);
    }

    @Override // defpackage.ffh
    public final ksk M(long j) {
        switch (this.a) {
            case 0:
                jxe jxeVar = (jxe) this.d;
                jxe jxeVar2 = jxe.a;
                gxe gxeVar = (gxe) this.c;
                ffh ffhVar = this.b;
                if (jxeVar == jxeVar2) {
                    return new hgc(gxeVar == gxe.b ? ffhVar.J(ga6.h(j)) : ffhVar.G(ga6.h(j)), ga6.d(j) ? ga6.h(j) : 32767, 0);
                }
                return new hgc(ga6.e(j) ? ga6.i(j) : 32767, gxeVar == gxe.b ? ffhVar.a(ga6.i(j)) : ffhVar.z(ga6.i(j)), 0);
            case 1:
                xfh xfhVar = (xfh) this.d;
                xfh xfhVar2 = xfh.a;
                wfh wfhVar = (wfh) this.c;
                ffh ffhVar2 = this.b;
                if (xfhVar == xfhVar2) {
                    return new hgc(wfhVar == wfh.b ? ffhVar2.J(ga6.h(j)) : ffhVar2.G(ga6.h(j)), ga6.d(j) ? ga6.h(j) : 32767, 1);
                }
                return new hgc(ga6.e(j) ? ga6.i(j) : 32767, wfhVar == wfh.b ? ffhVar2.a(ga6.i(j)) : ffhVar2.z(ga6.i(j)), 1);
            default:
                j8j j8jVar = (j8j) this.d;
                j8j j8jVar2 = j8j.a;
                i8j i8jVar = (i8j) this.c;
                ffh ffhVar3 = this.b;
                if (j8jVar == j8jVar2) {
                    return new hgc(i8jVar == i8j.b ? ffhVar3.J(ga6.h(j)) : ffhVar3.G(ga6.h(j)), ga6.d(j) ? ga6.h(j) : 32767, 2);
                }
                return new hgc(ga6.e(j) ? ga6.i(j) : 32767, i8jVar == i8j.b ? ffhVar3.a(ga6.i(j)) : ffhVar3.z(ga6.i(j)), 2);
        }
    }

    @Override // defpackage.ffh
    public final int a(int i) {
        switch (this.a) {
        }
        return this.b.a(i);
    }

    @Override // defpackage.ffh
    public final Object n() {
        switch (this.a) {
        }
        return this.b.n();
    }

    @Override // defpackage.ffh
    public final int z(int i) {
        switch (this.a) {
        }
        return this.b.z(i);
    }
}
