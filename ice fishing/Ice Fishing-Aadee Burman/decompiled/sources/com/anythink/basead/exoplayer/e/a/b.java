package com.anythink.basead.exoplayer.e.a;

import android.util.Log;
import android.util.Pair;
import com.anythink.basead.exoplayer.e.a.a;
import com.anythink.basead.exoplayer.e.a.d;
import com.anythink.basead.exoplayer.g.a;
import com.anythink.basead.exoplayer.k.af;
import com.anythink.basead.exoplayer.k.o;
import com.anythink.basead.exoplayer.k.p;
import com.anythink.basead.exoplayer.k.s;
import com.anythink.basead.exoplayer.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f6944a = "AtomParsers";

    /* renamed from: b, reason: collision with root package name */
    private static final int f6945b = af.f("vide");

    /* renamed from: c, reason: collision with root package name */
    private static final int f6946c = af.f("soun");

    /* renamed from: d, reason: collision with root package name */
    private static final int f6947d = af.f(o.f8446c);

    /* renamed from: e, reason: collision with root package name */
    private static final int f6948e = af.f("sbtl");

    /* renamed from: f, reason: collision with root package name */
    private static final int f6949f = af.f("subt");

    /* renamed from: g, reason: collision with root package name */
    private static final int f6950g = af.f("clcp");

    /* renamed from: h, reason: collision with root package name */
    private static final int f6951h = af.f("meta");
    private static final int i = 3;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f6952a;

        /* renamed from: b, reason: collision with root package name */
        public int f6953b;

        /* renamed from: c, reason: collision with root package name */
        public int f6954c;

        /* renamed from: d, reason: collision with root package name */
        public long f6955d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f6956e;

        /* renamed from: f, reason: collision with root package name */
        private final s f6957f;

        /* renamed from: g, reason: collision with root package name */
        private final s f6958g;

        /* renamed from: h, reason: collision with root package name */
        private int f6959h;
        private int i;

        public a(s sVar, s sVar2, boolean z3) {
            this.f6958g = sVar;
            this.f6957f = sVar2;
            this.f6956e = z3;
            sVar2.c(12);
            this.f6952a = sVar2.m();
            sVar.c(12);
            this.i = sVar.m();
            com.anythink.basead.exoplayer.k.a.b(sVar.i() == 1, "first_chunk must be 1");
            this.f6953b = -1;
        }

        public final boolean a() {
            int i = this.f6953b + 1;
            this.f6953b = i;
            if (i == this.f6952a) {
                return false;
            }
            this.f6955d = this.f6956e ? this.f6957f.n() : this.f6957f.h();
            if (this.f6953b == this.f6959h) {
                this.f6954c = this.f6958g.m();
                this.f6958g.d(4);
                int i6 = this.i - 1;
                this.i = i6;
                this.f6959h = i6 > 0 ? this.f6958g.m() - 1 : -1;
            }
            return true;
        }
    }

    /* renamed from: com.anythink.basead.exoplayer.e.a.b$b, reason: collision with other inner class name */
    public interface InterfaceC0022b {
        int a();

        int b();

        boolean c();
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public static final int f6960a = 8;

        /* renamed from: b, reason: collision with root package name */
        public final k[] f6961b;

        /* renamed from: c, reason: collision with root package name */
        public com.anythink.basead.exoplayer.m f6962c;

        /* renamed from: d, reason: collision with root package name */
        public int f6963d;

        /* renamed from: e, reason: collision with root package name */
        public int f6964e = 0;

        public c(int i) {
            this.f6961b = new k[i];
        }
    }

    public static final class d implements InterfaceC0022b {

        /* renamed from: a, reason: collision with root package name */
        private final int f6965a;

        /* renamed from: b, reason: collision with root package name */
        private final int f6966b;

        /* renamed from: c, reason: collision with root package name */
        private final s f6967c;

        public d(a.b bVar) {
            s sVar = bVar.aV;
            this.f6967c = sVar;
            sVar.c(12);
            this.f6965a = sVar.m();
            this.f6966b = sVar.m();
        }

        @Override // com.anythink.basead.exoplayer.e.a.b.InterfaceC0022b
        public final int a() {
            return this.f6966b;
        }

        @Override // com.anythink.basead.exoplayer.e.a.b.InterfaceC0022b
        public final int b() {
            int i = this.f6965a;
            return i == 0 ? this.f6967c.m() : i;
        }

        @Override // com.anythink.basead.exoplayer.e.a.b.InterfaceC0022b
        public final boolean c() {
            return this.f6965a != 0;
        }
    }

    public static final class e implements InterfaceC0022b {

        /* renamed from: a, reason: collision with root package name */
        private final s f6968a;

        /* renamed from: b, reason: collision with root package name */
        private final int f6969b;

        /* renamed from: c, reason: collision with root package name */
        private final int f6970c;

        /* renamed from: d, reason: collision with root package name */
        private int f6971d;

        /* renamed from: e, reason: collision with root package name */
        private int f6972e;

        public e(a.b bVar) {
            s sVar = bVar.aV;
            this.f6968a = sVar;
            sVar.c(12);
            this.f6970c = sVar.m() & p.f8473b;
            this.f6969b = sVar.m();
        }

        @Override // com.anythink.basead.exoplayer.e.a.b.InterfaceC0022b
        public final int a() {
            return this.f6969b;
        }

        @Override // com.anythink.basead.exoplayer.e.a.b.InterfaceC0022b
        public final int b() {
            int i = this.f6970c;
            if (i == 8) {
                return this.f6968a.d();
            }
            if (i == 16) {
                return this.f6968a.e();
            }
            int i6 = this.f6971d;
            this.f6971d = i6 + 1;
            if (i6 % 2 != 0) {
                return this.f6972e & 15;
            }
            int d2 = this.f6968a.d();
            this.f6972e = d2;
            return (d2 & 240) >> 4;
        }

        @Override // com.anythink.basead.exoplayer.e.a.b.InterfaceC0022b
        public final boolean c() {
            return false;
        }
    }

    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        private final int f6973a;

        /* renamed from: b, reason: collision with root package name */
        private final long f6974b;

        /* renamed from: c, reason: collision with root package name */
        private final int f6975c;

        public f(int i, long j6, int i6) {
            this.f6973a = i;
            this.f6974b = j6;
            this.f6975c = i6;
        }
    }

    public static final class g extends t {
    }

    private b() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0096, code lost:
    
        if (r11 == 0) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0046 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static j a(a.C0021a c0021a, a.b bVar, long j6, com.anythink.basead.exoplayer.d.e eVar, boolean z3, boolean z6) {
        int i6;
        int i9;
        long j9;
        j jVar;
        long j10;
        long[] jArr;
        long[] jArr2;
        a.C0021a e9 = c0021a.e(com.anythink.basead.exoplayer.e.a.a.J);
        s sVar = e9.d(com.anythink.basead.exoplayer.e.a.a.f6917X).aV;
        sVar.c(16);
        int i10 = sVar.i();
        if (i10 == f6946c) {
            i6 = 1;
        } else if (i10 == f6945b) {
            i6 = 2;
        } else {
            if (i10 != f6947d && i10 != f6948e && i10 != f6949f && i10 != f6950g) {
                i9 = i10 == f6951h ? 4 : -1;
                j jVar2 = null;
                if (i9 != -1) {
                    return null;
                }
                s sVar2 = c0021a.d(com.anythink.basead.exoplayer.e.a.a.f6913T).aV;
                sVar2.c(8);
                int a9 = com.anythink.basead.exoplayer.e.a.a.a(sVar2.i());
                sVar2.d(a9 == 0 ? 8 : 16);
                int i11 = sVar2.i();
                sVar2.d(4);
                int c9 = sVar2.c();
                int i12 = a9 == 0 ? 4 : 8;
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    j9 = com.anythink.basead.exoplayer.b.f6382b;
                    if (i14 >= i12) {
                        jVar = jVar2;
                        sVar2.d(i12);
                        break;
                    }
                    jVar = jVar2;
                    if (sVar2.f8502a[c9 + i14] != -1) {
                        j10 = a9 == 0 ? sVar2.h() : sVar2.n();
                    } else {
                        i14++;
                        jVar2 = jVar;
                    }
                }
                j10 = -9223372036854775807L;
                sVar2.d(16);
                int i15 = sVar2.i();
                int i16 = sVar2.i();
                sVar2.d(4);
                int i17 = sVar2.i();
                int i18 = sVar2.i();
                if (i15 == 0 && i16 == 65536 && i17 == -65536 && i18 == 0) {
                    i13 = 90;
                } else if (i15 == 0 && i16 == -65536 && i17 == 65536 && i18 == 0) {
                    i13 = 270;
                } else if (i15 == -65536 && i16 == 0 && i17 == 0 && i18 == -65536) {
                    i13 = 180;
                }
                f fVar = new f(i11, j10, i13);
                long j11 = j6 == com.anythink.basead.exoplayer.b.f6382b ? fVar.f6974b : j6;
                s sVar3 = bVar.aV;
                sVar3.c(8);
                sVar3.d(com.anythink.basead.exoplayer.e.a.a.a(sVar3.i()) == 0 ? 8 : 16);
                long h9 = sVar3.h();
                if (j11 != com.anythink.basead.exoplayer.b.f6382b) {
                    j9 = af.a(j11, 1000000L, h9);
                }
                long j12 = j9;
                a.C0021a e10 = e9.e(com.anythink.basead.exoplayer.e.a.a.f6904K).e(com.anythink.basead.exoplayer.e.a.a.f6905L);
                s sVar4 = e9.d(com.anythink.basead.exoplayer.e.a.a.f6916W).aV;
                sVar4.c(8);
                int a10 = com.anythink.basead.exoplayer.e.a.a.a(sVar4.i());
                sVar4.d(a10 == 0 ? 8 : 16);
                long h10 = sVar4.h();
                sVar4.d(a10 != 0 ? 8 : 4);
                int e11 = sVar4.e();
                StringBuilder sb = new StringBuilder();
                sb.append((char) (((e11 >> 10) & 31) + 96));
                sb.append((char) (((e11 >> 5) & 31) + 96));
                sb.append((char) ((e11 & 31) + 96));
                Pair create = Pair.create(Long.valueOf(h10), sb.toString());
                c a11 = a(e10.d(com.anythink.basead.exoplayer.e.a.a.Y).aV, fVar.f6973a, fVar.f6975c, (String) create.second, eVar, z6);
                if (z3) {
                    j jVar3 = jVar;
                    jArr = jVar3;
                    jArr2 = jVar3;
                } else {
                    Pair<long[], long[]> a12 = a(c0021a.e(com.anythink.basead.exoplayer.e.a.a.f6914U));
                    long[] jArr3 = (long[]) a12.first;
                    jArr = (long[]) a12.second;
                    jArr2 = jArr3;
                }
                return a11.f6962c == null ? jVar : new j(fVar.f6973a, i9, ((Long) create.first).longValue(), h9, j12, a11.f6962c, a11.f6964e, a11.f6961b, a11.f6963d, jArr2, jArr);
            }
            i6 = 3;
        }
        i9 = i6;
        j jVar22 = null;
        if (i9 != -1) {
        }
    }

    private static com.anythink.basead.exoplayer.g.a b(s sVar, int i6) {
        sVar.d(8);
        ArrayList arrayList = new ArrayList();
        while (sVar.c() < i6) {
            a.InterfaceC0025a a9 = com.anythink.basead.exoplayer.e.a.f.a(sVar);
            if (a9 != null) {
                arrayList.add(a9);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new com.anythink.basead.exoplayer.g.a(arrayList);
    }

    private static int c(s sVar) {
        sVar.c(16);
        int i6 = sVar.i();
        if (i6 == f6946c) {
            return 1;
        }
        if (i6 == f6945b) {
            return 2;
        }
        if (i6 == f6947d || i6 == f6948e || i6 == f6949f || i6 == f6950g) {
            return 3;
        }
        return i6 == f6951h ? 4 : -1;
    }

    private static Pair<Long, String> d(s sVar) {
        sVar.c(8);
        int a9 = com.anythink.basead.exoplayer.e.a.a.a(sVar.i());
        sVar.d(a9 == 0 ? 8 : 16);
        long h9 = sVar.h();
        sVar.d(a9 == 0 ? 4 : 8);
        int e9 = sVar.e();
        StringBuilder sb = new StringBuilder();
        sb.append((char) (((e9 >> 10) & 31) + 96));
        sb.append((char) (((e9 >> 5) & 31) + 96));
        sb.append((char) ((e9 & 31) + 96));
        return Pair.create(Long.valueOf(h9), sb.toString());
    }

    private static int e(s sVar) {
        int d2 = sVar.d();
        int i6 = d2 & com.anythink.expressad.video.module.a.a.f21728R;
        while ((d2 & 128) == 128) {
            d2 = sVar.d();
            i6 = (i6 << 7) | (d2 & com.anythink.expressad.video.module.a.a.f21728R);
        }
        return i6;
    }

    private static f b(s sVar) {
        long j6;
        sVar.c(8);
        int a9 = com.anythink.basead.exoplayer.e.a.a.a(sVar.i());
        sVar.d(a9 == 0 ? 8 : 16);
        int i6 = sVar.i();
        sVar.d(4);
        int c9 = sVar.c();
        int i9 = a9 == 0 ? 4 : 8;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            j6 = com.anythink.basead.exoplayer.b.f6382b;
            if (i11 < i9) {
                if (sVar.f8502a[c9 + i11] != -1) {
                    long h9 = a9 == 0 ? sVar.h() : sVar.n();
                    if (h9 != 0) {
                        j6 = h9;
                    }
                } else {
                    i11++;
                }
            } else {
                sVar.d(i9);
                break;
            }
        }
        sVar.d(16);
        int i12 = sVar.i();
        int i13 = sVar.i();
        sVar.d(4);
        int i14 = sVar.i();
        int i15 = sVar.i();
        if (i12 == 0 && i13 == 65536 && i14 == -65536 && i15 == 0) {
            i10 = 90;
        } else if (i12 == 0 && i13 == -65536 && i14 == 65536 && i15 == 0) {
            i10 = 270;
        } else if (i12 == -65536 && i13 == 0 && i14 == 0 && i15 == -65536) {
            i10 = 180;
        }
        return new f(i6, j6, i10);
    }

    private static float c(s sVar, int i6) {
        sVar.c(i6 + 8);
        return sVar.m() / sVar.m();
    }

    private static Pair<Integer, k> c(s sVar, int i6, int i9) {
        int i10 = i6 + 8;
        int i11 = -1;
        int i12 = 0;
        String str = null;
        Integer num = null;
        while (i10 - i6 < i9) {
            sVar.c(i10);
            int i13 = sVar.i();
            int i14 = sVar.i();
            if (i14 == com.anythink.basead.exoplayer.e.a.a.ag) {
                num = Integer.valueOf(sVar.i());
            } else if (i14 == com.anythink.basead.exoplayer.e.a.a.ab) {
                sVar.d(4);
                str = sVar.o();
            } else if (i14 == com.anythink.basead.exoplayer.e.a.a.ac) {
                i11 = i10;
                i12 = i13;
            }
            i10 += i13;
        }
        if (!com.anythink.basead.exoplayer.b.bd.equals(str) && !com.anythink.basead.exoplayer.b.be.equals(str) && !com.anythink.basead.exoplayer.b.bf.equals(str) && !com.anythink.basead.exoplayer.b.bg.equals(str)) {
            return null;
        }
        com.anythink.basead.exoplayer.k.a.a(num != null, "frma atom is mandatory");
        com.anythink.basead.exoplayer.k.a.a(i11 != -1, "schi atom is mandatory");
        k a9 = a(sVar, i11, i12, str);
        com.anythink.basead.exoplayer.k.a.a(a9 != null, "tenc atom is mandatory");
        return Pair.create(num, a9);
    }

    private static Pair<String, byte[]> d(s sVar, int i6) {
        sVar.c(i6 + 12);
        sVar.d(1);
        e(sVar);
        sVar.d(2);
        int d2 = sVar.d();
        if ((d2 & 128) != 0) {
            sVar.d(2);
        }
        if ((d2 & 64) != 0) {
            sVar.d(sVar.e());
        }
        if ((d2 & 32) != 0) {
            sVar.d(2);
        }
        sVar.d(1);
        e(sVar);
        String a9 = o.a(sVar.d());
        if (!o.f8462t.equals(a9) && !o.f8423D.equals(a9) && !o.f8424E.equals(a9)) {
            sVar.d(12);
            sVar.d(1);
            int e9 = e(sVar);
            byte[] bArr = new byte[e9];
            sVar.a(bArr, 0, e9);
            return Pair.create(a9, bArr);
        }
        return Pair.create(a9, null);
    }

    private static Pair<Integer, k> b(s sVar, int i6, int i9) {
        Pair<Integer, k> c9;
        int c10 = sVar.c();
        while (c10 - i6 < i9) {
            sVar.c(c10);
            int i10 = sVar.i();
            com.anythink.basead.exoplayer.k.a.a(i10 > 0, "childAtomSize should be positive");
            if (sVar.i() == com.anythink.basead.exoplayer.e.a.a.aa && (c9 = c(sVar, c10, i10)) != null) {
                return c9;
            }
            c10 += i10;
        }
        return null;
    }

    private static byte[] d(s sVar, int i6, int i9) {
        int i10 = i6 + 8;
        while (i10 - i6 < i9) {
            sVar.c(i10);
            int i11 = sVar.i();
            if (sVar.i() == com.anythink.basead.exoplayer.e.a.a.aO) {
                return Arrays.copyOfRange(sVar.f8502a, i10, i11 + i10);
            }
            i10 += i11;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:205:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x022a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static m a(j jVar, a.C0021a c0021a, com.anythink.basead.exoplayer.e.i iVar) {
        InterfaceC0022b eVar;
        boolean z3;
        int i6;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        int[] iArr2;
        long j6;
        int i15;
        long a9;
        int[] iArr3;
        long[] jArr3;
        String str;
        long j9;
        int[] iArr4;
        int i16;
        String str2;
        a.b d2 = c0021a.d(com.anythink.basead.exoplayer.e.a.a.av);
        if (d2 != null) {
            eVar = new d(d2);
        } else {
            a.b d9 = c0021a.d(com.anythink.basead.exoplayer.e.a.a.aw);
            if (d9 != null) {
                eVar = new e(d9);
            } else {
                throw new t("Track has no sample table size information");
            }
        }
        int a10 = eVar.a();
        if (a10 == 0) {
            return new m(jVar, new long[0], new int[0], 0, new long[0], new int[0], com.anythink.basead.exoplayer.b.f6382b);
        }
        a.b d10 = c0021a.d(com.anythink.basead.exoplayer.e.a.a.ax);
        if (d10 == null) {
            d10 = c0021a.d(com.anythink.basead.exoplayer.e.a.a.ay);
            z3 = true;
        } else {
            z3 = false;
        }
        s sVar = d10.aV;
        s sVar2 = c0021a.d(com.anythink.basead.exoplayer.e.a.a.au).aV;
        s sVar3 = c0021a.d(com.anythink.basead.exoplayer.e.a.a.ar).aV;
        a.b d11 = c0021a.d(com.anythink.basead.exoplayer.e.a.a.as);
        s sVar4 = null;
        s sVar5 = d11 != null ? d11.aV : null;
        a.b d12 = c0021a.d(com.anythink.basead.exoplayer.e.a.a.at);
        s sVar6 = d12 != null ? d12.aV : null;
        a aVar = new a(sVar2, sVar, z3);
        sVar3.c(12);
        int m4 = sVar3.m() - 1;
        int m9 = sVar3.m();
        int m10 = sVar3.m();
        if (sVar6 != null) {
            sVar6.c(12);
            i6 = sVar6.m();
        } else {
            i6 = 0;
        }
        if (sVar5 != null) {
            sVar5.c(12);
            i9 = sVar5.m();
            r16 = i9 > 0 ? sVar5.m() - 1 : -1;
            if (eVar.c()) {
                i10 = 0;
            } else {
                i10 = 0;
                if (o.f8465w.equals(jVar.f7117h.f8665h) && m4 == 0 && i6 == 0 && i9 == 0) {
                    i11 = 1;
                    String str3 = f6944a;
                    if (i11 == 0) {
                        long[] jArr4 = new long[a10];
                        i13 = 1;
                        int[] iArr5 = new int[a10];
                        s sVar7 = sVar6;
                        long[] jArr5 = new long[a10];
                        int[] iArr6 = new int[a10];
                        int i17 = r16;
                        InterfaceC0022b interfaceC0022b = eVar;
                        int i18 = i10;
                        int i19 = i18;
                        int i20 = i19;
                        i14 = i20;
                        int i21 = i14;
                        long j10 = 0;
                        long j11 = 0;
                        while (i18 < a10) {
                            while (i20 == 0) {
                                com.anythink.basead.exoplayer.k.a.b(aVar.a());
                                long j12 = aVar.f6955d;
                                i20 = aVar.f6954c;
                                j11 = j12;
                                a10 = a10;
                            }
                            int i22 = a10;
                            if (sVar7 != null) {
                                while (i21 == 0 && i6 > 0) {
                                    i21 = sVar7.m();
                                    i19 = sVar7.i();
                                    i6--;
                                }
                                i21--;
                            }
                            jArr4[i18] = j11;
                            int b9 = interfaceC0022b.b();
                            iArr5[i18] = b9;
                            if (b9 > i14) {
                                i14 = b9;
                            }
                            jArr5[i18] = j10 + i19;
                            iArr6[i18] = sVar4 == null ? 1 : i10;
                            if (i18 == i17) {
                                iArr6[i18] = 1;
                                i9--;
                                if (i9 > 0) {
                                    i17 = sVar4.m() - 1;
                                }
                            }
                            j10 += m10;
                            m9--;
                            if (m9 == 0 && m4 > 0) {
                                m4--;
                                m9 = sVar3.m();
                                m10 = sVar3.i();
                            }
                            j11 += iArr5[i18];
                            i20--;
                            i18++;
                            a10 = i22;
                        }
                        i12 = a10;
                        long j13 = j10 + i19;
                        com.anythink.basead.exoplayer.k.a.a(i21 == 0 ? 1 : i10);
                        while (i6 > 0) {
                            com.anythink.basead.exoplayer.k.a.a(sVar7.m() == 0 ? 1 : i10);
                            sVar7.i();
                            i6--;
                        }
                        if (i9 != 0 || m9 != 0 || i20 != 0 || m4 != 0) {
                            Log.w(f6944a, "Inconsistent stbl box for track " + jVar.f7112c + ": remainingSynchronizationSamples " + i9 + ", remainingSamplesAtTimestampDelta " + m9 + ", remainingSamplesInChunk " + i20 + ", remainingTimestampDeltaChanges " + m4);
                        }
                        iArr = iArr6;
                        jArr = jArr5;
                        jArr2 = jArr4;
                        iArr2 = iArr5;
                        j6 = j13;
                    } else {
                        i12 = a10;
                        i13 = 1;
                        int i23 = aVar.f6952a;
                        long[] jArr6 = new long[i23];
                        int[] iArr7 = new int[i23];
                        while (aVar.a()) {
                            int i24 = aVar.f6953b;
                            jArr6[i24] = aVar.f6955d;
                            iArr7[i24] = aVar.f6954c;
                        }
                        com.anythink.basead.exoplayer.m mVar = jVar.f7117h;
                        d.a a11 = com.anythink.basead.exoplayer.e.a.d.a(af.b(mVar.f8679w, mVar.f8677u), jArr6, iArr7, m10);
                        long[] jArr7 = a11.f6981a;
                        int[] iArr8 = a11.f6982b;
                        i14 = a11.f6983c;
                        long[] jArr8 = a11.f6984d;
                        int[] iArr9 = a11.f6985e;
                        long j14 = a11.f6986f;
                        jArr = jArr8;
                        iArr = iArr9;
                        jArr2 = jArr7;
                        iArr2 = iArr8;
                        j6 = j14;
                    }
                    i15 = i14;
                    a9 = af.a(j6, 1000000L, jVar.f7114e);
                    if (jVar.f7118j == null && !iVar.a()) {
                        long[] jArr9 = jVar.f7118j;
                        int i25 = i13;
                        if (jArr9.length == i25 && jVar.f7113d == i25 && jArr.length >= 2) {
                            long j15 = jVar.f7119k[i10];
                            long a12 = af.a(jArr9[i10], jVar.f7114e, jVar.f7115f) + j15;
                            int length = jArr.length - 1;
                            int i26 = i10;
                            int a13 = af.a(3, i26, length);
                            int a14 = af.a(jArr.length - 3, i26, length);
                            long j16 = jArr[i26];
                            if (j16 <= j15 && j15 < jArr[a13] && jArr[a14] < a12 && a12 <= j6) {
                                long j17 = j6 - a12;
                                long a15 = af.a(j15 - j16, jVar.f7117h.f8678v, jVar.f7114e);
                                long a16 = af.a(j17, jVar.f7117h.f8678v, jVar.f7114e);
                                if ((a15 != 0 || a16 != 0) && a15 <= 2147483647L && a16 <= 2147483647L) {
                                    iVar.f7173b = (int) a15;
                                    iVar.f7174c = (int) a16;
                                    af.a(jArr, jVar.f7114e);
                                    return new m(jVar, jArr2, iArr2, i15, jArr, iArr, a9);
                                }
                            }
                        }
                        long[] jArr10 = jArr;
                        long[] jArr11 = jVar.f7118j;
                        if (jArr11.length == 1 && jArr11[0] == 0) {
                            long j18 = jVar.f7119k[0];
                            for (int i27 = 0; i27 < jArr10.length; i27++) {
                                jArr10[i27] = af.a(jArr10[i27] - j18, 1000000L, jVar.f7114e);
                            }
                            return new m(jVar, jArr2, iArr2, i15, jArr10, iArr, af.a(j6 - j18, 1000000L, jVar.f7114e));
                        }
                        boolean z6 = jVar.f7113d == 1;
                        boolean z9 = false;
                        int i28 = 0;
                        int i29 = 0;
                        int i30 = 0;
                        while (true) {
                            long[] jArr12 = jVar.f7118j;
                            if (i30 >= jArr12.length) {
                                break;
                            }
                            long j19 = jVar.f7119k[i30];
                            if (j19 != -1) {
                                long j20 = jArr12[i30];
                                str2 = str3;
                                long a17 = af.a(j20, jVar.f7114e, jVar.f7115f);
                                boolean z10 = z9;
                                i16 = i15;
                                int a18 = af.a(jArr10, j19, true, true);
                                int a19 = af.a(jArr10, j19 + a17, z6, false);
                                i28 = (a19 - a18) + i28;
                                z9 = z10 | (i29 != a18);
                                i29 = a19;
                            } else {
                                i16 = i15;
                                str2 = str3;
                            }
                            i30++;
                            str3 = str2;
                            i15 = i16;
                        }
                        int i31 = i15;
                        String str4 = str3;
                        boolean z11 = z9 | (i28 != i12);
                        long[] jArr13 = z11 ? new long[i28] : jArr2;
                        int[] iArr10 = z11 ? new int[i28] : iArr2;
                        if (z11) {
                            i31 = 0;
                        }
                        int[] iArr11 = z11 ? new int[i28] : iArr;
                        long[] jArr14 = new long[i28];
                        int i32 = i31;
                        int i33 = 0;
                        int i34 = 0;
                        long j21 = 0;
                        while (true) {
                            long[] jArr15 = jVar.f7118j;
                            boolean z12 = z11;
                            if (i34 < jArr15.length) {
                                int i35 = i32;
                                long j22 = jVar.f7119k[i34];
                                long j23 = jArr15[i34];
                                if (j22 != -1) {
                                    int[] iArr12 = iArr;
                                    jArr3 = jArr14;
                                    j9 = j23;
                                    long a20 = af.a(j23, jVar.f7114e, jVar.f7115f) + j22;
                                    String str5 = str4;
                                    int a21 = af.a(jArr10, j22, true, true);
                                    int a22 = af.a(jArr10, a20, z6, false);
                                    if (z12) {
                                        int i36 = a22 - a21;
                                        System.arraycopy(jArr2, a21, jArr13, i33, i36);
                                        System.arraycopy(iArr2, a21, iArr10, i33, i36);
                                        iArr4 = iArr12;
                                        System.arraycopy(iArr4, a21, iArr11, i33, i36);
                                    } else {
                                        iArr4 = iArr12;
                                    }
                                    if (a21 < a22 && (iArr11[i33] & 1) == 0) {
                                        Log.w(str5, "Ignoring edit list: edit does not start with a sync sample.");
                                        throw new g();
                                    }
                                    str = str5;
                                    iArr3 = iArr4;
                                    int i37 = i35;
                                    while (a21 < a22) {
                                        long[] jArr16 = jArr2;
                                        int[] iArr13 = iArr2;
                                        jArr3[i33] = af.a(j21, 1000000L, jVar.f7115f) + af.a(jArr10[a21] - j22, 1000000L, jVar.f7114e);
                                        if (z12 && iArr10[i33] > i37) {
                                            i37 = iArr13[a21];
                                        }
                                        i33++;
                                        a21++;
                                        jArr2 = jArr16;
                                        iArr2 = iArr13;
                                    }
                                    i32 = i37;
                                } else {
                                    iArr3 = iArr;
                                    jArr3 = jArr14;
                                    str = str4;
                                    j9 = j23;
                                    i32 = i35;
                                }
                                j21 += j9;
                                i34++;
                                str4 = str;
                                z11 = z12;
                                jArr14 = jArr3;
                                iArr = iArr3;
                                jArr2 = jArr2;
                                iArr2 = iArr2;
                            } else {
                                return new m(jVar, jArr13, iArr10, i32, jArr14, iArr11, af.a(j21, 1000000L, jVar.f7114e));
                            }
                        }
                    } else {
                        long[] jArr17 = jArr2;
                        int[] iArr14 = iArr2;
                        int[] iArr15 = iArr;
                        long[] jArr18 = jArr;
                        af.a(jArr18, jVar.f7114e);
                        return new m(jVar, jArr17, iArr14, i15, jArr18, iArr15, a9);
                    }
                }
            }
            i11 = i10;
            String str32 = f6944a;
            if (i11 == 0) {
            }
            i15 = i14;
            a9 = af.a(j6, 1000000L, jVar.f7114e);
            if (jVar.f7118j == null) {
            }
            long[] jArr172 = jArr2;
            int[] iArr142 = iArr2;
            int[] iArr152 = iArr;
            long[] jArr182 = jArr;
            af.a(jArr182, jVar.f7114e);
            return new m(jVar, jArr172, iArr142, i15, jArr182, iArr152, a9);
        }
        i9 = 0;
        sVar4 = sVar5;
        if (eVar.c()) {
        }
        i11 = i10;
        String str322 = f6944a;
        if (i11 == 0) {
        }
        i15 = i14;
        a9 = af.a(j6, 1000000L, jVar.f7114e);
        if (jVar.f7118j == null) {
        }
        long[] jArr1722 = jArr2;
        int[] iArr1422 = iArr2;
        int[] iArr1522 = iArr;
        long[] jArr1822 = jArr;
        af.a(jArr1822, jVar.f7114e);
        return new m(jVar, jArr1722, iArr1422, i15, jArr1822, iArr1522, a9);
    }

    public static com.anythink.basead.exoplayer.g.a a(a.b bVar, boolean z3) {
        if (z3) {
            return null;
        }
        s sVar = bVar.aV;
        sVar.c(8);
        while (sVar.a() >= 8) {
            int c9 = sVar.c();
            int i6 = sVar.i();
            if (sVar.i() == com.anythink.basead.exoplayer.e.a.a.aG) {
                sVar.c(c9);
                int i9 = c9 + i6;
                sVar.d(12);
                while (true) {
                    if (sVar.c() >= i9) {
                        break;
                    }
                    int c10 = sVar.c();
                    int i10 = sVar.i();
                    if (sVar.i() == com.anythink.basead.exoplayer.e.a.a.aH) {
                        sVar.c(c10);
                        int i11 = c10 + i10;
                        sVar.d(8);
                        ArrayList arrayList = new ArrayList();
                        while (sVar.c() < i11) {
                            a.InterfaceC0025a a9 = com.anythink.basead.exoplayer.e.a.f.a(sVar);
                            if (a9 != null) {
                                arrayList.add(a9);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            return new com.anythink.basead.exoplayer.g.a(arrayList);
                        }
                    } else {
                        sVar.d(i10 - 8);
                    }
                }
                return null;
            }
            sVar.d(i6 - 8);
        }
        return null;
    }

    private static com.anythink.basead.exoplayer.g.a a(s sVar, int i6) {
        sVar.d(12);
        while (sVar.c() < i6) {
            int c9 = sVar.c();
            int i9 = sVar.i();
            if (sVar.i() == com.anythink.basead.exoplayer.e.a.a.aH) {
                sVar.c(c9);
                int i10 = c9 + i9;
                sVar.d(8);
                ArrayList arrayList = new ArrayList();
                while (sVar.c() < i10) {
                    a.InterfaceC0025a a9 = com.anythink.basead.exoplayer.e.a.f.a(sVar);
                    if (a9 != null) {
                        arrayList.add(a9);
                    }
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new com.anythink.basead.exoplayer.g.a(arrayList);
            }
            sVar.d(i9 - 8);
        }
        return null;
    }

    private static long a(s sVar) {
        sVar.c(8);
        sVar.d(com.anythink.basead.exoplayer.e.a.a.a(sVar.i()) != 0 ? 16 : 8);
        return sVar.h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static c a(s sVar, int i6, int i9, String str, com.anythink.basead.exoplayer.d.e eVar, boolean z3) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        com.anythink.basead.exoplayer.d.e eVar2;
        byte[] bArr;
        String str2;
        List<byte[]> list;
        String str3;
        com.anythink.basead.exoplayer.d.e eVar3;
        int i15;
        int k9;
        int i16;
        com.anythink.basead.exoplayer.d.e eVar4;
        String str4;
        int i17;
        String str5;
        String str6;
        int i18;
        int i19;
        List list2;
        int i20;
        String str7;
        int c9;
        String str8;
        String str9;
        char c10;
        com.anythink.basead.exoplayer.d.e eVar5 = eVar;
        sVar.c(12);
        int i21 = sVar.i();
        c cVar = new c(i21);
        int i22 = 0;
        int i23 = 0;
        while (i23 < i21) {
            int c11 = sVar.c();
            int i24 = sVar.i();
            boolean z6 = true;
            com.anythink.basead.exoplayer.k.a.a(i24 > 0 ? 1 : i22, "childAtomSize should be positive");
            int i25 = sVar.i();
            List list3 = null;
            if (i25 != com.anythink.basead.exoplayer.e.a.a.f6925g && i25 != com.anythink.basead.exoplayer.e.a.a.f6926h && i25 != com.anythink.basead.exoplayer.e.a.a.ae && i25 != com.anythink.basead.exoplayer.e.a.a.aq && i25 != com.anythink.basead.exoplayer.e.a.a.i && i25 != com.anythink.basead.exoplayer.e.a.a.f6927j && i25 != com.anythink.basead.exoplayer.e.a.a.f6928k && i25 != com.anythink.basead.exoplayer.e.a.a.aP && i25 != com.anythink.basead.exoplayer.e.a.a.aQ) {
                if (i25 != com.anythink.basead.exoplayer.e.a.a.f6931n && i25 != com.anythink.basead.exoplayer.e.a.a.af && i25 != com.anythink.basead.exoplayer.e.a.a.f6936s && i25 != com.anythink.basead.exoplayer.e.a.a.f6938u && i25 != com.anythink.basead.exoplayer.e.a.a.f6940w && i25 != com.anythink.basead.exoplayer.e.a.a.f6943z && i25 != com.anythink.basead.exoplayer.e.a.a.f6941x && i25 != com.anythink.basead.exoplayer.e.a.a.f6942y && i25 != com.anythink.basead.exoplayer.e.a.a.aD && i25 != com.anythink.basead.exoplayer.e.a.a.aE && i25 != com.anythink.basead.exoplayer.e.a.a.f6934q && i25 != com.anythink.basead.exoplayer.e.a.a.f6935r && i25 != com.anythink.basead.exoplayer.e.a.a.f6932o && i25 != com.anythink.basead.exoplayer.e.a.a.aT) {
                    int i26 = com.anythink.basead.exoplayer.e.a.a.ao;
                    if (i25 != i26 && i25 != com.anythink.basead.exoplayer.e.a.a.az && i25 != com.anythink.basead.exoplayer.e.a.a.aA && i25 != com.anythink.basead.exoplayer.e.a.a.aB && i25 != com.anythink.basead.exoplayer.e.a.a.aC) {
                        if (i25 == com.anythink.basead.exoplayer.e.a.a.aS) {
                            cVar.f6962c = com.anythink.basead.exoplayer.m.a(Integer.toString(i6), o.ah, (String) null, (com.anythink.basead.exoplayer.d.e) null);
                        }
                        i10 = i23;
                        i11 = i21;
                        i12 = i22;
                        i13 = c11;
                        i14 = i24;
                    } else {
                        sVar.c(c11 + 16);
                        String str10 = o.f8443Z;
                        long j6 = Long.MAX_VALUE;
                        if (i25 != i26) {
                            if (i25 == com.anythink.basead.exoplayer.e.a.a.az) {
                                int i27 = i24 - 16;
                                byte[] bArr2 = new byte[i27];
                                sVar.a(bArr2, i22, i27);
                                list3 = Collections.singletonList(bArr2);
                                str10 = o.aa;
                            } else if (i25 == com.anythink.basead.exoplayer.e.a.a.aA) {
                                str10 = o.ab;
                            } else if (i25 == com.anythink.basead.exoplayer.e.a.a.aB) {
                                j6 = 0;
                            } else if (i25 == com.anythink.basead.exoplayer.e.a.a.aC) {
                                cVar.f6964e = 1;
                                str10 = o.ac;
                            } else {
                                throw new IllegalStateException();
                            }
                        }
                        i10 = i23;
                        i13 = c11;
                        i11 = i21;
                        i14 = i24;
                        cVar.f6962c = com.anythink.basead.exoplayer.m.a(Integer.toString(i6), str10, (String) null, -1, 0, str, -1, (com.anythink.basead.exoplayer.d.e) null, j6, (List<byte[]>) list3);
                        i12 = 0;
                    }
                } else {
                    i10 = i23;
                    i13 = c11;
                    i11 = i21;
                    String str11 = str;
                    i14 = i24;
                    sVar.c(i13 + 16);
                    if (z3) {
                        i15 = sVar.e();
                        sVar.d(6);
                    } else {
                        sVar.d(8);
                        i15 = 0;
                    }
                    if (i15 == 0 || i15 == 1) {
                        int e9 = sVar.e();
                        sVar.d(6);
                        k9 = sVar.k();
                        if (i15 == 1) {
                            sVar.d(16);
                        }
                        i16 = e9;
                    } else {
                        if (i15 == 2) {
                            sVar.d(16);
                            k9 = (int) Math.round(Double.longBitsToDouble(sVar.j()));
                            i16 = sVar.m();
                            sVar.d(20);
                        }
                        i12 = 0;
                    }
                    int c12 = sVar.c();
                    if (i25 == com.anythink.basead.exoplayer.e.a.a.af) {
                        Pair<Integer, k> b9 = b(sVar, i13, i14);
                        if (b9 != null) {
                            i25 = ((Integer) b9.first).intValue();
                            eVar4 = eVar5 == null ? null : eVar5.a(((k) b9.second).f7124b);
                            cVar.f6961b[i10] = (k) b9.second;
                        } else {
                            eVar4 = eVar5;
                        }
                        sVar.c(c12);
                    } else {
                        eVar4 = eVar5;
                    }
                    int i28 = com.anythink.basead.exoplayer.e.a.a.f6936s;
                    String str12 = o.f8465w;
                    if (i25 == i28) {
                        str4 = o.f8468z;
                    } else if (i25 == com.anythink.basead.exoplayer.e.a.a.f6938u) {
                        str4 = o.f8420A;
                    } else if (i25 == com.anythink.basead.exoplayer.e.a.a.f6940w) {
                        str4 = o.f8423D;
                    } else if (i25 != com.anythink.basead.exoplayer.e.a.a.f6941x && i25 != com.anythink.basead.exoplayer.e.a.a.f6942y) {
                        if (i25 == com.anythink.basead.exoplayer.e.a.a.f6943z) {
                            str4 = o.f8425F;
                        } else if (i25 == com.anythink.basead.exoplayer.e.a.a.aD) {
                            str4 = o.f8428I;
                        } else if (i25 == com.anythink.basead.exoplayer.e.a.a.aE) {
                            str4 = o.J;
                        } else if (i25 == com.anythink.basead.exoplayer.e.a.a.f6934q || i25 == com.anythink.basead.exoplayer.e.a.a.f6935r) {
                            str4 = o.f8465w;
                        } else if (i25 == com.anythink.basead.exoplayer.e.a.a.f6932o) {
                            str4 = o.f8462t;
                        } else {
                            str4 = i25 == com.anythink.basead.exoplayer.e.a.a.aT ? o.f8430L : null;
                        }
                    } else {
                        str4 = o.f8424E;
                    }
                    int i29 = k9;
                    int i30 = c12;
                    int i31 = i16;
                    byte[] bArr3 = null;
                    while (i30 - i13 < i14) {
                        sVar.c(i30);
                        int i32 = sVar.i();
                        com.anythink.basead.exoplayer.k.a.a(i32 > 0 ? z6 : false, "childAtomSize should be positive");
                        int i33 = sVar.i();
                        int i34 = com.anythink.basead.exoplayer.e.a.a.f6908O;
                        if (i33 != i34) {
                            int i35 = i30;
                            if (z3 && i33 == com.anythink.basead.exoplayer.e.a.a.f6933p) {
                                i17 = i35;
                                str5 = str4;
                                str6 = str12;
                                i19 = -1;
                                list2 = null;
                                i18 = i14;
                            } else {
                                if (i33 == com.anythink.basead.exoplayer.e.a.a.f6937t) {
                                    sVar.c(i35 + 8);
                                    cVar.f6962c = com.anythink.basead.exoplayer.b.a.a(sVar, Integer.toString(i6), str11, eVar4);
                                } else if (i33 == com.anythink.basead.exoplayer.e.a.a.f6939v) {
                                    sVar.c(i35 + 8);
                                    cVar.f6962c = com.anythink.basead.exoplayer.b.a.b(sVar, Integer.toString(i6), str11, eVar4);
                                } else {
                                    if (i33 == com.anythink.basead.exoplayer.e.a.a.f6895A) {
                                        str7 = str4;
                                        i17 = i35;
                                        c10 = 65535;
                                        list2 = null;
                                        i18 = i14;
                                        i20 = i32;
                                        str9 = str12;
                                        cVar.f6962c = com.anythink.basead.exoplayer.m.a(Integer.toString(i6), str7, null, -1, i31, i29, null, eVar4, str);
                                    } else {
                                        str7 = str4;
                                        str9 = str12;
                                        i17 = i35;
                                        c10 = 65535;
                                        list2 = null;
                                        i18 = i14;
                                        i20 = i32;
                                        if (i33 == com.anythink.basead.exoplayer.e.a.a.aT) {
                                            byte[] bArr4 = new byte[i20];
                                            sVar.c(i17);
                                            sVar.a(bArr4, 0, i20);
                                            bArr3 = bArr4;
                                            str6 = str9;
                                            i30 = i17 + i20;
                                            str12 = str6;
                                            list3 = list2;
                                            i14 = i18;
                                            z6 = true;
                                            str4 = str7;
                                            str11 = str;
                                        }
                                    }
                                    str6 = str9;
                                    i30 = i17 + i20;
                                    str12 = str6;
                                    list3 = list2;
                                    i14 = i18;
                                    z6 = true;
                                    str4 = str7;
                                    str11 = str;
                                }
                                str7 = str4;
                                str9 = str12;
                                i17 = i35;
                                c10 = 65535;
                                list2 = null;
                                i18 = i14;
                                i20 = i32;
                                str6 = str9;
                                i30 = i17 + i20;
                                str12 = str6;
                                list3 = list2;
                                i14 = i18;
                                z6 = true;
                                str4 = str7;
                                str11 = str;
                            }
                        } else {
                            i17 = i30;
                            str5 = str4;
                            str6 = str12;
                            i18 = i14;
                            i19 = -1;
                            list2 = null;
                        }
                        i20 = i32;
                        boolean z9 = false;
                        if (i33 != i34) {
                            c9 = sVar.c();
                            while (true) {
                                if (c9 - i17 >= i20) {
                                    c9 = i19;
                                    break;
                                }
                                sVar.c(c9);
                                int i36 = sVar.i();
                                if (i36 > 0) {
                                    z9 = true;
                                }
                                com.anythink.basead.exoplayer.k.a.a(z9, "childAtomSize should be positive");
                                if (sVar.i() == com.anythink.basead.exoplayer.e.a.a.f6908O) {
                                    break;
                                }
                                c9 += i36;
                                z9 = false;
                            }
                        } else {
                            c9 = i17;
                        }
                        if (c9 != i19) {
                            Pair<String, byte[]> d2 = d(sVar, c9);
                            str8 = (String) d2.first;
                            bArr3 = (byte[]) d2.second;
                            if (o.f8460r.equals(str8)) {
                                Pair<Integer, Integer> a9 = com.anythink.basead.exoplayer.k.d.a(bArr3);
                                i29 = ((Integer) a9.first).intValue();
                                i31 = ((Integer) a9.second).intValue();
                            }
                        } else {
                            str8 = str5;
                        }
                        str7 = str8;
                        i30 = i17 + i20;
                        str12 = str6;
                        list3 = list2;
                        i14 = i18;
                        z6 = true;
                        str4 = str7;
                        str11 = str;
                    }
                    String str13 = str4;
                    String str14 = str12;
                    List list4 = list3;
                    int i37 = i14;
                    if (cVar.f6962c != null || str13 == null) {
                        i12 = 0;
                    } else {
                        i12 = 0;
                        cVar.f6962c = com.anythink.basead.exoplayer.m.a(Integer.toString(i6), str13, (String) null, -1, i31, i29, str14.equals(str13) ? 2 : -1, (List<byte[]>) (bArr3 == null ? list4 : Collections.singletonList(bArr3)), eVar4, str);
                    }
                    eVar5 = eVar;
                    i14 = i37;
                }
            } else {
                i10 = i23;
                i11 = i21;
                i12 = i22;
                i13 = c11;
                sVar.c(i13 + 16);
                sVar.d(16);
                int e10 = sVar.e();
                int e11 = sVar.e();
                sVar.d(50);
                int c13 = sVar.c();
                if (i25 == com.anythink.basead.exoplayer.e.a.a.ae) {
                    i14 = i24;
                    Pair<Integer, k> b10 = b(sVar, i13, i14);
                    if (b10 != null) {
                        i25 = ((Integer) b10.first).intValue();
                        if (eVar == null) {
                            eVar5 = eVar;
                            eVar3 = null;
                        } else {
                            eVar5 = eVar;
                            eVar3 = eVar5.a(((k) b10.second).f7124b);
                        }
                        cVar.f6961b[i10] = (k) b10.second;
                    } else {
                        eVar5 = eVar;
                        eVar3 = eVar5;
                    }
                    sVar.c(c13);
                    eVar2 = eVar3;
                } else {
                    eVar5 = eVar;
                    i14 = i24;
                    eVar2 = eVar5;
                }
                int i38 = -1;
                float f3 = 1.0f;
                int i39 = i12;
                String str15 = null;
                List<byte[]> list5 = null;
                byte[] bArr5 = null;
                while (c13 - i13 < i14) {
                    sVar.c(c13);
                    int c14 = sVar.c();
                    int i40 = sVar.i();
                    if (i40 == 0 && sVar.c() - i13 == i14) {
                        break;
                    }
                    com.anythink.basead.exoplayer.k.a.a(i40 > 0 ? 1 : i12, "childAtomSize should be positive");
                    int i41 = sVar.i();
                    if (i41 == com.anythink.basead.exoplayer.e.a.a.f6906M) {
                        com.anythink.basead.exoplayer.k.a.b(str15 == null ? 1 : i12);
                        sVar.c(c14 + 8);
                        com.anythink.basead.exoplayer.l.a a10 = com.anythink.basead.exoplayer.l.a.a(sVar);
                        list = a10.f8544a;
                        cVar.f6963d = a10.f8545b;
                        if (i39 == 0) {
                            f3 = a10.f8548e;
                        }
                        str3 = o.f8451h;
                    } else if (i41 == com.anythink.basead.exoplayer.e.a.a.f6907N) {
                        com.anythink.basead.exoplayer.k.a.b(str15 == null ? 1 : i12);
                        sVar.c(c14 + 8);
                        com.anythink.basead.exoplayer.l.d a11 = com.anythink.basead.exoplayer.l.d.a(sVar);
                        list = a11.f8569a;
                        cVar.f6963d = a11.f8570b;
                        str3 = o.i;
                    } else {
                        if (i41 == com.anythink.basead.exoplayer.e.a.a.aR) {
                            com.anythink.basead.exoplayer.k.a.b(str15 == null ? 1 : i12);
                            str2 = i25 == com.anythink.basead.exoplayer.e.a.a.aP ? o.f8452j : o.f8453k;
                        } else if (i41 == com.anythink.basead.exoplayer.e.a.a.f6929l) {
                            com.anythink.basead.exoplayer.k.a.b(str15 == null ? 1 : i12);
                            str2 = o.f8450g;
                        } else {
                            if (i41 == com.anythink.basead.exoplayer.e.a.a.f6908O) {
                                com.anythink.basead.exoplayer.k.a.b(str15 == null ? 1 : i12);
                                Pair<String, byte[]> d9 = d(sVar, c14);
                                String str16 = (String) d9.first;
                                list5 = Collections.singletonList((byte[]) d9.second);
                                str15 = str16;
                            } else if (i41 == com.anythink.basead.exoplayer.e.a.a.an) {
                                sVar.c(c14 + 8);
                                f3 = sVar.m() / sVar.m();
                                i39 = 1;
                            } else if (i41 == com.anythink.basead.exoplayer.e.a.a.aN) {
                                int i42 = c14 + 8;
                                while (true) {
                                    if (i42 - c14 >= i40) {
                                        bArr = null;
                                        break;
                                    }
                                    sVar.c(i42);
                                    int i43 = sVar.i();
                                    if (sVar.i() == com.anythink.basead.exoplayer.e.a.a.aO) {
                                        bArr = Arrays.copyOfRange(sVar.f8502a, i42, i43 + i42);
                                        break;
                                    }
                                    i42 += i43;
                                }
                                bArr5 = bArr;
                            } else if (i41 == com.anythink.basead.exoplayer.e.a.a.aM) {
                                int d10 = sVar.d();
                                sVar.d(3);
                                if (d10 == 0) {
                                    int d11 = sVar.d();
                                    if (d11 == 0) {
                                        i38 = i12;
                                    } else if (d11 == 1) {
                                        i38 = 1;
                                    } else if (d11 == 2) {
                                        i38 = 2;
                                    } else if (d11 == 3) {
                                        i38 = 3;
                                    }
                                    c13 += i40;
                                }
                            }
                            c13 += i40;
                        }
                        str15 = str2;
                        c13 += i40;
                    }
                    str15 = str3;
                    list5 = list;
                    c13 += i40;
                }
                if (str15 != null) {
                    cVar.f6962c = com.anythink.basead.exoplayer.m.a(Integer.toString(i6), str15, null, -1, -1, e10, e11, -1.0f, list5, i9, f3, bArr5, i38, null, eVar2);
                }
            }
            sVar.c(i13 + i14);
            i23 = i10 + 1;
            i22 = i12;
            i21 = i11;
        }
        return cVar;
    }

    private static void a(s sVar, int i6, int i9, int i10, int i11, String str, c cVar) {
        sVar.c(i9 + 16);
        int i12 = com.anythink.basead.exoplayer.e.a.a.ao;
        String str2 = o.f8443Z;
        List list = null;
        long j6 = Long.MAX_VALUE;
        if (i6 != i12) {
            if (i6 == com.anythink.basead.exoplayer.e.a.a.az) {
                int i13 = i10 - 16;
                byte[] bArr = new byte[i13];
                sVar.a(bArr, 0, i13);
                list = Collections.singletonList(bArr);
                str2 = o.aa;
            } else if (i6 == com.anythink.basead.exoplayer.e.a.a.aA) {
                str2 = o.ab;
            } else if (i6 == com.anythink.basead.exoplayer.e.a.a.aB) {
                j6 = 0;
            } else if (i6 == com.anythink.basead.exoplayer.e.a.a.aC) {
                cVar.f6964e = 1;
                str2 = o.ac;
            } else {
                throw new IllegalStateException();
            }
        }
        cVar.f6962c = com.anythink.basead.exoplayer.m.a(Integer.toString(i11), str2, (String) null, -1, 0, str, -1, (com.anythink.basead.exoplayer.d.e) null, j6, (List<byte[]>) list);
    }

    private static void a(s sVar, int i6, int i9, int i10, int i11, int i12, com.anythink.basead.exoplayer.d.e eVar, c cVar, int i13) {
        int i14 = i9;
        com.anythink.basead.exoplayer.d.e eVar2 = eVar;
        sVar.c(i14 + 16);
        sVar.d(16);
        int e9 = sVar.e();
        int e10 = sVar.e();
        sVar.d(50);
        int c9 = sVar.c();
        String str = null;
        int i15 = i6;
        if (i15 == com.anythink.basead.exoplayer.e.a.a.ae) {
            Pair<Integer, k> b9 = b(sVar, i14, i10);
            if (b9 != null) {
                i15 = ((Integer) b9.first).intValue();
                eVar2 = eVar2 == null ? null : eVar2.a(((k) b9.second).f7124b);
                cVar.f6961b[i13] = (k) b9.second;
            }
            sVar.c(c9);
        }
        com.anythink.basead.exoplayer.d.e eVar3 = eVar2;
        float f3 = 1.0f;
        List<byte[]> list = null;
        byte[] bArr = null;
        int i16 = -1;
        boolean z3 = false;
        while (c9 - i14 < i10) {
            sVar.c(c9);
            int c10 = sVar.c();
            int i17 = sVar.i();
            if (i17 == 0 && sVar.c() - i14 == i10) {
                break;
            }
            com.anythink.basead.exoplayer.k.a.a(i17 > 0, "childAtomSize should be positive");
            int i18 = sVar.i();
            if (i18 == com.anythink.basead.exoplayer.e.a.a.f6906M) {
                com.anythink.basead.exoplayer.k.a.b(str == null);
                sVar.c(c10 + 8);
                com.anythink.basead.exoplayer.l.a a9 = com.anythink.basead.exoplayer.l.a.a(sVar);
                list = a9.f8544a;
                cVar.f6963d = a9.f8545b;
                if (!z3) {
                    f3 = a9.f8548e;
                }
                str = o.f8451h;
            } else if (i18 == com.anythink.basead.exoplayer.e.a.a.f6907N) {
                com.anythink.basead.exoplayer.k.a.b(str == null);
                sVar.c(c10 + 8);
                com.anythink.basead.exoplayer.l.d a10 = com.anythink.basead.exoplayer.l.d.a(sVar);
                list = a10.f8569a;
                cVar.f6963d = a10.f8570b;
                str = o.i;
            } else if (i18 == com.anythink.basead.exoplayer.e.a.a.aR) {
                com.anythink.basead.exoplayer.k.a.b(str == null);
                str = i15 == com.anythink.basead.exoplayer.e.a.a.aP ? o.f8452j : o.f8453k;
            } else if (i18 == com.anythink.basead.exoplayer.e.a.a.f6929l) {
                com.anythink.basead.exoplayer.k.a.b(str == null);
                str = o.f8450g;
            } else if (i18 == com.anythink.basead.exoplayer.e.a.a.f6908O) {
                com.anythink.basead.exoplayer.k.a.b(str == null);
                Pair<String, byte[]> d2 = d(sVar, c10);
                str = (String) d2.first;
                list = Collections.singletonList((byte[]) d2.second);
            } else if (i18 == com.anythink.basead.exoplayer.e.a.a.an) {
                sVar.c(c10 + 8);
                f3 = sVar.m() / sVar.m();
                z3 = true;
            } else if (i18 == com.anythink.basead.exoplayer.e.a.a.aN) {
                int i19 = c10 + 8;
                while (true) {
                    if (i19 - c10 >= i17) {
                        bArr = null;
                        break;
                    }
                    sVar.c(i19);
                    int i20 = sVar.i();
                    if (sVar.i() == com.anythink.basead.exoplayer.e.a.a.aO) {
                        bArr = Arrays.copyOfRange(sVar.f8502a, i19, i20 + i19);
                        break;
                    }
                    i19 += i20;
                }
            } else if (i18 == com.anythink.basead.exoplayer.e.a.a.aM) {
                int d9 = sVar.d();
                sVar.d(3);
                if (d9 == 0) {
                    int d10 = sVar.d();
                    if (d10 == 0) {
                        i16 = 0;
                    } else if (d10 == 1) {
                        i16 = 1;
                    } else if (d10 == 2) {
                        i16 = 2;
                    } else if (d10 == 3) {
                        i16 = 3;
                    }
                }
            }
            c9 += i17;
            i14 = i9;
        }
        if (str == null) {
            return;
        }
        cVar.f6962c = com.anythink.basead.exoplayer.m.a(Integer.toString(i11), str, null, -1, -1, e9, e10, -1.0f, list, i12, f3, bArr, i16, null, eVar3);
    }

    private static Pair<long[], long[]> a(a.C0021a c0021a) {
        a.b d2;
        if (c0021a != null && (d2 = c0021a.d(com.anythink.basead.exoplayer.e.a.a.f6915V)) != null) {
            s sVar = d2.aV;
            sVar.c(8);
            int a9 = com.anythink.basead.exoplayer.e.a.a.a(sVar.i());
            int m4 = sVar.m();
            long[] jArr = new long[m4];
            long[] jArr2 = new long[m4];
            for (int i6 = 0; i6 < m4; i6++) {
                jArr[i6] = a9 == 1 ? sVar.n() : sVar.h();
                jArr2[i6] = a9 == 1 ? sVar.j() : sVar.i();
                if (sVar.f() == 1) {
                    sVar.d(2);
                } else {
                    throw new IllegalArgumentException("Unsupported media rate.");
                }
            }
            return Pair.create(jArr, jArr2);
        }
        return Pair.create(null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01c7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(s sVar, int i6, int i9, int i10, int i11, String str, boolean z3, com.anythink.basead.exoplayer.d.e eVar, c cVar, int i12) {
        int i13;
        int k9;
        int i14;
        String str2;
        int i15;
        String str3;
        int i16;
        int i17;
        int c9;
        int i18;
        String str4;
        String str5 = str;
        com.anythink.basead.exoplayer.d.e eVar2 = eVar;
        sVar.c(i9 + 16);
        if (z3) {
            i13 = sVar.e();
            sVar.d(6);
        } else {
            sVar.d(8);
            i13 = 0;
        }
        boolean z6 = true;
        if (i13 == 0 || i13 == 1) {
            int e9 = sVar.e();
            sVar.d(6);
            k9 = sVar.k();
            if (i13 == 1) {
                sVar.d(16);
            }
            i14 = e9;
        } else {
            if (i13 != 2) {
                return;
            }
            sVar.d(16);
            k9 = (int) Math.round(Double.longBitsToDouble(sVar.j()));
            i14 = sVar.m();
            sVar.d(20);
        }
        int c10 = sVar.c();
        int i19 = i6;
        if (i19 == com.anythink.basead.exoplayer.e.a.a.af) {
            Pair<Integer, k> b9 = b(sVar, i9, i10);
            if (b9 != null) {
                i19 = ((Integer) b9.first).intValue();
                eVar2 = eVar2 == null ? null : eVar2.a(((k) b9.second).f7124b);
                cVar.f6961b[i12] = (k) b9.second;
            }
            sVar.c(c10);
        }
        com.anythink.basead.exoplayer.d.e eVar3 = eVar2;
        int i20 = com.anythink.basead.exoplayer.e.a.a.f6936s;
        String str6 = o.f8465w;
        if (i19 == i20) {
            str2 = o.f8468z;
        } else if (i19 == com.anythink.basead.exoplayer.e.a.a.f6938u) {
            str2 = o.f8420A;
        } else if (i19 == com.anythink.basead.exoplayer.e.a.a.f6940w) {
            str2 = o.f8423D;
        } else if (i19 != com.anythink.basead.exoplayer.e.a.a.f6941x && i19 != com.anythink.basead.exoplayer.e.a.a.f6942y) {
            if (i19 == com.anythink.basead.exoplayer.e.a.a.f6943z) {
                str2 = o.f8425F;
            } else if (i19 == com.anythink.basead.exoplayer.e.a.a.aD) {
                str2 = o.f8428I;
            } else if (i19 == com.anythink.basead.exoplayer.e.a.a.aE) {
                str2 = o.J;
            } else if (i19 == com.anythink.basead.exoplayer.e.a.a.f6934q || i19 == com.anythink.basead.exoplayer.e.a.a.f6935r) {
                str2 = o.f8465w;
            } else if (i19 == com.anythink.basead.exoplayer.e.a.a.f6932o) {
                str2 = o.f8462t;
            } else {
                str2 = i19 == com.anythink.basead.exoplayer.e.a.a.aT ? o.f8430L : null;
            }
        } else {
            str2 = o.f8424E;
        }
        int i21 = k9;
        byte[] bArr = null;
        String str7 = str2;
        int i22 = c10;
        while (i22 - i9 < i10) {
            sVar.c(i22);
            int i23 = sVar.i();
            com.anythink.basead.exoplayer.k.a.a(i23 > 0 ? z6 : false, "childAtomSize should be positive");
            int i24 = sVar.i();
            int i25 = com.anythink.basead.exoplayer.e.a.a.f6908O;
            if (i24 == i25 || (z3 && i24 == com.anythink.basead.exoplayer.e.a.a.f6933p)) {
                String str8 = str6;
                i15 = i14;
                str3 = str8;
                i16 = i22;
                i17 = i23;
                boolean z9 = false;
                if (i24 == i25) {
                    c9 = i16;
                } else {
                    c9 = sVar.c();
                    while (c9 - i16 < i17) {
                        sVar.c(c9);
                        int i26 = sVar.i();
                        com.anythink.basead.exoplayer.k.a.a(i26 > 0 ? true : z9, "childAtomSize should be positive");
                        if (sVar.i() != com.anythink.basead.exoplayer.e.a.a.f6908O) {
                            c9 += i26;
                            z9 = false;
                        }
                    }
                    i18 = -1;
                    c9 = -1;
                    if (c9 == i18) {
                        Pair<String, byte[]> d2 = d(sVar, c9);
                        String str9 = (String) d2.first;
                        bArr = (byte[]) d2.second;
                        if (o.f8460r.equals(str9)) {
                            Pair<Integer, Integer> a9 = com.anythink.basead.exoplayer.k.d.a(bArr);
                            i21 = ((Integer) a9.first).intValue();
                            i15 = ((Integer) a9.second).intValue();
                        }
                        str7 = str9;
                    }
                }
                i18 = -1;
                if (c9 == i18) {
                }
            } else {
                if (i24 == com.anythink.basead.exoplayer.e.a.a.f6937t) {
                    sVar.c(i22 + 8);
                    cVar.f6962c = com.anythink.basead.exoplayer.b.a.a(sVar, Integer.toString(i11), str5, eVar3);
                } else if (i24 == com.anythink.basead.exoplayer.e.a.a.f6939v) {
                    sVar.c(i22 + 8);
                    cVar.f6962c = com.anythink.basead.exoplayer.b.a.b(sVar, Integer.toString(i11), str5, eVar3);
                } else {
                    if (i24 == com.anythink.basead.exoplayer.e.a.a.f6895A) {
                        String str10 = str6;
                        i15 = i14;
                        str4 = str10;
                        i16 = i22;
                        cVar.f6962c = com.anythink.basead.exoplayer.m.a(Integer.toString(i11), str7, null, -1, i15, i21, null, eVar3, str);
                        i17 = i23;
                    } else {
                        i16 = i22;
                        i17 = i23;
                        str4 = str6;
                        i15 = i14;
                        if (i24 == com.anythink.basead.exoplayer.e.a.a.aT) {
                            byte[] bArr2 = new byte[i17];
                            sVar.c(i16);
                            sVar.a(bArr2, 0, i17);
                            bArr = bArr2;
                            str3 = str4;
                        }
                    }
                    str3 = str4;
                }
                i16 = i22;
                i17 = i23;
                str4 = str6;
                i15 = i14;
                str3 = str4;
            }
            i22 = i17 + i16;
            int i27 = i15;
            str6 = str3;
            i14 = i27;
            str5 = str;
            z6 = true;
        }
        String str11 = str6;
        int i28 = i14;
        if (cVar.f6962c != null || str7 == null) {
            return;
        }
        cVar.f6962c = com.anythink.basead.exoplayer.m.a(Integer.toString(i11), str7, (String) null, -1, i28, i21, str11.equals(str7) ? 2 : -1, (List<byte[]>) (bArr != null ? Collections.singletonList(bArr) : null), eVar3, str);
    }

    private static int a(s sVar, int i6, int i9) {
        int c9 = sVar.c();
        while (c9 - i6 < i9) {
            sVar.c(c9);
            int i10 = sVar.i();
            com.anythink.basead.exoplayer.k.a.a(i10 > 0, "childAtomSize should be positive");
            if (sVar.i() == com.anythink.basead.exoplayer.e.a.a.f6908O) {
                return c9;
            }
            c9 += i10;
        }
        return -1;
    }

    private static k a(s sVar, int i6, int i9, String str) {
        int i10;
        int i11;
        int i12 = i6 + 8;
        while (true) {
            byte[] bArr = null;
            if (i12 - i6 >= i9) {
                return null;
            }
            sVar.c(i12);
            int i13 = sVar.i();
            if (sVar.i() == com.anythink.basead.exoplayer.e.a.a.ad) {
                int a9 = com.anythink.basead.exoplayer.e.a.a.a(sVar.i());
                sVar.d(1);
                if (a9 == 0) {
                    sVar.d(1);
                    i11 = 0;
                    i10 = 0;
                } else {
                    int d2 = sVar.d();
                    i10 = d2 & 15;
                    i11 = (d2 & 240) >> 4;
                }
                boolean z3 = sVar.d() == 1;
                int d9 = sVar.d();
                byte[] bArr2 = new byte[16];
                sVar.a(bArr2, 0, 16);
                if (z3 && d9 == 0) {
                    int d10 = sVar.d();
                    bArr = new byte[d10];
                    sVar.a(bArr, 0, d10);
                }
                return new k(z3, str, d9, bArr2, i11, i10, bArr);
            }
            i12 += i13;
        }
    }

    private static boolean a(long[] jArr, long j6, long j9, long j10) {
        int length = jArr.length - 1;
        return jArr[0] <= j9 && j9 < jArr[af.a(3, 0, length)] && jArr[af.a(jArr.length - 3, 0, length)] < j10 && j10 <= j6;
    }
}
