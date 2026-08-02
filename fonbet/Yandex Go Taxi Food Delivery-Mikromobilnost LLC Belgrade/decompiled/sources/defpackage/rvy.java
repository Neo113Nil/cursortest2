package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lrvy;", "Ln96;", "Lc6z;", "Companion", "a", "ovy", "nvy", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class rvy extends n96 implements c6z {
    public static final ovy Companion = new ovy();
    public static final i3y[] f = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new wwx(18)), null, null};
    public static final rvy g = new rvy(0);
    public final boolean b;
    public final Map c;
    public final a d;
    public final a e;

    public /* synthetic */ rvy(int i, boolean z, Map map, a aVar, a aVar2) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 2) == 0) {
            this.c = b.f();
        } else {
            this.c = map;
        }
        if ((i & 4) == 0) {
            this.d = new a(0);
        } else {
            this.d = aVar;
        }
        if ((i & 8) == 0) {
            this.e = new a(0);
        } else {
            this.e = aVar2;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public final boolean c(boolean z) {
        a aVar = this.e;
        a aVar2 = this.d;
        if (evu0.J(d6z.Y(this, (z ? aVar2 : aVar).a))) {
            return false;
        }
        if (evu0.J(d6z.Y(this, (z ? aVar2 : aVar).c))) {
            return false;
        }
        if (evu0.J(d6z.Y(this, (z ? aVar2 : aVar).d))) {
            return false;
        }
        if (z) {
            aVar = aVar2;
        }
        return !evu0.J(d6z.Y(this, aVar.e));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rvy)) {
            return false;
        }
        rvy rvyVar = (rvy) obj;
        return this.b == rvyVar.b && jl40.l(this.c, rvyVar.c) && jl40.l(this.d, rvyVar.d) && jl40.l(this.e, rvyVar.e);
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + unr0.d(Boolean.hashCode(this.b) * 31, 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder l = nnm.l("LiveLocationModalExperiment(enabled=", ", l10n=", ", turnOnConfig=", this.c, this.b);
        l.append(this.d);
        l.append(", turnOffConfig=");
        l.append(this.e);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lrvy$a;", "", "Companion", "pvy", "qvy", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class a {
        public static final qvy Companion = new qvy();
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;

        public /* synthetic */ a(String str, String str2, String str3, String str4, int i, String str5) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = "";
            } else {
                this.c = str3;
            }
            if ((i & 8) == 0) {
                this.d = "";
            } else {
                this.d = str4;
            }
            if ((i & 16) == 0) {
                this.e = "";
            } else {
                this.e = str5;
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
            return jl40.l(this.a, aVar.a) && jl40.l(this.b, aVar.b) && jl40.l(this.c, aVar.c) && jl40.l(this.d, aVar.d) && jl40.l(this.e, aVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        }

        public final String toString() {
            StringBuilder v = b64.v("LiveLocationModalStateConfig(titleTk=", this.a, ", subtitleTk=", this.b, ", firstButtonTk=");
            g8e.D(v, this.c, ", secondButtonTk=", this.d, ", thirdButtonTk=");
            return oyr.t(v, this.e, Extension.C_BRAKE);
        }

        public a(int i) {
            this.a = "";
            this.b = "";
            this.c = "";
            this.d = "";
            this.e = "";
        }

        public a() {
            this(0);
        }
    }

    public rvy() {
        this(0);
    }

    public rvy(int i) {
        Map f2 = b.f();
        a aVar = new a(0);
        a aVar2 = new a(0);
        this.b = false;
        this.c = f2;
        this.d = aVar;
        this.e = aVar2;
    }
}
