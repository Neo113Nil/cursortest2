package android.content.Context;

import android.content.Context;
import android.net.ConnectivityManager;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final /* synthetic */ class FrostHunterColorDrawableOlympianPrimeMaster6523 extends FrostHunterRippleDrawableNeoTitanium8154 implements FrostHunterCombineLegendMegaPrime5473 {
    public static final FrostHunterColorDrawableOlympianPrimeMaster6523 FrostHunterScaleAnimationStrikeSpark5059 = new FrostHunterColorDrawableOlympianPrimeMaster6523(1, FrostHunterVectorDrawableForceMax1351.class, "ConnectivityChecker", "ConnectivityChecker(Landroid/content/Context;)Lcoil3/network/ConnectivityChecker;", 1);

    @Override // android.content.Context.FrostHunterCombineLegendMegaPrime5473
    public final Object FrostHunterAlphaAnimationNeoCosmos5761(Object obj) {
        Context applicationContext = ((Context) obj).getApplicationContext();
        ConnectivityManager connectivityManager = (ConnectivityManager) applicationContext.getSystemService(ConnectivityManager.class);
        if (connectivityManager != null && FrostHunterRemoteConfigPhantomDelta1739.FrostHunterCameraXTurboCelestialHero5430(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            try {
                return new FrostHunterPermissionStormInferno1495(connectivityManager);
            } catch (Exception unused) {
            }
        }
        return FrostHunterGuidelineTitaniumForceAurora8448.FrostHunterAlphaAnimationNeoCosmos5761;
    }
}
