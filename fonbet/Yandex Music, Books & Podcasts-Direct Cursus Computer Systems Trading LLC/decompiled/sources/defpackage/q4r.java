package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class q4r implements Cloneable {
    public /* synthetic */ int[] a;
    public /* synthetic */ Object[] b;
    public /* synthetic */ int c;

    public q4r(int i) {
        int i2;
        int i3 = 4;
        while (true) {
            i2 = 40;
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (40 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 4;
        this.a = new int[i5];
        this.b = new Object[i5];
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final q4r clone() {
        Object clone = super.clone();
        clone.getClass();
        q4r q4rVar = (q4r) clone;
        q4rVar.a = (int[]) this.a.clone();
        q4rVar.b = (Object[]) this.b.clone();
        return q4rVar;
    }

    public final Object c(int i) {
        Object obj;
        int x = u2x.x(this.c, i, this.a);
        if (x < 0 || (obj = this.b[x]) == n7w.h) {
            return null;
        }
        return obj;
    }

    public final int d(int i) {
        if (i >= this.c || i < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.a[i];
    }

    public final void e(int i, Object obj) {
        int x = u2x.x(this.c, i, this.a);
        if (x >= 0) {
            this.b[x] = obj;
            return;
        }
        int i2 = ~x;
        int i3 = this.c;
        if (i2 < i3) {
            Object[] objArr = this.b;
            if (objArr[i2] == n7w.h) {
                this.a[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (i3 >= this.a.length) {
            int i4 = (i3 + 1) * 4;
            int i5 = 4;
            while (true) {
                if (i5 >= 32) {
                    break;
                }
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
                i5++;
            }
            int i7 = i4 / 4;
            this.a = Arrays.copyOf(this.a, i7);
            this.b = Arrays.copyOf(this.b, i7);
        }
        int i8 = this.c;
        if (i8 - i2 != 0) {
            int[] iArr = this.a;
            int i9 = i2 + 1;
            uz0.e(i9, i2, i8, iArr, iArr);
            Object[] objArr2 = this.b;
            uz0.f(i9, i2, this.c, objArr2, objArr2);
        }
        this.a[i2] = i;
        this.b[i2] = obj;
        this.c++;
    }

    public final Object f(int i) {
        if (i >= this.c || i < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.b[i];
    }

    public final String toString() {
        int i = this.c;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        int i2 = this.c;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(d(i3));
            sb.append('=');
            Object f = f(i3);
            if (f != this) {
                sb.append(f);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
