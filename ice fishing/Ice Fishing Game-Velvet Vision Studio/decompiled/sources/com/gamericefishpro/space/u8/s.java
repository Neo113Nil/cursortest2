package com.gamericefishpro.space.u8;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends com.gamericefishpro.space.f9.e {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(Object obj, Looper looper, int i) {
        super(looper, 0);
        this.a = i;
        this.b = obj;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                u uVar = (u) this.b;
                int i = message.what;
                if (i != 1) {
                    if (i == 2) {
                        u.f(uVar);
                        return;
                    }
                    Log.w("GoogleApiClientImpl", "Unknown message id: " + i);
                    return;
                }
                ReentrantLock reentrantLock = uVar.b;
                reentrantLock.lock();
                try {
                    if (uVar.g()) {
                        uVar.i();
                        break;
                    }
                    return;
                } finally {
                    reentrantLock.unlock();
                }
            default:
                int i2 = message.what;
                if (i2 != 1) {
                    if (i2 == 2) {
                        throw ((RuntimeException) message.obj);
                    }
                    Log.w("GACStateManager", "Unknown message id: " + i2);
                    return;
                }
                w wVar = (w) message.obj;
                x xVar = (x) this.b;
                wVar.getClass();
                xVar.d.lock();
                try {
                    if (xVar.n == wVar.a) {
                        wVar.a();
                        break;
                    }
                    return;
                } finally {
                    xVar.d.unlock();
                }
        }
    }
}
