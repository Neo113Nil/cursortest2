package ru.yandex.taxi.favorites.address.impl.data;

import com.yandex.go.address.models.FavoriteAddress;
import com.yandex.go.address.models.PlaceType;
import defpackage.avj0;
import defpackage.d6z;
import defpackage.ffp;
import defpackage.j3c0;
import defpackage.kyh0;
import defpackage.n3c0;
import defpackage.ny61;
import defpackage.tdp;
import defpackage.tu21;
import defpackage.w511;
import defpackage.zuj0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public final class b {
    public final ru.yandex.taxi.favorites.data.repo.a a;
    public final zuj0 b;
    public final ru.yandex.taxi.favorites.address.api.experiment.a c;

    public b(ru.yandex.taxi.favorites.data.repo.a aVar, zuj0 zuj0Var, ru.yandex.taxi.favorites.address.api.experiment.a aVar2) {
        this.a = aVar;
        this.b = zuj0Var;
        this.c = aVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(PlaceType placeType, ContinuationImpl continuationImpl) {
        PlaceTypeRepository$getEmoji$1 placeTypeRepository$getEmoji$1;
        int i;
        tdp tdpVar;
        String str;
        if (continuationImpl instanceof PlaceTypeRepository$getEmoji$1) {
            placeTypeRepository$getEmoji$1 = (PlaceTypeRepository$getEmoji$1) continuationImpl;
            int i2 = placeTypeRepository$getEmoji$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                placeTypeRepository$getEmoji$1.label = i2 - Integer.MIN_VALUE;
                Object obj = placeTypeRepository$getEmoji$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = placeTypeRepository$getEmoji$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    placeTypeRepository$getEmoji$1.L$0 = placeType;
                    placeTypeRepository$getEmoji$1.label = 1;
                    obj = this.c.a.b(placeTypeRepository$getEmoji$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    placeType = (PlaceType) placeTypeRepository$getEmoji$1.L$0;
                    kotlin.b.b(obj);
                }
                tdpVar = (tdp) obj;
                if (tdpVar.c) {
                    return null;
                }
                if (placeType == null) {
                    placeType = PlaceType.OTHER;
                }
                int i3 = j3c0.a[placeType.ordinal()];
                if (i3 == 1) {
                    str = "💼";
                } else if (i3 == 2) {
                    str = "🏠";
                } else {
                    if (i3 != 3) {
                        w511.b();
                        return null;
                    }
                    str = tdpVar.f;
                }
                return new tu21(str);
            }
        }
        placeTypeRepository$getEmoji$1 = new PlaceTypeRepository$getEmoji$1(this, continuationImpl);
        Object obj2 = placeTypeRepository$getEmoji$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = placeTypeRepository$getEmoji$1.label;
        if (i != 0) {
        }
        tdpVar = (tdp) obj2;
        if (tdpVar.c) {
        }
    }

    public final String b(PlaceType placeType) {
        if (placeType == null) {
            placeType = PlaceType.OTHER;
        }
        int i = j3c0.a[placeType.ordinal()];
        zuj0 zuj0Var = this.b;
        if (i == 1) {
            return ((avj0) zuj0Var).h(kyh0.favorite_work);
        }
        if (i == 2) {
            return ((avj0) zuj0Var).h(kyh0.favorite_home);
        }
        if (i == 3) {
            return "";
        }
        w511.b();
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0054, code lost:
    
        if (r9 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(FavoriteAddress favoriteAddress, ContinuationImpl continuationImpl) {
        PlaceTypeRepository$getPlaceTypeState$1 placeTypeRepository$getPlaceTypeState$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        PlaceType placeType;
        Object c;
        PlaceType placeType2;
        tdp tdpVar;
        List list;
        List list2;
        boolean z;
        if (continuationImpl instanceof PlaceTypeRepository$getPlaceTypeState$1) {
            placeTypeRepository$getPlaceTypeState$1 = (PlaceTypeRepository$getPlaceTypeState$1) continuationImpl;
            int i2 = placeTypeRepository$getPlaceTypeState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                placeTypeRepository$getPlaceTypeState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = placeTypeRepository$getPlaceTypeState$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = placeTypeRepository$getPlaceTypeState$1.label;
                boolean z2 = true;
                if (i != 0) {
                    kotlin.b.b(obj);
                    placeTypeRepository$getPlaceTypeState$1.L$0 = favoriteAddress;
                    placeTypeRepository$getPlaceTypeState$1.label = 1;
                    obj = this.c.a.b(placeTypeRepository$getPlaceTypeState$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        placeType2 = (PlaceType) placeTypeRepository$getPlaceTypeState$1.L$2;
                        tdpVar = (tdp) placeTypeRepository$getPlaceTypeState$1.L$1;
                        kotlin.b.b(obj);
                        ffp ffpVar = (ffp) obj;
                        list = ffpVar != null ? ffpVar.a : null;
                        if (list == null) {
                            list = EmptyList.a;
                        }
                        list2 = list;
                        if (!list2.isEmpty()) {
                            List list3 = list;
                            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                                Iterator it = list3.iterator();
                                while (it.hasNext()) {
                                    if (((FavoriteAddress) it.next()).getPlaceType() != PlaceType.HOME) {
                                    }
                                }
                            }
                            z = true;
                            if (!list2.isEmpty()) {
                                List list4 = list;
                                if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                                    Iterator it2 = list4.iterator();
                                    while (it2.hasNext()) {
                                        if (((FavoriteAddress) it2.next()).getPlaceType() != PlaceType.WORK) {
                                        }
                                    }
                                }
                                return new n3c0(placeType2, z, z2, d6z.Y(tdpVar, tdpVar.i.d));
                            }
                            z2 = false;
                            return new n3c0(placeType2, z, z2, d6z.Y(tdpVar, tdpVar.i.d));
                        }
                        z = false;
                        if (!list2.isEmpty()) {
                        }
                        z2 = false;
                        return new n3c0(placeType2, z, z2, d6z.Y(tdpVar, tdpVar.i.d));
                    }
                    favoriteAddress = (FavoriteAddress) placeTypeRepository$getPlaceTypeState$1.L$0;
                    kotlin.b.b(obj);
                }
                tdp tdpVar2 = (tdp) obj;
                placeType = favoriteAddress.getPlaceType();
                if (placeType == null) {
                    placeType = PlaceType.OTHER;
                }
                placeTypeRepository$getPlaceTypeState$1.L$0 = null;
                placeTypeRepository$getPlaceTypeState$1.L$1 = tdpVar2;
                placeTypeRepository$getPlaceTypeState$1.L$2 = placeType;
                placeTypeRepository$getPlaceTypeState$1.label = 2;
                c = this.a.c(false, placeTypeRepository$getPlaceTypeState$1);
                if (c != coroutineSingletons) {
                    obj = c;
                    placeType2 = placeType;
                    tdpVar = tdpVar2;
                    ffp ffpVar2 = (ffp) obj;
                    if (ffpVar2 != null) {
                    }
                    if (list == null) {
                    }
                    list2 = list;
                    if (!list2.isEmpty()) {
                    }
                    z = false;
                    if (!list2.isEmpty()) {
                    }
                    z2 = false;
                    return new n3c0(placeType2, z, z2, d6z.Y(tdpVar, tdpVar.i.d));
                }
                return coroutineSingletons;
            }
        }
        placeTypeRepository$getPlaceTypeState$1 = new PlaceTypeRepository$getPlaceTypeState$1(this, continuationImpl);
        Object obj2 = placeTypeRepository$getPlaceTypeState$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = placeTypeRepository$getPlaceTypeState$1.label;
        boolean z22 = true;
        if (i != 0) {
        }
        tdp tdpVar22 = (tdp) obj2;
        placeType = favoriteAddress.getPlaceType();
        if (placeType == null) {
        }
        placeTypeRepository$getPlaceTypeState$1.L$0 = null;
        placeTypeRepository$getPlaceTypeState$1.L$1 = tdpVar22;
        placeTypeRepository$getPlaceTypeState$1.L$2 = placeType;
        placeTypeRepository$getPlaceTypeState$1.label = 2;
        c = this.a.c(false, placeTypeRepository$getPlaceTypeState$1);
        if (c != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
