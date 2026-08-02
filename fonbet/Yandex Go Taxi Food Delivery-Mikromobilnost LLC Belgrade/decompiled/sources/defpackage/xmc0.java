package defpackage;

/* loaded from: classes2.dex */
public final class xmc0 {
    public final String a;

    public xmc0(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xmc0) && this.a.equals(((xmc0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("PlaqueIconWidget(image="), this.a, ')');
    }
}
