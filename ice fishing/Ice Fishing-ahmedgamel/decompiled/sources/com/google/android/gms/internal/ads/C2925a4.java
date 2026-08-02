package com.google.android.gms.internal.ads;

import android.text.Layout;

/* renamed from: com.google.android.gms.internal.ads.a4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2925a4 {

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f29787c;

    /* renamed from: a, reason: collision with root package name */
    public long f29785a = 0;

    /* renamed from: b, reason: collision with root package name */
    public long f29786b = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f29788d = 2;

    /* renamed from: e, reason: collision with root package name */
    public float f29789e = -3.4028235E38f;

    /* renamed from: f, reason: collision with root package name */
    public int f29790f = 1;

    /* renamed from: g, reason: collision with root package name */
    public int f29791g = 0;

    /* renamed from: h, reason: collision with root package name */
    public float f29792h = -3.4028235E38f;
    public int i = Integer.MIN_VALUE;

    /* renamed from: j, reason: collision with root package name */
    public float f29793j = 1.0f;

    /* renamed from: k, reason: collision with root package name */
    public int f29794k = Integer.MIN_VALUE;

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
    public final C3924sj a() {
        Layout.Alignment alignment;
        float f2;
        CharSequence charSequence;
        float f9 = this.f29792h;
        float f10 = -3.4028235E38f;
        if (f9 == -3.4028235E38f) {
            int i = this.f29788d;
            f9 = i != 4 ? i != 5 ? 0.5f : 1.0f : 0.0f;
        }
        int i4 = this.i;
        if (i4 == Integer.MIN_VALUE) {
            int i6 = this.f29788d;
            if (i6 != 1) {
                if (i6 != 3) {
                    if (i6 != 4) {
                        if (i6 != 5) {
                            i4 = 1;
                        }
                    }
                }
                i4 = 2;
            }
            i4 = 0;
        }
        C3924sj c3924sj = new C3924sj();
        int i9 = this.f29788d;
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    if (i9 != 4) {
                        if (i9 != 5) {
                            com.IceFishing.LiveIceFishing.k.t(i9, "Unknown textAlignment: ", "WebvttCueParser", new StringBuilder(String.valueOf(i9).length() + 23));
                            alignment = null;
                        }
                    }
                }
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else {
                alignment = Layout.Alignment.ALIGN_CENTER;
            }
            c3924sj.f34888c = alignment;
            f2 = this.f29789e;
            int i10 = this.f29790f;
            if (f2 != -3.4028235E38f || i10 != 0 || (f2 >= 0.0f && f2 <= 1.0f)) {
                if (f2 == -3.4028235E38f) {
                    f10 = f2;
                }
                c3924sj.f34890e = f10;
                c3924sj.f34891f = i10;
                c3924sj.f34892g = this.f29791g;
                c3924sj.f34893h = f9;
                c3924sj.i = i4;
                float f11 = this.f29793j;
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
                c3924sj.f34896l = Math.min(f11, f9);
                c3924sj.f34898n = this.f29794k;
                charSequence = this.f29787c;
                if (charSequence != null) {
                    c3924sj.f34886a = charSequence;
                    c3924sj.f34887b = null;
                }
                return c3924sj;
            }
            f10 = 1.0f;
            c3924sj.f34890e = f10;
            c3924sj.f34891f = i10;
            c3924sj.f34892g = this.f29791g;
            c3924sj.f34893h = f9;
            c3924sj.i = i4;
            float f112 = this.f29793j;
            if (i4 == 0) {
            }
            c3924sj.f34896l = Math.min(f112, f9);
            c3924sj.f34898n = this.f29794k;
            charSequence = this.f29787c;
            if (charSequence != null) {
            }
            return c3924sj;
        }
        alignment = Layout.Alignment.ALIGN_NORMAL;
        c3924sj.f34888c = alignment;
        f2 = this.f29789e;
        int i102 = this.f29790f;
        if (f2 != -3.4028235E38f) {
        }
        if (f2 == -3.4028235E38f) {
        }
        c3924sj.f34890e = f10;
        c3924sj.f34891f = i102;
        c3924sj.f34892g = this.f29791g;
        c3924sj.f34893h = f9;
        c3924sj.i = i4;
        float f1122 = this.f29793j;
        if (i4 == 0) {
        }
        c3924sj.f34896l = Math.min(f1122, f9);
        c3924sj.f34898n = this.f29794k;
        charSequence = this.f29787c;
        if (charSequence != null) {
        }
        return c3924sj;
    }
}
