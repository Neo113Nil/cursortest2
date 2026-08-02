package com.yandex.passport.internal.autologin;

import com.yandex.passport.api.x;
import defpackage.k5r;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e {
    public final x a;
    public final List b;
    public final boolean c;
    public final com.yandex.passport.common.core.b d;
    public final com.yandex.passport.internal.credentials.f e;

    public e(x xVar, List list, com.yandex.passport.common.core.b bVar, com.yandex.passport.internal.credentials.f fVar, int i) {
        boolean z = (i & 4) != 0;
        fVar = (i & 16) != 0 ? null : fVar;
        xVar.getClass();
        list.getClass();
        bVar.getClass();
        this.a = xVar;
        this.b = list;
        this.c = z;
        this.d = bVar;
        this.e = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.a == eVar.a && Intrinsics.d(this.b, eVar.b) && this.c == eVar.c && this.d == eVar.d && Intrinsics.d(this.e, eVar.e);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + k5r.e(k5r.d(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31;
        com.yandex.passport.internal.credentials.f fVar = this.e;
        return hashCode + (fVar == null ? 0 : fVar.hashCode());
    }

    public final String toString() {
        return "Params(mode=" + this.a + ", modernAccounts=" + this.b + ", searchFresh=" + this.c + ", environment=" + this.d + ", credentials=" + this.e + ')';
    }
}
