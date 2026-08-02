package defpackage;

import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;

/* loaded from: classes3.dex */
public final class ue2 extends ContentObserver {
    public final /* synthetic */ AudioManager a;
    public final /* synthetic */ uqn b;
    public final /* synthetic */ ve2 c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ue2(AudioManager audioManager, uqn uqnVar, ve2 ve2Var, String str, Handler handler) {
        super(handler);
        this.a = audioManager;
        this.b = uqnVar;
        this.c = ve2Var;
        this.d = str;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        int streamMaxVolume = this.a.getStreamMaxVolume(3);
        float streamVolume = streamMaxVolume > 0 ? r9.getStreamVolume(3) / streamMaxVolume : 0.0f;
        uqn uqnVar = this.b;
        float f = uqnVar.a;
        if (streamVolume == f) {
            return;
        }
        ssg.a(3, "AutoplayAnalyticsHelper", "system volume changed: " + f + " -> " + streamVolume, null);
        this.c.c.a(this.d, wjb.MainScreen, xjb.VolumeLevel, String.valueOf(streamVolume), String.valueOf(uqnVar.a));
        uqnVar.a = streamVolume;
    }
}
