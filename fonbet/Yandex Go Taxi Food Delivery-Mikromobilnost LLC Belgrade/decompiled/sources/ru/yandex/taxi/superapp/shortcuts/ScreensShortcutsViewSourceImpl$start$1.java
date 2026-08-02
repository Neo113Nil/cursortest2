package ru.yandex.taxi.superapp.shortcuts;

import defpackage.faf0;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.waf0;
import defpackage.wls;
import defpackage.yaf0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.superapp.shortcuts.ScreensShortcutsViewSourceImpl$start$1", f = "ScreensShortcutsViewSourceImpl.kt", l = {52}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScreensShortcutsViewSourceImpl$start$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $force;
    final /* synthetic */ yaf0 $screenType;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreensShortcutsViewSourceImpl$start$1(a aVar, yaf0 yaf0Var, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$screenType = yaf0Var;
        this.$force = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScreensShortcutsViewSourceImpl$start$1 screensShortcutsViewSourceImpl$start$1 = new ScreensShortcutsViewSourceImpl$start$1(this.this$0, this.$screenType, this.$force, continuation);
        screensShortcutsViewSourceImpl$start$1.L$0 = obj;
        return screensShortcutsViewSourceImpl$start$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScreensShortcutsViewSourceImpl$start$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                a aVar = this.this$0;
                yaf0 yaf0Var = this.$screenType;
                boolean z = this.$force;
                faf0 faf0Var = aVar.e;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                if (aVar.b.a((waf0) yaf0Var, faf0Var, z, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            failure = zy11Var;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            jst.e.k(a, "Failed fetch screen products");
        }
        return zy11Var;
    }
}
