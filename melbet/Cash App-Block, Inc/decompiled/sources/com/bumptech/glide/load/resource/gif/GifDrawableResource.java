package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import coil3.svg.internal.AndroidSvg;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.gifdecoder.StandardGifDecoder;
import com.bumptech.glide.load.engine.Initializable;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool;
import com.bumptech.glide.load.resource.gif.GifFrameLoader;
import com.bumptech.glide.util.Util;

/* loaded from: classes4.dex */
public final class GifDrawableResource implements Resource, Initializable {
    public final /* synthetic */ int $r8$classId;
    public final Drawable drawable;

    public GifDrawableResource(Drawable drawable, int i) {
        this.$r8$classId = i;
        Util.checkNotNull(drawable, "Argument must not be null");
        this.drawable = drawable;
    }

    private final void recycle$com$bumptech$glide$load$resource$drawable$NonOwnedDrawableResource() {
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final Object get() {
        Drawable drawable = this.drawable;
        Drawable.ConstantState constantState = drawable.getConstantState();
        return constantState == null ? drawable : constantState.newDrawable();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final Class getResourceClass() {
        switch (this.$r8$classId) {
            case 0:
                return GifDrawable.class;
            default:
                return this.drawable.getClass();
        }
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final int getSize() {
        int i = this.$r8$classId;
        Drawable drawable = this.drawable;
        switch (i) {
            case 0:
                GifFrameLoader gifFrameLoader = (GifFrameLoader) ((GifDrawable) drawable).state.frameLoader;
                StandardGifDecoder standardGifDecoder = gifFrameLoader.gifDecoder;
                return (standardGifDecoder.mainScratch.length * 4) + standardGifDecoder.rawData.limit() + standardGifDecoder.mainPixels.length + gifFrameLoader.firstFrameSize;
            default:
                return Math.max(1, drawable.getIntrinsicHeight() * drawable.getIntrinsicWidth() * 4);
        }
    }

    @Override // com.bumptech.glide.load.engine.Initializable
    public void initialize() {
        int i = this.$r8$classId;
        Drawable drawable = this.drawable;
        switch (i) {
            case 0:
                ((GifFrameLoader) ((GifDrawable) drawable).state.frameLoader).firstFrame.prepareToDraw();
                break;
            default:
                if (!(drawable instanceof BitmapDrawable)) {
                    if (drawable instanceof GifDrawable) {
                        ((GifFrameLoader) ((GifDrawable) drawable).state.frameLoader).firstFrame.prepareToDraw();
                        break;
                    }
                } else {
                    ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
                    break;
                }
                break;
        }
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final void recycle() {
        LruArrayPool lruArrayPool;
        LruArrayPool lruArrayPool2;
        LruArrayPool lruArrayPool3;
        switch (this.$r8$classId) {
            case 0:
                GifDrawable gifDrawable = (GifDrawable) this.drawable;
                gifDrawable.stop();
                gifDrawable.isRecycled = true;
                GifFrameLoader gifFrameLoader = (GifFrameLoader) gifDrawable.state.frameLoader;
                RequestManager requestManager = gifFrameLoader.requestManager;
                gifFrameLoader.callbacks.clear();
                Bitmap bitmap = gifFrameLoader.firstFrame;
                if (bitmap != null) {
                    gifFrameLoader.bitmapPool.put(bitmap);
                    gifFrameLoader.firstFrame = null;
                }
                gifFrameLoader.isRunning = false;
                GifFrameLoader.DelayTarget delayTarget = gifFrameLoader.current;
                if (delayTarget != null) {
                    requestManager.clear(delayTarget);
                    gifFrameLoader.current = null;
                }
                GifFrameLoader.DelayTarget delayTarget2 = gifFrameLoader.next;
                if (delayTarget2 != null) {
                    requestManager.clear(delayTarget2);
                    gifFrameLoader.next = null;
                }
                GifFrameLoader.DelayTarget delayTarget3 = gifFrameLoader.pendingTarget;
                if (delayTarget3 != null) {
                    requestManager.clear(delayTarget3);
                    gifFrameLoader.pendingTarget = null;
                }
                StandardGifDecoder standardGifDecoder = gifFrameLoader.gifDecoder;
                AndroidSvg androidSvg = standardGifDecoder.bitmapProvider;
                standardGifDecoder.header = null;
                byte[] bArr = standardGifDecoder.mainPixels;
                if (bArr != null && (lruArrayPool3 = (LruArrayPool) androidSvg.renderOptions) != null) {
                    lruArrayPool3.put(bArr);
                }
                int[] iArr = standardGifDecoder.mainScratch;
                if (iArr != null && (lruArrayPool2 = (LruArrayPool) androidSvg.renderOptions) != null) {
                    lruArrayPool2.put(iArr);
                }
                Bitmap bitmap2 = standardGifDecoder.previousImage;
                if (bitmap2 != null) {
                    ((BitmapPool) androidSvg.svg).put(bitmap2);
                }
                standardGifDecoder.previousImage = null;
                standardGifDecoder.rawData = null;
                standardGifDecoder.isFirstFrameTransparent = null;
                byte[] bArr2 = standardGifDecoder.block;
                if (bArr2 != null && (lruArrayPool = (LruArrayPool) androidSvg.renderOptions) != null) {
                    lruArrayPool.put(bArr2);
                }
                gifFrameLoader.isCleared = true;
                break;
        }
    }
}
