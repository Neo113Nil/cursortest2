package defpackage;

import java.util.Locale;

/* loaded from: classes3.dex */
public final class b70 {
    public static final b70 j = new b70("", "", 0, 0, null, null, null);
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final p80 e;
    public final String f;
    public final String g;
    public final String h;
    public final int i;

    public b70(String str, String str2, int i, int i2, p80 p80Var, String str3, f70 f70Var) {
        String str4;
        String str5;
        String obj;
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = p80Var;
        this.f = str3;
        String str6 = "";
        if (f70Var == null || (obj = f70Var.b.toString()) == null) {
            str4 = "";
        } else {
            str4 = obj.toLowerCase(Locale.ROOT);
            str4.getClass();
        }
        this.g = str4;
        if (f70Var != null && (str5 = f70Var.a) != null) {
            str6 = str5;
        }
        this.h = str6;
        this.i = f70Var != null ? f70Var.c + 1 : 0;
    }
}
