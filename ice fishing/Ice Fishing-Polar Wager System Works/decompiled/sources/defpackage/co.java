package defpackage;

/* loaded from: classes.dex */
public final class co extends java.lang.RuntimeException {
    public final defpackage.rg adDC3e2L;

    public co(defpackage.rg rgVar) {
        this.adDC3e2L = rgVar;
        if (rgVar.oh6vYeIP) {
            return;
        }
        int[] iArr = {201, 202, 204, 206, 207, 125, -127, 126665345, 200};
        java.util.List list = rgVar.IHQe1A4L2xu;
        int size = list.size();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            defpackage.tg tgVar = (defpackage.tg) list.get(i);
            int i3 = tgVar.IHQe1A4L2xu;
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
                if (tgVar.IHQe1A4L2xu == 100) {
                    int i5 = i + 2;
                    if (i5 < size && ((defpackage.tg) list.get(i5)).IHQe1A4L2xu == 1000) {
                        break;
                    } else {
                        defpackage.yd.nVhUznk1t(arrayList);
                    }
                } else {
                    arrayList.add(tgVar);
                }
            }
            i = i2;
        }
        int size2 = arrayList.size();
        java.lang.StackTraceElement[] stackTraceElementArr = new java.lang.StackTraceElement[size2];
        for (int i6 = 0; i6 < size2; i6++) {
            stackTraceElementArr[i6] = new java.lang.StackTraceElement("$$compose", "m$" + ((defpackage.tg) arrayList.get(i6)).IHQe1A4L2xu, "SourceFile", 1);
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
        defpackage.rg rgVar = this.adDC3e2L;
        if (!rgVar.oh6vYeIP) {
            return "Composition stack when thrown:";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Composition stack when thrown:\n");
        defpackage.te0 kNAkVymC = defpackage.fm.kNAkVymC();
        java.util.List list = rgVar.IHQe1A4L2xu;
        list.getClass();
        defpackage.y11 y11Var = new defpackage.y11(list);
        int IHQe1A4L2xu = y11Var.IHQe1A4L2xu();
        for (int i = 0; i < IHQe1A4L2xu; i++) {
            ((defpackage.tg) y11Var.get(i)).getClass();
        }
        defpackage.te0 fnWB2E7cs = defpackage.fm.fnWB2E7cs(kNAkVymC);
        fnWB2E7cs.getClass();
        defpackage.y11 y11Var2 = new defpackage.y11(fnWB2E7cs);
        int IHQe1A4L2xu2 = y11Var2.IHQe1A4L2xu();
        for (int i2 = 0; i2 < IHQe1A4L2xu2; i2++) {
            java.lang.String str = (java.lang.String) y11Var2.get(i2);
            sb.append("\tat ");
            sb.append(str);
            sb.append('\n');
        }
        return sb.toString();
    }
}
