package defpackage;

import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import com.google.android.gms.cloudmessaging.IMessengerCompat;
import com.google.android.gms.iid.MessengerCompat;

/* loaded from: classes11.dex */
public final class xvb1 {
    public xvb1(IBinder iBinder) {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            new Messenger(iBinder);
        } else {
            if (!IMessengerCompat.DESCRIPTOR.equals(interfaceDescriptor)) {
                throw new RemoteException();
            }
            new MessengerCompat(iBinder);
        }
    }
}
