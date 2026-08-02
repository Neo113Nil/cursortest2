package ru.yandex.taxi.logistics.sdk.deliverydashboard.ui.widget;

import defpackage.ky;
import defpackage.lhg;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.deliverydashboard.ui.widget.AddressButtonKt$AddressButton$2$1", f = "AddressButton.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class AddressButtonKt$AddressButton$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ lhg $analyticsEventListener;
    final /* synthetic */ ky $trailAction;
    final /* synthetic */ Object $trailMeta;
    final /* synthetic */ String $trailMetricaLabel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressButtonKt$AddressButton$2$1(ky kyVar, lhg lhgVar, String str, Object obj, Continuation continuation) {
        super(2, continuation);
        this.$trailAction = kyVar;
        this.$analyticsEventListener = lhgVar;
        this.$trailMetricaLabel = str;
        this.$trailMeta = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddressButtonKt$AddressButton$2$1(this.$trailAction, this.$analyticsEventListener, this.$trailMetricaLabel, this.$trailMeta, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        AddressButtonKt$AddressButton$2$1 addressButtonKt$AddressButton$2$1 = (AddressButtonKt$AddressButton$2$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        addressButtonKt$AddressButton$2$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (this.$trailAction != null) {
            lhg.a(this.$analyticsEventListener, this.$trailMetricaLabel, this.$trailMeta);
        }
        return zy11.a;
    }
}
