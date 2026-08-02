package ru.yandex.taxi.am;

import defpackage.gtq0;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.t1b0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.am.ForcedPassportProcessStartInteractor$tryStartPassportProcess$1", f = "ForcedPassportProcessStartInteractor.kt", l = {39, 45}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class ForcedPassportProcessStartInteractor$tryStartPassportProcess$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ x this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForcedPassportProcessStartInteractor$tryStartPassportProcess$1(x xVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = xVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ForcedPassportProcessStartInteractor$tryStartPassportProcess$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ForcedPassportProcessStartInteractor$tryStartPassportProcess$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
    
        if (r5 == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0061, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0033, code lost:
    
        if (r6 == r0) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            gtq0.F("Error occurred while trying get oauth token to passport process start", null, th);
        }
        if (i == 0) {
            kotlin.b.b(obj);
            t1b0 t1b0Var = this.this$0.e;
            this.label = 1;
            obj = t1b0Var.b(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                ((Result) obj).getClass();
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        if (((Boolean) obj).booleanValue() && this.this$0.d.x.a().a()) {
            x xVar = this.this$0;
            jst.e.getClass();
            ru.yandex.taxi.am.token.a aVar = xVar.c;
            this.L$0 = null;
            this.label = 2;
            d = aVar.d(false, this);
        }
        return zy11.a;
    }
}
