package io.appmetrica.analytics.impl;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class C8 {
    public final Map a;
    public final String b;
    public final String c;

    public C8(String str, HashMap hashMap, String str2) {
        this.b = str;
        this.a = hashMap;
        this.c = str2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeferredDeeplinkState{mParameters=");
        sb.append(this.a);
        sb.append(", mDeeplink='");
        sb.append(this.b);
        sb.append("', mUnparsedReferrer='");
        return AbstractC0155bp.a(sb, this.c, "'}");
    }
}
