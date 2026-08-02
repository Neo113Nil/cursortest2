package ru.CryptoPro.XAdES.util;

import com.ybsdk.widgets.common.MoneyInputEditView;
import defpackage.mq61;
import defpackage.ny61;
import defpackage.q6a1;
import defpackage.vr61;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.JCP.tools.LicenseUtility;

/* loaded from: classes4.dex */
public class SystemUtils {
    public static final char[] a = {MoneyInputEditView.DEFAULT_VALUE, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final char[] b = new char[0];
    public static final String charsetName = "UTF-8";

    public static void copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        if (inputStream == null) {
            ny61.g("InputStream can not be NULL in copy method.");
            return;
        }
        if (outputStream == null) {
            ny61.g("OutputStream can not be NULL in copy method.");
            return;
        }
        byte[] bArr = new byte[1024];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read < 0) {
                    outputStream.flush();
                    inputStream.close();
                    outputStream.close();
                    return;
                }
                outputStream.write(bArr, 0, read);
            } catch (Throwable th) {
                inputStream.close();
                outputStream.close();
                throw th;
            }
        }
    }

    public static String formatDate(Date date) {
        int i;
        Calendar calendar = Calendar.getInstance();
        int i2 = 0;
        calendar.setTimeZone(new SimpleTimeZone(0, "Z"));
        calendar.setTime(date);
        if (mq61.a == null) {
            synchronized (mq61.class) {
                mq61.a = new vr61();
            }
        }
        mq61.a.getClass();
        StringBuilder sb = new StringBuilder();
        while (i2 < 19) {
            int i3 = i2 + 1;
            char charAt = "%Y-%M-%DT%h:%m:%s%z".charAt(i2);
            if (charAt != '%') {
                sb.append(charAt);
                i2 = i3;
            } else {
                i2 += 2;
                char charAt2 = "%Y-%M-%DT%h:%m:%s%z".charAt(i3);
                if (charAt2 == 'D') {
                    q6a1.b(sb, calendar.get(5));
                } else if (charAt2 == 'M') {
                    q6a1.b(sb, calendar.get(2) + 1);
                } else if (charAt2 == 'Y') {
                    int i4 = calendar.get(1);
                    String num = i4 <= 0 ? Integer.toString(1 - i4) : Integer.toString(i4);
                    while (num.length() < 4) {
                        num = "0".concat(num);
                    }
                    if (i4 <= 0) {
                        num = "-".concat(num);
                    }
                    sb.append(num);
                } else if (charAt2 == 'h') {
                    q6a1.b(sb, calendar.get(11));
                } else if (charAt2 == 'm') {
                    q6a1.b(sb, calendar.get(12));
                } else if (charAt2 == 's') {
                    q6a1.b(sb, calendar.get(13));
                    if (calendar.isSet(14) && (i = calendar.get(14)) != 0) {
                        String num2 = Integer.toString(i);
                        while (num2.length() < 3) {
                            num2 = "0".concat(num2);
                        }
                        sb.append('.');
                        sb.append(num2);
                    }
                } else {
                    if (charAt2 != 'z') {
                        throw new InternalError();
                    }
                    TimeZone timeZone = calendar.getTimeZone();
                    if (timeZone != null) {
                        int offset = timeZone.getOffset(calendar.getTime().getTime());
                        if (offset == 0) {
                            sb.append('Z');
                        } else {
                            if (offset >= 0) {
                                sb.append('+');
                            } else {
                                sb.append(LicenseUtility.SEPARATOR);
                                offset *= -1;
                            }
                            int i5 = offset / 60000;
                            q6a1.b(sb, i5 / 60);
                            sb.append(':');
                            q6a1.b(sb, i5 % 60);
                        }
                    }
                }
            }
        }
        return sb.toString();
    }

    public static String getCauseMessages(Throwable th) {
        String errorMessage;
        if (th == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getErrorMessage(th));
        while (true) {
            sb.append("; \n");
            do {
                th = th.getCause();
                if (th == null) {
                    return sb.toString();
                }
                errorMessage = getErrorMessage(th);
            } while (errorMessage == null);
            sb.append(errorMessage);
        }
    }

    public static String getErrorMessage(Throwable th) {
        if (th == null) {
            return null;
        }
        String message = th.getMessage();
        return message == null ? th.getClass().getName() : message;
    }

    public static Date parseDate(String str) throws ParseException {
        String trim = str.trim();
        try {
            return mq61.f(trim).getTime();
        } catch (Exception e) {
            JCPLogger.ignoredException(e);
            boolean endsWith = trim.endsWith("Z");
            cl_4 cl_4Var = new cl_4();
            if (endsWith) {
                cl_4Var.setTimeZone(TimeZone.getTimeZone("GMT"));
            }
            try {
                return cl_4Var.parse(trim);
            } catch (Exception e2) {
                JCPLogger.ignoredException(e2);
                cl_5 cl_5Var = new cl_5();
                if (endsWith) {
                    cl_5Var.setTimeZone(TimeZone.getTimeZone("GMT"));
                }
                try {
                    return cl_5Var.parse(trim);
                } catch (Exception unused) {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss z");
                    if (endsWith) {
                        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
                    }
                    return simpleDateFormat.parse(trim);
                }
            }
        }
    }

    public static byte[] toByteArray(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        copy(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static char[] toHexChars(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return b;
        }
        char[] cArr = new char[bArr.length << 1];
        int i = 0;
        for (byte b2 : bArr) {
            int i2 = i + 1;
            char[] cArr2 = a;
            cArr[i] = cArr2[(b2 & 240) >>> 4];
            i += 2;
            cArr[i2] = cArr2[b2 & PKIBody._CCP];
        }
        return cArr;
    }

    public static String toHexString(byte[] bArr) {
        return new String(toHexChars(bArr));
    }
}
