package ru.yandex.taxi.favorites.address.impl.domain;

import com.yandex.go.address.models.FavoriteAddress;
import com.yandex.go.address.models.FavoriteAddressDatumType;
import com.yandex.go.address.models.PlaceType;
import defpackage.d6z;
import defpackage.e47;
import defpackage.g92;
import defpackage.n3c0;
import defpackage.ny61;
import defpackage.t17;
import defpackage.tdp;
import defpackage.tu21;
import defpackage.uep;
import defpackage.xj50;
import defpackage.ydp;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public final class b {
    public final ru.yandex.taxi.favorites.address.impl.data.b a;
    public final t17 b;
    public final ru.yandex.taxi.favorites.address.impl.factory.a c;
    public final ru.yandex.taxi.favorites.address.api.experiment.a d;

    public b(ru.yandex.taxi.favorites.address.impl.data.b bVar, t17 t17Var, ru.yandex.taxi.favorites.address.impl.factory.a aVar, ru.yandex.taxi.favorites.address.api.experiment.a aVar2) {
        this.a = bVar;
        this.b = t17Var;
        this.c = aVar;
        this.d = aVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00fe, code lost:
    
        if (r4 == r3) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ydp ydpVar, ContinuationImpl continuationImpl) {
        FavoriteLoadAddressInteractor$loadAddress$1 favoriteLoadAddressInteractor$loadAddress$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        ydp ydpVar2;
        Object b;
        tdp tdpVar;
        FavoriteAddress favoriteAddress;
        FavoriteAddressDatumType datumType;
        FavoriteAddressDatumType favoriteAddressDatumType;
        String name;
        String str;
        String Y;
        Object a;
        boolean z;
        e47 a2;
        boolean z2;
        Object c;
        String str2;
        FavoriteAddress favoriteAddress2;
        String str3;
        FavoriteAddress favoriteAddress3;
        tu21 tu21Var;
        String str4;
        boolean z3;
        int i2;
        Object a3;
        n3c0 n3c0Var;
        tu21 tu21Var2;
        String str5;
        e47 e47Var;
        int i3;
        if (continuationImpl instanceof FavoriteLoadAddressInteractor$loadAddress$1) {
            favoriteLoadAddressInteractor$loadAddress$1 = (FavoriteLoadAddressInteractor$loadAddress$1) continuationImpl;
            int i4 = favoriteLoadAddressInteractor$loadAddress$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                favoriteLoadAddressInteractor$loadAddress$1.label = i4 - Integer.MIN_VALUE;
                Object obj = favoriteLoadAddressInteractor$loadAddress$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = favoriteLoadAddressInteractor$loadAddress$1.label;
                ru.yandex.taxi.favorites.address.impl.data.b bVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ydpVar2 = ydpVar;
                    favoriteLoadAddressInteractor$loadAddress$1.L$0 = ydpVar2;
                    favoriteLoadAddressInteractor$loadAddress$1.label = 1;
                    b = this.d.a.b(favoriteLoadAddressInteractor$loadAddress$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            z = favoriteLoadAddressInteractor$loadAddress$1.Z$0;
                            Y = (String) favoriteLoadAddressInteractor$loadAddress$1.L$5;
                            str = (String) favoriteLoadAddressInteractor$loadAddress$1.L$4;
                            favoriteAddressDatumType = (FavoriteAddressDatumType) favoriteLoadAddressInteractor$loadAddress$1.L$3;
                            favoriteAddress = (FavoriteAddress) favoriteLoadAddressInteractor$loadAddress$1.L$2;
                            tdpVar = (tdp) favoriteLoadAddressInteractor$loadAddress$1.L$1;
                            kotlin.b.b(obj);
                            FavoriteAddressDatumType favoriteAddressDatumType2 = favoriteAddressDatumType;
                            FavoriteAddress favoriteAddress4 = favoriteAddress;
                            tu21 tu21Var3 = (tu21) obj;
                            String Y2 = d6z.Y(tdpVar, tdpVar.i.c);
                            FavoriteAddress b2 = FavoriteAddress.b(favoriteAddress4, null, 0, null, favoriteAddressDatumType2, null, 4194239);
                            a2 = this.b.a(str, null);
                            favoriteLoadAddressInteractor$loadAddress$1.L$0 = null;
                            favoriteLoadAddressInteractor$loadAddress$1.L$1 = null;
                            favoriteLoadAddressInteractor$loadAddress$1.L$2 = favoriteAddress4;
                            favoriteLoadAddressInteractor$loadAddress$1.L$3 = null;
                            favoriteLoadAddressInteractor$loadAddress$1.L$4 = null;
                            favoriteLoadAddressInteractor$loadAddress$1.L$5 = Y;
                            favoriteLoadAddressInteractor$loadAddress$1.L$6 = tu21Var3;
                            favoriteLoadAddressInteractor$loadAddress$1.L$7 = str;
                            favoriteLoadAddressInteractor$loadAddress$1.L$8 = Y2;
                            favoriteLoadAddressInteractor$loadAddress$1.L$9 = b2;
                            favoriteLoadAddressInteractor$loadAddress$1.L$10 = a2;
                            favoriteLoadAddressInteractor$loadAddress$1.Z$0 = z;
                            z2 = false;
                            favoriteLoadAddressInteractor$loadAddress$1.I$0 = 0;
                            favoriteLoadAddressInteractor$loadAddress$1.label = 3;
                            c = bVar.c(favoriteAddress4, favoriteLoadAddressInteractor$loadAddress$1);
                            if (c != coroutineSingletons) {
                                str2 = Y;
                                favoriteAddress2 = favoriteAddress4;
                                str3 = str;
                                favoriteAddress3 = b2;
                                tu21Var = tu21Var3;
                                obj = c;
                                str4 = Y2;
                                z3 = z;
                                i2 = 0;
                                n3c0 n3c0Var2 = (n3c0) obj;
                                favoriteLoadAddressInteractor$loadAddress$1.L$0 = null;
                                favoriteLoadAddressInteractor$loadAddress$1.L$1 = null;
                                favoriteLoadAddressInteractor$loadAddress$1.L$2 = null;
                                favoriteLoadAddressInteractor$loadAddress$1.L$3 = null;
                                favoriteLoadAddressInteractor$loadAddress$1.L$4 = null;
                                favoriteLoadAddressInteractor$loadAddress$1.L$5 = str2;
                                favoriteLoadAddressInteractor$loadAddress$1.L$6 = tu21Var;
                                favoriteLoadAddressInteractor$loadAddress$1.L$7 = str3;
                                favoriteLoadAddressInteractor$loadAddress$1.L$8 = str4;
                                favoriteLoadAddressInteractor$loadAddress$1.L$9 = favoriteAddress3;
                                favoriteLoadAddressInteractor$loadAddress$1.L$10 = a2;
                                favoriteLoadAddressInteractor$loadAddress$1.L$11 = n3c0Var2;
                                favoriteLoadAddressInteractor$loadAddress$1.Z$0 = z3;
                                favoriteLoadAddressInteractor$loadAddress$1.I$0 = i2;
                                favoriteLoadAddressInteractor$loadAddress$1.label = 4;
                                a3 = this.c.a(favoriteAddress2, favoriteLoadAddressInteractor$loadAddress$1);
                                if (a3 != coroutineSingletons) {
                                }
                            }
                            return coroutineSingletons;
                        }
                        if (i != 3) {
                            if (i != 4) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            i3 = favoriteLoadAddressInteractor$loadAddress$1.I$0;
                            n3c0 n3c0Var3 = (n3c0) favoriteLoadAddressInteractor$loadAddress$1.L$11;
                            e47 e47Var2 = (e47) favoriteLoadAddressInteractor$loadAddress$1.L$10;
                            favoriteAddress3 = (FavoriteAddress) favoriteLoadAddressInteractor$loadAddress$1.L$9;
                            str4 = (String) favoriteLoadAddressInteractor$loadAddress$1.L$8;
                            str3 = (String) favoriteLoadAddressInteractor$loadAddress$1.L$7;
                            tu21 tu21Var4 = (tu21) favoriteLoadAddressInteractor$loadAddress$1.L$6;
                            String str6 = (String) favoriteLoadAddressInteractor$loadAddress$1.L$5;
                            kotlin.b.b(obj);
                            n3c0Var = n3c0Var3;
                            e47Var = e47Var2;
                            tu21Var2 = tu21Var4;
                            str5 = str6;
                            z2 = false;
                            return new g92(2, new uep(str5, tu21Var2, str3, str4, favoriteAddress3, e47Var, i3 == 0 ? true : z2, n3c0Var, (xj50) obj));
                        }
                        i2 = favoriteLoadAddressInteractor$loadAddress$1.I$0;
                        boolean z4 = favoriteLoadAddressInteractor$loadAddress$1.Z$0;
                        e47 e47Var3 = (e47) favoriteLoadAddressInteractor$loadAddress$1.L$10;
                        FavoriteAddress favoriteAddress5 = (FavoriteAddress) favoriteLoadAddressInteractor$loadAddress$1.L$9;
                        String str7 = (String) favoriteLoadAddressInteractor$loadAddress$1.L$8;
                        String str8 = (String) favoriteLoadAddressInteractor$loadAddress$1.L$7;
                        tu21 tu21Var5 = (tu21) favoriteLoadAddressInteractor$loadAddress$1.L$6;
                        String str9 = (String) favoriteLoadAddressInteractor$loadAddress$1.L$5;
                        favoriteAddress2 = (FavoriteAddress) favoriteLoadAddressInteractor$loadAddress$1.L$2;
                        kotlin.b.b(obj);
                        a2 = e47Var3;
                        str3 = str8;
                        z3 = z4;
                        str4 = str7;
                        str2 = str9;
                        favoriteAddress3 = favoriteAddress5;
                        tu21Var = tu21Var5;
                        z2 = false;
                        n3c0 n3c0Var22 = (n3c0) obj;
                        favoriteLoadAddressInteractor$loadAddress$1.L$0 = null;
                        favoriteLoadAddressInteractor$loadAddress$1.L$1 = null;
                        favoriteLoadAddressInteractor$loadAddress$1.L$2 = null;
                        favoriteLoadAddressInteractor$loadAddress$1.L$3 = null;
                        favoriteLoadAddressInteractor$loadAddress$1.L$4 = null;
                        favoriteLoadAddressInteractor$loadAddress$1.L$5 = str2;
                        favoriteLoadAddressInteractor$loadAddress$1.L$6 = tu21Var;
                        favoriteLoadAddressInteractor$loadAddress$1.L$7 = str3;
                        favoriteLoadAddressInteractor$loadAddress$1.L$8 = str4;
                        favoriteLoadAddressInteractor$loadAddress$1.L$9 = favoriteAddress3;
                        favoriteLoadAddressInteractor$loadAddress$1.L$10 = a2;
                        favoriteLoadAddressInteractor$loadAddress$1.L$11 = n3c0Var22;
                        favoriteLoadAddressInteractor$loadAddress$1.Z$0 = z3;
                        favoriteLoadAddressInteractor$loadAddress$1.I$0 = i2;
                        favoriteLoadAddressInteractor$loadAddress$1.label = 4;
                        a3 = this.c.a(favoriteAddress2, favoriteLoadAddressInteractor$loadAddress$1);
                        if (a3 != coroutineSingletons) {
                            n3c0Var = n3c0Var22;
                            tu21Var2 = tu21Var;
                            str5 = str2;
                            e47Var = a2;
                            obj = a3;
                            i3 = i2;
                            return new g92(2, new uep(str5, tu21Var2, str3, str4, favoriteAddress3, e47Var, i3 == 0 ? true : z2, n3c0Var, (xj50) obj));
                        }
                        return coroutineSingletons;
                    }
                    ydp ydpVar3 = (ydp) favoriteLoadAddressInteractor$loadAddress$1.L$0;
                    kotlin.b.b(obj);
                    b = obj;
                    ydpVar2 = ydpVar3;
                }
                tdpVar = (tdp) b;
                favoriteAddress = ydpVar2.a;
                boolean z5 = ydpVar2.b;
                datumType = favoriteAddress.getDatumType();
                if (datumType == null) {
                    datumType = FavoriteAddressDatumType.GEO_POINT;
                }
                favoriteAddressDatumType = datumType;
                name = favoriteAddress.getName();
                if (name == null) {
                    name = bVar.b(favoriteAddress.getPlaceType());
                }
                str = name;
                Y = (favoriteAddressDatumType == FavoriteAddressDatumType.GEO_POINT || !z5) ? d6z.Y(tdpVar, tdpVar.i.b) : d6z.Y(tdpVar, tdpVar.i.a);
                PlaceType placeType = favoriteAddress.getPlaceType();
                favoriteLoadAddressInteractor$loadAddress$1.L$0 = null;
                favoriteLoadAddressInteractor$loadAddress$1.L$1 = tdpVar;
                favoriteLoadAddressInteractor$loadAddress$1.L$2 = favoriteAddress;
                favoriteLoadAddressInteractor$loadAddress$1.L$3 = favoriteAddressDatumType;
                favoriteLoadAddressInteractor$loadAddress$1.L$4 = str;
                favoriteLoadAddressInteractor$loadAddress$1.L$5 = Y;
                favoriteLoadAddressInteractor$loadAddress$1.Z$0 = z5;
                favoriteLoadAddressInteractor$loadAddress$1.label = 2;
                a = bVar.a(placeType, favoriteLoadAddressInteractor$loadAddress$1);
                if (a != coroutineSingletons) {
                    z = z5;
                    obj = a;
                    FavoriteAddressDatumType favoriteAddressDatumType22 = favoriteAddressDatumType;
                    FavoriteAddress favoriteAddress42 = favoriteAddress;
                    tu21 tu21Var32 = (tu21) obj;
                    String Y22 = d6z.Y(tdpVar, tdpVar.i.c);
                    FavoriteAddress b22 = FavoriteAddress.b(favoriteAddress42, null, 0, null, favoriteAddressDatumType22, null, 4194239);
                    a2 = this.b.a(str, null);
                    favoriteLoadAddressInteractor$loadAddress$1.L$0 = null;
                    favoriteLoadAddressInteractor$loadAddress$1.L$1 = null;
                    favoriteLoadAddressInteractor$loadAddress$1.L$2 = favoriteAddress42;
                    favoriteLoadAddressInteractor$loadAddress$1.L$3 = null;
                    favoriteLoadAddressInteractor$loadAddress$1.L$4 = null;
                    favoriteLoadAddressInteractor$loadAddress$1.L$5 = Y;
                    favoriteLoadAddressInteractor$loadAddress$1.L$6 = tu21Var32;
                    favoriteLoadAddressInteractor$loadAddress$1.L$7 = str;
                    favoriteLoadAddressInteractor$loadAddress$1.L$8 = Y22;
                    favoriteLoadAddressInteractor$loadAddress$1.L$9 = b22;
                    favoriteLoadAddressInteractor$loadAddress$1.L$10 = a2;
                    favoriteLoadAddressInteractor$loadAddress$1.Z$0 = z;
                    z2 = false;
                    favoriteLoadAddressInteractor$loadAddress$1.I$0 = 0;
                    favoriteLoadAddressInteractor$loadAddress$1.label = 3;
                    c = bVar.c(favoriteAddress42, favoriteLoadAddressInteractor$loadAddress$1);
                    if (c != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
        }
        favoriteLoadAddressInteractor$loadAddress$1 = new FavoriteLoadAddressInteractor$loadAddress$1(this, continuationImpl);
        Object obj2 = favoriteLoadAddressInteractor$loadAddress$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = favoriteLoadAddressInteractor$loadAddress$1.label;
        ru.yandex.taxi.favorites.address.impl.data.b bVar2 = this.a;
        if (i != 0) {
        }
        tdpVar = (tdp) b;
        favoriteAddress = ydpVar2.a;
        boolean z52 = ydpVar2.b;
        datumType = favoriteAddress.getDatumType();
        if (datumType == null) {
        }
        favoriteAddressDatumType = datumType;
        name = favoriteAddress.getName();
        if (name == null) {
        }
        str = name;
        Y = (favoriteAddressDatumType == FavoriteAddressDatumType.GEO_POINT || !z52) ? d6z.Y(tdpVar, tdpVar.i.b) : d6z.Y(tdpVar, tdpVar.i.a);
        PlaceType placeType2 = favoriteAddress.getPlaceType();
        favoriteLoadAddressInteractor$loadAddress$1.L$0 = null;
        favoriteLoadAddressInteractor$loadAddress$1.L$1 = tdpVar;
        favoriteLoadAddressInteractor$loadAddress$1.L$2 = favoriteAddress;
        favoriteLoadAddressInteractor$loadAddress$1.L$3 = favoriteAddressDatumType;
        favoriteLoadAddressInteractor$loadAddress$1.L$4 = str;
        favoriteLoadAddressInteractor$loadAddress$1.L$5 = Y;
        favoriteLoadAddressInteractor$loadAddress$1.Z$0 = z52;
        favoriteLoadAddressInteractor$loadAddress$1.label = 2;
        a = bVar2.a(placeType2, favoriteLoadAddressInteractor$loadAddress$1);
        if (a != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
