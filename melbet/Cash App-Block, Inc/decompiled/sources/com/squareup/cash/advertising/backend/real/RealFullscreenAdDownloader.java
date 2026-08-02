package com.squareup.cash.advertising.backend.real;

import com.squareup.cash.storage.RealFileDownloader;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes5.dex */
public final class RealFullscreenAdDownloader {
    public final CoroutineContext ioDispatcher;

    public RealFullscreenAdDownloader(RealFileDownloader realFileDownloader, CoroutineContext coroutineContext, CoroutineScope coroutineScope) {
        this.ioDispatcher = coroutineContext;
        new ConcurrentHashMap();
    }
}
