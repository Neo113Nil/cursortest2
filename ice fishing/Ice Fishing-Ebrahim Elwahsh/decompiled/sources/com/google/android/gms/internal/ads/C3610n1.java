package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.n1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3610n1 implements O0 {

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f32803l = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f32804m = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* renamed from: n, reason: collision with root package name */
    public static final byte[] f32805n;

    /* renamed from: o, reason: collision with root package name */
    public static final byte[] f32806o;

    /* renamed from: b, reason: collision with root package name */
    public boolean f32808b;

    /* renamed from: c, reason: collision with root package name */
    public long f32809c;

    /* renamed from: d, reason: collision with root package name */
    public int f32810d;

    /* renamed from: e, reason: collision with root package name */
    public int f32811e;

    /* renamed from: g, reason: collision with root package name */
    public PQ f32813g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC3448k1 f32814h;

    /* renamed from: j, reason: collision with root package name */
    public T0 f32815j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f32816k;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f32807a = new byte[1];

    /* renamed from: f, reason: collision with root package name */
    public int f32812f = -1;
    public InterfaceC3448k1 i = new M0();

    static {
        String str = AbstractC3548lu.f32613a;
        Charset charset = StandardCharsets.UTF_8;
        f32805n = "#!AMR\n".getBytes(charset);
        f32806o = "#!AMR-WB\n".getBytes(charset);
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final void a(Q0 q02) {
        PQ pq = (PQ) q02;
        this.f32813g = pq;
        InterfaceC3448k1 x3 = pq.x(0, 1);
        this.f32814h = x3;
        this.i = x3;
        pq.v();
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final boolean b(P0 p02) {
        return g((J0) p02);
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final void c(long j9, long j10) {
        this.f32809c = 0L;
        this.f32810d = 0;
        this.f32811e = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0145 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0146 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00aa A[Catch: EOFException -> 0x0103, TryCatch #0 {EOFException -> 0x0103, blocks: (B:39:0x0073, B:41:0x0088, B:49:0x00aa, B:50:0x00af, B:54:0x00ad, B:64:0x00c1, B:65:0x00e4, B:66:0x00e5, B:67:0x0102), top: B:38:0x0073 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ad A[Catch: EOFException -> 0x0103, TryCatch #0 {EOFException -> 0x0103, blocks: (B:39:0x0073, B:41:0x0088, B:49:0x00aa, B:50:0x00af, B:54:0x00ad, B:64:0x00c1, B:65:0x00e4, B:66:0x00e5, B:67:0x0102), top: B:38:0x0073 }] */
    @Override // com.google.android.gms.internal.ads.O0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(P0 p02, S0 s02) {
        char c4;
        this.f32814h.getClass();
        String str = AbstractC3548lu.f32613a;
        if (((J0) p02).f25675w == 0 && !g((J0) p02)) {
            throw W4.a(null, "Could not find AMR header.");
        }
        boolean z8 = this.f32816k;
        int[] iArr = f32803l;
        int[] iArr2 = f32804m;
        if (!z8) {
            this.f32816k = true;
            boolean z9 = this.f32808b;
            String str2 = com.anythink.basead.exoplayer.k.o.J;
            String str3 = true != z9 ? "audio/amr" : com.anythink.basead.exoplayer.k.o.J;
            if (true != z9) {
                str2 = com.anythink.basead.exoplayer.k.o.f8585I;
            }
            int i = true != z9 ? 8000 : 16000;
            int i4 = z9 ? iArr2[8] : iArr[7];
            InterfaceC3448k1 interfaceC3448k1 = this.f32814h;
            C4065vP c4065vP = new C4065vP();
            c4065vP.d(str3);
            c4065vP.e(str2);
            c4065vP.f34786o = i4;
            c4065vP.f34765F = 1;
            c4065vP.f34767H = i;
            interfaceC3448k1.e(new TP(c4065vP));
        }
        int i9 = this.f32811e;
        if (i9 == 0) {
            try {
                ((J0) p02).f25677y = 0;
                byte[] bArr = this.f32807a;
                ((J0) p02).I(bArr, 0, 1, false);
                byte b9 = bArr[0];
                if ((b9 & 131) > 0) {
                    StringBuilder sb = new StringBuilder(String.valueOf((int) b9).length() + 38);
                    sb.append("Invalid padding bits for frame header ");
                    sb.append((int) b9);
                    throw W4.a(null, sb.toString());
                }
                boolean z10 = this.f32808b;
                int i10 = (b9 >> 3) & 15;
                if (z10) {
                    if (i10 >= 10) {
                        if (i10 > 13) {
                        }
                    }
                    i9 = !z10 ? iArr2[i10] : iArr[i10];
                    this.f32810d = i9;
                    this.f32811e = i9;
                    if (this.f32812f == -1) {
                        this.f32812f = i9;
                    }
                }
                if (!z10) {
                    if (i10 >= 12 && i10 <= 14) {
                    }
                    if (!z10) {
                    }
                    this.f32810d = i9;
                    this.f32811e = i9;
                    if (this.f32812f == -1) {
                    }
                }
                String str4 = true != z10 ? "NB" : "WB";
                StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 26);
                sb2.append("Illegal AMR ");
                sb2.append(str4);
                sb2.append(" frame type ");
                sb2.append(i10);
                throw W4.a(null, sb2.toString());
            } catch (EOFException unused) {
            }
        }
        int d2 = this.i.d(p02, i9, true);
        if (d2 != -1) {
            int i11 = this.f32811e - d2;
            this.f32811e = i11;
            if (i11 <= 0) {
                this.i.b(this.f32809c, 1, this.f32810d, 0, null);
                this.f32809c += 20000;
            }
            c4 = 0;
            if (this.f32815j == null) {
                T0 t02 = new T0(com.anythink.basead.exoplayer.b.f6539b, 0L);
                this.f32815j = t02;
                this.f32813g.w(t02);
            }
            return c4 != 65535 ? -1 : 0;
        }
        c4 = 65535;
        if (this.f32815j == null) {
        }
        if (c4 != 65535) {
        }
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final void f() {
    }

    public final boolean g(J0 j02) {
        j02.f25677y = 0;
        byte[] bArr = f32805n;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        j02.I(bArr2, 0, length, false);
        if (Arrays.equals(bArr2, bArr)) {
            this.f32808b = false;
            j02.b(bArr.length, false);
            return true;
        }
        j02.f25677y = 0;
        byte[] bArr3 = f32806o;
        int length2 = bArr3.length;
        byte[] bArr4 = new byte[length2];
        j02.I(bArr4, 0, length2, false);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f32808b = true;
        j02.b(bArr3.length, false);
        return true;
    }
}
