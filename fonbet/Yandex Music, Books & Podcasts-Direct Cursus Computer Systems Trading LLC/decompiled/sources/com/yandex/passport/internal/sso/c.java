package com.yandex.passport.internal.sso;

import defpackage.xz0;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c {
    public static final Set c = xz0.Y(new String[]{"name", "uid", "user-info-body"});
    public final b a;
    public final com.yandex.passport.internal.b b;

    public c(b bVar, com.yandex.passport.internal.b bVar2) {
        bVar.getClass();
        this.a = bVar;
        this.b = bVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.a, cVar.a) && Intrinsics.d(this.b, cVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        com.yandex.passport.internal.b bVar = this.b;
        return hashCode + (bVar == null ? 0 : bVar.hashCode());
    }

    public final String toString() {
        return "SsoAccount(accountAction=" + this.a + ", accountRow=" + this.b + ')';
    }
}
