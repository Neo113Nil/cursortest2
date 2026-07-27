package x;

import com.icefishing.icefishinglive2.AbstractC4404f;
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
    public static int f41732f;

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f41733a;

    /* renamed from: b, reason: collision with root package name */
    public int f41734b;

    /* renamed from: c, reason: collision with root package name */
    public int f41735c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f41736d;

    /* renamed from: e, reason: collision with root package name */
    public int f41737e;

    public final void a(ArrayList arrayList) {
        int size = this.f41733a.size();
        if (this.f41737e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                C5177o c5177o = (C5177o) arrayList.get(i);
                if (this.f41737e == c5177o.f41734b) {
                    c(this.f41735c, c5177o);
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
        ArrayList arrayList = this.f41733a;
        if (arrayList.size() == 0) {
            return 0;
        }
        C5140e c5140e = (C5140e) ((C5139d) arrayList.get(0)).f41494T;
        c5047c.t();
        c5140e.b(c5047c, false);
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            ((C5139d) arrayList.get(i6)).b(c5047c, false);
        }
        if (i == 0 && c5140e.f41560z0 > 0) {
            w.j.a(c5140e, c5047c, arrayList, 0);
        }
        if (i == 1 && c5140e.f41540A0 > 0) {
            w.j.a(c5140e, c5047c, arrayList, 1);
        }
        try {
            c5047c.p();
        } catch (Exception e9) {
            System.err.println(e9.toString() + "\n" + Arrays.toString(e9.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.f41736d = new ArrayList();
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            C5139d c5139d = (C5139d) arrayList.get(i9);
            C5176n c5176n = new C5176n();
            new WeakReference(c5139d);
            C5047c.n(c5139d.f41484I);
            C5047c.n(c5139d.J);
            C5047c.n(c5139d.f41485K);
            C5047c.n(c5139d.f41486L);
            C5047c.n(c5139d.f41487M);
            this.f41736d.add(c5176n);
        }
        if (i == 0) {
            n9 = C5047c.n(c5140e.f41484I);
            n10 = C5047c.n(c5140e.f41485K);
            c5047c.t();
        } else {
            n9 = C5047c.n(c5140e.J);
            n10 = C5047c.n(c5140e.f41486L);
            c5047c.t();
        }
        return n10 - n9;
    }

    public final void c(int i, C5177o c5177o) {
        Iterator it = this.f41733a.iterator();
        while (it.hasNext()) {
            C5139d c5139d = (C5139d) it.next();
            ArrayList arrayList = c5177o.f41733a;
            if (!arrayList.contains(c5139d)) {
                arrayList.add(c5139d);
            }
            int i6 = c5177o.f41734b;
            if (i == 0) {
                c5139d.f41525n0 = i6;
            } else {
                c5139d.f41527o0 = i6;
            }
        }
        this.f41737e = c5177o.f41734b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f41735c;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown");
        sb.append(" [");
        String e9 = u1.h.e(this.f41734b, "] <", sb);
        Iterator it = this.f41733a.iterator();
        while (it.hasNext()) {
            C5139d c5139d = (C5139d) it.next();
            StringBuilder c9 = AbstractC5049e.c(e9, " ");
            c9.append(c5139d.f41515h0);
            e9 = c9.toString();
        }
        return AbstractC4404f.f(e9, " >");
    }
}
