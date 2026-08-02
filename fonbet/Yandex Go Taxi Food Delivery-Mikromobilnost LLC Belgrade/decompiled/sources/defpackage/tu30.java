package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import java.util.List;
import kotlin.collections.a;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes9.dex */
public final class tu30 {
    public final b011 a;
    public final r0 b = bvf0.c(uu30.c);
    public volatile double c;

    public tu30(b011 b011Var) {
        this.a = b011Var;
    }

    public final uu30 a() {
        return (uu30) this.b.getValue();
    }

    public final void b(List list) {
        Object value;
        ZoneAddress zoneAddress;
        Address address;
        r0 r0Var = this.b;
        do {
            value = r0Var.getValue();
            uu30 uu30Var = (uu30) value;
            zoneAddress = uu30Var.a;
            uu30 uu30Var2 = uu30.c;
            uu30Var.getClass();
        } while (!r0Var.k(value, new uu30(zoneAddress, list)));
        Address address2 = (Address) a.b0(list);
        ZoneAddress zoneAddress2 = a().a;
        if (zoneAddress2 == null || (address = zoneAddress2.a) == null) {
            return;
        }
        a011 d = otb1.d(address, Double.valueOf(this.c));
        yz01 c = address2 != null ? otb1.c(address2) : null;
        b011 b011Var = this.a;
        if (c == null) {
            c = new yz01(0);
        }
        b011Var.a(d, c);
    }

    public final void c(ZoneAddress zoneAddress) {
        Object value;
        List list;
        r0 r0Var = this.b;
        do {
            value = r0Var.getValue();
            uu30 uu30Var = (uu30) value;
            list = uu30Var.b;
            uu30Var.getClass();
        } while (!r0Var.k(value, new uu30(zoneAddress, list)));
        if (zoneAddress == null) {
            return;
        }
        a011 d = otb1.d(zoneAddress.a, Double.valueOf(this.c));
        Address address = (Address) a.b0(a().b);
        yz01 c = address != null ? otb1.c(address) : null;
        b011 b011Var = this.a;
        if (c == null) {
            c = new yz01(0);
        }
        b011Var.a(d, c);
        this.c = zoneAddress.a.getRequestTime() != null ? r5.longValue() : 0.0d;
    }
}
