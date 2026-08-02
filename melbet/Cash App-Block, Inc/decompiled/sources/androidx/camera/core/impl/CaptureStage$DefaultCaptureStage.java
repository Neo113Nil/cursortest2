package androidx.camera.core.impl;

import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes3.dex */
public final class CaptureStage$DefaultCaptureStage {
    public final CaptureConfig mCaptureConfig;

    public CaptureStage$DefaultCaptureStage() {
        HashSet hashSet = new HashSet();
        MutableOptionsBundle create = MutableOptionsBundle.create();
        ArrayList arrayList = new ArrayList();
        MutableTagBundle create2 = MutableTagBundle.create();
        ArrayList arrayList2 = new ArrayList(hashSet);
        OptionsBundle from = OptionsBundle.from(create);
        ArrayList arrayList3 = new ArrayList(arrayList);
        TagBundle tagBundle = TagBundle.EMPTY_TAGBUNDLE;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = create2.mTagMap;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        this.mCaptureConfig = new CaptureConfig(arrayList2, from, -1, arrayList3, new TagBundle(arrayMap));
    }
}
