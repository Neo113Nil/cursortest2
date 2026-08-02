package io.appmetrica.analytics.locationinternal.impl;

import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.coreutils.internal.parsing.RemoteConfigJsonUtils;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.common.startup.StartupRequest;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.d1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0939d1 implements JsonParser {
    public final C0944e2 a = new C0944e2();
    public final Z b = new Z();
    public final s2 c = new s2();
    public final C0957j d = new C0957j();

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00b9  */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final U0 parse(JSONObject jSONObject) {
        String str;
        JSONArray jSONArray;
        int i;
        int i2;
        Q0 q0;
        W0 w0;
        O0 o0;
        boolean z;
        T0 t0;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean extractFeature;
        boolean extractFeature2;
        boolean z6;
        boolean z7;
        boolean z8;
        JSONObject optJSONObject;
        boolean z9;
        JSONObject optJSONObject2;
        C0939d1 c0939d1 = this;
        JSONObject jSONObject2 = jSONObject;
        U0 u0 = new U0();
        u0.c = RemoteConfigJsonUtils.extractHosts(jSONObject2, "location");
        u0.b = c0939d1.a.parse(jSONObject2);
        String str2 = "location_collecting";
        JSONArray optJSONArray = jSONObject2.optJSONArray("location_collecting");
        boolean z10 = false;
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            Q0[] q0Arr = new Q0[length];
            int i3 = 0;
            while (i3 < length) {
                JSONObject optJSONObject3 = optJSONArray.optJSONObject(i3);
                if (optJSONObject3 != null) {
                    Z z11 = c0939d1.b;
                    z11.getClass();
                    q0 = new Q0();
                    JSONObject optJSONObject4 = optJSONObject3.optJSONObject("preconditions");
                    if (optJSONObject4 == null || (w0 = z11.a.parse(optJSONObject4)) == null) {
                        w0 = new W0();
                    }
                    q0.b = w0;
                    JSONObject optJSONObject5 = optJSONObject3.optJSONObject(ConfigConstants.CONFIG);
                    if (optJSONObject5 != null) {
                        C0941e c0941e = z11.b;
                        c0941e.getClass();
                        o0 = new O0();
                        o0.a = c0941e.a.parse(optJSONObject5);
                        L0 l0 = c0941e.b;
                        boolean extractFeature3 = RemoteConfigJsonUtils.extractFeature(jSONObject2, str2, z10);
                        boolean extractFeature4 = RemoteConfigJsonUtils.extractFeature(jSONObject2, "gpl_collecting", z10);
                        l0.getClass();
                        boolean z12 = (extractFeature3 && optJSONObject5.optBoolean("location_collecting_enabled", z10)) ? true : z10;
                        if (extractFeature3 && optJSONObject5.optBoolean("passive_collecting_enabled", true)) {
                            z = true;
                            t0 = new T0();
                            t0.a = z12;
                            str = str2;
                            if (z) {
                                jSONArray = optJSONArray;
                            } else {
                                boolean z13 = t0.b;
                                jSONArray = optJSONArray;
                                JSONObject optJSONObject6 = optJSONObject5.optJSONObject("passive_access_config");
                                if (optJSONObject6 != null) {
                                    z13 = optJSONObject6.optBoolean("last_known_enabled", z13);
                                }
                                if (z13) {
                                    z2 = true;
                                    t0.b = z2;
                                    if (z12) {
                                        boolean z14 = t0.c;
                                        JSONObject optJSONObject7 = optJSONObject5.optJSONObject("gps_access_config");
                                        if (optJSONObject7 != null) {
                                            z14 = optJSONObject7.optBoolean("last_known_enabled", z14);
                                        }
                                        if (z14) {
                                            z3 = true;
                                            t0.c = z3;
                                            if (t0.a) {
                                                boolean z15 = t0.d;
                                                JSONObject optJSONObject8 = optJSONObject5.optJSONObject("lbs_access_config");
                                                if (optJSONObject8 != null) {
                                                    z15 = optJSONObject8.optBoolean("last_known_enabled", z15);
                                                }
                                                if (z15) {
                                                    z4 = true;
                                                    t0.d = z4;
                                                    if (t0.a && extractFeature4) {
                                                        z9 = t0.e;
                                                        optJSONObject2 = optJSONObject5.optJSONObject("gpl_access_config");
                                                        if (optJSONObject2 != null) {
                                                            z9 = optJSONObject2.optBoolean("last_known_enabled", z9);
                                                        }
                                                        if (z9) {
                                                            z5 = true;
                                                            t0.e = z5;
                                                            o0.b = t0;
                                                            C0987t0 c0987t0 = c0941e.c;
                                                            extractFeature = RemoteConfigJsonUtils.extractFeature(jSONObject2, "lbs_collecting", false);
                                                            extractFeature2 = RemoteConfigJsonUtils.extractFeature(jSONObject2, "wifi_around", false);
                                                            boolean extractFeature5 = RemoteConfigJsonUtils.extractFeature(jSONObject2, "wifi_connected", false);
                                                            boolean extractFeature6 = RemoteConfigJsonUtils.extractFeature(jSONObject2, "cells_around", false);
                                                            boolean extractFeature7 = RemoteConfigJsonUtils.extractFeature(jSONObject2, "cell_additional_info", false);
                                                            boolean extractFeature8 = RemoteConfigJsonUtils.extractFeature(jSONObject2, "cell_additional_info_connected_only", false);
                                                            c0987t0.getClass();
                                                            S0 s0 = new S0();
                                                            if (extractFeature) {
                                                                i = length;
                                                                i2 = i3;
                                                            } else {
                                                                i = length;
                                                                i2 = i3;
                                                                if (optJSONObject5.optBoolean("lbs_collecting_enabled", false)) {
                                                                    z6 = true;
                                                                    s0.a = z6;
                                                                    s0.b = WrapUtils.getMillisOrDefault(JsonUtils.optLongOrNull(optJSONObject5, "lbs_min_update_interval_seconds"), TimeUnit.SECONDS, s0.b);
                                                                    if (extractFeature2 || (optJSONObject = optJSONObject5.optJSONObject("wifi_access_config")) == null) {
                                                                        z7 = false;
                                                                    } else {
                                                                        z7 = false;
                                                                        if (optJSONObject.optBoolean("last_known_enabled", false)) {
                                                                            z8 = true;
                                                                            s0.c = z8;
                                                                            s0.d = extractFeature5;
                                                                            s0.e = (extractFeature6 || !optJSONObject5.optBoolean("all_cells_collecting_enabled", z7)) ? z7 : true;
                                                                            s0.f = !extractFeature6 && optJSONObject5.optBoolean("connected_cell_collecting_enabled", z7);
                                                                            s0.g = extractFeature7;
                                                                            s0.h = extractFeature8;
                                                                            o0.c = s0;
                                                                            o0.d = c0941e.d.parse(optJSONObject5);
                                                                        }
                                                                    }
                                                                    z8 = z7;
                                                                    s0.c = z8;
                                                                    s0.d = extractFeature5;
                                                                    s0.e = (extractFeature6 || !optJSONObject5.optBoolean("all_cells_collecting_enabled", z7)) ? z7 : true;
                                                                    s0.f = !extractFeature6 && optJSONObject5.optBoolean("connected_cell_collecting_enabled", z7);
                                                                    s0.g = extractFeature7;
                                                                    s0.h = extractFeature8;
                                                                    o0.c = s0;
                                                                    o0.d = c0941e.d.parse(optJSONObject5);
                                                                }
                                                            }
                                                            z6 = false;
                                                            s0.a = z6;
                                                            s0.b = WrapUtils.getMillisOrDefault(JsonUtils.optLongOrNull(optJSONObject5, "lbs_min_update_interval_seconds"), TimeUnit.SECONDS, s0.b);
                                                            if (extractFeature2) {
                                                            }
                                                            z7 = false;
                                                            z8 = z7;
                                                            s0.c = z8;
                                                            s0.d = extractFeature5;
                                                            s0.e = (extractFeature6 || !optJSONObject5.optBoolean("all_cells_collecting_enabled", z7)) ? z7 : true;
                                                            s0.f = !extractFeature6 && optJSONObject5.optBoolean("connected_cell_collecting_enabled", z7);
                                                            s0.g = extractFeature7;
                                                            s0.h = extractFeature8;
                                                            o0.c = s0;
                                                            o0.d = c0941e.d.parse(optJSONObject5);
                                                        }
                                                    }
                                                    z5 = false;
                                                    t0.e = z5;
                                                    o0.b = t0;
                                                    C0987t0 c0987t02 = c0941e.c;
                                                    extractFeature = RemoteConfigJsonUtils.extractFeature(jSONObject2, "lbs_collecting", false);
                                                    extractFeature2 = RemoteConfigJsonUtils.extractFeature(jSONObject2, "wifi_around", false);
                                                    boolean extractFeature52 = RemoteConfigJsonUtils.extractFeature(jSONObject2, "wifi_connected", false);
                                                    boolean extractFeature62 = RemoteConfigJsonUtils.extractFeature(jSONObject2, "cells_around", false);
                                                    boolean extractFeature72 = RemoteConfigJsonUtils.extractFeature(jSONObject2, "cell_additional_info", false);
                                                    boolean extractFeature82 = RemoteConfigJsonUtils.extractFeature(jSONObject2, "cell_additional_info_connected_only", false);
                                                    c0987t02.getClass();
                                                    S0 s02 = new S0();
                                                    if (extractFeature) {
                                                    }
                                                    z6 = false;
                                                    s02.a = z6;
                                                    s02.b = WrapUtils.getMillisOrDefault(JsonUtils.optLongOrNull(optJSONObject5, "lbs_min_update_interval_seconds"), TimeUnit.SECONDS, s02.b);
                                                    if (extractFeature2) {
                                                    }
                                                    z7 = false;
                                                    z8 = z7;
                                                    s02.c = z8;
                                                    s02.d = extractFeature52;
                                                    s02.e = (extractFeature62 || !optJSONObject5.optBoolean("all_cells_collecting_enabled", z7)) ? z7 : true;
                                                    s02.f = !extractFeature62 && optJSONObject5.optBoolean("connected_cell_collecting_enabled", z7);
                                                    s02.g = extractFeature72;
                                                    s02.h = extractFeature82;
                                                    o0.c = s02;
                                                    o0.d = c0941e.d.parse(optJSONObject5);
                                                }
                                            }
                                            z4 = false;
                                            t0.d = z4;
                                            if (t0.a) {
                                                z9 = t0.e;
                                                optJSONObject2 = optJSONObject5.optJSONObject("gpl_access_config");
                                                if (optJSONObject2 != null) {
                                                }
                                                if (z9) {
                                                }
                                            }
                                            z5 = false;
                                            t0.e = z5;
                                            o0.b = t0;
                                            C0987t0 c0987t022 = c0941e.c;
                                            extractFeature = RemoteConfigJsonUtils.extractFeature(jSONObject2, "lbs_collecting", false);
                                            extractFeature2 = RemoteConfigJsonUtils.extractFeature(jSONObject2, "wifi_around", false);
                                            boolean extractFeature522 = RemoteConfigJsonUtils.extractFeature(jSONObject2, "wifi_connected", false);
                                            boolean extractFeature622 = RemoteConfigJsonUtils.extractFeature(jSONObject2, "cells_around", false);
                                            boolean extractFeature722 = RemoteConfigJsonUtils.extractFeature(jSONObject2, "cell_additional_info", false);
                                            boolean extractFeature822 = RemoteConfigJsonUtils.extractFeature(jSONObject2, "cell_additional_info_connected_only", false);
                                            c0987t022.getClass();
                                            S0 s022 = new S0();
                                            if (extractFeature) {
                                            }
                                            z6 = false;
                                            s022.a = z6;
                                            s022.b = WrapUtils.getMillisOrDefault(JsonUtils.optLongOrNull(optJSONObject5, "lbs_min_update_interval_seconds"), TimeUnit.SECONDS, s022.b);
                                            if (extractFeature2) {
                                            }
                                            z7 = false;
                                            z8 = z7;
                                            s022.c = z8;
                                            s022.d = extractFeature522;
                                            s022.e = (extractFeature622 || !optJSONObject5.optBoolean("all_cells_collecting_enabled", z7)) ? z7 : true;
                                            s022.f = !extractFeature622 && optJSONObject5.optBoolean("connected_cell_collecting_enabled", z7);
                                            s022.g = extractFeature722;
                                            s022.h = extractFeature822;
                                            o0.c = s022;
                                            o0.d = c0941e.d.parse(optJSONObject5);
                                        }
                                    }
                                    z3 = false;
                                    t0.c = z3;
                                    if (t0.a) {
                                    }
                                    z4 = false;
                                    t0.d = z4;
                                    if (t0.a) {
                                    }
                                    z5 = false;
                                    t0.e = z5;
                                    o0.b = t0;
                                    C0987t0 c0987t0222 = c0941e.c;
                                    extractFeature = RemoteConfigJsonUtils.extractFeature(jSONObject2, "lbs_collecting", false);
                                    extractFeature2 = RemoteConfigJsonUtils.extractFeature(jSONObject2, "wifi_around", false);
                                    boolean extractFeature5222 = RemoteConfigJsonUtils.extractFeature(jSONObject2, "wifi_connected", false);
                                    boolean extractFeature6222 = RemoteConfigJsonUtils.extractFeature(jSONObject2, "cells_around", false);
                                    boolean extractFeature7222 = RemoteConfigJsonUtils.extractFeature(jSONObject2, "cell_additional_info", false);
                                    boolean extractFeature8222 = RemoteConfigJsonUtils.extractFeature(jSONObject2, "cell_additional_info_connected_only", false);
                                    c0987t0222.getClass();
                                    S0 s0222 = new S0();
                                    if (extractFeature) {
                                    }
                                    z6 = false;
                                    s0222.a = z6;
                                    s0222.b = WrapUtils.getMillisOrDefault(JsonUtils.optLongOrNull(optJSONObject5, "lbs_min_update_interval_seconds"), TimeUnit.SECONDS, s0222.b);
                                    if (extractFeature2) {
                                    }
                                    z7 = false;
                                    z8 = z7;
                                    s0222.c = z8;
                                    s0222.d = extractFeature5222;
                                    s0222.e = (extractFeature6222 || !optJSONObject5.optBoolean("all_cells_collecting_enabled", z7)) ? z7 : true;
                                    s0222.f = !extractFeature6222 && optJSONObject5.optBoolean("connected_cell_collecting_enabled", z7);
                                    s0222.g = extractFeature7222;
                                    s0222.h = extractFeature8222;
                                    o0.c = s0222;
                                    o0.d = c0941e.d.parse(optJSONObject5);
                                }
                            }
                            z2 = false;
                            t0.b = z2;
                            if (z12) {
                            }
                            z3 = false;
                            t0.c = z3;
                            if (t0.a) {
                            }
                            z4 = false;
                            t0.d = z4;
                            if (t0.a) {
                            }
                            z5 = false;
                            t0.e = z5;
                            o0.b = t0;
                            C0987t0 c0987t02222 = c0941e.c;
                            extractFeature = RemoteConfigJsonUtils.extractFeature(jSONObject2, "lbs_collecting", false);
                            extractFeature2 = RemoteConfigJsonUtils.extractFeature(jSONObject2, "wifi_around", false);
                            boolean extractFeature52222 = RemoteConfigJsonUtils.extractFeature(jSONObject2, "wifi_connected", false);
                            boolean extractFeature62222 = RemoteConfigJsonUtils.extractFeature(jSONObject2, "cells_around", false);
                            boolean extractFeature72222 = RemoteConfigJsonUtils.extractFeature(jSONObject2, "cell_additional_info", false);
                            boolean extractFeature82222 = RemoteConfigJsonUtils.extractFeature(jSONObject2, "cell_additional_info_connected_only", false);
                            c0987t02222.getClass();
                            S0 s02222 = new S0();
                            if (extractFeature) {
                            }
                            z6 = false;
                            s02222.a = z6;
                            s02222.b = WrapUtils.getMillisOrDefault(JsonUtils.optLongOrNull(optJSONObject5, "lbs_min_update_interval_seconds"), TimeUnit.SECONDS, s02222.b);
                            if (extractFeature2) {
                            }
                            z7 = false;
                            z8 = z7;
                            s02222.c = z8;
                            s02222.d = extractFeature52222;
                            s02222.e = (extractFeature62222 || !optJSONObject5.optBoolean("all_cells_collecting_enabled", z7)) ? z7 : true;
                            s02222.f = !extractFeature62222 && optJSONObject5.optBoolean("connected_cell_collecting_enabled", z7);
                            s02222.g = extractFeature72222;
                            s02222.h = extractFeature82222;
                            o0.c = s02222;
                            o0.d = c0941e.d.parse(optJSONObject5);
                        }
                        z = false;
                        t0 = new T0();
                        t0.a = z12;
                        str = str2;
                        if (z) {
                        }
                        z2 = false;
                        t0.b = z2;
                        if (z12) {
                        }
                        z3 = false;
                        t0.c = z3;
                        if (t0.a) {
                        }
                        z4 = false;
                        t0.d = z4;
                        if (t0.a) {
                        }
                        z5 = false;
                        t0.e = z5;
                        o0.b = t0;
                        C0987t0 c0987t022222 = c0941e.c;
                        extractFeature = RemoteConfigJsonUtils.extractFeature(jSONObject2, "lbs_collecting", false);
                        extractFeature2 = RemoteConfigJsonUtils.extractFeature(jSONObject2, "wifi_around", false);
                        boolean extractFeature522222 = RemoteConfigJsonUtils.extractFeature(jSONObject2, "wifi_connected", false);
                        boolean extractFeature622222 = RemoteConfigJsonUtils.extractFeature(jSONObject2, "cells_around", false);
                        boolean extractFeature722222 = RemoteConfigJsonUtils.extractFeature(jSONObject2, "cell_additional_info", false);
                        boolean extractFeature822222 = RemoteConfigJsonUtils.extractFeature(jSONObject2, "cell_additional_info_connected_only", false);
                        c0987t022222.getClass();
                        S0 s022222 = new S0();
                        if (extractFeature) {
                        }
                        z6 = false;
                        s022222.a = z6;
                        s022222.b = WrapUtils.getMillisOrDefault(JsonUtils.optLongOrNull(optJSONObject5, "lbs_min_update_interval_seconds"), TimeUnit.SECONDS, s022222.b);
                        if (extractFeature2) {
                        }
                        z7 = false;
                        z8 = z7;
                        s022222.c = z8;
                        s022222.d = extractFeature522222;
                        s022222.e = (extractFeature622222 || !optJSONObject5.optBoolean("all_cells_collecting_enabled", z7)) ? z7 : true;
                        s022222.f = !extractFeature622222 && optJSONObject5.optBoolean("connected_cell_collecting_enabled", z7);
                        s022222.g = extractFeature722222;
                        s022222.h = extractFeature822222;
                        o0.c = s022222;
                        o0.d = c0941e.d.parse(optJSONObject5);
                    } else {
                        str = str2;
                        jSONArray = optJSONArray;
                        i = length;
                        i2 = i3;
                        o0 = new O0();
                    }
                    q0.a = o0;
                } else {
                    str = str2;
                    jSONArray = optJSONArray;
                    i = length;
                    i2 = i3;
                    q0 = null;
                }
                q0Arr[i2] = q0;
                i3 = i2 + 1;
                c0939d1 = this;
                jSONObject2 = jSONObject;
                str2 = str;
                optJSONArray = jSONArray;
                length = i;
                z10 = false;
            }
            u0.a = q0Arr;
        }
        s2 s2Var = this.c;
        JSONObject optJSONObject9 = jSONObject.optJSONObject("throttling");
        boolean extractFeature9 = RemoteConfigJsonUtils.extractFeature(jSONObject, "throttling", false);
        s2Var.getClass();
        Z0 z0 = new Z0();
        z0.a = extractFeature9;
        z0.c = s2Var.a.parse(optJSONObject9 != null ? optJSONObject9.optJSONObject(StartupRequest.PARAM_WIFI) : null);
        z0.b = s2Var.a.parse(optJSONObject9 != null ? optJSONObject9.optJSONObject("cell") : null);
        u0.d = z0;
        u0.e = this.d.parse(jSONObject);
        return u0;
    }

    public final U0 b(JSONObject jSONObject) {
        return (U0) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parseOrNull(JSONObject jSONObject) {
        return (U0) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }
}
