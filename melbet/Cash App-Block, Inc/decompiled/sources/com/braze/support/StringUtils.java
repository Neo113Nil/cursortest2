package com.braze.support;

import android.content.Context;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.j1$$ExternalSyntheticLambda7;
import com.braze.enums.DataStoreKey;
import com.braze.storage.r;
import com.braze.support.BrazeLogger;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u00002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\u001a\u0017\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a)\u0010\t\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0011\u0010\f\u001a\u00020\u000b*\u00020\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0019\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0011\u0010\u0012\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a'\u0010\u0017\u001a\u00020\u0015*\u0004\u0018\u00010\u00002\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u0017\u0010\u0018\u001a#\u0010\u001a\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\"\u0014\u0010\u001c\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"", "reference", "", "isNullOrBlank", "(Ljava/lang/String;)Z", "Landroid/content/Context;", "context", "userId", "apiKey", "getCacheFileSuffix", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "getByteSize", "(Ljava/lang/String;)J", "", "desiredByteLength", "truncateToByteLength", "(Ljava/lang/String;I)Ljava/lang/String;", "getMd5Hash", "(Ljava/lang/String;)Ljava/lang/String;", "Lkotlin/Function1;", "", "block", "ifNonEmpty", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "userIdHash", "getSuffixFromUserIdHashAndApiKey", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "TAG", "Ljava/lang/String;", "android-sdk-base_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class StringUtils {
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("StringUtils");

    public static final long getByteSize(String str) {
        str.getClass();
        str.getBytes(Charsets.UTF_8).getClass();
        return r2.length;
    }

    public static final String getCacheFileSuffix(Context context, String str, String str2) {
        context.getClass();
        String str3 = str == null ? "null" : str;
        if (str3.equals("null")) {
            return getSuffixFromUserIdHashAndApiKey("37a6259cc0c1dae299a7866489dff0bd", str2);
        }
        r rVar = new r(context);
        DataStoreKey dataStoreKey = DataStoreKey.SUFFIX_CACHE_USER_ID_KEY;
        String readString = rVar.readString(dataStoreKey, null);
        if (readString != null && readString.equals(str3)) {
            String readString2 = rVar.readString(DataStoreKey.SUFFIX_CACHE_USER_ID_HASH, null);
            if (readString2 != null && readString2.length() != 0) {
                return getSuffixFromUserIdHashAndApiKey(readString2, str2);
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new b$$ExternalSyntheticLambda0(18), 14, (Object) null);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new j1$$ExternalSyntheticLambda7(str3, str2, 28), 12, (Object) null);
        String md5Hash = getMd5Hash(str3);
        rVar.writeData(dataStoreKey, str3);
        rVar.writeData(DataStoreKey.SUFFIX_CACHE_USER_ID_HASH, md5Hash);
        return getSuffixFromUserIdHashAndApiKey(md5Hash, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getCacheFileSuffix$lambda$0() {
        return "The saved user id hash was null or empty.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getCacheFileSuffix$lambda$1(String str, String str2) {
        return CameraSelector$$ExternalSyntheticOutline0.m("Generating MD5 for user id: ", str, " apiKey: ", str2);
    }

    public static final String getMd5Hash(String str) {
        str.getClass();
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        bytes.getClass();
        return String.format(Locale.US, "%032x", Arrays.copyOf(new Object[]{new BigInteger(1, messageDigest.digest(bytes))}, 1));
    }

    private static final String getSuffixFromUserIdHashAndApiKey(String str, String str2) {
        return (str2 == null || StringsKt.isBlank(str2)) ? Recorder$$ExternalSyntheticOutline2.m(".", str) : CameraSelector$$ExternalSyntheticOutline0.m(".", str, ".", str2);
    }

    public static final void ifNonEmpty(String str, Function1<? super String, Unit> function1) {
        function1.getClass();
        if (str == null || str.length() == 0) {
            return;
        }
        function1.invoke(str);
    }

    public static final boolean isNullOrBlank(String str) {
        return str == null || StringsKt.isBlank(str);
    }

    public static final String truncateToByteLength(String str, int i) {
        str.getClass();
        if (getByteSize(str) <= i) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char[] charArray = str.toCharArray();
        charArray.getClass();
        int i2 = 0;
        for (char c : charArray) {
            i2 += (int) getByteSize(String.valueOf(c));
            if (i2 > i) {
                break;
            }
            sb.append(c);
        }
        return sb.toString();
    }
}
