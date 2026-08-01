package com.adjust.sdk;

import org.json.JSONObject;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public class AdjustRemoteTrigger {
    private final String label;
    private final JSONObject payload;

    public AdjustRemoteTrigger(String str, JSONObject jSONObject) {
        this.label = str;
        this.payload = jSONObject;
    }

    public String getLabel() {
        return this.label;
    }

    public JSONObject getPayload() {
        return this.payload;
    }

    public String toString() {
        return "AdjustRemoteTrigger{label='" + this.label + "', payload=" + this.payload + '}';
    }
}
