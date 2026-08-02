package ru.yandex.taxi.plus.repository.mappers;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import defpackage.bvf0;
import defpackage.evu0;
import defpackage.fo11;
import defpackage.g16;
import defpackage.g59;
import defpackage.g8e;
import defpackage.go11;
import defpackage.hld0;
import defpackage.jst;
import defpackage.m1d0;
import defpackage.ny61;
import defpackage.pav;
import defpackage.ro11;
import defpackage.sb2;
import defpackage.unr0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.widget.FormattedTextConverter$EmptyDrawable;

/* loaded from: classes9.dex */
public final class d {
    public final hld0 a;
    public final ru.yandex.taxi.widget.c b;
    public final pav c;

    public d(hld0 hld0Var, ru.yandex.taxi.widget.c cVar, pav pavVar) {
        this.a = hld0Var;
        this.b = cVar;
        this.c = pavVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(d dVar, String str, ContinuationImpl continuationImpl) {
        TypedScreenMapper$loadImage$1 typedScreenMapper$loadImage$1;
        int i;
        dVar.getClass();
        try {
            if (continuationImpl instanceof TypedScreenMapper$loadImage$1) {
                typedScreenMapper$loadImage$1 = (TypedScreenMapper$loadImage$1) continuationImpl;
                int i2 = typedScreenMapper$loadImage$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    typedScreenMapper$loadImage$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = typedScreenMapper$loadImage$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = typedScreenMapper$loadImage$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        if (str == null || evu0.J(str)) {
                            return new FormattedTextConverter$EmptyDrawable();
                        }
                        g16 b = dVar.c.b().b(str);
                        typedScreenMapper$loadImage$1.L$0 = str;
                        typedScreenMapper$loadImage$1.label = 1;
                        obj = b.a(typedScreenMapper$loadImage$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str = (String) typedScreenMapper$loadImage$1.L$0;
                        kotlin.b.b(obj);
                    }
                    hld0 hld0Var = dVar.a;
                    hld0Var.getClass();
                    return new BitmapDrawable(hld0Var.a.getResources(), (Bitmap) obj);
                }
            }
            if (i != 0) {
            }
            hld0 hld0Var2 = dVar.a;
            hld0Var2.getClass();
            return new BitmapDrawable(hld0Var2.a.getResources(), (Bitmap) obj);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            jst.e.k(th, String.format("Failed to preload image for plus %s", Arrays.copyOf(new Object[]{str}, 1)));
            return new FormattedTextConverter$EmptyDrawable();
        }
        typedScreenMapper$loadImage$1 = new TypedScreenMapper$loadImage$1(dVar, continuationImpl);
        Object obj2 = typedScreenMapper$loadImage$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = typedScreenMapper$loadImage$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00f7 -> B:11:0x00fa). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(ro11 ro11Var, Map map, Continuation continuation) {
        TypedScreenMapper$mapPlusSubsPromoScreens$1 typedScreenMapper$mapPlusSubsPromoScreens$1;
        int i;
        Iterator it;
        ArrayList arrayList;
        Map map2;
        Map map3;
        ArrayList arrayList2;
        if (continuation instanceof TypedScreenMapper$mapPlusSubsPromoScreens$1) {
            typedScreenMapper$mapPlusSubsPromoScreens$1 = (TypedScreenMapper$mapPlusSubsPromoScreens$1) continuation;
            int i2 = typedScreenMapper$mapPlusSubsPromoScreens$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                typedScreenMapper$mapPlusSubsPromoScreens$1.label = i2 - Integer.MIN_VALUE;
                Object obj = typedScreenMapper$mapPlusSubsPromoScreens$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = typedScreenMapper$mapPlusSubsPromoScreens$1.label;
                if (i != 0) {
                    ArrayList t = g8e.t(obj);
                    List list = ro11Var.a;
                    if (list == null) {
                        return t;
                    }
                    it = list.iterator();
                    arrayList = t;
                    map2 = map;
                    while (it.hasNext()) {
                    }
                    return arrayList;
                }
                if (i == 1) {
                    ArrayList arrayList3 = (ArrayList) typedScreenMapper$mapPlusSubsPromoScreens$1.L$8;
                    it = (Iterator) typedScreenMapper$mapPlusSubsPromoScreens$1.L$4;
                    arrayList2 = (ArrayList) typedScreenMapper$mapPlusSubsPromoScreens$1.L$2;
                    map3 = (Map) typedScreenMapper$mapPlusSubsPromoScreens$1.L$1;
                    kotlin.b.b(obj);
                    arrayList3.add(obj);
                    arrayList = arrayList2;
                    map2 = map3;
                    while (it.hasNext()) {
                    }
                    return arrayList;
                }
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                arrayList = (ArrayList) typedScreenMapper$mapPlusSubsPromoScreens$1.L$8;
                it = (Iterator) typedScreenMapper$mapPlusSubsPromoScreens$1.L$4;
                arrayList2 = (ArrayList) typedScreenMapper$mapPlusSubsPromoScreens$1.L$2;
                map3 = (Map) typedScreenMapper$mapPlusSubsPromoScreens$1.L$1;
                kotlin.b.b(obj);
                arrayList.add(obj);
                arrayList = arrayList2;
                map2 = map3;
                while (it.hasNext()) {
                    fo11 fo11Var = (fo11) it.next();
                    go11 go11Var = fo11Var != null ? fo11Var.b : null;
                    if (go11Var instanceof m1d0) {
                        typedScreenMapper$mapPlusSubsPromoScreens$1.L$0 = null;
                        typedScreenMapper$mapPlusSubsPromoScreens$1.L$1 = map2;
                        typedScreenMapper$mapPlusSubsPromoScreens$1.L$2 = arrayList;
                        typedScreenMapper$mapPlusSubsPromoScreens$1.L$3 = null;
                        typedScreenMapper$mapPlusSubsPromoScreens$1.L$4 = it;
                        typedScreenMapper$mapPlusSubsPromoScreens$1.L$5 = null;
                        typedScreenMapper$mapPlusSubsPromoScreens$1.L$6 = null;
                        typedScreenMapper$mapPlusSubsPromoScreens$1.L$7 = null;
                        typedScreenMapper$mapPlusSubsPromoScreens$1.L$8 = arrayList;
                        typedScreenMapper$mapPlusSubsPromoScreens$1.label = 1;
                        Object n = bvf0.n(new TypedScreenMapper$mapPlusBurns$2((m1d0) go11Var, null, this), typedScreenMapper$mapPlusSubsPromoScreens$1);
                        if (n != coroutineSingletons) {
                            map3 = map2;
                            arrayList2 = arrayList;
                            arrayList.add(n);
                            arrayList = arrayList2;
                            map2 = map3;
                            while (it.hasNext()) {
                            }
                        }
                    } else if (go11Var instanceof g59) {
                        g59 g59Var = (g59) go11Var;
                        if (sb2.N(g59Var.e, map2)) {
                            typedScreenMapper$mapPlusSubsPromoScreens$1.L$0 = null;
                            typedScreenMapper$mapPlusSubsPromoScreens$1.L$1 = map2;
                            typedScreenMapper$mapPlusSubsPromoScreens$1.L$2 = arrayList;
                            typedScreenMapper$mapPlusSubsPromoScreens$1.L$3 = null;
                            typedScreenMapper$mapPlusSubsPromoScreens$1.L$4 = it;
                            typedScreenMapper$mapPlusSubsPromoScreens$1.L$5 = null;
                            typedScreenMapper$mapPlusSubsPromoScreens$1.L$6 = null;
                            typedScreenMapper$mapPlusSubsPromoScreens$1.L$7 = null;
                            typedScreenMapper$mapPlusSubsPromoScreens$1.L$8 = arrayList;
                            typedScreenMapper$mapPlusSubsPromoScreens$1.label = 2;
                            Object n2 = bvf0.n(new TypedScreenMapper$mapCatchingUpCashback$2(g59Var, map2, null, this), typedScreenMapper$mapPlusSubsPromoScreens$1);
                            if (n2 != coroutineSingletons) {
                                map3 = map2;
                                obj = n2;
                                arrayList2 = arrayList;
                                arrayList.add(obj);
                                arrayList = arrayList2;
                                map2 = map3;
                                while (it.hasNext()) {
                                }
                            }
                        }
                    } else {
                        unr0.z(jst.e, "Unknown typed screen");
                    }
                    return coroutineSingletons;
                }
                return arrayList;
            }
        }
        typedScreenMapper$mapPlusSubsPromoScreens$1 = new TypedScreenMapper$mapPlusSubsPromoScreens$1(this, continuation);
        Object obj2 = typedScreenMapper$mapPlusSubsPromoScreens$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = typedScreenMapper$mapPlusSubsPromoScreens$1.label;
        if (i != 0) {
        }
    }
}
