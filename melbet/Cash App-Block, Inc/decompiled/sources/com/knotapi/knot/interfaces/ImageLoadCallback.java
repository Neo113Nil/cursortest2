package com.knotapi.knot.interfaces;

import android.graphics.Bitmap;

/* loaded from: classes4.dex */
public interface ImageLoadCallback {
    void onImageLoadFailed();

    void onImageLoaded(Bitmap bitmap);
}
