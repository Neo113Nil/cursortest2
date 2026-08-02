package defpackage;

import android.net.Uri;
import java.util.Objects;

/* loaded from: classes.dex */
public class mnh {
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public final Uri a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final String f;
    public final String g;

    static {
        int i2 = dvt.a;
        h = Integer.toString(0, 36);
        i = Integer.toString(1, 36);
        j = Integer.toString(2, 36);
        k = Integer.toString(3, 36);
        l = Integer.toString(4, 36);
        m = Integer.toString(5, 36);
        n = Integer.toString(6, 36);
    }

    public mnh(eg0 eg0Var) {
        this.a = (Uri) eg0Var.c;
        this.b = (String) eg0Var.d;
        this.c = (String) eg0Var.e;
        this.d = eg0Var.a;
        this.e = eg0Var.b;
        this.f = (String) eg0Var.f;
        this.g = (String) eg0Var.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mnh)) {
            return false;
        }
        mnh mnhVar = (mnh) obj;
        return this.a.equals(mnhVar.a) && Objects.equals(this.b, mnhVar.b) && Objects.equals(this.c, mnhVar.c) && this.d == mnhVar.d && this.e == mnhVar.e && Objects.equals(this.f, mnhVar.f) && Objects.equals(this.g, mnhVar.g);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.d) * 31) + this.e) * 31;
        String str3 = this.f;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }
}
