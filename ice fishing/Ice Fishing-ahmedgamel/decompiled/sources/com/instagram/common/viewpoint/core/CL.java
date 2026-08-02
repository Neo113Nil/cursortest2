package com.instagram.common.viewpoint.core;

import com.facebook.ads.sync.SyncModifiableBundle;
import java.util.Map;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class CL implements InterfaceC1854gc {
    public final C0838Cb A00;
    public final EnumC1859gh A01;

    public CL(C0838Cb c0838Cb, EnumC1859gh enumC1859gh) {
        this.A00 = c0838Cb;
        this.A01 = enumC1859gh;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1854gc
    public void A4D(Map<InterfaceC1836gK, EnumC1859gh> map, Map<SyncModifiableBundle, EnumC1846gU> map2) {
        map.put(this.A00, this.A01);
    }
}
