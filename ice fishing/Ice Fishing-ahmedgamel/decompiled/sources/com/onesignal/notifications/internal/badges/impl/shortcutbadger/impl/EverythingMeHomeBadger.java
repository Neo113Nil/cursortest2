package com.onesignal.notifications.internal.badges.impl.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import java.util.Arrays;
import java.util.List;
import n5.InterfaceC4774a;

/* loaded from: classes2.dex */
public class EverythingMeHomeBadger implements InterfaceC4774a {
    private static final String COLUMN_ACTIVITY_NAME = "activity_name";
    private static final String COLUMN_COUNT = "count";
    private static final String COLUMN_PACKAGE_NAME = "package_name";
    private static final String CONTENT_URI = "content://me.everything.badger/apps";

    @Override // n5.InterfaceC4774a
    public void executeBadge(Context context, ComponentName componentName, int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("package_name", componentName.getPackageName());
        contentValues.put(COLUMN_ACTIVITY_NAME, componentName.getClassName());
        contentValues.put("count", Integer.valueOf(i));
        context.getContentResolver().insert(Uri.parse(CONTENT_URI), contentValues);
    }

    @Override // n5.InterfaceC4774a
    public List<String> getSupportLaunchers() {
        return Arrays.asList("me.everything.launcher");
    }
}
