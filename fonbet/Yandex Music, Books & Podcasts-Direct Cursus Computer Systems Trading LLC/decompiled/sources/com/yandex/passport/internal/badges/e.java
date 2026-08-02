package com.yandex.passport.internal.badges;

import android.content.Context;
import androidx.core.app.n0;
import com.yandex.passport.data.network.core.q;
import com.yandex.passport.data.network.d3;
import com.yandex.passport.data.network.g3;
import com.yandex.passport.data.network.v2;
import com.yandex.passport.data.network.y2;
import com.yandex.passport.internal.report.g2;
import com.yandex.passport.internal.report.reporters.k;
import defpackage.c5b;
import defpackage.cg6;
import defpackage.i5f;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.rhw;
import defpackage.tah;
import defpackage.v75;
import defpackage.x97;
import defpackage.xq0;
import defpackage.zhp;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e extends n0 {
    public final Context b;
    public final c c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.yandex.passport.common.coroutine.a aVar, Context context, c cVar) {
        super((kotlinx.coroutines.a) ((com.yandex.passport.common.coroutine.b) aVar).c);
        aVar.getClass();
        context.getClass();
        cVar.getClass();
        this.b = context;
        this.c = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x019a, code lost:
    
        if (r9 == r1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x019c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0052, code lost:
    
        if (r10 == r1) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Serializable u(e eVar, cg6 cg6Var) {
        d dVar;
        int i;
        String str;
        Object obj;
        Iterable iterable;
        a aVar;
        if (cg6Var instanceof d) {
            dVar = (d) cg6Var;
            int i2 = dVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.m = i2 - Integer.MIN_VALUE;
                Object obj2 = dVar.k;
                nm6 nm6Var = nm6.a;
                i = dVar.m;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj2);
                    c cVar = eVar.c;
                    dVar.j = eVar;
                    dVar.m = 1;
                    obj2 = x97.V(((com.yandex.passport.common.coroutine.b) cVar.a).d, new b(cVar, continuation, 0), dVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj2);
                            return c5b.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    eVar = dVar.j;
                    qgg.h0(obj2);
                }
                str = (String) obj2;
                if (str != null) {
                    return c5b.a;
                }
                try {
                    i5f i5fVar = q.a;
                    i5fVar.getClass();
                    d3 d3Var = (d3) i5fVar.b(d3.Companion.serializer(), str);
                    Iterator it = d3Var.b.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        v2 v2Var = (v2) obj;
                        if (Intrinsics.d(v2Var.b, ConstantDeviceInfo.APP_PLATFORM) && Intrinsics.d(v2Var.a, eVar.b.getPackageName())) {
                            break;
                        }
                    }
                    v2 v2Var2 = (v2) obj;
                    if (v2Var2 == null || (iterable = v2Var2.c) == null) {
                        iterable = c5b.a;
                    }
                    List list = d3Var.a;
                    int a = tah.a(v75.o(list, 10));
                    if (a < 16) {
                        a = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(a);
                    for (Object obj3 : list) {
                        linkedHashMap.put(((y2) obj3).a, obj3);
                    }
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = iterable.iterator();
                    while (it2.hasNext()) {
                        y2 y2Var = (y2) linkedHashMap.get((String) it2.next());
                        if (y2Var != null) {
                            HashMap hashMap = y2Var.c;
                            String str2 = y2Var.a;
                            HashMap hashMap2 = y2Var.b;
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap(tah.a(hashMap.size()));
                            for (Map.Entry entry : hashMap.entrySet()) {
                                linkedHashMap2.put(entry.getKey(), ((g3) entry.getValue()).a);
                            }
                            LinkedHashMap linkedHashMap3 = new LinkedHashMap(tah.a(hashMap.size()));
                            for (Map.Entry entry2 : hashMap.entrySet()) {
                                linkedHashMap3.put(entry2.getKey(), ((g3) entry2.getValue()).b);
                            }
                            aVar = new a(str2, hashMap2, linkedHashMap2, linkedHashMap3);
                        } else {
                            aVar = null;
                        }
                        if (aVar != null) {
                            arrayList.add(aVar);
                        }
                    }
                    return arrayList;
                } catch (zhp unused) {
                    c cVar2 = eVar.c;
                    dVar.j = null;
                    dVar.m = 2;
                    k kVar = cVar2.c;
                    kVar.getClass();
                    kVar.p(g2.d);
                    Object V = x97.V(((com.yandex.passport.common.coroutine.b) cVar2.a).d, new b(cVar2, continuation, 2), dVar);
                    if (V != nm6.a) {
                        V = Unit.a;
                    }
                }
            }
        }
        dVar = new d(eVar, cg6Var);
        Object obj22 = dVar.k;
        nm6 nm6Var2 = nm6.a;
        i = dVar.m;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        str = (String) obj22;
        if (str != null) {
        }
    }

    @Override // androidx.core.app.n0
    /* renamed from: s */
    public final Object x(Object obj, rhw rhwVar) {
        return u(this, rhwVar);
    }
}
