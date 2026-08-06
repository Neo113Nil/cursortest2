package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ql extends RuntimeException {
    public final ke OOA6hdeuvCS;

    public ql(ke keVar) {
        this.OOA6hdeuvCS = keVar;
        if (keVar.Yi7zF1RB1) {
            return;
        }
        int[] iArr = {201, 202, 204, 206, 207, 125, -127, 126665345, 200};
        List list = keVar.GWasM1elztuh;
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            me meVar = (me) list.get(i);
            int i3 = meVar.GWasM1elztuh;
            int i4 = 0;
            while (true) {
                if (i4 >= 9) {
                    i4 = -1;
                    break;
                } else if (i3 == iArr[i4]) {
                    break;
                } else {
                    i4++;
                }
            }
            if (i4 < 0) {
                if (meVar.GWasM1elztuh == 100) {
                    int i5 = i + 2;
                    if (i5 < size && ((me) list.get(i5)).GWasM1elztuh == 1000) {
                        break;
                    } else {
                        wb.iriv6doqetn(arrayList);
                    }
                } else {
                    arrayList.add(meVar);
                }
            }
            i = i2;
        }
        int size2 = arrayList.size();
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[size2];
        for (int i6 = 0; i6 < size2; i6++) {
            stackTraceElementArr[i6] = new StackTraceElement("$$compose", "m$" + ((me) arrayList.get(i6)).GWasM1elztuh, "SourceFile", 1);
        }
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        ke keVar = this.OOA6hdeuvCS;
        if (!keVar.Yi7zF1RB1) {
            return "Composition stack when thrown:";
        }
        StringBuilder sb = new StringBuilder("Composition stack when thrown:\n");
        ta0 ta0Var = new ta0(10);
        List list = keVar.GWasM1elztuh;
        list.getClass();
        bv0 bv0Var = new bv0(list);
        int GWasM1elztuh = bv0Var.GWasM1elztuh();
        for (int i = 0; i < GWasM1elztuh; i++) {
            ((me) bv0Var.get(i)).getClass();
        }
        ta0 WIEu4Ya2g8 = fb1.WIEu4Ya2g8(ta0Var);
        WIEu4Ya2g8.getClass();
        bv0 bv0Var2 = new bv0(WIEu4Ya2g8);
        int GWasM1elztuh2 = bv0Var2.GWasM1elztuh();
        for (int i2 = 0; i2 < GWasM1elztuh2; i2++) {
            String str = (String) bv0Var2.get(i2);
            sb.append("\tat ");
            sb.append(str);
            sb.append('\n');
        }
        return sb.toString();
    }
}
