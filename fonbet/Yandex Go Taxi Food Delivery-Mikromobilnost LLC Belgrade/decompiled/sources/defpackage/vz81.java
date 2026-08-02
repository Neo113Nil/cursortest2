package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public abstract class vz81 {
    public final int a;

    public vz81(int i) {
        this.a = i;
    }

    public static /* bridge */ /* synthetic */ Status e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + Extension.COLON_SPACE + remoteException.getLocalizedMessage());
    }

    public abstract void a(Status status);

    public abstract void b(Exception exc);

    public abstract void c(jy81 jy81Var);

    public abstract void d(rx81 rx81Var, boolean z);
}
