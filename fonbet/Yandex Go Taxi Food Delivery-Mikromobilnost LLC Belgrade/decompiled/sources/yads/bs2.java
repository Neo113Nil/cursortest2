package yads;

import defpackage.dvw;
import defpackage.g050;
import defpackage.j18;
import defpackage.kde;
import defpackage.my61;
import defpackage.ny61;
import defpackage.vz71;
import defpackage.wls;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.sync.a;

/* loaded from: classes7.dex */
public final class bs2 extends SuspendLambda implements wls {
    public g050 b;
    public my61 c;
    public s41 d;
    public int e;
    public final /* synthetic */ my61 f;
    public final /* synthetic */ s41 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bs2(my61 my61Var, s41 s41Var, Continuation continuation) {
        super(2, continuation);
        this.f = my61Var;
        this.g = s41Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new bs2(this.f, this.g, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return new bs2(this.f, this.g, (Continuation) obj2).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0046, code lost:
    
        if (r10.a(r9) == r0) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [g050] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a aVar;
        my61 my61Var;
        s41 s41Var;
        Throwable th;
        g050 g050Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.e;
        try {
            if (i == 0) {
                b.b(obj);
                this.f.a.b(f5.j, null);
                aVar = my61.d;
                my61Var = this.f;
                s41Var = this.g;
                this.b = aVar;
                this.c = my61Var;
                this.d = s41Var;
                this.e = 1;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    g050Var = this.b;
                    try {
                        b.b(obj);
                        vz71 vz71Var = (vz71) obj;
                        g050Var.d(null);
                        return vz71Var;
                    } catch (Throwable th2) {
                        th = th2;
                        g050Var.d(null);
                        throw th;
                    }
                }
                s41Var = this.d;
                my61Var = this.c;
                ?? r6 = this.b;
                b.b(obj);
                aVar = r6;
            }
            my61Var.a.a(f5.j);
            this.b = aVar;
            this.c = my61Var;
            this.d = s41Var;
            this.e = 2;
            j18 j18Var = new j18(1, dvw.b(this));
            j18Var.u();
            j18Var.w(new zr2(my61Var));
            my61Var.c.a(my61Var.b, s41Var, new kde(j18Var, 9));
            Object s = j18Var.s();
            if (s != coroutineSingletons) {
                a aVar2 = aVar;
                obj = s;
                g050Var = aVar2;
                vz71 vz71Var2 = (vz71) obj;
                g050Var.d(null);
                return vz71Var2;
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
