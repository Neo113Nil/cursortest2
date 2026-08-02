package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.CommonPulseConfig;
import io.appmetrica.analytics.PulseConfig;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class Ii implements Vr {
    public final Context a;
    public final Ur b = new Ur();

    public Ii(Context context) {
        this.a = context;
    }

    @Override // io.appmetrica.analytics.impl.Vr
    public final Tr a(PulseConfig pulseConfig) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Mg("Histogram prefix").a(pulseConfig.histogramPrefix));
        if (!Or.a((Collection) pulseConfig.processes)) {
            Iterator<String> it = pulseConfig.processes.iterator();
            while (it.hasNext()) {
                arrayList.add(new C0712si(this.a).a(it.next()));
            }
        }
        if (pulseConfig.channelId != null) {
            arrayList.add(new Bc("ChannelId", CollectionUtils.toIntList(CommonPulseConfig.POSSIBLE_CHANNELS)).a(pulseConfig.channelId));
        }
        Ur ur = this.b;
        ur.getClass();
        return ur.a((List<Tr>) arrayList);
    }
}
