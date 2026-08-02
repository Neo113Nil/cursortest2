package com.bumptech.glide.request.target;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* loaded from: classes4.dex */
public final class BitmapImageViewTarget extends ImageViewTarget {
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BitmapImageViewTarget(ImageView imageView, int i) {
        super(imageView);
        this.$r8$classId = i;
    }

    @Override // com.bumptech.glide.request.target.ImageViewTarget
    public final void setResource(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                this.view.setImageBitmap((Bitmap) obj);
                break;
            default:
                this.view.setImageDrawable((Drawable) obj);
                break;
        }
    }
}
