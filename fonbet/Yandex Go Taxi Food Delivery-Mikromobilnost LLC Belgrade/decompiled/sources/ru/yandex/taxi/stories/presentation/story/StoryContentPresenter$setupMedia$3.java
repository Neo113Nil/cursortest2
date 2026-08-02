package ru.yandex.taxi.stories.presentation.story;

import defpackage.kou0;
import defpackage.lou0;
import defpackage.mvg;
import defpackage.nsz;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.xby;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.communications.api.dto.Story;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.stories.presentation.story.StoryContentPresenter$setupMedia$3", f = "StoryContentPresenter.kt", l = {110}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class StoryContentPresenter$setupMedia$3 extends SuspendLambda implements wls {
    final /* synthetic */ Story.c $media;
    Object L$0;
    int label;
    final /* synthetic */ lou0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryContentPresenter$setupMedia$3(lou0 lou0Var, Story.c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = lou0Var;
        this.$media = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StoryContentPresenter$setupMedia$3(this.this$0, this.$media, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((StoryContentPresenter$setupMedia$3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kou0 kou0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                lou0 lou0Var = this.this$0;
                Story.c cVar = this.$media;
                kou0 kou0Var2 = (kou0) lou0Var.a;
                ru.yandex.taxi.widget.d dVar = lou0Var.f;
                String str = cVar.b;
                this.L$0 = kou0Var2;
                this.label = 1;
                obj = dVar.a(str, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                kou0Var = kou0Var2;
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kou0Var = (kou0) this.L$0;
                kotlin.b.b(obj);
            }
            kou0Var.f((nsz) obj);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            xby.d.k(th, "Error loading animation");
        }
        return zy11.a;
    }
}
