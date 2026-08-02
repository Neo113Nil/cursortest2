package x;

import com.google.android.gms.internal.ads.Wv;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import u.AbstractC5050e;
import u.C5048c;
import w.AbstractC5128c;
import w.C5130e;

/* renamed from: x.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5176o {

    /* renamed from: f, reason: collision with root package name */
    public static int f41790f;

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f41791a;

    /* renamed from: b, reason: collision with root package name */
    public int f41792b;

    /* renamed from: c, reason: collision with root package name */
    public int f41793c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f41794d;

    /* renamed from: e, reason: collision with root package name */
    public int f41795e;

    public final void a(ArrayList arrayList) {
        int size = this.f41791a.size();
        if (this.f41795e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                C5176o c5176o = (C5176o) arrayList.get(i);
                if (this.f41795e == c5176o.f41792b) {
                    c(this.f41793c, c5176o);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(C5048c c5048c, int i) {
        int n9;
        int n10;
        ArrayList arrayList = this.f41791a;
        if (arrayList.size() == 0) {
            return 0;
        }
        w.f fVar = (w.f) ((C5130e) arrayList.get(0)).f41276T;
        c5048c.t();
        fVar.b(c5048c, false);
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            ((C5130e) arrayList.get(i4)).b(c5048c, false);
        }
        if (i == 0 && fVar.f41342z0 > 0) {
            w.k.a(fVar, c5048c, arrayList, 0);
        }
        if (i == 1 && fVar.f41322A0 > 0) {
            w.k.a(fVar, c5048c, arrayList, 1);
        }
        try {
            c5048c.p();
        } catch (Exception e9) {
            System.err.println(e9.toString() + "\n" + Arrays.toString(e9.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.f41794d = new ArrayList();
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            C5130e c5130e = (C5130e) arrayList.get(i6);
            C5175n c5175n = new C5175n();
            new WeakReference(c5130e);
            C5048c.n(c5130e.f41266I);
            C5048c.n(c5130e.J);
            C5048c.n(c5130e.f41267K);
            C5048c.n(c5130e.f41268L);
            C5048c.n(c5130e.f41269M);
            this.f41794d.add(c5175n);
        }
        if (i == 0) {
            n9 = C5048c.n(fVar.f41266I);
            n10 = C5048c.n(fVar.f41267K);
            c5048c.t();
        } else {
            n9 = C5048c.n(fVar.J);
            n10 = C5048c.n(fVar.f41268L);
            c5048c.t();
        }
        return n10 - n9;
    }

    public final void c(int i, C5176o c5176o) {
        Iterator it = this.f41791a.iterator();
        while (it.hasNext()) {
            C5130e c5130e = (C5130e) it.next();
            ArrayList arrayList = c5176o.f41791a;
            if (!arrayList.contains(c5130e)) {
                arrayList.add(c5130e);
            }
            int i4 = c5176o.f41792b;
            if (i == 0) {
                c5130e.f41307n0 = i4;
            } else {
                c5130e.f41309o0 = i4;
            }
        }
        this.f41795e = c5176o.f41792b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f41793c;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown");
        sb.append(" [");
        String e9 = AbstractC5128c.e(this.f41792b, "] <", sb);
        Iterator it = this.f41791a.iterator();
        while (it.hasNext()) {
            C5130e c5130e = (C5130e) it.next();
            StringBuilder c9 = AbstractC5050e.c(e9, " ");
            c9.append(c5130e.f41297h0);
            e9 = c9.toString();
        }
        return Wv.g(e9, " >");
    }
}
