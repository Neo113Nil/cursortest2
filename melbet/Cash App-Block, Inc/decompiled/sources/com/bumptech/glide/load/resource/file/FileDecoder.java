package com.bumptech.glide.load.resource.file;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.gif.GifDrawableResource;
import java.io.File;

/* loaded from: classes4.dex */
public final class FileDecoder implements ResourceDecoder {
    public final /* synthetic */ int $r8$classId;

    @Override // com.bumptech.glide.load.ResourceDecoder
    public final Resource decode(Object obj, int i, int i2, Options options) {
        switch (this.$r8$classId) {
            case 0:
                return new FileResource((File) obj);
            case 1:
                return new FileResource((Bitmap) obj, 1);
            default:
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    return new GifDrawableResource(drawable, 1);
                }
                return null;
        }
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public final /* bridge */ /* synthetic */ boolean handles(Object obj, Options options) {
        switch (this.$r8$classId) {
            case 0:
                break;
            case 1:
                break;
            default:
                break;
        }
        return true;
    }
}
