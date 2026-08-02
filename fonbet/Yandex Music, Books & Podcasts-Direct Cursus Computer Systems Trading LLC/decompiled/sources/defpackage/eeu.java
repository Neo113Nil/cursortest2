package defpackage;

import android.os.Process;
import java.util.PriorityQueue;

/* loaded from: classes3.dex */
public final class eeu extends Thread {
    public final yo6 a;
    public final xv2 b;
    public volatile String c;

    public eeu(yo6 yo6Var) {
        super("ViewPoolThread");
        this.a = yo6Var;
        this.b = new xv2(new PriorityQueue(32));
        setPriority(5);
    }

    public final void a() {
        deu deuVar = (deu) this.b.poll();
        if (deuVar == null) {
            try {
                setPriority(3);
                deuVar = (deu) this.b.take();
            } finally {
                setPriority(5);
            }
        }
        this.c = deuVar.b;
        deuVar.run();
        this.c = null;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.myTid();
        this.a.getClass();
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}
