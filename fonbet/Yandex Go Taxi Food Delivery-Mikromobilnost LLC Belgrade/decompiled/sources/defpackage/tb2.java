package defpackage;

/* loaded from: classes.dex */
public final class tb2 implements wvd0 {
    public final int b;

    public tb2(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return tb2.class.equals(obj != null ? obj.getClass() : null) && this.b == ((tb2) obj).b;
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        return oyr.s(new StringBuilder("AndroidPointerIcon(type="), this.b, ')');
    }
}
