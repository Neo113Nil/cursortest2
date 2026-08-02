package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.XmlResourceParser;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParserException;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class guh {
    public final PackageManager a;
    public final LinkedHashMap b;
    public final String c;
    public final LinkedHashMap d;

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(4:2|3|(2:(3:6|(1:8)(2:18|(1:20)(1:21))|(2:10|(2:12|13)(2:15|16))(1:17))(1:23)|14)|24)|25|26|27|(5:33|34|35|36|37)|40|41|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007e, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public guh(Context context) {
        String str;
        PackageInfo packageInfo;
        Signature[] signatureArr;
        String str2;
        PackageManager packageManager = context.getPackageManager();
        packageManager.getClass();
        this.a = packageManager;
        XmlResourceParser xml = context.getResources().getXml(R.xml.android_auto_allowed_callers);
        xml.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str3 = null;
        try {
            for (int next = xml.next(); next != 1; next = xml.next()) {
                if (next == 2) {
                    String name = xml.getName();
                    euh L = Intrinsics.d(name, "signing_certificate") ? a4g.L(xml) : Intrinsics.d(name, "signature") ? a4g.M(xml) : null;
                    if (L != null) {
                        String str4 = L.b;
                        euh euhVar = (euh) linkedHashMap.get(str4);
                        if (euhVar != null) {
                            z75.t(euhVar.c, L.c);
                        } else {
                            linkedHashMap.put(str4, L);
                        }
                    }
                }
            }
        } catch (IOException unused) {
            str = "io exception while parsing android_auto_allowed_callers.xml";
            su4.s(2, null, str, null);
            this.b = linkedHashMap;
            packageInfo = this.a.getPackageInfo(ConstantDeviceInfo.APP_PLATFORM, 4160);
            if (packageInfo != null) {
                byte[] byteArray = signatureArr[0].toByteArray();
                byteArray.getClass();
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
                    messageDigest.getClass();
                    messageDigest.update(byteArray);
                    byte[] digest = messageDigest.digest();
                    digest.getClass();
                    str2 = xz0.I(digest, StringUtils.PROCESS_POSTFIX_DELIMITER, new dth(26));
                } catch (NoSuchAlgorithmException unused2) {
                    str2 = "Fail to find algorithm SHA256";
                }
                str3 = str2;
            }
            this.c = str3;
            this.d = new LinkedHashMap();
        } catch (XmlPullParserException unused3) {
            str = "xml exception while parsing android_auto_allowed_callers.xml";
            su4.s(2, null, str, null);
            this.b = linkedHashMap;
            packageInfo = this.a.getPackageInfo(ConstantDeviceInfo.APP_PLATFORM, 4160);
            if (packageInfo != null) {
            }
            this.c = str3;
            this.d = new LinkedHashMap();
        }
        this.b = linkedHashMap;
        packageInfo = this.a.getPackageInfo(ConstantDeviceInfo.APP_PLATFORM, 4160);
        if (packageInfo != null && (signatureArr = packageInfo.signatures) != null && signatureArr.length == 1) {
            byte[] byteArray2 = signatureArr[0].toByteArray();
            byteArray2.getClass();
            MessageDigest messageDigest2 = MessageDigest.getInstance("SHA256");
            messageDigest2.getClass();
            messageDigest2.update(byteArray2);
            byte[] digest2 = messageDigest2.digest();
            digest2.getClass();
            str2 = xz0.I(digest2, StringUtils.PROCESS_POSTFIX_DELIMITER, new dth(26));
            str3 = str2;
        }
        this.c = str3;
        this.d = new LinkedHashMap();
    }
}
