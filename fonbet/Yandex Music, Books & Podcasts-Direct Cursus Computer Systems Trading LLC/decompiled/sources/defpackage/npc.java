package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class npc {
    public final ArrayList a;
    public final char b;
    public final double c;
    public final String d;
    public final String e;

    public npc(ArrayList arrayList, char c, double d, String str, String str2) {
        this.a = arrayList;
        this.b = c;
        this.c = d;
        this.d = str;
        this.e = str2;
    }

    public static int a(char c, String str, String str2) {
        return str2.hashCode() + k5r.c(c * 31, 31, str);
    }

    public final int hashCode() {
        return a(this.b, this.e, this.d);
    }
}
