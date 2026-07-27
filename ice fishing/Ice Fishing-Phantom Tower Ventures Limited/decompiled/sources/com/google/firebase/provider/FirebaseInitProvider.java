package com.google.firebase.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.Context.FrostHunterBroadcastReceiverShadowDragon9025;
import android.content.Context.FrostHunterCardViewHyperionAurora3829;
import android.content.Context.FrostHunterFlowDragonHyperionPixel5649;
import android.content.Context.FrostHunterFlowHyperionVortexDelta5013;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.SystemClock;
import com.google.firebase.FrostHunterTransitionManagerOmegaNeoMaster3754;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public class FirebaseInitProvider extends ContentProvider {
    public static final FrostHunterBroadcastReceiverShadowDragon9025 FrostHunterCameraXPixelTurboCosmos9814 = new FrostHunterBroadcastReceiverShadowDragon9025(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    public static final AtomicBoolean FrostHunterFlowMaxDragonHero5809 = new AtomicBoolean(false);

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        FrostHunterCardViewHyperionAurora3829.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(providerInfo, "FirebaseInitProvider ProviderInfo cannot be null.");
        if ("com.google.firebase.firebaseinitprovider".equals(providerInfo.authority)) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
        } else {
            super.attachInfo(context, providerInfo);
        }
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        try {
            AtomicBoolean atomicBoolean = FrostHunterFlowMaxDragonHero5809;
            atomicBoolean.set(true);
            Context context = getContext();
            synchronized (FrostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterAlertDialogAuroraDelta3200) {
                try {
                    if (FrostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterKeyframeGammaGamma1197.containsKey("[DEFAULT]")) {
                        FrostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterConstraintSetCloneMasterUltraRogue2633();
                    } else {
                        FrostHunterFlowDragonHyperionPixel5649 FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterFlowDragonHyperionPixel5649.FrostHunterAlphaAnimationNeoCosmos5761(context);
                        if (FrostHunterAlphaAnimationNeoCosmos5761 != null) {
                            FrostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterLifecycleBlazeGammaElite2889(context, FrostHunterAlphaAnimationNeoCosmos5761);
                        }
                    }
                } finally {
                }
            }
            atomicBoolean.set(false);
            return false;
        } catch (Throwable th) {
            FrostHunterFlowMaxDragonHero5809.set(false);
            throw th;
        }
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
