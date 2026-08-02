package ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.domain;

import defpackage.d6z;
import defpackage.f9n0;
import defpackage.i9n0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/yandex/taxi/theme/ThemeType;", "<unused var>", "Li9n0;", "completionPhotoExperiment", "Lf9n0;", "<anonymous>", "(Lru/yandex/taxi/theme/ThemeType;Li9n0;)Lf9n0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.domain.ScootersCompletionPhotoConfigInteractor$photoConfigFlow$1", f = "ScootersCompletionPhotoConfigInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersCompletionPhotoConfigInteractor$photoConfigFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersCompletionPhotoConfigInteractor$photoConfigFlow$1(a aVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = aVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ScootersCompletionPhotoConfigInteractor$photoConfigFlow$1 scootersCompletionPhotoConfigInteractor$photoConfigFlow$1 = new ScootersCompletionPhotoConfigInteractor$photoConfigFlow$1(this.this$0, (Continuation) obj3);
        scootersCompletionPhotoConfigInteractor$photoConfigFlow$1.L$0 = (i9n0) obj2;
        return scootersCompletionPhotoConfigInteractor$photoConfigFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        i9n0 i9n0Var = (i9n0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        a aVar = this.this$0;
        int i = a.c;
        aVar.getClass();
        if (!i9n0Var.b) {
            return f9n0.d;
        }
        boolean z = i9n0Var.d;
        String str = i9n0Var.f;
        if (str != null) {
            d6z.Y(i9n0Var, str);
        }
        Integer num = i9n0Var.e;
        String str2 = i9n0Var.g;
        return new f9n0(num, str2 != null ? d6z.Y(i9n0Var, str2) : null, z);
    }
}
