package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Gj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2594Gj implements InterfaceC2611Hj {

    /* renamed from: a, reason: collision with root package name */
    public final Map f25888a;

    public C2594Gj(Map map) {
        this.f25888a = map;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2611Hj
    public final InterfaceC3340hq a(int i, String str) {
        return (InterfaceC3340hq) this.f25888a.get(str);
    }
}
