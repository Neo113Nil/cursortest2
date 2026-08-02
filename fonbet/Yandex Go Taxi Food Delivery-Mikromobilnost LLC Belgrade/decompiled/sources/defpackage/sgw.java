package defpackage;

import com.yandex.go.address.models.Address;

/* loaded from: classes14.dex */
public final class sgw extends tgw implements pgw {
    public final Address a;
    public final double b;
    public final double c;

    public sgw(Address address) {
        this.a = address;
        this.b = address.B().a;
        this.c = address.B().b;
    }

    @Override // defpackage.pgw
    public final double a() {
        return this.b;
    }

    @Override // defpackage.pgw
    public final double b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof sgw)) {
            return false;
        }
        Address address = this.a;
        zzs B = address.B();
        Address address2 = ((sgw) obj).a;
        return jl40.l(B, address2.B()) && jl40.l(address.D1(), address2.D1());
    }

    public final int hashCode() {
        Address address = this.a;
        return address.B().hashCode() + (address.D1().hashCode() * 31);
    }
}
