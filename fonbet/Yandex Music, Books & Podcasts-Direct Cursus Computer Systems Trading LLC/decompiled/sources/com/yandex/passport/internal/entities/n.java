package com.yandex.passport.internal.entities;

import defpackage.k5r;
import defpackage.vz1;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class n {
    public final com.yandex.passport.common.core.f a;
    public final com.yandex.passport.common.core.f b;
    public final a c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final Set h;

    public n(com.yandex.passport.common.core.f fVar, com.yandex.passport.common.core.f fVar2, a aVar, String str, String str2, String str3, String str4, Set set) {
        fVar2.getClass();
        str3.getClass();
        set.getClass();
        this.a = fVar;
        this.b = fVar2;
        this.c = aVar;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.a.equals(nVar.a) && Intrinsics.d(this.b, nVar.b) && this.c == nVar.c && Intrinsics.d(this.d, nVar.d) && Intrinsics.d(this.e, nVar.e) && Intrinsics.d(this.f, nVar.f) && Intrinsics.d(this.g, nVar.g) && Intrinsics.d(this.h, nVar.h);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + com.appsflyer.internal.k.d(this.b, this.a.hashCode() * 31, 31)) * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int c = k5r.c((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f);
        String str3 = this.g;
        return this.h.hashCode() + ((c + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MemberAccount(uid=");
        sb.append(this.a);
        sb.append(", masterUid=");
        sb.append(this.b);
        sb.append(", accountType=");
        sb.append(this.c);
        sb.append(", displayLogin=");
        sb.append(this.d);
        sb.append(", publicName=");
        sb.append(this.e);
        sb.append(", phoneNumber=");
        sb.append(this.f);
        sb.append(", avatarUrl=");
        sb.append(this.g);
        sb.append(", assignedBadges=");
        return vz1.v(sb, this.h, ')');
    }
}
