package defpackage;

/* loaded from: classes.dex */
public final class rv0 implements rkd {
    public final int a;

    public rv0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rv0) && this.a == ((rv0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return vz1.r(new StringBuilder("AppWidgetId(appWidgetId="), this.a, ')');
    }
}
