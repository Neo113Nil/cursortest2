package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lqs30;", "Lhd90;", "Lc6z;", "Companion", "f", "d", "c", "e", "a", "b", "g", "h", "rs30", "ns30", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class qs30 implements hd90, c6z {
    public static final rs30 Companion = new rs30();
    public static final i3y[] f = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new um20(25)), null, null, null};
    public final Map b;
    public final boolean c;
    public final f d;
    public final d e;

    static {
        new qs30(0);
    }

    public /* synthetic */ qs30(int i, Map map, boolean z, f fVar, d dVar) {
        this.b = (i & 1) == 0 ? kotlin.collections.b.f() : map;
        if ((i & 2) == 0) {
            this.c = false;
        } else {
            this.c = z;
        }
        if ((i & 4) == 0) {
            this.d = null;
        } else {
            this.d = fVar;
        }
        if ((i & 8) == 0) {
            this.e = null;
        } else {
            this.e = dVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qs30)) {
            return false;
        }
        qs30 qs30Var = (qs30) obj;
        return jl40.l(this.b, qs30Var.b) && this.c == qs30Var.c && jl40.l(this.d, qs30Var.d) && jl40.l(this.e, qs30Var.e);
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.b;
    }

    public final int hashCode() {
        int e2 = unr0.e(this.b.hashCode() * 31, 31, this.c);
        f fVar = this.d;
        int hashCode = (e2 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        d dVar = this.e;
        return hashCode + (dVar != null ? dVar.hashCode() : 0);
    }

    public final String toString() {
        return "MtPurchaseAvailabilityConfigDto(l10n=" + this.b + ", enabled=" + this.c + ", spareButton=" + this.d + ", paymentButtons=" + this.e + Extension.C_BRAKE;
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lqs30$c;", "", "Companion", "us30", "vs30", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class c {
        public static final vs30 Companion = new vs30();
        public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new um20(26)), null};
        public final List a;
        public final String b;

        public /* synthetic */ c(int i, List list, String str) {
            this.a = (i & 1) == 0 ? EmptyList.a : list;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str;
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
            return jl40.l(this.a, cVar.a) && jl40.l(this.b, cVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return xvz.i("PayButtonDto(showPolicy=", ", multiScenariosTitle=", this.b, Extension.C_BRAKE, this.a);
        }

        public c() {
            this.a = EmptyList.a;
            this.b = null;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lqs30$b;", "", "Companion", "ss30", "ts30", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class b {
        public static final ts30 Companion = new ts30();
        public final String a;
        public final String b;

        public /* synthetic */ b(int i, String str, String str2) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
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
            return jl40.l(this.a, bVar.a) && jl40.l(this.b, bVar.b);
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return unr0.p("IconBackgroundColorDto(light=", this.a, ", dark=", this.b, Extension.C_BRAKE);
        }

        public b() {
            this.a = null;
            this.b = null;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lqs30$d;", "", "Companion", "ws30", "xs30", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class d {
        public static final xs30 Companion = new xs30();
        public final c a;
        public final g b;

        public /* synthetic */ d(int i, c cVar, g gVar) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = cVar;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = gVar;
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
            return jl40.l(this.a, dVar.a) && jl40.l(this.b, dVar.b);
        }

        public final int hashCode() {
            c cVar = this.a;
            int hashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
            g gVar = this.b;
            return hashCode + (gVar != null ? gVar.hashCode() : 0);
        }

        public final String toString() {
            return "PaymentButtonsDto(payButton=" + this.a + ", ticketButton=" + this.b + Extension.C_BRAKE;
        }

        public d() {
            this.a = null;
            this.b = null;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lqs30$f;", "", "Companion", "at30", "bt30", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class f {
        public static final bt30 Companion = new bt30();
        public final String a;
        public final String b;

        public /* synthetic */ f(int i, String str, String str2) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
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
            return jl40.l(this.a, fVar.a) && jl40.l(this.b, fVar.b);
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return unr0.p("SpareButtonDto(deeplink=", this.a, ", iconTag=", this.b, Extension.C_BRAKE);
        }

        public f() {
            this.a = null;
            this.b = null;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lqs30$h;", "", "Companion", "et30", "ft30", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class h {
        public static final ft30 Companion = new ft30();
        public final String a;
        public final String b;

        public /* synthetic */ h(int i, String str, String str2) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
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
            return jl40.l(this.a, hVar.a) && jl40.l(this.b, hVar.b);
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return unr0.p("TicketDeepLinksDto(single=", this.a, ", history=", this.b, Extension.C_BRAKE);
        }

        public h() {
            this.a = null;
            this.b = null;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lqs30$g;", "", "Companion", "ct30", "dt30", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class g {
        public static final dt30 Companion = new dt30();
        public final String a;
        public final h b;
        public final boolean c;

        public /* synthetic */ g(int i, String str, h hVar, boolean z) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = hVar;
            }
            if ((i & 4) == 0) {
                this.c = false;
            } else {
                this.c = z;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return jl40.l(this.a, gVar.a) && jl40.l(this.b, gVar.b) && this.c == gVar.c;
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            h hVar = this.b;
            return Boolean.hashCode(this.c) + ((hashCode + (hVar != null ? hVar.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TicketButtonDto(title=");
            sb.append(this.a);
            sb.append(", deeplinks=");
            sb.append(this.b);
            sb.append(", showForDefaultScenario=");
            return x4e.i(sb, this.c, Extension.C_BRAKE);
        }

        public g() {
            this.a = null;
            this.b = null;
            this.c = false;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lqs30$e;", "", "Companion", "ys30", "zs30", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class e {
        public static final zs30 Companion = new zs30();
        public static final i3y[] d = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new um20(27))};
        public final a a;
        public final String b;
        public final List c;

        public /* synthetic */ e(int i, a aVar, String str, List list) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = aVar;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str;
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
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return jl40.l(this.a, eVar.a) && jl40.l(this.b, eVar.b) && jl40.l(this.c, eVar.c);
        }

        public final int hashCode() {
            a aVar = this.a;
            int hashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
            String str = this.b;
            return this.c.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ShowPolicyDto(content=");
            sb.append(this.a);
            sb.append(", deeplink=");
            sb.append(this.b);
            sb.append(", allowedScenario=");
            return ly3.s(sb, this.c, Extension.C_BRAKE);
        }

        public e() {
            this.a = null;
            this.b = null;
            this.c = EmptyList.a;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lqs30$a;", "", "Companion", "os30", "ps30", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class a {
        public static final ps30 Companion = new ps30();
        public final String a;
        public final String b;
        public final String c;
        public final b d;

        public /* synthetic */ a(int i, String str, String str2, String str3, b bVar) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = str3;
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
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return jl40.l(this.a, aVar.a) && jl40.l(this.b, aVar.b) && jl40.l(this.c, aVar.c) && jl40.l(this.d, aVar.d);
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            b bVar = this.d;
            return hashCode3 + (bVar != null ? bVar.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder v = b64.v("ButtonContentDto(iconTag=", this.a, ", defaultTitle=", this.b, ", scenarioTitle=");
            v.append(this.c);
            v.append(", iconBackgroundColor=");
            v.append(this.d);
            v.append(Extension.C_BRAKE);
            return v.toString();
        }

        public a() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
        }
    }

    public qs30() {
        this(0);
    }

    public qs30(int i) {
        this.b = kotlin.collections.b.f();
        this.c = false;
        this.d = null;
        this.e = null;
    }
}
