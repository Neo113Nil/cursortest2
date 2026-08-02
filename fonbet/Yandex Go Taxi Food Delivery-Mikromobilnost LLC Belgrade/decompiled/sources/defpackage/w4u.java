package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.session.PlaybackStateCompat;
import java.lang.ref.ReferenceQueue;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.WeakHashMap;
import ru.CryptoPro.reprov.array.DerValue;

/* loaded from: classes10.dex */
public final class w4u implements tqn, gz71 {
    public static final float[] m = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public static final float[] n = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final /* synthetic */ int a;
    public final Object b;
    public long c;
    public Object d;
    public boolean e;
    public long f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public Object k;
    public Object l;

    public w4u(g191 g191Var) {
        this.a = 2;
        this.g = g191Var;
        this.h = new WeakHashMap();
        this.b = new HashMap();
        this.i = new HashMap();
        this.j = new ReferenceQueue();
        this.k = new HashMap();
        Handler handler = new Handler(Looper.getMainLooper());
        this.d = handler;
        jg jgVar = new jg(18, this);
        this.l = jgVar;
        this.c = PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
        this.f = 3000L;
        handler.postDelayed(jgVar, 3000L);
    }

    @Override // defpackage.gz71
    public void a() {
        sba1.e((boolean[]) this.b);
        ja81 ja81Var = (ja81) this.i;
        ja81Var.a = false;
        ja81Var.c = 0;
        ja81Var.b = 0;
        v4u v4uVar = (v4u) this.k;
        if (v4uVar != null) {
            v4uVar.a = false;
            v4uVar.b = false;
            v4uVar.c = false;
            v4uVar.d = -1;
        }
        c150 c150Var = (c150) this.j;
        if (c150Var != null) {
            c150Var.b = false;
            c150Var.c = false;
        }
        this.c = 0L;
        this.f = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0287 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0159  */
    @Override // defpackage.tqn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(ef90 ef90Var) {
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        float f;
        ef90 ef90Var2 = (ef90) this.h;
        u4u u4uVar = (u4u) this.i;
        c150 c150Var = (c150) this.j;
        d6z.z((v4u) this.k);
        d6z.z((g001) this.l);
        int i5 = ef90Var.b;
        int i6 = ef90Var.c;
        byte[] bArr = ef90Var.a;
        this.c += ef90Var.a();
        ((g001) this.l).a(ef90Var, ef90Var.a(), 0);
        while (true) {
            int b = l150.b(bArr, i5, i6, (boolean[]) this.b);
            if (b == i6) {
                if (!this.e) {
                    u4uVar.a(i5, i6, bArr);
                }
                ((v4u) this.k).a(i5, i6, bArr);
                if (c150Var != null) {
                    c150Var.c(i5, i6, bArr);
                    return;
                }
                return;
            }
            int i7 = b + 3;
            byte b2 = ef90Var.a[i7];
            int i8 = b2 & 255;
            int i9 = b - i5;
            if (this.e) {
                i = i6;
                i2 = i7;
            } else {
                if (i9 > 0) {
                    u4uVar.a(i5, b, bArr);
                }
                int i10 = i9 < 0 ? -i9 : 0;
                int i11 = u4uVar.b;
                if (i11 == 0) {
                    i = i6;
                    i2 = i7;
                    i4 = 0;
                    if (i8 == 176) {
                        u4uVar.b = 1;
                        u4uVar.a = true;
                    }
                } else if (i11 == 1) {
                    i = i6;
                    i2 = i7;
                    i4 = 0;
                    if (i8 != 181) {
                        lk91.j("Unexpected start code value");
                        u4uVar.a = false;
                        u4uVar.c = 0;
                        u4uVar.b = 0;
                    } else {
                        u4uVar.b = 2;
                    }
                } else if (i11 != 2) {
                    i = i6;
                    if (i11 == 3) {
                        i2 = i7;
                        if ((b2 & 240) != 32) {
                            lk91.j("Unexpected start code value");
                            i4 = 0;
                            u4uVar.a = false;
                            u4uVar.c = 0;
                            u4uVar.b = 0;
                        } else {
                            i4 = 0;
                            u4uVar.d = u4uVar.c;
                            u4uVar.b = 4;
                        }
                    } else {
                        if (i11 != 4) {
                            ny61.k();
                            return;
                        }
                        if (i8 == 179 || i8 == 181) {
                            u4uVar.c -= i10;
                            u4uVar.a = false;
                            g001 g001Var = (g001) this.l;
                            int i12 = u4uVar.d;
                            String str = (String) this.d;
                            str.getClass();
                            byte[] copyOf = Arrays.copyOf(u4uVar.e, u4uVar.c);
                            i2 = i7;
                            df90 df90Var = new df90(copyOf, copyOf.length);
                            df90Var.p(i12);
                            df90Var.p(4);
                            df90Var.n();
                            df90Var.o(8);
                            if (df90Var.f()) {
                                df90Var.o(4);
                                df90Var.o(3);
                            }
                            int g = df90Var.g(4);
                            if (g == 15) {
                                int g2 = df90Var.g(8);
                                int g3 = df90Var.g(8);
                                if (g3 == 0) {
                                    lk91.j("Invalid aspect ratio");
                                    f = 1.0f;
                                    if (df90Var.f()) {
                                        df90Var.o(2);
                                        df90Var.o(1);
                                        if (df90Var.f()) {
                                            df90Var.o(15);
                                            df90Var.n();
                                            df90Var.o(15);
                                            df90Var.n();
                                            df90Var.o(15);
                                            df90Var.n();
                                            df90Var.o(3);
                                            df90Var.o(11);
                                            df90Var.n();
                                            df90Var.o(15);
                                            df90Var.n();
                                        }
                                    }
                                    if (df90Var.g(2) != 0) {
                                        lk91.j("Unhandled video object layer shape");
                                    }
                                    df90Var.n();
                                    int g4 = df90Var.g(16);
                                    df90Var.n();
                                    if (df90Var.f()) {
                                        if (g4 == 0) {
                                            lk91.j("Invalid vop_increment_time_resolution");
                                        } else {
                                            int i13 = 0;
                                            for (int i14 = g4 - 1; i14 > 0; i14 >>= 1) {
                                                i13++;
                                            }
                                            df90Var.o(i13);
                                        }
                                    }
                                    df90Var.n();
                                    int g5 = df90Var.g(13);
                                    df90Var.n();
                                    int g6 = df90Var.g(13);
                                    df90Var.n();
                                    df90Var.n();
                                    f7s f7sVar = new f7s();
                                    f7sVar.a = str;
                                    f7sVar.l = eh20.q("video/mp2t");
                                    f7sVar.m = eh20.q("video/mp4v-es");
                                    f7sVar.t = g5;
                                    f7sVar.u = g6;
                                    f7sVar.x = f;
                                    f7sVar.p = Collections.singletonList(copyOf);
                                    smw0.u(f7sVar, g001Var);
                                    this.e = true;
                                } else {
                                    f = g2 / g3;
                                    if (df90Var.f()) {
                                    }
                                    if (df90Var.g(2) != 0) {
                                    }
                                    df90Var.n();
                                    int g42 = df90Var.g(16);
                                    df90Var.n();
                                    if (df90Var.f()) {
                                    }
                                    df90Var.n();
                                    int g52 = df90Var.g(13);
                                    df90Var.n();
                                    int g62 = df90Var.g(13);
                                    df90Var.n();
                                    df90Var.n();
                                    f7s f7sVar2 = new f7s();
                                    f7sVar2.a = str;
                                    f7sVar2.l = eh20.q("video/mp2t");
                                    f7sVar2.m = eh20.q("video/mp4v-es");
                                    f7sVar2.t = g52;
                                    f7sVar2.u = g62;
                                    f7sVar2.x = f;
                                    f7sVar2.p = Collections.singletonList(copyOf);
                                    smw0.u(f7sVar2, g001Var);
                                    this.e = true;
                                }
                            } else if (g < 7) {
                                f = m[g];
                                if (df90Var.f()) {
                                }
                                if (df90Var.g(2) != 0) {
                                }
                                df90Var.n();
                                int g422 = df90Var.g(16);
                                df90Var.n();
                                if (df90Var.f()) {
                                }
                                df90Var.n();
                                int g522 = df90Var.g(13);
                                df90Var.n();
                                int g622 = df90Var.g(13);
                                df90Var.n();
                                df90Var.n();
                                f7s f7sVar22 = new f7s();
                                f7sVar22.a = str;
                                f7sVar22.l = eh20.q("video/mp2t");
                                f7sVar22.m = eh20.q("video/mp4v-es");
                                f7sVar22.t = g522;
                                f7sVar22.u = g622;
                                f7sVar22.x = f;
                                f7sVar22.p = Collections.singletonList(copyOf);
                                smw0.u(f7sVar22, g001Var);
                                this.e = true;
                            } else {
                                lk91.j("Invalid aspect ratio");
                                f = 1.0f;
                                if (df90Var.f()) {
                                }
                                if (df90Var.g(2) != 0) {
                                }
                                df90Var.n();
                                int g4222 = df90Var.g(16);
                                df90Var.n();
                                if (df90Var.f()) {
                                }
                                df90Var.n();
                                int g5222 = df90Var.g(13);
                                df90Var.n();
                                int g6222 = df90Var.g(13);
                                df90Var.n();
                                df90Var.n();
                                f7s f7sVar222 = new f7s();
                                f7sVar222.a = str;
                                f7sVar222.l = eh20.q("video/mp2t");
                                f7sVar222.m = eh20.q("video/mp4v-es");
                                f7sVar222.t = g5222;
                                f7sVar222.u = g6222;
                                f7sVar222.x = f;
                                f7sVar222.p = Collections.singletonList(copyOf);
                                smw0.u(f7sVar222, g001Var);
                                this.e = true;
                            }
                        } else {
                            i2 = i7;
                            i4 = 0;
                        }
                    }
                } else {
                    i = i6;
                    i2 = i7;
                    i4 = 0;
                    if (i8 > 31) {
                        lk91.j("Unexpected start code value");
                        u4uVar.a = false;
                        u4uVar.c = 0;
                        u4uVar.b = 0;
                    } else {
                        u4uVar.b = 3;
                    }
                }
                u4uVar.a(i4, 3, u4u.f);
            }
            ((v4u) this.k).a(i5, b, bArr);
            if (c150Var != null) {
                if (i9 > 0) {
                    c150Var.c(i5, b, bArr);
                    i3 = 0;
                } else {
                    i3 = -i9;
                }
                if (c150Var.e(i3)) {
                    int l = l150.l(c150Var.e, c150Var.d);
                    int i15 = tw21.a;
                    ef90Var2.I(l, c150Var.d);
                    ((a201) this.g).c(this.f, ef90Var2);
                }
                if (i8 == 178) {
                    z = true;
                    if (ef90Var.a[b + 2] == 1) {
                        c150Var.g(i8);
                    }
                    int i16 = i - b;
                    ((v4u) this.k).b(this.e, i16, this.c - i16);
                    v4u v4uVar = (v4u) this.k;
                    long j = this.f;
                    v4uVar.d = i8;
                    v4uVar.c = false;
                    v4uVar.a = (i8 != 182 || i8 == 179) ? z : false;
                    if (i8 == 182) {
                        z = false;
                    }
                    v4uVar.b = z;
                    v4uVar.e = 0;
                    v4uVar.g = j;
                    i6 = i;
                    i5 = i2;
                }
            }
            z = true;
            int i162 = i - b;
            ((v4u) this.k).b(this.e, i162, this.c - i162);
            v4u v4uVar2 = (v4u) this.k;
            long j2 = this.f;
            v4uVar2.d = i8;
            v4uVar2.c = false;
            v4uVar2.a = (i8 != 182 || i8 == 179) ? z : false;
            if (i8 == 182) {
            }
            v4uVar2.b = z;
            v4uVar2.e = 0;
            v4uVar2.g = j2;
            i6 = i;
            i5 = i2;
        }
    }

    @Override // defpackage.gz71
    public void c(int i, long j) {
        if (j != -9223372036854775807L) {
            this.f = j;
        }
    }

    @Override // defpackage.tqn
    public void d() {
        l150.a((boolean[]) this.b);
        u4u u4uVar = (u4u) this.i;
        u4uVar.a = false;
        u4uVar.c = 0;
        u4uVar.b = 0;
        v4u v4uVar = (v4u) this.k;
        if (v4uVar != null) {
            v4uVar.a = false;
            v4uVar.b = false;
            v4uVar.c = false;
            v4uVar.d = -1;
        }
        c150 c150Var = (c150) this.j;
        if (c150Var != null) {
            c150Var.f();
        }
        this.c = 0L;
        this.f = -9223372036854775807L;
    }

    @Override // defpackage.tqn
    public void e(int i, long j) {
        this.f = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x014d  */
    @Override // defpackage.gz71
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f(dl81 dl81Var) {
        int i;
        v4u v4uVar;
        byte[] bArr;
        int i2;
        int i3;
        float f;
        ja81 ja81Var = (ja81) this.i;
        c150 c150Var = (c150) this.j;
        if (((v4u) this.k) == null) {
            ny61.k();
            return;
        }
        fb81 fb81Var = (fb81) this.l;
        if (fb81Var == null) {
            ny61.k();
            return;
        }
        int i4 = dl81Var.b;
        int i5 = dl81Var.c;
        byte[] bArr2 = dl81Var.a;
        int i6 = i5 - i4;
        this.c += i6;
        fb81Var.a(i6, dl81Var);
        while (true) {
            int b = sba1.b(bArr2, i4, i5, (boolean[]) this.b);
            if (b == i5) {
                if (!this.e) {
                    ja81Var.a(i4, i5, bArr2);
                }
                v4u v4uVar2 = (v4u) this.k;
                if (v4uVar2.b) {
                    int i7 = v4uVar2.e;
                    int i8 = (i4 + 1) - i7;
                    if (i8 < i5) {
                        v4uVar2.c = ((bArr2[i8] & DerValue.TAG_PRIVATE) >> 6) == 0;
                        v4uVar2.b = false;
                    } else {
                        v4uVar2.e = (i5 - i4) + i7;
                    }
                }
                if (c150Var != null) {
                    c150Var.a(i4, i5, bArr2);
                    return;
                }
                return;
            }
            int i9 = b + 3;
            byte b2 = dl81Var.a[i9];
            int i10 = b2 & 255;
            int i11 = b - i4;
            if (this.e) {
                i = i5;
            } else {
                if (i11 > 0) {
                    ja81Var.a(i4, b, bArr2);
                }
                int i12 = i11 < 0 ? -i11 : 0;
                int i13 = ja81Var.b;
                if (i13 == 0) {
                    i = i5;
                    i3 = 0;
                    if (i10 == 176) {
                        ja81Var.b = 1;
                        ja81Var.a = true;
                    }
                } else if (i13 == 1) {
                    i = i5;
                    i3 = 0;
                    if (i10 != 181) {
                        nba1.e();
                        ja81Var.a = false;
                        ja81Var.c = 0;
                        ja81Var.b = 0;
                    } else {
                        ja81Var.b = 2;
                    }
                } else if (i13 == 2) {
                    i = i5;
                    i3 = 0;
                    if (i10 > 31) {
                        nba1.e();
                        ja81Var.a = false;
                        ja81Var.c = 0;
                        ja81Var.b = 0;
                    } else {
                        ja81Var.b = 3;
                    }
                } else if (i13 == 3) {
                    i = i5;
                    if ((b2 & 240) != 32) {
                        nba1.e();
                        i3 = 0;
                        ja81Var.a = false;
                        ja81Var.c = 0;
                        ja81Var.b = 0;
                    } else {
                        i3 = 0;
                        ja81Var.d = ja81Var.c;
                        ja81Var.b = 4;
                    }
                } else {
                    if (i13 != 4) {
                        ny61.k();
                        return;
                    }
                    if (i10 == 179 || i10 == 181) {
                        ja81Var.c -= i12;
                        ja81Var.a = false;
                        fb81 fb81Var2 = (fb81) this.l;
                        int i14 = ja81Var.d;
                        String str = (String) this.d;
                        str.getClass();
                        byte[] copyOf = Arrays.copyOf(ja81Var.e, ja81Var.c);
                        i = i5;
                        int length = copyOf.length;
                        uh81 uh81Var = new uh81();
                        uh81Var.a = copyOf;
                        uh81Var.d = length;
                        uh81Var.j(i14);
                        uh81Var.j(4);
                        uh81Var.l();
                        uh81Var.h(8);
                        if (uh81Var.k()) {
                            uh81Var.h(4);
                            uh81Var.h(3);
                        }
                        int a = uh81Var.a(4);
                        if (a == 15) {
                            int a2 = uh81Var.a(8);
                            int a3 = uh81Var.a(8);
                            if (a3 == 0) {
                                nba1.e();
                                f = 1.0f;
                                if (uh81Var.k()) {
                                    uh81Var.h(2);
                                    uh81Var.h(1);
                                    if (uh81Var.k()) {
                                        uh81Var.h(15);
                                        uh81Var.l();
                                        uh81Var.h(15);
                                        uh81Var.l();
                                        uh81Var.h(15);
                                        uh81Var.l();
                                        uh81Var.h(3);
                                        uh81Var.h(11);
                                        uh81Var.l();
                                        uh81Var.h(15);
                                        uh81Var.l();
                                    }
                                }
                                if (uh81Var.a(2) != 0) {
                                    nba1.e();
                                }
                                uh81Var.l();
                                int a4 = uh81Var.a(16);
                                uh81Var.l();
                                if (uh81Var.k()) {
                                    if (a4 == 0) {
                                        nba1.e();
                                    } else {
                                        int i15 = 0;
                                        for (int i16 = a4 - 1; i16 > 0; i16 >>= 1) {
                                            i15++;
                                        }
                                        uh81Var.h(i15);
                                    }
                                }
                                uh81Var.l();
                                int a5 = uh81Var.a(13);
                                uh81Var.l();
                                int a6 = uh81Var.a(13);
                                uh81Var.l();
                                uh81Var.l();
                                da81 da81Var = new da81();
                                da81Var.a = str;
                                da81Var.k = "video/mp4v-es";
                                da81Var.p = a5;
                                da81Var.q = a6;
                                da81Var.t = f;
                                da81Var.m = Collections.singletonList(copyOf);
                                fb81Var2.k(new qd81(da81Var));
                                this.e = true;
                            } else {
                                f = a2 / a3;
                                if (uh81Var.k()) {
                                }
                                if (uh81Var.a(2) != 0) {
                                }
                                uh81Var.l();
                                int a42 = uh81Var.a(16);
                                uh81Var.l();
                                if (uh81Var.k()) {
                                }
                                uh81Var.l();
                                int a52 = uh81Var.a(13);
                                uh81Var.l();
                                int a62 = uh81Var.a(13);
                                uh81Var.l();
                                uh81Var.l();
                                da81 da81Var2 = new da81();
                                da81Var2.a = str;
                                da81Var2.k = "video/mp4v-es";
                                da81Var2.p = a52;
                                da81Var2.q = a62;
                                da81Var2.t = f;
                                da81Var2.m = Collections.singletonList(copyOf);
                                fb81Var2.k(new qd81(da81Var2));
                                this.e = true;
                            }
                        } else if (a < 7) {
                            f = n[a];
                            if (uh81Var.k()) {
                            }
                            if (uh81Var.a(2) != 0) {
                            }
                            uh81Var.l();
                            int a422 = uh81Var.a(16);
                            uh81Var.l();
                            if (uh81Var.k()) {
                            }
                            uh81Var.l();
                            int a522 = uh81Var.a(13);
                            uh81Var.l();
                            int a622 = uh81Var.a(13);
                            uh81Var.l();
                            uh81Var.l();
                            da81 da81Var22 = new da81();
                            da81Var22.a = str;
                            da81Var22.k = "video/mp4v-es";
                            da81Var22.p = a522;
                            da81Var22.q = a622;
                            da81Var22.t = f;
                            da81Var22.m = Collections.singletonList(copyOf);
                            fb81Var2.k(new qd81(da81Var22));
                            this.e = true;
                        } else {
                            nba1.e();
                            f = 1.0f;
                            if (uh81Var.k()) {
                            }
                            if (uh81Var.a(2) != 0) {
                            }
                            uh81Var.l();
                            int a4222 = uh81Var.a(16);
                            uh81Var.l();
                            if (uh81Var.k()) {
                            }
                            uh81Var.l();
                            int a5222 = uh81Var.a(13);
                            uh81Var.l();
                            int a6222 = uh81Var.a(13);
                            uh81Var.l();
                            uh81Var.l();
                            da81 da81Var222 = new da81();
                            da81Var222.a = str;
                            da81Var222.k = "video/mp4v-es";
                            da81Var222.p = a5222;
                            da81Var222.q = a6222;
                            da81Var222.t = f;
                            da81Var222.m = Collections.singletonList(copyOf);
                            fb81Var2.k(new qd81(da81Var222));
                            this.e = true;
                        }
                    } else {
                        i = i5;
                        i3 = 0;
                    }
                }
                ja81Var.a(i3, 3, ja81.f);
            }
            v4u v4uVar3 = (v4u) this.k;
            if (v4uVar3.b) {
                int i17 = v4uVar3.e;
                int i18 = (i4 + 1) - i17;
                if (i18 < b) {
                    v4uVar3.c = ((bArr2[i18] & DerValue.TAG_PRIVATE) >> 6) == 0;
                    v4uVar3.b = false;
                } else {
                    v4uVar3.e = i17 + i11;
                }
            }
            if (c150Var != null) {
                if (i11 > 0) {
                    c150Var.a(i4, b, bArr2);
                    i2 = 0;
                } else {
                    i2 = -i11;
                }
                if (c150Var.b(i2)) {
                    int a7 = sba1.a(c150Var.e, c150Var.d);
                    dl81 dl81Var2 = (dl81) this.h;
                    int i19 = rf71.a;
                    dl81Var2.a = c150Var.d;
                    dl81Var2.c = a7;
                    dl81Var2.b = 0;
                    n971 n971Var = (n971) this.g;
                    long j = this.f;
                    if (a7 >= 9) {
                        int a8 = dl81Var2.a();
                        int a9 = dl81Var2.a();
                        int s = dl81Var2.s();
                        if (a8 == 434 && a9 == 1195456820 && s == 3) {
                            aba1.c(j, dl81Var2, n971Var.c);
                        }
                    }
                }
                if (i10 == 178) {
                    if (dl81Var.a[b + 2] == 1) {
                        c150Var.d(i10);
                    }
                    int i20 = i - b;
                    long j2 = this.c - i20;
                    v4uVar = (v4u) this.k;
                    boolean z = this.e;
                    if (v4uVar.d != 182 && z && v4uVar.a) {
                        bArr = bArr2;
                        long j3 = v4uVar.g;
                        if (j3 != -9223372036854775807L) {
                            ((fb81) v4uVar.h).b(j3, v4uVar.c ? 1 : 0, (int) (j2 - v4uVar.f), i20, null);
                        }
                    } else {
                        bArr = bArr2;
                    }
                    if (v4uVar.d != 179) {
                        v4uVar.f = j2;
                    }
                    v4u v4uVar4 = (v4u) this.k;
                    long j4 = this.f;
                    v4uVar4.d = i10;
                    v4uVar4.c = false;
                    v4uVar4.a = i10 != 182 || i10 == 179;
                    v4uVar4.b = i10 != 182;
                    v4uVar4.e = 0;
                    v4uVar4.g = j4;
                    bArr2 = bArr;
                    i4 = i9;
                    i5 = i;
                }
            }
            int i202 = i - b;
            long j22 = this.c - i202;
            v4uVar = (v4u) this.k;
            boolean z2 = this.e;
            if (v4uVar.d != 182) {
            }
            bArr = bArr2;
            if (v4uVar.d != 179) {
            }
            v4u v4uVar42 = (v4u) this.k;
            long j42 = this.f;
            v4uVar42.d = i10;
            v4uVar42.c = false;
            v4uVar42.a = i10 != 182 || i10 == 179;
            v4uVar42.b = i10 != 182;
            v4uVar42.e = 0;
            v4uVar42.g = j42;
            bArr2 = bArr;
            i4 = i9;
            i5 = i;
        }
    }

    @Override // defpackage.tqn
    public void g(boolean z) {
        d6z.z((v4u) this.k);
        if (z) {
            ((v4u) this.k).b(this.e, 0, this.c);
            v4u v4uVar = (v4u) this.k;
            v4uVar.a = false;
            v4uVar.b = false;
            v4uVar.c = false;
            v4uVar.d = -1;
        }
    }

    @Override // defpackage.tqn
    public void h(d5p d5pVar, xi11 xi11Var) {
        xi11Var.c();
        xi11Var.d();
        this.d = xi11Var.e;
        xi11Var.d();
        g001 B = d5pVar.B(xi11Var.d, 2);
        this.l = B;
        this.k = new v4u(B);
        ((a201) this.g).e(d5pVar, xi11Var);
    }

    public long i(Object obj) {
        switch (this.a) {
            case 2:
                if (!k(obj)) {
                    long j = this.c;
                    this.c = 1 + j;
                    j(j, obj);
                    break;
                } else {
                    w511.f(qv10.m(obj.getClass(), "Instance of ", " has already been added."));
                    break;
                }
            default:
                if (!k(obj)) {
                    long j2 = this.c;
                    this.c = 1 + j2;
                    j(j2, obj);
                    break;
                } else {
                    w511.f(qv10.m(obj.getClass(), "Instance of ", " has already been added."));
                    break;
                }
        }
        return 0L;
    }

    public void j(long j, Object obj) {
        int i = this.a;
        Object obj2 = this.i;
        Object obj3 = this.h;
        Object obj4 = this.j;
        Object obj5 = this.b;
        switch (i) {
            case 2:
                HashMap hashMap = (HashMap) obj5;
                if (j < 0) {
                    w511.f(qv10.j(j, "Identifier must be >= 0: "));
                    break;
                } else if (!hashMap.containsKey(Long.valueOf(j))) {
                    md2 md2Var = new md2(obj, (ReferenceQueue) obj4);
                    ((WeakHashMap) obj3).put(md2Var, Long.valueOf(j));
                    hashMap.put(Long.valueOf(j), md2Var);
                    ((HashMap) this.k).put(md2Var, Long.valueOf(j));
                    ((HashMap) obj2).put(Long.valueOf(j), obj);
                    break;
                } else {
                    w511.f(qv10.j(j, "Identifier has already been added: "));
                    break;
                }
            default:
                HashMap hashMap2 = (HashMap) obj5;
                if (j < 0) {
                    w511.f(qv10.j(j, "Identifier must be >= 0: "));
                    break;
                } else if (!hashMap2.containsKey(Long.valueOf(j))) {
                    cu7 cu7Var = new cu7(obj, (ReferenceQueue) obj4);
                    ((WeakHashMap) obj3).put(cu7Var, Long.valueOf(j));
                    hashMap2.put(Long.valueOf(j), cu7Var);
                    ((HashMap) this.k).put(cu7Var, Long.valueOf(j));
                    ((HashMap) obj2).put(Long.valueOf(j), obj);
                    break;
                } else {
                    w511.f(qv10.j(j, "Identifier has already been added: "));
                    break;
                }
        }
    }

    public boolean k(Object obj) {
        int i = this.a;
        Object obj2 = this.h;
        switch (i) {
            case 2:
                if (obj != null && ((WeakHashMap) obj2).containsKey(new md2(obj, null))) {
                    break;
                }
                break;
            default:
                if (obj != null && ((WeakHashMap) obj2).containsKey(new cu7(obj, null))) {
                    break;
                }
                break;
        }
        return true;
    }

    public Long l(Object obj) {
        if (obj == null) {
            return null;
        }
        Long l = (Long) ((WeakHashMap) this.h).get(new cu7(obj, null));
        if (l != null) {
            ((HashMap) this.i).put(l, obj);
        }
        return l;
    }

    public Object m(long j) {
        md2 md2Var = (md2) ((HashMap) this.b).get(Long.valueOf(j));
        if (md2Var != null) {
            return md2Var.get();
        }
        return null;
    }

    public void n() {
        if (this.e) {
            return;
        }
        while (true) {
            cu7 cu7Var = (cu7) ((ReferenceQueue) this.j).poll();
            if (cu7Var == null) {
                ((Handler) this.d).postDelayed((dn7) this.l, this.f);
                return;
            }
            Long l = (Long) ym11.c((HashMap) this.k).remove(cu7Var);
            if (l != null) {
                ((HashMap) this.b).remove(l);
                ((HashMap) this.i).remove(l);
                sr4 sr4Var = (sr4) this.g;
                long longValue = l.longValue();
                String str = "dev.flutter.pigeon.camera_android_camerax.PigeonInternalInstanceManager.removeStrongReference";
                new m2v(((eu7) sr4Var.b).a, str, (rs10) eu7.b.getValue(), null).z(Collections.singletonList(l), new nd2(1, new cs0(longValue, 11)));
            }
        }
    }

    @Override // defpackage.gz71
    public void a(yg71 yg71Var, xi11 xi11Var) {
        xi11Var.a();
        xi11Var.b();
        this.d = xi11Var.e;
        xi11Var.b();
        fb81 l = yg71Var.l(xi11Var.d, 2);
        this.l = l;
        this.k = new v4u(l);
        ((n971) this.g).a(yg71Var, xi11Var);
    }

    public w4u(sr4 sr4Var) {
        this.a = 3;
        this.g = sr4Var;
        this.h = new WeakHashMap();
        this.b = new HashMap();
        this.i = new HashMap();
        this.j = new ReferenceQueue();
        this.k = new HashMap();
        Handler handler = new Handler(Looper.getMainLooper());
        this.d = handler;
        dn7 dn7Var = new dn7(7, this);
        this.l = dn7Var;
        this.c = PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
        this.f = 3000L;
        handler.postDelayed(dn7Var, 3000L);
    }

    public w4u(n971 n971Var) {
        this.a = 1;
        this.g = n971Var;
        this.b = new boolean[4];
        this.i = new ja81();
        this.f = -9223372036854775807L;
        this.j = new c150(178, 1);
        this.h = new dl81();
    }

    public w4u(a201 a201Var) {
        this.a = 0;
        this.g = a201Var;
        this.b = new boolean[4];
        u4u u4uVar = new u4u();
        u4uVar.e = new byte[128];
        this.i = u4uVar;
        this.f = -9223372036854775807L;
        this.j = new c150(178, 0);
        this.h = new ef90();
    }

    @Override // defpackage.gz71
    public void b() {
    }
}
