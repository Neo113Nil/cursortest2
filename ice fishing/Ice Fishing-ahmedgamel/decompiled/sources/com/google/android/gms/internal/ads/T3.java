package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.zip.Inflater;

/* loaded from: classes2.dex */
public final class T3 implements InterfaceC3868s3 {

    /* renamed from: x, reason: collision with root package name */
    public static final C3653o3 f27684x;

    /* renamed from: n, reason: collision with root package name */
    public final Cr f27685n = new Cr();

    /* renamed from: u, reason: collision with root package name */
    public final Cr f27686u = new Cr();

    /* renamed from: v, reason: collision with root package name */
    public final S3 f27687v;

    /* renamed from: w, reason: collision with root package name */
    public Inflater f27688w;

    static {
        PB pb = RB.f27177u;
        f27684x = new C3653o3(C3500lC.f31745x, com.anythink.basead.exoplayer.b.f6382b, com.anythink.basead.exoplayer.b.f6382b);
    }

    public T3(List list) {
        int i;
        S3 s32 = new S3();
        this.f27687v = s32;
        String trim = new String((byte[]) list.get(0), StandardCharsets.UTF_8).trim();
        String str = AbstractC3159eu.f29993a;
        for (String str2 : trim.split("\\r?\\n", -1)) {
            if (str2.startsWith("palette: ")) {
                String[] split = str2.substring(9).split(",", -1);
                s32.f27408f = new int[split.length];
                for (int i6 = 0; i6 < split.length; i6++) {
                    int[] iArr = s32.f27408f;
                    try {
                        i = Integer.parseInt(split[i6].trim(), 16);
                    } catch (RuntimeException e9) {
                        AbstractC2968bG.C("VobsubParser", "Parsing color failed", e9);
                        i = 0;
                    }
                    iArr[i6] = i;
                }
            } else if (str2.startsWith("size: ")) {
                String[] split2 = str2.substring(6).trim().split("x", -1);
                if (split2.length != 2) {
                    StringBuilder sb = new StringBuilder(str2.length() + 36);
                    sb.append("Ignoring malformed IDX size line: '");
                    sb.append(str2);
                    sb.append("'");
                    AbstractC2968bG.y("VobsubParser", sb.toString());
                } else {
                    try {
                        s32.f27409g = Integer.parseInt(split2[0]);
                        s32.f27410h = Integer.parseInt(split2[1]);
                        s32.f27406d = true;
                    } catch (RuntimeException e10) {
                        AbstractC2968bG.C("VobsubParser", "Parsing IDX failed", e10);
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
    @Override // com.google.android.gms.internal.ads.InterfaceC3868s3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(byte[] bArr, int i, int i6, X1.b bVar) {
        C3653o3 c3653o3;
        int i9;
        long j6;
        int i10;
        int i11;
        int i12;
        int i13;
        long j9;
        C4279zj c4279zj;
        long j10;
        long j11;
        Rect rect;
        Cr cr = this.f27685n;
        cr.z(i + i6, bArr);
        cr.E(i);
        if (this.f27688w == null) {
            this.f27688w = new Inflater();
        }
        Inflater inflater = this.f27688w;
        Cr cr2 = this.f27686u;
        if (AbstractC3159eu.i(cr, cr2, inflater)) {
            cr.z(cr2.f24254c, cr2.f24252a);
        }
        S3 s32 = this.f27687v;
        long j12 = com.anythink.basead.exoplayer.b.f6382b;
        s32.f27404b = com.anythink.basead.exoplayer.b.f6382b;
        s32.f27405c = com.anythink.basead.exoplayer.b.f6382b;
        int i14 = 0;
        s32.f27407e = false;
        s32.i = null;
        s32.f27411j = -1;
        s32.f27412k = -1;
        int B9 = cr.B();
        if (B9 < 2 || cr.L() != B9) {
            c3653o3 = f27684x;
        } else {
            int i15 = 1;
            if (s32.f27408f == null) {
                AbstractC2968bG.y("VobsubParser", "Skipping SPU (no palette)");
            } else if (s32.f27406d) {
                int i16 = cr.f24253b - 2;
                cr.E(cr.L() + i16);
                while (true) {
                    int i17 = 4;
                    if (cr.B() < 4) {
                        i9 = i14;
                        i11 = i9;
                        j6 = j12;
                    } else {
                        int i18 = cr.f24253b;
                        int L6 = cr.L() * 10000;
                        int L8 = cr.L() + i16;
                        i9 = (L8 == i18 || L8 >= cr.f24254c) ? i14 : i15;
                        if (i9 != 0) {
                            j6 = j12;
                            i10 = L8;
                        } else {
                            j6 = j12;
                            i10 = cr.f24254c;
                        }
                        int i19 = i15;
                        while (cr.f24253b < i10 && i19 != 0) {
                            long j13 = L6;
                            int i20 = i14;
                            int K7 = cr.K();
                            if (K7 != 255) {
                                int[] iArr = s32.f27403a;
                                switch (K7) {
                                    case 0:
                                        i14 = i20;
                                        i19 = 1;
                                        i15 = 1;
                                        break;
                                    case 1:
                                        s32.f27404b = j13;
                                        i14 = i20;
                                        i19 = 1;
                                        i15 = 1;
                                        i17 = 4;
                                        break;
                                    case 2:
                                        s32.f27405c = j13;
                                        i14 = i20;
                                        i19 = 1;
                                        i15 = 1;
                                        i17 = 4;
                                        break;
                                    case 3:
                                        boolean z3 = i15;
                                        if (cr.B() < 2) {
                                            AbstractC2968bG.y("VobsubParser", "Incomplete color command");
                                            i13 = z3;
                                            i14 = i20;
                                            i19 = i14;
                                            i15 = i13;
                                            i17 = 4;
                                            break;
                                        } else {
                                            int K8 = cr.K();
                                            int K9 = cr.K();
                                            int[] iArr2 = s32.f27408f;
                                            int i21 = K8 >> 4;
                                            if (i21 >= iArr2.length) {
                                                i21 = i20;
                                            }
                                            iArr[3] = iArr2[i21];
                                            int i22 = K8 & 15;
                                            if (i22 >= iArr2.length) {
                                                i22 = i20;
                                            }
                                            iArr[2] = iArr2[i22];
                                            int i23 = K9 >> 4;
                                            if (i23 >= iArr2.length) {
                                                i23 = i20;
                                            }
                                            iArr[z3 ? 1 : 0] = iArr2[i23];
                                            int i24 = K9 & 15;
                                            if (i24 >= iArr2.length) {
                                                i24 = i20;
                                            }
                                            iArr[i20] = iArr2[i24];
                                            s32.f27407e = z3;
                                            i14 = i20;
                                            i19 = 1;
                                            i15 = 1;
                                            i17 = 4;
                                        }
                                    case 4:
                                        int i25 = i15;
                                        if (cr.B() >= 2) {
                                            if (s32.f27407e) {
                                                int K10 = cr.K();
                                                int K11 = cr.K();
                                                iArr[3] = S3.a(iArr[3], K10 >> 4);
                                                iArr[2] = S3.a(iArr[2], K10 & 15);
                                                iArr[i25 == true ? 1 : 0] = S3.a(iArr[i25 == true ? 1 : 0], K11 >> 4);
                                                iArr[i20] = S3.a(iArr[i20], K11 & 15);
                                                i12 = i25;
                                                i14 = i20;
                                                i19 = i12;
                                                i15 = i19;
                                                i17 = 4;
                                                break;
                                            } else {
                                                AbstractC2968bG.y("VobsubParser", "Ignoring alpha command before color command");
                                                i13 = i25;
                                            }
                                        } else {
                                            AbstractC2968bG.y("VobsubParser", "Incomplete alpha command");
                                            i13 = i25;
                                        }
                                        i14 = i20;
                                        i19 = i14;
                                        i15 = i13;
                                        i17 = 4;
                                    case 5:
                                        if (cr.B() >= 6) {
                                            int K12 = cr.K();
                                            int K13 = cr.K();
                                            int i26 = K13 >> 4;
                                            int K14 = ((K13 & 15) << 8) | cr.K();
                                            int K15 = cr.K();
                                            int K16 = cr.K();
                                            i12 = i15;
                                            s32.i = new Rect((K12 << i17) | i26, (K15 << i17) | (K16 >> 4), K14 + i15, (((K16 & 15) << 8) | cr.K()) + 1);
                                            i14 = i20;
                                            i19 = i12;
                                            i15 = i19;
                                            i17 = 4;
                                            break;
                                        } else {
                                            AbstractC2968bG.y("VobsubParser", "Incomplete area command");
                                            break;
                                        }
                                    case 6:
                                        if (cr.B() >= i17) {
                                            s32.f27411j = cr.L();
                                            s32.f27412k = cr.L();
                                            i19 = i15;
                                            i14 = i20;
                                            break;
                                        } else {
                                            AbstractC2968bG.y("VobsubParser", "Incomplete offsets command");
                                            break;
                                        }
                                    default:
                                        com.anythink.basead.exoplayer.f.f.q(K7, "Unrecognized command: ", "VobsubParser", new StringBuilder(String.valueOf(K7).length() + 22));
                                        break;
                                }
                            }
                            i14 = i20;
                            i19 = i14;
                        }
                        i11 = i14;
                        if (i9 != 0) {
                            cr.E(L8);
                        }
                    }
                    if (i9 == 0) {
                        j9 = s32.f27405c;
                        if (s32.f27408f != null || !s32.f27406d || !s32.f27407e || (rect = s32.i) == null || s32.f27411j == -1 || s32.f27412k == -1 || rect.width() < 2 || s32.i.height() < 2) {
                            c4279zj = null;
                        } else {
                            Rect rect2 = s32.i;
                            int[] iArr3 = new int[rect2.height() * rect2.width()];
                            C4233yr c4233yr = new C4233yr();
                            cr.E(s32.f27411j);
                            c4233yr.a(cr);
                            s32.b(c4233yr, true, rect2, iArr3);
                            cr.E(s32.f27412k);
                            c4233yr.a(cr);
                            s32.b(c4233yr, i11, rect2, iArr3);
                            c4279zj = new C4279zj(null, null, null, Bitmap.createBitmap(iArr3, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888), rect2.top / s32.f27410h, 0, 0, rect2.left / s32.f27409g, 0, Integer.MIN_VALUE, -3.4028235E38f, rect2.width() / s32.f27409g, rect2.height() / s32.f27410h, Integer.MIN_VALUE, 0.0f, 0);
                        }
                        if (j9 == j6) {
                            long j14 = s32.f27404b;
                            if (j14 != j6) {
                                long j15 = s32.f27405c;
                                if (j15 > j14) {
                                    j11 = j15 - j14;
                                    j10 = j11;
                                }
                            }
                            j11 = s32.f27405c;
                            j10 = j11;
                        } else {
                            j10 = j6;
                        }
                        c3653o3 = new C3653o3(c4279zj == null ? RB.j(c4279zj) : C3500lC.f31745x, s32.f27404b, j10);
                    } else {
                        j12 = j6;
                        i14 = i11;
                        i15 = 1;
                    }
                }
            } else {
                AbstractC2968bG.y("VobsubParser", "Skipping SPU (no plane)");
            }
            i11 = 0;
            j6 = -9223372036854775807L;
            j9 = s32.f27405c;
            if (s32.f27408f != null) {
            }
            c4279zj = null;
            if (j9 == j6) {
            }
            c3653o3 = new C3653o3(c4279zj == null ? RB.j(c4279zj) : C3500lC.f31745x, s32.f27404b, j10);
        }
        bVar.mo10a(c3653o3);
    }
}
