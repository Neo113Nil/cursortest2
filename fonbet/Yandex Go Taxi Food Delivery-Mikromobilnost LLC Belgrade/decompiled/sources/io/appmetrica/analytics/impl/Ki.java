package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.CommonPulseConfig;
import io.appmetrica.analytics.PulseLibraryConfig;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public final class Ki implements Vr {
    public final Ur a = new Ur();

    @Override // io.appmetrica.analytics.impl.Vr
    public final Tr a(PulseLibraryConfig pulseLibraryConfig) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Mg("Histogram prefix").a(pulseLibraryConfig.histogramPrefix));
        arrayList.add(new Mg("Library package").a(pulseLibraryConfig.libPackage));
        if (pulseLibraryConfig.channelId != null) {
            arrayList.add(new Bc("ChannelId", CollectionUtils.toIntList(CommonPulseConfig.POSSIBLE_CHANNELS)).a(pulseLibraryConfig.channelId));
        }
        Ur ur = this.a;
        ur.getClass();
        return ur.a((List<Tr>) arrayList);
    }
}
