package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lq8i0;", "Ln96;", "Lc6z;", "Companion", "p8i0", "o8i0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class q8i0 extends n96 implements c6z {
    public static final p8i0 Companion = new p8i0();
    public static final i3y[] e = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new pmf0(29)), null};
    public static final q8i0 f = new q8i0(0);
    public final boolean b;
    public final Map c;
    public final String d;

    public /* synthetic */ q8i0(int i, String str, Map map, boolean z) {
        this.b = (i & 1) == 0 ? false : z;
        this.c = (i & 2) == 0 ? b.f() : map;
        if ((i & 4) == 0) {
            this.d = null;
        } else {
            this.d = str;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q8i0)) {
            return false;
        }
        q8i0 q8i0Var = (q8i0) obj;
        return this.b == q8i0Var.b && jl40.l(this.c, q8i0Var.c) && jl40.l(this.d, q8i0Var.d);
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    public final int hashCode() {
        int d = unr0.d(Boolean.hashCode(this.b) * 31, 31, this.c);
        String str = this.d;
        return d + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return oyr.t(nnm.l("RatingInfoExperiment(enabled=", ", l10n=", ", url=", this.c, this.b), this.d, Extension.C_BRAKE);
    }

    public q8i0() {
        this(0);
    }

    public q8i0(int i) {
        Map f2 = b.f();
        this.b = false;
        this.c = f2;
        this.d = null;
    }
}
