package defpackage;

import android.security.keystore.KeyGenParameterSpec;

/* loaded from: classes.dex */
public abstract class ich {
    public static final KeyGenParameterSpec a = new KeyGenParameterSpec.Builder("_androidx_security_master_key_", 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256).build();
}
