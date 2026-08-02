package defpackage;

import androidx.work.OverwritingInputMerger;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class t4w {
    public final String a;
    public c4w b;
    public final String c;
    public final String d;
    public q97 e;
    public final q97 f;
    public long g;
    public long h;
    public long i;
    public fa6 j;
    public final int k;
    public bk2 l;
    public long m;
    public long n;
    public final long o;
    public final long p;
    public boolean q;
    public final nxj r;
    public final int s;
    public final int t;
    public long u;
    public int v;
    public final int w;
    public String x;
    public final Boolean y;
    public static final String z = jsg.n("WorkSpec");
    public static final tiu A = new tiu(4);

    public /* synthetic */ t4w(String str, c4w c4wVar, String str2, String str3, q97 q97Var, q97 q97Var2, long j, long j2, long j3, fa6 fa6Var, int i, bk2 bk2Var, long j4, long j5, long j6, long j7, boolean z2, nxj nxjVar, int i2, long j8, int i3, int i4, String str4, Boolean bool, int i5) {
        this(str, (i5 & 2) != 0 ? c4w.a : c4wVar, str2, (i5 & 8) != 0 ? OverwritingInputMerger.class.getName() : str3, (i5 & 16) != 0 ? q97.b : q97Var, (i5 & 32) != 0 ? q97.b : q97Var2, (i5 & 64) != 0 ? 0L : j, (i5 & 128) != 0 ? 0L : j2, (i5 & 256) != 0 ? 0L : j3, (i5 & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0 ? fa6.j : fa6Var, (i5 & 1024) != 0 ? 0 : i, (i5 & 2048) != 0 ? bk2.a : bk2Var, (i5 & 4096) != 0 ? 30000L : j4, (i5 & RemoteCameraConfig.Notification.ID) != 0 ? -1L : j5, (i5 & 16384) == 0 ? j6 : 0L, (32768 & i5) != 0 ? -1L : j7, (65536 & i5) != 0 ? false : z2, (131072 & i5) != 0 ? nxj.a : nxjVar, (262144 & i5) != 0 ? 0 : i2, 0, (1048576 & i5) != 0 ? Long.MAX_VALUE : j8, (2097152 & i5) != 0 ? 0 : i3, (4194304 & i5) != 0 ? -256 : i4, (8388608 & i5) != 0 ? null : str4, (i5 & 16777216) != 0 ? Boolean.FALSE : bool);
    }

    public static t4w b(t4w t4wVar, String str, c4w c4wVar, String str2, q97 q97Var, int i, long j, int i2, int i3, long j2, int i4, int i5) {
        String str3 = (i5 & 1) != 0 ? t4wVar.a : str;
        c4w c4wVar2 = (i5 & 2) != 0 ? t4wVar.b : c4wVar;
        String str4 = (i5 & 4) != 0 ? t4wVar.c : str2;
        String str5 = t4wVar.d;
        q97 q97Var2 = (i5 & 16) != 0 ? t4wVar.e : q97Var;
        q97 q97Var3 = t4wVar.f;
        long j3 = t4wVar.g;
        long j4 = t4wVar.h;
        long j5 = t4wVar.i;
        fa6 fa6Var = t4wVar.j;
        int i6 = (i5 & 1024) != 0 ? t4wVar.k : i;
        bk2 bk2Var = t4wVar.l;
        long j6 = t4wVar.m;
        long j7 = (i5 & RemoteCameraConfig.Notification.ID) != 0 ? t4wVar.n : j;
        long j8 = t4wVar.o;
        long j9 = t4wVar.p;
        boolean z2 = t4wVar.q;
        nxj nxjVar = t4wVar.r;
        int i7 = (i5 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? t4wVar.s : i2;
        int i8 = (i5 & 524288) != 0 ? t4wVar.t : i3;
        long j10 = (i5 & 1048576) != 0 ? t4wVar.u : j2;
        int i9 = (i5 & 2097152) != 0 ? t4wVar.v : i4;
        int i10 = t4wVar.w;
        String str6 = t4wVar.x;
        Boolean bool = t4wVar.y;
        t4wVar.getClass();
        str3.getClass();
        c4wVar2.getClass();
        str4.getClass();
        str5.getClass();
        q97Var2.getClass();
        q97Var3.getClass();
        fa6Var.getClass();
        bk2Var.getClass();
        nxjVar.getClass();
        return new t4w(str3, c4wVar2, str4, str5, q97Var2, q97Var3, j3, j4, j5, fa6Var, i6, bk2Var, j6, j7, j8, j9, z2, nxjVar, i7, i8, j10, i9, i10, str6, bool);
    }

    public final long a() {
        return wyf.v(this.b == c4w.a && this.k > 0, this.k, this.l, this.m, this.n, this.s, c(), this.g, this.i, this.h, this.u);
    }

    public final boolean c() {
        return this.h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t4w)) {
            return false;
        }
        t4w t4wVar = (t4w) obj;
        return Intrinsics.d(this.a, t4wVar.a) && this.b == t4wVar.b && Intrinsics.d(this.c, t4wVar.c) && Intrinsics.d(this.d, t4wVar.d) && Intrinsics.d(this.e, t4wVar.e) && Intrinsics.d(this.f, t4wVar.f) && this.g == t4wVar.g && this.h == t4wVar.h && this.i == t4wVar.i && Intrinsics.d(this.j, t4wVar.j) && this.k == t4wVar.k && this.l == t4wVar.l && this.m == t4wVar.m && this.n == t4wVar.n && this.o == t4wVar.o && this.p == t4wVar.p && this.q == t4wVar.q && this.r == t4wVar.r && this.s == t4wVar.s && this.t == t4wVar.t && this.u == t4wVar.u && this.v == t4wVar.v && this.w == t4wVar.w && Intrinsics.d(this.x, t4wVar.x) && Intrinsics.d(this.y, t4wVar.y);
    }

    public final int hashCode() {
        int a = f1d.a(this.w, f1d.a(this.v, tlm.c(this.u, f1d.a(this.t, f1d.a(this.s, (this.r.hashCode() + k5r.e(tlm.c(this.p, tlm.c(this.o, tlm.c(this.n, tlm.c(this.m, (this.l.hashCode() + f1d.a(this.k, (this.j.hashCode() + tlm.c(this.i, tlm.c(this.h, tlm.c(this.g, (this.f.hashCode() + ((this.e.hashCode() + k5r.c(k5r.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d)) * 31)) * 31, 31), 31), 31)) * 31, 31)) * 31, 31), 31), 31), 31), 31, this.q)) * 31, 31), 31), 31), 31), 31);
        String str = this.x;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.y;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return dfi.i(new StringBuilder("{WorkSpec: "), this.a, '}');
    }

    public t4w(String str, c4w c4wVar, String str2, String str3, q97 q97Var, q97 q97Var2, long j, long j2, long j3, fa6 fa6Var, int i, bk2 bk2Var, long j4, long j5, long j6, long j7, boolean z2, nxj nxjVar, int i2, int i3, long j8, int i4, int i5, String str4, Boolean bool) {
        str.getClass();
        c4wVar.getClass();
        str2.getClass();
        str3.getClass();
        q97Var.getClass();
        q97Var2.getClass();
        fa6Var.getClass();
        bk2Var.getClass();
        nxjVar.getClass();
        this.a = str;
        this.b = c4wVar;
        this.c = str2;
        this.d = str3;
        this.e = q97Var;
        this.f = q97Var2;
        this.g = j;
        this.h = j2;
        this.i = j3;
        this.j = fa6Var;
        this.k = i;
        this.l = bk2Var;
        this.m = j4;
        this.n = j5;
        this.o = j6;
        this.p = j7;
        this.q = z2;
        this.r = nxjVar;
        this.s = i2;
        this.t = i3;
        this.u = j8;
        this.v = i4;
        this.w = i5;
        this.x = str4;
        this.y = bool;
    }
}
