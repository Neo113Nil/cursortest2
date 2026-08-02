package defpackage;

import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueLaunch;
import com.yandex.music.shared.ynison.center.api.launcher.StartQueueIntoYnisonRemoteCommand;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.common.media.control.shared.commands.LaunchGlagolCommand;

/* loaded from: classes5.dex */
public final class d0l implements kan {
    public final jyr a;
    public final jyr b;
    public final jyr c;

    public d0l(jyr jyrVar, jyr jyrVar2, jyr jyrVar3) {
        this.a = jyrVar;
        this.b = jyrVar2;
        this.c = jyrVar3;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PlaybackCommand$QueueLaunch.Basic a(PlaybackCommand$QueueLaunch.Basic basic) {
        boolean z;
        g4l g4lVar = ((oq7) this.c.getValue()).b;
        boolean z2 = ((odd) this.a.getValue()).d().a;
        if (g4lVar.c.getValue() instanceof wpw) {
            afw afwVar = (afw) this.b.getValue();
            if ((afwVar.a().c() ? afwVar.a().d() : gfw.e) == gfw.b) {
                z = true;
                dxl dxlVar = gan.b;
                o6m o6mVar = gan.a;
                mhm mhmVar = jan.a;
                qcm qcmVar = han.a;
                if (!z2) {
                    basic.getClass();
                    return new LaunchGlagolCommand(basic, ((Boolean) vyp.b(basic, qcmVar)).booleanValue(), (y3l) vyp.b(basic, mhmVar), (Function0) vyp.b(basic, o6mVar), (Function1) vyp.b(basic, dxlVar));
                }
                if (!z) {
                    return basic;
                }
                basic.getClass();
                return new StartQueueIntoYnisonRemoteCommand(basic, ((Boolean) vyp.b(basic, qcmVar)).booleanValue(), (y3l) vyp.b(basic, mhmVar), (Function0) vyp.b(basic, o6mVar), (Function1) vyp.b(basic, dxlVar));
            }
        }
        z = false;
        dxl dxlVar2 = gan.b;
        o6m o6mVar2 = gan.a;
        mhm mhmVar2 = jan.a;
        qcm qcmVar2 = han.a;
        if (!z2) {
        }
    }
}
