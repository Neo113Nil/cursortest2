package ru.yandex.taxi.favorites.address.impl.domain;

import com.yandex.go.address.models.FavoriteAddress;
import com.yandex.go.address.models.FavoriteAddressRequest;
import com.yandex.go.address.models.PlaceType;
import defpackage.avj0;
import defpackage.bdp;
import defpackage.c1o;
import defpackage.d6z;
import defpackage.f08;
import defpackage.f1h0;
import defpackage.fdp;
import defpackage.kyh0;
import defpackage.ndp;
import defpackage.ny61;
import defpackage.pvn;
import defpackage.rol0;
import defpackage.tdp;
import defpackage.tpr;
import defpackage.tu21;
import defpackage.u500;
import defpackage.uep;
import defpackage.wip;
import defpackage.z81;
import defpackage.zuj0;
import defpackage.zy11;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.favorites.notification.FavoriteNotification;

/* loaded from: classes5.dex */
public final class d {
    public final ru.yandex.taxi.favorites.data.repo.a a;
    public final wip b;
    public final zuj0 c;
    public final u500 d;
    public final ru.yandex.taxi.favorites.address.api.experiment.a e;

    public d(ru.yandex.taxi.favorites.data.repo.a aVar, wip wipVar, zuj0 zuj0Var, u500 u500Var, ru.yandex.taxi.favorites.address.api.experiment.a aVar2) {
        this.a = aVar;
        this.b = wipVar;
        this.c = zuj0Var;
        this.d = u500Var;
        this.e = aVar2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(1:(7:11|12|13|14|15|(1:17)|18)(2:21|22))(2:23|24))(5:29|30|(1:32)(1:37)|33|(2:35|27)(1:36))|25|(6:28|13|14|15|(0)|18)|27))|42|6|7|(0)(0)|25|(0)|27|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ea, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00eb, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x004b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c9, code lost:
    
        r2 = new kotlin.Result.Failure(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(d dVar, uep uepVar, ndp ndpVar, ContinuationImpl continuationImpl) {
        FavoriteSaveAddressInteractor$trySaveAddress$1 favoriteSaveAddressInteractor$trySaveAddress$1;
        Object obj;
        int i;
        Object failure;
        ndp ndpVar2;
        ndp ndpVar3;
        FavoriteAddress favoriteAddress;
        dVar.getClass();
        if (continuationImpl instanceof FavoriteSaveAddressInteractor$trySaveAddress$1) {
            favoriteSaveAddressInteractor$trySaveAddress$1 = (FavoriteSaveAddressInteractor$trySaveAddress$1) continuationImpl;
            int i2 = favoriteSaveAddressInteractor$trySaveAddress$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                favoriteSaveAddressInteractor$trySaveAddress$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = favoriteSaveAddressInteractor$trySaveAddress$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = favoriteSaveAddressInteractor$trySaveAddress$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    PlaceType placeType = uepVar.h.a;
                    FavoriteAddressRequest i3 = z81.i(uepVar.e);
                    String str = uepVar.c;
                    tu21 tu21Var = uepVar.b;
                    FavoriteAddressRequest a = FavoriteAddressRequest.a(i3, placeType, str, null, null, null, null, tu21Var != null ? tu21Var.a : null, 8167);
                    ru.yandex.taxi.favorites.data.repo.a aVar = dVar.a;
                    favoriteSaveAddressInteractor$trySaveAddress$1.L$0 = null;
                    favoriteSaveAddressInteractor$trySaveAddress$1.L$1 = ndpVar;
                    favoriteSaveAddressInteractor$trySaveAddress$1.L$2 = null;
                    favoriteSaveAddressInteractor$trySaveAddress$1.L$3 = null;
                    favoriteSaveAddressInteractor$trySaveAddress$1.label = 1;
                    obj2 = aVar.b(a, favoriteSaveAddressInteractor$trySaveAddress$1);
                    if (obj2 == obj) {
                        return obj;
                    }
                    ndpVar2 = ndpVar;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        favoriteAddress = (FavoriteAddress) favoriteSaveAddressInteractor$trySaveAddress$1.L$3;
                        ndpVar3 = (ndp) favoriteSaveAddressInteractor$trySaveAddress$1.L$1;
                        kotlin.b.b(obj2);
                        ((ru.yandex.taxi.favorites.address.impl.a) ndpVar3).a.r(new fdp(3, favoriteAddress));
                        failure = zy11Var;
                        if (Result.a(failure) != null) {
                            wip wipVar = dVar.b;
                            avj0 avj0Var = (avj0) dVar.c;
                            wipVar.a(avj0Var.h(kyh0.favorite_item_saving_error_title), avj0Var.h(kyh0.favorite_item_saving_error_message));
                        }
                        return zy11Var;
                    }
                    ndpVar2 = (ndp) favoriteSaveAddressInteractor$trySaveAddress$1.L$1;
                    kotlin.b.b(obj2);
                }
                FavoriteAddress favoriteAddress2 = (FavoriteAddress) obj2;
                favoriteSaveAddressInteractor$trySaveAddress$1.L$0 = null;
                favoriteSaveAddressInteractor$trySaveAddress$1.L$1 = ndpVar2;
                favoriteSaveAddressInteractor$trySaveAddress$1.L$2 = null;
                favoriteSaveAddressInteractor$trySaveAddress$1.L$3 = favoriteAddress2;
                favoriteSaveAddressInteractor$trySaveAddress$1.L$4 = null;
                favoriteSaveAddressInteractor$trySaveAddress$1.label = 2;
                if (dVar.c(favoriteSaveAddressInteractor$trySaveAddress$1) != obj) {
                    ndpVar3 = ndpVar2;
                    favoriteAddress = favoriteAddress2;
                    ((ru.yandex.taxi.favorites.address.impl.a) ndpVar3).a.r(new fdp(3, favoriteAddress));
                    failure = zy11Var;
                    if (Result.a(failure) != null) {
                    }
                    return zy11Var;
                }
                return obj;
            }
        }
        favoriteSaveAddressInteractor$trySaveAddress$1 = new FavoriteSaveAddressInteractor$trySaveAddress$1(dVar, continuationImpl);
        Object obj22 = favoriteSaveAddressInteractor$trySaveAddress$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = favoriteSaveAddressInteractor$trySaveAddress$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        FavoriteAddress favoriteAddress22 = (FavoriteAddress) obj22;
        favoriteSaveAddressInteractor$trySaveAddress$1.L$0 = null;
        favoriteSaveAddressInteractor$trySaveAddress$1.L$1 = ndpVar2;
        favoriteSaveAddressInteractor$trySaveAddress$1.L$2 = null;
        favoriteSaveAddressInteractor$trySaveAddress$1.L$3 = favoriteAddress22;
        favoriteSaveAddressInteractor$trySaveAddress$1.L$4 = null;
        favoriteSaveAddressInteractor$trySaveAddress$1.label = 2;
        if (dVar.c(favoriteSaveAddressInteractor$trySaveAddress$1) != obj) {
        }
        return obj;
    }

    public final tpr b(uep uepVar, ndp ndpVar) {
        return uepVar == null ? pvn.a : new rol0(new FavoriteSaveAddressInteractor$saveAddress$1(uepVar, this, ndpVar, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        FavoriteSaveAddressInteractor$showSuccessNotification$1 favoriteSaveAddressInteractor$showSuccessNotification$1;
        int i;
        if (continuationImpl instanceof FavoriteSaveAddressInteractor$showSuccessNotification$1) {
            favoriteSaveAddressInteractor$showSuccessNotification$1 = (FavoriteSaveAddressInteractor$showSuccessNotification$1) continuationImpl;
            int i2 = favoriteSaveAddressInteractor$showSuccessNotification$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                favoriteSaveAddressInteractor$showSuccessNotification$1.label = i2 - Integer.MIN_VALUE;
                Object obj = favoriteSaveAddressInteractor$showSuccessNotification$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = favoriteSaveAddressInteractor$showSuccessNotification$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    favoriteSaveAddressInteractor$showSuccessNotification$1.label = 1;
                    obj = this.e.a.b(favoriteSaveAddressInteractor$showSuccessNotification$1);
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
                tdp tdpVar = (tdp) obj;
                String Y = d6z.Y(tdpVar, tdpVar.i.e.a);
                String Y2 = d6z.Y(tdpVar, tdpVar.i.e.b);
                c1o c1oVar = new c1o(16, this);
                wip wipVar = this.b;
                wipVar.getClass();
                FavoriteNotification favoriteNotification = new FavoriteNotification(wipVar.a, "FavoriteNotification", Y, Y2, true, f1h0.ic_success_change);
                ru.yandex.taxi.design.utils.c.z(new bdp(2, c1oVar, wipVar), favoriteNotification);
                favoriteNotification.setExpiresListener(new f08(5, wipVar));
                favoriteNotification.startExpiresTimer(5000L);
                wipVar.b.e(favoriteNotification);
                return zy11.a;
            }
        }
        favoriteSaveAddressInteractor$showSuccessNotification$1 = new FavoriteSaveAddressInteractor$showSuccessNotification$1(this, continuationImpl);
        Object obj2 = favoriteSaveAddressInteractor$showSuccessNotification$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = favoriteSaveAddressInteractor$showSuccessNotification$1.label;
        if (i != 0) {
        }
        tdp tdpVar2 = (tdp) obj2;
        String Y3 = d6z.Y(tdpVar2, tdpVar2.i.e.a);
        String Y22 = d6z.Y(tdpVar2, tdpVar2.i.e.b);
        c1o c1oVar2 = new c1o(16, this);
        wip wipVar2 = this.b;
        wipVar2.getClass();
        FavoriteNotification favoriteNotification2 = new FavoriteNotification(wipVar2.a, "FavoriteNotification", Y3, Y22, true, f1h0.ic_success_change);
        ru.yandex.taxi.design.utils.c.z(new bdp(2, c1oVar2, wipVar2), favoriteNotification2);
        favoriteNotification2.setExpiresListener(new f08(5, wipVar2));
        favoriteNotification2.startExpiresTimer(5000L);
        wipVar2.b.e(favoriteNotification2);
        return zy11.a;
    }
}
