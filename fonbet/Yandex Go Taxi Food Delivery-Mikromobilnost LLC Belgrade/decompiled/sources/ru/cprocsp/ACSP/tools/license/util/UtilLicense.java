package ru.cprocsp.ACSP.tools.license.util;

import android.content.Context;
import defpackage.izh0;
import ru.CryptoPro.JCSP.CSPConfigBase;
import ru.cprocsp.ACSP.tools.common.IResult;
import ru.cprocsp.ACSP.tools.common.Result;
import ru.cprocsp.ACSP.tools.license.ACSPLicense;

/* loaded from: classes4.dex */
public class UtilLicense {
    public static IResult save(Context context, String str) throws Exception {
        int checkAndSave = ((ACSPLicense) CSPConfigBase.getCSPProviderInfo().getLicense()).checkAndSave(str, true);
        return new Result(checkAndSave, String.format(checkAndSave == 0 ? context.getString(izh0.LicenseSerialInstalled) : context.getString(izh0.LicenseInvalidSerial), str));
    }
}
