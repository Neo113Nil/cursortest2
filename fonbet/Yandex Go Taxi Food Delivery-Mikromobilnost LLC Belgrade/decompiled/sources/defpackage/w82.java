package defpackage;

/* loaded from: classes10.dex */
public final class w82 {
    public final int a;

    public /* synthetic */ w82(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w82) {
            return this.a == ((w82) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return oyr.e(')', this.a, "AndroidContentDataType(androidAutofillType=");
    }
}
