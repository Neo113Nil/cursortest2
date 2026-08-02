package yads;

import android.os.Looper;
import defpackage.bo31;
import defpackage.ge71;
import defpackage.kl71;
import defpackage.ny61;
import defpackage.r671;
import defpackage.tje;
import defpackage.vb81;
import defpackage.wls;
import defpackage.zy11;
import java.util.Map;
import java.util.Set;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes7.dex */
public final class de extends SuspendLambda implements wls {
    public int b;
    public final /* synthetic */ r671 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public de(r671 r671Var, Continuation continuation) {
        super(2, continuation);
        this.c = r671Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new de(this.c, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return new de(this.c, (Continuation) obj2).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0043, code lost:
    
        if (kotlinx.coroutines.a.i(r5, r8) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
    
        if (r9 == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        return r0;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0043 -> B:13:0x001b). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                boolean booleanValue = ((Boolean) obj).booleanValue();
                r671 r671Var = this.c;
                if (!booleanValue) {
                    Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
                    StackTraceElement[] stackTraceElementArr = allStackTraces.get(Looper.getMainLooper().getThread());
                    if (stackTraceElementArr != null) {
                        Set set = kl71.a;
                        if (kl71.b(stackTraceElementArr, r671Var.c)) {
                            ge71 ge71Var = r671Var.f.a;
                            if (ge71Var.a != null) {
                                ge71Var.c.execute(new bo31(29, ge71Var, allStackTraces));
                            }
                        }
                    }
                    return zy11.a;
                }
                long j = r671Var.a;
                this.b = 2;
            } else if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        b.b(obj);
        r671 r671Var2 = this.c;
        vb81 vb81Var = r671Var2.e;
        long j2 = r671Var2.b;
        this.b = 1;
        obj = tje.k0(vb81Var.a, new rd(vb81Var, j2, null), this);
    }
}
