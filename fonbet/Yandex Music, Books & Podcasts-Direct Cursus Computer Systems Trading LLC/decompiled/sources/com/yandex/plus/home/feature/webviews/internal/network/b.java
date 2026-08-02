package com.yandex.plus.home.feature.webviews.internal.network;

import defpackage.k5r;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b {
    public final String a;
    public final String b;
    public final Function2 c;

    public b(String str) {
        a aVar = a.a;
        this.a = "Authorization";
        this.b = str;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.a, bVar.a) && Intrinsics.d(this.b, bVar.b) && Intrinsics.d(this.c, bVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        String str = this.b;
        Function2 function2 = this.c;
        String str2 = this.a;
        return "WebViewHeader(key=" + str2 + ", value=" + ((String) function2.invoke(str2, str)) + ')';
    }
}
