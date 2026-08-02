package H1;

import P1.p;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque f1188a;

    public a(int i) {
        switch (i) {
            case 1:
                this.f1188a = new ArrayDeque();
                break;
            default:
                char[] cArr = p.f2376a;
                this.f1188a = new ArrayDeque(0);
                break;
        }
    }

    public synchronized void a(t1.c cVar) {
        cVar.f40858b = null;
        cVar.f40859c = null;
        this.f1188a.offer(cVar);
    }
}
