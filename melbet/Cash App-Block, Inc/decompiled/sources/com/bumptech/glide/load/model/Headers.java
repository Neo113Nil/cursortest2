package com.bumptech.glide.load.model;

import com.bumptech.glide.load.model.LazyHeaders;
import java.util.Map;

/* loaded from: classes4.dex */
public interface Headers {
    public static final LazyHeaders DEFAULT = new LazyHeaders(LazyHeaders.Builder.DEFAULT_HEADERS);

    Map getHeaders();
}
