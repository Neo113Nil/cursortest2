package defpackage;

/* loaded from: classes9.dex */
public final class q5w extends d2f0 {
    public static final q5w c = new q5w(h6w.a);

    @Override // defpackage.a7
    public final int d(Object obj) {
        return ((int[]) obj).length;
    }

    @Override // defpackage.jcc, defpackage.a7
    public final void f(sjd sjdVar, int i, Object obj) {
        m5w m5wVar = (m5w) obj;
        int h = sjdVar.h(this.b, i);
        m5wVar.b(m5wVar.d() + 1);
        int[] iArr = m5wVar.a;
        int i2 = m5wVar.b;
        m5wVar.b = i2 + 1;
        iArr[i2] = h;
    }

    @Override // defpackage.a7
    public final Object g(Object obj) {
        int[] iArr = (int[]) obj;
        m5w m5wVar = new m5w();
        m5wVar.a = iArr;
        m5wVar.b = iArr.length;
        m5wVar.b(10);
        return m5wVar;
    }

    @Override // defpackage.d2f0
    public final Object j() {
        return new int[0];
    }

    @Override // defpackage.d2f0
    public final void k(yjd yjdVar, Object obj, int i) {
        int[] iArr = (int[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            yjdVar.A(i2, iArr[i2], this.b);
        }
    }
}
