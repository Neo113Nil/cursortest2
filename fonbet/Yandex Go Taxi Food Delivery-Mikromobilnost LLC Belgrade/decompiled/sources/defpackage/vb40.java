package defpackage;

import io.appmetrica.analytics.push.coreutils.internal.CoreConstants;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0011\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lvb40;", "", "Companion", "g", "h", "e", "l", "o", "m", "n", "f", "b", "c", "d", "a", CoreConstants.PushMessage.PROCESSING_MIN_TIME, CoreConstants.PushMessage.SERVICE_TYPE, "k", "sb40", "wb40", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class vb40 {
    public static final wb40 Companion = new wb40();
    public final g a;
    public final h b;
    public final a c;
    public final j d;
    public final k e;

    public /* synthetic */ vb40(int i2, g gVar, h hVar, a aVar, j jVar, k kVar) {
        this.a = (i2 & 1) == 0 ? new g(0) : gVar;
        if ((i2 & 2) == 0) {
            this.b = new h(0);
        } else {
            this.b = hVar;
        }
        if ((i2 & 4) == 0) {
            this.c = new a(0);
        } else {
            this.c = aVar;
        }
        if ((i2 & 8) == 0) {
            this.d = new j(0);
        } else {
            this.d = jVar;
        }
        if ((i2 & 16) == 0) {
            this.e = new k(0);
        } else {
            this.e = kVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vb40)) {
            return false;
        }
        vb40 vb40Var = (vb40) obj;
        return jl40.l(this.a, vb40Var.a) && jl40.l(this.b, vb40Var.b) && jl40.l(this.c, vb40Var.c) && jl40.l(this.d, vb40Var.d) && jl40.l(this.e, vb40Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "MtTrainCheckoutScreenDataDto(header=" + this.a + ", info=" + this.b + ", backAndForth=" + this.c + ", passengersCounter=" + this.d + ", paymentInfo=" + this.e + Extension.C_BRAKE;
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lvb40$g;", "", "Companion", "hc40", "ic40", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class g {
        public static final ic40 Companion = new ic40();
        public final FormattedText a;

        public /* synthetic */ g(int i, FormattedText formattedText) {
            if ((i & 1) == 0) {
                this.a = FormattedText.c;
            } else {
                this.a = formattedText;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && jl40.l(this.a, ((g) obj).a);
        }

        public final int hashCode() {
            return this.a.a.hashCode();
        }

        public final String toString() {
            return ly3.p("Header(name=", Extension.C_BRAKE, this.a);
        }

        public g() {
            this(0);
        }

        public g(int i) {
            this.a = FormattedText.c;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lvb40$e;", "", "Companion", "dc40", "ec40", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class e {
        public static final ec40 Companion = new ec40();
        public final FormattedText a;
        public final FormattedText b;

        public /* synthetic */ e(int i, FormattedText formattedText, FormattedText formattedText2) {
            this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
            if ((i & 2) == 0) {
                this.b = FormattedText.c;
            } else {
                this.b = formattedText2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return jl40.l(this.a, eVar.a) && jl40.l(this.b, eVar.b);
        }

        public final int hashCode() {
            return this.b.a.hashCode() + (this.a.a.hashCode() * 31);
        }

        public final String toString() {
            return "DateSectionDto(title=" + this.a + ", subtitle=" + this.b + Extension.C_BRAKE;
        }

        public e() {
            this(0);
        }

        public e(int i) {
            FormattedText formattedText = FormattedText.c;
            this.a = formattedText;
            this.b = formattedText;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lvb40$j;", "", "Companion", "nc40", "oc40", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class j {
        public static final oc40 Companion = new oc40();
        public final i a;
        public final i b;

        public /* synthetic */ j(int i, i iVar, i iVar2) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = iVar;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = iVar2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return jl40.l(this.a, jVar.a) && jl40.l(this.b, jVar.b);
        }

        public final int hashCode() {
            i iVar = this.a;
            int hashCode = (iVar == null ? 0 : iVar.hashCode()) * 31;
            i iVar2 = this.b;
            return hashCode + (iVar2 != null ? iVar2.hashCode() : 0);
        }

        public final String toString() {
            return "PassengersCounterDto(adultSection=" + this.a + ", childSection=" + this.b + Extension.C_BRAKE;
        }

        public j(int i) {
            this.a = null;
            this.b = null;
        }

        public j() {
            this(0);
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lvb40$l;", "", "Companion", "rc40", "sc40", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class l {
        public static final sc40 Companion = new sc40();
        public final FormattedText a;
        public final FormattedText b;

        public /* synthetic */ l(int i, FormattedText formattedText, FormattedText formattedText2) {
            this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
            if ((i & 2) == 0) {
                this.b = FormattedText.c;
            } else {
                this.b = formattedText2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return jl40.l(this.a, lVar.a) && jl40.l(this.b, lVar.b);
        }

        public final int hashCode() {
            return this.b.a.hashCode() + (this.a.a.hashCode() * 31);
        }

        public final String toString() {
            return "RouteDto(title=" + this.a + ", subtitle=" + this.b + Extension.C_BRAKE;
        }

        public l() {
            this(0);
        }

        public l(int i) {
            FormattedText formattedText = FormattedText.c;
            this.a = formattedText;
            this.b = formattedText;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lvb40$b;", "", "Companion", "xb40", "yb40", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class b {
        public static final yb40 Companion = new yb40();
        public final FormattedText a;
        public final c b;
        public final Boolean c;

        public /* synthetic */ b(int i, FormattedText formattedText, c cVar, Boolean bool) {
            this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = cVar;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = bool;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return jl40.l(this.a, bVar.a) && jl40.l(this.b, bVar.b) && jl40.l(this.c, bVar.c);
        }

        public final int hashCode() {
            int hashCode = this.a.a.hashCode() * 31;
            c cVar = this.b;
            int hashCode2 = (hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
            Boolean bool = this.c;
            return hashCode2 + (bool != null ? bool.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ConditionButtonDto(title=");
            sb.append(this.a);
            sb.append(", infoDialog=");
            sb.append(this.b);
            sb.append(", isEnabled=");
            return nzs.d(sb, this.c, Extension.C_BRAKE);
        }

        public b() {
            this.a = FormattedText.c;
            this.b = null;
            this.c = null;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lvb40$a;", "", "Companion", "tb40", "ub40", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class a {
        public static final ub40 Companion = new ub40();
        public final FormattedText a;
        public final FormattedText b;
        public final Boolean c;

        public /* synthetic */ a(int i, FormattedText formattedText, FormattedText formattedText2, Boolean bool) {
            this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
            if ((i & 2) == 0) {
                this.b = FormattedText.c;
            } else {
                this.b = formattedText2;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = bool;
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
            return jl40.l(this.a, aVar.a) && jl40.l(this.b, aVar.b) && jl40.l(this.c, aVar.c);
        }

        public final int hashCode() {
            int c = unr0.c(this.a.a.hashCode() * 31, 31, this.b.a);
            Boolean bool = this.c;
            return c + (bool == null ? 0 : bool.hashCode());
        }

        public final String toString() {
            return nzs.d(defpackage.n.r("BackAndForthDto(backAndForthTitle=", this.a, ", onlyForthTitle=", this.b, ", isEnabled="), this.c, Extension.C_BRAKE);
        }

        public a() {
            this(0);
        }

        public a(int i) {
            FormattedText formattedText = FormattedText.c;
            this.a = formattedText;
            this.b = formattedText;
            this.c = null;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lvb40$c;", "", "Companion", "zb40", "ac40", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class c {
        public static final ac40 Companion = new ac40();
        public static final i3y[] d = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new e540(12))};
        public final FormattedText a;
        public final FormattedText b;
        public final List c;

        public /* synthetic */ c(int i, List list, FormattedText formattedText, FormattedText formattedText2) {
            this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
            if ((i & 2) == 0) {
                this.b = FormattedText.c;
            } else {
                this.b = formattedText2;
            }
            if ((i & 4) == 0) {
                this.c = EmptyList.a;
            } else {
                this.c = list;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return jl40.l(this.a, cVar.a) && jl40.l(this.b, cVar.b) && jl40.l(this.c, cVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + unr0.c(this.a.a.hashCode() * 31, 31, this.b.a);
        }

        public final String toString() {
            return ly3.s(defpackage.n.r("ConditionButtonInfoDialogDto(title=", this.a, ", buttonTitle=", this.b, ", items="), this.c, Extension.C_BRAKE);
        }

        public c() {
            FormattedText formattedText = FormattedText.c;
            this.a = formattedText;
            this.b = formattedText;
            this.c = EmptyList.a;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lvb40$d;", "", "Companion", "bc40", "cc40", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class d {
        public static final cc40 Companion = new cc40();
        public final String a;
        public final FormattedText b;
        public final FormattedText c;

        public /* synthetic */ d(int i, String str, FormattedText formattedText, FormattedText formattedText2) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = FormattedText.c;
            } else {
                this.b = formattedText;
            }
            if ((i & 4) == 0) {
                this.c = FormattedText.c;
            } else {
                this.c = formattedText2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return jl40.l(this.a, dVar.a) && jl40.l(this.b, dVar.b) && jl40.l(this.c, dVar.c);
        }

        public final int hashCode() {
            return this.c.a.hashCode() + unr0.c(this.a.hashCode() * 31, 31, this.b.a);
        }

        public final String toString() {
            return tse0.m(xvz.q("ConditionButtonInfoItemDto(iconTag=", this.a, ", title=", ", subtitle=", this.b), this.c, Extension.C_BRAKE);
        }

        public d() {
            FormattedText formattedText = FormattedText.c;
            this.a = "";
            this.b = formattedText;
            this.c = formattedText;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lvb40$m;", "", "Companion", "tc40", "uc40", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class m {
        public static final uc40 Companion = new uc40();
        public static final i3y[] d = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new e540(13))};
        public final FormattedText a;
        public final FormattedText b;
        public final List c;

        public /* synthetic */ m(int i, List list, FormattedText formattedText, FormattedText formattedText2) {
            this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
            if ((i & 2) == 0) {
                this.b = FormattedText.c;
            } else {
                this.b = formattedText2;
            }
            if ((i & 4) == 0) {
                this.c = EmptyList.a;
            } else {
                this.c = list;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return jl40.l(this.a, mVar.a) && jl40.l(this.b, mVar.b) && jl40.l(this.c, mVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + unr0.c(this.a.a.hashCode() * 31, 31, this.b.a);
        }

        public final String toString() {
            return ly3.s(defpackage.n.r("TariffInfoDialogDto(title=", this.a, ", buttonTitle=", this.b, ", items="), this.c, Extension.C_BRAKE);
        }

        public m() {
            FormattedText formattedText = FormattedText.c;
            this.a = formattedText;
            this.b = formattedText;
            this.c = EmptyList.a;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lvb40$o;", "", "Companion", "xc40", "yc40", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class o {
        public static final yc40 Companion = new yc40();
        public final FormattedText a;
        public final FormattedText b;
        public final FormattedText c;
        public final m d;

        public /* synthetic */ o(int i, FormattedText formattedText, FormattedText formattedText2, FormattedText formattedText3, m mVar) {
            this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
            if ((i & 2) == 0) {
                this.b = FormattedText.c;
            } else {
                this.b = formattedText2;
            }
            if ((i & 4) == 0) {
                this.c = FormattedText.c;
            } else {
                this.c = formattedText3;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = mVar;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return jl40.l(this.a, oVar.a) && jl40.l(this.b, oVar.b) && jl40.l(this.c, oVar.c) && jl40.l(this.d, oVar.d);
        }

        public final int hashCode() {
            int c = unr0.c(unr0.c(this.a.a.hashCode() * 31, 31, this.b.a), 31, this.c.a);
            m mVar = this.d;
            return c + (mVar == null ? 0 : mVar.hashCode());
        }

        public final String toString() {
            StringBuilder r = defpackage.n.r("TariffSectionDto(title=", this.a, ", subtitle=", this.b, ", description=");
            r.append(this.c);
            r.append(", infoDialog=");
            r.append(this.d);
            r.append(Extension.C_BRAKE);
            return r.toString();
        }

        public o() {
            this(0);
        }

        public o(int i) {
            FormattedText formattedText = FormattedText.c;
            this.a = formattedText;
            this.b = formattedText;
            this.c = formattedText;
            this.d = null;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lvb40$f;", "", "Companion", "fc40", "gc40", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class f {
        public static final gc40 Companion = new gc40();
        public final String a;
        public final FormattedText b;
        public final FormattedText c;
        public final b d;

        public /* synthetic */ f(int i, String str, FormattedText formattedText, FormattedText formattedText2, b bVar) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = FormattedText.c;
            } else {
                this.b = formattedText;
            }
            if ((i & 4) == 0) {
                this.c = FormattedText.c;
            } else {
                this.c = formattedText2;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = bVar;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return jl40.l(this.a, fVar.a) && jl40.l(this.b, fVar.b) && jl40.l(this.c, fVar.c) && jl40.l(this.d, fVar.d);
        }

        public final int hashCode() {
            String str = this.a;
            int c = unr0.c(unr0.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b.a), 31, this.c.a);
            b bVar = this.d;
            return c + (bVar != null ? bVar.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder q = xvz.q("DetailsSectionDto(iconTag=", this.a, ", title=", ", subtitle=", this.b);
            q.append(this.c);
            q.append(", conditionButton=");
            q.append(this.d);
            q.append(Extension.C_BRAKE);
            return q.toString();
        }

        public f() {
            this(0);
        }

        public f(int i) {
            FormattedText formattedText = FormattedText.c;
            this.a = null;
            this.b = formattedText;
            this.c = formattedText;
            this.d = null;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lvb40$k;", "", "Companion", "pc40", "qc40", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class k {
        public static final qc40 Companion = new qc40();
        public final FormattedText a;
        public final FormattedText b;
        public final FormattedText c;
        public final FormattedText d;

        public /* synthetic */ k(int i, FormattedText formattedText, FormattedText formattedText2, FormattedText formattedText3, FormattedText formattedText4) {
            this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
            if ((i & 2) == 0) {
                this.b = FormattedText.c;
            } else {
                this.b = formattedText2;
            }
            if ((i & 4) == 0) {
                this.c = FormattedText.c;
            } else {
                this.c = formattedText3;
            }
            if ((i & 8) == 0) {
                this.d = FormattedText.c;
            } else {
                this.d = formattedText4;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return jl40.l(this.a, kVar.a) && jl40.l(this.b, kVar.b) && jl40.l(this.c, kVar.c) && jl40.l(this.d, kVar.d);
        }

        public final int hashCode() {
            return this.d.a.hashCode() + unr0.c(unr0.c(this.a.a.hashCode() * 31, 31, this.b.a), 31, this.c.a);
        }

        public final String toString() {
            StringBuilder r = defpackage.n.r("PaymentInfoDto(title=", this.a, ", subtitle=", this.b, ", buttonTitle=");
            r.append(this.c);
            r.append(", userAgreement=");
            r.append(this.d);
            r.append(Extension.C_BRAKE);
            return r.toString();
        }

        public k() {
            this(0);
        }

        public k(int i) {
            FormattedText formattedText = FormattedText.c;
            this.a = formattedText;
            this.b = formattedText;
            this.c = formattedText;
            this.d = formattedText;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lvb40$i;", "", "Companion", "lc40", "mc40", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class i {
        public static final mc40 Companion = new mc40();
        public final FormattedText a;
        public final FormattedText b;
        public final int c;
        public final int d;
        public final Boolean e;

        public /* synthetic */ i(int i, FormattedText formattedText, FormattedText formattedText2, int i2, int i3, Boolean bool) {
            this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
            if ((i & 2) == 0) {
                this.b = FormattedText.c;
            } else {
                this.b = formattedText2;
            }
            if ((i & 4) == 0) {
                this.c = 0;
            } else {
                this.c = i2;
            }
            if ((i & 8) == 0) {
                this.d = 0;
            } else {
                this.d = i3;
            }
            if ((i & 16) == 0) {
                this.e = null;
            } else {
                this.e = bool;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return jl40.l(this.a, iVar.a) && jl40.l(this.b, iVar.b) && this.c == iVar.c && this.d == iVar.d && jl40.l(this.e, iVar.e);
        }

        public final int hashCode() {
            int b = oyr.b(this.d, oyr.b(this.c, unr0.c(this.a.a.hashCode() * 31, 31, this.b.a), 31), 31);
            Boolean bool = this.e;
            return b + (bool == null ? 0 : bool.hashCode());
        }

        public final String toString() {
            StringBuilder r = defpackage.n.r("PassengerCounterSectionDto(title=", this.a, ", subtitle=", this.b, ", minValue=");
            vfc.u(this.c, this.d, ", maxValue=", ", isEnabled=", r);
            return nzs.d(r, this.e, Extension.C_BRAKE);
        }

        public i() {
            FormattedText formattedText = FormattedText.c;
            this.a = formattedText;
            this.b = formattedText;
            this.c = 0;
            this.d = 0;
            this.e = null;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lvb40$n;", "", "Companion", "vc40", "wc40", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class n {
        public static final wc40 Companion = new wc40();
        public final FormattedText a;
        public final FormattedText b;
        public final FormattedText c;
        public final FormattedText d;
        public final boolean e;
        public final String f;

        public /* synthetic */ n(int i, FormattedText formattedText, FormattedText formattedText2, FormattedText formattedText3, FormattedText formattedText4, boolean z, String str) {
            this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
            if ((i & 2) == 0) {
                this.b = FormattedText.c;
            } else {
                this.b = formattedText2;
            }
            if ((i & 4) == 0) {
                this.c = FormattedText.c;
            } else {
                this.c = formattedText3;
            }
            if ((i & 8) == 0) {
                this.d = FormattedText.c;
            } else {
                this.d = formattedText4;
            }
            if ((i & 16) == 0) {
                this.e = false;
            } else {
                this.e = z;
            }
            if ((i & 32) == 0) {
                this.f = "";
            } else {
                this.f = str;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return jl40.l(this.a, nVar.a) && jl40.l(this.b, nVar.b) && jl40.l(this.c, nVar.c) && jl40.l(this.d, nVar.d) && this.e == nVar.e && jl40.l(this.f, nVar.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + unr0.e(unr0.c(unr0.c(unr0.c(this.a.a.hashCode() * 31, 31, this.b.a), 31, this.c.a), 31, this.d.a), 31, this.e);
        }

        public final String toString() {
            StringBuilder r = defpackage.n.r("TariffInfoItemDto(title=", this.a, ", description=", this.b, ", subtitle=");
            defpackage.n.C(r, this.c, ", priceTitle=", this.d, ", isEnabled=");
            return defpackage.n.m(", tariffId=", this.f, Extension.C_BRAKE, r, this.e);
        }

        public n() {
            FormattedText formattedText = FormattedText.c;
            this.a = formattedText;
            this.b = formattedText;
            this.c = formattedText;
            this.d = formattedText;
            this.e = false;
            this.f = "";
        }
    }

    public vb40() {
        this(0);
    }

    public vb40(int i2) {
        g gVar = new g(0);
        h hVar = new h(0);
        a aVar = new a(0);
        j jVar = new j(0);
        k kVar = new k(0);
        this.a = gVar;
        this.b = hVar;
        this.c = aVar;
        this.d = jVar;
        this.e = kVar;
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lvb40$h;", "", "Companion", "jc40", "kc40", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class h {
        public static final kc40 Companion = new kc40();
        public final f a;
        public final l b;
        public final e c;
        public final e d;
        public final e e;
        public final o f;

        public /* synthetic */ h(int i, f fVar, l lVar, e eVar, e eVar2, e eVar3, o oVar) {
            this.a = (i & 1) == 0 ? new f(0) : fVar;
            if ((i & 2) == 0) {
                this.b = new l(0);
            } else {
                this.b = lVar;
            }
            if ((i & 4) == 0) {
                this.c = new e(0);
            } else {
                this.c = eVar;
            }
            if ((i & 8) == 0) {
                this.d = new e(0);
            } else {
                this.d = eVar2;
            }
            if ((i & 16) == 0) {
                this.e = new e(0);
            } else {
                this.e = eVar3;
            }
            if ((i & 32) == 0) {
                this.f = new o(0);
            } else {
                this.f = oVar;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return jl40.l(this.a, hVar.a) && jl40.l(this.b, hVar.b) && jl40.l(this.c, hVar.c) && jl40.l(this.d, hVar.d) && jl40.l(this.e, hVar.e) && jl40.l(this.f, hVar.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "InfoDto(detailsSection=" + this.a + ", route=" + this.b + ", dateSection=" + this.c + ", fromDate=" + this.d + ", toDate=" + this.e + ", tariffSection=" + this.f + Extension.C_BRAKE;
        }

        public h() {
            this(0);
        }

        public h(int i) {
            f fVar = new f(0);
            l lVar = new l(0);
            e eVar = new e(0);
            e eVar2 = new e(0);
            e eVar3 = new e(0);
            o oVar = new o(0);
            this.a = fVar;
            this.b = lVar;
            this.c = eVar;
            this.d = eVar2;
            this.e = eVar3;
            this.f = oVar;
        }
    }
}
