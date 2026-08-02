package ru.yandex.taxi.mappers;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.FavoriteAddress;
import com.yandex.go.address.models.PlaceType;
import defpackage.avj0;
import defpackage.bvv;
import defpackage.cvv;
import defpackage.d6z;
import defpackage.eip;
import defpackage.fe0;
import defpackage.ffp;
import defpackage.ge0;
import defpackage.h0w;
import defpackage.jl40;
import defpackage.kyh0;
import defpackage.ny61;
import defpackage.qd0;
import defpackage.tcc;
import defpackage.ud0;
import defpackage.uw4;
import defpackage.xyg0;
import defpackage.ze0;
import defpackage.zuj0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.model.FavoritesCategoryModel$Category;

/* loaded from: classes6.dex */
public final class a {
    public final bvv a;
    public final ze0 b;
    public final h0w c;
    public final ru.yandex.taxi.favorites.data.repo.a d;

    public a(bvv bvvVar, ze0 ze0Var, h0w h0wVar, fe0 fe0Var, ru.yandex.taxi.favorites.data.repo.a aVar) {
        this.a = bvvVar;
        this.b = ze0Var;
        this.c = h0wVar;
        this.d = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Address address, ContinuationImpl continuationImpl) {
        AddFavoritesScreenMapper$mapForInitAddress$1 addFavoritesScreenMapper$mapForInitAddress$1;
        int i;
        String str;
        String str2;
        Object c;
        cvv cvvVar;
        ffp ffpVar;
        Iterator it;
        Object obj;
        Object obj2;
        boolean z;
        boolean isEmpty;
        List I;
        List list;
        boolean z2;
        boolean z3;
        boolean z4;
        eip eipVar;
        if (continuationImpl instanceof AddFavoritesScreenMapper$mapForInitAddress$1) {
            addFavoritesScreenMapper$mapForInitAddress$1 = (AddFavoritesScreenMapper$mapForInitAddress$1) continuationImpl;
            int i2 = addFavoritesScreenMapper$mapForInitAddress$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                addFavoritesScreenMapper$mapForInitAddress$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = addFavoritesScreenMapper$mapForInitAddress$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = addFavoritesScreenMapper$mapForInitAddress$1.label;
                ze0 ze0Var = this.b;
                String str3 = null;
                if (i != 0) {
                    b.b(obj3);
                    bvv bvvVar = this.a;
                    if (bvvVar.f) {
                        uw4 uw4Var = (uw4) ze0Var;
                        ud0 ud0Var = uw4Var.a;
                        String b = uw4Var.b();
                        qd0 a = ud0Var.a();
                        qd0.a c2 = a.c(b);
                        String Y = c2 != null ? d6z.Y(a, c2.getH()) : null;
                        str = Y != null ? Y : "";
                        str2 = address.getAddress().e;
                    } else {
                        String str4 = address.getAddress().f;
                        if (str4 == null) {
                            str4 = "";
                        }
                        String str5 = address.getAddress().g;
                        str = str4;
                        str2 = str5 != null ? str5 : "";
                    }
                    cvv d = ((uw4) ze0Var).d(bvvVar);
                    addFavoritesScreenMapper$mapForInitAddress$1.L$0 = null;
                    addFavoritesScreenMapper$mapForInitAddress$1.L$1 = str;
                    addFavoritesScreenMapper$mapForInitAddress$1.L$2 = str2;
                    addFavoritesScreenMapper$mapForInitAddress$1.L$3 = d;
                    addFavoritesScreenMapper$mapForInitAddress$1.label = 1;
                    c = this.d.c(false, addFavoritesScreenMapper$mapForInitAddress$1);
                    if (c == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    cvvVar = d;
                    obj3 = c;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cvvVar = (cvv) addFavoritesScreenMapper$mapForInitAddress$1.L$3;
                    str2 = (String) addFavoritesScreenMapper$mapForInitAddress$1.L$2;
                    str = (String) addFavoritesScreenMapper$mapForInitAddress$1.L$1;
                    b.b(obj3);
                }
                String str6 = str2;
                String str7 = str;
                ffpVar = (ffp) obj3;
                if (ffpVar != null || (r1 = ffpVar.a) == null) {
                    Iterable iterable = EmptyList.a;
                }
                Iterable iterable2 = iterable;
                it = iterable2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((FavoriteAddress) obj).getPlaceType() == PlaceType.HOME) {
                        break;
                    }
                }
                boolean z5 = false;
                if (((FavoriteAddress) obj) != null) {
                    Iterator it2 = iterable2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it2.next();
                        if (((FavoriteAddress) obj2).getPlaceType() == PlaceType.WORK) {
                            break;
                        }
                    }
                    if (((FavoriteAddress) obj2) != null) {
                        z = true;
                        List list2 = cvvVar.c;
                        isEmpty = list2.isEmpty();
                        List list3 = list2;
                        if (isEmpty) {
                            ArrayList arrayList = new ArrayList(tcc.n(iterable2, 10));
                            Iterator it3 = iterable2.iterator();
                            while (it3.hasNext()) {
                                arrayList.add(((FavoriteAddress) it3.next()).getPlaceType());
                            }
                            List I2 = kotlin.collections.a.I(arrayList);
                            PlaceType[] values = PlaceType.values();
                            ArrayList arrayList2 = new ArrayList();
                            for (PlaceType placeType : values) {
                                if (!I2.contains(placeType)) {
                                    arrayList2.add(placeType);
                                }
                            }
                            ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
                            Iterator it4 = arrayList2.iterator();
                            while (it4.hasNext()) {
                                arrayList3.add(((PlaceType) it4.next()).name().toLowerCase(Locale.ROOT));
                            }
                            ArrayList arrayList4 = new ArrayList(arrayList3);
                            arrayList4.add(0, "other");
                            list3 = arrayList4;
                        }
                        h0w h0wVar = this.c;
                        zuj0 zuj0Var = (zuj0) h0wVar.c;
                        List<String> list4 = list3;
                        ArrayList arrayList5 = new ArrayList(tcc.n(list4, 10));
                        for (String str8 : list4) {
                            if (jl40.l(str8, "home")) {
                                eipVar = new eip(FavoritesCategoryModel$Category.HOME, ((avj0) zuj0Var).h(kyh0.favorite_home), Integer.valueOf(xyg0.ic_home), z5);
                            } else if (jl40.l(str8, "work")) {
                                eipVar = new eip(FavoritesCategoryModel$Category.WORK, ((avj0) zuj0Var).h(kyh0.favorite_work), Integer.valueOf(xyg0.ic_work), z5);
                            } else {
                                FavoritesCategoryModel$Category favoritesCategoryModel$Category = FavoritesCategoryModel$Category.NEW;
                                uw4 uw4Var2 = (uw4) ((ze0) h0wVar.b);
                                ud0 ud0Var2 = uw4Var2.a;
                                String b2 = uw4Var2.b();
                                qd0 a2 = ud0Var2.a();
                                qd0.a c3 = a2.c(b2);
                                eipVar = new eip(favoritesCategoryModel$Category, ud0Var2.b(c3 != null ? d6z.Y(a2, c3.e) : str3, ((avj0) ud0Var2.a).h(kyh0.add_favorites_screen_new_fav_button)), Integer.valueOf(xyg0.ic_add_favorites), z);
                            }
                            arrayList5.add(eipVar);
                            z5 = false;
                            str3 = null;
                        }
                        I = kotlin.collections.a.I(arrayList5);
                        if (I.size() == 1 || ((eip) kotlin.collections.a.P(I)).a != FavoritesCategoryModel$Category.NEW) {
                            list = I;
                            if (z) {
                                z2 = true;
                                z3 = true;
                            } else {
                                z2 = false;
                                z3 = false;
                            }
                            z4 = false;
                        } else {
                            eip eipVar2 = (eip) kotlin.collections.a.P(I);
                            list = Collections.singletonList(new eip(eipVar2.a, eipVar2.b, eipVar2.c, true));
                            z2 = true;
                            z3 = true;
                            z4 = true;
                        }
                        uw4 uw4Var3 = (uw4) ze0Var;
                        ud0 ud0Var3 = uw4Var3.a;
                        String b3 = uw4Var3.b();
                        qd0 a3 = ud0Var3.a();
                        qd0.a c4 = a3.c(b3);
                        String b4 = ud0Var3.b(c4 != null ? d6z.Y(a3, c4.b) : null, ((avj0) ud0Var3.a).h(kyh0.add_favorites_screen_title));
                        String str9 = cvvVar.a;
                        String b5 = uw4Var3.b();
                        qd0 a4 = ud0Var3.a();
                        qd0.a c5 = a4.c(b5);
                        String b6 = ud0Var3.b(c5 != null ? d6z.Y(a4, c5.c) : null, ((avj0) ud0Var3.a).h(kyh0.add_favorites_screen_save_button));
                        String e = uw4Var3.e();
                        String b7 = uw4Var3.b();
                        qd0 a5 = ud0Var3.a();
                        qd0.a c6 = a5.c(b7);
                        return new ge0(b4, str9, str7, str6, b6, e, ud0Var3.b(c6 != null ? d6z.Y(a5, c6.f) : null, ((avj0) ud0Var3.a).h(kyh0.add_favorites_screen_placeholder)), list, z2, z3, z4, 2048);
                    }
                }
                z = false;
                List list22 = cvvVar.c;
                isEmpty = list22.isEmpty();
                List list32 = list22;
                if (isEmpty) {
                }
                h0w h0wVar2 = this.c;
                zuj0 zuj0Var2 = (zuj0) h0wVar2.c;
                List<String> list42 = list32;
                ArrayList arrayList52 = new ArrayList(tcc.n(list42, 10));
                while (r8.hasNext()) {
                }
                I = kotlin.collections.a.I(arrayList52);
                if (I.size() == 1) {
                }
                list = I;
                if (z) {
                }
                z4 = false;
                uw4 uw4Var32 = (uw4) ze0Var;
                ud0 ud0Var32 = uw4Var32.a;
                String b32 = uw4Var32.b();
                qd0 a32 = ud0Var32.a();
                qd0.a c42 = a32.c(b32);
                String b42 = ud0Var32.b(c42 != null ? d6z.Y(a32, c42.b) : null, ((avj0) ud0Var32.a).h(kyh0.add_favorites_screen_title));
                String str92 = cvvVar.a;
                String b52 = uw4Var32.b();
                qd0 a42 = ud0Var32.a();
                qd0.a c52 = a42.c(b52);
                String b62 = ud0Var32.b(c52 != null ? d6z.Y(a42, c52.c) : null, ((avj0) ud0Var32.a).h(kyh0.add_favorites_screen_save_button));
                String e2 = uw4Var32.e();
                String b72 = uw4Var32.b();
                qd0 a52 = ud0Var32.a();
                qd0.a c62 = a52.c(b72);
                return new ge0(b42, str92, str7, str6, b62, e2, ud0Var32.b(c62 != null ? d6z.Y(a52, c62.f) : null, ((avj0) ud0Var32.a).h(kyh0.add_favorites_screen_placeholder)), list, z2, z3, z4, 2048);
            }
        }
        addFavoritesScreenMapper$mapForInitAddress$1 = new AddFavoritesScreenMapper$mapForInitAddress$1(this, continuationImpl);
        Object obj32 = addFavoritesScreenMapper$mapForInitAddress$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = addFavoritesScreenMapper$mapForInitAddress$1.label;
        ze0 ze0Var2 = this.b;
        String str32 = null;
        if (i != 0) {
        }
        String str62 = str2;
        String str72 = str;
        ffpVar = (ffp) obj32;
        if (ffpVar != null) {
        }
        Iterable iterable3 = EmptyList.a;
        Iterable iterable22 = iterable3;
        it = iterable22.iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        boolean z52 = false;
        if (((FavoriteAddress) obj) != null) {
        }
        z = false;
        List list222 = cvvVar.c;
        isEmpty = list222.isEmpty();
        List list322 = list222;
        if (isEmpty) {
        }
        h0w h0wVar22 = this.c;
        zuj0 zuj0Var22 = (zuj0) h0wVar22.c;
        List<String> list422 = list322;
        ArrayList arrayList522 = new ArrayList(tcc.n(list422, 10));
        while (r8.hasNext()) {
        }
        I = kotlin.collections.a.I(arrayList522);
        if (I.size() == 1) {
        }
        list = I;
        if (z) {
        }
        z4 = false;
        uw4 uw4Var322 = (uw4) ze0Var2;
        ud0 ud0Var322 = uw4Var322.a;
        String b322 = uw4Var322.b();
        qd0 a322 = ud0Var322.a();
        qd0.a c422 = a322.c(b322);
        String b422 = ud0Var322.b(c422 != null ? d6z.Y(a322, c422.b) : null, ((avj0) ud0Var322.a).h(kyh0.add_favorites_screen_title));
        String str922 = cvvVar.a;
        String b522 = uw4Var322.b();
        qd0 a422 = ud0Var322.a();
        qd0.a c522 = a422.c(b522);
        String b622 = ud0Var322.b(c522 != null ? d6z.Y(a422, c522.c) : null, ((avj0) ud0Var322.a).h(kyh0.add_favorites_screen_save_button));
        String e22 = uw4Var322.e();
        String b722 = uw4Var322.b();
        qd0 a522 = ud0Var322.a();
        qd0.a c622 = a522.c(b722);
        return new ge0(b422, str922, str72, str62, b622, e22, ud0Var322.b(c622 != null ? d6z.Y(a522, c622.f) : null, ((avj0) ud0Var322.a).h(kyh0.add_favorites_screen_placeholder)), list, z2, z3, z4, 2048);
    }
}
