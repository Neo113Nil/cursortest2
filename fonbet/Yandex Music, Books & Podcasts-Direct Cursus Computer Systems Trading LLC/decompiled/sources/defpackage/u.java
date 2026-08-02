package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.CollectionsKt;
import org.json.JSONArray;

/* loaded from: classes.dex */
public abstract class u {
    public static final AtomicBoolean a = new AtomicBoolean(false);

    public static final void a() {
        File[] fileArr;
        if (bp6.a.contains(u.class)) {
            return;
        }
        try {
            if (gvt.B()) {
                return;
            }
            File m0 = zsd.m0();
            if (m0 != null) {
                fileArr = m0.listFiles(ngb.c);
                if (fileArr == null) {
                    fileArr = new File[0];
                }
            } else {
                fileArr = new File[0];
            }
            ArrayList arrayList = new ArrayList(fileArr.length);
            for (File file : fileArr) {
                arrayList.add(ox6.I(file));
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (((dpe) next).a()) {
                    arrayList2.add(next);
                }
            }
            List o0 = CollectionsKt.o0(arrayList2, C1318t.b);
            JSONArray jSONArray = new JSONArray();
            ype it2 = yhn.m(0, Math.min(o0.size(), 5)).iterator();
            while (it2.c) {
                jSONArray.put(o0.get(it2.nextInt()));
            }
            zsd.A0("anr_reports", jSONArray, new s(o0, 0));
        } catch (Throwable th) {
            bp6.a(u.class, th);
        }
    }
}
