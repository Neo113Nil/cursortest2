package androidx.camera.core.impl;

import android.util.ArrayMap;

/* loaded from: classes3.dex */
public class TagBundle {
    public static final TagBundle EMPTY_TAGBUNDLE = new TagBundle(new ArrayMap());
    public final ArrayMap mTagMap;

    public TagBundle(ArrayMap arrayMap) {
        this.mTagMap = arrayMap;
    }

    public final String toString() {
        return "android.hardware.camera2.CaptureRequest.setTag.CX";
    }
}
