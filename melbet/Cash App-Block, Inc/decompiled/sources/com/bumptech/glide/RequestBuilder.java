package com.bumptech.glide;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ImageView;
import androidx.camera.video.VideoCapture;
import androidx.collection.ArrayMap;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.CenterInside;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$None;
import com.bumptech.glide.load.resource.bitmap.FitCenter;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.ErrorRequestCoordinator;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.RequestCoordinator;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.SingleRequest;
import com.bumptech.glide.request.ThumbnailRequestCoordinator;
import com.bumptech.glide.request.target.BitmapImageViewTarget;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.util.Util;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class RequestBuilder extends BaseRequestOptions {
    public final Context context;
    public RequestBuilder errorBuilder;
    public final GlideContext glideContext;
    public final boolean isDefaultTransitionOptionsSet = true;
    public boolean isModelSet;
    public boolean isThumbnailBuilt;
    public Object model;
    public ArrayList requestListeners;
    public final RequestManager requestManager;
    public RequestBuilder thumbnailBuilder;
    public final Class transcodeClass;
    public GenericTransitionOptions transitionOptions;

    /* renamed from: com.bumptech.glide.RequestBuilder$1, reason: invalid class name */
    public abstract /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$android$widget$ImageView$ScaleType;
        public static final /* synthetic */ int[] $SwitchMap$com$bumptech$glide$Priority;

        static {
            int[] iArr = new int[Priority.values().length];
            $SwitchMap$com$bumptech$glide$Priority = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$bumptech$glide$Priority[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$bumptech$glide$Priority[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$bumptech$glide$Priority[0] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            $SwitchMap$android$widget$ImageView$ScaleType = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    static {
    }

    public RequestBuilder(Glide glide, RequestManager requestManager, Class cls, Context context) {
        RequestOptions requestOptions;
        this.requestManager = requestManager;
        this.transcodeClass = cls;
        this.context = context;
        ArrayMap arrayMap = requestManager.glide.glideContext.defaultTransitionOptions;
        GenericTransitionOptions genericTransitionOptions = (GenericTransitionOptions) arrayMap.get(cls);
        if (genericTransitionOptions == null) {
            Iterator it = ((ArrayMap.EntrySet) arrayMap.entrySet()).iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    genericTransitionOptions = (GenericTransitionOptions) entry.getValue();
                }
            }
        }
        this.transitionOptions = genericTransitionOptions == null ? GlideContext.DEFAULT_TRANSITION_OPTIONS : genericTransitionOptions;
        this.glideContext = glide.glideContext;
        Iterator it2 = requestManager.defaultRequestListeners.iterator();
        while (it2.hasNext()) {
            if (it2.next() != null) {
                a$$ExternalSyntheticBUOutline0.m$1();
                throw null;
            }
            addListener();
        }
        synchronized (requestManager) {
            requestOptions = requestManager.requestOptions;
        }
        apply((BaseRequestOptions) requestOptions);
    }

    public final RequestBuilder addListener() {
        if (this.isAutoCloneEnabled) {
            return mo1909clone().addListener();
        }
        selfOrThrowIfLocked();
        return this;
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public final RequestBuilder apply(BaseRequestOptions baseRequestOptions) {
        Util.checkNotNull(baseRequestOptions);
        return (RequestBuilder) super.apply(baseRequestOptions);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Request buildRequestRecursive(Object obj, Target target, RequestCoordinator requestCoordinator, GenericTransitionOptions genericTransitionOptions, Priority priority, int i, int i2, BaseRequestOptions baseRequestOptions) {
        RequestCoordinator requestCoordinator2;
        RequestCoordinator requestCoordinator3;
        BaseRequestOptions baseRequestOptions2;
        SingleRequest singleRequest;
        Priority priority2;
        if (this.errorBuilder != null) {
            requestCoordinator3 = new ErrorRequestCoordinator(obj, requestCoordinator);
            requestCoordinator2 = requestCoordinator3;
        } else {
            requestCoordinator2 = null;
            requestCoordinator3 = requestCoordinator;
        }
        RequestBuilder requestBuilder = this.thumbnailBuilder;
        if (requestBuilder == null) {
            Context context = this.context;
            GlideContext glideContext = this.glideContext;
            baseRequestOptions2 = baseRequestOptions;
            singleRequest = new SingleRequest(context, glideContext, obj, this.model, this.transcodeClass, baseRequestOptions2, i, i2, priority, target, this.requestListeners, requestCoordinator3, glideContext.engine, genericTransitionOptions.transitionFactory);
        } else {
            if (this.isThumbnailBuilt) {
                a$$ExternalSyntheticBUOutline0.m$1("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
                return null;
            }
            GenericTransitionOptions genericTransitionOptions2 = requestBuilder.isDefaultTransitionOptionsSet ? genericTransitionOptions : requestBuilder.transitionOptions;
            if (BaseRequestOptions.isSet(requestBuilder.fields, 8)) {
                priority2 = this.thumbnailBuilder.priority;
            } else {
                int ordinal = priority.ordinal();
                if (ordinal == 0 || ordinal == 1) {
                    priority2 = Priority.IMMEDIATE;
                } else if (ordinal == 2) {
                    priority2 = Priority.HIGH;
                } else {
                    if (ordinal != 3) {
                        Path$$ExternalSyntheticBUOutline0.m(this.priority, "unknown priority: ");
                        return null;
                    }
                    priority2 = Priority.NORMAL;
                }
            }
            Priority priority3 = priority2;
            RequestBuilder requestBuilder2 = this.thumbnailBuilder;
            int i3 = requestBuilder2.overrideWidth;
            int i4 = requestBuilder2.overrideHeight;
            if (Util.isValidDimensions(i, i2)) {
                RequestBuilder requestBuilder3 = this.thumbnailBuilder;
                if (!Util.isValidDimensions(requestBuilder3.overrideWidth, requestBuilder3.overrideHeight)) {
                    i3 = baseRequestOptions.overrideWidth;
                    i4 = baseRequestOptions.overrideHeight;
                }
            }
            int i5 = i4;
            int i6 = i3;
            ThumbnailRequestCoordinator thumbnailRequestCoordinator = new ThumbnailRequestCoordinator(obj, requestCoordinator3);
            Context context2 = this.context;
            GlideContext glideContext2 = this.glideContext;
            SingleRequest singleRequest2 = new SingleRequest(context2, glideContext2, obj, this.model, this.transcodeClass, baseRequestOptions, i, i2, priority, target, this.requestListeners, thumbnailRequestCoordinator, glideContext2.engine, genericTransitionOptions.transitionFactory);
            this.isThumbnailBuilt = true;
            RequestBuilder requestBuilder4 = this.thumbnailBuilder;
            Request buildRequestRecursive = requestBuilder4.buildRequestRecursive(obj, target, thumbnailRequestCoordinator, genericTransitionOptions2, priority3, i6, i5, requestBuilder4);
            this.isThumbnailBuilt = false;
            thumbnailRequestCoordinator.full = singleRequest2;
            thumbnailRequestCoordinator.thumb = buildRequestRecursive;
            baseRequestOptions2 = baseRequestOptions;
            singleRequest = thumbnailRequestCoordinator;
        }
        if (requestCoordinator2 == null) {
            return singleRequest;
        }
        RequestBuilder requestBuilder5 = this.errorBuilder;
        int i7 = requestBuilder5.overrideWidth;
        int i8 = requestBuilder5.overrideHeight;
        if (Util.isValidDimensions(i, i2)) {
            RequestBuilder requestBuilder6 = this.errorBuilder;
            if (!Util.isValidDimensions(requestBuilder6.overrideWidth, requestBuilder6.overrideHeight)) {
                i7 = baseRequestOptions2.overrideWidth;
                i8 = baseRequestOptions2.overrideHeight;
            }
        }
        RequestBuilder requestBuilder7 = this.errorBuilder;
        ErrorRequestCoordinator errorRequestCoordinator = requestCoordinator2;
        Request buildRequestRecursive2 = requestBuilder7.buildRequestRecursive(obj, target, errorRequestCoordinator, requestBuilder7.transitionOptions, requestBuilder7.priority, i7, i8, requestBuilder7);
        errorRequestCoordinator.primary = singleRequest;
        errorRequestCoordinator.error = buildRequestRecursive2;
        return errorRequestCoordinator;
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* renamed from: clone */
    public final RequestBuilder mo1909clone() {
        RequestBuilder requestBuilder = (RequestBuilder) super.mo1909clone();
        requestBuilder.transitionOptions = requestBuilder.transitionOptions.m1908clone();
        if (requestBuilder.requestListeners != null) {
            requestBuilder.requestListeners = new ArrayList(requestBuilder.requestListeners);
        }
        RequestBuilder requestBuilder2 = requestBuilder.thumbnailBuilder;
        if (requestBuilder2 != null) {
            requestBuilder.thumbnailBuilder = requestBuilder2.mo1909clone();
        }
        RequestBuilder requestBuilder3 = requestBuilder.errorBuilder;
        if (requestBuilder3 != null) {
            requestBuilder.errorBuilder = requestBuilder3.mo1909clone();
        }
        return requestBuilder;
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public final boolean equals(Object obj) {
        if (!(obj instanceof RequestBuilder)) {
            return false;
        }
        RequestBuilder requestBuilder = (RequestBuilder) obj;
        return super.equals(requestBuilder) && Objects.equals(this.transcodeClass, requestBuilder.transcodeClass) && this.transitionOptions.equals(requestBuilder.transitionOptions) && Objects.equals(this.model, requestBuilder.model) && Objects.equals(this.requestListeners, requestBuilder.requestListeners) && Objects.equals(this.thumbnailBuilder, requestBuilder.thumbnailBuilder) && Objects.equals(this.errorBuilder, requestBuilder.errorBuilder) && this.isDefaultTransitionOptionsSet == requestBuilder.isDefaultTransitionOptionsSet && this.isModelSet == requestBuilder.isModelSet;
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public final int hashCode() {
        return Util.hashCode(this.isModelSet ? 1 : 0, Util.hashCode(this.isDefaultTransitionOptionsSet ? 1 : 0, Util.hashCode(Util.hashCode(Util.hashCode(Util.hashCode(Util.hashCode(Util.hashCode(Util.hashCode(super.hashCode(), this.transcodeClass), this.transitionOptions), this.model), this.requestListeners), this.thumbnailBuilder), this.errorBuilder), (Object) null)));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void into(ImageView imageView) {
        BaseRequestOptions baseRequestOptions;
        Class cls;
        BitmapImageViewTarget bitmapImageViewTarget;
        Util.assertMainThread();
        Util.checkNotNull(imageView);
        if (!BaseRequestOptions.isSet(this.fields, 2048) && imageView.getScaleType() != null) {
            switch (AnonymousClass1.$SwitchMap$android$widget$ImageView$ScaleType[imageView.getScaleType().ordinal()]) {
                case 1:
                    baseRequestOptions = mo1909clone().optionalTransform(DownsampleStrategy$None.CENTER_OUTSIDE, new CenterCrop());
                    break;
                case 2:
                    baseRequestOptions = mo1909clone().optionalTransform(DownsampleStrategy$None.CENTER_INSIDE, new CenterInside());
                    baseRequestOptions.isScaleOnlyOrNoTransform = true;
                    break;
                case 3:
                case 4:
                case 5:
                    baseRequestOptions = mo1909clone().optionalTransform(DownsampleStrategy$None.FIT_CENTER, new FitCenter());
                    baseRequestOptions.isScaleOnlyOrNoTransform = true;
                    break;
                case 6:
                    baseRequestOptions = mo1909clone().optionalTransform(DownsampleStrategy$None.CENTER_INSIDE, new CenterInside());
                    baseRequestOptions.isScaleOnlyOrNoTransform = true;
                    break;
            }
            this.glideContext.imageViewTargetFactory.getClass();
            cls = this.transcodeClass;
            if (!Bitmap.class.equals(cls)) {
                bitmapImageViewTarget = new BitmapImageViewTarget(imageView, 0);
            } else {
                if (!Drawable.class.isAssignableFrom(cls)) {
                    a$$ExternalSyntheticBUOutline0.m$3(Boxes$$ExternalSyntheticOutline1.m(cls, "Unhandled class: ", ", try .as*(Class).transcode(ResourceTranscoder)"));
                    return;
                }
                bitmapImageViewTarget = new BitmapImageViewTarget(imageView, 1);
            }
            into(bitmapImageViewTarget, baseRequestOptions);
        }
        baseRequestOptions = this;
        this.glideContext.imageViewTargetFactory.getClass();
        cls = this.transcodeClass;
        if (!Bitmap.class.equals(cls)) {
        }
        into(bitmapImageViewTarget, baseRequestOptions);
    }

    public final RequestBuilder loadGeneric(Object obj) {
        if (this.isAutoCloneEnabled) {
            return mo1909clone().loadGeneric(obj);
        }
        this.model = obj;
        this.isModelSet = true;
        selfOrThrowIfLocked();
        return this;
    }

    public final void into(Target target, BaseRequestOptions baseRequestOptions) {
        Util.checkNotNull(target);
        if (this.isModelSet) {
            Request buildRequestRecursive = buildRequestRecursive(new Object(), target, null, this.transitionOptions, baseRequestOptions.priority, baseRequestOptions.overrideWidth, baseRequestOptions.overrideHeight, baseRequestOptions);
            Request request = target.getRequest();
            if (buildRequestRecursive.isEquivalentTo(request) && (baseRequestOptions.isCacheable || !request.isComplete())) {
                Util.checkNotNull(request, "Argument must not be null");
                if (request.isRunning()) {
                    return;
                }
                request.begin();
                return;
            }
            this.requestManager.clear(target);
            target.setRequest(buildRequestRecursive);
            RequestManager requestManager = this.requestManager;
            synchronized (requestManager) {
                requestManager.targetTracker.targets.add(target);
                VideoCapture.AnonymousClass3 anonymousClass3 = requestManager.requestTracker;
                ((Set) anonymousClass3.val$surfaceUpdateFuture).add(buildRequestRecursive);
                if (!anonymousClass3.val$isStreamActive) {
                    buildRequestRecursive.begin();
                } else {
                    buildRequestRecursive.clear();
                    if (Log.isLoggable("RequestTracker", 2)) {
                        Log.v("RequestTracker", "Paused, delaying request");
                    }
                    ((HashSet) anonymousClass3.this$0).add(buildRequestRecursive);
                }
            }
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$3("You must call #load() before calling #into()");
    }
}
