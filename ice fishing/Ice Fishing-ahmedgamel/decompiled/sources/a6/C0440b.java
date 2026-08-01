package a6;

import kotlin.jvm.internal.h;
import org.json.JSONObject;

/* renamed from: a6.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0440b {
    private final C0441c current;

    public C0440b(C0441c current) {
        h.e(current, "current");
        this.current = current;
    }

    public final C0441c getCurrent() {
        return this.current;
    }

    public final JSONObject toJSONObject() {
        JSONObject put = new JSONObject().put("current", this.current.toJSONObject());
        h.d(put, "put(...)");
        return put;
    }
}
