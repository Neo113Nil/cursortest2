package V5;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class m extends H4.g {
    private final H4.c groupComparisonType;

    public m() {
        super(com.onesignal.user.internal.operations.impl.executors.p.TRACK_PURCHASE);
        this.groupComparisonType = H4.c.ALTER;
    }

    private final void setAmountSpent(BigDecimal bigDecimal) {
        com.onesignal.common.modeling.i.setBigDecimalProperty$default(this, "amountSpent", bigDecimal, null, false, 12, null);
    }

    private final void setAppId(String str) {
        com.onesignal.common.modeling.i.setStringProperty$default(this, com.anythink.expressad.videocommon.e.b.f22407u, str, null, false, 12, null);
    }

    private final void setOnesignalId(String str) {
        com.onesignal.common.modeling.i.setStringProperty$default(this, "onesignalId", str, null, false, 12, null);
    }

    private final void setPurchases(List<g> list) {
        com.onesignal.common.modeling.i.setListProperty$default(this, "purchases", list, null, false, 12, null);
    }

    private final void setTreatNewAsExisting(boolean z3) {
        com.onesignal.common.modeling.i.setBooleanProperty$default(this, "treatNewAsExisting", z3, null, false, 12, null);
    }

    @Override // com.onesignal.common.modeling.i
    public List<?> createListForProperty(String property, JSONArray jsonArray) {
        kotlin.jvm.internal.h.e(property, "property");
        kotlin.jvm.internal.h.e(jsonArray, "jsonArray");
        if (!property.equals("purchases")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int length = jsonArray.length();
        for (int i = 0; i < length; i++) {
            g gVar = new g();
            JSONObject jSONObject = jsonArray.getJSONObject(i);
            kotlin.jvm.internal.h.d(jSONObject, "getJSONObject(...)");
            gVar.initializeFromJson(jSONObject);
            arrayList.add(gVar);
        }
        return arrayList;
    }

    public final BigDecimal getAmountSpent() {
        return com.onesignal.common.modeling.i.getBigDecimalProperty$default(this, "amountSpent", null, 2, null);
    }

    public final String getAppId() {
        return com.onesignal.common.modeling.i.getStringProperty$default(this, com.anythink.expressad.videocommon.e.b.f22407u, null, 2, null);
    }

    @Override // H4.g
    public String getApplyToRecordId() {
        return getOnesignalId();
    }

    @Override // H4.g
    public boolean getCanStartExecute() {
        return !com.onesignal.common.d.INSTANCE.isLocalId(getOnesignalId());
    }

    @Override // H4.g
    public String getCreateComparisonKey() {
        return "";
    }

    @Override // H4.g
    public H4.c getGroupComparisonType() {
        return this.groupComparisonType;
    }

    @Override // H4.g
    public String getModifyComparisonKey() {
        return getAppId() + ".User." + getOnesignalId();
    }

    public final String getOnesignalId() {
        return com.onesignal.common.modeling.i.getStringProperty$default(this, "onesignalId", null, 2, null);
    }

    public final List<g> getPurchases() {
        return com.onesignal.common.modeling.i.getListProperty$default(this, "purchases", null, 2, null);
    }

    public final boolean getTreatNewAsExisting() {
        return com.onesignal.common.modeling.i.getBooleanProperty$default(this, "treatNewAsExisting", null, 2, null);
    }

    @Override // H4.g
    public void translateIds(Map<String, String> map) {
        kotlin.jvm.internal.h.e(map, "map");
        if (map.containsKey(getOnesignalId())) {
            String str = map.get(getOnesignalId());
            kotlin.jvm.internal.h.b(str);
            setOnesignalId(str);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(String appId, String onesignalId, String str, boolean z3, BigDecimal amountSpent, List<g> purchases) {
        this();
        kotlin.jvm.internal.h.e(appId, "appId");
        kotlin.jvm.internal.h.e(onesignalId, "onesignalId");
        kotlin.jvm.internal.h.e(amountSpent, "amountSpent");
        kotlin.jvm.internal.h.e(purchases, "purchases");
        setAppId(appId);
        setOnesignalId(onesignalId);
        setExternalId$com_onesignal_core(str);
        setTreatNewAsExisting(z3);
        setAmountSpent(amountSpent);
        setPurchases(purchases);
    }
}
