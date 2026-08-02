package com.squareup.cash.fileupload.real;

import coil3.memory.RealStrongMemoryCache;
import com.squareup.cash.storage.RealSessionedLink;

/* loaded from: classes.dex */
public final class RealFileValidator$Factory$Impl {
    public final RealSessionedLink.MetroFactory delegateFactory;

    public RealFileValidator$Factory$Impl(RealSessionedLink.MetroFactory metroFactory) {
        this.delegateFactory = metroFactory;
    }

    public static RealStrongMemoryCache create$default(RealFileValidator$Factory$Impl realFileValidator$Factory$Impl, long j) {
        RealAndroidFileParser realAndroidFileParser = (RealAndroidFileParser) realFileValidator$Factory$Impl.delegateFactory.sandboxer.invoke();
        realAndroidFileParser.getClass();
        return new RealStrongMemoryCache(realAndroidFileParser, j, ".*");
    }
}
