package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lt1p;", "Lvn11;", "Companion", "q1p", "a", "p1p", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class t1p implements vn11 {
    public static final q1p Companion = new q1p();
    public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new fsn(16))};
    public static final t1p d = new t1p(0);
    public final Map b;

    public /* synthetic */ t1p(int i, Map map) {
        if ((i & 1) == 0) {
            this.b = b.f();
        } else {
            this.b = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t1p) && jl40.l(this.b, ((t1p) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return nnm.j("ExternalServiceFullScreenExperiment(services=", Extension.C_BRAKE, this.b);
    }

    public t1p() {
        this(0);
    }

    public t1p(int i) {
        this.b = b.f();
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lt1p$a;", "", "Companion", "s1p", "r1p", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class a {
        public static final s1p Companion = new s1p();
        public static final a d = new a(0);
        public final boolean a;
        public final boolean b;
        public final boolean c;

        public /* synthetic */ a(int i, boolean z, boolean z2, boolean z3) {
            if ((i & 1) == 0) {
                this.a = false;
            } else {
                this.a = z;
            }
            if ((i & 2) == 0) {
                this.b = false;
            } else {
                this.b = z2;
            }
            if ((i & 4) == 0) {
                this.c = false;
            } else {
                this.c = z3;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            return x4e.i(qv10.u("ServiceFullScreenConfig(isEnabled=", ", provideContext=", ", isUrlPathCoordinatesEnabled=", this.a, this.b), this.c, Extension.C_BRAKE);
        }

        public a(int i) {
            this.a = false;
            this.b = false;
            this.c = false;
        }

        public a() {
            this(0);
        }
    }
}
