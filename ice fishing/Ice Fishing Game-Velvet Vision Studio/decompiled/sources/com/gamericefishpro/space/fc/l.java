package com.gamericefishpro.space.fc;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class l extends k {
    private final Function0<i> _create;

    public /* synthetic */ l(Function0 function0, String str, com.gamericefishpro.space.gd.b bVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : bVar);
    }

    @Override // com.gamericefishpro.space.fc.k, com.gamericefishpro.space.fc.c
    public i create(JSONObject jSONObject) {
        i iVar = (i) this._create.invoke();
        if (jSONObject != null) {
            iVar.initializeFromJson(jSONObject);
        }
        return iVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Function0<i> _create, String str, com.gamericefishpro.space.gd.b bVar) {
        super(str, bVar);
        Intrinsics.checkNotNullParameter(_create, "_create");
        this._create = _create;
        load();
    }
}
