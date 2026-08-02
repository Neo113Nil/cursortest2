package com.google.firebase.messaging;

import android.content.SharedPreferences;
import coil3.ComponentRegistry;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* loaded from: classes.dex */
public final class TopicsStore {
    public static WeakReference topicsStoreWeakReference;
    public final ScheduledThreadPoolExecutor syncExecutor;
    public ComponentRegistry.Builder topicOperationsQueue;

    public TopicsStore(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.syncExecutor = scheduledThreadPoolExecutor;
    }

    public final synchronized TopicOperation getNextTopicOperation() {
        String str;
        ComponentRegistry.Builder builder = this.topicOperationsQueue;
        synchronized (((ArrayDeque) builder.lazyFetcherFactories)) {
            str = (String) ((ArrayDeque) builder.lazyFetcherFactories).peek();
        }
        return TopicOperation.from(str);
    }
}
