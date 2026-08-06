package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class xp extends java.lang.RuntimeException {
    public final defpackage.si WDYagTQQm9ns;

    public xp(defpackage.si siVar) {
        this.WDYagTQQm9ns = siVar;
        if (siVar.giKS3J6vZuNy) {
            return;
        }
        int[] iArr = {201, 202, 204, 206, 207, 125, -127, 126665345, 200};
        java.util.List list = siVar.ZpBGe2uQfcn8;
        int size = list.size();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            defpackage.ui uiVar = (defpackage.ui) list.get(i);
            int i3 = uiVar.ZpBGe2uQfcn8;
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
                if (uiVar.ZpBGe2uQfcn8 == 100) {
                    int i5 = i + 2;
                    if (i5 < size && ((defpackage.ui) list.get(i5)).ZpBGe2uQfcn8 == 1000) {
                        break;
                    } else {
                        defpackage.nf.EPEWHACkMcF1(arrayList);
                    }
                } else {
                    arrayList.add(uiVar);
                }
            }
            i = i2;
        }
        int size2 = arrayList.size();
        java.lang.StackTraceElement[] stackTraceElementArr = new java.lang.StackTraceElement[size2];
        for (int i6 = 0; i6 < size2; i6++) {
            stackTraceElementArr[i6] = new java.lang.StackTraceElement("$$compose", "m$" + ((defpackage.ui) arrayList.get(i6)).ZpBGe2uQfcn8, "SourceFile", 1);
        }
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public final java.lang.Throwable fillInStackTrace() {
        setStackTrace(new java.lang.StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final java.lang.String getMessage() {
        defpackage.si siVar = this.WDYagTQQm9ns;
        if (!siVar.giKS3J6vZuNy) {
            return "Composition stack when thrown:";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Composition stack when thrown:\n");
        defpackage.wh0 XntWc4eZSQ8j = defpackage.ma0.XntWc4eZSQ8j();
        java.util.List list = siVar.ZpBGe2uQfcn8;
        list.getClass();
        defpackage.p51 p51Var = new defpackage.p51(list);
        int ZpBGe2uQfcn8 = p51Var.ZpBGe2uQfcn8();
        for (int i = 0; i < ZpBGe2uQfcn8; i++) {
            ((defpackage.ui) p51Var.get(i)).getClass();
        }
        defpackage.wh0 GE9mJIPrb8gP = defpackage.ma0.GE9mJIPrb8gP(XntWc4eZSQ8j);
        GE9mJIPrb8gP.getClass();
        defpackage.p51 p51Var2 = new defpackage.p51(GE9mJIPrb8gP);
        int ZpBGe2uQfcn82 = p51Var2.ZpBGe2uQfcn8();
        for (int i2 = 0; i2 < ZpBGe2uQfcn82; i2++) {
            java.lang.String str = (java.lang.String) p51Var2.get(i2);
            sb.append("\tat ");
            sb.append(str);
            sb.append('\n');
        }
        return sb.toString();
    }
}
