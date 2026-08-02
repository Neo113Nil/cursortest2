package defpackage;

/* loaded from: classes2.dex */
public final class re70 {
    public final String a;

    public re70(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof re70) && this.a.equals(((re70) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("Option(name="), this.a, ')');
    }
}
