package com.google.android.libraries.places.internal;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.request.target.ImageViewTarget;
import com.google.mlkit.common.sdkinternal.zzb;
import kotlin.reflect.full.KClasses$$Lambda$2;

/* loaded from: classes4.dex */
public final class zzql extends ImageViewTarget {
    public final ImageView zza;
    public final KClasses$$Lambda$2 zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzql(ImageView imageView, KClasses$$Lambda$2 kClasses$$Lambda$2) {
        super(imageView);
        imageView.getClass();
        this.zza = imageView;
        this.zzb = kClasses$$Lambda$2;
    }

    @Override // com.bumptech.glide.request.target.ImageViewTarget, com.bumptech.glide.request.target.Target
    public final void onLoadFailed(Drawable drawable) {
        KClasses$$Lambda$2 kClasses$$Lambda$2 = this.zzb;
        if (kClasses$$Lambda$2 != null) {
            kClasses$$Lambda$2.invoke(this.zza);
        }
    }

    @Override // com.bumptech.glide.request.target.ImageViewTarget
    public final /* bridge */ /* synthetic */ void setResource(Object obj) {
        this.zza.post(new zzb(this, (Bitmap) obj, false, 13));
    }
}
