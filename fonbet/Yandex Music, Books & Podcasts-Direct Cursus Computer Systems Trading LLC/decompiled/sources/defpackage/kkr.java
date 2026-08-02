package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public class kkr extends y6 {
    public final String f;

    public kkr(String str) {
        str.getClass();
        this.f = str;
    }

    @Override // defpackage.y6
    public int C() {
        char charAt;
        int i = this.b;
        if (i == -1) {
            return i;
        }
        while (true) {
            String str = this.f;
            if (i >= str.length() || !((charAt = str.charAt(i)) == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t')) {
                break;
            }
            i++;
        }
        this.b = i;
        return i;
    }

    @Override // defpackage.y6
    public boolean c() {
        int i = this.b;
        if (i == -1) {
            return false;
        }
        while (true) {
            String str = this.f;
            if (i >= str.length()) {
                this.b = i;
                return false;
            }
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.b = i;
                return y6.u(charAt);
            }
            i++;
        }
    }

    @Override // defpackage.y6
    public final String e() {
        h('\"');
        int i = this.b;
        String str = this.f;
        int S = StringsKt.S(str, '\"', i, 4);
        if (S == -1) {
            l();
            int i2 = this.b;
            y6.q(this, hrg.q("Expected quotation mark '\"', but had '", (i2 == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2)), "' instead"), i2, null, 4);
            throw null;
        }
        for (int i3 = i; i3 < S; i3++) {
            if (str.charAt(i3) == '\\') {
                return k(str, this.b, i3);
            }
        }
        this.b = S + 1;
        return str.substring(i, S);
    }

    @Override // defpackage.y6
    public byte f() {
        String str;
        int i = this.b;
        while (true) {
            str = this.f;
            if (i == -1 || i >= str.length()) {
                break;
            }
            int i2 = i + 1;
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.b = i2;
                return wct.r(charAt);
            }
            i = i2;
        }
        this.b = str.length();
        return (byte) 10;
    }

    @Override // defpackage.y6
    public void h(char c) {
        int i = this.b;
        if (i == -1) {
            G(c);
            throw null;
        }
        while (true) {
            String str = this.f;
            if (i >= str.length()) {
                this.b = -1;
                G(c);
                throw null;
            }
            int i2 = i + 1;
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.b = i2;
                if (charAt == c) {
                    return;
                }
                G(c);
                throw null;
            }
            i = i2;
        }
    }

    @Override // defpackage.y6
    public final CharSequence s() {
        return this.f;
    }

    @Override // defpackage.y6
    public final String w(String str, boolean z) {
        str.getClass();
        int i = this.b;
        try {
            if (f() == 6 && Intrinsics.d(y(z), str)) {
                this.d = null;
                if (f() == 5) {
                    return y(z);
                }
            }
            return null;
        } finally {
            this.b = i;
            this.d = null;
        }
    }

    @Override // defpackage.y6
    public final int z(int i) {
        if (i < this.f.length()) {
            return i;
        }
        return -1;
    }
}
