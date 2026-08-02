package defpackage;

/* loaded from: classes4.dex */
public interface zsv {
    default boolean a() {
        if (this instanceof ysv) {
            return false;
        }
        if (!(this instanceof xsv)) {
            b6e.s();
            return false;
        }
        wsv wsvVar = ((xsv) this).b;
        return !(((wsvVar instanceof qsv ? (qsv) wsvVar : null) != null ? r0.c : null) instanceof isv);
    }
}
