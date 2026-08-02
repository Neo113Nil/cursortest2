package defpackage;

import android.text.Layout;

/* loaded from: classes.dex */
public final class ygv {
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

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0071, code lost:
    
        if (r7 == 0) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final qv6 a() {
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
        qv6 qv6Var = new qv6();
        int i4 = this.d;
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 != 4) {
                        if (i4 != 5) {
                            dfi.o(i4, "Unknown textAlignment: ", "WebvttCueParser");
                            alignment = null;
                        }
                    }
                }
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else {
                alignment = Layout.Alignment.ALIGN_CENTER;
            }
            qv6Var.c = alignment;
            f = this.e;
            int i5 = this.f;
            if (f != -3.4028235E38f || i5 != 0 || (f >= 0.0f && f <= 1.0f)) {
                if (f == -3.4028235E38f) {
                    f3 = f;
                }
                qv6Var.e = f3;
                qv6Var.f = i5;
                qv6Var.g = this.g;
                qv6Var.h = f2;
                qv6Var.i = i2;
                float f4 = this.j;
                if (i2 == 0) {
                    f2 = 1.0f - f2;
                } else if (i2 == 1) {
                    f2 = f2 <= 0.5f ? f2 * 2.0f : (1.0f - f2) * 2.0f;
                } else if (i2 != 2) {
                    xq0.q(String.valueOf(i2));
                    return null;
                }
                qv6Var.l = Math.min(f4, f2);
                qv6Var.p = this.k;
                charSequence = this.c;
                if (charSequence != null) {
                    qv6Var.a = charSequence;
                }
                return qv6Var;
            }
            f3 = 1.0f;
            qv6Var.e = f3;
            qv6Var.f = i5;
            qv6Var.g = this.g;
            qv6Var.h = f2;
            qv6Var.i = i2;
            float f42 = this.j;
            if (i2 == 0) {
            }
            qv6Var.l = Math.min(f42, f2);
            qv6Var.p = this.k;
            charSequence = this.c;
            if (charSequence != null) {
            }
            return qv6Var;
        }
        alignment = Layout.Alignment.ALIGN_NORMAL;
        qv6Var.c = alignment;
        f = this.e;
        int i52 = this.f;
        if (f != -3.4028235E38f) {
        }
        if (f == -3.4028235E38f) {
        }
        qv6Var.e = f3;
        qv6Var.f = i52;
        qv6Var.g = this.g;
        qv6Var.h = f2;
        qv6Var.i = i2;
        float f422 = this.j;
        if (i2 == 0) {
        }
        qv6Var.l = Math.min(f422, f2);
        qv6Var.p = this.k;
        charSequence = this.c;
        if (charSequence != null) {
        }
        return qv6Var;
    }
}
