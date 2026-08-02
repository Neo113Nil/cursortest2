package ru.CryptoPro.JCSP.MSCAPI;

import java.util.ArrayList;
import ru.CryptoPro.JCSP.SSPILogger;

/* loaded from: classes4.dex */
public class Sspi {
    public static final int SEC_E_CONTEXT_EXPIRED = -2146893033;
    public static final int SEC_E_FAIL = -1;
    public static final int SEC_E_INCOMPLETE_MESSAGE = -2146893032;
    public static final int SEC_E_INSUFFICIENT_MEMORY = -2146893056;
    public static final int SEC_E_INVALID_HANDLE = -2146893055;
    public static final int SEC_E_INVALID_TOKEN = -2146893048;
    public static final int SEC_E_NO_CREDENTIALS = -2146893042;
    public static final int SEC_E_OK = 0;
    public static final int SEC_E_UNKNOWN_CREDENTIALS = -2146893043;
    public static final int SEC_I_CONTEXT_EXPIRED = 590615;
    public static final int SEC_I_CONTINUE_NEEDED = 590610;
    public static final int SEC_I_INCOMPLETE_CREDENTIALS = 590624;
    public static final int SEC_I_RENEGOTIATE = 590625;

    public static int acceptSecurityContext(long[] jArr, long[] jArr2, boolean z, boolean z2, byte[] bArr, int[] iArr, byte[] bArr2, int[] iArr2) {
        SSPILogger.log("acceptSecurityContext", new Object[]{jArr, Boolean.valueOf(z), Boolean.valueOf(z2), bArr, iArr}, 0L, new String[0]);
        if (z2 && (!isValidHandle(jArr) || isNullHandle(jArr) || !isValidHandle(jArr2) || isNullHandle(jArr2))) {
            SSPILogger.log("initializeSecurityContext", "context is already closed");
            iArr2[0] = 0;
            return 0;
        }
        int acceptSecurityContext = CAPI.acceptSecurityContext(jArr, jArr2, z, z2, bArr, iArr, bArr2, iArr2);
        if (acceptSecurityContext != 0) {
            SSPILogger.error("acceptSecurityContext", new Object[]{jArr, jArr2, Boolean.valueOf(z), Boolean.valueOf(z2), bArr, iArr}, acceptSecurityContext, new String[0]);
        }
        return acceptSecurityContext;
    }

    public static int acquireCredentialsHandle(long[] jArr, boolean z, int i, int[] iArr, ArrayList arrayList, long j, int i2, boolean z2, ArrayList arrayList2) throws MSException {
        SSPILogger.log("acquireCredentialsHandle", new Object[]{jArr, Boolean.valueOf(z), Integer.valueOf(i), iArr, Integer.valueOf(iArr.length), Integer.valueOf(arrayList != null ? arrayList.size() : 0), Long.valueOf(j), Integer.valueOf(i2), Boolean.valueOf(z2), Integer.valueOf(arrayList2 != null ? arrayList2.size() : 0)}, 0L, new String[0]);
        int acquireCredentialsHandle = CAPI.acquireCredentialsHandle(z, i, iArr, iArr.length, arrayList, j, i2, jArr, z2, arrayList2);
        if (acquireCredentialsHandle != 0) {
            SSPILogger.error("acquireCredentialsHandle", new Object[]{jArr, Boolean.valueOf(z), Integer.valueOf(i), iArr, Integer.valueOf(iArr.length), Integer.valueOf(arrayList != null ? arrayList.size() : 0), Long.valueOf(j), Integer.valueOf(i2), Boolean.valueOf(z2), Integer.valueOf(arrayList2 != null ? arrayList2.size() : 0)}, acquireCredentialsHandle, new String[0]);
            MSException.procCode(acquireCredentialsHandle);
        }
        return acquireCredentialsHandle;
    }

    public static int decryptMessage(long[] jArr, byte[] bArr, int[] iArr, byte[] bArr2, int[] iArr2) {
        SSPILogger.log("decryptMessage", new Object[]{jArr, bArr, iArr}, 0L, new String[0]);
        int decryptMessage = (!isValidHandle(jArr) || isNullHandle(jArr)) ? -1 : CAPI.decryptMessage(jArr, bArr, iArr, bArr2, iArr2);
        if (decryptMessage != 0) {
            SSPILogger.error("decryptMessage", new Object[]{jArr, bArr, iArr}, decryptMessage, new String[0]);
        }
        return decryptMessage;
    }

    public static void deleteSecurityContext(long[] jArr) throws MSException {
        if (!isValidHandle(jArr) || isNullHandle(jArr)) {
            return;
        }
        SSPILogger.log("deleteSecurityContext", new Object[]{jArr}, 0L, new String[0]);
        int deleteSecurityContext = CAPI.deleteSecurityContext(jArr);
        if (deleteSecurityContext != 0) {
            SSPILogger.error("deleteSecurityContext", new Object[]{jArr}, deleteSecurityContext, new String[0]);
            if (CAPI.STRICT_DESTROY_CHECK) {
                MSException.procCode(deleteSecurityContext);
            }
        }
    }

    public static int encryptMessage(long[] jArr, byte[] bArr, int[] iArr, int[] iArr2, byte[] bArr2, int[] iArr3) {
        SSPILogger.log("encryptMessage", new Object[]{jArr, bArr, iArr, iArr2}, 0L, new String[0]);
        int encryptMessage = (!isValidHandle(jArr) || isNullHandle(jArr)) ? -1 : CAPI.encryptMessage(jArr, bArr, iArr, iArr2, bArr2, iArr3);
        if (encryptMessage != 0) {
            SSPILogger.error("encryptMessage", new Object[]{jArr, bArr, iArr, iArr2}, encryptMessage, new String[0]);
        }
        return encryptMessage;
    }

    public static void freeCredentialsHandle(long[] jArr) throws MSException {
        if (!isValidHandle(jArr) || isNullHandle(jArr)) {
            return;
        }
        SSPILogger.log("freeCredentialsHandle", new Object[]{jArr}, 0L, new String[0]);
        int freeCredentialsHandle = CAPI.freeCredentialsHandle(jArr);
        if (freeCredentialsHandle != 0) {
            SSPILogger.error("freeCredentialsHandle", new Object[]{jArr}, freeCredentialsHandle, new String[0]);
            if (CAPI.STRICT_DESTROY_CHECK) {
                MSException.procCode(freeCredentialsHandle);
            }
        }
    }

    public static void getCipherInfo(long[] jArr, int[] iArr, int[] iArr2) throws MSException {
        SSPILogger.log("getCipherInfo", new Object[]{jArr, iArr, iArr2}, 0L, new String[0]);
        int cipherInfo = (!isValidHandle(jArr) || isNullHandle(jArr)) ? -1 : CAPI.getCipherInfo(jArr, iArr, iArr2);
        if (cipherInfo != 0) {
            SSPILogger.error("getCipherInfo", new Object[]{jArr, iArr, iArr2}, cipherInfo, new String[0]);
            MSException.procCode(cipherInfo);
        }
    }

    public static void getIssuers(long[] jArr, ArrayList arrayList) throws MSException {
        SSPILogger.log("getIssuers", new Object[]{jArr}, 0L, new String[0]);
        int issuers = (!isValidHandle(jArr) || isNullHandle(jArr)) ? -1 : CAPI.getIssuers(jArr, arrayList);
        if (issuers != 0) {
            SSPILogger.error("getIssuers", new Object[]{jArr}, issuers, new String[0]);
            MSException.procCode(issuers);
        }
    }

    public static void getRemoteCertificates(long[] jArr, ArrayList arrayList) throws MSException {
        SSPILogger.log("getRemoteCertificates", new Object[]{jArr}, 0L, new String[0]);
        int remoteCertificates = (!isValidHandle(jArr) || isNullHandle(jArr)) ? -1 : CAPI.getRemoteCertificates(jArr, arrayList);
        if (remoteCertificates != 0) {
            SSPILogger.error("getRemoteCertificates", new Object[]{jArr}, remoteCertificates, new String[0]);
            MSException.procCode(remoteCertificates);
        }
    }

    public static void getSessionInfo(long[] jArr, int[] iArr, byte[] bArr, int[] iArr2) throws MSException {
        SSPILogger.log("getSessionInfo", new Object[]{jArr, iArr}, 0L, new String[0]);
        int sessionInfo = (!isValidHandle(jArr) || isNullHandle(jArr)) ? -1 : CAPI.getSessionInfo(jArr, iArr, bArr, iArr2);
        if (sessionInfo != 0) {
            SSPILogger.error("getSessionInfo", new Object[]{jArr, iArr}, sessionInfo, new String[0]);
            MSException.procCode(sessionInfo);
        }
    }

    public static int initializeSecurityContext(long[] jArr, long[] jArr2, String str, boolean z, boolean z2, byte[] bArr, int[] iArr, byte[] bArr2, int[] iArr2) {
        SSPILogger.log("initializeSecurityContext", new Object[]{jArr, str, Boolean.valueOf(z), Boolean.valueOf(z2), bArr, iArr}, 0L, new String[0]);
        if (z && (!isValidHandle(jArr) || isNullHandle(jArr) || !isValidHandle(jArr2) || isNullHandle(jArr2))) {
            SSPILogger.log("initializeSecurityContext", "context is already closed");
            iArr2[0] = 0;
            return 0;
        }
        int initializeSecurityContext = CAPI.initializeSecurityContext(jArr, jArr2, str, z, z2, bArr, iArr, bArr2, iArr2);
        if (initializeSecurityContext != 0) {
            SSPILogger.error("initializeSecurityContext", new Object[]{jArr, jArr2, str, Boolean.valueOf(z), Boolean.valueOf(z2), bArr, iArr}, initializeSecurityContext, new String[0]);
        }
        return initializeSecurityContext;
    }

    public static boolean isNullHandle(long[] jArr) {
        return jArr[0] == 0 && jArr[1] == 0;
    }

    public static boolean isValidHandle(long[] jArr) {
        return (jArr[0] == -1 || jArr[1] == -1) ? false : true;
    }

    public static void main(String[] strArr) {
    }

    public static int acquireCredentialsHandle(long[] jArr, boolean z, int i, int[] iArr, boolean z2) throws MSException {
        return acquireCredentialsHandle(jArr, z, i, iArr, null, 0L, 0, z2, null);
    }
}
