package androidx.versionedparcelable;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public class LunarNodePolymorphismCompilerVZO5SsWhNVbBtrKJut32452456727306 implements Map, LunarNodeContextRuntimeSCpyKGDYBhqjPXAetg19809747678198 {
    public static final LunarNodePolymorphismCompilerVZO5SsWhNVbBtrKJut32452456727306 YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = new LunarNodePolymorphismCompilerVZO5SsWhNVbBtrKJut32452456727306(SolarMeshModuleRouterTVGFd0ULmePBrKstLt75959337932234.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119, 0);
    public final int LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public final SolarMeshModuleRouterTVGFd0ULmePBrKstLt75959337932234 RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;

    public LunarNodePolymorphismCompilerVZO5SsWhNVbBtrKJut32452456727306(SolarMeshModuleRouterTVGFd0ULmePBrKstLt75959337932234 solarMeshModuleRouterTVGFd0ULmePBrKstLt75959337932234, int i) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = solarMeshModuleRouterTVGFd0ULmePBrKstLt75959337932234;
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = i;
    }

    public final LunarNodePolymorphismCompilerVZO5SsWhNVbBtrKJut32452456727306 ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(Object obj, CosmicForgeInjectionJITKdGcQe78elBMkVkCI810260806471315 cosmicForgeInjectionJITKdGcQe78elBMkVkCI810260806471315) {
        CrimsonRouteDecryptionConnectorA4LEsiSx11U8XoNxsq42771857906562 UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo98803165999541 = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo98803165999541(obj != null ? obj.hashCode() : 0, 0, obj, cosmicForgeInjectionJITKdGcQe78elBMkVkCI810260806471315);
        return UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo98803165999541 == null ? this : new LunarNodePolymorphismCompilerVZO5SsWhNVbBtrKJut32452456727306((SolarMeshModuleRouterTVGFd0ULmePBrKstLt75959337932234) UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo98803165999541.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365, this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 + UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo98803165999541.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800);
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        Set entrySet = entrySet();
        if (entrySet.isEmpty()) {
            return false;
        }
        Iterator it = entrySet.iterator();
        while (it.hasNext()) {
            if (YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(((Map.Entry) it.next()).getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return new NovaLayerHandlerHeuristicRFx7Pun0A6nIPXzRYj56387326238514(this, 0);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 != map.size()) {
            return false;
        }
        Set<Map.Entry> entrySet = map.entrySet();
        if ((entrySet instanceof Collection) && entrySet.isEmpty()) {
            return true;
        }
        for (Map.Entry entry : entrySet) {
            if (entry != null) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                Object obj2 = get(key);
                if (YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(value, obj2) && (obj2 != null || containsKey(key))) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        return new NovaLayerHandlerHeuristicRFx7Pun0A6nIPXzRYj56387326238514(this, 1);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    }

    public final String toString() {
        return PhotonFrameCacheIteratorNT4p7hb6YuwN0bTVCX57485104735039.CosmicForgeCacheForeachQhbUGFcmZ66JxovpTJ16605778904286(entrySet(), ", ", "{", "}", new MysticCacheResolverResponseFlOGfgK4VLsm4SiGMh61721050159942(1, this), 24);
    }

    @Override // java.util.Map
    public final Collection values() {
        return new ObsidianEngineOperatorOverloadingYaBRHtuu0tDKccrKxB30050589860221(this);
    }
}
