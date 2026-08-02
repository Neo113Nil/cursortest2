package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.camera.video.VideoCapture;
import androidx.collection.ArrayMap;
import coil3.request.ViewTargetDisposable;
import com.bumptech.glide.load.engine.Engine;
import com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.transition.NoTransition;
import com.fillr.m1;
import java.util.List;

/* loaded from: classes4.dex */
public final class GlideContext extends ContextWrapper {
    public static final GenericTransitionOptions DEFAULT_TRANSITION_OPTIONS;
    public final LruArrayPool arrayPool;
    public final List defaultRequestListeners;
    public RequestOptions defaultRequestOptions;
    public final GlideBuilder$1 defaultRequestOptionsFactory;
    public final ArrayMap defaultTransitionOptions;
    public final Engine engine;
    public final m1 experiments;
    public final GlideBuilder$1 imageViewTargetFactory;
    public final int logLevel;
    public final ViewTargetDisposable registry;

    static {
        GenericTransitionOptions genericTransitionOptions = new GenericTransitionOptions();
        genericTransitionOptions.transitionFactory = NoTransition.NO_ANIMATION_FACTORY;
        DEFAULT_TRANSITION_OPTIONS = genericTransitionOptions;
    }

    public GlideContext(Context context, LruArrayPool lruArrayPool, VideoCapture.AnonymousClass3 anonymousClass3, GlideBuilder$1 glideBuilder$1, GlideBuilder$1 glideBuilder$12, ArrayMap arrayMap, List list, Engine engine, m1 m1Var) {
        super(context.getApplicationContext());
        this.arrayPool = lruArrayPool;
        this.imageViewTargetFactory = glideBuilder$1;
        this.defaultRequestOptionsFactory = glideBuilder$12;
        this.defaultRequestListeners = list;
        this.defaultTransitionOptions = arrayMap;
        this.engine = engine;
        this.experiments = m1Var;
        this.logLevel = 4;
        this.registry = new ViewTargetDisposable(anonymousClass3);
    }

    public final Registry getRegistry() {
        return (Registry) this.registry.get();
    }
}
