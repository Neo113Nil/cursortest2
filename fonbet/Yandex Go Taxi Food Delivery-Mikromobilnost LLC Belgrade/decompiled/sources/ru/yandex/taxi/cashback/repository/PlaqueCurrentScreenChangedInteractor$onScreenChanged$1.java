package ru.yandex.taxi.cashback.repository;

import defpackage.alc0;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.cashback.repository.PlaqueCurrentScreenChangedInteractor$onScreenChanged$1", f = "PlaqueCurrentScreenChangedInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class PlaqueCurrentScreenChangedInteractor$onScreenChanged$1 extends SuspendLambda implements wls {
    final /* synthetic */ Collection<String> $screenStack;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaqueCurrentScreenChangedInteractor$onScreenChanged$1(a aVar, Collection collection, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$screenStack = collection;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlaqueCurrentScreenChangedInteractor$onScreenChanged$1(this.this$0, this.$screenStack, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        PlaqueCurrentScreenChangedInteractor$onScreenChanged$1 plaqueCurrentScreenChangedInteractor$onScreenChanged$1 = (PlaqueCurrentScreenChangedInteractor$onScreenChanged$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        plaqueCurrentScreenChangedInteractor$onScreenChanged$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        alc0 alc0Var = this.this$0.a;
        Iterator<String> it = this.$screenStack.iterator();
        while (true) {
            if (!it.hasNext()) {
                str = "unknown_screen";
                break;
            }
            str = it.next();
            if (a.f.contains(str)) {
                str = null;
            } else if (jl40.l(str, "pickup_location")) {
                str = "main";
            } else if (jl40.l(str, "order_summary")) {
                str = "summary";
            } else if (a.e.contains(str)) {
                str = "ride";
            } else if (a.d.contains(str)) {
                str = "complete";
            }
            if (str != null) {
                break;
            }
        }
        r0 r0Var = alc0Var.a;
        r0Var.getClass();
        r0Var.m(null, str);
        return zy11.a;
    }
}
