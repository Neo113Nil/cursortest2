package com.yandex.passport.sloth.command;

import defpackage.f1d;
import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c {
    public final com.yandex.passport.common.web.a a;
    public final String b;
    public final Object c;

    public c(com.yandex.passport.common.web.a aVar, String str, Object obj) {
        str.getClass();
        this.a = aVar;
        this.b = str;
        this.c = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.a == cVar.a && Intrinsics.d(this.b, cVar.b) && Intrinsics.d(this.c, cVar.c);
    }

    public final int hashCode() {
        int c = k5r.c(this.a.hashCode() * 31, 31, this.b);
        Object obj = this.c;
        return c + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JsCommand(method=");
        sb.append(this.a);
        sb.append(", requestId=");
        sb.append(this.b);
        sb.append(", data=");
        return f1d.j(sb, this.c, ')');
    }
}
