package ru.yandex.taxi.favorites.address.impl.domain;

import com.yandex.go.address.models.PlaceType;
import defpackage.g92;
import defpackage.n3c0;
import defpackage.ny61;
import defpackage.pvn;
import defpackage.t17;
import defpackage.tu21;
import defpackage.uep;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public final class c {
    public final ru.yandex.taxi.favorites.address.impl.data.b a;
    public final t17 b;

    public c(ru.yandex.taxi.favorites.address.impl.data.b bVar, t17 t17Var) {
        this.a = bVar;
        this.b = t17Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(uep uepVar, PlaceType placeType, ContinuationImpl continuationImpl) {
        FavoritePlaceTypeChangedInteractor$updatePlaceType$1 favoritePlaceTypeChangedInteractor$updatePlaceType$1;
        int i;
        uep uepVar2;
        String str;
        n3c0 n3c0Var;
        if (continuationImpl instanceof FavoritePlaceTypeChangedInteractor$updatePlaceType$1) {
            favoritePlaceTypeChangedInteractor$updatePlaceType$1 = (FavoritePlaceTypeChangedInteractor$updatePlaceType$1) continuationImpl;
            int i2 = favoritePlaceTypeChangedInteractor$updatePlaceType$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                favoritePlaceTypeChangedInteractor$updatePlaceType$1.label = i2 - Integer.MIN_VALUE;
                Object obj = favoritePlaceTypeChangedInteractor$updatePlaceType$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = favoritePlaceTypeChangedInteractor$updatePlaceType$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (uepVar == null) {
                        return pvn.a;
                    }
                    PlaceType placeType2 = placeType == null ? PlaceType.OTHER : placeType;
                    n3c0 n3c0Var2 = uepVar.h;
                    n3c0 n3c0Var3 = new n3c0(placeType2, n3c0Var2.b, n3c0Var2.c, n3c0Var2.d);
                    ru.yandex.taxi.favorites.address.impl.data.b bVar = this.a;
                    String b = bVar.b(placeType2);
                    favoritePlaceTypeChangedInteractor$updatePlaceType$1.L$0 = null;
                    favoritePlaceTypeChangedInteractor$updatePlaceType$1.L$1 = null;
                    favoritePlaceTypeChangedInteractor$updatePlaceType$1.L$2 = uepVar;
                    favoritePlaceTypeChangedInteractor$updatePlaceType$1.L$3 = null;
                    favoritePlaceTypeChangedInteractor$updatePlaceType$1.L$4 = n3c0Var3;
                    favoritePlaceTypeChangedInteractor$updatePlaceType$1.L$5 = b;
                    favoritePlaceTypeChangedInteractor$updatePlaceType$1.label = 1;
                    obj = bVar.a(placeType2, favoritePlaceTypeChangedInteractor$updatePlaceType$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    uepVar2 = uepVar;
                    str = b;
                    n3c0Var = n3c0Var3;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str2 = (String) favoritePlaceTypeChangedInteractor$updatePlaceType$1.L$5;
                    n3c0 n3c0Var4 = (n3c0) favoritePlaceTypeChangedInteractor$updatePlaceType$1.L$4;
                    uep uepVar3 = (uep) favoritePlaceTypeChangedInteractor$updatePlaceType$1.L$2;
                    kotlin.b.b(obj);
                    str = str2;
                    n3c0Var = n3c0Var4;
                    uepVar2 = uepVar3;
                }
                return new g92(2, uep.a(uepVar2, (tu21) obj, str, null, this.b.a(str, uepVar2.f), false, n3c0Var, null, 345));
            }
        }
        favoritePlaceTypeChangedInteractor$updatePlaceType$1 = new FavoritePlaceTypeChangedInteractor$updatePlaceType$1(this, continuationImpl);
        Object obj2 = favoritePlaceTypeChangedInteractor$updatePlaceType$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = favoritePlaceTypeChangedInteractor$updatePlaceType$1.label;
        if (i != 0) {
        }
        return new g92(2, uep.a(uepVar2, (tu21) obj2, str, null, this.b.a(str, uepVar2.f), false, n3c0Var, null, 345));
    }
}
