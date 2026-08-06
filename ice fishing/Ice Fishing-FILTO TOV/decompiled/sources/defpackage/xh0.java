package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class xh0 {
    public static final /* synthetic */ int mOu10nynGul = 0;
    public bi0 AvO7iQsrTN;
    public final ai0 EljAMC1QTz;
    public final String OOA6hdeuvCS;
    public final y41 encWxUiV2;

    static {
        new LinkedHashMap();
    }

    public xh0(ej0 ej0Var) {
        ej0Var.getClass();
        LinkedHashMap linkedHashMap = fj0.Yi7zF1RB1;
        this.OOA6hdeuvCS = z50.Mjvvu5DE(ej0Var.getClass());
        ai0 ai0Var = new ai0();
        ai0Var.Yi7zF1RB1 = this;
        ai0Var.X1lG3V04pd = new ArrayList();
        ai0Var.xqGvceK5x = new LinkedHashMap();
        this.EljAMC1QTz = ai0Var;
        this.encWxUiV2 = new y41();
    }

    public final Bundle GWasM1elztuh(Bundle bundle) {
        Object obj;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.EljAMC1QTz.xqGvceK5x;
        if (bundle == null && linkedHashMap.isEmpty()) {
            return null;
        }
        Bundle jivtDDk9H = ki1.jivtDDk9H((rn0[]) Arrays.copyOf(new rn0[0], 0));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            eh0 eh0Var = (eh0) entry.getValue();
            eh0Var.getClass();
            str.getClass();
            if (eh0Var.Yi7zF1RB1 && (obj = eh0Var.X1lG3V04pd) != null) {
                eh0Var.GWasM1elztuh.OOA6hdeuvCS(jivtDDk9H, str, obj);
            }
        }
        if (bundle != null) {
            jivtDDk9H.putAll(bundle);
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str2 = (String) entry2.getKey();
                eh0 eh0Var2 = (eh0) entry2.getValue();
                eh0Var2.getClass();
                ui0 ui0Var = eh0Var2.GWasM1elztuh;
                str2.getClass();
                if (!jivtDDk9H.containsKey(str2) || !o50.M3K9sHhK(jivtDDk9H, str2)) {
                    try {
                        ui0Var.GWasM1elztuh(jivtDDk9H, str2);
                    } catch (IllegalStateException unused) {
                    }
                }
                o4.JFJ3QoxA("Wrong argument type for '", str2, "' in argument savedState. ", ui0Var.Yi7zF1RB1(), " expected.");
                return null;
            }
        }
        return jivtDDk9H;
    }

    public wh0 X1lG3V04pd(f4 f4Var) {
        boolean matches;
        ut0 ut0Var;
        f4 GWasM1elztuh;
        ai0 ai0Var = this.EljAMC1QTz;
        LinkedHashMap linkedHashMap = (LinkedHashMap) ai0Var.xqGvceK5x;
        Uri uri = (Uri) f4Var.Yi7zF1RB1;
        ArrayList arrayList = (ArrayList) ai0Var.X1lG3V04pd;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        wh0 wh0Var = null;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            vh0 vh0Var = (vh0) obj;
            vh0Var.getClass();
            m71 m71Var = vh0Var.xqGvceK5x;
            if (((ut0) m71Var.getValue()) == null) {
                matches = true;
            } else if (uri == null) {
                matches = false;
            } else {
                ut0 ut0Var2 = (ut0) m71Var.getValue();
                ut0Var2.getClass();
                String uri2 = uri.toString();
                uri2.getClass();
                matches = ut0Var2.OOA6hdeuvCS.matcher(uri2).matches();
            }
            if (matches) {
                Bundle xqGvceK5x = uri != null ? vh0Var.xqGvceK5x(uri, linkedHashMap) : null;
                int Yi7zF1RB1 = vh0Var.Yi7zF1RB1(uri);
                String str = (String) f4Var.X1lG3V04pd;
                boolean z = str != null && str.equals(null);
                if (xqGvceK5x == null) {
                    if (z) {
                        linkedHashMap.getClass();
                        Bundle jivtDDk9H = ki1.jivtDDk9H((rn0[]) Arrays.copyOf(new rn0[0], 0));
                        if (uri != null && (ut0Var = (ut0) m71Var.getValue()) != null && (GWasM1elztuh = ut0Var.GWasM1elztuh(uri.toString())) != null) {
                            vh0Var.OOA6hdeuvCS(GWasM1elztuh, jivtDDk9H, linkedHashMap);
                            if (((Boolean) vh0Var.OOA6hdeuvCS.getValue()).booleanValue()) {
                                vh0Var.EljAMC1QTz(uri, jivtDDk9H, linkedHashMap);
                            }
                        }
                        if (w60.mE4lRynR(linkedHashMap, new th0(jivtDDk9H, 1)).isEmpty()) {
                        }
                    }
                }
                wh0 wh0Var2 = new wh0((xh0) ai0Var.Yi7zF1RB1, xqGvceK5x, vh0Var.E7jCp8Ls, Yi7zF1RB1, z);
                if (wh0Var == null || wh0Var2.compareTo(wh0Var) > 0) {
                    wh0Var = wh0Var2;
                }
            }
        }
        return wh0Var;
    }

    public final Map Yi7zF1RB1() {
        return rc0.AEn1Rrio((LinkedHashMap) this.EljAMC1QTz.xqGvceK5x);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this != obj) {
            if (obj != null && (obj instanceof xh0)) {
                ai0 ai0Var = this.EljAMC1QTz;
                ArrayList arrayList = (ArrayList) ai0Var.X1lG3V04pd;
                xh0 xh0Var = (xh0) obj;
                y41 y41Var = xh0Var.encWxUiV2;
                ai0 ai0Var2 = xh0Var.EljAMC1QTz;
                boolean rQPn8YBR = o30.rQPn8YBR(arrayList, (ArrayList) ai0Var2.X1lG3V04pd);
                y41 y41Var2 = this.encWxUiV2;
                if (y41Var2.OOA6hdeuvCS() == y41Var.OOA6hdeuvCS()) {
                    Iterator it = x01.k8h8IjolWQ(new z41(y41Var2)).iterator();
                    while (it.hasNext()) {
                        int intValue = ((Number) it.next()).intValue();
                        if (!o30.rQPn8YBR(y41Var2.Yi7zF1RB1(intValue), y41Var.Yi7zF1RB1(intValue))) {
                        }
                    }
                    z = true;
                    if (Yi7zF1RB1().size() == xh0Var.Yi7zF1RB1().size()) {
                        Set<Map.Entry> entrySet = Yi7zF1RB1().entrySet();
                        entrySet.getClass();
                        for (Map.Entry entry : entrySet) {
                            if (xh0Var.Yi7zF1RB1().containsKey(entry.getKey()) && o30.rQPn8YBR(xh0Var.Yi7zF1RB1().get(entry.getKey()), entry.getValue())) {
                            }
                        }
                        z2 = true;
                        if (ai0Var.GWasM1elztuh == ai0Var2.GWasM1elztuh || !o30.rQPn8YBR((String) ai0Var.OOA6hdeuvCS, (String) ai0Var2.OOA6hdeuvCS) || !rQPn8YBR || !z || !z2) {
                        }
                    }
                    z2 = false;
                    if (ai0Var.GWasM1elztuh == ai0Var2.GWasM1elztuh) {
                    }
                }
                z = false;
                if (Yi7zF1RB1().size() == xh0Var.Yi7zF1RB1().size()) {
                }
                z2 = false;
                if (ai0Var.GWasM1elztuh == ai0Var2.GWasM1elztuh) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        ai0 ai0Var = this.EljAMC1QTz;
        int i = ai0Var.GWasM1elztuh * 31;
        String str = (String) ai0Var.OOA6hdeuvCS;
        int hashCode = i + (str != null ? str.hashCode() : 0);
        ArrayList arrayList = (ArrayList) ai0Var.X1lG3V04pd;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            hashCode = (((vh0) obj).GWasM1elztuh.hashCode() + (hashCode * 31)) * 961;
        }
        y41 y41Var = this.encWxUiV2;
        y41Var.getClass();
        if (y41Var.OOA6hdeuvCS() > 0) {
            y41Var.EljAMC1QTz(0).getClass();
            o4.YmKjaVtbfp5Z();
            return 0;
        }
        for (String str2 : Yi7zF1RB1().keySet()) {
            int hashCode2 = (str2.hashCode() + (hashCode * 31)) * 31;
            Object obj2 = Yi7zF1RB1().get(str2);
            hashCode = (obj2 != null ? obj2.hashCode() : 0) + hashCode2;
        }
        return hashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(0x");
        ai0 ai0Var = this.EljAMC1QTz;
        ai0Var.getClass();
        sb.append(Integer.toHexString(ai0Var.GWasM1elztuh));
        sb.append(")");
        String str = (String) ai0Var.OOA6hdeuvCS;
        if (str != null && !b61.MItybXapHX(str)) {
            sb.append(" route=");
            sb.append((String) ai0Var.OOA6hdeuvCS);
        }
        return sb.toString();
    }
}
