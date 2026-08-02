package defpackage;

import com.yandex.music.shared.wave.api.StartWaveQueueCommand;
import com.yandex.passport.sloth.ui.dependencies.m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.a;

/* loaded from: classes4.dex */
public final class bdr implements o3l {
    public final rdk a;
    public final uoh b;
    public final j2t c;
    public final jyr d;
    public final k1l e;
    public final k1l f;
    public final a g;
    public final t5l h;

    public bdr(rdk rdkVar, uoh uohVar, j2t j2tVar, jyr jyrVar, k1l k1lVar, k1l k1lVar2, a aVar, t5l t5lVar) {
        aVar.getClass();
        this.a = rdkVar;
        this.b = uohVar;
        this.c = j2tVar;
        this.d = jyrVar;
        this.e = k1lVar;
        this.f = k1lVar2;
        this.g = aVar;
        this.h = t5lVar;
    }

    public final kr7 b(StartWaveQueueCommand startWaveQueueCommand, f7l f7lVar, k7q k7qVar, t5l t5lVar) {
        tvu tvuVar = new tvu(startWaveQueueCommand.getStartRequest().d);
        rdk rdkVar = this.a;
        m mVar = ((luu) rdkVar.b).a;
        mn7 mn7Var = dm6.b;
        jyr jyrVar = (jyr) mVar.c;
        pv9 pv9Var = (pv9) mVar.i;
        mmo mmoVar = (mmo) rdkVar.c;
        cvu cvuVar = new cvu(mn7Var, jyrVar, pv9Var, mmoVar, (rsh) mVar.k);
        atn atnVar = new atn((pv9) mVar.i);
        return new kr7(k7qVar, new au7(new jac((qzc) rdkVar.d, (f5v) rdkVar.e, mmoVar, (fmu) rdkVar.f, mn7Var, cvuVar), mmoVar, mmoVar, this.c, tvuVar, (yks) ((rp7) rdkVar.g).a, mn7Var, (kou) mVar.j, cvuVar, atnVar), startWaveQueueCommand.getStartRequest(), new r0o((ryu) this.d.getValue()), new lu6(), f7lVar, this.e, this.f, this.b, this.g, t5lVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|8|(1:(1:(6:12|13|14|(1:16)|18|19)(2:21|22))(2:23|24))(3:28|29|(2:31|27))|25))|41|6|7|8|(0)(0)|25) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a7, code lost:
    
        if (r12.a(r13, r3, r4, r5, r6, r7) != r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0032, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0033, code lost:
    
        r12 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b4, code lost:
    
        defpackage.ssg.a(6, "StartWaveQueueCommandsExecutor", "execute thrown an exception", r12);
        r11 = r11.getOnError();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00be, code lost:
    
        if (r11 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c0, code lost:
    
        r13 = r12.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c4, code lost:
    
        if (r13 != null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c7, code lost:
    
        r12 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c8, code lost:
    
        r11.invoke(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cb, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0045  */
    @Override // defpackage.o3l
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(StartWaveQueueCommand startWaveQueueCommand, es6 es6Var, cg6 cg6Var) {
        adr adrVar;
        int i;
        if (cg6Var instanceof adr) {
            adrVar = (adr) cg6Var;
            int i2 = adrVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                adrVar.n = i2 - Integer.MIN_VALUE;
                adr adrVar2 = adrVar;
                Object obj = adrVar2.l;
                nm6 nm6Var = nm6.a;
                i = adrVar2.n;
                boolean z = true;
                if (i != 0) {
                    qgg.h0(obj);
                    ssg.a(3, "StartWaveQueueCommandsExecutor", "Starting queue with " + startWaveQueueCommand, null);
                    Function1 queueDescriptor = startWaveQueueCommand.getQueueDescriptor();
                    adrVar2.j = startWaveQueueCommand;
                    adrVar2.k = es6Var;
                    adrVar2.n = 1;
                    obj = queueDescriptor.invoke(adrVar2);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        startWaveQueueCommand = adrVar2.j;
                        qgg.h0(obj);
                        Function0 onSuccess = startWaveQueueCommand.getOnSuccess();
                        if (onSuccess != null) {
                            onSuccess.invoke();
                        }
                        return Boolean.valueOf(z);
                    }
                    es6Var = adrVar2.k;
                    startWaveQueueCommand = adrVar2.j;
                    qgg.h0(obj);
                }
                kr7 b = b(startWaveQueueCommand, (f7l) es6Var.a, (k7q) obj, this.h);
                lzu lzuVar = new lzu(startWaveQueueCommand.getStartRequest().f, startWaveQueueCommand.getStartRequest().c);
                g4l g4lVar = (g4l) es6Var.b;
                boolean playWhenReady = startWaveQueueCommand.getPlayWhenReady();
                y3l queueStartValidator = startWaveQueueCommand.getQueueStartValidator();
                boolean z2 = startWaveQueueCommand.getStartRequest().d;
                adrVar2.j = startWaveQueueCommand;
                adrVar2.k = null;
                adrVar2.n = 2;
            }
        }
        adrVar = new adr(this, cg6Var);
        adr adrVar22 = adrVar;
        Object obj2 = adrVar22.l;
        nm6 nm6Var2 = nm6.a;
        i = adrVar22.n;
        boolean z3 = true;
        if (i != 0) {
        }
        kr7 b2 = b(startWaveQueueCommand, (f7l) es6Var.a, (k7q) obj2, this.h);
        lzu lzuVar2 = new lzu(startWaveQueueCommand.getStartRequest().f, startWaveQueueCommand.getStartRequest().c);
        g4l g4lVar2 = (g4l) es6Var.b;
        boolean playWhenReady2 = startWaveQueueCommand.getPlayWhenReady();
        y3l queueStartValidator2 = startWaveQueueCommand.getQueueStartValidator();
        boolean z22 = startWaveQueueCommand.getStartRequest().d;
        adrVar22.j = startWaveQueueCommand;
        adrVar22.k = null;
        adrVar22.n = 2;
    }
}
