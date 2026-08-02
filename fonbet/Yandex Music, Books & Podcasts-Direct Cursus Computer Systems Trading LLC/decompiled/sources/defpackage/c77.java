package defpackage;

import java.io.IOException;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public abstract class c77 extends ReentrantLock implements d77 {
    public static final Logger f = Logger.getLogger(c77.class.getName());
    private static final long serialVersionUID = -3264781576883412227L;
    public volatile p2f a = null;
    public volatile e77 b = null;
    public volatile z67 c = z67.c;
    public final b77 d = new b77("Announce");
    public final b77 e = new b77("Cancel");

    @Override // defpackage.d77
    public final void S(e77 e77Var) {
        if (this.b == e77Var) {
            lock();
            try {
                if (this.b == e77Var) {
                    e(this.c.a());
                } else {
                    f.warning("Trying to advance state whhen not the owner. owner: " + this.b + " perpetrator: " + e77Var);
                }
                unlock();
            } catch (Throwable th) {
                unlock();
                throw th;
            }
        }
    }

    public final void a(e77 e77Var, z67 z67Var) {
        if (this.b == null && this.c == z67Var) {
            lock();
            try {
                if (this.b == null && this.c == z67Var) {
                    f((a77) e77Var);
                }
            } finally {
                unlock();
            }
        }
    }

    public final boolean b() {
        boolean z = false;
        if (i()) {
            return false;
        }
        lock();
        try {
            if (!i()) {
                e(z67.i);
                f(null);
                z = true;
            }
            return z;
        } finally {
            unlock();
        }
    }

    public final void c(e77 e77Var) {
        if (this.b == e77Var) {
            lock();
            try {
                if (this.b == e77Var) {
                    f(null);
                }
            } finally {
                unlock();
            }
        }
    }

    public final boolean d() {
        if (i()) {
            return true;
        }
        lock();
        try {
            if (!i()) {
                z67 z67Var = this.c;
                switch (z67Var) {
                    case c:
                    case d:
                    case e:
                    case f:
                    case g:
                    case h:
                        z67Var = z67.c;
                        break;
                    case i:
                    case j:
                    case k:
                        z67Var = z67.i;
                        break;
                    case l:
                        z67Var = z67.l;
                        break;
                    case m:
                        z67Var = z67.m;
                        break;
                    case n:
                        z67Var = z67.n;
                        break;
                }
                e(z67Var);
                f(null);
            }
            return true;
        } finally {
            unlock();
        }
    }

    public final void e(z67 z67Var) {
        lock();
        try {
            this.c = z67Var;
            if (this.c.b()) {
                this.d.a();
            }
            if (this.c.c()) {
                this.e.a();
                this.d.a();
            }
            unlock();
        } catch (Throwable th) {
            unlock();
            throw th;
        }
    }

    public void f(a77 a77Var) {
        this.b = a77Var;
    }

    public final boolean g() {
        if (!this.c.b() && !i()) {
            this.d.b(6010L);
        }
        if (!this.c.b()) {
            this.d.b(10L);
            if (!this.c.b()) {
                if (i() || j()) {
                    f.fine("Wait for announced cancelled: " + this);
                } else {
                    f.warning("Wait for announced timed out: " + this);
                }
            }
        }
        return this.c.b();
    }

    public final boolean h() {
        if (!this.c.c()) {
            this.e.b(5000L);
        }
        if (!this.c.c()) {
            this.e.b(10L);
            if (!this.c.c() && !j()) {
                f.warning("Wait for canceled timed out: " + this);
            }
        }
        return this.c.c();
    }

    public final boolean i() {
        return this.c.c() || this.c.b == 4;
    }

    public final boolean j() {
        return this.c.b == 7 || this.c.b == 6;
    }

    @Override // java.util.concurrent.locks.ReentrantLock
    public final String toString() {
        String str;
        String str2 = "NO DNS";
        try {
            StringBuilder sb = new StringBuilder();
            if (this.a != null) {
                str = "DNS: " + this.a.q + " [" + this.a.i.b + "]";
            } else {
                str = "NO DNS";
            }
            sb.append(str);
            sb.append(" state: ");
            sb.append(this.c);
            sb.append(" task: ");
            sb.append(this.b);
            return sb.toString();
        } catch (IOException unused) {
            StringBuilder sb2 = new StringBuilder();
            if (this.a != null) {
                str2 = "DNS: " + this.a.q;
            }
            sb2.append(str2);
            sb2.append(" state: ");
            sb2.append(this.c);
            sb2.append(" task: ");
            sb2.append(this.b);
            return sb2.toString();
        }
    }
}
