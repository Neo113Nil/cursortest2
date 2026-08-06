package io.appmetrica.analytics.idsync.impl;

import i1.AbstractC0252i;
import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.coreutils.internal.parsing.RemoteConfigJsonUtils;
import io.appmetrica.analytics.idsync.internal.model.IdSyncConfig;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.idsync.impl.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0258c implements JsonParser {

    /* renamed from: a, reason: collision with root package name */
    public final C0260e f3994a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3995b = "id_sync";

    /* renamed from: c, reason: collision with root package name */
    public final String f3996c = "id_sync";

    /* renamed from: d, reason: collision with root package name */
    public final String f3997d = "launch_delay_seconds";

    /* renamed from: e, reason: collision with root package name */
    public final String f3998e = "requests";

    /* renamed from: f, reason: collision with root package name */
    public final String f3999f = "type";

    /* renamed from: g, reason: collision with root package name */
    public final String f4000g = "url";

    /* renamed from: h, reason: collision with root package name */
    public final String f4001h = "headers";

    /* renamed from: i, reason: collision with root package name */
    public final String f4002i = "resend_interval_for_valid_response";

    /* renamed from: j, reason: collision with root package name */
    public final String f4003j = "resend_interval_for_invalid_response";

    /* renamed from: k, reason: collision with root package name */
    public final String f4004k = "valid_response_codes";

    /* renamed from: l, reason: collision with root package name */
    public final String f4005l = "preconditions";

    /* renamed from: m, reason: collision with root package name */
    public final String f4006m = "network";

    /* renamed from: n, reason: collision with root package name */
    public final String f4007n = "cell";

    /* renamed from: o, reason: collision with root package name */
    public final String f4008o = "report_event_enabled";

    /* renamed from: p, reason: collision with root package name */
    public final String f4009p = "report_url";

    public C0258c(C0260e c0260e) {
        this.f3994a = c0260e;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final IdSyncConfig parse(JSONObject jSONObject) {
        k[] kVarArr;
        JSONArray jSONArray;
        int i2;
        i[] iVarArr;
        JSONArray jSONArray2;
        int i3;
        JSONObject jSONObject2;
        byte[][] bArr;
        int[] iArr;
        int[] iArr2;
        int i4;
        JSONObject optJSONObject = jSONObject.optJSONObject(this.f3996c);
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        m mVar = new m();
        mVar.f4042a = RemoteConfigJsonUtils.extractFeature(jSONObject, this.f3995b, mVar.f4042a);
        l lVar = new l();
        lVar.f4037a = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(optJSONObject, this.f3997d, lVar.f4037a);
        JSONArray optJSONArray = optJSONObject.optJSONArray(this.f3998e);
        int i5 = 0;
        if (optJSONArray == null) {
            kVarArr = new k[0];
        } else {
            int length = optJSONArray.length();
            k[] kVarArr2 = new k[length];
            int i6 = 0;
            while (i6 < length) {
                JSONObject optJSONObject2 = optJSONArray.optJSONObject(i6);
                k kVar = new k();
                if (optJSONObject2 == null) {
                    jSONArray = optJSONArray;
                    i2 = length;
                    i4 = i5;
                } else {
                    String optString = optJSONObject2.optString(this.f3999f);
                    Charset charset = z1.a.f8620a;
                    kVar.f4027a = optString.getBytes(charset);
                    JSONObject optJSONObject3 = optJSONObject2.optJSONObject(this.f4005l);
                    j jVar = new j();
                    if (optJSONObject3 != null && kotlin.jvm.internal.i.a(optJSONObject3.optString(this.f4006m), this.f4007n)) {
                        jVar.f4025a = 1;
                    }
                    kVar.f4028b = jVar;
                    kVar.f4029c = optJSONObject2.optString(this.f4000g).getBytes(charset);
                    JSONObject optJSONObject4 = optJSONObject2.optJSONObject(this.f4001h);
                    if (optJSONObject4 == null) {
                        iVarArr = new i[i5];
                        jSONArray = optJSONArray;
                        i2 = length;
                    } else {
                        ArrayList arrayList = new ArrayList();
                        Iterator<String> keys = optJSONObject4.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            i iVar = new i();
                            iVar.f4022a = next.getBytes(z1.a.f8620a);
                            JSONArray optJSONArray2 = optJSONObject4.optJSONArray(next);
                            if (optJSONArray2 == null) {
                                bArr = new byte[i5][];
                                jSONArray2 = optJSONArray;
                                i3 = length;
                                jSONObject2 = optJSONObject4;
                            } else {
                                int length2 = optJSONArray2.length();
                                byte[][] bArr2 = new byte[length2][];
                                jSONArray2 = optJSONArray;
                                int i7 = 0;
                                while (i7 < length2) {
                                    bArr2[i7] = optJSONArray2.optString(i7).getBytes(z1.a.f8620a);
                                    i7++;
                                    length = length;
                                    optJSONObject4 = optJSONObject4;
                                }
                                i3 = length;
                                jSONObject2 = optJSONObject4;
                                bArr = bArr2;
                            }
                            iVar.f4023b = bArr;
                            arrayList.add(iVar);
                            optJSONArray = jSONArray2;
                            length = i3;
                            optJSONObject4 = jSONObject2;
                            i5 = 0;
                        }
                        jSONArray = optJSONArray;
                        i2 = length;
                        Object[] array = arrayList.toArray(new i[i5]);
                        if (array == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        }
                        iVarArr = (i[]) array;
                    }
                    kVar.f4030d = iVarArr;
                    kVar.f4031e = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(optJSONObject2, this.f4002i, kVar.f4031e);
                    kVar.f4032f = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(optJSONObject2, this.f4003j, kVar.f4032f);
                    JSONArray optJSONArray3 = optJSONObject2.optJSONArray(this.f4004k);
                    if (optJSONArray3 == null) {
                        iArr = new int[0];
                    } else {
                        int length3 = optJSONArray3.length();
                        int[] iArr3 = new int[length3];
                        for (int i8 = 0; i8 < length3; i8++) {
                            iArr3[i8] = optJSONArray3.optInt(i8);
                        }
                        iArr = iArr3;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (int i9 : iArr) {
                        if (i9 != 0) {
                            arrayList2.add(Integer.valueOf(i9));
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        arrayList2 = null;
                    }
                    if (arrayList2 != null) {
                        iArr2 = AbstractC0252i.Q(arrayList2);
                        i4 = 0;
                    } else {
                        i4 = 0;
                        iArr2 = new int[]{200};
                    }
                    kVar.f4033g = iArr2;
                    kVar.f4034h = optJSONObject2.optBoolean(this.f4008o, kVar.f4034h);
                    kVar.f4035i = optJSONObject2.optString(this.f4009p);
                }
                kVarArr2[i6] = kVar;
                i6++;
                i5 = i4;
                optJSONArray = jSONArray;
                length = i2;
            }
            kVarArr = kVarArr2;
        }
        lVar.f4038b = kVarArr;
        mVar.f4043b = lVar;
        return this.f3994a.toModel(mVar);
    }

    public final IdSyncConfig b(JSONObject jSONObject) {
        return (IdSyncConfig) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parseOrNull(JSONObject jSONObject) {
        return (IdSyncConfig) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }
}
