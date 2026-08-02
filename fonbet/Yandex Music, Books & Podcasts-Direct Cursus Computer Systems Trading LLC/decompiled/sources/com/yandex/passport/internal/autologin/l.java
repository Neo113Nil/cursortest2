package com.yandex.passport.internal.autologin;

import defpackage.dfi;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l {
    public final List a;
    public final com.yandex.passport.common.core.b b;
    public final String c;

    public l(List list, com.yandex.passport.common.core.b bVar, String str) {
        list.getClass();
        bVar.getClass();
        this.a = list;
        this.b = bVar;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.d(this.a, lVar.a) && this.b == lVar.b && Intrinsics.d(this.c, lVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(modernAccounts=");
        sb.append(this.a);
        sb.append(", environment=");
        sb.append(this.b);
        sb.append(", clientId=");
        return dfi.i(sb, this.c, ')');
    }
}
