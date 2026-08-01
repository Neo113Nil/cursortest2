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
    private final boolean f36216a;

    /* renamed from: b, reason: collision with root package name */
    private final Float f36217b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f36218c;

    /* renamed from: d, reason: collision with root package name */
    private final Position f36219d;

    private VastProperties(boolean z3, Float f3, boolean z6, Position position) {
        this.f36216a = z3;
        this.f36217b = f3;
        this.f36218c = z6;
        this.f36219d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z3, Position position) {
        g.a(position, "Position is null");
        return new VastProperties(false, null, z3, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f3, boolean z3, Position position) {
        g.a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f3), z3, position);
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f36216a);
            if (this.f36216a) {
                jSONObject.put("skipOffset", this.f36217b);
            }
            jSONObject.put(NativeAdvancedJsUtils.f17901k, this.f36218c);
            jSONObject.put(b.ab, this.f36219d);
            return jSONObject;
        } catch (JSONException e9) {
            d.a("VastProperties: JSON error", e9);
            return jSONObject;
        }
    }

    public Position getPosition() {
        return this.f36219d;
    }

    public Float getSkipOffset() {
        return this.f36217b;
    }

    public boolean isAutoPlay() {
        return this.f36218c;
    }

    public boolean isSkippable() {
        return this.f36216a;
    }
}
