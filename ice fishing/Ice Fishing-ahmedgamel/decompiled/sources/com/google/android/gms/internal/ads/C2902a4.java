package com.google.android.gms.internal.ads;

import android.text.Layout;

/* renamed from: com.google.android.gms.internal.ads.a4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2902a4 {

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f29017c;

    /* renamed from: a, reason: collision with root package name */
    public long f29015a = 0;

    /* renamed from: b, reason: collision with root package name */
    public long f29016b = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f29018d = 2;

    /* renamed from: e, reason: collision with root package name */
    public float f29019e = -3.4028235E38f;

    /* renamed from: f, reason: collision with root package name */
    public int f29020f = 1;

    /* renamed from: g, reason: collision with root package name */
    public int f29021g = 0;

    /* renamed from: h, reason: collision with root package name */
    public float f29022h = -3.4028235E38f;
    public int i = Integer.MIN_VALUE;

    /* renamed from: j, reason: collision with root package name */
    public float f29023j = 1.0f;

    /* renamed from: k, reason: collision with root package name */
    public int f29024k = Integer.MIN_VALUE;

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
    public final C3901sj a() {
        Layout.Alignment alignment;
        float f3;
        CharSequence charSequence;
        float f9 = this.f29022h;
        float f10 = -3.4028235E38f;
        if (f9 == -3.4028235E38f) {
            int i = this.f29018d;
            f9 = i != 4 ? i != 5 ? 0.5f : 1.0f : 0.0f;
        }
        int i6 = this.i;
        if (i6 == Integer.MIN_VALUE) {
            int i9 = this.f29018d;
            if (i9 != 1) {
                if (i9 != 3) {
                    if (i9 != 4) {
                        if (i9 != 5) {
                            i6 = 1;
                        }
                    }
                }
                i6 = 2;
            }
            i6 = 0;
        }
        C3901sj c3901sj = new C3901sj();
        int i10 = this.f29018d;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            com.anythink.basead.exoplayer.f.f.q(i10, "Unknown textAlignment: ", "WebvttCueParser", new StringBuilder(String.valueOf(i10).length() + 23));
                            alignment = null;
                        }
                    }
                }
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else {
                alignment = Layout.Alignment.ALIGN_CENTER;
            }
            c3901sj.f34121c = alignment;
            f3 = this.f29019e;
            int i11 = this.f29020f;
            if (f3 != -3.4028235E38f || i11 != 0 || (f3 >= 0.0f && f3 <= 1.0f)) {
                if (f3 == -3.4028235E38f) {
                    f10 = f3;
                }
                c3901sj.f34123e = f10;
                c3901sj.f34124f = i11;
                c3901sj.f34125g = this.f29021g;
                c3901sj.f34126h = f9;
                c3901sj.i = i6;
                float f11 = this.f29023j;
                if (i6 == 0) {
                    f9 = 1.0f - f9;
                } else if (i6 != 1) {
                    if (i6 != 2) {
                        throw new IllegalStateException(String.valueOf(i6));
                    }
                } else if (f9 <= 0.5f) {
                    f9 += f9;
                } else {
                    float f12 = 1.0f - f9;
                    f9 = f12 + f12;
                }
                c3901sj.f34129l = Math.min(f11, f9);
                c3901sj.f34131n = this.f29024k;
                charSequence = this.f29017c;
                if (charSequence != null) {
                    c3901sj.f34119a = charSequence;
                    c3901sj.f34120b = null;
                }
                return c3901sj;
            }
            f10 = 1.0f;
            c3901sj.f34123e = f10;
            c3901sj.f34124f = i11;
            c3901sj.f34125g = this.f29021g;
            c3901sj.f34126h = f9;
            c3901sj.i = i6;
            float f112 = this.f29023j;
            if (i6 == 0) {
            }
            c3901sj.f34129l = Math.min(f112, f9);
            c3901sj.f34131n = this.f29024k;
            charSequence = this.f29017c;
            if (charSequence != null) {
            }
            return c3901sj;
        }
        alignment = Layout.Alignment.ALIGN_NORMAL;
        c3901sj.f34121c = alignment;
        f3 = this.f29019e;
        int i112 = this.f29020f;
        if (f3 != -3.4028235E38f) {
        }
        if (f3 == -3.4028235E38f) {
        }
        c3901sj.f34123e = f10;
        c3901sj.f34124f = i112;
        c3901sj.f34125g = this.f29021g;
        c3901sj.f34126h = f9;
        c3901sj.i = i6;
        float f1122 = this.f29023j;
        if (i6 == 0) {
        }
        c3901sj.f34129l = Math.min(f1122, f9);
        c3901sj.f34131n = this.f29024k;
        charSequence = this.f29017c;
        if (charSequence != null) {
        }
        return c3901sj;
    }
}
