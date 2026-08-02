package com.datadog.android.rum.internal.utils.window;

import android.view.Window;
import coil3.request.OneShotDisposable;
import com.datadog.android.rum.internal.FixedWindowCallback;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes4.dex */
public final class RumWindowCallback extends FixedWindowCallback {
    public final OneShotDisposable subscription;
    public final Window.Callback wrapped;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RumWindowCallback(Window.Callback callback) {
        super(callback);
        callback.getClass();
        this.wrapped = callback;
        this.subscription = new OneShotDisposable(11);
    }

    @Override // com.datadog.android.rum.internal.FixedWindowCallback, android.view.Window.Callback
    public final void onContentChanged() {
        super.onContentChanged();
        OneShotDisposable oneShotDisposable = this.subscription;
        oneShotDisposable.getClass();
        Iterator it = ((CopyOnWriteArraySet) oneShotDisposable.job).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            RumWindowCallback$onContentChanged$1.INSTANCE.invoke(next);
        }
    }
}
