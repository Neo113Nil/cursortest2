package defpackage;

import com.yandex.music.shared.ynison.api.queue.StartYnisonQueueCommand;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class ddr implements o3l {
    public final diw a;

    public ddr(diw diwVar) {
        this.a = diwVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|8|(1:(2:11|12)(2:20|21))(3:22|23|(1:25))|13|(1:15)|17|18))|35|6|7|8|(0)(0)|13|(0)|17|18) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x002d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x002e, code lost:
    
        r12 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009c, code lost:
    
        defpackage.ssg.a(6, "StartYnisonQueueCommandsExecutor", "execute thrown an exception", r12);
        r11 = r11.getOnError();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a6, code lost:
    
        if (r11 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a8, code lost:
    
        r13 = r12.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ac, code lost:
    
        if (r13 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00af, code lost:
    
        r12 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b0, code lost:
    
        r11.invoke(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b3, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0098 A[Catch: PlaybackQueueStartValidator$InvalidQueueException -> 0x002d, TRY_LEAVE, TryCatch #0 {PlaybackQueueStartValidator$InvalidQueueException -> 0x002d, blocks: (B:12:0x0029, B:13:0x0092, B:15:0x0098, B:23:0x004d), top: B:8:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    @Override // defpackage.o3l
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(StartYnisonQueueCommand startYnisonQueueCommand, es6 es6Var, cg6 cg6Var) {
        cdr cdrVar;
        int i;
        Function0 onSuccess;
        if (cg6Var instanceof cdr) {
            cdrVar = (cdr) cg6Var;
            int i2 = cdrVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cdrVar.m = i2 - Integer.MIN_VALUE;
                cdr cdrVar2 = cdrVar;
                Object obj = cdrVar2.k;
                nm6 nm6Var = nm6.a;
                i = cdrVar2.m;
                boolean z = true;
                if (i != 0) {
                    qgg.h0(obj);
                    ssg.a(3, "StartYnisonQueueCommandsExecutor", "Starting ynison queue with " + startYnisonQueueCommand, null);
                    wpw wpwVar = new wpw(this.a, startYnisonQueueCommand.getStartRequest().a);
                    maq maqVar = ((pqw) startYnisonQueueCommand.getStartRequest().a.getValue()).b;
                    pnw pnwVar = new pnw(maqVar.k().getDescription(), maqVar.k());
                    g4l g4lVar = (g4l) es6Var.b;
                    boolean playWhenReady = startYnisonQueueCommand.getPlayWhenReady();
                    y3l queueStartValidator = startYnisonQueueCommand.getQueueStartValidator();
                    cdrVar2.j = startYnisonQueueCommand;
                    cdrVar2.m = 1;
                    if (g4lVar.a(wpwVar, pnwVar, playWhenReady, queueStartValidator, false, cdrVar2) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    startYnisonQueueCommand = cdrVar2.j;
                    qgg.h0(obj);
                }
                onSuccess = startYnisonQueueCommand.getOnSuccess();
                if (onSuccess != null) {
                    onSuccess.invoke();
                }
                return Boolean.valueOf(z);
            }
        }
        cdrVar = new cdr(this, cg6Var);
        cdr cdrVar22 = cdrVar;
        Object obj2 = cdrVar22.k;
        nm6 nm6Var2 = nm6.a;
        i = cdrVar22.m;
        boolean z2 = true;
        if (i != 0) {
        }
        onSuccess = startYnisonQueueCommand.getOnSuccess();
        if (onSuccess != null) {
        }
        return Boolean.valueOf(z2);
    }
}
