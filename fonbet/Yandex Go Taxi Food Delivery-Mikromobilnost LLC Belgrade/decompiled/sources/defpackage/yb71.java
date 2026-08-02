package defpackage;

import java.util.Iterator;

/* loaded from: classes7.dex */
public abstract class yb71 implements Iterator {
    public int a = 2;
    public String b;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a;
        if (i == 4) {
            ny61.k();
            return false;
        }
        String str = null;
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        if (i2 == 0) {
            return true;
        }
        if (i2 != 2) {
            this.a = 4;
            wq81 wq81Var = (wq81) this;
            int i3 = wq81Var.x;
            while (true) {
                int i4 = wq81Var.x;
                if (i4 == -1) {
                    wq81Var.a = 3;
                    break;
                }
                k681 k681Var = (k681) wq81Var.z.a;
                CharSequence charSequence = wq81Var.c;
                int length = charSequence.length();
                oaa1.i(i4, length);
                while (true) {
                    if (i4 >= length) {
                        i4 = -1;
                        break;
                    }
                    if (k681Var.a(charSequence.charAt(i4))) {
                        break;
                    }
                    i4++;
                }
                if (i4 == -1) {
                    i4 = charSequence.length();
                    wq81Var.x = -1;
                } else {
                    wq81Var.x = i4 + 1;
                }
                int i5 = wq81Var.x;
                if (i5 == i3) {
                    int i6 = i5 + 1;
                    wq81Var.x = i6;
                    if (i6 > charSequence.length()) {
                        wq81Var.x = -1;
                    }
                } else {
                    z981 z981Var = wq81Var.w;
                    if (i3 < i4) {
                        charSequence.charAt(i3);
                        z981Var.getClass();
                    }
                    if (i4 > i3) {
                        charSequence.charAt(i4 - 1);
                        z981Var.getClass();
                    }
                    int i7 = wq81Var.y;
                    if (i7 == 1) {
                        i4 = charSequence.length();
                        wq81Var.x = -1;
                        if (i4 > i3) {
                            charSequence.charAt(i4 - 1);
                            z981Var.getClass();
                        }
                    } else {
                        wq81Var.y = i7 - 1;
                    }
                    str = charSequence.subSequence(i3, i4).toString();
                }
            }
            this.b = str;
            if (this.a != 3) {
                this.a = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            ny61.p();
            return null;
        }
        this.a = 2;
        String str = this.b;
        this.b = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
