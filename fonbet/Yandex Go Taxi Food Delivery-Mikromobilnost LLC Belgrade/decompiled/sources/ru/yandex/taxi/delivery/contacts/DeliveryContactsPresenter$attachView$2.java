package ru.yandex.taxi.delivery.contacts;

import defpackage.dms;
import defpackage.e1i;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vt90;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.logistics.payment_method_selector.requirement.state.ToggleSource;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "isPayOnDeliveryChosen", "hasMultipoints", "isEnabled", "Lvt90;", "prohibitedData", "Lzy11;", "<anonymous>", "(ZZZLvt90;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.delivery.contacts.DeliveryContactsPresenter$attachView$2", f = "DeliveryContactsPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DeliveryContactsPresenter$attachView$2 extends SuspendLambda implements dms {
    final /* synthetic */ e1i $mvpView;
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    /* synthetic */ boolean Z$1;
    /* synthetic */ boolean Z$2;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryContactsPresenter$attachView$2(e1i e1iVar, a aVar, Continuation continuation) {
        super(5, continuation);
        this.$mvpView = e1iVar;
        this.this$0 = aVar;
    }

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        boolean booleanValue3 = ((Boolean) obj3).booleanValue();
        DeliveryContactsPresenter$attachView$2 deliveryContactsPresenter$attachView$2 = new DeliveryContactsPresenter$attachView$2(this.$mvpView, this.this$0, (Continuation) obj5);
        deliveryContactsPresenter$attachView$2.Z$0 = booleanValue;
        deliveryContactsPresenter$attachView$2.Z$1 = booleanValue2;
        deliveryContactsPresenter$attachView$2.Z$2 = booleanValue3;
        deliveryContactsPresenter$attachView$2.L$0 = (vt90) obj4;
        zy11 zy11Var = zy11.a;
        deliveryContactsPresenter$attachView$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        boolean z2 = this.Z$1;
        boolean z3 = this.Z$2;
        vt90 vt90Var = (vt90) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        e1i e1iVar = this.$mvpView;
        if (z3) {
            e1iVar.x7(this.this$0.F.a(z, ToggleSource.CONTACTS, z2, vt90Var.a, vt90Var.b));
        } else {
            e1iVar.x7(null);
        }
        return zy11.a;
    }
}
