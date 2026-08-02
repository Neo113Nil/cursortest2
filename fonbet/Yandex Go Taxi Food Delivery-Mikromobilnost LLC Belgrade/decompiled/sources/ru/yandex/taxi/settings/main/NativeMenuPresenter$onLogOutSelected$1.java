package ru.yandex.taxi.settings.main;

import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.xby;
import defpackage.z500;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.am.b0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.settings.main.NativeMenuPresenter$onLogOutSelected$1", f = "NativeMenuPresenter.kt", l = {289}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class NativeMenuPresenter$onLogOutSelected$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeMenuPresenter$onLogOutSelected$1(f fVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NativeMenuPresenter$onLogOutSelected$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((NativeMenuPresenter$onLogOutSelected$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [zc5] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        f fVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r1 = this.label;
        try {
            if (r1 == 0) {
                kotlin.b.b(obj);
                f fVar2 = this.this$0;
                b0 b0Var = fVar2.z;
                this.L$0 = fVar2;
                this.L$1 = fVar2;
                this.label = 1;
                if (b0Var.c(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                fVar = fVar2;
                r1 = fVar2;
            } else {
                if (r1 != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                f fVar3 = (f) this.L$1;
                fVar = (f) this.L$0;
                kotlin.b.b(obj);
                r1 = fVar3;
            }
            ((z500) fVar.Dg()).C9();
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            ((z500) r1.Dg()).C9();
            xby.l(jst.e, "MAIN_MENU:LOGOUT_EXCEPTION", null, th, "Failed to logout from account", 2);
        }
        return zy11.a;
    }
}
