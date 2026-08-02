package com.squareup.cash.profile.views;

import android.graphics.Bitmap;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.AndroidImageBitmap;
import coil3.Image;
import coil3.Image_androidKt;
import coil3.target.Target;

/* loaded from: classes6.dex */
public final class OpenSourceKt$OpenSource$1$1$2 implements Target {
    public final /* synthetic */ MutableState $konfettiState$delegate;

    @Override // coil3.target.Target
    public void onError(Image image) {
    }

    @Override // coil3.target.Target
    public void onStart(Image image) {
    }

    @Override // coil3.target.Target
    public void onSuccess(Image image) {
        Bitmap bitmap;
        bitmap = Image_androidKt.toBitmap(image, image.getWidth(), image.getHeight());
        this.$konfettiState$delegate.setValue(new AndroidImageBitmap(bitmap));
    }
}
