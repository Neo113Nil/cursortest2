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
    private static final String f7730a = "AtomParsers";

    /* renamed from: b, reason: collision with root package name */
    private static final int f7731b = af.f("vide");

    /* renamed from: c, reason: collision with root package name */
    private static final int f7732c = af.f("soun");

    /* renamed from: d, reason: collision with root package name */
    private static final int f7733d = af.f(o.f9232c);

    /* renamed from: e, reason: collision with root package name */
    private static final int f7734e = af.f("sbtl");

    /* renamed from: f, reason: collision with root package name */
    private static final int f7735f = af.f("subt");

    /* renamed from: g, reason: collision with root package name */
    private static final int f7736g = af.f("clcp");

    /* renamed from: h, reason: collision with root package name */
    private static final int f7737h = af.f("meta");
    private static final int i = 3;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f7738a;

        /* renamed from: b, reason: collision with root package name */
        public int f7739b;

        /* renamed from: c, reason: collision with root package name */
        public int f7740c;

        /* renamed from: d, reason: collision with root package name */
        public long f7741d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f7742e;

        /* renamed from: f, reason: collision with root package name */
        private final s f7743f;

        /* renamed from: g, reason: collision with root package name */
        private final s f7744g;

        /* renamed from: h, reason: collision with root package name */
        private int f7745h;
        private int i;

        public a(s sVar, s sVar2, boolean z6) {
            this.f7744g = sVar;
            this.f7743f = sVar2;
            this.f7742e = z6;
            sVar2.c(12);
            this.f7738a = sVar2.m();
            sVar.c(12);
            this.i = sVar.m();
            com.anythink.basead.exoplayer.k.a.b(sVar.i() == 1, "first_chunk must be 1");
            this.f7739b = -1;
        }

        public final boolean a() {
            int i = this.f7739b + 1;
            this.f7739b = i;
            if (i == this.f7738a) {
                return false;
            }
            this.f7741d = this.f7742e ? this.f7743f.n() : this.f7743f.h();
            if (this.f7739b == this.f7745h) {
                this.f7740c = this.f7744g.m();
                this.f7744g.d(4);
                int i4 = this.i - 1;
                this.i = i4;
                this.f7745h = i4 > 0 ? this.f7744g.m() - 1 : -1;
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
        public static final int f7746a = 8;

        /* renamed from: b, reason: collision with root package name */
        public final k[] f7747b;

        /* renamed from: c, reason: collision with root package name */
        public com.anythink.basead.exoplayer.m f7748c;

        /* renamed from: d, reason: collision with root package name */
        public int f7749d;

        /* renamed from: e, reason: collision with root package name */
        public int f7750e = 0;

        public c(int i) {
            this.f7747b = new k[i];
        }
    }

    public static final class d implements InterfaceC0022b {

        /* renamed from: a, reason: collision with root package name */
        private final int f7751a;

        /* renamed from: b, reason: collision with root package name */
        private final int f7752b;

        /* renamed from: c, reason: collision with root package name */
        private final s f7753c;

        public d(a.b bVar) {
            s sVar = bVar.aV;
            this.f7753c = sVar;
            sVar.c(12);
            this.f7751a = sVar.m();
            this.f7752b = sVar.m();
        }

        @Override // com.anythink.basead.exoplayer.e.a.b.InterfaceC0022b
        public final int a() {
            return this.f7752b;
        }

        @Override // com.anythink.basead.exoplayer.e.a.b.InterfaceC0022b
        public final int b() {
            int i = this.f7751a;
            return i == 0 ? this.f7753c.m() : i;
        }

        @Override // com.anythink.basead.exoplayer.e.a.b.InterfaceC0022b
        public final boolean c() {
            return this.f7751a != 0;
        }
    }

    public static final class e implements InterfaceC0022b {

        /* renamed from: a, reason: collision with root package name */
        private final s f7754a;

        /* renamed from: b, reason: collision with root package name */
        private final int f7755b;

        /* renamed from: c, reason: collision with root package name */
        private final int f7756c;

        /* renamed from: d, reason: collision with root package name */
        private int f7757d;

        /* renamed from: e, reason: collision with root package name */
        private int f7758e;

        public e(a.b bVar) {
            s sVar = bVar.aV;
            this.f7754a = sVar;
            sVar.c(12);
            this.f7756c = sVar.m() & p.f9259b;
            this.f7755b = sVar.m();
        }

        @Override // com.anythink.basead.exoplayer.e.a.b.InterfaceC0022b
        public final int a() {
            return this.f7755b;
        }

        @Override // com.anythink.basead.exoplayer.e.a.b.InterfaceC0022b
        public final int b() {
            int i = this.f7756c;
            if (i == 8) {
                return this.f7754a.d();
            }
            if (i == 16) {
                return this.f7754a.e();
            }
            int i4 = this.f7757d;
            this.f7757d = i4 + 1;
            if (i4 % 2 != 0) {
                return this.f7758e & 15;
            }
            int d9 = this.f7754a.d();
            this.f7758e = d9;
            return (d9 & 240) >> 4;
        }

        @Override // com.anythink.basead.exoplayer.e.a.b.InterfaceC0022b
        public final boolean c() {
            return false;
        }
    }

    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        private final int f7759a;

        /* renamed from: b, reason: collision with root package name */
        private final long f7760b;

        /* renamed from: c, reason: collision with root package name */
        private final int f7761c;

        public f(int i, long j6, int i4) {
            this.f7759a = i;
            this.f7760b = j6;
            this.f7761c = i4;
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
    public static j a(a.C0021a c0021a, a.b bVar, long j6, com.anythink.basead.exoplayer.d.e eVar, boolean z6, boolean z9) {
        int i4;
        int i6;
        long j9;
        j jVar;
        long j10;
        long[] jArr;
        long[] jArr2;
        a.C0021a e9 = c0021a.e(com.anythink.basead.exoplayer.e.a.a.J);
        s sVar = e9.d(com.anythink.basead.exoplayer.e.a.a.f7703X).aV;
        sVar.c(16);
        int i9 = sVar.i();
        if (i9 == f7732c) {
            i4 = 1;
        } else if (i9 == f7731b) {
            i4 = 2;
        } else {
            if (i9 != f7733d && i9 != f7734e && i9 != f7735f && i9 != f7736g) {
                i6 = i9 == f7737h ? 4 : -1;
                j jVar2 = null;
                if (i6 != -1) {
                    return null;
                }
                s sVar2 = c0021a.d(com.anythink.basead.exoplayer.e.a.a.f7699T).aV;
                sVar2.c(8);
                int a9 = com.anythink.basead.exoplayer.e.a.a.a(sVar2.i());
                sVar2.d(a9 == 0 ? 8 : 16);
                int i10 = sVar2.i();
                sVar2.d(4);
                int c9 = sVar2.c();
                int i11 = a9 == 0 ? 4 : 8;
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    j9 = com.anythink.basead.exoplayer.b.f7168b;
                    if (i13 >= i11) {
                        jVar = jVar2;
                        sVar2.d(i11);
                        break;
                    }
                    jVar = jVar2;
                    if (sVar2.f9288a[c9 + i13] != -1) {
                        j10 = a9 == 0 ? sVar2.h() : sVar2.n();
                    } else {
                        i13++;
                        jVar2 = jVar;
                    }
                }
                j10 = -9223372036854775807L;
                sVar2.d(16);
                int i14 = sVar2.i();
                int i15 = sVar2.i();
                sVar2.d(4);
                int i16 = sVar2.i();
                int i17 = sVar2.i();
                if (i14 == 0 && i15 == 65536 && i16 == -65536 && i17 == 0) {
                    i12 = 90;
                } else if (i14 == 0 && i15 == -65536 && i16 == 65536 && i17 == 0) {
                    i12 = 270;
                } else if (i14 == -65536 && i15 == 0 && i16 == 0 && i17 == -65536) {
                    i12 = 180;
                }
                f fVar = new f(i10, j10, i12);
                long j11 = j6 == com.anythink.basead.exoplayer.b.f7168b ? fVar.f7760b : j6;
                s sVar3 = bVar.aV;
                sVar3.c(8);
                sVar3.d(com.anythink.basead.exoplayer.e.a.a.a(sVar3.i()) == 0 ? 8 : 16);
                long h3 = sVar3.h();
                if (j11 != com.anythink.basead.exoplayer.b.f7168b) {
                    j9 = af.a(j11, 1000000L, h3);
                }
                long j12 = j9;
                a.C0021a e10 = e9.e(com.anythink.basead.exoplayer.e.a.a.f7690K).e(com.anythink.basead.exoplayer.e.a.a.f7691L);
                s sVar4 = e9.d(com.anythink.basead.exoplayer.e.a.a.f7702W).aV;
                sVar4.c(8);
                int a10 = com.anythink.basead.exoplayer.e.a.a.a(sVar4.i());
                sVar4.d(a10 == 0 ? 8 : 16);
                long h9 = sVar4.h();
                sVar4.d(a10 != 0 ? 8 : 4);
                int e11 = sVar4.e();
                StringBuilder sb = new StringBuilder();
                sb.append((char) (((e11 >> 10) & 31) + 96));
                sb.append((char) (((e11 >> 5) & 31) + 96));
                sb.append((char) ((e11 & 31) + 96));
                Pair create = Pair.create(Long.valueOf(h9), sb.toString());
                c a11 = a(e10.d(com.anythink.basead.exoplayer.e.a.a.Y).aV, fVar.f7759a, fVar.f7761c, (String) create.second, eVar, z9);
                if (z6) {
                    j jVar3 = jVar;
                    jArr = jVar3;
                    jArr2 = jVar3;
                } else {
                    Pair<long[], long[]> a12 = a(c0021a.e(com.anythink.basead.exoplayer.e.a.a.f7700U));
                    long[] jArr3 = (long[]) a12.first;
                    jArr = (long[]) a12.second;
                    jArr2 = jArr3;
                }
                return a11.f7748c == null ? jVar : new j(fVar.f7759a, i6, ((Long) create.first).longValue(), h3, j12, a11.f7748c, a11.f7750e, a11.f7747b, a11.f7749d, jArr2, jArr);
            }
            i4 = 3;
        }
        i6 = i4;
        j jVar22 = null;
        if (i6 != -1) {
        }
    }

    private static com.anythink.basead.exoplayer.g.a b(s sVar, int i4) {
        sVar.d(8);
        ArrayList arrayList = new ArrayList();
        while (sVar.c() < i4) {
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
        int i4 = sVar.i();
        if (i4 == f7732c) {
            return 1;
        }
        if (i4 == f7731b) {
            return 2;
        }
        if (i4 == f7733d || i4 == f7734e || i4 == f7735f || i4 == f7736g) {
            return 3;
        }
        return i4 == f7737h ? 4 : -1;
    }

    private static Pair<Long, String> d(s sVar) {
        sVar.c(8);
        int a9 = com.anythink.basead.exoplayer.e.a.a.a(sVar.i());
        sVar.d(a9 == 0 ? 8 : 16);
        long h3 = sVar.h();
        sVar.d(a9 == 0 ? 4 : 8);
        int e9 = sVar.e();
        StringBuilder sb = new StringBuilder();
        sb.append((char) (((e9 >> 10) & 31) + 96));
        sb.append((char) (((e9 >> 5) & 31) + 96));
        sb.append((char) ((e9 & 31) + 96));
        return Pair.create(Long.valueOf(h3), sb.toString());
    }

    private static int e(s sVar) {
        int d9 = sVar.d();
        int i4 = d9 & com.anythink.expressad.video.module.a.a.f22515R;
        while ((d9 & 128) == 128) {
            d9 = sVar.d();
            i4 = (i4 << 7) | (d9 & com.anythink.expressad.video.module.a.a.f22515R);
        }
        return i4;
    }

    private static f b(s sVar) {
        long j6;
        sVar.c(8);
        int a9 = com.anythink.basead.exoplayer.e.a.a.a(sVar.i());
        sVar.d(a9 == 0 ? 8 : 16);
        int i4 = sVar.i();
        sVar.d(4);
        int c9 = sVar.c();
        int i6 = a9 == 0 ? 4 : 8;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            j6 = com.anythink.basead.exoplayer.b.f7168b;
            if (i10 < i6) {
                if (sVar.f9288a[c9 + i10] != -1) {
                    long h3 = a9 == 0 ? sVar.h() : sVar.n();
                    if (h3 != 0) {
                        j6 = h3;
                    }
                } else {
                    i10++;
                }
            } else {
                sVar.d(i6);
                break;
            }
        }
        sVar.d(16);
        int i11 = sVar.i();
        int i12 = sVar.i();
        sVar.d(4);
        int i13 = sVar.i();
        int i14 = sVar.i();
        if (i11 == 0 && i12 == 65536 && i13 == -65536 && i14 == 0) {
            i9 = 90;
        } else if (i11 == 0 && i12 == -65536 && i13 == 65536 && i14 == 0) {
            i9 = 270;
        } else if (i11 == -65536 && i12 == 0 && i13 == 0 && i14 == -65536) {
            i9 = 180;
        }
        return new f(i4, j6, i9);
    }

    private static float c(s sVar, int i4) {
        sVar.c(i4 + 8);
        return sVar.m() / sVar.m();
    }

    private static Pair<Integer, k> c(s sVar, int i4, int i6) {
        int i9 = i4 + 8;
        int i10 = -1;
        int i11 = 0;
        String str = null;
        Integer num = null;
        while (i9 - i4 < i6) {
            sVar.c(i9);
            int i12 = sVar.i();
            int i13 = sVar.i();
            if (i13 == com.anythink.basead.exoplayer.e.a.a.ag) {
                num = Integer.valueOf(sVar.i());
            } else if (i13 == com.anythink.basead.exoplayer.e.a.a.ab) {
                sVar.d(4);
                str = sVar.o();
            } else if (i13 == com.anythink.basead.exoplayer.e.a.a.ac) {
                i10 = i9;
                i11 = i12;
            }
            i9 += i12;
        }
        if (!com.anythink.basead.exoplayer.b.bd.equals(str) && !com.anythink.basead.exoplayer.b.be.equals(str) && !com.anythink.basead.exoplayer.b.bf.equals(str) && !com.anythink.basead.exoplayer.b.bg.equals(str)) {
            return null;
        }
        com.anythink.basead.exoplayer.k.a.a(num != null, "frma atom is mandatory");
        com.anythink.basead.exoplayer.k.a.a(i10 != -1, "schi atom is mandatory");
        k a9 = a(sVar, i10, i11, str);
        com.anythink.basead.exoplayer.k.a.a(a9 != null, "tenc atom is mandatory");
        return Pair.create(num, a9);
    }

    private static Pair<String, byte[]> d(s sVar, int i4) {
        sVar.c(i4 + 12);
        sVar.d(1);
        e(sVar);
        sVar.d(2);
        int d9 = sVar.d();
        if ((d9 & 128) != 0) {
            sVar.d(2);
        }
        if ((d9 & 64) != 0) {
            sVar.d(sVar.e());
        }
        if ((d9 & 32) != 0) {
            sVar.d(2);
        }
        sVar.d(1);
        e(sVar);
        String a9 = o.a(sVar.d());
        if (!o.f9248t.equals(a9) && !o.f9209D.equals(a9) && !o.f9210E.equals(a9)) {
            sVar.d(12);
            sVar.d(1);
            int e9 = e(sVar);
            byte[] bArr = new byte[e9];
            sVar.a(bArr, 0, e9);
            return Pair.create(a9, bArr);
        }
        return Pair.create(a9, null);
    }

    private static Pair<Integer, k> b(s sVar, int i4, int i6) {
        Pair<Integer, k> c9;
        int c10 = sVar.c();
        while (c10 - i4 < i6) {
            sVar.c(c10);
            int i9 = sVar.i();
            com.anythink.basead.exoplayer.k.a.a(i9 > 0, "childAtomSize should be positive");
            if (sVar.i() == com.anythink.basead.exoplayer.e.a.a.aa && (c9 = c(sVar, c10, i9)) != null) {
                return c9;
            }
            c10 += i9;
        }
        return null;
    }

    private static byte[] d(s sVar, int i4, int i6) {
        int i9 = i4 + 8;
        while (i9 - i4 < i6) {
            sVar.c(i9);
            int i10 = sVar.i();
            if (sVar.i() == com.anythink.basead.exoplayer.e.a.a.aO) {
                return Arrays.copyOfRange(sVar.f9288a, i9, i10 + i9);
            }
            i9 += i10;
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
        boolean z6;
        int i4;
        int i6;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        int[] iArr2;
        long j6;
        int i14;
        long a9;
        int[] iArr3;
        long[] jArr3;
        String str;
        long j9;
        int[] iArr4;
        int i15;
        String str2;
        a.b d9 = c0021a.d(com.anythink.basead.exoplayer.e.a.a.av);
        if (d9 != null) {
            eVar = new d(d9);
        } else {
            a.b d10 = c0021a.d(com.anythink.basead.exoplayer.e.a.a.aw);
            if (d10 != null) {
                eVar = new e(d10);
            } else {
                throw new t("Track has no sample table size information");
            }
        }
        int a10 = eVar.a();
        if (a10 == 0) {
            return new m(jVar, new long[0], new int[0], 0, new long[0], new int[0], com.anythink.basead.exoplayer.b.f7168b);
        }
        a.b d11 = c0021a.d(com.anythink.basead.exoplayer.e.a.a.ax);
        if (d11 == null) {
            d11 = c0021a.d(com.anythink.basead.exoplayer.e.a.a.ay);
            z6 = true;
        } else {
            z6 = false;
        }
        s sVar = d11.aV;
        s sVar2 = c0021a.d(com.anythink.basead.exoplayer.e.a.a.au).aV;
        s sVar3 = c0021a.d(com.anythink.basead.exoplayer.e.a.a.ar).aV;
        a.b d12 = c0021a.d(com.anythink.basead.exoplayer.e.a.a.as);
        s sVar4 = null;
        s sVar5 = d12 != null ? d12.aV : null;
        a.b d13 = c0021a.d(com.anythink.basead.exoplayer.e.a.a.at);
        s sVar6 = d13 != null ? d13.aV : null;
        a aVar = new a(sVar2, sVar, z6);
        sVar3.c(12);
        int m9 = sVar3.m() - 1;
        int m10 = sVar3.m();
        int m11 = sVar3.m();
        if (sVar6 != null) {
            sVar6.c(12);
            i4 = sVar6.m();
        } else {
            i4 = 0;
        }
        if (sVar5 != null) {
            sVar5.c(12);
            i6 = sVar5.m();
            r16 = i6 > 0 ? sVar5.m() - 1 : -1;
            if (eVar.c()) {
                i9 = 0;
            } else {
                i9 = 0;
                if (o.f9251w.equals(jVar.f7903h.f9451h) && m9 == 0 && i4 == 0 && i6 == 0) {
                    i10 = 1;
                    String str3 = f7730a;
                    if (i10 == 0) {
                        long[] jArr4 = new long[a10];
                        i12 = 1;
                        int[] iArr5 = new int[a10];
                        s sVar7 = sVar6;
                        long[] jArr5 = new long[a10];
                        int[] iArr6 = new int[a10];
                        int i16 = r16;
                        InterfaceC0022b interfaceC0022b = eVar;
                        int i17 = i9;
                        int i18 = i17;
                        int i19 = i18;
                        i13 = i19;
                        int i20 = i13;
                        long j10 = 0;
                        long j11 = 0;
                        while (i17 < a10) {
                            while (i19 == 0) {
                                com.anythink.basead.exoplayer.k.a.b(aVar.a());
                                long j12 = aVar.f7741d;
                                i19 = aVar.f7740c;
                                j11 = j12;
                                a10 = a10;
                            }
                            int i21 = a10;
                            if (sVar7 != null) {
                                while (i20 == 0 && i4 > 0) {
                                    i20 = sVar7.m();
                                    i18 = sVar7.i();
                                    i4--;
                                }
                                i20--;
                            }
                            jArr4[i17] = j11;
                            int b9 = interfaceC0022b.b();
                            iArr5[i17] = b9;
                            if (b9 > i13) {
                                i13 = b9;
                            }
                            jArr5[i17] = j10 + i18;
                            iArr6[i17] = sVar4 == null ? 1 : i9;
                            if (i17 == i16) {
                                iArr6[i17] = 1;
                                i6--;
                                if (i6 > 0) {
                                    i16 = sVar4.m() - 1;
                                }
                            }
                            j10 += m11;
                            m10--;
                            if (m10 == 0 && m9 > 0) {
                                m9--;
                                m10 = sVar3.m();
                                m11 = sVar3.i();
                            }
                            j11 += iArr5[i17];
                            i19--;
                            i17++;
                            a10 = i21;
                        }
                        i11 = a10;
                        long j13 = j10 + i18;
                        com.anythink.basead.exoplayer.k.a.a(i20 == 0 ? 1 : i9);
                        while (i4 > 0) {
                            com.anythink.basead.exoplayer.k.a.a(sVar7.m() == 0 ? 1 : i9);
                            sVar7.i();
                            i4--;
                        }
                        if (i6 != 0 || m10 != 0 || i19 != 0 || m9 != 0) {
                            Log.w(f7730a, "Inconsistent stbl box for track " + jVar.f7898c + ": remainingSynchronizationSamples " + i6 + ", remainingSamplesAtTimestampDelta " + m10 + ", remainingSamplesInChunk " + i19 + ", remainingTimestampDeltaChanges " + m9);
                        }
                        iArr = iArr6;
                        jArr = jArr5;
                        jArr2 = jArr4;
                        iArr2 = iArr5;
                        j6 = j13;
                    } else {
                        i11 = a10;
                        i12 = 1;
                        int i22 = aVar.f7738a;
                        long[] jArr6 = new long[i22];
                        int[] iArr7 = new int[i22];
                        while (aVar.a()) {
                            int i23 = aVar.f7739b;
                            jArr6[i23] = aVar.f7741d;
                            iArr7[i23] = aVar.f7740c;
                        }
                        com.anythink.basead.exoplayer.m mVar = jVar.f7903h;
                        d.a a11 = com.anythink.basead.exoplayer.e.a.d.a(af.b(mVar.f9465w, mVar.f9463u), jArr6, iArr7, m11);
                        long[] jArr7 = a11.f7767a;
                        int[] iArr8 = a11.f7768b;
                        i13 = a11.f7769c;
                        long[] jArr8 = a11.f7770d;
                        int[] iArr9 = a11.f7771e;
                        long j14 = a11.f7772f;
                        jArr = jArr8;
                        iArr = iArr9;
                        jArr2 = jArr7;
                        iArr2 = iArr8;
                        j6 = j14;
                    }
                    i14 = i13;
                    a9 = af.a(j6, 1000000L, jVar.f7900e);
                    if (jVar.f7904j == null && !iVar.a()) {
                        long[] jArr9 = jVar.f7904j;
                        int i24 = i12;
                        if (jArr9.length == i24 && jVar.f7899d == i24 && jArr.length >= 2) {
                            long j15 = jVar.f7905k[i9];
                            long a12 = af.a(jArr9[i9], jVar.f7900e, jVar.f7901f) + j15;
                            int length = jArr.length - 1;
                            int i25 = i9;
                            int a13 = af.a(3, i25, length);
                            int a14 = af.a(jArr.length - 3, i25, length);
                            long j16 = jArr[i25];
                            if (j16 <= j15 && j15 < jArr[a13] && jArr[a14] < a12 && a12 <= j6) {
                                long j17 = j6 - a12;
                                long a15 = af.a(j15 - j16, jVar.f7903h.f9464v, jVar.f7900e);
                                long a16 = af.a(j17, jVar.f7903h.f9464v, jVar.f7900e);
                                if ((a15 != 0 || a16 != 0) && a15 <= 2147483647L && a16 <= 2147483647L) {
                                    iVar.f7959b = (int) a15;
                                    iVar.f7960c = (int) a16;
                                    af.a(jArr, jVar.f7900e);
                                    return new m(jVar, jArr2, iArr2, i14, jArr, iArr, a9);
                                }
                            }
                        }
                        long[] jArr10 = jArr;
                        long[] jArr11 = jVar.f7904j;
                        if (jArr11.length == 1 && jArr11[0] == 0) {
                            long j18 = jVar.f7905k[0];
                            for (int i26 = 0; i26 < jArr10.length; i26++) {
                                jArr10[i26] = af.a(jArr10[i26] - j18, 1000000L, jVar.f7900e);
                            }
                            return new m(jVar, jArr2, iArr2, i14, jArr10, iArr, af.a(j6 - j18, 1000000L, jVar.f7900e));
                        }
                        boolean z9 = jVar.f7899d == 1;
                        boolean z10 = false;
                        int i27 = 0;
                        int i28 = 0;
                        int i29 = 0;
                        while (true) {
                            long[] jArr12 = jVar.f7904j;
                            if (i29 >= jArr12.length) {
                                break;
                            }
                            long j19 = jVar.f7905k[i29];
                            if (j19 != -1) {
                                long j20 = jArr12[i29];
                                str2 = str3;
                                long a17 = af.a(j20, jVar.f7900e, jVar.f7901f);
                                boolean z11 = z10;
                                i15 = i14;
                                int a18 = af.a(jArr10, j19, true, true);
                                int a19 = af.a(jArr10, j19 + a17, z9, false);
                                i27 = (a19 - a18) + i27;
                                z10 = z11 | (i28 != a18);
                                i28 = a19;
                            } else {
                                i15 = i14;
                                str2 = str3;
                            }
                            i29++;
                            str3 = str2;
                            i14 = i15;
                        }
                        int i30 = i14;
                        String str4 = str3;
                        boolean z12 = z10 | (i27 != i11);
                        long[] jArr13 = z12 ? new long[i27] : jArr2;
                        int[] iArr10 = z12 ? new int[i27] : iArr2;
                        if (z12) {
                            i30 = 0;
                        }
                        int[] iArr11 = z12 ? new int[i27] : iArr;
                        long[] jArr14 = new long[i27];
                        int i31 = i30;
                        int i32 = 0;
                        int i33 = 0;
                        long j21 = 0;
                        while (true) {
                            long[] jArr15 = jVar.f7904j;
                            boolean z13 = z12;
                            if (i33 < jArr15.length) {
                                int i34 = i31;
                                long j22 = jVar.f7905k[i33];
                                long j23 = jArr15[i33];
                                if (j22 != -1) {
                                    int[] iArr12 = iArr;
                                    jArr3 = jArr14;
                                    j9 = j23;
                                    long a20 = af.a(j23, jVar.f7900e, jVar.f7901f) + j22;
                                    String str5 = str4;
                                    int a21 = af.a(jArr10, j22, true, true);
                                    int a22 = af.a(jArr10, a20, z9, false);
                                    if (z13) {
                                        int i35 = a22 - a21;
                                        System.arraycopy(jArr2, a21, jArr13, i32, i35);
                                        System.arraycopy(iArr2, a21, iArr10, i32, i35);
                                        iArr4 = iArr12;
                                        System.arraycopy(iArr4, a21, iArr11, i32, i35);
                                    } else {
                                        iArr4 = iArr12;
                                    }
                                    if (a21 < a22 && (iArr11[i32] & 1) == 0) {
                                        Log.w(str5, "Ignoring edit list: edit does not start with a sync sample.");
                                        throw new g();
                                    }
                                    str = str5;
                                    iArr3 = iArr4;
                                    int i36 = i34;
                                    while (a21 < a22) {
                                        long[] jArr16 = jArr2;
                                        int[] iArr13 = iArr2;
                                        jArr3[i32] = af.a(j21, 1000000L, jVar.f7901f) + af.a(jArr10[a21] - j22, 1000000L, jVar.f7900e);
                                        if (z13 && iArr10[i32] > i36) {
                                            i36 = iArr13[a21];
                                        }
                                        i32++;
                                        a21++;
                                        jArr2 = jArr16;
                                        iArr2 = iArr13;
                                    }
                                    i31 = i36;
                                } else {
                                    iArr3 = iArr;
                                    jArr3 = jArr14;
                                    str = str4;
                                    j9 = j23;
                                    i31 = i34;
                                }
                                j21 += j9;
                                i33++;
                                str4 = str;
                                z12 = z13;
                                jArr14 = jArr3;
                                iArr = iArr3;
                                jArr2 = jArr2;
                                iArr2 = iArr2;
                            } else {
                                return new m(jVar, jArr13, iArr10, i31, jArr14, iArr11, af.a(j21, 1000000L, jVar.f7900e));
                            }
                        }
                    } else {
                        long[] jArr17 = jArr2;
                        int[] iArr14 = iArr2;
                        int[] iArr15 = iArr;
                        long[] jArr18 = jArr;
                        af.a(jArr18, jVar.f7900e);
                        return new m(jVar, jArr17, iArr14, i14, jArr18, iArr15, a9);
                    }
                }
            }
            i10 = i9;
            String str32 = f7730a;
            if (i10 == 0) {
            }
            i14 = i13;
            a9 = af.a(j6, 1000000L, jVar.f7900e);
            if (jVar.f7904j == null) {
            }
            long[] jArr172 = jArr2;
            int[] iArr142 = iArr2;
            int[] iArr152 = iArr;
            long[] jArr182 = jArr;
            af.a(jArr182, jVar.f7900e);
            return new m(jVar, jArr172, iArr142, i14, jArr182, iArr152, a9);
        }
        i6 = 0;
        sVar4 = sVar5;
        if (eVar.c()) {
        }
        i10 = i9;
        String str322 = f7730a;
        if (i10 == 0) {
        }
        i14 = i13;
        a9 = af.a(j6, 1000000L, jVar.f7900e);
        if (jVar.f7904j == null) {
        }
        long[] jArr1722 = jArr2;
        int[] iArr1422 = iArr2;
        int[] iArr1522 = iArr;
        long[] jArr1822 = jArr;
        af.a(jArr1822, jVar.f7900e);
        return new m(jVar, jArr1722, iArr1422, i14, jArr1822, iArr1522, a9);
    }

    public static com.anythink.basead.exoplayer.g.a a(a.b bVar, boolean z6) {
        if (z6) {
            return null;
        }
        s sVar = bVar.aV;
        sVar.c(8);
        while (sVar.a() >= 8) {
            int c9 = sVar.c();
            int i4 = sVar.i();
            if (sVar.i() == com.anythink.basead.exoplayer.e.a.a.aG) {
                sVar.c(c9);
                int i6 = c9 + i4;
                sVar.d(12);
                while (true) {
                    if (sVar.c() >= i6) {
                        break;
                    }
                    int c10 = sVar.c();
                    int i9 = sVar.i();
                    if (sVar.i() == com.anythink.basead.exoplayer.e.a.a.aH) {
                        sVar.c(c10);
                        int i10 = c10 + i9;
                        sVar.d(8);
                        ArrayList arrayList = new ArrayList();
                        while (sVar.c() < i10) {
                            a.InterfaceC0025a a9 = com.anythink.basead.exoplayer.e.a.f.a(sVar);
                            if (a9 != null) {
                                arrayList.add(a9);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            return new com.anythink.basead.exoplayer.g.a(arrayList);
                        }
                    } else {
                        sVar.d(i9 - 8);
                    }
                }
                return null;
            }
            sVar.d(i4 - 8);
        }
        return null;
    }

    private static com.anythink.basead.exoplayer.g.a a(s sVar, int i4) {
        sVar.d(12);
        while (sVar.c() < i4) {
            int c9 = sVar.c();
            int i6 = sVar.i();
            if (sVar.i() == com.anythink.basead.exoplayer.e.a.a.aH) {
                sVar.c(c9);
                int i9 = c9 + i6;
                sVar.d(8);
                ArrayList arrayList = new ArrayList();
                while (sVar.c() < i9) {
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
            sVar.d(i6 - 8);
        }
        return null;
    }

    private static long a(s sVar) {
        sVar.c(8);
        sVar.d(com.anythink.basead.exoplayer.e.a.a.a(sVar.i()) != 0 ? 16 : 8);
        return sVar.h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static c a(s sVar, int i4, int i6, String str, com.anythink.basead.exoplayer.d.e eVar, boolean z6) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        com.anythink.basead.exoplayer.d.e eVar2;
        byte[] bArr;
        String str2;
        List<byte[]> list;
        String str3;
        com.anythink.basead.exoplayer.d.e eVar3;
        int i14;
        int k9;
        int i15;
        com.anythink.basead.exoplayer.d.e eVar4;
        String str4;
        int i16;
        String str5;
        String str6;
        int i17;
        int i18;
        List list2;
        int i19;
        String str7;
        int c9;
        String str8;
        String str9;
        char c10;
        com.anythink.basead.exoplayer.d.e eVar5 = eVar;
        sVar.c(12);
        int i20 = sVar.i();
        c cVar = new c(i20);
        int i21 = 0;
        int i22 = 0;
        while (i22 < i20) {
            int c11 = sVar.c();
            int i23 = sVar.i();
            boolean z9 = true;
            com.anythink.basead.exoplayer.k.a.a(i23 > 0 ? 1 : i21, "childAtomSize should be positive");
            int i24 = sVar.i();
            List list3 = null;
            if (i24 != com.anythink.basead.exoplayer.e.a.a.f7711g && i24 != com.anythink.basead.exoplayer.e.a.a.f7712h && i24 != com.anythink.basead.exoplayer.e.a.a.ae && i24 != com.anythink.basead.exoplayer.e.a.a.aq && i24 != com.anythink.basead.exoplayer.e.a.a.i && i24 != com.anythink.basead.exoplayer.e.a.a.f7713j && i24 != com.anythink.basead.exoplayer.e.a.a.f7714k && i24 != com.anythink.basead.exoplayer.e.a.a.aP && i24 != com.anythink.basead.exoplayer.e.a.a.aQ) {
                if (i24 != com.anythink.basead.exoplayer.e.a.a.f7717n && i24 != com.anythink.basead.exoplayer.e.a.a.af && i24 != com.anythink.basead.exoplayer.e.a.a.f7722s && i24 != com.anythink.basead.exoplayer.e.a.a.f7724u && i24 != com.anythink.basead.exoplayer.e.a.a.f7726w && i24 != com.anythink.basead.exoplayer.e.a.a.f7729z && i24 != com.anythink.basead.exoplayer.e.a.a.f7727x && i24 != com.anythink.basead.exoplayer.e.a.a.f7728y && i24 != com.anythink.basead.exoplayer.e.a.a.aD && i24 != com.anythink.basead.exoplayer.e.a.a.aE && i24 != com.anythink.basead.exoplayer.e.a.a.f7720q && i24 != com.anythink.basead.exoplayer.e.a.a.f7721r && i24 != com.anythink.basead.exoplayer.e.a.a.f7718o && i24 != com.anythink.basead.exoplayer.e.a.a.aT) {
                    int i25 = com.anythink.basead.exoplayer.e.a.a.ao;
                    if (i24 != i25 && i24 != com.anythink.basead.exoplayer.e.a.a.az && i24 != com.anythink.basead.exoplayer.e.a.a.aA && i24 != com.anythink.basead.exoplayer.e.a.a.aB && i24 != com.anythink.basead.exoplayer.e.a.a.aC) {
                        if (i24 == com.anythink.basead.exoplayer.e.a.a.aS) {
                            cVar.f7748c = com.anythink.basead.exoplayer.m.a(Integer.toString(i4), o.ah, (String) null, (com.anythink.basead.exoplayer.d.e) null);
                        }
                        i9 = i22;
                        i10 = i20;
                        i11 = i21;
                        i12 = c11;
                        i13 = i23;
                    } else {
                        sVar.c(c11 + 16);
                        String str10 = o.f9229Z;
                        long j6 = Long.MAX_VALUE;
                        if (i24 != i25) {
                            if (i24 == com.anythink.basead.exoplayer.e.a.a.az) {
                                int i26 = i23 - 16;
                                byte[] bArr2 = new byte[i26];
                                sVar.a(bArr2, i21, i26);
                                list3 = Collections.singletonList(bArr2);
                                str10 = o.aa;
                            } else if (i24 == com.anythink.basead.exoplayer.e.a.a.aA) {
                                str10 = o.ab;
                            } else if (i24 == com.anythink.basead.exoplayer.e.a.a.aB) {
                                j6 = 0;
                            } else if (i24 == com.anythink.basead.exoplayer.e.a.a.aC) {
                                cVar.f7750e = 1;
                                str10 = o.ac;
                            } else {
                                throw new IllegalStateException();
                            }
                        }
                        i9 = i22;
                        i12 = c11;
                        i10 = i20;
                        i13 = i23;
                        cVar.f7748c = com.anythink.basead.exoplayer.m.a(Integer.toString(i4), str10, (String) null, -1, 0, str, -1, (com.anythink.basead.exoplayer.d.e) null, j6, (List<byte[]>) list3);
                        i11 = 0;
                    }
                } else {
                    i9 = i22;
                    i12 = c11;
                    i10 = i20;
                    String str11 = str;
                    i13 = i23;
                    sVar.c(i12 + 16);
                    if (z6) {
                        i14 = sVar.e();
                        sVar.d(6);
                    } else {
                        sVar.d(8);
                        i14 = 0;
                    }
                    if (i14 == 0 || i14 == 1) {
                        int e9 = sVar.e();
                        sVar.d(6);
                        k9 = sVar.k();
                        if (i14 == 1) {
                            sVar.d(16);
                        }
                        i15 = e9;
                    } else {
                        if (i14 == 2) {
                            sVar.d(16);
                            k9 = (int) Math.round(Double.longBitsToDouble(sVar.j()));
                            i15 = sVar.m();
                            sVar.d(20);
                        }
                        i11 = 0;
                    }
                    int c12 = sVar.c();
                    if (i24 == com.anythink.basead.exoplayer.e.a.a.af) {
                        Pair<Integer, k> b9 = b(sVar, i12, i13);
                        if (b9 != null) {
                            i24 = ((Integer) b9.first).intValue();
                            eVar4 = eVar5 == null ? null : eVar5.a(((k) b9.second).f7910b);
                            cVar.f7747b[i9] = (k) b9.second;
                        } else {
                            eVar4 = eVar5;
                        }
                        sVar.c(c12);
                    } else {
                        eVar4 = eVar5;
                    }
                    int i27 = com.anythink.basead.exoplayer.e.a.a.f7722s;
                    String str12 = o.f9251w;
                    if (i24 == i27) {
                        str4 = o.f9254z;
                    } else if (i24 == com.anythink.basead.exoplayer.e.a.a.f7724u) {
                        str4 = o.f9206A;
                    } else if (i24 == com.anythink.basead.exoplayer.e.a.a.f7726w) {
                        str4 = o.f9209D;
                    } else if (i24 != com.anythink.basead.exoplayer.e.a.a.f7727x && i24 != com.anythink.basead.exoplayer.e.a.a.f7728y) {
                        if (i24 == com.anythink.basead.exoplayer.e.a.a.f7729z) {
                            str4 = o.f9211F;
                        } else if (i24 == com.anythink.basead.exoplayer.e.a.a.aD) {
                            str4 = o.f9214I;
                        } else if (i24 == com.anythink.basead.exoplayer.e.a.a.aE) {
                            str4 = o.J;
                        } else if (i24 == com.anythink.basead.exoplayer.e.a.a.f7720q || i24 == com.anythink.basead.exoplayer.e.a.a.f7721r) {
                            str4 = o.f9251w;
                        } else if (i24 == com.anythink.basead.exoplayer.e.a.a.f7718o) {
                            str4 = o.f9248t;
                        } else {
                            str4 = i24 == com.anythink.basead.exoplayer.e.a.a.aT ? o.f9216L : null;
                        }
                    } else {
                        str4 = o.f9210E;
                    }
                    int i28 = k9;
                    int i29 = c12;
                    int i30 = i15;
                    byte[] bArr3 = null;
                    while (i29 - i12 < i13) {
                        sVar.c(i29);
                        int i31 = sVar.i();
                        com.anythink.basead.exoplayer.k.a.a(i31 > 0 ? z9 : false, "childAtomSize should be positive");
                        int i32 = sVar.i();
                        int i33 = com.anythink.basead.exoplayer.e.a.a.f7694O;
                        if (i32 != i33) {
                            int i34 = i29;
                            if (z6 && i32 == com.anythink.basead.exoplayer.e.a.a.f7719p) {
                                i16 = i34;
                                str5 = str4;
                                str6 = str12;
                                i18 = -1;
                                list2 = null;
                                i17 = i13;
                            } else {
                                if (i32 == com.anythink.basead.exoplayer.e.a.a.f7723t) {
                                    sVar.c(i34 + 8);
                                    cVar.f7748c = com.anythink.basead.exoplayer.b.a.a(sVar, Integer.toString(i4), str11, eVar4);
                                } else if (i32 == com.anythink.basead.exoplayer.e.a.a.f7725v) {
                                    sVar.c(i34 + 8);
                                    cVar.f7748c = com.anythink.basead.exoplayer.b.a.b(sVar, Integer.toString(i4), str11, eVar4);
                                } else {
                                    if (i32 == com.anythink.basead.exoplayer.e.a.a.f7681A) {
                                        str7 = str4;
                                        i16 = i34;
                                        c10 = 65535;
                                        list2 = null;
                                        i17 = i13;
                                        i19 = i31;
                                        str9 = str12;
                                        cVar.f7748c = com.anythink.basead.exoplayer.m.a(Integer.toString(i4), str7, null, -1, i30, i28, null, eVar4, str);
                                    } else {
                                        str7 = str4;
                                        str9 = str12;
                                        i16 = i34;
                                        c10 = 65535;
                                        list2 = null;
                                        i17 = i13;
                                        i19 = i31;
                                        if (i32 == com.anythink.basead.exoplayer.e.a.a.aT) {
                                            byte[] bArr4 = new byte[i19];
                                            sVar.c(i16);
                                            sVar.a(bArr4, 0, i19);
                                            bArr3 = bArr4;
                                            str6 = str9;
                                            i29 = i16 + i19;
                                            str12 = str6;
                                            list3 = list2;
                                            i13 = i17;
                                            z9 = true;
                                            str4 = str7;
                                            str11 = str;
                                        }
                                    }
                                    str6 = str9;
                                    i29 = i16 + i19;
                                    str12 = str6;
                                    list3 = list2;
                                    i13 = i17;
                                    z9 = true;
                                    str4 = str7;
                                    str11 = str;
                                }
                                str7 = str4;
                                str9 = str12;
                                i16 = i34;
                                c10 = 65535;
                                list2 = null;
                                i17 = i13;
                                i19 = i31;
                                str6 = str9;
                                i29 = i16 + i19;
                                str12 = str6;
                                list3 = list2;
                                i13 = i17;
                                z9 = true;
                                str4 = str7;
                                str11 = str;
                            }
                        } else {
                            i16 = i29;
                            str5 = str4;
                            str6 = str12;
                            i17 = i13;
                            i18 = -1;
                            list2 = null;
                        }
                        i19 = i31;
                        boolean z10 = false;
                        if (i32 != i33) {
                            c9 = sVar.c();
                            while (true) {
                                if (c9 - i16 >= i19) {
                                    c9 = i18;
                                    break;
                                }
                                sVar.c(c9);
                                int i35 = sVar.i();
                                if (i35 > 0) {
                                    z10 = true;
                                }
                                com.anythink.basead.exoplayer.k.a.a(z10, "childAtomSize should be positive");
                                if (sVar.i() == com.anythink.basead.exoplayer.e.a.a.f7694O) {
                                    break;
                                }
                                c9 += i35;
                                z10 = false;
                            }
                        } else {
                            c9 = i16;
                        }
                        if (c9 != i18) {
                            Pair<String, byte[]> d9 = d(sVar, c9);
                            str8 = (String) d9.first;
                            bArr3 = (byte[]) d9.second;
                            if (o.f9246r.equals(str8)) {
                                Pair<Integer, Integer> a9 = com.anythink.basead.exoplayer.k.d.a(bArr3);
                                i28 = ((Integer) a9.first).intValue();
                                i30 = ((Integer) a9.second).intValue();
                            }
                        } else {
                            str8 = str5;
                        }
                        str7 = str8;
                        i29 = i16 + i19;
                        str12 = str6;
                        list3 = list2;
                        i13 = i17;
                        z9 = true;
                        str4 = str7;
                        str11 = str;
                    }
                    String str13 = str4;
                    String str14 = str12;
                    List list4 = list3;
                    int i36 = i13;
                    if (cVar.f7748c != null || str13 == null) {
                        i11 = 0;
                    } else {
                        i11 = 0;
                        cVar.f7748c = com.anythink.basead.exoplayer.m.a(Integer.toString(i4), str13, (String) null, -1, i30, i28, str14.equals(str13) ? 2 : -1, (List<byte[]>) (bArr3 == null ? list4 : Collections.singletonList(bArr3)), eVar4, str);
                    }
                    eVar5 = eVar;
                    i13 = i36;
                }
            } else {
                i9 = i22;
                i10 = i20;
                i11 = i21;
                i12 = c11;
                sVar.c(i12 + 16);
                sVar.d(16);
                int e10 = sVar.e();
                int e11 = sVar.e();
                sVar.d(50);
                int c13 = sVar.c();
                if (i24 == com.anythink.basead.exoplayer.e.a.a.ae) {
                    i13 = i23;
                    Pair<Integer, k> b10 = b(sVar, i12, i13);
                    if (b10 != null) {
                        i24 = ((Integer) b10.first).intValue();
                        if (eVar == null) {
                            eVar5 = eVar;
                            eVar3 = null;
                        } else {
                            eVar5 = eVar;
                            eVar3 = eVar5.a(((k) b10.second).f7910b);
                        }
                        cVar.f7747b[i9] = (k) b10.second;
                    } else {
                        eVar5 = eVar;
                        eVar3 = eVar5;
                    }
                    sVar.c(c13);
                    eVar2 = eVar3;
                } else {
                    eVar5 = eVar;
                    i13 = i23;
                    eVar2 = eVar5;
                }
                int i37 = -1;
                float f2 = 1.0f;
                int i38 = i11;
                String str15 = null;
                List<byte[]> list5 = null;
                byte[] bArr5 = null;
                while (c13 - i12 < i13) {
                    sVar.c(c13);
                    int c14 = sVar.c();
                    int i39 = sVar.i();
                    if (i39 == 0 && sVar.c() - i12 == i13) {
                        break;
                    }
                    com.anythink.basead.exoplayer.k.a.a(i39 > 0 ? 1 : i11, "childAtomSize should be positive");
                    int i40 = sVar.i();
                    if (i40 == com.anythink.basead.exoplayer.e.a.a.f7692M) {
                        com.anythink.basead.exoplayer.k.a.b(str15 == null ? 1 : i11);
                        sVar.c(c14 + 8);
                        com.anythink.basead.exoplayer.l.a a10 = com.anythink.basead.exoplayer.l.a.a(sVar);
                        list = a10.f9330a;
                        cVar.f7749d = a10.f9331b;
                        if (i38 == 0) {
                            f2 = a10.f9334e;
                        }
                        str3 = o.f9237h;
                    } else if (i40 == com.anythink.basead.exoplayer.e.a.a.f7693N) {
                        com.anythink.basead.exoplayer.k.a.b(str15 == null ? 1 : i11);
                        sVar.c(c14 + 8);
                        com.anythink.basead.exoplayer.l.d a11 = com.anythink.basead.exoplayer.l.d.a(sVar);
                        list = a11.f9355a;
                        cVar.f7749d = a11.f9356b;
                        str3 = o.i;
                    } else {
                        if (i40 == com.anythink.basead.exoplayer.e.a.a.aR) {
                            com.anythink.basead.exoplayer.k.a.b(str15 == null ? 1 : i11);
                            str2 = i24 == com.anythink.basead.exoplayer.e.a.a.aP ? o.f9238j : o.f9239k;
                        } else if (i40 == com.anythink.basead.exoplayer.e.a.a.f7715l) {
                            com.anythink.basead.exoplayer.k.a.b(str15 == null ? 1 : i11);
                            str2 = o.f9236g;
                        } else {
                            if (i40 == com.anythink.basead.exoplayer.e.a.a.f7694O) {
                                com.anythink.basead.exoplayer.k.a.b(str15 == null ? 1 : i11);
                                Pair<String, byte[]> d10 = d(sVar, c14);
                                String str16 = (String) d10.first;
                                list5 = Collections.singletonList((byte[]) d10.second);
                                str15 = str16;
                            } else if (i40 == com.anythink.basead.exoplayer.e.a.a.an) {
                                sVar.c(c14 + 8);
                                f2 = sVar.m() / sVar.m();
                                i38 = 1;
                            } else if (i40 == com.anythink.basead.exoplayer.e.a.a.aN) {
                                int i41 = c14 + 8;
                                while (true) {
                                    if (i41 - c14 >= i39) {
                                        bArr = null;
                                        break;
                                    }
                                    sVar.c(i41);
                                    int i42 = sVar.i();
                                    if (sVar.i() == com.anythink.basead.exoplayer.e.a.a.aO) {
                                        bArr = Arrays.copyOfRange(sVar.f9288a, i41, i42 + i41);
                                        break;
                                    }
                                    i41 += i42;
                                }
                                bArr5 = bArr;
                            } else if (i40 == com.anythink.basead.exoplayer.e.a.a.aM) {
                                int d11 = sVar.d();
                                sVar.d(3);
                                if (d11 == 0) {
                                    int d12 = sVar.d();
                                    if (d12 == 0) {
                                        i37 = i11;
                                    } else if (d12 == 1) {
                                        i37 = 1;
                                    } else if (d12 == 2) {
                                        i37 = 2;
                                    } else if (d12 == 3) {
                                        i37 = 3;
                                    }
                                    c13 += i39;
                                }
                            }
                            c13 += i39;
                        }
                        str15 = str2;
                        c13 += i39;
                    }
                    str15 = str3;
                    list5 = list;
                    c13 += i39;
                }
                if (str15 != null) {
                    cVar.f7748c = com.anythink.basead.exoplayer.m.a(Integer.toString(i4), str15, null, -1, -1, e10, e11, -1.0f, list5, i6, f2, bArr5, i37, null, eVar2);
                }
            }
            sVar.c(i12 + i13);
            i22 = i9 + 1;
            i21 = i11;
            i20 = i10;
        }
        return cVar;
    }

    private static void a(s sVar, int i4, int i6, int i9, int i10, String str, c cVar) {
        sVar.c(i6 + 16);
        int i11 = com.anythink.basead.exoplayer.e.a.a.ao;
        String str2 = o.f9229Z;
        List list = null;
        long j6 = Long.MAX_VALUE;
        if (i4 != i11) {
            if (i4 == com.anythink.basead.exoplayer.e.a.a.az) {
                int i12 = i9 - 16;
                byte[] bArr = new byte[i12];
                sVar.a(bArr, 0, i12);
                list = Collections.singletonList(bArr);
                str2 = o.aa;
            } else if (i4 == com.anythink.basead.exoplayer.e.a.a.aA) {
                str2 = o.ab;
            } else if (i4 == com.anythink.basead.exoplayer.e.a.a.aB) {
                j6 = 0;
            } else if (i4 == com.anythink.basead.exoplayer.e.a.a.aC) {
                cVar.f7750e = 1;
                str2 = o.ac;
            } else {
                throw new IllegalStateException();
            }
        }
        cVar.f7748c = com.anythink.basead.exoplayer.m.a(Integer.toString(i10), str2, (String) null, -1, 0, str, -1, (com.anythink.basead.exoplayer.d.e) null, j6, (List<byte[]>) list);
    }

    private static void a(s sVar, int i4, int i6, int i9, int i10, int i11, com.anythink.basead.exoplayer.d.e eVar, c cVar, int i12) {
        int i13 = i6;
        com.anythink.basead.exoplayer.d.e eVar2 = eVar;
        sVar.c(i13 + 16);
        sVar.d(16);
        int e9 = sVar.e();
        int e10 = sVar.e();
        sVar.d(50);
        int c9 = sVar.c();
        String str = null;
        int i14 = i4;
        if (i14 == com.anythink.basead.exoplayer.e.a.a.ae) {
            Pair<Integer, k> b9 = b(sVar, i13, i9);
            if (b9 != null) {
                i14 = ((Integer) b9.first).intValue();
                eVar2 = eVar2 == null ? null : eVar2.a(((k) b9.second).f7910b);
                cVar.f7747b[i12] = (k) b9.second;
            }
            sVar.c(c9);
        }
        com.anythink.basead.exoplayer.d.e eVar3 = eVar2;
        float f2 = 1.0f;
        List<byte[]> list = null;
        byte[] bArr = null;
        int i15 = -1;
        boolean z6 = false;
        while (c9 - i13 < i9) {
            sVar.c(c9);
            int c10 = sVar.c();
            int i16 = sVar.i();
            if (i16 == 0 && sVar.c() - i13 == i9) {
                break;
            }
            com.anythink.basead.exoplayer.k.a.a(i16 > 0, "childAtomSize should be positive");
            int i17 = sVar.i();
            if (i17 == com.anythink.basead.exoplayer.e.a.a.f7692M) {
                com.anythink.basead.exoplayer.k.a.b(str == null);
                sVar.c(c10 + 8);
                com.anythink.basead.exoplayer.l.a a9 = com.anythink.basead.exoplayer.l.a.a(sVar);
                list = a9.f9330a;
                cVar.f7749d = a9.f9331b;
                if (!z6) {
                    f2 = a9.f9334e;
                }
                str = o.f9237h;
            } else if (i17 == com.anythink.basead.exoplayer.e.a.a.f7693N) {
                com.anythink.basead.exoplayer.k.a.b(str == null);
                sVar.c(c10 + 8);
                com.anythink.basead.exoplayer.l.d a10 = com.anythink.basead.exoplayer.l.d.a(sVar);
                list = a10.f9355a;
                cVar.f7749d = a10.f9356b;
                str = o.i;
            } else if (i17 == com.anythink.basead.exoplayer.e.a.a.aR) {
                com.anythink.basead.exoplayer.k.a.b(str == null);
                str = i14 == com.anythink.basead.exoplayer.e.a.a.aP ? o.f9238j : o.f9239k;
            } else if (i17 == com.anythink.basead.exoplayer.e.a.a.f7715l) {
                com.anythink.basead.exoplayer.k.a.b(str == null);
                str = o.f9236g;
            } else if (i17 == com.anythink.basead.exoplayer.e.a.a.f7694O) {
                com.anythink.basead.exoplayer.k.a.b(str == null);
                Pair<String, byte[]> d9 = d(sVar, c10);
                str = (String) d9.first;
                list = Collections.singletonList((byte[]) d9.second);
            } else if (i17 == com.anythink.basead.exoplayer.e.a.a.an) {
                sVar.c(c10 + 8);
                f2 = sVar.m() / sVar.m();
                z6 = true;
            } else if (i17 == com.anythink.basead.exoplayer.e.a.a.aN) {
                int i18 = c10 + 8;
                while (true) {
                    if (i18 - c10 >= i16) {
                        bArr = null;
                        break;
                    }
                    sVar.c(i18);
                    int i19 = sVar.i();
                    if (sVar.i() == com.anythink.basead.exoplayer.e.a.a.aO) {
                        bArr = Arrays.copyOfRange(sVar.f9288a, i18, i19 + i18);
                        break;
                    }
                    i18 += i19;
                }
            } else if (i17 == com.anythink.basead.exoplayer.e.a.a.aM) {
                int d10 = sVar.d();
                sVar.d(3);
                if (d10 == 0) {
                    int d11 = sVar.d();
                    if (d11 == 0) {
                        i15 = 0;
                    } else if (d11 == 1) {
                        i15 = 1;
                    } else if (d11 == 2) {
                        i15 = 2;
                    } else if (d11 == 3) {
                        i15 = 3;
                    }
                }
            }
            c9 += i16;
            i13 = i6;
        }
        if (str == null) {
            return;
        }
        cVar.f7748c = com.anythink.basead.exoplayer.m.a(Integer.toString(i10), str, null, -1, -1, e9, e10, -1.0f, list, i11, f2, bArr, i15, null, eVar3);
    }

    private static Pair<long[], long[]> a(a.C0021a c0021a) {
        a.b d9;
        if (c0021a != null && (d9 = c0021a.d(com.anythink.basead.exoplayer.e.a.a.f7701V)) != null) {
            s sVar = d9.aV;
            sVar.c(8);
            int a9 = com.anythink.basead.exoplayer.e.a.a.a(sVar.i());
            int m9 = sVar.m();
            long[] jArr = new long[m9];
            long[] jArr2 = new long[m9];
            for (int i4 = 0; i4 < m9; i4++) {
                jArr[i4] = a9 == 1 ? sVar.n() : sVar.h();
                jArr2[i4] = a9 == 1 ? sVar.j() : sVar.i();
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
    private static void a(s sVar, int i4, int i6, int i9, int i10, String str, boolean z6, com.anythink.basead.exoplayer.d.e eVar, c cVar, int i11) {
        int i12;
        int k9;
        int i13;
        String str2;
        int i14;
        String str3;
        int i15;
        int i16;
        int c9;
        int i17;
        String str4;
        String str5 = str;
        com.anythink.basead.exoplayer.d.e eVar2 = eVar;
        sVar.c(i6 + 16);
        if (z6) {
            i12 = sVar.e();
            sVar.d(6);
        } else {
            sVar.d(8);
            i12 = 0;
        }
        boolean z9 = true;
        if (i12 == 0 || i12 == 1) {
            int e9 = sVar.e();
            sVar.d(6);
            k9 = sVar.k();
            if (i12 == 1) {
                sVar.d(16);
            }
            i13 = e9;
        } else {
            if (i12 != 2) {
                return;
            }
            sVar.d(16);
            k9 = (int) Math.round(Double.longBitsToDouble(sVar.j()));
            i13 = sVar.m();
            sVar.d(20);
        }
        int c10 = sVar.c();
        int i18 = i4;
        if (i18 == com.anythink.basead.exoplayer.e.a.a.af) {
            Pair<Integer, k> b9 = b(sVar, i6, i9);
            if (b9 != null) {
                i18 = ((Integer) b9.first).intValue();
                eVar2 = eVar2 == null ? null : eVar2.a(((k) b9.second).f7910b);
                cVar.f7747b[i11] = (k) b9.second;
            }
            sVar.c(c10);
        }
        com.anythink.basead.exoplayer.d.e eVar3 = eVar2;
        int i19 = com.anythink.basead.exoplayer.e.a.a.f7722s;
        String str6 = o.f9251w;
        if (i18 == i19) {
            str2 = o.f9254z;
        } else if (i18 == com.anythink.basead.exoplayer.e.a.a.f7724u) {
            str2 = o.f9206A;
        } else if (i18 == com.anythink.basead.exoplayer.e.a.a.f7726w) {
            str2 = o.f9209D;
        } else if (i18 != com.anythink.basead.exoplayer.e.a.a.f7727x && i18 != com.anythink.basead.exoplayer.e.a.a.f7728y) {
            if (i18 == com.anythink.basead.exoplayer.e.a.a.f7729z) {
                str2 = o.f9211F;
            } else if (i18 == com.anythink.basead.exoplayer.e.a.a.aD) {
                str2 = o.f9214I;
            } else if (i18 == com.anythink.basead.exoplayer.e.a.a.aE) {
                str2 = o.J;
            } else if (i18 == com.anythink.basead.exoplayer.e.a.a.f7720q || i18 == com.anythink.basead.exoplayer.e.a.a.f7721r) {
                str2 = o.f9251w;
            } else if (i18 == com.anythink.basead.exoplayer.e.a.a.f7718o) {
                str2 = o.f9248t;
            } else {
                str2 = i18 == com.anythink.basead.exoplayer.e.a.a.aT ? o.f9216L : null;
            }
        } else {
            str2 = o.f9210E;
        }
        int i20 = k9;
        byte[] bArr = null;
        String str7 = str2;
        int i21 = c10;
        while (i21 - i6 < i9) {
            sVar.c(i21);
            int i22 = sVar.i();
            com.anythink.basead.exoplayer.k.a.a(i22 > 0 ? z9 : false, "childAtomSize should be positive");
            int i23 = sVar.i();
            int i24 = com.anythink.basead.exoplayer.e.a.a.f7694O;
            if (i23 == i24 || (z6 && i23 == com.anythink.basead.exoplayer.e.a.a.f7719p)) {
                String str8 = str6;
                i14 = i13;
                str3 = str8;
                i15 = i21;
                i16 = i22;
                boolean z10 = false;
                if (i23 == i24) {
                    c9 = i15;
                } else {
                    c9 = sVar.c();
                    while (c9 - i15 < i16) {
                        sVar.c(c9);
                        int i25 = sVar.i();
                        com.anythink.basead.exoplayer.k.a.a(i25 > 0 ? true : z10, "childAtomSize should be positive");
                        if (sVar.i() != com.anythink.basead.exoplayer.e.a.a.f7694O) {
                            c9 += i25;
                            z10 = false;
                        }
                    }
                    i17 = -1;
                    c9 = -1;
                    if (c9 == i17) {
                        Pair<String, byte[]> d9 = d(sVar, c9);
                        String str9 = (String) d9.first;
                        bArr = (byte[]) d9.second;
                        if (o.f9246r.equals(str9)) {
                            Pair<Integer, Integer> a9 = com.anythink.basead.exoplayer.k.d.a(bArr);
                            i20 = ((Integer) a9.first).intValue();
                            i14 = ((Integer) a9.second).intValue();
                        }
                        str7 = str9;
                    }
                }
                i17 = -1;
                if (c9 == i17) {
                }
            } else {
                if (i23 == com.anythink.basead.exoplayer.e.a.a.f7723t) {
                    sVar.c(i21 + 8);
                    cVar.f7748c = com.anythink.basead.exoplayer.b.a.a(sVar, Integer.toString(i10), str5, eVar3);
                } else if (i23 == com.anythink.basead.exoplayer.e.a.a.f7725v) {
                    sVar.c(i21 + 8);
                    cVar.f7748c = com.anythink.basead.exoplayer.b.a.b(sVar, Integer.toString(i10), str5, eVar3);
                } else {
                    if (i23 == com.anythink.basead.exoplayer.e.a.a.f7681A) {
                        String str10 = str6;
                        i14 = i13;
                        str4 = str10;
                        i15 = i21;
                        cVar.f7748c = com.anythink.basead.exoplayer.m.a(Integer.toString(i10), str7, null, -1, i14, i20, null, eVar3, str);
                        i16 = i22;
                    } else {
                        i15 = i21;
                        i16 = i22;
                        str4 = str6;
                        i14 = i13;
                        if (i23 == com.anythink.basead.exoplayer.e.a.a.aT) {
                            byte[] bArr2 = new byte[i16];
                            sVar.c(i15);
                            sVar.a(bArr2, 0, i16);
                            bArr = bArr2;
                            str3 = str4;
                        }
                    }
                    str3 = str4;
                }
                i15 = i21;
                i16 = i22;
                str4 = str6;
                i14 = i13;
                str3 = str4;
            }
            i21 = i16 + i15;
            int i26 = i14;
            str6 = str3;
            i13 = i26;
            str5 = str;
            z9 = true;
        }
        String str11 = str6;
        int i27 = i13;
        if (cVar.f7748c != null || str7 == null) {
            return;
        }
        cVar.f7748c = com.anythink.basead.exoplayer.m.a(Integer.toString(i10), str7, (String) null, -1, i27, i20, str11.equals(str7) ? 2 : -1, (List<byte[]>) (bArr != null ? Collections.singletonList(bArr) : null), eVar3, str);
    }

    private static int a(s sVar, int i4, int i6) {
        int c9 = sVar.c();
        while (c9 - i4 < i6) {
            sVar.c(c9);
            int i9 = sVar.i();
            com.anythink.basead.exoplayer.k.a.a(i9 > 0, "childAtomSize should be positive");
            if (sVar.i() == com.anythink.basead.exoplayer.e.a.a.f7694O) {
                return c9;
            }
            c9 += i9;
        }
        return -1;
    }

    private static k a(s sVar, int i4, int i6, String str) {
        int i9;
        int i10;
        int i11 = i4 + 8;
        while (true) {
            byte[] bArr = null;
            if (i11 - i4 >= i6) {
                return null;
            }
            sVar.c(i11);
            int i12 = sVar.i();
            if (sVar.i() == com.anythink.basead.exoplayer.e.a.a.ad) {
                int a9 = com.anythink.basead.exoplayer.e.a.a.a(sVar.i());
                sVar.d(1);
                if (a9 == 0) {
                    sVar.d(1);
                    i10 = 0;
                    i9 = 0;
                } else {
                    int d9 = sVar.d();
                    i9 = d9 & 15;
                    i10 = (d9 & 240) >> 4;
                }
                boolean z6 = sVar.d() == 1;
                int d10 = sVar.d();
                byte[] bArr2 = new byte[16];
                sVar.a(bArr2, 0, 16);
                if (z6 && d10 == 0) {
                    int d11 = sVar.d();
                    bArr = new byte[d11];
                    sVar.a(bArr, 0, d11);
                }
                return new k(z6, str, d10, bArr2, i10, i9, bArr);
            }
            i11 += i12;
        }
    }

    private static boolean a(long[] jArr, long j6, long j9, long j10) {
        int length = jArr.length - 1;
        return jArr[0] <= j9 && j9 < jArr[af.a(3, 0, length)] && jArr[af.a(jArr.length - 3, 0, length)] < j10 && j10 <= j6;
    }
}
