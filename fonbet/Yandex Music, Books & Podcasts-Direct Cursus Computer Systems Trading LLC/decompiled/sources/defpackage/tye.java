package defpackage;

/* loaded from: classes4.dex */
public final class tye implements p7q {
    public static final tye a = new tye();

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof tye);
    }

    public final int hashCode() {
        return -143732078;
    }

    @Override // defpackage.p7q
    public final Object m(ioc iocVar) {
        iocVar.getClass();
        return Boolean.FALSE;
    }

    @Override // defpackage.p7q
    public final Object n(szu szuVar) {
        boolean z;
        szuVar.getClass();
        int ordinal = hdg.W(szuVar.a).ordinal();
        if (ordinal != 0) {
            z = true;
            if (ordinal != 1) {
                b6e.s();
                return null;
            }
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.p7q
    public final Object q(y4d y4dVar) {
        y4dVar.getClass();
        return Boolean.FALSE;
    }

    @Override // defpackage.p7q
    public final Object q0(maq maqVar) {
        maqVar.getClass();
        boolean z = false;
        if (maqVar instanceof jbq) {
            int ordinal = avf.J(((jbq) maqVar).b).ordinal();
            if (ordinal != 0) {
                z = true;
                if (ordinal != 1) {
                    b6e.s();
                    return null;
                }
            }
        } else if (!(maqVar instanceof eaq) && !(maqVar instanceof raq) && !(maqVar instanceof vaq)) {
            b6e.s();
            return null;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.p7q
    public final Object t(t1q t1qVar) {
        t1qVar.getClass();
        return Boolean.FALSE;
    }

    public final String toString() {
        return "IsShuffleSupportedVisitor";
    }

    @Override // defpackage.p7q
    public final Object u(u7u u7uVar) {
        u7uVar.getClass();
        return Boolean.FALSE;
    }
}
