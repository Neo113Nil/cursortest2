package ru.yandex.taxi.favorites.domain;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.favorites.rides.save_modal.dto.ResponseState;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "deleteState", "Lru/yandex/taxi/favorites/rides/save_modal/dto/ResponseState;", "saveState"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.favorites.domain.FavoriteRidesAndAddressesInteractor$updateFavoritesFlow$1", f = "FavoriteRidesAndAddressesInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class FavoriteRidesAndAddressesInteractor$updateFavoritesFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        FavoriteRidesAndAddressesInteractor$updateFavoritesFlow$1 favoriteRidesAndAddressesInteractor$updateFavoritesFlow$1 = new FavoriteRidesAndAddressesInteractor$updateFavoritesFlow$1(3, (Continuation) obj3);
        favoriteRidesAndAddressesInteractor$updateFavoritesFlow$1.L$0 = (ResponseState) obj;
        favoriteRidesAndAddressesInteractor$updateFavoritesFlow$1.L$1 = (ResponseState) obj2;
        return favoriteRidesAndAddressesInteractor$updateFavoritesFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ResponseState responseState = (ResponseState) this.L$0;
        ResponseState responseState2 = (ResponseState) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ResponseState responseState3 = ResponseState.LOADED;
        return Boolean.valueOf(responseState == responseState3 || responseState2 == responseState3);
    }
}
