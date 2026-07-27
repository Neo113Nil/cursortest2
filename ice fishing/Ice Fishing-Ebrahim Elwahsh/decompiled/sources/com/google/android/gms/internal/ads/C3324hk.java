package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.hk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3324hk implements InterfaceC2608Ik, InterfaceC2523Dk {

    /* renamed from: n, reason: collision with root package name */
    public final Ut f31253n;

    public C3324hk(Ut ut) {
        this.f31253n = ut;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2523Dk
    public final void b(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2608Ik
    public final void e() {
        C3640ne c3640ne = this.f31253n.f28146d0;
        if (c3640ne == null || !c3640ne.f32869a) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        String str = c3640ne.f32870b;
        if (str.isEmpty()) {
            return;
        }
        arrayList.add(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2523Dk
    public final void o(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2523Dk
    public final void q(Context context) {
    }
}
