package defpackage;

import kotlin.jvm.functions.Function0;
import ru.yandex.music.glagol.legacy.StartLegacyGlagolQueueBasicCommand;

/* loaded from: classes5.dex */
public final class dcr implements o3l {
    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|8|(1:(2:11|12)(2:20|21))(7:22|23|(1:25)(1:32)|26|(1:28)|29|(1:31))|13|(1:15)|17|18))|42|6|7|8|(0)(0)|13|(0)|17|18) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x002b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x002c, code lost:
    
        r11 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0081, code lost:
    
        defpackage.ssg.a(6, "StartLegacyQueueSpecificCommandsExecutor", "execute thrown an exception", r11);
        r10 = r10.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008d, code lost:
    
        if (r10 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008f, code lost:
    
        r12 = r11.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0093, code lost:
    
        if (r12 != null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0096, code lost:
    
        r11 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0097, code lost:
    
        r10.invoke(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009a, code lost:
    
        r8 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007d A[Catch: PlaybackQueueStartValidator$InvalidQueueException -> 0x002b, TRY_LEAVE, TryCatch #0 {PlaybackQueueStartValidator$InvalidQueueException -> 0x002b, blocks: (B:12:0x0027, B:13:0x0077, B:15:0x007d, B:23:0x0038, B:25:0x004b, B:26:0x0051, B:28:0x0055, B:29:0x0057), top: B:8:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    @Override // defpackage.o3l
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(StartLegacyGlagolQueueBasicCommand startLegacyGlagolQueueBasicCommand, es6 es6Var, cg6 cg6Var) {
        ccr ccrVar;
        int i;
        Function0 onSuccess;
        if (cg6Var instanceof ccr) {
            ccrVar = (ccr) cg6Var;
            int i2 = ccrVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ccrVar.m = i2 - Integer.MIN_VALUE;
                ccr ccrVar2 = ccrVar;
                Object obj = ccrVar2.k;
                nm6 nm6Var = nm6.a;
                i = ccrVar2.m;
                boolean z = true;
                if (i != 0) {
                    qgg.h0(obj);
                    q7q q = pcg.q((t7q) startLegacyGlagolQueueBasicCommand.getQueue().j.getValue());
                    t1q t1qVar = q != null ? (t1q) q.a : null;
                    xhd xhdVar = new xhd(t1qVar != null ? t1qVar.a : null);
                    z1q queue = startLegacyGlagolQueueBasicCommand.getQueue();
                    g4l g4lVar = (g4l) es6Var.b;
                    boolean playWhenReady = startLegacyGlagolQueueBasicCommand.getPlayWhenReady();
                    y3l queueStartValidator = startLegacyGlagolQueueBasicCommand.getQueueStartValidator();
                    ccrVar2.j = startLegacyGlagolQueueBasicCommand;
                    ccrVar2.m = 1;
                    if (g4lVar.a(queue, xhdVar, playWhenReady, queueStartValidator, false, ccrVar2) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    startLegacyGlagolQueueBasicCommand = ccrVar2.j;
                    qgg.h0(obj);
                }
                onSuccess = startLegacyGlagolQueueBasicCommand.getOnSuccess();
                if (onSuccess != null) {
                    onSuccess.invoke();
                }
                return Boolean.valueOf(z);
            }
        }
        ccrVar = new ccr(this, cg6Var);
        ccr ccrVar22 = ccrVar;
        Object obj2 = ccrVar22.k;
        nm6 nm6Var2 = nm6.a;
        i = ccrVar22.m;
        boolean z2 = true;
        if (i != 0) {
        }
        onSuccess = startLegacyGlagolQueueBasicCommand.getOnSuccess();
        if (onSuccess != null) {
        }
        return Boolean.valueOf(z2);
    }
}
