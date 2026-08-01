package com.adjust.sdk;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import com.google.android.datatransport.WinterFlowEventEmitterOrchestration;
import com.google.android.datatransport.WinterFlowSyntaxSubsystem;
import com.google.android.datatransport.WinterFlowXMLSubsystem;
import java.io.IOException;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public class GooglePlayServicesClient {

    /* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
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
            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Google Play Services info can't be accessed from the main thread");
            return null;
        }
        context.getPackageManager().getPackageInfo("com.android.vending", 0);
        WinterFlowXMLSubsystem winterFlowXMLSubsystem = new WinterFlowXMLSubsystem(j);
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        try {
            if (!context.bindService(intent, winterFlowXMLSubsystem, 1)) {
                throw new IOException("Google Play connection failed");
            }
            try {
                WinterFlowSyntaxSubsystem winterFlowSyntaxSubsystem = new WinterFlowSyntaxSubsystem(winterFlowXMLSubsystem.WinterFlowRouterStructure());
                return new GooglePlayServicesInfo(winterFlowSyntaxSubsystem.WinterFlowRouterStructure(), winterFlowSyntaxSubsystem.WinterFlowCacheManagerAgent());
            } catch (Exception e) {
                throw e;
            }
        } finally {
            context.unbindService(winterFlowXMLSubsystem);
        }
    }
}
