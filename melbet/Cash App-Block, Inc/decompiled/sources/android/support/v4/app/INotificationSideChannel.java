package android.support.v4.app;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes3.dex */
public interface INotificationSideChannel extends IInterface {
    public static final String DESCRIPTOR = "android$support$v4$app$INotificationSideChannel".replace('$', '.');

    public abstract class Stub extends Binder implements INotificationSideChannel {
        public static final /* synthetic */ int $r8$clinit = 0;

        public final class Proxy implements INotificationSideChannel {
            public IBinder mRemote;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.mRemote;
            }
        }
    }
}
