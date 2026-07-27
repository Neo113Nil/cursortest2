package androidx.versionedparcelable;

import android.content.SharedPreferences;
import android.util.Base64;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class DragonRouteVariableSingletonYCiXZSlSzF26YWeqTf58275413587173 {
    public static final String[] ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = {"*", "FCM", "GCM", ""};
    public final String AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
    public final SharedPreferences ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0045, code lost:
    
        if (r1.isEmpty() != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DragonRouteVariableSingletonYCiXZSlSzF26YWeqTf58275413587173(com.google.firebase.ObsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015 obsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015) {
        obsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = obsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.getSharedPreferences("com.google.android.gms.appid", 0);
        obsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
        KryptonFlowSerializationSubroutineBvLwcDo2d5nI8HS9yk46953537092389 kryptonFlowSerializationSubroutineBvLwcDo2d5nI8HS9yk46953537092389 = obsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
        String str = kryptonFlowSerializationSubroutineBvLwcDo2d5nI8HS9yk46953537092389.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        if (str == null) {
            obsidianEngineConcurrencyDispatcherRF9TTT2i8X3iod9rec98500235388015.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
            str = kryptonFlowSerializationSubroutineBvLwcDo2d5nI8HS9yk46953537092389.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
            if (str.startsWith("1:") || str.startsWith("2:")) {
                String[] split = str.split(":");
                if (split.length == 4) {
                    str = split[1];
                }
                str = null;
            }
        }
        this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = str;
    }

    public final String ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800() {
        PublicKey publicKey;
        synchronized (this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800) {
            String str = null;
            String string = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.getString("|S||P|", null);
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
