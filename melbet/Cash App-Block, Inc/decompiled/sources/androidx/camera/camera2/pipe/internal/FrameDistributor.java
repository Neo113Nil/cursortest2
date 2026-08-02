package androidx.camera.camera2.pipe.internal;

import androidx.camera.camera2.adapter.ZslControlImpl$$ExternalSyntheticLambda1;
import androidx.camera.camera2.pipe.CameraStream;
import androidx.camera.camera2.pipe.OutputId;
import androidx.camera.camera2.pipe.OutputStatus;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.RequestFailure;
import androidx.camera.camera2.pipe.RequestMetadata;
import androidx.camera.camera2.pipe.StreamId;
import androidx.camera.camera2.pipe.compat.AndroidFrameInfo;
import androidx.camera.camera2.pipe.graph.StreamGraphImpl;
import androidx.camera.camera2.pipe.internal.FrameState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.collections.builders.MapBuilder;

/* loaded from: classes3.dex */
public final class FrameDistributor implements AutoCloseable, Request.Listener {
    public final FrameCaptureQueue frameCaptureQueue;
    public final OutputDistributor frameInfoDistributor = new OutputDistributor(OutputMatcher.EXACT);
    public final ZslControlImpl$$ExternalSyntheticLambda1 frameStartedListener;
    public final LinkedHashMap imageDistributors;
    public final Set imageStreams;
    public final StreamGraphImpl streamGraphImpl;

    public FrameDistributor(StreamGraphImpl streamGraphImpl, FrameCaptureQueue frameCaptureQueue) {
        this.streamGraphImpl = streamGraphImpl;
        this.frameCaptureQueue = frameCaptureQueue;
        MapBuilder mapBuilder = streamGraphImpl.imageSourceMap;
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(mapBuilder.size));
        Iterator it = mapBuilder.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            int i = ((StreamId) entry.getKey()).value;
            if (streamGraphImpl.m89getaKI5c8E(i) == null) {
                a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
                throw null;
            }
            streamGraphImpl.m90getCameraStreamConfigaKI5c8E(i).getClass();
            throw null;
        }
        this.imageDistributors = linkedHashMap;
        Set keySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(keySet, 10));
        Iterator it2 = keySet.iterator();
        while (it2.hasNext()) {
            CameraStream m89getaKI5c8E = this.streamGraphImpl.m89getaKI5c8E(((StreamId) it2.next()).value);
            if (m89getaKI5c8E == null) {
                a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
                throw null;
            }
            arrayList.add(m89getaKI5c8E);
        }
        this.imageStreams = CollectionsKt.toSet(arrayList);
        this.frameStartedListener = new ZslControlImpl$$ExternalSyntheticLambda1(18);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.frameCaptureQueue.close();
        this.frameInfoDistributor.close();
        Iterator it = this.imageDistributors.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((Map) it.next()).values().iterator();
            while (it2.hasNext()) {
                ((OutputDistributor) it2.next()).close();
            }
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    public final void onAborted(Request request) {
        request.getClass();
        this.frameCaptureQueue.remove(request);
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onBufferLost-iiEMlm4 */
    public final void mo26onBufferLostiiEMlm4(RequestMetadata requestMetadata, long j, int i, int i2) {
        Map map = (Map) this.imageDistributors.get(new StreamId(i));
        if (map == null) {
            return;
        }
        if (this.streamGraphImpl.m90getCameraStreamConfigaKI5c8E(i) == null) {
            a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
        } else {
            if (!map.containsKey(new OutputId(i2))) {
                a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
                return;
            }
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((OutputDistributor) it.next()).m97onOutputFailureVw7M1qk(j);
            }
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onComplete-CcXjc1I */
    public final void mo16onCompleteCcXjc1I(RequestMetadata requestMetadata, long j, AndroidFrameInfo androidFrameInfo) {
        this.frameInfoDistributor.m98onOutputResultDvZWqE8(androidFrameInfo, j);
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onFailed-CcXjc1I */
    public final void mo17onFailedCcXjc1I(RequestMetadata requestMetadata, long j, RequestFailure requestFailure) {
        this.frameInfoDistributor.m98onOutputResultDvZWqE8(new OutputStatus(10), j);
        if (requestFailure.getWasImageCaptured()) {
            return;
        }
        Iterator it = requestMetadata.getStreams().keySet().iterator();
        while (it.hasNext()) {
            Map map = (Map) this.imageDistributors.get(new StreamId(((StreamId) it.next()).value));
            if (map != null) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    ((OutputDistributor) it2.next()).m97onOutputFailureVw7M1qk(j);
                }
            }
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onStarted-uGKBvU4 */
    public final void mo30onStarteduGKBvU4(RequestMetadata requestMetadata, long j, long j2) {
        requestMetadata.getClass();
        FrameState frameState = new FrameState(requestMetadata, j, j2, this.imageStreams);
        this.frameInfoDistributor.m99onOutputStartedqGubWw0(j, j2, j, frameState.frameInfoOutput);
        ListBuilder listBuilder = frameState.imageOutputs;
        int size = listBuilder.getSize();
        for (int i = 0; i < size; i++) {
            FrameState.ImageOutput imageOutput = (FrameState.ImageOutput) listBuilder.get(i);
            Object obj = this.imageDistributors.get(new StreamId(imageOutput.streamId));
            if (obj == null) {
                a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
                return;
            }
            Object obj2 = ((Map) obj).get(new OutputId(imageOutput.outputId));
            if (obj2 == null) {
                a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
                return;
            }
            OutputDistributor outputDistributor = (OutputDistributor) obj2;
            outputDistributor.m99onOutputStartedqGubWw0(j, j2, j2, imageOutput);
            if (!requestMetadata.getStreams().keySet().contains(new StreamId(imageOutput.streamId))) {
                outputDistributor.m97onOutputFailureVw7M1qk(frameState.frameNumber);
            }
        }
        FrameImpl frameImpl = new FrameImpl(frameState);
        this.frameStartedListener.getClass();
        if (!requestMetadata.getRepeating()) {
            this.frameCaptureQueue.remove(requestMetadata.getRequest());
        }
        frameImpl.release();
    }
}
