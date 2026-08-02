package ru.yandex.taxi.masstransit.geopayment.network;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.n;
import defpackage.unr0;
import defpackage.zh8;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/masstransit/geopayment/network/d;", "", "Companion", "a", "ru/yandex/taxi/masstransit/geopayment/network/a", "zh8", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class d {
    public static final zh8 Companion = new zh8();
    public final FormattedText a;
    public final FormattedText b;
    public final a c;

    public /* synthetic */ d(int i, FormattedText formattedText, FormattedText formattedText2, a aVar) {
        this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
        if ((i & 2) == 0) {
            this.b = FormattedText.c;
        } else {
            this.b = formattedText2;
        }
        if ((i & 4) == 0) {
            this.c = new a(0);
        } else {
            this.c = aVar;
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
        return this.c.hashCode() + unr0.c(this.a.a.hashCode() * 31, 31, this.b.a);
    }

    public final String toString() {
        StringBuilder r = n.r("CardItem(title=", this.a, ", subtitle=", this.b, ", trail=");
        r.append(this.c);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/masstransit/geopayment/network/d$a;", "", "Companion", "ru/yandex/taxi/masstransit/geopayment/network/b", "ru/yandex/taxi/masstransit/geopayment/network/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class a {
        public static final c Companion = new c();
        public final String a;
        public final String b;

        public /* synthetic */ a(int i, String str, String str2) {
            this.a = (i & 1) == 0 ? "" : str;
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
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return jl40.l(this.a, aVar.a) && jl40.l(this.b, aVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return unr0.p("VehicleTrail(registrationNumber=", this.a, ", iconTag=", this.b, Extension.C_BRAKE);
        }

        public a(int i) {
            this.a = "";
            this.b = null;
        }

        public a() {
            this(0);
        }
    }

    public d() {
        this(0);
    }

    public d(int i) {
        FormattedText formattedText = FormattedText.c;
        a aVar = new a(0);
        this.a = formattedText;
        this.b = formattedText;
        this.c = aVar;
    }
}
