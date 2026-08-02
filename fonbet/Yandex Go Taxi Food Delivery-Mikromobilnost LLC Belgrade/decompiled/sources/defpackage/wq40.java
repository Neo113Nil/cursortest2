package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.PlainAddress;

/* loaded from: classes6.dex */
public final class wq40 {
    public final String a;
    public final String b;
    public final PlainAddress c;

    public wq40(PlainAddress plainAddress, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = plainAddress;
    }

    public final Address a() {
        return this.c;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }

    public final zzs d() {
        return this.c.B();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !wq40.class.equals(obj.getClass())) {
            return false;
        }
        wq40 wq40Var = (wq40) obj;
        if (this.a.equals(wq40Var.a)) {
            return this.b.equals(wq40Var.b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return this.b;
    }
}
