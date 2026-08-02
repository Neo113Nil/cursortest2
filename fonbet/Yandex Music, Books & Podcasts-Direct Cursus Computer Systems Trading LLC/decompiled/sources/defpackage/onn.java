package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class onn extends e77 {
    public static final Logger b = Logger.getLogger(onn.class.getName());

    @Override // defpackage.e77
    public final String e() {
        StringBuilder sb = new StringBuilder("RecordReaper(");
        p2f p2fVar = this.a;
        return su4.o(sb, p2fVar != null ? p2fVar.q : "", ")");
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        p2f p2fVar = this.a;
        if (p2fVar.L0() || p2fVar.K0()) {
            return;
        }
        Level level = Level.FINEST;
        Logger logger = b;
        if (logger.isLoggable(level)) {
            logger.finest(e().concat(".run() JmDNS reaping cache"));
        }
        p2fVar.j0();
    }
}
