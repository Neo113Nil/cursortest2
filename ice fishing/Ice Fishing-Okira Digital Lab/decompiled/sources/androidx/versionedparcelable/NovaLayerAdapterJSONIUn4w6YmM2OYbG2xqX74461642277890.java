package androidx.versionedparcelable;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class NovaLayerAdapterJSONIUn4w6YmM2OYbG2xqX74461642277890 implements ServiceConnection {
    public final long ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
    public boolean AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = false;
    public final LinkedBlockingQueue ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = new LinkedBlockingQueue(1);

    public NovaLayerAdapterJSONIUn4w6YmM2OYbG2xqX74461642277890(long j) {
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = j;
    }

    public final IBinder ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800() {
        if (this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365) {
            throw new IllegalStateException();
        }
        this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = true;
        return (IBinder) this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495.poll(this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800, TimeUnit.MILLISECONDS);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495.put(iBinder);
        } catch (InterruptedException unused) {
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
