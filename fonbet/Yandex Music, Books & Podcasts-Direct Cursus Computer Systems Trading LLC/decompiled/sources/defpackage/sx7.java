package defpackage;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class sx7 implements px7 {
    public final ynv d;
    public int f;
    public int g;
    public ynv a = null;
    public boolean b = false;
    public boolean c = false;
    public int e = 1;
    public int h = 1;
    public v38 i = null;
    public boolean j = false;
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();

    public sx7(ynv ynvVar) {
        this.d = ynvVar;
    }

    @Override // defpackage.px7
    public final void a(px7 px7Var) {
        ArrayList arrayList = this.l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((sx7) it.next()).j) {
                return;
            }
        }
        this.c = true;
        ynv ynvVar = this.a;
        if (ynvVar != null) {
            ynvVar.a(this);
        }
        if (this.b) {
            this.d.a(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        sx7 sx7Var = null;
        int i = 0;
        while (it2.hasNext()) {
            sx7 sx7Var2 = (sx7) it2.next();
            if (!(sx7Var2 instanceof v38)) {
                i++;
                sx7Var = sx7Var2;
            }
        }
        if (sx7Var != null && i == 1 && sx7Var.j) {
            v38 v38Var = this.i;
            if (v38Var != null) {
                if (!v38Var.j) {
                    return;
                } else {
                    this.f = this.h * v38Var.g;
                }
            }
            d(sx7Var.g + this.f);
        }
        ynv ynvVar2 = this.a;
        if (ynvVar2 != null) {
            ynvVar2.a(this);
        }
    }

    public final void b(ynv ynvVar) {
        this.k.add(ynvVar);
        if (this.j) {
            ynvVar.a(ynvVar);
        }
    }

    public final void c() {
        this.l.clear();
        this.k.clear();
        this.j = false;
        this.g = 0;
        this.c = false;
        this.b = false;
    }

    public void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            px7 px7Var = (px7) it.next();
            px7Var.a(px7Var);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.b.k0);
        sb.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
        switch (this.e) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.j ? Integer.valueOf(this.g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.l.size());
        sb.append(":d=");
        sb.append(this.k.size());
        sb.append(">");
        return sb.toString();
    }
}
