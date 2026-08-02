package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class fba {
    public final LinkedHashMap a;

    public fba(Map map) {
        map.getClass();
        this.a = new LinkedHashMap(map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fba) && Intrinsics.d(this.a, ((fba) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        LinkedHashMap linkedHashMap = this.a;
        int size = linkedHashMap.size();
        Set entrySet = linkedHashMap.entrySet();
        entrySet.getClass();
        Map.Entry entry = (Map.Entry) CollectionsKt.R(entrySet);
        gba gbaVar = entry != null ? (gba) entry.getValue() : null;
        return "DownloadQueue.State(queue.size()=" + size + ", pendingTrack=" + (gbaVar != null ? gbaVar.a : null) + ")";
    }
}
