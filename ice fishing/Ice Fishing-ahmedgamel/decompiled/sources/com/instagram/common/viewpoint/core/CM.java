package com.instagram.common.viewpoint.core;

import com.facebook.ads.sync.SyncModifiableBundle;
import java.util.Map;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class CM implements InterfaceC1854gc {
    public final EnumC1846gU A00;
    public final AbstractC06012d A01;

    public CM(AbstractC06012d abstractC06012d, EnumC1846gU enumC1846gU) {
        this.A01 = abstractC06012d;
        this.A00 = enumC1846gU;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1854gc
    public void A4D(Map<InterfaceC1836gK, EnumC1859gh> map, Map<SyncModifiableBundle, EnumC1846gU> map2) {
        map2.put(null, this.A00);
    }
}
