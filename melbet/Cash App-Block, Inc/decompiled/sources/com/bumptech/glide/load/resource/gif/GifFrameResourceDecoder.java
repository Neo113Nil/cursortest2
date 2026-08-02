package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import androidx.media3.extractor.text.CueEncoder;
import com.bumptech.glide.gifdecoder.StandardGifDecoder;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.DefaultOnHeaderDecodedListener;
import com.bumptech.glide.load.resource.bitmap.BitmapResource;

/* loaded from: classes4.dex */
public final class GifFrameResourceDecoder implements ResourceDecoder {
    public final /* synthetic */ int $r8$classId;
    public final BitmapPool bitmapPool;

    public GifFrameResourceDecoder() {
        this.$r8$classId = 1;
        this.bitmapPool = new CueEncoder(18);
    }

    public BitmapResource decode(ImageDecoder.Source source, int i, int i2, Options options) {
        Bitmap decodeBitmap = ImageDecoder.decodeBitmap(source, new DefaultOnHeaderDecodedListener(i, i2, options));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + decodeBitmap.getWidth() + "x" + decodeBitmap.getHeight() + "] for [" + i + "x" + i2 + "]");
        }
        return new BitmapResource(decodeBitmap, (CueEncoder) this.bitmapPool);
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public final /* bridge */ /* synthetic */ boolean handles(Object obj, Options options) {
        switch (this.$r8$classId) {
            case 0:
                break;
            default:
                break;
        }
        return true;
    }

    public GifFrameResourceDecoder(BitmapPool bitmapPool) {
        this.$r8$classId = 0;
        this.bitmapPool = bitmapPool;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public final Resource decode(Object obj, int i, int i2, Options options) {
        switch (this.$r8$classId) {
            case 0:
                return BitmapResource.obtain(((StandardGifDecoder) obj).getNextFrame(), this.bitmapPool);
            default:
                return decode((ImageDecoder.Source) obj, i, i2, options);
        }
    }
}
