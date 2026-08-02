package defpackage;

import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class pwj implements daf {
    public final er3 b = new er3(0);

    @Override // defpackage.daf
    public final void b(MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            er3 er3Var = this.b;
            if (i >= er3Var.c) {
                return;
            }
            cvj cvjVar = (cvj) er3Var.f(i);
            Object j = this.b.j(i);
            bvj bvjVar = cvjVar.b;
            if (cvjVar.d == null) {
                cvjVar.d = cvjVar.c.getBytes(daf.a);
            }
            bvjVar.f(cvjVar.d, j, messageDigest);
            i++;
        }
    }

    public final Object c(cvj cvjVar) {
        er3 er3Var = this.b;
        return er3Var.containsKey(cvjVar) ? er3Var.get(cvjVar) : cvjVar.a;
    }

    @Override // defpackage.daf
    public final boolean equals(Object obj) {
        if (obj instanceof pwj) {
            return this.b.equals(((pwj) obj).b);
        }
        return false;
    }

    @Override // defpackage.daf
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.b + '}';
    }
}
