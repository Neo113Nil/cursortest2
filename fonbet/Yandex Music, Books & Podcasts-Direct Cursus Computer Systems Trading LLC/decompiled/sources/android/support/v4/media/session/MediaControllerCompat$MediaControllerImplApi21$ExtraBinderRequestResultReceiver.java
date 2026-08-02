package android.support.v4.media.session;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.ResultReceiver;
import defpackage.b9e;
import defpackage.e9e;
import defpackage.q6k;
import defpackage.z0u;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
class MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver extends ResultReceiver {
    public WeakReference a;

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        e9e e9eVar;
        a aVar = (a) this.a.get();
        if (aVar == null || bundle == null) {
            return;
        }
        synchronized (aVar.b) {
            MediaSessionCompat$Token mediaSessionCompat$Token = aVar.e;
            IBinder binder = bundle.getBinder("android.support.v4.media.session.EXTRA_BINDER");
            int i2 = d.h;
            if (binder == null) {
                e9eVar = null;
            } else {
                IInterface queryLocalInterface = binder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                if (queryLocalInterface == null || !(queryLocalInterface instanceof e9e)) {
                    b9e b9eVar = new b9e();
                    b9eVar.a = binder;
                    e9eVar = b9eVar;
                } else {
                    e9eVar = (e9e) queryLocalInterface;
                }
            }
            synchronized (mediaSessionCompat$Token.a) {
                mediaSessionCompat$Token.c = e9eVar;
            }
            MediaSessionCompat$Token mediaSessionCompat$Token2 = aVar.e;
            z0u x = q6k.x(bundle);
            synchronized (mediaSessionCompat$Token2.a) {
                mediaSessionCompat$Token2.d = x;
            }
            aVar.a();
        }
    }
}
