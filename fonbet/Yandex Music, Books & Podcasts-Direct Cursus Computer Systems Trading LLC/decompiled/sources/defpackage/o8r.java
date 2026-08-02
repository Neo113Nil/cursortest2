package defpackage;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class o8r implements Iterator {
    public String b;
    public final CharSequence c;
    public final xd4 d;
    public final /* synthetic */ z6n g;
    public int a = 2;
    public int e = 0;
    public int f = Integer.MAX_VALUE;

    public o8r(z6n z6nVar, rjp rjpVar, CharSequence charSequence) {
        this.g = z6nVar;
        this.d = (xd4) rjpVar.a;
        this.c = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        xd4 xd4Var;
        o2g.V(this.a != 4);
        int D = ouj.D(this.a);
        if (D == 0) {
            return true;
        }
        if (D != 2) {
            this.a = 4;
            int i = this.e;
            while (true) {
                int i2 = this.e;
                if (i2 == -1) {
                    this.a = 3;
                    str = null;
                    break;
                }
                yd4 yd4Var = (yd4) this.g.b;
                CharSequence charSequence = this.c;
                int length = charSequence.length();
                o2g.P(i2, length);
                while (true) {
                    if (i2 >= length) {
                        i2 = -1;
                        break;
                    }
                    if (yd4Var.a(charSequence.charAt(i2))) {
                        break;
                    }
                    i2++;
                }
                if (i2 == -1) {
                    i2 = charSequence.length();
                    this.e = -1;
                } else {
                    this.e = i2 + 1;
                }
                int i3 = this.e;
                if (i3 == i) {
                    int i4 = i3 + 1;
                    this.e = i4;
                    if (i4 > charSequence.length()) {
                        this.e = -1;
                    }
                } else {
                    while (true) {
                        xd4Var = this.d;
                        if (i >= i2 || !xd4Var.a(charSequence.charAt(i))) {
                            break;
                        }
                        i++;
                    }
                    while (i2 > i && xd4Var.a(charSequence.charAt(i2 - 1))) {
                        i2--;
                    }
                    int i5 = this.f;
                    if (i5 == 1) {
                        i2 = charSequence.length();
                        this.e = -1;
                        while (i2 > i && xd4Var.a(charSequence.charAt(i2 - 1))) {
                            i2--;
                        }
                    } else {
                        this.f = i5 - 1;
                    }
                    str = charSequence.subSequence(i, i2).toString();
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
            wvs.n();
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
