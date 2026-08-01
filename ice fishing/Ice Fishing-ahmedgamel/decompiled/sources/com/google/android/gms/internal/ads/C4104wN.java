package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.wN, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4104wN {

    /* renamed from: b, reason: collision with root package name */
    public static final C4104wN f34830b = new C4104wN(new HashMap());

    /* renamed from: a, reason: collision with root package name */
    public final Map f34831a;

    public /* synthetic */ C4104wN(HashMap hashMap) {
        this.f34831a = Collections.unmodifiableMap(hashMap);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4104wN) {
            return this.f34831a.equals(((C4104wN) obj).f34831a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f34831a.hashCode();
    }
}
