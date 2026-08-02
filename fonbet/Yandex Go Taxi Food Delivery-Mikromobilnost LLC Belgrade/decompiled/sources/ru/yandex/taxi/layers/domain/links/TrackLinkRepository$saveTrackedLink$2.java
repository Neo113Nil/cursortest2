package ru.yandex.taxi.layers.domain.links;

import defpackage.cne0;
import defpackage.d001;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.v4r0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.domain.links.TrackLinkRepository$saveTrackedLink$2", f = "TrackLinkRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class TrackLinkRepository$saveTrackedLink$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $url;
    int label;
    final /* synthetic */ d001 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackLinkRepository$saveTrackedLink$2(d001 d001Var, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = d001Var;
        this.$url = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TrackLinkRepository$saveTrackedLink$2(this.this$0, this.$url, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TrackLinkRepository$saveTrackedLink$2 trackLinkRepository$saveTrackedLink$2 = (TrackLinkRepository$saveTrackedLink$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        trackLinkRepository$saveTrackedLink$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        cne0 cne0Var = this.this$0.b;
        cne0Var.t("TRACKED_LINKS_PREF", v4r0.i(cne0Var.n("TRACKED_LINKS_PREF"), this.$url));
        return zy11.a;
    }
}
