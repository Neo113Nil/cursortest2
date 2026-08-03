package u8;

import com.onesignal.session.internal.outcomes.impl.o;
import pc.j;
import q8.f;
import t8.d;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b implements d {
    private final f _application;
    private final Object lock;
    private c osDatabase;

    public b(f fVar) {
        j.e(fVar, "_application");
        this._application = fVar;
        this.lock = new Object();
    }

    @Override // t8.d
    public t8.c getOs() {
        if (this.osDatabase == null) {
            synchronized (this.lock) {
                if (this.osDatabase == null) {
                    this.osDatabase = new c(new o(), this._application.getAppContext(), 0, 4, null);
                }
            }
        }
        c cVar = this.osDatabase;
        j.b(cVar);
        return cVar;
    }
}
