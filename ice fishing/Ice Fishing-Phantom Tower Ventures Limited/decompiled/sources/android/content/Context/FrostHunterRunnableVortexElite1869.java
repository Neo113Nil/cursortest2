package android.content.Context;

import android.content.SharedPreferences;
import android.util.Base64;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterRunnableVortexElite1869 {
    public static final String[] FrostHunterBundlePulseFusionHero2475 = {"*", "FCM", "GCM", ""};
    public final SharedPreferences FrostHunterAlphaAnimationNeoCosmos5761;
    public final String FrostHunterConstraintSetCloneMasterUltraRogue2633;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0045, code lost:
    
        if (r1.isEmpty() != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FrostHunterRunnableVortexElite1869(com.google.firebase.FrostHunterTransitionManagerOmegaNeoMaster3754 frostHunterTransitionManagerOmegaNeoMaster3754) {
        frostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterAlphaAnimationNeoCosmos5761();
        this.FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterAlphaAnimationNeoCosmos5761.getSharedPreferences("com.google.android.gms.appid", 0);
        frostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterAlphaAnimationNeoCosmos5761();
        FrostHunterFlowDragonHyperionPixel5649 frostHunterFlowDragonHyperionPixel5649 = frostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterBundlePulseFusionHero2475;
        String str = frostHunterFlowDragonHyperionPixel5649.FrostHunterLifecycleBlazeGammaElite2889;
        if (str == null) {
            frostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterAlphaAnimationNeoCosmos5761();
            str = frostHunterFlowDragonHyperionPixel5649.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            if (str.startsWith("1:") || str.startsWith("2:")) {
                String[] split = str.split(":");
                if (split.length == 4) {
                    str = split[1];
                }
                str = null;
            }
        }
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = str;
    }

    public final String FrostHunterAlphaAnimationNeoCosmos5761() {
        PublicKey publicKey;
        synchronized (this.FrostHunterAlphaAnimationNeoCosmos5761) {
            String str = null;
            String string = this.FrostHunterAlphaAnimationNeoCosmos5761.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            try {
                publicKey = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(string, 8)));
            } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
                e.toString();
                publicKey = null;
            }
            if (publicKey == null) {
                return null;
            }
            try {
                byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
                digest[0] = (byte) (((digest[0] & 15) + 112) & 255);
                str = Base64.encodeToString(digest, 0, 8, 11);
            } catch (NoSuchAlgorithmException unused) {
            }
            return str;
        }
    }
}
