package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* loaded from: classes5.dex */
public abstract class ue6 {
    public static final ve6 a;

    static {
        ve6 pfsVar;
        AtomicReference atomicReference = new AtomicReference();
        try {
            pfsVar = (ve6) Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(ve6.class).getConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e) {
            atomicReference.set(e);
            pfsVar = new pfs();
        } catch (Exception e2) {
            kac.k("Storage override failed to initialize", e2);
            return;
        }
        a = pfsVar;
        Throwable th = (Throwable) atomicReference.get();
        if (th != null) {
            we6.d.log(Level.FINE, "Storage override doesn't exist. Using default", th);
        }
    }
}
