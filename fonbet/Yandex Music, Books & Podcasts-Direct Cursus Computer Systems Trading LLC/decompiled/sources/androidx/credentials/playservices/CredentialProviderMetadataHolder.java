package androidx.credentials.playservices;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import defpackage.ht6;

/* loaded from: classes.dex */
public final class CredentialProviderMetadataHolder extends Service {
    public final ht6 a = new ht6();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        return this.a;
    }
}
