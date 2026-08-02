package com.knotapi.knot.utilities;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import java.security.SecureRandom;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes9.dex */
public class EncryptionHelper {
    private static final String APP_INSTANCE_ID_KEY = "app_instance_id";
    private static final int GCM_IV_LENGTH = 12;
    private static final int GCM_TAG_LENGTH = 16;
    private static final String KEY_DERIVATION_ALGORITHM = "PBKDF2WithHmacSHA256";
    private static final int KEY_LENGTH = 256;
    private static final int PBKDF2_ITERATIONS = 10000;
    private static final String SALT_PREF_KEY = "encryption_salt";
    private static final String TAG = "EncryptionHelper";
    private static final String TRANSFORMATION = "AES/GCM/NoPadding";

    public static String decrypt(Context context, String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        try {
            SecretKey deriveKey = deriveKey(context);
            if (deriveKey == null) {
                return null;
            }
            byte[] decode = Base64.decode(str, 0);
            byte[] bArr = new byte[12];
            int length = decode.length - 12;
            byte[] bArr2 = new byte[length];
            System.arraycopy(decode, 0, bArr, 0, 12);
            System.arraycopy(decode, 12, bArr2, 0, length);
            Cipher cipher = Cipher.getInstance(TRANSFORMATION);
            cipher.init(2, deriveKey, new GCMParameterSpec(128, bArr));
            return new String(cipher.doFinal(bArr2));
        } catch (Exception unused) {
            return null;
        }
    }

    private static SecretKey deriveKey(Context context) {
        byte[] orCreateSalt;
        try {
            String devicePassword = getDevicePassword(context);
            if (devicePassword == null || (orCreateSalt = getOrCreateSalt(context)) == null) {
                return null;
            }
            return new SecretKeySpec(SecretKeyFactory.getInstance(KEY_DERIVATION_ALGORITHM).generateSecret(new PBEKeySpec(devicePassword.toCharArray(), orCreateSalt, 10000, 256)).getEncoded(), "AES");
        } catch (Exception unused) {
            return null;
        }
    }

    public static String encrypt(Context context, String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        try {
            SecretKey deriveKey = deriveKey(context);
            if (deriveKey == null) {
                return null;
            }
            byte[] bArr = new byte[12];
            new SecureRandom().nextBytes(bArr);
            Cipher cipher = Cipher.getInstance(TRANSFORMATION);
            cipher.init(1, deriveKey, new GCMParameterSpec(128, bArr));
            byte[] doFinal = cipher.doFinal(str.getBytes());
            byte[] bArr2 = new byte[doFinal.length + 12];
            System.arraycopy(bArr, 0, bArr2, 0, 12);
            System.arraycopy(doFinal, 0, bArr2, 12, doFinal.length);
            return Base64.encodeToString(bArr2, 0);
        } catch (Exception unused) {
            return null;
        }
    }

    private static String getDevicePassword(Context context) {
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("encryption_prefs", 0);
            String string2 = sharedPreferences.getString(APP_INSTANCE_ID_KEY, null);
            if (string2 == null) {
                string2 = UUID.randomUUID().toString();
                sharedPreferences.edit().putString(APP_INSTANCE_ID_KEY, string2).apply();
            }
            return "knotapi_encryption_key_" + string2;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String getEncryptedString(Context context, String str, String str2, String str3) {
        String decrypt;
        String string2 = context.getSharedPreferences(str, 0).getString(str2, null);
        return (string2 == null || (decrypt = decrypt(context, string2)) == null) ? str3 : decrypt;
    }

    private static byte[] getOrCreateSalt(Context context) {
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("encryption_prefs", 0);
            String string2 = sharedPreferences.getString(SALT_PREF_KEY, null);
            if (string2 != null) {
                return Base64.decode(string2, 0);
            }
            byte[] bArr = new byte[16];
            new SecureRandom().nextBytes(bArr);
            sharedPreferences.edit().putString(SALT_PREF_KEY, Base64.encodeToString(bArr, 0)).apply();
            return bArr;
        } catch (Exception unused) {
            return null;
        }
    }

    public static void putEncryptedString(Context context, String str, String str2, String str3) {
        String encrypt = encrypt(context, str3);
        if (encrypt != null) {
            context.getSharedPreferences(str, 0).edit().putString(str2, encrypt).apply();
        }
    }
}
