package defpackage;

import com.bumptech.glide.Registry;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class ul40 {
    public static final vuz e = new vuz();
    public static final sl40 f = new sl40();
    public final jdj d;
    public final ArrayList a = new ArrayList();
    public final HashSet c = new HashSet();
    public final vuz b = e;

    public ul40(jdj jdjVar) {
        this.d = jdjVar;
    }

    public final synchronized void a(Class cls, Class cls2, r430 r430Var) {
        tl40 tl40Var = new tl40(cls, cls2, r430Var);
        ArrayList arrayList = this.a;
        arrayList.add(arrayList.size(), tl40Var);
    }

    public final q430 b(tl40 tl40Var) {
        q430 a = tl40Var.c.a(this);
        z2a1.e(a, "Argument must not be null");
        return a;
    }

    public final synchronized q430 c(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.a.iterator();
            boolean z = false;
            while (true) {
                boolean z2 = true;
                if (!it.hasNext()) {
                    break;
                }
                tl40 tl40Var = (tl40) it.next();
                if (this.c.contains(tl40Var)) {
                    z = true;
                } else {
                    if (!tl40Var.a.isAssignableFrom(cls) || !tl40Var.b.isAssignableFrom(cls2)) {
                        z2 = false;
                    }
                    if (z2) {
                        this.c.add(tl40Var);
                        arrayList.add(b(tl40Var));
                        this.c.remove(tl40Var);
                    }
                }
            }
            if (arrayList.size() > 1) {
                vuz vuzVar = this.b;
                jdj jdjVar = this.d;
                vuzVar.getClass();
                return new s93(2, arrayList, jdjVar);
            }
            if (arrayList.size() == 1) {
                return (q430) arrayList.get(0);
            }
            if (z) {
                return f;
            }
            throw new Registry.NoModelLoaderAvailableException("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        } catch (Throwable th) {
            this.c.clear();
            throw th;
        }
    }

    public final synchronized ArrayList d(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                tl40 tl40Var = (tl40) it.next();
                if (!this.c.contains(tl40Var) && tl40Var.a.isAssignableFrom(cls)) {
                    this.c.add(tl40Var);
                    arrayList.add(b(tl40Var));
                    this.c.remove(tl40Var);
                }
            }
        } finally {
        }
        return arrayList;
    }

    public final synchronized ArrayList e(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            tl40 tl40Var = (tl40) it.next();
            if (!arrayList.contains(tl40Var.b) && tl40Var.a.isAssignableFrom(cls)) {
                arrayList.add(tl40Var.b);
            }
        }
        return arrayList;
    }

    public final synchronized ArrayList f() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            tl40 tl40Var = (tl40) it.next();
            if (tl40Var.a.isAssignableFrom(cit.class) && tl40Var.b.isAssignableFrom(InputStream.class)) {
                it.remove();
                arrayList.add(tl40Var.c);
            }
        }
        return arrayList;
    }
}
