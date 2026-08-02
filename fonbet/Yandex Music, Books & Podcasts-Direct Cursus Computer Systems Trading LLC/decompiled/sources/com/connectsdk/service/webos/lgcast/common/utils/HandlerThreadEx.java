package com.connectsdk.service.webos.lgcast.common.utils;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import defpackage.e7o;

/* loaded from: classes.dex */
public class HandlerThreadEx {
    private Handler mHandler;
    private HandlerThread mHandlerThread;
    private String mThreadName;
    private int mThreadPriority = 0;

    public interface HandlerCallback {
        void handleMessage(Message message);
    }

    public HandlerThreadEx(String str) {
        this.mThreadName = str;
    }

    public Handler getHandler() {
        return this.mHandler;
    }

    public void post(Runnable runnable) {
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.post(runnable);
        }
    }

    public void quit() {
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.getLooper().quit();
        }
        this.mHandler = null;
        HandlerThread handlerThread = this.mHandlerThread;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        this.mHandlerThread = null;
    }

    public boolean sendMessage(int i, Object obj) {
        Message obtain = Message.obtain();
        obtain.what = i;
        obtain.obj = obj;
        Handler handler = this.mHandler;
        if (handler != null) {
            return handler.sendMessage(obtain);
        }
        return false;
    }

    public void start(final HandlerCallback handlerCallback) {
        if (handlerCallback == null) {
            e7o.e();
            return;
        }
        HandlerThread handlerThread = new HandlerThread(this.mThreadName, this.mThreadPriority);
        this.mHandlerThread = handlerThread;
        handlerThread.start();
        this.mHandler = new Handler(this.mHandlerThread.getLooper()) { // from class: com.connectsdk.service.webos.lgcast.common.utils.HandlerThreadEx.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                handlerCallback.handleMessage(message);
            }
        };
    }

    public void post(Runnable runnable, long j) {
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.postDelayed(runnable, j);
        }
    }

    public boolean sendMessage(Object obj) {
        return sendMessage(0, obj);
    }

    public void start() {
        HandlerThread handlerThread = new HandlerThread(this.mThreadName, this.mThreadPriority);
        this.mHandlerThread = handlerThread;
        handlerThread.start();
        this.mHandler = new Handler(this.mHandlerThread.getLooper());
    }
}
