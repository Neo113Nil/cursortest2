package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ef1 {
    public final LinkedHashMap GWasM1elztuh = new LinkedHashMap();

    public final void GWasM1elztuh() {
        LinkedHashMap linkedHashMap = this.GWasM1elztuh;
        Map AEn1Rrio = rc0.AEn1Rrio(linkedHashMap);
        linkedHashMap.clear();
        Iterator it = AEn1Rrio.values().iterator();
        while (it.hasNext()) {
            ((we1) it.next()).Yi7zF1RB1();
        }
    }

    public final String toString() {
        String Yi7zF1RB1 = st0.GWasM1elztuh(ef1.class).Yi7zF1RB1();
        if (Yi7zF1RB1 == null) {
            Yi7zF1RB1 = "ViewModelStore";
        }
        int hashCode = hashCode();
        ki1.Y6hRI1cF8(16);
        String num = Integer.toString(hashCode, 16);
        num.getClass();
        return Yi7zF1RB1 + "@" + num + "(keys=" + rb.Hc2GqxcqBiX(this.GWasM1elztuh.keySet()) + ")";
    }
}
