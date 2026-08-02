package defpackage;

import com.yandex.music.shared.playback.api.commands.AwaitPlayerConvergedCommand;
import com.yandex.music.shared.playback.api.commands.PauseOnQueueEndCommand;
import com.yandex.music.shared.playback.api.commands.PlayCommand;
import com.yandex.music.shared.playback.api.commands.VolumeMuteCommand;
import com.yandex.music.shared.playback.api.commands.VolumeUnmuteCommand;
import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueBound;
import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueLaunch;
import com.yandex.music.shared.playback.utils.api.commands.NoopCallbackCommand;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.common.media.control.shared.commands.DoNotLaunchCommand;
import ru.yandex.music.common.media.control.shared.commands.LaunchGlagolCommandOld;
import ru.yandex.music.common.media.control.shared.commands.StartQueueCommand;
import ru.yandex.music.common.media.control.shared.commands.StartQueueIntoYnisonRemoteCommandOld;

/* loaded from: classes5.dex */
public final class e3q implements vyk, fan, q7l {
    public static final String k = "PlaybackControl:SharedPlaybackAdapter";
    public final jyr a;
    public final jyr b;
    public final jyr c;
    public final jyr d;
    public final jyr e;
    public final jyr f;
    public final jyr g;
    public final jyr h;
    public final jyr i;
    public final jyr j;

    public e3q(jyr jyrVar, jyr jyrVar2, jyr jyrVar3, jyr jyrVar4, jyr jyrVar5, jyr jyrVar6, jyr jyrVar7, jyr jyrVar8, jyr jyrVar9, jyr jyrVar10) {
        this.a = jyrVar;
        this.b = jyrVar4;
        this.c = jyrVar5;
        this.d = jyrVar10;
        this.e = jyrVar6;
        this.f = jyrVar7;
        this.g = jyrVar8;
        this.h = jyrVar9;
        this.i = jyrVar2;
        this.j = jyrVar3;
    }

    @Override // defpackage.q7l
    public final void a() {
        ((q7l) this.b.getValue()).a();
    }

    @Override // defpackage.q7l
    public final void b() {
        ((q7l) this.b.getValue()).b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final fyk c(uyk uykVar, yk3 yk3Var, Function1 function1, boolean z, NoopCallbackCommand noopCallbackCommand) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        Continuation continuation;
        int i;
        boolean z6;
        boolean C;
        int i2;
        PlaybackCommand$QueueLaunch startQueueCommand;
        fyk fykVar;
        DoNotLaunchCommand doNotLaunchCommand;
        List h;
        uykVar.getClass();
        function1.getClass();
        boolean z7 = ((odd) this.e.getValue()).d().a;
        jyr jyrVar = this.a;
        int i3 = 0;
        if (((oq7) jyrVar.getValue()).b.c.getValue() instanceof wpw) {
            afw afwVar = (afw) this.f.getValue();
            if ((afwVar.a().c() ? afwVar.a().d() : gfw.e) == gfw.b) {
                z2 = true;
                aa0 aa0Var = new aa0(this, function1, (Continuation) null, 10);
                x2q x2qVar = new x2q(yk3Var, i3);
                xum xumVar = new xum(18, uykVar, yk3Var);
                jyr jyrVar2 = this.g;
                z3 = z && ((lwc) jyrVar2.getValue()).a();
                String str = k;
                if (z3) {
                    ssg.a(4, str, "Playback is disabled by Freemium, increase attempt count", null);
                    ((lwc) jyrVar2.getValue()).b(nwc.a);
                }
                jyr jyrVar3 = p6m.f;
                boolean e = o6m.e();
                jyr jyrVar4 = this.h;
                z4 = (e || z || !Intrinsics.d(((j6m) ((d6m) jyrVar4.getValue())).j.getValue(), r6m.a)) ? false : true;
                if (z4) {
                    z5 = z4;
                    continuation = null;
                    i = 3;
                } else {
                    z5 = z4;
                    continuation = null;
                    ssg.a(4, str, "Device is not registered, notify to show the devices manager", null);
                    j6m j6mVar = (j6m) ((d6m) jyrVar4.getValue());
                    mm6 mm6Var = j6mVar.d;
                    g2l g2lVar = new g2l(j6mVar, continuation, 13);
                    i = 3;
                    x97.y(mm6Var, null, null, g2lVar, 3);
                }
                z6 = uykVar instanceof tyk;
                if (!z6) {
                    C = false;
                } else if ((uykVar instanceof ryk) || (uykVar instanceof syk)) {
                    C = true;
                } else {
                    if (!(uykVar instanceof qyk)) {
                        fyk fykVar2 = continuation;
                        b6e.s();
                        return fykVar2;
                    }
                    C = p6g.C((e6l) ((oq7) jyrVar.getValue()).a.c.getValue());
                }
                if (!z3) {
                    doNotLaunchCommand = new DoNotLaunchCommand(j2a.NO_SUBSCRIPTION, xumVar);
                } else {
                    if (!z5) {
                        jyr jyrVar5 = this.d;
                        if (z7) {
                            fykVar = continuation;
                            i2 = 4;
                            startQueueCommand = new LaunchGlagolCommandOld(aa0Var, C, (y3l) jyrVar5.getValue(), x2qVar, xumVar);
                        } else {
                            Continuation continuation2 = continuation;
                            i2 = 4;
                            if (z2) {
                                startQueueCommand = new StartQueueIntoYnisonRemoteCommandOld(aa0Var, C, (y3l) jyrVar5.getValue(), x2qVar, xumVar);
                                fykVar = continuation2;
                            } else {
                                startQueueCommand = new StartQueueCommand(aa0Var, C, uykVar.a(), (y3l) jyrVar5.getValue(), x2qVar, xumVar);
                                fykVar = continuation2;
                            }
                        }
                        if (z6) {
                            AwaitPlayerConvergedCommand awaitPlayerConvergedCommand = new AwaitPlayerConvergedCommand(z);
                            PlaybackCommand$QueueBound.Basic[] basicArr = new PlaybackCommand$QueueBound.Basic[i2];
                            PauseOnQueueEndCommand pauseOnQueueEndCommand = PauseOnQueueEndCommand.INSTANCE;
                            basicArr[0] = pauseOnQueueEndCommand;
                            basicArr[1] = awaitPlayerConvergedCommand;
                            basicArr[2] = pauseOnQueueEndCommand;
                            basicArr[i] = VolumeUnmuteCommand.INSTANCE;
                            h = u75.h(basicArr);
                        } else if (uykVar instanceof ryk) {
                            AwaitPlayerConvergedCommand awaitPlayerConvergedCommand2 = new AwaitPlayerConvergedCommand(z);
                            PlayCommand playCommand = new PlayCommand(z);
                            PlaybackCommand$QueueBound.Basic[] basicArr2 = new PlaybackCommand$QueueBound.Basic[i];
                            basicArr2[0] = awaitPlayerConvergedCommand2;
                            basicArr2[1] = playCommand;
                            basicArr2[2] = VolumeUnmuteCommand.INSTANCE;
                            h = u75.h(basicArr2);
                        } else if (uykVar instanceof syk) {
                            AwaitPlayerConvergedCommand awaitPlayerConvergedCommand3 = new AwaitPlayerConvergedCommand(z);
                            PlayCommand playCommand2 = new PlayCommand(z);
                            PlaybackCommand$QueueBound.Basic[] basicArr3 = new PlaybackCommand$QueueBound.Basic[i];
                            basicArr3[0] = awaitPlayerConvergedCommand3;
                            basicArr3[1] = playCommand2;
                            basicArr3[2] = VolumeMuteCommand.INSTANCE;
                            h = u75.h(basicArr3);
                        } else {
                            if (!(uykVar instanceof qyk)) {
                                b6e.s();
                                return fykVar;
                            }
                            h = u75.h(new AwaitPlayerConvergedCommand(z), VolumeUnmuteCommand.INSTANCE);
                        }
                        if (noopCallbackCommand != null) {
                            h = CollectionsKt.h0(h, noopCallbackCommand);
                        }
                        return new fyk(startQueueCommand, h);
                    }
                    doNotLaunchCommand = new DoNotLaunchCommand(j2a.DEVICE_NOT_REGISTERED, xumVar);
                }
                startQueueCommand = doNotLaunchCommand;
                fykVar = continuation;
                i2 = 4;
                if (z6) {
                }
                if (noopCallbackCommand != null) {
                }
                return new fyk(startQueueCommand, h);
            }
        }
        z2 = false;
        aa0 aa0Var2 = new aa0(this, function1, (Continuation) null, 10);
        x2q x2qVar2 = new x2q(yk3Var, i3);
        xum xumVar2 = new xum(18, uykVar, yk3Var);
        jyr jyrVar22 = this.g;
        if (z) {
        }
        String str2 = k;
        if (z3) {
        }
        jyr jyrVar32 = p6m.f;
        boolean e2 = o6m.e();
        jyr jyrVar42 = this.h;
        if (e2) {
        }
        if (z4) {
        }
        z6 = uykVar instanceof tyk;
        if (!z6) {
        }
        if (!z3) {
        }
        startQueueCommand = doNotLaunchCommand;
        fykVar = continuation;
        i2 = 4;
        if (z6) {
        }
        if (noopCallbackCommand != null) {
        }
        return new fyk(startQueueCommand, h);
    }

    public final yk3 d(Function1 function1, uyk uykVar, boolean z) {
        yk3 yk3Var = new yk3(11);
        fyk c = c(uykVar, yk3Var, function1, false, null);
        ssg.a(3, k, "start(mode=" + uykVar + ") with " + c, null);
        ((k1l) this.j.getValue()).b(c, z ? new b3t("start_queue") : a3t.a);
        return yk3Var;
    }
}
