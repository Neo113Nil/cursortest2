package ru.yandex.yandexmaps.multiplatform.pin.war.internal.collider;

import defpackage.ezb0;
import defpackage.jvb0;
import defpackage.kvb0;
import defpackage.lvb0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qzb0;
import defpackage.rvb0;
import defpackage.tcc;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.yandexmaps.multiplatform.pin.war.PinState;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Ltse;", "Llvb0;", "<anonymous>", "(Ltse;)Llvb0;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "ru.yandex.yandexmaps.multiplatform.pin.war.internal.collider.PinColliderKt$buildOutput$2", f = "PinCollider.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes7.dex */
final class PinColliderKt$buildOutput$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<jvb0> $labels;
    final /* synthetic */ List<ezb0> $notLabels;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinColliderKt$buildOutput$2(List list, List list2, Continuation continuation) {
        super(2, continuation);
        this.$labels = list;
        this.$notLabels = list2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PinColliderKt$buildOutput$2(this.$labels, this.$notLabels, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PinColliderKt$buildOutput$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PinState pinState;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        List<jvb0> list = this.$labels;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (jvb0 jvb0Var : list) {
            qzb0 qzb0Var = jvb0Var.a;
            int i = rvb0.a[jvb0Var.f.ordinal()];
            if (i == 1) {
                pinState = PinState.ICON;
            } else if (i == 2) {
                pinState = PinState.ICON_LABEL_S;
            } else {
                if (i != 3) {
                    w511.b();
                    return null;
                }
                pinState = PinState.ICON_LABEL_M;
            }
            arrayList.add(new kvb0(qzb0Var, pinState, jvb0Var.g));
        }
        List<ezb0> list2 = this.$notLabels;
        ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
        for (ezb0 ezb0Var : list2) {
            arrayList2.add(new kvb0(ezb0Var.a, ezb0Var.b, null));
        }
        return new lvb0(kotlin.collections.a.m0(arrayList2, arrayList));
    }
}
