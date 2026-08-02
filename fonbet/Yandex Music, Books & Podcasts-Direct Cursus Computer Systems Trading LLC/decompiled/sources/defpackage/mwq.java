package defpackage;

/* loaded from: classes4.dex */
public final class mwq {
    public final int a;
    public final lm4 b;

    public mwq(int i, lm4 lm4Var) {
        this.a = i;
        this.b = lm4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mwq)) {
            return false;
        }
        mwq mwqVar = (mwq) obj;
        return this.a == mwqVar.a && this.b.equals(mwqVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "StateKey(slideIndex=" + this.a + ", stateClass=" + this.b + ")";
    }
}
