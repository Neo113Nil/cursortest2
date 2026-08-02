package ru.yandex.yandexmaps.multiplatform.pin.war.internal.collider;

import defpackage.jvb0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tse;
import defpackage.ul91;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.yandexmaps.multiplatform.pin.war.internal.util.PlacemarkType;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a&\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00030\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ltse;", "Lkotlin/Pair;", "", "Ljvb0;", "<anonymous>", "(Ltse;)Lkotlin/Pair;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "ru.yandex.yandexmaps.multiplatform.pin.war.internal.collider.PinColliderKt$clash$2", f = "PinCollider.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes7.dex */
final class PinColliderKt$clash$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<jvb0> $labelsImmutable;
    final /* synthetic */ List<jvb0> $selectedImmutable;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinColliderKt$clash$2(List list, List list2, Continuation continuation) {
        super(2, continuation);
        this.$labelsImmutable = list;
        this.$selectedImmutable = list2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PinColliderKt$clash$2(this.$labelsImmutable, this.$selectedImmutable, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PinColliderKt$clash$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        ArrayList e = ul91.e(this.$labelsImmutable);
        ArrayList e2 = ul91.e(this.$selectedImmutable);
        ArrayList arrayList = new ArrayList(tcc.n(e2, 10));
        Iterator it = e2.iterator();
        while (it.hasNext()) {
            arrayList.add(((jvb0) it.next()).a.a);
        }
        Iterator it2 = e.iterator();
        while (it2.hasNext()) {
            jvb0 jvb0Var = (jvb0) it2.next();
            if (!arrayList.contains(jvb0Var.a.a)) {
                PlacemarkType l = ul91.l(jvb0Var.f);
                if (l != null && !e2.isEmpty()) {
                    Iterator it3 = e2.iterator();
                    while (it3.hasNext()) {
                        if (ul91.h(jvb0Var, l, jvb0Var.g, (jvb0) it3.next(), PlacemarkType.SELECTED, null, 0)) {
                        }
                    }
                }
            }
            jvb0Var.f = PinCollider$PlacedLabel.NONE;
        }
        return new Pair(e, e2);
    }
}
