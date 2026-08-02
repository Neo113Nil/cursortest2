package defpackage;

import com.google.gson.JsonObject;

/* loaded from: classes3.dex */
public final class h6i extends hjq {
    public static final h6i b = new h6i(1);

    public static a4f h(g6i g6iVar, JsonObject jsonObject) {
        return new a4f(g6iVar.a, jsonObject.toString());
    }

    public final void g(zmg zmgVar) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.u("query", zmgVar.a);
        jsonObject.u("context", zmgVar.b.name());
        jsonObject.u("entity", zmgVar.c.name());
        jsonObject.u("entityId", zmgVar.d);
        jsonObject.u("filterId", zmgVar.e);
        jsonObject.s(Long.valueOf(zmgVar.f), "time");
        e().b(h(g6i.LocalCollectionSearchElapsed, jsonObject));
    }
}
