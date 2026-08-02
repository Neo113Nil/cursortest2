package com.bumptech.glide.load.model;

import com.caverock.androidsvg.SVG;
import io.noties.markwon.RenderPropsImpl;

/* loaded from: classes4.dex */
public final class ModelLoaderRegistry {
    public final RenderPropsImpl cache;
    public final MultiModelLoaderFactory multiModelLoaderFactory;

    public ModelLoaderRegistry(SVG svg) {
        MultiModelLoaderFactory multiModelLoaderFactory = new MultiModelLoaderFactory(svg);
        this.cache = new RenderPropsImpl(1);
        this.multiModelLoaderFactory = multiModelLoaderFactory;
    }
}
