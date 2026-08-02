package ru.yandex.taxi.requirements.glued.ui.image;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Landroid/graphics/Bitmap;", "<anonymous>", "(Ltse;)Landroid/graphics/Bitmap;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.requirements.glued.ui.image.DefaultCarImageBinder$mapOptionsForRender$2$optionImages$1$1", f = "DefaultCarImageBinder.kt", l = {184}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class DefaultCarImageBinder$mapOptionsForRender$2$optionImages$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ Pair<String, String> $option;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultCarImageBinder$mapOptionsForRender$2$optionImages$1$1(i iVar, Pair pair, Continuation continuation) {
        super(2, continuation);
        this.this$0 = iVar;
        this.$option = pair;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DefaultCarImageBinder$mapOptionsForRender$2$optionImages$1$1(this.this$0, this.$option, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DefaultCarImageBinder$mapOptionsForRender$2$optionImages$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        i iVar = this.this$0;
        String str = (String) this.$option.f();
        this.label = 1;
        Object b = ru.yandex.taxi.utils.a.b(iVar.a.b().b(str), this);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
