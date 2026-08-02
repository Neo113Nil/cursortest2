package yads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.hia1;

/* loaded from: classes7.dex */
public final class ou3 extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction() == "android.media.action.HDMI_AUDIO_PLUG") {
            int intExtra = intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", -1);
            int i = 1;
            if (intExtra != 0) {
                if (intExtra != 1) {
                    return;
                } else {
                    i = 2;
                }
            }
            hia1.a = i;
        }
    }
}
