package com.bumptech.glide.load.model;

import androidx.core.util.Pools$Pool;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.util.Util;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class MultiModelLoader$MultiFetcher implements DataFetcher, DataFetcher.DataCallback {
    public DataFetcher.DataCallback callback;
    public int currentIndex;
    public List exceptions;
    public final ArrayList fetchers;
    public boolean isCancelled;
    public Priority priority;
    public final Pools$Pool throwableListPool;

    public MultiModelLoader$MultiFetcher(ArrayList arrayList, Pools$Pool pools$Pool) {
        this.throwableListPool = pools$Pool;
        if (arrayList.isEmpty()) {
            a$$ExternalSyntheticBUOutline0.m$3("Must not be empty.");
            throw null;
        }
        this.fetchers = arrayList;
        this.currentIndex = 0;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final void cancel() {
        this.isCancelled = true;
        Iterator it = this.fetchers.iterator();
        while (it.hasNext()) {
            ((DataFetcher) it.next()).cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final void cleanup() {
        List list = this.exceptions;
        if (list != null) {
            this.throwableListPool.release(list);
        }
        this.exceptions = null;
        Iterator it = this.fetchers.iterator();
        while (it.hasNext()) {
            ((DataFetcher) it.next()).cleanup();
        }
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final Class getDataClass() {
        return ((DataFetcher) this.fetchers.get(0)).getDataClass();
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final int getDataSource() {
        return ((DataFetcher) this.fetchers.get(0)).getDataSource();
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final void loadData(Priority priority, DataFetcher.DataCallback dataCallback) {
        this.priority = priority;
        this.callback = dataCallback;
        this.exceptions = (List) this.throwableListPool.acquire();
        ((DataFetcher) this.fetchers.get(this.currentIndex)).loadData(priority, this);
        if (this.isCancelled) {
            cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.DataFetcher.DataCallback
    public final void onDataReady(Object obj) {
        if (obj != null) {
            this.callback.onDataReady(obj);
        } else {
            startNextOrFail();
        }
    }

    @Override // com.bumptech.glide.load.data.DataFetcher.DataCallback
    public final void onLoadFailed(Exception exc) {
        List list = this.exceptions;
        Util.checkNotNull(list, "Argument must not be null");
        list.add(exc);
        startNextOrFail();
    }

    public final void startNextOrFail() {
        if (this.isCancelled) {
            return;
        }
        if (this.currentIndex < this.fetchers.size() - 1) {
            this.currentIndex++;
            loadData(this.priority, this.callback);
        } else {
            Util.checkNotNull(this.exceptions);
            this.callback.onLoadFailed(new GlideException("Fetch failed", new ArrayList(this.exceptions)));
        }
    }
}
