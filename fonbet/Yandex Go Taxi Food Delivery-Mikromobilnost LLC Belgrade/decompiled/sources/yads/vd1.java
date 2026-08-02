package yads;

import defpackage.g050;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uh61;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.sync.a;

/* loaded from: classes7.dex */
public final class vd1 extends SuspendLambda implements wls {
    public g050 b;
    public uh61 c;
    public int d;
    public final /* synthetic */ uh61 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vd1(uh61 uh61Var, Continuation continuation) {
        super(2, continuation);
        this.e = uh61Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new vd1(this.e, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return new vd1(this.e, (Continuation) obj2).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0035, code lost:
    
        if (r7.a(r6) == r0) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [g050] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        uh61 uh61Var;
        a aVar;
        Throwable th;
        g050 g050Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.d;
        try {
            if (i == 0) {
                b.b(obj);
                uh61Var = this.e;
                aVar = uh61Var.d;
                this.b = aVar;
                this.c = uh61Var;
                this.d = 1;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    g050Var = this.b;
                    try {
                        b.b(obj);
                        String str = (String) obj;
                        g050Var.d(null);
                        return str;
                    } catch (Throwable th2) {
                        th = th2;
                        g050Var.d(null);
                        throw th;
                    }
                }
                uh61Var = this.c;
                ?? r3 = this.b;
                b.b(obj);
                aVar = r3;
            }
            this.b = aVar;
            this.c = null;
            this.d = 2;
            uh61Var.getClass();
            sjh sjhVar = uyj.a;
            Object k0 = tje.k0(mdh.b, new xd1(uh61Var, null), this);
            if (k0 != coroutineSingletons) {
                a aVar2 = aVar;
                obj = k0;
                g050Var = aVar2;
                String str2 = (String) obj;
                g050Var.d(null);
                return str2;
            }
            return coroutineSingletons;
        } catch (Throwable th3) {
            a aVar3 = aVar;
            th = th3;
            g050Var = aVar3;
            g050Var.d(null);
            throw th;
        }
    }
}
