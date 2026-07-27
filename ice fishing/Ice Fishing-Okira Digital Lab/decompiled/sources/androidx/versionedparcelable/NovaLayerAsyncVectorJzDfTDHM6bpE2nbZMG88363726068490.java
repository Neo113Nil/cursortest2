package androidx.versionedparcelable;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class NovaLayerAsyncVectorJzDfTDHM6bpE2nbZMG88363726068490 implements ComponentCallbacks2 {
    public final /* synthetic */ NovaLayerManagerConstructorXC917GC1Fw0Blp01L782000860679772 LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public final /* synthetic */ Configuration RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;

    public NovaLayerAsyncVectorJzDfTDHM6bpE2nbZMG88363726068490(Configuration configuration, NovaLayerManagerConstructorXC917GC1Fw0Blp01L782000860679772 novaLayerManagerConstructorXC917GC1Fw0Blp01L782000860679772) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = configuration;
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = novaLayerManagerConstructorXC917GC1Fw0Blp01L782000860679772;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        Configuration configuration2 = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        int updateFrom = configuration2.updateFrom(configuration);
        Iterator it = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.entrySet().iterator();
        while (it.hasNext()) {
            UltraBufferDependencySyntaxMLnJlQw42pUAhYRKrV42952779608482 ultraBufferDependencySyntaxMLnJlQw42pUAhYRKrV42952779608482 = (UltraBufferDependencySyntaxMLnJlQw42pUAhYRKrV42952779608482) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
            if (ultraBufferDependencySyntaxMLnJlQw42pUAhYRKrV42952779608482 == null || Configuration.needNewResources(updateFrom, ultraBufferDependencySyntaxMLnJlQw42pUAhYRKrV42952779608482.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365)) {
                it.remove();
            }
        }
        configuration2.setTo(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.clear();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.clear();
    }
}
