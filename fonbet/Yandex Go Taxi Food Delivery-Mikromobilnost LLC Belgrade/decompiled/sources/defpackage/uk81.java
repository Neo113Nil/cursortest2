package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import yads.t31;
import yads.wk2;

/* loaded from: classes7.dex */
public final class uk81 implements kq71 {
    public static final Object J = new Object();
    public static final Object K = new Object();
    public static final op81 L;
    public boolean A;
    public boolean B;
    public q581 C;
    public boolean D;
    public long E;
    public long F;
    public int G;
    public int H;
    public long I;
    public Object a = J;
    public op81 b = L;
    public Object c;
    public long w;
    public long x;
    public long y;
    public boolean z;

    static {
        wp71 wp71Var = new wp71();
        p481 p481Var = t31.b;
        wk2 wk2Var = wk2.x;
        List list = Collections.EMPTY_LIST;
        wk2 wk2Var2 = wk2.x;
        qf81 qf81Var = qf81.c;
        Uri uri = Uri.EMPTY;
        L = new op81("com.monetization.ads.exoplayer2.Timeline", new dw71(wp71Var), uri != null ? new d981(uri, list, null, wk2Var2) : null, new q581(-3.4028235E38f, -3.4028235E38f, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L), oi61.b0, qf81Var);
    }

    public final void a(Object obj, op81 op81Var, Object obj2, long j, long j2, long j3, boolean z, boolean z2, q581 q581Var, long j4, long j5, int i, int i2, long j6) {
        this.a = obj;
        if (op81Var == null) {
            op81Var = L;
        }
        this.b = op81Var;
        this.c = obj2;
        this.w = j;
        this.x = j2;
        this.y = j3;
        this.z = z;
        this.A = z2;
        this.B = q581Var != null;
        this.C = q581Var;
        this.E = j4;
        this.F = j5;
        this.G = i;
        this.H = i2;
        this.I = j6;
        this.D = false;
    }

    public final boolean b() {
        boolean z = this.B;
        q581 q581Var = this.C;
        if (z == (q581Var != null)) {
            return q581Var != null;
        }
        ny61.k();
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && uk81.class.equals(obj.getClass())) {
            uk81 uk81Var = (uk81) obj;
            if (rf71.o(this.a, uk81Var.a) && rf71.o(this.b, uk81Var.b) && rf71.o(this.c, uk81Var.c) && rf71.o(this.C, uk81Var.C) && this.w == uk81Var.w && this.x == uk81Var.x && this.y == uk81Var.y && this.z == uk81Var.z && this.A == uk81Var.A && this.D == uk81Var.D && this.E == uk81Var.E && this.F == uk81Var.F && this.G == uk81Var.G && this.H == uk81Var.H && this.I == uk81Var.I) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + smw0.c(217, 31, this.a)) * 31;
        Object obj = this.c;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        q581 q581Var = this.C;
        int hashCode3 = (hashCode2 + (q581Var != null ? q581Var.hashCode() : 0)) * 31;
        long j = this.w;
        int i = (hashCode3 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.x;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.y;
        int i3 = (((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.z ? 1 : 0)) * 31) + (this.A ? 1 : 0)) * 31) + (this.D ? 1 : 0)) * 31;
        long j4 = this.E;
        int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.F;
        int i5 = (((((i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.G) * 31) + this.H) * 31;
        long j6 = this.I;
        return i5 + ((int) (j6 ^ (j6 >>> 32)));
    }
}
