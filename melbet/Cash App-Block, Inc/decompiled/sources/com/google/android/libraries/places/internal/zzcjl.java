package com.google.android.libraries.places.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class zzcjl {
    public static final zzcls zza;
    public static final zzcji[] zzb;
    public static final Map zzc;

    static {
        zzcls zzclsVar = zzcls.zza;
        zza = zzey.zza(":");
        zzcji zzcjiVar = new zzcji(zzcji.zze, zzey.zza(""));
        zzcls zzclsVar2 = zzcji.zzb;
        zzcji zzcjiVar2 = new zzcji(zzclsVar2, zzey.zza("GET"));
        zzcji zzcjiVar3 = new zzcji(zzclsVar2, zzey.zza("POST"));
        zzcls zzclsVar3 = zzcji.zzc;
        zzcji zzcjiVar4 = new zzcji(zzclsVar3, zzey.zza("/"));
        zzcji zzcjiVar5 = new zzcji(zzclsVar3, zzey.zza("/index.html"));
        zzcls zzclsVar4 = zzcji.zzd;
        zzcji zzcjiVar6 = new zzcji(zzclsVar4, zzey.zza("http"));
        zzcji zzcjiVar7 = new zzcji(zzclsVar4, zzey.zza("https"));
        zzcls zzclsVar5 = zzcji.zza;
        zzb = new zzcji[]{zzcjiVar, zzcjiVar2, zzcjiVar3, zzcjiVar4, zzcjiVar5, zzcjiVar6, zzcjiVar7, new zzcji(zzclsVar5, zzey.zza("200")), new zzcji(zzclsVar5, zzey.zza("204")), new zzcji(zzclsVar5, zzey.zza("206")), new zzcji(zzclsVar5, zzey.zza("304")), new zzcji(zzclsVar5, zzey.zza("400")), new zzcji(zzclsVar5, zzey.zza("404")), new zzcji(zzclsVar5, zzey.zza("500")), new zzcji("accept-charset", ""), new zzcji("accept-encoding", "gzip, deflate"), new zzcji("accept-language", ""), new zzcji("accept-ranges", ""), new zzcji("accept", ""), new zzcji("access-control-allow-origin", ""), new zzcji("age", ""), new zzcji("allow", ""), new zzcji("authorization", ""), new zzcji("cache-control", ""), new zzcji("content-disposition", ""), new zzcji("content-encoding", ""), new zzcji("content-language", ""), new zzcji("content-length", ""), new zzcji("content-location", ""), new zzcji("content-range", ""), new zzcji("content-type", ""), new zzcji("cookie", ""), new zzcji(InquiryField.DateField.TYPE, ""), new zzcji("etag", ""), new zzcji("expect", ""), new zzcji("expires", ""), new zzcji("from", ""), new zzcji("host", ""), new zzcji("if-match", ""), new zzcji("if-modified-since", ""), new zzcji("if-none-match", ""), new zzcji("if-range", ""), new zzcji("if-unmodified-since", ""), new zzcji("last-modified", ""), new zzcji("link", ""), new zzcji("location", ""), new zzcji("max-forwards", ""), new zzcji("proxy-authenticate", ""), new zzcji("proxy-authorization", ""), new zzcji("range", ""), new zzcji("referer", ""), new zzcji("refresh", ""), new zzcji("retry-after", ""), new zzcji("server", ""), new zzcji("set-cookie", ""), new zzcji("strict-transport-security", ""), new zzcji("transfer-encoding", ""), new zzcji("user-agent", ""), new zzcji("vary", ""), new zzcji("via", ""), new zzcji("www-authenticate", "")};
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        int i = 0;
        while (true) {
            zzcji[] zzcjiVarArr = zzb;
            int length = zzcjiVarArr.length;
            if (i >= 61) {
                zzc = Collections.unmodifiableMap(linkedHashMap);
                return;
            } else {
                if (!linkedHashMap.containsKey(zzcjiVarArr[i].zzf)) {
                    linkedHashMap.put(zzcjiVarArr[i].zzf, Integer.valueOf(i));
                }
                i++;
            }
        }
    }

    public static /* synthetic */ void zza(zzcls zzclsVar) {
        int zzj = zzclsVar.zzj();
        for (int i = 0; i < zzj; i++) {
            byte zzi = zzclsVar.zzi(i);
            if (zzi >= 65 && zzi <= 90) {
                a$$ExternalSyntheticBUOutline0.m$4("PROTOCOL_ERROR response malformed: mixed case name: ".concat(zzclsVar.zze()));
                return;
            }
        }
    }
}
