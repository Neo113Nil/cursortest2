package defpackage;

/* loaded from: classes4.dex */
public final class bxk implements w2q {
    public static final bxk a = new bxk();

    @Override // defpackage.w2q
    public final Object c(foc focVar) {
        focVar.getClass();
        return Boolean.TRUE;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof bxk);
    }

    @Override // defpackage.w2q
    public final Object g(faq faqVar) {
        boolean z;
        faqVar.getClass();
        if ((faqVar instanceof daq) || (faqVar instanceof naq) || (faqVar instanceof qaq)) {
            z = true;
        } else {
            if (!(faqVar instanceof saq)) {
                b6e.s();
                return null;
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.w2q
    public final Object h(jzs jzsVar) {
        jzsVar.getClass();
        return Boolean.TRUE;
    }

    public final int hashCode() {
        return 1329079905;
    }

    @Override // defpackage.w2q
    public final Object i(m1q m1qVar) {
        m1qVar.getClass();
        return Boolean.TRUE;
    }

    @Override // defpackage.w2q
    public final Object j(i5u i5uVar) {
        i5uVar.getClass();
        return Boolean.FALSE;
    }

    @Override // defpackage.w2q
    public final Object k(k4d k4dVar) {
        k4dVar.getClass();
        return Boolean.TRUE;
    }

    public final String toString() {
        return "PlayableSupportTimer";
    }
}
