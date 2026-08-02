package io.appmetrica.analytics.locationinternal.impl;

import com.connectsdk.discovery.provider.ssdp.SSDPDeviceDescriptionParser;
import com.connectsdk.service.DeviceService;
import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.coreutils.internal.parsing.RemoteConfigJsonUtils;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.d1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0862d1 implements JsonParser {
    public final C0867e2 a = new C0867e2();
    public final Z b = new Z();
    public final s2 c = new s2();
    public final C0882j d = new C0882j();

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
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final V0 parse(@NotNull JSONObject jSONObject) {
        String str;
        JSONArray jSONArray;
        int i;
        int i2;
        R0 r0;
        X0 x0;
        P0 p0;
        boolean z;
        U0 u0;
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
        C0862d1 c0862d1 = this;
        JSONObject jSONObject2 = jSONObject;
        V0 v0 = new V0();
        v0.c = RemoteConfigJsonUtils.extractHosts(jSONObject2, SSDPDeviceDescriptionParser.TAG_LOCATION);
        v0.b = c0862d1.a.parse(jSONObject2);
        String str2 = "location_collecting";
        JSONArray optJSONArray = jSONObject2.optJSONArray("location_collecting");
        boolean z10 = false;
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            R0[] r0Arr = new R0[length];
            int i3 = 0;
            while (i3 < length) {
                JSONObject optJSONObject3 = optJSONArray.optJSONObject(i3);
                if (optJSONObject3 != null) {
                    Z z11 = c0862d1.b;
                    z11.getClass();
                    r0 = new R0();
                    JSONObject optJSONObject4 = optJSONObject3.optJSONObject("preconditions");
                    if (optJSONObject4 == null || (x0 = z11.a.parse(optJSONObject4)) == null) {
                        x0 = new X0();
                    }
                    r0.b = x0;
                    JSONObject optJSONObject5 = optJSONObject3.optJSONObject(DeviceService.KEY_CONFIG);
                    if (optJSONObject5 != null) {
                        C0864e c0864e = z11.b;
                        c0864e.getClass();
                        p0 = new P0();
                        p0.a = c0864e.a.parse(optJSONObject5);
                        L0 l0 = c0864e.b;
                        boolean extractFeature3 = RemoteConfigJsonUtils.extractFeature(jSONObject2, str2, z10);
                        boolean extractFeature4 = RemoteConfigJsonUtils.extractFeature(jSONObject2, "gpl_collecting", z10);
                        l0.getClass();
                        boolean z12 = (extractFeature3 && optJSONObject5.optBoolean("location_collecting_enabled", z10)) ? true : z10;
                        if (extractFeature3 && optJSONObject5.optBoolean("passive_collecting_enabled", true)) {
                            z = true;
                            u0 = new U0();
                            u0.a = z12;
                            str = str2;
                            if (z) {
                                jSONArray = optJSONArray;
                            } else {
                                boolean z13 = u0.b;
                                jSONArray = optJSONArray;
                                JSONObject optJSONObject6 = optJSONObject5.optJSONObject("passive_access_config");
                                if (optJSONObject6 != null) {
                                    z13 = optJSONObject6.optBoolean("last_known_enabled", z13);
                                }
                                if (z13) {
                                    z2 = true;
                                    u0.b = z2;
                                    if (z12) {
                                        boolean z14 = u0.c;
                                        JSONObject optJSONObject7 = optJSONObject5.optJSONObject("gps_access_config");
                                        if (optJSONObject7 != null) {
                                            z14 = optJSONObject7.optBoolean("last_known_enabled", z14);
                                        }
                                        if (z14) {
                                            z3 = true;
                                            u0.c = z3;
                                            if (u0.a) {
                                                boolean z15 = u0.d;
                                                JSONObject optJSONObject8 = optJSONObject5.optJSONObject("lbs_access_config");
                                                if (optJSONObject8 != null) {
                                                    z15 = optJSONObject8.optBoolean("last_known_enabled", z15);
                                                }
                                                if (z15) {
                                                    z4 = true;
                                                    u0.d = z4;
                                                    if (u0.a && extractFeature4) {
                                                        z9 = u0.e;
                                                        optJSONObject2 = optJSONObject5.optJSONObject("gpl_access_config");
                                                        if (optJSONObject2 != null) {
                                                            z9 = optJSONObject2.optBoolean("last_known_enabled", z9);
                                                        }
                                                        if (z9) {
                                                            z5 = true;
                                                            u0.e = z5;
                                                            p0.b = u0;
                                                            C0912t0 c0912t0 = c0864e.c;
                                                            extractFeature = RemoteConfigJsonUtils.extractFeature(jSONObject2, "lbs_collecting", false);
                                                            extractFeature2 = RemoteConfigJsonUtils.extractFeature(jSONObject2, "wifi_around", false);
                                                            boolean extractFeature5 = RemoteConfigJsonUtils.extractFeature(jSONObject2, "wifi_connected", false);
                                                            boolean extractFeature6 = RemoteConfigJsonUtils.extractFeature(jSONObject2, "cells_around", false);
                                                            boolean extractFeature7 = RemoteConfigJsonUtils.extractFeature(jSONObject2, "cell_additional_info", false);
                                                            boolean extractFeature8 = RemoteConfigJsonUtils.extractFeature(jSONObject2, "cell_additional_info_connected_only", false);
                                                            c0912t0.getClass();
                                                            T0 t0 = new T0();
                                                            if (extractFeature) {
                                                                i = length;
                                                                i2 = i3;
                                                            } else {
                                                                i = length;
                                                                i2 = i3;
                                                                if (optJSONObject5.optBoolean("lbs_collecting_enabled", false)) {
                                                                    z6 = true;
                                                                    t0.a = z6;
                                                                    t0.b = WrapUtils.getMillisOrDefault(JsonUtils.optLongOrNull(optJSONObject5, "lbs_min_update_interval_seconds"), TimeUnit.SECONDS, t0.b);
                                                                    if (extractFeature2 || (optJSONObject = optJSONObject5.optJSONObject("wifi_access_config")) == null) {
                                                                        z7 = false;
                                                                    } else {
                                                                        z7 = false;
                                                                        if (optJSONObject.optBoolean("last_known_enabled", false)) {
                                                                            z8 = true;
                                                                            t0.c = z8;
                                                                            t0.d = extractFeature5;
                                                                            t0.e = (extractFeature6 || !optJSONObject5.optBoolean("all_cells_collecting_enabled", z7)) ? z7 : true;
                                                                            t0.f = !extractFeature6 && optJSONObject5.optBoolean("connected_cell_collecting_enabled", z7);
                                                                            t0.g = extractFeature7;
                                                                            t0.h = extractFeature8;
                                                                            p0.c = t0;
                                                                            p0.d = c0864e.d.parse(optJSONObject5);
                                                                        }
                                                                    }
                                                                    z8 = z7;
                                                                    t0.c = z8;
                                                                    t0.d = extractFeature5;
                                                                    t0.e = (extractFeature6 || !optJSONObject5.optBoolean("all_cells_collecting_enabled", z7)) ? z7 : true;
                                                                    t0.f = !extractFeature6 && optJSONObject5.optBoolean("connected_cell_collecting_enabled", z7);
                                                                    t0.g = extractFeature7;
                                                                    t0.h = extractFeature8;
                                                                    p0.c = t0;
                                                                    p0.d = c0864e.d.parse(optJSONObject5);
                                                                }
                                                            }
                                                            z6 = false;
                                                            t0.a = z6;
                                                            t0.b = WrapUtils.getMillisOrDefault(JsonUtils.optLongOrNull(optJSONObject5, "lbs_min_update_interval_seconds"), TimeUnit.SECONDS, t0.b);
                                                            if (extractFeature2) {
                                                            }
                                                            z7 = false;
                                                            z8 = z7;
                                                            t0.c = z8;
                                                            t0.d = extractFeature5;
                                                            t0.e = (extractFeature6 || !optJSONObject5.optBoolean("all_cells_collecting_enabled", z7)) ? z7 : true;
                                                            t0.f = !extractFeature6 && optJSONObject5.optBoolean("connected_cell_collecting_enabled", z7);
                                                            t0.g = extractFeature7;
                                                            t0.h = extractFeature8;
                                                            p0.c = t0;
                                                            p0.d = c0864e.d.parse(optJSONObject5);
                                                        }
                                                    }
                                                    z5 = false;
                                                    u0.e = z5;
                                                    p0.b = u0;
                                                    C0912t0 c0912t02 = c0864e.c;
                                                    extractFeature = RemoteConfigJsonUtils.extractFeature(jSONObject2, "lbs_collecting", false);
                                                    extractFeature2 = RemoteConfigJsonUtils.extractFeature(jSONObject2, "wifi_around", false);
                                                    boolean extractFeature52 = RemoteConfigJsonUtils.extractFeature(jSONObject2, "wifi_connected", false);
                                                    boolean extractFeature62 = RemoteConfigJsonUtils.extractFeature(jSONObject2, "cells_around", false);
                                                    boolean extractFeature72 = RemoteConfigJsonUtils.extractFeature(jSONObject2, "cell_additional_info", false);
                                                    boolean extractFeature82 = RemoteConfigJsonUtils.extractFeature(jSONObject2, "cell_additional_info_connected_only", false);
                                                    c0912t02.getClass();
                                                    T0 t02 = new T0();
                                                    if (extractFeature) {
                                                    }
                                                    z6 = false;
                                                    t02.a = z6;
                                                    t02.b = WrapUtils.getMillisOrDefault(JsonUtils.optLongOrNull(optJSONObject5, "lbs_min_update_interval_seconds"), TimeUnit.SECONDS, t02.b);
                                                    if (extractFeature2) {
                                                    }
                                                    z7 = false;
                                                    z8 = z7;
                                                    t02.c = z8;
                                                    t02.d = extractFeature52;
                                                    t02.e = (extractFeature62 || !optJSONObject5.optBoolean("all_cells_collecting_enabled", z7)) ? z7 : true;
                                                    t02.f = !extractFeature62 && optJSONObject5.optBoolean("connected_cell_collecting_enabled", z7);
                                                    t02.g = extractFeature72;
                                                    t02.h = extractFeature82;
                                                    p0.c = t02;
                                                    p0.d = c0864e.d.parse(optJSONObject5);
                                                }
                                            }
                                            z4 = false;
                                            u0.d = z4;
                                            if (u0.a) {
                                                z9 = u0.e;
                                                optJSONObject2 = optJSONObject5.optJSONObject("gpl_access_config");
                                                if (optJSONObject2 != null) {
                                                }
                                                if (z9) {
                                                }
                                            }
                                            z5 = false;
                                            u0.e = z5;
                                            p0.b = u0;
                                            C0912t0 c0912t022 = c0864e.c;
                                            extractFeature = RemoteConfigJsonUtils.extractFeature(jSONObject2, "lbs_collecting", false);
                                            extractFeature2 = RemoteConfigJsonUtils.extractFeature(jSONObject2, "wifi_around", false);
                                            boolean extractFeature522 = RemoteConfigJsonUtils.extractFeature(jSONObject2, "wifi_connected", false);
                                            boolean extractFeature622 = RemoteConfigJsonUtils.extractFeature(jSONObject2, "cells_around", false);
                                            boolean extractFeature722 = RemoteConfigJsonUtils.extractFeature(jSONObject2, "cell_additional_info", false);
                                            boolean extractFeature822 = RemoteConfigJsonUtils.extractFeature(jSONObject2, "cell_additional_info_connected_only", false);
                                            c0912t022.getClass();
                                            T0 t022 = new T0();
                                            if (extractFeature) {
                                            }
                                            z6 = false;
                                            t022.a = z6;
                                            t022.b = WrapUtils.getMillisOrDefault(JsonUtils.optLongOrNull(optJSONObject5, "lbs_min_update_interval_seconds"), TimeUnit.SECONDS, t022.b);
                                            if (extractFeature2) {
                                            }
                                            z7 = false;
                                            z8 = z7;
                                            t022.c = z8;
                                            t022.d = extractFeature522;
                                            t022.e = (extractFeature622 || !optJSONObject5.optBoolean("all_cells_collecting_enabled", z7)) ? z7 : true;
                                            t022.f = !extractFeature622 && optJSONObject5.optBoolean("connected_cell_collecting_enabled", z7);
                                            t022.g = extractFeature722;
                                            t022.h = extractFeature822;
                                            p0.c = t022;
                                            p0.d = c0864e.d.parse(optJSONObject5);
                                        }
                                    }
                                    z3 = false;
                                    u0.c = z3;
                                    if (u0.a) {
                                    }
                                    z4 = false;
                                    u0.d = z4;
                                    if (u0.a) {
                                    }
                                    z5 = false;
                                    u0.e = z5;
                                    p0.b = u0;
                                    C0912t0 c0912t0222 = c0864e.c;
                                    extractFeature = RemoteConfigJsonUtils.extractFeature(jSONObject2, "lbs_collecting", false);
                                    extractFeature2 = RemoteConfigJsonUtils.extractFeature(jSONObject2, "wifi_around", false);
                                    boolean extractFeature5222 = RemoteConfigJsonUtils.extractFeature(jSONObject2, "wifi_connected", false);
                                    boolean extractFeature6222 = RemoteConfigJsonUtils.extractFeature(jSONObject2, "cells_around", false);
                                    boolean extractFeature7222 = RemoteConfigJsonUtils.extractFeature(jSONObject2, "cell_additional_info", false);
                                    boolean extractFeature8222 = RemoteConfigJsonUtils.extractFeature(jSONObject2, "cell_additional_info_connected_only", false);
                                    c0912t0222.getClass();
                                    T0 t0222 = new T0();
                                    if (extractFeature) {
                                    }
                                    z6 = false;
                                    t0222.a = z6;
                                    t0222.b = WrapUtils.getMillisOrDefault(JsonUtils.optLongOrNull(optJSONObject5, "lbs_min_update_interval_seconds"), TimeUnit.SECONDS, t0222.b);
                                    if (extractFeature2) {
                                    }
                                    z7 = false;
                                    z8 = z7;
                                    t0222.c = z8;
                                    t0222.d = extractFeature5222;
                                    t0222.e = (extractFeature6222 || !optJSONObject5.optBoolean("all_cells_collecting_enabled", z7)) ? z7 : true;
                                    t0222.f = !extractFeature6222 && optJSONObject5.optBoolean("connected_cell_collecting_enabled", z7);
                                    t0222.g = extractFeature7222;
                                    t0222.h = extractFeature8222;
                                    p0.c = t0222;
                                    p0.d = c0864e.d.parse(optJSONObject5);
                                }
                            }
                            z2 = false;
                            u0.b = z2;
                            if (z12) {
                            }
                            z3 = false;
                            u0.c = z3;
                            if (u0.a) {
                            }
                            z4 = false;
                            u0.d = z4;
                            if (u0.a) {
                            }
                            z5 = false;
                            u0.e = z5;
                            p0.b = u0;
                            C0912t0 c0912t02222 = c0864e.c;
                            extractFeature = RemoteConfigJsonUtils.extractFeature(jSONObject2, "lbs_collecting", false);
                            extractFeature2 = RemoteConfigJsonUtils.extractFeature(jSONObject2, "wifi_around", false);
                            boolean extractFeature52222 = RemoteConfigJsonUtils.extractFeature(jSONObject2, "wifi_connected", false);
                            boolean extractFeature62222 = RemoteConfigJsonUtils.extractFeature(jSONObject2, "cells_around", false);
                            boolean extractFeature72222 = RemoteConfigJsonUtils.extractFeature(jSONObject2, "cell_additional_info", false);
                            boolean extractFeature82222 = RemoteConfigJsonUtils.extractFeature(jSONObject2, "cell_additional_info_connected_only", false);
                            c0912t02222.getClass();
                            T0 t02222 = new T0();
                            if (extractFeature) {
                            }
                            z6 = false;
                            t02222.a = z6;
                            t02222.b = WrapUtils.getMillisOrDefault(JsonUtils.optLongOrNull(optJSONObject5, "lbs_min_update_interval_seconds"), TimeUnit.SECONDS, t02222.b);
                            if (extractFeature2) {
                            }
                            z7 = false;
                            z8 = z7;
                            t02222.c = z8;
                            t02222.d = extractFeature52222;
                            t02222.e = (extractFeature62222 || !optJSONObject5.optBoolean("all_cells_collecting_enabled", z7)) ? z7 : true;
                            t02222.f = !extractFeature62222 && optJSONObject5.optBoolean("connected_cell_collecting_enabled", z7);
                            t02222.g = extractFeature72222;
                            t02222.h = extractFeature82222;
                            p0.c = t02222;
                            p0.d = c0864e.d.parse(optJSONObject5);
                        }
                        z = false;
                        u0 = new U0();
                        u0.a = z12;
                        str = str2;
                        if (z) {
                        }
                        z2 = false;
                        u0.b = z2;
                        if (z12) {
                        }
                        z3 = false;
                        u0.c = z3;
                        if (u0.a) {
                        }
                        z4 = false;
                        u0.d = z4;
                        if (u0.a) {
                        }
                        z5 = false;
                        u0.e = z5;
                        p0.b = u0;
                        C0912t0 c0912t022222 = c0864e.c;
                        extractFeature = RemoteConfigJsonUtils.extractFeature(jSONObject2, "lbs_collecting", false);
                        extractFeature2 = RemoteConfigJsonUtils.extractFeature(jSONObject2, "wifi_around", false);
                        boolean extractFeature522222 = RemoteConfigJsonUtils.extractFeature(jSONObject2, "wifi_connected", false);
                        boolean extractFeature622222 = RemoteConfigJsonUtils.extractFeature(jSONObject2, "cells_around", false);
                        boolean extractFeature722222 = RemoteConfigJsonUtils.extractFeature(jSONObject2, "cell_additional_info", false);
                        boolean extractFeature822222 = RemoteConfigJsonUtils.extractFeature(jSONObject2, "cell_additional_info_connected_only", false);
                        c0912t022222.getClass();
                        T0 t022222 = new T0();
                        if (extractFeature) {
                        }
                        z6 = false;
                        t022222.a = z6;
                        t022222.b = WrapUtils.getMillisOrDefault(JsonUtils.optLongOrNull(optJSONObject5, "lbs_min_update_interval_seconds"), TimeUnit.SECONDS, t022222.b);
                        if (extractFeature2) {
                        }
                        z7 = false;
                        z8 = z7;
                        t022222.c = z8;
                        t022222.d = extractFeature522222;
                        t022222.e = (extractFeature622222 || !optJSONObject5.optBoolean("all_cells_collecting_enabled", z7)) ? z7 : true;
                        t022222.f = !extractFeature622222 && optJSONObject5.optBoolean("connected_cell_collecting_enabled", z7);
                        t022222.g = extractFeature722222;
                        t022222.h = extractFeature822222;
                        p0.c = t022222;
                        p0.d = c0864e.d.parse(optJSONObject5);
                    } else {
                        str = str2;
                        jSONArray = optJSONArray;
                        i = length;
                        i2 = i3;
                        p0 = new P0();
                    }
                    r0.a = p0;
                } else {
                    str = str2;
                    jSONArray = optJSONArray;
                    i = length;
                    i2 = i3;
                    r0 = null;
                }
                r0Arr[i2] = r0;
                i3 = i2 + 1;
                c0862d1 = this;
                jSONObject2 = jSONObject;
                str2 = str;
                optJSONArray = jSONArray;
                length = i;
                z10 = false;
            }
            v0.a = r0Arr;
        }
        s2 s2Var = this.c;
        JSONObject optJSONObject9 = jSONObject.optJSONObject("throttling");
        boolean extractFeature9 = RemoteConfigJsonUtils.extractFeature(jSONObject, "throttling", false);
        s2Var.getClass();
        C0850a1 c0850a1 = new C0850a1();
        c0850a1.a = extractFeature9;
        c0850a1.c = s2Var.a.parse(optJSONObject9 != null ? optJSONObject9.optJSONObject("wifi") : null);
        c0850a1.b = s2Var.a.parse(optJSONObject9 != null ? optJSONObject9.optJSONObject("cell") : null);
        v0.d = c0850a1;
        v0.e = this.d.parse(jSONObject);
        return v0;
    }

    public final V0 b(@NotNull JSONObject jSONObject) {
        return (V0) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parseOrNull(JSONObject jSONObject) {
        return (V0) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }
}
