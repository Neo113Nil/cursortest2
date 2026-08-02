package io.appmetrica.analytics.rtm.impl;

import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreutils.internal.services.frequency.EventFrequencyStorage;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class k implements EventFrequencyStorage {
    public final IBinaryDataHelper a;
    public final long b;
    public final String c;
    public final n d = new n();
    public final j e = new j();
    public final SystemTimeProvider f = new SystemTimeProvider();
    public HashMap g;

    public k(IBinaryDataHelper iBinaryDataHelper, String str, long j) {
        this.a = iBinaryDataHelper;
        this.b = j;
        str.isEmpty();
        this.c = str.isEmpty() ? "rtm_event_occurrence" : "rtm_event_occurrence_".concat(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map a() {
        p pVar;
        boolean z;
        long uptimeMillis = this.f.uptimeMillis();
        if (this.g == null) {
            this.g = new HashMap();
            n nVar = this.d;
            byte[] bArr = this.a.get(this.c);
            if (bArr.length != 0) {
                pVar = this.e.toState(bArr);
                z = false;
                for (l lVar : nVar.toModel(pVar).a) {
                    long j = uptimeMillis - lVar.b;
                    if (j <= 0 || j >= this.b) {
                        z = true;
                    } else {
                        this.g.put(lVar.a, lVar);
                    }
                }
                if (z) {
                    a(this.g);
                }
            }
            this.e.getClass();
            pVar = new p();
            z = false;
            while (r2.hasNext()) {
            }
            if (z) {
            }
        }
        return this.g;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.services.frequency.EventFrequencyStorage
    public final Integer getWindowOccurrencesCount(String str) {
        l lVar = (l) a().get(str);
        if (lVar == null) {
            return null;
        }
        return Integer.valueOf(lVar.c);
    }

    @Override // io.appmetrica.analytics.coreutils.internal.services.frequency.EventFrequencyStorage
    public final Long getWindowStart(String str) {
        l lVar = (l) a().get(str);
        if (lVar == null) {
            return null;
        }
        return Long.valueOf(lVar.b);
    }

    @Override // io.appmetrica.analytics.coreutils.internal.services.frequency.EventFrequencyStorage
    public final void putWindowOccurrencesCount(String str, int i) {
        HashMap hashMap = (HashMap) a();
        l lVar = (l) hashMap.get(str);
        if (lVar == null) {
            lVar = new l(str, 0L, 0);
            hashMap.put(str, lVar);
        }
        lVar.c = i;
        a(hashMap);
    }

    @Override // io.appmetrica.analytics.coreutils.internal.services.frequency.EventFrequencyStorage
    public final void putWindowStart(String str, long j) {
        HashMap hashMap = (HashMap) a();
        l lVar = (l) hashMap.get(str);
        if (lVar == null) {
            lVar = new l(str, 0L, 0);
            hashMap.put(str, lVar);
        }
        lVar.b = j;
        a(hashMap);
    }

    public final void a(Map map) {
        IBinaryDataHelper iBinaryDataHelper = this.a;
        String str = this.c;
        j jVar = this.e;
        p fromModel = this.d.fromModel(new m(new ArrayList(map.values())));
        jVar.getClass();
        iBinaryDataHelper.insert(str, MessageNano.toByteArray(fromModel));
    }
}
