package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.CommonPulseConfig;
import io.appmetrica.analytics.PulseConfig;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.ri, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0609ri implements Cr {
    public final Context a;
    public final Br b = new Br();

    public C0609ri(@NonNull Context context) {
        this.a = context;
    }

    @Override // io.appmetrica.analytics.impl.Cr
    public final Ar a(@NonNull PulseConfig pulseConfig) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C0752wg("Histogram prefix").a(pulseConfig.histogramPrefix));
        if (!AbstractC0734vr.a((Collection) pulseConfig.processes)) {
            Iterator<String> it = pulseConfig.processes.iterator();
            while (it.hasNext()) {
                arrayList.add(new C0148bi(this.a).a(it.next()));
            }
        }
        if (pulseConfig.channelId != null) {
            arrayList.add(new C0459mc("ChanelId", CollectionUtils.toIntList(CommonPulseConfig.POSSIBLE_CHANNELS)).a(pulseConfig.channelId));
        }
        Br br = this.b;
        br.getClass();
        return br.a((List<Ar>) arrayList);
    }
}
