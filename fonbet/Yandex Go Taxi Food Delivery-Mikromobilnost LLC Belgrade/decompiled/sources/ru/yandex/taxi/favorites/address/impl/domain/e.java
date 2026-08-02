package ru.yandex.taxi.favorites.address.impl.domain;

import com.yandex.go.address.models.FavoriteAddress;
import com.yandex.go.address.models.FavoriteAddressRequest;
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
import defpackage.rol0;
import defpackage.tdp;
import defpackage.tpr;
import defpackage.u500;
import defpackage.uep;
import defpackage.wip;
import defpackage.wj50;
import defpackage.xj50;
import defpackage.z81;
import defpackage.zuj0;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.h;
import ru.yandex.taxi.favorites.notification.FavoriteNotification;

/* loaded from: classes5.dex */
public final class e {
    public final ru.yandex.taxi.favorites.data.repo.a a;
    public final wip b;
    public final zuj0 c;
    public final u500 d;
    public final ru.yandex.taxi.favorites.address.api.experiment.a e;

    public e(ru.yandex.taxi.favorites.data.repo.a aVar, wip wipVar, zuj0 zuj0Var, u500 u500Var, ru.yandex.taxi.favorites.address.api.experiment.a aVar2) {
        this.a = aVar;
        this.b = wipVar;
        this.c = zuj0Var;
        this.d = u500Var;
        this.e = aVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0075, code lost:
    
        if (r0 == r3) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0095 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(e eVar, uep uepVar, ndp ndpVar, ContinuationImpl continuationImpl) {
        FavoriteUpdateNearbyUserplaceInteractor$tryUpdateNearby$1 favoriteUpdateNearbyUserplaceInteractor$tryUpdateNearby$1;
        int i;
        uep uepVar2;
        ndp ndpVar2;
        xj50 xj50Var;
        FavoriteAddress favoriteAddress;
        tdp tdpVar;
        ndp ndpVar3;
        Object failure;
        eVar.getClass();
        try {
            if (continuationImpl instanceof FavoriteUpdateNearbyUserplaceInteractor$tryUpdateNearby$1) {
                favoriteUpdateNearbyUserplaceInteractor$tryUpdateNearby$1 = (FavoriteUpdateNearbyUserplaceInteractor$tryUpdateNearby$1) continuationImpl;
                int i2 = favoriteUpdateNearbyUserplaceInteractor$tryUpdateNearby$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    favoriteUpdateNearbyUserplaceInteractor$tryUpdateNearby$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = favoriteUpdateNearbyUserplaceInteractor$tryUpdateNearby$1.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = favoriteUpdateNearbyUserplaceInteractor$tryUpdateNearby$1.label;
                    zy11 zy11Var = zy11.a;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        ru.yandex.taxi.favorites.address.api.experiment.a aVar = eVar.e;
                        uepVar2 = uepVar;
                        favoriteUpdateNearbyUserplaceInteractor$tryUpdateNearby$1.L$0 = uepVar2;
                        ndpVar2 = ndpVar;
                        favoriteUpdateNearbyUserplaceInteractor$tryUpdateNearby$1.L$1 = ndpVar2;
                        favoriteUpdateNearbyUserplaceInteractor$tryUpdateNearby$1.label = 1;
                        obj = aVar.a.b(favoriteUpdateNearbyUserplaceInteractor$tryUpdateNearby$1);
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            tdpVar = (tdp) favoriteUpdateNearbyUserplaceInteractor$tryUpdateNearby$1.L$2;
                            ndpVar3 = (ndp) favoriteUpdateNearbyUserplaceInteractor$tryUpdateNearby$1.L$1;
                            try {
                                kotlin.b.b(obj);
                                eVar.b(tdpVar);
                                ((ru.yandex.taxi.favorites.address.impl.a) ndpVar3).a.r(new fdp(3, (FavoriteAddress) obj));
                                failure = zy11Var;
                            } catch (Exception e) {
                                e = e;
                                failure = new Result.Failure(e);
                                if (Result.a(failure) != null) {
                                }
                                return zy11Var;
                            }
                            if (Result.a(failure) != null) {
                                eVar.b.a(d6z.Y(tdpVar, tdpVar.j.d.c), ((avj0) eVar.c).h(kyh0.favorite_item_saving_error_message));
                            }
                            return zy11Var;
                        }
                        ndp ndpVar4 = (ndp) favoriteUpdateNearbyUserplaceInteractor$tryUpdateNearby$1.L$1;
                        uep uepVar3 = (uep) favoriteUpdateNearbyUserplaceInteractor$tryUpdateNearby$1.L$0;
                        kotlin.b.b(obj);
                        ndpVar2 = ndpVar4;
                        uepVar2 = uepVar3;
                    }
                    tdp tdpVar2 = (tdp) obj;
                    xj50Var = uepVar2.i;
                    if (xj50Var != null) {
                        wj50 wj50Var = (wj50) kotlin.collections.a.S(xj50Var.c, xj50Var.b.a);
                        if (wj50Var != null) {
                            favoriteAddress = wj50Var.c;
                            if (favoriteAddress != null) {
                                try {
                                    FavoriteAddressRequest a = FavoriteAddressRequest.a(z81.i(uepVar2.e), favoriteAddress.getPlaceType(), favoriteAddress.getName(), null, null, null, null, favoriteAddress.getEmoji(), 8167);
                                    ru.yandex.taxi.favorites.data.repo.a aVar2 = eVar.a;
                                    String id = favoriteAddress.getId();
                                    int version = favoriteAddress.getVersion();
                                    favoriteUpdateNearbyUserplaceInteractor$tryUpdateNearby$1.L$0 = null;
                                    favoriteUpdateNearbyUserplaceInteractor$tryUpdateNearby$1.L$1 = ndpVar2;
                                    favoriteUpdateNearbyUserplaceInteractor$tryUpdateNearby$1.L$2 = tdpVar2;
                                    favoriteUpdateNearbyUserplaceInteractor$tryUpdateNearby$1.L$3 = null;
                                    favoriteUpdateNearbyUserplaceInteractor$tryUpdateNearby$1.L$4 = null;
                                    favoriteUpdateNearbyUserplaceInteractor$tryUpdateNearby$1.label = 2;
                                    obj = aVar2.h(a, id, version, favoriteUpdateNearbyUserplaceInteractor$tryUpdateNearby$1);
                                } catch (Exception e2) {
                                    e = e2;
                                    tdpVar = tdpVar2;
                                    failure = new Result.Failure(e);
                                    if (Result.a(failure) != null) {
                                    }
                                    return zy11Var;
                                }
                                if (obj != obj2) {
                                    tdpVar = tdpVar2;
                                    ndpVar3 = ndpVar2;
                                    eVar.b(tdpVar);
                                    ((ru.yandex.taxi.favorites.address.impl.a) ndpVar3).a.r(new fdp(3, (FavoriteAddress) obj));
                                    failure = zy11Var;
                                    if (Result.a(failure) != null) {
                                    }
                                }
                                return obj2;
                            }
                            return zy11Var;
                        }
                    }
                    favoriteAddress = null;
                    if (favoriteAddress != null) {
                    }
                    return zy11Var;
                }
            }
            if (i != 0) {
            }
            tdp tdpVar22 = (tdp) obj;
            xj50Var = uepVar2.i;
            if (xj50Var != null) {
            }
            favoriteAddress = null;
            if (favoriteAddress != null) {
            }
            return zy11Var;
        } catch (CancellationException e3) {
            throw e3;
        }
        favoriteUpdateNearbyUserplaceInteractor$tryUpdateNearby$1 = new FavoriteUpdateNearbyUserplaceInteractor$tryUpdateNearby$1(eVar, continuationImpl);
        Object obj3 = favoriteUpdateNearbyUserplaceInteractor$tryUpdateNearby$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = favoriteUpdateNearbyUserplaceInteractor$tryUpdateNearby$1.label;
        zy11 zy11Var2 = zy11.a;
    }

    public final void b(tdp tdpVar) {
        String Y = d6z.Y(tdpVar, tdpVar.j.d.a);
        String Y2 = d6z.Y(tdpVar, tdpVar.j.d.b);
        c1o c1oVar = new c1o(17, this);
        wip wipVar = this.b;
        wipVar.getClass();
        FavoriteNotification favoriteNotification = new FavoriteNotification(wipVar.a, "FavoriteNotification", Y, Y2, true, f1h0.ic_success_change);
        ru.yandex.taxi.design.utils.c.z(new bdp(2, c1oVar, wipVar), favoriteNotification);
        favoriteNotification.setExpiresListener(new f08(5, wipVar));
        favoriteNotification.startExpiresTimer(5000L);
        wipVar.b.e(favoriteNotification);
    }

    public final tpr c(uep uepVar, ndp ndpVar) {
        return uepVar == null ? new h(new uep[0]) : new rol0(new FavoriteUpdateNearbyUserplaceInteractor$updateNearby$1(uepVar, this, ndpVar, null));
    }
}
