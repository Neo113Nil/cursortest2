package com.bumptech.glide.load.model.stream;

import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.HttpUrlFetcher;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.load.model.ModelCache$1;
import com.bumptech.glide.load.model.ModelCache$ModelKey;
import com.bumptech.glide.load.model.ModelLoader;
import com.fillr.m1;
import java.util.ArrayDeque;

/* loaded from: classes4.dex */
public final class HttpGlideUrlLoader implements ModelLoader {
    public static final Option TIMEOUT = Option.memory(2500, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");
    public final m1 modelCache;

    public HttpGlideUrlLoader(m1 m1Var) {
        this.modelCache = m1Var;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final ModelLoader.LoadData buildLoadData(Object obj, int i, int i2, Options options) {
        GlideUrl glideUrl = (GlideUrl) obj;
        m1 m1Var = this.modelCache;
        if (m1Var != null) {
            ModelCache$1 modelCache$1 = (ModelCache$1) m1Var.a;
            ModelCache$ModelKey modelCache$ModelKey = ModelCache$ModelKey.get(glideUrl);
            Object obj2 = modelCache$1.get(modelCache$ModelKey);
            ArrayDeque arrayDeque = ModelCache$ModelKey.KEY_QUEUE;
            synchronized (arrayDeque) {
                arrayDeque.offer(modelCache$ModelKey);
            }
            GlideUrl glideUrl2 = (GlideUrl) obj2;
            if (glideUrl2 == null) {
                modelCache$1.put(ModelCache$ModelKey.get(glideUrl), glideUrl);
            } else {
                glideUrl = glideUrl2;
            }
        }
        return new ModelLoader.LoadData(glideUrl, new HttpUrlFetcher(glideUrl, ((Integer) options.get(TIMEOUT)).intValue()));
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final /* bridge */ /* synthetic */ boolean handles(Object obj) {
        return true;
    }
}
