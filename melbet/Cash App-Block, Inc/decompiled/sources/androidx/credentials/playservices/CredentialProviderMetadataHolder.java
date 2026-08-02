package androidx.credentials.playservices;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

/* loaded from: classes3.dex */
public final class CredentialProviderMetadataHolder extends Service {
    public final LocalBinder binder = new LocalBinder();

    public final class LocalBinder extends Binder {
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        return this.binder;
    }
}
