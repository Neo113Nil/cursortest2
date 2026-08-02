package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class zb2 extends nq6 {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final Long e;
    public final boolean f;
    public final vp6 g;
    public final mq6 h;
    public final lq6 i;
    public final wp6 j;
    public final List k;
    public final int l;

    public zb2(String str, String str2, String str3, long j, Long l, boolean z, vp6 vp6Var, mq6 mq6Var, lq6 lq6Var, wp6 wp6Var, List list, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = l;
        this.f = z;
        this.g = vp6Var;
        this.h = mq6Var;
        this.i = lq6Var;
        this.j = wp6Var;
        this.k = list;
        this.l = i;
    }

    @Override // defpackage.nq6
    public final yb2 a() {
        yb2 yb2Var = new yb2();
        yb2Var.a = this.a;
        yb2Var.b = this.b;
        yb2Var.c = this.c;
        yb2Var.d = this.d;
        yb2Var.e = this.e;
        yb2Var.f = this.f;
        yb2Var.g = this.g;
        yb2Var.h = this.h;
        yb2Var.i = this.i;
        yb2Var.j = this.j;
        yb2Var.k = this.k;
        yb2Var.l = this.l;
        yb2Var.m = (byte) 7;
        return yb2Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nq6) {
            zb2 zb2Var = (zb2) ((nq6) obj);
            if (this.a.equals(zb2Var.a) && this.b.equals(zb2Var.b)) {
                String str = zb2Var.c;
                String str2 = this.c;
                if (str2 != null ? str2.equals(str) : str == null) {
                    if (this.d == zb2Var.d) {
                        Long l = zb2Var.e;
                        Long l2 = this.e;
                        if (l2 != null ? l2.equals(l) : l == null) {
                            if (this.f == zb2Var.f && this.g.equals(zb2Var.g)) {
                                mq6 mq6Var = zb2Var.h;
                                mq6 mq6Var2 = this.h;
                                if (mq6Var2 != null ? mq6Var2.equals(mq6Var) : mq6Var == null) {
                                    lq6 lq6Var = zb2Var.i;
                                    lq6 lq6Var2 = this.i;
                                    if (lq6Var2 != null ? lq6Var2.equals(lq6Var) : lq6Var == null) {
                                        wp6 wp6Var = zb2Var.j;
                                        wp6 wp6Var2 = this.j;
                                        if (wp6Var2 != null ? wp6Var2.equals(wp6Var) : wp6Var == null) {
                                            List list = zb2Var.k;
                                            List list2 = this.k;
                                            if (list2 != null ? list2.equals(list) : list == null) {
                                                if (this.l == zb2Var.l) {
                                                    return true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j = this.d;
        int i = (((hashCode ^ hashCode2) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        Long l = this.e;
        int hashCode3 = (((((i ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ this.g.hashCode()) * 1000003;
        mq6 mq6Var = this.h;
        int hashCode4 = (hashCode3 ^ (mq6Var == null ? 0 : mq6Var.hashCode())) * 1000003;
        lq6 lq6Var = this.i;
        int hashCode5 = (hashCode4 ^ (lq6Var == null ? 0 : lq6Var.hashCode())) * 1000003;
        wp6 wp6Var = this.j;
        int hashCode6 = (hashCode5 ^ (wp6Var == null ? 0 : wp6Var.hashCode())) * 1000003;
        List list = this.k;
        return ((hashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003) ^ this.l;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Session{generator=");
        sb.append(this.a);
        sb.append(", identifier=");
        sb.append(this.b);
        sb.append(", appQualitySessionId=");
        sb.append(this.c);
        sb.append(", startedAt=");
        sb.append(this.d);
        sb.append(", endedAt=");
        sb.append(this.e);
        sb.append(", crashed=");
        sb.append(this.f);
        sb.append(", app=");
        sb.append(this.g);
        sb.append(", user=");
        sb.append(this.h);
        sb.append(", os=");
        sb.append(this.i);
        sb.append(", device=");
        sb.append(this.j);
        sb.append(", events=");
        sb.append(this.k);
        sb.append(", generatorType=");
        return f1d.i(sb, this.l, "}");
    }
}
