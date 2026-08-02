package com.bumptech.glide.load.engine.cache;

import com.bumptech.glide.load.Key;
import com.caverock.androidsvg.SVG;
import java.io.File;

/* loaded from: classes4.dex */
public interface DiskCache {
    File get(Key key);

    void put(Key key, SVG svg);
}
