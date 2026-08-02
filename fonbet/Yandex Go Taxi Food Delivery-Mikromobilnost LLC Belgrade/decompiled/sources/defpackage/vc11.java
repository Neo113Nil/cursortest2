package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lvc11;", "Ln96;", "Lc6z;", "Companion", "tc11", "uc11", "jc11", "order"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class vc11 extends n96 implements c6z {
    public static final uc11 Companion = new uc11();
    public static final i3y[] k = {a.b(LazyThreadSafetyMode.PUBLICATION, new z411(20)), null, null, null, null, null, null, null, null};
    public static final vc11 l = new vc11(0);
    public final Map b;
    public final boolean c;
    public final Integer d;
    public final Integer e;
    public final tc11 f;
    public final String g;
    public final String h;
    public final String i;
    public final boolean j;

    public /* synthetic */ vc11(int i, Map map, boolean z, Integer num, Integer num2, tc11 tc11Var, String str, String str2, String str3, boolean z2) {
        this.b = (i & 1) == 0 ? b.f() : map;
        if ((i & 2) == 0) {
            this.c = false;
        } else {
            this.c = z;
        }
        if ((i & 4) == 0) {
            this.d = null;
        } else {
            this.d = num;
        }
        if ((i & 8) == 0) {
            this.e = null;
        } else {
            this.e = num2;
        }
        if ((i & 16) == 0) {
            this.f = sc11.INSTANCE;
        } else {
            this.f = tc11Var;
        }
        if ((i & 32) == 0) {
            this.g = "";
        } else {
            this.g = str;
        }
        if ((i & 64) == 0) {
            this.h = "";
        } else {
            this.h = str2;
        }
        if ((i & 128) == 0) {
            this.i = "";
        } else {
            this.i = str3;
        }
        if ((i & 256) == 0) {
            this.j = false;
        } else {
            this.j = z2;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vc11)) {
            return false;
        }
        vc11 vc11Var = (vc11) obj;
        return jl40.l(this.b, vc11Var.b) && this.c == vc11Var.c && jl40.l(this.d, vc11Var.d) && jl40.l(this.e, vc11Var.e) && jl40.l(this.f, vc11Var.f) && jl40.l(this.g, vc11Var.g) && jl40.l(this.h, vc11Var.h) && jl40.l(this.i, vc11Var.i) && this.j == vc11Var.j;
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.b;
    }

    public final int hashCode() {
        int e = unr0.e(this.b.hashCode() * 31, 31, this.c);
        Integer num = this.d;
        int hashCode = (e + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        return Boolean.hashCode(this.j) + unr0.b(unr0.b(unr0.b((this.f.hashCode() + ((hashCode + (num2 != null ? num2.hashCode() : 0)) * 31)) * 31, 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransportingTipsNotificationExperiment(l10n=");
        sb.append(this.b);
        sb.append(", enabled=");
        sb.append(this.c);
        sb.append(", arrivalTimeLeftSec=");
        sb.append(this.d);
        sb.append(", arrivalTimeLeftPercent=");
        sb.append(this.e);
        sb.append(", button=");
        sb.append(this.f);
        sb.append(", singleOrderTitleKey=");
        sb.append(this.g);
        sb.append(", multiOrderTitleKey=");
        g8e.D(sb, this.h, ", textKey=", this.i, ", isBigHeadsUp=");
        return x4e.i(sb, this.j, Extension.C_BRAKE);
    }

    public vc11() {
        this(0);
    }

    public vc11(int i) {
        Map f = b.f();
        sc11 sc11Var = sc11.INSTANCE;
        this.b = f;
        this.c = false;
        this.d = null;
        this.e = null;
        this.f = sc11Var;
        this.g = "";
        this.h = "";
        this.i = "";
        this.j = false;
    }
}
