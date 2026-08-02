package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.yandex.music.shared.playback.api.commands.PauseCommand;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class bv3 extends BroadcastReceiver {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public Object c;

    public bv3() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.HEADSET_PLUG");
        intentFilter.addAction("android.media.AUDIO_BECOMING_NOISY");
        this.b = intentFilter;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        y1c y1cVar;
        switch (this.a) {
            case 0:
                context.getClass();
                intent.getClass();
                dv3 dv3Var = (dv3) this.b;
                ltm ltmVar = (ltm) this.c;
                x97.y(ltmVar, dm6.b, null, new qi(dv3Var, ltmVar, (Continuation) null, 17), 2);
                break;
            default:
                intent.getClass();
                String action = intent.getAction();
                if (action != null) {
                    Continuation continuation = null;
                    if (action.length() <= 0) {
                        action = null;
                    }
                    if (action != null && (y1cVar = (y1c) this.c) != null) {
                        if (!"android.intent.action.HEADSET_PLUG".equals(action)) {
                            if ("android.media.AUDIO_BECOMING_NOISY".equals(action)) {
                                ssg.a(3, "HeadsetReceiver", "Audio becoming noisy", null);
                                ssg.a(3, "ExternalMediaSignalsHelper", "onMusicBecomingNoisy", null);
                                oxa oxaVar = y1cVar.e;
                                if (oxaVar != null) {
                                    ssg.a(3, "ExternalMediaSignalsCenter", "onPausePlayback", null);
                                    ((k1l) ((jyr) ((eps) oxaVar.b).d).getValue()).a(PauseCommand.INSTANCE, a3t.a);
                                }
                                ssg.a(3, "ExternalMediaSignalsHelper", "abandonAudioFocusAsync", null);
                                bv3 bv3Var = y1cVar.c;
                                Context context2 = y1cVar.a;
                                bv3Var.getClass();
                                context2.getClass();
                                ssg.a(3, "HeadsetReceiver", "unregister", null);
                                bv3Var.c = null;
                                try {
                                    context2.unregisterReceiver(bv3Var);
                                } catch (IllegalArgumentException e) {
                                    ssg.a(3, "HeadsetReceiver", "unregister receiver exception", e);
                                }
                                osh oshVar = y1cVar.d;
                                oshVar.getClass();
                                ssg.a(3, "AndroidAudioFocusAdapter", "abandonFocusAsync()", null);
                                x97.y(cmd.a, null, null, new hl(oshVar, continuation, 4), 3);
                                break;
                            }
                        } else {
                            int intExtra = intent.getIntExtra("state", -1);
                            if (intExtra == 0) {
                                ssg.a(3, "HeadsetReceiver", "Headset unplugged", null);
                                break;
                            } else if (intExtra == 1) {
                                ssg.a(3, "HeadsetReceiver", "Headset plugged", null);
                                break;
                            } else {
                                ssg.a(3, "HeadsetReceiver", "Unknown headset plug action", null);
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }

    public bv3(dv3 dv3Var, ltm ltmVar) {
        this.b = dv3Var;
        this.c = ltmVar;
    }
}
