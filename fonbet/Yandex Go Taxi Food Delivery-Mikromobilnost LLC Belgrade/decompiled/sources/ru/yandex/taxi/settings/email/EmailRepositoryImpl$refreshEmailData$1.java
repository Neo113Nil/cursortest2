package ru.yandex.taxi.settings.email;

import defpackage.jst;
import defpackage.kgx;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.s8o;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.settings.email.EmailRepositoryImpl$refreshEmailData$1", f = "EmailRepositoryImpl.kt", l = {71}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class EmailRepositoryImpl$refreshEmailData$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailRepositoryImpl$refreshEmailData$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EmailRepositoryImpl$refreshEmailData$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((EmailRepositoryImpl$refreshEmailData$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a aVar;
        Throwable th;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                a aVar2 = this.this$0;
                try {
                    this.L$0 = aVar2;
                    this.label = 1;
                    if (a.a(aVar2, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } catch (Throwable th2) {
                    aVar = aVar2;
                    th = th2;
                    if (s8o.C(th)) {
                    }
                    r0 r0Var = this.this$0.d;
                    Boolean bool = Boolean.FALSE;
                    r0Var.getClass();
                    r0Var.m(null, bool);
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar = (a) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable th3) {
                    th = th3;
                    if (s8o.C(th)) {
                        jst.e.k(th, "Got error trying to get email");
                    } else {
                        kgx[] kgxVarArr = a.i;
                        aVar.f(0, "");
                    }
                    r0 r0Var2 = this.this$0.d;
                    Boolean bool2 = Boolean.FALSE;
                    r0Var2.getClass();
                    r0Var2.m(null, bool2);
                    return zy11.a;
                }
            }
            r0 r0Var22 = this.this$0.d;
            Boolean bool22 = Boolean.FALSE;
            r0Var22.getClass();
            r0Var22.m(null, bool22);
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
