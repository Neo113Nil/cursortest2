package com.fillr.embedded.profile;

import android.content.SharedPreferences;
import android.util.Base64;
import com.fillr.core.utilities.AppPreferenceStore;
import com.miteksystems.misnap.core.DateUtil;
import dev.chrisbanes.haze.Pool;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.idrnd.misnap.iad.Payload;
import net.oneformapp.ProfileStore_;
import net.oneformapp.encryptionlib.AES256JNCryptor;
import net.oneformapp.encryptionlib.AES256v2Ciphertext;
import net.oneformapp.encryptionlib.CryptorException;
import org.androidannotations.api.sharedpreferences.SharedPreferencesCompat;

/* loaded from: classes4.dex */
public final class UserGeneratedProfile {
    public static final Object mutex = new Object();
    public Pool authStore;
    public AppPreferenceStore preferenceStore;
    public ProfileStore_ profileStore;

    public final void setUpProfile() {
        ProfileStore_ profileStore_ = this.profileStore;
        AppPreferenceStore appPreferenceStore = this.preferenceStore;
        if (PinGenerator.generator == null) {
            PinGenerator.generator = new PinGenerator();
        }
        PinGenerator pinGenerator = PinGenerator.generator;
        String[] strArr = new String[4];
        for (int i = 0; i < 4; i++) {
            strArr[i] = String.valueOf(pinGenerator.random.nextInt(10));
        }
        pinGenerator.getClass();
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < 4; i2++) {
            sb.append(strArr[i2]);
        }
        String sb2 = sb.toString();
        profileStore_.passcode = sb2;
        SharedPreferences sharedPreferences = appPreferenceStore.mPreferences;
        SharedPreferences sharedPreferences2 = appPreferenceStore.mPreferences;
        if (sharedPreferences != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putBoolean("F_HAS_PASSCODE", true);
            edit.commit();
        }
        if (sharedPreferences2 != null) {
            SharedPreferences.Editor edit2 = sharedPreferences2.edit();
            edit2.putBoolean("F_HAS_COMPLETED_SIGNUP", true);
            edit2.apply();
        }
        if (sharedPreferences2 != null) {
            SharedPreferences.Editor edit3 = sharedPreferences2.edit();
            edit3.putBoolean("F_CREATED_DEFAULT_PIN", true);
            edit3.commit();
        }
        if (sharedPreferences2 != null) {
            SharedPreferences.Editor edit4 = sharedPreferences2.edit();
            edit4.putBoolean("F_USE_GENERATED_PIN", true);
            edit4.apply();
        }
        profileStore_.store();
        profileStore_.load();
        Pool pool = this.authStore;
        AES256JNCryptor aES256JNCryptor = new AES256JNCryptor();
        byte[] decode = Base64.decode(pool.getEncryptionSalt(), 2);
        byte[] decode2 = Base64.decode(pool.getEncryptionhmac(), 2);
        SecretKeySpec keyForPassword = aES256JNCryptor.keyForPassword(pool.getInstallationID().toCharArray(), decode);
        SecretKeySpec keyForPassword2 = aES256JNCryptor.keyForPassword(pool.getInstallationID().toCharArray(), decode2);
        byte[] bytes = sb2.getBytes();
        DateUtil.notNull(bytes, "Plaintext cannot be null.", new Object[0]);
        byte[] bArr = new byte[16];
        AES256JNCryptor.SECURE_RANDOM.nextBytes(bArr);
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(1, keyForPassword, new IvParameterSpec(bArr));
            AES256v2Ciphertext aES256v2Ciphertext = new AES256v2Ciphertext(bArr, cipher.doFinal(bytes));
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(keyForPassword2);
            byte[] rawData = aES256v2Ciphertext.getRawData();
            int length = rawData.length - 32;
            byte[] bArr2 = new byte[length];
            System.arraycopy(rawData, 0, bArr2, 0, length);
            aES256v2Ciphertext.hmac = mac.doFinal(bArr2);
            byte[] rawData2 = aES256v2Ciphertext.getRawData();
            SharedPreferences sharedPreferences3 = (SharedPreferences) ((Payload) pool.pool).a;
            String encodeToString = Base64.encodeToString(rawData2, 2);
            if (encodeToString == null) {
                encodeToString = "";
            }
            SharedPreferencesCompat.apply(sharedPreferences3.edit().putString("encryptedPin", encodeToString));
        } catch (GeneralSecurityException e) {
            throw new CryptorException("Failed to generate ciphertext.", e);
        }
    }
}
