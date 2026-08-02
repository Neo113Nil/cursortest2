package com.fillr.browsersdk.utilities;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.stripe.android.hcaptcha.analytics.CaptchaAnalyticsEvent;
import java.security.MessageDigest;
import java.util.IllegalFormatException;
import java.util.Locale;
import kotlin.text.Charsets;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* loaded from: classes4.dex */
public final class Obfuscator implements CaptchaAnalyticsEvent {
    public String salt;

    public Obfuscator(String str, int i) {
        switch (i) {
            case 1:
                this.salt = Recorder$$ExternalSyntheticOutline2.m(Process.myUid(), Process.myPid(), "UID: [", "]  PID: [", "] ").concat(str);
                break;
            case 2:
            default:
                MessageDigest messageDigest = MessageDigest.getInstance(McElieceCCA2KeyGenParameterSpec.SHA1);
                byte[] bytes = str.getBytes(Charsets.UTF_8);
                bytes.getClass();
                byte[] digest = messageDigest.digest(bytes);
                StringBuilder sb = new StringBuilder(digest.length * 2);
                for (byte b : digest) {
                    sb.append("0123456789ABCDEF".charAt((b >> 4) & 15));
                    sb.append("0123456789ABCDEF".charAt(b & 15));
                }
                this.salt = sb.toString();
                break;
            case 3:
                this.salt = str;
                break;
            case 4:
                str.getClass();
                this.salt = str;
                break;
        }
    }

    public static String zzf(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e);
                str2 = Boxes$$ExternalSyntheticOutline1.m(str2, " [", TextUtils.join(", ", objArr), "]");
            }
        }
        return Recorder$$ExternalSyntheticOutline2.m(str, " : ", str2);
    }

    public static String zzf$1(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e);
                str2 = Boxes$$ExternalSyntheticOutline1.m(str2, " [", TextUtils.join(", ", objArr), "]");
            }
        }
        return Recorder$$ExternalSyntheticOutline2.m(str, " : ", str2);
    }

    public String deobfuscateString(int[] iArr) {
        StringBuilder sb = new StringBuilder();
        int length = iArr.length - 1;
        int i = 0;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                sb.append((char) iArr[i2]);
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        char[] charArray = sb.toString().toCharArray();
        charArray.getClass();
        char[] charArray2 = this.salt.toCharArray();
        charArray2.getClass();
        int length2 = charArray.length - 1;
        if (length2 >= 0) {
            while (true) {
                charArray[i] = (char) (charArray[i] ^ charArray2[i % charArray2.length]);
                if (i == length2) {
                    break;
                }
                i++;
            }
        }
        return new String(charArray);
    }

    @Override // com.stripe.android.core.networking.AnalyticsEvent
    public String getEventName() {
        return "elements.captcha.passive.execute";
    }

    @Override // com.stripe.android.hcaptcha.analytics.CaptchaAnalyticsEvent
    public String getSiteKey() {
        return this.salt;
    }

    public void zzd(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", zzf(this.salt, str, objArr));
        }
    }
}
