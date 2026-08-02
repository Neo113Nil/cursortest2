package defpackage;

/* loaded from: classes.dex */
public final class ufm {
    public final int a;

    public /* synthetic */ ufm(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ufm) {
            return this.a == ((ufm) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return hrg.o("PointerKeyboardModifiers(packedValue=", this.a, ')');
    }
}
