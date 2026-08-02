package defpackage;

import android.os.Binder;
import android.os.Parcel;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class fwf extends Binder {
    public static final Logger h = Logger.getLogger(fwf.class.getName());
    public ewf a;

    public fwf(ewf ewfVar) {
        this.a = ewfVar;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        ewf ewfVar = this.a;
        if (ewfVar != null) {
            try {
                return ewfVar.e(parcel, i);
            } catch (RuntimeException e) {
                h.log(Level.WARNING, "failure sending transaction " + i, (Throwable) e);
            }
        }
        return false;
    }

    @Override // android.os.Binder, android.os.IBinder
    public final boolean pingBinder() {
        return this.a != null;
    }
}
