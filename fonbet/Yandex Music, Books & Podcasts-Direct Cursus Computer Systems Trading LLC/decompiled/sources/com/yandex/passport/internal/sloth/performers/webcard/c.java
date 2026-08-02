package com.yandex.passport.internal.sloth.performers.webcard;

import defpackage.r7o;
import defpackage.z7o;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c implements f {
    public final Object a;

    public c(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        Object obj2 = ((c) obj).a;
        r7o r7oVar = z7o.b;
        return Intrinsics.d(this.a, obj2);
    }

    public final int hashCode() {
        r7o r7oVar = z7o.b;
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "BeginChangePassword(result=" + ((Object) z7o.b(this.a)) + ')';
    }
}
