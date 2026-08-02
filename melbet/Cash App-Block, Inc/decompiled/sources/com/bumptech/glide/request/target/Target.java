package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.manager.LifecycleListener;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.SingleRequest;

/* loaded from: classes4.dex */
public interface Target extends LifecycleListener {
    Request getRequest();

    void getSize(SingleRequest singleRequest);

    void onLoadCleared(Drawable drawable);

    void onLoadFailed(Drawable drawable);

    void onLoadStarted(Drawable drawable);

    void onResourceReady(Object obj);

    void removeCallback(SingleRequest singleRequest);

    void setRequest(Request request);
}
