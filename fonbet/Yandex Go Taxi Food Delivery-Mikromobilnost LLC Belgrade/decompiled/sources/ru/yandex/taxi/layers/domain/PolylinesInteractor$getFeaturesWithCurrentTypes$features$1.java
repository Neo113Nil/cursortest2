package ru.yandex.taxi.layers.domain;

import com.yandex.go.dto.response.Action$Payload;
import defpackage.j4e0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o5e0;
import defpackage.p4e0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Lj4e0;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.domain.PolylinesInteractor$getFeaturesWithCurrentTypes$features$1", f = "PolylinesInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class PolylinesInteractor$getFeaturesWithCurrentTypes$features$1 extends SuspendLambda implements wls {
    final /* synthetic */ o5e0 $response;
    final /* synthetic */ List<Action$Payload.ObjectType> $types;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PolylinesInteractor$getFeaturesWithCurrentTypes$features$1(o5e0 o5e0Var, List list, Continuation continuation) {
        super(2, continuation);
        this.$response = o5e0Var;
        this.$types = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PolylinesInteractor$getFeaturesWithCurrentTypes$features$1(this.$response, this.$types, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PolylinesInteractor$getFeaturesWithCurrentTypes$features$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        List list = this.$response.f;
        if (list == null) {
            return EmptyList.a;
        }
        List<Action$Payload.ObjectType> list2 = this.$types;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            j4e0 j4e0Var = (j4e0) obj2;
            if (list2 != null) {
                List<Action$Payload.ObjectType> list3 = list2;
                p4e0 p4e0Var = j4e0Var.c;
                if (kotlin.collections.a.G(list3, p4e0Var != null ? p4e0Var.b : null)) {
                    arrayList.add(obj2);
                }
            }
        }
        return arrayList;
    }
}
