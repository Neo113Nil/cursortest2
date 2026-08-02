package ru.CryptoPro.ssl;

import defpackage.ny61;
import defpackage.unr0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes4.dex */
final class cl_83 {
    public final ArrayList a;
    public String[] b;
    public final cl_84 c;
    public final cl_84 d;
    public final cl_84 e;

    public cl_83(ArrayList arrayList) {
        cl_84 cl_84Var;
        this.a = arrayList;
        if (arrayList.size() == 1 && arrayList.contains(cl_84.c)) {
            ny61.g("SSLv2Hello cannot be enabled unless at least one other supported version is also enabled.");
            throw null;
        }
        if (arrayList.size() != 0) {
            Collections.sort(arrayList);
            this.c = (cl_84) arrayList.get(0);
            this.d = (cl_84) unr0.k(1, arrayList);
            cl_84Var = (cl_84) arrayList.get(0);
        } else {
            cl_84Var = cl_84.b;
            this.c = cl_84Var;
            this.d = cl_84Var;
        }
        this.e = cl_84Var;
    }

    public final synchronized String[] a() {
        try {
            if (this.b == null) {
                this.b = new String[this.a.size()];
                Iterator it = this.a.iterator();
                int i = 0;
                while (it.hasNext()) {
                    this.b[i] = ((cl_84) it.next()).a;
                    i++;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (String[]) this.b.clone();
    }

    public String toString() {
        return this.a.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public cl_83(String[] strArr) {
        this(r0);
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                cl_84 b = cl_84.b(str);
                if (!arrayList.contains(b)) {
                    arrayList.add(b);
                }
            }
            return;
        }
        ny61.g("Protocols may not be null");
        throw null;
    }
}
