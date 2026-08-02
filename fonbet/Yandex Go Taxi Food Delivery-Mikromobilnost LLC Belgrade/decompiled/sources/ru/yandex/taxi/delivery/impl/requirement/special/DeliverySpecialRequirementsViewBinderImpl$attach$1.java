package ru.yandex.taxi.delivery.impl.requirement.special;

import android.view.View;
import android.view.ViewGroup;
import defpackage.g8e;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "isRentAvailable", "isD2dAvailable", "Lzy11;", "<anonymous>", "(ZZ)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.delivery.impl.requirement.special.DeliverySpecialRequirementsViewBinderImpl$attach$1", f = "DeliverySpecialRequirementsViewBinderImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DeliverySpecialRequirementsViewBinderImpl$attach$1 extends SuspendLambda implements zls {
    final /* synthetic */ ViewGroup $container;
    /* synthetic */ boolean Z$0;
    /* synthetic */ boolean Z$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliverySpecialRequirementsViewBinderImpl$attach$1(a aVar, ViewGroup viewGroup, Continuation continuation) {
        super(3, continuation);
        this.this$0 = aVar;
        this.$container = viewGroup;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        DeliverySpecialRequirementsViewBinderImpl$attach$1 deliverySpecialRequirementsViewBinderImpl$attach$1 = new DeliverySpecialRequirementsViewBinderImpl$attach$1(this.this$0, this.$container, (Continuation) obj3);
        deliverySpecialRequirementsViewBinderImpl$attach$1.Z$0 = booleanValue;
        deliverySpecialRequirementsViewBinderImpl$attach$1.Z$1 = booleanValue2;
        zy11 zy11Var = zy11.a;
        deliverySpecialRequirementsViewBinderImpl$attach$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        boolean z2 = this.Z$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ArrayList t = g8e.t(obj);
        if (z) {
            t.add(this.this$0.b.get());
        }
        if (z2) {
            t.add(this.this$0.d.get());
        }
        a aVar = this.this$0;
        ViewGroup viewGroup = this.$container;
        aVar.getClass();
        viewGroup.removeAllViews();
        Iterator it = t.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            if (viewGroup.indexOfChild(view) == -1) {
                viewGroup.addView(view);
            }
        }
        return zy11.a;
    }
}
