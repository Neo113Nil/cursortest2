package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.google.android.gms.internal.ads.uw, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4035uw extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34678a;

    public /* synthetic */ C4035uw(int i) {
        this.f34678a = i;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.f34678a) {
            case 0:
                if (intent.getAction() == "android.media.action.HDMI_AUDIO_PLUG") {
                    int intExtra = intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", -1);
                    if (intExtra == 0) {
                        AbstractC2655Lg.f26182R = 1;
                        return;
                    } else {
                        if (intExtra == 1) {
                            AbstractC2655Lg.f26182R = 2;
                            return;
                        }
                        return;
                    }
                }
                return;
            default:
                synchronized (u2.f.f41231b) {
                    u2.f.f41232c = false;
                    u2.f.f41233d = false;
                    u2.i.f("Ad debug logging enablement is out of date.");
                }
                S0.f.z(context);
                return;
        }
    }
}
