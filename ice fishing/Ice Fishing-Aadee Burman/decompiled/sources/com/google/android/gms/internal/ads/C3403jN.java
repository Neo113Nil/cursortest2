package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.jN, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3403jN extends AbstractC3189fN {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f31241b = 0;

    static {
        C3351iN.a(Collections.EMPTY_MAP);
    }

    public static C3534lt a(int i) {
        return new C3534lt(i);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3511lN
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Map f() {
        Map map = this.f30246a;
        LinkedHashMap h9 = WC.h(map.size());
        for (Map.Entry entry : map.entrySet()) {
            h9.put(entry.getKey(), ((InterfaceC3511lN) entry.getValue()).f());
        }
        return Collections.unmodifiableMap(h9);
    }
}
