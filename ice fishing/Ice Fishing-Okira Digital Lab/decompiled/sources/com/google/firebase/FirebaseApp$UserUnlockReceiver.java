package com.google.firebase;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.versionedparcelable.ObsidianEngineBinaryTreeAlgorithmSyndoI0JX8zDt38bbN91752279861712;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
class FirebaseApp$UserUnlockReceiver extends BroadcastReceiver {
    public static final AtomicReference AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = new AtomicReference();
    public final Context ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;

    public FirebaseApp$UserUnlockReceiver(Context context) {
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (ObsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480) {
            try {
                Iterator it = ((ObsidianEngineBinaryTreeAlgorithmSyndoI0JX8zDt38bbN91752279861712) ObsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050.values()).iterator();
                while (it.hasNext()) {
                    ((ObsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015) it.next()).RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.unregisterReceiver(this);
    }
}
