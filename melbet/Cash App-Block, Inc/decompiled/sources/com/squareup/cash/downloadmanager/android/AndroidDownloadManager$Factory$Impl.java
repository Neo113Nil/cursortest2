package com.squareup.cash.downloadmanager.android;

import android.content.Context;
import com.fillr.n;
import com.squareup.cash.history.analytics.LoadTimeClock;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class AndroidDownloadManager$Factory$Impl {
    public final LoadTimeClock.MetroFactory delegateFactory;

    public AndroidDownloadManager$Factory$Impl(LoadTimeClock.MetroFactory metroFactory) {
        this.delegateFactory = metroFactory;
    }

    public final n create$1(CoroutineScope coroutineScope) {
        coroutineScope.getClass();
        LoadTimeClock.MetroFactory metroFactory = this.delegateFactory;
        Context context = (Context) metroFactory.clock.invoke();
        CoroutineContext coroutineContext = (CoroutineContext) metroFactory.observabilityManager.invoke();
        context.getClass();
        coroutineContext.getClass();
        return new n(context, coroutineContext, coroutineScope);
    }
}
