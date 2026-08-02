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

/* loaded from: classes10.dex */
public final class x59 extends e69 {
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
    public static final int[] B = {-1, DebugGraphView.DEFAULT_GRAPH_COLOR, -16776961, -16711681, -65536, -256, -65281};
    public static final int[] C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, HProv.PP_SET_PIN, 108, 109, 110, 111, 112, 113, 114, HProv.PP_CACHE_SIZE, BuildConfig.API_LEVEL, HProv.PP_NK_SYNC, HProv.PP_INFO, 119, 120, Constants.VPN_TRAFFIC, 122, 231, 247, 209, 241, 9632};
    public static final int[] D = {174, 176, 189, 191, 8482, 162, HProv.PP_HANDLE_COUNT, 9834, 224, 32, 232, 226, MSException.ERROR_MORE_DATA, 238, 244, 251};
    public static final int[] E = {193, 201, 211, HProv.PP_AUTH_INFO, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, HProv.PP_REFCOUNT, 187};
    public static final int[] F = {195, 227, 205, 204, 236, 210, 242, 213, 245, HProv.PP_PASSWD_TERM, HProv.PP_DELETE_KEYSET, 92, 94, 95, HProv.PP_SAME_MEDIA, HProv.PP_DELETE_SAVED_PASSWD, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    public static final boolean[] G = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    public final ef90 h = new ef90();
    public final ArrayList m = new ArrayList();
    public w59 n = new w59(0, 4);
    public int w = 0;
    public final long l = 16000000;

    public x59(String str, int i) {
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
            lk91.j("Invalid channel. Defaulting to CC1.");
            this.k = 0;
            this.j = 0;
        } else {
            this.k = 1;
            this.j = 1;
        }
        l(0);
        k();
        this.x = true;
        this.y = -9223372036854775807L;
    }

    @Override // defpackage.e69
    public final f69 b() {
        List list = this.o;
        this.p = list;
        list.getClass();
        return new f69(list, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x007e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0085 A[SYNTHETIC] */
    @Override // defpackage.e69
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(c69 c69Var) {
        boolean z2;
        ByteBuffer byteBuffer = c69Var.w;
        byteBuffer.getClass();
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        ef90 ef90Var = this.h;
        ef90Var.I(limit, array);
        boolean z3 = false;
        while (true) {
            int a = ef90Var.a();
            int i = this.i;
            if (a < i) {
                if (z3) {
                    int i2 = this.q;
                    if (i2 == 1 || i2 == 3) {
                        this.o = j();
                        this.y = this.e;
                        return;
                    }
                    return;
                }
                return;
            }
            int y = i == 2 ? -4 : ef90Var.y();
            int y2 = ef90Var.y();
            int y3 = ef90Var.y();
            if ((y & 2) == 0 && (y & 1) == this.j) {
                byte b = (byte) (y2 & HProv.PP_VERSION_TIMESTAMP);
                byte b2 = (byte) (y3 & HProv.PP_VERSION_TIMESTAMP);
                if (b != 0 || b2 != 0) {
                    boolean z4 = this.s;
                    if ((y & 4) == 4) {
                        boolean[] zArr = G;
                        if (zArr[y2] && zArr[y3]) {
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
                                                    case 43:
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
                                                this.n.a((char) D[b2 & PKIBody._CCP]);
                                            } else {
                                                int i5 = b & 246;
                                                if (i5 == 18 && (b2 & 224) == 32) {
                                                    this.n.b();
                                                    this.n.a((char) ((b & 1) == 0 ? E[b2 & 31] : F[b2 & 31]));
                                                } else if (i4 == 17 && (b2 & 240) == 32) {
                                                    this.n.a(HexString.CHAR_SPACE);
                                                    boolean z5 = (b2 & 1) == 1;
                                                    w59 w59Var = this.n;
                                                    w59Var.a.add(new v59((b2 >> 1) & 7, z5, w59Var.c.length()));
                                                } else if ((b & 240) == 16 && (b2 & DerValue.TAG_PRIVATE) == 64) {
                                                    int i6 = z[b & 7];
                                                    if ((b2 & BlobHeaderStructure.BLOB_VERSION) != 0) {
                                                        i6++;
                                                    }
                                                    w59 w59Var2 = this.n;
                                                    if (i6 != w59Var2.d) {
                                                        if (this.q != 1 && !w59Var2.e()) {
                                                            w59 w59Var3 = new w59(this.q, this.r);
                                                            this.n = w59Var3;
                                                            this.m.add(w59Var3);
                                                        }
                                                        this.n.d = i6;
                                                    }
                                                    boolean z6 = (b2 & PKIBody._CKUANN) == 16;
                                                    boolean z7 = (b2 & 1) == 1;
                                                    int i7 = (b2 >> 1) & 7;
                                                    w59 w59Var4 = this.n;
                                                    w59Var4.a.add(new v59(z6 ? 8 : i7, z7, w59Var4.c.length()));
                                                    if (z6) {
                                                        this.n.e = A[i7];
                                                    }
                                                } else if (i4 == 23 && b2 >= 33 && b2 <= 35) {
                                                    this.n.f = b2 - 32;
                                                } else if (i5 == 20 && (b2 & 240) == 32) {
                                                    if (b2 == 32) {
                                                        l(2);
                                                    } else if (b2 != 41) {
                                                        switch (b2) {
                                                            case 37:
                                                                l(1);
                                                                this.r = 2;
                                                                this.n.h = 2;
                                                                break;
                                                            case 38:
                                                                l(1);
                                                                this.r = 3;
                                                                this.n.h = 3;
                                                                break;
                                                            case 39:
                                                                l(1);
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
                                                                            case 44:
                                                                                this.o = Collections.EMPTY_LIST;
                                                                                if (i8 == 1 || i8 == 3) {
                                                                                    k();
                                                                                    break;
                                                                                }
                                                                            case 45:
                                                                                if (i8 == 1 && !this.n.e()) {
                                                                                    w59 w59Var5 = this.n;
                                                                                    ArrayList arrayList = w59Var5.b;
                                                                                    arrayList.add(w59Var5.d());
                                                                                    w59Var5.c.setLength(0);
                                                                                    w59Var5.a.clear();
                                                                                    int min = Math.min(w59Var5.h, w59Var5.d);
                                                                                    while (arrayList.size() >= min) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                k();
                                                                                break;
                                                                            case 47:
                                                                                this.o = j();
                                                                                k();
                                                                                break;
                                                                        }
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        l(3);
                                                    }
                                                }
                                            }
                                        } else {
                                            w59 w59Var6 = this.n;
                                            int[] iArr = C;
                                            w59Var6.a((char) iArr[(b & Byte.MAX_VALUE) - 32]);
                                            if ((b2 & 224) != 0) {
                                                this.n.a((char) iArr[(b2 & Byte.MAX_VALUE) - 32]);
                                            }
                                        }
                                        z3 = true;
                                    }
                                }
                            } else if (z4) {
                                k();
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

    @Override // defpackage.e69, defpackage.jyg
    public final void flush() {
        super.flush();
        this.o = null;
        this.p = null;
        l(0);
        this.r = 4;
        this.n.h = 4;
        k();
        this.s = false;
        this.t = false;
        this.u = (byte) 0;
        this.v = (byte) 0;
        this.w = 0;
        this.x = true;
        this.y = -9223372036854775807L;
    }

    @Override // defpackage.e69, defpackage.jyg
    /* renamed from: h */
    public final l2v0 g() {
        l2v0 l2v0Var;
        l2v0 g = super.g();
        if (g != null) {
            return g;
        }
        long j = this.l;
        if (j == -9223372036854775807L) {
            return null;
        }
        long j2 = this.y;
        if (j2 == -9223372036854775807L || this.e - j2 < j || (l2v0Var = (l2v0) this.b.pollFirst()) == null) {
            return null;
        }
        this.o = Collections.EMPTY_LIST;
        this.y = -9223372036854775807L;
        f69 b = b();
        long j3 = this.e;
        l2v0Var.b = j3;
        l2v0Var.w = b;
        l2v0Var.x = j3;
        return l2v0Var;
    }

    @Override // defpackage.e69
    public final boolean i() {
        return this.o != this.p;
    }

    public final ArrayList j() {
        ArrayList arrayList = this.m;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int i = 2;
        for (int i2 = 0; i2 < size; i2++) {
            odf c = ((w59) arrayList.get(i2)).c(Integer.MIN_VALUE);
            arrayList2.add(c);
            if (c != null) {
                i = Math.min(i, c.i);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            odf odfVar = (odf) arrayList2.get(i3);
            if (odfVar != null) {
                if (odfVar.i != i) {
                    odfVar = ((w59) arrayList.get(i3)).c(i);
                    odfVar.getClass();
                }
                arrayList3.add(odfVar);
            }
        }
        return arrayList3;
    }

    public final void k() {
        w59 w59Var = this.n;
        w59Var.g = this.q;
        w59Var.a.clear();
        w59Var.b.clear();
        w59Var.c.setLength(0);
        w59Var.d = 15;
        w59Var.e = 0;
        w59Var.f = 0;
        ArrayList arrayList = this.m;
        arrayList.clear();
        arrayList.add(this.n);
    }

    public final void l(int i) {
        int i2 = this.q;
        if (i2 == i) {
            return;
        }
        this.q = i;
        if (i != 3) {
            k();
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
            ((w59) arrayList.get(i3)).g = i;
            i3++;
        }
    }

    @Override // defpackage.e69, defpackage.jyg
    public final void release() {
    }
}
