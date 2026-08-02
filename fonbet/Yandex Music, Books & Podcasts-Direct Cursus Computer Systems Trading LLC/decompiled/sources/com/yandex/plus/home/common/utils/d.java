package com.yandex.plus.home.common.utils;

import android.os.Handler;
import android.os.Message;

/* loaded from: classes5.dex */
public final class d extends Handler {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        message.getClass();
        try {
            if (message.what == 1) {
                Object obj = message.obj;
                Runnable runnable = obj instanceof Runnable ? (Runnable) obj : null;
                if (runnable != null) {
                    runnable.run();
                }
            }
            try {
                message.recycle();
            } catch (IllegalStateException unused) {
                removeMessages(message.what);
            }
        } catch (Throwable th) {
            try {
                message.recycle();
            } catch (IllegalStateException unused2) {
                removeMessages(message.what);
            }
            throw th;
        }
    }
}
