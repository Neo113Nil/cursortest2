package defpackage;

import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class mmv {
    public static int f;
    public ArrayList a;
    public int b;
    public int c;
    public ArrayList d;
    public int e;

    public final void a(ArrayList arrayList) {
        int size = this.a.size();
        if (this.e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                mmv mmvVar = (mmv) arrayList.get(i);
                if (this.e == mmvVar.b) {
                    c(this.c, mmvVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(j7g j7gVar, int i) {
        int n;
        int n2;
        ArrayList arrayList = this.a;
        if (arrayList.size() == 0) {
            return 0;
        }
        ba6 ba6Var = (ba6) ((aa6) arrayList.get(0)).V;
        j7gVar.t();
        ba6Var.b(j7gVar, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((aa6) arrayList.get(i2)).b(j7gVar, false);
        }
        if (i == 0 && ba6Var.D0 > 0) {
            vnj.i(ba6Var, j7gVar, arrayList, 0);
        }
        if (i == 1 && ba6Var.E0 > 0) {
            vnj.i(ba6Var, j7gVar, arrayList, 1);
        }
        try {
            j7gVar.p();
        } catch (Exception e) {
            System.err.println(e.toString() + StringUtil.LF + Arrays.toString(e.getStackTrace()).replace("[", "   at ").replace(StringUtils.COMMA, "\n   at").replace("]", ""));
        }
        this.d = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            aa6 aa6Var = (aa6) arrayList.get(i3);
            i5l i5lVar = new i5l();
            new WeakReference(aa6Var);
            j7g.n(aa6Var.J);
            j7g.n(aa6Var.K);
            j7g.n(aa6Var.L);
            j7g.n(aa6Var.M);
            j7g.n(aa6Var.N);
            this.d.add(i5lVar);
        }
        if (i == 0) {
            n = j7g.n(ba6Var.J);
            n2 = j7g.n(ba6Var.L);
            j7gVar.t();
        } else {
            n = j7g.n(ba6Var.K);
            n2 = j7g.n(ba6Var.M);
            j7gVar.t();
        }
        return n2 - n;
    }

    public final void c(int i, mmv mmvVar) {
        int i2 = mmvVar.b;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            aa6 aa6Var = (aa6) it.next();
            ArrayList arrayList = mmvVar.a;
            if (!arrayList.contains(aa6Var)) {
                arrayList.add(aa6Var);
            }
            if (i == 0) {
                aa6Var.s0 = i2;
            } else {
                aa6Var.t0 = i2;
            }
        }
        this.e = i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.c;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown");
        sb.append(" [");
        String i2 = f1d.i(sb, this.b, "] <");
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            aa6 aa6Var = (aa6) it.next();
            StringBuilder m = tlm.m(i2, StringUtil.SPACE);
            m.append(aa6Var.k0);
            i2 = m.toString();
        }
        return i2.concat(" >");
    }
}
