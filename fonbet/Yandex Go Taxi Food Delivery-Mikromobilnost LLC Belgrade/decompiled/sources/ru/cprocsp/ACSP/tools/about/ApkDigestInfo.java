package ru.cprocsp.ACSP.tools.about;

import android.content.res.Resources;
import ru.CryptoPro.JCSP.CSPConfigBase;
import ru.cprocsp.ACSP.tools.common.Constants;

/* loaded from: classes4.dex */
public class ApkDigestInfo implements Constants {
    public static String getApkDigestInfo(Resources resources, int i, int i2, int i3) {
        String string = resources.getString(i);
        String string2 = resources.getString(i2);
        String string3 = resources.getString(i3);
        String apkDigestItem = CSPConfigBase.getCSPProviderInfo().getIntegrity().getApkDigestItem(string, string2);
        return apkDigestItem == null ? string3 : apkDigestItem;
    }
}
