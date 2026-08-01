package com.google.android.datatransport;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.BufferedWriter;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowVersionControlComponent implements WinterFlowQueueHandler, WinterFlowObjectArray {
    public final Map WinterFlowArrayNetwork;
    public final Map WinterFlowCacheManagerAgent;
    public final JsonWriter WinterFlowHookDataSource;
    public final boolean WinterFlowRouterStructure = true;
    public final boolean WinterFlowTransactionManagerStrategy;
    public final WinterFlowResponseSubsystem WinterFlowVariableVersionControl;

    public WinterFlowVersionControlComponent(BufferedWriter bufferedWriter, HashMap hashMap, HashMap hashMap2, WinterFlowLibraryParser winterFlowLibraryParser, boolean z) {
        this.WinterFlowHookDataSource = new JsonWriter(bufferedWriter);
        this.WinterFlowCacheManagerAgent = hashMap;
        this.WinterFlowArrayNetwork = hashMap2;
        this.WinterFlowVariableVersionControl = winterFlowLibraryParser;
        this.WinterFlowTransactionManagerStrategy = z;
    }

    @Override // com.google.android.datatransport.WinterFlowQueueHandler
    public final WinterFlowQueueHandler WinterFlowArrayNetwork(WinterFlowAlgorithmHelper winterFlowAlgorithmHelper, long j) {
        String str = winterFlowAlgorithmHelper.WinterFlowRouterStructure;
        WinterFlowRouterRouter();
        JsonWriter jsonWriter = this.WinterFlowHookDataSource;
        jsonWriter.name(str);
        WinterFlowRouterRouter();
        jsonWriter.value(j);
        return this;
    }

    @Override // com.google.android.datatransport.WinterFlowObjectArray
    public final WinterFlowObjectArray WinterFlowCacheManagerAgent(boolean z) {
        WinterFlowRouterRouter();
        this.WinterFlowHookDataSource.value(z);
        return this;
    }

    @Override // com.google.android.datatransport.WinterFlowObjectArray
    public final WinterFlowObjectArray WinterFlowHookDataSource(String str) {
        WinterFlowRouterRouter();
        this.WinterFlowHookDataSource.value(str);
        return this;
    }

    public final void WinterFlowRouterRouter() {
        if (this.WinterFlowRouterStructure) {
            return;
        }
        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Parent context used since this context was created. Cannot use this context anymore.");
    }

    @Override // com.google.android.datatransport.WinterFlowQueueHandler
    public final WinterFlowQueueHandler WinterFlowRouterStructure(WinterFlowAlgorithmHelper winterFlowAlgorithmHelper, Object obj) {
        WinterFlowUnitTestResponse(obj, winterFlowAlgorithmHelper.WinterFlowRouterStructure);
        return this;
    }

    public final WinterFlowVersionControlComponent WinterFlowTransactionManagerStrategy(Object obj) {
        JsonWriter jsonWriter = this.WinterFlowHookDataSource;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                jsonWriter.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    WinterFlowTransactionManagerStrategy(it.next());
                }
                jsonWriter.endArray();
                return this;
            }
            if (obj instanceof Map) {
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        WinterFlowUnitTestResponse(entry.getValue(), (String) key);
                    } catch (ClassCastException e) {
                        throw new WinterFlowArrayManager(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                    }
                }
                jsonWriter.endObject();
                return this;
            }
            WinterFlowResponseSubsystem winterFlowResponseSubsystem = (WinterFlowResponseSubsystem) this.WinterFlowCacheManagerAgent.get(obj.getClass());
            if (winterFlowResponseSubsystem != null) {
                jsonWriter.beginObject();
                winterFlowResponseSubsystem.WinterFlowRouterStructure(obj, this);
                jsonWriter.endObject();
                return this;
            }
            WinterFlowEventLayer winterFlowEventLayer = (WinterFlowEventLayer) this.WinterFlowArrayNetwork.get(obj.getClass());
            if (winterFlowEventLayer != null) {
                winterFlowEventLayer.WinterFlowRouterStructure(obj, this);
                return this;
            }
            if (obj instanceof Enum) {
                String name = ((Enum) obj).name();
                WinterFlowRouterRouter();
                jsonWriter.value(name);
                return this;
            }
            jsonWriter.beginObject();
            this.WinterFlowVariableVersionControl.WinterFlowRouterStructure(obj, this);
            jsonWriter.endObject();
            return this;
        }
        if (obj instanceof byte[]) {
            WinterFlowRouterRouter();
            jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
            return this;
        }
        jsonWriter.beginArray();
        int i = 0;
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i < length) {
                jsonWriter.value(r6[i]);
                i++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i < length2) {
                long j = jArr[i];
                WinterFlowRouterRouter();
                jsonWriter.value(j);
                i++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i < length3) {
                jsonWriter.value(dArr[i]);
                i++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i < length4) {
                jsonWriter.value(zArr[i]);
                i++;
            }
        } else if (obj instanceof Number[]) {
            Number[] numberArr = (Number[]) obj;
            int length5 = numberArr.length;
            while (i < length5) {
                WinterFlowTransactionManagerStrategy(numberArr[i]);
                i++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i < length6) {
                WinterFlowTransactionManagerStrategy(objArr[i]);
                i++;
            }
        }
        jsonWriter.endArray();
        return this;
    }

    public final WinterFlowVersionControlComponent WinterFlowUnitTestResponse(Object obj, String str) {
        boolean z = this.WinterFlowTransactionManagerStrategy;
        JsonWriter jsonWriter = this.WinterFlowHookDataSource;
        if (z) {
            if (obj == null) {
                return this;
            }
            WinterFlowRouterRouter();
            jsonWriter.name(str);
            WinterFlowTransactionManagerStrategy(obj);
            return this;
        }
        WinterFlowRouterRouter();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        WinterFlowTransactionManagerStrategy(obj);
        return this;
    }

    @Override // com.google.android.datatransport.WinterFlowQueueHandler
    public final WinterFlowQueueHandler WinterFlowVariableVersionControl(WinterFlowAlgorithmHelper winterFlowAlgorithmHelper, int i) {
        String str = winterFlowAlgorithmHelper.WinterFlowRouterStructure;
        WinterFlowRouterRouter();
        JsonWriter jsonWriter = this.WinterFlowHookDataSource;
        jsonWriter.name(str);
        WinterFlowRouterRouter();
        jsonWriter.value(i);
        return this;
    }
}
