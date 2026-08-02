package androidx.work.impl;

import androidx.work.impl.model.WorkGenerationalId;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class StartStopTokensImpl {
    public final LinkedHashMap runs;

    public StartStopTokensImpl(int i) {
        switch (i) {
            case 1:
                this.runs = new LinkedHashMap();
                break;
            case 2:
                this.runs = new LinkedHashMap();
                break;
            default:
                this.runs = new LinkedHashMap();
                break;
        }
    }

    public List remove(String str) {
        str.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = this.runs;
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            if (Intrinsics.areEqual(((WorkGenerationalId) entry.getKey()).workSpecId, str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            linkedHashMap2.remove((WorkGenerationalId) it.next());
        }
        return CollectionsKt.toList(linkedHashMap.values());
    }

    public StartStopToken tokenFor(WorkGenerationalId workGenerationalId) {
        LinkedHashMap linkedHashMap = this.runs;
        Object obj = linkedHashMap.get(workGenerationalId);
        if (obj == null) {
            obj = new StartStopToken(workGenerationalId);
            linkedHashMap.put(workGenerationalId, obj);
        }
        return (StartStopToken) obj;
    }

    public StartStopToken remove(WorkGenerationalId workGenerationalId) {
        workGenerationalId.getClass();
        return (StartStopToken) this.runs.remove(workGenerationalId);
    }
}
