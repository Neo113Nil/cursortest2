package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Gj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2574Gj implements InterfaceC2591Hj {

    /* renamed from: a, reason: collision with root package name */
    public final Map f25101a;

    public C2574Gj(Map map) {
        this.f25101a = map;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2591Hj
    public final InterfaceC3317hq a(int i, String str) {
        return (InterfaceC3317hq) this.f25101a.get(str);
    }
}
