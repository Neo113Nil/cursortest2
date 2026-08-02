package ru.yandex.taxi.favorites.domain;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes5.dex */
public final class b implements tpr {
    public final /* synthetic */ m0 a;

    public b(m0 m0Var) {
        this.a = m0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        FavoriteRidesAndAddressesInteractor$updateFavoritesFlow$$inlined$filter$1$1 favoriteRidesAndAddressesInteractor$updateFavoritesFlow$$inlined$filter$1$1;
        int i;
        if (continuation instanceof FavoriteRidesAndAddressesInteractor$updateFavoritesFlow$$inlined$filter$1$1) {
            favoriteRidesAndAddressesInteractor$updateFavoritesFlow$$inlined$filter$1$1 = (FavoriteRidesAndAddressesInteractor$updateFavoritesFlow$$inlined$filter$1$1) continuation;
            int i2 = favoriteRidesAndAddressesInteractor$updateFavoritesFlow$$inlined$filter$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                favoriteRidesAndAddressesInteractor$updateFavoritesFlow$$inlined$filter$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = favoriteRidesAndAddressesInteractor$updateFavoritesFlow$$inlined$filter$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = favoriteRidesAndAddressesInteractor$updateFavoritesFlow$$inlined$filter$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar);
                    favoriteRidesAndAddressesInteractor$updateFavoritesFlow$$inlined$filter$1$1.L$0 = null;
                    favoriteRidesAndAddressesInteractor$updateFavoritesFlow$$inlined$filter$1$1.L$1 = null;
                    favoriteRidesAndAddressesInteractor$updateFavoritesFlow$$inlined$filter$1$1.L$2 = null;
                    favoriteRidesAndAddressesInteractor$updateFavoritesFlow$$inlined$filter$1$1.label = 1;
                    if (this.a.collect(aVar, favoriteRidesAndAddressesInteractor$updateFavoritesFlow$$inlined$filter$1$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        favoriteRidesAndAddressesInteractor$updateFavoritesFlow$$inlined$filter$1$1 = new FavoriteRidesAndAddressesInteractor$updateFavoritesFlow$$inlined$filter$1$1(this, continuation);
        Object obj2 = favoriteRidesAndAddressesInteractor$updateFavoritesFlow$$inlined$filter$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = favoriteRidesAndAddressesInteractor$updateFavoritesFlow$$inlined$filter$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
