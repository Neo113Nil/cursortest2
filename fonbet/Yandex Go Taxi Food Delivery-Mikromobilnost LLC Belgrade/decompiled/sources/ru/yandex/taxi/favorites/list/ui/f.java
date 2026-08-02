package ru.yandex.taxi.favorites.list.ui;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.yandex.go.address.models.FavoriteAddress;
import com.yandex.go.address.models.FavoriteAddressDatumType;
import com.yandex.go.address.models.PlaceType;
import defpackage.ad5;
import defpackage.ahp;
import defpackage.aip;
import defpackage.ajp;
import defpackage.avj0;
import defpackage.bhp;
import defpackage.bjp;
import defpackage.cjp;
import defpackage.d6z;
import defpackage.dzg0;
import defpackage.e6v;
import defpackage.e81;
import defpackage.fdp;
import defpackage.g28;
import defpackage.izg0;
import defpackage.jl40;
import defpackage.khp;
import defpackage.kyh0;
import defpackage.l2x;
import defpackage.m2x;
import defpackage.n2x;
import defpackage.n3h;
import defpackage.nhp;
import defpackage.nqs0;
import defpackage.ny61;
import defpackage.o1c;
import defpackage.o2x;
import defpackage.ohp;
import defpackage.ojp;
import defpackage.p2x;
import defpackage.php;
import defpackage.pjp;
import defpackage.pwy0;
import defpackage.pzt0;
import defpackage.q2x;
import defpackage.qhp;
import defpackage.qje;
import defpackage.qmp;
import defpackage.qx2;
import defpackage.r2x;
import defpackage.rhp;
import defpackage.rjp;
import defpackage.s2x;
import defpackage.scc;
import defpackage.sdc;
import defpackage.shp;
import defpackage.t2x;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tpk0;
import defpackage.ul51;
import defpackage.v2x;
import defpackage.vip;
import defpackage.vng;
import defpackage.w511;
import defpackage.wt11;
import defpackage.xhp;
import defpackage.xng0;
import defpackage.ygp;
import defpackage.zgp;
import defpackage.zuj0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.deeplinks.DeeplinkSource;
import ru.yandex.taxi.favorites.analytics.FavoritesAnalytics$IdType;
import ru.yandex.taxi.favorites.analytics.FavoritesAnalytics$TripButtonName;
import ru.yandex.taxi.fragment.favorites.list.FavoritesFragment;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;

/* loaded from: classes5.dex */
public final class f extends ad5 implements o1c {
    public final zuj0 A;
    public final ru.yandex.taxi.favorites.suggest.b B;
    public final aip C;
    public final qmp D;
    public final qx2 E;
    public final pwy0 F;
    public boolean G;
    public pzt0 H;
    public bjp I;
    public final ru.yandex.taxi.favorites.domain.e x;
    public final a y;
    public final n3h z;

    public f(ru.yandex.taxi.favorites.domain.e eVar, a aVar, n3h n3hVar, zuj0 zuj0Var, ru.yandex.taxi.favorites.suggest.b bVar, aip aipVar, qmp qmpVar, qx2 qx2Var, pwy0 pwy0Var) {
        super(vip.class);
        this.x = eVar;
        this.y = aVar;
        this.z = n3hVar;
        this.A = zuj0Var;
        this.B = bVar;
        this.C = aipVar;
        this.D = qmpVar;
        this.E = qx2Var;
        this.F = pwy0Var;
        this.I = bjp.h;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Kg(f fVar, ThemeType themeType, ContinuationImpl continuationImpl) {
        FavoritesPresenter$refresh$1 favoritesPresenter$refresh$1;
        int i;
        vip vipVar;
        fVar.getClass();
        if (continuationImpl instanceof FavoritesPresenter$refresh$1) {
            favoritesPresenter$refresh$1 = (FavoritesPresenter$refresh$1) continuationImpl;
            int i2 = favoritesPresenter$refresh$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                favoritesPresenter$refresh$1.label = i2 - Integer.MIN_VALUE;
                Object obj = favoritesPresenter$refresh$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = favoritesPresenter$refresh$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    vip vipVar2 = (vip) fVar.Dg();
                    bjp bjpVar = fVar.I;
                    favoritesPresenter$refresh$1.L$0 = null;
                    favoritesPresenter$refresh$1.L$1 = vipVar2;
                    favoritesPresenter$refresh$1.label = 1;
                    Object Qg = fVar.Qg(bjpVar, themeType, favoritesPresenter$refresh$1);
                    if (Qg == obj2) {
                        return obj2;
                    }
                    obj = Qg;
                    vipVar = vipVar2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    vipVar = (vip) favoritesPresenter$refresh$1.L$1;
                    kotlin.b.b(obj);
                }
                vipVar.render((rjp) obj);
                return zy11.a;
            }
        }
        favoritesPresenter$refresh$1 = new FavoritesPresenter$refresh$1(fVar, continuationImpl);
        Object obj3 = favoritesPresenter$refresh$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = favoritesPresenter$refresh$1.label;
        if (i != 0) {
        }
        vipVar.render((rjp) obj3);
        return zy11.a;
    }

    @Override // defpackage.zc5
    public final void Fg() {
        pzt0 pzt0Var = this.H;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
    }

    @Override // defpackage.zc5
    public final void Gg() {
        if (jl40.l(this.I, bjp.h) || this.G) {
            Pg();
        } else {
            tje.N(Jg(), null, null, new FavoritesPresenter$onResume$1(null, this), 3);
        }
    }

    @Override // defpackage.o1c
    public final void H9(FavoriteAddress favoriteAddress) {
        ((vip) Dg()).editFavoriteAddress(favoriteAddress);
    }

    @Override // defpackage.o1c
    public final void I5(nqs0 nqs0Var, tpk0 tpk0Var) {
        bhp bhpVar = nqs0Var instanceof bhp ? (bhp) nqs0Var : null;
        if (bhpVar == null) {
            return;
        }
        String str = tpk0Var.a;
        FavoritesAnalytics$IdType favoritesAnalytics$IdType = tpk0Var.b;
        FavoritesAnalytics$TripButtonName favoritesAnalytics$TripButtonName = tpk0Var.c;
        aip aipVar = this.C;
        aipVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("id", str);
        hashMap.put("id_type", favoritesAnalytics$IdType.getEventValue());
        hashMap.put("button_name", favoritesAnalytics$TripButtonName.getEventValue());
        aipVar.a.a("Favorites.Trip.Tapped", hashMap, 1, new HashMap());
        if (bhpVar instanceof ygp) {
            this.z.a(Uri.parse(((ygp) bhpVar).b), DeeplinkSource.UNSPECIFIED);
        } else if (bhpVar instanceof ahp) {
            ((vip) Dg()).showRideSettingsModal(tpk0Var.a, ((ahp) bhpVar).b);
        } else {
            if (bhpVar.equals(zgp.a)) {
                return;
            }
            w511.b();
        }
    }

    @Override // defpackage.o1c
    public final void Ia(PlaceType placeType) {
        ((vip) Dg()).addSuggestedAddress(placeType);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0068, code lost:
    
        if (r2 == (-1)) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0090, code lost:
    
        if (r2 == (-1)) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Lg(FavoriteAddress favoriteAddress) {
        int i;
        bjp bjpVar = this.I;
        ArrayList arrayList = bjpVar.d;
        PlaceType placeType = favoriteAddress.getPlaceType();
        int i2 = placeType == null ? -1 : ajp.a[placeType.ordinal()];
        int i3 = 0;
        if (i2 == 1) {
            ListIterator listIterator = arrayList.listIterator(arrayList.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    i = -1;
                    break;
                } else if (((FavoriteAddress) listIterator.previous()).getPlaceType() == PlaceType.HOME) {
                    i = listIterator.nextIndex();
                    break;
                }
            }
        } else if (i2 != 2) {
            i3 = arrayList.size();
        } else {
            ListIterator listIterator2 = arrayList.listIterator(arrayList.size());
            while (true) {
                if (!listIterator2.hasPrevious()) {
                    i = -1;
                    break;
                } else if (((FavoriteAddress) listIterator2.previous()).getPlaceType() == PlaceType.WORK) {
                    i = listIterator2.nextIndex();
                    break;
                }
            }
            if (i == -1) {
                ListIterator listIterator3 = arrayList.listIterator(arrayList.size());
                while (true) {
                    if (!listIterator3.hasPrevious()) {
                        i = -1;
                        break;
                    } else if (((FavoriteAddress) listIterator3.previous()).getPlaceType() == PlaceType.HOME) {
                        i = listIterator3.nextIndex();
                        break;
                    }
                }
            }
            i3 = i + 1;
        }
        arrayList.add(i3, favoriteAddress);
        bjpVar.a();
        tje.N(Jg(), null, null, new FavoritesPresenter$addNewFavorite$1(null, this), 3);
    }

    @Override // defpackage.o1c
    public final void Mb(g28 g28Var) {
        ((vip) Dg()).addFavoriteAddress(g28Var);
    }

    public final void Mg(FavoritesFragment favoritesFragment) {
        Bg(favoritesFragment);
        tje.N(Jg(), null, null, new FavoritesPresenter$attachView$1(this, favoritesFragment, null), 3);
        tje.N(Jg(), null, null, new FavoritesPresenter$attachView$2(null, this), 3);
    }

    public final UiStateDrawableWrapper Ng(PlaceType placeType, ThemeType themeType) {
        int i = cjp.b[placeType.ordinal()];
        return new UiStateDrawableWrapper(new wt11(themeType, placeType.name()), vng.t(i != 1 ? i != 2 ? izg0.ic_favorite_address_fallback : izg0.ic_suggested_favorite_work : izg0.ic_suggested_favorite_home, ((avj0) this.A).a));
    }

    public final UiStateDrawableWrapper Og(ThemeType themeType) {
        int i = dzg0.ic_plus;
        avj0 avj0Var = (avj0) this.A;
        Drawable t = vng.t(i, avj0Var.a);
        Drawable mutate = t != null ? t.mutate() : null;
        if (mutate != null) {
            mutate.setTint(qje.t(xng0.line, avj0Var.a));
        }
        return new UiStateDrawableWrapper(new wt11(themeType, "AddFavoriteAddressTrailImage"), mutate);
    }

    public final void Pg() {
        pzt0 pzt0Var = this.H;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.H = tje.N(Jg(), null, null, new FavoritesPresenter$loadAddresses$$inlined$safeCollectIn$1(com.yandex.go.coroutines.b.d(new e(new m0(kotlinx.coroutines.flow.e.s(new c(this.B.a(), this), com.yandex.go.coroutines.b.a), this.F.a(), FavoritesPresenter$loadAddresses$2.a), this), new FavoritesPresenter$loadAddresses$$inlined$start$1(2, null)), null, this), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02e3  */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Qg(bjp bjpVar, ThemeType themeType, ContinuationImpl continuationImpl) {
        FavoritesPresenter$prepareViewModel$1 favoritesPresenter$prepareViewModel$1;
        int i;
        ArrayList arrayList;
        shp shpVar;
        boolean z;
        ThemeType themeType2;
        Object d;
        ArrayList arrayList2;
        boolean z2;
        List list;
        e6v r2xVar;
        ArrayList arrayList3;
        Iterator it;
        List list2;
        Iterator it2;
        boolean z3;
        List list3;
        Iterator it3;
        boolean z4;
        boolean z5;
        ?? r14;
        String a;
        bjp bjpVar2 = bjpVar;
        if (continuationImpl instanceof FavoritesPresenter$prepareViewModel$1) {
            favoritesPresenter$prepareViewModel$1 = (FavoritesPresenter$prepareViewModel$1) continuationImpl;
            int i2 = favoritesPresenter$prepareViewModel$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                favoritesPresenter$prepareViewModel$1.label = i2 - Integer.MIN_VALUE;
                Object obj = favoritesPresenter$prepareViewModel$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = favoritesPresenter$prepareViewModel$1.label;
                Throwable th = null;
                boolean z6 = true;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (bjpVar2 != null) {
                        ((ul51) this.D).getClass();
                        arrayList = new ArrayList();
                        khp.a aVar = bjpVar2.b;
                        if (aVar == null) {
                            shpVar = null;
                            z = true;
                            themeType2 = themeType;
                            if (shpVar != null) {
                                list = EmptyList.a;
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                nhp nhpVar = shpVar.a;
                                arrayList4.add(new q2x(new p2x(nhpVar.a, nhpVar.c), nhpVar.b));
                                List<rhp> list4 = shpVar.b;
                                ArrayList arrayList5 = new ArrayList(tcc.n(list4, 10));
                                for (rhp rhpVar : list4) {
                                    if (rhpVar instanceof qhp) {
                                        qhp qhpVar = (qhp) rhpVar;
                                        r2xVar = new v2x(qhpVar.a, qhpVar.b);
                                    } else if (rhpVar instanceof php) {
                                        php phpVar = (php) rhpVar;
                                        r2xVar = new s2x(phpVar.a, phpVar.b);
                                    } else {
                                        if (!(rhpVar instanceof ohp)) {
                                            w511.b();
                                            return null;
                                        }
                                        r2xVar = new r2x(((ohp) rhpVar).a);
                                    }
                                    arrayList5.add(r2xVar);
                                }
                                arrayList4.addAll(arrayList5);
                                if (!arrayList4.isEmpty()) {
                                    arrayList4.add(new n2x(0));
                                }
                                list = arrayList4;
                            }
                            int i3 = 2;
                            int size = list.size() + 2;
                            arrayList.addAll(list);
                            String str = bjpVar2.a;
                            e81 e81Var = bjpVar2.c;
                            arrayList3 = bjpVar2.d;
                            arrayList.add(new q2x(new p2x(str, null), null));
                            PlaceType placeType = PlaceType.OTHER;
                            UiStateDrawableWrapper Ng = Ng(placeType, themeType2);
                            UiStateDrawableWrapper Og = Og(themeType2);
                            int i4 = kyh0.favorites_add_address;
                            avj0 avj0Var = (avj0) this.A;
                            arrayList.add(new l2x(Ng, Og, placeType, avj0Var.h(i4), z, true));
                            if (arrayList3 != null || !arrayList3.isEmpty()) {
                                it = arrayList3.iterator();
                                while (it.hasNext()) {
                                    if (((FavoriteAddress) it.next()).getPlaceType() == PlaceType.HOME) {
                                        break;
                                    }
                                }
                            }
                            PlaceType placeType2 = PlaceType.HOME;
                            arrayList.add(new l2x(Ng(placeType2, themeType2), Og(themeType2), placeType2, avj0Var.h(kyh0.add_home_address), z, true));
                            size = scc.f(arrayList) + 1;
                            list2 = bjpVar2.f;
                            if ((list2 instanceof Collection) || !list2.isEmpty()) {
                                it2 = list2.iterator();
                                while (it2.hasNext()) {
                                    if (((FavoriteAddress) it2.next()).getPlaceType() != PlaceType.HOME) {
                                        z3 = false;
                                        break;
                                    }
                                }
                            }
                            z3 = true;
                            int i5 = 0;
                            for (Object obj2 : bjpVar2.f) {
                                int i6 = i5 + 1;
                                if (i5 < 0) {
                                    Throwable th2 = th;
                                    scc.m();
                                    throw th2;
                                }
                                FavoriteAddress favoriteAddress = (FavoriteAddress) obj2;
                                if (i5 != scc.f(bjpVar2.f) || z3) {
                                    z4 = z;
                                    z5 = z6;
                                } else {
                                    z4 = z;
                                    z5 = false;
                                }
                                PlaceType placeType3 = favoriteAddress.getPlaceType();
                                if (placeType3 == null) {
                                    placeType3 = PlaceType.OTHER;
                                }
                                FavoriteAddressDatumType datumType = favoriteAddress.getDatumType();
                                int i7 = datumType == null ? -1 : cjp.a[datumType.ordinal()];
                                if (i7 != -1) {
                                    if (i7 == z6) {
                                        a = e81Var.b.a.a();
                                    } else {
                                        if (i7 != i3) {
                                            w511.b();
                                            return th;
                                        }
                                        a = e81Var.a.a.a();
                                    }
                                    r14 = a;
                                } else {
                                    r14 = th;
                                }
                                Throwable th3 = th;
                                boolean z7 = z6;
                                int i8 = size;
                                o2x o2xVar = new o2x(Ng(placeType3, themeType2), new UiStateDrawableWrapper(new wt11(themeType2, "OTHER"), vng.t(izg0.ic_three_vertical_dots, avj0Var.a)), favoriteAddress, z4, z5, r14);
                                z = z4;
                                arrayList.add(o2xVar);
                                if (favoriteAddress.getPlaceType() == PlaceType.HOME) {
                                    i8 = scc.f(arrayList) + 1;
                                }
                                size = i8;
                                th = th3;
                                i5 = i6;
                                z6 = z7;
                                i3 = 2;
                            }
                            Throwable th4 = th;
                            boolean z8 = z6;
                            int i9 = size;
                            list3 = bjpVar2.g;
                            if (!list3.isEmpty()) {
                                xhp xhpVar = (xhp) this.B.b.a.b();
                                arrayList.add(new t2x(d6z.Y(xhpVar, xhpVar.c)));
                            }
                            int i10 = 0;
                            for (Object obj3 : list3) {
                                int i11 = i10 + 1;
                                if (i10 < 0) {
                                    scc.m();
                                    throw th4;
                                }
                                arrayList.add(new m2x((g28) obj3, list3.size() + (-1) != i10 ? z8 : false));
                                i10 = i11;
                            }
                            if (arrayList3 != null || !arrayList3.isEmpty()) {
                                it3 = arrayList3.iterator();
                                while (it3.hasNext()) {
                                    if (((FavoriteAddress) it3.next()).getPlaceType() == PlaceType.WORK) {
                                        break;
                                    }
                                }
                            }
                            PlaceType placeType4 = PlaceType.WORK;
                            arrayList.add(i9, new l2x(Ng(placeType4, themeType2), Og(themeType2), placeType4, avj0Var.h(kyh0.add_work_address), z, (!bjpVar2.f.isEmpty() || z3) ? false : z8));
                            return new pjp(arrayList);
                        }
                        favoritesPresenter$prepareViewModel$1.L$0 = bjpVar2;
                        favoritesPresenter$prepareViewModel$1.L$1 = themeType;
                        favoritesPresenter$prepareViewModel$1.L$2 = arrayList;
                        favoritesPresenter$prepareViewModel$1.L$3 = null;
                        favoritesPresenter$prepareViewModel$1.Z$0 = true;
                        favoritesPresenter$prepareViewModel$1.label = 1;
                        d = this.y.d(aVar, favoritesPresenter$prepareViewModel$1);
                        if (d == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        arrayList2 = arrayList;
                        z2 = true;
                        themeType2 = themeType;
                    }
                    return ojp.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                boolean z9 = favoritesPresenter$prepareViewModel$1.Z$0;
                ?? r4 = (List) favoritesPresenter$prepareViewModel$1.L$2;
                themeType2 = (ThemeType) favoritesPresenter$prepareViewModel$1.L$1;
                bjp bjpVar3 = (bjp) favoritesPresenter$prepareViewModel$1.L$0;
                kotlin.b.b(obj);
                z2 = z9;
                bjpVar2 = bjpVar3;
                d = obj;
                arrayList2 = r4;
                shpVar = (shp) d;
                if (shpVar != null) {
                    z = z2;
                    arrayList = arrayList2;
                    if (shpVar != null) {
                    }
                    int i32 = 2;
                    int size2 = list.size() + 2;
                    arrayList.addAll(list);
                    String str2 = bjpVar2.a;
                    e81 e81Var2 = bjpVar2.c;
                    arrayList3 = bjpVar2.d;
                    arrayList.add(new q2x(new p2x(str2, null), null));
                    PlaceType placeType5 = PlaceType.OTHER;
                    UiStateDrawableWrapper Ng2 = Ng(placeType5, themeType2);
                    UiStateDrawableWrapper Og2 = Og(themeType2);
                    int i42 = kyh0.favorites_add_address;
                    avj0 avj0Var2 = (avj0) this.A;
                    arrayList.add(new l2x(Ng2, Og2, placeType5, avj0Var2.h(i42), z, true));
                    if (arrayList3 != null) {
                    }
                    it = arrayList3.iterator();
                    while (it.hasNext()) {
                    }
                    PlaceType placeType22 = PlaceType.HOME;
                    arrayList.add(new l2x(Ng(placeType22, themeType2), Og(themeType2), placeType22, avj0Var2.h(kyh0.add_home_address), z, true));
                    size2 = scc.f(arrayList) + 1;
                    list2 = bjpVar2.f;
                    if (list2 instanceof Collection) {
                    }
                    it2 = list2.iterator();
                    while (it2.hasNext()) {
                    }
                    z3 = true;
                    int i52 = 0;
                    while (r19.hasNext()) {
                    }
                    Throwable th42 = th;
                    boolean z82 = z6;
                    int i92 = size2;
                    list3 = bjpVar2.g;
                    if (!list3.isEmpty()) {
                    }
                    int i102 = 0;
                    while (r7.hasNext()) {
                    }
                    if (arrayList3 != null) {
                    }
                    it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                    }
                    PlaceType placeType42 = PlaceType.WORK;
                    arrayList.add(i92, new l2x(Ng(placeType42, themeType2), Og(themeType2), placeType42, avj0Var2.h(kyh0.add_work_address), z, (!bjpVar2.f.isEmpty() || z3) ? false : z82));
                    return new pjp(arrayList);
                }
                return ojp.a;
            }
        }
        favoritesPresenter$prepareViewModel$1 = new FavoritesPresenter$prepareViewModel$1(this, continuationImpl);
        Object obj4 = favoritesPresenter$prepareViewModel$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = favoritesPresenter$prepareViewModel$1.label;
        Throwable th5 = null;
        boolean z62 = true;
        if (i != 0) {
        }
        shpVar = (shp) d;
        if (shpVar != null) {
        }
        return ojp.a;
    }

    public final void Rg(FavoriteAddress favoriteAddress) {
        this.G = true;
        bjp bjpVar = this.I;
        bjpVar.d.removeIf(new sdc(5, new fdp(6, favoriteAddress)));
        bjpVar.a();
        tje.N(Jg(), null, null, new FavoritesPresenter$removeAddress$1(null, this), 3);
    }

    public final void Sg(String str, FavoriteAddress favoriteAddress) {
        this.G = true;
        bjp bjpVar = this.I;
        ArrayList arrayList = bjpVar.d;
        if (str != null) {
            Iterator it = arrayList.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (jl40.l(((FavoriteAddress) it.next()).getId(), str)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                arrayList.set(i, favoriteAddress);
                bjpVar.a();
            }
        }
        tje.N(Jg(), null, null, new FavoritesPresenter$updateAddress$1(null, this), 3);
    }

    @Override // defpackage.o1c
    public final void onPickedAddress(FavoriteAddress favoriteAddress) {
        ((vip) Dg()).pickFavoriteAddress(favoriteAddress);
    }
}
