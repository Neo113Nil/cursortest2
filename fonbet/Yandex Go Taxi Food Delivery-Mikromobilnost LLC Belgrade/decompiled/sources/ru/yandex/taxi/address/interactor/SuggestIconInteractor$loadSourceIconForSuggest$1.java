package ru.yandex.taxi.address.interactor;

import android.graphics.drawable.BitmapDrawable;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.widget.utils.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.address.interactor.SuggestIconInteractor$loadSourceIconForSuggest$1", f = "SuggestIconInteractor.kt", l = {30}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class SuggestIconInteractor$loadSourceIconForSuggest$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $imageTag;
    final /* synthetic */ Runnable $updateIcon;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuggestIconInteractor$loadSourceIconForSuggest$1(b bVar, String str, Runnable runnable, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$imageTag = str;
        this.$updateIcon = runnable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuggestIconInteractor$loadSourceIconForSuggest$1(this.this$0, this.$imageTag, this.$updateIcon, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuggestIconInteractor$loadSourceIconForSuggest$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        zy11 zy11Var = zy11.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            e eVar = this.this$0.a;
            String str = this.$imageTag;
            this.label = 1;
            obj = e.f(eVar, str, null, this, 6);
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
        if (bitmapDrawable == null) {
            return zy11Var;
        }
        this.this$0.b.e = bitmapDrawable;
        this.$updateIcon.run();
        return zy11Var;
    }
}
