package io.appmetrica.analytics.impl;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class J7 {

    /* renamed from: a, reason: collision with root package name */
    public final Map f4579a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4580b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4581c;

    public J7(String str, HashMap hashMap, String str2) {
        this.f4580b = str;
        this.f4579a = hashMap;
        this.f4581c = str2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeferredDeeplinkState{mParameters=");
        sb.append(this.f4579a);
        sb.append(", mDeeplink='");
        sb.append(this.f4580b);
        sb.append("', mUnparsedReferrer='");
        return C1.a.k(sb, this.f4581c, "'}");
    }
}
