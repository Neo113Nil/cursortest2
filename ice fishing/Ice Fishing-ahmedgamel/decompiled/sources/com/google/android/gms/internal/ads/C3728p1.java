package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.p1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3728p1 implements Q0 {

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f33792l = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f33793m = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* renamed from: n, reason: collision with root package name */
    public static final byte[] f33794n;

    /* renamed from: o, reason: collision with root package name */
    public static final byte[] f33795o;

    /* renamed from: b, reason: collision with root package name */
    public boolean f33797b;

    /* renamed from: c, reason: collision with root package name */
    public long f33798c;

    /* renamed from: d, reason: collision with root package name */
    public int f33799d;

    /* renamed from: e, reason: collision with root package name */
    public int f33800e;

    /* renamed from: g, reason: collision with root package name */
    public FQ f33802g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC3566m1 f33803h;

    /* renamed from: j, reason: collision with root package name */
    public V0 f33804j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f33805k;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f33796a = new byte[1];

    /* renamed from: f, reason: collision with root package name */
    public int f33801f = -1;
    public InterfaceC3566m1 i = new O0();

    static {
        String str = AbstractC3182eu.f30782a;
        Charset charset = StandardCharsets.UTF_8;
        f33794n = "#!AMR\n".getBytes(charset);
        f33795o = "#!AMR-WB\n".getBytes(charset);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0145 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0146 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00aa A[Catch: EOFException -> 0x0103, TryCatch #0 {EOFException -> 0x0103, blocks: (B:39:0x0073, B:41:0x0088, B:49:0x00aa, B:50:0x00af, B:54:0x00ad, B:64:0x00c1, B:65:0x00e4, B:66:0x00e5, B:67:0x0102), top: B:38:0x0073 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ad A[Catch: EOFException -> 0x0103, TryCatch #0 {EOFException -> 0x0103, blocks: (B:39:0x0073, B:41:0x0088, B:49:0x00aa, B:50:0x00af, B:54:0x00ad, B:64:0x00c1, B:65:0x00e4, B:66:0x00e5, B:67:0x0102), top: B:38:0x0073 }] */
    @Override // com.google.android.gms.internal.ads.Q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(R0 r02, U0 u02) {
        char c9;
        this.f33803h.getClass();
        String str = AbstractC3182eu.f30782a;
        if (((K0) r02).f26571w == 0 && !g((K0) r02)) {
            throw U4.a(null, "Could not find AMR header.");
        }
        boolean z6 = this.f33805k;
        int[] iArr = f33792l;
        int[] iArr2 = f33793m;
        if (!z6) {
            this.f33805k = true;
            boolean z9 = this.f33797b;
            String str2 = com.anythink.basead.exoplayer.k.o.J;
            String str3 = true != z9 ? "audio/amr" : com.anythink.basead.exoplayer.k.o.J;
            if (true != z9) {
                str2 = com.anythink.basead.exoplayer.k.o.f9214I;
            }
            int i = true != z9 ? 8000 : 16000;
            int i4 = z9 ? iArr2[8] : iArr[7];
            InterfaceC3566m1 interfaceC3566m1 = this.f33803h;
            C3322hP c3322hP = new C3322hP();
            c3322hP.d(str3);
            c3322hP.e(str2);
            c3322hP.f31559o = i4;
            c3322hP.f31538G = 1;
            c3322hP.f31540I = i;
            interfaceC3566m1.e(new DP(c3322hP));
        }
        int i6 = this.f33800e;
        if (i6 == 0) {
            try {
                ((K0) r02).f26573y = 0;
                byte[] bArr = this.f33796a;
                ((K0) r02).E(bArr, 0, 1, false);
                byte b9 = bArr[0];
                if ((b9 & 131) > 0) {
                    StringBuilder sb = new StringBuilder(String.valueOf((int) b9).length() + 38);
                    sb.append("Invalid padding bits for frame header ");
                    sb.append((int) b9);
                    throw U4.a(null, sb.toString());
                }
                boolean z10 = this.f33797b;
                int i9 = (b9 >> 3) & 15;
                if (z10) {
                    if (i9 >= 10) {
                        if (i9 > 13) {
                        }
                    }
                    i6 = !z10 ? iArr2[i9] : iArr[i9];
                    this.f33799d = i6;
                    this.f33800e = i6;
                    if (this.f33801f == -1) {
                        this.f33801f = i6;
                    }
                }
                if (!z10) {
                    if (i9 >= 12 && i9 <= 14) {
                    }
                    if (!z10) {
                    }
                    this.f33799d = i6;
                    this.f33800e = i6;
                    if (this.f33801f == -1) {
                    }
                }
                String str4 = true != z10 ? "NB" : "WB";
                StringBuilder sb2 = new StringBuilder(String.valueOf(i9).length() + 26);
                sb2.append("Illegal AMR ");
                sb2.append(str4);
                sb2.append(" frame type ");
                sb2.append(i9);
                throw U4.a(null, sb2.toString());
            } catch (EOFException unused) {
            }
        }
        int d9 = this.i.d(r02, i6, true);
        if (d9 != -1) {
            int i10 = this.f33800e - d9;
            this.f33800e = i10;
            if (i10 <= 0) {
                this.i.c(this.f33798c, 1, this.f33799d, 0, null);
                this.f33798c += 20000;
            }
            c9 = 0;
            if (this.f33804j == null) {
                V0 v02 = new V0(com.anythink.basead.exoplayer.b.f7168b, 0L);
                this.f33804j = v02;
                this.f33802g.D(v02);
            }
            return c9 != 65535 ? -1 : 0;
        }
        c9 = 65535;
        if (this.f33804j == null) {
        }
        if (c9 != 65535) {
        }
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void b(S0 s02) {
        FQ fq = (FQ) s02;
        this.f33802g = fq;
        InterfaceC3566m1 C8 = fq.C(0, 1);
        this.f33803h = C8;
        this.i = C8;
        fq.B();
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void c(long j6, long j9) {
        this.f33798c = 0L;
        this.f33799d = 0;
        this.f33800e = 0;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final boolean d(R0 r02) {
        return g((K0) r02);
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void e() {
    }

    public final boolean g(K0 k02) {
        k02.f26573y = 0;
        byte[] bArr = f33794n;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        k02.E(bArr2, 0, length, false);
        if (Arrays.equals(bArr2, bArr)) {
            this.f33797b = false;
            k02.a(bArr.length, false);
            return true;
        }
        k02.f26573y = 0;
        byte[] bArr3 = f33795o;
        int length2 = bArr3.length;
        byte[] bArr4 = new byte[length2];
        k02.E(bArr4, 0, length2, false);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f33797b = true;
        k02.a(bArr3.length, false);
        return true;
    }
}
