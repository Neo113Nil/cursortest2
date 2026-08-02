package ru.yandex.yandexmaps.multiplatform.pin.war.internal.painter;

import android.graphics.PointF;
import com.yandex.mapkit.map.MapObjectCollection;
import com.yandex.mapkit.maps.core.geometry.Point;
import com.yandex.mapkit.maps.core.geometry.PointExtensionKt;
import defpackage.aq80;
import defpackage.ayb0;
import defpackage.b700;
import defpackage.byb0;
import defpackage.c3c0;
import defpackage.c4c0;
import defpackage.cyb0;
import defpackage.dyb0;
import defpackage.exb0;
import defpackage.eyb0;
import defpackage.f2c0;
import defpackage.g8c;
import defpackage.g8e;
import defpackage.h2c0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.l1c0;
import defpackage.m1c0;
import defpackage.m5v;
import defpackage.mwb0;
import defpackage.ny61;
import defpackage.qub0;
import defpackage.qzb0;
import defpackage.rf2;
import defpackage.s7c;
import defpackage.t9b0;
import defpackage.tje;
import defpackage.tls;
import defpackage.uyj;
import defpackage.wub0;
import defpackage.x1c0;
import defpackage.yj70;
import defpackage.ymu;
import defpackage.zxb0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$IntRef;
import ru.yandex.yandexmaps.multiplatform.pin.war.PinVisualState;
import ru.yandex.yandexmaps.multiplatform.pin.war.internal.cache.PinCacheMode;
import ru.yandex.yandexmaps.multiplatform.pin.war.internal.util.ConcurrencyKt$throttle$1;
import ru.yandex.yandexmaps.multiplatform.pin.war.internal.util.PlacemarkType;

/* loaded from: classes7.dex */
public final class a {
    public final qub0 a;
    public final float b;
    public final ymu c;
    public final wub0 d;
    public final wub0 e;
    public final wub0 f;
    public final yj70 g;
    public final ArrayList h;
    public final ArrayList i;
    public final i3y j;
    public boolean k;

    public a(exb0 exb0Var, ymu ymuVar, qub0 qub0Var, float f) {
        this.a = qub0Var;
        this.b = f;
        this.c = ymuVar;
        PinCacheMode pinCacheMode = PinCacheMode.PERMANENT;
        this.d = exb0Var.a(pinCacheMode);
        this.e = exb0Var.a(pinCacheMode);
        this.f = exb0Var.a(pinCacheMode);
        this.g = new yj70(this);
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = kotlin.a.a(new t9b0(10, this));
    }

    public static float i(PlacemarkType placemarkType, float f) {
        float ordinal;
        if (eyb0.a[placemarkType.ordinal()] == 1) {
            ordinal = i(PlacemarkType.LABEL_M, f);
            f = 0.001f;
        } else {
            ordinal = placemarkType.ordinal() - PlacemarkType.DUST.ordinal();
        }
        return ordinal + f;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x01b4 -> B:10:0x01b7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(List list, Set set, ContinuationImpl continuationImpl) {
        PinPainter$changeVisualState$1 pinPainter$changeVisualState$1;
        int i;
        Iterator it;
        tls tlsVar;
        int i2;
        int i3;
        int i4;
        int i5;
        Set set2;
        CoroutineSingletons coroutineSingletons;
        Object obj;
        int i6;
        i3y i3yVar;
        int i7;
        if (continuationImpl instanceof PinPainter$changeVisualState$1) {
            pinPainter$changeVisualState$1 = (PinPainter$changeVisualState$1) continuationImpl;
            int i8 = pinPainter$changeVisualState$1.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                pinPainter$changeVisualState$1.label = i8 - Integer.MIN_VALUE;
                Object obj2 = pinPainter$changeVisualState$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pinPainter$changeVisualState$1.label;
                if (i != 0) {
                    b.b(obj2);
                    ConcurrencyKt$throttle$1 concurrencyKt$throttle$1 = new ConcurrencyKt$throttle$1(new Ref$IntRef(), 10, null);
                    it = list.iterator();
                    tlsVar = concurrencyKt$throttle$1;
                    i2 = 10;
                    i3 = 0;
                    i4 = 0;
                    i5 = 0;
                    set2 = set;
                    if (!it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i9 = pinPainter$changeVisualState$1.I$3;
                    int i10 = pinPainter$changeVisualState$1.I$2;
                    i5 = pinPainter$changeVisualState$1.I$1;
                    i2 = pinPainter$changeVisualState$1.I$0;
                    it = (Iterator) pinPainter$changeVisualState$1.L$5;
                    tlsVar = (tls) pinPainter$changeVisualState$1.L$3;
                    Set set3 = (Set) pinPainter$changeVisualState$1.L$1;
                    b.b(obj2);
                    int i11 = i10;
                    set2 = set3;
                    CoroutineSingletons coroutineSingletons3 = coroutineSingletons2;
                    int i12 = i9;
                    boolean z = true;
                    Object obj3 = null;
                    i3 = i12;
                    i4 = i11;
                    coroutineSingletons2 = coroutineSingletons3;
                    if (!it.hasNext()) {
                        zxb0 zxb0Var = (zxb0) it.next();
                        qzb0 qzb0Var = zxb0Var.a;
                        PinVisualState pinVisualState = zxb0Var.b;
                        boolean contains = set2.contains(qzb0Var.a);
                        mwb0 mwb0Var = qzb0Var.a;
                        mwb0 mwb0Var2 = qzb0Var.a;
                        Map map = (Map) this.e.b.get(mwb0Var);
                        wub0 wub0Var = this.d;
                        if (map != null) {
                            LinkedHashMap linkedHashMap = wub0Var.b;
                            Object obj4 = linkedHashMap.get(mwb0Var2);
                            if (obj4 == null) {
                                coroutineSingletons = coroutineSingletons2;
                                PinVisualState pinVisualState2 = PinVisualState.INVISIBLE;
                                linkedHashMap.put(mwb0Var2, pinVisualState2);
                                obj = pinVisualState2;
                            } else {
                                coroutineSingletons = coroutineSingletons2;
                                obj = obj4;
                            }
                            PinVisualState pinVisualState3 = (PinVisualState) obj;
                            pinVisualState3.getClass();
                            PinVisualState pinVisualState4 = PinVisualState.ICON;
                            i6 = i3;
                            i3y i3yVar2 = this.j;
                            if (pinVisualState3 == pinVisualState4) {
                                i3yVar = i3yVar2;
                                PinVisualState pinVisualState5 = PinVisualState.ICON_LABEL_S;
                                i7 = i4;
                                if (pinVisualState == pinVisualState5 || pinVisualState == PinVisualState.ICON_LABEL_M) {
                                    h2c0 h2c0Var = (h2c0) map.get(PlacemarkType.ICON_OVERLAY);
                                    if (h2c0Var != null) {
                                        h2c0Var.setVisible(true);
                                    }
                                    h2c0 h2c0Var2 = (h2c0) map.get(PlacemarkType.ICON);
                                    if (h2c0Var2 != null) {
                                        h2c0Var2.setVisible(false);
                                    }
                                    h2c0 h2c0Var3 = (h2c0) map.get(pinVisualState == pinVisualState5 ? PlacemarkType.LABEL_S : PlacemarkType.LABEL_M);
                                    if (h2c0Var3 != null) {
                                        h2c0Var3.b(true, (m1c0) i3yVar.getValue(), null);
                                        obj3 = null;
                                        wub0Var.b(mwb0Var2, pinVisualState);
                                        pinPainter$changeVisualState$1.L$0 = obj3;
                                        pinPainter$changeVisualState$1.L$1 = set2;
                                        pinPainter$changeVisualState$1.L$2 = obj3;
                                        pinPainter$changeVisualState$1.L$3 = tlsVar;
                                        pinPainter$changeVisualState$1.L$4 = obj3;
                                        pinPainter$changeVisualState$1.L$5 = it;
                                        pinPainter$changeVisualState$1.L$6 = obj3;
                                        pinPainter$changeVisualState$1.L$7 = obj3;
                                        pinPainter$changeVisualState$1.I$0 = i2;
                                        pinPainter$changeVisualState$1.I$1 = i5;
                                        i11 = i7;
                                        pinPainter$changeVisualState$1.I$2 = i11;
                                        i12 = i6;
                                        pinPainter$changeVisualState$1.I$3 = i12;
                                        pinPainter$changeVisualState$1.I$4 = 0;
                                        z = true;
                                        pinPainter$changeVisualState$1.label = 1;
                                        coroutineSingletons3 = coroutineSingletons;
                                        if (tlsVar.invoke(pinPainter$changeVisualState$1) == coroutineSingletons3) {
                                            return coroutineSingletons3;
                                        }
                                        i3 = i12;
                                        i4 = i11;
                                        coroutineSingletons2 = coroutineSingletons3;
                                        if (!it.hasNext()) {
                                            return zy11.a;
                                        }
                                    }
                                }
                            } else {
                                i3yVar = i3yVar2;
                                i7 = i4;
                            }
                            PinVisualState pinVisualState6 = PinVisualState.ICON_LABEL_S;
                            if ((pinVisualState3 == pinVisualState6 || pinVisualState3 == PinVisualState.ICON_LABEL_M) && pinVisualState == pinVisualState4) {
                                h2c0 h2c0Var4 = (h2c0) map.get(pinVisualState3 == pinVisualState6 ? PlacemarkType.LABEL_S : PlacemarkType.LABEL_M);
                                if (h2c0Var4 != null) {
                                    b700 b700Var = new b700(23, this, zxb0Var, map);
                                    m1c0.a.getClass();
                                    h2c0Var4.b(false, l1c0.b, b700Var);
                                }
                            } else {
                                for (Map.Entry entry : map.entrySet()) {
                                    PlacemarkType placemarkType = (PlacemarkType) entry.getKey();
                                    h2c0 h2c0Var5 = (h2c0) entry.getValue();
                                    if (!zxb0Var.c.contains(placemarkType)) {
                                        h2c0Var5.g();
                                    } else if (contains) {
                                        h2c0Var5.setVisible(true);
                                    } else {
                                        h2c0Var5.b(true, (m1c0) i3yVar.getValue(), null);
                                    }
                                }
                            }
                        } else {
                            coroutineSingletons = coroutineSingletons2;
                            i6 = i3;
                            i7 = i4;
                        }
                        obj3 = null;
                        wub0Var.b(mwb0Var2, pinVisualState);
                        pinPainter$changeVisualState$1.L$0 = obj3;
                        pinPainter$changeVisualState$1.L$1 = set2;
                        pinPainter$changeVisualState$1.L$2 = obj3;
                        pinPainter$changeVisualState$1.L$3 = tlsVar;
                        pinPainter$changeVisualState$1.L$4 = obj3;
                        pinPainter$changeVisualState$1.L$5 = it;
                        pinPainter$changeVisualState$1.L$6 = obj3;
                        pinPainter$changeVisualState$1.L$7 = obj3;
                        pinPainter$changeVisualState$1.I$0 = i2;
                        pinPainter$changeVisualState$1.I$1 = i5;
                        i11 = i7;
                        pinPainter$changeVisualState$1.I$2 = i11;
                        i12 = i6;
                        pinPainter$changeVisualState$1.I$3 = i12;
                        pinPainter$changeVisualState$1.I$4 = 0;
                        z = true;
                        pinPainter$changeVisualState$1.label = 1;
                        coroutineSingletons3 = coroutineSingletons;
                        if (tlsVar.invoke(pinPainter$changeVisualState$1) == coroutineSingletons3) {
                        }
                        i3 = i12;
                        i4 = i11;
                        coroutineSingletons2 = coroutineSingletons3;
                        if (!it.hasNext()) {
                        }
                    }
                }
            }
        }
        pinPainter$changeVisualState$1 = new PinPainter$changeVisualState$1(this, continuationImpl);
        Object obj22 = pinPainter$changeVisualState$1.result;
        CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pinPainter$changeVisualState$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00c4, code lost:
    
        if (c((java.util.List) r13, r12, r0) != r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00c6, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b1, code lost:
    
        if (r13 == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ArrayList arrayList, Map map, ContinuationImpl continuationImpl) {
        PinPainter$createMissingPlacemarks$1 pinPainter$createMissingPlacemarks$1;
        int i;
        if (continuationImpl instanceof PinPainter$createMissingPlacemarks$1) {
            pinPainter$createMissingPlacemarks$1 = (PinPainter$createMissingPlacemarks$1) continuationImpl;
            int i2 = pinPainter$createMissingPlacemarks$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pinPainter$createMissingPlacemarks$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pinPainter$createMissingPlacemarks$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pinPainter$createMissingPlacemarks$1.label;
                if (i != 0) {
                    ArrayList t = g8e.t(obj);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        zxb0 zxb0Var = (zxb0) it.next();
                        for (PlacemarkType placemarkType : zxb0Var.c) {
                            Map map2 = (Map) this.e.b.get(zxb0Var.a.a);
                            if (!(map2 != null ? map2.containsKey(placemarkType) : false)) {
                                t.add(new cyb0(zxb0Var, placemarkType));
                            }
                        }
                    }
                    pinPainter$createMissingPlacemarks$1.L$0 = null;
                    pinPainter$createMissingPlacemarks$1.L$1 = map;
                    pinPainter$createMissingPlacemarks$1.L$2 = null;
                    pinPainter$createMissingPlacemarks$1.label = 1;
                    obj = tje.k0(uyj.a, new PinPainterKt$createResources$2(t, this.a, null), pinPainter$createMissingPlacemarks$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                        return zy11.a;
                    }
                    map = (Map) pinPainter$createMissingPlacemarks$1.L$1;
                    b.b(obj);
                }
                pinPainter$createMissingPlacemarks$1.L$0 = null;
                pinPainter$createMissingPlacemarks$1.L$1 = null;
                pinPainter$createMissingPlacemarks$1.L$2 = null;
                pinPainter$createMissingPlacemarks$1.L$3 = null;
                pinPainter$createMissingPlacemarks$1.label = 2;
            }
        }
        pinPainter$createMissingPlacemarks$1 = new PinPainter$createMissingPlacemarks$1(this, continuationImpl);
        Object obj3 = pinPainter$createMissingPlacemarks$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pinPainter$createMissingPlacemarks$1.label;
        if (i != 0) {
        }
        pinPainter$createMissingPlacemarks$1.L$0 = null;
        pinPainter$createMissingPlacemarks$1.L$1 = null;
        pinPainter$createMissingPlacemarks$1.L$2 = null;
        pinPainter$createMissingPlacemarks$1.L$3 = null;
        pinPainter$createMissingPlacemarks$1.label = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x016d -> B:10:0x0170). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(List list, Map map, ContinuationImpl continuationImpl) {
        PinPainter$createPlacemarks$1 pinPainter$createPlacemarks$1;
        int i;
        Iterator it;
        tls tlsVar;
        int i2;
        int i3;
        int i4;
        int i5;
        Map map2;
        CoroutineSingletons coroutineSingletons;
        if (continuationImpl instanceof PinPainter$createPlacemarks$1) {
            pinPainter$createPlacemarks$1 = (PinPainter$createPlacemarks$1) continuationImpl;
            int i6 = pinPainter$createPlacemarks$1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                pinPainter$createPlacemarks$1.label = i6 - Integer.MIN_VALUE;
                Object obj = pinPainter$createPlacemarks$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pinPainter$createPlacemarks$1.label;
                if (i != 0) {
                    b.b(obj);
                    ConcurrencyKt$throttle$1 concurrencyKt$throttle$1 = new ConcurrencyKt$throttle$1(new Ref$IntRef(), 10, null);
                    it = list.iterator();
                    tlsVar = concurrencyKt$throttle$1;
                    i2 = 10;
                    i3 = 0;
                    i4 = 0;
                    i5 = 0;
                    map2 = map;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = pinPainter$createPlacemarks$1.I$3;
                    i4 = pinPainter$createPlacemarks$1.I$2;
                    int i7 = pinPainter$createPlacemarks$1.I$1;
                    i2 = pinPainter$createPlacemarks$1.I$0;
                    it = (Iterator) pinPainter$createPlacemarks$1.L$5;
                    tlsVar = (tls) pinPainter$createPlacemarks$1.L$3;
                    Map map3 = (Map) pinPainter$createPlacemarks$1.L$1;
                    b.b(obj);
                    int i8 = i7;
                    map2 = map3;
                    CoroutineSingletons coroutineSingletons3 = coroutineSingletons2;
                    boolean z = true;
                    Object obj2 = null;
                    coroutineSingletons2 = coroutineSingletons3;
                    i5 = i8;
                    if (it.hasNext()) {
                        dyb0 dyb0Var = (dyb0) it.next();
                        cyb0 cyb0Var = dyb0Var.a;
                        f2c0 f2c0Var = dyb0Var.b;
                        PointF pointF = dyb0Var.c;
                        zxb0 zxb0Var = cyb0Var.a;
                        PlacemarkType placemarkType = cyb0Var.b;
                        qzb0 qzb0Var = zxb0Var.a;
                        mwb0 mwb0Var = qzb0Var.a;
                        LinkedHashMap linkedHashMap = this.e.b;
                        Object obj3 = linkedHashMap.get(mwb0Var);
                        if (obj3 == null) {
                            coroutineSingletons = coroutineSingletons2;
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            linkedHashMap.put(mwb0Var, linkedHashMap2);
                            obj3 = linkedHashMap2;
                        } else {
                            coroutineSingletons = coroutineSingletons2;
                        }
                        Map map4 = (Map) obj3;
                        mwb0 mwb0Var2 = qzb0Var.a;
                        mwb0 mwb0Var3 = qzb0Var.a;
                        Point point = (Point) map2.get(mwb0Var2);
                        int i9 = i3;
                        int i10 = i4;
                        ymu ymuVar = this.c;
                        int i11 = i5;
                        int i12 = i2;
                        rf2 rf2Var = new rf2(new x1c0((MapObjectCollection) ((aq80) ymuVar.b).a), (c4c0) ymuVar.c);
                        if (point != null) {
                            rf2Var.d(point);
                        }
                        rf2Var.d(qzb0Var.c);
                        rf2Var.f(f2c0Var, new m5v(pointF));
                        rf2Var.setZIndex(i(placemarkType, qzb0Var.b));
                        rf2Var.setVisible(false);
                        rf2Var.setUserData(mwb0Var3);
                        rf2Var.a(this.g);
                        map4.put(placemarkType, rf2Var);
                        g8c g8cVar = mwb0Var3 instanceof g8c ? (g8c) mwb0Var3 : null;
                        if (g8cVar != null) {
                            this.f.b(mwb0Var3, g8cVar.b);
                        }
                        obj2 = null;
                        pinPainter$createPlacemarks$1.L$0 = null;
                        pinPainter$createPlacemarks$1.L$1 = map2;
                        pinPainter$createPlacemarks$1.L$2 = null;
                        pinPainter$createPlacemarks$1.L$3 = tlsVar;
                        pinPainter$createPlacemarks$1.L$4 = null;
                        pinPainter$createPlacemarks$1.L$5 = it;
                        pinPainter$createPlacemarks$1.L$6 = null;
                        pinPainter$createPlacemarks$1.L$7 = null;
                        pinPainter$createPlacemarks$1.L$8 = null;
                        pinPainter$createPlacemarks$1.L$9 = null;
                        pinPainter$createPlacemarks$1.L$10 = null;
                        pinPainter$createPlacemarks$1.L$11 = null;
                        pinPainter$createPlacemarks$1.L$12 = null;
                        pinPainter$createPlacemarks$1.L$13 = null;
                        pinPainter$createPlacemarks$1.I$0 = i12;
                        i8 = i11;
                        pinPainter$createPlacemarks$1.I$1 = i8;
                        pinPainter$createPlacemarks$1.I$2 = i10;
                        pinPainter$createPlacemarks$1.I$3 = i9;
                        pinPainter$createPlacemarks$1.I$4 = 0;
                        z = true;
                        pinPainter$createPlacemarks$1.label = 1;
                        coroutineSingletons3 = coroutineSingletons;
                        if (tlsVar.invoke(pinPainter$createPlacemarks$1) == coroutineSingletons3) {
                            return coroutineSingletons3;
                        }
                        i2 = i12;
                        i4 = i10;
                        i3 = i9;
                        coroutineSingletons2 = coroutineSingletons3;
                        i5 = i8;
                        if (it.hasNext()) {
                            return zy11.a;
                        }
                    }
                }
            }
        }
        pinPainter$createPlacemarks$1 = new PinPainter$createPlacemarks$1(this, continuationImpl);
        Object obj4 = pinPainter$createPlacemarks$1.result;
        CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pinPainter$createPlacemarks$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x03f0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(boolean z, List list, List list2, List list3, List list4, List list5, boolean z2, Map map, Map map2, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, ContinuationImpl continuationImpl) {
        PinPainter$draw$1 pinPainter$draw$1;
        int i;
        List list6;
        Map map3;
        Set set;
        Set set2;
        List list7;
        Object obj;
        boolean z3;
        Map map4;
        boolean z4;
        Object obj2;
        List list8;
        byb0 byb0Var;
        List list9;
        Object g;
        Object obj3;
        boolean z5;
        List list10;
        List list11;
        ArrayList arrayList;
        Object obj4;
        boolean z6;
        List list12;
        Set set3;
        if (continuationImpl instanceof PinPainter$draw$1) {
            pinPainter$draw$1 = (PinPainter$draw$1) continuationImpl;
            int i2 = pinPainter$draw$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pinPainter$draw$1.label = i2 - Integer.MIN_VALUE;
                Object obj5 = pinPainter$draw$1.result;
                Object obj6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pinPainter$draw$1.label;
                wub0 wub0Var = this.d;
                Object obj7 = null;
                switch (i) {
                    case 0:
                        b.b(obj5);
                        pinPainter$draw$1.L$0 = null;
                        pinPainter$draw$1.L$1 = list2;
                        pinPainter$draw$1.L$2 = null;
                        pinPainter$draw$1.L$3 = null;
                        list6 = list5;
                        pinPainter$draw$1.L$4 = list6;
                        pinPainter$draw$1.L$5 = map;
                        map3 = map2;
                        pinPainter$draw$1.L$6 = map3;
                        set = linkedHashSet;
                        pinPainter$draw$1.L$7 = set;
                        set2 = linkedHashSet2;
                        pinPainter$draw$1.L$8 = set2;
                        pinPainter$draw$1.Z$0 = z;
                        pinPainter$draw$1.Z$1 = z2;
                        pinPainter$draw$1.label = 1;
                        Object k0 = tje.k0(uyj.a, new PinPainterKt$buildDescriptors$2(list3, list, z, list4, null), pinPainter$draw$1);
                        if (k0 == obj6) {
                            return obj6;
                        }
                        list7 = list2;
                        obj = k0;
                        z3 = z2;
                        map4 = map;
                        z4 = z;
                        List list13 = (List) obj;
                        if (z3) {
                            obj2 = obj6;
                            list8 = list6;
                            byb0Var = new byb0(EmptyList.a);
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it = list13.iterator();
                            while (it.hasNext()) {
                                zxb0 zxb0Var = (zxb0) it.next();
                                List list14 = list6;
                                PinVisualState pinVisualState = zxb0Var.b;
                                Iterator it2 = it;
                                qzb0 qzb0Var = zxb0Var.a;
                                Object obj8 = obj6;
                                PinVisualState pinVisualState2 = PinVisualState.INVISIBLE;
                                if (pinVisualState != pinVisualState2) {
                                    PinVisualState pinVisualState3 = (PinVisualState) wub0Var.b.get(qzb0Var.a);
                                    if (pinVisualState3 == null) {
                                        pinVisualState3 = pinVisualState2;
                                    }
                                    arrayList2.add(new ayb0(qzb0Var, zxb0Var.b, pinVisualState3));
                                }
                                list6 = list14;
                                it = it2;
                                obj6 = obj8;
                            }
                            obj2 = obj6;
                            list8 = list6;
                            byb0Var = new byb0(arrayList2);
                        }
                        if (this.k) {
                            list9 = list8;
                        } else {
                            this.k = false;
                            List list15 = list8;
                            List a = this.e.a();
                            ArrayList arrayList3 = new ArrayList();
                            Iterator it3 = a.iterator();
                            while (it3.hasNext()) {
                                Object next = it3.next();
                                Iterator it4 = it3;
                                if (((mwb0) next) instanceof g8c) {
                                    arrayList3.add(next);
                                }
                                it3 = it4;
                            }
                            list9 = kotlin.collections.a.I(kotlin.collections.a.m0(arrayList3, list15));
                        }
                        obj7 = null;
                        pinPainter$draw$1.L$0 = null;
                        pinPainter$draw$1.L$1 = list7;
                        pinPainter$draw$1.L$2 = null;
                        pinPainter$draw$1.L$3 = null;
                        pinPainter$draw$1.L$4 = null;
                        pinPainter$draw$1.L$5 = map4;
                        pinPainter$draw$1.L$6 = null;
                        pinPainter$draw$1.L$7 = null;
                        pinPainter$draw$1.L$8 = set2;
                        pinPainter$draw$1.L$9 = list13;
                        pinPainter$draw$1.L$10 = byb0Var;
                        pinPainter$draw$1.L$11 = null;
                        pinPainter$draw$1.Z$0 = z4;
                        pinPainter$draw$1.Z$1 = z3;
                        pinPainter$draw$1.label = 2;
                        g = g(list9, map3, set, pinPainter$draw$1);
                        obj3 = obj2;
                        if (g != obj3) {
                            return obj3;
                        }
                        z5 = z3;
                        list10 = list13;
                        list11 = list7;
                        pinPainter$draw$1.L$0 = obj7;
                        pinPainter$draw$1.L$1 = obj7;
                        pinPainter$draw$1.L$2 = obj7;
                        pinPainter$draw$1.L$3 = obj7;
                        pinPainter$draw$1.L$4 = obj7;
                        pinPainter$draw$1.L$5 = map4;
                        pinPainter$draw$1.L$6 = obj7;
                        pinPainter$draw$1.L$7 = obj7;
                        pinPainter$draw$1.L$8 = set2;
                        pinPainter$draw$1.L$9 = list10;
                        pinPainter$draw$1.L$10 = byb0Var;
                        pinPainter$draw$1.L$11 = obj7;
                        pinPainter$draw$1.Z$0 = z4;
                        pinPainter$draw$1.Z$1 = z5;
                        pinPainter$draw$1.label = 3;
                        if (e(list11, pinPainter$draw$1) == obj3) {
                            return obj3;
                        }
                        arrayList = new ArrayList();
                        for (Object obj9 : list10) {
                            zxb0 zxb0Var2 = (zxb0) obj9;
                            if (wub0Var.b.get(zxb0Var2.a.a) != zxb0Var2.b) {
                                arrayList.add(obj9);
                            }
                        }
                        obj4 = null;
                        pinPainter$draw$1.L$0 = null;
                        pinPainter$draw$1.L$1 = null;
                        pinPainter$draw$1.L$2 = null;
                        pinPainter$draw$1.L$3 = null;
                        pinPainter$draw$1.L$4 = null;
                        pinPainter$draw$1.L$5 = null;
                        pinPainter$draw$1.L$6 = null;
                        pinPainter$draw$1.L$7 = null;
                        pinPainter$draw$1.L$8 = set2;
                        pinPainter$draw$1.L$9 = list10;
                        pinPainter$draw$1.L$10 = byb0Var;
                        pinPainter$draw$1.L$11 = null;
                        pinPainter$draw$1.L$12 = arrayList;
                        pinPainter$draw$1.Z$0 = z4;
                        pinPainter$draw$1.Z$1 = z5;
                        pinPainter$draw$1.label = 4;
                        if (b(arrayList, map4, pinPainter$draw$1) == obj3) {
                            return obj3;
                        }
                        z6 = z4;
                        list12 = arrayList;
                        pinPainter$draw$1.L$0 = obj4;
                        pinPainter$draw$1.L$1 = obj4;
                        pinPainter$draw$1.L$2 = obj4;
                        pinPainter$draw$1.L$3 = obj4;
                        pinPainter$draw$1.L$4 = obj4;
                        pinPainter$draw$1.L$5 = obj4;
                        pinPainter$draw$1.L$6 = obj4;
                        pinPainter$draw$1.L$7 = obj4;
                        pinPainter$draw$1.L$8 = set2;
                        pinPainter$draw$1.L$9 = list10;
                        pinPainter$draw$1.L$10 = byb0Var;
                        pinPainter$draw$1.L$11 = obj4;
                        pinPainter$draw$1.L$12 = list12;
                        pinPainter$draw$1.Z$0 = z6;
                        pinPainter$draw$1.Z$1 = z5;
                        pinPainter$draw$1.label = 5;
                        if (h(list10, pinPainter$draw$1) == obj3) {
                            return obj3;
                        }
                        pinPainter$draw$1.L$0 = obj4;
                        pinPainter$draw$1.L$1 = obj4;
                        pinPainter$draw$1.L$2 = obj4;
                        pinPainter$draw$1.L$3 = obj4;
                        pinPainter$draw$1.L$4 = obj4;
                        pinPainter$draw$1.L$5 = obj4;
                        pinPainter$draw$1.L$6 = obj4;
                        pinPainter$draw$1.L$7 = obj4;
                        pinPainter$draw$1.L$8 = set2;
                        pinPainter$draw$1.L$9 = obj4;
                        pinPainter$draw$1.L$10 = byb0Var;
                        pinPainter$draw$1.L$11 = obj4;
                        pinPainter$draw$1.L$12 = list12;
                        pinPainter$draw$1.Z$0 = z6;
                        pinPainter$draw$1.Z$1 = z5;
                        pinPainter$draw$1.label = 6;
                        if (f(list10, pinPainter$draw$1) == obj3) {
                            return obj3;
                        }
                        set3 = set2;
                        pinPainter$draw$1.L$0 = obj4;
                        pinPainter$draw$1.L$1 = obj4;
                        pinPainter$draw$1.L$2 = obj4;
                        pinPainter$draw$1.L$3 = obj4;
                        pinPainter$draw$1.L$4 = obj4;
                        pinPainter$draw$1.L$5 = obj4;
                        pinPainter$draw$1.L$6 = obj4;
                        pinPainter$draw$1.L$7 = obj4;
                        pinPainter$draw$1.L$8 = obj4;
                        pinPainter$draw$1.L$9 = obj4;
                        pinPainter$draw$1.L$10 = byb0Var;
                        pinPainter$draw$1.L$11 = obj4;
                        pinPainter$draw$1.L$12 = obj4;
                        pinPainter$draw$1.Z$0 = z6;
                        pinPainter$draw$1.Z$1 = z5;
                        pinPainter$draw$1.label = 7;
                        return a(list12, set3, pinPainter$draw$1) != obj3 ? obj3 : byb0Var;
                    case 1:
                        boolean z7 = pinPainter$draw$1.Z$1;
                        z4 = pinPainter$draw$1.Z$0;
                        Set set4 = (Set) pinPainter$draw$1.L$8;
                        set = (Set) pinPainter$draw$1.L$7;
                        Map map5 = (Map) pinPainter$draw$1.L$6;
                        map4 = (Map) pinPainter$draw$1.L$5;
                        List list16 = (List) pinPainter$draw$1.L$4;
                        list7 = (List) pinPainter$draw$1.L$1;
                        b.b(obj5);
                        obj = obj5;
                        z3 = z7;
                        list6 = list16;
                        set2 = set4;
                        map3 = map5;
                        List list132 = (List) obj;
                        if (z3) {
                        }
                        if (this.k) {
                        }
                        obj7 = null;
                        pinPainter$draw$1.L$0 = null;
                        pinPainter$draw$1.L$1 = list7;
                        pinPainter$draw$1.L$2 = null;
                        pinPainter$draw$1.L$3 = null;
                        pinPainter$draw$1.L$4 = null;
                        pinPainter$draw$1.L$5 = map4;
                        pinPainter$draw$1.L$6 = null;
                        pinPainter$draw$1.L$7 = null;
                        pinPainter$draw$1.L$8 = set2;
                        pinPainter$draw$1.L$9 = list132;
                        pinPainter$draw$1.L$10 = byb0Var;
                        pinPainter$draw$1.L$11 = null;
                        pinPainter$draw$1.Z$0 = z4;
                        pinPainter$draw$1.Z$1 = z3;
                        pinPainter$draw$1.label = 2;
                        g = g(list9, map3, set, pinPainter$draw$1);
                        obj3 = obj2;
                        if (g != obj3) {
                        }
                        break;
                    case 2:
                        z5 = pinPainter$draw$1.Z$1;
                        z4 = pinPainter$draw$1.Z$0;
                        byb0 byb0Var2 = (byb0) pinPainter$draw$1.L$10;
                        list10 = (List) pinPainter$draw$1.L$9;
                        set2 = (Set) pinPainter$draw$1.L$8;
                        map4 = (Map) pinPainter$draw$1.L$5;
                        list11 = (List) pinPainter$draw$1.L$1;
                        b.b(obj5);
                        obj3 = obj6;
                        byb0Var = byb0Var2;
                        pinPainter$draw$1.L$0 = obj7;
                        pinPainter$draw$1.L$1 = obj7;
                        pinPainter$draw$1.L$2 = obj7;
                        pinPainter$draw$1.L$3 = obj7;
                        pinPainter$draw$1.L$4 = obj7;
                        pinPainter$draw$1.L$5 = map4;
                        pinPainter$draw$1.L$6 = obj7;
                        pinPainter$draw$1.L$7 = obj7;
                        pinPainter$draw$1.L$8 = set2;
                        pinPainter$draw$1.L$9 = list10;
                        pinPainter$draw$1.L$10 = byb0Var;
                        pinPainter$draw$1.L$11 = obj7;
                        pinPainter$draw$1.Z$0 = z4;
                        pinPainter$draw$1.Z$1 = z5;
                        pinPainter$draw$1.label = 3;
                        if (e(list11, pinPainter$draw$1) == obj3) {
                        }
                        arrayList = new ArrayList();
                        while (r1.hasNext()) {
                        }
                        obj4 = null;
                        pinPainter$draw$1.L$0 = null;
                        pinPainter$draw$1.L$1 = null;
                        pinPainter$draw$1.L$2 = null;
                        pinPainter$draw$1.L$3 = null;
                        pinPainter$draw$1.L$4 = null;
                        pinPainter$draw$1.L$5 = null;
                        pinPainter$draw$1.L$6 = null;
                        pinPainter$draw$1.L$7 = null;
                        pinPainter$draw$1.L$8 = set2;
                        pinPainter$draw$1.L$9 = list10;
                        pinPainter$draw$1.L$10 = byb0Var;
                        pinPainter$draw$1.L$11 = null;
                        pinPainter$draw$1.L$12 = arrayList;
                        pinPainter$draw$1.Z$0 = z4;
                        pinPainter$draw$1.Z$1 = z5;
                        pinPainter$draw$1.label = 4;
                        if (b(arrayList, map4, pinPainter$draw$1) == obj3) {
                        }
                        break;
                    case 3:
                        z5 = pinPainter$draw$1.Z$1;
                        z4 = pinPainter$draw$1.Z$0;
                        byb0 byb0Var3 = (byb0) pinPainter$draw$1.L$10;
                        list10 = (List) pinPainter$draw$1.L$9;
                        set2 = (Set) pinPainter$draw$1.L$8;
                        map4 = (Map) pinPainter$draw$1.L$5;
                        b.b(obj5);
                        obj3 = obj6;
                        byb0Var = byb0Var3;
                        arrayList = new ArrayList();
                        while (r1.hasNext()) {
                        }
                        obj4 = null;
                        pinPainter$draw$1.L$0 = null;
                        pinPainter$draw$1.L$1 = null;
                        pinPainter$draw$1.L$2 = null;
                        pinPainter$draw$1.L$3 = null;
                        pinPainter$draw$1.L$4 = null;
                        pinPainter$draw$1.L$5 = null;
                        pinPainter$draw$1.L$6 = null;
                        pinPainter$draw$1.L$7 = null;
                        pinPainter$draw$1.L$8 = set2;
                        pinPainter$draw$1.L$9 = list10;
                        pinPainter$draw$1.L$10 = byb0Var;
                        pinPainter$draw$1.L$11 = null;
                        pinPainter$draw$1.L$12 = arrayList;
                        pinPainter$draw$1.Z$0 = z4;
                        pinPainter$draw$1.Z$1 = z5;
                        pinPainter$draw$1.label = 4;
                        if (b(arrayList, map4, pinPainter$draw$1) == obj3) {
                        }
                        break;
                    case 4:
                        z5 = pinPainter$draw$1.Z$1;
                        z6 = pinPainter$draw$1.Z$0;
                        list12 = (List) pinPainter$draw$1.L$12;
                        byb0 byb0Var4 = (byb0) pinPainter$draw$1.L$10;
                        list10 = (List) pinPainter$draw$1.L$9;
                        set2 = (Set) pinPainter$draw$1.L$8;
                        b.b(obj5);
                        obj3 = obj6;
                        byb0Var = byb0Var4;
                        obj4 = null;
                        pinPainter$draw$1.L$0 = obj4;
                        pinPainter$draw$1.L$1 = obj4;
                        pinPainter$draw$1.L$2 = obj4;
                        pinPainter$draw$1.L$3 = obj4;
                        pinPainter$draw$1.L$4 = obj4;
                        pinPainter$draw$1.L$5 = obj4;
                        pinPainter$draw$1.L$6 = obj4;
                        pinPainter$draw$1.L$7 = obj4;
                        pinPainter$draw$1.L$8 = set2;
                        pinPainter$draw$1.L$9 = list10;
                        pinPainter$draw$1.L$10 = byb0Var;
                        pinPainter$draw$1.L$11 = obj4;
                        pinPainter$draw$1.L$12 = list12;
                        pinPainter$draw$1.Z$0 = z6;
                        pinPainter$draw$1.Z$1 = z5;
                        pinPainter$draw$1.label = 5;
                        if (h(list10, pinPainter$draw$1) == obj3) {
                        }
                        pinPainter$draw$1.L$0 = obj4;
                        pinPainter$draw$1.L$1 = obj4;
                        pinPainter$draw$1.L$2 = obj4;
                        pinPainter$draw$1.L$3 = obj4;
                        pinPainter$draw$1.L$4 = obj4;
                        pinPainter$draw$1.L$5 = obj4;
                        pinPainter$draw$1.L$6 = obj4;
                        pinPainter$draw$1.L$7 = obj4;
                        pinPainter$draw$1.L$8 = set2;
                        pinPainter$draw$1.L$9 = obj4;
                        pinPainter$draw$1.L$10 = byb0Var;
                        pinPainter$draw$1.L$11 = obj4;
                        pinPainter$draw$1.L$12 = list12;
                        pinPainter$draw$1.Z$0 = z6;
                        pinPainter$draw$1.Z$1 = z5;
                        pinPainter$draw$1.label = 6;
                        if (f(list10, pinPainter$draw$1) == obj3) {
                        }
                        break;
                    case 5:
                        z5 = pinPainter$draw$1.Z$1;
                        z6 = pinPainter$draw$1.Z$0;
                        list12 = (List) pinPainter$draw$1.L$12;
                        byb0 byb0Var5 = (byb0) pinPainter$draw$1.L$10;
                        list10 = (List) pinPainter$draw$1.L$9;
                        set2 = (Set) pinPainter$draw$1.L$8;
                        b.b(obj5);
                        obj3 = obj6;
                        byb0Var = byb0Var5;
                        obj4 = null;
                        pinPainter$draw$1.L$0 = obj4;
                        pinPainter$draw$1.L$1 = obj4;
                        pinPainter$draw$1.L$2 = obj4;
                        pinPainter$draw$1.L$3 = obj4;
                        pinPainter$draw$1.L$4 = obj4;
                        pinPainter$draw$1.L$5 = obj4;
                        pinPainter$draw$1.L$6 = obj4;
                        pinPainter$draw$1.L$7 = obj4;
                        pinPainter$draw$1.L$8 = set2;
                        pinPainter$draw$1.L$9 = obj4;
                        pinPainter$draw$1.L$10 = byb0Var;
                        pinPainter$draw$1.L$11 = obj4;
                        pinPainter$draw$1.L$12 = list12;
                        pinPainter$draw$1.Z$0 = z6;
                        pinPainter$draw$1.Z$1 = z5;
                        pinPainter$draw$1.label = 6;
                        if (f(list10, pinPainter$draw$1) == obj3) {
                        }
                        break;
                    case 6:
                        z5 = pinPainter$draw$1.Z$1;
                        z6 = pinPainter$draw$1.Z$0;
                        list12 = (List) pinPainter$draw$1.L$12;
                        byb0 byb0Var6 = (byb0) pinPainter$draw$1.L$10;
                        set3 = (Set) pinPainter$draw$1.L$8;
                        b.b(obj5);
                        obj3 = obj6;
                        byb0Var = byb0Var6;
                        obj4 = null;
                        pinPainter$draw$1.L$0 = obj4;
                        pinPainter$draw$1.L$1 = obj4;
                        pinPainter$draw$1.L$2 = obj4;
                        pinPainter$draw$1.L$3 = obj4;
                        pinPainter$draw$1.L$4 = obj4;
                        pinPainter$draw$1.L$5 = obj4;
                        pinPainter$draw$1.L$6 = obj4;
                        pinPainter$draw$1.L$7 = obj4;
                        pinPainter$draw$1.L$8 = obj4;
                        pinPainter$draw$1.L$9 = obj4;
                        pinPainter$draw$1.L$10 = byb0Var;
                        pinPainter$draw$1.L$11 = obj4;
                        pinPainter$draw$1.L$12 = obj4;
                        pinPainter$draw$1.Z$0 = z6;
                        pinPainter$draw$1.Z$1 = z5;
                        pinPainter$draw$1.label = 7;
                        if (a(list12, set3, pinPainter$draw$1) != obj3) {
                        }
                        break;
                    case 7:
                        byb0 byb0Var7 = (byb0) pinPainter$draw$1.L$10;
                        b.b(obj5);
                        return byb0Var7;
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        pinPainter$draw$1 = new PinPainter$draw$1(this, continuationImpl);
        Object obj52 = pinPainter$draw$1.result;
        Object obj62 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pinPainter$draw$1.label;
        wub0 wub0Var2 = this.d;
        Object obj72 = null;
        switch (i) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r15v5, types: [tls] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x009e -> B:24:0x0122). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00ad -> B:24:0x0122). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00af -> B:10:0x00c1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(List list, ContinuationImpl continuationImpl) {
        PinPainter$hidePlacemarks$1 pinPainter$hidePlacemarks$1;
        int i;
        ConcurrencyKt$throttle$1 concurrencyKt$throttle$1;
        int i2;
        Iterator it;
        int i3;
        int i4;
        int i5;
        if (continuationImpl instanceof PinPainter$hidePlacemarks$1) {
            pinPainter$hidePlacemarks$1 = (PinPainter$hidePlacemarks$1) continuationImpl;
            int i6 = pinPainter$hidePlacemarks$1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                pinPainter$hidePlacemarks$1.label = i6 - Integer.MIN_VALUE;
                Object obj = pinPainter$hidePlacemarks$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pinPainter$hidePlacemarks$1.label;
                if (i != 0) {
                    b.b(obj);
                    i2 = 10;
                    concurrencyKt$throttle$1 = new ConcurrencyKt$throttle$1(new Ref$IntRef(), 10, null);
                    it = list.iterator();
                    i3 = 0;
                    i4 = 0;
                    i5 = 0;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i7 = pinPainter$hidePlacemarks$1.I$5;
                    int i8 = pinPainter$hidePlacemarks$1.I$4;
                    int i9 = pinPainter$hidePlacemarks$1.I$3;
                    int i10 = pinPainter$hidePlacemarks$1.I$2;
                    int i11 = pinPainter$hidePlacemarks$1.I$1;
                    int i12 = pinPainter$hidePlacemarks$1.I$0;
                    Iterator it2 = (Iterator) pinPainter$hidePlacemarks$1.L$8;
                    Iterator it3 = (Iterator) pinPainter$hidePlacemarks$1.L$4;
                    ?? r15 = (tls) pinPainter$hidePlacemarks$1.L$2;
                    b.b(obj);
                    ConcurrencyKt$throttle$1 concurrencyKt$throttle$12 = r15;
                    while (it2.hasNext()) {
                        Map.Entry entry = (Map.Entry) it2.next();
                        PlacemarkType placemarkType = (PlacemarkType) entry.getKey();
                        h2c0 h2c0Var = (h2c0) entry.getValue();
                        if (placemarkType == PlacemarkType.LABEL_S || placemarkType == PlacemarkType.LABEL_M) {
                            h2c0Var.g();
                        } else {
                            h2c0Var.setVisible(false);
                        }
                        pinPainter$hidePlacemarks$1.L$0 = null;
                        pinPainter$hidePlacemarks$1.L$1 = null;
                        pinPainter$hidePlacemarks$1.L$2 = concurrencyKt$throttle$12;
                        pinPainter$hidePlacemarks$1.L$3 = null;
                        pinPainter$hidePlacemarks$1.L$4 = it3;
                        pinPainter$hidePlacemarks$1.L$5 = null;
                        pinPainter$hidePlacemarks$1.L$6 = null;
                        pinPainter$hidePlacemarks$1.L$7 = null;
                        pinPainter$hidePlacemarks$1.L$8 = it2;
                        pinPainter$hidePlacemarks$1.L$9 = null;
                        pinPainter$hidePlacemarks$1.L$10 = null;
                        pinPainter$hidePlacemarks$1.L$11 = null;
                        pinPainter$hidePlacemarks$1.I$0 = i12;
                        pinPainter$hidePlacemarks$1.I$1 = i11;
                        pinPainter$hidePlacemarks$1.I$2 = i10;
                        pinPainter$hidePlacemarks$1.I$3 = i9;
                        pinPainter$hidePlacemarks$1.I$4 = i8;
                        pinPainter$hidePlacemarks$1.I$5 = i7;
                        pinPainter$hidePlacemarks$1.I$6 = 0;
                        pinPainter$hidePlacemarks$1.label = 1;
                        if (concurrencyKt$throttle$12.invoke(pinPainter$hidePlacemarks$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    int i13 = i10;
                    i5 = i9;
                    i4 = i13;
                    i3 = i11;
                    i2 = i12;
                    it = it3;
                    concurrencyKt$throttle$1 = concurrencyKt$throttle$12;
                    if (it.hasNext()) {
                        mwb0 mwb0Var = ((qzb0) it.next()).a;
                        wub0 wub0Var = this.d;
                        Object obj2 = wub0Var.b.get(mwb0Var);
                        PinVisualState pinVisualState = PinVisualState.INVISIBLE;
                        if (obj2 != pinVisualState) {
                            wub0Var.b(mwb0Var, pinVisualState);
                            Map map = (Map) this.e.b.get(mwb0Var);
                            if (map != null) {
                                int i14 = i5;
                                i10 = i4;
                                i9 = i14;
                                it3 = it;
                                concurrencyKt$throttle$12 = concurrencyKt$throttle$1;
                                i12 = i2;
                                i7 = 0;
                                it2 = map.entrySet().iterator();
                                i11 = i3;
                                i8 = 0;
                                while (it2.hasNext()) {
                                }
                                int i132 = i10;
                                i5 = i9;
                                i4 = i132;
                                i3 = i11;
                                i2 = i12;
                                it = it3;
                                concurrencyKt$throttle$1 = concurrencyKt$throttle$12;
                            }
                        }
                        if (it.hasNext()) {
                            return zy11.a;
                        }
                    }
                }
            }
        }
        pinPainter$hidePlacemarks$1 = new PinPainter$hidePlacemarks$1(this, continuationImpl);
        Object obj3 = pinPainter$hidePlacemarks$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pinPainter$hidePlacemarks$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r6v13, types: [tls] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x010f -> B:10:0x0078). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0123 -> B:11:0x007a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0176 -> B:12:0x0179). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00dd -> B:13:0x00f3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00c3 -> B:25:0x0187). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(List list, ContinuationImpl continuationImpl) {
        PinPainter$refreshClusterIcons$1 pinPainter$refreshClusterIcons$1;
        int i;
        ConcurrencyKt$throttle$1 concurrencyKt$throttle$1;
        int i2;
        Iterator it;
        int i3;
        int i4;
        int i5;
        Map map;
        if (continuationImpl instanceof PinPainter$refreshClusterIcons$1) {
            pinPainter$refreshClusterIcons$1 = (PinPainter$refreshClusterIcons$1) continuationImpl;
            int i6 = pinPainter$refreshClusterIcons$1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                pinPainter$refreshClusterIcons$1.label = i6 - Integer.MIN_VALUE;
                Object obj = pinPainter$refreshClusterIcons$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pinPainter$refreshClusterIcons$1.label;
                if (i != 0) {
                    b.b(obj);
                    i2 = 10;
                    concurrencyKt$throttle$1 = new ConcurrencyKt$throttle$1(new Ref$IntRef(), 10, null);
                    it = list.iterator();
                    i3 = 0;
                    i4 = 0;
                    i5 = 0;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i7 = pinPainter$refreshClusterIcons$1.I$5;
                    int i8 = pinPainter$refreshClusterIcons$1.I$4;
                    int i9 = pinPainter$refreshClusterIcons$1.I$3;
                    int i10 = pinPainter$refreshClusterIcons$1.I$2;
                    int i11 = pinPainter$refreshClusterIcons$1.I$1;
                    int i12 = pinPainter$refreshClusterIcons$1.I$0;
                    Iterator it2 = (Iterator) pinPainter$refreshClusterIcons$1.L$11;
                    mwb0 mwb0Var = (mwb0) pinPainter$refreshClusterIcons$1.L$7;
                    zxb0 zxb0Var = (zxb0) pinPainter$refreshClusterIcons$1.L$6;
                    Iterator it3 = (Iterator) pinPainter$refreshClusterIcons$1.L$4;
                    ?? r6 = (tls) pinPainter$refreshClusterIcons$1.L$2;
                    b.b(obj);
                    ConcurrencyKt$throttle$1 concurrencyKt$throttle$12 = r6;
                    CoroutineSingletons coroutineSingletons2 = coroutineSingletons;
                    int i13 = i8;
                    ConcurrencyKt$throttle$1 concurrencyKt$throttle$13 = concurrencyKt$throttle$12;
                    ConcurrencyKt$throttle$1 concurrencyKt$throttle$14 = concurrencyKt$throttle$13;
                    i8 = i13;
                    coroutineSingletons = coroutineSingletons2;
                    ConcurrencyKt$throttle$1 concurrencyKt$throttle$15 = concurrencyKt$throttle$14;
                    if (it2.hasNext()) {
                        Map.Entry entry = (Map.Entry) it2.next();
                        PlacemarkType placemarkType = (PlacemarkType) entry.getKey();
                        h2c0 h2c0Var = (h2c0) entry.getValue();
                        concurrencyKt$throttle$12 = concurrencyKt$throttle$15;
                        if (h2c0Var.c()) {
                            CoroutineSingletons coroutineSingletons3 = coroutineSingletons;
                            boolean z = zxb0Var.e;
                            int i14 = i7;
                            c3c0 c3c0Var = zxb0Var.d;
                            int i15 = i8;
                            qub0 qub0Var = this.a;
                            f2c0 b = qub0Var.b(mwb0Var, placemarkType, z, c3c0Var);
                            if (b == null) {
                                i7 = i14;
                                coroutineSingletons2 = coroutineSingletons3;
                                i13 = i15;
                                concurrencyKt$throttle$13 = concurrencyKt$throttle$15;
                                ConcurrencyKt$throttle$1 concurrencyKt$throttle$142 = concurrencyKt$throttle$13;
                                i8 = i13;
                                coroutineSingletons = coroutineSingletons2;
                                ConcurrencyKt$throttle$1 concurrencyKt$throttle$152 = concurrencyKt$throttle$142;
                                if (it2.hasNext()) {
                                    CoroutineSingletons coroutineSingletons4 = coroutineSingletons;
                                    it = it3;
                                    concurrencyKt$throttle$1 = concurrencyKt$throttle$152;
                                    i5 = i9;
                                    int i16 = i10;
                                    i3 = i11;
                                    i2 = i12;
                                    coroutineSingletons = coroutineSingletons4;
                                    i4 = i16;
                                    if (it.hasNext()) {
                                        zxb0 zxb0Var2 = (zxb0) it.next();
                                        mwb0 mwb0Var2 = zxb0Var2.a.a;
                                        if ((mwb0Var2 instanceof g8c) && (map = (Map) this.e.b.get(mwb0Var2)) != null) {
                                            s7c s7cVar = ((g8c) mwb0Var2).b;
                                            wub0 wub0Var = this.f;
                                            if (!jl40.l(wub0Var.b.get(mwb0Var2), s7cVar)) {
                                                wub0Var.b(mwb0Var2, s7cVar);
                                                i12 = i2;
                                                zxb0Var = zxb0Var2;
                                                mwb0Var = mwb0Var2;
                                                it2 = map.entrySet().iterator();
                                                it3 = it;
                                                i11 = i3;
                                                i10 = i4;
                                                i9 = i5;
                                                i8 = 0;
                                                concurrencyKt$throttle$152 = concurrencyKt$throttle$1;
                                                i7 = 0;
                                                if (it2.hasNext()) {
                                                }
                                            }
                                        }
                                        i16 = i4;
                                        coroutineSingletons4 = coroutineSingletons;
                                        coroutineSingletons = coroutineSingletons4;
                                        i4 = i16;
                                        if (it.hasNext()) {
                                            return zy11.a;
                                        }
                                    }
                                }
                            } else {
                                h2c0Var.f(b, new m5v(qub0Var.a(mwb0Var, placemarkType, c3c0Var)));
                                pinPainter$refreshClusterIcons$1.L$0 = null;
                                pinPainter$refreshClusterIcons$1.L$1 = null;
                                pinPainter$refreshClusterIcons$1.L$2 = concurrencyKt$throttle$152;
                                pinPainter$refreshClusterIcons$1.L$3 = null;
                                pinPainter$refreshClusterIcons$1.L$4 = it3;
                                pinPainter$refreshClusterIcons$1.L$5 = null;
                                pinPainter$refreshClusterIcons$1.L$6 = zxb0Var;
                                pinPainter$refreshClusterIcons$1.L$7 = mwb0Var;
                                pinPainter$refreshClusterIcons$1.L$8 = null;
                                pinPainter$refreshClusterIcons$1.L$9 = null;
                                pinPainter$refreshClusterIcons$1.L$10 = null;
                                pinPainter$refreshClusterIcons$1.L$11 = it2;
                                pinPainter$refreshClusterIcons$1.L$12 = null;
                                pinPainter$refreshClusterIcons$1.L$13 = null;
                                pinPainter$refreshClusterIcons$1.L$14 = null;
                                pinPainter$refreshClusterIcons$1.L$15 = null;
                                pinPainter$refreshClusterIcons$1.L$16 = null;
                                pinPainter$refreshClusterIcons$1.I$0 = i12;
                                pinPainter$refreshClusterIcons$1.I$1 = i11;
                                pinPainter$refreshClusterIcons$1.I$2 = i10;
                                pinPainter$refreshClusterIcons$1.I$3 = i9;
                                i13 = i15;
                                pinPainter$refreshClusterIcons$1.I$4 = i13;
                                i7 = i14;
                                pinPainter$refreshClusterIcons$1.I$5 = i7;
                                pinPainter$refreshClusterIcons$1.I$6 = 0;
                                pinPainter$refreshClusterIcons$1.label = 1;
                                Object invoke = concurrencyKt$throttle$152.invoke(pinPainter$refreshClusterIcons$1);
                                coroutineSingletons2 = coroutineSingletons3;
                                concurrencyKt$throttle$142 = concurrencyKt$throttle$152;
                                if (invoke == coroutineSingletons2) {
                                    return coroutineSingletons2;
                                }
                                i8 = i13;
                                coroutineSingletons = coroutineSingletons2;
                                ConcurrencyKt$throttle$1 concurrencyKt$throttle$1522 = concurrencyKt$throttle$142;
                                if (it2.hasNext()) {
                                }
                            }
                        }
                        CoroutineSingletons coroutineSingletons22 = coroutineSingletons;
                        int i132 = i8;
                        ConcurrencyKt$throttle$1 concurrencyKt$throttle$132 = concurrencyKt$throttle$12;
                        ConcurrencyKt$throttle$1 concurrencyKt$throttle$1422 = concurrencyKt$throttle$132;
                        i8 = i132;
                        coroutineSingletons = coroutineSingletons22;
                        ConcurrencyKt$throttle$1 concurrencyKt$throttle$15222 = concurrencyKt$throttle$1422;
                        if (it2.hasNext()) {
                        }
                    }
                }
            }
        }
        pinPainter$refreshClusterIcons$1 = new PinPainter$refreshClusterIcons$1(this, continuationImpl);
        Object obj2 = pinPainter$refreshClusterIcons$1.result;
        CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pinPainter$refreshClusterIcons$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x014c -> B:10:0x014f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00ce -> B:28:0x015a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00d0 -> B:11:0x00e4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(List list, Map map, Set set, ContinuationImpl continuationImpl) {
        PinPainter$removePlacemarks$1 pinPainter$removePlacemarks$1;
        int i;
        tls concurrencyKt$throttle$1;
        int i2;
        int i3;
        int i4;
        int i5;
        Iterator it;
        PinPainter$removePlacemarks$1 pinPainter$removePlacemarks$12;
        Map map2;
        Set set2;
        CoroutineSingletons coroutineSingletons;
        a aVar = this;
        if (continuationImpl instanceof PinPainter$removePlacemarks$1) {
            pinPainter$removePlacemarks$1 = (PinPainter$removePlacemarks$1) continuationImpl;
            int i6 = pinPainter$removePlacemarks$1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                pinPainter$removePlacemarks$1.label = i6 - Integer.MIN_VALUE;
                Object obj = pinPainter$removePlacemarks$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pinPainter$removePlacemarks$1.label;
                if (i != 0) {
                    b.b(obj);
                    concurrencyKt$throttle$1 = new ConcurrencyKt$throttle$1(new Ref$IntRef(), 10, null);
                    i2 = 10;
                    i3 = 0;
                    i4 = 0;
                    i5 = 0;
                    it = list.iterator();
                    pinPainter$removePlacemarks$12 = pinPainter$removePlacemarks$1;
                    map2 = map;
                    set2 = set;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i7 = pinPainter$removePlacemarks$1.I$5;
                    int i8 = pinPainter$removePlacemarks$1.I$4;
                    int i9 = pinPainter$removePlacemarks$1.I$3;
                    int i10 = pinPainter$removePlacemarks$1.I$2;
                    int i11 = pinPainter$removePlacemarks$1.I$1;
                    int i12 = pinPainter$removePlacemarks$1.I$0;
                    Iterator it2 = (Iterator) pinPainter$removePlacemarks$1.L$11;
                    Point point = (Point) pinPainter$removePlacemarks$1.L$9;
                    mwb0 mwb0Var = (mwb0) pinPainter$removePlacemarks$1.L$8;
                    Iterator it3 = (Iterator) pinPainter$removePlacemarks$1.L$6;
                    concurrencyKt$throttle$1 = (tls) pinPainter$removePlacemarks$1.L$4;
                    Set set3 = (Set) pinPainter$removePlacemarks$1.L$2;
                    Map map3 = (Map) pinPainter$removePlacemarks$1.L$1;
                    b.b(obj);
                    map2 = map3;
                    if (it2.hasNext()) {
                        h2c0 h2c0Var = (h2c0) ((Map.Entry) it2.next()).getValue();
                        if (set3.contains(mwb0Var)) {
                            coroutineSingletons = coroutineSingletons2;
                            h2c0Var.e(false);
                        } else {
                            coroutineSingletons = coroutineSingletons2;
                            if (point != null && h2c0Var.c()) {
                                h2c0Var.d(point);
                            }
                            h2c0Var.e(true);
                        }
                        pinPainter$removePlacemarks$1.L$0 = null;
                        pinPainter$removePlacemarks$1.L$1 = map2;
                        pinPainter$removePlacemarks$1.L$2 = set3;
                        pinPainter$removePlacemarks$1.L$3 = null;
                        pinPainter$removePlacemarks$1.L$4 = concurrencyKt$throttle$1;
                        pinPainter$removePlacemarks$1.L$5 = null;
                        pinPainter$removePlacemarks$1.L$6 = it3;
                        pinPainter$removePlacemarks$1.L$7 = null;
                        pinPainter$removePlacemarks$1.L$8 = mwb0Var;
                        pinPainter$removePlacemarks$1.L$9 = point;
                        pinPainter$removePlacemarks$1.L$10 = null;
                        pinPainter$removePlacemarks$1.L$11 = it2;
                        pinPainter$removePlacemarks$1.L$12 = null;
                        pinPainter$removePlacemarks$1.L$13 = null;
                        pinPainter$removePlacemarks$1.I$0 = i12;
                        pinPainter$removePlacemarks$1.I$1 = i11;
                        pinPainter$removePlacemarks$1.I$2 = i10;
                        pinPainter$removePlacemarks$1.I$3 = i9;
                        pinPainter$removePlacemarks$1.I$4 = i8;
                        pinPainter$removePlacemarks$1.I$5 = i7;
                        pinPainter$removePlacemarks$1.I$6 = 0;
                        pinPainter$removePlacemarks$1.label = 1;
                        coroutineSingletons2 = coroutineSingletons;
                        if (concurrencyKt$throttle$1.invoke(pinPainter$removePlacemarks$1) == coroutineSingletons2) {
                            return coroutineSingletons2;
                        }
                        if (it2.hasNext()) {
                            int i13 = i10;
                            i5 = i9;
                            i4 = i13;
                            it = it3;
                            i3 = i11;
                            pinPainter$removePlacemarks$12 = pinPainter$removePlacemarks$1;
                            set2 = set3;
                            i2 = i12;
                            aVar = this;
                            if (it.hasNext()) {
                                mwb0 mwb0Var2 = (mwb0) it.next();
                                aVar.d.b(mwb0Var2, PinVisualState.INVISIBLE);
                                aVar.f.b.remove(mwb0Var2);
                                Point point2 = (Point) map2.get(mwb0Var2);
                                Map map4 = (Map) aVar.e.b.remove(mwb0Var2);
                                if (map4 != null) {
                                    it2 = map4.entrySet().iterator();
                                    int i14 = i5;
                                    i10 = i4;
                                    i9 = i14;
                                    mwb0Var = mwb0Var2;
                                    point = point2;
                                    i12 = i2;
                                    i11 = i3;
                                    i8 = 0;
                                    set3 = set2;
                                    pinPainter$removePlacemarks$1 = pinPainter$removePlacemarks$12;
                                    it3 = it;
                                    i7 = 0;
                                    if (it2.hasNext()) {
                                    }
                                }
                                aVar = this;
                                if (it.hasNext()) {
                                    return zy11.a;
                                }
                            }
                        }
                    }
                }
            }
        }
        pinPainter$removePlacemarks$1 = new PinPainter$removePlacemarks$1(aVar, continuationImpl);
        Object obj2 = pinPainter$removePlacemarks$1.result;
        CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pinPainter$removePlacemarks$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r5v11, types: [tls] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x011a -> B:10:0x011d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00a4 -> B:24:0x0127). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00ab -> B:11:0x00c2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(List list, ContinuationImpl continuationImpl) {
        PinPainter$updateGeometries$1 pinPainter$updateGeometries$1;
        int i;
        ConcurrencyKt$throttle$1 concurrencyKt$throttle$1;
        int i2;
        Iterator it;
        int i3;
        int i4;
        int i5;
        CoroutineSingletons coroutineSingletons;
        a aVar = this;
        if (continuationImpl instanceof PinPainter$updateGeometries$1) {
            pinPainter$updateGeometries$1 = (PinPainter$updateGeometries$1) continuationImpl;
            int i6 = pinPainter$updateGeometries$1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                pinPainter$updateGeometries$1.label = i6 - Integer.MIN_VALUE;
                Object obj = pinPainter$updateGeometries$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pinPainter$updateGeometries$1.label;
                if (i != 0) {
                    b.b(obj);
                    i2 = 10;
                    concurrencyKt$throttle$1 = new ConcurrencyKt$throttle$1(new Ref$IntRef(), 10, null);
                    it = list.iterator();
                    i3 = 0;
                    i4 = 0;
                    i5 = 0;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i7 = pinPainter$updateGeometries$1.I$5;
                    int i8 = pinPainter$updateGeometries$1.I$4;
                    i5 = pinPainter$updateGeometries$1.I$3;
                    int i9 = pinPainter$updateGeometries$1.I$2;
                    int i10 = pinPainter$updateGeometries$1.I$1;
                    int i11 = pinPainter$updateGeometries$1.I$0;
                    Iterator it2 = (Iterator) pinPainter$updateGeometries$1.L$10;
                    Point point = (Point) pinPainter$updateGeometries$1.L$7;
                    Iterator it3 = (Iterator) pinPainter$updateGeometries$1.L$4;
                    ?? r5 = (tls) pinPainter$updateGeometries$1.L$2;
                    b.b(obj);
                    CoroutineSingletons coroutineSingletons3 = coroutineSingletons2;
                    ConcurrencyKt$throttle$1 concurrencyKt$throttle$12 = r5;
                    coroutineSingletons2 = coroutineSingletons3;
                    ConcurrencyKt$throttle$1 concurrencyKt$throttle$13 = concurrencyKt$throttle$12;
                    if (it2.hasNext()) {
                        h2c0 h2c0Var = (h2c0) it2.next();
                        if (h2c0Var.c()) {
                            coroutineSingletons = coroutineSingletons2;
                            if (!PointExtensionKt.isIdentical$default(h2c0Var.getGeometry(), point, 0.0f, 2, null)) {
                                h2c0Var.d(point);
                            }
                        } else {
                            coroutineSingletons = coroutineSingletons2;
                        }
                        pinPainter$updateGeometries$1.L$0 = null;
                        pinPainter$updateGeometries$1.L$1 = null;
                        pinPainter$updateGeometries$1.L$2 = concurrencyKt$throttle$13;
                        pinPainter$updateGeometries$1.L$3 = null;
                        pinPainter$updateGeometries$1.L$4 = it3;
                        pinPainter$updateGeometries$1.L$5 = null;
                        pinPainter$updateGeometries$1.L$6 = null;
                        pinPainter$updateGeometries$1.L$7 = point;
                        pinPainter$updateGeometries$1.L$8 = null;
                        pinPainter$updateGeometries$1.L$9 = null;
                        pinPainter$updateGeometries$1.L$10 = it2;
                        pinPainter$updateGeometries$1.L$11 = null;
                        pinPainter$updateGeometries$1.L$12 = null;
                        pinPainter$updateGeometries$1.I$0 = i11;
                        pinPainter$updateGeometries$1.I$1 = i10;
                        pinPainter$updateGeometries$1.I$2 = i9;
                        pinPainter$updateGeometries$1.I$3 = i5;
                        pinPainter$updateGeometries$1.I$4 = i8;
                        pinPainter$updateGeometries$1.I$5 = i7;
                        pinPainter$updateGeometries$1.I$6 = 0;
                        pinPainter$updateGeometries$1.label = 1;
                        Object invoke = concurrencyKt$throttle$13.invoke(pinPainter$updateGeometries$1);
                        coroutineSingletons3 = coroutineSingletons;
                        concurrencyKt$throttle$12 = concurrencyKt$throttle$13;
                        if (invoke == coroutineSingletons3) {
                            return coroutineSingletons3;
                        }
                        coroutineSingletons2 = coroutineSingletons3;
                        ConcurrencyKt$throttle$1 concurrencyKt$throttle$132 = concurrencyKt$throttle$12;
                        if (it2.hasNext()) {
                            concurrencyKt$throttle$1 = concurrencyKt$throttle$132;
                            i4 = i9;
                            i2 = i11;
                            CoroutineSingletons coroutineSingletons4 = coroutineSingletons2;
                            aVar = this;
                            coroutineSingletons2 = coroutineSingletons4;
                            i3 = i10;
                            it = it3;
                            if (it.hasNext()) {
                                zxb0 zxb0Var = (zxb0) it.next();
                                Map map = (Map) aVar.e.b.get(zxb0Var.a.a);
                                if (map == null) {
                                    it3 = it;
                                    i10 = i3;
                                    coroutineSingletons4 = coroutineSingletons2;
                                    aVar = this;
                                    coroutineSingletons2 = coroutineSingletons4;
                                    i3 = i10;
                                    it = it3;
                                    if (it.hasNext()) {
                                        return zy11.a;
                                    }
                                } else {
                                    it3 = it;
                                    i11 = i2;
                                    point = zxb0Var.a.c;
                                    it2 = map.values().iterator();
                                    concurrencyKt$throttle$132 = concurrencyKt$throttle$1;
                                    i10 = i3;
                                    i9 = i4;
                                    i7 = 0;
                                    i8 = 0;
                                    if (it2.hasNext()) {
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        pinPainter$updateGeometries$1 = new PinPainter$updateGeometries$1(aVar, continuationImpl);
        Object obj2 = pinPainter$updateGeometries$1.result;
        CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pinPainter$updateGeometries$1.label;
        if (i != 0) {
        }
    }
}
