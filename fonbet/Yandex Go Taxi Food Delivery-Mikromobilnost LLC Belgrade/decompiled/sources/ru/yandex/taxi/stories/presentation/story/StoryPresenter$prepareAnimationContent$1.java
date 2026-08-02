package ru.yandex.taxi.stories.presentation.story;

import defpackage.gpu0;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.stories.presentation.story.StoryPresenter$prepareAnimationContent$1", f = "StoryPresenter.kt", l = {311}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class StoryPresenter$prepareAnimationContent$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $animationUrl;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryPresenter$prepareAnimationContent$1(g gVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$animationUrl = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StoryPresenter$prepareAnimationContent$1(this.this$0, this.$animationUrl, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((StoryPresenter$prepareAnimationContent$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        g gVar;
        gpu0 gpu0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                g gVar2 = this.this$0;
                String str = this.$animationUrl;
                try {
                    gpu0 gpu0Var2 = (gpu0) gVar2.a;
                    ru.yandex.taxi.widget.d dVar = gVar2.l;
                    this.L$0 = gVar2;
                    this.L$1 = gpu0Var2;
                    this.label = 1;
                    Object a = dVar.a(str, this);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = a;
                    gVar = gVar2;
                    gpu0Var = gpu0Var2;
                } catch (Throwable th2) {
                    th = th2;
                    gVar = gVar2;
                    xby.d.k(th, "Error loading animation");
                    ((gpu0) gVar.a).onPlaybackError();
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                gpu0Var = (gpu0) this.L$1;
                gVar = (g) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable th3) {
                    th = th3;
                    xby.d.k(th, "Error loading animation");
                    ((gpu0) gVar.a).onPlaybackError();
                    return zy11.a;
                }
            }
            gpu0Var.setLottieComposition((nsz) obj);
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
