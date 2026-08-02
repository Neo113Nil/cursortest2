package defpackage;

/* loaded from: classes6.dex */
public final class oi7 extends j1 {
    public final znk a;
    public final n1 b;
    public final pjn c;
    public final gku d;

    public oi7(znk znkVar, n1 n1Var, pjn pjnVar, gku gkuVar) {
        this.a = znkVar;
        this.b = n1Var;
        this.c = pjnVar;
        this.d = gkuVar;
        x97.y(n1Var.a, null, null, new k1(n1Var, null, 0), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0052 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003a A[Catch: all -> 0x005c, TryCatch #2 {, blocks: (B:3:0x0001, B:4:0x0008, B:7:0x0011, B:9:0x0014, B:15:0x004a, B:16:0x0051, B:19:0x0057, B:23:0x005a, B:24:0x005b, B:26:0x003a, B:27:0x0028, B:34:0x0061, B:35:0x0062, B:6:0x0009, B:18:0x0052), top: B:2:0x0001, inners: #0, #1 }] */
    @Override // defpackage.j1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized q1 a(String str) {
        q1 q1Var;
        boolean z;
        gku gkuVar;
        str.getClass();
        gku gkuVar2 = this.d;
        synchronized (gkuVar2.b) {
            q1Var = (q1) gkuVar2.a.get(str);
        }
        if (q1Var == null) {
            q1Var = this.c.f(this.a);
            long j = q1Var.a;
            if (j != -9223372036854775807L && System.currentTimeMillis() - j >= 172800000) {
                z = false;
                if (z) {
                    ((i1) this.a.b).invalidate();
                    q1.Companion.getClass();
                    q1Var = q1.g;
                }
                gkuVar = this.d;
                q1Var.getClass();
                synchronized (gkuVar.b) {
                    gkuVar.a.put(str, q1Var);
                }
            }
            z = true;
            if (z) {
            }
            gkuVar = this.d;
            q1Var.getClass();
            synchronized (gkuVar.b) {
            }
        }
        return q1Var;
    }

    @Override // defpackage.j1
    public final void b() {
        n1 n1Var = this.b;
        if (!n1Var.i.b()) {
            n1Var.i = n1Var.c();
        }
        xdr xdrVar = n1Var.g;
        Boolean bool = Boolean.TRUE;
        xdrVar.getClass();
        xdrVar.m(null, bool);
    }

    @Override // defpackage.j1
    public final void c() {
        xdr xdrVar = this.b.g;
        Boolean bool = Boolean.FALSE;
        xdrVar.getClass();
        xdrVar.m(null, bool);
    }
}
