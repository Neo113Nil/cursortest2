package com.google.android.gms.internal.ads;

import java.util.Objects;
import w.AbstractC5128c;

/* loaded from: classes2.dex */
public final class ZI extends OG {

    /* renamed from: a, reason: collision with root package name */
    public final C3902sE f29646a;

    /* renamed from: b, reason: collision with root package name */
    public final YI f29647b;

    /* renamed from: c, reason: collision with root package name */
    public final C3579mE f29648c;

    /* renamed from: d, reason: collision with root package name */
    public final C3956tE f29649d;

    public ZI(C3902sE c3902sE, YI yi, C3579mE c3579mE, C3956tE c3956tE) {
        this.f29646a = c3902sE;
        this.f29647b = yi;
        this.f29648c = c3579mE;
        this.f29649d = c3956tE;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3848rE
    public final boolean a() {
        return this.f29649d != C3956tE.f35036y;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ZI)) {
            return false;
        }
        ZI zi = (ZI) obj;
        return zi.f29646a == this.f29646a && zi.f29647b == this.f29647b && zi.f29648c == this.f29648c && zi.f29649d == this.f29649d;
    }

    public final int hashCode() {
        return Objects.hash(ZI.class, this.f29646a, this.f29647b, this.f29648c, this.f29649d);
    }

    public final String toString() {
        String str = this.f29649d.f35038b;
        int length = str.length();
        String str2 = this.f29648c.f32711u;
        int length2 = str2.length();
        String str3 = this.f29646a.f34696b;
        int length3 = str3.length();
        String str4 = this.f29647b.f29444a;
        StringBuilder sb = new StringBuilder(length + 39 + length2 + 12 + length3 + 9 + str4.length() + 1);
        AbstractC5128c.h(sb, "ECDSA Parameters (variant: ", str, ", hashType: ", str2);
        AbstractC5128c.h(sb, ", encoding: ", str3, ", curve: ", str4);
        sb.append(")");
        return sb.toString();
    }
}
