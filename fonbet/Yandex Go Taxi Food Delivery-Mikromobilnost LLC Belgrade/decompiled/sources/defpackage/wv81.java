package defpackage;

import io.appmetrica.analytics.BuildConfig;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.JCP.tools.HexString;
import ru.CryptoPro.JCSP.CStructReader.BlobHeaderStructure;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.MSCAPI.MSException;
import ru.CryptoPro.reprov.array.DerValue;
import ru.cprocsp.NGate.tools.Constants;
import ru.yandex.video.m3.player.ui.debug.view.graph.DebugGraphView;

/* loaded from: classes7.dex */
public final class wv81 extends x771 {
    public final int h;
    public final int i;
    public final int j;
    public List n;
    public List o;
    public int p;
    public int q;
    public boolean r;
    public boolean s;
    public byte t;
    public byte u;
    public boolean w;
    public long x;
    public static final int[] y = {11, 1, 3, 12, 14, 5, 7, 9};
    public static final int[] z = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] A = {-1, DebugGraphView.DEFAULT_GRAPH_COLOR, -16776961, -16711681, -65536, -256, -65281};
    public static final int[] B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, HProv.PP_SET_PIN, 108, 109, 110, 111, 112, 113, 114, HProv.PP_CACHE_SIZE, BuildConfig.API_LEVEL, HProv.PP_NK_SYNC, HProv.PP_INFO, 119, 120, Constants.VPN_TRAFFIC, 122, 231, 247, 209, 241, 9632};
    public static final int[] C = {174, 176, 189, 191, 8482, 162, HProv.PP_HANDLE_COUNT, 9834, 224, 32, 232, 226, MSException.ERROR_MORE_DATA, 238, 244, 251};
    public static final int[] D = {193, 201, 211, HProv.PP_AUTH_INFO, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, HProv.PP_REFCOUNT, 187};
    public static final int[] E = {195, 227, 205, 204, 236, 210, 242, 213, 245, HProv.PP_PASSWD_TERM, HProv.PP_DELETE_KEYSET, 92, 94, 95, HProv.PP_SAME_MEDIA, HProv.PP_DELETE_SAVED_PASSWD, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    public static final boolean[] F = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    public final dl81 g = new dl81();
    public final ArrayList l = new ArrayList();
    public it81 m = new it81(0, 4);
    public int v = 0;
    public final long k = 16000000;

    public wv81(String str, int i) {
        this.h = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i == 1) {
            this.j = 0;
            this.i = 0;
        } else if (i == 2) {
            this.j = 1;
            this.i = 0;
        } else if (i == 3) {
            this.j = 0;
            this.i = 1;
        } else if (i != 4) {
            nba1.e();
            this.j = 0;
            this.i = 0;
        } else {
            this.j = 1;
            this.i = 1;
        }
        g(0);
        i();
        this.w = true;
        this.x = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:180:0x0083 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a A[SYNTHETIC] */
    @Override // defpackage.x771
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(q171 q171Var) {
        boolean z2;
        ByteBuffer byteBuffer = q171Var.c;
        byteBuffer.getClass();
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        dl81 dl81Var = this.g;
        dl81Var.a = array;
        dl81Var.c = limit;
        dl81Var.b = 0;
        boolean z3 = false;
        while (true) {
            int i = dl81Var.c - dl81Var.b;
            int i2 = this.h;
            if (i < i2) {
                if (z3) {
                    int i3 = this.p;
                    if (i3 == 1 || i3 == 3) {
                        this.n = h();
                        this.x = this.e;
                        return;
                    }
                    return;
                }
                return;
            }
            byte s = i2 == 2 ? (byte) -4 : (byte) dl81Var.s();
            int s2 = dl81Var.s();
            int s3 = dl81Var.s();
            if ((s & 2) == 0 && (s & 1) == this.i) {
                byte b = (byte) (s2 & HProv.PP_VERSION_TIMESTAMP);
                byte b2 = (byte) (s3 & HProv.PP_VERSION_TIMESTAMP);
                if (b != 0 || b2 != 0) {
                    boolean z4 = this.r;
                    if ((s & 4) == 4) {
                        boolean[] zArr = F;
                        if (zArr[s2] && zArr[s3]) {
                            z2 = true;
                            this.r = z2;
                            if (z2 || (b & 240) != 16) {
                                this.s = false;
                            } else if (this.s && this.t == b && this.u == b2) {
                                this.s = false;
                            } else {
                                this.s = true;
                                this.t = b;
                                this.u = b2;
                            }
                            if (!z2) {
                                if (1 <= b && b <= 15) {
                                    this.w = false;
                                } else if ((b & 247) == 20) {
                                    if (b2 != 32 && b2 != 47) {
                                        switch (b2) {
                                            default:
                                                switch (b2) {
                                                    case 42:
                                                    case 43:
                                                        this.w = false;
                                                        break;
                                                }
                                            case 37:
                                            case 38:
                                            case 39:
                                                this.w = true;
                                                break;
                                        }
                                    }
                                    this.w = true;
                                }
                                if (this.w) {
                                    int i4 = b & 224;
                                    if (i4 == 0) {
                                        this.v = (b >> 3) & 1;
                                    }
                                    if (this.v == this.j) {
                                        if (i4 == 0) {
                                            int i5 = b & 247;
                                            if (i5 == 17 && (b2 & 240) == 48) {
                                                it81 it81Var = this.m;
                                                char c = (char) C[b2 & PKIBody._CCP];
                                                if (it81Var.c.length() < 32) {
                                                    it81Var.c.append(c);
                                                }
                                            } else {
                                                int i6 = b & 246;
                                                if (i6 == 18 && (b2 & 224) == 32) {
                                                    this.m.b();
                                                    it81 it81Var2 = this.m;
                                                    char c2 = (char) ((b & 1) == 0 ? D[b2 & 31] : E[b2 & 31]);
                                                    if (it81Var2.c.length() < 32) {
                                                        it81Var2.c.append(c2);
                                                    }
                                                } else if (i5 == 17 && (b2 & 240) == 32) {
                                                    it81 it81Var3 = this.m;
                                                    if (it81Var3.c.length() < 32) {
                                                        it81Var3.c.append(HexString.CHAR_SPACE);
                                                    }
                                                    boolean z5 = (b2 & 1) == 1;
                                                    it81 it81Var4 = this.m;
                                                    it81Var4.a.add(new fq81((b2 >> 1) & 7, it81Var4.c.length(), z5));
                                                } else if ((b & 240) == 16 && (b2 & DerValue.TAG_PRIVATE) == 64) {
                                                    int i7 = y[b & 7];
                                                    if ((b2 & BlobHeaderStructure.BLOB_VERSION) != 0) {
                                                        i7++;
                                                    }
                                                    it81 it81Var5 = this.m;
                                                    if (i7 != it81Var5.d) {
                                                        if (this.p != 1 && (!it81Var5.a.isEmpty() || !it81Var5.b.isEmpty() || it81Var5.c.length() != 0)) {
                                                            it81 it81Var6 = new it81(this.p, this.q);
                                                            this.m = it81Var6;
                                                            this.l.add(it81Var6);
                                                        }
                                                        this.m.d = i7;
                                                    }
                                                    boolean z6 = (b2 & PKIBody._CKUANN) == 16;
                                                    boolean z7 = (b2 & 1) == 1;
                                                    int i8 = (b2 >> 1) & 7;
                                                    it81 it81Var7 = this.m;
                                                    it81Var7.a.add(new fq81(z6 ? 8 : i8, it81Var7.c.length(), z7));
                                                    if (z6) {
                                                        this.m.e = z[i8];
                                                    }
                                                } else if (i5 == 23 && b2 >= 33 && b2 <= 35) {
                                                    this.m.f = b2 - 32;
                                                } else if (i6 == 20 && (b2 & 240) == 32) {
                                                    if (b2 == 32) {
                                                        g(2);
                                                    } else if (b2 != 41) {
                                                        switch (b2) {
                                                            case 37:
                                                                g(1);
                                                                this.q = 2;
                                                                this.m.h = 2;
                                                                break;
                                                            case 38:
                                                                g(1);
                                                                this.q = 3;
                                                                this.m.h = 3;
                                                                break;
                                                            case 39:
                                                                g(1);
                                                                this.q = 4;
                                                                this.m.h = 4;
                                                                break;
                                                            default:
                                                                int i9 = this.p;
                                                                if (i9 != 0) {
                                                                    if (b2 == 33) {
                                                                        this.m.b();
                                                                        break;
                                                                    } else {
                                                                        switch (b2) {
                                                                            case 44:
                                                                                this.n = Collections.EMPTY_LIST;
                                                                                if (i9 == 1 || i9 == 3) {
                                                                                    i();
                                                                                    break;
                                                                                }
                                                                            case 45:
                                                                                if (i9 == 1) {
                                                                                    it81 it81Var8 = this.m;
                                                                                    if (!it81Var8.a.isEmpty() || !it81Var8.b.isEmpty() || it81Var8.c.length() != 0) {
                                                                                        it81 it81Var9 = this.m;
                                                                                        ArrayList arrayList = it81Var9.b;
                                                                                        arrayList.add(it81Var9.c());
                                                                                        it81Var9.c.setLength(0);
                                                                                        it81Var9.a.clear();
                                                                                        int min = Math.min(it81Var9.h, it81Var9.d);
                                                                                        while (arrayList.size() >= min) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                i();
                                                                                break;
                                                                            case 47:
                                                                                this.n = h();
                                                                                i();
                                                                                break;
                                                                        }
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        g(3);
                                                    }
                                                }
                                            }
                                        } else {
                                            it81 it81Var10 = this.m;
                                            int[] iArr = B;
                                            char c3 = (char) iArr[(b & Byte.MAX_VALUE) - 32];
                                            if (it81Var10.c.length() < 32) {
                                                it81Var10.c.append(c3);
                                            }
                                            if ((b2 & 224) != 0) {
                                                it81 it81Var11 = this.m;
                                                char c4 = (char) iArr[(b2 & Byte.MAX_VALUE) - 32];
                                                if (it81Var11.c.length() < 32) {
                                                    it81Var11.c.append(c4);
                                                }
                                            }
                                        }
                                        z3 = true;
                                    }
                                }
                            } else if (z4) {
                                i();
                                z3 = true;
                            }
                        }
                    }
                    z2 = false;
                    this.r = z2;
                    if (z2) {
                    }
                    this.s = false;
                    if (!z2) {
                    }
                }
            }
        }
    }

    @Override // defpackage.x771
    public final shu d() {
        List list = this.n;
        this.o = list;
        list.getClass();
        return new shu(list, 1);
    }

    @Override // defpackage.x771, defpackage.c581
    /* renamed from: e */
    public final rw81 a() {
        rw81 rw81Var;
        rw81 a = super.a();
        if (a != null) {
            return a;
        }
        long j = this.k;
        if (j == -9223372036854775807L) {
            return null;
        }
        long j2 = this.x;
        if (j2 == -9223372036854775807L || this.e - j2 < j || (rw81Var = (rw81) this.b.pollFirst()) == null) {
            return null;
        }
        this.n = Collections.EMPTY_LIST;
        this.x = -9223372036854775807L;
        shu d = d();
        long j3 = this.e;
        rw81Var.b = j3;
        rw81Var.c = d;
        rw81Var.w = j3;
        return rw81Var;
    }

    @Override // defpackage.x771
    public final boolean f() {
        return this.n != this.o;
    }

    @Override // defpackage.x771, defpackage.c581
    public final void flush() {
        super.flush();
        this.n = null;
        this.o = null;
        g(0);
        this.q = 4;
        this.m.h = 4;
        i();
        this.r = false;
        this.s = false;
        this.t = (byte) 0;
        this.u = (byte) 0;
        this.v = 0;
        this.w = true;
        this.x = -9223372036854775807L;
    }

    public final void g(int i) {
        int i2 = this.p;
        if (i2 == i) {
            return;
        }
        this.p = i;
        if (i != 3) {
            i();
            if (i2 == 3 || i == 1 || i == 0) {
                this.n = Collections.EMPTY_LIST;
                return;
            }
            return;
        }
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.l;
            if (i3 >= arrayList.size()) {
                return;
            }
            ((it81) arrayList.get(i3)).g = i;
            i3++;
        }
    }

    public final ArrayList h() {
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int i = 2;
        for (int i2 = 0; i2 < size; i2++) {
            r871 a = ((it81) arrayList.get(i2)).a(Integer.MIN_VALUE);
            arrayList2.add(a);
            if (a != null) {
                i = Math.min(i, a.B);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            r871 r871Var = (r871) arrayList2.get(i3);
            if (r871Var != null) {
                if (r871Var.B != i) {
                    r871Var = ((it81) arrayList.get(i3)).a(i);
                    r871Var.getClass();
                }
                arrayList3.add(r871Var);
            }
        }
        return arrayList3;
    }

    public final void i() {
        it81 it81Var = this.m;
        it81Var.g = this.p;
        it81Var.a.clear();
        it81Var.b.clear();
        it81Var.c.setLength(0);
        it81Var.d = 15;
        it81Var.e = 0;
        it81Var.f = 0;
        ArrayList arrayList = this.l;
        arrayList.clear();
        arrayList.add(this.m);
    }

    @Override // defpackage.x771, defpackage.c581
    public final void release() {
    }
}
