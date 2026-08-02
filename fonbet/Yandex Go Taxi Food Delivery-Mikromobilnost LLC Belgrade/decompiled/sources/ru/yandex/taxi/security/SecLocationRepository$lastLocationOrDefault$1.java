package ru.yandex.taxi.security;

import defpackage.mo21;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.po21;
import defpackage.tse;
import defpackage.wls;
import defpackage.wxp0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.preorder.source.userposition.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Landroid/location/Location;", "<anonymous>", "(Ltse;)Landroid/location/Location;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.security.SecLocationRepository$lastLocationOrDefault$1", f = "SecLocationRepository.kt", l = {34}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class SecLocationRepository$lastLocationOrDefault$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ wxp0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecLocationRepository$lastLocationOrDefault$1(wxp0 wxp0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = wxp0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SecLocationRepository$lastLocationOrDefault$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SecLocationRepository$lastLocationOrDefault$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            po21 po21Var = (po21) this.this$0.b.get();
            this.label = 1;
            obj = ((e) po21Var).h(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return ((mo21) obj).b();
    }
}
