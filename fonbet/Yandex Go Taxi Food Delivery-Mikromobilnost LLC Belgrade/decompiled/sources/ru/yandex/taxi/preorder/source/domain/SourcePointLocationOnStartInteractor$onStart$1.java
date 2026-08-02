package ru.yandex.taxi.preorder.source.domain;

import defpackage.jst;
import defpackage.mo21;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.po21;
import defpackage.tse;
import defpackage.wls;
import defpackage.xby;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.analytics.LocationRequestAnalytics$Source;
import ru.yandex.taxi.systemrequeirements.location.LocationRequirementsException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.source.domain.SourcePointLocationOnStartInteractor$onStart$1", f = "SourcePointLocationOnStartInteractor.kt", l = {HProv.ALG_SID_KECCAK_224, 91, 99}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SourcePointLocationOnStartInteractor$onStart$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ t this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SourcePointLocationOnStartInteractor$onStart$1(t tVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = tVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SourcePointLocationOnStartInteractor$onStart$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SourcePointLocationOnStartInteractor$onStart$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object failure;
        t tVar;
        Throwable a;
        t tVar2;
        Throwable th;
        mo21 mo21Var;
        t tVar3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            failure = new Result.Failure(e2);
        }
        if (i == 0) {
            kotlin.b.b(obj);
            po21 po21Var = this.this$0.g;
            this.label = 1;
            obj = ((ru.yandex.taxi.preorder.source.userposition.e) po21Var).f(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mo21Var = (mo21) this.L$2;
                    tVar3 = (t) this.L$1;
                    kotlin.b.b(obj);
                    tVar3.p.a(LocationRequestAnalytics$Source.START, mo21Var);
                    return zy11.a;
                }
                th = (Throwable) this.L$2;
                tVar2 = (t) this.L$1;
                failure = this.L$0;
                kotlin.b.b(obj);
                a = th;
                tVar = tVar2;
                tVar.p.b(LocationRequestAnalytics$Source.START, a);
                t tVar4 = this.this$0;
                if (!(failure instanceof Result.Failure)) {
                    mo21Var = (mo21) failure;
                    boolean z = tVar4.c.e() == null;
                    this.L$0 = failure;
                    this.L$1 = tVar4;
                    this.L$2 = mo21Var;
                    this.label = 3;
                    if (tVar4.g(mo21Var, this, z) != coroutineSingletons) {
                        tVar3 = tVar4;
                        tVar3.p.a(LocationRequestAnalytics$Source.START, mo21Var);
                    }
                    return coroutineSingletons;
                }
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        failure = (mo21) obj;
        tVar = this.this$0;
        a = Result.a(failure);
        if (a != null) {
            if (a instanceof LocationRequirementsException) {
                this.L$0 = failure;
                this.L$1 = tVar;
                this.L$2 = a;
                this.label = 2;
                if (t.e(tVar, (LocationRequirementsException) a, this) != coroutineSingletons) {
                    tVar2 = tVar;
                    th = a;
                    a = th;
                    tVar = tVar2;
                    tVar.p.b(LocationRequestAnalytics$Source.START, a);
                }
                return coroutineSingletons;
            }
            tVar.h.getClass();
            xby.l(jst.e, "LOCATION_ERROR_TOKEN:WTF:UnexpectedLocationErrorOnStart", null, a, "UnexpectedLocationErrorOnStart", 2);
            tVar.u = false;
            tVar.p.b(LocationRequestAnalytics$Source.START, a);
        }
        t tVar42 = this.this$0;
        if (!(failure instanceof Result.Failure)) {
        }
        return zy11.a;
    }
}
