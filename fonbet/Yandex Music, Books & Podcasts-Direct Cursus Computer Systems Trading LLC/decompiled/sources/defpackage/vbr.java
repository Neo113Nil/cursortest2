package defpackage;

import com.yandex.music.shared.fmradio.api.commands.StartFmRadioQueueCommand;
import com.yandex.music.shared.playback.core.api.PlaybackQueueStartValidator$InvalidQueueException;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class vbr implements o3l {
    /* JADX WARN: Removed duplicated region for block: B:35:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // defpackage.o3l
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(StartFmRadioQueueCommand startFmRadioQueueCommand, es6 es6Var, cg6 cg6Var) {
        ubr ubrVar;
        int i;
        StartFmRadioQueueCommand startFmRadioQueueCommand2;
        Throwable e;
        try {
            if (cg6Var instanceof ubr) {
                ubrVar = (ubr) cg6Var;
                int i2 = ubrVar.l;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    ubrVar.l = i2 - Integer.MIN_VALUE;
                    Object obj = ubrVar.j;
                    nm6 nm6Var = nm6.a;
                    i = ubrVar.l;
                    if (i != 0) {
                        qgg.h0(obj);
                        ssg.a(3, "StartFmRadioQueueCommandsExecutor", "Starting queue with " + startFmRadioQueueCommand, null);
                        Function1 d = startFmRadioQueueCommand.d();
                        ubrVar.l = 1;
                        obj = d.invoke(ubrVar);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            try {
                                qgg.h0(obj);
                                throw null;
                            } catch (PlaybackQueueStartValidator$InvalidQueueException e2) {
                                e = e2;
                                startFmRadioQueueCommand2 = null;
                                ssg.a(6, "StartFmRadioQueueCommandsExecutor", "execute thrown an exception", e);
                                Function1 a = startFmRadioQueueCommand2.a();
                                if (a != null) {
                                    Throwable cause = e.getCause();
                                    if (cause != null) {
                                        e = cause;
                                    }
                                    a.invoke(e);
                                }
                                return false;
                            }
                        }
                        startFmRadioQueueCommand = null;
                        qgg.h0(obj);
                    }
                    a1q.a.getClass();
                    startFmRadioQueueCommand.getClass();
                    ((k7q) obj).getClass();
                    throw null;
                }
            }
            if (i != 0) {
            }
            a1q.a.getClass();
            startFmRadioQueueCommand.getClass();
            ((k7q) obj).getClass();
            throw null;
        } catch (PlaybackQueueStartValidator$InvalidQueueException e3) {
            startFmRadioQueueCommand2 = startFmRadioQueueCommand;
            e = e3;
        }
        ubrVar = new ubr(this, cg6Var);
        Object obj2 = ubrVar.j;
        nm6 nm6Var2 = nm6.a;
        i = ubrVar.l;
    }
}
