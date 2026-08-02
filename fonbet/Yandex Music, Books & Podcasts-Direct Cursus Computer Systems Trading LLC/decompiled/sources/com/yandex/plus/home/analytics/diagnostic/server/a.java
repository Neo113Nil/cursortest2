package com.yandex.plus.home.analytics.diagnostic.server;

import defpackage.k5r;
import defpackage.kkp;
import defpackage.ymb;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {
    public final kkp a;
    public final String b;
    public final ymb c;
    public final String d;
    public final HashMap e;

    public a(kkp kkpVar, String str, ymb ymbVar, String str2, HashMap hashMap) {
        str.getClass();
        this.a = kkpVar;
        this.b = str;
        this.c = ymbVar;
        this.d = str2;
        this.e = hashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a.equals(aVar.a) && Intrinsics.d(this.b, aVar.b) && this.c == aVar.c && this.d.equals(aVar.d) && this.e.equals(aVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + k5r.c((this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
    }

    public final String toString() {
        return "Event(request=" + this.a + ", operationName=" + this.b + ", errorType=" + this.c + ", message=" + this.d + ", additionalParams=" + this.e + ')';
    }
}
