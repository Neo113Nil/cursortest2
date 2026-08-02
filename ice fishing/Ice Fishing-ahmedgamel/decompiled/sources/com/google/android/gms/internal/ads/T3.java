package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.zip.Inflater;

/* loaded from: classes2.dex */
public final class T3 implements InterfaceC3891s3 {

    /* renamed from: x, reason: collision with root package name */
    public static final C3676o3 f28467x;

    /* renamed from: n, reason: collision with root package name */
    public final Cr f28468n = new Cr();

    /* renamed from: u, reason: collision with root package name */
    public final Cr f28469u = new Cr();

    /* renamed from: v, reason: collision with root package name */
    public final S3 f28470v;

    /* renamed from: w, reason: collision with root package name */
    public Inflater f28471w;

    static {
        PB pb = RB.f27933u;
        f28467x = new C3676o3(C3523lC.f32525x, com.anythink.basead.exoplayer.b.f7168b, com.anythink.basead.exoplayer.b.f7168b);
    }

    public T3(List list) {
        int i;
        S3 s32 = new S3();
        this.f28470v = s32;
        String trim = new String((byte[]) list.get(0), StandardCharsets.UTF_8).trim();
        String str = AbstractC3182eu.f30782a;
        for (String str2 : trim.split("\\r?\\n", -1)) {
            if (str2.startsWith("palette: ")) {
                String[] split = str2.substring(9).split(",", -1);
                s32.f28122f = new int[split.length];
                for (int i4 = 0; i4 < split.length; i4++) {
                    int[] iArr = s32.f28122f;
                    try {
                        i = Integer.parseInt(split[i4].trim(), 16);
                    } catch (RuntimeException e9) {
                        AbstractC2991bG.C("VobsubParser", "Parsing color failed", e9);
                        i = 0;
                    }
                    iArr[i4] = i;
                }
            } else if (str2.startsWith("size: ")) {
                String[] split2 = str2.substring(6).trim().split("x", -1);
                if (split2.length != 2) {
                    StringBuilder sb = new StringBuilder(str2.length() + 36);
                    sb.append("Ignoring malformed IDX size line: '");
                    sb.append(str2);
                    sb.append("'");
                    AbstractC2991bG.y("VobsubParser", sb.toString());
                } else {
                    try {
                        s32.f28123g = Integer.parseInt(split2[0]);
                        s32.f28124h = Integer.parseInt(split2[1]);
                        s32.f28120d = true;
                    } catch (RuntimeException e10) {
                        AbstractC2991bG.C("VobsubParser", "Parsing IDX failed", e10);
                    }
                }
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:77:0x00bd. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02af  */
    @Override // com.google.android.gms.internal.ads.InterfaceC3891s3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x(byte[] bArr, int i, int i4, Z1.b bVar) {
        C3676o3 c3676o3;
        int i6;
        long j6;
        int i9;
        int i10;
        int i11;
        int i12;
        long j9;
        C4302zj c4302zj;
        long j10;
        long j11;
        Rect rect;
        Cr cr = this.f28468n;
        cr.z(i + i4, bArr);
        cr.E(i);
        if (this.f28471w == null) {
            this.f28471w = new Inflater();
        }
        Inflater inflater = this.f28471w;
        Cr cr2 = this.f28469u;
        if (AbstractC3182eu.i(cr, cr2, inflater)) {
            cr.z(cr2.f24999c, cr2.f24997a);
        }
        S3 s32 = this.f28470v;
        long j12 = com.anythink.basead.exoplayer.b.f7168b;
        s32.f28118b = com.anythink.basead.exoplayer.b.f7168b;
        s32.f28119c = com.anythink.basead.exoplayer.b.f7168b;
        int i13 = 0;
        s32.f28121e = false;
        s32.i = null;
        s32.f28125j = -1;
        s32.f28126k = -1;
        int B3 = cr.B();
        if (B3 < 2 || cr.L() != B3) {
            c3676o3 = f28467x;
        } else {
            int i14 = 1;
            if (s32.f28122f == null) {
                AbstractC2991bG.y("VobsubParser", "Skipping SPU (no palette)");
            } else if (s32.f28120d) {
                int i15 = cr.f24998b - 2;
                cr.E(cr.L() + i15);
                while (true) {
                    int i16 = 4;
                    if (cr.B() < 4) {
                        i6 = i13;
                        i10 = i6;
                        j6 = j12;
                    } else {
                        int i17 = cr.f24998b;
                        int L2 = cr.L() * 10000;
                        int L6 = cr.L() + i15;
                        i6 = (L6 == i17 || L6 >= cr.f24999c) ? i13 : i14;
                        if (i6 != 0) {
                            j6 = j12;
                            i9 = L6;
                        } else {
                            j6 = j12;
                            i9 = cr.f24999c;
                        }
                        int i18 = i14;
                        while (cr.f24998b < i9 && i18 != 0) {
                            long j13 = L2;
                            int i19 = i13;
                            int K7 = cr.K();
                            if (K7 != 255) {
                                int[] iArr = s32.f28117a;
                                switch (K7) {
                                    case 0:
                                        i13 = i19;
                                        i18 = 1;
                                        i14 = 1;
                                        break;
                                    case 1:
                                        s32.f28118b = j13;
                                        i13 = i19;
                                        i18 = 1;
                                        i14 = 1;
                                        i16 = 4;
                                        break;
                                    case 2:
                                        s32.f28119c = j13;
                                        i13 = i19;
                                        i18 = 1;
                                        i14 = 1;
                                        i16 = 4;
                                        break;
                                    case 3:
                                        boolean z6 = i14;
                                        if (cr.B() < 2) {
                                            AbstractC2991bG.y("VobsubParser", "Incomplete color command");
                                            i12 = z6;
                                            i13 = i19;
                                            i18 = i13;
                                            i14 = i12;
                                            i16 = 4;
                                            break;
                                        } else {
                                            int K8 = cr.K();
                                            int K9 = cr.K();
                                            int[] iArr2 = s32.f28122f;
                                            int i20 = K8 >> 4;
                                            if (i20 >= iArr2.length) {
                                                i20 = i19;
                                            }
                                            iArr[3] = iArr2[i20];
                                            int i21 = K8 & 15;
                                            if (i21 >= iArr2.length) {
                                                i21 = i19;
                                            }
                                            iArr[2] = iArr2[i21];
                                            int i22 = K9 >> 4;
                                            if (i22 >= iArr2.length) {
                                                i22 = i19;
                                            }
                                            iArr[z6 ? 1 : 0] = iArr2[i22];
                                            int i23 = K9 & 15;
                                            if (i23 >= iArr2.length) {
                                                i23 = i19;
                                            }
                                            iArr[i19] = iArr2[i23];
                                            s32.f28121e = z6;
                                            i13 = i19;
                                            i18 = 1;
                                            i14 = 1;
                                            i16 = 4;
                                        }
                                    case 4:
                                        int i24 = i14;
                                        if (cr.B() >= 2) {
                                            if (s32.f28121e) {
                                                int K10 = cr.K();
                                                int K11 = cr.K();
                                                iArr[3] = S3.a(iArr[3], K10 >> 4);
                                                iArr[2] = S3.a(iArr[2], K10 & 15);
                                                iArr[i24 == true ? 1 : 0] = S3.a(iArr[i24 == true ? 1 : 0], K11 >> 4);
                                                iArr[i19] = S3.a(iArr[i19], K11 & 15);
                                                i11 = i24;
                                                i13 = i19;
                                                i18 = i11;
                                                i14 = i18;
                                                i16 = 4;
                                                break;
                                            } else {
                                                AbstractC2991bG.y("VobsubParser", "Ignoring alpha command before color command");
                                                i12 = i24;
                                            }
                                        } else {
                                            AbstractC2991bG.y("VobsubParser", "Incomplete alpha command");
                                            i12 = i24;
                                        }
                                        i13 = i19;
                                        i18 = i13;
                                        i14 = i12;
                                        i16 = 4;
                                    case 5:
                                        if (cr.B() >= 6) {
                                            int K12 = cr.K();
                                            int K13 = cr.K();
                                            int i25 = K13 >> 4;
                                            int K14 = ((K13 & 15) << 8) | cr.K();
                                            int K15 = cr.K();
                                            int K16 = cr.K();
                                            i11 = i14;
                                            s32.i = new Rect((K12 << i16) | i25, (K15 << i16) | (K16 >> 4), K14 + i14, (((K16 & 15) << 8) | cr.K()) + 1);
                                            i13 = i19;
                                            i18 = i11;
                                            i14 = i18;
                                            i16 = 4;
                                            break;
                                        } else {
                                            AbstractC2991bG.y("VobsubParser", "Incomplete area command");
                                            break;
                                        }
                                    case 6:
                                        if (cr.B() >= i16) {
                                            s32.f28125j = cr.L();
                                            s32.f28126k = cr.L();
                                            i18 = i14;
                                            i13 = i19;
                                            break;
                                        } else {
                                            AbstractC2991bG.y("VobsubParser", "Incomplete offsets command");
                                            break;
                                        }
                                    default:
                                        com.IceFishing.LiveIceFishing.k.t(K7, "Unrecognized command: ", "VobsubParser", new StringBuilder(String.valueOf(K7).length() + 22));
                                        break;
                                }
                            }
                            i13 = i19;
                            i18 = i13;
                        }
                        i10 = i13;
                        if (i6 != 0) {
                            cr.E(L6);
                        }
                    }
                    if (i6 == 0) {
                        j9 = s32.f28119c;
                        if (s32.f28122f != null || !s32.f28120d || !s32.f28121e || (rect = s32.i) == null || s32.f28125j == -1 || s32.f28126k == -1 || rect.width() < 2 || s32.i.height() < 2) {
                            c4302zj = null;
                        } else {
                            Rect rect2 = s32.i;
                            int[] iArr3 = new int[rect2.height() * rect2.width()];
                            C4256yr c4256yr = new C4256yr();
                            cr.E(s32.f28125j);
                            c4256yr.a(cr);
                            s32.b(c4256yr, true, rect2, iArr3);
                            cr.E(s32.f28126k);
                            c4256yr.a(cr);
                            s32.b(c4256yr, i10, rect2, iArr3);
                            c4302zj = new C4302zj(null, null, null, Bitmap.createBitmap(iArr3, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888), rect2.top / s32.f28124h, 0, 0, rect2.left / s32.f28123g, 0, Integer.MIN_VALUE, -3.4028235E38f, rect2.width() / s32.f28123g, rect2.height() / s32.f28124h, Integer.MIN_VALUE, 0.0f, 0);
                        }
                        if (j9 == j6) {
                            long j14 = s32.f28118b;
                            if (j14 != j6) {
                                long j15 = s32.f28119c;
                                if (j15 > j14) {
                                    j11 = j15 - j14;
                                    j10 = j11;
                                }
                            }
                            j11 = s32.f28119c;
                            j10 = j11;
                        } else {
                            j10 = j6;
                        }
                        c3676o3 = new C3676o3(c4302zj == null ? RB.j(c4302zj) : C3523lC.f32525x, s32.f28118b, j10);
                    } else {
                        j12 = j6;
                        i13 = i10;
                        i14 = 1;
                    }
                }
            } else {
                AbstractC2991bG.y("VobsubParser", "Skipping SPU (no plane)");
            }
            i10 = 0;
            j6 = -9223372036854775807L;
            j9 = s32.f28119c;
            if (s32.f28122f != null) {
            }
            c4302zj = null;
            if (j9 == j6) {
            }
            c3676o3 = new C3676o3(c4302zj == null ? RB.j(c4302zj) : C3523lC.f32525x, s32.f28118b, j10);
        }
        bVar.mo9a(c3676o3);
    }
}
