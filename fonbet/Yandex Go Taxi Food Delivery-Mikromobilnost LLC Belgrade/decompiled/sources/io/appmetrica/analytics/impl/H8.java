package io.appmetrica.analytics.impl;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public final class H8 {
    public final Map a;
    public final String b;
    public final String c;

    public H8(String str, HashMap hashMap, String str2) {
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
        return AbstractC0748tp.a(sb, this.c, "'}");
    }
}
