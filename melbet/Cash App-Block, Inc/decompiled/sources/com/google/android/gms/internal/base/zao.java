package com.google.android.gms.internal.base;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public class zao extends Handler {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zao(Looper looper, int i) {
        super(looper);
        switch (i) {
            case 2:
                super(looper);
                Looper.getMainLooper();
                break;
            case 3:
                super(looper);
                Looper.getMainLooper();
                break;
            default:
                Looper.getMainLooper();
                break;
        }
    }

    public zao(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        Looper.getMainLooper();
    }
}
