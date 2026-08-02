package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import com.yandex.pulse.metrics.o;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class reh implements r2c {
    public static final byte[] f0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] g0;
    public static final byte[] h0;
    public static final byte[] i0;
    public static final UUID j0;
    public static final Map k0;
    public long A;
    public boolean B;
    public long C;
    public long D;
    public long E;
    public nug F;
    public nug G;
    public boolean H;
    public boolean I;
    public int J;
    public long K;
    public long L;
    public int M;
    public int N;
    public int[] O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public boolean T;
    public long U;
    public int V;
    public int W;
    public int X;
    public boolean Y;
    public boolean Z;
    public final vl7 a;
    public boolean a0;
    public final byt b;
    public int b0;
    public final SparseArray c;
    public byte c0;
    public final boolean d;
    public boolean d0;
    public final boolean e;
    public t2c e0;
    public final spr f;
    public final d7k g;
    public final d7k h;
    public final d7k i;
    public final d7k j;
    public final d7k k;
    public final d7k l;
    public final d7k m;
    public final d7k n;
    public final d7k o;
    public final d7k p;
    public ByteBuffer q;
    public long r;
    public long s;
    public long t;
    public long u;
    public long v;
    public boolean w;
    public qeh x;
    public boolean y;
    public int z;

    static {
        int i = dvt.a;
        g0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        h0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        i0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        j0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        su4.u(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        su4.u(180, hashMap, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        k0 = Collections.unmodifiableMap(hashMap);
    }

    public reh(spr sprVar, int i) {
        vl7 vl7Var = new vl7();
        this.s = -1L;
        this.t = -9223372036854775807L;
        this.u = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.C = -1L;
        this.D = -1L;
        this.E = -9223372036854775807L;
        this.a = vl7Var;
        vl7Var.d = new cib(14, this);
        this.f = sprVar;
        this.d = (i & 1) == 0;
        this.e = (i & 2) == 0;
        this.b = new byt();
        this.c = new SparseArray();
        this.i = new d7k(4);
        this.j = new d7k(ByteBuffer.allocate(4).putInt(-1).array());
        this.k = new d7k(4);
        this.g = new d7k(zc4.h);
        this.h = new d7k(4);
        this.l = new d7k();
        this.m = new d7k();
        this.n = new d7k(8);
        this.o = new d7k();
        this.p = new d7k();
        this.O = new int[1];
    }

    public static byte[] g(long j, long j2, String str) {
        vq1.v(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - (i * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (i2 * 60000000);
        int i3 = (int) (j4 / 1000000);
        String format = String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (i3 * 1000000)) / j2)));
        int i4 = dvt.a;
        return format.getBytes(StandardCharsets.UTF_8);
    }

    @Override // defpackage.r2c
    public final void b(long j, long j2) {
        this.E = -9223372036854775807L;
        this.J = 0;
        vl7 vl7Var = this.a;
        vl7Var.e = 0;
        vl7Var.b.clear();
        byt bytVar = vl7Var.c;
        bytVar.a = 0;
        bytVar.b = 0;
        byt bytVar2 = this.b;
        bytVar2.a = 0;
        bytVar2.b = 0;
        k();
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.c;
            if (i >= sparseArray.size()) {
                return;
            }
            wat watVar = ((qeh) sparseArray.valueAt(i)).V;
            if (watVar != null) {
                watVar.b = false;
                watVar.c = 0;
            }
            i++;
        }
    }

    public final void c(int i) {
        if (this.F == null || this.G == null) {
            throw r7k.a(null, "Element " + i + " must be in a Cues");
        }
    }

    @Override // defpackage.r2c
    public final boolean d(s2c s2cVar) {
        j4x j4xVar = new j4x(21);
        d7k d7kVar = (d7k) j4xVar.c;
        gm7 gm7Var = (gm7) s2cVar;
        long j = gm7Var.c;
        long j2 = 1024;
        if (j != -1 && j <= 1024) {
            j2 = j;
        }
        int i = (int) j2;
        gm7Var.l(d7kVar.a, 0, 4, false);
        long x = d7kVar.x();
        j4xVar.b = 4;
        while (true) {
            if (x != 440786851) {
                int i2 = j4xVar.b + 1;
                j4xVar.b = i2;
                if (i2 == i) {
                    break;
                }
                gm7Var.l(d7kVar.a, 0, 1, false);
                x = ((x << 8) & (-256)) | (d7kVar.a[0] & 255);
            } else {
                long m = j4xVar.m(gm7Var);
                long j3 = j4xVar.b;
                if (m != Long.MIN_VALUE && (j == -1 || j3 + m < j)) {
                    while (true) {
                        long j4 = j4xVar.b;
                        long j5 = j3 + m;
                        if (j4 < j5) {
                            if (j4xVar.m(gm7Var) != Long.MIN_VALUE) {
                                long m2 = j4xVar.m(gm7Var);
                                if (m2 < 0 || m2 > 2147483647L) {
                                    break;
                                }
                                if (m2 != 0) {
                                    int i3 = (int) m2;
                                    gm7Var.c(i3, false);
                                    j4xVar.b += i3;
                                }
                            } else {
                                break;
                            }
                        } else if (j4 == j5) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void e(int i) {
        if (this.x != null) {
            return;
        }
        throw r7k.a(null, "Element " + i + " must be in a TrackEntry");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(qeh qehVar, long j, int i, int i2, int i3) {
        byte[] g;
        int i4;
        int i5;
        wat watVar = qehVar.V;
        if (watVar != null) {
            watVar.b(qehVar.Z, j, i, i2, i3, qehVar.k);
        } else {
            if ("S_TEXT/UTF8".equals(qehVar.c) || "S_TEXT/ASS".equals(qehVar.c) || "S_TEXT/WEBVTT".equals(qehVar.c)) {
                if (this.N > 1) {
                    vq1.n0("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j2 = this.L;
                    if (j2 == -9223372036854775807L) {
                        vq1.n0("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        String str = qehVar.c;
                        d7k d7kVar = this.m;
                        byte[] bArr = d7kVar.a;
                        str.getClass();
                        switch (str) {
                            case "S_TEXT/ASS":
                                g = g(j2, 10000L, "%01d:%02d:%02d:%02d");
                                i4 = 21;
                                break;
                            case "S_TEXT/WEBVTT":
                                g = g(j2, 1000L, "%02d:%02d:%02d.%03d");
                                i4 = 25;
                                break;
                            case "S_TEXT/UTF8":
                                g = g(j2, 1000L, "%02d:%02d:%02d,%03d");
                                i4 = 19;
                                break;
                            default:
                                e7o.e();
                                return;
                        }
                        System.arraycopy(g, 0, bArr, i4, g.length);
                        int i6 = d7kVar.b;
                        while (true) {
                            if (i6 < d7kVar.c) {
                                if (d7kVar.a[i6] == 0) {
                                    d7kVar.G(i6);
                                } else {
                                    i6++;
                                }
                            }
                        }
                        qehVar.Z.b(d7kVar, d7kVar.c, 0);
                        i5 = i2 + d7kVar.c;
                        if ((i & 268435456) != 0) {
                            int i7 = this.N;
                            d7k d7kVar2 = this.p;
                            if (i7 > 1) {
                                d7kVar2.E(0);
                            } else {
                                int i8 = d7kVar2.c;
                                qehVar.Z.b(d7kVar2, i8, 2);
                                i5 += i8;
                            }
                        }
                        qehVar.Z.a(j, i, i5, i3, qehVar.k);
                    }
                }
            }
            i5 = i2;
            if ((i & 268435456) != 0) {
            }
            qehVar.Z.a(j, i, i5, i3, qehVar.k);
        }
        this.I = true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01aa, code lost:
    
        throw defpackage.r7k.a(null, "Mandatory element SeekID or SeekPosition not found");
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x0887, code lost:
    
        if (r1.p() == r2.getLeastSignificantBits()) goto L517;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0ba4, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0f30, code lost:
    
        if (r5 == false) goto L849;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0f32, code lost:
    
        r2 = r1.getPosition();
        r0 = r42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0f3a, code lost:
    
        if (r0.B == false) goto L843;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0f4f, code lost:
    
        if (r0.y == false) goto L900;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0f51, code lost:
    
        r6 = r0.D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0f57, code lost:
    
        if (r6 == (-1)) goto L901;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0f59, code lost:
    
        r44.a = r6;
        r0.D = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0f5d, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0f64, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0f3c, code lost:
    
        r0.D = r2;
        r44.a = r0.C;
        r0.B = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0f48, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0f5e, code lost:
    
        r0 = r42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:834:0x0f7a, code lost:
    
        if (r5 != false) goto L862;
     */
    /* JADX WARN: Code restructure failed: missing block: B:835:0x0f7c, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:836:0x0f7d, code lost:
    
        r1 = r0.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:837:0x0f83, code lost:
    
        if (r3 >= r1.size()) goto L927;
     */
    /* JADX WARN: Code restructure failed: missing block: B:838:0x0f85, code lost:
    
        r1 = (defpackage.qeh) r1.valueAt(r3);
        r1.Z.getClass();
        r2 = r1.V;
     */
    /* JADX WARN: Code restructure failed: missing block: B:839:0x0f92, code lost:
    
        if (r2 == null) goto L929;
     */
    /* JADX WARN: Code restructure failed: missing block: B:840:0x0f94, code lost:
    
        r2.a(r1.Z, r1.k);
     */
    /* JADX WARN: Code restructure failed: missing block: B:842:0x0f9b, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:845:0x0f9e, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:846:0x0fa1, code lost:
    
        return 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:136:0x08cd  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x08e4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x08f7  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0ac4  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0ad9  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0904  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x08e6  */
    /* JADX WARN: Type inference failed for: r1v56 */
    /* JADX WARN: Type inference failed for: r1v57, types: [java.lang.RuntimeException] */
    @Override // defpackage.r2c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int h(s2c s2cVar, ci0 ci0Var) {
        s2c s2cVar2;
        boolean z;
        int i;
        boolean z2;
        String str;
        long j;
        int i2;
        int a;
        boolean z3;
        char c;
        reh rehVar;
        List singletonList;
        int I;
        int i3;
        String str2;
        RuntimeException runtimeException;
        Pair pair;
        String str3;
        String str4;
        List y;
        bsc bscVar;
        boolean k;
        int i4;
        int i5;
        q85 q85Var;
        byte[] bArr;
        int i6;
        String str5;
        ipc a2;
        List list;
        fap zg2Var;
        int i7;
        reh rehVar2 = this;
        rehVar2.I = false;
        boolean z4 = true;
        while (true) {
            int i8 = -1;
            if (z4 && !rehVar2.I) {
                vl7 vl7Var = rehVar2.a;
                byt bytVar = vl7Var.c;
                ArrayDeque arrayDeque = vl7Var.b;
                vq1.B(vl7Var.d);
                while (true) {
                    ul7 ul7Var = (ul7) arrayDeque.peek();
                    if (ul7Var == null || s2cVar.getPosition() < ul7Var.b) {
                        int i9 = 0;
                        if (vl7Var.e == 0) {
                            s2cVar2 = s2cVar;
                            int i10 = 4;
                            long b = bytVar.b(s2cVar2, true, false, 4);
                            if (b == -2) {
                                byte[] bArr2 = vl7Var.a;
                                s2cVar2.n();
                                while (true) {
                                    s2cVar2.A(bArr2, i9, i10);
                                    byte b2 = bArr2[i9];
                                    int i11 = 0;
                                    while (true) {
                                        if (i11 >= 8) {
                                            i2 = -1;
                                        } else if ((byt.d[i11] & b2) != 0) {
                                            i2 = i11 + 1;
                                        } else {
                                            i11++;
                                        }
                                    }
                                    if (i2 != -1 && i2 <= 4) {
                                        a = (int) byt.a(i2, false, bArr2);
                                        Object obj = vl7Var.d.b;
                                        if (a == 357149030 || a == 524531317 || a == 475249515 || a == 374648427) {
                                        }
                                    }
                                    s2cVar2.y(1);
                                    i9 = 0;
                                    i10 = 4;
                                }
                                s2cVar2.y(i2);
                                j = a;
                            } else {
                                j = b;
                            }
                            z = true;
                            if (j == -1) {
                                z2 = false;
                                z4 = false;
                            } else {
                                vl7Var.f = (int) j;
                                vl7Var.e = 1;
                            }
                        } else {
                            s2cVar2 = s2cVar;
                            z = true;
                        }
                        if (vl7Var.e == z) {
                            vl7Var.g = bytVar.b(s2cVar2, false, z, 8);
                            vl7Var.e = 2;
                        }
                        cib cibVar = vl7Var.d;
                        int i12 = vl7Var.f;
                        Object obj2 = cibVar.b;
                        switch (i12) {
                            case 131:
                            case 136:
                            case 155:
                            case 159:
                            case 176:
                            case 179:
                            case 186:
                            case 215:
                            case 231:
                            case 238:
                            case 241:
                            case 251:
                            case 16871:
                            case 16980:
                            case 17029:
                            case 17143:
                            case 18401:
                            case 18408:
                            case 20529:
                            case 20530:
                            case 21420:
                            case 21432:
                            case 21680:
                            case 21682:
                            case 21690:
                            case 21930:
                            case 21938:
                            case 21945:
                            case 21946:
                            case 21947:
                            case 21948:
                            case 21949:
                            case 21998:
                            case 22186:
                            case 22203:
                            case 25188:
                            case 30114:
                            case 30321:
                            case 2352003:
                            case 2807729:
                                i = 2;
                                break;
                            case 134:
                            case 17026:
                            case 21358:
                            case 2274716:
                                i = 3;
                                break;
                            case 160:
                            case 166:
                            case 174:
                            case 183:
                            case 187:
                            case 224:
                            case 225:
                            case 16868:
                            case 18407:
                            case 19899:
                            case 20532:
                            case 20533:
                            case 21936:
                            case 21968:
                            case 25152:
                            case 28032:
                            case 30113:
                            case 30320:
                            case 290298740:
                            case 357149030:
                            case 374648427:
                            case 408125543:
                            case 440786851:
                            case 475249515:
                            case 524531317:
                                i = 1;
                                break;
                            case 161:
                            case 163:
                            case 165:
                            case 16877:
                            case 16981:
                            case 18402:
                            case 21419:
                            case 25506:
                            case 30322:
                                i = 4;
                                break;
                            case 181:
                            case 17545:
                            case 21969:
                            case 21970:
                            case 21971:
                            case 21972:
                            case 21973:
                            case 21974:
                            case 21975:
                            case 21976:
                            case 21977:
                            case 21978:
                            case 30323:
                            case 30324:
                            case 30325:
                                i = 5;
                                break;
                            default:
                                i = 0;
                                break;
                        }
                        if (i == 0) {
                            s2cVar2.y((int) vl7Var.g);
                            vl7Var.e = 0;
                            i8 = -1;
                        } else if (i == 1) {
                            long position = s2cVar2.getPosition();
                            arrayDeque.push(new ul7(vl7Var.f, vl7Var.g + position));
                            cib cibVar2 = vl7Var.d;
                            int i13 = vl7Var.f;
                            long j2 = vl7Var.g;
                            reh rehVar3 = (reh) cibVar2.b;
                            vq1.B(rehVar3.e0);
                            if (i13 != 160) {
                                if (i13 == 174) {
                                    qeh qehVar = new qeh();
                                    qehVar.n = -1;
                                    qehVar.o = -1;
                                    qehVar.p = -1;
                                    qehVar.q = -1;
                                    qehVar.r = -1;
                                    qehVar.s = 0;
                                    qehVar.t = -1;
                                    qehVar.u = 0.0f;
                                    qehVar.v = 0.0f;
                                    qehVar.w = 0.0f;
                                    qehVar.x = null;
                                    qehVar.y = -1;
                                    qehVar.z = false;
                                    qehVar.A = -1;
                                    qehVar.B = -1;
                                    qehVar.C = -1;
                                    qehVar.D = 1000;
                                    qehVar.E = 200;
                                    qehVar.F = -1.0f;
                                    qehVar.G = -1.0f;
                                    qehVar.H = -1.0f;
                                    qehVar.I = -1.0f;
                                    qehVar.J = -1.0f;
                                    qehVar.K = -1.0f;
                                    qehVar.L = -1.0f;
                                    qehVar.M = -1.0f;
                                    qehVar.N = -1.0f;
                                    qehVar.O = -1.0f;
                                    qehVar.Q = 1;
                                    qehVar.R = -1;
                                    qehVar.S = 8000;
                                    qehVar.T = 0L;
                                    qehVar.U = 0L;
                                    qehVar.X = true;
                                    qehVar.Y = "eng";
                                    rehVar3.x = qehVar;
                                    qehVar.a = rehVar3.w;
                                } else if (i13 == 187) {
                                    rehVar3.H = false;
                                    z2 = false;
                                } else if (i13 == 19899) {
                                    rehVar3.z = -1;
                                    rehVar3.A = -1L;
                                } else if (i13 == 20533) {
                                    rehVar3.e(i13);
                                    rehVar3.x.i = true;
                                } else if (i13 == 21968) {
                                    rehVar3.e(i13);
                                    rehVar3.x.z = true;
                                } else if (i13 == 408125543) {
                                    long j3 = rehVar3.s;
                                    if (j3 != -1 && j3 != position) {
                                        throw r7k.a(null, "Multiple Segment elements not supported");
                                    }
                                    rehVar3.s = position;
                                    rehVar3.r = j2;
                                } else if (i13 == 475249515) {
                                    rehVar3.F = new nug(0, (byte) 0);
                                    rehVar3.G = new nug(0, (byte) 0);
                                } else if (i13 == 524531317 && !rehVar3.y) {
                                    if (!rehVar3.d || rehVar3.C == -1) {
                                        rehVar3.e0.E(new zg2(rehVar3.v));
                                        rehVar3.y = true;
                                    } else {
                                        rehVar3.B = true;
                                    }
                                }
                                z2 = false;
                            } else {
                                z2 = false;
                                rehVar3.T = false;
                                rehVar3.U = 0L;
                            }
                            vl7Var.e = z2 ? 1 : 0;
                        } else if (i == 2) {
                            long j4 = vl7Var.g;
                            if (j4 > 8) {
                                throw r7k.a(null, "Invalid integer size: " + vl7Var.g);
                            }
                            cibVar.A(i12, vl7Var.a(s2cVar2, (int) j4));
                            z2 = false;
                            vl7Var.e = 0;
                        } else if (i == 3) {
                            long j5 = vl7Var.g;
                            if (j5 > 2147483647L) {
                                throw r7k.a(null, "String element size: " + vl7Var.g);
                            }
                            int i14 = (int) j5;
                            if (i14 == 0) {
                                str = "";
                            } else {
                                byte[] bArr3 = new byte[i14];
                                s2cVar2.readFully(bArr3, 0, i14);
                                while (i14 > 0 && bArr3[i14 - 1] == 0) {
                                    i14--;
                                }
                                str = new String(bArr3, 0, i14);
                            }
                            reh rehVar4 = (reh) cibVar.b;
                            if (i12 == 134) {
                                rehVar4.e(i12);
                                rehVar4.x.c = str;
                            } else if (i12 == 17026) {
                                if (!"webm".equals(str) && !"matroska".equals(str)) {
                                    throw r7k.a(null, "DocType " + str + " not supported");
                                }
                                rehVar4.w = str.equals("webm");
                            } else if (i12 == 21358) {
                                rehVar4.e(i12);
                                rehVar4.x.b = str;
                            } else if (i12 == 2274716) {
                                rehVar4.e(i12);
                                rehVar4.x.Y = str;
                            }
                            z2 = false;
                            vl7Var.e = 0;
                        } else if (i == 4) {
                            cibVar.m(i12, (int) vl7Var.g, s2cVar2);
                            vl7Var.e = 0;
                            z2 = false;
                        } else {
                            if (i != 5) {
                                throw r7k.a(null, "Invalid element type " + i);
                            }
                            long j6 = vl7Var.g;
                            if (j6 != 4 && j6 != 8) {
                                throw r7k.a(null, "Invalid float size: " + vl7Var.g);
                            }
                            int i15 = (int) j6;
                            double intBitsToFloat = i15 == 4 ? Float.intBitsToFloat((int) r2) : Double.longBitsToDouble(vl7Var.a(s2cVar2, i15));
                            reh rehVar5 = (reh) cibVar.b;
                            if (i12 == 181) {
                                rehVar5.e(i12);
                                rehVar5.x.S = (int) intBitsToFloat;
                            } else if (i12 != 17545) {
                                switch (i12) {
                                    case 21969:
                                        rehVar5.e(i12);
                                        rehVar5.x.F = (float) intBitsToFloat;
                                        break;
                                    case 21970:
                                        rehVar5.e(i12);
                                        rehVar5.x.G = (float) intBitsToFloat;
                                        break;
                                    case 21971:
                                        rehVar5.e(i12);
                                        rehVar5.x.H = (float) intBitsToFloat;
                                        break;
                                    case 21972:
                                        rehVar5.e(i12);
                                        rehVar5.x.I = (float) intBitsToFloat;
                                        break;
                                    case 21973:
                                        rehVar5.e(i12);
                                        rehVar5.x.J = (float) intBitsToFloat;
                                        break;
                                    case 21974:
                                        rehVar5.e(i12);
                                        rehVar5.x.K = (float) intBitsToFloat;
                                        break;
                                    case 21975:
                                        rehVar5.e(i12);
                                        rehVar5.x.L = (float) intBitsToFloat;
                                        break;
                                    case 21976:
                                        rehVar5.e(i12);
                                        rehVar5.x.M = (float) intBitsToFloat;
                                        break;
                                    case 21977:
                                        rehVar5.e(i12);
                                        rehVar5.x.N = (float) intBitsToFloat;
                                        break;
                                    case 21978:
                                        rehVar5.e(i12);
                                        rehVar5.x.O = (float) intBitsToFloat;
                                        break;
                                    default:
                                        switch (i12) {
                                            case 30323:
                                                rehVar5.e(i12);
                                                rehVar5.x.u = (float) intBitsToFloat;
                                                break;
                                            case 30324:
                                                rehVar5.e(i12);
                                                rehVar5.x.v = (float) intBitsToFloat;
                                                break;
                                            case 30325:
                                                rehVar5.e(i12);
                                                rehVar5.x.w = (float) intBitsToFloat;
                                                break;
                                        }
                                }
                            } else {
                                rehVar5.u = (long) intBitsToFloat;
                            }
                            z2 = false;
                            vl7Var.e = 0;
                        }
                    } else {
                        cib cibVar3 = vl7Var.d;
                        int i16 = ((ul7) arrayDeque.pop()).a;
                        reh rehVar6 = (reh) cibVar3.b;
                        SparseArray sparseArray = rehVar6.c;
                        vq1.B(rehVar6.e0);
                        if (i16 != 160) {
                            if (i16 == 174) {
                                qeh qehVar2 = rehVar6.x;
                                vq1.B(qehVar2);
                                String str6 = qehVar2.c;
                                if (str6 == null) {
                                    throw r7k.a(null, "CodecId is missing in TrackEntry element");
                                }
                                switch (str6) {
                                    case "V_MPEG4/ISO/AP":
                                    case "V_MPEG4/ISO/SP":
                                    case "A_MS/ACM":
                                    case "A_TRUEHD":
                                    case "A_VORBIS":
                                    case "A_MPEG/L2":
                                    case "A_MPEG/L3":
                                    case "V_MS/VFW/FOURCC":
                                    case "S_DVBSUB":
                                    case "V_MPEG4/ISO/ASP":
                                    case "V_MPEG4/ISO/AVC":
                                    case "S_VOBSUB":
                                    case "A_DTS/LOSSLESS":
                                    case "A_AAC":
                                    case "A_AC3":
                                    case "A_DTS":
                                    case "V_AV1":
                                    case "V_VP8":
                                    case "V_VP9":
                                    case "S_HDMV/PGS":
                                    case "V_THEORA":
                                    case "A_DTS/EXPRESS":
                                    case "A_PCM/FLOAT/IEEE":
                                    case "A_PCM/INT/BIG":
                                    case "A_PCM/INT/LIT":
                                    case "S_TEXT/ASS":
                                    case "V_MPEGH/ISO/HEVC":
                                    case "S_TEXT/WEBVTT":
                                    case "S_TEXT/UTF8":
                                    case "V_MPEG2":
                                    case "A_EAC3":
                                    case "A_FLAC":
                                    case "A_OPUS":
                                        t2c t2cVar = rehVar6.e0;
                                        int i17 = qehVar2.d;
                                        switch (str6.hashCode()) {
                                            case -2095576542:
                                                if (str6.equals("V_MPEG4/ISO/AP")) {
                                                    c = 0;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case -2095575984:
                                                if (str6.equals("V_MPEG4/ISO/SP")) {
                                                    c = 1;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case -1985379776:
                                                if (str6.equals("A_MS/ACM")) {
                                                    c = 2;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case -1784763192:
                                                if (str6.equals("A_TRUEHD")) {
                                                    c = 3;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case -1730367663:
                                                if (str6.equals("A_VORBIS")) {
                                                    c = 4;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case -1482641358:
                                                if (str6.equals("A_MPEG/L2")) {
                                                    c = 5;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case -1482641357:
                                                if (str6.equals("A_MPEG/L3")) {
                                                    c = 6;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case -1373388978:
                                                if (str6.equals("V_MS/VFW/FOURCC")) {
                                                    c = 7;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case -933872740:
                                                if (str6.equals("S_DVBSUB")) {
                                                    c = '\b';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case -538363189:
                                                if (str6.equals("V_MPEG4/ISO/ASP")) {
                                                    c = '\t';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case -538363109:
                                                if (str6.equals("V_MPEG4/ISO/AVC")) {
                                                    c = '\n';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case -425012669:
                                                if (str6.equals("S_VOBSUB")) {
                                                    c = 11;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case -356037306:
                                                if (str6.equals("A_DTS/LOSSLESS")) {
                                                    c = '\f';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 62923557:
                                                if (str6.equals("A_AAC")) {
                                                    c = '\r';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 62923603:
                                                if (str6.equals("A_AC3")) {
                                                    c = 14;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 62927045:
                                                if (str6.equals("A_DTS")) {
                                                    c = 15;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 82318131:
                                                if (str6.equals("V_AV1")) {
                                                    c = 16;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 82338133:
                                                if (str6.equals("V_VP8")) {
                                                    c = 17;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 82338134:
                                                if (str6.equals("V_VP9")) {
                                                    c = 18;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 99146302:
                                                if (str6.equals("S_HDMV/PGS")) {
                                                    c = 19;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 444813526:
                                                if (str6.equals("V_THEORA")) {
                                                    c = 20;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 542569478:
                                                if (str6.equals("A_DTS/EXPRESS")) {
                                                    c = 21;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 635596514:
                                                if (str6.equals("A_PCM/FLOAT/IEEE")) {
                                                    c = 22;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 725948237:
                                                if (str6.equals("A_PCM/INT/BIG")) {
                                                    c = 23;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 725957860:
                                                if (str6.equals("A_PCM/INT/LIT")) {
                                                    c = 24;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 738597099:
                                                if (str6.equals("S_TEXT/ASS")) {
                                                    c = 25;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 855502857:
                                                if (str6.equals("V_MPEGH/ISO/HEVC")) {
                                                    c = 26;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 1045209816:
                                                if (str6.equals("S_TEXT/WEBVTT")) {
                                                    c = 27;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 1422270023:
                                                if (str6.equals("S_TEXT/UTF8")) {
                                                    c = 28;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 1809237540:
                                                if (str6.equals("V_MPEG2")) {
                                                    c = 29;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 1950749482:
                                                if (str6.equals("A_EAC3")) {
                                                    c = 30;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 1950789798:
                                                if (str6.equals("A_FLAC")) {
                                                    c = 31;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 1951062397:
                                                if (str6.equals("A_OPUS")) {
                                                    c = ' ';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            default:
                                                c = 65535;
                                                break;
                                        }
                                        String str7 = "video/x-unknown";
                                        switch (c) {
                                            case 0:
                                            case 1:
                                            case '\t':
                                                rehVar = rehVar6;
                                                byte[] bArr4 = qehVar2.l;
                                                str7 = "video/mp4v-es";
                                                singletonList = bArr4 == null ? null : Collections.singletonList(bArr4);
                                                I = -1;
                                                str2 = null;
                                                i3 = -1;
                                                if (qehVar2.P != null && (a2 = ipc.a(new d7k(qehVar2.P))) != null) {
                                                    str2 = a2.b;
                                                    str7 = "video/dolby-vision";
                                                }
                                                int i18 = (qehVar2.X ? 1 : 0) | (qehVar2.W ? 2 : 0);
                                                bscVar = new bsc();
                                                k = l5i.k(str7);
                                                Map map = k0;
                                                if (k) {
                                                    bscVar.C = qehVar2.Q;
                                                    bscVar.D = qehVar2.S;
                                                    bscVar.E = I;
                                                    i4 = 1;
                                                } else if (l5i.o(str7)) {
                                                    if (qehVar2.s == 0) {
                                                        int i19 = qehVar2.q;
                                                        i5 = -1;
                                                        if (i19 == -1) {
                                                            i19 = qehVar2.n;
                                                        }
                                                        qehVar2.q = i19;
                                                        int i20 = qehVar2.r;
                                                        if (i20 == -1) {
                                                            i20 = qehVar2.o;
                                                        }
                                                        qehVar2.r = i20;
                                                    } else {
                                                        i5 = -1;
                                                    }
                                                    float f = (qehVar2.q == i5 || (i6 = qehVar2.r) == i5) ? -1.0f : (qehVar2.o * r1) / (qehVar2.n * i6);
                                                    if (qehVar2.z) {
                                                        if (qehVar2.F == -1.0f || qehVar2.G == -1.0f || qehVar2.H == -1.0f || qehVar2.I == -1.0f || qehVar2.J == -1.0f || qehVar2.K == -1.0f || qehVar2.L == -1.0f || qehVar2.M == -1.0f || qehVar2.N == -1.0f || qehVar2.O == -1.0f) {
                                                            bArr = null;
                                                        } else {
                                                            byte[] bArr5 = new byte[25];
                                                            ByteBuffer order = ByteBuffer.wrap(bArr5).order(ByteOrder.LITTLE_ENDIAN);
                                                            order.put((byte) 0);
                                                            order.putShort((short) ((qehVar2.F * 50000.0f) + 0.5f));
                                                            order.putShort((short) ((qehVar2.G * 50000.0f) + 0.5f));
                                                            order.putShort((short) ((qehVar2.H * 50000.0f) + 0.5f));
                                                            order.putShort((short) ((qehVar2.I * 50000.0f) + 0.5f));
                                                            order.putShort((short) ((qehVar2.J * 50000.0f) + 0.5f));
                                                            order.putShort((short) ((qehVar2.K * 50000.0f) + 0.5f));
                                                            order.putShort((short) ((qehVar2.L * 50000.0f) + 0.5f));
                                                            order.putShort((short) ((qehVar2.M * 50000.0f) + 0.5f));
                                                            order.putShort((short) (qehVar2.N + 0.5f));
                                                            order.putShort((short) (qehVar2.O + 0.5f));
                                                            order.putShort((short) qehVar2.D);
                                                            order.putShort((short) qehVar2.E);
                                                            bArr = bArr5;
                                                        }
                                                        int i21 = qehVar2.A;
                                                        int i22 = qehVar2.C;
                                                        int i23 = qehVar2.B;
                                                        int i24 = qehVar2.p;
                                                        q85Var = new q85(i21, i22, i23, i24, i24, bArr);
                                                    } else {
                                                        q85Var = null;
                                                    }
                                                    String str8 = qehVar2.b;
                                                    int intValue = (str8 == null || !map.containsKey(str8)) ? -1 : ((Integer) map.get(qehVar2.b)).intValue();
                                                    if (qehVar2.t == 0 && Float.compare(qehVar2.u, 0.0f) == 0 && Float.compare(qehVar2.v, 0.0f) == 0) {
                                                        if (Float.compare(qehVar2.w, 0.0f) == 0) {
                                                            intValue = 0;
                                                        } else if (Float.compare(qehVar2.w, 90.0f) == 0) {
                                                            intValue = 90;
                                                        } else if (Float.compare(qehVar2.w, -180.0f) == 0 || Float.compare(qehVar2.w, 180.0f) == 0) {
                                                            intValue = 180;
                                                        } else if (Float.compare(qehVar2.w, -90.0f) == 0) {
                                                            intValue = 270;
                                                        }
                                                    }
                                                    bscVar.t = qehVar2.n;
                                                    bscVar.u = qehVar2.o;
                                                    bscVar.x = f;
                                                    bscVar.w = intValue;
                                                    bscVar.y = qehVar2.x;
                                                    bscVar.z = qehVar2.y;
                                                    bscVar.A = q85Var;
                                                    i4 = 2;
                                                } else {
                                                    if (!"application/x-subrip".equals(str7) && !"text/x-ssa".equals(str7) && !"text/vtt".equals(str7) && !"application/vobsub".equals(str7) && !"application/pgs".equals(str7) && !"application/dvbsubs".equals(str7)) {
                                                        throw r7k.a(null, "Unexpected MIME type.");
                                                    }
                                                    i4 = 3;
                                                }
                                                str5 = qehVar2.b;
                                                if (str5 != null && !map.containsKey(str5)) {
                                                    bscVar.b = qehVar2.b;
                                                }
                                                bscVar.a = Integer.toString(i17);
                                                bscVar.l = l5i.p(qehVar2.a ? "video/webm" : "video/x-matroska");
                                                bscVar.m = l5i.p(str7);
                                                bscVar.n = i3;
                                                bscVar.d = qehVar2.Y;
                                                bscVar.e = i18;
                                                bscVar.p = singletonList;
                                                bscVar.j = str2;
                                                bscVar.q = qehVar2.m;
                                                dsc dscVar = new dsc(bscVar);
                                                azs M = t2cVar.M(qehVar2.d, i4);
                                                qehVar2.Z = M;
                                                M.d(dscVar);
                                                sparseArray.put(qehVar2.d, qehVar2);
                                                rehVar6 = rehVar;
                                                break;
                                            case 2:
                                                rehVar = rehVar6;
                                                d7k d7kVar = new d7k(qehVar2.a(qehVar2.c));
                                                try {
                                                    int o = d7kVar.o();
                                                    if (o != 1) {
                                                        if (o == 65534) {
                                                            d7kVar.H(24);
                                                            long p = d7kVar.p();
                                                            UUID uuid = j0;
                                                            if (p == uuid.getMostSignificantBits()) {
                                                                break;
                                                            }
                                                        }
                                                        vq1.n0("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                                                        str7 = "audio/x-unknown";
                                                        I = -1;
                                                        str2 = null;
                                                        i3 = -1;
                                                        singletonList = null;
                                                        if (qehVar2.P != null) {
                                                            str2 = a2.b;
                                                            str7 = "video/dolby-vision";
                                                            break;
                                                        }
                                                        int i182 = (qehVar2.X ? 1 : 0) | (qehVar2.W ? 2 : 0);
                                                        bscVar = new bsc();
                                                        k = l5i.k(str7);
                                                        Map map2 = k0;
                                                        if (k) {
                                                        }
                                                        str5 = qehVar2.b;
                                                        if (str5 != null) {
                                                            bscVar.b = qehVar2.b;
                                                            break;
                                                        }
                                                        bscVar.a = Integer.toString(i17);
                                                        bscVar.l = l5i.p(qehVar2.a ? "video/webm" : "video/x-matroska");
                                                        bscVar.m = l5i.p(str7);
                                                        bscVar.n = i3;
                                                        bscVar.d = qehVar2.Y;
                                                        bscVar.e = i182;
                                                        bscVar.p = singletonList;
                                                        bscVar.j = str2;
                                                        bscVar.q = qehVar2.m;
                                                        dsc dscVar2 = new dsc(bscVar);
                                                        azs M2 = t2cVar.M(qehVar2.d, i4);
                                                        qehVar2.Z = M2;
                                                        M2.d(dscVar2);
                                                        sparseArray.put(qehVar2.d, qehVar2);
                                                        rehVar6 = rehVar;
                                                    }
                                                    I = dvt.I(qehVar2.R);
                                                    if (I == 0) {
                                                        vq1.n0("MatroskaExtractor", "Unsupported PCM bit depth: " + qehVar2.R + ". Setting mimeType to audio/x-unknown");
                                                        str7 = "audio/x-unknown";
                                                        I = -1;
                                                        str2 = null;
                                                        i3 = -1;
                                                        singletonList = null;
                                                        if (qehVar2.P != null) {
                                                        }
                                                        int i1822 = (qehVar2.X ? 1 : 0) | (qehVar2.W ? 2 : 0);
                                                        bscVar = new bsc();
                                                        k = l5i.k(str7);
                                                        Map map22 = k0;
                                                        if (k) {
                                                        }
                                                        str5 = qehVar2.b;
                                                        if (str5 != null) {
                                                        }
                                                        bscVar.a = Integer.toString(i17);
                                                        bscVar.l = l5i.p(qehVar2.a ? "video/webm" : "video/x-matroska");
                                                        bscVar.m = l5i.p(str7);
                                                        bscVar.n = i3;
                                                        bscVar.d = qehVar2.Y;
                                                        bscVar.e = i1822;
                                                        bscVar.p = singletonList;
                                                        bscVar.j = str2;
                                                        bscVar.q = qehVar2.m;
                                                        dsc dscVar22 = new dsc(bscVar);
                                                        azs M22 = t2cVar.M(qehVar2.d, i4);
                                                        qehVar2.Z = M22;
                                                        M22.d(dscVar22);
                                                        sparseArray.put(qehVar2.d, qehVar2);
                                                        rehVar6 = rehVar;
                                                    }
                                                    str7 = "audio/raw";
                                                    str2 = null;
                                                    i3 = -1;
                                                    singletonList = null;
                                                    if (qehVar2.P != null) {
                                                    }
                                                    int i18222 = (qehVar2.X ? 1 : 0) | (qehVar2.W ? 2 : 0);
                                                    bscVar = new bsc();
                                                    k = l5i.k(str7);
                                                    Map map222 = k0;
                                                    if (k) {
                                                    }
                                                    str5 = qehVar2.b;
                                                    if (str5 != null) {
                                                    }
                                                    bscVar.a = Integer.toString(i17);
                                                    bscVar.l = l5i.p(qehVar2.a ? "video/webm" : "video/x-matroska");
                                                    bscVar.m = l5i.p(str7);
                                                    bscVar.n = i3;
                                                    bscVar.d = qehVar2.Y;
                                                    bscVar.e = i18222;
                                                    bscVar.p = singletonList;
                                                    bscVar.j = str2;
                                                    bscVar.q = qehVar2.m;
                                                    dsc dscVar222 = new dsc(bscVar);
                                                    azs M222 = t2cVar.M(qehVar2.d, i4);
                                                    qehVar2.Z = M222;
                                                    M222.d(dscVar222);
                                                    sparseArray.put(qehVar2.d, qehVar2);
                                                    rehVar6 = rehVar;
                                                } catch (ArrayIndexOutOfBoundsException unused) {
                                                    throw r7k.a(null, "Error parsing MS/ACM codec private");
                                                }
                                                break;
                                            case 3:
                                                rehVar = rehVar6;
                                                qehVar2.V = new wat();
                                                str7 = "audio/true-hd";
                                                I = -1;
                                                str2 = null;
                                                i3 = -1;
                                                singletonList = null;
                                                if (qehVar2.P != null) {
                                                }
                                                int i182222 = (qehVar2.X ? 1 : 0) | (qehVar2.W ? 2 : 0);
                                                bscVar = new bsc();
                                                k = l5i.k(str7);
                                                Map map2222 = k0;
                                                if (k) {
                                                }
                                                str5 = qehVar2.b;
                                                if (str5 != null) {
                                                }
                                                bscVar.a = Integer.toString(i17);
                                                bscVar.l = l5i.p(qehVar2.a ? "video/webm" : "video/x-matroska");
                                                bscVar.m = l5i.p(str7);
                                                bscVar.n = i3;
                                                bscVar.d = qehVar2.Y;
                                                bscVar.e = i182222;
                                                bscVar.p = singletonList;
                                                bscVar.j = str2;
                                                bscVar.q = qehVar2.m;
                                                dsc dscVar2222 = new dsc(bscVar);
                                                azs M2222 = t2cVar.M(qehVar2.d, i4);
                                                qehVar2.Z = M2222;
                                                M2222.d(dscVar2222);
                                                sparseArray.put(qehVar2.d, qehVar2);
                                                rehVar6 = rehVar;
                                                break;
                                            case 4:
                                                byte[] a3 = qehVar2.a(str6);
                                                try {
                                                } catch (ArrayIndexOutOfBoundsException unused2) {
                                                    a3 = 0;
                                                }
                                                try {
                                                    if (a3[0] != 2) {
                                                        throw r7k.a(null, "Error parsing vorbis codec private");
                                                    }
                                                    int i25 = 0;
                                                    int i26 = 1;
                                                    while (true) {
                                                        int i27 = i26;
                                                        int i28 = a3[i26] & KotlinVersion.MAX_COMPONENT_VALUE;
                                                        if (i28 == 255) {
                                                            i25 += KotlinVersion.MAX_COMPONENT_VALUE;
                                                            i26 = i27 + 1;
                                                        } else {
                                                            int i29 = i27 + 1;
                                                            int i30 = i25 + i28;
                                                            int i31 = 0;
                                                            while (true) {
                                                                int i32 = a3[i29] & KotlinVersion.MAX_COMPONENT_VALUE;
                                                                if (i32 == 255) {
                                                                    i31 += KotlinVersion.MAX_COMPONENT_VALUE;
                                                                    i29++;
                                                                } else {
                                                                    int i33 = i29 + 1;
                                                                    int i34 = i31 + i32;
                                                                    if (a3[i33] != 1) {
                                                                        throw r7k.a(null, "Error parsing vorbis codec private");
                                                                    }
                                                                    byte[] bArr6 = new byte[i30];
                                                                    System.arraycopy(a3, i33, bArr6, 0, i30);
                                                                    int i35 = i33 + i30;
                                                                    if (a3[i35] != 3) {
                                                                        throw r7k.a(null, "Error parsing vorbis codec private");
                                                                    }
                                                                    int i36 = i35 + i34;
                                                                    if (a3[i36] != 5) {
                                                                        throw r7k.a(null, "Error parsing vorbis codec private");
                                                                    }
                                                                    byte[] bArr7 = new byte[a3.length - i36];
                                                                    rehVar = rehVar6;
                                                                    System.arraycopy(a3, i36, bArr7, 0, a3.length - i36);
                                                                    ArrayList arrayList = new ArrayList(2);
                                                                    arrayList.add(bArr6);
                                                                    arrayList.add(bArr7);
                                                                    str7 = "audio/vorbis";
                                                                    singletonList = arrayList;
                                                                    i3 = 8192;
                                                                    I = -1;
                                                                    str2 = null;
                                                                    if (qehVar2.P != null) {
                                                                    }
                                                                    int i1822222 = (qehVar2.X ? 1 : 0) | (qehVar2.W ? 2 : 0);
                                                                    bscVar = new bsc();
                                                                    k = l5i.k(str7);
                                                                    Map map22222 = k0;
                                                                    if (k) {
                                                                    }
                                                                    str5 = qehVar2.b;
                                                                    if (str5 != null) {
                                                                    }
                                                                    bscVar.a = Integer.toString(i17);
                                                                    bscVar.l = l5i.p(qehVar2.a ? "video/webm" : "video/x-matroska");
                                                                    bscVar.m = l5i.p(str7);
                                                                    bscVar.n = i3;
                                                                    bscVar.d = qehVar2.Y;
                                                                    bscVar.e = i1822222;
                                                                    bscVar.p = singletonList;
                                                                    bscVar.j = str2;
                                                                    bscVar.q = qehVar2.m;
                                                                    dsc dscVar22222 = new dsc(bscVar);
                                                                    azs M22222 = t2cVar.M(qehVar2.d, i4);
                                                                    qehVar2.Z = M22222;
                                                                    M22222.d(dscVar22222);
                                                                    sparseArray.put(qehVar2.d, qehVar2);
                                                                    rehVar6 = rehVar;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } catch (ArrayIndexOutOfBoundsException unused3) {
                                                    throw r7k.a(a3, "Error parsing vorbis codec private");
                                                }
                                                break;
                                            case 5:
                                                str7 = "audio/mpeg-L2";
                                                rehVar = rehVar6;
                                                I = -1;
                                                str2 = null;
                                                i3 = 4096;
                                                singletonList = null;
                                                if (qehVar2.P != null) {
                                                }
                                                int i18222222 = (qehVar2.X ? 1 : 0) | (qehVar2.W ? 2 : 0);
                                                bscVar = new bsc();
                                                k = l5i.k(str7);
                                                Map map222222 = k0;
                                                if (k) {
                                                }
                                                str5 = qehVar2.b;
                                                if (str5 != null) {
                                                }
                                                bscVar.a = Integer.toString(i17);
                                                bscVar.l = l5i.p(qehVar2.a ? "video/webm" : "video/x-matroska");
                                                bscVar.m = l5i.p(str7);
                                                bscVar.n = i3;
                                                bscVar.d = qehVar2.Y;
                                                bscVar.e = i18222222;
                                                bscVar.p = singletonList;
                                                bscVar.j = str2;
                                                bscVar.q = qehVar2.m;
                                                dsc dscVar222222 = new dsc(bscVar);
                                                azs M222222 = t2cVar.M(qehVar2.d, i4);
                                                qehVar2.Z = M222222;
                                                M222222.d(dscVar222222);
                                                sparseArray.put(qehVar2.d, qehVar2);
                                                rehVar6 = rehVar;
                                                break;
                                            case 6:
                                                str7 = "audio/mpeg";
                                                rehVar = rehVar6;
                                                I = -1;
                                                str2 = null;
                                                i3 = 4096;
                                                singletonList = null;
                                                if (qehVar2.P != null) {
                                                }
                                                int i182222222 = (qehVar2.X ? 1 : 0) | (qehVar2.W ? 2 : 0);
                                                bscVar = new bsc();
                                                k = l5i.k(str7);
                                                Map map2222222 = k0;
                                                if (k) {
                                                }
                                                str5 = qehVar2.b;
                                                if (str5 != null) {
                                                }
                                                bscVar.a = Integer.toString(i17);
                                                bscVar.l = l5i.p(qehVar2.a ? "video/webm" : "video/x-matroska");
                                                bscVar.m = l5i.p(str7);
                                                bscVar.n = i3;
                                                bscVar.d = qehVar2.Y;
                                                bscVar.e = i182222222;
                                                bscVar.p = singletonList;
                                                bscVar.j = str2;
                                                bscVar.q = qehVar2.m;
                                                dsc dscVar2222222 = new dsc(bscVar);
                                                azs M2222222 = t2cVar.M(qehVar2.d, i4);
                                                qehVar2.Z = M2222222;
                                                M2222222.d(dscVar2222222);
                                                sparseArray.put(qehVar2.d, qehVar2);
                                                rehVar6 = rehVar;
                                                break;
                                            case 7:
                                                d7k d7kVar2 = new d7k(qehVar2.a(qehVar2.c));
                                                try {
                                                    d7kVar2.I(16);
                                                    long m = d7kVar2.m();
                                                    if (m == 1482049860) {
                                                        try {
                                                            pair = new Pair("video/divx", null);
                                                        } catch (ArrayIndexOutOfBoundsException unused4) {
                                                            runtimeException = null;
                                                            throw r7k.a(runtimeException, "Error parsing FourCC private data");
                                                        }
                                                    } else if (m == 859189832) {
                                                        pair = new Pair("video/3gpp", null);
                                                    } else {
                                                        if (m == 826496599) {
                                                            byte[] bArr8 = d7kVar2.a;
                                                            for (int i37 = d7kVar2.b + 20; i37 < bArr8.length - 4; i37++) {
                                                                if (bArr8[i37] == 0 && bArr8[i37 + 1] == 0 && bArr8[i37 + 2] == 1) {
                                                                    if (bArr8[i37 + 3] == 15) {
                                                                        pair = new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArr8, i37, bArr8.length)));
                                                                    }
                                                                }
                                                            }
                                                            try {
                                                                throw r7k.a(null, "Failed to find FourCC VC1 initialization data");
                                                            } catch (ArrayIndexOutOfBoundsException unused5) {
                                                                runtimeException = null;
                                                                throw r7k.a(runtimeException, "Error parsing FourCC private data");
                                                            }
                                                        }
                                                        vq1.n0("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                                                        str3 = null;
                                                        pair = new Pair("video/x-unknown", null);
                                                        str7 = (String) pair.first;
                                                        rehVar = rehVar6;
                                                        str2 = str3;
                                                        singletonList = (List) pair.second;
                                                        I = -1;
                                                        i3 = -1;
                                                        if (qehVar2.P != null) {
                                                        }
                                                        int i1822222222 = (qehVar2.X ? 1 : 0) | (qehVar2.W ? 2 : 0);
                                                        bscVar = new bsc();
                                                        k = l5i.k(str7);
                                                        Map map22222222 = k0;
                                                        if (k) {
                                                        }
                                                        str5 = qehVar2.b;
                                                        if (str5 != null) {
                                                        }
                                                        bscVar.a = Integer.toString(i17);
                                                        bscVar.l = l5i.p(qehVar2.a ? "video/webm" : "video/x-matroska");
                                                        bscVar.m = l5i.p(str7);
                                                        bscVar.n = i3;
                                                        bscVar.d = qehVar2.Y;
                                                        bscVar.e = i1822222222;
                                                        bscVar.p = singletonList;
                                                        bscVar.j = str2;
                                                        bscVar.q = qehVar2.m;
                                                        dsc dscVar22222222 = new dsc(bscVar);
                                                        azs M22222222 = t2cVar.M(qehVar2.d, i4);
                                                        qehVar2.Z = M22222222;
                                                        M22222222.d(dscVar22222222);
                                                        sparseArray.put(qehVar2.d, qehVar2);
                                                        rehVar6 = rehVar;
                                                    }
                                                    str3 = null;
                                                    str7 = (String) pair.first;
                                                    rehVar = rehVar6;
                                                    str2 = str3;
                                                    singletonList = (List) pair.second;
                                                    I = -1;
                                                    i3 = -1;
                                                    if (qehVar2.P != null) {
                                                    }
                                                    int i18222222222 = (qehVar2.X ? 1 : 0) | (qehVar2.W ? 2 : 0);
                                                    bscVar = new bsc();
                                                    k = l5i.k(str7);
                                                    Map map222222222 = k0;
                                                    if (k) {
                                                    }
                                                    str5 = qehVar2.b;
                                                    if (str5 != null) {
                                                    }
                                                    bscVar.a = Integer.toString(i17);
                                                    bscVar.l = l5i.p(qehVar2.a ? "video/webm" : "video/x-matroska");
                                                    bscVar.m = l5i.p(str7);
                                                    bscVar.n = i3;
                                                    bscVar.d = qehVar2.Y;
                                                    bscVar.e = i18222222222;
                                                    bscVar.p = singletonList;
                                                    bscVar.j = str2;
                                                    bscVar.q = qehVar2.m;
                                                    dsc dscVar222222222 = new dsc(bscVar);
                                                    azs M222222222 = t2cVar.M(qehVar2.d, i4);
                                                    qehVar2.Z = M222222222;
                                                    M222222222.d(dscVar222222222);
                                                    sparseArray.put(qehVar2.d, qehVar2);
                                                    rehVar6 = rehVar;
                                                } catch (ArrayIndexOutOfBoundsException unused6) {
                                                    runtimeException = null;
                                                }
                                                break;
                                            case '\b':
                                                byte[] bArr9 = new byte[4];
                                                System.arraycopy(qehVar2.a(str6), 0, bArr9, 0, 4);
                                                singletonList = yde.y(bArr9);
                                                rehVar = rehVar6;
                                                str7 = "application/dvbsubs";
                                                I = -1;
                                                str2 = null;
                                                i3 = -1;
                                                if (qehVar2.P != null) {
                                                }
                                                int i182222222222 = (qehVar2.X ? 1 : 0) | (qehVar2.W ? 2 : 0);
                                                bscVar = new bsc();
                                                k = l5i.k(str7);
                                                Map map2222222222 = k0;
                                                if (k) {
                                                }
                                                str5 = qehVar2.b;
                                                if (str5 != null) {
                                                }
                                                bscVar.a = Integer.toString(i17);
                                                bscVar.l = l5i.p(qehVar2.a ? "video/webm" : "video/x-matroska");
                                                bscVar.m = l5i.p(str7);
                                                bscVar.n = i3;
                                                bscVar.d = qehVar2.Y;
                                                bscVar.e = i182222222222;
                                                bscVar.p = singletonList;
                                                bscVar.j = str2;
                                                bscVar.q = qehVar2.m;
                                                dsc dscVar2222222222 = new dsc(bscVar);
                                                azs M2222222222 = t2cVar.M(qehVar2.d, i4);
                                                qehVar2.Z = M2222222222;
                                                M2222222222.d(dscVar2222222222);
                                                sparseArray.put(qehVar2.d, qehVar2);
                                                rehVar6 = rehVar;
                                                break;
                                            case '\n':
                                                rg2 a4 = rg2.a(new d7k(qehVar2.a(qehVar2.c)));
                                                singletonList = a4.a;
                                                qehVar2.a0 = a4.b;
                                                str4 = a4.l;
                                                str7 = "video/avc";
                                                str2 = str4;
                                                rehVar = rehVar6;
                                                I = -1;
                                                i3 = -1;
                                                if (qehVar2.P != null) {
                                                }
                                                int i1822222222222 = (qehVar2.X ? 1 : 0) | (qehVar2.W ? 2 : 0);
                                                bscVar = new bsc();
                                                k = l5i.k(str7);
                                                Map map22222222222 = k0;
                                                if (k) {
                                                }
                                                str5 = qehVar2.b;
                                                if (str5 != null) {
                                                }
                                                bscVar.a = Integer.toString(i17);
                                                bscVar.l = l5i.p(qehVar2.a ? "video/webm" : "video/x-matroska");
                                                bscVar.m = l5i.p(str7);
                                                bscVar.n = i3;
                                                bscVar.d = qehVar2.Y;
                                                bscVar.e = i1822222222222;
                                                bscVar.p = singletonList;
                                                bscVar.j = str2;
                                                bscVar.q = qehVar2.m;
                                                dsc dscVar22222222222 = new dsc(bscVar);
                                                azs M22222222222 = t2cVar.M(qehVar2.d, i4);
                                                qehVar2.Z = M22222222222;
                                                M22222222222.d(dscVar22222222222);
                                                sparseArray.put(qehVar2.d, qehVar2);
                                                rehVar6 = rehVar;
                                                break;
                                            case 11:
                                                singletonList = yde.y(qehVar2.a(str6));
                                                rehVar = rehVar6;
                                                str7 = "application/vobsub";
                                                I = -1;
                                                str2 = null;
                                                i3 = -1;
                                                if (qehVar2.P != null) {
                                                }
                                                int i18222222222222 = (qehVar2.X ? 1 : 0) | (qehVar2.W ? 2 : 0);
                                                bscVar = new bsc();
                                                k = l5i.k(str7);
                                                Map map222222222222 = k0;
                                                if (k) {
                                                }
                                                str5 = qehVar2.b;
                                                if (str5 != null) {
                                                }
                                                bscVar.a = Integer.toString(i17);
                                                bscVar.l = l5i.p(qehVar2.a ? "video/webm" : "video/x-matroska");
                                                bscVar.m = l5i.p(str7);
                                                bscVar.n = i3;
                                                bscVar.d = qehVar2.Y;
                                                bscVar.e = i18222222222222;
                                                bscVar.p = singletonList;
                                                bscVar.j = str2;
                                                bscVar.q = qehVar2.m;
                                                dsc dscVar222222222222 = new dsc(bscVar);
                                                azs M222222222222 = t2cVar.M(qehVar2.d, i4);
                                                qehVar2.Z = M222222222222;
                                                M222222222222.d(dscVar222222222222);
                                                sparseArray.put(qehVar2.d, qehVar2);
                                                rehVar6 = rehVar;
                                                break;
                                            case '\f':
                                                str7 = "audio/vnd.dts.hd";
                                                rehVar = rehVar6;
                                                I = -1;
                                                str2 = null;
                                                i3 = -1;
                                                singletonList = null;
                                                if (qehVar2.P != null) {
                                                }
                                                int i182222222222222 = (qehVar2.X ? 1 : 0) | (qehVar2.W ? 2 : 0);
                                                bscVar = new bsc();
                                                k = l5i.k(str7);
                                                Map map2222222222222 = k0;
                                                if (k) {
                                                }
                                                str5 = qehVar2.b;
                                                if (str5 != null) {
                                                }
                                                bscVar.a = Integer.toString(i17);
                                                bscVar.l = l5i.p(qehVar2.a ? "video/webm" : "video/x-matroska");
                                                bscVar.m = l5i.p(str7);
                                                bscVar.n = i3;
                                                bscVar.d = qehVar2.Y;
                                                bscVar.e = i182222222222222;
                                                bscVar.p = singletonList;
                                                bscVar.j = str2;
                                                bscVar.q = qehVar2.m;
                                                dsc dscVar2222222222222 = new dsc(bscVar);
                                                azs M2222222222222 = t2cVar.M(qehVar2.d, i4);
                                                qehVar2.Z = M2222222222222;
                                                M2222222222222.d(dscVar2222222222222);
                                                sparseArray.put(qehVar2.d, qehVar2);
                                                rehVar6 = rehVar;
                                                break;
                                            case '\r':
                                                List singletonList2 = Collections.singletonList(qehVar2.a(str6));
                                                byte[] bArr10 = qehVar2.l;
                                                c1 x0 = zsd.x0(new v94(bArr10, bArr10.length), false);
                                                qehVar2.S = x0.b;
                                                qehVar2.Q = x0.c;
                                                String str9 = x0.a;
                                                str7 = "audio/mp4a-latm";
                                                rehVar = rehVar6;
                                                str2 = str9;
                                                i3 = -1;
                                                list = singletonList2;
                                                singletonList = list;
                                                I = -1;
                                                if (qehVar2.P != null) {
                                                }
                                                int i1822222222222222 = (qehVar2.X ? 1 : 0) | (qehVar2.W ? 2 : 0);
                                                bscVar = new bsc();
                                                k = l5i.k(str7);
                                                Map map22222222222222 = k0;
                                                if (k) {
                                                }
                                                str5 = qehVar2.b;
                                                if (str5 != null) {
                                                }
                                                bscVar.a = Integer.toString(i17);
                                                bscVar.l = l5i.p(qehVar2.a ? "video/webm" : "video/x-matroska");
                                                bscVar.m = l5i.p(str7);
                                                bscVar.n = i3;
                                                bscVar.d = qehVar2.Y;
                                                bscVar.e = i1822222222222222;
                                                bscVar.p = singletonList;
                                                bscVar.j = str2;
                                                bscVar.q = qehVar2.m;
                                                dsc dscVar22222222222222 = new dsc(bscVar);
                                                azs M22222222222222 = t2cVar.M(qehVar2.d, i4);
                                                qehVar2.Z = M22222222222222;
                                                M22222222222222.d(dscVar22222222222222);
                                                sparseArray.put(qehVar2.d, qehVar2);
                                                rehVar6 = rehVar;
                                                break;
                                            case 14:
                                                str7 = "audio/ac3";
                                                rehVar = rehVar6;
                                                I = -1;
                                                str2 = null;
                                                i3 = -1;
                                                singletonList = null;
                                                if (qehVar2.P != null) {
                                                }
                                                int i18222222222222222 = (qehVar2.X ? 1 : 0) | (qehVar2.W ? 2 : 0);
                                                bscVar = new bsc();
                                                k = l5i.k(str7);
                                                Map map222222222222222 = k0;
                                                if (k) {
                                                }
                                                str5 = qehVar2.b;
                                                if (str5 != null) {
                                                }
                                                bscVar.a = Integer.toString(i17);
                                                bscVar.l = l5i.p(qehVar2.a ? "video/webm" : "video/x-matroska");
                                                bscVar.m = l5i.p(str7);
                                                bscVar.n = i3;
                                                bscVar.d = qehVar2.Y;
                                                bscVar.e = i18222222222222222;
                                                bscVar.p = singletonList;
                                                bscVar.j = str2;
                                                bscVar.q = qehVar2.m;
                                                dsc dscVar222222222222222 = new dsc(bscVar);
                                                azs M222222222222222 = t2cVar.M(qehVar2.d, i4);
                                                qehVar2.Z = M222222222222222;
                                                M222222222222222.d(dscVar222222222222222);
                                                sparseArray.put(qehVar2.d, qehVar2);
                                                rehVar6 = rehVar;
                                                break;
                                            case 15:
                                            case 21:
                                                str7 = "audio/vnd.dts";
                                                rehVar = rehVar6;
                                                I = -1;
                                                str2 = null;
                                                i3 = -1;
                                                singletonList = null;
                                                if (qehVar2.P != null) {
                                                }
                                                int i182222222222222222 = (qehVar2.X ? 1 : 0) | (qehVar2.W ? 2 : 0);
                                                bscVar = new bsc();
                                                k = l5i.k(str7);
                                                Map map2222222222222222 = k0;
                                                if (k) {
                                                }
                                                str5 = qehVar2.b;
                                                if (str5 != null) {
                                                }
                                                bscVar.a = Integer.toString(i17);
                                                bscVar.l = l5i.p(qehVar2.a ? "video/webm" : "video/x-matroska");
                                                bscVar.m = l5i.p(str7);
                                                bscVar.n = i3;
                                                bscVar.d = qehVar2.Y;
                                                bscVar.e = i182222222222222222;
                                                bscVar.p = singletonList;
                                                bscVar.j = str2;
                                                bscVar.q = qehVar2.m;
                                                dsc dscVar2222222222222222 = new dsc(bscVar);
                                                azs M2222222222222222 = t2cVar.M(qehVar2.d, i4);
                                                qehVar2.Z = M2222222222222222;
                                                M2222222222222222.d(dscVar2222222222222222);
                                                sparseArray.put(qehVar2.d, qehVar2);
                                                rehVar6 = rehVar;
                                                break;
                                            case 16:
                                                byte[] bArr11 = qehVar2.l;
                                                y = bArr11 == null ? null : yde.y(bArr11);
                                                str7 = "video/av01";
                                                singletonList = y;
                                                rehVar = rehVar6;
                                                I = -1;
                                                str2 = null;
                                                i3 = -1;
                                                if (qehVar2.P != null) {
                                                }
                                                int i1822222222222222222 = (qehVar2.X ? 1 : 0) | (qehVar2.W ? 2 : 0);
                                                bscVar = new bsc();
                                                k = l5i.k(str7);
                                                Map map22222222222222222 = k0;
                                                if (k) {
                                                }
                                                str5 = qehVar2.b;
                                                if (str5 != null) {
                                                }
                                                bscVar.a = Integer.toString(i17);
                                                bscVar.l = l5i.p(qehVar2.a ? "video/webm" : "video/x-matroska");
                                                bscVar.m = l5i.p(str7);
                                                bscVar.n = i3;
                                                bscVar.d = qehVar2.Y;
                                                bscVar.e = i1822222222222222222;
                                                bscVar.p = singletonList;
                                                bscVar.j = str2;
                                                bscVar.q = qehVar2.m;
                                                dsc dscVar22222222222222222 = new dsc(bscVar);
                                                azs M22222222222222222 = t2cVar.M(qehVar2.d, i4);
                                                qehVar2.Z = M22222222222222222;
                                                M22222222222222222.d(dscVar22222222222222222);
                                                sparseArray.put(qehVar2.d, qehVar2);
                                                rehVar6 = rehVar;
                                                break;
                                            case 17:
                                                str7 = "video/x-vnd.on2.vp8";
                                                rehVar = rehVar6;
                                                I = -1;
                                                str2 = null;
                                                i3 = -1;
                                                singletonList = null;
                                                if (qehVar2.P != null) {
                                                }
                                                int i18222222222222222222 = (qehVar2.X ? 1 : 0) | (qehVar2.W ? 2 : 0);
                                                bscVar = new bsc();
                                                k = l5i.k(str7);
                                                Map map222222222222222222 = k0;
                                                if (k) {
                                                }
                                                str5 = qehVar2.b;
                                                if (str5 != null) {
                                                }
                                                bscVar.a = Integer.toString(i17);
                                                bscVar.l = l5i.p(qehVar2.a ? "video/webm" : "video/x-matroska");
                                                bscVar.m = l5i.p(str7);
                                                bscVar.n = i3;
                                                bscVar.d = qehVar2.Y;
                                                bscVar.e = i18222222222222222222;
                                                bscVar.p = singletonList;
                                                bscVar.j = str2;
                                                bscVar.q = qehVar2.m;
                                                dsc dscVar222222222222222222 = new dsc(bscVar);
                                                azs M222222222222222222 = t2cVar.M(qehVar2.d, i4);
                                                qehVar2.Z = M222222222222222222;
                                                M222222222222222222.d(dscVar222222222222222222);
                                                sparseArray.put(qehVar2.d, qehVar2);
                                                rehVar6 = rehVar;
                                                break;
                                            case 18:
                                                byte[] bArr12 = qehVar2.l;
                                                y = bArr12 == null ? null : yde.y(bArr12);
                                                str7 = "video/x-vnd.on2.vp9";
                                                singletonList = y;
                                                rehVar = rehVar6;
                                                I = -1;
                                                str2 = null;
                                                i3 = -1;
                                                if (qehVar2.P != null) {
                                                }
                                                int i182222222222222222222 = (qehVar2.X ? 1 : 0) | (qehVar2.W ? 2 : 0);
                                                bscVar = new bsc();
                                                k = l5i.k(str7);
                                                Map map2222222222222222222 = k0;
                                                if (k) {
                                                }
                                                str5 = qehVar2.b;
                                                if (str5 != null) {
                                                }
                                                bscVar.a = Integer.toString(i17);
                                                bscVar.l = l5i.p(qehVar2.a ? "video/webm" : "video/x-matroska");
                                                bscVar.m = l5i.p(str7);
                                                bscVar.n = i3;
                                                bscVar.d = qehVar2.Y;
                                                bscVar.e = i182222222222222222222;
                                                bscVar.p = singletonList;
                                                bscVar.j = str2;
                                                bscVar.q = qehVar2.m;
                                                dsc dscVar2222222222222222222 = new dsc(bscVar);
                                                azs M2222222222222222222 = t2cVar.M(qehVar2.d, i4);
                                                qehVar2.Z = M2222222222222222222;
                                                M2222222222222222222.d(dscVar2222222222222222222);
                                                sparseArray.put(qehVar2.d, qehVar2);
                                                rehVar6 = rehVar;
                                                break;
                                            case 19:
                                                rehVar = rehVar6;
                                                str7 = "application/pgs";
                                                I = -1;
                                                str2 = null;
                                                i3 = -1;
                                                singletonList = null;
                                                if (qehVar2.P != null) {
                                                }
                                                int i1822222222222222222222 = (qehVar2.X ? 1 : 0) | (qehVar2.W ? 2 : 0);
                                                bscVar = new bsc();
                                                k = l5i.k(str7);
                                                Map map22222222222222222222 = k0;
                                                if (k) {
                                                }
                                                str5 = qehVar2.b;
                                                if (str5 != null) {
                                                }
                                                bscVar.a = Integer.toString(i17);
                                                bscVar.l = l5i.p(qehVar2.a ? "video/webm" : "video/x-matroska");
                                                bscVar.m = l5i.p(str7);
                                                bscVar.n = i3;
                                                bscVar.d = qehVar2.Y;
                                                bscVar.e = i1822222222222222222222;
                                                bscVar.p = singletonList;
                                                bscVar.j = str2;
                                                bscVar.q = qehVar2.m;
                                                dsc dscVar22222222222222222222 = new dsc(bscVar);
                                                azs M22222222222222222222 = t2cVar.M(qehVar2.d, i4);
                                                qehVar2.Z = M22222222222222222222;
                                                M22222222222222222222.d(dscVar22222222222222222222);
                                                sparseArray.put(qehVar2.d, qehVar2);
                                                rehVar6 = rehVar;
                                                break;
                                            case 20:
                                                rehVar = rehVar6;
                                                I = -1;
                                                str2 = null;
                                                i3 = -1;
                                                singletonList = null;
                                                if (qehVar2.P != null) {
                                                }
                                                int i18222222222222222222222 = (qehVar2.X ? 1 : 0) | (qehVar2.W ? 2 : 0);
                                                bscVar = new bsc();
                                                k = l5i.k(str7);
                                                Map map222222222222222222222 = k0;
                                                if (k) {
                                                }
                                                str5 = qehVar2.b;
                                                if (str5 != null) {
                                                }
                                                bscVar.a = Integer.toString(i17);
                                                bscVar.l = l5i.p(qehVar2.a ? "video/webm" : "video/x-matroska");
                                                bscVar.m = l5i.p(str7);
                                                bscVar.n = i3;
                                                bscVar.d = qehVar2.Y;
                                                bscVar.e = i18222222222222222222222;
                                                bscVar.p = singletonList;
                                                bscVar.j = str2;
                                                bscVar.q = qehVar2.m;
                                                dsc dscVar222222222222222222222 = new dsc(bscVar);
                                                azs M222222222222222222222 = t2cVar.M(qehVar2.d, i4);
                                                qehVar2.Z = M222222222222222222222;
                                                M222222222222222222222.d(dscVar222222222222222222222);
                                                sparseArray.put(qehVar2.d, qehVar2);
                                                rehVar6 = rehVar;
                                                break;
                                            case 22:
                                                if (qehVar2.R == 32) {
                                                    rehVar = rehVar6;
                                                    str7 = "audio/raw";
                                                    I = 4;
                                                    str2 = null;
                                                    i3 = -1;
                                                    singletonList = null;
                                                    if (qehVar2.P != null) {
                                                    }
                                                    int i182222222222222222222222 = (qehVar2.X ? 1 : 0) | (qehVar2.W ? 2 : 0);
                                                    bscVar = new bsc();
                                                    k = l5i.k(str7);
                                                    Map map2222222222222222222222 = k0;
                                                    if (k) {
                                                    }
                                                    str5 = qehVar2.b;
                                                    if (str5 != null) {
                                                    }
                                                    bscVar.a = Integer.toString(i17);
                                                    bscVar.l = l5i.p(qehVar2.a ? "video/webm" : "video/x-matroska");
                                                    bscVar.m = l5i.p(str7);
                                                    bscVar.n = i3;
                                                    bscVar.d = qehVar2.Y;
                                                    bscVar.e = i182222222222222222222222;
                                                    bscVar.p = singletonList;
                                                    bscVar.j = str2;
                                                    bscVar.q = qehVar2.m;
                                                    dsc dscVar2222222222222222222222 = new dsc(bscVar);
                                                    azs M2222222222222222222222 = t2cVar.M(qehVar2.d, i4);
                                                    qehVar2.Z = M2222222222222222222222;
                                                    M2222222222222222222222.d(dscVar2222222222222222222222);
                                                    sparseArray.put(qehVar2.d, qehVar2);
                                                    rehVar6 = rehVar;
                                                } else {
                                                    vq1.n0("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + qehVar2.R + ". Setting mimeType to audio/x-unknown");
                                                    rehVar = rehVar6;
                                                    str7 = "audio/x-unknown";
                                                    I = -1;
                                                    str2 = null;
                                                    i3 = -1;
                                                    singletonList = null;
                                                    if (qehVar2.P != null) {
                                                    }
                                                    int i1822222222222222222222222 = (qehVar2.X ? 1 : 0) | (qehVar2.W ? 2 : 0);
                                                    bscVar = new bsc();
                                                    k = l5i.k(str7);
                                                    Map map22222222222222222222222 = k0;
                                                    if (k) {
                                                    }
                                                    str5 = qehVar2.b;
                                                    if (str5 != null) {
                                                    }
                                                    bscVar.a = Integer.toString(i17);
                                                    bscVar.l = l5i.p(qehVar2.a ? "video/webm" : "video/x-matroska");
                                                    bscVar.m = l5i.p(str7);
                                                    bscVar.n = i3;
                                                    bscVar.d = qehVar2.Y;
                                                    bscVar.e = i1822222222222222222222222;
                                                    bscVar.p = singletonList;
                                                    bscVar.j = str2;
                                                    bscVar.q = qehVar2.m;
                                                    dsc dscVar22222222222222222222222 = new dsc(bscVar);
                                                    azs M22222222222222222222222 = t2cVar.M(qehVar2.d, i4);
                                                    qehVar2.Z = M22222222222222222222222;
                                                    M22222222222222222222222.d(dscVar22222222222222222222222);
                                                    sparseArray.put(qehVar2.d, qehVar2);
                                                    rehVar6 = rehVar;
                                                }
                                                break;
                                            case 23:
                                                int i38 = qehVar2.R;
                                                if (i38 == 8) {
                                                    rehVar = rehVar6;
                                                    str7 = "audio/raw";
                                                    I = 3;
                                                    str2 = null;
                                                    i3 = -1;
                                                    singletonList = null;
                                                    if (qehVar2.P != null) {
                                                    }
                                                    int i18222222222222222222222222 = (qehVar2.X ? 1 : 0) | (qehVar2.W ? 2 : 0);
                                                    bscVar = new bsc();
                                                    k = l5i.k(str7);
                                                    Map map222222222222222222222222 = k0;
                                                    if (k) {
                                                    }
                                                    str5 = qehVar2.b;
                                                    if (str5 != null) {
                                                    }
                                                    bscVar.a = Integer.toString(i17);
                                                    bscVar.l = l5i.p(qehVar2.a ? "video/webm" : "video/x-matroska");
                                                    bscVar.m = l5i.p(str7);
                                                    bscVar.n = i3;
                                                    bscVar.d = qehVar2.Y;
                                                    bscVar.e = i18222222222222222222222222;
                                                    bscVar.p = singletonList;
                                                    bscVar.j = str2;
                                                    bscVar.q = qehVar2.m;
                                                    dsc dscVar222222222222222222222222 = new dsc(bscVar);
                                                    azs M222222222222222222222222 = t2cVar.M(qehVar2.d, i4);
                                                    qehVar2.Z = M222222222222222222222222;
                                                    M222222222222222222222222.d(dscVar222222222222222222222222);
                                                    sparseArray.put(qehVar2.d, qehVar2);
                                                    rehVar6 = rehVar;
                                                } else {
                                                    if (i38 == 16) {
                                                        I = 268435456;
                                                    } else if (i38 == 24) {
                                                        I = 1342177280;
                                                    } else if (i38 == 32) {
                                                        I = 1610612736;
                                                    } else {
                                                        vq1.n0("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + qehVar2.R + ". Setting mimeType to audio/x-unknown");
                                                        rehVar = rehVar6;
                                                        str7 = "audio/x-unknown";
                                                        I = -1;
                                                        str2 = null;
                                                        i3 = -1;
                                                        singletonList = null;
                                                        if (qehVar2.P != null) {
                                                        }
                                                        int i182222222222222222222222222 = (qehVar2.X ? 1 : 0) | (qehVar2.W ? 2 : 0);
                                                        bscVar = new bsc();
                                                        k = l5i.k(str7);
                                                        Map map2222222222222222222222222 = k0;
                                                        if (k) {
                                                        }
                                                        str5 = qehVar2.b;
                                                        if (str5 != null) {
                                                        }
                                                        bscVar.a = Integer.toString(i17);
                                                        bscVar.l = l5i.p(qehVar2.a ? "video/webm" : "video/x-matroska");
                                                        bscVar.m = l5i.p(str7);
                                                        bscVar.n = i3;
                                                        bscVar.d = qehVar2.Y;
                                                        bscVar.e = i182222222222222222222222222;
                                                        bscVar.p = singletonList;
                                                        bscVar.j = str2;
                                                        bscVar.q = qehVar2.m;
                                                        dsc dscVar2222222222222222222222222 = new dsc(bscVar);
                                                        azs M2222222222222222222222222 = t2cVar.M(qehVar2.d, i4);
                                                        qehVar2.Z = M2222222222222222222222222;
                                                        M2222222222222222222222222.d(dscVar2222222222222222222222222);
                                                        sparseArray.put(qehVar2.d, qehVar2);
                                                        rehVar6 = rehVar;
                                                    }
                                                    rehVar = rehVar6;
                                                    str7 = "audio/raw";
                                                    str2 = null;
                                                    i3 = -1;
                                                    singletonList = null;
                                                    if (qehVar2.P != null) {
                                                    }
                                                    int i1822222222222222222222222222 = (qehVar2.X ? 1 : 0) | (qehVar2.W ? 2 : 0);
                                                    bscVar = new bsc();
                                                    k = l5i.k(str7);
                                                    Map map22222222222222222222222222 = k0;
                                                    if (k) {
                                                    }
                                                    str5 = qehVar2.b;
                                                    if (str5 != null) {
                                                    }
                                                    bscVar.a = Integer.toString(i17);
                                                    bscVar.l = l5i.p(qehVar2.a ? "video/webm" : "video/x-matroska");
                                                    bscVar.m = l5i.p(str7);
                                                    bscVar.n = i3;
                                                    bscVar.d = qehVar2.Y;
                                                    bscVar.e = i1822222222222222222222222222;
                                                    bscVar.p = singletonList;
                                                    bscVar.j = str2;
                                                    bscVar.q = qehVar2.m;
                                                    dsc dscVar22222222222222222222222222 = new dsc(bscVar);
                                                    azs M22222222222222222222222222 = t2cVar.M(qehVar2.d, i4);
                                                    qehVar2.Z = M22222222222222222222222222;
                                                    M22222222222222222222222222.d(dscVar22222222222222222222222222);
                                                    sparseArray.put(qehVar2.d, qehVar2);
                                                    rehVar6 = rehVar;
                                                }
                                                break;
                                            case 24:
                                                I = dvt.I(qehVar2.R);
                                                if (I == 0) {
                                                    vq1.n0("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + qehVar2.R + ". Setting mimeType to audio/x-unknown");
                                                    rehVar = rehVar6;
                                                    str7 = "audio/x-unknown";
                                                    I = -1;
                                                    str2 = null;
                                                    i3 = -1;
                                                    singletonList = null;
                                                    if (qehVar2.P != null) {
                                                    }
                                                    int i18222222222222222222222222222 = (qehVar2.X ? 1 : 0) | (qehVar2.W ? 2 : 0);
                                                    bscVar = new bsc();
                                                    k = l5i.k(str7);
                                                    Map map222222222222222222222222222 = k0;
                                                    if (k) {
                                                    }
                                                    str5 = qehVar2.b;
                                                    if (str5 != null) {
                                                    }
                                                    bscVar.a = Integer.toString(i17);
                                                    bscVar.l = l5i.p(qehVar2.a ? "video/webm" : "video/x-matroska");
                                                    bscVar.m = l5i.p(str7);
                                                    bscVar.n = i3;
                                                    bscVar.d = qehVar2.Y;
                                                    bscVar.e = i18222222222222222222222222222;
                                                    bscVar.p = singletonList;
                                                    bscVar.j = str2;
                                                    bscVar.q = qehVar2.m;
                                                    dsc dscVar222222222222222222222222222 = new dsc(bscVar);
                                                    azs M222222222222222222222222222 = t2cVar.M(qehVar2.d, i4);
                                                    qehVar2.Z = M222222222222222222222222222;
                                                    M222222222222222222222222222.d(dscVar222222222222222222222222222);
                                                    sparseArray.put(qehVar2.d, qehVar2);
                                                    rehVar6 = rehVar;
                                                }
                                                rehVar = rehVar6;
                                                str7 = "audio/raw";
                                                str2 = null;
                                                i3 = -1;
                                                singletonList = null;
                                                if (qehVar2.P != null) {
                                                }
                                                int i182222222222222222222222222222 = (qehVar2.X ? 1 : 0) | (qehVar2.W ? 2 : 0);
                                                bscVar = new bsc();
                                                k = l5i.k(str7);
                                                Map map2222222222222222222222222222 = k0;
                                                if (k) {
                                                }
                                                str5 = qehVar2.b;
                                                if (str5 != null) {
                                                }
                                                bscVar.a = Integer.toString(i17);
                                                bscVar.l = l5i.p(qehVar2.a ? "video/webm" : "video/x-matroska");
                                                bscVar.m = l5i.p(str7);
                                                bscVar.n = i3;
                                                bscVar.d = qehVar2.Y;
                                                bscVar.e = i182222222222222222222222222222;
                                                bscVar.p = singletonList;
                                                bscVar.j = str2;
                                                bscVar.q = qehVar2.m;
                                                dsc dscVar2222222222222222222222222222 = new dsc(bscVar);
                                                azs M2222222222222222222222222222 = t2cVar.M(qehVar2.d, i4);
                                                qehVar2.Z = M2222222222222222222222222222;
                                                M2222222222222222222222222222.d(dscVar2222222222222222222222222222);
                                                sparseArray.put(qehVar2.d, qehVar2);
                                                rehVar6 = rehVar;
                                                break;
                                            case 25:
                                                singletonList = yde.z(g0, qehVar2.a(str6));
                                                rehVar = rehVar6;
                                                str7 = "text/x-ssa";
                                                I = -1;
                                                str2 = null;
                                                i3 = -1;
                                                if (qehVar2.P != null) {
                                                }
                                                int i1822222222222222222222222222222 = (qehVar2.X ? 1 : 0) | (qehVar2.W ? 2 : 0);
                                                bscVar = new bsc();
                                                k = l5i.k(str7);
                                                Map map22222222222222222222222222222 = k0;
                                                if (k) {
                                                }
                                                str5 = qehVar2.b;
                                                if (str5 != null) {
                                                }
                                                bscVar.a = Integer.toString(i17);
                                                bscVar.l = l5i.p(qehVar2.a ? "video/webm" : "video/x-matroska");
                                                bscVar.m = l5i.p(str7);
                                                bscVar.n = i3;
                                                bscVar.d = qehVar2.Y;
                                                bscVar.e = i1822222222222222222222222222222;
                                                bscVar.p = singletonList;
                                                bscVar.j = str2;
                                                bscVar.q = qehVar2.m;
                                                dsc dscVar22222222222222222222222222222 = new dsc(bscVar);
                                                azs M22222222222222222222222222222 = t2cVar.M(qehVar2.d, i4);
                                                qehVar2.Z = M22222222222222222222222222222;
                                                M22222222222222222222222222222.d(dscVar22222222222222222222222222222);
                                                sparseArray.put(qehVar2.d, qehVar2);
                                                rehVar6 = rehVar;
                                                break;
                                            case 26:
                                                hxd a5 = hxd.a(new d7k(qehVar2.a(qehVar2.c)), false, null);
                                                singletonList = a5.a;
                                                qehVar2.a0 = a5.b;
                                                str4 = a5.l;
                                                str7 = "video/hevc";
                                                str2 = str4;
                                                rehVar = rehVar6;
                                                I = -1;
                                                i3 = -1;
                                                if (qehVar2.P != null) {
                                                }
                                                int i18222222222222222222222222222222 = (qehVar2.X ? 1 : 0) | (qehVar2.W ? 2 : 0);
                                                bscVar = new bsc();
                                                k = l5i.k(str7);
                                                Map map222222222222222222222222222222 = k0;
                                                if (k) {
                                                }
                                                str5 = qehVar2.b;
                                                if (str5 != null) {
                                                }
                                                bscVar.a = Integer.toString(i17);
                                                bscVar.l = l5i.p(qehVar2.a ? "video/webm" : "video/x-matroska");
                                                bscVar.m = l5i.p(str7);
                                                bscVar.n = i3;
                                                bscVar.d = qehVar2.Y;
                                                bscVar.e = i18222222222222222222222222222222;
                                                bscVar.p = singletonList;
                                                bscVar.j = str2;
                                                bscVar.q = qehVar2.m;
                                                dsc dscVar222222222222222222222222222222 = new dsc(bscVar);
                                                azs M222222222222222222222222222222 = t2cVar.M(qehVar2.d, i4);
                                                qehVar2.Z = M222222222222222222222222222222;
                                                M222222222222222222222222222222.d(dscVar222222222222222222222222222222);
                                                sparseArray.put(qehVar2.d, qehVar2);
                                                rehVar6 = rehVar;
                                                break;
                                            case 27:
                                                rehVar = rehVar6;
                                                str7 = "text/vtt";
                                                I = -1;
                                                str2 = null;
                                                i3 = -1;
                                                singletonList = null;
                                                if (qehVar2.P != null) {
                                                }
                                                int i182222222222222222222222222222222 = (qehVar2.X ? 1 : 0) | (qehVar2.W ? 2 : 0);
                                                bscVar = new bsc();
                                                k = l5i.k(str7);
                                                Map map2222222222222222222222222222222 = k0;
                                                if (k) {
                                                }
                                                str5 = qehVar2.b;
                                                if (str5 != null) {
                                                }
                                                bscVar.a = Integer.toString(i17);
                                                bscVar.l = l5i.p(qehVar2.a ? "video/webm" : "video/x-matroska");
                                                bscVar.m = l5i.p(str7);
                                                bscVar.n = i3;
                                                bscVar.d = qehVar2.Y;
                                                bscVar.e = i182222222222222222222222222222222;
                                                bscVar.p = singletonList;
                                                bscVar.j = str2;
                                                bscVar.q = qehVar2.m;
                                                dsc dscVar2222222222222222222222222222222 = new dsc(bscVar);
                                                azs M2222222222222222222222222222222 = t2cVar.M(qehVar2.d, i4);
                                                qehVar2.Z = M2222222222222222222222222222222;
                                                M2222222222222222222222222222222.d(dscVar2222222222222222222222222222222);
                                                sparseArray.put(qehVar2.d, qehVar2);
                                                rehVar6 = rehVar;
                                                break;
                                            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                                                rehVar = rehVar6;
                                                str7 = "application/x-subrip";
                                                I = -1;
                                                str2 = null;
                                                i3 = -1;
                                                singletonList = null;
                                                if (qehVar2.P != null) {
                                                }
                                                int i1822222222222222222222222222222222 = (qehVar2.X ? 1 : 0) | (qehVar2.W ? 2 : 0);
                                                bscVar = new bsc();
                                                k = l5i.k(str7);
                                                Map map22222222222222222222222222222222 = k0;
                                                if (k) {
                                                }
                                                str5 = qehVar2.b;
                                                if (str5 != null) {
                                                }
                                                bscVar.a = Integer.toString(i17);
                                                bscVar.l = l5i.p(qehVar2.a ? "video/webm" : "video/x-matroska");
                                                bscVar.m = l5i.p(str7);
                                                bscVar.n = i3;
                                                bscVar.d = qehVar2.Y;
                                                bscVar.e = i1822222222222222222222222222222222;
                                                bscVar.p = singletonList;
                                                bscVar.j = str2;
                                                bscVar.q = qehVar2.m;
                                                dsc dscVar22222222222222222222222222222222 = new dsc(bscVar);
                                                azs M22222222222222222222222222222222 = t2cVar.M(qehVar2.d, i4);
                                                qehVar2.Z = M22222222222222222222222222222222;
                                                M22222222222222222222222222222222.d(dscVar22222222222222222222222222222222);
                                                sparseArray.put(qehVar2.d, qehVar2);
                                                rehVar6 = rehVar;
                                                break;
                                            case 29:
                                                str7 = "video/mpeg2";
                                                rehVar = rehVar6;
                                                I = -1;
                                                str2 = null;
                                                i3 = -1;
                                                singletonList = null;
                                                if (qehVar2.P != null) {
                                                }
                                                int i18222222222222222222222222222222222 = (qehVar2.X ? 1 : 0) | (qehVar2.W ? 2 : 0);
                                                bscVar = new bsc();
                                                k = l5i.k(str7);
                                                Map map222222222222222222222222222222222 = k0;
                                                if (k) {
                                                }
                                                str5 = qehVar2.b;
                                                if (str5 != null) {
                                                }
                                                bscVar.a = Integer.toString(i17);
                                                bscVar.l = l5i.p(qehVar2.a ? "video/webm" : "video/x-matroska");
                                                bscVar.m = l5i.p(str7);
                                                bscVar.n = i3;
                                                bscVar.d = qehVar2.Y;
                                                bscVar.e = i18222222222222222222222222222222222;
                                                bscVar.p = singletonList;
                                                bscVar.j = str2;
                                                bscVar.q = qehVar2.m;
                                                dsc dscVar222222222222222222222222222222222 = new dsc(bscVar);
                                                azs M222222222222222222222222222222222 = t2cVar.M(qehVar2.d, i4);
                                                qehVar2.Z = M222222222222222222222222222222222;
                                                M222222222222222222222222222222222.d(dscVar222222222222222222222222222222222);
                                                sparseArray.put(qehVar2.d, qehVar2);
                                                rehVar6 = rehVar;
                                                break;
                                            case 30:
                                                str7 = "audio/eac3";
                                                rehVar = rehVar6;
                                                I = -1;
                                                str2 = null;
                                                i3 = -1;
                                                singletonList = null;
                                                if (qehVar2.P != null) {
                                                }
                                                int i182222222222222222222222222222222222 = (qehVar2.X ? 1 : 0) | (qehVar2.W ? 2 : 0);
                                                bscVar = new bsc();
                                                k = l5i.k(str7);
                                                Map map2222222222222222222222222222222222 = k0;
                                                if (k) {
                                                }
                                                str5 = qehVar2.b;
                                                if (str5 != null) {
                                                }
                                                bscVar.a = Integer.toString(i17);
                                                bscVar.l = l5i.p(qehVar2.a ? "video/webm" : "video/x-matroska");
                                                bscVar.m = l5i.p(str7);
                                                bscVar.n = i3;
                                                bscVar.d = qehVar2.Y;
                                                bscVar.e = i182222222222222222222222222222222222;
                                                bscVar.p = singletonList;
                                                bscVar.j = str2;
                                                bscVar.q = qehVar2.m;
                                                dsc dscVar2222222222222222222222222222222222 = new dsc(bscVar);
                                                azs M2222222222222222222222222222222222 = t2cVar.M(qehVar2.d, i4);
                                                qehVar2.Z = M2222222222222222222222222222222222;
                                                M2222222222222222222222222222222222.d(dscVar2222222222222222222222222222222222);
                                                sparseArray.put(qehVar2.d, qehVar2);
                                                rehVar6 = rehVar;
                                                break;
                                            case o.LOW_ENTROPY_SOURCE_FIELD_NUMBER /* 31 */:
                                                y = Collections.singletonList(qehVar2.a(str6));
                                                str7 = "audio/flac";
                                                singletonList = y;
                                                rehVar = rehVar6;
                                                I = -1;
                                                str2 = null;
                                                i3 = -1;
                                                if (qehVar2.P != null) {
                                                }
                                                int i1822222222222222222222222222222222222 = (qehVar2.X ? 1 : 0) | (qehVar2.W ? 2 : 0);
                                                bscVar = new bsc();
                                                k = l5i.k(str7);
                                                Map map22222222222222222222222222222222222 = k0;
                                                if (k) {
                                                }
                                                str5 = qehVar2.b;
                                                if (str5 != null) {
                                                }
                                                bscVar.a = Integer.toString(i17);
                                                bscVar.l = l5i.p(qehVar2.a ? "video/webm" : "video/x-matroska");
                                                bscVar.m = l5i.p(str7);
                                                bscVar.n = i3;
                                                bscVar.d = qehVar2.Y;
                                                bscVar.e = i1822222222222222222222222222222222222;
                                                bscVar.p = singletonList;
                                                bscVar.j = str2;
                                                bscVar.q = qehVar2.m;
                                                dsc dscVar22222222222222222222222222222222222 = new dsc(bscVar);
                                                azs M22222222222222222222222222222222222 = t2cVar.M(qehVar2.d, i4);
                                                qehVar2.Z = M22222222222222222222222222222222222;
                                                M22222222222222222222222222222222222.d(dscVar22222222222222222222222222222222222);
                                                sparseArray.put(qehVar2.d, qehVar2);
                                                rehVar6 = rehVar;
                                                break;
                                            case ' ':
                                                ArrayList arrayList2 = new ArrayList(3);
                                                arrayList2.add(qehVar2.a(qehVar2.c));
                                                ByteBuffer allocate = ByteBuffer.allocate(8);
                                                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                                                arrayList2.add(allocate.order(byteOrder).putLong(qehVar2.T).array());
                                                arrayList2.add(ByteBuffer.allocate(8).order(byteOrder).putLong(qehVar2.U).array());
                                                str7 = "audio/opus";
                                                rehVar = rehVar6;
                                                i3 = 5760;
                                                str2 = null;
                                                list = arrayList2;
                                                singletonList = list;
                                                I = -1;
                                                if (qehVar2.P != null) {
                                                }
                                                int i18222222222222222222222222222222222222 = (qehVar2.X ? 1 : 0) | (qehVar2.W ? 2 : 0);
                                                bscVar = new bsc();
                                                k = l5i.k(str7);
                                                Map map222222222222222222222222222222222222 = k0;
                                                if (k) {
                                                }
                                                str5 = qehVar2.b;
                                                if (str5 != null) {
                                                }
                                                bscVar.a = Integer.toString(i17);
                                                bscVar.l = l5i.p(qehVar2.a ? "video/webm" : "video/x-matroska");
                                                bscVar.m = l5i.p(str7);
                                                bscVar.n = i3;
                                                bscVar.d = qehVar2.Y;
                                                bscVar.e = i18222222222222222222222222222222222222;
                                                bscVar.p = singletonList;
                                                bscVar.j = str2;
                                                bscVar.q = qehVar2.m;
                                                dsc dscVar222222222222222222222222222222222222 = new dsc(bscVar);
                                                azs M222222222222222222222222222222222222 = t2cVar.M(qehVar2.d, i4);
                                                qehVar2.Z = M222222222222222222222222222222222222;
                                                M222222222222222222222222222222222222.d(dscVar222222222222222222222222222222222222);
                                                sparseArray.put(qehVar2.d, qehVar2);
                                                rehVar6 = rehVar;
                                                break;
                                            default:
                                                throw r7k.a(null, "Unrecognized codec identifier.");
                                        }
                                    default:
                                        rehVar6.x = null;
                                        break;
                                }
                            } else if (i16 == 19899) {
                                int i39 = rehVar6.z;
                                if (i39 != i8) {
                                    long j7 = rehVar6.A;
                                    if (j7 != -1) {
                                        if (i39 == 475249515) {
                                            rehVar6.C = j7;
                                        }
                                    }
                                }
                            } else if (i16 == 25152) {
                                rehVar6.e(i16);
                                qeh qehVar3 = rehVar6.x;
                                if (qehVar3.i) {
                                    zys zysVar = qehVar3.k;
                                    if (zysVar == null) {
                                        throw r7k.a(null, "Encrypted Track found but ContentEncKeyID was not found");
                                    }
                                    qehVar3.m = new pqa(new oqa(un3.a, null, "video/webm", zysVar.b));
                                }
                            } else if (i16 == 28032) {
                                rehVar6.e(i16);
                                qeh qehVar4 = rehVar6.x;
                                if (qehVar4.i && qehVar4.j != null) {
                                    throw r7k.a(null, "Combining encryption and compression is not supported");
                                }
                            } else if (i16 == 357149030) {
                                if (rehVar6.t == -9223372036854775807L) {
                                    rehVar6.t = 1000000L;
                                }
                                long j8 = rehVar6.u;
                                if (j8 != -9223372036854775807L) {
                                    rehVar6.v = rehVar6.m(j8);
                                }
                            } else if (i16 == 374648427) {
                                if (sparseArray.size() == 0) {
                                    throw r7k.a(null, "No valid tracks were found");
                                }
                                rehVar6.e0.K();
                            } else if (i16 == 475249515) {
                                if (!rehVar6.y) {
                                    t2c t2cVar2 = rehVar6.e0;
                                    nug nugVar = rehVar6.F;
                                    nug nugVar2 = rehVar6.G;
                                    if (rehVar6.s == -1 || rehVar6.v == -9223372036854775807L || nugVar == null || (i7 = nugVar.b) == 0 || nugVar2 == null || nugVar2.b != i7) {
                                        zg2Var = new zg2(rehVar6.v);
                                    } else {
                                        int[] iArr = new int[i7];
                                        long[] jArr = new long[i7];
                                        long[] jArr2 = new long[i7];
                                        long[] jArr3 = new long[i7];
                                        for (int i40 = 0; i40 < i7; i40++) {
                                            jArr3[i40] = nugVar.d(i40);
                                            jArr[i40] = nugVar2.d(i40) + rehVar6.s;
                                        }
                                        int i41 = 0;
                                        while (true) {
                                            int i42 = i7 - 1;
                                            if (i41 < i42) {
                                                int i43 = i41 + 1;
                                                iArr[i41] = (int) (jArr[i43] - jArr[i41]);
                                                jArr2[i41] = jArr3[i43] - jArr3[i41];
                                                i41 = i43;
                                            } else {
                                                int i44 = i42;
                                                while (i44 > 0 && jArr3[i44] > rehVar6.v) {
                                                    i44--;
                                                }
                                                iArr[i44] = (int) ((rehVar6.s + rehVar6.r) - jArr[i44]);
                                                jArr2[i44] = rehVar6.v - jArr3[i44];
                                                if (i44 < i42) {
                                                    vq1.n0("MatroskaExtractor", "Discarding trailing cue points with timestamps greater than total duration");
                                                    int i45 = i44 + 1;
                                                    iArr = Arrays.copyOf(iArr, i45);
                                                    jArr = Arrays.copyOf(jArr, i45);
                                                    jArr2 = Arrays.copyOf(jArr2, i45);
                                                    jArr3 = Arrays.copyOf(jArr3, i45);
                                                }
                                                zg2Var = new tk4(iArr, jArr, jArr2, jArr3);
                                            }
                                        }
                                    }
                                    t2cVar2.E(zg2Var);
                                    rehVar6.y = true;
                                }
                                rehVar6.F = null;
                                rehVar6.G = null;
                            }
                        } else if (rehVar6.J == 2) {
                            qeh qehVar5 = (qeh) sparseArray.get(rehVar6.P);
                            qehVar5.Z.getClass();
                            if (rehVar6.U > 0 && "A_OPUS".equals(qehVar5.c)) {
                                d7k d7kVar3 = rehVar6.p;
                                byte[] array = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(rehVar6.U).array();
                                d7kVar3.getClass();
                                d7kVar3.F(array.length, array);
                            }
                            int i46 = 0;
                            for (int i47 = 0; i47 < rehVar6.N; i47++) {
                                i46 += rehVar6.O[i47];
                            }
                            int i48 = 0;
                            while (i48 < rehVar6.N) {
                                long j9 = rehVar6.K + ((qehVar5.f * i48) / 1000);
                                int i49 = rehVar6.R;
                                if (i48 == 0 && !rehVar6.T) {
                                    i49 |= 1;
                                }
                                int i50 = rehVar6.O[i48];
                                int i51 = i46 - i50;
                                rehVar6.f(qehVar5, j9, i49, i50, i51);
                                i48++;
                                i46 = i51;
                            }
                            z3 = false;
                            rehVar6.J = 0;
                            s2cVar2 = s2cVar;
                            z2 = z3;
                        }
                        z3 = false;
                        s2cVar2 = s2cVar;
                        z2 = z3;
                    }
                }
            }
        }
    }

    public final void j(s2c s2cVar, int i) {
        d7k d7kVar = this.i;
        if (d7kVar.c >= i) {
            return;
        }
        byte[] bArr = d7kVar.a;
        if (bArr.length < i) {
            d7kVar.b(Math.max(bArr.length * 2, i));
        }
        byte[] bArr2 = d7kVar.a;
        int i2 = d7kVar.c;
        s2cVar.readFully(bArr2, i2, i - i2);
        d7kVar.G(i);
    }

    public final void k() {
        this.V = 0;
        this.W = 0;
        this.X = 0;
        this.Y = false;
        this.Z = false;
        this.a0 = false;
        this.b0 = 0;
        this.c0 = (byte) 0;
        this.d0 = false;
        this.l.E(0);
    }

    @Override // defpackage.r2c
    public final void l(t2c t2cVar) {
        if (this.e) {
            t2cVar = new z0j(t2cVar, this.f);
        }
        this.e0 = t2cVar;
    }

    public final long m(long j) {
        long j2 = this.t;
        if (j2 == -9223372036854775807L) {
            throw r7k.a(null, "Can't scale timecode prior to timecodeScale being set.");
        }
        int i = dvt.a;
        return dvt.g0(j, j2, 1000L, RoundingMode.DOWN);
    }

    public final int n(s2c s2cVar, qeh qehVar, int i, boolean z) {
        int c;
        int c2;
        int i2;
        int i3;
        if ("S_TEXT/UTF8".equals(qehVar.c)) {
            o(s2cVar, f0, i);
            int i4 = this.W;
            k();
            return i4;
        }
        if ("S_TEXT/ASS".equals(qehVar.c)) {
            o(s2cVar, h0, i);
            int i5 = this.W;
            k();
            return i5;
        }
        if ("S_TEXT/WEBVTT".equals(qehVar.c)) {
            o(s2cVar, i0, i);
            int i6 = this.W;
            k();
            return i6;
        }
        azs azsVar = qehVar.Z;
        boolean z2 = this.Y;
        d7k d7kVar = this.l;
        int i7 = 2;
        if (!z2) {
            boolean z3 = qehVar.i;
            d7k d7kVar2 = this.i;
            if (z3) {
                this.R &= -1073741825;
                if (!this.Z) {
                    s2cVar.readFully(d7kVar2.a, 0, 1);
                    this.V++;
                    byte b = d7kVar2.a[0];
                    if ((b & 128) == 128) {
                        throw r7k.a(null, "Extension bit is set in signal byte");
                    }
                    this.c0 = b;
                    this.Z = true;
                }
                byte b2 = this.c0;
                if ((b2 & 1) == 1) {
                    boolean z4 = (b2 & 2) == 2;
                    this.R |= 1073741824;
                    if (!this.d0) {
                        d7k d7kVar3 = this.n;
                        s2cVar.readFully(d7kVar3.a, 0, 8);
                        this.V += 8;
                        this.d0 = true;
                        d7kVar2.a[0] = (byte) ((z4 ? 128 : 0) | 8);
                        d7kVar2.H(0);
                        azsVar.b(d7kVar2, 1, 1);
                        this.W++;
                        d7kVar3.H(0);
                        azsVar.b(d7kVar3, 8, 1);
                        this.W += 8;
                    }
                    if (z4) {
                        if (!this.a0) {
                            s2cVar.readFully(d7kVar2.a, 0, 1);
                            this.V++;
                            d7kVar2.H(0);
                            this.b0 = d7kVar2.v();
                            this.a0 = true;
                        }
                        int i8 = this.b0 * 4;
                        d7kVar2.E(i8);
                        s2cVar.readFully(d7kVar2.a, 0, i8);
                        this.V += i8;
                        short s = (short) ((this.b0 / 2) + 1);
                        int i9 = (s * 6) + 2;
                        ByteBuffer byteBuffer = this.q;
                        if (byteBuffer == null || byteBuffer.capacity() < i9) {
                            this.q = ByteBuffer.allocate(i9);
                        }
                        this.q.position(0);
                        this.q.putShort(s);
                        int i10 = 0;
                        int i11 = 0;
                        while (true) {
                            i3 = this.b0;
                            if (i10 >= i3) {
                                break;
                            }
                            int z5 = d7kVar2.z();
                            int i12 = i10 % 2;
                            int i13 = i7;
                            ByteBuffer byteBuffer2 = this.q;
                            if (i12 == 0) {
                                byteBuffer2.putShort((short) (z5 - i11));
                            } else {
                                byteBuffer2.putInt(z5 - i11);
                            }
                            i10++;
                            i11 = z5;
                            i7 = i13;
                        }
                        i2 = i7;
                        int i14 = (i - this.V) - i11;
                        int i15 = i3 % 2;
                        ByteBuffer byteBuffer3 = this.q;
                        if (i15 == 1) {
                            byteBuffer3.putInt(i14);
                        } else {
                            byteBuffer3.putShort((short) i14);
                            this.q.putInt(0);
                        }
                        byte[] array = this.q.array();
                        d7k d7kVar4 = this.o;
                        d7kVar4.F(i9, array);
                        azsVar.b(d7kVar4, i9, 1);
                        this.W += i9;
                    }
                }
                i2 = 2;
            } else {
                i2 = 2;
                byte[] bArr = qehVar.j;
                if (bArr != null) {
                    d7kVar.F(bArr.length, bArr);
                }
            }
            if ("A_OPUS".equals(qehVar.c) ? z : qehVar.g > 0) {
                this.R |= 268435456;
                this.p.E(0);
                int i16 = (d7kVar.c + i) - this.V;
                d7kVar2.E(4);
                byte[] bArr2 = d7kVar2.a;
                bArr2[0] = (byte) ((i16 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
                bArr2[1] = (byte) ((i16 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
                bArr2[i2] = (byte) ((i16 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                bArr2[3] = (byte) (i16 & KotlinVersion.MAX_COMPONENT_VALUE);
                azsVar.b(d7kVar2, 4, i2);
                this.W += 4;
            }
            this.Y = true;
        }
        int i17 = i + d7kVar.c;
        if (!"V_MPEG4/ISO/AVC".equals(qehVar.c) && !"V_MPEGH/ISO/HEVC".equals(qehVar.c)) {
            if (qehVar.V != null) {
                vq1.A(d7kVar.c == 0);
                qehVar.V.c(s2cVar);
            }
            while (true) {
                int i18 = this.V;
                if (i18 >= i17) {
                    break;
                }
                int i19 = i17 - i18;
                int a = d7kVar.a();
                if (a > 0) {
                    c2 = Math.min(i19, a);
                    azsVar.b(d7kVar, c2, 0);
                } else {
                    c2 = azsVar.c(s2cVar, i19, false);
                }
                this.V += c2;
                this.W += c2;
            }
        } else {
            d7k d7kVar5 = this.h;
            byte[] bArr3 = d7kVar5.a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i20 = qehVar.a0;
            int i21 = 4 - i20;
            while (this.V < i17) {
                int i22 = this.X;
                if (i22 == 0) {
                    int min = Math.min(i20, d7kVar.a());
                    s2cVar.readFully(bArr3, i21 + min, i20 - min);
                    if (min > 0) {
                        d7kVar.f(bArr3, i21, min);
                    }
                    this.V += i20;
                    d7kVar5.H(0);
                    this.X = d7kVar5.z();
                    d7k d7kVar6 = this.g;
                    d7kVar6.H(0);
                    azsVar.b(d7kVar6, 4, 0);
                    this.W += 4;
                } else {
                    int a2 = d7kVar.a();
                    if (a2 > 0) {
                        c = Math.min(i22, a2);
                        azsVar.b(d7kVar, c, 0);
                    } else {
                        c = azsVar.c(s2cVar, i22, false);
                    }
                    this.V += c;
                    this.W += c;
                    this.X -= c;
                }
            }
        }
        if ("A_VORBIS".equals(qehVar.c)) {
            d7k d7kVar7 = this.j;
            d7kVar7.H(0);
            azsVar.b(d7kVar7, 4, 0);
            this.W += 4;
        }
        int i23 = this.W;
        k();
        return i23;
    }

    public final void o(s2c s2cVar, byte[] bArr, int i) {
        int length = bArr.length + i;
        d7k d7kVar = this.m;
        byte[] bArr2 = d7kVar.a;
        if (bArr2.length < length) {
            byte[] copyOf = Arrays.copyOf(bArr, length + i);
            d7kVar.getClass();
            d7kVar.F(copyOf.length, copyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        s2cVar.readFully(d7kVar.a, bArr.length, i);
        d7kVar.H(0);
        d7kVar.G(length);
    }

    @Override // defpackage.r2c
    public final void a() {
    }
}
