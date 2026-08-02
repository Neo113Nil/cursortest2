package ru.yandex.taxi.stories.presentation.story;

import defpackage.kou0;
import defpackage.lou0;
import defpackage.mvg;
import defpackage.noh;
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
@mvg(c = "ru.yandex.taxi.stories.presentation.story.StoryContentPresenter$setupTitle$1", f = "StoryContentPresenter.kt", l = {47}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class StoryContentPresenter$setupTitle$1 extends SuspendLambda implements wls {
    final /* synthetic */ noh $formattedText;
    final /* synthetic */ boolean $isNewYearLayout;
    final /* synthetic */ boolean $isSubtitleEmpty;
    Object L$0;
    boolean Z$0;
    boolean Z$1;
    int label;
    final /* synthetic */ lou0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryContentPresenter$setupTitle$1(lou0 lou0Var, noh nohVar, boolean z, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = lou0Var;
        this.$formattedText = nohVar;
        this.$isSubtitleEmpty = z;
        this.$isNewYearLayout = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StoryContentPresenter$setupTitle$1(this.this$0, this.$formattedText, this.$isSubtitleEmpty, this.$isNewYearLayout, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((StoryContentPresenter$setupTitle$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kou0 kou0Var;
        boolean z;
        boolean z2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                lou0 lou0Var = this.this$0;
                noh nohVar = this.$formattedText;
                boolean z3 = this.$isSubtitleEmpty;
                boolean z4 = this.$isNewYearLayout;
                kou0 kou0Var2 = (kou0) lou0Var.a;
                this.L$0 = kou0Var2;
                this.Z$0 = z3;
                this.Z$1 = z4;
                this.label = 1;
                Object k = nohVar.k(this);
                if (k == coroutineSingletons) {
                    return coroutineSingletons;
                }
                obj = k;
                kou0Var = kou0Var2;
                z = z3;
                z2 = z4;
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z2 = this.Z$1;
                z = this.Z$0;
                kou0Var = (kou0) this.L$0;
                kotlin.b.b(obj);
            }
            kou0Var.b((CharSequence) obj, z, z2);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            xby.d.k(th, "Unable to load formatted title for story");
        }
        return zy11.a;
    }
}
