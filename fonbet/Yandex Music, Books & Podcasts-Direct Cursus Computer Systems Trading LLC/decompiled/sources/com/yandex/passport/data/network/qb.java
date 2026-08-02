package com.yandex.passport.data.network;

import defpackage.dfi;

/* loaded from: classes4.dex */
public final class qb {
    public final boolean a;
    public final String b;

    public qb(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qb)) {
            return false;
        }
        qb qbVar = (qb) obj;
        return this.a == qbVar.a && this.b.equals(qbVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ManagingPlusDevicesResult(hasDeviceAdded=");
        sb.append(this.a);
        sb.append(", requestId=");
        return dfi.i(sb, this.b, ')');
    }
}
