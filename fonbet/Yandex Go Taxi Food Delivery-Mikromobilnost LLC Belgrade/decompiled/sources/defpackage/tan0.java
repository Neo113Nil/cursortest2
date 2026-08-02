package defpackage;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes13.dex */
public final class tan0 {
    public final int a;
    public final int b;
    public final int c;
    public final List d;

    public tan0(int i, int i2, int i3, List list) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = list;
    }

    public static boolean a(int[] iArr, tan0 tan0Var, tls tlsVar) {
        int i = tan0Var.a;
        List list = tan0Var.d;
        int i2 = tan0Var.b;
        if (((Boolean) tlsVar.invoke(Integer.valueOf(i))).booleanValue() && i2 != 0) {
            iArr[0] = iArr[0] + i2;
            return true;
        }
        if (list.isEmpty()) {
            iArr[0] = iArr[0] + i2;
            return false;
        }
        iArr[0] = iArr[0] + tan0Var.c;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (a(iArr, (tan0) it.next(), tlsVar)) {
                return true;
            }
        }
        return false;
    }
}
