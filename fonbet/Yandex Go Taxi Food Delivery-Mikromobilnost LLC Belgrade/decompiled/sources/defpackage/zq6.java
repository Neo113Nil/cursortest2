package defpackage;

import java.util.List;

/* loaded from: classes8.dex */
public final class zq6 implements xa20 {
    public final int a;
    public final Object b;
    public volatile xa20 c;
    public final x43 d;
    public final x43 e;

    public zq6(int i) {
        this.a = 32;
        this.b = new Object();
        this.d = new x43();
        this.e = new x43();
    }

    @Override // defpackage.xa20
    public final void a(wtf0 wtf0Var, Throwable th) {
        xa20 xa20Var = this.c;
        if (xa20Var != null) {
            xa20Var.a(wtf0Var, th);
        }
    }

    @Override // defpackage.xa20
    public final void b(leo leoVar) {
        xa20 xa20Var = this.c;
        if (xa20Var != null) {
            xa20Var.b(leoVar);
            return;
        }
        synchronized (this.b) {
            try {
                xa20 xa20Var2 = this.c;
                if (xa20Var2 != null) {
                    xa20Var2.b(leoVar);
                } else {
                    x43 x43Var = this.d;
                    while (x43Var.size() >= this.a) {
                        x43Var.removeFirst();
                    }
                    x43Var.addLast(leoVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.xa20
    public final void c(String str, String str2) {
        xa20 xa20Var = this.c;
        if (xa20Var != null) {
            xa20Var.c(str, str2);
        }
    }

    @Override // defpackage.xa20
    public final void d(List list) {
        xa20 xa20Var = this.c;
        if (xa20Var != null) {
            xa20Var.d(list);
            return;
        }
        synchronized (this.b) {
            try {
                xa20 xa20Var2 = this.c;
                if (xa20Var2 != null) {
                    xa20Var2.d(list);
                } else {
                    x43 x43Var = this.e;
                    while (list.size() + x43Var.size() > this.a) {
                        x43Var.removeFirst();
                    }
                    x43Var.addAll(list);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.xa20
    public final void e(wtf0 wtf0Var) {
        xa20 xa20Var = this.c;
        if (xa20Var != null) {
            xa20Var.e(wtf0Var);
        }
    }

    public zq6() {
        this(0);
    }
}
