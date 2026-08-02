package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class yb2 {
    public String a;
    public String b;
    public String c;
    public long d;
    public Long e;
    public boolean f;
    public vp6 g;
    public mq6 h;
    public lq6 i;
    public wp6 j;
    public List k;
    public int l;
    public byte m;

    public final zb2 a() {
        String str;
        String str2;
        vp6 vp6Var;
        if (this.m == 7 && (str = this.a) != null && (str2 = this.b) != null && (vp6Var = this.g) != null) {
            return new zb2(str, str2, this.c, this.d, this.e, this.f, vp6Var, this.h, this.i, this.j, this.k, this.l);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" generator");
        }
        if (this.b == null) {
            sb.append(" identifier");
        }
        if ((this.m & 1) == 0) {
            sb.append(" startedAt");
        }
        if ((this.m & 2) == 0) {
            sb.append(" crashed");
        }
        if (this.g == null) {
            sb.append(" app");
        }
        if ((this.m & 4) == 0) {
            sb.append(" generatorType");
        }
        xq0.q(su4.n("Missing required properties:", sb));
        return null;
    }
}
