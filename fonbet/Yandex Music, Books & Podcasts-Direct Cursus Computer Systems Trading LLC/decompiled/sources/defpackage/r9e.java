package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public abstract class r9e extends Binder implements s9e {
    public static final /* synthetic */ int a = 0;

    public static s9e R(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.facebook.ppml.receiver.IReceiverService");
        if (queryLocalInterface != null && (queryLocalInterface instanceof s9e)) {
            return (s9e) queryLocalInterface;
        }
        q9e q9eVar = new q9e();
        q9eVar.a = iBinder;
        return q9eVar;
    }
}
