package com.google.android.gms.internal.ads;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* loaded from: classes2.dex */
public final class R3 implements InterfaceC3868s3 {

    /* renamed from: n, reason: collision with root package name */
    public final Cr f27160n = new Cr();

    /* renamed from: u, reason: collision with root package name */
    public final boolean f27161u;

    /* renamed from: v, reason: collision with root package name */
    public final int f27162v;

    /* renamed from: w, reason: collision with root package name */
    public final int f27163w;

    /* renamed from: x, reason: collision with root package name */
    public final String f27164x;

    /* renamed from: y, reason: collision with root package name */
    public final float f27165y;

    /* renamed from: z, reason: collision with root package name */
    public final int f27166z;

    public R3(List list) {
        int size = list.size();
        String str = com.anythink.basead.exoplayer.b.f6392m;
        if (size != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.f27162v = 0;
            this.f27163w = -1;
            this.f27164x = com.anythink.basead.exoplayer.b.f6392m;
            this.f27161u = false;
            this.f27165y = 0.85f;
            this.f27166z = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.f27162v = bArr[24];
        this.f27163w = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f27164x = true == "Serif".equals(new String(bArr, 43, bArr.length + (-43), StandardCharsets.UTF_8)) ? com.anythink.basead.exoplayer.b.f6391l : str;
        int i = bArr[25] * 20;
        this.f27166z = i;
        boolean z3 = (bArr[0] & 32) != 0;
        this.f27161u = z3;
        if (z3) {
            this.f27165y = Math.max(0.0f, Math.min(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.95f));
        } else {
            this.f27165y = 0.85f;
        }
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, int i, int i6, int i9, int i10, int i11) {
        if (i != i6) {
            int i12 = i11 | 33;
            int i13 = i & 1;
            int i14 = i & 2;
            boolean z3 = true;
            if (i13 == 0) {
                if (i14 != 0) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), i9, i10, i12);
                }
                z3 = false;
            } else if (i14 != 0) {
                spannableStringBuilder.setSpan(new StyleSpan(3), i9, i10, i12);
            } else {
                spannableStringBuilder.setSpan(new StyleSpan(1), i9, i10, i12);
                z3 = false;
            }
            if ((i & 4) != 0) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i9, i10, i12);
            } else {
                if (i13 != 0 || z3) {
                    return;
                }
                spannableStringBuilder.setSpan(new StyleSpan(0), i9, i10, i12);
            }
        }
    }

    public static void b(SpannableStringBuilder spannableStringBuilder, int i, int i6, int i9, int i10, int i11) {
        if (i != i6) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & com.anythink.basead.exoplayer.k.p.f8473b) << 24)), i9, i10, i11 | 33);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.InterfaceC3868s3
    public final void h(byte[] bArr, int i, int i6, X1.b bVar) {
        String k9;
        int i9;
        int i10;
        int i11;
        float f3;
        int i12;
        float max;
        int i13;
        int i14;
        float f9;
        int i15;
        int i16;
        int i17;
        Cr cr = this.f27160n;
        cr.z(i + i6, bArr);
        cr.E(i);
        int i18 = 0;
        int i19 = 1;
        int i20 = 2;
        AbstractC2772Sd.i(cr.B() >= 2);
        int L6 = cr.L();
        if (L6 == 0) {
            k9 = "";
        } else {
            int i21 = cr.f24253b;
            Charset q8 = cr.q();
            int i22 = cr.f24253b - i21;
            if (q8 == null) {
                q8 = StandardCharsets.UTF_8;
            }
            k9 = cr.k(L6 - i22, q8);
        }
        if (k9.isEmpty()) {
            PB pb = RB.f27177u;
            bVar.mo10a(new C3653o3(C3500lC.f31745x, com.anythink.basead.exoplayer.b.f6382b, com.anythink.basead.exoplayer.b.f6382b));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(k9);
        int length = spannableStringBuilder.length();
        int i23 = this.f27162v;
        a(spannableStringBuilder, i23, 0, 0, length, 16711680);
        int i24 = i23;
        int length2 = spannableStringBuilder.length();
        int i25 = this.f27163w;
        b(spannableStringBuilder, i25, -1, 0, length2, 16711680);
        int i26 = i25;
        int length3 = spannableStringBuilder.length();
        String str = this.f27164x;
        if (str != com.anythink.basead.exoplayer.b.f6392m) {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length3, 16711713);
        }
        float f10 = this.f27165y;
        while (cr.B() >= 8) {
            int i27 = cr.f24253b;
            int b9 = cr.b();
            int b10 = cr.b();
            if (b10 == 1937013100) {
                AbstractC2772Sd.i(cr.B() >= i20 ? i19 : i18);
                int L8 = cr.L();
                int i28 = i18;
                while (i28 < L8) {
                    AbstractC2772Sd.i(cr.B() >= 12 ? i19 : i18);
                    int L9 = cr.L();
                    int L10 = cr.L();
                    cr.G(i20);
                    int i29 = L8;
                    int K7 = cr.K();
                    cr.G(i19);
                    int b11 = cr.b();
                    int i30 = i19;
                    if (L10 > spannableStringBuilder.length()) {
                        int length4 = spannableStringBuilder.length();
                        i13 = i24;
                        i14 = i26;
                        f9 = f10;
                        StringBuilder sb = new StringBuilder(u1.h.a(String.valueOf(L10).length() + 44, 2, String.valueOf(length4)));
                        sb.append("Truncating styl end (");
                        sb.append(L10);
                        sb.append(") to cueText.length() (");
                        sb.append(length4);
                        sb.append(").");
                        AbstractC2968bG.y("Tx3gParser", sb.toString());
                        L10 = spannableStringBuilder.length();
                    } else {
                        i13 = i24;
                        i14 = i26;
                        f9 = f10;
                    }
                    if (L9 >= L10) {
                        StringBuilder sb2 = new StringBuilder(u1.h.a(String.valueOf(L9).length() + 36, 2, String.valueOf(L10)));
                        sb2.append("Ignoring styl with start (");
                        sb2.append(L9);
                        sb2.append(") >= end (");
                        sb2.append(L10);
                        sb2.append(").");
                        AbstractC2968bG.y("Tx3gParser", sb2.toString());
                        i16 = i28;
                        i15 = i29;
                        i17 = i14;
                    } else {
                        i15 = i29;
                        i16 = i28;
                        a(spannableStringBuilder, K7, i13, L9, L10, 0);
                        i17 = i14;
                        b(spannableStringBuilder, b11, i17, L9, L10, 0);
                    }
                    i19 = i30;
                    L8 = i15;
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
                f3 = f10;
                i12 = i20;
            } else {
                i9 = i24;
                i10 = i19;
                i11 = i26;
                f3 = f10;
                if (b10 == 1952608120 && this.f27161u) {
                    i12 = 2;
                    AbstractC2772Sd.i(cr.B() >= 2 ? i10 : 0);
                    float L11 = cr.L();
                    String str2 = AbstractC3159eu.f29993a;
                    max = Math.max(0.0f, Math.min(L11 / this.f27166z, 0.95f));
                    cr.E(i27 + b9);
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
            max = f3;
            cr.E(i27 + b9);
            i19 = i10;
            i20 = i12;
            i26 = i11;
            i18 = 0;
            f10 = max;
            i24 = i9;
        }
        bVar.mo10a(new C3653o3(RB.j(new C4279zj(spannableStringBuilder, null, null, null, f10, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, 0.0f, 0)), com.anythink.basead.exoplayer.b.f6382b, com.anythink.basead.exoplayer.b.f6382b));
    }
}
