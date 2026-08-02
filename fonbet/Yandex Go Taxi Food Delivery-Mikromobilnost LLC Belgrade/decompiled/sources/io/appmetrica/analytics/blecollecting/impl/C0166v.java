package io.appmetrica.analytics.blecollecting.impl;

import defpackage.c6w;
import defpackage.d6w;
import defpackage.y6i0;
import io.appmetrica.analytics.blecollecting.internal.config.RemoteBleCollectingConfig;
import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.coreutils.internal.parsing.RemoteConfigJsonUtils;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.blecollecting.impl.v, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0166v implements JsonParser {
    public final C0151f a;
    public final C0150e b;

    public /* synthetic */ C0166v(C0151f c0151f, C0150e c0150e, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C0151f(null, null, 3, null) : c0151f, (i & 2) != 0 ? new C0150e() : c0150e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0263, code lost:
    
        if (r18 != false) goto L112;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x027e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02c1  */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final RemoteBleCollectingConfig parse(JSONObject jSONObject) {
        D d;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        JSONObject jSONObject2;
        boolean z;
        C0151f c0151f;
        y[] yVarArr;
        Long optLongOrNull;
        Long optLongOrNull2;
        x xVar;
        C0151f c0151f2;
        H h;
        JSONObject jSONObject3;
        boolean z2;
        C0151f c0151f3;
        JSONArray jSONArray;
        c6w c6wVar;
        y yVar;
        y yVar2;
        C[] cArr;
        String optStringOrNull;
        Boolean optBooleanOrNull;
        String optStringOrNull2;
        Long optLongOrNull3;
        JSONObject jSONObject4;
        boolean z3;
        C0151f c0151f4;
        JSONArray jSONArray2;
        c6w c6wVar2;
        JSONArray jSONArray3;
        c6w c6wVar3;
        C c;
        C c2;
        boolean z4;
        z zVar;
        String optStringOrNull3;
        A a;
        B b;
        String optStringOrNull4;
        Integer optIntOrNull;
        boolean extractFeature = RemoteConfigJsonUtils.extractFeature(jSONObject, "ble_beacon_collecting", AbstractC0160o.a);
        C0151f c0151f5 = this.a;
        C0150e c0150e = this.b;
        c0150e.getClass();
        JSONObject optJSONObject = jSONObject.optJSONObject("ble_beacon_collecting");
        if (optJSONObject == null) {
            xVar = new x();
            xVar.a = new D();
            y yVar3 = new y();
            C c3 = new C();
            z zVar2 = new z();
            zVar2.a = 76;
            zVar2.b = StringUtils.hexToBytes("00001184e021264a50729086284cdf5270610000000000");
            zVar2.c = StringUtils.hexToBytes("0000010101010101010101010101010101010000000000");
            c3.c = zVar2;
            yVar3.a = new C[]{c3};
            yVar3.b = "54267259-a70e-4d11-b10d-14dfd54de25c";
            y yVar4 = new y();
            C c4 = new C();
            c4.b = "Vega BLE";
            yVar4.a = new C[]{c4};
            yVar4.b = "4d61e712-8fe2-4e84-9182-7dd22cad5e4e";
            xVar.b = new y[]{yVar3, yVar4};
            z = extractFeature;
            c0151f2 = c0151f5;
        } else {
            x xVar2 = new x();
            O o = c0150e.a;
            o.getClass();
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("scan_settings");
            TimeUnit timeUnit = TimeUnit.SECONDS;
            if (optJSONObject2 == null) {
                d = null;
            } else {
                d = new D();
                String optStringOrNull5 = JsonUtils.optStringOrNull(optJSONObject2, "callback_type");
                if (optStringOrNull5 != null && (num4 = (Integer) o.a.get(optStringOrNull5)) != null) {
                    d.a = num4.intValue();
                }
                String optStringOrNull6 = JsonUtils.optStringOrNull(optJSONObject2, "match_mode");
                if (optStringOrNull6 != null && (num3 = (Integer) o.b.get(optStringOrNull6)) != null) {
                    d.b = num3.intValue();
                }
                String optStringOrNull7 = JsonUtils.optStringOrNull(optJSONObject2, "num_of_matches");
                if (optStringOrNull7 != null && (num2 = (Integer) o.c.get(optStringOrNull7)) != null) {
                    d.c = num2.intValue();
                }
                String optStringOrNull8 = JsonUtils.optStringOrNull(optJSONObject2, "scan_mode");
                if (optStringOrNull8 != null && (num = (Integer) o.d.get(optStringOrNull8)) != null) {
                    d.d = num.intValue();
                }
                Long optLongOrNull4 = JsonUtils.optLongOrNull(optJSONObject2, "report_delay_seconds");
                if (optLongOrNull4 != null) {
                    d.e = timeUnit.toMillis(optLongOrNull4.longValue());
                }
            }
            if (d != null) {
                xVar2.a = d;
            }
            H h2 = c0150e.b;
            h2.getClass();
            JSONArray optJSONArray = optJSONObject.optJSONArray("report_settings");
            if (optJSONArray != null) {
                if (optJSONArray.length() <= 0) {
                    optJSONArray = null;
                }
                if (optJSONArray != null) {
                    int i = 0;
                    d6w n = y6i0.n(0, optJSONArray.length());
                    ArrayList arrayList = new ArrayList();
                    c6w it = n.iterator();
                    while (it.c) {
                        JSONObject optJSONObject3 = optJSONArray.optJSONObject(it.nextInt());
                        if (optJSONObject3 != null) {
                            yVar2 = new y();
                            M m = h2.a;
                            m.getClass();
                            JSONArray optJSONArray2 = optJSONObject3.optJSONArray("filters");
                            if (optJSONArray2 != null) {
                                if (optJSONArray2.length() <= 0) {
                                    optJSONArray2 = null;
                                }
                                if (optJSONArray2 != null) {
                                    d6w n2 = y6i0.n(i, optJSONArray2.length());
                                    ArrayList arrayList2 = new ArrayList();
                                    c6w it2 = n2.iterator();
                                    while (it2.c) {
                                        JSONObject optJSONObject4 = optJSONArray2.optJSONObject(it2.nextInt());
                                        H h3 = h2;
                                        if (optJSONObject4 != null) {
                                            c2 = new C();
                                            jSONArray2 = optJSONArray;
                                            String optStringOrNull9 = JsonUtils.optStringOrNull(optJSONObject4, "device_address");
                                            if (optStringOrNull9 != null) {
                                                c2.a = optStringOrNull9;
                                                z4 = false;
                                            } else {
                                                z4 = true;
                                            }
                                            String optStringOrNull10 = JsonUtils.optStringOrNull(optJSONObject4, "device_name");
                                            if (optStringOrNull10 != null) {
                                                c2.b = optStringOrNull10;
                                                z4 = false;
                                            }
                                            m.a.getClass();
                                            JSONObject optJSONObject5 = optJSONObject4.optJSONObject("manufacturer_data");
                                            c6wVar2 = it;
                                            jSONArray3 = optJSONArray2;
                                            c6wVar3 = it2;
                                            if (optJSONObject5 == null || (optIntOrNull = JsonUtils.optIntOrNull(optJSONObject5, "id")) == null) {
                                                jSONObject4 = optJSONObject;
                                                z3 = extractFeature;
                                                c0151f4 = c0151f5;
                                                zVar = null;
                                            } else {
                                                zVar = new z();
                                                z3 = extractFeature;
                                                zVar.a = optIntOrNull.intValue();
                                                jSONObject4 = optJSONObject;
                                                c0151f4 = c0151f5;
                                                byte[] optHexByteArray$default = JsonUtils.optHexByteArray$default(optJSONObject5, Constants.KEY_DATA, null, 2, null);
                                                if (optHexByteArray$default != null) {
                                                    zVar.b = optHexByteArray$default;
                                                }
                                                byte[] optHexByteArray$default2 = JsonUtils.optHexByteArray$default(optJSONObject5, "data_mask", null, 2, null);
                                                if (optHexByteArray$default2 != null) {
                                                    zVar.c = optHexByteArray$default2;
                                                }
                                            }
                                            if (zVar != null) {
                                                c2.c = zVar;
                                                z4 = false;
                                            }
                                            m.b.getClass();
                                            JSONObject optJSONObject6 = optJSONObject4.optJSONObject("service_data");
                                            if (optJSONObject6 == null || (optStringOrNull3 = JsonUtils.optStringOrNull(optJSONObject6, "uuid")) == null || optStringOrNull3.length() == 0) {
                                                c = null;
                                                a = null;
                                            } else {
                                                a = new A();
                                                a.a = optStringOrNull3;
                                                c = null;
                                                byte[] optHexByteArray$default3 = JsonUtils.optHexByteArray$default(optJSONObject6, Constants.KEY_DATA, null, 2, null);
                                                if (optHexByteArray$default3 != null) {
                                                    a.b = optHexByteArray$default3;
                                                }
                                                byte[] optHexByteArray$default4 = JsonUtils.optHexByteArray$default(optJSONObject6, "data_mask", null, 2, null);
                                                if (optHexByteArray$default4 != null) {
                                                    a.c = optHexByteArray$default4;
                                                }
                                            }
                                            if (a != null) {
                                                c2.d = a;
                                                z4 = false;
                                            }
                                            m.c.getClass();
                                            JSONObject optJSONObject7 = optJSONObject4.optJSONObject("service_uuid");
                                            if (optJSONObject7 == null || (optStringOrNull4 = JsonUtils.optStringOrNull(optJSONObject7, "uuid")) == null || optStringOrNull4.length() == 0) {
                                                b = c;
                                            } else {
                                                B b2 = new B();
                                                b2.a = optStringOrNull4;
                                                String optStringOrNull11 = JsonUtils.optStringOrNull(optJSONObject7, "data_mask");
                                                b = b2;
                                                if (optStringOrNull11 != null) {
                                                    b2.b = optStringOrNull11;
                                                    b = b2;
                                                }
                                            }
                                            if (b != 0) {
                                                c2.e = b;
                                            }
                                            if (c2 == null) {
                                                c2 = c;
                                            }
                                            if (c2 == null) {
                                                arrayList2.add(c2);
                                            }
                                            h2 = h3;
                                            optJSONArray = jSONArray2;
                                            it = c6wVar2;
                                            optJSONArray2 = jSONArray3;
                                            it2 = c6wVar3;
                                            c0151f5 = c0151f4;
                                            extractFeature = z3;
                                            optJSONObject = jSONObject4;
                                        } else {
                                            jSONObject4 = optJSONObject;
                                            z3 = extractFeature;
                                            c0151f4 = c0151f5;
                                            jSONArray2 = optJSONArray;
                                            c6wVar2 = it;
                                            jSONArray3 = optJSONArray2;
                                            c6wVar3 = it2;
                                            c = null;
                                        }
                                        c2 = c;
                                        if (c2 == null) {
                                        }
                                        if (c2 == null) {
                                        }
                                        h2 = h3;
                                        optJSONArray = jSONArray2;
                                        it = c6wVar2;
                                        optJSONArray2 = jSONArray3;
                                        it2 = c6wVar3;
                                        c0151f5 = c0151f4;
                                        extractFeature = z3;
                                        optJSONObject = jSONObject4;
                                    }
                                    h = h2;
                                    jSONObject3 = optJSONObject;
                                    z2 = extractFeature;
                                    c0151f3 = c0151f5;
                                    jSONArray = optJSONArray;
                                    c6wVar = it;
                                    yVar = null;
                                    cArr = (C[]) arrayList2.toArray(new C[0]);
                                    if (cArr != null) {
                                        yVar2.a = cArr;
                                    }
                                    optStringOrNull = JsonUtils.optStringOrNull(optJSONObject3, "app_metrica_api_key");
                                    if (optStringOrNull != null) {
                                        yVar2.b = optStringOrNull;
                                    }
                                    optBooleanOrNull = JsonUtils.optBooleanOrNull(optJSONObject3, "report_to_appmetrica");
                                    if (optBooleanOrNull != null) {
                                        yVar2.c = optBooleanOrNull.booleanValue();
                                    }
                                    optStringOrNull2 = JsonUtils.optStringOrNull(optJSONObject3, "rtm_project_name");
                                    if (optStringOrNull2 != null) {
                                        yVar2.d = optStringOrNull2;
                                    }
                                    optLongOrNull3 = JsonUtils.optLongOrNull(optJSONObject3, "same_beacon_min_reporting_interval_seconds");
                                    if (optLongOrNull3 != null) {
                                        yVar2.e = timeUnit.toMillis(optLongOrNull3.longValue());
                                    }
                                }
                            }
                            h = h2;
                            jSONObject3 = optJSONObject;
                            z2 = extractFeature;
                            c0151f3 = c0151f5;
                            jSONArray = optJSONArray;
                            c6wVar = it;
                            yVar = null;
                            cArr = null;
                            if (cArr != null) {
                            }
                            optStringOrNull = JsonUtils.optStringOrNull(optJSONObject3, "app_metrica_api_key");
                            if (optStringOrNull != null) {
                            }
                            optBooleanOrNull = JsonUtils.optBooleanOrNull(optJSONObject3, "report_to_appmetrica");
                            if (optBooleanOrNull != null) {
                            }
                            optStringOrNull2 = JsonUtils.optStringOrNull(optJSONObject3, "rtm_project_name");
                            if (optStringOrNull2 != null) {
                            }
                            optLongOrNull3 = JsonUtils.optLongOrNull(optJSONObject3, "same_beacon_min_reporting_interval_seconds");
                            if (optLongOrNull3 != null) {
                            }
                        } else {
                            h = h2;
                            jSONObject3 = optJSONObject;
                            z2 = extractFeature;
                            c0151f3 = c0151f5;
                            jSONArray = optJSONArray;
                            c6wVar = it;
                            yVar = null;
                            yVar2 = null;
                        }
                        if (yVar2 == null) {
                            yVar2 = yVar;
                        }
                        if (yVar2 != null) {
                            arrayList.add(yVar2);
                        }
                        h2 = h;
                        optJSONArray = jSONArray;
                        it = c6wVar;
                        c0151f5 = c0151f3;
                        extractFeature = z2;
                        optJSONObject = jSONObject3;
                        i = 0;
                    }
                    jSONObject2 = optJSONObject;
                    z = extractFeature;
                    c0151f = c0151f5;
                    yVarArr = (y[]) arrayList.toArray(new y[i]);
                    if (yVarArr != null) {
                        xVar2.b = yVarArr;
                    }
                    JSONObject jSONObject5 = jSONObject2;
                    optLongOrNull = JsonUtils.optLongOrNull(jSONObject5, "wait_report_timeout_seconds");
                    if (optLongOrNull != null) {
                        xVar2.c = timeUnit.toMillis(optLongOrNull.longValue());
                    }
                    optLongOrNull2 = JsonUtils.optLongOrNull(jSONObject5, "first_delay_seconds");
                    if (optLongOrNull2 != null) {
                        xVar2.d = timeUnit.toMillis(optLongOrNull2.longValue());
                    }
                    xVar = xVar2;
                    c0151f2 = c0151f;
                }
            }
            jSONObject2 = optJSONObject;
            z = extractFeature;
            c0151f = c0151f5;
            yVarArr = null;
            if (yVarArr != null) {
            }
            JSONObject jSONObject52 = jSONObject2;
            optLongOrNull = JsonUtils.optLongOrNull(jSONObject52, "wait_report_timeout_seconds");
            if (optLongOrNull != null) {
            }
            optLongOrNull2 = JsonUtils.optLongOrNull(jSONObject52, "first_delay_seconds");
            if (optLongOrNull2 != null) {
            }
            xVar = xVar2;
            c0151f2 = c0151f;
        }
        return new RemoteBleCollectingConfig(z, c0151f2.toModel(xVar));
    }

    public final RemoteBleCollectingConfig b(JSONObject jSONObject) {
        return (RemoteBleCollectingConfig) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parseOrNull(JSONObject jSONObject) {
        return (RemoteBleCollectingConfig) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    public C0166v(C0151f c0151f, C0150e c0150e) {
        this.a = c0151f;
        this.b = c0150e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0166v() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
