package com.adjust.sdk;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import androidx.versionedparcelable.CosmicForgeBootstrapBitwiseZZcTnVj2P2JObTDcc094190520073531;
import androidx.versionedparcelable.GoldenVectorBitwiseWorkerV4G0Yk8psAfnUgbBlF71709461005246;
import androidx.versionedparcelable.NovaLayerAdapterJSONIUn4w6YmM2OYbG2xqX74461642277890;
import java.io.IOException;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public class GooglePlayServicesClient {

    /* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
    public static final class GooglePlayServicesInfo {
        private final String gpsAdid;
        private final Boolean trackingEnabled;

        public GooglePlayServicesInfo(String str, Boolean bool) {
            this.gpsAdid = str;
            this.trackingEnabled = bool;
        }

        public String getGpsAdid() {
            return this.gpsAdid;
        }

        public Boolean isTrackingEnabled() {
            return this.trackingEnabled;
        }
    }

    public static GooglePlayServicesInfo getGooglePlayServicesInfo(Context context, long j) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            GoldenVectorBitwiseWorkerV4G0Yk8psAfnUgbBlF71709461005246.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119("Google Play Services info can't be accessed from the main thread");
            return null;
        }
        context.getPackageManager().getPackageInfo("com.android.vending", 0);
        NovaLayerAdapterJSONIUn4w6YmM2OYbG2xqX74461642277890 novaLayerAdapterJSONIUn4w6YmM2OYbG2xqX74461642277890 = new NovaLayerAdapterJSONIUn4w6YmM2OYbG2xqX74461642277890(j);
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        try {
            if (!context.bindService(intent, novaLayerAdapterJSONIUn4w6YmM2OYbG2xqX74461642277890, 1)) {
                throw new IOException("Google Play connection failed");
            }
            try {
                CosmicForgeBootstrapBitwiseZZcTnVj2P2JObTDcc094190520073531 cosmicForgeBootstrapBitwiseZZcTnVj2P2JObTDcc094190520073531 = new CosmicForgeBootstrapBitwiseZZcTnVj2P2JObTDcc094190520073531(novaLayerAdapterJSONIUn4w6YmM2OYbG2xqX74461642277890.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800());
                return new GooglePlayServicesInfo(cosmicForgeBootstrapBitwiseZZcTnVj2P2JObTDcc094190520073531.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(), cosmicForgeBootstrapBitwiseZZcTnVj2P2JObTDcc094190520073531.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365());
            } catch (Exception e) {
                throw e;
            }
        } finally {
            context.unbindService(novaLayerAdapterJSONIUn4w6YmM2OYbG2xqX74461642277890);
        }
    }
}
