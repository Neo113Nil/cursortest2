package com.onesignal.notifications.internal.badges.impl.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import j5.InterfaceC4598a;
import java.util.Arrays;
import java.util.List;
import k5.C4659b;

/* loaded from: classes2.dex */
public class SamsungHomeBadger implements InterfaceC4598a {
    private static final String[] CONTENT_PROJECTION = {"_id", "class"};
    private static final String CONTENT_URI = "content://com.sec.badge/apps?notify=true";
    private DefaultBadger defaultBadger = new DefaultBadger();

    private ContentValues getContentValues(ComponentName componentName, int i, boolean z8) {
        ContentValues contentValues = new ContentValues();
        if (z8) {
            contentValues.put("package", componentName.getPackageName());
            contentValues.put("class", componentName.getClassName());
        }
        contentValues.put("badgecount", Integer.valueOf(i));
        return contentValues;
    }

    @Override // j5.InterfaceC4598a
    public void executeBadge(Context context, ComponentName componentName, int i) {
        DefaultBadger defaultBadger = this.defaultBadger;
        if (defaultBadger != null && defaultBadger.isSupported(context)) {
            this.defaultBadger.executeBadge(context, componentName, i);
            return;
        }
        Uri parse = Uri.parse(CONTENT_URI);
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursor = null;
        try {
            cursor = contentResolver.query(parse, CONTENT_PROJECTION, "package=?", new String[]{componentName.getPackageName()}, null);
            if (cursor != null) {
                String className = componentName.getClassName();
                boolean z8 = false;
                while (cursor.moveToNext()) {
                    contentResolver.update(parse, getContentValues(componentName, i, false), "_id=?", new String[]{String.valueOf(cursor.getInt(0))});
                    if (className.equals(cursor.getString(cursor.getColumnIndex("class")))) {
                        z8 = true;
                    }
                }
                if (!z8) {
                    contentResolver.insert(parse, getContentValues(componentName, i, true));
                }
            }
            C4659b.close(cursor);
        } catch (Throwable th) {
            C4659b.close(cursor);
            throw th;
        }
    }

    @Override // j5.InterfaceC4598a
    public List<String> getSupportLaunchers() {
        return Arrays.asList("com.sec.android.app.launcher", "com.sec.android.app.twlauncher");
    }
}
