package defpackage;

import coil.disk.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public final class sxj {
    public final String a;
    public final long[] b = new long[2];
    public final ArrayList c = new ArrayList(2);
    public final ArrayList d = new ArrayList(2);
    public boolean e;
    public boolean f;
    public kzo g;
    public int h;
    public final /* synthetic */ a i;

    public sxj(a aVar, String str) {
        this.i = aVar;
        this.a = str;
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i = 0; i < 2; i++) {
            sb.append(i);
            this.c.add(this.i.a.e(sb.toString()));
            sb.append(".tmp");
            this.d.add(this.i.a.e(sb.toString()));
            sb.setLength(length);
        }
    }

    public final ArrayList a() {
        return this.c;
    }

    public final kzo b() {
        return this.g;
    }

    public final ArrayList c() {
        return this.d;
    }

    public final String d() {
        return this.a;
    }

    public final long[] e() {
        return this.b;
    }

    public final int f() {
        return this.h;
    }

    public final boolean g() {
        return this.e;
    }

    public final boolean h() {
        return this.f;
    }

    public final void i(kzo kzoVar) {
        this.g = kzoVar;
    }

    public final void j(List list) {
        if (list.size() != 2) {
            w511.h(list, "unexpected journal line: ");
            return;
        }
        try {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                this.b[i] = Long.parseLong((String) list.get(i));
            }
        } catch (NumberFormatException unused) {
            w511.h(list, "unexpected journal line: ");
        }
    }

    public final void k() {
        this.e = true;
    }

    public final void l() {
        this.f = true;
    }

    public final wxj m() {
        if (!this.e || this.g != null || this.f) {
            return null;
        }
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            a aVar = this.i;
            if (i >= size) {
                this.h++;
                return new wxj(aVar, this);
            }
            if (!aVar.I.n((oq90) arrayList.get(i))) {
                try {
                    aVar.w(this);
                } catch (IOException unused) {
                }
                return null;
            }
            i++;
        }
    }

    public final void n(ici0 ici0Var) {
        for (long j : this.b) {
            ici0Var.writeByte(32);
            ici0Var.d0(j);
        }
    }
}
