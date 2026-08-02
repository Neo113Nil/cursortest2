package com.bugsnag.android;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bugsnag.android.JsonStream;
import com.bugsnag.android.StateEvent;
import com.bugsnag.android.internal.DateUtils;
import com.bugsnag.android.internal.StateObserver;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.EmptyList;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eJ\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0015J\b\u0010\u0016\u001a\u00020\u0004H\u0002J\u0010\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/bugsnag/android/BreadcrumbState;", "Lcom/bugsnag/android/BaseObservable;", "Lcom/bugsnag/android/JsonStream$Streamable;", "maxBreadcrumbs", "", "callbackState", "Lcom/bugsnag/android/CallbackState;", "logger", "Lcom/bugsnag/android/Logger;", "(ILcom/bugsnag/android/CallbackState;Lcom/bugsnag/android/Logger;)V", "index", "Ljava/util/concurrent/atomic/AtomicInteger;", "store", "", "Lcom/bugsnag/android/Breadcrumb;", "[Lcom/bugsnag/android/Breadcrumb;", "validIndexMask", "add", "", "breadcrumb", "copy", "", "getBreadcrumbIndex", "toStream", "writer", "Lcom/bugsnag/android/JsonStream;", "bugsnag-android-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BreadcrumbState extends BaseObservable implements JsonStream.Streamable {
    private final CallbackState callbackState;
    private final Logger logger;
    private final int maxBreadcrumbs;
    private final Breadcrumb[] store;
    private final int validIndexMask = Integer.MAX_VALUE;
    private final AtomicInteger index = new AtomicInteger(0);

    public BreadcrumbState(int i, CallbackState callbackState, Logger logger) {
        this.maxBreadcrumbs = i;
        this.callbackState = callbackState;
        this.logger = logger;
        this.store = new Breadcrumb[i];
    }

    private final int getBreadcrumbIndex() {
        int i;
        do {
            i = this.index.get() & this.validIndexMask;
        } while (!this.index.compareAndSet(i, (i + 1) % this.maxBreadcrumbs));
        return i;
    }

    public final void add(Breadcrumb breadcrumb) {
        if (this.maxBreadcrumbs != 0) {
            CallbackState callbackState = this.callbackState;
            Logger logger = this.logger;
            CopyOnWriteArrayList copyOnWriteArrayList = callbackState.onBreadcrumbTasks;
            if (!copyOnWriteArrayList.isEmpty()) {
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    if (it.next() != null) {
                        a$$ExternalSyntheticBUOutline0.m$1();
                        return;
                    } else {
                        try {
                            throw null;
                        } catch (Throwable th) {
                            logger.w("OnBreadcrumbCallback threw an Exception", th);
                        }
                    }
                }
            }
            this.store[getBreadcrumbIndex()] = breadcrumb;
            if (getObservers$bugsnag_android_core_release().isEmpty()) {
                return;
            }
            BreadcrumbInternal breadcrumbInternal = breadcrumb.impl;
            String str = breadcrumbInternal.message;
            BreadcrumbType breadcrumbType = breadcrumbInternal.f937type;
            String iso8601 = DateUtils.toIso8601(breadcrumbInternal.timestamp);
            Map map = breadcrumb.impl.metadata;
            if (map == null) {
                map = new LinkedHashMap();
            }
            StateEvent.AddBreadcrumb addBreadcrumb = new StateEvent.AddBreadcrumb(str, breadcrumbType, iso8601, map);
            Iterator<T> it2 = getObservers$bugsnag_android_core_release().iterator();
            while (it2.hasNext()) {
                ((StateObserver) it2.next()).onStateChange(addBreadcrumb);
            }
        }
    }

    public final List<Breadcrumb> copy() {
        if (this.maxBreadcrumbs == 0) {
            return EmptyList.INSTANCE;
        }
        int i = -1;
        while (i == -1) {
            i = this.index.getAndSet(-1);
        }
        try {
            int i2 = this.maxBreadcrumbs;
            Breadcrumb[] breadcrumbArr = new Breadcrumb[i2];
            ArraysKt___ArraysJvmKt.copyInto(0, i, i2, this.store, breadcrumbArr);
            ArraysKt___ArraysJvmKt.copyInto(this.maxBreadcrumbs - i, 0, i, this.store, breadcrumbArr);
            return ArraysKt___ArraysKt.filterNotNull(breadcrumbArr);
        } finally {
            this.index.set(i);
        }
    }

    @Override // com.bugsnag.android.JsonStream.Streamable
    public void toStream(JsonStream writer) {
        List<Breadcrumb> copy = copy();
        writer.beginArray();
        Iterator<T> it = copy.iterator();
        while (it.hasNext()) {
            ((Breadcrumb) it.next()).toStream(writer);
        }
        writer.endArray();
    }
}
