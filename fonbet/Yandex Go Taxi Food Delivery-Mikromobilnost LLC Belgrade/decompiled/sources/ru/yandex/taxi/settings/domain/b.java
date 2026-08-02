package ru.yandex.taxi.settings.domain;

import defpackage.b3g0;
import defpackage.gw00;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tpr;
import defpackage.u3g0;
import defpackage.u8w;
import defpackage.y5r0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class b {
    public final d a;
    public final b3g0 b;

    public b(d dVar, b3g0 b3g0Var) {
        this.a = dVar;
        this.b = b3g0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0089 A[LOOP:1: B:25:0x0083->B:27:0x0089, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        PushSettingsAnalyticsInteractor$reportSettingsShown$1 pushSettingsAnalyticsInteractor$reportSettingsShown$1;
        int i;
        String analyticsName;
        int d;
        Iterator it;
        if (continuationImpl instanceof PushSettingsAnalyticsInteractor$reportSettingsShown$1) {
            pushSettingsAnalyticsInteractor$reportSettingsShown$1 = (PushSettingsAnalyticsInteractor$reportSettingsShown$1) continuationImpl;
            int i2 = pushSettingsAnalyticsInteractor$reportSettingsShown$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pushSettingsAnalyticsInteractor$reportSettingsShown$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pushSettingsAnalyticsInteractor$reportSettingsShown$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pushSettingsAnalyticsInteractor$reportSettingsShown$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    tpr b = this.a.b();
                    pushSettingsAnalyticsInteractor$reportSettingsShown$1.label = 1;
                    obj = kotlinx.coroutines.flow.e.y(b, pushSettingsAnalyticsInteractor$reportSettingsShown$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                List list = ((u3g0) obj).a;
                b3g0 b3g0Var = this.b;
                u8w u8wVar = b3g0Var.a;
                analyticsName = b3g0Var.b.getAnalyticsName();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (obj2 instanceof y5r0) {
                        arrayList.add(obj2);
                    }
                }
                d = gw00.d(tcc.n(arrayList, 10));
                if (d < 16) {
                    d = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(d);
                it = arrayList.iterator();
                while (it.hasNext()) {
                    y5r0 y5r0Var = (y5r0) it.next();
                    Pair pair = new Pair(y5r0Var.j.a, Boolean.valueOf(y5r0Var.i));
                    linkedHashMap.put(pair.c(), pair.f());
                }
                u8wVar.getClass();
                HashMap hashMap = new HashMap();
                if (analyticsName != null) {
                    hashMap.put("open_reason", analyticsName);
                }
                hashMap.put("tags_list", linkedHashMap);
                u8wVar.a.a("PushSettings.Shown", hashMap, 1, new HashMap());
                return zy11.a;
            }
        }
        pushSettingsAnalyticsInteractor$reportSettingsShown$1 = new PushSettingsAnalyticsInteractor$reportSettingsShown$1(this, continuationImpl);
        Object obj3 = pushSettingsAnalyticsInteractor$reportSettingsShown$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pushSettingsAnalyticsInteractor$reportSettingsShown$1.label;
        if (i != 0) {
        }
        List list2 = ((u3g0) obj3).a;
        b3g0 b3g0Var2 = this.b;
        u8w u8wVar2 = b3g0Var2.a;
        analyticsName = b3g0Var2.b.getAnalyticsName();
        ArrayList arrayList2 = new ArrayList();
        while (r7.hasNext()) {
        }
        d = gw00.d(tcc.n(arrayList2, 10));
        if (d < 16) {
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(d);
        it = arrayList2.iterator();
        while (it.hasNext()) {
        }
        u8wVar2.getClass();
        HashMap hashMap2 = new HashMap();
        if (analyticsName != null) {
        }
        hashMap2.put("tags_list", linkedHashMap2);
        u8wVar2.a.a("PushSettings.Shown", hashMap2, 1, new HashMap());
        return zy11.a;
    }
}
