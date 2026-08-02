package com.google.firebase.provider;

import android.content.ContentProvider;
import android.os.SystemClock;
import com.google.firebase.AutoValue_StartupTime;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class FirebaseInitProvider extends ContentProvider {
    public static final AutoValue_StartupTime startupTime = new AutoValue_StartupTime(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    public static final AtomicBoolean currentlyInitializing = new AtomicBoolean(false);
}
