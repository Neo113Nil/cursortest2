package ru.yandex.taxi.layers.domain.links;

import defpackage.b001;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "url", "Lzy11;", "<anonymous>", "(Ljava/lang/String;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.domain.links.TrackLinkInteractor$start$2", f = "TrackLinkInteractor.kt", l = {42}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class TrackLinkInteractor$start$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackLinkInteractor$start$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TrackLinkInteractor$start$2 trackLinkInteractor$start$2 = new TrackLinkInteractor$start$2(this.this$0, continuation);
        trackLinkInteractor$start$2.L$0 = obj;
        return trackLinkInteractor$start$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TrackLinkInteractor$start$2) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str = (String) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            this.L$0 = str;
            this.label = 1;
            obj = a.b(aVar, str, this);
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
        if (!((Boolean) obj).booleanValue()) {
            this.this$0.c.g(new b001(str));
        }
        return zy11.a;
    }
}
