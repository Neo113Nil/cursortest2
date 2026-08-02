package com.appsflyer.internal;

import android.database.Cursor;

/* loaded from: classes3.dex */
public final class AFj1eSDK {
    public static final String P_(Cursor cursor, String str) {
        cursor.getClass();
        str.getClass();
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex != -1) {
            return cursor.getString(columnIndex);
        }
        return null;
    }
}
