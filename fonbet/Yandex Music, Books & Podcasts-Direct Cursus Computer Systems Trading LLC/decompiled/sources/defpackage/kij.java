package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class kij {
    public static final String g = "Downloading:".concat("DownloadQueue");
    public final LinkedHashMap a = new LinkedHashMap(64);
    public final xdr b;
    public final fkn c;
    public final x0q d;
    public final dkn e;
    public final tf6 f;

    public kij() {
        e5b e5bVar = e5b.a;
        e5bVar.getClass();
        xdr a = ydr.a(new fba(e5bVar));
        this.b = a;
        this.c = new fkn(a);
        x0q b = y0q.b(0, 0, null, 7);
        this.d = b;
        this.e = new dkn(b);
        this.f = gld.e(ca8.b);
    }

    public final void a() {
        Collection values = this.a.values();
        values.getClass();
        Collection collection = values;
        int a = tah.a(v75.o(collection, 10));
        if (a < 16) {
            a = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a);
        for (Object obj : collection) {
            linkedHashMap.put(((gba) obj).a, obj);
        }
        fba fbaVar = new fba(linkedHashMap);
        xdr xdrVar = this.b;
        xdrVar.getClass();
        xdrVar.m(null, fbaVar);
    }

    public final synchronized ArrayList b(Collection collection) {
        ArrayList arrayList;
        try {
            collection.getClass();
            Continuation continuation = null;
            ssg.a(3, g, "remove() - " + collection, null);
            arrayList = new ArrayList();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (((gba) this.a.remove(str)) == null) {
                    str = null;
                }
                if (str != null) {
                    arrayList.add(str);
                }
            }
            if (!arrayList.isEmpty()) {
                a();
                x97.y(this.f, null, null, new h1j(this, new eba(dba.b, arrayList), continuation, 9), 3);
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public final synchronized Collection c() {
        List w0;
        try {
            Continuation continuation = null;
            ssg.a(3, g, "removeAll()", null);
            Set keySet = this.a.keySet();
            keySet.getClass();
            w0 = CollectionsKt.w0(keySet);
            this.a.clear();
            if (!w0.isEmpty()) {
                a();
                x97.y(this.f, null, null, new h1j(this, new eba(dba.b, w0), continuation, 9), 3);
            }
        } catch (Throwable th) {
            throw th;
        }
        return w0;
    }
}
