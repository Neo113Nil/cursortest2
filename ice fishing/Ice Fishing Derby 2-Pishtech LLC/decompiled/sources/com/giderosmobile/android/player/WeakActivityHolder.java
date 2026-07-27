package com.giderosmobile.android.player;

import android.app.Activity;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class WeakActivityHolder {
    private static WeakReference<Activity> weakActivity_;

    public static void set(Activity activity) {
        weakActivity_ = new WeakReference<>(activity);
    }

    public static Activity get() {
        return weakActivity_.get();
    }
}
