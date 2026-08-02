package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.ParserException;
import androidx.media3.common.a;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.common.collect.ImmutableList;
import com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView;
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
import ru.CryptoPro.JCP.tools.HexString;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.CStructReader.BlobHeaderStructure;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.reprov.array.DerValue;
import ru.CryptoPro.ssl.Alerts;

/* loaded from: classes10.dex */
public class q810 implements b5p {
    public static final byte[] f0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, Alerts.alert_certificate_revoked, 48, 48, 48, BlobHeaderStructure.BLOB_VERSION, Alerts.alert_certificate_expired, Alerts.alert_certificate_expired, 62, BlobHeaderStructure.BLOB_VERSION, 48, 48, 58, 48, 48, 58, 48, 48, Alerts.alert_certificate_revoked, 48, 48, 48, 10};
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
    public nlz F;
    public nlz G;
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
    public final uah a;
    public boolean a0;
    public final w231 b;
    public int b0;
    public final SparseArray c;
    public byte c0;
    public final boolean d;
    public boolean d0;
    public final boolean e;
    public d5p e0;
    public final o2v0 f;
    public final ef90 g;
    public final ef90 h;
    public final ef90 i;
    public final ef90 j;
    public final ef90 k;
    public final ef90 l;
    public final ef90 m;
    public final ef90 n;
    public final ef90 o;
    public final ef90 p;
    public ByteBuffer q;
    public long r;
    public long s;
    public long t;
    public long u;
    public long v;
    public boolean w;
    public p810 x;
    public boolean y;
    public int z;

    static {
        int i = tw21.a;
        g0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        h0 = new byte[]{68, 105, 97, 108, Alerts.alert_certificate_unobtainable, 103, 117, 101, 58, BlobHeaderStructure.BLOB_VERSION, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, Alerts.alert_certificate_revoked, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, Alerts.alert_certificate_revoked};
        i0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, Alerts.alert_certificate_unknown, 48, 48, 48, BlobHeaderStructure.BLOB_VERSION, Alerts.alert_certificate_expired, Alerts.alert_certificate_expired, 62, BlobHeaderStructure.BLOB_VERSION, 48, 48, 58, 48, 48, 58, 48, 48, Alerts.alert_certificate_unknown, 48, 48, 48, 10};
        j0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        b64.B(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        b64.B(SubsamplingScaleImageView.ORIENTATION_180, hashMap, "htc_video_rotA-180", SubsamplingScaleImageView.ORIENTATION_270, "htc_video_rotA-270");
        k0 = Collections.unmodifiableMap(hashMap);
    }

    public q810(uah uahVar, int i, o2v0 o2v0Var) {
        this.s = -1L;
        this.t = -9223372036854775807L;
        this.u = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.C = -1L;
        this.D = -1L;
        this.E = -9223372036854775807L;
        this.a = uahVar;
        uahVar.d = new reu(27, this);
        this.f = o2v0Var;
        this.d = (i & 1) == 0;
        this.e = (i & 2) == 0;
        this.b = new w231();
        this.c = new SparseArray();
        this.i = new ef90(4);
        this.j = new ef90(ByteBuffer.allocate(4).putInt(-1).array());
        this.k = new ef90(4);
        this.g = new ef90(l150.a);
        this.h = new ef90(4);
        this.l = new ef90();
        this.m = new ef90();
        this.n = new ef90(8);
        this.o = new ef90();
        this.p = new ef90();
        this.O = new int[1];
    }

    public static byte[] i(long j, long j2, String str) {
        d6z.l(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - (i * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (i2 * 60000000);
        int i3 = (int) (j4 / 1000000);
        String format = String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (i3 * 1000000)) / j2)));
        int i4 = tw21.a;
        return format.getBytes(StandardCharsets.UTF_8);
    }

    @Override // defpackage.b5p
    public final void a(long j, long j2) {
        this.E = -9223372036854775807L;
        this.J = 0;
        uah uahVar = this.a;
        uahVar.e = 0;
        uahVar.b.clear();
        w231 w231Var = uahVar.c;
        w231Var.b = 0;
        w231Var.c = 0;
        w231 w231Var2 = this.b;
        w231Var2.b = 0;
        w231Var2.c = 0;
        k();
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.c;
            if (i >= sparseArray.size()) {
                return;
            }
            vf11 vf11Var = ((p810) sparseArray.valueAt(i)).V;
            if (vf11Var != null) {
                vf11Var.b = false;
                vf11Var.c = 0;
            }
            i++;
        }
    }

    public final void b(int i) {
        if (this.F == null || this.G == null) {
            throw ParserException.a(null, "Element " + i + " must be in a Cues");
        }
    }

    public final void c(int i) {
        if (this.x != null) {
            return;
        }
        throw ParserException.a(null, "Element " + i + " must be in a TrackEntry");
    }

    @Override // defpackage.b5p
    public final void e(d5p d5pVar) {
        if (this.e) {
            d5pVar = new kzo(d5pVar, this.f);
        }
        this.e0 = d5pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(p810 p810Var, long j, int i, int i2, int i3) {
        byte[] i4;
        int i5;
        int i6;
        vf11 vf11Var = p810Var.V;
        if (vf11Var != null) {
            vf11Var.b(p810Var.Z, j, i, i2, i3, p810Var.k);
        } else {
            if ("S_TEXT/UTF8".equals(p810Var.c) || "S_TEXT/ASS".equals(p810Var.c) || "S_TEXT/WEBVTT".equals(p810Var.c)) {
                if (this.N > 1) {
                    lk91.j("Skipping subtitle sample in laced block.");
                } else {
                    long j2 = this.L;
                    if (j2 == -9223372036854775807L) {
                        lk91.j("Skipping subtitle sample with no duration.");
                    } else {
                        String str = p810Var.c;
                        ef90 ef90Var = this.m;
                        byte[] bArr = ef90Var.a;
                        str.getClass();
                        switch (str) {
                            case "S_TEXT/ASS":
                                i4 = i(j2, 10000L, "%01d:%02d:%02d:%02d");
                                i5 = 21;
                                break;
                            case "S_TEXT/WEBVTT":
                                i4 = i(j2, 1000L, "%02d:%02d:%02d.%03d");
                                i5 = 25;
                                break;
                            case "S_TEXT/UTF8":
                                i4 = i(j2, 1000L, "%02d:%02d:%02d,%03d");
                                i5 = 19;
                                break;
                            default:
                                w511.q();
                                return;
                        }
                        System.arraycopy(i4, 0, bArr, i5, i4.length);
                        int i7 = ef90Var.b;
                        while (true) {
                            if (i7 < ef90Var.c) {
                                if (ef90Var.a[i7] == 0) {
                                    ef90Var.J(i7);
                                } else {
                                    i7++;
                                }
                            }
                        }
                        p810Var.Z.a(ef90Var, ef90Var.c, 0);
                        i6 = i2 + ef90Var.c;
                        if ((i & SelfTester_JCP.IMITA) != 0) {
                            int i8 = this.N;
                            ef90 ef90Var2 = this.p;
                            if (i8 > 1) {
                                ef90Var2.H(0);
                            } else {
                                int i9 = ef90Var2.c;
                                p810Var.Z.a(ef90Var2, i9, 2);
                                i6 += i9;
                            }
                        }
                        p810Var.Z.c(j, i, i6, i3, p810Var.k);
                    }
                }
            }
            i6 = i2;
            if ((i & SelfTester_JCP.IMITA) != 0) {
            }
            p810Var.Z.c(j, i, i6, i3, p810Var.k);
        }
        this.I = true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01ac, code lost:
    
        throw androidx.media3.common.ParserException.a(null, "Mandatory element SeekID or SeekPosition not found");
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x0899, code lost:
    
        if (r0.s() == r1.getLeastSignificantBits()) goto L517;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0bbd, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0f46, code lost:
    
        if (r5 == false) goto L850;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0f48, code lost:
    
        r1 = r0.getPosition();
        r3 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0f50, code lost:
    
        if (r3.B == false) goto L844;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0f65, code lost:
    
        if (r3.y == false) goto L903;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0f67, code lost:
    
        r6 = r3.D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0f6d, code lost:
    
        if (r6 == (-1)) goto L904;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0f6f, code lost:
    
        r39.a = r6;
        r3.D = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0f73, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0f7a, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0f52, code lost:
    
        r3.D = r1;
        r39.a = r3.C;
        r3.B = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0f5e, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0f74, code lost:
    
        r3 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:837:0x0f92, code lost:
    
        r3 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:838:0x0f93, code lost:
    
        if (r5 != false) goto L864;
     */
    /* JADX WARN: Code restructure failed: missing block: B:839:0x0f95, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:840:0x0f96, code lost:
    
        r1 = r3.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:841:0x0f9c, code lost:
    
        if (r0 >= r1.size()) goto L930;
     */
    /* JADX WARN: Code restructure failed: missing block: B:842:0x0f9e, code lost:
    
        r1 = (defpackage.p810) r1.valueAt(r0);
        r1.Z.getClass();
        r2 = r1.V;
     */
    /* JADX WARN: Code restructure failed: missing block: B:843:0x0fab, code lost:
    
        if (r2 == null) goto L932;
     */
    /* JADX WARN: Code restructure failed: missing block: B:844:0x0fad, code lost:
    
        r2.a(r1.Z, r1.k);
     */
    /* JADX WARN: Code restructure failed: missing block: B:846:0x0fb4, code lost:
    
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:849:0x0fb7, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:850:0x0fba, code lost:
    
        return 0;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:136:0x08df  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x08f6  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0909  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0add  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0af1  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0af4  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0916  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x08f8  */
    /* JADX WARN: Type inference failed for: r3v45, types: [java.lang.Object, p810] */
    /* JADX WARN: Type inference failed for: r3v49 */
    /* JADX WARN: Type inference failed for: r3v50, types: [java.lang.RuntimeException] */
    @Override // defpackage.b5p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int g(c5p c5pVar, xde0 xde0Var) {
        c5p c5pVar2;
        boolean z;
        int i;
        boolean z2;
        String str;
        long j;
        int i2;
        int a;
        q810 q810Var;
        boolean z3;
        char c;
        char c2;
        q810 q810Var2;
        List singletonList;
        int F;
        int i3;
        List list;
        q810 q810Var3;
        RuntimeException runtimeException;
        Pair pair;
        String str2;
        List list2;
        q810 q810Var4;
        String str3;
        q810 q810Var5;
        List list3;
        q810 q810Var6;
        List r;
        q810 q810Var7;
        List list4;
        List list5;
        f7s f7sVar;
        boolean l;
        int i4;
        int i5;
        kfc kfcVar;
        int i6;
        byte[] bArr;
        int i7;
        String str4;
        mf1 n;
        f7q0 qb4Var;
        int i8;
        q810 q810Var8 = this;
        q810Var8.I = false;
        boolean z4 = true;
        while (true) {
            int i9 = -1;
            if (z4 && !q810Var8.I) {
                uah uahVar = q810Var8.a;
                w231 w231Var = uahVar.c;
                ArrayDeque arrayDeque = uahVar.b;
                d6z.z(uahVar.d);
                while (true) {
                    tah tahVar = (tah) arrayDeque.peek();
                    if (tahVar == null || c5pVar.getPosition() < tahVar.b) {
                        int i10 = 0;
                        if (uahVar.e == 0) {
                            c5pVar2 = c5pVar;
                            int i11 = 4;
                            long b = w231Var.b(c5pVar2, true, false, 4);
                            if (b == -2) {
                                byte[] bArr2 = uahVar.a;
                                c5pVar2.J();
                                while (true) {
                                    c5pVar2.g(i10, i11, bArr2);
                                    byte b2 = bArr2[i10];
                                    int i12 = 0;
                                    while (true) {
                                        if (i12 >= 8) {
                                            i2 = -1;
                                        } else if ((w231.d[i12] & b2) != 0) {
                                            i2 = i12 + 1;
                                        } else {
                                            i12++;
                                        }
                                    }
                                    if (i2 != -1 && i2 <= 4) {
                                        a = (int) w231.a(i2, bArr2, false);
                                        Object obj = uahVar.d.b;
                                        if (a == 357149030 || a == 524531317 || a == 475249515 || a == 374648427) {
                                        }
                                    }
                                    c5pVar2.O(1);
                                    i10 = 0;
                                    i11 = 4;
                                }
                                c5pVar2.O(i2);
                                j = a;
                            } else {
                                j = b;
                            }
                            z = true;
                            if (j == -1) {
                                z4 = false;
                                z2 = false;
                            } else {
                                uahVar.f = (int) j;
                                uahVar.e = 1;
                            }
                        } else {
                            c5pVar2 = c5pVar;
                            z = true;
                        }
                        if (uahVar.e == z) {
                            uahVar.g = w231Var.b(c5pVar2, false, z, 8);
                            uahVar.e = 2;
                        }
                        reu reuVar = uahVar.d;
                        int i13 = uahVar.f;
                        Object obj2 = reuVar.b;
                        switch (i13) {
                            case HProv.PP_FAST_CODE /* 131 */:
                            case HProv.PP_LCD_QUERY /* 136 */:
                            case ModuleDescriptor.MODULE_VERSION /* 155 */:
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
                            case HProv.PP_CONTAINER_EXTENSION_DEL /* 134 */:
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
                            case HProv.PP_HANDLE_COUNT /* 163 */:
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
                            c5pVar2.O((int) uahVar.g);
                            uahVar.e = 0;
                            i9 = -1;
                        } else if (i == 1) {
                            long position = c5pVar2.getPosition();
                            arrayDeque.push(new tah(uahVar.f, uahVar.g + position));
                            reu reuVar2 = uahVar.d;
                            int i14 = uahVar.f;
                            long j2 = uahVar.g;
                            q810 q810Var9 = (q810) reuVar2.b;
                            d6z.z(q810Var9.e0);
                            if (i14 != 160) {
                                if (i14 == 174) {
                                    p810 p810Var = new p810();
                                    p810Var.n = -1;
                                    p810Var.o = -1;
                                    p810Var.p = -1;
                                    p810Var.q = -1;
                                    p810Var.r = -1;
                                    p810Var.s = 0;
                                    p810Var.t = -1;
                                    p810Var.u = 0.0f;
                                    p810Var.v = 0.0f;
                                    p810Var.w = 0.0f;
                                    p810Var.x = null;
                                    p810Var.y = -1;
                                    p810Var.z = false;
                                    p810Var.A = -1;
                                    p810Var.B = -1;
                                    p810Var.C = -1;
                                    p810Var.D = 1000;
                                    p810Var.E = 200;
                                    p810Var.F = -1.0f;
                                    p810Var.G = -1.0f;
                                    p810Var.H = -1.0f;
                                    p810Var.I = -1.0f;
                                    p810Var.J = -1.0f;
                                    p810Var.K = -1.0f;
                                    p810Var.L = -1.0f;
                                    p810Var.M = -1.0f;
                                    p810Var.N = -1.0f;
                                    p810Var.O = -1.0f;
                                    p810Var.Q = 1;
                                    p810Var.R = -1;
                                    p810Var.S = 8000;
                                    p810Var.T = 0L;
                                    p810Var.U = 0L;
                                    p810Var.X = true;
                                    p810Var.Y = "eng";
                                    q810Var9.x = p810Var;
                                    p810Var.a = q810Var9.w;
                                } else if (i14 == 187) {
                                    z2 = false;
                                    q810Var9.H = false;
                                } else if (i14 == 19899) {
                                    q810Var9.z = -1;
                                    q810Var9.A = -1L;
                                } else if (i14 == 20533) {
                                    q810Var9.c(i14);
                                    q810Var9.x.i = true;
                                } else if (i14 == 21968) {
                                    q810Var9.c(i14);
                                    q810Var9.x.z = true;
                                } else if (i14 == 408125543) {
                                    long j3 = q810Var9.s;
                                    if (j3 != -1 && j3 != position) {
                                        throw ParserException.a(null, "Multiple Segment elements not supported");
                                    }
                                    q810Var9.s = position;
                                    q810Var9.r = j2;
                                } else if (i14 == 475249515) {
                                    q810Var9.F = new nlz();
                                    q810Var9.G = new nlz();
                                } else if (i14 == 524531317 && !q810Var9.y) {
                                    if (!q810Var9.d || q810Var9.C == -1) {
                                        q810Var9.e0.w(new qb4(q810Var9.v));
                                        q810Var9.y = true;
                                    } else {
                                        q810Var9.B = true;
                                    }
                                }
                                z2 = false;
                            } else {
                                z2 = false;
                                q810Var9.T = false;
                                q810Var9.U = 0L;
                            }
                            uahVar.e = z2 ? 1 : 0;
                        } else if (i == 2) {
                            long j4 = uahVar.g;
                            if (j4 > 8) {
                                throw ParserException.a(null, "Invalid integer size: " + uahVar.g);
                            }
                            reuVar.B(i13, uahVar.a(c5pVar2, (int) j4));
                            z2 = false;
                            uahVar.e = 0;
                        } else if (i == 3) {
                            long j5 = uahVar.g;
                            if (j5 > 2147483647L) {
                                throw ParserException.a(null, "String element size: " + uahVar.g);
                            }
                            int i15 = (int) j5;
                            if (i15 == 0) {
                                str = "";
                            } else {
                                byte[] bArr3 = new byte[i15];
                                c5pVar2.readFully(bArr3, 0, i15);
                                while (i15 > 0 && bArr3[i15 - 1] == 0) {
                                    i15--;
                                }
                                str = new String(bArr3, 0, i15);
                            }
                            q810 q810Var10 = (q810) reuVar.b;
                            if (i13 == 134) {
                                q810Var10.c(i13);
                                q810Var10.x.c = str;
                            } else if (i13 == 17026) {
                                if (!"webm".equals(str) && !"matroska".equals(str)) {
                                    throw ParserException.a(null, "DocType " + str + " not supported");
                                }
                                q810Var10.w = str.equals("webm");
                            } else if (i13 == 21358) {
                                q810Var10.c(i13);
                                q810Var10.x.b = str;
                            } else if (i13 == 2274716) {
                                q810Var10.c(i13);
                                q810Var10.x.Y = str;
                            }
                            z2 = false;
                            uahVar.e = 0;
                        } else if (i == 4) {
                            reuVar.z(i13, (int) uahVar.g, c5pVar2);
                            z2 = false;
                            uahVar.e = 0;
                        } else {
                            if (i != 5) {
                                throw ParserException.a(null, "Invalid element type " + i);
                            }
                            long j6 = uahVar.g;
                            if (j6 != 4 && j6 != 8) {
                                throw ParserException.a(null, "Invalid float size: " + uahVar.g);
                            }
                            int i16 = (int) j6;
                            double intBitsToFloat = i16 == 4 ? Float.intBitsToFloat((int) r5) : Double.longBitsToDouble(uahVar.a(c5pVar2, i16));
                            q810 q810Var11 = (q810) reuVar.b;
                            if (i13 == 181) {
                                q810Var11.c(i13);
                                q810Var11.x.S = (int) intBitsToFloat;
                            } else if (i13 != 17545) {
                                switch (i13) {
                                    case 21969:
                                        q810Var11.c(i13);
                                        q810Var11.x.F = (float) intBitsToFloat;
                                        break;
                                    case 21970:
                                        q810Var11.c(i13);
                                        q810Var11.x.G = (float) intBitsToFloat;
                                        break;
                                    case 21971:
                                        q810Var11.c(i13);
                                        q810Var11.x.H = (float) intBitsToFloat;
                                        break;
                                    case 21972:
                                        q810Var11.c(i13);
                                        q810Var11.x.I = (float) intBitsToFloat;
                                        break;
                                    case 21973:
                                        q810Var11.c(i13);
                                        q810Var11.x.J = (float) intBitsToFloat;
                                        break;
                                    case 21974:
                                        q810Var11.c(i13);
                                        q810Var11.x.K = (float) intBitsToFloat;
                                        break;
                                    case 21975:
                                        q810Var11.c(i13);
                                        q810Var11.x.L = (float) intBitsToFloat;
                                        break;
                                    case 21976:
                                        q810Var11.c(i13);
                                        q810Var11.x.M = (float) intBitsToFloat;
                                        break;
                                    case 21977:
                                        q810Var11.c(i13);
                                        q810Var11.x.N = (float) intBitsToFloat;
                                        break;
                                    case 21978:
                                        q810Var11.c(i13);
                                        q810Var11.x.O = (float) intBitsToFloat;
                                        break;
                                    default:
                                        switch (i13) {
                                            case 30323:
                                                q810Var11.c(i13);
                                                q810Var11.x.u = (float) intBitsToFloat;
                                                break;
                                            case 30324:
                                                q810Var11.c(i13);
                                                q810Var11.x.v = (float) intBitsToFloat;
                                                break;
                                            case 30325:
                                                q810Var11.c(i13);
                                                q810Var11.x.w = (float) intBitsToFloat;
                                                break;
                                        }
                                }
                            } else {
                                q810Var11.u = (long) intBitsToFloat;
                            }
                            z2 = false;
                            uahVar.e = 0;
                        }
                    } else {
                        reu reuVar3 = uahVar.d;
                        int i17 = ((tah) arrayDeque.pop()).a;
                        q810 q810Var12 = (q810) reuVar3.b;
                        SparseArray sparseArray = q810Var12.c;
                        d6z.z(q810Var12.e0);
                        if (i17 != 160) {
                            if (i17 == 174) {
                                ?? r3 = q810Var12.x;
                                d6z.z(r3);
                                String str5 = r3.c;
                                if (str5 == null) {
                                    throw ParserException.a(null, "CodecId is missing in TrackEntry element");
                                }
                                switch (str5.hashCode()) {
                                    case -2095576542:
                                        if (str5.equals("V_MPEG4/ISO/AP")) {
                                            c = 0;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -2095575984:
                                        if (str5.equals("V_MPEG4/ISO/SP")) {
                                            c = 1;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1985379776:
                                        if (str5.equals("A_MS/ACM")) {
                                            c = 2;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1784763192:
                                        if (str5.equals("A_TRUEHD")) {
                                            c = 3;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1730367663:
                                        if (str5.equals("A_VORBIS")) {
                                            c = 4;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1482641358:
                                        if (str5.equals("A_MPEG/L2")) {
                                            c = 5;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1482641357:
                                        if (str5.equals("A_MPEG/L3")) {
                                            c = 6;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1373388978:
                                        if (str5.equals("V_MS/VFW/FOURCC")) {
                                            c = 7;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -933872740:
                                        if (str5.equals("S_DVBSUB")) {
                                            c = '\b';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -538363189:
                                        if (str5.equals("V_MPEG4/ISO/ASP")) {
                                            c = '\t';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -538363109:
                                        if (str5.equals("V_MPEG4/ISO/AVC")) {
                                            c = '\n';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -425012669:
                                        if (str5.equals("S_VOBSUB")) {
                                            c = 11;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -356037306:
                                        if (str5.equals("A_DTS/LOSSLESS")) {
                                            c = '\f';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 62923557:
                                        if (str5.equals("A_AAC")) {
                                            c = HexString.LF;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 62923603:
                                        if (str5.equals("A_AC3")) {
                                            c = 14;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 62927045:
                                        if (str5.equals("A_DTS")) {
                                            c = 15;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 82318131:
                                        if (str5.equals("V_AV1")) {
                                            c = 16;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 82338133:
                                        if (str5.equals("V_VP8")) {
                                            c = 17;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 82338134:
                                        if (str5.equals("V_VP9")) {
                                            c = 18;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 99146302:
                                        if (str5.equals("S_HDMV/PGS")) {
                                            c = 19;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 444813526:
                                        if (str5.equals("V_THEORA")) {
                                            c = 20;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 542569478:
                                        if (str5.equals("A_DTS/EXPRESS")) {
                                            c = 21;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 635596514:
                                        if (str5.equals("A_PCM/FLOAT/IEEE")) {
                                            c = 22;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 725948237:
                                        if (str5.equals("A_PCM/INT/BIG")) {
                                            c = 23;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 725957860:
                                        if (str5.equals("A_PCM/INT/LIT")) {
                                            c = 24;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 738597099:
                                        if (str5.equals("S_TEXT/ASS")) {
                                            c = 25;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 855502857:
                                        if (str5.equals("V_MPEGH/ISO/HEVC")) {
                                            c = 26;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1045209816:
                                        if (str5.equals("S_TEXT/WEBVTT")) {
                                            c = 27;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1422270023:
                                        if (str5.equals("S_TEXT/UTF8")) {
                                            c = 28;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1809237540:
                                        if (str5.equals("V_MPEG2")) {
                                            c = 29;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1950749482:
                                        if (str5.equals("A_EAC3")) {
                                            c = 30;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1950789798:
                                        if (str5.equals("A_FLAC")) {
                                            c = 31;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1951062397:
                                        if (str5.equals("A_OPUS")) {
                                            c = HexString.CHAR_SPACE;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    default:
                                        c = 65535;
                                        break;
                                }
                                switch (c) {
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case '\b':
                                    case '\t':
                                    case '\n':
                                    case 11:
                                    case '\f':
                                    case '\r':
                                    case 14:
                                    case 15:
                                    case 16:
                                    case 17:
                                    case 18:
                                    case 19:
                                    case 20:
                                    case 21:
                                    case 22:
                                    case 23:
                                    case 24:
                                    case 25:
                                    case 26:
                                    case 27:
                                    case 28:
                                    case 29:
                                    case 30:
                                    case 31:
                                    case ' ':
                                        d5p d5pVar = q810Var12.e0;
                                        int i18 = r3.d;
                                        switch (str5.hashCode()) {
                                            case -2095576542:
                                                if (str5.equals("V_MPEG4/ISO/AP")) {
                                                    c2 = 0;
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            case -2095575984:
                                                if (str5.equals("V_MPEG4/ISO/SP")) {
                                                    c2 = 1;
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            case -1985379776:
                                                if (str5.equals("A_MS/ACM")) {
                                                    c2 = 2;
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            case -1784763192:
                                                if (str5.equals("A_TRUEHD")) {
                                                    c2 = 3;
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            case -1730367663:
                                                if (str5.equals("A_VORBIS")) {
                                                    c2 = 4;
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            case -1482641358:
                                                if (str5.equals("A_MPEG/L2")) {
                                                    c2 = 5;
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            case -1482641357:
                                                if (str5.equals("A_MPEG/L3")) {
                                                    c2 = 6;
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            case -1373388978:
                                                if (str5.equals("V_MS/VFW/FOURCC")) {
                                                    c2 = 7;
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            case -933872740:
                                                if (str5.equals("S_DVBSUB")) {
                                                    c2 = '\b';
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            case -538363189:
                                                if (str5.equals("V_MPEG4/ISO/ASP")) {
                                                    c2 = '\t';
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            case -538363109:
                                                if (str5.equals("V_MPEG4/ISO/AVC")) {
                                                    c2 = '\n';
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            case -425012669:
                                                if (str5.equals("S_VOBSUB")) {
                                                    c2 = 11;
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            case -356037306:
                                                if (str5.equals("A_DTS/LOSSLESS")) {
                                                    c2 = '\f';
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            case 62923557:
                                                if (str5.equals("A_AAC")) {
                                                    c2 = HexString.LF;
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            case 62923603:
                                                if (str5.equals("A_AC3")) {
                                                    c2 = 14;
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            case 62927045:
                                                if (str5.equals("A_DTS")) {
                                                    c2 = 15;
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            case 82318131:
                                                if (str5.equals("V_AV1")) {
                                                    c2 = 16;
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            case 82338133:
                                                if (str5.equals("V_VP8")) {
                                                    c2 = 17;
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            case 82338134:
                                                if (str5.equals("V_VP9")) {
                                                    c2 = 18;
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            case 99146302:
                                                if (str5.equals("S_HDMV/PGS")) {
                                                    c2 = 19;
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            case 444813526:
                                                if (str5.equals("V_THEORA")) {
                                                    c2 = 20;
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            case 542569478:
                                                if (str5.equals("A_DTS/EXPRESS")) {
                                                    c2 = 21;
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            case 635596514:
                                                if (str5.equals("A_PCM/FLOAT/IEEE")) {
                                                    c2 = 22;
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            case 725948237:
                                                if (str5.equals("A_PCM/INT/BIG")) {
                                                    c2 = 23;
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            case 725957860:
                                                if (str5.equals("A_PCM/INT/LIT")) {
                                                    c2 = 24;
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            case 738597099:
                                                if (str5.equals("S_TEXT/ASS")) {
                                                    c2 = 25;
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            case 855502857:
                                                if (str5.equals("V_MPEGH/ISO/HEVC")) {
                                                    c2 = 26;
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            case 1045209816:
                                                if (str5.equals("S_TEXT/WEBVTT")) {
                                                    c2 = 27;
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            case 1422270023:
                                                if (str5.equals("S_TEXT/UTF8")) {
                                                    c2 = 28;
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            case 1809237540:
                                                if (str5.equals("V_MPEG2")) {
                                                    c2 = 29;
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            case 1950749482:
                                                if (str5.equals("A_EAC3")) {
                                                    c2 = 30;
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            case 1950789798:
                                                if (str5.equals("A_FLAC")) {
                                                    c2 = 31;
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            case 1951062397:
                                                if (str5.equals("A_OPUS")) {
                                                    c2 = HexString.CHAR_SPACE;
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            default:
                                                c2 = 65535;
                                                break;
                                        }
                                        String str6 = "video/x-unknown";
                                        switch (c2) {
                                            case 0:
                                            case 1:
                                            case '\t':
                                                q810Var2 = q810Var12;
                                                byte[] bArr4 = r3.l;
                                                str6 = "video/mp4v-es";
                                                singletonList = bArr4 == null ? null : Collections.singletonList(bArr4);
                                                F = -1;
                                                i3 = -1;
                                                list = singletonList;
                                                str2 = null;
                                                list5 = list;
                                                if (r3.P != null && (n = mf1.n(new ef90(r3.P))) != null) {
                                                    str2 = n.b;
                                                    str6 = "video/dolby-vision";
                                                }
                                                int i19 = (r3.X ? 1 : 0) | (r3.W ? 2 : 0);
                                                f7sVar = new f7s();
                                                l = eh20.l(str6);
                                                Map map = k0;
                                                if (l) {
                                                    f7sVar.C = r3.Q;
                                                    f7sVar.D = r3.S;
                                                    f7sVar.E = F;
                                                    i4 = 1;
                                                } else if (eh20.p(str6)) {
                                                    if (r3.s == 0) {
                                                        int i20 = r3.q;
                                                        i5 = -1;
                                                        if (i20 == -1) {
                                                            i20 = r3.n;
                                                        }
                                                        r3.q = i20;
                                                        int i21 = r3.r;
                                                        if (i21 == -1) {
                                                            i21 = r3.o;
                                                        }
                                                        r3.r = i21;
                                                    } else {
                                                        i5 = -1;
                                                    }
                                                    float f = (r3.q == i5 || (i7 = r3.r) == i5) ? -1.0f : (r3.o * r0) / (r3.n * i7);
                                                    if (r3.z) {
                                                        if (r3.F == -1.0f || r3.G == -1.0f || r3.H == -1.0f || r3.I == -1.0f || r3.J == -1.0f || r3.K == -1.0f || r3.L == -1.0f || r3.M == -1.0f || r3.N == -1.0f || r3.O == -1.0f) {
                                                            bArr = null;
                                                        } else {
                                                            bArr = new byte[25];
                                                            ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                                            order.put((byte) 0);
                                                            order.putShort((short) ((r3.F * 50000.0f) + 0.5f));
                                                            order.putShort((short) ((r3.G * 50000.0f) + 0.5f));
                                                            order.putShort((short) ((r3.H * 50000.0f) + 0.5f));
                                                            order.putShort((short) ((r3.I * 50000.0f) + 0.5f));
                                                            order.putShort((short) ((r3.J * 50000.0f) + 0.5f));
                                                            order.putShort((short) ((r3.K * 50000.0f) + 0.5f));
                                                            order.putShort((short) ((r3.L * 50000.0f) + 0.5f));
                                                            order.putShort((short) ((r3.M * 50000.0f) + 0.5f));
                                                            order.putShort((short) (r3.N + 0.5f));
                                                            order.putShort((short) (r3.O + 0.5f));
                                                            order.putShort((short) r3.D);
                                                            order.putShort((short) r3.E);
                                                        }
                                                        jfc jfcVar = new jfc();
                                                        jfcVar.a = r3.A;
                                                        jfcVar.b = r3.C;
                                                        jfcVar.c = r3.B;
                                                        jfcVar.d = bArr;
                                                        int i22 = r3.p;
                                                        jfcVar.e = i22;
                                                        jfcVar.f = i22;
                                                        kfcVar = jfcVar.a();
                                                    } else {
                                                        kfcVar = null;
                                                    }
                                                    String str7 = r3.b;
                                                    int intValue = (str7 == null || !map.containsKey(str7)) ? -1 : ((Integer) map.get(r3.b)).intValue();
                                                    if (r3.t == 0 && Float.compare(r3.u, 0.0f) == 0 && Float.compare(r3.v, 0.0f) == 0) {
                                                        if (Float.compare(r3.w, 0.0f) == 0) {
                                                            i6 = 0;
                                                        } else if (Float.compare(r3.w, 90.0f) == 0) {
                                                            i6 = 90;
                                                        } else if (Float.compare(r3.w, -180.0f) == 0 || Float.compare(r3.w, 180.0f) == 0) {
                                                            i6 = SubsamplingScaleImageView.ORIENTATION_180;
                                                        } else if (Float.compare(r3.w, -90.0f) == 0) {
                                                            i6 = SubsamplingScaleImageView.ORIENTATION_270;
                                                        }
                                                        f7sVar.t = r3.n;
                                                        f7sVar.u = r3.o;
                                                        f7sVar.x = f;
                                                        f7sVar.w = i6;
                                                        f7sVar.y = r3.x;
                                                        f7sVar.z = r3.y;
                                                        f7sVar.A = kfcVar;
                                                        i4 = 2;
                                                    }
                                                    i6 = intValue;
                                                    f7sVar.t = r3.n;
                                                    f7sVar.u = r3.o;
                                                    f7sVar.x = f;
                                                    f7sVar.w = i6;
                                                    f7sVar.y = r3.x;
                                                    f7sVar.z = r3.y;
                                                    f7sVar.A = kfcVar;
                                                    i4 = 2;
                                                } else {
                                                    if (!"application/x-subrip".equals(str6) && !"text/x-ssa".equals(str6) && !"text/vtt".equals(str6) && !"application/vobsub".equals(str6) && !"application/pgs".equals(str6) && !"application/dvbsubs".equals(str6)) {
                                                        throw ParserException.a(null, "Unexpected MIME type.");
                                                    }
                                                    i4 = 3;
                                                }
                                                str4 = r3.b;
                                                if (str4 != null && !map.containsKey(str4)) {
                                                    f7sVar.b = r3.b;
                                                }
                                                f7sVar.a = Integer.toString(i18);
                                                f7sVar.l = eh20.q(r3.a ? "video/webm" : "video/x-matroska");
                                                f7sVar.m = eh20.q(str6);
                                                f7sVar.n = i3;
                                                f7sVar.d = r3.Y;
                                                f7sVar.e = i19;
                                                f7sVar.p = list5;
                                                f7sVar.j = str2;
                                                f7sVar.q = r3.m;
                                                a aVar = new a(f7sVar);
                                                g001 B = d5pVar.B(r3.d, i4);
                                                r3.Z = B;
                                                B.d(aVar);
                                                sparseArray.put(r3.d, r3);
                                                q810Var12 = q810Var2;
                                                break;
                                            case 2:
                                                q810Var2 = q810Var12;
                                                ef90 ef90Var = new ef90(r3.a(r3.c));
                                                try {
                                                    int r2 = ef90Var.r();
                                                    if (r2 != 1) {
                                                        if (r2 == 65534) {
                                                            ef90Var.K(24);
                                                            long s = ef90Var.s();
                                                            UUID uuid = j0;
                                                            if (s == uuid.getMostSignificantBits()) {
                                                                break;
                                                            }
                                                        }
                                                        lk91.j("Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                                                        str6 = "audio/x-unknown";
                                                        F = -1;
                                                        i3 = -1;
                                                        list = null;
                                                        str2 = null;
                                                        list5 = list;
                                                        if (r3.P != null) {
                                                            str2 = n.b;
                                                            str6 = "video/dolby-vision";
                                                            break;
                                                        }
                                                        int i192 = (r3.X ? 1 : 0) | (r3.W ? 2 : 0);
                                                        f7sVar = new f7s();
                                                        l = eh20.l(str6);
                                                        Map map2 = k0;
                                                        if (l) {
                                                        }
                                                        str4 = r3.b;
                                                        if (str4 != null) {
                                                            f7sVar.b = r3.b;
                                                            break;
                                                        }
                                                        f7sVar.a = Integer.toString(i18);
                                                        f7sVar.l = eh20.q(r3.a ? "video/webm" : "video/x-matroska");
                                                        f7sVar.m = eh20.q(str6);
                                                        f7sVar.n = i3;
                                                        f7sVar.d = r3.Y;
                                                        f7sVar.e = i192;
                                                        f7sVar.p = list5;
                                                        f7sVar.j = str2;
                                                        f7sVar.q = r3.m;
                                                        a aVar2 = new a(f7sVar);
                                                        g001 B2 = d5pVar.B(r3.d, i4);
                                                        r3.Z = B2;
                                                        B2.d(aVar2);
                                                        sparseArray.put(r3.d, r3);
                                                        q810Var12 = q810Var2;
                                                    }
                                                    F = tw21.F(r3.R);
                                                    if (F == 0) {
                                                        lk91.j("Unsupported PCM bit depth: " + r3.R + ". Setting mimeType to audio/x-unknown");
                                                        str6 = "audio/x-unknown";
                                                        F = -1;
                                                        i3 = -1;
                                                        list = null;
                                                        str2 = null;
                                                        list5 = list;
                                                        if (r3.P != null) {
                                                        }
                                                        int i1922 = (r3.X ? 1 : 0) | (r3.W ? 2 : 0);
                                                        f7sVar = new f7s();
                                                        l = eh20.l(str6);
                                                        Map map22 = k0;
                                                        if (l) {
                                                        }
                                                        str4 = r3.b;
                                                        if (str4 != null) {
                                                        }
                                                        f7sVar.a = Integer.toString(i18);
                                                        f7sVar.l = eh20.q(r3.a ? "video/webm" : "video/x-matroska");
                                                        f7sVar.m = eh20.q(str6);
                                                        f7sVar.n = i3;
                                                        f7sVar.d = r3.Y;
                                                        f7sVar.e = i1922;
                                                        f7sVar.p = list5;
                                                        f7sVar.j = str2;
                                                        f7sVar.q = r3.m;
                                                        a aVar22 = new a(f7sVar);
                                                        g001 B22 = d5pVar.B(r3.d, i4);
                                                        r3.Z = B22;
                                                        B22.d(aVar22);
                                                        sparseArray.put(r3.d, r3);
                                                        q810Var12 = q810Var2;
                                                    }
                                                    str6 = "audio/raw";
                                                    i3 = -1;
                                                    list = null;
                                                    str2 = null;
                                                    list5 = list;
                                                    if (r3.P != null) {
                                                    }
                                                    int i19222 = (r3.X ? 1 : 0) | (r3.W ? 2 : 0);
                                                    f7sVar = new f7s();
                                                    l = eh20.l(str6);
                                                    Map map222 = k0;
                                                    if (l) {
                                                    }
                                                    str4 = r3.b;
                                                    if (str4 != null) {
                                                    }
                                                    f7sVar.a = Integer.toString(i18);
                                                    f7sVar.l = eh20.q(r3.a ? "video/webm" : "video/x-matroska");
                                                    f7sVar.m = eh20.q(str6);
                                                    f7sVar.n = i3;
                                                    f7sVar.d = r3.Y;
                                                    f7sVar.e = i19222;
                                                    f7sVar.p = list5;
                                                    f7sVar.j = str2;
                                                    f7sVar.q = r3.m;
                                                    a aVar222 = new a(f7sVar);
                                                    g001 B222 = d5pVar.B(r3.d, i4);
                                                    r3.Z = B222;
                                                    B222.d(aVar222);
                                                    sparseArray.put(r3.d, r3);
                                                    q810Var12 = q810Var2;
                                                } catch (ArrayIndexOutOfBoundsException unused) {
                                                    throw ParserException.a(null, "Error parsing MS/ACM codec private");
                                                }
                                                break;
                                            case 3:
                                                q810Var2 = q810Var12;
                                                r3.V = new vf11();
                                                str6 = "audio/true-hd";
                                                F = -1;
                                                i3 = -1;
                                                list = null;
                                                str2 = null;
                                                list5 = list;
                                                if (r3.P != null) {
                                                }
                                                int i192222 = (r3.X ? 1 : 0) | (r3.W ? 2 : 0);
                                                f7sVar = new f7s();
                                                l = eh20.l(str6);
                                                Map map2222 = k0;
                                                if (l) {
                                                }
                                                str4 = r3.b;
                                                if (str4 != null) {
                                                }
                                                f7sVar.a = Integer.toString(i18);
                                                f7sVar.l = eh20.q(r3.a ? "video/webm" : "video/x-matroska");
                                                f7sVar.m = eh20.q(str6);
                                                f7sVar.n = i3;
                                                f7sVar.d = r3.Y;
                                                f7sVar.e = i192222;
                                                f7sVar.p = list5;
                                                f7sVar.j = str2;
                                                f7sVar.q = r3.m;
                                                a aVar2222 = new a(f7sVar);
                                                g001 B2222 = d5pVar.B(r3.d, i4);
                                                r3.Z = B2222;
                                                B2222.d(aVar2222);
                                                sparseArray.put(r3.d, r3);
                                                q810Var12 = q810Var2;
                                                break;
                                            case 4:
                                                byte[] a2 = r3.a(str5);
                                                try {
                                                    try {
                                                        if (a2[0] != 2) {
                                                            throw ParserException.a(null, "Error parsing vorbis codec private");
                                                        }
                                                        int i23 = 0;
                                                        int i24 = 1;
                                                        while (true) {
                                                            int i25 = a2[i24] & 255;
                                                            if (i25 == 255) {
                                                                i23 += 255;
                                                                i24++;
                                                            } else {
                                                                int i26 = i24 + 1;
                                                                int i27 = i23 + i25;
                                                                q810Var2 = q810Var12;
                                                                int i28 = 0;
                                                                while (true) {
                                                                    int i29 = a2[i26] & 255;
                                                                    if (i29 == 255) {
                                                                        i28 += 255;
                                                                        i26++;
                                                                    } else {
                                                                        int i30 = i26 + 1;
                                                                        int i31 = i28 + i29;
                                                                        if (a2[i30] != 1) {
                                                                            throw ParserException.a(null, "Error parsing vorbis codec private");
                                                                        }
                                                                        byte[] bArr5 = new byte[i27];
                                                                        System.arraycopy(a2, i30, bArr5, 0, i27);
                                                                        int i32 = i30 + i27;
                                                                        if (a2[i32] != 3) {
                                                                            throw ParserException.a(null, "Error parsing vorbis codec private");
                                                                        }
                                                                        int i33 = i32 + i31;
                                                                        if (a2[i33] != 5) {
                                                                            throw ParserException.a(null, "Error parsing vorbis codec private");
                                                                        }
                                                                        byte[] bArr6 = new byte[a2.length - i33];
                                                                        System.arraycopy(a2, i33, bArr6, 0, a2.length - i33);
                                                                        ArrayList arrayList = new ArrayList(2);
                                                                        arrayList.add(bArr5);
                                                                        arrayList.add(bArr6);
                                                                        str6 = "audio/vorbis";
                                                                        i3 = 8192;
                                                                        list = arrayList;
                                                                        F = -1;
                                                                        str2 = null;
                                                                        list5 = list;
                                                                        if (r3.P != null) {
                                                                        }
                                                                        int i1922222 = (r3.X ? 1 : 0) | (r3.W ? 2 : 0);
                                                                        f7sVar = new f7s();
                                                                        l = eh20.l(str6);
                                                                        Map map22222 = k0;
                                                                        if (l) {
                                                                        }
                                                                        str4 = r3.b;
                                                                        if (str4 != null) {
                                                                        }
                                                                        f7sVar.a = Integer.toString(i18);
                                                                        f7sVar.l = eh20.q(r3.a ? "video/webm" : "video/x-matroska");
                                                                        f7sVar.m = eh20.q(str6);
                                                                        f7sVar.n = i3;
                                                                        f7sVar.d = r3.Y;
                                                                        f7sVar.e = i1922222;
                                                                        f7sVar.p = list5;
                                                                        f7sVar.j = str2;
                                                                        f7sVar.q = r3.m;
                                                                        a aVar22222 = new a(f7sVar);
                                                                        g001 B22222 = d5pVar.B(r3.d, i4);
                                                                        r3.Z = B22222;
                                                                        B22222.d(aVar22222);
                                                                        sparseArray.put(r3.d, r3);
                                                                        q810Var12 = q810Var2;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } catch (ArrayIndexOutOfBoundsException unused2) {
                                                        throw ParserException.a(r3, "Error parsing vorbis codec private");
                                                    }
                                                } catch (ArrayIndexOutOfBoundsException unused3) {
                                                    r3 = 0;
                                                }
                                                break;
                                            case 5:
                                                q810Var3 = q810Var12;
                                                str6 = "audio/mpeg-L2";
                                                q810Var2 = q810Var3;
                                                F = -1;
                                                i3 = 4096;
                                                list = null;
                                                str2 = null;
                                                list5 = list;
                                                if (r3.P != null) {
                                                }
                                                int i19222222 = (r3.X ? 1 : 0) | (r3.W ? 2 : 0);
                                                f7sVar = new f7s();
                                                l = eh20.l(str6);
                                                Map map222222 = k0;
                                                if (l) {
                                                }
                                                str4 = r3.b;
                                                if (str4 != null) {
                                                }
                                                f7sVar.a = Integer.toString(i18);
                                                f7sVar.l = eh20.q(r3.a ? "video/webm" : "video/x-matroska");
                                                f7sVar.m = eh20.q(str6);
                                                f7sVar.n = i3;
                                                f7sVar.d = r3.Y;
                                                f7sVar.e = i19222222;
                                                f7sVar.p = list5;
                                                f7sVar.j = str2;
                                                f7sVar.q = r3.m;
                                                a aVar222222 = new a(f7sVar);
                                                g001 B222222 = d5pVar.B(r3.d, i4);
                                                r3.Z = B222222;
                                                B222222.d(aVar222222);
                                                sparseArray.put(r3.d, r3);
                                                q810Var12 = q810Var2;
                                                break;
                                            case 6:
                                                q810Var3 = q810Var12;
                                                str6 = "audio/mpeg";
                                                q810Var2 = q810Var3;
                                                F = -1;
                                                i3 = 4096;
                                                list = null;
                                                str2 = null;
                                                list5 = list;
                                                if (r3.P != null) {
                                                }
                                                int i192222222 = (r3.X ? 1 : 0) | (r3.W ? 2 : 0);
                                                f7sVar = new f7s();
                                                l = eh20.l(str6);
                                                Map map2222222 = k0;
                                                if (l) {
                                                }
                                                str4 = r3.b;
                                                if (str4 != null) {
                                                }
                                                f7sVar.a = Integer.toString(i18);
                                                f7sVar.l = eh20.q(r3.a ? "video/webm" : "video/x-matroska");
                                                f7sVar.m = eh20.q(str6);
                                                f7sVar.n = i3;
                                                f7sVar.d = r3.Y;
                                                f7sVar.e = i192222222;
                                                f7sVar.p = list5;
                                                f7sVar.j = str2;
                                                f7sVar.q = r3.m;
                                                a aVar2222222 = new a(f7sVar);
                                                g001 B2222222 = d5pVar.B(r3.d, i4);
                                                r3.Z = B2222222;
                                                B2222222.d(aVar2222222);
                                                sparseArray.put(r3.d, r3);
                                                q810Var12 = q810Var2;
                                                break;
                                            case 7:
                                                ef90 ef90Var2 = new ef90(r3.a(r3.c));
                                                try {
                                                    ef90Var2.L(16);
                                                    long p = ef90Var2.p();
                                                    if (p == 1482049860) {
                                                        runtimeException = null;
                                                        try {
                                                            pair = new Pair("video/divx", null);
                                                        } catch (ArrayIndexOutOfBoundsException unused4) {
                                                            throw ParserException.a(runtimeException, "Error parsing FourCC private data");
                                                        }
                                                    } else if (p == 859189832) {
                                                        pair = new Pair("video/3gpp", null);
                                                    } else {
                                                        if (p == 826496599) {
                                                            byte[] bArr7 = ef90Var2.a;
                                                            for (int i34 = ef90Var2.b + 20; i34 < bArr7.length - 4; i34++) {
                                                                if (bArr7[i34] == 0 && bArr7[i34 + 1] == 0 && bArr7[i34 + 2] == 1) {
                                                                    if (bArr7[i34 + 3] == 15) {
                                                                        pair = new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArr7, i34, bArr7.length)));
                                                                    }
                                                                }
                                                            }
                                                            try {
                                                                throw ParserException.a(null, "Failed to find FourCC VC1 initialization data");
                                                            } catch (ArrayIndexOutOfBoundsException unused5) {
                                                                runtimeException = null;
                                                                throw ParserException.a(runtimeException, "Error parsing FourCC private data");
                                                            }
                                                        }
                                                        lk91.j("Unknown FourCC. Setting mimeType to video/x-unknown");
                                                        str2 = null;
                                                        pair = new Pair("video/x-unknown", null);
                                                        str6 = (String) pair.first;
                                                        q810Var2 = q810Var12;
                                                        list2 = (List) pair.second;
                                                        F = -1;
                                                        i3 = -1;
                                                        list5 = list2;
                                                        if (r3.P != null) {
                                                        }
                                                        int i1922222222 = (r3.X ? 1 : 0) | (r3.W ? 2 : 0);
                                                        f7sVar = new f7s();
                                                        l = eh20.l(str6);
                                                        Map map22222222 = k0;
                                                        if (l) {
                                                        }
                                                        str4 = r3.b;
                                                        if (str4 != null) {
                                                        }
                                                        f7sVar.a = Integer.toString(i18);
                                                        f7sVar.l = eh20.q(r3.a ? "video/webm" : "video/x-matroska");
                                                        f7sVar.m = eh20.q(str6);
                                                        f7sVar.n = i3;
                                                        f7sVar.d = r3.Y;
                                                        f7sVar.e = i1922222222;
                                                        f7sVar.p = list5;
                                                        f7sVar.j = str2;
                                                        f7sVar.q = r3.m;
                                                        a aVar22222222 = new a(f7sVar);
                                                        g001 B22222222 = d5pVar.B(r3.d, i4);
                                                        r3.Z = B22222222;
                                                        B22222222.d(aVar22222222);
                                                        sparseArray.put(r3.d, r3);
                                                        q810Var12 = q810Var2;
                                                    }
                                                    str2 = null;
                                                    str6 = (String) pair.first;
                                                    q810Var2 = q810Var12;
                                                    list2 = (List) pair.second;
                                                    F = -1;
                                                    i3 = -1;
                                                    list5 = list2;
                                                    if (r3.P != null) {
                                                    }
                                                    int i19222222222 = (r3.X ? 1 : 0) | (r3.W ? 2 : 0);
                                                    f7sVar = new f7s();
                                                    l = eh20.l(str6);
                                                    Map map222222222 = k0;
                                                    if (l) {
                                                    }
                                                    str4 = r3.b;
                                                    if (str4 != null) {
                                                    }
                                                    f7sVar.a = Integer.toString(i18);
                                                    f7sVar.l = eh20.q(r3.a ? "video/webm" : "video/x-matroska");
                                                    f7sVar.m = eh20.q(str6);
                                                    f7sVar.n = i3;
                                                    f7sVar.d = r3.Y;
                                                    f7sVar.e = i19222222222;
                                                    f7sVar.p = list5;
                                                    f7sVar.j = str2;
                                                    f7sVar.q = r3.m;
                                                    a aVar222222222 = new a(f7sVar);
                                                    g001 B222222222 = d5pVar.B(r3.d, i4);
                                                    r3.Z = B222222222;
                                                    B222222222.d(aVar222222222);
                                                    sparseArray.put(r3.d, r3);
                                                    q810Var12 = q810Var2;
                                                } catch (ArrayIndexOutOfBoundsException unused6) {
                                                    runtimeException = null;
                                                }
                                                break;
                                            case '\b':
                                                byte[] bArr8 = new byte[4];
                                                System.arraycopy(r3.a(str5), 0, bArr8, 0, 4);
                                                singletonList = ImmutableList.r(bArr8);
                                                q810Var2 = q810Var12;
                                                str6 = "application/dvbsubs";
                                                F = -1;
                                                i3 = -1;
                                                list = singletonList;
                                                str2 = null;
                                                list5 = list;
                                                if (r3.P != null) {
                                                }
                                                int i192222222222 = (r3.X ? 1 : 0) | (r3.W ? 2 : 0);
                                                f7sVar = new f7s();
                                                l = eh20.l(str6);
                                                Map map2222222222 = k0;
                                                if (l) {
                                                }
                                                str4 = r3.b;
                                                if (str4 != null) {
                                                }
                                                f7sVar.a = Integer.toString(i18);
                                                f7sVar.l = eh20.q(r3.a ? "video/webm" : "video/x-matroska");
                                                f7sVar.m = eh20.q(str6);
                                                f7sVar.n = i3;
                                                f7sVar.d = r3.Y;
                                                f7sVar.e = i192222222222;
                                                f7sVar.p = list5;
                                                f7sVar.j = str2;
                                                f7sVar.q = r3.m;
                                                a aVar2222222222 = new a(f7sVar);
                                                g001 B2222222222 = d5pVar.B(r3.d, i4);
                                                r3.Z = B2222222222;
                                                B2222222222.d(aVar2222222222);
                                                sparseArray.put(r3.d, r3);
                                                q810Var12 = q810Var2;
                                                break;
                                            case '\n':
                                                q810Var4 = q810Var12;
                                                nb4 a3 = nb4.a(new ef90(r3.a(r3.c)));
                                                ArrayList arrayList2 = a3.a;
                                                r3.a0 = a3.b;
                                                str3 = a3.l;
                                                str6 = "video/avc";
                                                list4 = arrayList2;
                                                str2 = str3;
                                                q810Var2 = q810Var4;
                                                list2 = list4;
                                                F = -1;
                                                i3 = -1;
                                                list5 = list2;
                                                if (r3.P != null) {
                                                }
                                                int i1922222222222 = (r3.X ? 1 : 0) | (r3.W ? 2 : 0);
                                                f7sVar = new f7s();
                                                l = eh20.l(str6);
                                                Map map22222222222 = k0;
                                                if (l) {
                                                }
                                                str4 = r3.b;
                                                if (str4 != null) {
                                                }
                                                f7sVar.a = Integer.toString(i18);
                                                f7sVar.l = eh20.q(r3.a ? "video/webm" : "video/x-matroska");
                                                f7sVar.m = eh20.q(str6);
                                                f7sVar.n = i3;
                                                f7sVar.d = r3.Y;
                                                f7sVar.e = i1922222222222;
                                                f7sVar.p = list5;
                                                f7sVar.j = str2;
                                                f7sVar.q = r3.m;
                                                a aVar22222222222 = new a(f7sVar);
                                                g001 B22222222222 = d5pVar.B(r3.d, i4);
                                                r3.Z = B22222222222;
                                                B22222222222.d(aVar22222222222);
                                                sparseArray.put(r3.d, r3);
                                                q810Var12 = q810Var2;
                                                break;
                                            case 11:
                                                singletonList = ImmutableList.r(r3.a(str5));
                                                q810Var2 = q810Var12;
                                                str6 = "application/vobsub";
                                                F = -1;
                                                i3 = -1;
                                                list = singletonList;
                                                str2 = null;
                                                list5 = list;
                                                if (r3.P != null) {
                                                }
                                                int i19222222222222 = (r3.X ? 1 : 0) | (r3.W ? 2 : 0);
                                                f7sVar = new f7s();
                                                l = eh20.l(str6);
                                                Map map222222222222 = k0;
                                                if (l) {
                                                }
                                                str4 = r3.b;
                                                if (str4 != null) {
                                                }
                                                f7sVar.a = Integer.toString(i18);
                                                f7sVar.l = eh20.q(r3.a ? "video/webm" : "video/x-matroska");
                                                f7sVar.m = eh20.q(str6);
                                                f7sVar.n = i3;
                                                f7sVar.d = r3.Y;
                                                f7sVar.e = i19222222222222;
                                                f7sVar.p = list5;
                                                f7sVar.j = str2;
                                                f7sVar.q = r3.m;
                                                a aVar222222222222 = new a(f7sVar);
                                                g001 B222222222222 = d5pVar.B(r3.d, i4);
                                                r3.Z = B222222222222;
                                                B222222222222.d(aVar222222222222);
                                                sparseArray.put(r3.d, r3);
                                                q810Var12 = q810Var2;
                                                break;
                                            case '\f':
                                                q810Var5 = q810Var12;
                                                str6 = "audio/vnd.dts.hd";
                                                q810Var2 = q810Var5;
                                                F = -1;
                                                i3 = -1;
                                                list = null;
                                                str2 = null;
                                                list5 = list;
                                                if (r3.P != null) {
                                                }
                                                int i192222222222222 = (r3.X ? 1 : 0) | (r3.W ? 2 : 0);
                                                f7sVar = new f7s();
                                                l = eh20.l(str6);
                                                Map map2222222222222 = k0;
                                                if (l) {
                                                }
                                                str4 = r3.b;
                                                if (str4 != null) {
                                                }
                                                f7sVar.a = Integer.toString(i18);
                                                f7sVar.l = eh20.q(r3.a ? "video/webm" : "video/x-matroska");
                                                f7sVar.m = eh20.q(str6);
                                                f7sVar.n = i3;
                                                f7sVar.d = r3.Y;
                                                f7sVar.e = i192222222222222;
                                                f7sVar.p = list5;
                                                f7sVar.j = str2;
                                                f7sVar.q = r3.m;
                                                a aVar2222222222222 = new a(f7sVar);
                                                g001 B2222222222222 = d5pVar.B(r3.d, i4);
                                                r3.Z = B2222222222222;
                                                B2222222222222.d(aVar2222222222222);
                                                sparseArray.put(r3.d, r3);
                                                q810Var12 = q810Var2;
                                                break;
                                            case '\r':
                                                List singletonList2 = Collections.singletonList(r3.a(str5));
                                                byte[] bArr9 = r3.l;
                                                a4 o = pw21.o(new df90(bArr9, bArr9.length), false);
                                                r3.S = o.b;
                                                r3.Q = o.c;
                                                str6 = "audio/mp4a-latm";
                                                q810Var2 = q810Var12;
                                                str2 = o.a;
                                                i3 = -1;
                                                list3 = singletonList2;
                                                F = -1;
                                                list5 = list3;
                                                if (r3.P != null) {
                                                }
                                                int i1922222222222222 = (r3.X ? 1 : 0) | (r3.W ? 2 : 0);
                                                f7sVar = new f7s();
                                                l = eh20.l(str6);
                                                Map map22222222222222 = k0;
                                                if (l) {
                                                }
                                                str4 = r3.b;
                                                if (str4 != null) {
                                                }
                                                f7sVar.a = Integer.toString(i18);
                                                f7sVar.l = eh20.q(r3.a ? "video/webm" : "video/x-matroska");
                                                f7sVar.m = eh20.q(str6);
                                                f7sVar.n = i3;
                                                f7sVar.d = r3.Y;
                                                f7sVar.e = i1922222222222222;
                                                f7sVar.p = list5;
                                                f7sVar.j = str2;
                                                f7sVar.q = r3.m;
                                                a aVar22222222222222 = new a(f7sVar);
                                                g001 B22222222222222 = d5pVar.B(r3.d, i4);
                                                r3.Z = B22222222222222;
                                                B22222222222222.d(aVar22222222222222);
                                                sparseArray.put(r3.d, r3);
                                                q810Var12 = q810Var2;
                                                break;
                                            case 14:
                                                q810Var5 = q810Var12;
                                                str6 = "audio/ac3";
                                                q810Var2 = q810Var5;
                                                F = -1;
                                                i3 = -1;
                                                list = null;
                                                str2 = null;
                                                list5 = list;
                                                if (r3.P != null) {
                                                }
                                                int i19222222222222222 = (r3.X ? 1 : 0) | (r3.W ? 2 : 0);
                                                f7sVar = new f7s();
                                                l = eh20.l(str6);
                                                Map map222222222222222 = k0;
                                                if (l) {
                                                }
                                                str4 = r3.b;
                                                if (str4 != null) {
                                                }
                                                f7sVar.a = Integer.toString(i18);
                                                f7sVar.l = eh20.q(r3.a ? "video/webm" : "video/x-matroska");
                                                f7sVar.m = eh20.q(str6);
                                                f7sVar.n = i3;
                                                f7sVar.d = r3.Y;
                                                f7sVar.e = i19222222222222222;
                                                f7sVar.p = list5;
                                                f7sVar.j = str2;
                                                f7sVar.q = r3.m;
                                                a aVar222222222222222 = new a(f7sVar);
                                                g001 B222222222222222 = d5pVar.B(r3.d, i4);
                                                r3.Z = B222222222222222;
                                                B222222222222222.d(aVar222222222222222);
                                                sparseArray.put(r3.d, r3);
                                                q810Var12 = q810Var2;
                                                break;
                                            case 15:
                                            case 21:
                                                q810Var5 = q810Var12;
                                                str6 = "audio/vnd.dts";
                                                q810Var2 = q810Var5;
                                                F = -1;
                                                i3 = -1;
                                                list = null;
                                                str2 = null;
                                                list5 = list;
                                                if (r3.P != null) {
                                                }
                                                int i192222222222222222 = (r3.X ? 1 : 0) | (r3.W ? 2 : 0);
                                                f7sVar = new f7s();
                                                l = eh20.l(str6);
                                                Map map2222222222222222 = k0;
                                                if (l) {
                                                }
                                                str4 = r3.b;
                                                if (str4 != null) {
                                                }
                                                f7sVar.a = Integer.toString(i18);
                                                f7sVar.l = eh20.q(r3.a ? "video/webm" : "video/x-matroska");
                                                f7sVar.m = eh20.q(str6);
                                                f7sVar.n = i3;
                                                f7sVar.d = r3.Y;
                                                f7sVar.e = i192222222222222222;
                                                f7sVar.p = list5;
                                                f7sVar.j = str2;
                                                f7sVar.q = r3.m;
                                                a aVar2222222222222222 = new a(f7sVar);
                                                g001 B2222222222222222 = d5pVar.B(r3.d, i4);
                                                r3.Z = B2222222222222222;
                                                B2222222222222222.d(aVar2222222222222222);
                                                sparseArray.put(r3.d, r3);
                                                q810Var12 = q810Var2;
                                                break;
                                            case 16:
                                                q810Var6 = q810Var12;
                                                byte[] bArr10 = r3.l;
                                                r = bArr10 == null ? null : ImmutableList.r(bArr10);
                                                str6 = "video/av01";
                                                singletonList = r;
                                                q810Var2 = q810Var6;
                                                F = -1;
                                                i3 = -1;
                                                list = singletonList;
                                                str2 = null;
                                                list5 = list;
                                                if (r3.P != null) {
                                                }
                                                int i1922222222222222222 = (r3.X ? 1 : 0) | (r3.W ? 2 : 0);
                                                f7sVar = new f7s();
                                                l = eh20.l(str6);
                                                Map map22222222222222222 = k0;
                                                if (l) {
                                                }
                                                str4 = r3.b;
                                                if (str4 != null) {
                                                }
                                                f7sVar.a = Integer.toString(i18);
                                                f7sVar.l = eh20.q(r3.a ? "video/webm" : "video/x-matroska");
                                                f7sVar.m = eh20.q(str6);
                                                f7sVar.n = i3;
                                                f7sVar.d = r3.Y;
                                                f7sVar.e = i1922222222222222222;
                                                f7sVar.p = list5;
                                                f7sVar.j = str2;
                                                f7sVar.q = r3.m;
                                                a aVar22222222222222222 = new a(f7sVar);
                                                g001 B22222222222222222 = d5pVar.B(r3.d, i4);
                                                r3.Z = B22222222222222222;
                                                B22222222222222222.d(aVar22222222222222222);
                                                sparseArray.put(r3.d, r3);
                                                q810Var12 = q810Var2;
                                                break;
                                            case 17:
                                                q810Var5 = q810Var12;
                                                str6 = "video/x-vnd.on2.vp8";
                                                q810Var2 = q810Var5;
                                                F = -1;
                                                i3 = -1;
                                                list = null;
                                                str2 = null;
                                                list5 = list;
                                                if (r3.P != null) {
                                                }
                                                int i19222222222222222222 = (r3.X ? 1 : 0) | (r3.W ? 2 : 0);
                                                f7sVar = new f7s();
                                                l = eh20.l(str6);
                                                Map map222222222222222222 = k0;
                                                if (l) {
                                                }
                                                str4 = r3.b;
                                                if (str4 != null) {
                                                }
                                                f7sVar.a = Integer.toString(i18);
                                                f7sVar.l = eh20.q(r3.a ? "video/webm" : "video/x-matroska");
                                                f7sVar.m = eh20.q(str6);
                                                f7sVar.n = i3;
                                                f7sVar.d = r3.Y;
                                                f7sVar.e = i19222222222222222222;
                                                f7sVar.p = list5;
                                                f7sVar.j = str2;
                                                f7sVar.q = r3.m;
                                                a aVar222222222222222222 = new a(f7sVar);
                                                g001 B222222222222222222 = d5pVar.B(r3.d, i4);
                                                r3.Z = B222222222222222222;
                                                B222222222222222222.d(aVar222222222222222222);
                                                sparseArray.put(r3.d, r3);
                                                q810Var12 = q810Var2;
                                                break;
                                            case 18:
                                                q810Var6 = q810Var12;
                                                byte[] bArr11 = r3.l;
                                                r = bArr11 == null ? null : ImmutableList.r(bArr11);
                                                str6 = "video/x-vnd.on2.vp9";
                                                singletonList = r;
                                                q810Var2 = q810Var6;
                                                F = -1;
                                                i3 = -1;
                                                list = singletonList;
                                                str2 = null;
                                                list5 = list;
                                                if (r3.P != null) {
                                                }
                                                int i192222222222222222222 = (r3.X ? 1 : 0) | (r3.W ? 2 : 0);
                                                f7sVar = new f7s();
                                                l = eh20.l(str6);
                                                Map map2222222222222222222 = k0;
                                                if (l) {
                                                }
                                                str4 = r3.b;
                                                if (str4 != null) {
                                                }
                                                f7sVar.a = Integer.toString(i18);
                                                f7sVar.l = eh20.q(r3.a ? "video/webm" : "video/x-matroska");
                                                f7sVar.m = eh20.q(str6);
                                                f7sVar.n = i3;
                                                f7sVar.d = r3.Y;
                                                f7sVar.e = i192222222222222222222;
                                                f7sVar.p = list5;
                                                f7sVar.j = str2;
                                                f7sVar.q = r3.m;
                                                a aVar2222222222222222222 = new a(f7sVar);
                                                g001 B2222222222222222222 = d5pVar.B(r3.d, i4);
                                                r3.Z = B2222222222222222222;
                                                B2222222222222222222.d(aVar2222222222222222222);
                                                sparseArray.put(r3.d, r3);
                                                q810Var12 = q810Var2;
                                                break;
                                            case 19:
                                                q810Var2 = q810Var12;
                                                str6 = "application/pgs";
                                                F = -1;
                                                i3 = -1;
                                                list = null;
                                                str2 = null;
                                                list5 = list;
                                                if (r3.P != null) {
                                                }
                                                int i1922222222222222222222 = (r3.X ? 1 : 0) | (r3.W ? 2 : 0);
                                                f7sVar = new f7s();
                                                l = eh20.l(str6);
                                                Map map22222222222222222222 = k0;
                                                if (l) {
                                                }
                                                str4 = r3.b;
                                                if (str4 != null) {
                                                }
                                                f7sVar.a = Integer.toString(i18);
                                                f7sVar.l = eh20.q(r3.a ? "video/webm" : "video/x-matroska");
                                                f7sVar.m = eh20.q(str6);
                                                f7sVar.n = i3;
                                                f7sVar.d = r3.Y;
                                                f7sVar.e = i1922222222222222222222;
                                                f7sVar.p = list5;
                                                f7sVar.j = str2;
                                                f7sVar.q = r3.m;
                                                a aVar22222222222222222222 = new a(f7sVar);
                                                g001 B22222222222222222222 = d5pVar.B(r3.d, i4);
                                                r3.Z = B22222222222222222222;
                                                B22222222222222222222.d(aVar22222222222222222222);
                                                sparseArray.put(r3.d, r3);
                                                q810Var12 = q810Var2;
                                                break;
                                            case 20:
                                                q810Var2 = q810Var12;
                                                F = -1;
                                                i3 = -1;
                                                list = null;
                                                str2 = null;
                                                list5 = list;
                                                if (r3.P != null) {
                                                }
                                                int i19222222222222222222222 = (r3.X ? 1 : 0) | (r3.W ? 2 : 0);
                                                f7sVar = new f7s();
                                                l = eh20.l(str6);
                                                Map map222222222222222222222 = k0;
                                                if (l) {
                                                }
                                                str4 = r3.b;
                                                if (str4 != null) {
                                                }
                                                f7sVar.a = Integer.toString(i18);
                                                f7sVar.l = eh20.q(r3.a ? "video/webm" : "video/x-matroska");
                                                f7sVar.m = eh20.q(str6);
                                                f7sVar.n = i3;
                                                f7sVar.d = r3.Y;
                                                f7sVar.e = i19222222222222222222222;
                                                f7sVar.p = list5;
                                                f7sVar.j = str2;
                                                f7sVar.q = r3.m;
                                                a aVar222222222222222222222 = new a(f7sVar);
                                                g001 B222222222222222222222 = d5pVar.B(r3.d, i4);
                                                r3.Z = B222222222222222222222;
                                                B222222222222222222222.d(aVar222222222222222222222);
                                                sparseArray.put(r3.d, r3);
                                                q810Var12 = q810Var2;
                                                break;
                                            case 22:
                                                q810Var7 = q810Var12;
                                                if (r3.R == 32) {
                                                    q810Var2 = q810Var7;
                                                    str6 = "audio/raw";
                                                    F = 4;
                                                    i3 = -1;
                                                    list = null;
                                                    str2 = null;
                                                    list5 = list;
                                                    if (r3.P != null) {
                                                    }
                                                    int i192222222222222222222222 = (r3.X ? 1 : 0) | (r3.W ? 2 : 0);
                                                    f7sVar = new f7s();
                                                    l = eh20.l(str6);
                                                    Map map2222222222222222222222 = k0;
                                                    if (l) {
                                                    }
                                                    str4 = r3.b;
                                                    if (str4 != null) {
                                                    }
                                                    f7sVar.a = Integer.toString(i18);
                                                    f7sVar.l = eh20.q(r3.a ? "video/webm" : "video/x-matroska");
                                                    f7sVar.m = eh20.q(str6);
                                                    f7sVar.n = i3;
                                                    f7sVar.d = r3.Y;
                                                    f7sVar.e = i192222222222222222222222;
                                                    f7sVar.p = list5;
                                                    f7sVar.j = str2;
                                                    f7sVar.q = r3.m;
                                                    a aVar2222222222222222222222 = new a(f7sVar);
                                                    g001 B2222222222222222222222 = d5pVar.B(r3.d, i4);
                                                    r3.Z = B2222222222222222222222;
                                                    B2222222222222222222222.d(aVar2222222222222222222222);
                                                    sparseArray.put(r3.d, r3);
                                                    q810Var12 = q810Var2;
                                                } else {
                                                    lk91.j("Unsupported floating point PCM bit depth: " + r3.R + ". Setting mimeType to audio/x-unknown");
                                                    q810Var2 = q810Var7;
                                                    str6 = "audio/x-unknown";
                                                    F = -1;
                                                    i3 = -1;
                                                    list = null;
                                                    str2 = null;
                                                    list5 = list;
                                                    if (r3.P != null) {
                                                    }
                                                    int i1922222222222222222222222 = (r3.X ? 1 : 0) | (r3.W ? 2 : 0);
                                                    f7sVar = new f7s();
                                                    l = eh20.l(str6);
                                                    Map map22222222222222222222222 = k0;
                                                    if (l) {
                                                    }
                                                    str4 = r3.b;
                                                    if (str4 != null) {
                                                    }
                                                    f7sVar.a = Integer.toString(i18);
                                                    f7sVar.l = eh20.q(r3.a ? "video/webm" : "video/x-matroska");
                                                    f7sVar.m = eh20.q(str6);
                                                    f7sVar.n = i3;
                                                    f7sVar.d = r3.Y;
                                                    f7sVar.e = i1922222222222222222222222;
                                                    f7sVar.p = list5;
                                                    f7sVar.j = str2;
                                                    f7sVar.q = r3.m;
                                                    a aVar22222222222222222222222 = new a(f7sVar);
                                                    g001 B22222222222222222222222 = d5pVar.B(r3.d, i4);
                                                    r3.Z = B22222222222222222222222;
                                                    B22222222222222222222222.d(aVar22222222222222222222222);
                                                    sparseArray.put(r3.d, r3);
                                                    q810Var12 = q810Var2;
                                                }
                                                break;
                                            case 23:
                                                q810Var7 = q810Var12;
                                                int i35 = r3.R;
                                                if (i35 == 8) {
                                                    q810Var2 = q810Var7;
                                                    str6 = "audio/raw";
                                                    F = 3;
                                                    i3 = -1;
                                                    list = null;
                                                    str2 = null;
                                                    list5 = list;
                                                    if (r3.P != null) {
                                                    }
                                                    int i19222222222222222222222222 = (r3.X ? 1 : 0) | (r3.W ? 2 : 0);
                                                    f7sVar = new f7s();
                                                    l = eh20.l(str6);
                                                    Map map222222222222222222222222 = k0;
                                                    if (l) {
                                                    }
                                                    str4 = r3.b;
                                                    if (str4 != null) {
                                                    }
                                                    f7sVar.a = Integer.toString(i18);
                                                    f7sVar.l = eh20.q(r3.a ? "video/webm" : "video/x-matroska");
                                                    f7sVar.m = eh20.q(str6);
                                                    f7sVar.n = i3;
                                                    f7sVar.d = r3.Y;
                                                    f7sVar.e = i19222222222222222222222222;
                                                    f7sVar.p = list5;
                                                    f7sVar.j = str2;
                                                    f7sVar.q = r3.m;
                                                    a aVar222222222222222222222222 = new a(f7sVar);
                                                    g001 B222222222222222222222222 = d5pVar.B(r3.d, i4);
                                                    r3.Z = B222222222222222222222222;
                                                    B222222222222222222222222.d(aVar222222222222222222222222);
                                                    sparseArray.put(r3.d, r3);
                                                    q810Var12 = q810Var2;
                                                } else {
                                                    if (i35 == 16) {
                                                        F = SelfTester_JCP.IMITA;
                                                    } else if (i35 == 24) {
                                                        F = 1342177280;
                                                    } else if (i35 == 32) {
                                                        F = 1610612736;
                                                    } else {
                                                        lk91.j("Unsupported big endian PCM bit depth: " + r3.R + ". Setting mimeType to audio/x-unknown");
                                                        q810Var2 = q810Var7;
                                                        str6 = "audio/x-unknown";
                                                        F = -1;
                                                        i3 = -1;
                                                        list = null;
                                                        str2 = null;
                                                        list5 = list;
                                                        if (r3.P != null) {
                                                        }
                                                        int i192222222222222222222222222 = (r3.X ? 1 : 0) | (r3.W ? 2 : 0);
                                                        f7sVar = new f7s();
                                                        l = eh20.l(str6);
                                                        Map map2222222222222222222222222 = k0;
                                                        if (l) {
                                                        }
                                                        str4 = r3.b;
                                                        if (str4 != null) {
                                                        }
                                                        f7sVar.a = Integer.toString(i18);
                                                        f7sVar.l = eh20.q(r3.a ? "video/webm" : "video/x-matroska");
                                                        f7sVar.m = eh20.q(str6);
                                                        f7sVar.n = i3;
                                                        f7sVar.d = r3.Y;
                                                        f7sVar.e = i192222222222222222222222222;
                                                        f7sVar.p = list5;
                                                        f7sVar.j = str2;
                                                        f7sVar.q = r3.m;
                                                        a aVar2222222222222222222222222 = new a(f7sVar);
                                                        g001 B2222222222222222222222222 = d5pVar.B(r3.d, i4);
                                                        r3.Z = B2222222222222222222222222;
                                                        B2222222222222222222222222.d(aVar2222222222222222222222222);
                                                        sparseArray.put(r3.d, r3);
                                                        q810Var12 = q810Var2;
                                                    }
                                                    q810Var2 = q810Var7;
                                                    str6 = "audio/raw";
                                                    i3 = -1;
                                                    list = null;
                                                    str2 = null;
                                                    list5 = list;
                                                    if (r3.P != null) {
                                                    }
                                                    int i1922222222222222222222222222 = (r3.X ? 1 : 0) | (r3.W ? 2 : 0);
                                                    f7sVar = new f7s();
                                                    l = eh20.l(str6);
                                                    Map map22222222222222222222222222 = k0;
                                                    if (l) {
                                                    }
                                                    str4 = r3.b;
                                                    if (str4 != null) {
                                                    }
                                                    f7sVar.a = Integer.toString(i18);
                                                    f7sVar.l = eh20.q(r3.a ? "video/webm" : "video/x-matroska");
                                                    f7sVar.m = eh20.q(str6);
                                                    f7sVar.n = i3;
                                                    f7sVar.d = r3.Y;
                                                    f7sVar.e = i1922222222222222222222222222;
                                                    f7sVar.p = list5;
                                                    f7sVar.j = str2;
                                                    f7sVar.q = r3.m;
                                                    a aVar22222222222222222222222222 = new a(f7sVar);
                                                    g001 B22222222222222222222222222 = d5pVar.B(r3.d, i4);
                                                    r3.Z = B22222222222222222222222222;
                                                    B22222222222222222222222222.d(aVar22222222222222222222222222);
                                                    sparseArray.put(r3.d, r3);
                                                    q810Var12 = q810Var2;
                                                }
                                                break;
                                            case 24:
                                                q810Var7 = q810Var12;
                                                F = tw21.F(r3.R);
                                                if (F == 0) {
                                                    lk91.j("Unsupported little endian PCM bit depth: " + r3.R + ". Setting mimeType to audio/x-unknown");
                                                    q810Var2 = q810Var7;
                                                    str6 = "audio/x-unknown";
                                                    F = -1;
                                                    i3 = -1;
                                                    list = null;
                                                    str2 = null;
                                                    list5 = list;
                                                    if (r3.P != null) {
                                                    }
                                                    int i19222222222222222222222222222 = (r3.X ? 1 : 0) | (r3.W ? 2 : 0);
                                                    f7sVar = new f7s();
                                                    l = eh20.l(str6);
                                                    Map map222222222222222222222222222 = k0;
                                                    if (l) {
                                                    }
                                                    str4 = r3.b;
                                                    if (str4 != null) {
                                                    }
                                                    f7sVar.a = Integer.toString(i18);
                                                    f7sVar.l = eh20.q(r3.a ? "video/webm" : "video/x-matroska");
                                                    f7sVar.m = eh20.q(str6);
                                                    f7sVar.n = i3;
                                                    f7sVar.d = r3.Y;
                                                    f7sVar.e = i19222222222222222222222222222;
                                                    f7sVar.p = list5;
                                                    f7sVar.j = str2;
                                                    f7sVar.q = r3.m;
                                                    a aVar222222222222222222222222222 = new a(f7sVar);
                                                    g001 B222222222222222222222222222 = d5pVar.B(r3.d, i4);
                                                    r3.Z = B222222222222222222222222222;
                                                    B222222222222222222222222222.d(aVar222222222222222222222222222);
                                                    sparseArray.put(r3.d, r3);
                                                    q810Var12 = q810Var2;
                                                }
                                                q810Var2 = q810Var7;
                                                str6 = "audio/raw";
                                                i3 = -1;
                                                list = null;
                                                str2 = null;
                                                list5 = list;
                                                if (r3.P != null) {
                                                }
                                                int i192222222222222222222222222222 = (r3.X ? 1 : 0) | (r3.W ? 2 : 0);
                                                f7sVar = new f7s();
                                                l = eh20.l(str6);
                                                Map map2222222222222222222222222222 = k0;
                                                if (l) {
                                                }
                                                str4 = r3.b;
                                                if (str4 != null) {
                                                }
                                                f7sVar.a = Integer.toString(i18);
                                                f7sVar.l = eh20.q(r3.a ? "video/webm" : "video/x-matroska");
                                                f7sVar.m = eh20.q(str6);
                                                f7sVar.n = i3;
                                                f7sVar.d = r3.Y;
                                                f7sVar.e = i192222222222222222222222222222;
                                                f7sVar.p = list5;
                                                f7sVar.j = str2;
                                                f7sVar.q = r3.m;
                                                a aVar2222222222222222222222222222 = new a(f7sVar);
                                                g001 B2222222222222222222222222222 = d5pVar.B(r3.d, i4);
                                                r3.Z = B2222222222222222222222222222;
                                                B2222222222222222222222222222.d(aVar2222222222222222222222222222);
                                                sparseArray.put(r3.d, r3);
                                                q810Var12 = q810Var2;
                                                break;
                                            case 25:
                                                singletonList = ImmutableList.s(g0, r3.a(str5));
                                                q810Var2 = q810Var12;
                                                str6 = "text/x-ssa";
                                                F = -1;
                                                i3 = -1;
                                                list = singletonList;
                                                str2 = null;
                                                list5 = list;
                                                if (r3.P != null) {
                                                }
                                                int i1922222222222222222222222222222 = (r3.X ? 1 : 0) | (r3.W ? 2 : 0);
                                                f7sVar = new f7s();
                                                l = eh20.l(str6);
                                                Map map22222222222222222222222222222 = k0;
                                                if (l) {
                                                }
                                                str4 = r3.b;
                                                if (str4 != null) {
                                                }
                                                f7sVar.a = Integer.toString(i18);
                                                f7sVar.l = eh20.q(r3.a ? "video/webm" : "video/x-matroska");
                                                f7sVar.m = eh20.q(str6);
                                                f7sVar.n = i3;
                                                f7sVar.d = r3.Y;
                                                f7sVar.e = i1922222222222222222222222222222;
                                                f7sVar.p = list5;
                                                f7sVar.j = str2;
                                                f7sVar.q = r3.m;
                                                a aVar22222222222222222222222222222 = new a(f7sVar);
                                                g001 B22222222222222222222222222222 = d5pVar.B(r3.d, i4);
                                                r3.Z = B22222222222222222222222222222;
                                                B22222222222222222222222222222.d(aVar22222222222222222222222222222);
                                                sparseArray.put(r3.d, r3);
                                                q810Var12 = q810Var2;
                                                break;
                                            case 26:
                                                q810Var4 = q810Var12;
                                                pfu a4 = pfu.a(new ef90(r3.a(r3.c)), false, null);
                                                List list6 = a4.a;
                                                r3.a0 = a4.b;
                                                str3 = a4.l;
                                                str6 = "video/hevc";
                                                list4 = list6;
                                                str2 = str3;
                                                q810Var2 = q810Var4;
                                                list2 = list4;
                                                F = -1;
                                                i3 = -1;
                                                list5 = list2;
                                                if (r3.P != null) {
                                                }
                                                int i19222222222222222222222222222222 = (r3.X ? 1 : 0) | (r3.W ? 2 : 0);
                                                f7sVar = new f7s();
                                                l = eh20.l(str6);
                                                Map map222222222222222222222222222222 = k0;
                                                if (l) {
                                                }
                                                str4 = r3.b;
                                                if (str4 != null) {
                                                }
                                                f7sVar.a = Integer.toString(i18);
                                                f7sVar.l = eh20.q(r3.a ? "video/webm" : "video/x-matroska");
                                                f7sVar.m = eh20.q(str6);
                                                f7sVar.n = i3;
                                                f7sVar.d = r3.Y;
                                                f7sVar.e = i19222222222222222222222222222222;
                                                f7sVar.p = list5;
                                                f7sVar.j = str2;
                                                f7sVar.q = r3.m;
                                                a aVar222222222222222222222222222222 = new a(f7sVar);
                                                g001 B222222222222222222222222222222 = d5pVar.B(r3.d, i4);
                                                r3.Z = B222222222222222222222222222222;
                                                B222222222222222222222222222222.d(aVar222222222222222222222222222222);
                                                sparseArray.put(r3.d, r3);
                                                q810Var12 = q810Var2;
                                                break;
                                            case 27:
                                                q810Var2 = q810Var12;
                                                str6 = "text/vtt";
                                                F = -1;
                                                i3 = -1;
                                                list = null;
                                                str2 = null;
                                                list5 = list;
                                                if (r3.P != null) {
                                                }
                                                int i192222222222222222222222222222222 = (r3.X ? 1 : 0) | (r3.W ? 2 : 0);
                                                f7sVar = new f7s();
                                                l = eh20.l(str6);
                                                Map map2222222222222222222222222222222 = k0;
                                                if (l) {
                                                }
                                                str4 = r3.b;
                                                if (str4 != null) {
                                                }
                                                f7sVar.a = Integer.toString(i18);
                                                f7sVar.l = eh20.q(r3.a ? "video/webm" : "video/x-matroska");
                                                f7sVar.m = eh20.q(str6);
                                                f7sVar.n = i3;
                                                f7sVar.d = r3.Y;
                                                f7sVar.e = i192222222222222222222222222222222;
                                                f7sVar.p = list5;
                                                f7sVar.j = str2;
                                                f7sVar.q = r3.m;
                                                a aVar2222222222222222222222222222222 = new a(f7sVar);
                                                g001 B2222222222222222222222222222222 = d5pVar.B(r3.d, i4);
                                                r3.Z = B2222222222222222222222222222222;
                                                B2222222222222222222222222222222.d(aVar2222222222222222222222222222222);
                                                sparseArray.put(r3.d, r3);
                                                q810Var12 = q810Var2;
                                                break;
                                            case 28:
                                                q810Var2 = q810Var12;
                                                str6 = "application/x-subrip";
                                                F = -1;
                                                i3 = -1;
                                                list = null;
                                                str2 = null;
                                                list5 = list;
                                                if (r3.P != null) {
                                                }
                                                int i1922222222222222222222222222222222 = (r3.X ? 1 : 0) | (r3.W ? 2 : 0);
                                                f7sVar = new f7s();
                                                l = eh20.l(str6);
                                                Map map22222222222222222222222222222222 = k0;
                                                if (l) {
                                                }
                                                str4 = r3.b;
                                                if (str4 != null) {
                                                }
                                                f7sVar.a = Integer.toString(i18);
                                                f7sVar.l = eh20.q(r3.a ? "video/webm" : "video/x-matroska");
                                                f7sVar.m = eh20.q(str6);
                                                f7sVar.n = i3;
                                                f7sVar.d = r3.Y;
                                                f7sVar.e = i1922222222222222222222222222222222;
                                                f7sVar.p = list5;
                                                f7sVar.j = str2;
                                                f7sVar.q = r3.m;
                                                a aVar22222222222222222222222222222222 = new a(f7sVar);
                                                g001 B22222222222222222222222222222222 = d5pVar.B(r3.d, i4);
                                                r3.Z = B22222222222222222222222222222222;
                                                B22222222222222222222222222222222.d(aVar22222222222222222222222222222222);
                                                sparseArray.put(r3.d, r3);
                                                q810Var12 = q810Var2;
                                                break;
                                            case 29:
                                                q810Var5 = q810Var12;
                                                str6 = "video/mpeg2";
                                                q810Var2 = q810Var5;
                                                F = -1;
                                                i3 = -1;
                                                list = null;
                                                str2 = null;
                                                list5 = list;
                                                if (r3.P != null) {
                                                }
                                                int i19222222222222222222222222222222222 = (r3.X ? 1 : 0) | (r3.W ? 2 : 0);
                                                f7sVar = new f7s();
                                                l = eh20.l(str6);
                                                Map map222222222222222222222222222222222 = k0;
                                                if (l) {
                                                }
                                                str4 = r3.b;
                                                if (str4 != null) {
                                                }
                                                f7sVar.a = Integer.toString(i18);
                                                f7sVar.l = eh20.q(r3.a ? "video/webm" : "video/x-matroska");
                                                f7sVar.m = eh20.q(str6);
                                                f7sVar.n = i3;
                                                f7sVar.d = r3.Y;
                                                f7sVar.e = i19222222222222222222222222222222222;
                                                f7sVar.p = list5;
                                                f7sVar.j = str2;
                                                f7sVar.q = r3.m;
                                                a aVar222222222222222222222222222222222 = new a(f7sVar);
                                                g001 B222222222222222222222222222222222 = d5pVar.B(r3.d, i4);
                                                r3.Z = B222222222222222222222222222222222;
                                                B222222222222222222222222222222222.d(aVar222222222222222222222222222222222);
                                                sparseArray.put(r3.d, r3);
                                                q810Var12 = q810Var2;
                                                break;
                                            case 30:
                                                q810Var5 = q810Var12;
                                                str6 = "audio/eac3";
                                                q810Var2 = q810Var5;
                                                F = -1;
                                                i3 = -1;
                                                list = null;
                                                str2 = null;
                                                list5 = list;
                                                if (r3.P != null) {
                                                }
                                                int i192222222222222222222222222222222222 = (r3.X ? 1 : 0) | (r3.W ? 2 : 0);
                                                f7sVar = new f7s();
                                                l = eh20.l(str6);
                                                Map map2222222222222222222222222222222222 = k0;
                                                if (l) {
                                                }
                                                str4 = r3.b;
                                                if (str4 != null) {
                                                }
                                                f7sVar.a = Integer.toString(i18);
                                                f7sVar.l = eh20.q(r3.a ? "video/webm" : "video/x-matroska");
                                                f7sVar.m = eh20.q(str6);
                                                f7sVar.n = i3;
                                                f7sVar.d = r3.Y;
                                                f7sVar.e = i192222222222222222222222222222222222;
                                                f7sVar.p = list5;
                                                f7sVar.j = str2;
                                                f7sVar.q = r3.m;
                                                a aVar2222222222222222222222222222222222 = new a(f7sVar);
                                                g001 B2222222222222222222222222222222222 = d5pVar.B(r3.d, i4);
                                                r3.Z = B2222222222222222222222222222222222;
                                                B2222222222222222222222222222222222.d(aVar2222222222222222222222222222222222);
                                                sparseArray.put(r3.d, r3);
                                                q810Var12 = q810Var2;
                                                break;
                                            case 31:
                                                q810Var6 = q810Var12;
                                                r = Collections.singletonList(r3.a(str5));
                                                str6 = "audio/flac";
                                                singletonList = r;
                                                q810Var2 = q810Var6;
                                                F = -1;
                                                i3 = -1;
                                                list = singletonList;
                                                str2 = null;
                                                list5 = list;
                                                if (r3.P != null) {
                                                }
                                                int i1922222222222222222222222222222222222 = (r3.X ? 1 : 0) | (r3.W ? 2 : 0);
                                                f7sVar = new f7s();
                                                l = eh20.l(str6);
                                                Map map22222222222222222222222222222222222 = k0;
                                                if (l) {
                                                }
                                                str4 = r3.b;
                                                if (str4 != null) {
                                                }
                                                f7sVar.a = Integer.toString(i18);
                                                f7sVar.l = eh20.q(r3.a ? "video/webm" : "video/x-matroska");
                                                f7sVar.m = eh20.q(str6);
                                                f7sVar.n = i3;
                                                f7sVar.d = r3.Y;
                                                f7sVar.e = i1922222222222222222222222222222222222;
                                                f7sVar.p = list5;
                                                f7sVar.j = str2;
                                                f7sVar.q = r3.m;
                                                a aVar22222222222222222222222222222222222 = new a(f7sVar);
                                                g001 B22222222222222222222222222222222222 = d5pVar.B(r3.d, i4);
                                                r3.Z = B22222222222222222222222222222222222;
                                                B22222222222222222222222222222222222.d(aVar22222222222222222222222222222222222);
                                                sparseArray.put(r3.d, r3);
                                                q810Var12 = q810Var2;
                                                break;
                                            case ' ':
                                                ArrayList arrayList3 = new ArrayList(3);
                                                arrayList3.add(r3.a(r3.c));
                                                ByteBuffer allocate = ByteBuffer.allocate(8);
                                                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                                                arrayList3.add(allocate.order(byteOrder).putLong(r3.T).array());
                                                arrayList3.add(ByteBuffer.allocate(8).order(byteOrder).putLong(r3.U).array());
                                                str6 = "audio/opus";
                                                q810Var2 = q810Var12;
                                                str2 = null;
                                                i3 = 5760;
                                                list3 = arrayList3;
                                                F = -1;
                                                list5 = list3;
                                                if (r3.P != null) {
                                                }
                                                int i19222222222222222222222222222222222222 = (r3.X ? 1 : 0) | (r3.W ? 2 : 0);
                                                f7sVar = new f7s();
                                                l = eh20.l(str6);
                                                Map map222222222222222222222222222222222222 = k0;
                                                if (l) {
                                                }
                                                str4 = r3.b;
                                                if (str4 != null) {
                                                }
                                                f7sVar.a = Integer.toString(i18);
                                                f7sVar.l = eh20.q(r3.a ? "video/webm" : "video/x-matroska");
                                                f7sVar.m = eh20.q(str6);
                                                f7sVar.n = i3;
                                                f7sVar.d = r3.Y;
                                                f7sVar.e = i19222222222222222222222222222222222222;
                                                f7sVar.p = list5;
                                                f7sVar.j = str2;
                                                f7sVar.q = r3.m;
                                                a aVar222222222222222222222222222222222222 = new a(f7sVar);
                                                g001 B222222222222222222222222222222222222 = d5pVar.B(r3.d, i4);
                                                r3.Z = B222222222222222222222222222222222222;
                                                B222222222222222222222222222222222222.d(aVar222222222222222222222222222222222222);
                                                sparseArray.put(r3.d, r3);
                                                q810Var12 = q810Var2;
                                                break;
                                            default:
                                                throw ParserException.a(null, "Unrecognized codec identifier.");
                                        }
                                    default:
                                        q810Var12.x = null;
                                        break;
                                }
                            } else if (i17 == 19899) {
                                int i36 = q810Var12.z;
                                if (i36 != i9) {
                                    long j7 = q810Var12.A;
                                    if (j7 != -1) {
                                        if (i36 == 475249515) {
                                            q810Var12.C = j7;
                                        }
                                    }
                                }
                            } else if (i17 == 25152) {
                                q810Var12.c(i17);
                                p810 p810Var2 = q810Var12.x;
                                if (p810Var2.i) {
                                    if (p810Var2.k == null) {
                                        throw ParserException.a(null, "Encrypted Track found but ContentEncKeyID was not found");
                                    }
                                    p810Var2.m = new DrmInitData(new DrmInitData.SchemeData(b87.a, "video/webm", q810Var12.x.k.b));
                                }
                            } else if (i17 == 28032) {
                                q810Var12.c(i17);
                                p810 p810Var3 = q810Var12.x;
                                if (p810Var3.i && p810Var3.j != null) {
                                    throw ParserException.a(null, "Combining encryption and compression is not supported");
                                }
                            } else if (i17 == 357149030) {
                                if (q810Var12.t == -9223372036854775807L) {
                                    q810Var12.t = 1000000L;
                                }
                                long j8 = q810Var12.u;
                                if (j8 != -9223372036854775807L) {
                                    q810Var12.v = q810Var12.l(j8);
                                }
                            } else if (i17 == 374648427) {
                                if (sparseArray.size() == 0) {
                                    throw ParserException.a(null, "No valid tracks were found");
                                }
                                q810Var12.e0.A();
                            } else if (i17 == 475249515) {
                                if (!q810Var12.y) {
                                    d5p d5pVar2 = q810Var12.e0;
                                    nlz nlzVar = q810Var12.F;
                                    nlz nlzVar2 = q810Var12.G;
                                    if (q810Var12.s == -1 || q810Var12.v == -9223372036854775807L || nlzVar == null || (i8 = nlzVar.a) == 0 || nlzVar2 == null || nlzVar2.a != i8) {
                                        qb4Var = new qb4(q810Var12.v);
                                    } else {
                                        int[] iArr = new int[i8];
                                        long[] jArr = new long[i8];
                                        long[] jArr2 = new long[i8];
                                        long[] jArr3 = new long[i8];
                                        for (int i37 = 0; i37 < i8; i37++) {
                                            jArr3[i37] = nlzVar.c(i37);
                                            jArr[i37] = nlzVar2.c(i37) + q810Var12.s;
                                        }
                                        int i38 = 0;
                                        while (true) {
                                            int i39 = i8 - 1;
                                            if (i38 < i39) {
                                                int i40 = i38 + 1;
                                                iArr[i38] = (int) (jArr[i40] - jArr[i38]);
                                                jArr2[i38] = jArr3[i40] - jArr3[i38];
                                                i38 = i40;
                                            } else {
                                                int i41 = i39;
                                                while (i41 > 0 && jArr3[i41] > q810Var12.v) {
                                                    i41--;
                                                }
                                                iArr[i41] = (int) ((q810Var12.s + q810Var12.r) - jArr[i41]);
                                                jArr2[i41] = q810Var12.v - jArr3[i41];
                                                if (i41 < i39) {
                                                    lk91.j("Discarding trailing cue points with timestamps greater than total duration");
                                                    int i42 = i41 + 1;
                                                    iArr = Arrays.copyOf(iArr, i42);
                                                    jArr = Arrays.copyOf(jArr, i42);
                                                    jArr2 = Arrays.copyOf(jArr2, i42);
                                                    jArr3 = Arrays.copyOf(jArr3, i42);
                                                }
                                                qb4Var = new qsb(iArr, jArr, jArr2, jArr3);
                                            }
                                        }
                                    }
                                    d5pVar2.w(qb4Var);
                                    q810Var12.y = true;
                                }
                                q810Var12.F = null;
                                q810Var12.G = null;
                            }
                        } else if (q810Var12.J == 2) {
                            p810 p810Var4 = (p810) sparseArray.get(q810Var12.P);
                            p810Var4.Z.getClass();
                            if (q810Var12.U > 0 && "A_OPUS".equals(p810Var4.c)) {
                                ef90 ef90Var3 = q810Var12.p;
                                byte[] array = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(q810Var12.U).array();
                                ef90Var3.getClass();
                                ef90Var3.I(array.length, array);
                            }
                            int i43 = 0;
                            for (int i44 = 0; i44 < q810Var12.N; i44++) {
                                i43 += q810Var12.O[i44];
                            }
                            int i45 = 0;
                            while (i45 < q810Var12.N) {
                                long j9 = q810Var12.K + ((p810Var4.f * i45) / 1000);
                                int i46 = q810Var12.R;
                                if (i45 == 0 && !q810Var12.T) {
                                    i46 |= 1;
                                }
                                int i47 = q810Var12.O[i45];
                                int i48 = i43 - i47;
                                q810Var12.f(p810Var4, j9, i46, i47, i48);
                                i45++;
                                i43 = i48;
                            }
                            z3 = false;
                            q810Var12.J = 0;
                            c5pVar2 = c5pVar;
                            z2 = z3;
                        }
                        z3 = false;
                        c5pVar2 = c5pVar;
                        z2 = z3;
                    }
                }
            }
            q810Var8 = q810Var;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0096, code lost:
    
        return false;
     */
    @Override // defpackage.b5p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(c5p c5pVar) {
        s3t0 s3t0Var = new s3t0();
        kbh kbhVar = (kbh) c5pVar;
        long j = kbhVar.c;
        long j2 = PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        if (j != -1 && j <= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
            j2 = j;
        }
        int i = (int) j2;
        ef90 ef90Var = s3t0Var.a;
        kbhVar.H(ef90Var.a, 0, 4, false);
        long A = ef90Var.A();
        s3t0Var.b = 4;
        while (true) {
            if (A != 440786851) {
                int i2 = s3t0Var.b + 1;
                s3t0Var.b = i2;
                if (i2 == i) {
                    break;
                }
                kbhVar.H(ef90Var.a, 0, 1, false);
                A = ((A << 8) & (-256)) | (ef90Var.a[0] & 255);
            } else {
                long a = s3t0Var.a(kbhVar);
                long j3 = s3t0Var.b;
                if (a != Long.MIN_VALUE && (j == -1 || j3 + a < j)) {
                    while (true) {
                        long j4 = s3t0Var.b;
                        long j5 = j3 + a;
                        if (j4 < j5) {
                            if (s3t0Var.a(kbhVar) != Long.MIN_VALUE) {
                                long a2 = s3t0Var.a(kbhVar);
                                if (a2 < 0 || a2 > 2147483647L) {
                                    break;
                                }
                                if (a2 != 0) {
                                    int i3 = (int) a2;
                                    kbhVar.a(i3, false);
                                    s3t0Var.b += i3;
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
    }

    public final void j(c5p c5pVar, int i) {
        ef90 ef90Var = this.i;
        if (ef90Var.c >= i) {
            return;
        }
        byte[] bArr = ef90Var.a;
        if (bArr.length < i) {
            ef90Var.c(Math.max(bArr.length * 2, i));
        }
        byte[] bArr2 = ef90Var.a;
        int i2 = ef90Var.c;
        c5pVar.readFully(bArr2, i2, i - i2);
        ef90Var.J(i);
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
        this.l.H(0);
    }

    public final long l(long j) {
        long j2 = this.t;
        if (j2 == -9223372036854775807L) {
            throw ParserException.a(null, "Can't scale timecode prior to timecodeScale being set.");
        }
        int i = tw21.a;
        return tw21.e0(j, j2, 1000L, RoundingMode.DOWN);
    }

    public final int m(c5p c5pVar, p810 p810Var, int i, boolean z) {
        int b;
        int b2;
        int i2;
        int i3;
        if ("S_TEXT/UTF8".equals(p810Var.c)) {
            n(c5pVar, f0, i);
            int i4 = this.W;
            k();
            return i4;
        }
        if ("S_TEXT/ASS".equals(p810Var.c)) {
            n(c5pVar, h0, i);
            int i5 = this.W;
            k();
            return i5;
        }
        if ("S_TEXT/WEBVTT".equals(p810Var.c)) {
            n(c5pVar, i0, i);
            int i6 = this.W;
            k();
            return i6;
        }
        g001 g001Var = p810Var.Z;
        boolean z2 = this.Y;
        ef90 ef90Var = this.l;
        int i7 = 2;
        if (!z2) {
            boolean z3 = p810Var.i;
            ef90 ef90Var2 = this.i;
            if (z3) {
                this.R &= -1073741825;
                if (!this.Z) {
                    c5pVar.readFully(ef90Var2.a, 0, 1);
                    this.V++;
                    byte b3 = ef90Var2.a[0];
                    if ((b3 & DerValue.TAG_CONTEXT) == 128) {
                        throw ParserException.a(null, "Extension bit is set in signal byte");
                    }
                    this.c0 = b3;
                    this.Z = true;
                }
                byte b4 = this.c0;
                if ((b4 & 1) == 1) {
                    boolean z4 = (b4 & 2) == 2;
                    this.R |= 1073741824;
                    if (!this.d0) {
                        ef90 ef90Var3 = this.n;
                        c5pVar.readFully(ef90Var3.a, 0, 8);
                        this.V += 8;
                        this.d0 = true;
                        ef90Var2.a[0] = (byte) ((z4 ? 128 : 0) | 8);
                        ef90Var2.K(0);
                        g001Var.a(ef90Var2, 1, 1);
                        this.W++;
                        ef90Var3.K(0);
                        g001Var.a(ef90Var3, 8, 1);
                        this.W += 8;
                    }
                    if (z4) {
                        if (!this.a0) {
                            c5pVar.readFully(ef90Var2.a, 0, 1);
                            this.V++;
                            ef90Var2.K(0);
                            this.b0 = ef90Var2.y();
                            this.a0 = true;
                        }
                        int i8 = this.b0 * 4;
                        ef90Var2.H(i8);
                        c5pVar.readFully(ef90Var2.a, 0, i8);
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
                            int C = ef90Var2.C();
                            int i12 = i10 % 2;
                            int i13 = i7;
                            ByteBuffer byteBuffer2 = this.q;
                            if (i12 == 0) {
                                byteBuffer2.putShort((short) (C - i11));
                            } else {
                                byteBuffer2.putInt(C - i11);
                            }
                            i10++;
                            i11 = C;
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
                        ef90 ef90Var4 = this.o;
                        ef90Var4.I(i9, array);
                        g001Var.a(ef90Var4, i9, 1);
                        this.W += i9;
                    }
                }
                i2 = 2;
            } else {
                i2 = 2;
                byte[] bArr = p810Var.j;
                if (bArr != null) {
                    ef90Var.I(bArr.length, bArr);
                }
            }
            if ("A_OPUS".equals(p810Var.c) ? z : p810Var.g > 0) {
                this.R |= SelfTester_JCP.IMITA;
                this.p.H(0);
                int i16 = (ef90Var.c + i) - this.V;
                ef90Var2.H(4);
                byte[] bArr2 = ef90Var2.a;
                bArr2[0] = (byte) ((i16 >> 24) & 255);
                bArr2[1] = (byte) ((i16 >> 16) & 255);
                bArr2[i2] = (byte) ((i16 >> 8) & 255);
                bArr2[3] = (byte) (i16 & 255);
                g001Var.a(ef90Var2, 4, i2);
                this.W += 4;
            }
            this.Y = true;
        }
        int i17 = i + ef90Var.c;
        if (!"V_MPEG4/ISO/AVC".equals(p810Var.c) && !"V_MPEGH/ISO/HEVC".equals(p810Var.c)) {
            if (p810Var.V != null) {
                d6z.x(ef90Var.c == 0);
                p810Var.V.c(c5pVar);
            }
            while (true) {
                int i18 = this.V;
                if (i18 >= i17) {
                    break;
                }
                int i19 = i17 - i18;
                int a = ef90Var.a();
                if (a > 0) {
                    b2 = Math.min(i19, a);
                    g001Var.a(ef90Var, b2, 0);
                } else {
                    b2 = g001Var.b(c5pVar, i19, false);
                }
                this.V += b2;
                this.W += b2;
            }
        } else {
            ef90 ef90Var5 = this.h;
            byte[] bArr3 = ef90Var5.a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i20 = p810Var.a0;
            int i21 = 4 - i20;
            while (this.V < i17) {
                int i22 = this.X;
                if (i22 == 0) {
                    int min = Math.min(i20, ef90Var.a());
                    c5pVar.readFully(bArr3, i21 + min, i20 - min);
                    if (min > 0) {
                        ef90Var.i(i21, min, bArr3);
                    }
                    this.V += i20;
                    ef90Var5.K(0);
                    this.X = ef90Var5.C();
                    ef90 ef90Var6 = this.g;
                    ef90Var6.K(0);
                    g001Var.a(ef90Var6, 4, 0);
                    this.W += 4;
                } else {
                    int a2 = ef90Var.a();
                    if (a2 > 0) {
                        b = Math.min(i22, a2);
                        g001Var.a(ef90Var, b, 0);
                    } else {
                        b = g001Var.b(c5pVar, i22, false);
                    }
                    this.V += b;
                    this.W += b;
                    this.X -= b;
                }
            }
        }
        if ("A_VORBIS".equals(p810Var.c)) {
            ef90 ef90Var7 = this.j;
            ef90Var7.K(0);
            g001Var.a(ef90Var7, 4, 0);
            this.W += 4;
        }
        int i23 = this.W;
        k();
        return i23;
    }

    public final void n(c5p c5pVar, byte[] bArr, int i) {
        int length = bArr.length + i;
        ef90 ef90Var = this.m;
        byte[] bArr2 = ef90Var.a;
        if (bArr2.length < length) {
            byte[] copyOf = Arrays.copyOf(bArr, length + i);
            ef90Var.getClass();
            ef90Var.I(copyOf.length, copyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        c5pVar.readFully(ef90Var.a, bArr.length, i);
        ef90Var.K(0);
        ef90Var.J(length);
    }

    @Override // defpackage.b5p
    public final void release() {
    }

    public q810(int i, o2v0 o2v0Var) {
        this(new uah(), i, o2v0Var);
    }

    @Deprecated
    public q810() {
        this(new uah(), 2, o2v0.d4);
    }
}
