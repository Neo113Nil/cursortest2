package ru.yandex.taxi.map.overlay.pickup.intersections;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.ro00;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.map.overlay.pickup.intersections.LayersIntersectionsResolver$resolveBubbleIntersections$1", f = "LayersIntersectionsResolver.kt", l = {130}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class LayersIntersectionsResolver$resolveBubbleIntersections$1 extends SuspendLambda implements wls {
    final /* synthetic */ Set<String> $availableBubblesSet;
    final /* synthetic */ Set<ro00> $bubbleIntersectsWith;
    final /* synthetic */ String $pickupPointId;
    final /* synthetic */ ru.yandex.taxi.map.overlay.pickup.a $pointMapObject;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayersIntersectionsResolver$resolveBubbleIntersections$1(b bVar, Set set, Set set2, String str, ru.yandex.taxi.map.overlay.pickup.a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$availableBubblesSet = set;
        this.$bubbleIntersectsWith = set2;
        this.$pickupPointId = str;
        this.$pointMapObject = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LayersIntersectionsResolver$resolveBubbleIntersections$1(this.this$0, this.$availableBubblesSet, this.$bubbleIntersectsWith, this.$pickupPointId, this.$pointMapObject, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LayersIntersectionsResolver$resolveBubbleIntersections$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0;
            Set<String> set = this.$availableBubblesSet;
            Set<ro00> set2 = this.$bubbleIntersectsWith;
            this.label = 1;
            obj = b.a(bVar, set, set2, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            this.$availableBubblesSet.remove(this.$pickupPointId);
            r0 r0Var = this.$pointMapObject.h.p;
            Boolean bool = Boolean.TRUE;
            r0Var.getClass();
            r0Var.m(null, bool);
        } else {
            r0 r0Var2 = this.$pointMapObject.h.p;
            Boolean bool2 = Boolean.FALSE;
            r0Var2.getClass();
            r0Var2.m(null, bool2);
        }
        return zy11.a;
    }
}
