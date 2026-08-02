package io.appmetrica.analytics.locationinternal.impl;

import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.q0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC0904q0 {
    public static final JSONObject a(C0891m c0891m) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("cell_id", c0891m.e);
        jSONObject.put("signal_strength", c0891m.a);
        jSONObject.put("lac", c0891m.d);
        jSONObject.put("country_code", c0891m.b);
        jSONObject.put("operator_id", c0891m.c);
        jSONObject.put("operator_name", c0891m.f);
        jSONObject.put("is_connected", c0891m.h);
        jSONObject.put("cell_type", c0891m.i);
        jSONObject.put("pci", c0891m.j);
        jSONObject.put("last_visible_time_offset", c0891m.k);
        jSONObject.put("lte_rsrq", c0891m.l);
        jSONObject.put("lte_rssnr", c0891m.m);
        jSONObject.put("arfcn", c0891m.o);
        jSONObject.put("lte_rssi", c0891m.n);
        jSONObject.put("lte_bandwidth", c0891m.p);
        jSONObject.put("lte_cqi", c0891m.q);
        jSONObject.put("lte_timing_advance", c0891m.r);
        return jSONObject;
    }
}
