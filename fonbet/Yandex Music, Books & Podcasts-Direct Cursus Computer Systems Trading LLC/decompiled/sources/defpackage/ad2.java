package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class ad2 extends ds6 {
    public final Context a;
    public final up4 b;
    public final up4 c;
    public final String d;

    public ad2(Context context, up4 up4Var, up4 up4Var2, String str) {
        if (context == null) {
            jj4.j("Null applicationContext");
            throw null;
        }
        this.a = context;
        if (up4Var == null) {
            jj4.j("Null wallClock");
            throw null;
        }
        this.b = up4Var;
        if (up4Var2 == null) {
            jj4.j("Null monotonicClock");
            throw null;
        }
        this.c = up4Var2;
        if (str != null) {
            this.d = str;
        } else {
            jj4.j("Null backendName");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ds6) {
            ad2 ad2Var = (ad2) ((ds6) obj);
            if (this.a.equals(ad2Var.a) && this.b.equals(ad2Var.b) && this.c.equals(ad2Var.c) && this.d.equals(ad2Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.a);
        sb.append(", wallClock=");
        sb.append(this.b);
        sb.append(", monotonicClock=");
        sb.append(this.c);
        sb.append(", backendName=");
        return su4.o(sb, this.d, "}");
    }
}
