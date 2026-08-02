package defpackage;

/* loaded from: classes.dex */
public final class xkn implements bnq {
    public final lmq a;

    public xkn(lmq lmqVar) {
        this.a = lmqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xkn) {
            return this.a.equals(((xkn) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.bnq
    public final Object s(rkn rknVar) {
        return this.a;
    }
}
