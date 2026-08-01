package com.instagram.common.viewpoint.core;

import com.facebook.ads.sync.SyncModifiableBundle;
import java.util.Map;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class CM implements InterfaceC1834gc {
    public final EnumC1826gU A00;
    public final AbstractC05812d A01;

    public CM(AbstractC05812d abstractC05812d, EnumC1826gU enumC1826gU) {
        this.A01 = abstractC05812d;
        this.A00 = enumC1826gU;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1834gc
    public void A4D(Map<InterfaceC1816gK, EnumC1839gh> map, Map<SyncModifiableBundle, EnumC1826gU> map2) {
        map2.put(null, this.A00);
    }
}
