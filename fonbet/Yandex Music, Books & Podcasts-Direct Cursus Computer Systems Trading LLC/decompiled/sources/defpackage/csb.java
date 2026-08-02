package defpackage;

import android.view.View;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class csb {
    public final /* synthetic */ int a = 1;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public Object f;

    public csb(int i) {
        this.b = i;
        byte[] bArr = new byte[131];
        this.f = bArr;
        bArr[2] = 1;
    }

    public void a(byte[] bArr, int i, int i2) {
        if (this.d) {
            int i3 = i2 - i;
            byte[] bArr2 = (byte[]) this.f;
            int length = bArr2.length;
            int i4 = this.c + i3;
            if (length < i4) {
                this.f = Arrays.copyOf(bArr2, i4 * 2);
            }
            System.arraycopy(bArr, i, (byte[]) this.f, this.c, i3);
            this.c += i3;
        }
    }

    public void b() {
        boolean z = this.d;
        gc9 gc9Var = (gc9) this.f;
        this.c = z ? gc9Var.g() : gc9Var.n();
    }

    public void c(int i, View view) {
        gc9 gc9Var = (gc9) this.f;
        int o = Integer.MIN_VALUE == gc9Var.a ? 0 : gc9Var.o() - gc9Var.a;
        if (o >= 0) {
            boolean z = this.d;
            gc9 gc9Var2 = (gc9) this.f;
            if (z) {
                int b = gc9Var2.b(view);
                gc9 gc9Var3 = (gc9) this.f;
                this.c = (Integer.MIN_VALUE != gc9Var3.a ? gc9Var3.o() - gc9Var3.a : 0) + b;
            } else {
                this.c = gc9Var2.e(view);
            }
            this.b = i;
            return;
        }
        this.b = i;
        boolean z2 = this.d;
        gc9 gc9Var4 = (gc9) this.f;
        if (!z2) {
            int e = gc9Var4.e(view);
            int n = e - ((gc9) this.f).n();
            this.c = e;
            if (n > 0) {
                int g = (((gc9) this.f).g() - Math.min(0, (((gc9) this.f).g() - o) - ((gc9) this.f).b(view))) - (((gc9) this.f).c(view) + e);
                if (g < 0) {
                    this.c -= Math.min(n, -g);
                    return;
                }
                return;
            }
            return;
        }
        int g2 = (gc9Var4.g() - o) - ((gc9) this.f).b(view);
        this.c = ((gc9) this.f).g() - g2;
        if (g2 > 0) {
            int c = this.c - ((gc9) this.f).c(view);
            int n2 = ((gc9) this.f).n();
            int min = c - (Math.min(((gc9) this.f).e(view) - n2, 0) + n2);
            if (min < 0) {
                this.c = Math.min(g2, -min) + this.c;
            }
        }
    }

    public boolean d(int i) {
        if (!this.d) {
            return false;
        }
        this.c -= i;
        this.d = false;
        this.e = true;
        return true;
    }

    public void e(int i) {
        this.d |= i > 0;
        this.b += i;
    }

    public void f() {
        switch (this.a) {
            case 1:
                this.b = -1;
                this.c = Integer.MIN_VALUE;
                this.d = false;
                this.e = false;
                break;
            default:
                this.d = false;
                this.e = false;
                break;
        }
    }

    public void g(int i) {
        vq1.A(!this.d);
        boolean z = i == this.b;
        this.d = z;
        if (z) {
            this.c = 3;
            this.e = false;
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                StringBuilder sb = new StringBuilder("AnchorInfo{mPosition=");
                sb.append(this.b);
                sb.append(", mCoordinate=");
                sb.append(this.c);
                sb.append(", mLayoutFromEnd=");
                sb.append(this.d);
                sb.append(", mValid=");
                return dfi.j(sb, this.e, '}');
            default:
                return super.toString();
        }
    }

    public csb(rzk rzkVar) {
        this.f = rzkVar;
    }

    public csb() {
        f();
    }
}
