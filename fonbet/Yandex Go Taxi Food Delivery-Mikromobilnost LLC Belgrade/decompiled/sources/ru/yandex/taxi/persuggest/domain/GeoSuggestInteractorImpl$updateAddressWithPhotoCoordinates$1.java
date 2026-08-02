package ru.yandex.taxi.persuggest.domain;

import defpackage.d2t;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.persuggest.api.finalsuggest.Action;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lv6r;", "<anonymous>", "()Lv6r;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.persuggest.domain.GeoSuggestInteractorImpl$updateAddressWithPhotoCoordinates$1", f = "GeoSuggestInteractorImpl.kt", l = {532}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class GeoSuggestInteractorImpl$updateAddressWithPhotoCoordinates$1 extends SuspendLambda implements tls {
    final /* synthetic */ d2t $params;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeoSuggestInteractorImpl$updateAddressWithPhotoCoordinates$1(g gVar, d2t d2tVar, Continuation continuation) {
        super(1, continuation);
        this.this$0 = gVar;
        this.$params = d2tVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new GeoSuggestInteractorImpl$updateAddressWithPhotoCoordinates$1(this.this$0, this.$params, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((GeoSuggestInteractorImpl$updateAddressWithPhotoCoordinates$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ru.yandex.taxi.persuggest.source.c cVar = this.this$0.b;
        d2t d2tVar = this.$params;
        this.label = 1;
        cVar.getClass();
        Object c = ru.yandex.taxi.persuggest.source.c.c(cVar, Action.PHOTO_FLOW, d2tVar, null, this, 12);
        return c == coroutineSingletons ? coroutineSingletons : c;
    }
}
