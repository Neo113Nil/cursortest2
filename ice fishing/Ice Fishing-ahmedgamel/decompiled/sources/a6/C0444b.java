package a6;

import kotlin.jvm.internal.h;
import org.json.JSONObject;

/* renamed from: a6.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0444b {
    private final C0445c current;

    public C0444b(C0445c current) {
        h.e(current, "current");
        this.current = current;
    }

    public final C0445c getCurrent() {
        return this.current;
    }

    public final JSONObject toJSONObject() {
        JSONObject put = new JSONObject().put("current", this.current.toJSONObject());
        h.d(put, "put(...)");
        return put;
    }
}
