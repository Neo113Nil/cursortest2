package com.yandex.passport.internal.badges;

import androidx.core.app.n0;
import com.yandex.passport.data.network.core.q;
import defpackage.i5f;
import defpackage.ome;
import defpackage.pkr;
import defpackage.rhw;
import defpackage.tkr;
import defpackage.v6f;
import defpackage.w4f;
import defpackage.wsd;
import defpackage.x4f;
import java.util.ArrayList;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h extends n0 {
    @Override // androidx.core.app.n0
    /* renamed from: s */
    public final Object x(Object obj, rhw rhwVar) {
        boolean z;
        g gVar = (g) obj;
        i5f i5fVar = q.a;
        String str = gVar.a;
        i5fVar.getClass();
        Map map = (Map) i5fVar.b(new wsd(tkr.a, w4f.Companion.serializer(), 1), str);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            v6f v6fVar = value instanceof v6f ? (v6f) value : null;
            if (v6fVar != null) {
                ome omeVar = x4f.a;
                z = Intrinsics.d(pkr.b(v6fVar.a()), Boolean.TRUE);
            } else {
                z = false;
            }
            if (!z) {
                key = null;
            }
            String str2 = (String) key;
            if (str2 != null) {
                arrayList.add(str2);
            }
        }
        return com.yandex.passport.internal.ui.a.t(gVar.b, CollectionsKt.A0(arrayList));
    }
}
