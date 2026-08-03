package kb;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class l extends z8.g {
    private final z8.c groupComparisonType;

    public l() {
        super(com.onesignal.user.internal.operations.impl.executors.l.TRACK_PURCHASE);
        this.groupComparisonType = z8.c.ALTER;
    }

    private final void setAmountSpent(BigDecimal bigDecimal) {
        com.onesignal.common.modeling.i.setBigDecimalProperty$default(this, "amountSpent", bigDecimal, null, false, 12, null);
    }

    private final void setAppId(String str) {
        com.onesignal.common.modeling.i.setStringProperty$default(this, "appId", str, null, false, 12, null);
    }

    private final void setOnesignalId(String str) {
        com.onesignal.common.modeling.i.setStringProperty$default(this, "onesignalId", str, null, false, 12, null);
    }

    private final void setPurchases(List<g> list) {
        com.onesignal.common.modeling.i.setListProperty$default(this, "purchases", list, null, false, 12, null);
    }

    private final void setTreatNewAsExisting(boolean z10) {
        com.onesignal.common.modeling.i.setBooleanProperty$default(this, "treatNewAsExisting", z10, null, false, 12, null);
    }

    @Override // com.onesignal.common.modeling.i
    public List<?> createListForProperty(String str, JSONArray jSONArray) {
        pc.j.e(str, "property");
        pc.j.e(jSONArray, "jsonArray");
        if (!str.equals("purchases")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            g gVar = new g();
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            pc.j.d(jSONObject, "jsonArray.getJSONObject(item)");
            gVar.initializeFromJson(jSONObject);
            arrayList.add(gVar);
        }
        return arrayList;
    }

    public final BigDecimal getAmountSpent() {
        return com.onesignal.common.modeling.i.getBigDecimalProperty$default(this, "amountSpent", null, 2, null);
    }

    public final String getAppId() {
        return com.onesignal.common.modeling.i.getStringProperty$default(this, "appId", null, 2, null);
    }

    @Override // z8.g
    public String getApplyToRecordId() {
        return getOnesignalId();
    }

    @Override // z8.g
    public boolean getCanStartExecute() {
        return !com.onesignal.common.e.INSTANCE.isLocalId(getOnesignalId());
    }

    @Override // z8.g
    public String getCreateComparisonKey() {
        return "";
    }

    @Override // z8.g
    public z8.c getGroupComparisonType() {
        return this.groupComparisonType;
    }

    @Override // z8.g
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

    @Override // z8.g
    public void translateIds(Map<String, String> map) {
        pc.j.e(map, "map");
        if (map.containsKey(getOnesignalId())) {
            String str = map.get(getOnesignalId());
            pc.j.b(str);
            setOnesignalId(str);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(String str, String str2, boolean z10, BigDecimal bigDecimal, List<g> list) {
        this();
        pc.j.e(str, "appId");
        pc.j.e(str2, "onesignalId");
        pc.j.e(bigDecimal, "amountSpent");
        pc.j.e(list, "purchases");
        setAppId(str);
        setOnesignalId(str2);
        setTreatNewAsExisting(z10);
        setAmountSpent(bigDecimal);
        setPurchases(list);
    }
}
