package io.appmetrica.analytics.idsync.impl;

import defpackage.gw00;
import defpackage.j73;
import defpackage.uza;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.idsync.internal.model.NetworkType;
import io.appmetrica.analytics.idsync.internal.model.Preconditions;
import io.appmetrica.analytics.idsync.internal.model.RequestConfig;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes9.dex */
public final class C implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final k fromModel(RequestConfig requestConfig) {
        k kVar = new k();
        String type = requestConfig.getType();
        Charset charset = uza.a;
        kVar.a = type.getBytes(charset);
        j jVar = new j();
        jVar.a = B.a[requestConfig.getPreconditions().getNetworkType().ordinal()] != 1 ? 0 : 1;
        kVar.b = jVar;
        kVar.c = requestConfig.getUrl().getBytes(charset);
        Map<String, List<String>> headers = requestConfig.getHeaders();
        ArrayList arrayList = new ArrayList(headers.size());
        for (Map.Entry<String, List<String>> entry : headers.entrySet()) {
            String key = entry.getKey();
            List<String> value = entry.getValue();
            i iVar = new i();
            iVar.a = key.getBytes(uza.a);
            int size = value.size();
            byte[][] bArr = new byte[size][];
            for (int i = 0; i < size; i++) {
                bArr[i] = value.get(i).getBytes(uza.a);
            }
            iVar.b = bArr;
            arrayList.add(iVar);
        }
        kVar.d = (i[]) arrayList.toArray(new i[0]);
        kVar.e = requestConfig.getResendIntervalForValidResponse();
        kVar.f = requestConfig.getResendIntervalForInvalidResponse();
        kVar.g = kotlin.collections.a.I0(requestConfig.getValidResponseCodes());
        kVar.h = requestConfig.getReportEventEnabled();
        String reportUrl = requestConfig.getReportUrl();
        if (reportUrl == null) {
            reportUrl = "";
        }
        kVar.i = reportUrl;
        return kVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if (r4 == null) goto L9;
     */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final RequestConfig toModel(k kVar) {
        NetworkType networkType;
        byte[] bArr = kVar.a;
        Charset charset = uza.a;
        String str = new String(bArr, charset);
        j jVar = kVar.b;
        if (jVar != null) {
            if (jVar.a == 1) {
                networkType = NetworkType.CELL;
            } else {
                networkType = NetworkType.ANY;
            }
        }
        networkType = NetworkType.ANY;
        Preconditions preconditions = new Preconditions(networkType);
        String str2 = new String(kVar.c, charset);
        i[] iVarArr = kVar.d;
        int d = gw00.d(iVarArr.length);
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        for (i iVar : iVarArr) {
            String str3 = new String(iVar.a, uza.a);
            byte[][] bArr2 = iVar.b;
            ArrayList arrayList = new ArrayList(bArr2.length);
            for (byte[] bArr3 : bArr2) {
                arrayList.add(new String(bArr3, uza.a));
            }
            Pair pair = new Pair(str3, arrayList);
            linkedHashMap.put(pair.c(), pair.f());
        }
        long j = kVar.e;
        long j2 = kVar.f;
        List b0 = j73.b0(kVar.g);
        boolean z = kVar.h;
        String str4 = kVar.i;
        if (str4.length() <= 0) {
            str4 = null;
        }
        return new RequestConfig(str, str2, preconditions, linkedHashMap, j, j2, b0, z, str4);
    }
}
