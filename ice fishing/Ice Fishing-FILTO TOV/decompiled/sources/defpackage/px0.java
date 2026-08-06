package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class px0 {
    public volatile ThreadLocal AvO7iQsrTN;
    public final ArrayList EljAMC1QTz;
    public final rs0 GWasM1elztuh;
    public final v5 OOA6hdeuvCS;
    public final boolean X1lG3V04pd;
    public final String Yi7zF1RB1;
    public final hb1 xqGvceK5x;

    public px0(rs0 rs0Var, String str, hb1 hb1Var, v5 v5Var, int i) {
        boolean z = (i & 4) == 0;
        hb1Var = (i & 8) != 0 ? null : hb1Var;
        rs0Var.getClass();
        this.GWasM1elztuh = rs0Var;
        this.Yi7zF1RB1 = str;
        this.X1lG3V04pd = z;
        this.xqGvceK5x = hb1Var;
        this.OOA6hdeuvCS = v5Var;
        this.EljAMC1QTz = new ArrayList();
        new LinkedHashSet();
    }

    public final Object EljAMC1QTz(va vaVar, ao0 ao0Var) {
        v5 v5Var = this.OOA6hdeuvCS;
        rx0 rx0Var = new rx0((w60) v5Var.GWasM1elztuh, this, vaVar, ao0Var);
        if (ao0Var == null) {
            return OOA6hdeuvCS(rx0Var);
        }
        w60 w60Var = (w60) v5Var.GWasM1elztuh;
        w60Var.getClass();
        g90 g90Var = g90.mOu10nynGul;
        g90 g90Var2 = g90.OOA6hdeuvCS;
        if (g90Var.compareTo(g90Var2) <= 0) {
            w60Var.mOu10nynGul(g90Var2, "| >> parameters " + ao0Var);
        }
        v4 X1lG3V04pd = X1lG3V04pd(ao0Var);
        try {
            return OOA6hdeuvCS(rx0Var);
        } finally {
            w60 w60Var2 = (w60) v5Var.GWasM1elztuh;
            w60Var2.getClass();
            w60Var2.Mjvvu5DE(g90Var2, "| << parameters");
            GWasM1elztuh(X1lG3V04pd);
        }
    }

    public final void GWasM1elztuh(v4 v4Var) {
        if (!v4Var.isEmpty()) {
            v4Var.removeFirst();
        }
        if (v4Var.isEmpty()) {
            Yi7zF1RB1().remove();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x02bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0190  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OOA6hdeuvCS(rx0 rx0Var) {
        String str;
        v4 v4Var;
        ao0 ao0Var;
        o20 iwATDS1i01k;
        v4 v4Var2;
        ao0 ao0Var2;
        hb1 hb1Var;
        d dVar = (d) this.OOA6hdeuvCS.Yi7zF1RB1;
        dVar.getClass();
        ao0 ao0Var3 = (ao0) rx0Var.AvO7iQsrTN;
        Object obj = null;
        Object GWasM1elztuh = (ao0Var3 == null || ao0Var3.GWasM1elztuh.isEmpty()) ? null : ((ao0) rx0Var.AvO7iQsrTN).GWasM1elztuh((va) rx0Var.EljAMC1QTz);
        if (GWasM1elztuh == null) {
            ThreadLocal threadLocal = this.AvO7iQsrTN;
            GWasM1elztuh = (threadLocal == null || (v4Var = (v4) threadLocal.get()) == null || v4Var.isEmpty() || (ao0Var = (ao0) v4Var.EljAMC1QTz()) == null) ? null : ao0Var.GWasM1elztuh((va) rx0Var.EljAMC1QTz);
            if (GWasM1elztuh == null) {
                v5 v5Var = (v5) dVar.EljAMC1QTz;
                o20 iwATDS1i01k2 = ((f4) v5Var.xqGvceK5x).iwATDS1i01k((va) rx0Var.EljAMC1QTz, null, this.GWasM1elztuh);
                if (iwATDS1i01k2 == null) {
                    iwATDS1i01k2 = (this.X1lG3V04pd || (hb1Var = this.xqGvceK5x) == null) ? null : ((f4) v5Var.xqGvceK5x).iwATDS1i01k((va) rx0Var.EljAMC1QTz, null, hb1Var);
                }
                GWasM1elztuh = iwATDS1i01k2 != null ? iwATDS1i01k2.Yi7zF1RB1(rx0Var) : null;
                if (GWasM1elztuh == null) {
                    if (!this.X1lG3V04pd) {
                        ((va) rx0Var.EljAMC1QTz).X1lG3V04pd(null);
                    }
                    ArrayList arrayList = this.EljAMC1QTz;
                    arrayList.getClass();
                    LinkedHashSet<px0> linkedHashSet = new LinkedHashSet();
                    v4 v4Var3 = new v4(new bv0(arrayList));
                    while (!v4Var3.isEmpty()) {
                        px0 px0Var = (px0) v4Var3.removeLast();
                        if (linkedHashSet.add(px0Var)) {
                            Iterator it = px0Var.EljAMC1QTz.iterator();
                            it.getClass();
                            while (it.hasNext()) {
                                Object next = it.next();
                                next.getClass();
                                px0 px0Var2 = (px0) next;
                                if (!linkedHashSet.contains(px0Var2)) {
                                    v4Var3.addLast(px0Var2);
                                }
                            }
                        }
                    }
                    if (!linkedHashSet.isEmpty()) {
                        for (px0 px0Var3 : linkedHashSet) {
                            v5 v5Var2 = (v5) dVar.EljAMC1QTz;
                            hb1 hb1Var2 = px0Var3.xqGvceK5x;
                            if (hb1Var2 == null || (iwATDS1i01k = ((f4) v5Var2.xqGvceK5x).iwATDS1i01k((va) rx0Var.EljAMC1QTz, null, hb1Var2)) == null) {
                                iwATDS1i01k = ((f4) v5Var2.xqGvceK5x).iwATDS1i01k((va) rx0Var.EljAMC1QTz, null, px0Var3.GWasM1elztuh);
                            }
                            if (iwATDS1i01k == null) {
                                ThreadLocal threadLocal2 = px0Var3.AvO7iQsrTN;
                                Object GWasM1elztuh2 = (threadLocal2 == null || (v4Var2 = (v4) threadLocal2.get()) == null || v4Var2.isEmpty() || (ao0Var2 = (ao0) v4Var2.EljAMC1QTz()) == null) ? null : ao0Var2.GWasM1elztuh((va) rx0Var.EljAMC1QTz);
                                if (GWasM1elztuh2 != null) {
                                    GWasM1elztuh = GWasM1elztuh2;
                                    break;
                                }
                            } else if (!px0Var3.X1lG3V04pd || (iwATDS1i01k instanceof o21)) {
                                w60 w60Var = (w60) rx0Var.OOA6hdeuvCS;
                                va vaVar = (va) rx0Var.EljAMC1QTz;
                                ao0 ao0Var4 = (ao0) rx0Var.AvO7iQsrTN;
                                rx0 rx0Var2 = new rx0(w60Var, px0Var3, vaVar, ao0Var4);
                                v4 X1lG3V04pd = ao0Var4 != null ? px0Var3.X1lG3V04pd(ao0Var4) : null;
                                GWasM1elztuh = iwATDS1i01k.Yi7zF1RB1(rx0Var2);
                                if (X1lG3V04pd != null) {
                                    px0Var3.GWasM1elztuh(X1lG3V04pd);
                                }
                            } else {
                                GWasM1elztuh = iwATDS1i01k.Yi7zF1RB1(rx0Var);
                            }
                        }
                    }
                    GWasM1elztuh = null;
                }
                if (GWasM1elztuh == null) {
                    Iterator it2 = ((ArrayList) dVar.AvO7iQsrTN).iterator();
                    if (it2.hasNext()) {
                        it2.next().getClass();
                        o4.YmKjaVtbfp5Z();
                        return null;
                    }
                    if (obj == null) {
                        return obj;
                    }
                    String str2 = o30.rQPn8YBR((px0) rx0Var.encWxUiV2, this) ? "scope '" + this + '\'' : "scope '" + this + "' (resolution context scope: '" + ((px0) rx0Var.encWxUiV2) + "')";
                    ArrayList arrayList2 = this.EljAMC1QTz;
                    ArrayList arrayList3 = new ArrayList(sb.dcDmLGVhzWm(arrayList2, 10));
                    int size = arrayList2.size();
                    int i = 0;
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj2 = arrayList2.get(i2);
                        i2++;
                        arrayList3.add(((px0) obj2).Yi7zF1RB1);
                    }
                    if (arrayList3.isEmpty()) {
                        str = "";
                    } else {
                        StringBuilder sb = new StringBuilder(" Searched scopes: ['");
                        sb.append(this.Yi7zF1RB1);
                        sb.append("'] -> ");
                        ArrayList arrayList4 = new ArrayList(sb.dcDmLGVhzWm(arrayList3, 10));
                        int size2 = arrayList3.size();
                        while (i < size2) {
                            Object obj3 = arrayList3.get(i);
                            i++;
                            arrayList4.add("['" + ((String) obj3) + "']");
                        }
                        sb.append(arrayList4);
                        str = sb.toString();
                    }
                    String GWasM1elztuh3 = p40.GWasM1elztuh((va) rx0Var.EljAMC1QTz);
                    int lastIndexOf = GWasM1elztuh3.lastIndexOf(46, GWasM1elztuh3.length() - 1);
                    throw new sj0("No definition found for type '" + GWasM1elztuh3 + "' on " + str2 + '.' + str + '.' + ((lastIndexOf == -1 ? GWasM1elztuh3 : GWasM1elztuh3.substring(lastIndexOf + 1, GWasM1elztuh3.length())).equals("SavedStateHandle") ? " SavedStateHandle is provided by the ViewModel's CreationExtras during creation, not by a module definition — resolve the ViewModel via koinViewModel()/koinNavViewModel() with a proper owner and inject SavedStateHandle in its constructor (do not resolve it lazily or outside construction)." : " Check or add definition for type '" + GWasM1elztuh3 + "' in scope '" + this.GWasM1elztuh + "'."));
                }
            }
        }
        obj = GWasM1elztuh;
        if (obj == null) {
        }
    }

    public final v4 X1lG3V04pd(ao0 ao0Var) {
        ao0Var.getClass();
        v4 v4Var = (v4) Yi7zF1RB1().get();
        if (v4Var == null) {
            v4Var = new v4();
            Yi7zF1RB1().set(v4Var);
        }
        v4Var.addFirst(ao0Var);
        return v4Var;
    }

    public final ThreadLocal Yi7zF1RB1() {
        ThreadLocal threadLocal;
        ThreadLocal threadLocal2 = this.AvO7iQsrTN;
        if (threadLocal2 != null) {
            return threadLocal2;
        }
        synchronized (this) {
            threadLocal = this.AvO7iQsrTN;
            if (threadLocal == null) {
                threadLocal = new ThreadLocal();
                this.AvO7iQsrTN = threadLocal;
            }
        }
        return threadLocal;
    }

    public final String toString() {
        return "['" + this.Yi7zF1RB1 + "']";
    }

    public final Object xqGvceK5x(va vaVar, ao0 ao0Var) {
        String str;
        v5 v5Var = this.OOA6hdeuvCS;
        ((w60) v5Var.GWasM1elztuh).getClass();
        g90 g90Var = g90.mOu10nynGul;
        g90 g90Var2 = g90.OOA6hdeuvCS;
        if (g90Var.compareTo(g90Var2) > 0) {
            return EljAMC1QTz(vaVar, ao0Var);
        }
        if (this.X1lG3V04pd) {
            str = "";
        } else {
            str = " - scope:'" + this.Yi7zF1RB1 + '\'';
        }
        ((w60) v5Var.GWasM1elztuh).mOu10nynGul(g90Var2, "|- '" + p40.GWasM1elztuh(vaVar) + "'" + str + "...");
        long GWasM1elztuh = oe0.GWasM1elztuh();
        Object EljAMC1QTz = EljAMC1QTz(vaVar, ao0Var);
        long GWasM1elztuh2 = p91.GWasM1elztuh(GWasM1elztuh);
        w60 w60Var = (w60) v5Var.GWasM1elztuh;
        StringBuilder sb = new StringBuilder("|- '");
        sb.append(p40.GWasM1elztuh(vaVar));
        sb.append("' in ");
        k61 k61Var = jo.OOA6hdeuvCS;
        sb.append(jo.Yi7zF1RB1(GWasM1elztuh2, mo.MICROSECONDS) / 1000.0d);
        sb.append(" ms");
        w60Var.mOu10nynGul(g90Var2, sb.toString());
        return EljAMC1QTz;
    }
}
