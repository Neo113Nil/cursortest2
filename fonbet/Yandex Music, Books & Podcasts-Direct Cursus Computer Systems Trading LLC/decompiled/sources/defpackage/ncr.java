package defpackage;

import com.yandex.music.shared.playback.core.api.PlaybackQueueStartValidator$InvalidQueueException;
import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueLaunch;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.yandex.music.common.media.control.shared.commands.StartQueueCommand;

/* loaded from: classes5.dex */
public final class ncr extends aur implements Function2 {
    public int j;
    public final /* synthetic */ StartQueueCommand k;
    public final /* synthetic */ ocr l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ncr(StartQueueCommand startQueueCommand, ocr ocrVar, Continuation continuation) {
        super(2, continuation);
        this.k = startQueueCommand;
        this.l = ocrVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new ncr(this.k, this.l, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ncr) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
    
        if (r12 == r0) goto L20;
     */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.j;
        StartQueueCommand startQueueCommand = this.k;
        try {
            if (i == 0) {
                qgg.h0(obj);
                Function1 queueDescriptor = startQueueCommand.getQueueDescriptor();
                this.j = 1;
                obj = queueDescriptor.invoke(this);
                if (obj == nm6Var) {
                    return nm6Var;
                }
            } else {
                if (i != 1) {
                    if (i == 2) {
                        qgg.h0(obj);
                        return new q3l((PlaybackCommand$QueueLaunch.Basic) obj);
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
            }
            v8n v8nVar = (v8n) obj;
            v9n v9nVar = new v9n(startQueueCommand.getPlayWhenReady(), startQueueCommand.getContinuation(), startQueueCommand.getQueueStartValidator(), startQueueCommand.getOnSuccess(), startQueueCommand.getOnError());
            dan danVar = (dan) this.l.a.getValue();
            danVar.getClass();
            v8nVar.getClass();
            Function2 function2 = (Function2) v8nVar.a(danVar.a);
            this.j = 2;
            obj = function2.invoke(v9nVar, this);
        } catch (PlaybackQueueStartValidator$InvalidQueueException e) {
            Throwable th = e;
            ssg.a(6, "StartQueueCommandsExecutor", "execute thrown an exception", th);
            Function1 onError = startQueueCommand.getOnError();
            if (onError != null) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    th = cause;
                }
                onError.invoke(th);
            }
            return s3l.a;
        }
    }
}
