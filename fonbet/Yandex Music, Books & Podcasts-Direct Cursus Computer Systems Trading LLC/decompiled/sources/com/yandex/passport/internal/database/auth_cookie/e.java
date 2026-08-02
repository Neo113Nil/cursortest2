package com.yandex.passport.internal.database.auth_cookie;

import com.yandex.passport.common.core.f;
import com.yandex.passport.data.network.token.i;
import defpackage.dfi;
import defpackage.k5r;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e {
    public static final i d = new i(9);
    public final f a;
    public final List b;
    public final String c;

    public e(f fVar, List list, String str) {
        fVar.getClass();
        list.getClass();
        str.getClass();
        this.a = fVar;
        this.b = list;
        this.c = str;
    }

    public static e a(e eVar, List list) {
        f fVar = eVar.a;
        String str = eVar.c;
        fVar.getClass();
        list.getClass();
        str.getClass();
        return new e(fVar, list, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.a, eVar.a) && Intrinsics.d(this.b, eVar.b) && Intrinsics.d(this.c, eVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthCookieEntity(uid=");
        sb.append(this.a);
        sb.append(", cookies=");
        sb.append(this.b);
        sb.append(", domain=");
        return dfi.i(sb, this.c, ')');
    }
}
