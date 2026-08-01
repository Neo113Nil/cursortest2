package x;

import com.icefishinggame.icefishinggamemultigames.AbstractC4404f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import u.AbstractC5049e;
import u.C5047c;
import w.C5139d;
import w.C5140e;

/* renamed from: x.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5177o {

    /* renamed from: f, reason: collision with root package name */
    public static int f41735f;

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f41736a;

    /* renamed from: b, reason: collision with root package name */
    public int f41737b;

    /* renamed from: c, reason: collision with root package name */
    public int f41738c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f41739d;

    /* renamed from: e, reason: collision with root package name */
    public int f41740e;

    public final void a(ArrayList arrayList) {
        int size = this.f41736a.size();
        if (this.f41740e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                C5177o c5177o = (C5177o) arrayList.get(i);
                if (this.f41740e == c5177o.f41737b) {
                    c(this.f41738c, c5177o);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(C5047c c5047c, int i) {
        int n9;
        int n10;
        ArrayList arrayList = this.f41736a;
        if (arrayList.size() == 0) {
            return 0;
        }
        C5140e c5140e = (C5140e) ((C5139d) arrayList.get(0)).f41497T;
        c5047c.t();
        c5140e.b(c5047c, false);
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            ((C5139d) arrayList.get(i6)).b(c5047c, false);
        }
        if (i == 0 && c5140e.f41563z0 > 0) {
            w.j.a(c5140e, c5047c, arrayList, 0);
        }
        if (i == 1 && c5140e.f41543A0 > 0) {
            w.j.a(c5140e, c5047c, arrayList, 1);
        }
        try {
            c5047c.p();
        } catch (Exception e9) {
            System.err.println(e9.toString() + "\n" + Arrays.toString(e9.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.f41739d = new ArrayList();
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            C5139d c5139d = (C5139d) arrayList.get(i9);
            C5176n c5176n = new C5176n();
            new WeakReference(c5139d);
            C5047c.n(c5139d.f41487I);
            C5047c.n(c5139d.J);
            C5047c.n(c5139d.f41488K);
            C5047c.n(c5139d.f41489L);
            C5047c.n(c5139d.f41490M);
            this.f41739d.add(c5176n);
        }
        if (i == 0) {
            n9 = C5047c.n(c5140e.f41487I);
            n10 = C5047c.n(c5140e.f41488K);
            c5047c.t();
        } else {
            n9 = C5047c.n(c5140e.J);
            n10 = C5047c.n(c5140e.f41489L);
            c5047c.t();
        }
        return n10 - n9;
    }

    public final void c(int i, C5177o c5177o) {
        Iterator it = this.f41736a.iterator();
        while (it.hasNext()) {
            C5139d c5139d = (C5139d) it.next();
            ArrayList arrayList = c5177o.f41736a;
            if (!arrayList.contains(c5139d)) {
                arrayList.add(c5139d);
            }
            int i6 = c5177o.f41737b;
            if (i == 0) {
                c5139d.f41528n0 = i6;
            } else {
                c5139d.f41530o0 = i6;
            }
        }
        this.f41740e = c5177o.f41737b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f41738c;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown");
        sb.append(" [");
        String e9 = u1.h.e(this.f41737b, "] <", sb);
        Iterator it = this.f41736a.iterator();
        while (it.hasNext()) {
            C5139d c5139d = (C5139d) it.next();
            StringBuilder c9 = AbstractC5049e.c(e9, " ");
            c9.append(c5139d.f41518h0);
            e9 = c9.toString();
        }
        return AbstractC4404f.f(e9, " >");
    }
}
