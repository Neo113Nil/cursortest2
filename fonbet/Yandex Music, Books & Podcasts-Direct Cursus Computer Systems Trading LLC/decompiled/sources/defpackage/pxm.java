package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes5.dex */
public abstract class pxm {
    public String a;
    public String b;

    public /* synthetic */ pxm(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static String c(int i, String str) {
        List list;
        str.getClass();
        if (i == 0) {
            return "";
        }
        if (i >= 10) {
            if (i > 20) {
                return mlr.K(i - 3, str).concat("TRC");
            }
            k7g k7gVar = new k7g(str);
            if (k7gVar.hasNext()) {
                Object next = k7gVar.next();
                if (k7gVar.hasNext()) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(next);
                    while (k7gVar.hasNext()) {
                        arrayList.add(k7gVar.next());
                    }
                    list = arrayList;
                } else {
                    list = t75.c(next);
                }
            } else {
                list = c5b.a;
            }
            String str2 = (String) CollectionsKt.firstOrNull(list);
            if (str2 != null) {
                return mlr.K(i - 3, str2).concat("TRC");
            }
        }
        return "TRC";
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.a;
    }

    public void d(p3i p3iVar) {
        p3iVar.d("trackId", String.valueOf(b()));
        String a = a();
        if (a != null) {
            p3iVar.d("contentType", a);
        }
    }
}
