package com.gamericefishpro.space.dh;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends com.gamericefishpro.space.bd.g {
    private final com.gamericefishpro.space.bd.c groupComparisonType;

    public d() {
        super(com.gamericefishpro.space.eh.n.DELETE_TAG);
        this.groupComparisonType = com.gamericefishpro.space.bd.c.ALTER;
    }

    private final void setAppId(String str) {
        com.gamericefishpro.space.fc.i.setStringProperty$default(this, "appId", str, null, false, 12, null);
    }

    private final void setKey(String str) {
        com.gamericefishpro.space.fc.i.setStringProperty$default(this, "key", str, null, false, 12, null);
    }

    private final void setOnesignalId(String str) {
        com.gamericefishpro.space.fc.i.setStringProperty$default(this, "onesignalId", str, null, false, 12, null);
    }

    public final String getAppId() {
        return com.gamericefishpro.space.fc.i.getStringProperty$default(this, "appId", null, 2, null);
    }

    @Override // com.gamericefishpro.space.bd.g
    public String getApplyToRecordId() {
        return getOnesignalId();
    }

    @Override // com.gamericefishpro.space.bd.g
    public boolean getCanStartExecute() {
        return !com.gamericefishpro.space.yb.c.INSTANCE.isLocalId(getOnesignalId());
    }

    @Override // com.gamericefishpro.space.bd.g
    public String getCreateComparisonKey() {
        return "";
    }

    @Override // com.gamericefishpro.space.bd.g
    public com.gamericefishpro.space.bd.c getGroupComparisonType() {
        return this.groupComparisonType;
    }

    public final String getKey() {
        return com.gamericefishpro.space.fc.i.getStringProperty$default(this, "key", null, 2, null);
    }

    @Override // com.gamericefishpro.space.bd.g
    public String getModifyComparisonKey() {
        return getAppId() + ".User." + getOnesignalId();
    }

    public final String getOnesignalId() {
        return com.gamericefishpro.space.fc.i.getStringProperty$default(this, "onesignalId", null, 2, null);
    }

    @Override // com.gamericefishpro.space.bd.g
    public void translateIds(Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        if (map.containsKey(getOnesignalId())) {
            String str = map.get(getOnesignalId());
            Intrinsics.b(str);
            setOnesignalId(str);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(String appId, String onesignalId, String key) {
        this();
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(onesignalId, "onesignalId");
        Intrinsics.checkNotNullParameter(key, "key");
        setAppId(appId);
        setOnesignalId(onesignalId);
        setKey(key);
    }
}
