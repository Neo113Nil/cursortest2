package io.appmetrica.analytics.networkquality.impl;

import defpackage.gw00;
import defpackage.tcc;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.networkquality.internal.NetworkQualityConfigWrapper;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* loaded from: classes9.dex */
public final class l implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final j fromModel(NetworkQualityConfigWrapper networkQualityConfigWrapper) {
        j jVar = new j();
        jVar.a = networkQualityConfigWrapper.getRu.cprocsp.ACSP.tools.config.ConfigConstants.CONFIG java.lang.String().a;
        jVar.b = networkQualityConfigWrapper.getRu.cprocsp.ACSP.tools.config.ConfigConstants.CONFIG java.lang.String().b;
        jVar.c = networkQualityConfigWrapper.getRu.cprocsp.ACSP.tools.config.ConfigConstants.CONFIG java.lang.String().c;
        List<t> list = networkQualityConfigWrapper.getRu.cprocsp.ACSP.tools.config.ConfigConstants.CONFIG java.lang.String().d;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (t tVar : list) {
            i iVar = new i();
            iVar.a = tVar.a;
            iVar.b = tVar.b;
            Set<Map.Entry> entrySet = tVar.c.entrySet();
            ArrayList arrayList2 = new ArrayList(tcc.n(entrySet, 10));
            for (Map.Entry entry : entrySet) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                h hVar = new h();
                hVar.a = str;
                hVar.b = str2;
                arrayList2.add(hVar);
            }
            iVar.c = (h[]) arrayList2.toArray(new h[0]);
            iVar.d = tVar.d;
            iVar.e = tVar.e;
            iVar.f = tVar.f;
            iVar.g = tVar.g;
            iVar.h = tVar.h;
            iVar.i = tVar.i;
            iVar.j = tVar.j;
            iVar.k = tVar.k;
            iVar.l = tVar.l;
            iVar.m = tVar.m;
            arrayList.add(iVar);
        }
        jVar.d = (i[]) arrayList.toArray(new i[0]);
        return jVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final NetworkQualityConfigWrapper toModel(j jVar) {
        NetworkQualityConfigWrapper.Companion companion = NetworkQualityConfigWrapper.INSTANCE;
        boolean z = jVar.a;
        int i = jVar.b;
        int i2 = jVar.c;
        i[] iVarArr = jVar.d;
        ArrayList arrayList = new ArrayList(iVarArr.length);
        int length = iVarArr.length;
        int i3 = 0;
        while (i3 < length) {
            i iVar = iVarArr[i3];
            String str = iVar.a;
            String str2 = iVar.b;
            h[] hVarArr = iVar.c;
            int d = gw00.d(hVarArr.length);
            if (d < 16) {
                d = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(d);
            int length2 = hVarArr.length;
            int i4 = 0;
            while (i4 < length2) {
                h hVar = hVarArr[i4];
                int i5 = length;
                Pair pair = new Pair(hVar.a, hVar.b);
                linkedHashMap.put(pair.c(), pair.f());
                i4++;
                iVarArr = iVarArr;
                length = i5;
            }
            arrayList.add(new t(str, str2, linkedHashMap, iVar.d, iVar.e, iVar.f, iVar.g, iVar.h, iVar.i, iVar.j, iVar.k, iVar.l, iVar.m));
            i3++;
            iVarArr = iVarArr;
            length = length;
        }
        return companion.toWrapper$network_quality_release(new f(z, i, i2, arrayList));
    }
}
