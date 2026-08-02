package defpackage;

import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import com.google.android.gms.cloudmessaging.IMessengerCompat;
import com.google.android.gms.cloudmessaging.zzd;
import java.util.Objects;

/* loaded from: classes11.dex */
public final class xfb1 {
    public final Messenger a;
    public final zzd b;

    public xfb1(IBinder iBinder) {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.a = new Messenger(iBinder);
            this.b = null;
        } else {
            if (!Objects.equals(interfaceDescriptor, IMessengerCompat.DESCRIPTOR)) {
                throw new RemoteException();
            }
            this.b = new zzd(iBinder);
            this.a = null;
        }
    }
}
