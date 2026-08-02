package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes.dex */
public final class ris {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final String E;
    public static final String F;
    public static final Object q = new Object();
    public static final Object r = new Object();
    public static final onh s;
    public static final String t;
    public static final String u;
    public static final String v;
    public static final String w;
    public static final String x;
    public static final String y;
    public static final String z;
    public Object b;
    public Object d;
    public long e;
    public long f;
    public long g;
    public boolean h;
    public boolean i;
    public fnh j;
    public boolean k;
    public long l;
    public long m;
    public int n;
    public int o;
    public long p;
    public Object a = q;
    public onh c = s;

    static {
        gnh gnhVar;
        xmh xmhVar = new xmh();
        bnh bnhVar = new bnh();
        List list = Collections.EMPTY_LIST;
        qsn qsnVar = qsn.e;
        dnh dnhVar = new dnh();
        jnh jnhVar = jnh.d;
        Uri uri = Uri.EMPTY;
        vq1.A(((Uri) bnhVar.e) == null || ((UUID) bnhVar.d) != null);
        cnh cnhVar = null;
        if (uri != null) {
            if (((UUID) bnhVar.d) != null) {
                cnhVar = new cnh(bnhVar);
            }
            gnhVar = new gnh(uri, null, cnhVar, null, list, null, qsnVar, -9223372036854775807L);
        } else {
            gnhVar = null;
        }
        s = new onh("androidx.media3.common.Timeline", new anh(xmhVar), gnhVar, new fnh(dnhVar), hoh.K, jnhVar);
        t = Integer.toString(1, 36);
        u = Integer.toString(2, 36);
        v = Integer.toString(3, 36);
        w = Integer.toString(4, 36);
        x = Integer.toString(5, 36);
        y = Integer.toString(6, 36);
        z = Integer.toString(7, 36);
        A = Integer.toString(8, 36);
        B = Integer.toString(9, 36);
        C = Integer.toString(10, 36);
        D = Integer.toString(11, 36);
        E = Integer.toString(12, 36);
        F = Integer.toString(13, 36);
    }

    public final boolean a() {
        return this.j != null;
    }

    public final void b(Object obj, onh onhVar, Object obj2, long j, long j2, long j3, boolean z2, boolean z3, fnh fnhVar, long j4, long j5, int i, int i2, long j6) {
        this.a = obj;
        this.c = onhVar != null ? onhVar : s;
        if (onhVar != null) {
            gnh gnhVar = onhVar.b;
        }
        this.b = null;
        this.d = obj2;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = z2;
        this.i = z3;
        this.j = fnhVar;
        this.l = j4;
        this.m = j5;
        this.n = i;
        this.o = i2;
        this.p = j6;
        this.k = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ris.class.equals(obj.getClass())) {
            ris risVar = (ris) obj;
            if (Objects.equals(this.a, risVar.a) && Objects.equals(this.c, risVar.c) && Objects.equals(this.d, risVar.d) && Objects.equals(this.j, risVar.j) && this.e == risVar.e && this.f == risVar.f && this.g == risVar.g && this.h == risVar.h && this.i == risVar.i && this.k == risVar.k && this.l == risVar.l && this.m == risVar.m && this.n == risVar.n && this.o == risVar.o && this.p == risVar.p) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.a.hashCode() + 217) * 31)) * 31;
        Object obj = this.d;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        fnh fnhVar = this.j;
        int hashCode3 = (hashCode2 + (fnhVar != null ? fnhVar.hashCode() : 0)) * 31;
        long j = this.e;
        int i = (hashCode3 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.g;
        int i3 = (((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31) + (this.k ? 1 : 0)) * 31;
        long j4 = this.l;
        int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.m;
        int i5 = (((((i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.n) * 31) + this.o) * 31;
        long j6 = this.p;
        return i5 + ((int) (j6 ^ (j6 >>> 32)));
    }
}
