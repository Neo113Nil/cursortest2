package com.bumptech.glide.manager;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.CueEncoder;
import androidx.room.CoroutinesRoom;
import androidx.transition.Transition;
import app.cash.zipline.CallResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.android.volley.toolbox.HurlStack;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.load.resource.bitmap.HardwareConfigState;
import com.bumptech.glide.util.Util;
import java.io.File;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class RequestManagerRetriever implements Handler.Callback {
    public static final HurlStack DEFAULT_FACTORY = new HurlStack(22);
    public volatile RequestManager applicationManager;
    public final Transition.AnonymousClass1 frameWaiter;
    public final CallResult lifecycleRequestManagerRetriever;

    public RequestManagerRetriever() {
        CallResult callResult = new CallResult();
        callResult.result = new HashMap();
        callResult.serviceNames = DEFAULT_FACTORY;
        this.lifecycleRequestManagerRetriever = callResult;
        File file = HardwareConfigState.FD_SIZE_LIST;
        this.frameWaiter = new Transition.AnonymousClass1();
    }

    public static Activity findActivity(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return findActivity(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public final RequestManager get(FragmentActivity fragmentActivity) {
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            return get(fragmentActivity.getApplicationContext());
        }
        if (fragmentActivity.isDestroyed()) {
            a$$ExternalSyntheticBUOutline0.m$3("You cannot start a load for a destroyed activity");
            return null;
        }
        this.frameWaiter.getClass();
        Activity findActivity = findActivity(fragmentActivity);
        boolean z = findActivity == null || !findActivity.isFinishing();
        Glide glide = Glide.get(fragmentActivity.getApplicationContext());
        final androidx.lifecycle.Lifecycle lifecycle = fragmentActivity.getLifecycle();
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        final CallResult callResult = this.lifecycleRequestManagerRetriever;
        callResult.getClass();
        HashMap hashMap = (HashMap) callResult.result;
        Util.assertMainThread();
        Util.assertMainThread();
        RequestManager requestManager = (RequestManager) hashMap.get(lifecycle);
        if (requestManager != null) {
            return requestManager;
        }
        LifecycleLifecycle lifecycleLifecycle = new LifecycleLifecycle(lifecycle);
        HurlStack hurlStack = (HurlStack) callResult.serviceNames;
        CoroutinesRoom.Companion companion = new CoroutinesRoom.Companion(callResult, supportFragmentManager);
        hurlStack.getClass();
        RequestManager requestManager2 = new RequestManager(glide, lifecycleLifecycle, companion, fragmentActivity);
        hashMap.put(lifecycle, requestManager2);
        lifecycleLifecycle.addListener(new LifecycleListener() { // from class: com.bumptech.glide.manager.LifecycleRequestManagerRetriever$1
            @Override // com.bumptech.glide.manager.LifecycleListener
            public final void onDestroy() {
                ((HashMap) CallResult.this.result).remove(lifecycle);
            }

            @Override // com.bumptech.glide.manager.LifecycleListener
            public final void onStart() {
            }

            @Override // com.bumptech.glide.manager.LifecycleListener
            public final void onStop() {
            }
        });
        if (z) {
            requestManager2.onStart();
        }
        return requestManager2;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        return false;
    }

    public final RequestManager get(Context context) {
        if (context != null) {
            if (Looper.myLooper() == Looper.getMainLooper() && !(context instanceof Application)) {
                if (context instanceof FragmentActivity) {
                    return get((FragmentActivity) context);
                }
                if (context instanceof ContextWrapper) {
                    ContextWrapper contextWrapper = (ContextWrapper) context;
                    if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                        return get(contextWrapper.getBaseContext());
                    }
                }
            }
            if (this.applicationManager == null) {
                synchronized (this) {
                    try {
                        if (this.applicationManager == null) {
                            this.applicationManager = new RequestManager(Glide.get(context.getApplicationContext()), new HurlStack(21), new CueEncoder(21), context.getApplicationContext());
                        }
                    } finally {
                    }
                }
            }
            return this.applicationManager;
        }
        a$$ExternalSyntheticBUOutline0.m$3("You cannot start a load on a null Context");
        return null;
    }
}
