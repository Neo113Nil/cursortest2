package com.yandex.passport.data.models;

import defpackage.dfi;
import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class n {
    public final String a;
    public final boolean b;
    public final boolean c;

    public n(String str, boolean z, boolean z2) {
        str.getClass();
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.d(this.a, nVar.a) && this.b == nVar.b && this.c == nVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + k5r.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhoneNumberValidationResult(formattedPhoneNumber=");
        sb.append(this.a);
        sb.append(", validForCall=");
        sb.append(this.b);
        sb.append(", validForFlashCall=");
        return dfi.j(sb, this.c, ')');
    }
}
