package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final /* synthetic */ class ad {
    public final /* synthetic */ fd GWasM1elztuh;

    public /* synthetic */ ad(fd fdVar) {
        this.GWasM1elztuh = fdVar;
    }

    public final void GWasM1elztuh(Context context) {
        context.getClass();
        fd fdVar = this.GWasM1elztuh;
        Bundle rQPn8YBR = ((d) fdVar.encWxUiV2.AvO7iQsrTN).rQPn8YBR("android:support:activity-result");
        if (rQPn8YBR != null) {
            dd ddVar = fdVar.E7jCp8Ls;
            LinkedHashMap linkedHashMap = ddVar.GWasM1elztuh;
            Bundle bundle = ddVar.EljAMC1QTz;
            LinkedHashMap linkedHashMap2 = ddVar.Yi7zF1RB1;
            ArrayList<Integer> integerArrayList = rQPn8YBR.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = rQPn8YBR.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = rQPn8YBR.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                ddVar.X1lG3V04pd.addAll(stringArrayList2);
            }
            Bundle bundle2 = rQPn8YBR.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            int size = stringArrayList.size();
            for (int i = 0; i < size; i++) {
                String str = stringArrayList.get(i);
                if (linkedHashMap2.containsKey(str)) {
                    Integer num = (Integer) linkedHashMap2.remove(str);
                    if (!bundle.containsKey(str)) {
                        fb1.rQPn8YBR(linkedHashMap).remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i);
                num2.getClass();
                int intValue = num2.intValue();
                String str2 = stringArrayList.get(i);
                str2.getClass();
                String str3 = str2;
                linkedHashMap.put(Integer.valueOf(intValue), str3);
                linkedHashMap2.put(str3, Integer.valueOf(intValue));
            }
        }
    }
}
