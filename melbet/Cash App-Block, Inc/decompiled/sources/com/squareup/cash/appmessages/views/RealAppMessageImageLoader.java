package com.squareup.cash.appmessages.views;

import android.content.Context;
import coil3.RealImageLoader;

/* loaded from: classes.dex */
public final class RealAppMessageImageLoader {
    public final Context context;
    public final RealImageLoader imageLoader;

    public RealAppMessageImageLoader(Context context, RealImageLoader realImageLoader) {
        this.context = context;
        this.imageLoader = realImageLoader;
    }
}
