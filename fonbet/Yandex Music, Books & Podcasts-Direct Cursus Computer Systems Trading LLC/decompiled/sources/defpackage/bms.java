package defpackage;

/* loaded from: classes3.dex */
public final class bms implements cms {
    public final String a;

    public /* synthetic */ bms(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bms) {
            return this.a.equals(((bms) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ouj.k(')', "Variable(name=", this.a);
    }
}
