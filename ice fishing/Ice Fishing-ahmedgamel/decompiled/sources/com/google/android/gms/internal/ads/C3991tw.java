package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.google.android.gms.internal.ads.tw, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3991tw extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35199a;

    public /* synthetic */ C3991tw(int i) {
        this.f35199a = i;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.f35199a) {
            case 0:
                if (intent.getAction() == "android.media.action.HDMI_AUDIO_PLUG") {
                    int intExtra = intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", -1);
                    if (intExtra == 0) {
                        AbstractC2991bG.f30058T = 1;
                        return;
                    } else {
                        if (intExtra == 1) {
                            AbstractC2991bG.f30058T = 2;
                            return;
                        }
                        return;
                    }
                }
                return;
            default:
                synchronized (x2.f.f41859b) {
                    x2.f.f41860c = false;
                    x2.f.f41861d = false;
                    x2.i.f("Ad debug logging enablement is out of date.");
                }
                N3.C.V(context);
                return;
        }
    }
}
