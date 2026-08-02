package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class kn0 implements Appendable {
    public final StringBuilder a;
    public final ArrayList b;
    public final ArrayList c;

    public kn0(int i) {
        this.a = new StringBuilder(i);
        this.b = new ArrayList();
        this.c = new ArrayList();
        new ArrayList();
    }

    public final void a(c4r c4rVar, int i, int i2) {
        this.c.add(new jn0(c4rVar, i, i2, 8));
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        boolean z = charSequence instanceof mn0;
        StringBuilder sb = this.a;
        if (!z) {
            sb.append(charSequence, i, i2);
            return this;
        }
        mn0 mn0Var = (mn0) charSequence;
        int length = sb.length();
        sb.append((CharSequence) mn0Var.b, i, i2);
        List b = nn0.b(mn0Var, i, i2, null);
        if (b != null) {
            int size = b.size();
            for (int i3 = 0; i3 < size; i3++) {
                ln0 ln0Var = (ln0) b.get(i3);
                this.c.add(new jn0(ln0Var.b + length, ln0Var.c + length, ln0Var.a, ln0Var.d));
            }
        }
        return this;
    }

    public final void b(mn0 mn0Var) {
        StringBuilder sb = this.a;
        int length = sb.length();
        sb.append(mn0Var.b);
        List list = mn0Var.a;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ln0 ln0Var = (ln0) list.get(i);
                this.c.add(new jn0(ln0Var.b + length, ln0Var.c + length, ln0Var.a, ln0Var.d));
            }
        }
    }

    public final void c(CharSequence charSequence) {
        if (charSequence instanceof mn0) {
            b((mn0) charSequence);
        } else {
            this.a.append(charSequence);
        }
    }

    public final void d(String str) {
        this.a.append(str);
    }

    public final void e() {
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            tme.c("Nothing to pop.");
        }
        ((jn0) arrayList.remove(arrayList.size() - 1)).c = this.a.length();
    }

    public final void f(int i) {
        ArrayList arrayList = this.b;
        if (i >= arrayList.size()) {
            tme.c(i + " should be less than " + arrayList.size());
        }
        while (arrayList.size() - 1 >= i) {
            e();
        }
    }

    public final int g(c4r c4rVar) {
        jn0 jn0Var = new jn0(c4rVar, this.a.length(), 0, 12);
        this.b.add(jn0Var);
        this.c.add(jn0Var);
        return r5.size() - 1;
    }

    public final mn0 h() {
        StringBuilder sb = this.a;
        String sb2 = sb.toString();
        ArrayList arrayList = this.c;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(((jn0) arrayList.get(i)).a(sb.length()));
        }
        return new mn0(sb2, arrayList2);
    }

    public /* synthetic */ kn0() {
        this(16);
    }

    public kn0(mn0 mn0Var) {
        this();
        b(mn0Var);
    }

    @Override // java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) {
        c(charSequence);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        this.a.append(c);
        return this;
    }
}
