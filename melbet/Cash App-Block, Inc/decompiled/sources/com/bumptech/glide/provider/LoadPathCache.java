package com.bumptech.glide.provider;

import androidx.collection.ArrayMap;
import com.bumptech.glide.load.engine.DecodePath;
import com.bumptech.glide.load.engine.LoadPath;
import com.bumptech.glide.load.resource.transcode.UnitTranscoder;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class LoadPathCache {
    public static final LoadPath NO_PATHS_SIGNAL = new LoadPath(Object.class, Object.class, Object.class, Collections.singletonList(new DecodePath(Object.class, Object.class, Object.class, Collections.EMPTY_LIST, new UnitTranscoder(0), null)), null);
    public final ArrayMap cache = new ArrayMap(0);
    public final AtomicReference keyRef = new AtomicReference();
}
