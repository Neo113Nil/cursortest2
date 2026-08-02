package io.appmetrica.analytics.coreutils.internal.network;

import android.os.Build;
import defpackage.b64;
import defpackage.cvu0;
import defpackage.oyr;
import io.appmetrica.analytics.coreutils.internal.StringExtensions;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.HexString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0007¨\u0006\u0007"}, d2 = {"Lio/appmetrica/analytics/coreutils/internal/network/UserAgent;", "", "", "sdkName", "versionName", "buildNumber", "getFor", "core-utils_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class UserAgent {
    public static final UserAgent INSTANCE = new UserAgent();

    private UserAgent() {
    }

    public static final String getFor(String sdkName, String versionName, String buildNumber) {
        StringBuilder sb = new StringBuilder();
        sb.append(sdkName);
        sb.append('/');
        sb.append(versionName);
        sb.append('.');
        sb.append(buildNumber);
        sb.append(Extension.O_BRAKE_SPACE);
        INSTANCE.getClass();
        StringExtensions stringExtensions = StringExtensions.INSTANCE;
        String str = Build.MODEL;
        String str2 = Build.MANUFACTURER;
        if (!cvu0.x(str, str2, false)) {
            str = oyr.f(HexString.CHAR_SPACE, str2, str);
        }
        sb.append(stringExtensions.replaceFirstCharWithTitleCase(str));
        sb.append("; Android ");
        return b64.p(sb, Build.VERSION.RELEASE, ')');
    }
}
