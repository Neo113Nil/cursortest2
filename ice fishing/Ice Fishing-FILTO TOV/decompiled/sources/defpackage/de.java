package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class de extends RuntimeException {
    public final qf0 AvO7iQsrTN;
    public final ag0 EljAMC1QTz;
    public final ag0 OOA6hdeuvCS;
    public final int encWxUiV2;

    public de(ag0 ag0Var, ag0 ag0Var2, qf0 qf0Var, int i, Exception exc) {
        super(exc);
        this.OOA6hdeuvCS = ag0Var;
        this.EljAMC1QTz = ag0Var2;
        this.AvO7iQsrTN = qf0Var;
        this.encWxUiV2 = i;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        List list;
        Collection collection;
        StringBuilder sb = new StringBuilder("\n            |Failed to execute op number ");
        sb.append(this.encWxUiV2);
        sb.append(":\n            |");
        w01 Y6hRI1cF8 = q70.Y6hRI1cF8(new ce(this, null));
        if (Y6hRI1cF8.hasNext()) {
            Object next = Y6hRI1cF8.next();
            if (Y6hRI1cF8.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (Y6hRI1cF8.hasNext()) {
                    arrayList.add(Y6hRI1cF8.next());
                }
                list = arrayList;
            } else {
                list = fb1.HFYAaqMd6(next);
            }
        } else {
            list = xp.OOA6hdeuvCS;
        }
        int size = list.size();
        if (50 >= size) {
            collection = rb.gqMuANyCes(list);
        } else {
            ArrayList arrayList2 = new ArrayList(50);
            if (list instanceof RandomAccess) {
                for (int i = size - 50; i < size; i++) {
                    arrayList2.add(list.get(i));
                }
            } else {
                ListIterator listIterator = list.listIterator(size - 50);
                while (listIterator.hasNext()) {
                    arrayList2.add(listIterator.next());
                }
            }
            collection = arrayList2;
        }
        sb.append(rb.WkXHDbKiD(collection, "\n", null, null, null, 62));
        sb.append("\n            ");
        String sb2 = sb.toString();
        if (b61.MItybXapHX("|")) {
            o4.mE4lRynR("marginPrefix must be non-blank string.");
            return null;
        }
        List MjxSquD6Av = b61.MjxSquD6Av(sb2);
        int length = sb2.length();
        MjxSquD6Av.size();
        int size2 = MjxSquD6Av.size() - 1;
        ArrayList arrayList3 = new ArrayList();
        int i2 = 0;
        for (Object obj : MjxSquD6Av) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                fb1.MjxSquD6Av();
                throw null;
            }
            String str = (String) obj;
            if ((i2 == 0 || i2 == size2) && b61.MItybXapHX(str)) {
                str = null;
            } else {
                int length2 = str.length();
                int i4 = 0;
                while (true) {
                    if (i4 >= length2) {
                        i4 = -1;
                        break;
                    }
                    if (!ki1.A1EKNP6CxJ(str.charAt(i4))) {
                        break;
                    }
                    i4++;
                }
                String substring = (i4 != -1 && str.startsWith("|", i4)) ? str.substring("|".length() + i4) : null;
                if (substring != null) {
                    str = substring;
                }
            }
            if (str != null) {
                arrayList3.add(str);
            }
            i2 = i3;
        }
        StringBuilder sb3 = new StringBuilder(length);
        rb.UjhVk5crk(arrayList3, sb3, "\n", null, 124);
        return sb3.toString();
    }
}
