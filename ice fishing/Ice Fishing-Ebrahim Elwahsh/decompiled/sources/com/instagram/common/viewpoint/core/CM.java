package com.instagram.common.viewpoint.core;

import com.facebook.ads.sync.SyncModifiableBundle;
import java.util.Map;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class CM implements InterfaceC1833gc {
    public final EnumC1825gU A00;
    public final AbstractC05802d A01;

    public CM(AbstractC05802d abstractC05802d, EnumC1825gU enumC1825gU) {
        this.A01 = abstractC05802d;
        this.A00 = enumC1825gU;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1833gc
    public void A4D(Map<InterfaceC1815gK, EnumC1838gh> map, Map<SyncModifiableBundle, EnumC1825gU> map2) {
        map2.put(null, this.A00);
    }
}
