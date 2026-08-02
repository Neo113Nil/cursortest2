package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class how {
    public final List a;
    public final List b;
    public final gow c;
    public final gow d;

    public how(List list, List list2, gow gowVar, gow gowVar2) {
        list.getClass();
        list2.getClass();
        this.a = list;
        this.b = list2;
        this.c = gowVar;
        this.d = gowVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof how)) {
            return false;
        }
        how howVar = (how) obj;
        return Intrinsics.d(this.a, howVar.a) && Intrinsics.d(this.b, howVar.b) && Intrinsics.d(this.c, howVar.c) && this.d.equals(howVar.d);
    }

    public final int hashCode() {
        int d = k5r.d(this.a.hashCode() * 31, 31, this.b);
        gow gowVar = this.c;
        return this.d.hashCode() + ((d + (gowVar == null ? 0 : gowVar.hashCode())) * 31);
    }

    public final String toString() {
        return "YnisonRemoteDevicesState(onlineDevices=" + this.a + ", offlineDevices=" + this.b + ", activeDevice=" + this.c + ", currentDevice=" + this.d + ")";
    }
}
