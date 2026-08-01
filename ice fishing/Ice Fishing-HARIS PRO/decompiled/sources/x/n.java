package x;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import q.C0331b;
import u.C0355c;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: f, reason: collision with root package name */
    public static int f4701f;

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f4702a;

    /* renamed from: b, reason: collision with root package name */
    public int f4703b;

    /* renamed from: c, reason: collision with root package name */
    public int f4704c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f4705d;
    public int e;

    public final void a(ArrayList arrayList) {
        int size = this.f4702a.size();
        if (this.e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                n nVar = (n) arrayList.get(i);
                if (this.e == nVar.f4703b) {
                    c(this.f4704c, nVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(C0355c c0355c, int i) {
        int n2;
        int n3;
        ArrayList arrayList = this.f4702a;
        if (arrayList.size() == 0) {
            return 0;
        }
        w.e eVar = (w.e) ((w.d) arrayList.get(0)).f4540T;
        c0355c.t();
        eVar.b(c0355c, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((w.d) arrayList.get(i2)).b(c0355c, false);
        }
        if (i == 0 && eVar.z0 > 0) {
            w.j.a(eVar, c0355c, arrayList, 0);
        }
        if (i == 1 && eVar.f4586A0 > 0) {
            w.j.a(eVar, c0355c, arrayList, 1);
        }
        try {
            c0355c.p();
        } catch (Exception e) {
            System.err.println(e.toString() + "\n" + Arrays.toString(e.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.f4705d = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            w.d dVar = (w.d) arrayList.get(i3);
            C0331b c0331b = new C0331b();
            new WeakReference(dVar);
            C0355c.n(dVar.f4530I);
            C0355c.n(dVar.J);
            C0355c.n(dVar.f4531K);
            C0355c.n(dVar.f4532L);
            C0355c.n(dVar.f4533M);
            this.f4705d.add(c0331b);
        }
        if (i == 0) {
            n2 = C0355c.n(eVar.f4530I);
            n3 = C0355c.n(eVar.f4531K);
            c0355c.t();
        } else {
            n2 = C0355c.n(eVar.J);
            n3 = C0355c.n(eVar.f4532L);
            c0355c.t();
        }
        return n3 - n2;
    }

    public final void c(int i, n nVar) {
        Iterator it = this.f4702a.iterator();
        while (it.hasNext()) {
            w.d dVar = (w.d) it.next();
            ArrayList arrayList = nVar.f4702a;
            if (!arrayList.contains(dVar)) {
                arrayList.add(dVar);
            }
            int i2 = nVar.f4703b;
            if (i == 0) {
                dVar.f4571n0 = i2;
            } else {
                dVar.f4573o0 = i2;
            }
        }
        this.e = nVar.f4703b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f4704c;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown");
        sb.append(" [");
        sb.append(this.f4703b);
        sb.append("] <");
        String sb2 = sb.toString();
        Iterator it = this.f4702a.iterator();
        while (it.hasNext()) {
            sb2 = sb2 + " " + ((w.d) it.next()).f4561h0;
        }
        return D1.h.f(sb2, " >");
    }
}
