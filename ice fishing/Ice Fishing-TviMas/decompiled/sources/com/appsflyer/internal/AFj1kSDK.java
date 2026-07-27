package com.appsflyer.internal;

import android.database.Cursor;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class AFj1kSDK {
    public static final String N_(Cursor cursor, String str) {
        Intrinsics.checkNotNullParameter(cursor, "");
        Intrinsics.checkNotNullParameter(str, "");
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex != -1) {
            return cursor.getString(columnIndex);
        }
        return null;
    }
}
