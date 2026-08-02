package ru.yandex.taxi.masstransit.domain;

import com.yandex.runtime.image.ImageProvider;
import defpackage.clm0;
import defpackage.e631;
import defpackage.if61;
import defpackage.ny61;
import defpackage.qn00;
import defpackage.siu0;
import defpackage.tcc;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.masstransit.model.VariantStyle;

/* loaded from: classes6.dex */
public final class d {
    public final e631 a;

    public d(e631 e631Var) {
        this.a = e631Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(siu0 siu0Var, ContinuationImpl continuationImpl) {
        MapObjectsOverrideConfigMapper$mapScaleOverrideConfig$3 mapObjectsOverrideConfigMapper$mapScaleOverrideConfig$3;
        int i;
        if61 if61Var;
        float f;
        if61 if61Var2;
        float f2;
        if (continuationImpl instanceof MapObjectsOverrideConfigMapper$mapScaleOverrideConfig$3) {
            mapObjectsOverrideConfigMapper$mapScaleOverrideConfig$3 = (MapObjectsOverrideConfigMapper$mapScaleOverrideConfig$3) continuationImpl;
            int i2 = mapObjectsOverrideConfigMapper$mapScaleOverrideConfig$3.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mapObjectsOverrideConfigMapper$mapScaleOverrideConfig$3.label = i2 - Integer.MIN_VALUE;
                Object obj = mapObjectsOverrideConfigMapper$mapScaleOverrideConfig$3.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mapObjectsOverrideConfigMapper$mapScaleOverrideConfig$3.label;
                ImageProvider imageProvider = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    VariantStyle.b bVar = siu0Var.a;
                    if61Var = new if61(bVar.a, bVar.b);
                    f = siu0Var.b;
                    String str = siu0Var.c;
                    if (str != null) {
                        mapObjectsOverrideConfigMapper$mapScaleOverrideConfig$3.L$0 = null;
                        mapObjectsOverrideConfigMapper$mapScaleOverrideConfig$3.L$1 = null;
                        mapObjectsOverrideConfigMapper$mapScaleOverrideConfig$3.L$2 = if61Var;
                        mapObjectsOverrideConfigMapper$mapScaleOverrideConfig$3.F$0 = f;
                        mapObjectsOverrideConfigMapper$mapScaleOverrideConfig$3.label = 1;
                        Object b = ((ru.yandex.taxi.masstransit.overlay.d) this.a).b(str, mapObjectsOverrideConfigMapper$mapScaleOverrideConfig$3);
                        if (b == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        if61Var2 = if61Var;
                        obj = b;
                        f2 = f;
                    }
                    return new clm0(if61Var, f, imageProvider);
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                f2 = mapObjectsOverrideConfigMapper$mapScaleOverrideConfig$3.F$0;
                if61Var2 = (if61) mapObjectsOverrideConfigMapper$mapScaleOverrideConfig$3.L$2;
                kotlin.b.b(obj);
                imageProvider = (ImageProvider) obj;
                f = f2;
                if61Var = if61Var2;
                return new clm0(if61Var, f, imageProvider);
            }
        }
        mapObjectsOverrideConfigMapper$mapScaleOverrideConfig$3 = new MapObjectsOverrideConfigMapper$mapScaleOverrideConfig$3(this, continuationImpl);
        Object obj2 = mapObjectsOverrideConfigMapper$mapScaleOverrideConfig$3.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mapObjectsOverrideConfigMapper$mapScaleOverrideConfig$3.label;
        ImageProvider imageProvider2 = null;
        if (i != 0) {
        }
        imageProvider2 = (ImageProvider) obj2;
        f = f2;
        if61Var = if61Var2;
        return new clm0(if61Var, f, imageProvider2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0085 -> B:10:0x0086). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(List list, ContinuationImpl continuationImpl) {
        MapObjectsOverrideConfigMapper$mapScaleOverrideConfig$1 mapObjectsOverrideConfigMapper$mapScaleOverrideConfig$1;
        int i;
        Iterator it;
        Collection collection;
        if (continuationImpl instanceof MapObjectsOverrideConfigMapper$mapScaleOverrideConfig$1) {
            mapObjectsOverrideConfigMapper$mapScaleOverrideConfig$1 = (MapObjectsOverrideConfigMapper$mapScaleOverrideConfig$1) continuationImpl;
            int i2 = mapObjectsOverrideConfigMapper$mapScaleOverrideConfig$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mapObjectsOverrideConfigMapper$mapScaleOverrideConfig$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mapObjectsOverrideConfigMapper$mapScaleOverrideConfig$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mapObjectsOverrideConfigMapper$mapScaleOverrideConfig$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                    it = list2.iterator();
                    collection = arrayList;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    collection = (Collection) mapObjectsOverrideConfigMapper$mapScaleOverrideConfig$1.L$7;
                    it = (Iterator) mapObjectsOverrideConfigMapper$mapScaleOverrideConfig$1.L$4;
                    Collection collection2 = (Collection) mapObjectsOverrideConfigMapper$mapScaleOverrideConfig$1.L$3;
                    kotlin.b.b(obj);
                    collection.add((clm0) obj);
                    collection = collection2;
                    if (it.hasNext()) {
                        siu0 siu0Var = (siu0) it.next();
                        mapObjectsOverrideConfigMapper$mapScaleOverrideConfig$1.L$0 = null;
                        mapObjectsOverrideConfigMapper$mapScaleOverrideConfig$1.L$1 = null;
                        mapObjectsOverrideConfigMapper$mapScaleOverrideConfig$1.L$2 = null;
                        mapObjectsOverrideConfigMapper$mapScaleOverrideConfig$1.L$3 = collection;
                        mapObjectsOverrideConfigMapper$mapScaleOverrideConfig$1.L$4 = it;
                        mapObjectsOverrideConfigMapper$mapScaleOverrideConfig$1.L$5 = null;
                        mapObjectsOverrideConfigMapper$mapScaleOverrideConfig$1.L$6 = null;
                        mapObjectsOverrideConfigMapper$mapScaleOverrideConfig$1.L$7 = collection;
                        mapObjectsOverrideConfigMapper$mapScaleOverrideConfig$1.label = 1;
                        obj = a(siu0Var, mapObjectsOverrideConfigMapper$mapScaleOverrideConfig$1);
                        if (obj == obj2) {
                            return obj2;
                        }
                        collection2 = collection;
                        collection.add((clm0) obj);
                        collection = collection2;
                        if (it.hasNext()) {
                            return (List) collection;
                        }
                    }
                }
            }
        }
        mapObjectsOverrideConfigMapper$mapScaleOverrideConfig$1 = new MapObjectsOverrideConfigMapper$mapScaleOverrideConfig$1(this, continuationImpl);
        Object obj3 = mapObjectsOverrideConfigMapper$mapScaleOverrideConfig$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mapObjectsOverrideConfigMapper$mapScaleOverrideConfig$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(List list, ContinuationImpl continuationImpl) {
        MapObjectsOverrideConfigMapper$mapScalesToConfig$1 mapObjectsOverrideConfigMapper$mapScalesToConfig$1;
        int i;
        if (continuationImpl instanceof MapObjectsOverrideConfigMapper$mapScalesToConfig$1) {
            mapObjectsOverrideConfigMapper$mapScalesToConfig$1 = (MapObjectsOverrideConfigMapper$mapScalesToConfig$1) continuationImpl;
            int i2 = mapObjectsOverrideConfigMapper$mapScalesToConfig$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mapObjectsOverrideConfigMapper$mapScalesToConfig$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mapObjectsOverrideConfigMapper$mapScalesToConfig$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mapObjectsOverrideConfigMapper$mapScalesToConfig$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mapObjectsOverrideConfigMapper$mapScalesToConfig$1.L$0 = null;
                    mapObjectsOverrideConfigMapper$mapScalesToConfig$1.label = 1;
                    obj = b(list, mapObjectsOverrideConfigMapper$mapScalesToConfig$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return new qn00((List) obj, new if61(12.9f, 21.0f));
            }
        }
        mapObjectsOverrideConfigMapper$mapScalesToConfig$1 = new MapObjectsOverrideConfigMapper$mapScalesToConfig$1(this, continuationImpl);
        Object obj3 = mapObjectsOverrideConfigMapper$mapScalesToConfig$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mapObjectsOverrideConfigMapper$mapScalesToConfig$1.label;
        if (i != 0) {
        }
        return new qn00((List) obj3, new if61(12.9f, 21.0f));
    }
}
