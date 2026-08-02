package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/* loaded from: classes5.dex */
public class setSpannableFactory {
    private static int get = 1;
    private static int initialize;

    public Bitmap x_(byte[] bArr) {
        int i = get + 1;
        initialize = i % 128;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, i % 2 != 0 ? 1 : 0, bArr.length);
        System.identityHashCode(this);
        System.identityHashCode(this);
        return decodeByteArray;
    }
}
