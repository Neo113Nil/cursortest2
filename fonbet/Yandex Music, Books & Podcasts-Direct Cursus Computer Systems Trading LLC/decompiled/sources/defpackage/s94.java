package defpackage;

import com.yandex.pulse.metrics.o;
import io.appmetrica.analytics.BuildConfig;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class s94 extends z94 {
    public final int i;
    public final int j;
    public final int k;
    public List o;
    public List p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public byte u;
    public byte v;
    public boolean x;
    public long y;
    public static final int[] z = {11, 1, 3, 12, 14, 5, 7, 9};
    public static final int[] A = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] B = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    public static final int[] C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, BuildConfig.API_LEVEL, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    public static final int[] D = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    public static final int[] E = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
    public static final int[] F = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    public static final boolean[] G = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    public final d7k h = new d7k();
    public final ArrayList m = new ArrayList();
    public r94 n = new r94(0, 4);
    public int w = 0;
    public final long l = 16000000;

    public s94(String str, int i) {
        this.i = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i == 1) {
            this.k = 0;
            this.j = 0;
        } else if (i == 2) {
            this.k = 1;
            this.j = 0;
        } else if (i == 3) {
            this.k = 0;
            this.j = 1;
        } else if (i != 4) {
            vq1.n0("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.k = 0;
            this.j = 0;
        } else {
            this.k = 1;
            this.j = 1;
        }
        m(0);
        l();
        this.x = true;
        this.y = -9223372036854775807L;
    }

    @Override // defpackage.z94
    public final rp7 c() {
        List list = this.o;
        this.p = list;
        list.getClass();
        return new rp7(list);
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x007e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0085 A[SYNTHETIC] */
    @Override // defpackage.z94
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(x94 x94Var) {
        boolean z2;
        ByteBuffer byteBuffer = x94Var.i;
        byteBuffer.getClass();
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        d7k d7kVar = this.h;
        d7kVar.F(limit, array);
        boolean z3 = false;
        while (true) {
            int a = d7kVar.a();
            int i = this.i;
            if (a < i) {
                if (z3) {
                    int i2 = this.q;
                    if (i2 == 1 || i2 == 3) {
                        this.o = k();
                        this.y = this.e;
                        return;
                    }
                    return;
                }
                return;
            }
            int v = i == 2 ? -4 : d7kVar.v();
            int v2 = d7kVar.v();
            int v3 = d7kVar.v();
            if ((v & 2) == 0 && (v & 1) == this.j) {
                byte b = (byte) (v2 & 127);
                byte b2 = (byte) (v3 & 127);
                if (b != 0 || b2 != 0) {
                    boolean z4 = this.s;
                    if ((v & 4) == 4) {
                        boolean[] zArr = G;
                        if (zArr[v2] && zArr[v3]) {
                            z2 = true;
                            this.s = z2;
                            if (z2 || (b & 240) != 16) {
                                this.t = false;
                            } else if (this.t && this.u == b && this.v == b2) {
                                this.t = false;
                            } else {
                                this.t = true;
                                this.u = b;
                                this.v = b2;
                            }
                            if (!z2) {
                                if (1 <= b && b <= 15) {
                                    this.x = false;
                                } else if ((b & 246) == 20) {
                                    if (b2 != 32 && b2 != 47) {
                                        switch (b2) {
                                            default:
                                                switch (b2) {
                                                    case 42:
                                                    case o.CLIENT_SIDE_SAMPLING_STATUS_FIELD_NUMBER /* 43 */:
                                                        this.x = false;
                                                        break;
                                                }
                                            case 37:
                                            case 38:
                                            case 39:
                                                this.x = true;
                                                break;
                                        }
                                    }
                                    this.x = true;
                                }
                                if (this.x) {
                                    int i3 = b & 224;
                                    if (i3 == 0) {
                                        this.w = (b >> 3) & 1;
                                    }
                                    if (this.w == this.k) {
                                        if (i3 == 0) {
                                            int i4 = b & 247;
                                            if (i4 == 17 && (b2 & 240) == 48) {
                                                this.n.a((char) D[b2 & 15]);
                                            } else {
                                                int i5 = b & 246;
                                                if (i5 == 18 && (b2 & 224) == 32) {
                                                    this.n.b();
                                                    this.n.a((char) ((b & 1) == 0 ? E[b2 & 31] : F[b2 & 31]));
                                                } else if (i4 == 17 && (b2 & 240) == 32) {
                                                    this.n.a(' ');
                                                    boolean z5 = (b2 & 1) == 1;
                                                    r94 r94Var = this.n;
                                                    r94Var.a.add(new q94((b2 >> 1) & 7, r94Var.c.length(), z5));
                                                } else if ((b & 240) == 16 && (b2 & 192) == 64) {
                                                    int i6 = z[b & 7];
                                                    if ((b2 & 32) != 0) {
                                                        i6++;
                                                    }
                                                    r94 r94Var2 = this.n;
                                                    if (i6 != r94Var2.d) {
                                                        if (this.q != 1 && !r94Var2.e()) {
                                                            r94 r94Var3 = new r94(this.q, this.r);
                                                            this.n = r94Var3;
                                                            this.m.add(r94Var3);
                                                        }
                                                        this.n.d = i6;
                                                    }
                                                    boolean z6 = (b2 & 16) == 16;
                                                    boolean z7 = (b2 & 1) == 1;
                                                    int i7 = (b2 >> 1) & 7;
                                                    r94 r94Var4 = this.n;
                                                    r94Var4.a.add(new q94(z6 ? 8 : i7, r94Var4.c.length(), z7));
                                                    if (z6) {
                                                        this.n.e = A[i7];
                                                    }
                                                } else if (i4 == 23 && b2 >= 33 && b2 <= 35) {
                                                    this.n.f = b2 - 32;
                                                } else if (i5 == 20 && (b2 & 240) == 32) {
                                                    if (b2 == 32) {
                                                        m(2);
                                                    } else if (b2 != 41) {
                                                        switch (b2) {
                                                            case 37:
                                                                m(1);
                                                                this.r = 2;
                                                                this.n.h = 2;
                                                                break;
                                                            case 38:
                                                                m(1);
                                                                this.r = 3;
                                                                this.n.h = 3;
                                                                break;
                                                            case 39:
                                                                m(1);
                                                                this.r = 4;
                                                                this.n.h = 4;
                                                                break;
                                                            default:
                                                                int i8 = this.q;
                                                                if (i8 != 0) {
                                                                    if (b2 == 33) {
                                                                        this.n.b();
                                                                        break;
                                                                    } else {
                                                                        switch (b2) {
                                                                            case o.METRICS_FILTERING_STATUS_FIELD_NUMBER /* 44 */:
                                                                                this.o = Collections.EMPTY_LIST;
                                                                                if (i8 == 1 || i8 == 3) {
                                                                                    l();
                                                                                    break;
                                                                                }
                                                                            case o.LTS_CHANNEL_FIELD_NUMBER /* 45 */:
                                                                                if (i8 == 1 && !this.n.e()) {
                                                                                    r94 r94Var5 = this.n;
                                                                                    ArrayList arrayList = r94Var5.b;
                                                                                    arrayList.add(r94Var5.d());
                                                                                    r94Var5.c.setLength(0);
                                                                                    r94Var5.a.clear();
                                                                                    int min = Math.min(r94Var5.h, r94Var5.d);
                                                                                    while (arrayList.size() >= min) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            case o.SESSION_HASH_FIELD_NUMBER /* 46 */:
                                                                                l();
                                                                                break;
                                                                            case o.TPM_IDENTIFIER_FIELD_NUMBER /* 47 */:
                                                                                this.o = k();
                                                                                l();
                                                                                break;
                                                                        }
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        m(3);
                                                    }
                                                }
                                            }
                                        } else {
                                            r94 r94Var6 = this.n;
                                            int[] iArr = C;
                                            r94Var6.a((char) iArr[(b & Byte.MAX_VALUE) - 32]);
                                            if ((b2 & 224) != 0) {
                                                this.n.a((char) iArr[(b2 & Byte.MAX_VALUE) - 32]);
                                            }
                                        }
                                        z3 = true;
                                    }
                                }
                            } else if (z4) {
                                l();
                                z3 = true;
                            }
                        }
                    }
                    z2 = false;
                    this.s = z2;
                    if (z2) {
                    }
                    this.t = false;
                    if (!z2) {
                    }
                }
            }
        }
    }

    @Override // defpackage.z94, defpackage.fg7
    /* renamed from: e */
    public final qpr g() {
        qpr qprVar;
        qpr g = super.g();
        if (g != null) {
            return g;
        }
        long j = this.l;
        if (j == -9223372036854775807L) {
            return null;
        }
        long j2 = this.y;
        if (j2 == -9223372036854775807L || this.e - j2 < j || (qprVar = (qpr) this.b.pollFirst()) == null) {
            return null;
        }
        this.o = Collections.EMPTY_LIST;
        this.y = -9223372036854775807L;
        rp7 c = c();
        long j3 = this.e;
        qprVar.g = j3;
        qprVar.j = c;
        qprVar.k = j3;
        return qprVar;
    }

    @Override // defpackage.z94, defpackage.fg7
    public final void flush() {
        super.flush();
        this.o = null;
        this.p = null;
        m(0);
        this.r = 4;
        this.n.h = 4;
        l();
        this.s = false;
        this.t = false;
        this.u = (byte) 0;
        this.v = (byte) 0;
        this.w = 0;
        this.x = true;
        this.y = -9223372036854775807L;
    }

    @Override // defpackage.z94
    public final boolean j() {
        return this.o != this.p;
    }

    public final ArrayList k() {
        ArrayList arrayList = this.m;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int i = 2;
        for (int i2 = 0; i2 < size; i2++) {
            rv6 c = ((r94) arrayList.get(i2)).c(Integer.MIN_VALUE);
            arrayList2.add(c);
            if (c != null) {
                i = Math.min(i, c.i);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            rv6 rv6Var = (rv6) arrayList2.get(i3);
            if (rv6Var != null) {
                if (rv6Var.i != i) {
                    rv6Var = ((r94) arrayList.get(i3)).c(i);
                    rv6Var.getClass();
                }
                arrayList3.add(rv6Var);
            }
        }
        return arrayList3;
    }

    public final void l() {
        r94 r94Var = this.n;
        r94Var.g = this.q;
        r94Var.a.clear();
        r94Var.b.clear();
        r94Var.c.setLength(0);
        r94Var.d = 15;
        r94Var.e = 0;
        r94Var.f = 0;
        ArrayList arrayList = this.m;
        arrayList.clear();
        arrayList.add(this.n);
    }

    public final void m(int i) {
        int i2 = this.q;
        if (i2 == i) {
            return;
        }
        this.q = i;
        if (i != 3) {
            l();
            if (i2 == 3 || i == 1 || i == 0) {
                this.o = Collections.EMPTY_LIST;
                return;
            }
            return;
        }
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.m;
            if (i3 >= arrayList.size()) {
                return;
            }
            ((r94) arrayList.get(i3)).g = i;
            i3++;
        }
    }

    @Override // defpackage.z94, defpackage.fg7
    public final void a() {
    }
}
