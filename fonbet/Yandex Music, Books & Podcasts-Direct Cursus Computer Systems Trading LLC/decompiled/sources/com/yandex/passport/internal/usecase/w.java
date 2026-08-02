package com.yandex.passport.internal.usecase;

import defpackage.c5b;
import defpackage.k5r;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class w {
    public final com.yandex.passport.common.core.g a;
    public final com.yandex.passport.api.o b;
    public final List c;
    public final List d;
    public final com.yandex.passport.common.account.a e;

    public w(com.yandex.passport.common.core.g gVar, com.yandex.passport.api.o oVar, List list, com.yandex.passport.common.account.a aVar) {
        c5b c5bVar = c5b.a;
        gVar.getClass();
        list.getClass();
        c5bVar.getClass();
        this.a = gVar;
        this.b = oVar;
        this.c = list;
        this.d = c5bVar;
        this.e = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Intrinsics.d(this.a, wVar.a) && this.b == wVar.b && this.c.equals(wVar.c) && this.d.equals(wVar.d) && Intrinsics.d(this.e, wVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        com.yandex.passport.api.o oVar = this.b;
        int d = k5r.d(k5r.d((hashCode + (oVar == null ? 0 : oVar.hashCode())) * 31, 31, this.c), 31, this.d);
        com.yandex.passport.common.account.a aVar = this.e;
        return d + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "MegaUserInfo(userInfo=" + this.a + ", passportAccountUpgradeStatus=" + this.b + ", members=" + this.c + ", masterMembers=" + this.d + ", newMasterToken=" + this.e + ')';
    }
}
