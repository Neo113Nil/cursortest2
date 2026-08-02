package ru.CryptoPro.JCP.Util;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.cert.CRLException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509CRL;
import java.util.Vector;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.VMInspector.Inspector;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.Decoder;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.JCSP.CStructReader.BlobHeaderStructure;
import ru.CryptoPro.reprov.array.DerValue;
import ru.CryptoPro.ssl.Alerts;

/* loaded from: classes4.dex */
public class DirList {
    public static final String USAGE = "Usage: DirList <Directory name>";
    private static final byte PAD_DEFAULT = 61;
    private static final byte[] DECODE_TABLE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, Alerts.alert_export_restriction, PAD_DEFAULT, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, PKIBody._KRP, 12, PKIBody._RP, PKIBody._CCR, PKIBody._CCP, PKIBody._CKUANN, PKIBody._CANN, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, DerValue.tag_GeneralString, DerValue.tag_UniversalString, 29, 30, 31, BlobHeaderStructure.BLOB_VERSION, BlobHeaderStructure.KEXP15_BLOB_VERSION, 34, 35, 36, 37, 38, 39, Alerts.alert_handshake_failure, Alerts.alert_no_certificate, Alerts.alert_bad_certificate, Alerts.alert_unsupported_certificate, Alerts.alert_certificate_revoked, Alerts.alert_certificate_expired, Alerts.alert_certificate_unknown, Alerts.alert_illegal_parameter, 48, 49, Alerts.alert_decode_error, Alerts.alert_decrypt_error};

    private DirList() {
    }

    public static void checkFile(File file, String str, Vector vector) {
        File file2 = new File(file, str);
        if (!file2.isDirectory()) {
            vector.add(file2.getAbsolutePath());
            return;
        }
        Vector createList = createList(new File(file, str));
        for (int i = 0; i < createList.size(); i++) {
            vector.add(createList.elementAt(i));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0035, code lost:
    
        if (r1 == null) goto L27;
     */
    /* JADX WARN: Not initialized variable reg: 1, insn: 0x001a: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:39:0x001a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] convertInputStreamToByteArray(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2;
        ByteArrayOutputStream byteArrayOutputStream3 = null;
        r0 = null;
        byte[] bArr = null;
        try {
            if (inputStream == null) {
                return null;
            }
            try {
                byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    byte[] bArr2 = new byte[8192];
                    while (true) {
                        int read = inputStream.read(bArr2, 0, 8192);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream2.write(bArr2, 0, read);
                    }
                    byteArrayOutputStream2.flush();
                    bArr = byteArrayOutputStream2.toByteArray();
                } catch (IOException e) {
                    e = e;
                    JCPLogger.ignoredException(e);
                }
            } catch (IOException e2) {
                e = e2;
                byteArrayOutputStream2 = null;
            } catch (Throwable th) {
                th = th;
                if (byteArrayOutputStream3 != null) {
                    try {
                        byteArrayOutputStream3.close();
                    } catch (IOException e3) {
                        JCPLogger.ignoredException(e3);
                    }
                }
                throw th;
            }
            try {
                byteArrayOutputStream2.close();
            } catch (IOException e4) {
                JCPLogger.ignoredException(e4);
            }
            return bArr;
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream3 = byteArrayOutputStream;
        }
    }

    public static Vector createList(File file) {
        Vector vector = new Vector(16);
        for (String str : file.list()) {
            checkFile(file, str, vector);
        }
        return vector;
    }

    public static String extractRelativePath(String str, String str2) {
        return str.substring(str2.length());
    }

    public static X509CRL getCRLByInputStream(InputStream inputStream) throws IOException, CertificateException, CRLException {
        CertificateFactory certificateFactory = CertificateFactory.getInstance(JCP.CERTIFICATE_FACTORY_NAME);
        byte[] convertInputStreamToByteArray = convertInputStreamToByteArray(inputStream);
        return (X509CRL) certificateFactory.generateCRL(isBase64(convertInputStreamToByteArray) ? new ByteArrayInputStream(new Decoder().decodeBuffer(new ByteArrayInputStream(convertInputStreamToByteArray))) : new ByteArrayInputStream(convertInputStreamToByteArray));
    }

    public static String getFileExtension(String str) {
        int lastIndexOf = str.lastIndexOf(System.getProperty("file.separator"));
        if (lastIndexOf != -1) {
            str = str.substring(lastIndexOf + 1);
        }
        int lastIndexOf2 = str.lastIndexOf(Extension.DOT_CHAR);
        return lastIndexOf2 == -1 ? str : str.substring(lastIndexOf2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0087, code lost:
    
        if (r2 == null) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0092 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x008d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] intellectDecode(byte[] bArr) {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2;
        Exception e;
        ByteArrayInputStream byteArrayInputStream;
        ByteArrayInputStream byteArrayInputStream2 = null;
        try {
            try {
                byteArrayInputStream = new ByteArrayInputStream(bArr);
            } catch (Throwable th) {
                th = th;
            }
            try {
                bufferedReader2 = new BufferedReader(new InputStreamReader(byteArrayInputStream, "ASCII"));
                try {
                    String readLine = bufferedReader2.readLine();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    if (readLine.equals("-----BEGIN CERTIFICATE-----")) {
                        Decoder decoder = new Decoder();
                        while (true) {
                            String readLine2 = bufferedReader2.readLine();
                            if (readLine2 == null) {
                                break;
                            }
                            if (readLine2.equals("-----END CERTIFICATE-----")) {
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                try {
                                    byteArrayInputStream.close();
                                } catch (IOException unused) {
                                }
                                try {
                                    bufferedReader2.close();
                                } catch (IOException unused2) {
                                }
                                return byteArray;
                            }
                            byteArrayOutputStream.write(decoder.decodeBuffer(readLine2));
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    JCPLogger.subThrown(e);
                    if (byteArrayInputStream != null) {
                        try {
                            byteArrayInputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                }
            } catch (Exception e3) {
                bufferedReader2 = null;
                e = e3;
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = null;
                byteArrayInputStream2 = byteArrayInputStream;
                if (byteArrayInputStream2 != null) {
                    try {
                        byteArrayInputStream2.close();
                    } catch (IOException unused4) {
                    }
                }
                if (bufferedReader != null) {
                    throw th;
                }
                try {
                    bufferedReader.close();
                    throw th;
                } catch (IOException unused5) {
                    throw th;
                }
            }
        } catch (Exception e4) {
            bufferedReader2 = null;
            e = e4;
            byteArrayInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            bufferedReader = null;
            if (byteArrayInputStream2 != null) {
            }
            if (bufferedReader != null) {
            }
        }
        if (!isBase64(bArr)) {
            try {
                byteArrayInputStream.close();
            } catch (IOException unused6) {
            }
            try {
                bufferedReader2.close();
            } catch (IOException unused7) {
            }
            return bArr;
        }
        byte[] decodeBuffer = new Decoder().decodeBuffer(new ByteArrayInputStream(bArr));
        try {
            byteArrayInputStream.close();
        } catch (IOException unused8) {
        }
        try {
            bufferedReader2.close();
        } catch (IOException unused9) {
        }
        return decodeBuffer;
    }

    public static boolean isBase64(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            if (!isBase64(bArr[i]) && !isWhiteSpace(bArr[i])) {
                return false;
            }
        }
        return true;
    }

    private static boolean isWhiteSpace(byte b) {
        return b == 9 || b == 10 || b == 13 || b == 32;
    }

    public static void log(Exception exc) {
        Inspector.print(exc);
    }

    public static void main(String[] strArr) throws IOException {
        if (strArr == null || strArr.length == 0 || strArr.length > 1) {
            log(USAGE);
            return;
        }
        String str = strArr[0];
        Vector createList = createList(new File(str));
        int size = createList.size();
        String[] strArr2 = new String[size];
        for (int i = 0; i < size; i++) {
            strArr2[i] = extractRelativePath((String) createList.elementAt(i), str);
        }
        for (int i2 = 0; i2 < size; i2++) {
            log(strArr2[i2]);
        }
    }

    public static void log(String str) {
        Inspector.print(str);
    }

    private static boolean isBase64(byte b) {
        if (b == 61) {
            return true;
        }
        if (b < 0) {
            return false;
        }
        byte[] bArr = DECODE_TABLE;
        return b < bArr.length && bArr[b] != -1;
    }
}
