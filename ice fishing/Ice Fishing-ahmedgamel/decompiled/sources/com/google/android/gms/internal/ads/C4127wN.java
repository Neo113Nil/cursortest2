package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.wN, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4127wN {

    /* renamed from: b, reason: collision with root package name */
    public static final C4127wN f35599b = new C4127wN(new HashMap());

    /* renamed from: a, reason: collision with root package name */
    public final Map f35600a;

    public /* synthetic */ C4127wN(HashMap hashMap) {
        this.f35600a = Collections.unmodifiableMap(hashMap);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4127wN) {
            return this.f35600a.equals(((C4127wN) obj).f35600a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f35600a.hashCode();
    }
}
