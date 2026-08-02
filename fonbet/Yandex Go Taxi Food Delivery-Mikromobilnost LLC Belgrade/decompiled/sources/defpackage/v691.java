package defpackage;

import java.util.Iterator;

/* loaded from: classes11.dex */
public final class v691 implements Iterator {
    public final /* synthetic */ int a;
    public int b = 0;
    public final /* synthetic */ Object c;

    public /* synthetic */ v691(int i, Object obj) {
        this.a = i;
        this.c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.b < ((a791) this.c).a.length()) {
                }
                break;
            case 1:
                if (this.b < ((a791) this.c).a.length()) {
                }
                break;
            default:
                if (this.b < ((w491) this.c).j()) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                String str = ((a791) obj).a;
                int i2 = this.b;
                if (i2 >= str.length()) {
                    ny61.p();
                    break;
                } else {
                    this.b = i2 + 1;
                    break;
                }
            case 1:
                a791 a791Var = (a791) obj;
                String str2 = a791Var.a;
                int i3 = this.b;
                if (i3 >= str2.length()) {
                    ny61.p();
                    break;
                } else {
                    this.b = i3 + 1;
                    break;
                }
            default:
                w491 w491Var = (w491) obj;
                int i4 = this.b;
                int j = w491Var.j();
                int i5 = this.b;
                if (i4 >= j) {
                    w511.i(unr0.m(i5, "Out of bounds index: ", new StringBuilder(String.valueOf(i5).length() + 21)));
                    break;
                } else {
                    this.b = i5 + 1;
                    break;
                }
        }
        return null;
    }
}
