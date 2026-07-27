package com.instagram.common.viewpoint.core;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Messenger;

/* loaded from: assets/audience_network/classes2.dex */
public class ON implements ServiceConnection {
    public final /* synthetic */ OO A00;

    public ON(OO oo) {
        this.A00 = oo;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Handler handler;
        AbstractRunnableC1327Wc abstractRunnableC1327Wc;
        C1836ge c1836ge;
        Messenger messenger;
        handler = this.A00.A04;
        abstractRunnableC1327Wc = this.A00.A08;
        handler.removeCallbacks(abstractRunnableC1327Wc);
        this.A00.A00 = new Messenger(iBinder);
        c1836ge = this.A00.A07;
        if (AbstractC1293Us.A09(c1836ge)) {
            OO oo = this.A00;
            messenger = this.A00.A00;
            oo.A07(messenger);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.A00.A09();
    }
}
