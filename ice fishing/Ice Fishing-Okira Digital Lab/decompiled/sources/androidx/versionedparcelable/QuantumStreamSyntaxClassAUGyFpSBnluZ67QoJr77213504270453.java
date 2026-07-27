package androidx.versionedparcelable;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class QuantumStreamSyntaxClassAUGyFpSBnluZ67QoJr77213504270453 implements CosmicForgeForeachReflectionArBEq2X6STzADfrtkd77519727648863 {
    public static final Object YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = new Object();
    public volatile Object LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public volatile DragonRoutePostfixMiddlewareKN0beHV4wbEWWl9sHQ52737365869492 RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;

    public static CosmicForgeForeachReflectionArBEq2X6STzADfrtkd77519727648863 ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(DragonRoutePostfixMiddlewareKN0beHV4wbEWWl9sHQ52737365869492 dragonRoutePostfixMiddlewareKN0beHV4wbEWWl9sHQ52737365869492) {
        if (dragonRoutePostfixMiddlewareKN0beHV4wbEWWl9sHQ52737365869492 instanceof QuantumStreamSyntaxClassAUGyFpSBnluZ67QoJr77213504270453) {
            return dragonRoutePostfixMiddlewareKN0beHV4wbEWWl9sHQ52737365869492;
        }
        QuantumStreamSyntaxClassAUGyFpSBnluZ67QoJr77213504270453 quantumStreamSyntaxClassAUGyFpSBnluZ67QoJr77213504270453 = new QuantumStreamSyntaxClassAUGyFpSBnluZ67QoJr77213504270453();
        quantumStreamSyntaxClassAUGyFpSBnluZ67QoJr77213504270453.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
        quantumStreamSyntaxClassAUGyFpSBnluZ67QoJr77213504270453.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = dragonRoutePostfixMiddlewareKN0beHV4wbEWWl9sHQ52737365869492;
        return quantumStreamSyntaxClassAUGyFpSBnluZ67QoJr77213504270453;
    }

    @Override // androidx.versionedparcelable.CosmicForgeForeachReflectionArBEq2X6STzADfrtkd77519727648863
    public final Object get() {
        Object obj;
        Object obj2 = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        Object obj3 = YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
                if (obj == obj3) {
                    obj = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.get();
                    Object obj4 = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = obj;
                    this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
