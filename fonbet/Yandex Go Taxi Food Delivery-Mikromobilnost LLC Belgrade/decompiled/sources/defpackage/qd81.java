package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import yads.cs1;
import yads.kk0;

/* loaded from: classes7.dex */
public final class qd81 implements kq71 {
    public static final qd81 b0 = new qd81(new da81());
    public static final su71 c0 = new su71(12);
    public final int A;
    public final String B;
    public final cs1 C;
    public final String D;
    public final String E;
    public final int F;
    public final List G;
    public final kk0 H;
    public final long I;
    public final int J;
    public final int K;
    public final float L;
    public final int M;
    public final float N;
    public final byte[] O;
    public final int P;
    public final hw81 Q;
    public final int R;
    public final int S;
    public final int T;
    public final int U;
    public final int V;
    public final int W;
    public final int Z;
    public final String a;
    public int a0;
    public final String b;
    public final String c;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    public qd81(da81 da81Var) {
        this.a = da81Var.a;
        this.b = da81Var.b;
        this.c = rf71.A(da81Var.c);
        this.w = da81Var.d;
        this.x = da81Var.e;
        int i = da81Var.f;
        this.y = i;
        int i2 = da81Var.g;
        this.z = i2;
        this.A = i2 != -1 ? i2 : i;
        this.B = da81Var.h;
        this.C = da81Var.i;
        this.D = da81Var.j;
        this.E = da81Var.k;
        this.F = da81Var.l;
        List list = da81Var.m;
        this.G = list == null ? Collections.EMPTY_LIST : list;
        kk0 kk0Var = da81Var.n;
        this.H = kk0Var;
        this.I = da81Var.o;
        this.J = da81Var.p;
        this.K = da81Var.q;
        this.L = da81Var.r;
        int i3 = da81Var.s;
        this.M = i3 == -1 ? 0 : i3;
        float f = da81Var.t;
        this.N = f == -1.0f ? 1.0f : f;
        this.O = da81Var.u;
        this.P = da81Var.v;
        this.Q = da81Var.w;
        this.R = da81Var.x;
        this.S = da81Var.y;
        this.T = da81Var.z;
        int i4 = da81Var.A;
        this.U = i4 == -1 ? 0 : i4;
        int i5 = da81Var.B;
        this.V = i5 != -1 ? i5 : 0;
        this.W = da81Var.C;
        int i6 = da81Var.D;
        if (i6 != 0 || kk0Var == null) {
            this.Z = i6;
        } else {
            this.Z = 1;
        }
    }

    public final boolean a(qd81 qd81Var) {
        List list = this.G;
        if (list.size() != qd81Var.G.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) qd81Var.G.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj != null && qd81.class == obj.getClass()) {
            qd81 qd81Var = (qd81) obj;
            int i2 = this.a0;
            if ((i2 == 0 || (i = qd81Var.a0) == 0 || i2 == i) && this.w == qd81Var.w && this.x == qd81Var.x && this.y == qd81Var.y && this.z == qd81Var.z && this.F == qd81Var.F && this.I == qd81Var.I && this.J == qd81Var.J && this.K == qd81Var.K && this.M == qd81Var.M && this.P == qd81Var.P && this.R == qd81Var.R && this.S == qd81Var.S && this.T == qd81Var.T && this.U == qd81Var.U && this.V == qd81Var.V && this.W == qd81Var.W && this.Z == qd81Var.Z && Float.compare(this.L, qd81Var.L) == 0 && Float.compare(this.N, qd81Var.N) == 0 && rf71.o(this.a, qd81Var.a) && rf71.o(this.b, qd81Var.b) && rf71.o(this.B, qd81Var.B) && rf71.o(this.D, qd81Var.D) && rf71.o(this.E, qd81Var.E) && rf71.o(this.c, qd81Var.c) && Arrays.equals(this.O, qd81Var.O) && rf71.o(this.C, qd81Var.C) && rf71.o(this.Q, qd81Var.Q) && rf71.o(this.H, qd81Var.H) && a(qd81Var)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.a0 == 0) {
            String str = this.a;
            int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.c;
            int hashCode3 = (((((((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.w) * 31) + this.x) * 31) + this.y) * 31) + this.z) * 31;
            String str4 = this.B;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            cs1 cs1Var = this.C;
            int hashCode5 = (hashCode4 + (cs1Var == null ? 0 : Arrays.hashCode(cs1Var.b))) * 31;
            String str5 = this.D;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.E;
            this.a0 = ((((((((((((((((Float.floatToIntBits(this.N) + ((((Float.floatToIntBits(this.L) + ((((((((((hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.F) * 31) + ((int) this.I)) * 31) + this.J) * 31) + this.K) * 31)) * 31) + this.M) * 31)) * 31) + this.P) * 31) + this.R) * 31) + this.S) * 31) + this.T) * 31) + this.U) * 31) + this.V) * 31) + this.W) * 31) + this.Z;
        }
        return this.a0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Format(");
        sb.append(this.a);
        sb.append(Extension.FIX_SPACE);
        sb.append(this.b);
        sb.append(Extension.FIX_SPACE);
        sb.append(this.D);
        sb.append(Extension.FIX_SPACE);
        sb.append(this.E);
        sb.append(Extension.FIX_SPACE);
        sb.append(this.B);
        sb.append(Extension.FIX_SPACE);
        sb.append(this.A);
        sb.append(Extension.FIX_SPACE);
        sb.append(this.c);
        sb.append(", [");
        sb.append(this.J);
        sb.append(Extension.FIX_SPACE);
        sb.append(this.K);
        sb.append(Extension.FIX_SPACE);
        sb.append(this.L);
        sb.append("], [");
        sb.append(this.R);
        sb.append(Extension.FIX_SPACE);
        return oyr.m(this.S, "])", sb);
    }
}
