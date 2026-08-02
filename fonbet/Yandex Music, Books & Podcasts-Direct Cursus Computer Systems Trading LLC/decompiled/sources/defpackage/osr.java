package defpackage;

/* loaded from: classes4.dex */
public final class osr implements w2q {
    public static final osr a = new osr();

    @Override // defpackage.w2q
    public final Object c(foc focVar) {
        focVar.getClass();
        return Boolean.FALSE;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof osr);
    }

    @Override // defpackage.w2q
    public final Object g(faq faqVar) {
        boolean z;
        faqVar.getClass();
        if ((faqVar instanceof daq) || (faqVar instanceof qaq)) {
            z = false;
        } else {
            if (!(faqVar instanceof naq) && !(faqVar instanceof saq)) {
                b6e.s();
                return null;
            }
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.w2q
    public final Object h(jzs jzsVar) {
        jzsVar.getClass();
        return Boolean.TRUE;
    }

    public final int hashCode() {
        return -560532799;
    }

    @Override // defpackage.w2q
    public final Object i(m1q m1qVar) {
        boolean z;
        m1qVar.getClass();
        if ((m1qVar instanceof j1q) || (m1qVar instanceof e2q)) {
            z = false;
        } else {
            if (!(m1qVar instanceof c2q)) {
                b6e.s();
                return null;
            }
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.w2q
    public final Object j(i5u i5uVar) {
        i5uVar.getClass();
        return Boolean.TRUE;
    }

    @Override // defpackage.w2q
    public final Object k(k4d k4dVar) {
        k4dVar.getClass();
        return Boolean.FALSE;
    }

    public final String toString() {
        return "SupportRepeatVisitor";
    }
}
