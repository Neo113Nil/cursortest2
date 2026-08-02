package ru.cprocsp.ACSP.tools.integrity;

import android.util.Log;
import defpackage.b64;
import defpackage.nnm;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import ru.CryptoPro.JCSP.MSCAPI.CAPIIntegrity;
import ru.cprocsp.ACSP.tools.common.HexString;
import ru.cprocsp.ACSP.tools.log.LogConstants;

/* loaded from: classes4.dex */
public class CSPIntegrity implements CSPIntegrityConstants, LogConstants {
    public static int check(int i, byte[] bArr, InputStream inputStream) {
        byte[] computeDigest = computeDigest(inputStream, i);
        if (computeDigest == null) {
            nnm.q(i, "Error occurred during calculating of hash with algorithm ", LogConstants.APP_LOGGER_TAG);
            return 1;
        }
        boolean equals = Arrays.equals(bArr, computeDigest);
        if (!equals) {
            StringBuilder t = b64.t(i, "Digests are NOT equal. Calculated digest with algorithm ", ", digest is ");
            t.append(HexString.toHex(computeDigest));
            Log.e(LogConstants.APP_LOGGER_TAG, t.toString());
        }
        return !equals ? 1 : 0;
    }

    public static int checkDigestOfFileInApk(int i, ZipFile zipFile, ZipEntry zipEntry, byte[] bArr) {
        zipEntry.getName();
        HexString.toHex(bArr);
        int i2 = 1;
        try {
            InputStream inputStream = zipFile.getInputStream(zipEntry);
            try {
                i2 = check(i, bArr, inputStream);
                if (inputStream == null) {
                    return i2;
                }
                inputStream.close();
                return i2;
            } finally {
            }
        } catch (IOException e) {
            Log.e(LogConstants.APP_LOGGER_TAG, e.getMessage(), e);
            return i2;
        }
    }

    public static int checkDigestOfFileOnDisk(int i, String str, byte[] bArr) {
        HexString.toHex(bArr);
        int i2 = 1;
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            try {
                i2 = check(i, bArr, fileInputStream);
                fileInputStream.close();
                return i2;
            } finally {
            }
        } catch (IOException e) {
            Log.e(LogConstants.APP_LOGGER_TAG, e.getMessage(), e);
            return i2;
        }
    }

    public static byte[] computeDigest(InputStream inputStream, int i) {
        long j;
        long j2;
        long j3;
        try {
            try {
                long[] jArr = new long[1];
                int cryptAcquireContext = CAPIIntegrity.cryptAcquireContext(jArr, null, null, 80, -268435456);
                if (cryptAcquireContext != 0) {
                    throw new Exception("CryptAcquireContext failed: " + cryptAcquireContext);
                }
                j = jArr[0];
                try {
                    long[] jArr2 = new long[1];
                    int cryptCreateHash = CAPIIntegrity.cryptCreateHash(j, i, 0L, 0, jArr2);
                    if (cryptCreateHash != 0) {
                        throw new Exception("CryptCreateHash failed: " + cryptCreateHash);
                    }
                    j3 = jArr2[0];
                    try {
                        byte[] bArr = new byte[524288];
                        while (true) {
                            int read = inputStream.read(bArr, 0, 524288);
                            if (read == -1) {
                                int[] iArr = new int[1];
                                int cryptGetHashParam = CAPIIntegrity.cryptGetHashParam(j3, 2, null, iArr, 0);
                                if (cryptGetHashParam != 0) {
                                    throw new Exception("CryptHashData (len) failed: " + cryptGetHashParam);
                                }
                                byte[] bArr2 = new byte[iArr[0]];
                                int cryptGetHashParam2 = CAPIIntegrity.cryptGetHashParam(j3, 2, bArr2, iArr, 0);
                                if (cryptGetHashParam2 != 0) {
                                    throw new Exception("CryptHashData (data) failed: " + cryptGetHashParam2);
                                }
                                if (j3 != 0) {
                                    CAPIIntegrity.cryptDestroyHash(j3);
                                }
                                if (j != 0) {
                                    CAPIIntegrity.cryptReleaseContext(j, 0);
                                }
                                return bArr2;
                            }
                            byte[] bArr3 = bArr;
                            int cryptHashData = CAPIIntegrity.cryptHashData(j3, bArr3, 0, read, 0);
                            if (cryptHashData != 0) {
                                throw new Exception("CryptHashData failed: " + cryptHashData);
                            }
                            bArr = bArr3;
                        }
                    } catch (Exception e) {
                        e = e;
                        Log.e(LogConstants.APP_LOGGER_TAG, e.getMessage(), e);
                        if (j3 != 0) {
                            CAPIIntegrity.cryptDestroyHash(j3);
                        }
                        if (j != 0) {
                            CAPIIntegrity.cryptReleaseContext(j, 0);
                        }
                        return null;
                    }
                } catch (Exception e2) {
                    e = e2;
                    j3 = 0;
                } catch (Throwable th) {
                    th = th;
                    j2 = 0;
                    if (j2 != 0) {
                        CAPIIntegrity.cryptDestroyHash(j2);
                    }
                    if (j != 0) {
                        CAPIIntegrity.cryptReleaseContext(j, 0);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e3) {
            e = e3;
            j = 0;
            j3 = 0;
        } catch (Throwable th3) {
            th = th3;
            j = 0;
            j2 = 0;
        }
    }
}
