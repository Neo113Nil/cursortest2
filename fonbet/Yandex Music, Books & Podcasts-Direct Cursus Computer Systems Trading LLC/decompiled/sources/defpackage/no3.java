package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class no3 {
    public final int a;
    public final String b;
    public ArrayList c = null;
    public ArrayList d = null;

    public no3(int i, String str) {
        this.a = 0;
        this.b = null;
        this.a = i == 0 ? 1 : i;
        this.b = str;
    }

    public final void a(int i, String str, String str2) {
        if (this.c == null) {
            this.c = new ArrayList();
        }
        this.c.add(new ao3(str, i, str2));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.a;
        if (i == 2) {
            sb.append("> ");
        } else if (i == 3) {
            sb.append("+ ");
        }
        String str = this.b;
        if (str == null) {
            str = "*";
        }
        sb.append(str);
        ArrayList arrayList = this.c;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ao3 ao3Var = (ao3) it.next();
                sb.append('[');
                String str2 = ao3Var.a;
                String str3 = ao3Var.c;
                sb.append(str2);
                int D = ouj.D(ao3Var.b);
                if (D == 1) {
                    sb.append('=');
                    sb.append(str3);
                } else if (D == 2) {
                    sb.append("~=");
                    sb.append(str3);
                } else if (D == 3) {
                    sb.append("|=");
                    sb.append(str3);
                }
                sb.append(']');
            }
        }
        ArrayList arrayList2 = this.d;
        if (arrayList2 != null) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                do3 do3Var = (do3) it2.next();
                sb.append(':');
                sb.append(do3Var);
            }
        }
        return sb.toString();
    }
}
