package com.google.android.libraries.places.widget.internal.placedetails.photoviewer;

import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.BitmapTransformation;
import java.security.MessageDigest;
import java.util.Objects;
import kotlin.text.Charsets;

/* loaded from: classes9.dex */
public final class zza extends BitmapTransformation {
    public final Context zzc;

    public zza(Context context) {
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.zzc = applicationContext;
    }

    @Override // com.bumptech.glide.load.Key
    public final boolean equals(Object obj) {
        Object valueOf = Float.valueOf(0.125f);
        Object valueOf2 = Float.valueOf(25.0f);
        if (obj == null || !(obj instanceof zza)) {
            return false;
        }
        return valueOf2.equals(valueOf2) && valueOf.equals(valueOf);
    }

    @Override // com.bumptech.glide.load.Key
    public final int hashCode() {
        return Objects.hash("com.google.android.libraries.places.widget.internal.placedetails.photoviewer.BlurTransformation", Float.valueOf(25.0f), Float.valueOf(0.125f));
    }

    @Override // com.bumptech.glide.load.resource.bitmap.BitmapTransformation
    public final Bitmap transform(BitmapPool bitmapPool, Bitmap bitmap, int i, int i2) {
        bitmapPool.getClass();
        bitmap.getClass();
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, Math.round(bitmap.getWidth() * 0.125f), Math.round(bitmap.getHeight() * 0.125f), false);
        Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap);
        createBitmap.getClass();
        RenderScript create = RenderScript.create(this.zzc);
        ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
        Allocation createFromBitmap = Allocation.createFromBitmap(create, createScaledBitmap);
        Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
        try {
            create2.setRadius(25.0f);
            create2.setInput(createFromBitmap);
            create2.forEach(createFromBitmap2);
            createFromBitmap2.copyTo(createBitmap);
            return createBitmap;
        } finally {
            createScaledBitmap.recycle();
            createFromBitmap.destroy();
            createFromBitmap2.destroy();
            create2.destroy();
            create.destroy();
        }
    }

    @Override // com.bumptech.glide.load.Key
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.getClass();
        byte[] bytes = "blurred".getBytes(Charsets.UTF_8);
        bytes.getClass();
        messageDigest.update(bytes);
        messageDigest.update((byte) -6);
        messageDigest.update((byte) 1);
    }
}
