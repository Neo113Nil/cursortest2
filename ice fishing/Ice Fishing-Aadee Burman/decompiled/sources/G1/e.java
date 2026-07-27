package G1;

import Z0.t;
import android.graphics.Matrix;
import android.graphics.Path;
import i8.l;
import j1.j;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1056a;

    public e(int i) {
        switch (i) {
            case 1:
                this.f1056a = new ArrayList();
                break;
            case 2:
                this.f1056a = new ArrayList();
                break;
            case 3:
                this.f1056a = new ArrayList(20);
                break;
            default:
                this.f1056a = new ArrayList();
                break;
        }
    }

    public void a(Path path) {
        ArrayList arrayList = this.f1056a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            t tVar = (t) arrayList.get(size);
            Matrix matrix = j.f38350a;
            if (tVar != null && !tVar.f4116a) {
                j.a(path, tVar.f4119d.l() / 100.0f, tVar.f4120e.l() / 100.0f, tVar.f4121f.l() / 360.0f);
            }
        }
    }

    public l b() {
        return new l((String[]) this.f1056a.toArray(new String[0]));
    }

    public synchronized ArrayList c(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        Iterator it = this.f1056a.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if ((dVar.f1053a.isAssignableFrom(cls) && cls2.isAssignableFrom(dVar.f1054b)) && !arrayList.contains(dVar.f1054b)) {
                arrayList.add(dVar.f1054b);
            }
        }
        return arrayList;
    }

    public void d(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f1056a;
            if (i >= arrayList.size()) {
                return;
            }
            if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                arrayList.remove(i);
                arrayList.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }
}
