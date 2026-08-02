package defpackage;

import android.text.Layout;

/* loaded from: classes7.dex */
public final class wc81 {
    public CharSequence c;
    public long a = 0;
    public long b = 0;
    public int d = 2;
    public float e = -3.4028235E38f;
    public int f = 1;
    public int g = 0;
    public float h = -3.4028235E38f;
    public int i = Integer.MIN_VALUE;
    public float j = 1.0f;
    public int k = Integer.MIN_VALUE;

    /* JADX WARN: Code restructure failed: missing block: B:52:0x006d, code lost:
    
        if (r6 == 0) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final r571 a() {
        Layout.Alignment alignment;
        float f;
        CharSequence charSequence;
        float f2 = this.h;
        float f3 = -3.4028235E38f;
        if (f2 == -3.4028235E38f) {
            int i = this.d;
            f2 = i != 4 ? i != 5 ? 0.5f : 1.0f : 0.0f;
        }
        int i2 = this.i;
        if (i2 == Integer.MIN_VALUE) {
            int i3 = this.d;
            if (i3 != 1) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 != 5) {
                            i2 = 1;
                        }
                    }
                }
                i2 = 2;
            }
            i2 = 0;
        }
        r571 r571Var = new r571();
        int i4 = this.d;
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 != 4) {
                        if (i4 != 5) {
                            nba1.e();
                            alignment = null;
                        }
                    }
                }
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else {
                alignment = Layout.Alignment.ALIGN_CENTER;
            }
            r571Var.b = alignment;
            f = this.e;
            int i5 = this.f;
            if (f != -3.4028235E38f || i5 != 0 || (f >= 0.0f && f <= 1.0f)) {
                if (f == -3.4028235E38f) {
                    f3 = f;
                }
                r571Var.d = f3;
                r571Var.e = i5;
                r571Var.f = this.g;
                r571Var.g = f2;
                r571Var.h = i2;
                float f4 = this.j;
                if (i2 == 0) {
                    f2 = 1.0f - f2;
                } else if (i2 == 1) {
                    f2 = f2 <= 0.5f ? f2 * 2.0f : (1.0f - f2) * 2.0f;
                } else if (i2 != 2) {
                    ny61.r(String.valueOf(i2));
                    return null;
                }
                r571Var.k = Math.min(f4, f2);
                r571Var.l = this.k;
                charSequence = this.c;
                if (charSequence != null) {
                    r571Var.a = charSequence;
                }
                return r571Var;
            }
            f3 = 1.0f;
            r571Var.d = f3;
            r571Var.e = i5;
            r571Var.f = this.g;
            r571Var.g = f2;
            r571Var.h = i2;
            float f42 = this.j;
            if (i2 == 0) {
            }
            r571Var.k = Math.min(f42, f2);
            r571Var.l = this.k;
            charSequence = this.c;
            if (charSequence != null) {
            }
            return r571Var;
        }
        alignment = Layout.Alignment.ALIGN_NORMAL;
        r571Var.b = alignment;
        f = this.e;
        int i52 = this.f;
        if (f != -3.4028235E38f) {
        }
        if (f == -3.4028235E38f) {
        }
        r571Var.d = f3;
        r571Var.e = i52;
        r571Var.f = this.g;
        r571Var.g = f2;
        r571Var.h = i2;
        float f422 = this.j;
        if (i2 == 0) {
        }
        r571Var.k = Math.min(f422, f2);
        r571Var.l = this.k;
        charSequence = this.c;
        if (charSequence != null) {
        }
        return r571Var;
    }
}
