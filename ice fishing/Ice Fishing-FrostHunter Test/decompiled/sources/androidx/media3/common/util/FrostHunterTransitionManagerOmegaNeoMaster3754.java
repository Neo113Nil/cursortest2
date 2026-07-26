package androidx.media3.common.util;

import android.content.Context;
import android.content.Context.FrostHunterKeyEventEliteCelestialDelta8868;
import android.content.Context.FrostHunterPlaceholderPhantomCelestialShadow7837;
import android.content.Context.FrostHunterRemoteModelManagerCyberLegend2797;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final /* synthetic */ class FrostHunterTransitionManagerOmegaNeoMaster3754 implements Runnable {
    public final /* synthetic */ Object FrostHunterAlertDialogAuroraDelta3200;
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;
    public final /* synthetic */ Context FrostHunterFlowMaxDragonHero5809;

    public /* synthetic */ FrostHunterTransitionManagerOmegaNeoMaster3754(int i, Context context, Object obj) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterAlertDialogAuroraDelta3200 = obj;
        this.FrostHunterFlowMaxDragonHero5809 = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        Context context = this.FrostHunterFlowMaxDragonHero5809;
        Object obj = this.FrostHunterAlertDialogAuroraDelta3200;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                context.registerReceiver(new NetworkTypeObserver$Receiver((FrostHunterKeyEventEliteCelestialDelta8868) obj), intentFilter);
                break;
            default:
                FrostHunterKeyEventEliteCelestialDelta8868 frostHunterKeyEventEliteCelestialDelta8868 = ((NetworkTypeObserver$Receiver) obj).FrostHunterAlphaAnimationNeoCosmos5761;
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                int i2 = 0;
                if (connectivityManager != null) {
                    try {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            int type = activeNetworkInfo.getType();
                            if (type != 0) {
                                if (type != 1) {
                                    if (type != 4 && type != 5) {
                                        if (type != 6) {
                                            i2 = type != 9 ? 8 : 7;
                                        }
                                        i2 = 5;
                                    }
                                }
                                i2 = 2;
                            }
                            switch (activeNetworkInfo.getSubtype()) {
                                case 1:
                                case 2:
                                    i2 = 3;
                                    break;
                                case 3:
                                case 4:
                                case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
                                case FrostHunterRemoteModelManagerCyberLegend2797.STRING_SET_FIELD_NUMBER /* 6 */:
                                case FrostHunterRemoteModelManagerCyberLegend2797.DOUBLE_FIELD_NUMBER /* 7 */:
                                case FrostHunterRemoteModelManagerCyberLegend2797.BYTES_FIELD_NUMBER /* 8 */:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 14:
                                case 15:
                                case 17:
                                    i2 = 4;
                                    break;
                                case 13:
                                    i2 = 5;
                                    break;
                                case 16:
                                case 19:
                                default:
                                    i2 = 6;
                                    break;
                                case 18:
                                    i2 = 2;
                                    break;
                                case 20:
                                    if (Build.VERSION.SDK_INT >= 29) {
                                        i2 = 9;
                                        break;
                                    }
                                    break;
                            }
                        } else {
                            i2 = 1;
                        }
                    } catch (SecurityException unused) {
                    }
                }
                if (Build.VERSION.SDK_INT < 31 || i2 != 5) {
                    frostHunterKeyEventEliteCelestialDelta8868.FrostHunterBundlePulseFusionHero2475(i2);
                    break;
                } else {
                    try {
                        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                        telephonyManager.getClass();
                        FrostHunterPlaceholderPhantomCelestialShadow7837 frostHunterPlaceholderPhantomCelestialShadow7837 = new FrostHunterPlaceholderPhantomCelestialShadow7837(frostHunterKeyEventEliteCelestialDelta8868);
                        telephonyManager.registerTelephonyCallback(frostHunterKeyEventEliteCelestialDelta8868.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterPlaceholderPhantomCelestialShadow7837);
                        telephonyManager.unregisterTelephonyCallback(frostHunterPlaceholderPhantomCelestialShadow7837);
                        break;
                    } catch (RuntimeException unused2) {
                        frostHunterKeyEventEliteCelestialDelta8868.FrostHunterBundlePulseFusionHero2475(5);
                        return;
                    }
                }
                break;
        }
    }
}
