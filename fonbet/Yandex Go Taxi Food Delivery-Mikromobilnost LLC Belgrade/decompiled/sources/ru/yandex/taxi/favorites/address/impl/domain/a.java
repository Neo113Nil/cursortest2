package ru.yandex.taxi.favorites.address.impl.domain;

import com.yandex.go.address.models.FavoriteAddress;
import defpackage.g92;
import defpackage.ny61;
import defpackage.pvn;
import defpackage.uep;
import defpackage.xj50;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public final class a {
    public final ru.yandex.taxi.favorites.address.impl.factory.a a;

    public a(ru.yandex.taxi.favorites.address.impl.factory.a aVar) {
        this.a = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(uep uepVar, FavoriteAddress favoriteAddress, ContinuationImpl continuationImpl) {
        FavoriteAddressChangedInteractor$updateAddress$1 favoriteAddressChangedInteractor$updateAddress$1;
        int i;
        FavoriteAddress favoriteAddress2;
        if (continuationImpl instanceof FavoriteAddressChangedInteractor$updateAddress$1) {
            favoriteAddressChangedInteractor$updateAddress$1 = (FavoriteAddressChangedInteractor$updateAddress$1) continuationImpl;
            int i2 = favoriteAddressChangedInteractor$updateAddress$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                favoriteAddressChangedInteractor$updateAddress$1.label = i2 - Integer.MIN_VALUE;
                Object obj = favoriteAddressChangedInteractor$updateAddress$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = favoriteAddressChangedInteractor$updateAddress$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (uepVar == null) {
                        return pvn.a;
                    }
                    FavoriteAddress b = FavoriteAddress.b(favoriteAddress, null, 0, null, uepVar.e.getDatumType(), null, 4194239);
                    favoriteAddressChangedInteractor$updateAddress$1.L$0 = null;
                    favoriteAddressChangedInteractor$updateAddress$1.L$1 = null;
                    favoriteAddressChangedInteractor$updateAddress$1.L$2 = uepVar;
                    favoriteAddressChangedInteractor$updateAddress$1.L$3 = b;
                    favoriteAddressChangedInteractor$updateAddress$1.label = 1;
                    obj = this.a.a(b, favoriteAddressChangedInteractor$updateAddress$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    favoriteAddress2 = b;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    FavoriteAddress favoriteAddress3 = (FavoriteAddress) favoriteAddressChangedInteractor$updateAddress$1.L$3;
                    uepVar = (uep) favoriteAddressChangedInteractor$updateAddress$1.L$2;
                    kotlin.b.b(obj);
                    favoriteAddress2 = favoriteAddress3;
                }
                return new g92(2, uep.a(uepVar, null, null, favoriteAddress2, null, false, null, (xj50) obj, 239));
            }
        }
        favoriteAddressChangedInteractor$updateAddress$1 = new FavoriteAddressChangedInteractor$updateAddress$1(this, continuationImpl);
        Object obj2 = favoriteAddressChangedInteractor$updateAddress$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = favoriteAddressChangedInteractor$updateAddress$1.label;
        if (i != 0) {
        }
        return new g92(2, uep.a(uepVar, null, null, favoriteAddress2, null, false, null, (xj50) obj2, 239));
    }
}
