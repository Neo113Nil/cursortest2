package com.bumptech.glide.load.model;

import android.content.res.Resources;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.bitmap.BitmapResource;
import com.bumptech.glide.load.resource.transcode.ResourceTranscoder;

/* loaded from: classes4.dex */
public final class ResourceLoader$UriFactory implements ModelLoaderFactory, ResourceTranscoder {
    public final Resources resources;

    public /* synthetic */ ResourceLoader$UriFactory(Resources resources) {
        this.resources = resources;
    }

    @Override // com.bumptech.glide.load.model.ModelLoaderFactory
    public ModelLoader build(MultiModelLoaderFactory multiModelLoaderFactory) {
        return new AssetUriLoader(this.resources, UnitModelLoader.INSTANCE);
    }

    @Override // com.bumptech.glide.load.resource.transcode.ResourceTranscoder
    public Resource transcode(Resource resource, Options options) {
        if (resource == null) {
            return null;
        }
        return new BitmapResource(this.resources, resource);
    }
}
