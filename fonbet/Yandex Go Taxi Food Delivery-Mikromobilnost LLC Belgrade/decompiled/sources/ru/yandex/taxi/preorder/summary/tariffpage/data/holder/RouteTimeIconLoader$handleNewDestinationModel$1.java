package ru.yandex.taxi.preorder.summary.tariffpage.data.holder;

import android.graphics.drawable.BitmapDrawable;
import defpackage.mct0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.summary.tariffpage.data.holder.RouteTimeIconLoader$handleNewDestinationModel$1", f = "RouteTimeIconLoader.kt", l = {52}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class RouteTimeIconLoader$handleNewDestinationModel$1 extends SuspendLambda implements wls {
    final /* synthetic */ ru.yandex.taxi.preorder.summary.tariffpage.data.sourcedestination.d $controlDelegate;
    final /* synthetic */ String $iconTag;
    final /* synthetic */ mct0 $model;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteTimeIconLoader$handleNewDestinationModel$1(d dVar, String str, ru.yandex.taxi.preorder.summary.tariffpage.data.sourcedestination.d dVar2, mct0 mct0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$iconTag = str;
        this.$controlDelegate = dVar2;
        this.$model = mct0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RouteTimeIconLoader$handleNewDestinationModel$1(this.this$0, this.$iconTag, this.$controlDelegate, this.$model, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RouteTimeIconLoader$handleNewDestinationModel$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            d dVar = this.this$0;
            String str = this.$iconTag;
            this.label = 1;
            obj = d.a(dVar, str, this);
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
        BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
        if (bitmapDrawable != null) {
            ru.yandex.taxi.preorder.summary.tariffpage.data.sourcedestination.d dVar2 = this.$controlDelegate;
            d dVar3 = this.this$0;
            mct0 mct0Var = this.$model;
            dVar3.getClass();
            dVar2.b(d.b(mct0Var, bitmapDrawable));
        }
        return zy11.a;
    }
}
