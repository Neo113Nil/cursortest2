package ru.yandex.taxi.preorder.source;

import android.os.SystemClock;
import defpackage.ar3;
import defpackage.axt;
import defpackage.br3;
import defpackage.cjt0;
import defpackage.dr3;
import defpackage.mo21;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmo21;", "location", "Lzy11;", "<anonymous>", "(Lmo21;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.source.SourcePointUserLocationInteractor$CurrentLocationChangeTwoStepResumeDecoratorDelegate$onResume$1", f = "SourcePointUserLocationInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SourcePointUserLocationInteractor$CurrentLocationChangeTwoStepResumeDecoratorDelegate$onResume$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ cjt0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SourcePointUserLocationInteractor$CurrentLocationChangeTwoStepResumeDecoratorDelegate$onResume$1(cjt0 cjt0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cjt0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SourcePointUserLocationInteractor$CurrentLocationChangeTwoStepResumeDecoratorDelegate$onResume$1 sourcePointUserLocationInteractor$CurrentLocationChangeTwoStepResumeDecoratorDelegate$onResume$1 = new SourcePointUserLocationInteractor$CurrentLocationChangeTwoStepResumeDecoratorDelegate$onResume$1(this.this$0, continuation);
        sourcePointUserLocationInteractor$CurrentLocationChangeTwoStepResumeDecoratorDelegate$onResume$1.L$0 = obj;
        return sourcePointUserLocationInteractor$CurrentLocationChangeTwoStepResumeDecoratorDelegate$onResume$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        SourcePointUserLocationInteractor$CurrentLocationChangeTwoStepResumeDecoratorDelegate$onResume$1 sourcePointUserLocationInteractor$CurrentLocationChangeTwoStepResumeDecoratorDelegate$onResume$1 = (SourcePointUserLocationInteractor$CurrentLocationChangeTwoStepResumeDecoratorDelegate$onResume$1) create((mo21) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        sourcePointUserLocationInteractor$CurrentLocationChangeTwoStepResumeDecoratorDelegate$onResume$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        mo21 mo21Var = (mo21) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        axt axtVar = this.this$0.d;
        synchronized (axtVar) {
            try {
                if (((dr3) axtVar.a.a).a()) {
                    br3 br3Var = (br3) ((dr3) axtVar.a.a).a.a.getValue();
                    if (br3Var == null) {
                        br3Var = br3.d;
                    }
                    ar3 ar3Var = br3Var.c;
                    if (ar3Var != null) {
                        if (!axtVar.b.a) {
                            zzs a = mo21Var.a();
                            zzs zzsVar = axtVar.f;
                            axtVar.f = a;
                            if (zzsVar != null) {
                                long elapsedRealtime = SystemClock.elapsedRealtime();
                                if (ru.yandex.taxi.map.utils.a.j(zzsVar, a) >= ar3Var.a) {
                                    axtVar.e.addLast(Long.valueOf(elapsedRealtime));
                                }
                                long j = elapsedRealtime - ar3Var.c;
                                while (!axtVar.e.isEmpty() && ((Number) axtVar.e.first()).longValue() < j) {
                                    axtVar.e.removeFirst();
                                }
                                if (axtVar.e.size() >= ar3Var.b) {
                                    axtVar.e.clear();
                                    axtVar.c.g(zy11.a);
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zy11.a;
    }
}
