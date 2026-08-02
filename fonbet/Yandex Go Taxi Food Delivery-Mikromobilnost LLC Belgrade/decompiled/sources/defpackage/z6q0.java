package defpackage;

import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.contract.CardNetwork;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes12.dex */
public final class z6q0 {
    public final lk8 a;
    public final LinkedHashMap b;

    public z6q0(Map map, lk8 lk8Var) {
        LinkedHashMap linkedHashMap;
        this.a = lk8Var;
        if (map != null) {
            linkedHashMap = new LinkedHashMap(gw00.d(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(((String) entry.getKey()).toLowerCase(Locale.ROOT), entry.getValue());
            }
        } else {
            linkedHashMap = null;
        }
        this.b = linkedHashMap;
    }

    public final v6q0 a(CardNetwork cardNetwork) {
        pj8 pj8Var;
        int i = x6q0.a[cardNetwork.ordinal()];
        int i2 = i != 1 ? i != 2 ? i != 3 ? i != 4 ? vxh0.finsdk_cvv : vxh0.finsdk_cvv : vxh0.finsdk_cvn : vxh0.finsdk_cvc : vxh0.finsdk_cvp;
        String lowerCase = cardNetwork.getStringCode().toLowerCase(Locale.ROOT);
        LinkedHashMap linkedHashMap = this.b;
        return new v6q0(i2, (linkedHashMap == null || (pj8Var = (pj8) linkedHashMap.get(lowerCase)) == null) ? null : pj8Var.d);
    }

    public z6q0() {
        this(null, new lk8(0));
    }
}
