package com.gamericefishpro.space.v8;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements Handler.Callback {
    public final com.gamericefishpro.space.f9.e A;
    public final com.gamericefishpro.space.tb.u d;
    public final ArrayList e = new ArrayList();
    public final ArrayList i = new ArrayList();
    public final ArrayList v = new ArrayList();
    public volatile boolean w = false;
    public final AtomicInteger y = new AtomicInteger(0);
    public boolean z = false;
    public final Object B = new Object();

    public t(Looper looper, com.gamericefishpro.space.tb.u uVar) {
        this.d = uVar;
        this.A = new com.gamericefishpro.space.f9.e(looper, this);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            Log.wtf("GmsClientEvents", com.gamericefishpro.space.m5.a.g(i, "Don't know how to handle message: "), new Exception());
            return false;
        }
        com.gamericefishpro.space.t8.f fVar = (com.gamericefishpro.space.t8.f) message.obj;
        synchronized (this.B) {
            try {
                if (this.w && ((com.gamericefishpro.space.u8.u) this.d.e).d() && this.e.contains(fVar)) {
                    fVar.onConnected(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }
}
