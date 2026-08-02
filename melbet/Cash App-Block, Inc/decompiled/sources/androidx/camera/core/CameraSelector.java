package androidx.camera.core;

import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.LensFacingCameraFilter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes3.dex */
public final class CameraSelector {
    public static final CameraSelector DEFAULT_BACK_CAMERA;
    public static final CameraSelector DEFAULT_FRONT_CAMERA;
    public final LinkedHashSet mCameraFilterSet;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new LensFacingCameraFilter(0));
        DEFAULT_FRONT_CAMERA = new CameraSelector(linkedHashSet);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add(new LensFacingCameraFilter(1));
        DEFAULT_BACK_CAMERA = new CameraSelector(linkedHashSet2);
    }

    public CameraSelector(LinkedHashSet linkedHashSet) {
        this.mCameraFilterSet = linkedHashSet;
    }

    public final List filter(ArrayList arrayList) {
        List arrayList2 = new ArrayList(arrayList);
        Iterator it = this.mCameraFilterSet.iterator();
        while (it.hasNext()) {
            arrayList2 = ((CameraFilter) it.next()).filter(Collections.unmodifiableList(arrayList2));
        }
        arrayList2.retainAll(arrayList);
        return arrayList2;
    }

    public final Integer getLensFacing() {
        Iterator it = this.mCameraFilterSet.iterator();
        Integer num = null;
        while (it.hasNext()) {
            CameraFilter cameraFilter = (CameraFilter) it.next();
            if (cameraFilter instanceof LensFacingCameraFilter) {
                Integer valueOf = Integer.valueOf(((LensFacingCameraFilter) cameraFilter).mLensFacing);
                if (num == null) {
                    num = valueOf;
                } else if (!num.equals(valueOf)) {
                    a$$ExternalSyntheticBUOutline0.m$1("Multiple conflicting lens facing requirements exist.");
                    return null;
                }
            }
        }
        return num;
    }

    public final CameraInternal select(LinkedHashSet linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((CameraInternal) it.next()).getCameraInfo());
        }
        List filter = filter(arrayList);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            CameraInternal cameraInternal = (CameraInternal) it2.next();
            if (filter.contains(cameraInternal.getCameraInfo())) {
                linkedHashSet2.add(cameraInternal);
            }
        }
        Iterator it3 = linkedHashSet2.iterator();
        if (it3.hasNext()) {
            return (CameraInternal) it3.next();
        }
        StringBuilder sb = new StringBuilder("Cams:");
        sb.append(linkedHashSet.size());
        Iterator it4 = linkedHashSet.iterator();
        while (it4.hasNext()) {
            CameraInfoInternal cameraInfoInternal = ((CameraInternal) it4.next()).getCameraInfoInternal();
            sb.append(" Id:" + cameraInfoInternal.getCameraId() + "  Lens:" + cameraInfoInternal.getLensFacing());
        }
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        LinkedHashSet linkedHashSet3 = this.mCameraFilterSet;
        sb3.append("PhyId:null  Filters:" + linkedHashSet3.size());
        Iterator it5 = linkedHashSet3.iterator();
        while (it5.hasNext()) {
            CameraFilter cameraFilter = (CameraFilter) it5.next();
            sb3.append(" Id:");
            cameraFilter.getClass();
            sb3.append(CameraFilter.DEFAULT_ID);
            if (cameraFilter instanceof LensFacingCameraFilter) {
                sb3.append(" LensFilter:");
                sb3.append(((LensFacingCameraFilter) cameraFilter).mLensFacing);
            }
        }
        a$$ExternalSyntheticBUOutline0.m$3(CameraSelector$$ExternalSyntheticOutline0.m("No available camera can be found. ", sb2, " ", sb3.toString()));
        return null;
    }
}
