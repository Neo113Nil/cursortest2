package com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.statusandfamily;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.appcompat.widget.AppCompatImageView;

/* loaded from: classes5.dex */
public final class a extends AppCompatImageView {
    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageBitmap(Bitmap bitmap) {
        Bitmap.Config config;
        if (bitmap != null && Build.VERSION.SDK_INT >= 26) {
            Bitmap.Config config2 = bitmap.getConfig();
            config = Bitmap.Config.HARDWARE;
            if (config2 == config) {
                bitmap = bitmap.copy(Bitmap.Config.ARGB_8888, false);
            }
        }
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        Bitmap.Config config;
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            bitmap.getClass();
            if (Build.VERSION.SDK_INT >= 26) {
                Bitmap.Config config2 = bitmap.getConfig();
                config = Bitmap.Config.HARDWARE;
                if (config2 == config) {
                    Bitmap bitmap2 = bitmapDrawable.getBitmap();
                    bitmap2.getClass();
                    Bitmap copy = bitmap2.copy(Bitmap.Config.ARGB_8888, false);
                    copy.getClass();
                    Resources resources = getContext().getResources();
                    resources.getClass();
                    drawable = new BitmapDrawable(resources, copy);
                }
            }
        }
        super.setImageDrawable(drawable);
    }
}
