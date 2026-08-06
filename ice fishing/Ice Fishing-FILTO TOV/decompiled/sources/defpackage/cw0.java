package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class cw0 extends wg implements ms {
    public vg E7jCp8Ls;
    public final int JFJ3QoxA;
    public final ms encWxUiV2;
    public final gh mOu10nynGul;
    public gh rQPn8YBR;

    public cw0(ms msVar, gh ghVar) {
        super(tc.AvO7iQsrTN, vp.OOA6hdeuvCS);
        this.encWxUiV2 = msVar;
        this.mOu10nynGul = ghVar;
        this.JFJ3QoxA = ((Number) ghVar.WIEu4Ya2g8(new pd(22), 0)).intValue();
    }

    @Override // defpackage.ms
    public final Object E7jCp8Ls(Object obj, vg vgVar) {
        try {
            Object Mjvvu5DE = Mjvvu5DE(vgVar, obj);
            return Mjvvu5DE == qh.OOA6hdeuvCS ? Mjvvu5DE : kc1.GWasM1elztuh;
        } catch (Throwable th) {
            this.rQPn8YBR = new bn(vgVar.OOA6hdeuvCS(), th);
            throw th;
        }
    }

    public final Object Mjvvu5DE(vg vgVar, Object obj) {
        Comparable comparable;
        String str;
        gh OOA6hdeuvCS = vgVar.OOA6hdeuvCS();
        ki1.pog2g9KITJA(OOA6hdeuvCS);
        gh ghVar = this.rQPn8YBR;
        if (ghVar != OOA6hdeuvCS) {
            int i = 0;
            if (ghVar instanceof bn) {
                String str2 = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((bn) ghVar).EljAMC1QTz + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ";
                List MjxSquD6Av = b61.MjxSquD6Av(str2);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : MjxSquD6Av) {
                    if (!b61.MItybXapHX((String) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(sb.dcDmLGVhzWm(arrayList, 10));
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj3 = arrayList.get(i2);
                    i2++;
                    String str3 = (String) obj3;
                    int length = str3.length();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            i3 = -1;
                            break;
                        }
                        if (!ki1.A1EKNP6CxJ(str3.charAt(i3))) {
                            break;
                        }
                        i3++;
                    }
                    if (i3 == -1) {
                        i3 = str3.length();
                    }
                    arrayList2.add(Integer.valueOf(i3));
                }
                Iterator it = arrayList2.iterator();
                if (it.hasNext()) {
                    comparable = (Comparable) it.next();
                    while (it.hasNext()) {
                        Comparable comparable2 = (Comparable) it.next();
                        if (comparable.compareTo(comparable2) > 0) {
                            comparable = comparable2;
                        }
                    }
                } else {
                    comparable = null;
                }
                Integer num = (Integer) comparable;
                int intValue = num != null ? num.intValue() : 0;
                int length2 = str2.length();
                MjxSquD6Av.size();
                int size2 = MjxSquD6Av.size() - 1;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : MjxSquD6Av) {
                    int i4 = i + 1;
                    if (i < 0) {
                        fb1.MjxSquD6Av();
                        throw null;
                    }
                    String str4 = (String) obj4;
                    if ((i == 0 || i == size2) && b61.MItybXapHX(str4)) {
                        str = null;
                    } else {
                        str4.getClass();
                        if (intValue < 0) {
                            o4.OOA6hdeuvCS(mr0.encWxUiV2("Requested character count ", intValue, " is less than zero."));
                            return null;
                        }
                        int length3 = str4.length();
                        if (intValue <= length3) {
                            length3 = intValue;
                        }
                        str = str4.substring(length3);
                    }
                    if (str != null) {
                        arrayList3.add(str);
                    }
                    i = i4;
                }
                StringBuilder sb = new StringBuilder(length2);
                rb.UjhVk5crk(arrayList3, sb, "\n", null, 124);
                throw new IllegalStateException(sb.toString().toString());
            }
            if (((Number) OOA6hdeuvCS.WIEu4Ya2g8(new k4(9, this), 0)).intValue() != this.JFJ3QoxA) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.mOu10nynGul + ",\n\t\tbut emission happened in " + OOA6hdeuvCS + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.rQPn8YBR = OOA6hdeuvCS;
        }
        this.E7jCp8Ls = vgVar;
        mv mvVar = ew0.GWasM1elztuh;
        ms msVar = this.encWxUiV2;
        msVar.getClass();
        Object X1lG3V04pd = mvVar.X1lG3V04pd(msVar, obj, this);
        if (!o30.rQPn8YBR(X1lG3V04pd, qh.OOA6hdeuvCS)) {
            this.E7jCp8Ls = null;
        }
        return X1lG3V04pd;
    }

    @Override // defpackage.wg, defpackage.vg
    public final gh OOA6hdeuvCS() {
        gh ghVar = this.rQPn8YBR;
        return ghVar == null ? vp.OOA6hdeuvCS : ghVar;
    }

    @Override // defpackage.h6
    public final Object WIEu4Ya2g8(Object obj) {
        Throwable GWasM1elztuh = tu0.GWasM1elztuh(obj);
        if (GWasM1elztuh != null) {
            this.rQPn8YBR = new bn(OOA6hdeuvCS(), GWasM1elztuh);
        }
        vg vgVar = this.E7jCp8Ls;
        if (vgVar != null) {
            vgVar.AvO7iQsrTN(obj);
        }
        return qh.OOA6hdeuvCS;
    }

    @Override // defpackage.h6
    public final StackTraceElement iwATDS1i01k() {
        return null;
    }

    @Override // defpackage.h6, defpackage.rh
    public final rh xqGvceK5x() {
        vg vgVar = this.E7jCp8Ls;
        if (vgVar instanceof rh) {
            return (rh) vgVar;
        }
        return null;
    }
}
