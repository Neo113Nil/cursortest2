package defpackage;

import com.yandex.music.shared.radio.api.commands.StartVideoClipRadioQueueCommand;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.a;

/* loaded from: classes4.dex */
public final class zcr implements o3l {
    public final y6u a;
    public final agn b;
    public final uoh c;

    public zcr(y6u y6uVar, agn agnVar, uoh uohVar) {
        y6uVar.getClass();
        agnVar.getClass();
        this.a = y6uVar;
        this.b = agnVar;
        this.c = uohVar;
    }

    public final s8q b(StartVideoClipRadioQueueCommand startVideoClipRadioQueueCommand, k7q k7qVar, f7l f7lVar, uol uolVar) {
        a8q.c.getClass();
        y7u startRequest = startVideoClipRadioQueueCommand.getStartRequest();
        y6u y6uVar = this.a;
        vw5 vw5Var = y6uVar.a;
        z6u z6uVar = y6uVar.b;
        a aVar = (a) z6uVar.b;
        yks yksVar = new yks(vw5Var, aVar);
        xdr a = ydr.a(ngn.a);
        b56 b56Var = new b56(a, 4);
        bjt bjtVar = new bjt(vw5Var, a, aVar);
        return new s8q(k7qVar, new rfn(new nur(b56Var, new cr(a, y6uVar.a, bjtVar, new n3m(bjtVar, yksVar, aVar), yksVar, (a) z6uVar.b, y6uVar.c.a), aVar), new zfn(a, yksVar)), f7lVar, uolVar, this.b, this.c, startRequest);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|8|(1:(1:(6:12|13|14|(1:16)|18|19)(2:21|22))(2:23|24))(3:28|29|(2:31|27))|25))|41|6|7|8|(0)(0)|25) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0097, code lost:
    
        if (r12.a(r13, r3, r4, r5, false, r7) != r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0031, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0032, code lost:
    
        r12 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a4, code lost:
    
        defpackage.ssg.a(6, "StartVideoClipRadioQueueCommandsExecutor", "execute thrown an exception", r12);
        r11 = r11.getOnError();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ae, code lost:
    
        if (r11 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b0, code lost:
    
        r13 = r12.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b4, code lost:
    
        if (r13 != null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b7, code lost:
    
        r12 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b8, code lost:
    
        r11.invoke(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bb, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0044  */
    @Override // defpackage.o3l
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(StartVideoClipRadioQueueCommand startVideoClipRadioQueueCommand, es6 es6Var, cg6 cg6Var) {
        ycr ycrVar;
        int i;
        if (cg6Var instanceof ycr) {
            ycrVar = (ycr) cg6Var;
            int i2 = ycrVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ycrVar.n = i2 - Integer.MIN_VALUE;
                ycr ycrVar2 = ycrVar;
                Object obj = ycrVar2.l;
                nm6 nm6Var = nm6.a;
                i = ycrVar2.n;
                boolean z = true;
                if (i != 0) {
                    qgg.h0(obj);
                    ssg.a(3, "StartVideoClipRadioQueueCommandsExecutor", "Starting queue with " + startVideoClipRadioQueueCommand, null);
                    Function1 queueDescriptor = startVideoClipRadioQueueCommand.getQueueDescriptor();
                    ycrVar2.j = startVideoClipRadioQueueCommand;
                    ycrVar2.k = es6Var;
                    ycrVar2.n = 1;
                    obj = queueDescriptor.invoke(ycrVar2);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        startVideoClipRadioQueueCommand = ycrVar2.j;
                        qgg.h0(obj);
                        Function0 onSuccess = startVideoClipRadioQueueCommand.getOnSuccess();
                        if (onSuccess != null) {
                            onSuccess.invoke();
                        }
                        return Boolean.valueOf(z);
                    }
                    es6Var = ycrVar2.k;
                    startVideoClipRadioQueueCommand = ycrVar2.j;
                    qgg.h0(obj);
                }
                s8q b = b(startVideoClipRadioQueueCommand, (k7q) obj, (f7l) es6Var.a, (uol) es6Var.c);
                t7u t7uVar = new t7u();
                g4l g4lVar = (g4l) es6Var.b;
                boolean playWhenReady = startVideoClipRadioQueueCommand.getPlayWhenReady();
                y3l queueStartValidator = startVideoClipRadioQueueCommand.getQueueStartValidator();
                ycrVar2.j = startVideoClipRadioQueueCommand;
                ycrVar2.k = null;
                ycrVar2.n = 2;
            }
        }
        ycrVar = new ycr(this, cg6Var);
        ycr ycrVar22 = ycrVar;
        Object obj2 = ycrVar22.l;
        nm6 nm6Var2 = nm6.a;
        i = ycrVar22.n;
        boolean z2 = true;
        if (i != 0) {
        }
        s8q b2 = b(startVideoClipRadioQueueCommand, (k7q) obj2, (f7l) es6Var.a, (uol) es6Var.c);
        t7u t7uVar2 = new t7u();
        g4l g4lVar2 = (g4l) es6Var.b;
        boolean playWhenReady2 = startVideoClipRadioQueueCommand.getPlayWhenReady();
        y3l queueStartValidator2 = startVideoClipRadioQueueCommand.getQueueStartValidator();
        ycrVar22.j = startVideoClipRadioQueueCommand;
        ycrVar22.k = null;
        ycrVar22.n = 2;
    }
}
