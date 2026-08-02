package com.yandex.passport.internal.ui.sloth.plusdevices;

import defpackage.dfi;
import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l {
    public final com.yandex.passport.common.core.f a;
    public final com.yandex.passport.common.ui.a b;
    public final String c;
    public final String d;
    public final boolean e;

    public l(com.yandex.passport.common.core.f fVar, com.yandex.passport.common.ui.a aVar, String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.a = fVar;
        this.b = aVar;
        this.c = str;
        this.d = str2;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.a.equals(lVar.a) && this.b == lVar.b && Intrinsics.d(this.c, lVar.c) && Intrinsics.d(this.d, lVar.d) && this.e == lVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + k5r.c(k5r.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ManagingPlusDevicesProperties(uid=");
        sb.append(this.a);
        sb.append(", theme=");
        sb.append(this.b);
        sb.append(", service=");
        sb.append(this.c);
        sb.append(", brand=");
        sb.append(this.d);
        sb.append(", isForceShowManagingPlusDevices=");
        return dfi.j(sb, this.e, ')');
    }
}
