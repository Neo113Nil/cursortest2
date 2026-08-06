package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final /* synthetic */ class zc implements ww0 {
    public final /* synthetic */ int GWasM1elztuh;
    public final /* synthetic */ Object Yi7zF1RB1;

    public /* synthetic */ zc(int i, Object obj) {
        this.GWasM1elztuh = i;
        this.Yi7zF1RB1 = obj;
    }

    @Override // defpackage.ww0
    public final Bundle GWasM1elztuh() {
        rn0[] rn0VarArr;
        int i = this.GWasM1elztuh;
        Object obj = this.Yi7zF1RB1;
        switch (i) {
            case 0:
                Bundle bundle = new Bundle();
                dd ddVar = ((fd) obj).E7jCp8Ls;
                ddVar.getClass();
                LinkedHashMap linkedHashMap = ddVar.Yi7zF1RB1;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(ddVar.X1lG3V04pd));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(ddVar.EljAMC1QTz));
                return bundle;
            case 1:
                Map OOA6hdeuvCS = ((lw0) obj).OOA6hdeuvCS();
                Bundle bundle2 = new Bundle();
                for (Map.Entry entry : OOA6hdeuvCS.entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    bundle2.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
                }
                return bundle2;
            default:
                v5 v5Var = (v5) obj;
                for (Map.Entry entry2 : rc0.AEn1Rrio((LinkedHashMap) v5Var.xqGvceK5x).entrySet()) {
                    v5Var.rQPn8YBR(((p51) entry2.getValue()).getValue(), (String) entry2.getKey());
                }
                for (Map.Entry entry3 : rc0.AEn1Rrio((LinkedHashMap) v5Var.Yi7zF1RB1).entrySet()) {
                    v5Var.rQPn8YBR(((ww0) entry3.getValue()).GWasM1elztuh(), (String) entry3.getKey());
                }
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) v5Var.GWasM1elztuh;
                if (linkedHashMap2.isEmpty()) {
                    rn0VarArr = new rn0[0];
                } else {
                    ArrayList arrayList = new ArrayList(linkedHashMap2.size());
                    for (Map.Entry entry4 : linkedHashMap2.entrySet()) {
                        arrayList.add(new rn0((String) entry4.getKey(), entry4.getValue()));
                    }
                    rn0VarArr = (rn0[]) arrayList.toArray(new rn0[0]);
                }
                return ki1.jivtDDk9H((rn0[]) Arrays.copyOf(rn0VarArr, rn0VarArr.length));
        }
    }
}
