package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
class SyncTask$ConnectivityChangeReceiver extends BroadcastReceiver {
    public Context AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
    public ObsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015 ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;

    public final void ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800() {
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        ObsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015 obsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015 = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        if (obsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015 != null) {
            Context context = obsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
            this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = context;
            context.registerReceiver(this, intentFilter);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ObsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015 obsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015 = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        if (obsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015 != null && obsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800()) {
            ObsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015 obsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec985002353880152 = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
            obsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec985002353880152.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170.getClass();
            FirebaseMessaging.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(obsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec985002353880152, 0L);
            Context context2 = this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
            if (context2 != null) {
                context2.unregisterReceiver(this);
            }
            this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = null;
        }
    }
}
