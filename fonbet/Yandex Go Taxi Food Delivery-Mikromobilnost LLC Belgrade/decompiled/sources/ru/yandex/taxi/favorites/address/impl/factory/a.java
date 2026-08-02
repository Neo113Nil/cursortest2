package ru.yandex.taxi.favorites.address.impl.factory;

import com.yandex.go.address.models.FavoriteAddress;
import defpackage.bpl0;
import defpackage.d6z;
import defpackage.e47;
import defpackage.ny61;
import defpackage.su21;
import defpackage.tdp;
import defpackage.tu21;
import defpackage.vu30;
import defpackage.wj50;
import defpackage.xj50;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public final class a {
    public final ru.yandex.taxi.favorites.address.impl.data.a a;
    public final ru.yandex.taxi.favorites.address.api.experiment.a b;

    public a(ru.yandex.taxi.favorites.address.impl.data.a aVar, ru.yandex.taxi.favorites.address.api.experiment.a aVar2) {
        this.a = aVar;
        this.b = aVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0050, code lost:
    
        if (r15 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(FavoriteAddress favoriteAddress, ContinuationImpl continuationImpl) {
        NearbyUserplaceStateFactory$getNearbyUserplaceState$1 nearbyUserplaceStateFactory$getNearbyUserplaceState$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Serializable b;
        tdp tdpVar;
        bpl0 b2;
        wj50 wj50Var;
        if (continuationImpl instanceof NearbyUserplaceStateFactory$getNearbyUserplaceState$1) {
            nearbyUserplaceStateFactory$getNearbyUserplaceState$1 = (NearbyUserplaceStateFactory$getNearbyUserplaceState$1) continuationImpl;
            int i2 = nearbyUserplaceStateFactory$getNearbyUserplaceState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nearbyUserplaceStateFactory$getNearbyUserplaceState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = nearbyUserplaceStateFactory$getNearbyUserplaceState$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = nearbyUserplaceStateFactory$getNearbyUserplaceState$1.label;
                if (i != 0) {
                    b.b(obj);
                    nearbyUserplaceStateFactory$getNearbyUserplaceState$1.L$0 = favoriteAddress;
                    nearbyUserplaceStateFactory$getNearbyUserplaceState$1.label = 1;
                    obj = this.b.a.b(nearbyUserplaceStateFactory$getNearbyUserplaceState$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        tdpVar = (tdp) nearbyUserplaceStateFactory$getNearbyUserplaceState$1.L$1;
                        b.b(obj);
                        ArrayList arrayList = new ArrayList();
                        for (FavoriteAddress favoriteAddress2 : (List) obj) {
                            String name = favoriteAddress2.getName();
                            if (name == null) {
                                wj50Var = null;
                            } else {
                                String emoji = favoriteAddress2.getEmoji();
                                if (!tdpVar.c) {
                                    emoji = null;
                                }
                                wj50Var = new wj50(emoji != null ? new tu21(emoji) : new su21(favoriteAddress2.getImageTag()), name, favoriteAddress2);
                            }
                            if (wj50Var != null) {
                                arrayList.add(wj50Var);
                            }
                        }
                        b2 = com.yandex.go.design.compose.list.a.b(arrayList, new vu30(8));
                        if (!b2.a.isEmpty()) {
                            return null;
                        }
                        tdp.b bVar = tdpVar.j;
                        return new xj50(d6z.Y(tdpVar, bVar.a), b2, 0, new e47(d6z.Y(tdpVar, bVar.b), true), new e47(d6z.Y(tdpVar, bVar.c), true));
                    }
                    favoriteAddress = (FavoriteAddress) nearbyUserplaceStateFactory$getNearbyUserplaceState$1.L$0;
                    b.b(obj);
                }
                tdp tdpVar2 = (tdp) obj;
                nearbyUserplaceStateFactory$getNearbyUserplaceState$1.L$0 = null;
                nearbyUserplaceStateFactory$getNearbyUserplaceState$1.L$1 = tdpVar2;
                nearbyUserplaceStateFactory$getNearbyUserplaceState$1.label = 2;
                b = this.a.b(favoriteAddress.getPoint(), tdpVar2.h, nearbyUserplaceStateFactory$getNearbyUserplaceState$1);
                if (b != coroutineSingletons) {
                    obj = b;
                    tdpVar = tdpVar2;
                    ArrayList arrayList2 = new ArrayList();
                    while (r15.hasNext()) {
                    }
                    b2 = com.yandex.go.design.compose.list.a.b(arrayList2, new vu30(8));
                    if (!b2.a.isEmpty()) {
                    }
                }
                return coroutineSingletons;
            }
        }
        nearbyUserplaceStateFactory$getNearbyUserplaceState$1 = new NearbyUserplaceStateFactory$getNearbyUserplaceState$1(this, continuationImpl);
        Object obj2 = nearbyUserplaceStateFactory$getNearbyUserplaceState$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = nearbyUserplaceStateFactory$getNearbyUserplaceState$1.label;
        if (i != 0) {
        }
        tdp tdpVar22 = (tdp) obj2;
        nearbyUserplaceStateFactory$getNearbyUserplaceState$1.L$0 = null;
        nearbyUserplaceStateFactory$getNearbyUserplaceState$1.L$1 = tdpVar22;
        nearbyUserplaceStateFactory$getNearbyUserplaceState$1.label = 2;
        b = this.a.b(favoriteAddress.getPoint(), tdpVar22.h, nearbyUserplaceStateFactory$getNearbyUserplaceState$1);
        if (b != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
