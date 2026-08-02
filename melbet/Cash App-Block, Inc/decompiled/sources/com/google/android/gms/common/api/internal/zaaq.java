package com.google.android.gms.common.api.internal;

import com.alexvasilkov.gestures.views.GestureImageView;
import java.util.concurrent.locks.Lock;

/* loaded from: classes4.dex */
public abstract class zaaq implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final Object zab;

    public /* synthetic */ zaaq(Object obj, int i) {
        this.$r8$classId = i;
        this.zab = obj;
    }

    public abstract boolean onStep();

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        Object obj = this.zab;
        switch (i) {
            case 0:
                zaar zaarVar = (zaar) obj;
                Lock lock = zaarVar.zab;
                Lock lock2 = zaarVar.zab;
                lock.lock();
                try {
                    try {
                        if (!Thread.interrupted()) {
                            zaa();
                        }
                    } catch (RuntimeException e) {
                        zaax zaaxVar = zaarVar.zaa.zam;
                        zaaxVar.sendMessage(zaaxVar.obtainMessage(2, e));
                    }
                    return;
                } finally {
                    lock2.unlock();
                }
            default:
                if (onStep()) {
                    GestureImageView gestureImageView = (GestureImageView) obj;
                    gestureImageView.removeCallbacks(this);
                    gestureImageView.postOnAnimation(this);
                    return;
                }
                return;
        }
    }

    public abstract void zaa();
}
