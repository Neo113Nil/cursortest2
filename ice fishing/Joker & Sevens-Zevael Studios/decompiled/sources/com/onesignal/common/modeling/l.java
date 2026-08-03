package com.onesignal.common.modeling;

import org.json.JSONObject;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public class l extends k {
    private final oc.a _create;

    public /* synthetic */ l(oc.a aVar, String str, c9.b bVar, int i10, pc.f fVar) {
        this(aVar, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : bVar);
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
    public l(oc.a aVar, String str, c9.b bVar) {
        super(str, bVar);
        pc.j.e(aVar, "_create");
        this._create = aVar;
        load();
    }
}
