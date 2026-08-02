package com.bumptech.glide.provider;

import com.bumptech.glide.load.ResourceDecoder;

/* loaded from: classes4.dex */
public final class ResourceDecoderRegistry$Entry {
    public final Class dataClass;
    public final ResourceDecoder decoder;
    public final Class resourceClass;

    public ResourceDecoderRegistry$Entry(Class cls, Class cls2, ResourceDecoder resourceDecoder) {
        this.dataClass = cls;
        this.resourceClass = cls2;
        this.decoder = resourceDecoder;
    }
}
