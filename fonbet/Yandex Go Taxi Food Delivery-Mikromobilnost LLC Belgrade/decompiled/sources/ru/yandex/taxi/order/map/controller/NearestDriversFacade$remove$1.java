package ru.yandex.taxi.order.map.controller;

import defpackage.dk50;
import defpackage.flc;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.ylc;
import defpackage.zy11;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.order.map.controller.internal.Command$CommandType;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.order.map.controller.NearestDriversFacade$remove$1", f = "NearestDriversFacade.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class NearestDriversFacade$remove$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $driverId;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NearestDriversFacade$remove$1(a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$driverId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NearestDriversFacade$remove$1(this.this$0, this.$driverId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        NearestDriversFacade$remove$1 nearestDriversFacade$remove$1 = (NearestDriversFacade$remove$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        nearestDriversFacade$remove$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean remove;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        dk50 dk50Var = this.this$0.b;
        String str = this.$driverId;
        synchronized (dk50Var.c) {
            remove = dk50Var.c.remove(str);
        }
        if (remove) {
            dk50Var.b.g(new ylc(Collections.singletonList(new flc(str, Command$CommandType.Remove, null))));
        }
        return zy11.a;
    }
}
