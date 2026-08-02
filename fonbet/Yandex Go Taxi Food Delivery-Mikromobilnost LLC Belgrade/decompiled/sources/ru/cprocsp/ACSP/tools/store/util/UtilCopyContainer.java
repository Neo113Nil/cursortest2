package ru.cprocsp.ACSP.tools.store.util;

import android.content.Context;
import defpackage.yzl;
import ru.cprocsp.ACSP.tools.common.CSPTool;

/* loaded from: classes4.dex */
public class UtilCopyContainer {
    public static boolean checkPasswords(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        return str != null && str.equals(str2);
    }

    public static boolean copy(Context context, yzl yzlVar, StringBuilder sb) throws Exception {
        throw null;
    }

    public static String getKeysDirectoryPath(Context context) {
        return new CSPTool(context).getAppInfrastructure().getKeysDirectoryPath();
    }
}
