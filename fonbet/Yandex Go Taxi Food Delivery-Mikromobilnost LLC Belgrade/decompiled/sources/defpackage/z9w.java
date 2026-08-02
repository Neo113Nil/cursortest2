package defpackage;

/* loaded from: classes14.dex */
public final class z9w extends faw {
    public final String a;

    public z9w(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z9w) && jl40.l(this.a, ((z9w) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
