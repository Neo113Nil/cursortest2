package com.instagram.common.viewpoint.core;

import com.facebook.ads.sync.SyncModifiableBundle;
import java.util.Map;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class CL implements InterfaceC1834gc {
    public final C0818Cb A00;
    public final EnumC1839gh A01;

    public CL(C0818Cb c0818Cb, EnumC1839gh enumC1839gh) {
        this.A00 = c0818Cb;
        this.A01 = enumC1839gh;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1834gc
    public void A4D(Map<InterfaceC1816gK, EnumC1839gh> map, Map<SyncModifiableBundle, EnumC1826gU> map2) {
        map.put(this.A00, this.A01);
    }
}
