package defpackage;

import com.yandex.music.shared.playback.core.api.PlaybackQueueStartValidator$InvalidQueueException;
import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueLaunch;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.common.media.control.shared.commands.LaunchGlagolCommand;
import ru.yandex.music.common.media.queue.GlagolRemoteQueueStartException;

/* loaded from: classes5.dex */
public final class enf implements o3l {
    public final jyr a = btf.b(new bff(15));

    @Override // defpackage.o3l
    public final /* bridge */ /* synthetic */ Object a(PlaybackCommand$QueueLaunch.Basic basic, es6 es6Var, cg6 cg6Var) {
        return b((LaunchGlagolCommand) basic, cg6Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x017c A[Catch: PlaybackQueueStartValidator$InvalidQueueException -> 0x0055, TryCatch #3 {PlaybackQueueStartValidator$InvalidQueueException -> 0x0055, blocks: (B:14:0x015c, B:16:0x0162, B:19:0x0167, B:21:0x016b, B:24:0x0170, B:25:0x0175, B:27:0x0176, B:29:0x017c, B:32:0x0186, B:35:0x018c, B:49:0x004d, B:51:0x00d3, B:53:0x0108, B:54:0x0116, B:56:0x011a, B:58:0x011e, B:61:0x0123, B:63:0x0127, B:65:0x012d, B:66:0x013d, B:68:0x0144, B:69:0x0149, B:70:0x014a), top: B:48:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x018c A[Catch: PlaybackQueueStartValidator$InvalidQueueException -> 0x0055, TRY_LEAVE, TryCatch #3 {PlaybackQueueStartValidator$InvalidQueueException -> 0x0055, blocks: (B:14:0x015c, B:16:0x0162, B:19:0x0167, B:21:0x016b, B:24:0x0170, B:25:0x0175, B:27:0x0176, B:29:0x017c, B:32:0x0186, B:35:0x018c, B:49:0x004d, B:51:0x00d3, B:53:0x0108, B:54:0x0116, B:56:0x011a, B:58:0x011e, B:61:0x0123, B:63:0x0127, B:65:0x012d, B:66:0x013d, B:68:0x0144, B:69:0x0149, B:70:0x014a), top: B:48:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0108 A[Catch: PlaybackQueueStartValidator$InvalidQueueException -> 0x0055, TryCatch #3 {PlaybackQueueStartValidator$InvalidQueueException -> 0x0055, blocks: (B:14:0x015c, B:16:0x0162, B:19:0x0167, B:21:0x016b, B:24:0x0170, B:25:0x0175, B:27:0x0176, B:29:0x017c, B:32:0x0186, B:35:0x018c, B:49:0x004d, B:51:0x00d3, B:53:0x0108, B:54:0x0116, B:56:0x011a, B:58:0x011e, B:61:0x0123, B:63:0x0127, B:65:0x012d, B:66:0x013d, B:68:0x0144, B:69:0x0149, B:70:0x014a), top: B:48:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0116 A[Catch: PlaybackQueueStartValidator$InvalidQueueException -> 0x0055, TryCatch #3 {PlaybackQueueStartValidator$InvalidQueueException -> 0x0055, blocks: (B:14:0x015c, B:16:0x0162, B:19:0x0167, B:21:0x016b, B:24:0x0170, B:25:0x0175, B:27:0x0176, B:29:0x017c, B:32:0x0186, B:35:0x018c, B:49:0x004d, B:51:0x00d3, B:53:0x0108, B:54:0x0116, B:56:0x011a, B:58:0x011e, B:61:0x0123, B:63:0x0127, B:65:0x012d, B:66:0x013d, B:68:0x0144, B:69:0x0149, B:70:0x014a), top: B:48:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(LaunchGlagolCommand launchGlagolCommand, cg6 cg6Var) {
        dnf dnfVar;
        int i;
        LaunchGlagolCommand launchGlagolCommand2;
        LaunchGlagolCommand launchGlagolCommand3;
        ced cedVar;
        a0q a0qVar;
        u8n u8nVar;
        vgd vgdVar;
        a0q a0qVar2;
        Function1 onError;
        wdd wddVar;
        Function0 onSuccess;
        Function1 onError2;
        if (cg6Var instanceof dnf) {
            dnfVar = (dnf) cg6Var;
            int i2 = dnfVar.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dnfVar.p = i2 - Integer.MIN_VALUE;
                Object obj = dnfVar.n;
                nm6 nm6Var = nm6.a;
                i = dnfVar.p;
                boolean z = false;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        a0qVar2 = dnfVar.l;
                        LaunchGlagolCommand launchGlagolCommand4 = dnfVar.j;
                        try {
                            qgg.h0(obj);
                            launchGlagolCommand3 = launchGlagolCommand4;
                            wddVar = (wdd) obj;
                        } catch (PlaybackQueueStartValidator$InvalidQueueException e) {
                            e = e;
                            launchGlagolCommand3 = launchGlagolCommand4;
                        }
                        if (!(wddVar instanceof tdd) && !(wddVar instanceof udd)) {
                            if (!(wddVar instanceof sdd) && !(wddVar instanceof vdd)) {
                                throw new x7j();
                            }
                            onError2 = launchGlagolCommand3.getOnError();
                            if (onError2 != null) {
                                int i3 = GlagolRemoteQueueStartException.c;
                                onError2.invoke(ogp.y(a0qVar2, null, null, 6));
                            }
                            return Boolean.valueOf(z);
                        }
                        onSuccess = launchGlagolCommand3.getOnSuccess();
                        if (onSuccess != null) {
                            onSuccess.invoke();
                        }
                        z = true;
                        return Boolean.valueOf(z);
                    }
                    u8n u8nVar2 = dnfVar.m;
                    a0q a0qVar3 = dnfVar.l;
                    cedVar = dnfVar.k;
                    launchGlagolCommand3 = dnfVar.j;
                    try {
                        qgg.h0(obj);
                        u8nVar = u8nVar2;
                        a0qVar = a0qVar3;
                    } catch (PlaybackQueueStartValidator$InvalidQueueException e2) {
                        e = e2;
                    }
                    ssg.a(6, "LaunchGlagolCommandsExecutor", "execute thrown an exception", e);
                    onError = launchGlagolCommand3.getOnError();
                    if (onError != null) {
                        Throwable cause = e.getCause();
                        if (cause != null) {
                            e = cause;
                        }
                        onError.invoke(e);
                    }
                    return Boolean.valueOf(z);
                }
                qgg.h0(obj);
                try {
                    PlaybackCommand$QueueLaunch.Basic basicLaunchCommand = launchGlagolCommand.getBasicLaunchCommand();
                    basicLaunchCommand.getClass();
                    try {
                        if (((Boolean) vyp.b(basicLaunchCommand, ian.a)).booleanValue()) {
                            Function1 onError3 = launchGlagolCommand.getOnError();
                            if (onError3 != null) {
                                int i4 = GlagolRemoteQueueStartException.c;
                                onError3.invoke(ogp.y(null, null, "glagol cannot be launched as secondary queue", 2));
                            }
                            return Boolean.FALSE;
                        }
                        cedVar = ((odd) this.a.getValue()).l;
                        if (cedVar == null) {
                            Function1 onError4 = launchGlagolCommand.getOnError();
                            if (onError4 != null) {
                                int i5 = GlagolRemoteQueueStartException.c;
                                onError4.invoke(ogp.y(null, null, "cannot launch queue when glagol is not connected", 2));
                            }
                            return Boolean.FALSE;
                        }
                        a0qVar = (a0q) vyp.b(basicLaunchCommand, zsd.h);
                        u8n u8nVar3 = (u8n) vyp.b(basicLaunchCommand, zsd.i);
                        rre rreVar = zsd.j;
                        launchGlagolCommand2 = launchGlagolCommand;
                        try {
                            dnfVar.j = launchGlagolCommand2;
                            dnfVar.k = cedVar;
                            dnfVar.l = a0qVar;
                            dnfVar.m = u8nVar3;
                            dnfVar.p = 1;
                            obj = vyp.a(basicLaunchCommand, rreVar, dnfVar);
                            if (obj != nm6Var) {
                                u8nVar = u8nVar3;
                                launchGlagolCommand3 = launchGlagolCommand2;
                            }
                            return nm6Var;
                        } catch (PlaybackQueueStartValidator$InvalidQueueException e3) {
                            e = e3;
                            launchGlagolCommand3 = launchGlagolCommand2;
                            ssg.a(6, "LaunchGlagolCommandsExecutor", "execute thrown an exception", e);
                            onError = launchGlagolCommand3.getOnError();
                            if (onError != null) {
                            }
                            return Boolean.valueOf(z);
                        }
                    } catch (PlaybackQueueStartValidator$InvalidQueueException e4) {
                        e = e4;
                        launchGlagolCommand3 = launchGlagolCommand;
                    }
                } catch (PlaybackQueueStartValidator$InvalidQueueException e5) {
                    e = e5;
                    launchGlagolCommand2 = launchGlagolCommand;
                }
                String str = (String) obj;
                a0qVar.getClass();
                str.getClass();
                vgdVar = (vgd) o8g.i(a0qVar, new xgd(u8nVar, true, str, false, null, null));
                ssg.a(3, "LaunchGlagolCommandsExecutor", "glagolCastTarget: " + vgdVar, null);
                if (Intrinsics.d(vgdVar, rgd.a)) {
                    if (!(vgdVar instanceof tgd) && !(vgdVar instanceof pgd) && !(vgdVar instanceof ugd)) {
                        if (vgdVar instanceof qgd) {
                            Function1 onError5 = launchGlagolCommand3.getOnError();
                            if (onError5 != null) {
                                int i6 = GlagolRemoteQueueStartException.c;
                                onError5.invoke(ogp.y(a0qVar, ((qgd) vgdVar).a, null, 4));
                            }
                        } else {
                            if (!(vgdVar instanceof sgd)) {
                                throw new x7j();
                            }
                            z = true;
                        }
                    }
                    dnfVar.j = launchGlagolCommand3;
                    dnfVar.k = null;
                    dnfVar.l = a0qVar;
                    dnfVar.m = null;
                    dnfVar.p = 2;
                    obj = cedVar.g(vgdVar, dnfVar);
                    if (obj != nm6Var) {
                        a0qVar2 = a0qVar;
                        wddVar = (wdd) obj;
                        if (!(wddVar instanceof tdd)) {
                            if (!(wddVar instanceof sdd)) {
                                throw new x7j();
                            }
                            onError2 = launchGlagolCommand3.getOnError();
                            if (onError2 != null) {
                            }
                        }
                        onSuccess = launchGlagolCommand3.getOnSuccess();
                        if (onSuccess != null) {
                        }
                        z = true;
                    }
                    return nm6Var;
                }
                Assertions.throwOrSkip("GlagolLaunch", new FailedAssertionException("Should be used only to connect to station, not when station already connected"));
                return Boolean.valueOf(z);
            }
        }
        dnfVar = new dnf(this, cg6Var);
        Object obj2 = dnfVar.n;
        nm6 nm6Var2 = nm6.a;
        i = dnfVar.p;
        boolean z2 = false;
        if (i == 0) {
        }
        String str2 = (String) obj2;
        a0qVar.getClass();
        str2.getClass();
        vgdVar = (vgd) o8g.i(a0qVar, new xgd(u8nVar, true, str2, false, null, null));
        ssg.a(3, "LaunchGlagolCommandsExecutor", "glagolCastTarget: " + vgdVar, null);
        if (Intrinsics.d(vgdVar, rgd.a)) {
        }
        return Boolean.valueOf(z2);
    }
}
