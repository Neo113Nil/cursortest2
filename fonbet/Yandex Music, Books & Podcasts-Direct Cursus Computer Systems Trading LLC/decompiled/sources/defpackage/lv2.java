package defpackage;

import java.io.Serializable;

/* loaded from: classes6.dex */
public final class lv2 implements Cloneable, Serializable {
    private static final long serialVersionUID = -2443303766890459269L;
    public final mzm a;
    public final int b;
    public final String c;

    public lv2(mzm mzmVar, int i, String str) {
        bg3.P(mzmVar, "Version");
        this.a = mzmVar;
        bg3.O(i, "Status code");
        this.b = i;
        this.c = str;
    }

    public final Object clone() {
        return super.clone();
    }

    public final String toString() {
        pd4 pd4Var = new pd4(64);
        mzm mzmVar = this.a;
        int length = mzmVar.a.length() + 9;
        String str = this.c;
        if (str != null) {
            length += str.length();
        }
        if (length > 0) {
            int length2 = pd4Var.a.length;
            int i = pd4Var.b;
            if (length > length2 - i) {
                pd4Var.d(i + length);
            }
        }
        String str2 = mzmVar.a;
        int length3 = str2.length() + 4;
        if (length3 > 0) {
            int length4 = pd4Var.a.length;
            int i2 = pd4Var.b;
            if (length3 > length4 - i2) {
                pd4Var.d(i2 + length3);
            }
        }
        pd4Var.b(str2);
        pd4Var.a('/');
        pd4Var.b(Integer.toString(mzmVar.b));
        pd4Var.a('.');
        pd4Var.b(Integer.toString(mzmVar.c));
        pd4Var.a(' ');
        pd4Var.b(Integer.toString(this.b));
        pd4Var.a(' ');
        if (str != null) {
            pd4Var.b(str);
        }
        return pd4Var.toString();
    }
}
