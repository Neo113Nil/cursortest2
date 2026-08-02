package com.squareup.cash.advertising.backend.real;

import android.content.Context;
import app.cash.local.db.LocalTabContentQueries;
import coil3.RealImageLoader;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes5.dex */
public final class RealFullscreenAdStore {
    public final LocalTabContentQueries fullScreenMessageQueries;
    public final CoroutineContext ioDispatcher;

    public RealFullscreenAdStore(Context context, RealFullscreenAdDownloader realFullscreenAdDownloader, CashAccountDatabaseImpl cashAccountDatabaseImpl, RealImageLoader realImageLoader, CoroutineContext coroutineContext) {
        this.ioDispatcher = coroutineContext;
        this.fullScreenMessageQueries = cashAccountDatabaseImpl.fullScreenMessageQueries;
    }
}
