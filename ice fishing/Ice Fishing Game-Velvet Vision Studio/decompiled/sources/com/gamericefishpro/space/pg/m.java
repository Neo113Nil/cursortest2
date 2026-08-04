package com.gamericefishpro.space.pg;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class m {
    private n directBody;
    private n indirectBody;

    public m(n nVar, n nVar2) {
        this.directBody = nVar;
        this.indirectBody = nVar2;
    }

    public final n getDirectBody() {
        return this.directBody;
    }

    public final n getIndirectBody() {
        return this.indirectBody;
    }

    /* JADX INFO: renamed from: setDirectBody, reason: collision with other method in class */
    public final void m14setDirectBody(n nVar) {
        this.directBody = nVar;
    }

    /* JADX INFO: renamed from: setIndirectBody, reason: collision with other method in class */
    public final void m15setIndirectBody(n nVar) {
        this.indirectBody = nVar;
    }

    public final JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        n nVar = this.directBody;
        if (nVar != null) {
            jSONObject.put(com.gamericefishpro.space.ng.e.DIRECT_TAG, nVar.toJSONObject());
        }
        n nVar2 = this.indirectBody;
        if (nVar2 != null) {
            jSONObject.put("indirect", nVar2.toJSONObject());
        }
        return jSONObject;
    }

    public String toString() {
        return "OutcomeSource{directBody=" + this.directBody + ", indirectBody=" + this.indirectBody + '}';
    }

    public final m setDirectBody(n nVar) {
        this.directBody = nVar;
        return this;
    }

    public final m setIndirectBody(n nVar) {
        this.indirectBody = nVar;
        return this;
    }
}
