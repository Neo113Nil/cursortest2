package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bumptech.glide.Glide;
import com.bumptech.glide.GlideContext;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.gifdecoder.GifFrame;
import com.bumptech.glide.gifdecoder.StandardGifDecoder;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.DiskCacheStrategy$2;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.UnitTransformation;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.SingleRequest;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.signature.ObjectKey;
import com.bumptech.glide.util.Util;
import com.google.android.gms.cloudmessaging.zzm;
import java.util.ArrayList;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class GifFrameLoader {
    public final BitmapPool bitmapPool;
    public final ArrayList callbacks;
    public DelayTarget current;
    public Bitmap firstFrame;
    public int firstFrameSize;
    public final StandardGifDecoder gifDecoder;
    public final Handler handler;
    public int height;
    public boolean isCleared;
    public boolean isLoadPending;
    public boolean isRunning;
    public DelayTarget next;
    public DelayTarget pendingTarget;
    public RequestBuilder requestBuilder;
    public final RequestManager requestManager;
    public int width;

    public final class DelayTarget implements Target {
        public final Handler handler;
        public final int height;
        public final int index;
        public Request request;
        public Bitmap resource;
        public final long targetTime;
        public final int width;

        public DelayTarget(Handler handler, int i, long j) {
            if (!Util.isValidDimensions(PKIFailureInfo.systemUnavail, PKIFailureInfo.systemUnavail)) {
                a$$ExternalSyntheticBUOutline0.m$3("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
                throw null;
            }
            this.width = PKIFailureInfo.systemUnavail;
            this.height = PKIFailureInfo.systemUnavail;
            this.handler = handler;
            this.index = i;
            this.targetTime = j;
        }

        @Override // com.bumptech.glide.request.target.Target
        public final Request getRequest() {
            return this.request;
        }

        @Override // com.bumptech.glide.request.target.Target
        public final void getSize(SingleRequest singleRequest) {
            singleRequest.onSizeReady(this.width, this.height);
        }

        @Override // com.bumptech.glide.manager.LifecycleListener
        public final void onDestroy() {
        }

        @Override // com.bumptech.glide.request.target.Target
        public final void onLoadCleared(Drawable drawable) {
            this.resource = null;
        }

        @Override // com.bumptech.glide.request.target.Target
        public final void onLoadFailed(Drawable drawable) {
        }

        @Override // com.bumptech.glide.request.target.Target
        public final void onLoadStarted(Drawable drawable) {
        }

        @Override // com.bumptech.glide.request.target.Target
        public final void onResourceReady(Object obj) {
            this.resource = (Bitmap) obj;
            Handler handler = this.handler;
            handler.sendMessageAtTime(handler.obtainMessage(1, this), this.targetTime);
        }

        @Override // com.bumptech.glide.manager.LifecycleListener
        public final void onStart() {
        }

        @Override // com.bumptech.glide.manager.LifecycleListener
        public final void onStop() {
        }

        @Override // com.bumptech.glide.request.target.Target
        public final void removeCallback(SingleRequest singleRequest) {
        }

        @Override // com.bumptech.glide.request.target.Target
        public final void setRequest(Request request) {
            this.request = request;
        }
    }

    public GifFrameLoader(Glide glide, StandardGifDecoder standardGifDecoder, int i, int i2, Bitmap bitmap) {
        BitmapPool bitmapPool = glide.bitmapPool;
        GlideContext glideContext = glide.glideContext;
        Context baseContext = glideContext.getBaseContext();
        Util.checkNotNull(baseContext, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        RequestManager requestManager = Glide.get(baseContext).requestManagerRetriever.get(baseContext);
        Context baseContext2 = glideContext.getBaseContext();
        Util.checkNotNull(baseContext2, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        RequestManager requestManager2 = Glide.get(baseContext2).requestManagerRetriever.get(baseContext2);
        requestManager2.getClass();
        RequestBuilder apply = new RequestBuilder(requestManager2.glide, requestManager2, Bitmap.class, requestManager2.context).apply((BaseRequestOptions) RequestManager.DECODE_TYPE_BITMAP).apply(((RequestOptions) ((RequestOptions) ((RequestOptions) new RequestOptions().diskCacheStrategy(DiskCacheStrategy$2.NONE)).useAnimationPool()).skipMemoryCache()).override(i, i2));
        this.callbacks = new ArrayList();
        this.requestManager = requestManager;
        Handler handler = new Handler(Looper.getMainLooper(), new zzm(this, 1));
        this.bitmapPool = bitmapPool;
        this.handler = handler;
        this.requestBuilder = apply;
        this.gifDecoder = standardGifDecoder;
        setFrameTransformation(UnitTransformation.TRANSFORMATION, bitmap);
    }

    public final void loadNextFrame() {
        int i;
        if (!this.isRunning || this.isLoadPending) {
            return;
        }
        DelayTarget delayTarget = this.pendingTarget;
        if (delayTarget != null) {
            this.pendingTarget = null;
            onFrameReady(delayTarget);
            return;
        }
        this.isLoadPending = true;
        StandardGifDecoder standardGifDecoder = this.gifDecoder;
        int i2 = standardGifDecoder.header.frameCount;
        long uptimeMillis = SystemClock.uptimeMillis() + ((i2 <= 0 || (i = standardGifDecoder.framePointer) < 0) ? 0 : (i < 0 || i >= i2) ? -1 : ((GifFrame) r2.frames.get(i)).delay);
        int i3 = (standardGifDecoder.framePointer + 1) % standardGifDecoder.header.frameCount;
        standardGifDecoder.framePointer = i3;
        this.next = new DelayTarget(this.handler, i3, uptimeMillis);
        RequestBuilder loadGeneric = this.requestBuilder.apply(new RequestOptions().signature(new ObjectKey(Double.valueOf(Math.random())))).loadGeneric(standardGifDecoder);
        loadGeneric.into(this.next, loadGeneric);
    }

    public final void onFrameReady(DelayTarget delayTarget) {
        this.isLoadPending = false;
        boolean z = this.isCleared;
        Handler handler = this.handler;
        if (z) {
            handler.obtainMessage(2, delayTarget).sendToTarget();
            return;
        }
        if (!this.isRunning) {
            this.pendingTarget = delayTarget;
            return;
        }
        if (delayTarget.resource != null) {
            Bitmap bitmap = this.firstFrame;
            if (bitmap != null) {
                this.bitmapPool.put(bitmap);
                this.firstFrame = null;
            }
            DelayTarget delayTarget2 = this.current;
            this.current = delayTarget;
            ArrayList arrayList = this.callbacks;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                GifDrawable gifDrawable = (GifDrawable) arrayList.get(size);
                Object callback = gifDrawable.getCallback();
                while (callback instanceof Drawable) {
                    callback = ((Drawable) callback).getCallback();
                }
                if (callback == null) {
                    gifDrawable.stop();
                    gifDrawable.invalidateSelf();
                } else {
                    gifDrawable.invalidateSelf();
                    DelayTarget delayTarget3 = ((GifFrameLoader) gifDrawable.state.frameLoader).current;
                    if ((delayTarget3 != null ? delayTarget3.index : -1) == r5.gifDecoder.header.frameCount - 1) {
                        gifDrawable.loopCount++;
                    }
                    int i = gifDrawable.maxLoopCount;
                    if (i != -1 && gifDrawable.loopCount >= i) {
                        gifDrawable.stop();
                    }
                }
            }
            if (delayTarget2 != null) {
                handler.obtainMessage(2, delayTarget2).sendToTarget();
            }
        }
        loadNextFrame();
    }

    public final void setFrameTransformation(Transformation transformation, Bitmap bitmap) {
        Util.checkNotNull(transformation, "Argument must not be null");
        Util.checkNotNull(bitmap, "Argument must not be null");
        this.firstFrame = bitmap;
        this.requestBuilder = this.requestBuilder.apply(new RequestOptions().transform(transformation, true));
        this.firstFrameSize = Util.getBitmapByteSize(bitmap);
        this.width = bitmap.getWidth();
        this.height = bitmap.getHeight();
    }
}
