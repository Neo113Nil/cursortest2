package com.netcetera.threeds.sdk.infrastructure;

import android.content.ContentResolver;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;

/* loaded from: classes5.dex */
public abstract class setVerticalScrollBarEnabled {
    private static int getWarnings = 0;
    private static int initialize = 1;
    private ContentResolver ThreeDS2Service;

    public setVerticalScrollBarEnabled(ContentResolver contentResolver) {
        this.ThreeDS2Service = contentResolver;
    }

    public ContentResolver m_() {
        int i = getWarnings;
        int m = Thread$State$EnumUnboxingLocalUtility.m(i & 56, i | 56, 1, 128);
        initialize = m;
        ContentResolver contentResolver = this.ThreeDS2Service;
        int i2 = m + 27;
        getWarnings = i2 % 128;
        if (i2 % 2 == 0) {
            return contentResolver;
        }
        throw null;
    }
}
