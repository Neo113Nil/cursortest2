package yads;

import defpackage.g3r;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uh61;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import java.io.File;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes7.dex */
public final class xd1 extends SuspendLambda implements wls {
    public int b;
    public final /* synthetic */ uh61 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xd1(uh61 uh61Var, Continuation continuation) {
        super(2, continuation);
        this.c = uh61Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new xd1(this.c, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return new xd1(this.c, (Continuation) obj2).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        try {
            if (i == 0) {
                b.b(obj);
                uh61 uh61Var = this.c;
                this.b = 1;
                sjh sjhVar = uyj.a;
                obj = tje.k0(mdh.b, new ud1(uh61Var, null), this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
            }
            File file = new File((File) obj, "light_bundle_script.js");
            if (file.exists()) {
                return g3r.e(file);
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
