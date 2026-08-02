package defpackage;

import android.util.DisplayMetrics;

/* loaded from: classes3.dex */
public final class azj extends ceg {
    public final /* synthetic */ int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final DisplayMetrics l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ azj(int i, int i2, int i3, int i4, DisplayMetrics displayMetrics, int i5) {
        super(i2, 5);
        this.g = i5;
        this.h = i;
        this.i = i2;
        this.j = i3;
        this.k = i4;
        this.l = displayMetrics;
    }

    @Override // defpackage.ceg
    public final int s(int i) {
        switch (this.g) {
            case 0:
                if (this.b <= 0) {
                    return -1;
                }
                return Math.min(this.h + i, this.i - 1);
            default:
                if (this.b <= 0) {
                    return -1;
                }
                return (this.h + i) % this.i;
        }
    }

    @Override // defpackage.ceg
    public final int v(int i) {
        switch (this.g) {
            case 0:
                return Math.min(Math.max(0, bg3.x(Integer.valueOf(i), this.l) + this.k), this.j);
            default:
                int x = bg3.x(Integer.valueOf(i), this.l) + this.k;
                int i2 = this.j;
                int i3 = x % i2;
                return i3 < 0 ? i3 + i2 : i3;
        }
    }

    @Override // defpackage.ceg
    public final int w(int i) {
        switch (this.g) {
            case 0:
                if (this.b <= 0) {
                    return -1;
                }
                return Math.max(0, this.h - i);
            default:
                if (this.b <= 0) {
                    return -1;
                }
                int i2 = this.h - i;
                int i3 = this.i;
                int i4 = i2 % i3;
                return (i3 & (((i4 ^ i3) & ((-i4) | i4)) >> 31)) + i4;
        }
    }
}
