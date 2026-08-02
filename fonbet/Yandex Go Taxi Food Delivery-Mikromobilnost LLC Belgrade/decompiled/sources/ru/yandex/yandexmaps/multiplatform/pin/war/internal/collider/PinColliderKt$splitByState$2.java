package ru.yandex.yandexmaps.multiplatform.pin.war.internal.collider;

import defpackage.ezb0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.yandexmaps.multiplatform.pin.war.PinState;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a&\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00030\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ltse;", "Lkotlin/Pair;", "", "Lezb0;", "<anonymous>", "(Ltse;)Lkotlin/Pair;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "ru.yandex.yandexmaps.multiplatform.pin.war.internal.collider.PinColliderKt$splitByState$2", f = "PinCollider.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes7.dex */
final class PinColliderKt$splitByState$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<ezb0> $seedStates;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinColliderKt$splitByState$2(List list, Continuation continuation) {
        super(2, continuation);
        this.$seedStates = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PinColliderKt$splitByState$2(this.$seedStates, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PinColliderKt$splitByState$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        List<ezb0> list = this.$seedStates;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((ezb0) obj2).b.compareTo(PinState.ICON_LABEL_S) >= 0) {
                arrayList.add(obj2);
            }
        }
        List<ezb0> list2 = this.$seedStates;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : list2) {
            if (((ezb0) obj3).b.compareTo(PinState.ICON_LABEL_S) < 0) {
                arrayList2.add(obj3);
            }
        }
        return new Pair(arrayList, arrayList2);
    }
}
