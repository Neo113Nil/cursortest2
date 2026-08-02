package ru.yandex.taxi.favorites.address.impl.data;

import com.yandex.go.address.dto.AddressDTO;
import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.FavoriteAddress;
import com.yandex.go.address.models.FavoriteAddressDatumType;
import com.yandex.go.address.models.PlaceType;
import com.yandex.go.address.models.PlainAddress;
import defpackage.ffp;
import defpackage.ny61;
import defpackage.tdp;
import defpackage.zgc0;
import defpackage.zzs;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public final class a {
    public final ru.yandex.taxi.favorites.data.repo.a a;
    public final ru.yandex.taxi.favorites.address.api.experiment.a b;
    public List c;

    public a(ru.yandex.taxi.favorites.data.repo.a aVar, ru.yandex.taxi.favorites.address.api.experiment.a aVar2) {
        this.a = aVar;
        this.b = aVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        FavoriteNearbyRepositoryImpl$getFavorites$1 favoriteNearbyRepositoryImpl$getFavorites$1;
        int i;
        List list;
        if (continuationImpl instanceof FavoriteNearbyRepositoryImpl$getFavorites$1) {
            favoriteNearbyRepositoryImpl$getFavorites$1 = (FavoriteNearbyRepositoryImpl$getFavorites$1) continuationImpl;
            int i2 = favoriteNearbyRepositoryImpl$getFavorites$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                favoriteNearbyRepositoryImpl$getFavorites$1.label = i2 - Integer.MIN_VALUE;
                Object obj = favoriteNearbyRepositoryImpl$getFavorites$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = favoriteNearbyRepositoryImpl$getFavorites$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List list2 = this.c;
                    if (list2 != null) {
                        return list2;
                    }
                    favoriteNearbyRepositoryImpl$getFavorites$1.label = 1;
                    obj = this.a.c(false, favoriteNearbyRepositoryImpl$getFavorites$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                ffp ffpVar = (ffp) obj;
                list = ffpVar != null ? ffpVar.a : null;
                if (list == null) {
                    list = EmptyList.a;
                }
                this.c = list;
                return list;
            }
        }
        favoriteNearbyRepositoryImpl$getFavorites$1 = new FavoriteNearbyRepositoryImpl$getFavorites$1(this, continuationImpl);
        Object obj2 = favoriteNearbyRepositoryImpl$getFavorites$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = favoriteNearbyRepositoryImpl$getFavorites$1.label;
        if (i != 0) {
        }
        ffp ffpVar2 = (ffp) obj2;
        if (ffpVar2 != null) {
        }
        if (list == null) {
        }
        this.c = list;
        return list;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(zzs zzsVar, int i, ContinuationImpl continuationImpl) {
        FavoriteNearbyRepositoryImpl$getNearbyFavorites$1 favoriteNearbyRepositoryImpl$getNearbyFavorites$1;
        int i2;
        if (continuationImpl instanceof FavoriteNearbyRepositoryImpl$getNearbyFavorites$1) {
            favoriteNearbyRepositoryImpl$getNearbyFavorites$1 = (FavoriteNearbyRepositoryImpl$getNearbyFavorites$1) continuationImpl;
            int i3 = favoriteNearbyRepositoryImpl$getNearbyFavorites$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                favoriteNearbyRepositoryImpl$getNearbyFavorites$1.label = i3 - Integer.MIN_VALUE;
                Object obj = favoriteNearbyRepositoryImpl$getNearbyFavorites$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = favoriteNearbyRepositoryImpl$getNearbyFavorites$1.label;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    if (zzsVar == null) {
                        return EmptyList.a;
                    }
                    favoriteNearbyRepositoryImpl$getNearbyFavorites$1.L$0 = zzsVar;
                    favoriteNearbyRepositoryImpl$getNearbyFavorites$1.I$0 = i;
                    favoriteNearbyRepositoryImpl$getNearbyFavorites$1.label = 1;
                    obj = a(favoriteNearbyRepositoryImpl$getNearbyFavorites$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = favoriteNearbyRepositoryImpl$getNearbyFavorites$1.I$0;
                    zzsVar = (zzs) favoriteNearbyRepositoryImpl$getNearbyFavorites$1.L$0;
                    kotlin.b.b(obj);
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (List) obj) {
                    if (ru.yandex.taxi.map.utils.a.j(zzsVar, ((FavoriteAddress) obj2).getPoint()) < i) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            }
        }
        favoriteNearbyRepositoryImpl$getNearbyFavorites$1 = new FavoriteNearbyRepositoryImpl$getNearbyFavorites$1(this, continuationImpl);
        Object obj3 = favoriteNearbyRepositoryImpl$getNearbyFavorites$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = favoriteNearbyRepositoryImpl$getNearbyFavorites$1.label;
        if (i2 != 0) {
        }
        ArrayList arrayList2 = new ArrayList();
        while (r7.hasNext()) {
        }
        return arrayList2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005b, code lost:
    
        if (r4 == r3) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable c(Address address, ContinuationImpl continuationImpl) {
        FavoriteNearbyRepositoryImpl$mergeWithNearbyFavorite$1 favoriteNearbyRepositoryImpl$mergeWithNearbyFavorite$1;
        Serializable serializable;
        int i;
        Address address2;
        Object b;
        Serializable b2;
        Address address3;
        FavoriteAddress favoriteAddress;
        String name;
        if (continuationImpl instanceof FavoriteNearbyRepositoryImpl$mergeWithNearbyFavorite$1) {
            favoriteNearbyRepositoryImpl$mergeWithNearbyFavorite$1 = (FavoriteNearbyRepositoryImpl$mergeWithNearbyFavorite$1) continuationImpl;
            int i2 = favoriteNearbyRepositoryImpl$mergeWithNearbyFavorite$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                favoriteNearbyRepositoryImpl$mergeWithNearbyFavorite$1.label = i2 - Integer.MIN_VALUE;
                Object obj = favoriteNearbyRepositoryImpl$mergeWithNearbyFavorite$1.result;
                serializable = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = favoriteNearbyRepositoryImpl$mergeWithNearbyFavorite$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    address2 = address;
                    favoriteNearbyRepositoryImpl$mergeWithNearbyFavorite$1.L$0 = address2;
                    favoriteNearbyRepositoryImpl$mergeWithNearbyFavorite$1.label = 1;
                    b = this.b.a.b(favoriteNearbyRepositoryImpl$mergeWithNearbyFavorite$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        address3 = (Address) favoriteNearbyRepositoryImpl$mergeWithNearbyFavorite$1.L$0;
                        kotlin.b.b(obj);
                        favoriteAddress = (FavoriteAddress) kotlin.collections.a.R((List) obj);
                        if (favoriteAddress == null || (name = favoriteAddress.getName()) == null) {
                            return address3;
                        }
                        zgc0 zgc0Var = PlainAddress.Companion;
                        AddressDTO g = AddressDTO.g(address3.getAddress(), null, null, null, null, name, null, null, null, null, null, null, null, null, null, null, null, 33554399);
                        String id = favoriteAddress.getId();
                        PlaceType placeType = favoriteAddress.getPlaceType();
                        FavoriteAddressDatumType datumType = favoriteAddress.getDatumType();
                        zgc0Var.getClass();
                        return new PlainAddress(g, id, placeType, datumType);
                    }
                    Address address4 = (Address) favoriteNearbyRepositoryImpl$mergeWithNearbyFavorite$1.L$0;
                    kotlin.b.b(obj);
                    b = obj;
                    address2 = address4;
                }
                zzs B = address2.B();
                int i3 = ((tdp) b).g;
                favoriteNearbyRepositoryImpl$mergeWithNearbyFavorite$1.L$0 = address2;
                favoriteNearbyRepositoryImpl$mergeWithNearbyFavorite$1.L$1 = null;
                favoriteNearbyRepositoryImpl$mergeWithNearbyFavorite$1.label = 2;
                b2 = b(B, i3, favoriteNearbyRepositoryImpl$mergeWithNearbyFavorite$1);
                if (b2 != serializable) {
                    Address address5 = address2;
                    obj = b2;
                    address3 = address5;
                    favoriteAddress = (FavoriteAddress) kotlin.collections.a.R((List) obj);
                    if (favoriteAddress == null) {
                        zgc0 zgc0Var2 = PlainAddress.Companion;
                        AddressDTO g2 = AddressDTO.g(address3.getAddress(), null, null, null, null, name, null, null, null, null, null, null, null, null, null, null, null, 33554399);
                        String id2 = favoriteAddress.getId();
                        PlaceType placeType2 = favoriteAddress.getPlaceType();
                        FavoriteAddressDatumType datumType2 = favoriteAddress.getDatumType();
                        zgc0Var2.getClass();
                        return new PlainAddress(g2, id2, placeType2, datumType2);
                    }
                    return address3;
                }
                return serializable;
            }
        }
        favoriteNearbyRepositoryImpl$mergeWithNearbyFavorite$1 = new FavoriteNearbyRepositoryImpl$mergeWithNearbyFavorite$1(this, continuationImpl);
        Object obj2 = favoriteNearbyRepositoryImpl$mergeWithNearbyFavorite$1.result;
        serializable = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = favoriteNearbyRepositoryImpl$mergeWithNearbyFavorite$1.label;
        if (i != 0) {
        }
        zzs B2 = address2.B();
        int i32 = ((tdp) b).g;
        favoriteNearbyRepositoryImpl$mergeWithNearbyFavorite$1.L$0 = address2;
        favoriteNearbyRepositoryImpl$mergeWithNearbyFavorite$1.L$1 = null;
        favoriteNearbyRepositoryImpl$mergeWithNearbyFavorite$1.label = 2;
        b2 = b(B2, i32, favoriteNearbyRepositoryImpl$mergeWithNearbyFavorite$1);
        if (b2 != serializable) {
        }
        return serializable;
    }
}
