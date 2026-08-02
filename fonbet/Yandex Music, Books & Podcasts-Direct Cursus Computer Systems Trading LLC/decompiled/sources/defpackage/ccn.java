package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ccn implements p7q {
    public static final ccn a = new ccn();

    public static yml a(o4q o4qVar, fyu fyuVar) {
        int ordinal = o4qVar.ordinal();
        if (ordinal == 0) {
            return null;
        }
        if (ordinal != 1) {
            b6e.s();
            return null;
        }
        if (Intrinsics.d(fyuVar, dyu.a)) {
            return yml.b;
        }
        if (fyuVar instanceof eyu) {
            return yml.a;
        }
        b6e.s();
        return null;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ccn);
    }

    public final int hashCode() {
        return -1097662587;
    }

    @Override // defpackage.p7q
    public final Object m(ioc iocVar) {
        iocVar.getClass();
        return null;
    }

    @Override // defpackage.p7q
    public final Object n(szu szuVar) {
        szuVar.getClass();
        return a(hdg.W(szuVar.a), szuVar.l());
    }

    @Override // defpackage.p7q
    public final Object q(y4d y4dVar) {
        y4dVar.getClass();
        return null;
    }

    @Override // defpackage.p7q
    public final Object q0(maq maqVar) {
        maqVar.getClass();
        if (maqVar instanceof jbq) {
            jbq jbqVar = (jbq) maqVar;
            return a(avf.J(jbqVar.b), jbqVar.s());
        }
        if ((maqVar instanceof eaq) || (maqVar instanceof raq) || (maqVar instanceof vaq)) {
            return null;
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.p7q
    public final Object t(t1q t1qVar) {
        t1qVar.getClass();
        return null;
    }

    public final String toString() {
        return "QueueStateToShuffleStateVisitor";
    }

    @Override // defpackage.p7q
    public final Object u(u7u u7uVar) {
        u7uVar.getClass();
        return null;
    }
}
