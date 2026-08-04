package com.gamericefishpro.space.dh;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends com.gamericefishpro.space.bd.g {
    private final com.gamericefishpro.space.bd.c groupComparisonType;

    public m() {
        super(com.gamericefishpro.space.eh.n.TRACK_PURCHASE);
        this.groupComparisonType = com.gamericefishpro.space.bd.c.ALTER;
    }

    private final void setAmountSpent(BigDecimal bigDecimal) {
        com.gamericefishpro.space.fc.i.setBigDecimalProperty$default(this, "amountSpent", bigDecimal, null, false, 12, null);
    }

    private final void setAppId(String str) {
        com.gamericefishpro.space.fc.i.setStringProperty$default(this, "appId", str, null, false, 12, null);
    }

    private final void setOnesignalId(String str) {
        com.gamericefishpro.space.fc.i.setStringProperty$default(this, "onesignalId", str, null, false, 12, null);
    }

    private final void setPurchases(List<g> list) {
        com.gamericefishpro.space.fc.i.setListProperty$default(this, "purchases", list, null, false, 12, null);
    }

    private final void setTreatNewAsExisting(boolean z) {
        com.gamericefishpro.space.fc.i.setBooleanProperty$default(this, "treatNewAsExisting", z, null, false, 12, null);
    }

    @Override // com.gamericefishpro.space.fc.i
    public List<?> createListForProperty(String property, JSONArray jsonArray) throws JSONException {
        Intrinsics.checkNotNullParameter(property, "property");
        Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
        if (!Intrinsics.a(property, "purchases")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int length = jsonArray.length();
        for (int i = 0; i < length; i++) {
            g gVar = new g();
            JSONObject jSONObject = jsonArray.getJSONObject(i);
            Intrinsics.checkNotNullExpressionValue(jSONObject, "getJSONObject(...)");
            gVar.initializeFromJson(jSONObject);
            arrayList.add(gVar);
        }
        return arrayList;
    }

    public final BigDecimal getAmountSpent() {
        return com.gamericefishpro.space.fc.i.getBigDecimalProperty$default(this, "amountSpent", null, 2, null);
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

    @Override // com.gamericefishpro.space.bd.g
    public String getModifyComparisonKey() {
        return getAppId() + ".User." + getOnesignalId();
    }

    public final String getOnesignalId() {
        return com.gamericefishpro.space.fc.i.getStringProperty$default(this, "onesignalId", null, 2, null);
    }

    public final List<g> getPurchases() {
        return com.gamericefishpro.space.fc.i.getListProperty$default(this, "purchases", null, 2, null);
    }

    public final boolean getTreatNewAsExisting() {
        return com.gamericefishpro.space.fc.i.getBooleanProperty$default(this, "treatNewAsExisting", null, 2, null);
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
    public m(String appId, String onesignalId, boolean z, BigDecimal amountSpent, List<g> purchases) {
        this();
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(onesignalId, "onesignalId");
        Intrinsics.checkNotNullParameter(amountSpent, "amountSpent");
        Intrinsics.checkNotNullParameter(purchases, "purchases");
        setAppId(appId);
        setOnesignalId(onesignalId);
        setTreatNewAsExisting(z);
        setAmountSpent(amountSpent);
        setPurchases(purchases);
    }
}
