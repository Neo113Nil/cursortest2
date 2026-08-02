package ru.yandex.taxi.scooters.utils.timers;

import defpackage.g050;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.tse;
import defpackage.wls;
import defpackage.z5p0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.utils.timers.ScootersTimersRepository$clean$1", f = "ScootersTimersRepository.kt", l = {108}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersTimersRepository$clean$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $sessionId;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersTimersRepository$clean$1(h hVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = hVar;
        this.$sessionId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersTimersRepository$clean$1(this.this$0, this.$sessionId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersTimersRepository$clean$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        h hVar;
        g050 g050Var;
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            hVar = this.this$0;
            kotlinx.coroutines.sync.a aVar = hVar.b;
            String str2 = this.$sessionId;
            this.L$0 = aVar;
            this.L$1 = hVar;
            this.L$2 = str2;
            this.label = 1;
            if (aVar.a(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            g050Var = aVar;
            str = str2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = (String) this.L$2;
            hVar = (h) this.L$1;
            g050Var = (g050) this.L$0;
            kotlin.b.b(obj);
        }
        try {
            z5p0 z5p0Var = (z5p0) hVar.c.remove(str);
            if (z5p0Var != null) {
                pzt0 pzt0Var = z5p0Var.c;
                if (pzt0Var != null) {
                    pzt0Var.a(null);
                    z5p0Var.c = null;
                }
                z5p0Var.d = null;
                z5p0Var.e = Long.MIN_VALUE;
            }
            g050Var.d(null);
            return zy11.a;
        } catch (Throwable th) {
            g050Var.d(null);
            throw th;
        }
    }
}
