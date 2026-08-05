package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class vi {
    public final /* synthetic */ ej NCTxEWno;
    public final /* synthetic */ int qoPGr6Ce;

    public /* synthetic */ vi(ej ejVar, int i) {
        this.qoPGr6Ce = i;
        this.NCTxEWno = ejVar;
    }

    public final void qoPGr6Ce(Object obj) {
        int i = this.qoPGr6Ce;
        ej ejVar = this.NCTxEWno;
        switch (i) {
            case 0:
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    iArr[i2] = ((Boolean) arrayList.get(i2)).booleanValue() ? 0 : -1;
                }
                aj ajVar = (aj) ejVar.Mq3SeTnW.pollFirst();
                if (ajVar == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                    break;
                } else {
                    String str = ajVar.NCTxEWno;
                    if (ejVar.MdtA4re8.MdtA4re8(str) == null) {
                        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                        break;
                    }
                }
                break;
            case 1:
                Bo5Vs0Am bo5Vs0Am = (Bo5Vs0Am) obj;
                aj ajVar2 = (aj) ejVar.Mq3SeTnW.pollLast();
                if (ajVar2 == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                    break;
                } else {
                    String str2 = ajVar2.NCTxEWno;
                    int i3 = ajVar2.MdtA4re8;
                    li MdtA4re8 = ejVar.MdtA4re8.MdtA4re8(str2);
                    if (MdtA4re8 == null) {
                        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str2);
                        break;
                    } else {
                        MdtA4re8.I5GHvsYW(i3, bo5Vs0Am.NCTxEWno, bo5Vs0Am.MdtA4re8);
                        break;
                    }
                }
            default:
                Bo5Vs0Am bo5Vs0Am2 = (Bo5Vs0Am) obj;
                aj ajVar3 = (aj) ejVar.Mq3SeTnW.pollFirst();
                if (ajVar3 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                    break;
                } else {
                    String str3 = ajVar3.NCTxEWno;
                    int i4 = ajVar3.MdtA4re8;
                    li MdtA4re82 = ejVar.MdtA4re8.MdtA4re8(str3);
                    if (MdtA4re82 == null) {
                        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str3);
                        break;
                    } else {
                        MdtA4re82.I5GHvsYW(i4, bo5Vs0Am2.NCTxEWno, bo5Vs0Am2.MdtA4re8);
                        break;
                    }
                }
        }
    }
}
