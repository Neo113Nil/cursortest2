package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class lo3 {
    public final /* synthetic */ int a;
    public ArrayList b;

    public lo3(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new ArrayList();
                break;
            default:
                this.b = null;
                break;
        }
    }

    public void a(ko3 ko3Var) {
        if (this.b == null) {
            this.b = new ArrayList();
        }
        int i = 0;
        while (true) {
            int size = this.b.size();
            ArrayList arrayList = this.b;
            if (i >= size) {
                arrayList.add(ko3Var);
                return;
            } else {
                if (((ko3) arrayList.get(i)).a.b > ko3Var.a.b) {
                    this.b.add(i, ko3Var);
                    return;
                }
                i++;
            }
        }
    }

    public void b(lo3 lo3Var) {
        if (lo3Var.b == null) {
            return;
        }
        if (this.b == null) {
            this.b = new ArrayList(lo3Var.b.size());
        }
        Iterator it = lo3Var.b.iterator();
        while (it.hasNext()) {
            a((ko3) it.next());
        }
    }

    public void c(gh0 gh0Var) {
        ArrayList arrayList = this.b;
        arrayList.add(gh0Var);
        while (arrayList.size() > 3) {
            arrayList.remove(0);
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                if (this.b == null) {
                    return "";
                }
                StringBuilder sb = new StringBuilder();
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    sb.append(((ko3) it.next()).toString());
                    sb.append('\n');
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }
}
