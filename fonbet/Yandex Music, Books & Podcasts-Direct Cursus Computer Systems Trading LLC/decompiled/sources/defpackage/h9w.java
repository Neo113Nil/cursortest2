package defpackage;

/* loaded from: classes.dex */
public final class h9w implements n0c {
    public int a;
    public int b;
    public boolean c;
    public boolean d;

    @Override // defpackage.n0c
    public final iih c(rdk rdkVar, hr4 hr4Var) {
        int i;
        int i2 = this.b;
        boolean z = false;
        boolean z2 = i2 == 0 || i2 == 1;
        int i3 = dvt.a;
        if (i3 >= 23 && ((i = this.a) == 1 || (i == 0 && i3 >= 31))) {
            z = true;
        }
        if (!z2) {
            if (!z) {
                es7 es7Var = new es7();
                es7Var.a = this.d;
                return es7Var.c(rdkVar, hr4Var);
            }
            int i4 = l5i.i(((dsc) rdkVar.d).n);
            vq1.Y("YMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(dvt.N(i4)));
            vj7 vj7Var = new vj7(i4);
            vj7Var.c = this.d;
            return vj7Var.c(rdkVar, hr4Var);
        }
        if (!z) {
            o8b o8bVar = new o8b();
            o8bVar.a = this.c;
            o8bVar.b = this.d;
            return o8bVar.c(rdkVar, hr4Var);
        }
        int i5 = l5i.i(((dsc) rdkVar.d).n);
        vq1.Y("YMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(dvt.N(i5)));
        tnn tnnVar = new tnn(i5);
        tnnVar.c = this.c;
        tnnVar.d = this.d;
        return tnnVar.c(rdkVar, hr4Var);
    }

    @Override // defpackage.gih
    public final iih h(rdk rdkVar) {
        return c(rdkVar, null);
    }
}
