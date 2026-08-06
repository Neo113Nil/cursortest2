package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ns0 {
    public static final ns0 X1lG3V04pd = new ns0();
    public final ConcurrentHashMap Yi7zF1RB1 = new ConcurrentHashMap();
    public final j6IIN2O8eOU GWasM1elztuh = new j6IIN2O8eOU(1);

    public final nx0 GWasM1elztuh(Class cls) {
        ar arVar;
        nx0 lv06NcmrQ;
        Class cls2;
        i30.GWasM1elztuh(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.Yi7zF1RB1;
        nx0 nx0Var = (nx0) concurrentHashMap.get(cls);
        if (nx0Var != null) {
            return nx0Var;
        }
        j6IIN2O8eOU j6iin2o8eou = this.GWasM1elztuh;
        j6iin2o8eou.getClass();
        Class cls3 = ox0.GWasM1elztuh;
        if (!ay.class.isAssignableFrom(cls) && (cls2 = ox0.GWasM1elztuh) != null && !cls2.isAssignableFrom(cls)) {
            o4.mE4lRynR("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            return null;
        }
        us0 GWasM1elztuh = ((ec0) j6iin2o8eou.EljAMC1QTz).GWasM1elztuh(cls);
        if ((GWasM1elztuh.xqGvceK5x & 2) == 2) {
            if (ay.class.isAssignableFrom(cls)) {
                lv06NcmrQ = new wd0(ox0.X1lG3V04pd, br.GWasM1elztuh, GWasM1elztuh.GWasM1elztuh);
            } else {
                mc1 mc1Var = ox0.Yi7zF1RB1;
                ar arVar2 = br.Yi7zF1RB1;
                if (arVar2 == null) {
                    o4.jivtDDk9H("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                lv06NcmrQ = new wd0(mc1Var, arVar2, GWasM1elztuh.GWasM1elztuh);
            }
        } else if (ay.class.isAssignableFrom(cls)) {
            oj0 oj0Var = pj0.Yi7zF1RB1;
            va0 va0Var = wa0.Yi7zF1RB1;
            mc1 mc1Var2 = ox0.X1lG3V04pd;
            ar arVar3 = mr0.YmKjaVtbfp5Z(GWasM1elztuh.GWasM1elztuh()) != 1 ? br.GWasM1elztuh : null;
            oc0 oc0Var = pc0.Yi7zF1RB1;
            if (!(GWasM1elztuh instanceof us0)) {
                int[] iArr = vd0.uFEq9NpZ;
                o4.YmKjaVtbfp5Z();
                return null;
            }
            lv06NcmrQ = vd0.lv06NcmrQ(GWasM1elztuh, oj0Var, va0Var, mc1Var2, arVar3, oc0Var);
        } else {
            oj0 oj0Var2 = pj0.GWasM1elztuh;
            va0 va0Var2 = wa0.GWasM1elztuh;
            mc1 mc1Var3 = ox0.Yi7zF1RB1;
            if (mr0.YmKjaVtbfp5Z(GWasM1elztuh.GWasM1elztuh()) != 1) {
                ar arVar4 = br.Yi7zF1RB1;
                if (arVar4 == null) {
                    o4.jivtDDk9H("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                arVar = arVar4;
            } else {
                arVar = null;
            }
            oc0 oc0Var2 = pc0.GWasM1elztuh;
            if (!(GWasM1elztuh instanceof us0)) {
                int[] iArr2 = vd0.uFEq9NpZ;
                o4.YmKjaVtbfp5Z();
                return null;
            }
            lv06NcmrQ = vd0.lv06NcmrQ(GWasM1elztuh, oj0Var2, va0Var2, mc1Var3, arVar, oc0Var2);
        }
        nx0 nx0Var2 = (nx0) concurrentHashMap.putIfAbsent(cls, lv06NcmrQ);
        return nx0Var2 != null ? nx0Var2 : lv06NcmrQ;
    }
}
