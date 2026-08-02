package yads;

import defpackage.mdh;
import defpackage.ny61;
import defpackage.q881;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.uh61;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes7.dex */
public final class qd1 extends SuspendLambda implements wls {
    public int b;
    public final /* synthetic */ q881 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ tls f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qd1(q881 q881Var, String str, String str2, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.c = q881Var;
        this.d = str;
        this.e = str2;
        this.f = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new qd1(this.c, this.d, this.e, this.f, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((qd1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
    
        if (r8 == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
    
        if (defpackage.tje.k0(defpackage.mdh.b, new yads.yd1(r8, r1, null), r7) == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            b.b(obj);
            uh61 uh61Var = this.c.c;
            String str = this.d;
            this.b = 1;
            uh61Var.getClass();
            sjh sjhVar = uyj.a;
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                this.f.invoke(this.d);
                return zy11Var;
            }
            b.b(obj);
        }
        uh61 uh61Var2 = this.c.c;
        String str2 = this.e;
        this.b = 2;
        uh61Var2.getClass();
        sjh sjhVar2 = uyj.a;
        Object k0 = tje.k0(mdh.b, new zd1(uh61Var2, str2, null), this);
        if (k0 != coroutineSingletons) {
            k0 = zy11Var;
        }
    }
}
