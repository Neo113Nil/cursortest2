package com.yandex.plus.pay.ui.tarifficator.api;

import defpackage.e5b;
import defpackage.f1d;
import defpackage.q5b;
import defpackage.su4;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c {
    public final String a;
    public final List b;
    public final Map c;
    public final Map d;
    public final Set e;

    public c(String str, List list, Map map, e5b e5bVar, q5b q5bVar) {
        map.getClass();
        e5bVar.getClass();
        q5bVar.getClass();
        this.a = str;
        this.b = list;
        this.c = map;
        this.d = e5bVar;
        this.e = q5bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.a, cVar.a) && Intrinsics.d(this.b, cVar.b) && Intrinsics.d(this.c, cVar.c) && Intrinsics.d(this.d, cVar.d) && Intrinsics.d(this.e, cVar.e);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.b;
        return Boolean.hashCode(true) + su4.f(this.e, f1d.b(this.d, f1d.b(this.c, (hashCode + (list != null ? list.hashCode() : 0)) * 961, 31), 31), 31);
    }

    public final String toString() {
        return "PlusTarifficatorPaywallConfiguration(page=" + this.a + ", places=" + this.b + ", targetToFeatures=null, customProperties=" + this.c + ", externalCallerPayload=" + this.d + ", screensToSkip=" + this.e + ", fallbackIfStartFailed=true)";
    }
}
