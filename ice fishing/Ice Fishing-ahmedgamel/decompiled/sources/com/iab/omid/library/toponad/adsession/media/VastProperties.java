package com.iab.omid.library.toponad.adsession.media;

import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import com.anythink.expressad.foundation.g.g.a.b;
import com.iab.omid.library.toponad.utils.d;
import com.iab.omid.library.toponad.utils.g;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class VastProperties {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f36983a;

    /* renamed from: b, reason: collision with root package name */
    private final Float f36984b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f36985c;

    /* renamed from: d, reason: collision with root package name */
    private final Position f36986d;

    private VastProperties(boolean z6, Float f2, boolean z9, Position position) {
        this.f36983a = z6;
        this.f36984b = f2;
        this.f36985c = z9;
        this.f36986d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z6, Position position) {
        g.a(position, "Position is null");
        return new VastProperties(false, null, z6, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f2, boolean z6, Position position) {
        g.a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f2), z6, position);
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f36983a);
            if (this.f36983a) {
                jSONObject.put("skipOffset", this.f36984b);
            }
            jSONObject.put(NativeAdvancedJsUtils.f18688k, this.f36985c);
            jSONObject.put(b.ab, this.f36986d);
            return jSONObject;
        } catch (JSONException e9) {
            d.a("VastProperties: JSON error", e9);
            return jSONObject;
        }
    }

    public Position getPosition() {
        return this.f36986d;
    }

    public Float getSkipOffset() {
        return this.f36984b;
    }

    public boolean isAutoPlay() {
        return this.f36985c;
    }

    public boolean isSkippable() {
        return this.f36983a;
    }
}
