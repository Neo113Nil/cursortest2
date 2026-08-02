package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.CommonPulseConfig;
import io.appmetrica.analytics.PulseLibraryConfig;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.ti, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0667ti implements Cr {
    public final Br a = new Br();

    @Override // io.appmetrica.analytics.impl.Cr
    public final Ar a(@NonNull PulseLibraryConfig pulseLibraryConfig) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C0752wg("Histogram prefix").a(pulseLibraryConfig.histogramPrefix));
        arrayList.add(new C0752wg("Library package").a(pulseLibraryConfig.libPackage));
        if (pulseLibraryConfig.channelId != null) {
            arrayList.add(new C0459mc("ChanelId", CollectionUtils.toIntList(CommonPulseConfig.POSSIBLE_CHANNELS)).a(pulseLibraryConfig.channelId));
        }
        Br br = this.a;
        br.getClass();
        return br.a((List<Ar>) arrayList);
    }
}
