package com.yandex.passport.data.models;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c {
    public final com.yandex.passport.common.account.a a;
    public final w b;
    public final e c;

    public c(com.yandex.passport.common.account.a aVar, w wVar, e eVar) {
        wVar.getClass();
        this.a = aVar;
        this.b = wVar;
        this.c = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.a.equals(cVar.a) && Intrinsics.d(this.b, cVar.b) && Intrinsics.d(this.c, cVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        e eVar = this.c;
        return hashCode + (eVar == null ? 0 : eVar.hashCode());
    }

    public final String toString() {
        return "AuthorizationResultData(masterToken=" + this.a + ", userInfo=" + this.b + ", clientToken=" + this.c + ')';
    }
}
