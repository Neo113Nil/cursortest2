package defpackage;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class feu {
    public final eeu a;

    public feu(yo6 yo6Var) {
        eeu eeuVar = new eeu(yo6Var);
        this.a = eeuVar;
        eeuVar.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        r2.remove();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006e, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007b, code lost:
    
        throw r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(qn qnVar) {
        if (qnVar.a.equals(this.a.c) || qnVar.i) {
            return;
        }
        this.a.b.b.lock();
        try {
            if (!qnVar.a.equals(this.a.c) && !qnVar.i) {
                xv2 xv2Var = this.a.b;
                xv2Var.b.lock();
                Iterator it = xv2Var.a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((deu) it.next()).b.equals(qnVar.a)) {
                        break;
                    }
                }
                xv2Var.b.unlock();
                this.a.b.offer(new deu(qnVar, -1));
            }
        } finally {
        }
    }
}
