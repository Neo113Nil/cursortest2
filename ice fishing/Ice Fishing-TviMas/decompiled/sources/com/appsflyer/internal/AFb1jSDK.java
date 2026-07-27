package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.UByte;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class AFb1jSDK {
    public static String getMonetizationNetwork(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes(Charset.defaultCharset()));
            return AFAdRevenueData(messageDigest.digest());
        } catch (Exception e) {
            AFLogger.afErrorLog("Error turning data to SHA-256 string", e);
            return null;
        }
    }

    private static String AFAdRevenueData(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            sb.append(Integer.toString((b & UByte.MAX_VALUE) + 256, 16).substring(1));
        }
        return sb.toString();
    }

    public static long getRevenue(String str) {
        byte[] mediationNetwork = getMediationNetwork(str);
        if (mediationNetwork == null || mediationNetwork.length <= 0) {
            return -1L;
        }
        if (mediationNetwork.length > 8) {
            mediationNetwork = Arrays.copyOfRange(mediationNetwork, 0, 8);
        }
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.put(mediationNetwork);
        allocate.flip();
        return allocate.getLong();
    }

    private static byte[] getMediationNetwork(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes(Charset.defaultCharset()));
            return messageDigest.digest();
        } catch (Exception e) {
            AFLogger.afErrorLog("Error turning string to SHA-256 byte array", e);
            return null;
        }
    }

    public static String getMonetizationNetwork(String str, String str2) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(str2.getBytes(Charset.defaultCharset()), "HmacSHA256"));
            return AFAdRevenueData(mac.doFinal(str.getBytes(Charset.defaultCharset()))).toLowerCase(Locale.getDefault());
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            AFLogger.afErrorLog(e.getMessage(), e, true);
            return e.getMessage();
        }
    }

    public static boolean getMediationNetwork(Map<String, Object> map, String[] strArr, AFd1qSDK aFd1qSDK) throws IllegalStateException {
        if (map == null || map.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (!map.containsKey(str)) {
                return false;
            }
        }
        String str2 = (String) map.remove("sig");
        if (str2 == null) {
            return false;
        }
        return getMonetizationNetwork(new StringBuilder().append(new JSONObject(map)).append(AFd1qSDK.areAllFieldsValid()).toString(), AFb1iSDK.getCurrencyIso4217Code(aFd1qSDK.getMonetizationNetwork, aFd1qSDK.getRevenue)).equals(str2);
    }
}
