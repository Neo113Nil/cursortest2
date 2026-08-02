package androidx.camera.camera2.pipe.compat;

import android.util.Log;
import android.view.Surface;
import androidx.camera.camera2.pipe.compat.CaptureSessionFactory;
import androidx.camera.camera2.pipe.core.Threads;
import androidx.camera.camera2.pipe.graph.StreamGraphImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.EmptyMap;
import kotlin.collections.builders.MapBuilder;

/* loaded from: classes3.dex */
public final class AndroidMHighSpeedSessionFactory implements CaptureSessionFactory {
    public final StreamGraphImpl streamGraph;

    public AndroidMHighSpeedSessionFactory(StreamGraphImpl streamGraphImpl, Threads threads) {
        threads.getClass();
        this.streamGraph = streamGraphImpl;
    }

    @Override // androidx.camera.camera2.pipe.compat.CaptureSessionFactory
    public final CaptureSessionFactory.Result create(CameraDeviceWrapper cameraDeviceWrapper, Map map, CaptureSessionState captureSessionState) {
        cameraDeviceWrapper.getClass();
        map.getClass();
        captureSessionState.getClass();
        ArrayList arrayList = new ArrayList(map.size());
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((Surface) ((Map.Entry) it.next()).getValue());
        }
        if (cameraDeviceWrapper.createConstrainedHighSpeedCaptureSession(arrayList, captureSessionState)) {
            MapBuilder access$buildSimpleOutputSurfaceMap = CaptureSessionFactoryKt.access$buildSimpleOutputSurfaceMap(map, this.streamGraph);
            EmptyMap emptyMap = EmptyMap.INSTANCE;
            emptyMap.getClass();
            return new CaptureSessionFactory.Result.Success(emptyMap, access$buildSimpleOutputSurfaceMap);
        }
        Log.w("CXCP", "Failed to create ConstrainedHighSpeedCaptureSession from " + cameraDeviceWrapper + " for " + captureSessionState + '!');
        captureSessionState.onSessionFinalized();
        return CaptureSessionFactory.Result.Failed.INSTANCE;
    }
}
