package com.yandex.passport.internal.rotation;

import com.appsflyer.internal.k;
import com.yandex.passport.internal.l;
import defpackage.k5r;
import defpackage.tlm;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a {
    public final l a;
    public final com.yandex.passport.common.account.a b;
    public final com.yandex.passport.common.core.b c;
    public final long d;
    public final String e;
    public final com.yandex.passport.common.core.f f;

    public a(l lVar, com.yandex.passport.common.account.a aVar, com.yandex.passport.common.core.b bVar, long j, String str, com.yandex.passport.common.core.f fVar) {
        aVar.getClass();
        bVar.getClass();
        str.getClass();
        this.a = lVar;
        this.b = aVar;
        this.c = bVar;
        this.d = j;
        this.e = str;
        this.f = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.a, aVar.a) && Intrinsics.d(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d && Intrinsics.d(this.e, aVar.e) && this.f.equals(aVar.f);
    }

    public final int hashCode() {
        l lVar = this.a;
        return this.f.hashCode() + k5r.c(tlm.c(this.d, (this.c.hashCode() + ((this.b.hashCode() + ((lVar == null ? 0 : lVar.hashCode()) * 31)) * 31)) * 31, 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(modernAccount=");
        sb.append(this.a);
        sb.append(", badMasterToken=");
        sb.append(this.b);
        sb.append(", environment=");
        sb.append(this.c);
        sb.append(", locationId=");
        sb.append(this.d);
        sb.append(", clientId=");
        sb.append(this.e);
        sb.append(", uid=");
        return k.n(sb, this.f, ')');
    }
}
