package androidx.camera.core.impl;

import androidx.camera.core.CameraFilter;
import androidx.camera.core.CameraInfo;
import androidx.room.TransactorKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class LensFacingCameraFilter implements CameraFilter {
    public final int mLensFacing;

    public LensFacingCameraFilter(int i) {
        this.mLensFacing = i;
    }

    @Override // androidx.camera.core.CameraFilter
    public final List filter(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CameraInfo cameraInfo = (CameraInfo) it.next();
            TransactorKt.checkArgument("The camera info doesn't contain internal implementation.", cameraInfo instanceof CameraInfoInternal);
            if (cameraInfo.getLensFacing() == this.mLensFacing) {
                arrayList.add(cameraInfo);
            }
        }
        return arrayList;
    }
}
