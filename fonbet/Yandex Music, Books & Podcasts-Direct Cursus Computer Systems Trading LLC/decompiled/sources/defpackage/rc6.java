package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class rc6 {
    public final ArrayList a;
    public final HashMap b;

    public rc6(int i) {
        switch (i) {
            case 1:
                this.a = new ArrayList();
                this.b = new HashMap();
                break;
            default:
                this.b = new HashMap();
                this.a = new ArrayList();
                break;
        }
    }

    public static void d(rc6 rc6Var, Uri uri) {
        if (uri != null) {
            rc6Var.a(uri.toString(), "exo_redir");
        } else {
            rc6Var.a.add("exo_redir");
            rc6Var.b.remove("exo_redir");
        }
    }

    public void a(Object obj, String str) {
        obj.getClass();
        this.b.put(str, obj);
        this.a.remove(str);
    }

    public synchronized List b(String str) {
        List list;
        try {
            if (!this.a.contains(str)) {
                this.a.add(str);
            }
            list = (List) this.b.get(str);
            if (list == null) {
                list = new ArrayList();
                this.b.put(str, list);
            }
        } catch (Throwable th) {
            throw th;
        }
        return list;
    }

    public synchronized ArrayList c(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            List<p2o> list = (List) this.b.get((String) it.next());
            if (list != null) {
                for (p2o p2oVar : list) {
                    if ((p2oVar.a.isAssignableFrom(cls) && cls2.isAssignableFrom(p2oVar.b)) && !arrayList.contains(p2oVar.b)) {
                        arrayList.add(p2oVar.b);
                    }
                }
            }
        }
        return arrayList;
    }
}
