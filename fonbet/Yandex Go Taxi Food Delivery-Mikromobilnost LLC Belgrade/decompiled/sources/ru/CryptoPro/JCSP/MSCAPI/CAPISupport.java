package ru.CryptoPro.JCSP.MSCAPI;

import defpackage.qv10;
import java.io.File;
import ru.cprocsp.ACSP.tools.common.CSPConstants;

/* loaded from: classes4.dex */
public class CAPISupport implements CSPConstants {
    public static void load(String str, boolean z) {
        if (!z) {
            System.loadLibrary(CSPConstants.CSP_JNI_LIB);
            return;
        }
        StringBuilder t = qv10.t(str);
        t.append(File.separator);
        t.append(CSPConstants.CSP_JNI_FILE);
        System.load(t.toString());
    }

    public static native int supportRegistryGetBool(String str, boolean[] zArr);

    public static native int supportRegistryGetLong(String str, long[] jArr);

    public static native int supportRegistryGetLongLong(String str, long[] jArr);

    public static native int supportRegistryGetString(String str, String[] strArr);

    public static native int supportRegistryPutBool(String str, boolean z);

    public static native int supportRegistryPutLong(String str, long j);

    public static native int supportRegistryPutLongLong(String str, long j);

    public static native int supportRegistryPutString(String str, String str2);
}
