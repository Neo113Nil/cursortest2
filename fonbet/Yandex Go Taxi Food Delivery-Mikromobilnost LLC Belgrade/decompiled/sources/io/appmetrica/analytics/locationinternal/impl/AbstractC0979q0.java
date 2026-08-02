package io.appmetrica.analytics.locationinternal.impl;

import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.q0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC0979q0 {
    public static final JSONObject a(C0966m c0966m) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("cell_id", c0966m.e);
        jSONObject.put("signal_strength", c0966m.a);
        jSONObject.put("lac", c0966m.d);
        jSONObject.put("country_code", c0966m.b);
        jSONObject.put("operator_id", c0966m.c);
        jSONObject.put("operator_name", c0966m.f);
        jSONObject.put("is_connected", c0966m.h);
        jSONObject.put("cell_type", c0966m.i);
        jSONObject.put("pci", c0966m.j);
        jSONObject.put("last_visible_time_offset", c0966m.k);
        jSONObject.put("lte_rsrq", c0966m.l);
        jSONObject.put("lte_rssnr", c0966m.m);
        jSONObject.put("arfcn", c0966m.o);
        jSONObject.put("lte_rssi", c0966m.n);
        jSONObject.put("lte_bandwidth", c0966m.p);
        jSONObject.put("lte_cqi", c0966m.q);
        jSONObject.put("lte_timing_advance", c0966m.r);
        return jSONObject;
    }
}
