package com.bumptech.glide.load.resource.file;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.util.Util;
import java.io.File;

/* loaded from: classes4.dex */
public final class FileResource implements Resource {
    public final /* synthetic */ int $r8$classId;
    public final Object data;

    public FileResource(byte[] bArr) {
        this.$r8$classId = 2;
        Util.checkNotNull(bArr, "Argument must not be null");
        this.data = bArr;
    }

    private final void recycle$com$bumptech$glide$load$resource$bitmap$UnitBitmapDecoder$NonOwnedBitmapResource() {
    }

    private final void recycle$com$bumptech$glide$load$resource$bytes$BytesResource() {
    }

    private final void recycle$com$bumptech$glide$load$resource$file$FileResource() {
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final Object get() {
        int i = this.$r8$classId;
        Object obj = this.data;
        switch (i) {
            case 0:
                return (File) obj;
            case 1:
                return (Bitmap) obj;
            case 2:
                return (byte[]) obj;
            default:
                return (AnimatedImageDrawable) obj;
        }
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final Class getResourceClass() {
        switch (this.$r8$classId) {
            case 0:
                return ((File) this.data).getClass();
            case 1:
                return Bitmap.class;
            case 2:
                return byte[].class;
            default:
                return Drawable.class;
        }
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final int getSize() {
        int i = this.$r8$classId;
        Object obj = this.data;
        switch (i) {
            case 0:
                return 1;
            case 1:
                return Util.getBitmapByteSize((Bitmap) obj);
            case 2:
                return ((byte[]) obj).length;
            default:
                AnimatedImageDrawable animatedImageDrawable = (AnimatedImageDrawable) obj;
                return Util.getBytesPerPixel(Bitmap.Config.ARGB_8888) * animatedImageDrawable.getIntrinsicHeight() * animatedImageDrawable.getIntrinsicWidth() * 2;
        }
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final void recycle() {
        switch (this.$r8$classId) {
            case 0:
            case 1:
            case 2:
                break;
            default:
                AnimatedImageDrawable animatedImageDrawable = (AnimatedImageDrawable) this.data;
                animatedImageDrawable.stop();
                animatedImageDrawable.clearAnimationCallbacks();
                break;
        }
    }

    public /* synthetic */ FileResource(Object obj, int i) {
        this.$r8$classId = i;
        this.data = obj;
    }

    public FileResource(File file) {
        this.$r8$classId = 0;
        Util.checkNotNull(file, "Argument must not be null");
        this.data = file;
    }
}
