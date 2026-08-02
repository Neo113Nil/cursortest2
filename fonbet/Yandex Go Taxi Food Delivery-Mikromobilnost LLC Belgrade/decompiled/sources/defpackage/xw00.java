package defpackage;

/* loaded from: classes10.dex */
public final class xw00 {
    public final String a;
    public final float b;
    public final float c;

    public xw00(String str, float f, float f2) {
        this.a = str;
        this.c = f2;
        this.b = f;
    }

    public final boolean a(String str) {
        String str2 = this.a;
        if (str2.equalsIgnoreCase(str)) {
            return true;
        }
        return str2.endsWith("\r") && str2.substring(0, str2.length() - 1).equalsIgnoreCase(str);
    }
}
