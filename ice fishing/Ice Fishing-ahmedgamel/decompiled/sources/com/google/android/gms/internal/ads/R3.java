package com.google.android.gms.internal.ads;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import w.AbstractC5128c;

/* loaded from: classes2.dex */
public final class R3 implements InterfaceC3891s3 {

    /* renamed from: n, reason: collision with root package name */
    public final Cr f27916n = new Cr();

    /* renamed from: u, reason: collision with root package name */
    public final boolean f27917u;

    /* renamed from: v, reason: collision with root package name */
    public final int f27918v;

    /* renamed from: w, reason: collision with root package name */
    public final int f27919w;

    /* renamed from: x, reason: collision with root package name */
    public final String f27920x;

    /* renamed from: y, reason: collision with root package name */
    public final float f27921y;

    /* renamed from: z, reason: collision with root package name */
    public final int f27922z;

    public R3(List list) {
        int size = list.size();
        String str = com.anythink.basead.exoplayer.b.f7178m;
        if (size != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.f27918v = 0;
            this.f27919w = -1;
            this.f27920x = com.anythink.basead.exoplayer.b.f7178m;
            this.f27917u = false;
            this.f27921y = 0.85f;
            this.f27922z = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.f27918v = bArr[24];
        this.f27919w = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f27920x = true == "Serif".equals(new String(bArr, 43, bArr.length + (-43), StandardCharsets.UTF_8)) ? com.anythink.basead.exoplayer.b.f7177l : str;
        int i = bArr[25] * 20;
        this.f27922z = i;
        boolean z6 = (bArr[0] & 32) != 0;
        this.f27917u = z6;
        if (z6) {
            this.f27921y = Math.max(0.0f, Math.min(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.95f));
        } else {
            this.f27921y = 0.85f;
        }
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, int i, int i4, int i6, int i9, int i10) {
        if (i != i4) {
            int i11 = i10 | 33;
            int i12 = i & 1;
            int i13 = i & 2;
            boolean z6 = true;
            if (i12 == 0) {
                if (i13 != 0) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), i6, i9, i11);
                }
                z6 = false;
            } else if (i13 != 0) {
                spannableStringBuilder.setSpan(new StyleSpan(3), i6, i9, i11);
            } else {
                spannableStringBuilder.setSpan(new StyleSpan(1), i6, i9, i11);
                z6 = false;
            }
            if ((i & 4) != 0) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i6, i9, i11);
            } else {
                if (i12 != 0 || z6) {
                    return;
                }
                spannableStringBuilder.setSpan(new StyleSpan(0), i6, i9, i11);
            }
        }
    }

    public static void b(SpannableStringBuilder spannableStringBuilder, int i, int i4, int i6, int i9, int i10) {
        if (i != i4) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & com.anythink.basead.exoplayer.k.p.f9259b) << 24)), i6, i9, i10 | 33);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.InterfaceC3891s3
    public final void x(byte[] bArr, int i, int i4, Z1.b bVar) {
        String k9;
        int i6;
        int i9;
        int i10;
        float f2;
        int i11;
        float max;
        int i12;
        int i13;
        float f9;
        int i14;
        int i15;
        int i16;
        Cr cr = this.f27916n;
        cr.z(i + i4, bArr);
        cr.E(i);
        int i17 = 0;
        int i18 = 1;
        int i19 = 2;
        AbstractC2792Sd.i(cr.B() >= 2);
        int L2 = cr.L();
        if (L2 == 0) {
            k9 = "";
        } else {
            int i20 = cr.f24998b;
            Charset q8 = cr.q();
            int i21 = cr.f24998b - i20;
            if (q8 == null) {
                q8 = StandardCharsets.UTF_8;
            }
            k9 = cr.k(L2 - i21, q8);
        }
        if (k9.isEmpty()) {
            PB pb = RB.f27933u;
            bVar.mo9a(new C3676o3(C3523lC.f32525x, com.anythink.basead.exoplayer.b.f7168b, com.anythink.basead.exoplayer.b.f7168b));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(k9);
        int length = spannableStringBuilder.length();
        int i22 = this.f27918v;
        a(spannableStringBuilder, i22, 0, 0, length, 16711680);
        int i23 = i22;
        int length2 = spannableStringBuilder.length();
        int i24 = this.f27919w;
        b(spannableStringBuilder, i24, -1, 0, length2, 16711680);
        int i25 = i24;
        int length3 = spannableStringBuilder.length();
        String str = this.f27920x;
        if (str != com.anythink.basead.exoplayer.b.f7178m) {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length3, 16711713);
        }
        float f10 = this.f27921y;
        while (cr.B() >= 8) {
            int i26 = cr.f24998b;
            int b9 = cr.b();
            int b10 = cr.b();
            if (b10 == 1937013100) {
                AbstractC2792Sd.i(cr.B() >= i19 ? i18 : i17);
                int L6 = cr.L();
                int i27 = i17;
                while (i27 < L6) {
                    AbstractC2792Sd.i(cr.B() >= 12 ? i18 : i17);
                    int L8 = cr.L();
                    int L9 = cr.L();
                    cr.G(i19);
                    int i28 = L6;
                    int K7 = cr.K();
                    cr.G(i18);
                    int b11 = cr.b();
                    int i29 = i18;
                    if (L9 > spannableStringBuilder.length()) {
                        int length4 = spannableStringBuilder.length();
                        i12 = i23;
                        i13 = i25;
                        f9 = f10;
                        StringBuilder sb = new StringBuilder(AbstractC5128c.j(String.valueOf(L9).length() + 44, 2, String.valueOf(length4)));
                        sb.append("Truncating styl end (");
                        sb.append(L9);
                        sb.append(") to cueText.length() (");
                        sb.append(length4);
                        sb.append(").");
                        AbstractC2991bG.y("Tx3gParser", sb.toString());
                        L9 = spannableStringBuilder.length();
                    } else {
                        i12 = i23;
                        i13 = i25;
                        f9 = f10;
                    }
                    if (L8 >= L9) {
                        StringBuilder sb2 = new StringBuilder(AbstractC5128c.j(String.valueOf(L8).length() + 36, 2, String.valueOf(L9)));
                        sb2.append("Ignoring styl with start (");
                        sb2.append(L8);
                        sb2.append(") >= end (");
                        sb2.append(L9);
                        sb2.append(").");
                        AbstractC2991bG.y("Tx3gParser", sb2.toString());
                        i15 = i27;
                        i14 = i28;
                        i16 = i13;
                    } else {
                        i14 = i28;
                        i15 = i27;
                        a(spannableStringBuilder, K7, i12, L8, L9, 0);
                        i16 = i13;
                        b(spannableStringBuilder, b11, i16, L8, L9, 0);
                    }
                    i18 = i29;
                    L6 = i14;
                    i25 = i16;
                    f10 = f9;
                    i23 = i12;
                    i19 = 2;
                    i27 = i15 + 1;
                    i17 = 0;
                }
                i6 = i23;
                i9 = i18;
                i10 = i25;
                f2 = f10;
                i11 = i19;
            } else {
                i6 = i23;
                i9 = i18;
                i10 = i25;
                f2 = f10;
                if (b10 == 1952608120 && this.f27917u) {
                    i11 = 2;
                    AbstractC2792Sd.i(cr.B() >= 2 ? i9 : 0);
                    float L10 = cr.L();
                    String str2 = AbstractC3182eu.f30782a;
                    max = Math.max(0.0f, Math.min(L10 / this.f27922z, 0.95f));
                    cr.E(i26 + b9);
                    i18 = i9;
                    i19 = i11;
                    i25 = i10;
                    i17 = 0;
                    f10 = max;
                    i23 = i6;
                } else {
                    i11 = 2;
                }
            }
            max = f2;
            cr.E(i26 + b9);
            i18 = i9;
            i19 = i11;
            i25 = i10;
            i17 = 0;
            f10 = max;
            i23 = i6;
        }
        bVar.mo9a(new C3676o3(RB.j(new C4302zj(spannableStringBuilder, null, null, null, f10, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, 0.0f, 0)), com.anythink.basead.exoplayer.b.f7168b, com.anythink.basead.exoplayer.b.f7168b));
    }
}
