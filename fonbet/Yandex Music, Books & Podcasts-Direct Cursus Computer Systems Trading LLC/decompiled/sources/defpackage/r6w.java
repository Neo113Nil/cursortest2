package defpackage;

/* loaded from: classes5.dex */
public final class r6w {
    public final String a;
    public final char c;
    public final StringBuffer d = new StringBuffer();
    public int b = -1;

    public r6w(String str, char c) {
        this.a = str;
        this.c = c;
    }

    public final boolean a() {
        return this.b != this.a.length();
    }

    public final String b() {
        int i = this.b;
        String str = this.a;
        if (i == str.length()) {
            return null;
        }
        int i2 = this.b + 1;
        StringBuffer stringBuffer = this.d;
        stringBuffer.setLength(0);
        boolean z = false;
        boolean z2 = false;
        while (i2 != str.length()) {
            char charAt = str.charAt(i2);
            if (charAt == '\"') {
                if (!z) {
                    z2 = !z2;
                }
                stringBuffer.append(charAt);
            } else if (z || z2) {
                stringBuffer.append(charAt);
            } else {
                if (charAt == '\\') {
                    stringBuffer.append(charAt);
                    z = true;
                } else {
                    if (charAt == this.c) {
                        break;
                    }
                    stringBuffer.append(charAt);
                }
                i2++;
            }
            z = false;
            i2++;
        }
        this.b = i2;
        return stringBuffer.toString();
    }
}
