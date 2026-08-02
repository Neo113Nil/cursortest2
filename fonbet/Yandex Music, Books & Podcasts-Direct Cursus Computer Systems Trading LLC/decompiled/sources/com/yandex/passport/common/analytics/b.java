package com.yandex.passport.common.analytics;

import defpackage.ouj;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b {
    public final String a;
    public final String b;

    public b(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        boolean d;
        boolean d2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        String str = bVar.a;
        String str2 = this.a;
        if (str2 == null) {
            if (str == null) {
                d = true;
            }
            d = false;
        } else {
            if (str != null) {
                d = Intrinsics.d(str2, str);
            }
            d = false;
        }
        if (!d) {
            return false;
        }
        String str3 = bVar.b;
        String str4 = this.b;
        if (str4 == null) {
            if (str3 == null) {
                d2 = true;
            }
            d2 = false;
        } else {
            if (str3 != null) {
                d2 = Intrinsics.d(str4, str3);
            }
            d2 = false;
        }
        return d2;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnalyticalIdentifiers(deviceId=");
        String str = this.a;
        sb.append((Object) (str == null ? "null" : ouj.k(')', "DeviceId(value=", str)));
        sb.append(", uuid=");
        String str2 = this.b;
        sb.append((Object) (str2 != null ? ouj.k(')', "Uuid(value=", str2) : "null"));
        sb.append(')');
        return sb.toString();
    }
}
