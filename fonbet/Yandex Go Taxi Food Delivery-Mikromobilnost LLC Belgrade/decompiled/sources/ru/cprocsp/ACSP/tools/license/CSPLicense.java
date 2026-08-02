package ru.cprocsp.ACSP.tools.license;

import defpackage.qv10;
import java.io.File;
import ru.cprocsp.ACSP.tools.common.CSPConstants;

/* loaded from: classes4.dex */
public class CSPLicense implements CSPConstants {
    public static native int check(boolean z, String str, long[] jArr, int[] iArr, int[] iArr2);

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
}
