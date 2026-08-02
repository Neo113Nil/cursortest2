package com.bumptech.glide.load.resource.transcode;

/* loaded from: classes4.dex */
public final class TranscoderRegistry$Entry {
    public final Class fromClass;
    public final Class toClass;
    public final ResourceTranscoder transcoder;

    public TranscoderRegistry$Entry(Class cls, Class cls2, ResourceTranscoder resourceTranscoder) {
        this.fromClass = cls;
        this.toClass = cls2;
        this.transcoder = resourceTranscoder;
    }
}
