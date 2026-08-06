package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class eg0 {
    public final LinkedHashMap GWasM1elztuh;
    public final j6IIN2O8eOU Yi7zF1RB1;

    public eg0(LinkedHashMap linkedHashMap, boolean z) {
        this.GWasM1elztuh = linkedHashMap;
        this.Yi7zF1RB1 = new j6IIN2O8eOU(z);
    }

    public final Map GWasM1elztuh() {
        rn0 rn0Var;
        Set<Map.Entry> entrySet = this.GWasM1elztuh.entrySet();
        int EXrPz3p7hFb = rc0.EXrPz3p7hFb(sb.dcDmLGVhzWm(entrySet, 10));
        if (EXrPz3p7hFb < 16) {
            EXrPz3p7hFb = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(EXrPz3p7hFb);
        for (Map.Entry entry : entrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                rn0Var = new rn0(entry.getKey(), Arrays.copyOf(bArr, bArr.length));
            } else {
                rn0Var = new rn0(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(rn0Var.OOA6hdeuvCS, rn0Var.EljAMC1QTz);
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        unmodifiableMap.getClass();
        return unmodifiableMap;
    }

    public final void OOA6hdeuvCS(dr0 dr0Var, Object obj) {
        dr0Var.getClass();
        Yi7zF1RB1();
        LinkedHashMap linkedHashMap = this.GWasM1elztuh;
        if (obj == null) {
            Yi7zF1RB1();
            linkedHashMap.remove(dr0Var);
        } else if (obj instanceof Set) {
            Set unmodifiableSet = Collections.unmodifiableSet(rb.Hc2GqxcqBiX((Set) obj));
            unmodifiableSet.getClass();
            linkedHashMap.put(dr0Var, unmodifiableSet);
        } else if (!(obj instanceof byte[])) {
            linkedHashMap.put(dr0Var, obj);
        } else {
            byte[] bArr = (byte[]) obj;
            linkedHashMap.put(dr0Var, Arrays.copyOf(bArr, bArr.length));
        }
    }

    public final Object X1lG3V04pd(dr0 dr0Var) {
        dr0Var.getClass();
        Object obj = this.GWasM1elztuh.get(dr0Var);
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final void Yi7zF1RB1() {
        if (((AtomicBoolean) this.Yi7zF1RB1.EljAMC1QTz).get()) {
            o4.jivtDDk9H("Do mutate preferences once returned to DataStore.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[LOOP:0: B:10:0x002a->B:24:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z;
        if (obj instanceof eg0) {
            LinkedHashMap linkedHashMap = ((eg0) obj).GWasM1elztuh;
            LinkedHashMap linkedHashMap2 = this.GWasM1elztuh;
            if (linkedHashMap != linkedHashMap2) {
                if (linkedHashMap.size() == linkedHashMap2.size()) {
                    if (!linkedHashMap.isEmpty()) {
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            Object obj2 = linkedHashMap2.get(entry.getKey());
                            if (obj2 != null) {
                                Object value = entry.getValue();
                                if (!(value instanceof byte[])) {
                                    z = o30.rQPn8YBR(value, obj2);
                                } else if ((obj2 instanceof byte[]) && Arrays.equals((byte[]) value, (byte[]) obj2)) {
                                    z = true;
                                }
                                if (z) {
                                }
                            }
                            z = false;
                            if (z) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = this.GWasM1elztuh.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            i += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return i;
    }

    public final String toString() {
        return rb.WkXHDbKiD(this.GWasM1elztuh.entrySet(), ",\n", "{\n", "\n}", new bCsSzSHkbaQ(24), 24);
    }

    public final void xqGvceK5x(dr0 dr0Var, Object obj) {
        dr0Var.getClass();
        OOA6hdeuvCS(dr0Var, obj);
    }

    public /* synthetic */ eg0(boolean z) {
        this(new LinkedHashMap(), z);
    }
}
