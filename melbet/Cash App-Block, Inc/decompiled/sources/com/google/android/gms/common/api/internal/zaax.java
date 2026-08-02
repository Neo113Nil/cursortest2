package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes4.dex */
public final class zaax extends com.google.android.gms.internal.base.zao {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object zaa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zaax(Object obj, Looper looper, int i) {
        super(looper, 0);
        this.$r8$classId = i;
        this.zaa = obj;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (this.$r8$classId) {
            case 0:
                zaaz zaazVar = (zaaz) this.zaa;
                int i = message.what;
                if (i == 1) {
                    ReentrantLock reentrantLock = zaazVar.zaj;
                    reentrantLock.lock();
                    try {
                        if (zaazVar.zad()) {
                            zaazVar.zan();
                        }
                        return;
                    } finally {
                        reentrantLock.unlock();
                    }
                }
                if (i == 2) {
                    zaazVar.zai();
                    return;
                }
                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 20);
                sb.append("Unknown message id: ");
                sb.append(i);
                Log.w("GoogleApiClientImpl", sb.toString());
                return;
            default:
                int i2 = message.what;
                if (i2 != 1) {
                    if (i2 == 2) {
                        throw ((RuntimeException) message.obj);
                    }
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i2).length() + 20);
                    sb2.append("Unknown message id: ");
                    sb2.append(i2);
                    Log.w("GACStateManager", sb2.toString());
                    return;
                }
                zabb zabbVar = (zabb) message.obj;
                zabd zabdVar = (zabd) this.zaa;
                zabbVar.getClass();
                zabdVar.zai.lock();
                try {
                    if (zabdVar.zan == zabbVar.zaa) {
                        zabbVar.zaa();
                    }
                    return;
                } finally {
                    zabdVar.zai.unlock();
                }
        }
    }
}
