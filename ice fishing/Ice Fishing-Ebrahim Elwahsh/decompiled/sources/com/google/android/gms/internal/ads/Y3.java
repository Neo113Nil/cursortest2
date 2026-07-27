package com.google.android.gms.internal.ads;

import android.text.Layout;

/* loaded from: classes2.dex */
public final class Y3 {

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f28779c;

    /* renamed from: a, reason: collision with root package name */
    public long f28777a = 0;

    /* renamed from: b, reason: collision with root package name */
    public long f28778b = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f28780d = 2;

    /* renamed from: e, reason: collision with root package name */
    public float f28781e = -3.4028235E38f;

    /* renamed from: f, reason: collision with root package name */
    public int f28782f = 1;

    /* renamed from: g, reason: collision with root package name */
    public int f28783g = 0;

    /* renamed from: h, reason: collision with root package name */
    public float f28784h = -3.4028235E38f;
    public int i = Integer.MIN_VALUE;

    /* renamed from: j, reason: collision with root package name */
    public float f28785j = 1.0f;

    /* renamed from: k, reason: collision with root package name */
    public int f28786k = Integer.MIN_VALUE;

    /* JADX WARN: Code restructure failed: missing block: B:51:0x007f, code lost:
    
        if (r6 == 0) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C3914sj a() {
        Layout.Alignment alignment;
        float f6;
        CharSequence charSequence;
        float f9 = this.f28784h;
        float f10 = -3.4028235E38f;
        if (f9 == -3.4028235E38f) {
            int i = this.f28780d;
            f9 = i != 4 ? i != 5 ? 0.5f : 1.0f : 0.0f;
        }
        int i4 = this.i;
        if (i4 == Integer.MIN_VALUE) {
            int i9 = this.f28780d;
            if (i9 != 1) {
                if (i9 != 3) {
                    if (i9 != 4) {
                        if (i9 != 5) {
                            i4 = 1;
                        }
                    }
                }
                i4 = 2;
            }
            i4 = 0;
        }
        C3914sj c3914sj = new C3914sj();
        int i10 = this.f28780d;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            com.anythink.basead.b.c.i.s(i10, "Unknown textAlignment: ", "WebvttCueParser", new StringBuilder(String.valueOf(i10).length() + 23));
                            alignment = null;
                        }
                    }
                }
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else {
                alignment = Layout.Alignment.ALIGN_CENTER;
            }
            c3914sj.f34263c = alignment;
            f6 = this.f28781e;
            int i11 = this.f28782f;
            if (f6 != -3.4028235E38f || i11 != 0 || (f6 >= 0.0f && f6 <= 1.0f)) {
                if (f6 == -3.4028235E38f) {
                    f10 = f6;
                }
                c3914sj.f34265e = f10;
                c3914sj.f34266f = i11;
                c3914sj.f34267g = this.f28783g;
                c3914sj.f34268h = f9;
                c3914sj.i = i4;
                float f11 = this.f28785j;
                if (i4 == 0) {
                    f9 = 1.0f - f9;
                } else if (i4 != 1) {
                    if (i4 != 2) {
                        throw new IllegalStateException(String.valueOf(i4));
                    }
                } else if (f9 <= 0.5f) {
                    f9 += f9;
                } else {
                    float f12 = 1.0f - f9;
                    f9 = f12 + f12;
                }
                c3914sj.f34271l = Math.min(f11, f9);
                c3914sj.f34273n = this.f28786k;
                charSequence = this.f28779c;
                if (charSequence != null) {
                    c3914sj.f34261a = charSequence;
                    c3914sj.f34262b = null;
                }
                return c3914sj;
            }
            f10 = 1.0f;
            c3914sj.f34265e = f10;
            c3914sj.f34266f = i11;
            c3914sj.f34267g = this.f28783g;
            c3914sj.f34268h = f9;
            c3914sj.i = i4;
            float f112 = this.f28785j;
            if (i4 == 0) {
            }
            c3914sj.f34271l = Math.min(f112, f9);
            c3914sj.f34273n = this.f28786k;
            charSequence = this.f28779c;
            if (charSequence != null) {
            }
            return c3914sj;
        }
        alignment = Layout.Alignment.ALIGN_NORMAL;
        c3914sj.f34263c = alignment;
        f6 = this.f28781e;
        int i112 = this.f28782f;
        if (f6 != -3.4028235E38f) {
        }
        if (f6 == -3.4028235E38f) {
        }
        c3914sj.f34265e = f10;
        c3914sj.f34266f = i112;
        c3914sj.f34267g = this.f28783g;
        c3914sj.f34268h = f9;
        c3914sj.i = i4;
        float f1122 = this.f28785j;
        if (i4 == 0) {
        }
        c3914sj.f34271l = Math.min(f1122, f9);
        c3914sj.f34273n = this.f28786k;
        charSequence = this.f28779c;
        if (charSequence != null) {
        }
        return c3914sj;
    }
}
