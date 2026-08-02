package ru.yandex.taxi.layers.source.factory.componentfactory;

import android.content.Context;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rl6;
import defpackage.sxx;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Landroid/view/View;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.source.factory.componentfactory.AdvertOverlapBubbleComponentFactory$createBubbleConfig$1$1$1$content$1", f = "AdvertOverlapBubbleComponentFactory.kt", l = {HProv.PP_DELETE_KEYSET}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class AdvertOverlapBubbleComponentFactory$createBubbleConfig$1$1$1$content$1 extends SuspendLambda implements wls {
    final /* synthetic */ rl6 $bubble;
    int label;
    final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvertOverlapBubbleComponentFactory$createBubbleConfig$1$1$1$content$1(rl6 rl6Var, l lVar, Continuation continuation) {
        super(2, continuation);
        this.$bubble = rl6Var;
        this.this$0 = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AdvertOverlapBubbleComponentFactory$createBubbleConfig$1$1$1$content$1(this.$bubble, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AdvertOverlapBubbleComponentFactory$createBubbleConfig$1$1$1$content$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        rl6 rl6Var = this.$bubble;
        l lVar = this.this$0;
        Context context = lVar.a;
        ru.yandex.taxi.widget.c cVar = lVar.c;
        sxx sxxVar = lVar.d;
        Float f = new Float(11.0f);
        this.label = 1;
        Object a = ru.yandex.taxi.layers.source.factory.a.a(rl6Var, context, cVar, sxxVar, false, f, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
