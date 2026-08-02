package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.jN, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3426jN extends AbstractC3212fN {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f32028b = 0;

    static {
        C3374iN.a(Collections.EMPTY_MAP);
    }

    public static C3557lt a(int i) {
        return new C3557lt(i);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3534lN
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Map f() {
        Map map = this.f31033a;
        LinkedHashMap h3 = WC.h(map.size());
        for (Map.Entry entry : map.entrySet()) {
            h3.put(entry.getKey(), ((InterfaceC3534lN) entry.getValue()).f());
        }
        return Collections.unmodifiableMap(h3);
    }
}
