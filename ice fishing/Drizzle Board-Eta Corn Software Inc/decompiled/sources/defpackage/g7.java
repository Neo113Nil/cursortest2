package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final /* synthetic */ class g7 implements bx {
    public final /* synthetic */ f4UNdked NCTxEWno;
    public final /* synthetic */ int qoPGr6Ce;

    public /* synthetic */ g7(f4UNdked f4undked, int i) {
        this.qoPGr6Ce = i;
        this.NCTxEWno = f4undked;
    }

    @Override // defpackage.bx
    public final void qoPGr6Ce() {
        int i = this.qoPGr6Ce;
        f4UNdked f4undked = this.NCTxEWno;
        switch (i) {
            case 0:
                Bundle b2ZJblxo = ((mcXgUFR8) f4undked.P7K7Inc8.NCTxEWno).b2ZJblxo("android:support:activity-result");
                if (b2ZJblxo != null) {
                    h7 h7Var = f4undked.ow5vqvCr;
                    HashMap hashMap = h7Var.NCTxEWno;
                    HashMap hashMap2 = h7Var.qoPGr6Ce;
                    Bundle bundle = h7Var.b2ZJblxo;
                    ArrayList<Integer> integerArrayList = b2ZJblxo.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = b2ZJblxo.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList != null && integerArrayList != null) {
                        h7Var.wxUZMvaN = b2ZJblxo.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                        bundle.putAll(b2ZJblxo.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
                        for (int i2 = 0; i2 < stringArrayList.size(); i2++) {
                            String str = stringArrayList.get(i2);
                            if (hashMap.containsKey(str)) {
                                Integer num = (Integer) hashMap.remove(str);
                                if (!bundle.containsKey(str)) {
                                    hashMap2.remove(num);
                                }
                            }
                            Integer num2 = integerArrayList.get(i2);
                            num2.intValue();
                            String str2 = stringArrayList.get(i2);
                            hashMap2.put(num2, str2);
                            h7Var.NCTxEWno.put(str2, num2);
                        }
                        break;
                    }
                }
                break;
            default:
                ni niVar = (ni) f4undked.Ey6iv0m0.MdtA4re8;
                niVar.KlHjfFWx.NCTxEWno(niVar, niVar, null);
                break;
        }
    }
}
