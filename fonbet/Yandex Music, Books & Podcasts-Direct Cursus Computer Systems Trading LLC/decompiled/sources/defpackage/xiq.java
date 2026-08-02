package defpackage;

/* loaded from: classes6.dex */
public final class xiq extends j1 {
    public final vtm a;
    public final gku b;

    public xiq(vtm vtmVar, gku gkuVar) {
        this.a = vtmVar;
        this.b = gkuVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003c A[Catch: all -> 0x0055, TryCatch #1 {, blocks: (B:3:0x0001, B:4:0x0008, B:7:0x0011, B:9:0x0014, B:15:0x0043, B:16:0x004a, B:19:0x0050, B:23:0x0053, B:24:0x0054, B:26:0x003c, B:27:0x002a, B:34:0x005a, B:35:0x005b, B:18:0x004b, B:6:0x0009), top: B:2:0x0001, inners: #0, #2 }] */
    @Override // defpackage.j1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized q1 a(String str) {
        q1 q1Var;
        boolean z;
        gku gkuVar;
        str.getClass();
        gku gkuVar2 = this.b;
        synchronized (gkuVar2.b) {
            q1Var = (q1) gkuVar2.a.get(str);
        }
        if (q1Var == null) {
            q1Var = ((i1) this.a.a).getConfig();
            long j = q1Var.a;
            if (j != -9223372036854775807L && System.currentTimeMillis() - j >= 172800000) {
                z = false;
                if (z) {
                    q1.Companion.getClass();
                    q1Var = q1.g;
                }
                gkuVar = this.b;
                q1Var.getClass();
                synchronized (gkuVar.b) {
                    gkuVar.a.put(str, q1Var);
                }
            }
            z = true;
            if (z) {
            }
            gkuVar = this.b;
            q1Var.getClass();
            synchronized (gkuVar.b) {
            }
        }
        return q1Var;
    }

    @Override // defpackage.j1
    public final void b() {
    }

    @Override // defpackage.j1
    public final void c() {
    }
}
