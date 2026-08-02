package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.text.c;

/* loaded from: classes5.dex */
public final class js3 {
    public final /* synthetic */ int a;
    public final String b;

    public js3() {
        this.a = 1;
        this.b = "/";
    }

    public String a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            String str = (String) obj;
            str.getClass();
            if (str.length() > 0) {
                arrayList2.add(obj);
            }
        }
        String str2 = this.b;
        String X = CollectionsKt.X(arrayList2, str2, null, null, null, 62);
        if (X.length() <= 0) {
            return ".";
        }
        boolean v = c.v(X, str2, false);
        boolean n = c.n(X, str2, false);
        ArrayList P = up6.P(X, str2);
        s9i s9iVar = new s9i(this, v);
        Object arrayList3 = new ArrayList();
        Iterator it = P.iterator();
        while (it.hasNext()) {
            arrayList3 = s9iVar.invoke(arrayList3, it.next());
        }
        List list = (List) arrayList3;
        if (list.size() != 0) {
            String X2 = CollectionsKt.X(list, str2, null, null, null, 62);
            if (n) {
                X2 = X2.concat(str2);
            }
            return v ? str2.concat(X2) : X2;
        }
        if (v) {
            return str2;
        }
        if (!n) {
            str2 = "";
        }
        return ".".concat(str2);
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return this.b;
            case 1:
            default:
                return super.toString();
            case 2:
                return dfi.i(new StringBuilder("<"), this.b, '>');
        }
    }

    public /* synthetic */ js3(String str, int i) {
        this.a = i;
        this.b = str;
    }
}
