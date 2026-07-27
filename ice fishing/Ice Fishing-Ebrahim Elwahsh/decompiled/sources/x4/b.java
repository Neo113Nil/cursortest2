package x4;

import com.onesignal.session.internal.outcomes.impl.o;
import kotlin.jvm.internal.h;
import t4.f;
import w4.d;

/* loaded from: classes2.dex */
public final class b implements d {
    private final f _application;
    private final Object lock;
    private c osDatabase;

    public b(f _application) {
        h.e(_application, "_application");
        this._application = _application;
        this.lock = new Object();
    }

    @Override // w4.d
    public w4.c getOs() {
        if (this.osDatabase == null) {
            synchronized (this.lock) {
                if (this.osDatabase == null) {
                    this.osDatabase = new c(new o(), this._application.getAppContext(), 0, 4, null);
                }
            }
        }
        c cVar = this.osDatabase;
        h.b(cVar);
        return cVar;
    }
}
