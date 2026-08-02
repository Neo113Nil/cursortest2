package com.bugsnag.android.internal;

import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

/* loaded from: classes.dex */
public final class BugsnagContentProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Context context = getContext();
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        if (application == null) {
            return true;
        }
        ForegroundDetector foregroundDetector = ForegroundDetector.INSTANCE;
        Application application2 = ForegroundDetector.observedApplication;
        if (application == application2) {
            return true;
        }
        if (application2 != null) {
            application2.unregisterActivityLifecycleCallbacks(foregroundDetector);
        }
        ForegroundDetector.observedApplication = application;
        application.registerActivityLifecycleCallbacks(foregroundDetector);
        return true;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
