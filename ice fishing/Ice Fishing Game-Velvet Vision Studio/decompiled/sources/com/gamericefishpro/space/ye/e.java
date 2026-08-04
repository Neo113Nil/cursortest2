package com.gamericefishpro.space.ye;

import com.gamericefishpro.space.ve.i;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements i {
    private final String actionId;
    private final String url;

    public e(String str, String str2) {
        this.actionId = str;
        this.url = str2;
    }

    @Override // com.gamericefishpro.space.ve.i
    public String getActionId() {
        return this.actionId;
    }

    @Override // com.gamericefishpro.space.ve.i
    public String getUrl() {
        return this.url;
    }

    public final JSONObject toJSONObject() {
        return com.gamericefishpro.space.yb.d.putSafe(com.gamericefishpro.space.yb.d.putSafe(new JSONObject(), "actionId", getActionId()), "url", getUrl());
    }
}
