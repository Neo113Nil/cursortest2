package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.p1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3705p1 implements Q0 {

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f33002l = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f33003m = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* renamed from: n, reason: collision with root package name */
    public static final byte[] f33004n;

    /* renamed from: o, reason: collision with root package name */
    public static final byte[] f33005o;

    /* renamed from: b, reason: collision with root package name */
    public boolean f33007b;

    /* renamed from: c, reason: collision with root package name */
    public long f33008c;

    /* renamed from: d, reason: collision with root package name */
    public int f33009d;

    /* renamed from: e, reason: collision with root package name */
    public int f33010e;

    /* renamed from: g, reason: collision with root package name */
    public CQ f33012g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC3543m1 f33013h;

    /* renamed from: j, reason: collision with root package name */
    public V0 f33014j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f33015k;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f33006a = new byte[1];

    /* renamed from: f, reason: collision with root package name */
    public int f33011f = -1;
    public InterfaceC3543m1 i = new O0();

    static {
        String str = AbstractC3159eu.f29993a;
        Charset charset = StandardCharsets.UTF_8;
        f33004n = "#!AMR\n".getBytes(charset);
        f33005o = "#!AMR-WB\n".getBytes(charset);
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
        this.f33013h.getClass();
        String str = AbstractC3159eu.f29993a;
        if (((K0) r02).f25819w == 0 && !g((K0) r02)) {
            throw U4.a(null, "Could not find AMR header.");
        }
        boolean z3 = this.f33015k;
        int[] iArr = f33002l;
        int[] iArr2 = f33003m;
        if (!z3) {
            this.f33015k = true;
            boolean z6 = this.f33007b;
            String str2 = com.anythink.basead.exoplayer.k.o.J;
            String str3 = true != z6 ? "audio/amr" : com.anythink.basead.exoplayer.k.o.J;
            if (true != z6) {
                str2 = com.anythink.basead.exoplayer.k.o.f8428I;
            }
            int i = true != z6 ? 8000 : 16000;
            int i6 = z6 ? iArr2[8] : iArr[7];
            InterfaceC3543m1 interfaceC3543m1 = this.f33013h;
            C3299hP c3299hP = new C3299hP();
            c3299hP.d(str3);
            c3299hP.e(str2);
            c3299hP.f30793o = i6;
            c3299hP.f30772G = 1;
            c3299hP.f30774I = i;
            interfaceC3543m1.e(new DP(c3299hP));
        }
        int i9 = this.f33010e;
        if (i9 == 0) {
            try {
                ((K0) r02).f25821y = 0;
                byte[] bArr = this.f33006a;
                ((K0) r02).A(bArr, 0, 1, false);
                byte b9 = bArr[0];
                if ((b9 & 131) > 0) {
                    StringBuilder sb = new StringBuilder(String.valueOf((int) b9).length() + 38);
                    sb.append("Invalid padding bits for frame header ");
                    sb.append((int) b9);
                    throw U4.a(null, sb.toString());
                }
                boolean z9 = this.f33007b;
                int i10 = (b9 >> 3) & 15;
                if (z9) {
                    if (i10 >= 10) {
                        if (i10 > 13) {
                        }
                    }
                    i9 = !z9 ? iArr2[i10] : iArr[i10];
                    this.f33009d = i9;
                    this.f33010e = i9;
                    if (this.f33011f == -1) {
                        this.f33011f = i9;
                    }
                }
                if (!z9) {
                    if (i10 >= 12 && i10 <= 14) {
                    }
                    if (!z9) {
                    }
                    this.f33009d = i9;
                    this.f33010e = i9;
                    if (this.f33011f == -1) {
                    }
                }
                String str4 = true != z9 ? "NB" : "WB";
                StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 26);
                sb2.append("Illegal AMR ");
                sb2.append(str4);
                sb2.append(" frame type ");
                sb2.append(i10);
                throw U4.a(null, sb2.toString());
            } catch (EOFException unused) {
            }
        }
        int d2 = this.i.d(r02, i9, true);
        if (d2 != -1) {
            int i11 = this.f33010e - d2;
            this.f33010e = i11;
            if (i11 <= 0) {
                this.i.c(this.f33008c, 1, this.f33009d, 0, null);
                this.f33008c += 20000;
            }
            c9 = 0;
            if (this.f33014j == null) {
                V0 v02 = new V0(com.anythink.basead.exoplayer.b.f6382b, 0L);
                this.f33014j = v02;
                this.f33012g.D(v02);
            }
            return c9 != 65535 ? -1 : 0;
        }
        c9 = 65535;
        if (this.f33014j == null) {
        }
        if (c9 != 65535) {
        }
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void b(S0 s02) {
        CQ cq = (CQ) s02;
        this.f33012g = cq;
        InterfaceC3543m1 C8 = cq.C(0, 1);
        this.f33013h = C8;
        this.i = C8;
        cq.B();
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void c(long j6, long j9) {
        this.f33008c = 0L;
        this.f33009d = 0;
        this.f33010e = 0;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final boolean d(R0 r02) {
        return g((K0) r02);
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void e() {
    }

    public final boolean g(K0 k02) {
        k02.f25821y = 0;
        byte[] bArr = f33004n;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        k02.A(bArr2, 0, length, false);
        if (Arrays.equals(bArr2, bArr)) {
            this.f33007b = false;
            k02.a(bArr.length, false);
            return true;
        }
        k02.f25821y = 0;
        byte[] bArr3 = f33005o;
        int length2 = bArr3.length;
        byte[] bArr4 = new byte[length2];
        k02.A(bArr4, 0, length2, false);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f33007b = true;
        k02.a(bArr3.length, false);
        return true;
    }
}
