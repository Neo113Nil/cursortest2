package com.squareup.cash.biometrics;

import android.content.Context;
import android.content.SharedPreferences;
import android.security.keystore.KeyGenParameterSpec;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.cert.Certificate;
import javax.crypto.Cipher;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.sync.MutexImpl;
import okhttp3.ConnectionPool;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class AndroidSecureStore {
    public final AndroidBiometrics biometrics;
    public final PlatformKt crypto;
    public final MutexImpl dataLock = new MutexImpl();
    public final CoroutineContext ioDispatcher;
    public final ConnectionPool storage;

    public AndroidSecureStore(Context context, ConnectionPool connectionPool, AndroidBiometrics androidBiometrics, CoroutineContext coroutineContext) {
        PlatformKt platformKt;
        this.storage = connectionPool;
        this.biometrics = androidBiometrics;
        this.ioDispatcher = coroutineContext;
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            Cipher.getInstance("RSA/ECB/PKCS1Padding").getClass();
            keyPairGenerator.getClass();
            keyFactory.getClass();
            platformKt = new AndroidSecureStore$Crypto$Ready(keyStore, keyPairGenerator, keyFactory);
        } catch (Exception unused) {
            platformKt = AndroidSecureStore$Crypto$Unavailable.INSTANCE;
        }
        this.crypto = platformKt;
    }

    public static final void access$prepareKeyStore(AndroidSecureStore androidSecureStore, AndroidSecureStore$Crypto$Ready androidSecureStore$Crypto$Ready) {
        try {
            try {
                Key key = androidSecureStore$Crypto$Ready.keyStore.getKey("cash-key", null);
                Certificate certificate = androidSecureStore$Crypto$Ready.keyStore.getCertificate("cash-key");
                if (key != null && certificate != null) {
                    Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                    cipher.getClass();
                    cipher.init(2, key);
                    return;
                }
            } catch (Exception unused) {
                Timber.Forest.d("Key invalidated.", new Object[0]);
            }
            ((SharedPreferences) androidSecureStore.storage.delegate).edit().clear().apply();
            KeyGenParameterSpec build = new KeyGenParameterSpec.Builder("cash-key", 3).setBlockModes("ECB").setEncryptionPaddings("PKCS1Padding").setUserAuthenticationRequired(true).build();
            build.getClass();
            androidSecureStore$Crypto$Ready.keyGenerator.initialize(build);
            androidSecureStore$Crypto$Ready.keyGenerator.generateKeyPair();
        } catch (GeneralSecurityException e) {
            a$$ExternalSyntheticBUOutline0.m((Throwable) e);
        }
    }
}
