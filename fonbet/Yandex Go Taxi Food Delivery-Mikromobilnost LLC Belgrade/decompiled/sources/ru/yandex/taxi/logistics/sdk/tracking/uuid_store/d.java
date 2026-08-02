package ru.yandex.taxi.logistics.sdk.tracking.uuid_store;

import android.content.Context;
import defpackage.fzw;
import defpackage.ha2;
import defpackage.j601;
import defpackage.ny61;
import defpackage.tpg;
import defpackage.tpr;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.o;

/* loaded from: classes9.dex */
public final class d {
    public final b a;

    public d(Context context) {
        this.a = new b(context);
    }

    public final tpr a(UUID uuid) {
        j601 j601Var = b.d;
        b bVar = this.a;
        Context context = bVar.a;
        j601Var.getClass();
        return e.t(new fzw(28, new o(new ha2(19, ((tpg) b.e.getValue(context, j601.a[0])).getData(), bVar), new TrackingLocalUuidPreferences$localUuidsMapFlow$2(3, null)), uuid));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0086, code lost:
    
        if (r11 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00be A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(UUID uuid, String str, ContinuationImpl continuationImpl) {
        TrackingLocalUuidStore$match$1 trackingLocalUuidStore$match$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object a;
        if (continuationImpl instanceof TrackingLocalUuidStore$match$1) {
            trackingLocalUuidStore$match$1 = (TrackingLocalUuidStore$match$1) continuationImpl;
            int i2 = trackingLocalUuidStore$match$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                trackingLocalUuidStore$match$1.label = i2 - Integer.MIN_VALUE;
                Object obj = trackingLocalUuidStore$match$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = trackingLocalUuidStore$match$1.label;
                zy11 zy11Var = zy11.a;
                b bVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    trackingLocalUuidStore$match$1.L$0 = uuid;
                    trackingLocalUuidStore$match$1.L$1 = str;
                    trackingLocalUuidStore$match$1.label = 1;
                    j601 j601Var = b.d;
                    Context context = bVar.a;
                    j601Var.getClass();
                    obj = e.y(new o(new ha2(19, ((tpg) b.e.getValue(context, j601.a[0])).getData(), bVar), new TrackingLocalUuidPreferences$localUuidsMapFlow$2(3, null)), trackingLocalUuidStore$match$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                    }
                    str = (String) trackingLocalUuidStore$match$1.L$1;
                    uuid = (UUID) trackingLocalUuidStore$match$1.L$0;
                    kotlin.b.b(obj);
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap((Map) obj);
                linkedHashMap.put(str, uuid);
                trackingLocalUuidStore$match$1.L$0 = null;
                trackingLocalUuidStore$match$1.L$1 = null;
                trackingLocalUuidStore$match$1.L$2 = null;
                trackingLocalUuidStore$match$1.label = 2;
                j601 j601Var2 = b.d;
                Context context2 = bVar.a;
                j601Var2.getClass();
                a = androidx.datastore.preferences.core.b.a((tpg) b.e.getValue(context2, j601.a[0]), new TrackingLocalUuidPreferences$save$2(bVar, linkedHashMap, null), trackingLocalUuidStore$match$1);
                if (a != coroutineSingletons) {
                    a = zy11Var;
                }
                return a != coroutineSingletons ? coroutineSingletons : zy11Var;
            }
        }
        trackingLocalUuidStore$match$1 = new TrackingLocalUuidStore$match$1(this, continuationImpl);
        Object obj2 = trackingLocalUuidStore$match$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = trackingLocalUuidStore$match$1.label;
        zy11 zy11Var2 = zy11.a;
        b bVar2 = this.a;
        if (i != 0) {
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap((Map) obj2);
        linkedHashMap2.put(str, uuid);
        trackingLocalUuidStore$match$1.L$0 = null;
        trackingLocalUuidStore$match$1.L$1 = null;
        trackingLocalUuidStore$match$1.L$2 = null;
        trackingLocalUuidStore$match$1.label = 2;
        j601 j601Var22 = b.d;
        Context context22 = bVar2.a;
        j601Var22.getClass();
        a = androidx.datastore.preferences.core.b.a((tpg) b.e.getValue(context22, j601.a[0]), new TrackingLocalUuidPreferences$save$2(bVar2, linkedHashMap2, null), trackingLocalUuidStore$match$1);
        if (a != coroutineSingletons) {
        }
        if (a != coroutineSingletons) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0086, code lost:
    
        if (r12 == r1) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00f1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ArrayList arrayList, ArrayList arrayList2, ContinuationImpl continuationImpl) {
        TrackingLocalUuidStore$retain$1 trackingLocalUuidStore$retain$1;
        int i;
        ArrayList arrayList3;
        ArrayList arrayList4;
        Object a;
        if (continuationImpl instanceof TrackingLocalUuidStore$retain$1) {
            trackingLocalUuidStore$retain$1 = (TrackingLocalUuidStore$retain$1) continuationImpl;
            int i2 = trackingLocalUuidStore$retain$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                trackingLocalUuidStore$retain$1.label = i2 - Integer.MIN_VALUE;
                Object obj = trackingLocalUuidStore$retain$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = trackingLocalUuidStore$retain$1.label;
                zy11 zy11Var = zy11.a;
                b bVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    trackingLocalUuidStore$retain$1.L$0 = arrayList;
                    trackingLocalUuidStore$retain$1.L$1 = arrayList2;
                    trackingLocalUuidStore$retain$1.label = 1;
                    j601 j601Var = b.d;
                    Context context = bVar.a;
                    j601Var.getClass();
                    obj = e.y(new o(new ha2(19, ((tpg) b.e.getValue(context, j601.a[0])).getData(), bVar), new TrackingLocalUuidPreferences$localUuidsMapFlow$2(3, null)), trackingLocalUuidStore$retain$1);
                    arrayList4 = arrayList;
                    arrayList3 = arrayList2;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                    }
                    ?? r11 = (List) trackingLocalUuidStore$retain$1.L$1;
                    ?? r10 = (List) trackingLocalUuidStore$retain$1.L$0;
                    kotlin.b.b(obj);
                    arrayList4 = r10;
                    arrayList3 = r11;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    if (arrayList3.contains(entry.getKey()) || arrayList4.contains(entry.getValue())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                trackingLocalUuidStore$retain$1.L$0 = null;
                trackingLocalUuidStore$retain$1.L$1 = null;
                trackingLocalUuidStore$retain$1.L$2 = null;
                trackingLocalUuidStore$retain$1.label = 2;
                j601 j601Var2 = b.d;
                Context context2 = bVar.a;
                j601Var2.getClass();
                a = androidx.datastore.preferences.core.b.a((tpg) b.e.getValue(context2, j601.a[0]), new TrackingLocalUuidPreferences$save$2(bVar, linkedHashMap, null), trackingLocalUuidStore$retain$1);
                if (a != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    a = zy11Var;
                }
                return a != coroutineSingletons ? coroutineSingletons : zy11Var;
            }
        }
        trackingLocalUuidStore$retain$1 = new TrackingLocalUuidStore$retain$1(this, continuationImpl);
        Object obj2 = trackingLocalUuidStore$retain$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = trackingLocalUuidStore$retain$1.label;
        zy11 zy11Var2 = zy11.a;
        b bVar2 = this.a;
        if (i != 0) {
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        while (r12.hasNext()) {
        }
        trackingLocalUuidStore$retain$1.L$0 = null;
        trackingLocalUuidStore$retain$1.L$1 = null;
        trackingLocalUuidStore$retain$1.L$2 = null;
        trackingLocalUuidStore$retain$1.label = 2;
        j601 j601Var22 = b.d;
        Context context22 = bVar2.a;
        j601Var22.getClass();
        a = androidx.datastore.preferences.core.b.a((tpg) b.e.getValue(context22, j601.a[0]), new TrackingLocalUuidPreferences$save$2(bVar2, linkedHashMap2, null), trackingLocalUuidStore$retain$1);
        if (a != CoroutineSingletons.COROUTINE_SUSPENDED) {
        }
        if (a != coroutineSingletons2) {
        }
    }
}
