package com.bumptech.glide.provider;

import com.bumptech.glide.load.ResourceEncoder;

/* loaded from: classes4.dex */
public final class ResourceEncoderRegistry$Entry {
    public final ResourceEncoder encoder;
    public final Class resourceClass;

    public ResourceEncoderRegistry$Entry(Class cls, ResourceEncoder resourceEncoder) {
        this.resourceClass = cls;
        this.encoder = resourceEncoder;
    }
}
