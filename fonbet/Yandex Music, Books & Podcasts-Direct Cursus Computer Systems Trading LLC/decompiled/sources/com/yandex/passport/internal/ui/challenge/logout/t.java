package com.yandex.passport.internal.ui.challenge.logout;

import defpackage.k5r;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class t {
    public final com.yandex.passport.common.core.f a;
    public final com.yandex.passport.common.ui.a b;
    public final String c;
    public final boolean d;
    public final com.yandex.passport.common.ui.progress.g e;
    public final Map f;

    public t(com.yandex.passport.common.core.f fVar, com.yandex.passport.common.ui.a aVar, String str, boolean z, com.yandex.passport.common.ui.progress.g gVar, Map map) {
        map.getClass();
        this.a = fVar;
        this.b = aVar;
        this.c = str;
        this.d = z;
        this.e = gVar;
        this.f = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.a.equals(tVar.a) && this.b == tVar.b && Intrinsics.d(this.c, tVar.c) && this.d == tVar.d && this.e.equals(tVar.e) && Intrinsics.d(this.f, tVar.f);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return this.f.hashCode() + ((this.e.hashCode() + k5r.e((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogoutProperties(uid=");
        sb.append(this.a);
        sb.append(", theme=");
        sb.append(this.b);
        sb.append(", source=");
        sb.append(this.c);
        sb.append(", canLogoutOnDevice=");
        sb.append(this.d);
        sb.append(", progressProperties=");
        sb.append(this.e);
        sb.append(", headers=");
        return k5r.p(sb, this.f, ')');
    }
}
