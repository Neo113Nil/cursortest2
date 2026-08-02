package ru.CryptoPro.JCPRequest.ca15.decoder;

import defpackage.ny61;
import defpackage.oyr;
import java.io.IOException;
import java.util.Map;
import java.util.Vector;
import ru.CryptoPro.JCP.tools.Decoder;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.JCPRequest.GostCertificateRequest;
import ru.CryptoPro.JCPRequest.ca15.status.CA15Status;
import ru.CryptoPro.JCPRequest.ca15.status.CA15UserRegisterInfoStatus;
import ru.CryptoPro.JCPRequest.ca15.status.CA15UserRegisterStatus;
import ru.CryptoPro.JCPRequest.ca15.tools.Utility;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes4.dex */
public class HTMLPageDecoder {
    public static byte[] decodeCertificate(String str) throws IOException {
        String str2;
        CA15Certificate cA15Certificate = new CA15Certificate(str);
        JCPLogger.enter();
        int indexOf = cA15Certificate.a.indexOf("<FORM ID=\"frmPrintCertPage\"");
        if (indexOf != -1) {
            int indexOf2 = cA15Certificate.a.indexOf("<INPUT TYPE=\"hidden\" NAME=\"PKCS\"", indexOf + 1);
            if (indexOf2 != -1) {
                int indexOf3 = cA15Certificate.a.indexOf("VALUE=\"", indexOf2 + 33);
                if (indexOf3 != -1) {
                    int i = indexOf3 + 7;
                    int indexOf4 = cA15Certificate.a.indexOf("\"", indexOf3 + 8);
                    if (indexOf4 != -1) {
                        String substring = cA15Certificate.a.substring(i, indexOf4);
                        JCPLogger.fine("*** Decoded certificate: ***");
                        JCPLogger.fine(substring);
                        cA15Certificate.b = new Decoder().decodeBuffer(substring);
                        JCPLogger.exit();
                        return cA15Certificate.getDerEncodedCertificate();
                    }
                    str2 = "Last value tag of certificate form is lost.";
                } else {
                    str2 = "First value tag of certificate form is lost.";
                }
            } else {
                str2 = "Last tag of certificate form is lost.";
            }
        } else {
            str2 = "First tag of certificate form is lost.";
        }
        ny61.v(str2);
        return null;
    }

    public static String decodeCertificateRequest(String str) {
        int indexOf = str.indexOf(GostCertificateRequest.BEGIN_STRING);
        int indexOf2 = str.indexOf(GostCertificateRequest.END_STRING);
        if (indexOf == -1 || indexOf2 == -1) {
            return null;
        }
        return str.substring(indexOf + 39, indexOf2);
    }

    public static Map decodeCertificateRequestTable(String str) throws IOException {
        String str2;
        CA15CertificateRequestTable cA15CertificateRequestTable = new CA15CertificateRequestTable(str);
        JCPLogger.enter();
        JCPLogger.fine("Decode a request table:", cA15CertificateRequestTable.a);
        int indexOf = cA15CertificateRequestTable.a.indexOf("tblCertRequests");
        if (indexOf != -1) {
            int indexOf2 = cA15CertificateRequestTable.a.indexOf(">", indexOf + 16);
            if (indexOf2 != -1) {
                int i = indexOf2 + 1;
                int indexOf3 = cA15CertificateRequestTable.a.indexOf("</TABLE>", indexOf2 + 2);
                if (indexOf3 != -1) {
                    String substring = cA15CertificateRequestTable.a.substring(i, indexOf3);
                    cA15CertificateRequestTable.a = substring;
                    cA15CertificateRequestTable.a = substring.trim();
                    boolean z = true;
                    int i2 = 0;
                    while (cA15CertificateRequestTable.a.length() != 0) {
                        if (z) {
                            cA15CertificateRequestTable.b();
                            z = false;
                        } else {
                            String b = cA15CertificateRequestTable.b();
                            JCPLogger.fine("Decode a body TR:", b);
                            if (b != null) {
                                CA15CertificateRequestRecord cA15CertificateRequestRecord = new CA15CertificateRequestRecord(b);
                                JCPLogger.enter();
                                JCPLogger.fine("Decode a record: ", cA15CertificateRequestRecord.a);
                                String a = cA15CertificateRequestRecord.a("class=\"View\">", "</TD>", "identifier");
                                cA15CertificateRequestRecord.b = a;
                                JCPLogger.fineFormat("*** Decoded certificate request identifier: {0} ***", a);
                                String a2 = cA15CertificateRequestRecord.a("class=\"View\">", "</TD>", "sent date");
                                cA15CertificateRequestRecord.c = a2;
                                JCPLogger.fineFormat("*** Decoded sent date: {0} ***", a2);
                                String a3 = cA15CertificateRequestRecord.a("class=\"View\">", "</TD>", "approval date");
                                cA15CertificateRequestRecord.d = a3;
                                JCPLogger.fineFormat("*** Decoded approval date: {0} ***", a3);
                                String a4 = cA15CertificateRequestRecord.a("class=\"View\">", "</TD>", "comment");
                                cA15CertificateRequestRecord.e = a4;
                                JCPLogger.fineFormat("*** Decoded comment: {0} ***", a4);
                                String a5 = cA15CertificateRequestRecord.a("class=\"View\">", "</TD>", ACSPConstants.STATUS);
                                JCPLogger.fineFormat("*** Decoded temp status string value: {0} ***", a5);
                                int stringStatusToIntStatus = CA15Status.stringStatusToIntStatus(a5);
                                JCPLogger.fineFormat("*** Decoded temp status int value: {0} ***", Integer.valueOf(stringStatusToIntStatus));
                                CA15Status cA15Status = new CA15Status(stringStatusToIntStatus);
                                cA15CertificateRequestRecord.f = cA15Status;
                                JCPLogger.fineFormat("*** Decoded status: {0} ***", cA15Status);
                                String a6 = cA15CertificateRequestRecord.a("<INPUT TYPE=\"HIDDEN\" NAME=\"PKCS10\" VALUE=\"", "\">", "PKCS10");
                                cA15CertificateRequestRecord.g = a6;
                                cA15CertificateRequestRecord.g = Utility.cleanCertificateRequest(a6);
                                JCPLogger.fine("*** Decoded pkcs: ***");
                                JCPLogger.fine(cA15CertificateRequestRecord.g);
                                JCPLogger.exit();
                                cA15CertificateRequestTable.b.put(cA15CertificateRequestRecord.getCertificateRequestIdentifier(), cA15CertificateRequestRecord);
                            }
                        }
                        int i3 = i2 + 1;
                        if (i2 <= 10000) {
                            i2 = i3;
                        } else {
                            str2 = "Too many circles detected.";
                        }
                    }
                    JCPLogger.exit();
                } else {
                    str2 = "End tag of request table is lost.";
                }
            } else {
                str2 = "Close tag of identifier of request table is lost.";
            }
            ny61.v(str2);
            return null;
        }
        return cA15CertificateRequestTable.getCertificateRequestMap();
    }

    public static byte[] decodeP7B(byte[] bArr, boolean z) throws IOException {
        if (!z) {
            return bArr;
        }
        return new Decoder().decodeBuffer(Utility.decodeP7B(bArr));
    }

    public static String decodeRequestIdentifier(String str) throws IOException {
        String str2;
        CA15CertificateRequestIdentifier cA15CertificateRequestIdentifier = new CA15CertificateRequestIdentifier(str);
        JCPLogger.enter();
        int indexOf = cA15CertificateRequestIdentifier.a.indexOf("\"ConfirmReq_");
        if (indexOf != -1) {
            int indexOf2 = cA15CertificateRequestIdentifier.a.indexOf("\"", indexOf + 1);
            if (indexOf2 != -1) {
                String substring = cA15CertificateRequestIdentifier.a.substring(indexOf + 12, indexOf2);
                cA15CertificateRequestIdentifier.b = substring;
                JCPLogger.infoFormat("*** Decoded certificate request identifier: {0} ***", substring);
                JCPLogger.exit();
                return cA15CertificateRequestIdentifier.getCertificateRequestIdentifier();
            }
            str2 = "Last tag of request identifier is lost.";
        } else {
            str2 = "First tag of request identifier is lost.";
        }
        ny61.v(str2);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x02d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Vector decodeUserRegistrationFields(String str) throws IOException {
        Vector vector;
        String str2;
        String str3;
        Vector vector2;
        int i;
        int i2;
        String[] strArr;
        int i3;
        int i4;
        int i5;
        String substring;
        int indexOf;
        int i6;
        int indexOf2;
        CA15UserRegistrationTable cA15UserRegistrationTable = new CA15UserRegistrationTable(str);
        JCPLogger.enter();
        int indexOf3 = cA15UserRegistrationTable.a.indexOf("GetSubjectFormPosted");
        int i7 = -1;
        if (indexOf3 != -1) {
            int indexOf4 = cA15UserRegistrationTable.a.indexOf("<TABLE", indexOf3 + 21);
            if (indexOf4 != -1) {
                int i8 = indexOf4 + 6;
                int i9 = 7;
                int indexOf5 = cA15UserRegistrationTable.a.indexOf("</TABLE>", indexOf4 + 7);
                if (indexOf5 != -1) {
                    String substring2 = cA15UserRegistrationTable.a.substring(i8, indexOf5);
                    cA15UserRegistrationTable.a = substring2;
                    cA15UserRegistrationTable.a = substring2.trim();
                    int i10 = 0;
                    int i11 = 0;
                    while (cA15UserRegistrationTable.a.length() != 0) {
                        String b = cA15UserRegistrationTable.b();
                        if (b != null) {
                            CA15UserRegistrationField cA15UserRegistrationField = new CA15UserRegistrationField(b);
                            JCPLogger.enter();
                            int indexOf6 = cA15UserRegistrationField.a.indexOf("color=\"");
                            if (indexOf6 != i7) {
                                if (cA15UserRegistrationField.a.substring(indexOf6 + 7, indexOf6 + 10).equalsIgnoreCase("red")) {
                                    cA15UserRegistrationField.b = true;
                                }
                                i2 = i9;
                            } else {
                                indexOf6 = i10;
                                i2 = indexOf6;
                            }
                            JCPLogger.fineFormat("*** Decoded mandatory field: {0} ***", Boolean.valueOf(cA15UserRegistrationField.b));
                            int indexOf7 = cA15UserRegistrationField.a.indexOf(">", indexOf6 + i2 + 1);
                            if (indexOf7 != i7) {
                                int i12 = indexOf7 + 1;
                                int indexOf8 = cA15UserRegistrationField.a.indexOf("<", indexOf7 + 2);
                                if (indexOf8 != i7) {
                                    if (i12 == indexOf8) {
                                        cA15UserRegistrationField.h = 2;
                                    } else {
                                        String substring3 = cA15UserRegistrationField.a.substring(i12, indexOf8);
                                        cA15UserRegistrationField.c = substring3;
                                        int i13 = i10;
                                        while (true) {
                                            strArr = CA15UserRegistrationField.i;
                                            vector2 = null;
                                            if (i13 >= 5) {
                                                break;
                                            }
                                            substring3 = substring3.replaceAll(strArr[i13], "");
                                            i13++;
                                        }
                                        cA15UserRegistrationField.c = substring3;
                                        String g = oyr.g(1, i10, substring3);
                                        cA15UserRegistrationField.c = g;
                                        JCPLogger.fineFormat("*** Decoded name: {0} ***", g);
                                        int i14 = indexOf8 + 2;
                                        int indexOf9 = cA15UserRegistrationField.a.indexOf("INPUT", i14);
                                        if (indexOf9 != i7) {
                                            cA15UserRegistrationField.h = i10;
                                            i5 = i10;
                                            i4 = i5;
                                            i3 = 1;
                                        } else {
                                            indexOf9 = cA15UserRegistrationField.a.indexOf("select", i14);
                                            if (indexOf9 == i7) {
                                                indexOf9 = cA15UserRegistrationField.a.indexOf("TEXTAREA", indexOf8 + 7);
                                                if (indexOf9 != i7) {
                                                    cA15UserRegistrationField.h = 1;
                                                    i3 = 8;
                                                    i5 = i10;
                                                    i4 = 1;
                                                }
                                                str3 = "Too many circles detected.";
                                                i = i10;
                                                i7 = -1;
                                                if (cA15UserRegistrationField.getComponentType() != -1) {
                                                    cA15UserRegistrationTable.b.add(cA15UserRegistrationField);
                                                }
                                            } else {
                                                cA15UserRegistrationField.h = 2;
                                                i3 = 6;
                                                i4 = i10;
                                                i5 = 1;
                                            }
                                        }
                                        JCPLogger.fineFormat("*** Decoded component type: {0} ***", Integer.valueOf(cA15UserRegistrationField.h));
                                        int indexOf10 = cA15UserRegistrationField.a.indexOf("name=", indexOf9 + i3 + 1);
                                        if (indexOf10 != i7) {
                                            int i15 = indexOf10 + 5;
                                            int i16 = indexOf10 + 6;
                                            int indexOf11 = cA15UserRegistrationField.a.indexOf(">", i16);
                                            if (indexOf11 != i7) {
                                                int indexOf12 = cA15UserRegistrationField.a.indexOf("\" ", i16);
                                                int indexOf13 = cA15UserRegistrationField.a.indexOf(" ", i16);
                                                if (!(indexOf12 == i7 && indexOf13 == i7) && (indexOf12 < indexOf11 || indexOf13 < indexOf11)) {
                                                    String str4 = cA15UserRegistrationField.a;
                                                    substring = indexOf12 != i7 ? str4.substring(i15, indexOf12) : str4.substring(i15, indexOf13);
                                                } else {
                                                    substring = cA15UserRegistrationField.a.substring(i15, indexOf11);
                                                }
                                                cA15UserRegistrationField.d = substring;
                                                String replaceAll = cA15UserRegistrationField.d.replaceAll("\"", "");
                                                cA15UserRegistrationField.d = replaceAll;
                                                for (int i17 = 0; i17 < 5; i17++) {
                                                    replaceAll = replaceAll.replaceAll(strArr[i17], "");
                                                }
                                                cA15UserRegistrationField.d = replaceAll;
                                                JCPLogger.fineFormat("*** Decoded form name:{0} ***", replaceAll);
                                                String str5 = cA15UserRegistrationField.a;
                                                if (i5 == 0) {
                                                    int indexOf14 = str5.indexOf("maxLength=", i16);
                                                    if (indexOf14 != -1) {
                                                        int i18 = indexOf14 + 10;
                                                        int i19 = indexOf14 + 11;
                                                        int indexOf15 = cA15UserRegistrationField.a.indexOf(" ", i19);
                                                        if (indexOf15 != -1 || (indexOf15 = cA15UserRegistrationField.a.indexOf(">", i19)) != -1) {
                                                            int parseInt = Integer.parseInt(cA15UserRegistrationField.a.substring(i18, indexOf15).replaceAll("\"", ""));
                                                            cA15UserRegistrationField.e = parseInt;
                                                            JCPLogger.fineFormat("*** Decoded maxLength: {0} ***", Integer.valueOf(parseInt));
                                                        }
                                                    }
                                                    if (i4 == 0 && (indexOf = cA15UserRegistrationField.a.indexOf("value=\"", i16)) != -1 && (indexOf2 = cA15UserRegistrationField.a.indexOf("\"", (i6 = indexOf + 7))) != -1 && i6 != indexOf2) {
                                                        String substring4 = cA15UserRegistrationField.a.substring(i6, indexOf2);
                                                        cA15UserRegistrationField.f = substring4;
                                                        JCPLogger.fineFormat("*** Decoded value:{0} ***", substring4);
                                                    }
                                                } else {
                                                    int indexOf16 = str5.indexOf("</select>", i16);
                                                    if (indexOf16 != -1) {
                                                        String trim = cA15UserRegistrationField.a.substring(i15, indexOf16).trim();
                                                        int indexOf17 = trim.indexOf("<option", 0);
                                                        int indexOf18 = trim.indexOf("</option>", 0);
                                                        if (indexOf17 != -1 && indexOf18 != -1) {
                                                            int indexOf19 = trim.indexOf("value=", indexOf17 + 8);
                                                            int i20 = indexOf19 + 6;
                                                            str3 = "Too many circles detected.";
                                                            int indexOf20 = trim.indexOf(" ", indexOf19 + 7);
                                                            if (indexOf19 != -1 && indexOf20 != -1) {
                                                                String substring5 = trim.substring(i20, indexOf20);
                                                                cA15UserRegistrationField.f = substring5;
                                                                Vector vector3 = cA15UserRegistrationField.g;
                                                                vector3.add(substring5);
                                                                String replaceAll2 = cA15UserRegistrationField.f.replaceAll("\"", "");
                                                                cA15UserRegistrationField.f = replaceAll2;
                                                                String replaceAll3 = replaceAll2.replaceAll("'", "");
                                                                cA15UserRegistrationField.f = replaceAll3;
                                                                JCPLogger.fineFormat("*** Decoded select value: {0} ***", replaceAll3);
                                                                String trim2 = trim.substring(indexOf18 + 9).trim();
                                                                int i21 = 0;
                                                                while (trim2.length() != 0) {
                                                                    int indexOf21 = trim2.indexOf("<option", 0);
                                                                    int indexOf22 = trim2.indexOf("</option>", 0);
                                                                    if (indexOf21 != -1 && indexOf22 != -1) {
                                                                        String substring6 = trim2.substring(indexOf21 + 7, indexOf22);
                                                                        trim2 = trim2.substring(indexOf22 + 9).trim();
                                                                        if (trim2.length() == 0) {
                                                                            break;
                                                                        }
                                                                        i = 0;
                                                                        int indexOf23 = substring6.indexOf("value=", 0);
                                                                        int indexOf24 = substring6.indexOf(">", 0);
                                                                        if (indexOf23 == -1 || indexOf24 == -1) {
                                                                            break;
                                                                        }
                                                                        String substring7 = substring6.substring(indexOf23 + 6, indexOf24);
                                                                        JCPLogger.fineFormat("*** Decoded select allowed value: {0} ***", substring7);
                                                                        vector3.add(substring7);
                                                                        int i22 = i21 + 1;
                                                                        if (i21 > 10000) {
                                                                            ny61.v(str3);
                                                                            return null;
                                                                        }
                                                                        i21 = i22;
                                                                    } else {
                                                                        break;
                                                                    }
                                                                }
                                                                i = 0;
                                                                JCPLogger.exit();
                                                                i7 = -1;
                                                                if (cA15UserRegistrationField.getComponentType() != -1) {
                                                                }
                                                            }
                                                            i = 0;
                                                            i7 = -1;
                                                            if (cA15UserRegistrationField.getComponentType() != -1) {
                                                            }
                                                        }
                                                    }
                                                }
                                                str3 = "Too many circles detected.";
                                                i = 0;
                                                i7 = -1;
                                                if (cA15UserRegistrationField.getComponentType() != -1) {
                                                }
                                            }
                                        }
                                        str3 = "Too many circles detected.";
                                        i = i10;
                                        i7 = -1;
                                        if (cA15UserRegistrationField.getComponentType() != -1) {
                                        }
                                    }
                                }
                            }
                            str3 = "Too many circles detected.";
                            vector2 = null;
                            i = i10;
                            i7 = -1;
                            if (cA15UserRegistrationField.getComponentType() != -1) {
                            }
                        } else {
                            str3 = "Too many circles detected.";
                            vector2 = null;
                            i = i10;
                        }
                        int i23 = i11 + 1;
                        if (i11 > 10000) {
                            ny61.v(str3);
                            return vector2;
                        }
                        i10 = i;
                        i11 = i23;
                        i9 = 7;
                    }
                    JCPLogger.exit();
                    return cA15UserRegistrationTable.getUserRegistrationFields();
                }
                vector = null;
                str2 = "End tag of registration table is lost.";
            } else {
                vector = null;
                str2 = "Start tag of registration table is lost.";
            }
        } else {
            vector = null;
            str2 = "Marker tag of registration table is lost.";
        }
        ny61.v(str2);
        return vector;
    }

    public static CA15UserRegisterInfoStatus decodeUserRegistrationInfo(String str) throws IOException {
        CA15UserRegisterInfoStatus cA15UserRegisterInfoStatus;
        CA15UserRegistrationInfo cA15UserRegistrationInfo = new CA15UserRegistrationInfo(str);
        JCPLogger.enter();
        int i = cA15UserRegistrationInfo.a.indexOf("RegCreateCertRequest") != -1 ? 0 : cA15UserRegistrationInfo.a.indexOf("RegTemporaryUser") != -1 ? 1 : -1;
        JCPLogger.infoFormat("*** Decoded issue status: {0} ***", Integer.valueOf(i));
        int indexOf = cA15UserRegistrationInfo.a.indexOf("Name=TokenID");
        if (indexOf == -1) {
            cA15UserRegisterInfoStatus = new CA15UserRegisterInfoStatus(-1, null, null);
        } else {
            String c = cA15UserRegistrationInfo.c(indexOf + 13);
            JCPLogger.info("Decoded tokenID: ", c);
            if (c == null) {
                cA15UserRegisterInfoStatus = new CA15UserRegisterInfoStatus(-1, null, null);
            } else {
                int indexOf2 = cA15UserRegistrationInfo.a.indexOf("Name=Password");
                if (indexOf2 == -1) {
                    cA15UserRegisterInfoStatus = new CA15UserRegisterInfoStatus(-1, null, null);
                } else {
                    String c2 = cA15UserRegistrationInfo.c(indexOf2 + 14);
                    if (c2 != null) {
                        cA15UserRegistrationInfo.b = new CA15UserRegisterInfoStatus(i, c, c2);
                        JCPLogger.exit();
                        return cA15UserRegistrationInfo.getUserRegisterInfoStatus();
                    }
                    cA15UserRegisterInfoStatus = new CA15UserRegisterInfoStatus(-1, null, null);
                }
            }
        }
        cA15UserRegistrationInfo.b = cA15UserRegisterInfoStatus;
        return cA15UserRegistrationInfo.getUserRegisterInfoStatus();
    }

    public static CA15UserRegisterStatus decodeUserRegistrationStatus(String str) throws IOException {
        CA15UserRegisterStatus cA15UserRegisterStatus;
        CA15UserIdentifier cA15UserIdentifier = new CA15UserIdentifier(str);
        JCPLogger.enter();
        int i = cA15UserIdentifier.a.indexOf("CreateCertReqButton") != -1 ? 1 : 0;
        int indexOf = cA15UserIdentifier.a.indexOf("tblRegRequests");
        if (indexOf == -1) {
            cA15UserRegisterStatus = new CA15UserRegisterStatus(-1, null);
        } else {
            int i2 = indexOf + 14;
            int indexOf2 = cA15UserIdentifier.a.indexOf("</TABLE>", indexOf + 15);
            if (indexOf2 == -1) {
                cA15UserRegisterStatus = new CA15UserRegisterStatus(-1, null);
            } else {
                cA15UserIdentifier.a = cA15UserIdentifier.a.substring(i2, indexOf2);
                if (cA15UserIdentifier.b() == null) {
                    cA15UserRegisterStatus = new CA15UserRegisterStatus(-1, null);
                } else {
                    String b = cA15UserIdentifier.b();
                    if (b == null) {
                        cA15UserRegisterStatus = new CA15UserRegisterStatus(-1, null);
                    } else {
                        int indexOf3 = b.indexOf(">");
                        int i3 = indexOf3 + 1;
                        int indexOf4 = b.indexOf("<", indexOf3 + 2);
                        if (indexOf3 != -1 && indexOf4 != -1) {
                            String substring = b.substring(i3, indexOf4);
                            CA15UserRegisterStatus cA15UserRegisterStatus2 = new CA15UserRegisterStatus(i ^ 1, substring);
                            cA15UserIdentifier.b = cA15UserRegisterStatus2;
                            JCPLogger.fineFormat("*** Decoded status: {0}, identifier: {1} ***", cA15UserRegisterStatus2, substring);
                            JCPLogger.exit();
                            return cA15UserIdentifier.getStatus();
                        }
                        cA15UserRegisterStatus = new CA15UserRegisterStatus(-1, null);
                    }
                }
            }
        }
        cA15UserIdentifier.b = cA15UserRegisterStatus;
        return cA15UserIdentifier.getStatus();
    }
}
