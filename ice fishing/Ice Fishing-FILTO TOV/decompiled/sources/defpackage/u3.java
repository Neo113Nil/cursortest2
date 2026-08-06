package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class u3 implements CharSequence {
    public final ArrayList AvO7iQsrTN;
    public final String EljAMC1QTz;
    public final List OOA6hdeuvCS;
    public final ArrayList encWxUiV2;

    static {
        d dVar = hx0.GWasM1elztuh;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b2, code lost:
    
        r0.GWasM1elztuh(r2.X1lG3V04pd);
        r1 = r1 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public u3(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.OOA6hdeuvCS = list;
        this.EljAMC1QTz = str;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i = 0; i < size; i++) {
                t3 t3Var = (t3) list.get(i);
                Object obj = t3Var.GWasM1elztuh;
                if (obj instanceof w41) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(t3Var);
                } else if (obj instanceof yn0) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(t3Var);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.AvO7iQsrTN = arrayList;
        this.encWxUiV2 = arrayList2;
        List FhVkB11j = arrayList2 != null ? rb.FhVkB11j(arrayList2, new st(5)) : null;
        if (FhVkB11j == null || FhVkB11j.isEmpty()) {
            return;
        }
        int i2 = ((t3) rb.jed7WnvkLvFq(FhVkB11j)).X1lG3V04pd;
        qf0 qf0Var = r20.GWasM1elztuh;
        int i3 = 1;
        qf0 qf0Var2 = new qf0(1);
        qf0Var2.GWasM1elztuh(i2);
        int size2 = FhVkB11j.size();
        while (i3 < size2) {
            t3 t3Var2 = (t3) FhVkB11j.get(i3);
            while (true) {
                int i4 = qf0Var2.Yi7zF1RB1;
                if (i4 == 0) {
                    break;
                }
                if (i4 == 0) {
                    o4.AvO7iQsrTN("IntList is empty.");
                    throw null;
                }
                int i5 = qf0Var2.GWasM1elztuh[i4 - 1];
                int i6 = t3Var2.Yi7zF1RB1;
                int i7 = t3Var2.X1lG3V04pd;
                if (i6 >= i5) {
                    qf0Var2.X1lG3V04pd(i4 - 1);
                } else if (i7 > i5) {
                    u10.GWasM1elztuh("Paragraph overlap not allowed, end " + i7 + " should be less than or equal to " + i5);
                }
            }
        }
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.EljAMC1QTz.charAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u3)) {
            return false;
        }
        u3 u3Var = (u3) obj;
        return o30.rQPn8YBR(this.EljAMC1QTz, u3Var.EljAMC1QTz) && o30.rQPn8YBR(this.OOA6hdeuvCS, u3Var.OOA6hdeuvCS);
    }

    public final int hashCode() {
        int hashCode = this.EljAMC1QTz.hashCode() * 31;
        List list = this.OOA6hdeuvCS;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.EljAMC1QTz.length();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0093, code lost:
    
        if (r0.isEmpty() != false) goto L26;
     */
    @Override // java.lang.CharSequence
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence subSequence(int i, int i2) {
        ArrayList arrayList;
        if (i > i2) {
            u10.GWasM1elztuh("start (" + i + ") should be less or equal to end (" + i2 + ')');
        }
        String str = this.EljAMC1QTz;
        if (i == 0 && i2 == str.length()) {
            return this;
        }
        String substring = str.substring(i, i2);
        int i3 = v3.GWasM1elztuh;
        if (i > i2) {
            u10.GWasM1elztuh("start (" + i + ") should be less than or equal to end (" + i2 + ')');
        }
        List list = this.OOA6hdeuvCS;
        if (list != null) {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                t3 t3Var = (t3) list.get(i4);
                int i5 = t3Var.Yi7zF1RB1;
                int i6 = t3Var.X1lG3V04pd;
                if (v3.GWasM1elztuh(i, i2, i5, i6)) {
                    arrayList.add(new t3(t3Var.GWasM1elztuh, Math.max(i, t3Var.Yi7zF1RB1) - i, Math.min(i2, i6) - i, t3Var.xqGvceK5x));
                }
            }
        }
        arrayList = null;
        return new u3(arrayList, substring);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.EljAMC1QTz;
    }

    public /* synthetic */ u3(String str) {
        this(str, xp.OOA6hdeuvCS);
    }

    public u3(String str, List list) {
        this(list.isEmpty() ? null : list, str);
    }
}
