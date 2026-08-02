package app.cash.trifle;

import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import com.squareup.cash.clientroutes.ClientRoute;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.spec.ECGenParameterSpec;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;

/* loaded from: classes3.dex */
public final class KeyHandle {
    public static final KeyStore KEY_STORE;
    public final Lazy keyPair$delegate;
    public final String tag;

    public abstract class Companion {
        public static void deleteTag$trifle_release(String str) {
            str.getClass();
            KeyStore keyStore = KeyHandle.KEY_STORE;
            if (keyStore.containsAlias(str)) {
                keyStore.deleteEntry(str);
            }
        }

        public static List getDeepLinkSpecs() {
            return ClientRoute.ViewEditProfile.deepLinkSpecs;
        }
    }

    static {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        KEY_STORE = keyStore;
    }

    public KeyHandle(String str) {
        this.tag = str;
        int i = 0;
        if (!KEY_STORE.containsAlias(str)) {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC", "AndroidKeyStore");
            keyPairGenerator.getClass();
            KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder(str, 12);
            builder.setAlgorithmParameterSpec(new ECGenParameterSpec("secp256r1"));
            builder.setUserAuthenticationRequired(false);
            builder.setDigests("SHA-256", "SHA-512");
            KeyGenParameterSpec build = builder.build();
            build.getClass();
            keyPairGenerator.initialize(build);
            keyPairGenerator.generateKeyPair();
            Log.i("TRIFLE", "Created KeyHandle with tag ".concat(str));
        }
        this.keyPair$delegate = LazyKt.lazy(new KeyHandle$keyPair$2(this, i));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof KeyHandle) && this.tag.equals(((KeyHandle) obj).tag);
    }

    public final KeyPair getKeyPair$trifle_release() {
        return (KeyPair) this.keyPair$delegate.getValue();
    }

    public final String getTag() {
        return this.tag;
    }

    public final int hashCode() {
        return this.tag.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("KeyHandle(tag=", this.tag, ")");
    }
}
