package ru.yandex.taxi.altpins.source.modal;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "<unused var>", "Lru/yandex/taxi/theme/ThemeType;", "isLoading"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.altpins.source.modal.AlternativeSourceModalViewPresenter$attachView$1", f = "AlternativeSourceModalViewPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class AlternativeSourceModalViewPresenter$attachView$1 extends SuspendLambda implements zls {
    /* synthetic */ boolean Z$0;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        AlternativeSourceModalViewPresenter$attachView$1 alternativeSourceModalViewPresenter$attachView$1 = new AlternativeSourceModalViewPresenter$attachView$1(3, (Continuation) obj3);
        alternativeSourceModalViewPresenter$attachView$1.Z$0 = booleanValue;
        return alternativeSourceModalViewPresenter$attachView$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return Boolean.valueOf(z);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
