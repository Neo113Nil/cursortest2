package com.bumptech.glide.load.resource.bitmap;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.engine.Initializable;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.util.Util;

/* loaded from: classes4.dex */
public final class BitmapResource implements Resource, Initializable {
    public final /* synthetic */ int $r8$classId = 1;
    public final Object bitmap;
    public final Object bitmapPool;

    public BitmapResource(Bitmap bitmap, BitmapPool bitmapPool) {
        Util.checkNotNull(bitmap, "Bitmap must not be null");
        this.bitmap = bitmap;
        Util.checkNotNull(bitmapPool, "BitmapPool must not be null");
        this.bitmapPool = bitmapPool;
    }

    public static BitmapResource obtain(Bitmap bitmap, BitmapPool bitmapPool) {
        if (bitmap == null) {
            return null;
        }
        return new BitmapResource(bitmap, bitmapPool);
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final Object get() {
        switch (this.$r8$classId) {
            case 0:
                return (Bitmap) this.bitmap;
            default:
                return new BitmapDrawable((Resources) this.bitmap, (Bitmap) ((Resource) this.bitmapPool).get());
        }
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final Class getResourceClass() {
        switch (this.$r8$classId) {
            case 0:
                return Bitmap.class;
            default:
                return BitmapDrawable.class;
        }
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final int getSize() {
        switch (this.$r8$classId) {
            case 0:
                return Util.getBitmapByteSize((Bitmap) this.bitmap);
            default:
                return ((Resource) this.bitmapPool).getSize();
        }
    }

    @Override // com.bumptech.glide.load.engine.Initializable
    public final void initialize() {
        switch (this.$r8$classId) {
            case 0:
                ((Bitmap) this.bitmap).prepareToDraw();
                break;
            default:
                Resource resource = (Resource) this.bitmapPool;
                if (resource instanceof Initializable) {
                    ((Initializable) resource).initialize();
                    break;
                }
                break;
        }
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final void recycle() {
        switch (this.$r8$classId) {
            case 0:
                ((BitmapPool) this.bitmapPool).put((Bitmap) this.bitmap);
                break;
            default:
                ((Resource) this.bitmapPool).recycle();
                break;
        }
    }

    public BitmapResource(Resources resources, Resource resource) {
        Util.checkNotNull(resources, "Argument must not be null");
        this.bitmap = resources;
        Util.checkNotNull(resource, "Argument must not be null");
        this.bitmapPool = resource;
    }
}
