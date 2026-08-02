package ru.yandex.taxi.layers.domain;

import defpackage.a001;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.domain.AdvertObjectsInteractor$trackDirectPixelShowUrls$1", f = "AdvertObjectsInteractor.kt", l = {39}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class AdvertObjectsInteractor$trackDirectPixelShowUrls$1 extends SuspendLambda implements wls {
    final /* synthetic */ List<String> $directPixelShowUrls;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvertObjectsInteractor$trackDirectPixelShowUrls$1(List list, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$directPixelShowUrls = list;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AdvertObjectsInteractor$trackDirectPixelShowUrls$1(this.$directPixelShowUrls, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AdvertObjectsInteractor$trackDirectPixelShowUrls$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a aVar;
        Iterator it;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            List<String> list = this.$directPixelShowUrls;
            aVar = this.this$0;
            it = list.iterator();
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = (Iterator) this.L$2;
            aVar = (a) this.L$1;
            kotlin.b.b(obj);
        }
        while (it.hasNext()) {
            String str = (String) it.next();
            ru.yandex.taxi.layers.domain.links.a aVar2 = aVar.a;
            this.L$0 = null;
            this.L$1 = aVar;
            this.L$2 = it;
            this.L$3 = null;
            this.L$4 = null;
            this.label = 1;
            if (aVar2.c.emit(new a001(str), this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return zy11.a;
    }
}
