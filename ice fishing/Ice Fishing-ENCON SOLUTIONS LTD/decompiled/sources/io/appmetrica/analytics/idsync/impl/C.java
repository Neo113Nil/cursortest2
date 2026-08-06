package io.appmetrica.analytics.idsync.impl;

import i1.AbstractC0251h;
import i1.AbstractC0252i;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.idsync.internal.model.NetworkType;
import io.appmetrica.analytics.idsync.internal.model.Preconditions;
import io.appmetrica.analytics.idsync.internal.model.RequestConfig;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class C implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final k fromModel(RequestConfig requestConfig) {
        k kVar = new k();
        String type = requestConfig.getType();
        Charset charset = z1.a.f8620a;
        kVar.f4027a = type.getBytes(charset);
        j jVar = new j();
        jVar.f4025a = B.f3974a[requestConfig.getPreconditions().getNetworkType().ordinal()] != 1 ? 0 : 1;
        kVar.f4028b = jVar;
        kVar.f4029c = requestConfig.getUrl().getBytes(charset);
        Map<String, List<String>> headers = requestConfig.getHeaders();
        ArrayList arrayList = new ArrayList(headers.size());
        for (Map.Entry<String, List<String>> entry : headers.entrySet()) {
            String key = entry.getKey();
            List<String> value = entry.getValue();
            i iVar = new i();
            iVar.f4022a = key.getBytes(z1.a.f8620a);
            int size = value.size();
            byte[][] bArr = new byte[size][];
            for (int i2 = 0; i2 < size; i2++) {
                bArr[i2] = value.get(i2).getBytes(z1.a.f8620a);
            }
            iVar.f4023b = bArr;
            arrayList.add(iVar);
        }
        Object[] array = arrayList.toArray(new i[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        kVar.f4030d = (i[]) array;
        kVar.f4031e = requestConfig.getResendIntervalForValidResponse();
        kVar.f4032f = requestConfig.getResendIntervalForInvalidResponse();
        kVar.f4033g = AbstractC0252i.Q(requestConfig.getValidResponseCodes());
        kVar.f4034h = requestConfig.getReportEventEnabled();
        String reportUrl = requestConfig.getReportUrl();
        if (reportUrl == null) {
            reportUrl = "";
        }
        kVar.f4035i = reportUrl;
        return kVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if (r2 == null) goto L9;
     */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final RequestConfig toModel(k kVar) {
        NetworkType networkType;
        byte[] bArr = kVar.f4027a;
        Charset charset = z1.a.f8620a;
        String str = new String(bArr, charset);
        j jVar = kVar.f4028b;
        if (jVar != null) {
            if (jVar.f4025a == 1) {
                networkType = NetworkType.CELL;
            } else {
                networkType = NetworkType.ANY;
            }
        }
        networkType = NetworkType.ANY;
        Preconditions preconditions = new Preconditions(networkType);
        String str2 = new String(kVar.f4029c, charset);
        i[] iVarArr = kVar.f4030d;
        int G = i1.v.G(iVarArr.length);
        if (G < 16) {
            G = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(G);
        for (i iVar : iVarArr) {
            String str3 = new String(iVar.f4022a, z1.a.f8620a);
            byte[][] bArr2 = iVar.f4023b;
            ArrayList arrayList = new ArrayList(bArr2.length);
            for (byte[] bArr3 : bArr2) {
                arrayList.add(new String(bArr3, z1.a.f8620a));
            }
            linkedHashMap.put(str3, arrayList);
        }
        long j2 = kVar.f4031e;
        long j3 = kVar.f4032f;
        List T2 = AbstractC0251h.T(kVar.f4033g);
        boolean z2 = kVar.f4034h;
        String str4 = kVar.f4035i;
        if (str4.length() <= 0) {
            str4 = null;
        }
        return new RequestConfig(str, str2, preconditions, linkedHashMap, j2, j3, T2, z2, str4);
    }
}
