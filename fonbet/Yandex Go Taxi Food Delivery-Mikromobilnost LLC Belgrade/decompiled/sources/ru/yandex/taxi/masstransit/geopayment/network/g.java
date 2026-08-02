package ru.yandex.taxi.masstransit.geopayment.network;

import defpackage.ah40;
import defpackage.b64;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.xvz;
import defpackage.zj40;
import defpackage.zzs;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/masstransit/geopayment/network/g;", "", "Companion", "a", "yj40", "zj40", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class g {
    public static final zj40 Companion = new zj40();
    public static final i3y[] d = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ah40(4)), null, null};
    public final List a;
    public final String b;
    public final zzs c;

    public /* synthetic */ g(int i, zzs zzsVar, String str, List list) {
        this.a = (i & 1) == 0 ? EmptyList.a : list;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = zzsVar;
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
        return jl40.l(this.a, gVar.a) && jl40.l(this.b, gVar.b) && jl40.l(this.c, gVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        zzs zzsVar = this.c;
        return hashCode2 + (zzsVar != null ? zzsVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder s = xvz.s("MtVehiclesParam(ble=", this.a, ", zoneName=", this.b, ", location=");
        s.append(this.c);
        s.append(Extension.C_BRAKE);
        return s.toString();
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/masstransit/geopayment/network/g$a;", "", "Companion", "ru/yandex/taxi/masstransit/geopayment/network/e", "ru/yandex/taxi/masstransit/geopayment/network/f", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class a {
        public static final f Companion = new f();
        public final String a;
        public final int b;
        public final int c;

        public /* synthetic */ a(int i, int i2, int i3, String str) {
            this.a = (i & 1) == 0 ? "" : str;
            this.b = (i & 2) == 0 ? 0 : i2;
            if ((i & 4) == 0) {
                this.c = 999;
            } else {
                this.c = i3;
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
            return jl40.l(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + oyr.b(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            return oyr.m(this.c, Extension.C_BRAKE, b64.u(this.b, "BleInfo(uuid=", this.a, ", major=", ", minor="));
        }

        public a(String str, int i, int i2) {
            this.a = str;
            this.b = i;
            this.c = i2;
        }

        public a() {
            this("", 0, 999);
        }
    }

    public g(List list, String str, zzs zzsVar) {
        this.a = list;
        this.b = str;
        this.c = zzsVar;
    }

    public g() {
        this(EmptyList.a, null, null);
    }
}
