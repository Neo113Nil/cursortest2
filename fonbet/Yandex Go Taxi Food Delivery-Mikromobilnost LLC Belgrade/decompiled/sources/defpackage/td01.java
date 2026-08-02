package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0006\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Ltd01;", "Lhd90;", "Lc6z;", "Companion", "d", "c", "b", "a", "ud01", "qd01", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class td01 implements hd90, c6z {
    public static final ud01 Companion = new ud01();
    public static final i3y[] g = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new k801(1)), null, null, null, null};
    public final Map b;
    public final boolean c;
    public final d d;
    public final c e;
    public final a f;

    static {
        new td01(0);
    }

    public /* synthetic */ td01(int i, Map map, boolean z, d dVar, c cVar, a aVar) {
        this.b = (i & 1) == 0 ? kotlin.collections.b.f() : map;
        if ((i & 2) == 0) {
            this.c = false;
        } else {
            this.c = z;
        }
        if ((i & 4) == 0) {
            this.d = null;
        } else {
            this.d = dVar;
        }
        if ((i & 8) == 0) {
            this.e = null;
        } else {
            this.e = cVar;
        }
        if ((i & 16) == 0) {
            this.f = null;
        } else {
            this.f = aVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof td01)) {
            return false;
        }
        td01 td01Var = (td01) obj;
        return jl40.l(this.b, td01Var.b) && this.c == td01Var.c && jl40.l(this.d, td01Var.d) && jl40.l(this.e, td01Var.e) && jl40.l(this.f, td01Var.f);
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.b;
    }

    public final int hashCode() {
        int e = unr0.e(this.b.hashCode() * 31, 31, this.c);
        d dVar = this.d;
        int hashCode = (e + (dVar == null ? 0 : dVar.hashCode())) * 31;
        c cVar = this.e;
        int hashCode2 = (hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        a aVar = this.f;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "TrainsFlowConfigDto(l10n=" + this.b + ", enabled=" + this.c + ", summary=" + this.d + ", stationSearch=" + this.e + ", aeroexpressFixes=" + this.f + Extension.C_BRAKE;
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ltd01$b;", "", "Companion", "vd01", "wd01", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class b {
        public static final wd01 Companion = new wd01();
        public final String a;
        public final String b;
        public final String c;

        public /* synthetic */ b(int i, String str, String str2, String str3) {
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
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            return oyr.t(b64.v("StationField(label=", this.a, ", placeholder=", this.b, ", defaultIconTag="), this.c, Extension.C_BRAKE);
        }

        public b() {
            this.a = null;
            this.b = null;
            this.c = null;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ltd01$c;", "", "Companion", "xd01", "yd01", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class c {
        public static final yd01 Companion = new yd01();
        public final b a;
        public final b b;
        public final String c;

        public /* synthetic */ c(int i, b bVar, b bVar2, String str) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = bVar;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = bVar2;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = str;
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
            b bVar = this.a;
            int hashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
            b bVar2 = this.b;
            int hashCode2 = (hashCode + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
            String str = this.c;
            return hashCode2 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("StationSearch(toStation=");
            sb.append(this.a);
            sb.append(", fromStation=");
            sb.append(this.b);
            sb.append(", emptySuggestsMessage=");
            return oyr.t(sb, this.c, Extension.C_BRAKE);
        }

        public c() {
            this.a = null;
            this.b = null;
            this.c = null;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ltd01$a;", "", "Companion", "rd01", "sd01", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class a {
        public static final sd01 Companion = new sd01();
        public static final i3y[] d;
        public final List a;
        public final List b;
        public final boolean c;

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            d = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new k801(2)), kotlin.a.b(lazyThreadSafetyMode, new k801(3)), null};
        }

        public /* synthetic */ a(int i, List list, List list2, boolean z) {
            int i2 = i & 1;
            EmptyList emptyList = EmptyList.a;
            if (i2 == 0) {
                this.a = emptyList;
            } else {
                this.a = list;
            }
            if ((i & 2) == 0) {
                this.b = emptyList;
            } else {
                this.b = list2;
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
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return jl40.l(this.a, aVar.a) && jl40.l(this.b, aVar.b) && this.c == aVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + unr0.c(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return x4e.i(qv10.v("AeroexpressFixes(busesId=", this.a, ", destinationsId=", this.b, ", shouldUseLegacyFlow="), this.c, Extension.C_BRAKE);
        }

        public a() {
            EmptyList emptyList = EmptyList.a;
            this.a = emptyList;
            this.b = emptyList;
            this.c = false;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ltd01$d;", "", "Companion", "zd01", "ae01", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class d {
        public static final ae01 Companion = new ae01();
        public final String a;
        public final FormattedText b;
        public final FormattedText c;

        public /* synthetic */ d(int i, String str, FormattedText formattedText, FormattedText formattedText2) {
            this.a = (i & 1) == 0 ? null : str;
            int i2 = 0;
            if ((i & 2) == 0) {
                this.b = new FormattedText(i2);
            } else {
                this.b = formattedText;
            }
            if ((i & 4) == 0) {
                this.c = new FormattedText(i2);
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
            String str = this.a;
            return this.c.a.hashCode() + unr0.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b.a);
        }

        public final String toString() {
            return tse0.m(xvz.q("Summary(deeplink=", this.a, ", ticketsButtonTitle=", ", scheduleButtonTitle=", this.b), this.c, Extension.C_BRAKE);
        }

        public d() {
            int i = 0;
            FormattedText formattedText = new FormattedText(i);
            FormattedText formattedText2 = new FormattedText(i);
            this.a = null;
            this.b = formattedText;
            this.c = formattedText2;
        }
    }

    public td01() {
        this(0);
    }

    public td01(int i) {
        this.b = kotlin.collections.b.f();
        this.c = false;
        this.d = null;
        this.e = null;
        this.f = null;
    }
}
