package defpackage;

/* loaded from: classes5.dex */
public final class r6g extends cp2 {
    @Override // defpackage.cp2
    public final lyd a(di3 di3Var) {
        String str = (String) this.d;
        str.getClass();
        return new s6g(str, di3Var);
    }

    @Override // defpackage.cp2
    public final di3 c() {
        int i = 1;
        di3 di3Var = new di3(this.c + 1);
        double d = this.a;
        double d2 = this.b;
        int a = di3Var.a();
        while (true) {
            int[] iArr = di3Var.a;
            if (i >= a) {
                iArr[di3Var.a()] = Integer.MAX_VALUE;
                di3Var.b = di3Var.b();
                return di3Var;
            }
            iArr[i] = (int) (((((i - 1) * d2) + (((a - 1) - i) * d)) / (a - 2)) + 0.5d);
            i++;
        }
    }
}
