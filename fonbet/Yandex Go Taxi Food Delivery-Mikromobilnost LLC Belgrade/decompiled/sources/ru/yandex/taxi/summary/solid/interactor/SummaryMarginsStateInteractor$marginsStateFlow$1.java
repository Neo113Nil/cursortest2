package ru.yandex.taxi.summary.solid.interactor;

import android.graphics.Rect;
import defpackage.dms;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vhv0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "routeVisible", "Landroid/graphics/Rect;", "addToFavoritesRect", "", "plusOffset", "surgeOffset", "Lvhv0;", "<anonymous>", "(ZLandroid/graphics/Rect;II)Lvhv0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.solid.interactor.SummaryMarginsStateInteractor$marginsStateFlow$1", f = "SummaryMarginsStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SummaryMarginsStateInteractor$marginsStateFlow$1 extends SuspendLambda implements dms {
    /* synthetic */ int I$0;
    /* synthetic */ int I$1;
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int intValue = ((Number) obj3).intValue();
        int intValue2 = ((Number) obj4).intValue();
        SummaryMarginsStateInteractor$marginsStateFlow$1 summaryMarginsStateInteractor$marginsStateFlow$1 = new SummaryMarginsStateInteractor$marginsStateFlow$1(5, (Continuation) obj5);
        summaryMarginsStateInteractor$marginsStateFlow$1.Z$0 = booleanValue;
        summaryMarginsStateInteractor$marginsStateFlow$1.L$0 = (Rect) obj2;
        summaryMarginsStateInteractor$marginsStateFlow$1.I$0 = intValue;
        summaryMarginsStateInteractor$marginsStateFlow$1.I$1 = intValue2;
        return summaryMarginsStateInteractor$marginsStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        Rect rect = (Rect) this.L$0;
        int i = this.I$0;
        int i2 = this.I$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new vhv0(z, rect, i, i2);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
