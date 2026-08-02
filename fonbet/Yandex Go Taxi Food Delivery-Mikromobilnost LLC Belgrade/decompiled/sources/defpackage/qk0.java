package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lqk0;", "Lvn11;", "Companion", "pk0", "ok0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class qk0 implements vn11 {
    public static final pk0 Companion = new pk0();
    public static final qk0 h = new qk0(0);
    public final boolean b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;

    public /* synthetic */ qk0(boolean z, boolean z2, int i, int i2, int i3, int i4, int i5) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 2) == 0) {
            this.c = 1;
        } else {
            this.c = i2;
        }
        if ((i & 4) == 0) {
            this.d = 1;
        } else {
            this.d = i3;
        }
        if ((i & 8) == 0) {
            this.e = 1;
        } else {
            this.e = i4;
        }
        if ((i & 16) == 0) {
            this.f = -100;
        } else {
            this.f = i5;
        }
        if ((i & 32) == 0) {
            this.g = false;
        } else {
            this.g = z2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qk0)) {
            return false;
        }
        qk0 qk0Var = (qk0) obj;
        return this.b == qk0Var.b && this.c == qk0Var.c && this.d == qk0Var.d && this.e == qk0Var.e && this.f == qk0Var.f && this.g == qk0Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + oyr.b(this.f, oyr.b(this.e, oyr.b(this.d, oyr.b(this.c, Boolean.hashCode(this.b) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder p = xvz.p("AddingWifiAndGsmInfoInFsExperiment(enabled=", this.c, ", wifiLimitCount=", ", gsmLimitCount=", this.b);
        vfc.u(this.d, this.e, ", timestampRoundingMs=", ", minSignalStrength=", p);
        p.append(this.f);
        p.append(", forceEmitFirstWifiResultToFs=");
        p.append(this.g);
        p.append(Extension.C_BRAKE);
        return p.toString();
    }

    public qk0(int i) {
        this.b = false;
        this.c = 1;
        this.d = 1;
        this.e = 1;
        this.f = -100;
        this.g = false;
    }

    public qk0() {
        this(0);
    }
}
