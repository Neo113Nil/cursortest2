package defpackage;

/* loaded from: classes.dex */
public final class td5 {
    public final float a;

    public /* synthetic */ td5(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof td5) {
            return Float.compare(this.a, ((td5) obj).a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "BaselineShift(multiplier=" + this.a + ')';
    }
}
