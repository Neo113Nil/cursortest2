package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.google.android.gms.internal.ads.tw, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3968tw extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34425a;

    public /* synthetic */ C3968tw(int i) {
        this.f34425a = i;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.f34425a) {
            case 0:
                if (intent.getAction() == "android.media.action.HDMI_AUDIO_PLUG") {
                    int intExtra = intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", -1);
                    if (intExtra == 0) {
                        AbstractC2968bG.f29270T = 1;
                        return;
                    } else {
                        if (intExtra == 1) {
                            AbstractC2968bG.f29270T = 2;
                            return;
                        }
                        return;
                    }
                }
                return;
            default:
                synchronized (v2.f.f41402b) {
                    v2.f.f41403c = false;
                    v2.f.f41404d = false;
                    v2.i.f("Ad debug logging enablement is out of date.");
                }
                S0.f.y(context);
                return;
        }
    }
}
