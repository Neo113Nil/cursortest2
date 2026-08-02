package ru.yandex.taxi.stories.data.repositories.images;

import com.yandex.go.image.domain.requests.g;
import defpackage.lmu0;
import defpackage.mmu0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "Lzy11;", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.stories.data.repositories.images.StoriesImagesRepositoryImpl$downloadRepository$1$1", f = "StoriesImagesRepositoryImpl.kt", l = {20}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class StoriesImagesRepositoryImpl$downloadRepository$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ lmu0 $download;
    int label;
    final /* synthetic */ mmu0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoriesImagesRepositoryImpl$downloadRepository$1$1(mmu0 mmu0Var, lmu0 lmu0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = mmu0Var;
        this.$download = lmu0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StoriesImagesRepositoryImpl$downloadRepository$1$1(this.this$0, this.$download, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((StoriesImagesRepositoryImpl$downloadRepository$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            g gVar = (g) this.this$0.a.e();
            gVar.c(this.$download.b);
            gVar.g = this.$download.c;
            this.label = 1;
            e = ru.yandex.taxi.utils.a.e(gVar, this);
            if (e == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            e = ((Result) obj).getValue();
        }
        return new Result(e);
    }
}
