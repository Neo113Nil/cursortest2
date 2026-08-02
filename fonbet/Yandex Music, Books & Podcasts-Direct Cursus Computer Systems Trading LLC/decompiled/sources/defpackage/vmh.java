package defpackage;

import android.net.Uri;

/* loaded from: classes.dex */
public final class vmh {
    public static final String b;
    public final Uri a;

    static {
        int i = dvt.a;
        b = Integer.toString(0, 36);
    }

    public vmh(pv9 pv9Var) {
        this.a = (Uri) pv9Var.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vmh) && this.a.equals(((vmh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
