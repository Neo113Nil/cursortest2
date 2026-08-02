package defpackage;

import com.yandex.music.shared.playback.core.api.PlaybackQueueStartValidator$InvalidQueueException;
import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueLaunch;
import com.yandex.music.shared.ynison.center.api.launcher.StartQueueIntoYnisonRemoteCommand;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class qcr implements o3l {
    public final j9w a;
    public final d9w b;
    public final jiv c;
    public final jyr d;
    public final jyr e;
    public final jyr f;
    public final jyr g;
    public final jyr h;

    public qcr(jyr jyrVar, jyr jyrVar2, jyr jyrVar3, jyr jyrVar4, jyr jyrVar5, j9w j9wVar, d9w d9wVar, jiv jivVar) {
        this.a = j9wVar;
        this.b = d9wVar;
        this.c = jivVar;
        this.d = jyrVar;
        this.e = jyrVar2;
        this.f = jyrVar3;
        this.g = jyrVar4;
        this.h = jyrVar5;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(1:(1:(6:12|13|14|(1:16)|17|18)(2:20|21))(6:22|23|24|25|(5:28|14|(0)|17|18)|27))(2:39|40))(3:44|45|(4:47|(1:49)|50|51)(2:52|(2:54|27)))|41|(3:43|25|(0))|27))|56|6|7|(0)(0)|41|(0)|27|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0030, code lost:
    
        r9 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c0 A[Catch: PlaybackQueueStartValidator$InvalidQueueException -> 0x0030, TRY_LEAVE, TryCatch #0 {PlaybackQueueStartValidator$InvalidQueueException -> 0x0030, blocks: (B:13:0x002b, B:14:0x00ba, B:16:0x00c0, B:40:0x004b, B:41:0x0090, B:45:0x0052, B:47:0x0067, B:49:0x0077, B:50:0x007a, B:52:0x007d), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // defpackage.o3l
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(StartQueueIntoYnisonRemoteCommand startQueueIntoYnisonRemoteCommand, es6 es6Var, cg6 cg6Var) {
        pcr pcrVar;
        nm6 nm6Var;
        int i;
        oow oowVar;
        y3l queueStartValidator;
        jiv jivVar;
        StartQueueIntoYnisonRemoteCommand startQueueIntoYnisonRemoteCommand2;
        oow oowVar2;
        j9w j9wVar;
        StartQueueIntoYnisonRemoteCommand startQueueIntoYnisonRemoteCommand3;
        Function0 onSuccess;
        if (cg6Var instanceof pcr) {
            pcrVar = (pcr) cg6Var;
            int i2 = pcrVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pcrVar.n = i2 - Integer.MIN_VALUE;
                Object obj = pcrVar.l;
                nm6Var = nm6.a;
                i = pcrVar.n;
                boolean z = true;
                if (i != 0) {
                    qgg.h0(obj);
                    PlaybackCommand$QueueLaunch.Basic basicLaunchCommand = startQueueIntoYnisonRemoteCommand.getBasicLaunchCommand();
                    basicLaunchCommand.getClass();
                    if (((Boolean) vyp.b(basicLaunchCommand, ian.a)).booleanValue()) {
                        Exception exc = (Exception) this.b.invoke("Cannot launch queue as secondary to ynison passive device");
                        Function1 onError = startQueueIntoYnisonRemoteCommand.getOnError();
                        if (onError != null) {
                            onError.invoke(exc);
                        }
                        return Boolean.FALSE;
                    }
                    PlaybackCommand$QueueLaunch.Basic basicLaunchCommand2 = startQueueIntoYnisonRemoteCommand.getBasicLaunchCommand();
                    uol uolVar = (uol) es6Var.c;
                    pcrVar.j = startQueueIntoYnisonRemoteCommand;
                    pcrVar.n = 1;
                    obj = c(basicLaunchCommand2, uolVar, pcrVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            startQueueIntoYnisonRemoteCommand3 = pcrVar.j;
                            qgg.h0(obj);
                            onSuccess = startQueueIntoYnisonRemoteCommand3.getOnSuccess();
                            if (onSuccess != null) {
                                onSuccess.invoke();
                            }
                            return Boolean.valueOf(z);
                        }
                        oowVar2 = pcrVar.k;
                        startQueueIntoYnisonRemoteCommand2 = pcrVar.j;
                        try {
                            qgg.h0(obj);
                            j9wVar = this.a;
                            pcrVar.j = startQueueIntoYnisonRemoteCommand2;
                            pcrVar.k = null;
                            pcrVar.n = 3;
                        } catch (PlaybackQueueStartValidator$InvalidQueueException e) {
                            StartQueueIntoYnisonRemoteCommand startQueueIntoYnisonRemoteCommand4 = startQueueIntoYnisonRemoteCommand2;
                            e = e;
                            startQueueIntoYnisonRemoteCommand = startQueueIntoYnisonRemoteCommand4;
                            ssg.a(6, "YnisonApp:StartQueueIntoYnisonRemoteCommandsExecutor", "execute thrown an exception", e);
                            Function1 onError2 = startQueueIntoYnisonRemoteCommand.getOnError();
                            if (onError2 != null) {
                                Throwable cause = e.getCause();
                                if (cause != null) {
                                    e = cause;
                                }
                                onError2.invoke(e);
                            }
                            z = false;
                            return Boolean.valueOf(z);
                        }
                        if (j9wVar.invoke(oowVar2, pcrVar) != nm6Var) {
                            startQueueIntoYnisonRemoteCommand3 = startQueueIntoYnisonRemoteCommand2;
                            onSuccess = startQueueIntoYnisonRemoteCommand3.getOnSuccess();
                            if (onSuccess != null) {
                            }
                            return Boolean.valueOf(z);
                        }
                        return nm6Var;
                    }
                    startQueueIntoYnisonRemoteCommand = pcrVar.j;
                    qgg.h0(obj);
                }
                oowVar = (oow) obj;
                queueStartValidator = startQueueIntoYnisonRemoteCommand.getQueueStartValidator();
                jivVar = this.c;
                pcrVar.j = startQueueIntoYnisonRemoteCommand;
                pcrVar.k = oowVar;
                pcrVar.n = 2;
                if (a0g.O(queueStartValidator, oowVar, jivVar, pcrVar) != nm6Var) {
                    startQueueIntoYnisonRemoteCommand2 = startQueueIntoYnisonRemoteCommand;
                    oowVar2 = oowVar;
                    j9wVar = this.a;
                    pcrVar.j = startQueueIntoYnisonRemoteCommand2;
                    pcrVar.k = null;
                    pcrVar.n = 3;
                    if (j9wVar.invoke(oowVar2, pcrVar) != nm6Var) {
                    }
                }
                return nm6Var;
            }
        }
        pcrVar = new pcr(this, cg6Var);
        Object obj2 = pcrVar.l;
        nm6Var = nm6.a;
        i = pcrVar.n;
        boolean z2 = true;
        if (i != 0) {
        }
        oowVar = (oow) obj2;
        queueStartValidator = startQueueIntoYnisonRemoteCommand.getQueueStartValidator();
        jivVar = this.c;
        pcrVar.j = startQueueIntoYnisonRemoteCommand;
        pcrVar.k = oowVar;
        pcrVar.n = 2;
        if (a0g.O(queueStartValidator, oowVar, jivVar, pcrVar) != nm6Var) {
        }
        return nm6Var;
    }

    public final Object c(PlaybackCommand$QueueLaunch.Basic basic, uol uolVar, pcr pcrVar) {
        return vyp.a(basic, new mmo((zzp) this.h.getValue(), (b5d) this.f.getValue(), (q4d) this.g.getValue(), uolVar, (f5v) this.d.getValue(), (sfn) this.e.getValue()), pcrVar);
    }
}
