package defpackage;

import android.os.IBinder;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public abstract class xrj {
    public static final Logger b = Logger.getLogger(xrj.class.getName());
    public final IBinder a;

    public xrj(IBinder iBinder) {
        this.a = iBinder;
    }

    public abstract void a(int i, fo7 fo7Var);
}
