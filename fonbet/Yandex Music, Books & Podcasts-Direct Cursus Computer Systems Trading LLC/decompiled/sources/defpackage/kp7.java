package defpackage;

import java.util.HashMap;
import java.util.Random;

/* loaded from: classes.dex */
public final class kp7 {
    public static final eb7 h = new eb7(1);
    public static final Random i = new Random();
    public joh d;
    public String f;
    public final ris a = new ris();
    public final ois b = new ois();
    public final HashMap c = new HashMap();
    public sis e = sis.a;
    public long g = -1;

    public final void a(jp7 jp7Var) {
        long j = jp7Var.c;
        if (j != -1) {
            this.g = j;
        }
        this.f = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
    
        if (r12 != (-1)) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009b A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final jp7 b(int i2, uvh uvhVar) {
        long j;
        long j2;
        long j3;
        HashMap hashMap = this.c;
        jp7 jp7Var = null;
        long j4 = Long.MAX_VALUE;
        for (jp7 jp7Var2 : hashMap.values()) {
            long j5 = jp7Var2.c;
            uvh uvhVar2 = jp7Var2.d;
            if (j5 == -1 && i2 == jp7Var2.b && uvhVar != null) {
                long j6 = uvhVar.d;
                kp7 kp7Var = jp7Var2.g;
                j = -1;
                jp7 jp7Var3 = (jp7) kp7Var.c.get(kp7Var.f);
                if (jp7Var3 != null) {
                    j3 = jp7Var3.c;
                }
                j3 = kp7Var.g + 1;
                if (j6 >= j3) {
                    jp7Var2.c = j6;
                }
            } else {
                j = -1;
            }
            if (uvhVar != null) {
                long j7 = uvhVar.d;
                if (uvhVar2 == null) {
                    if (!uvhVar.b() && j7 == jp7Var2.c) {
                        j2 = jp7Var2.c;
                        if (j2 == j) {
                        }
                        jp7Var = jp7Var2;
                        j4 = j2;
                    }
                } else if (j7 == uvhVar2.d && uvhVar.b == uvhVar2.b && uvhVar.c == uvhVar2.c) {
                    j2 = jp7Var2.c;
                    if (j2 == j) {
                    }
                    jp7Var = jp7Var2;
                    j4 = j2;
                }
            } else if (i2 == jp7Var2.b) {
                j2 = jp7Var2.c;
                if (j2 == j || j2 < j4) {
                    jp7Var = jp7Var2;
                    j4 = j2;
                } else if (j2 == j4) {
                    int i3 = dvt.a;
                    if (jp7Var.d != null && uvhVar2 != null) {
                        jp7Var = jp7Var2;
                    }
                }
            }
        }
        if (jp7Var != null) {
            return jp7Var;
        }
        String str = (String) h.get();
        jp7 jp7Var4 = new jp7(this, str, i2, uvhVar);
        hashMap.put(str, jp7Var4);
        return jp7Var4;
    }

    public final synchronized String c(sis sisVar, uvh uvhVar) {
        return b(sisVar.g(uvhVar.a, this.b).c, uvhVar).a;
    }

    public final void d(c80 c80Var) {
        uvh uvhVar;
        sis sisVar = c80Var.b;
        int i2 = c80Var.c;
        uvh uvhVar2 = c80Var.d;
        boolean p = sisVar.p();
        String str = this.f;
        HashMap hashMap = this.c;
        if (p) {
            if (str != null) {
                jp7 jp7Var = (jp7) hashMap.get(str);
                jp7Var.getClass();
                a(jp7Var);
                return;
            }
            return;
        }
        jp7 jp7Var2 = (jp7) hashMap.get(str);
        this.f = b(i2, uvhVar2).a;
        e(c80Var);
        if (uvhVar2 != null) {
            long j = uvhVar2.d;
            if (uvhVar2.b()) {
                if (jp7Var2 != null && jp7Var2.c == j && (uvhVar = jp7Var2.d) != null && uvhVar.b == uvhVar2.b && uvhVar.c == uvhVar2.c) {
                    return;
                }
                b(i2, new uvh(j, uvhVar2.a));
                this.d.getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036 A[Catch: all -> 0x0050, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x0010, B:10:0x0014, B:12:0x0024, B:19:0x0036, B:21:0x0042, B:23:0x0048, B:27:0x002b, B:29:0x0053, B:31:0x005f, B:32:0x0063, B:34:0x0068, B:36:0x006e, B:38:0x0085, B:39:0x00b3, B:41:0x00b7, B:42:0x00be, B:44:0x00c8, B:46:0x00cc), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void e(c80 c80Var) {
        long j;
        this.d.getClass();
        if (c80Var.b.p()) {
            return;
        }
        uvh uvhVar = c80Var.d;
        if (uvhVar != null) {
            long j2 = uvhVar.d;
            jp7 jp7Var = (jp7) this.c.get(this.f);
            if (jp7Var != null) {
                j = jp7Var.c;
                if (j != -1) {
                    if (j2 >= j) {
                        return;
                    }
                    jp7 jp7Var2 = (jp7) this.c.get(this.f);
                    if (jp7Var2 != null && jp7Var2.c == -1 && jp7Var2.b != c80Var.c) {
                        return;
                    }
                }
            }
            j = this.g + 1;
            if (j2 >= j) {
            }
        }
        jp7 b = b(c80Var.c, c80Var.d);
        if (this.f == null) {
            this.f = b.a;
        }
        uvh uvhVar2 = c80Var.d;
        if (uvhVar2 != null && uvhVar2.b()) {
            uvh uvhVar3 = c80Var.d;
            jp7 b2 = b(c80Var.c, new uvh(uvhVar3.a, uvhVar3.d, uvhVar3.b));
            if (!b2.e) {
                b2.e = true;
                c80Var.b.g(c80Var.d.a, this.b);
                Math.max(0L, dvt.m0(this.b.d(c80Var.d.b)) + dvt.m0(this.b.e));
                this.d.getClass();
            }
        }
        if (!b.e) {
            b.e = true;
            this.d.getClass();
        }
        if (b.a.equals(this.f) && !b.f) {
            b.f = true;
            this.d.q0(c80Var, b.a);
        }
    }
}
