package defpackage;

import android.net.Uri;

/* loaded from: classes7.dex */
public final class qf81 implements kq71 {
    public static final qf81 c = new qf81(new nc81());
    public static final su71 w = new su71(15);
    public final Uri a;
    public final String b;

    public qf81(nc81 nc81Var) {
        this.a = nc81Var.a;
        this.b = nc81Var.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qf81)) {
            return false;
        }
        qf81 qf81Var = (qf81) obj;
        return rf71.o(this.a, qf81Var.a) && rf71.o(this.b, qf81Var.b);
    }

    public final int hashCode() {
        Uri uri = this.a;
        int hashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        String str = this.b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }
}
