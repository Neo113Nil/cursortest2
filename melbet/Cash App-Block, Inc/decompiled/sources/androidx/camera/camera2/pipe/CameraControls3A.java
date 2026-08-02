package androidx.camera.camera2.pipe;

import androidx.camera.camera2.pipe.graph.CameraGraphSessionImpl;
import androidx.camera.camera2.pipe.graph.Controller3A;
import java.util.List;
import kotlinx.coroutines.Deferred;
import papa.Handlers$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public interface CameraControls3A {
    /* renamed from: update3A-ydBZfZg$default, reason: not valid java name */
    static Deferred m42update3AydBZfZg$default(CameraGraphSessionImpl cameraGraphSessionImpl, AeMode aeMode, AfMode afMode, AwbMode awbMode, List list, List list2, List list3, int i) {
        AeMode aeMode2 = (i & 1) != 0 ? null : aeMode;
        AfMode afMode2 = (i & 2) != 0 ? null : afMode;
        AwbMode awbMode2 = (i & 4) != 0 ? null : awbMode;
        List list4 = (i & 8) != 0 ? null : list;
        List list5 = (i & 16) != 0 ? null : list2;
        List list6 = (i & 32) != 0 ? null : list3;
        if (!cameraGraphSessionImpl.token.getReleased()) {
            return Controller3A.m85update3A169HPGg$default(cameraGraphSessionImpl.controller3A, aeMode2, afMode2, awbMode2, null, list4, list5, list6, 8);
        }
        Handlers$$ExternalSyntheticBUOutline0.m("Cannot call update3A on ", cameraGraphSessionImpl, " after close.");
        return null;
    }
}
