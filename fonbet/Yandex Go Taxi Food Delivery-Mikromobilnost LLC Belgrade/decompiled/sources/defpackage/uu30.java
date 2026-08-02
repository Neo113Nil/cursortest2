package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class uu30 {
    public static final uu30 c = new uu30(null, EmptyList.a);
    public final ZoneAddress a;
    public final List b;

    public uu30(ZoneAddress zoneAddress, List list) {
        this.a = zoneAddress;
        this.b = list;
    }

    public final List a() {
        ZoneAddress zoneAddress = this.a;
        if (zoneAddress == null) {
            return EmptyList.a;
        }
        return a.m0(this.b, Collections.singletonList(zoneAddress.a));
    }

    public final ArrayList b() {
        List a = a();
        ArrayList arrayList = new ArrayList(tcc.n(a, 10));
        Iterator it = a.iterator();
        while (it.hasNext()) {
            arrayList.add(((Address) it.next()).B());
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uu30)) {
            return false;
        }
        uu30 uu30Var = (uu30) obj;
        return jl40.l(this.a, uu30Var.a) && jl40.l(this.b, uu30Var.b);
    }

    public final int hashCode() {
        ZoneAddress zoneAddress = this.a;
        return this.b.hashCode() + ((zoneAddress == null ? 0 : zoneAddress.hashCode()) * 31);
    }

    public final String toString() {
        return "MtRouteAddresses(source=" + this.a + ", destinations=" + this.b + Extension.C_BRAKE;
    }
}
