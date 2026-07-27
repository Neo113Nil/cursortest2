package com.anythink.splashad.api;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.anythink.basead.exoplayer.f;
import com.anythink.basead.exoplayer.i.a;

/* loaded from: classes.dex */
public class ATSplashSkipInfo {
    public static final String TAG = "ATSplashSkipInfo";
    ATSplashSkipAdListener mATSplashSkipAdListener;
    long mCallbackInterval;
    ViewGroup mContainer;
    long mCountDownDuration;
    View mSkipView;

    public ATSplashSkipInfo(View view, long j9, long j10, ATSplashSkipAdListener aTSplashSkipAdListener) {
        this.mSkipView = view;
        this.mCountDownDuration = j9;
        this.mCallbackInterval = j10;
        this.mATSplashSkipAdListener = aTSplashSkipAdListener;
        if (j9 < a.f8040f) {
            Log.e(TAG, "mCountDownDuration is less than or equal to 2000, reset to 2000");
            this.mCountDownDuration = a.f8040f;
        }
        long j11 = this.mCallbackInterval;
        if (j11 <= 0) {
            Log.e(TAG, "mCallbackInterval is less than or equal to 0, reset to 1000");
            this.mCallbackInterval = 1000L;
        } else if (j11 < 20) {
            Log.e(TAG, "mCallbackInterval is less than 10, reset to 20");
            this.mCallbackInterval = 20L;
        }
    }

    public boolean canUseCustomSkipView() {
        return this.mSkipView != null;
    }

    public void destroy() {
        View view = this.mSkipView;
        if (view != null) {
            view.setOnClickListener(null);
            this.mSkipView = null;
        }
        this.mATSplashSkipAdListener = null;
    }

    public ATSplashSkipAdListener getATSplashSkipAdListener() {
        return this.mATSplashSkipAdListener;
    }

    public long getCallbackInterval() {
        return this.mCallbackInterval;
    }

    public ViewGroup getContainer() {
        return this.mContainer;
    }

    public long getCountDownDuration() {
        return this.mCountDownDuration;
    }

    public View getSkipView() {
        return this.mSkipView;
    }

    public void setContainer(ViewGroup viewGroup) {
        this.mContainer = viewGroup;
    }

    public ATSplashSkipInfo(View view, ATSplashSkipAdListener aTSplashSkipAdListener) {
        this(view, f.f7344a, 1000L, aTSplashSkipAdListener);
    }
}
