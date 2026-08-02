package ru.CryptoPro.JCSP.MSCAPI;

import defpackage.qv10;
import java.io.File;
import ru.cprocsp.ACSP.tools.common.CSPConstants;

/* loaded from: classes4.dex */
public class CAPIIntegrity implements CSPConstants {
    public static native int cryptAcquireContext(long[] jArr, String str, String str2, int i, int i2);

    public static native int cryptCreateHash(long j, int i, long j2, int i2, long[] jArr);

    public static native int cryptDestroyHash(long j);

    public static native int cryptGetHashParam(long j, int i, byte[] bArr, int[] iArr, int i2);

    public static native int cryptHashData(long j, byte[] bArr, int i, int i2, int i3);

    public static native int cryptReleaseContext(long j, int i);

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
