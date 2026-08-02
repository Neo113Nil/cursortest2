package ru.yandex.taxi.favorites.data.repo;

import com.yandex.go.address.dto.AddressDTO;
import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.FavoriteAddress;
import com.yandex.go.address.models.FavoriteAddressRequest;
import com.yandex.go.address.models.PlainAddress;
import defpackage.afp;
import defpackage.bfp;
import defpackage.ck;
import defpackage.cmt;
import defpackage.dhe0;
import defpackage.efp;
import defpackage.evu0;
import defpackage.ffp;
import defpackage.g92;
import defpackage.hep;
import defpackage.i3y;
import defpackage.jpb;
import defpackage.jtq0;
import defpackage.khp;
import defpackage.nip;
import defpackage.ny61;
import defpackage.on2;
import defpackage.q6r;
import defpackage.rol0;
import defpackage.scp;
import defpackage.tpr;
import defpackage.udq0;
import defpackage.v03;
import defpackage.vcp;
import defpackage.w7v0;
import defpackage.xep;
import defpackage.xv21;
import defpackage.zy11;
import defpackage.zzs;
import java.io.Serializable;
import java.util.Date;
import java.util.concurrent.CancellationException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.am.g;
import ru.yandex.taxi.favorites.data.api.FavoritesApi;
import ru.yandex.taxi.launch.c;
import ru.yandex.taxi.persuggest.api.finalsuggest.Action;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

/* loaded from: classes9.dex */
public final class a {
    public final ru.yandex.taxi.persuggest.api.a a;
    public final c b;
    public final g c;
    public final jtq0 d;
    public final dhe0 e;
    public final bfp f;
    public final nip g;
    public final w7v0 h;
    public final i3y i;

    public a(on2 on2Var, ru.yandex.taxi.persuggest.api.a aVar, c cVar, g gVar, jtq0 jtq0Var, dhe0 dhe0Var, bfp bfpVar, nip nipVar, w7v0 w7v0Var) {
        this.a = aVar;
        this.b = cVar;
        this.c = gVar;
        this.d = jtq0Var;
        this.e = dhe0Var;
        this.f = bfpVar;
        this.g = nipVar;
        this.h = w7v0Var;
        this.i = kotlin.a.a(new ck(on2Var, 9));
    }

    public static final q6r a(a aVar, Address address, String str, AddressDTO addressDTO, boolean z) {
        aVar.getClass();
        Action action = Action.GEOMAGNET;
        zzs zzsVar = addressDTO.a;
        Long l = zzsVar.e;
        String a = l != null ? xv21.a(new Date(l.longValue())) : null;
        String str2 = addressDTO.a.d;
        return new q6r(action, zzsVar, a, str2 != null ? udq0.G(str2) : null, null, new v03(null, null, z), str, address.R(), false, RoutePointType.FAVORITE.getType(), null, false, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(FavoriteAddressRequest favoriteAddressRequest, ContinuationImpl continuationImpl) {
        FavoriteAddressesRepositoryImpl$create$1 favoriteAddressesRepositoryImpl$create$1;
        int i;
        if (continuationImpl instanceof FavoriteAddressesRepositoryImpl$create$1) {
            favoriteAddressesRepositoryImpl$create$1 = (FavoriteAddressesRepositoryImpl$create$1) continuationImpl;
            int i2 = favoriteAddressesRepositoryImpl$create$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                favoriteAddressesRepositoryImpl$create$1.label = i2 - Integer.MIN_VALUE;
                Object obj = favoriteAddressesRepositoryImpl$create$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = favoriteAddressesRepositoryImpl$create$1.label;
                if (i != 0) {
                    b.b(obj);
                    cmt<vcp> e = ((FavoritesApi) this.i.getValue()).e(new scp(favoriteAddressRequest));
                    favoriteAddressesRepositoryImpl$create$1.L$0 = null;
                    favoriteAddressesRepositoryImpl$create$1.label = 1;
                    obj = ru.yandex.taxi.network.api.a.a(e, null, favoriteAddressesRepositoryImpl$create$1);
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
                return ((vcp) obj).getA();
            }
        }
        favoriteAddressesRepositoryImpl$create$1 = new FavoriteAddressesRepositoryImpl$create$1(this, continuationImpl);
        Object obj2 = favoriteAddressesRepositoryImpl$create$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = favoriteAddressesRepositoryImpl$create$1.label;
        if (i != 0) {
        }
        return ((vcp) obj2).getA();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(boolean z, ContinuationImpl continuationImpl) {
        FavoriteAddressesRepositoryImpl$getAddressesResult$1 favoriteAddressesRepositoryImpl$getAddressesResult$1;
        int i;
        a aVar;
        try {
            if (continuationImpl instanceof FavoriteAddressesRepositoryImpl$getAddressesResult$1) {
                favoriteAddressesRepositoryImpl$getAddressesResult$1 = (FavoriteAddressesRepositoryImpl$getAddressesResult$1) continuationImpl;
                int i2 = favoriteAddressesRepositoryImpl$getAddressesResult$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    favoriteAddressesRepositoryImpl$getAddressesResult$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = favoriteAddressesRepositoryImpl$getAddressesResult$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = favoriteAddressesRepositoryImpl$getAddressesResult$1.label;
                    if (i != 0) {
                        b.b(obj);
                        ffp a = this.f.a();
                        if (a != null && z) {
                            return a;
                        }
                        if (!this.c.g()) {
                            return null;
                        }
                        cmt<efp> c = ((FavoritesApi) this.i.getValue()).c(new kotlinx.serialization.json.c(kotlin.collections.b.f()));
                        favoriteAddressesRepositoryImpl$getAddressesResult$1.L$0 = null;
                        favoriteAddressesRepositoryImpl$getAddressesResult$1.L$1 = this;
                        favoriteAddressesRepositoryImpl$getAddressesResult$1.Z$0 = z;
                        favoriteAddressesRepositoryImpl$getAddressesResult$1.label = 1;
                        obj = ru.yandex.taxi.network.api.a.a(c, null, favoriteAddressesRepositoryImpl$getAddressesResult$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        aVar = this;
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        aVar = (a) favoriteAddressesRepositoryImpl$getAddressesResult$1.L$1;
                        b.b(obj);
                    }
                    efp efpVar = (efp) obj;
                    aVar.getClass();
                    ffp ffpVar = new ffp(efpVar.a, efpVar.b, efpVar.c, efpVar.e);
                    bfp bfpVar = this.f;
                    bfpVar.b = new jpb(bfpVar.a.i(), ffpVar, 3);
                    return ffpVar;
                }
            }
            if (i != 0) {
            }
            efp efpVar2 = (efp) obj;
            aVar.getClass();
            ffp ffpVar2 = new ffp(efpVar2.a, efpVar2.b, efpVar2.c, efpVar2.e);
            bfp bfpVar2 = this.f;
            bfpVar2.b = new jpb(bfpVar2.a.i(), ffpVar2, 3);
            return ffpVar2;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            this.g.getClass();
            nip.a(th, "Failed to load user places");
            return null;
        }
        favoriteAddressesRepositoryImpl$getAddressesResult$1 = new FavoriteAddressesRepositoryImpl$getAddressesResult$1(this, continuationImpl);
        Object obj2 = favoriteAddressesRepositoryImpl$getAddressesResult$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = favoriteAddressesRepositoryImpl$getAddressesResult$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ContinuationImpl continuationImpl) {
        FavoriteAddressesRepositoryImpl$getRidesAndAddresses$1 favoriteAddressesRepositoryImpl$getRidesAndAddresses$1;
        int i;
        try {
            if (continuationImpl instanceof FavoriteAddressesRepositoryImpl$getRidesAndAddresses$1) {
                favoriteAddressesRepositoryImpl$getRidesAndAddresses$1 = (FavoriteAddressesRepositoryImpl$getRidesAndAddresses$1) continuationImpl;
                int i2 = favoriteAddressesRepositoryImpl$getRidesAndAddresses$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    favoriteAddressesRepositoryImpl$getRidesAndAddresses$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = favoriteAddressesRepositoryImpl$getRidesAndAddresses$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = favoriteAddressesRepositoryImpl$getRidesAndAddresses$1.label;
                    if (i != 0) {
                        b.b(obj);
                        if (!this.c.g()) {
                            return null;
                        }
                        cmt<khp> d = ((FavoritesApi) this.i.getValue()).d(new kotlinx.serialization.json.c(kotlin.collections.b.f()));
                        favoriteAddressesRepositoryImpl$getRidesAndAddresses$1.label = 1;
                        obj = ru.yandex.taxi.network.api.a.a(d, null, favoriteAddressesRepositoryImpl$getRidesAndAddresses$1);
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
                    return (khp) obj;
                }
            }
            if (i != 0) {
            }
            return (khp) obj;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            this.g.getClass();
            nip.a(th, "Failed to load userplaces/v2");
            return null;
        }
        favoriteAddressesRepositoryImpl$getRidesAndAddresses$1 = new FavoriteAddressesRepositoryImpl$getRidesAndAddresses$1(this, continuationImpl);
        Object obj2 = favoriteAddressesRepositoryImpl$getRidesAndAddresses$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = favoriteAddressesRepositoryImpl$getRidesAndAddresses$1.label;
    }

    public final tpr f(PlainAddress plainAddress, String str, String str2) {
        String J1;
        AddressDTO address = plainAddress.getAddress();
        return (evu0.J(str) && ((J1 = plainAddress.J1()) == null || evu0.J(J1))) ? new g92(2, AddressDTO.g(address, null, null, "", null, null, null, str2, null, null, null, null, null, null, null, null, null, 33554299)) : new rol0(new FavoriteAddressesRepositoryImpl$modifyWithPorchAndComment$1(this, plainAddress, str, address, str2, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(FavoriteAddress favoriteAddress, ContinuationImpl continuationImpl) {
        FavoriteAddressesRepositoryImpl$remove$1 favoriteAddressesRepositoryImpl$remove$1;
        int i;
        if (continuationImpl instanceof FavoriteAddressesRepositoryImpl$remove$1) {
            favoriteAddressesRepositoryImpl$remove$1 = (FavoriteAddressesRepositoryImpl$remove$1) continuationImpl;
            int i2 = favoriteAddressesRepositoryImpl$remove$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                favoriteAddressesRepositoryImpl$remove$1.label = i2 - Integer.MIN_VALUE;
                Object obj = favoriteAddressesRepositoryImpl$remove$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = favoriteAddressesRepositoryImpl$remove$1.label;
                if (i != 0) {
                    b.b(obj);
                    cmt<zy11> b = ((FavoritesApi) this.i.getValue()).b(new hep(favoriteAddress.getId(), new Integer(favoriteAddress.getVersion())));
                    favoriteAddressesRepositoryImpl$remove$1.L$0 = null;
                    favoriteAddressesRepositoryImpl$remove$1.label = 1;
                    if (ru.yandex.taxi.network.api.a.a(b, null, favoriteAddressesRepositoryImpl$remove$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                return zy11.a;
            }
        }
        favoriteAddressesRepositoryImpl$remove$1 = new FavoriteAddressesRepositoryImpl$remove$1(this, continuationImpl);
        Object obj2 = favoriteAddressesRepositoryImpl$remove$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = favoriteAddressesRepositoryImpl$remove$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable h(FavoriteAddressRequest favoriteAddressRequest, String str, int i, ContinuationImpl continuationImpl) {
        FavoriteAddressesRepositoryImpl$update$1 favoriteAddressesRepositoryImpl$update$1;
        int i2;
        if (continuationImpl instanceof FavoriteAddressesRepositoryImpl$update$1) {
            favoriteAddressesRepositoryImpl$update$1 = (FavoriteAddressesRepositoryImpl$update$1) continuationImpl;
            int i3 = favoriteAddressesRepositoryImpl$update$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                favoriteAddressesRepositoryImpl$update$1.label = i3 - Integer.MIN_VALUE;
                Object obj = favoriteAddressesRepositoryImpl$update$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = favoriteAddressesRepositoryImpl$update$1.label;
                if (i2 != 0) {
                    b.b(obj);
                    cmt<afp> g = ((FavoritesApi) this.i.getValue()).g(new xep(str, new Integer(i), favoriteAddressRequest));
                    favoriteAddressesRepositoryImpl$update$1.L$0 = null;
                    favoriteAddressesRepositoryImpl$update$1.L$1 = null;
                    favoriteAddressesRepositoryImpl$update$1.I$0 = i;
                    favoriteAddressesRepositoryImpl$update$1.label = 1;
                    obj = ru.yandex.taxi.network.api.a.a(g, null, favoriteAddressesRepositoryImpl$update$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                return ((afp) obj).getA();
            }
        }
        favoriteAddressesRepositoryImpl$update$1 = new FavoriteAddressesRepositoryImpl$update$1(this, continuationImpl);
        Object obj2 = favoriteAddressesRepositoryImpl$update$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = favoriteAddressesRepositoryImpl$update$1.label;
        if (i2 != 0) {
        }
        return ((afp) obj2).getA();
    }
}
