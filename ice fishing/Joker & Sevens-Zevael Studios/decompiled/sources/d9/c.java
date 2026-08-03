package d9;

import java.util.Iterator;
import n8.d;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c {
    private final d services;

    public c(d dVar) {
        j.e(dVar, "services");
        this.services = dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: scheduleStart$lambda-2, reason: not valid java name */
    public static final void m48scheduleStart$lambda2(c cVar) {
        j.e(cVar, "this$0");
        Iterator it = cVar.services.getAllServices(b.class).iterator();
        while (it.hasNext()) {
            ((b) it.next()).start();
        }
    }

    public final void bootstrap() {
        Iterator it = this.services.getAllServices(a.class).iterator();
        while (it.hasNext()) {
            ((a) it.next()).bootstrap();
        }
    }

    public final void scheduleStart() {
        new Thread(new a1.a(9, this)).start();
    }
}
