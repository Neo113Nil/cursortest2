package defpackage;

import com.combinations.level.experts.core.domain.model.GameProgress;
import com.combinations.level.experts.core.domain.model.LevelResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class lj {
    public static final dr0 X1lG3V04pd = new dr0("level_results");
    public static final dr0 xqGvceK5x = new dr0("hint_tokens");
    public final gi GWasM1elztuh;
    public final jj Yi7zF1RB1;

    public lj(gi giVar) {
        this.GWasM1elztuh = giVar;
        this.Yi7zF1RB1 = new jj(giVar.Yi7zF1RB1(), this, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Iterable] */
    public static final GameProgress GWasM1elztuh(lj ljVar, eg0 eg0Var) {
        ?? Fm8W7vP7q;
        Map ozMwhSAI;
        Integer VeqTn1PQw7;
        Integer VeqTn1PQw72;
        ljVar.getClass();
        String str = (String) eg0Var.X1lG3V04pd(X1lG3V04pd);
        if (str == null) {
            str = "";
        }
        if (b61.MItybXapHX(str)) {
            ozMwhSAI = yp.OOA6hdeuvCS;
        } else {
            String[] strArr = {"|"};
            String str2 = strArr[0];
            if (str2.length() == 0) {
                List asList = Arrays.asList(strArr);
                asList.getClass();
                z01 z01Var = new z01(new cl(str, new k4(13, asList), 0));
                Fm8W7vP7q = new ArrayList(sb.dcDmLGVhzWm(z01Var, 10));
                Iterator it = z01Var.iterator();
                while (true) {
                    bl blVar = (bl) it;
                    if (!blVar.hasNext()) {
                        break;
                    }
                    x20 x20Var = (x20) blVar.next();
                    x20Var.getClass();
                    Fm8W7vP7q.add(str.subSequence(x20Var.OOA6hdeuvCS, x20Var.EljAMC1QTz + 1).toString());
                }
            } else {
                Fm8W7vP7q = b61.Fm8W7vP7q(str, str2);
            }
            ArrayList arrayList = new ArrayList();
            for (String str3 : Fm8W7vP7q) {
                str3.getClass();
                List Fm8W7vP7q2 = b61.Fm8W7vP7q(str3, String.valueOf(new char[]{':'}[0]));
                rn0 rn0Var = null;
                if (Fm8W7vP7q2.size() == 4 && (VeqTn1PQw7 = i61.VeqTn1PQw7((String) Fm8W7vP7q2.get(0))) != null && (VeqTn1PQw72 = i61.VeqTn1PQw7((String) Fm8W7vP7q2.get(1))) != null) {
                    int intValue = VeqTn1PQw72.intValue();
                    Integer VeqTn1PQw73 = i61.VeqTn1PQw7((String) Fm8W7vP7q2.get(2));
                    if (VeqTn1PQw73 != null) {
                        int intValue2 = VeqTn1PQw73.intValue();
                        Long z19UFEN2I = i61.z19UFEN2I((String) Fm8W7vP7q2.get(3));
                        if (z19UFEN2I != null) {
                            rn0Var = new rn0(VeqTn1PQw7, new LevelResult(o50.encWxUiV2(intValue, 0, 3), intValue2, z19UFEN2I.longValue()));
                        }
                    }
                }
                if (rn0Var != null) {
                    arrayList.add(rn0Var);
                }
            }
            ozMwhSAI = rc0.ozMwhSAI(arrayList);
        }
        Integer num = (Integer) eg0Var.X1lG3V04pd(xqGvceK5x);
        int intValue3 = num != null ? num.intValue() : 5;
        return new GameProgress(ozMwhSAI, intValue3 >= 0 ? intValue3 : 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Yi7zF1RB1(wg wgVar) {
        kj kjVar;
        int i;
        nt0 nt0Var;
        if (wgVar instanceof kj) {
            kjVar = (kj) wgVar;
            int i2 = kjVar.rQPn8YBR;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kjVar.rQPn8YBR = i2 - Integer.MIN_VALUE;
                Object obj = kjVar.mOu10nynGul;
                i = kjVar.rQPn8YBR;
                vg vgVar = null;
                int i3 = 1;
                if (i != 0) {
                    o50.A1EKNP6CxJ(obj);
                    nt0 nt0Var2 = new nt0();
                    oi oiVar = new oi(nt0Var2, vgVar, i3);
                    kjVar.encWxUiV2 = nt0Var2;
                    kjVar.rQPn8YBR = 1;
                    Object JFJ3QoxA = w60.JFJ3QoxA(this.GWasM1elztuh, oiVar, kjVar);
                    qh qhVar = qh.OOA6hdeuvCS;
                    if (JFJ3QoxA == qhVar) {
                        return qhVar;
                    }
                    nt0Var = nt0Var2;
                } else {
                    if (i != 1) {
                        o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    nt0Var = kjVar.encWxUiV2;
                    o50.A1EKNP6CxJ(obj);
                }
                return Boolean.valueOf(nt0Var.OOA6hdeuvCS);
            }
        }
        kjVar = new kj(this, wgVar);
        Object obj2 = kjVar.mOu10nynGul;
        i = kjVar.rQPn8YBR;
        vg vgVar2 = null;
        int i32 = 1;
        if (i != 0) {
        }
        return Boolean.valueOf(nt0Var.OOA6hdeuvCS);
    }
}
