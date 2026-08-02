package defpackage;

/* loaded from: classes.dex */
public final class l6k {
    public final Integer a;

    public l6k(Integer num) {
        this.a = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l6k) {
            return this.a.equals(((l6k) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "Entry(value=" + this.a + ", memoryCacheKey=null)";
    }
}
