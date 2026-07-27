package com.google.android.gms.internal.ads;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import t0.AbstractC5051n;

/* loaded from: classes2.dex */
public final class O3 implements InterfaceC3774q3 {

    /* renamed from: n, reason: collision with root package name */
    public final Lr f26641n = new Lr();

    /* renamed from: u, reason: collision with root package name */
    public final boolean f26642u;

    /* renamed from: v, reason: collision with root package name */
    public final int f26643v;

    /* renamed from: w, reason: collision with root package name */
    public final int f26644w;

    /* renamed from: x, reason: collision with root package name */
    public final String f26645x;

    /* renamed from: y, reason: collision with root package name */
    public final float f26646y;

    /* renamed from: z, reason: collision with root package name */
    public final int f26647z;

    public O3(List list) {
        int size = list.size();
        String str = com.anythink.basead.exoplayer.b.f6549m;
        if (size != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.f26643v = 0;
            this.f26644w = -1;
            this.f26645x = com.anythink.basead.exoplayer.b.f6549m;
            this.f26642u = false;
            this.f26646y = 0.85f;
            this.f26647z = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.f26643v = bArr[24];
        this.f26644w = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f26645x = true == "Serif".equals(new String(bArr, 43, bArr.length + (-43), StandardCharsets.UTF_8)) ? com.anythink.basead.exoplayer.b.f6548l : str;
        int i = bArr[25] * 20;
        this.f26647z = i;
        boolean z8 = (bArr[0] & 32) != 0;
        this.f26642u = z8;
        if (z8) {
            this.f26646y = Math.max(0.0f, Math.min(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.95f));
        } else {
            this.f26646y = 0.85f;
        }
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, int i, int i4, int i9, int i10, int i11) {
        if (i != i4) {
            int i12 = i11 | 33;
            int i13 = i & 1;
            int i14 = i & 2;
            boolean z8 = true;
            if (i13 == 0) {
                if (i14 != 0) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), i9, i10, i12);
                }
                z8 = false;
            } else if (i14 != 0) {
                spannableStringBuilder.setSpan(new StyleSpan(3), i9, i10, i12);
            } else {
                spannableStringBuilder.setSpan(new StyleSpan(1), i9, i10, i12);
                z8 = false;
            }
            if ((i & 4) != 0) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i9, i10, i12);
            } else {
                if (i13 != 0 || z8) {
                    return;
                }
                spannableStringBuilder.setSpan(new StyleSpan(0), i9, i10, i12);
            }
        }
    }

    public static void b(SpannableStringBuilder spannableStringBuilder, int i, int i4, int i9, int i10, int i11) {
        if (i != i4) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & com.anythink.basead.exoplayer.k.p.f8630b) << 24)), i9, i10, i11 | 33);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.InterfaceC3774q3
    public final void e(byte[] bArr, int i, int i4, X1.b bVar) {
        String k6;
        int i9;
        int i10;
        int i11;
        float f6;
        int i12;
        float max;
        int i13;
        int i14;
        float f9;
        int i15;
        int i16;
        int i17;
        Lr lr = this.f26641n;
        lr.z(i + i4, bArr);
        lr.E(i);
        int i18 = 0;
        int i19 = 1;
        int i20 = 2;
        PA.n(lr.B() >= 2);
        int L8 = lr.L();
        if (L8 == 0) {
            k6 = "";
        } else {
            int i21 = lr.f26234b;
            Charset q6 = lr.q();
            int i22 = lr.f26234b - i21;
            if (q6 == null) {
                q6 = StandardCharsets.UTF_8;
            }
            k6 = lr.k(L8 - i22, q6);
        }
        if (k6.isEmpty()) {
            SB sb = UB.f27942u;
            bVar.mo2b(new C3558m3(C3675oC.f33115x, com.anythink.basead.exoplayer.b.f6539b, com.anythink.basead.exoplayer.b.f6539b));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(k6);
        int length = spannableStringBuilder.length();
        int i23 = this.f26643v;
        a(spannableStringBuilder, i23, 0, 0, length, 16711680);
        int i24 = i23;
        int length2 = spannableStringBuilder.length();
        int i25 = this.f26644w;
        b(spannableStringBuilder, i25, -1, 0, length2, 16711680);
        int i26 = i25;
        int length3 = spannableStringBuilder.length();
        String str = this.f26645x;
        if (str != com.anythink.basead.exoplayer.b.f6549m) {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length3, 16711713);
        }
        float f10 = this.f26646y;
        while (lr.B() >= 8) {
            int i27 = lr.f26234b;
            int b9 = lr.b();
            int b10 = lr.b();
            if (b10 == 1937013100) {
                PA.n(lr.B() >= i20 ? i19 : i18);
                int L9 = lr.L();
                int i28 = i18;
                while (i28 < L9) {
                    PA.n(lr.B() >= 12 ? i19 : i18);
                    int L10 = lr.L();
                    int L11 = lr.L();
                    lr.G(i20);
                    int i29 = L9;
                    int K8 = lr.K();
                    lr.G(i19);
                    int b11 = lr.b();
                    int i30 = i19;
                    if (L11 > spannableStringBuilder.length()) {
                        int length4 = spannableStringBuilder.length();
                        i13 = i24;
                        i14 = i26;
                        f9 = f10;
                        StringBuilder sb2 = new StringBuilder(AbstractC5051n.a(String.valueOf(L11).length() + 44, 2, String.valueOf(length4)));
                        sb2.append("Truncating styl end (");
                        sb2.append(L11);
                        sb2.append(") to cueText.length() (");
                        sb2.append(length4);
                        sb2.append(").");
                        AbstractC3217fl.I("Tx3gParser", sb2.toString());
                        L11 = spannableStringBuilder.length();
                    } else {
                        i13 = i24;
                        i14 = i26;
                        f9 = f10;
                    }
                    if (L10 >= L11) {
                        StringBuilder sb3 = new StringBuilder(AbstractC5051n.a(String.valueOf(L10).length() + 36, 2, String.valueOf(L11)));
                        sb3.append("Ignoring styl with start (");
                        sb3.append(L10);
                        sb3.append(") >= end (");
                        sb3.append(L11);
                        sb3.append(").");
                        AbstractC3217fl.I("Tx3gParser", sb3.toString());
                        i16 = i28;
                        i15 = i29;
                        i17 = i14;
                    } else {
                        i15 = i29;
                        i16 = i28;
                        a(spannableStringBuilder, K8, i13, L10, L11, 0);
                        i17 = i14;
                        b(spannableStringBuilder, b11, i17, L10, L11, 0);
                    }
                    i19 = i30;
                    L9 = i15;
                    i26 = i17;
                    f10 = f9;
                    i24 = i13;
                    i20 = 2;
                    i28 = i16 + 1;
                    i18 = 0;
                }
                i9 = i24;
                i10 = i19;
                i11 = i26;
                f6 = f10;
                i12 = i20;
            } else {
                i9 = i24;
                i10 = i19;
                i11 = i26;
                f6 = f10;
                if (b10 == 1952608120 && this.f26642u) {
                    i12 = 2;
                    PA.n(lr.B() >= 2 ? i10 : 0);
                    float L12 = lr.L();
                    String str2 = AbstractC3548lu.f32613a;
                    max = Math.max(0.0f, Math.min(L12 / this.f26647z, 0.95f));
                    lr.E(i27 + b9);
                    i19 = i10;
                    i20 = i12;
                    i26 = i11;
                    i18 = 0;
                    f10 = max;
                    i24 = i9;
                } else {
                    i12 = 2;
                }
            }
            max = f6;
            lr.E(i27 + b9);
            i19 = i10;
            i20 = i12;
            i26 = i11;
            i18 = 0;
            f10 = max;
            i24 = i9;
        }
        bVar.mo2b(new C3558m3(UB.j(new C2522Dj(spannableStringBuilder, null, null, null, f10, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, 0.0f, 0)), com.anythink.basead.exoplayer.b.f6539b, com.anythink.basead.exoplayer.b.f6539b));
    }
}
