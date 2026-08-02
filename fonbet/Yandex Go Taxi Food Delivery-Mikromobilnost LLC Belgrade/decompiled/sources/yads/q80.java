package yads;

import defpackage.b881;
import defpackage.g050;
import defpackage.kc71;
import defpackage.ny61;
import defpackage.sa71;
import defpackage.vx71;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.sync.a;

/* loaded from: classes7.dex */
public final class q80 extends SuspendLambda implements wls {
    public g050 b;
    public b881 c;
    public b881 d;
    public int e;
    public final /* synthetic */ b881 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q80(b881 b881Var, Continuation continuation) {
        super(2, continuation);
        this.f = b881Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new q80(this.f, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return new q80(this.f, (Continuation) obj2).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0040, code lost:
    
        if (r1.a(r5) == r0) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0062  */
    /* JADX WARN: Type inference failed for: r3v4, types: [g050] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [g050] */
    /* JADX WARN: Type inference failed for: r5v9, types: [g050] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        b881 b881Var;
        a aVar;
        Throwable th;
        b881 b881Var2;
        Object obj2;
        a aVar2;
        b881 b881Var3;
        ?? r5;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.e;
        try {
            if (i == 0) {
                b.b(obj);
                b881Var = this.f;
                aVar = b881Var.f;
                this.b = aVar;
                this.c = b881Var;
                this.e = 1;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b881Var2 = this.d;
                    b881Var3 = this.c;
                    r5 = this.b;
                    try {
                        b.b(obj);
                        obj2 = ((Result) obj).getValue();
                        aVar2 = r5;
                        if (obj2 instanceof Result.Failure) {
                            obj2 = null;
                        }
                        b881Var2.e = (kc71) obj2;
                        b881Var = b881Var3;
                        r5 = aVar2;
                        vx71 a = b881Var.c.a(b881Var.a.a(), b881Var.e);
                        r5.d(null);
                        return a;
                    } catch (Throwable th2) {
                        th = th2;
                        aVar = r5;
                        aVar.d(null);
                        throw th;
                    }
                }
                b881 b881Var4 = this.c;
                ?? r3 = this.b;
                b.b(obj);
                b881Var = b881Var4;
                aVar = r3;
            }
            if (b881Var.e != null) {
                r5 = aVar;
                vx71 a2 = b881Var.c.a(b881Var.a.a(), b881Var.e);
                r5.d(null);
                return a2;
            }
            sa71 sa71Var = b881Var.b;
            this.b = aVar;
            this.c = b881Var;
            this.d = b881Var;
            try {
                this.e = 2;
                Object a3 = sa71Var.a(this);
                if (a3 != coroutineSingletons) {
                    b881Var2 = b881Var;
                    obj2 = a3;
                    aVar2 = aVar;
                    b881Var3 = b881Var2;
                    if (obj2 instanceof Result.Failure) {
                    }
                    b881Var2.e = (kc71) obj2;
                    b881Var = b881Var3;
                    r5 = aVar2;
                    vx71 a22 = b881Var.c.a(b881Var.a.a(), b881Var.e);
                    r5.d(null);
                    return a22;
                }
                return coroutineSingletons;
            } catch (Throwable th3) {
                th = th3;
                aVar.d(null);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
