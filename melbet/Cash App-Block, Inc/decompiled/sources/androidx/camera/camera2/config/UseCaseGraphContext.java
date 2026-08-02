package androidx.camera.camera2.config;

import androidx.camera.camera2.adapter.CameraStateAdapter;
import androidx.camera.camera2.adapter.GraphStateToCameraStateAdapter;
import androidx.camera.camera2.pipe.CameraStream;
import androidx.camera.camera2.pipe.StreamId;
import androidx.camera.camera2.pipe.graph.CameraGraphImpl;
import androidx.camera.camera2.pipe.graph.StreamGraphImpl;
import androidx.camera.core.impl.DeferrableSurface;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class UseCaseGraphContext {
    public final Lazy _graph;
    public final UseCaseCameraConfig$$ExternalSyntheticLambda0 cameraGraphProvider;
    public final CameraStateAdapter cameraStateAdapter;
    public final GraphStateToCameraStateAdapter graphStateToCameraStateAdapter;
    public final UseCaseCameraConfig$$ExternalSyntheticLambda0 streamConfigMapProvider;
    public final Lazy surfaceToStreamMap$delegate;

    public UseCaseGraphContext(UseCaseCameraConfig$$ExternalSyntheticLambda0 useCaseCameraConfig$$ExternalSyntheticLambda0, CameraStateAdapter cameraStateAdapter, GraphStateToCameraStateAdapter graphStateToCameraStateAdapter, UseCaseCameraConfig$$ExternalSyntheticLambda0 useCaseCameraConfig$$ExternalSyntheticLambda02) {
        this.cameraGraphProvider = useCaseCameraConfig$$ExternalSyntheticLambda0;
        this.cameraStateAdapter = cameraStateAdapter;
        this.graphStateToCameraStateAdapter = graphStateToCameraStateAdapter;
        this.streamConfigMapProvider = useCaseCameraConfig$$ExternalSyntheticLambda02;
        final int i = 0;
        this._graph = LazyKt.lazy(new Function0(this) { // from class: androidx.camera.camera2.config.UseCaseGraphContext$$ExternalSyntheticLambda0
            public final /* synthetic */ UseCaseGraphContext f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                UseCaseGraphContext useCaseGraphContext = this.f$0;
                switch (i2) {
                    case 0:
                        return (CameraGraphImpl) useCaseGraphContext.cameraGraphProvider.get();
                    default:
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        Object obj = useCaseGraphContext.streamConfigMapProvider.get();
                        obj.getClass();
                        for (Map.Entry entry : ((Map) obj).entrySet()) {
                            CameraStream.Config config = (CameraStream.Config) entry.getKey();
                            DeferrableSurface deferrableSurface = (DeferrableSurface) entry.getValue();
                            StreamGraphImpl streamGraphImpl = useCaseGraphContext.getGraph().streamGraph;
                            streamGraphImpl.getClass();
                            config.getClass();
                            CameraStream cameraStream = (CameraStream) streamGraphImpl._streamMap.get(config);
                            if (cameraStream != null) {
                                linkedHashMap.put(deferrableSurface, new StreamId(cameraStream.id));
                            }
                        }
                        return MapsKt__MapsKt.toMap(linkedHashMap);
                }
            }
        });
        final int i2 = 1;
        this.surfaceToStreamMap$delegate = LazyKt.lazy(new Function0(this) { // from class: androidx.camera.camera2.config.UseCaseGraphContext$$ExternalSyntheticLambda0
            public final /* synthetic */ UseCaseGraphContext f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                UseCaseGraphContext useCaseGraphContext = this.f$0;
                switch (i22) {
                    case 0:
                        return (CameraGraphImpl) useCaseGraphContext.cameraGraphProvider.get();
                    default:
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        Object obj = useCaseGraphContext.streamConfigMapProvider.get();
                        obj.getClass();
                        for (Map.Entry entry : ((Map) obj).entrySet()) {
                            CameraStream.Config config = (CameraStream.Config) entry.getKey();
                            DeferrableSurface deferrableSurface = (DeferrableSurface) entry.getValue();
                            StreamGraphImpl streamGraphImpl = useCaseGraphContext.getGraph().streamGraph;
                            streamGraphImpl.getClass();
                            config.getClass();
                            CameraStream cameraStream = (CameraStream) streamGraphImpl._streamMap.get(config);
                            if (cameraStream != null) {
                                linkedHashMap.put(deferrableSurface, new StreamId(cameraStream.id));
                            }
                        }
                        return MapsKt__MapsKt.toMap(linkedHashMap);
                }
            }
        });
    }

    public final CameraGraphImpl getGraph() {
        Object value = this._graph.getValue();
        value.getClass();
        return (CameraGraphImpl) value;
    }

    public final LinkedHashSet getStreamIdsFromSurfaces(Collection collection) {
        collection.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            StreamId streamId = (StreamId) ((Map) this.surfaceToStreamMap$delegate.getValue()).get((DeferrableSurface) it.next());
            if (streamId != null) {
                linkedHashSet.add(new StreamId(streamId.value));
            }
        }
        return linkedHashSet;
    }
}
