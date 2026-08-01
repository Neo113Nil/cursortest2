package com.onesignal.common.modeling;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public class l extends k {
    private final I7.a _create;

    public /* synthetic */ l(I7.a aVar, String str, J4.b bVar, int i, kotlin.jvm.internal.e eVar) {
        this(aVar, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : bVar);
    }

    @Override // com.onesignal.common.modeling.k, com.onesignal.common.modeling.c
    public i create(JSONObject jSONObject) {
        i iVar = (i) this._create.invoke();
        if (jSONObject != null) {
            iVar.initializeFromJson(jSONObject);
        }
        return iVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(I7.a _create, String str, J4.b bVar) {
        super(str, bVar);
        kotlin.jvm.internal.h.e(_create, "_create");
        this._create = _create;
        load();
    }
}
