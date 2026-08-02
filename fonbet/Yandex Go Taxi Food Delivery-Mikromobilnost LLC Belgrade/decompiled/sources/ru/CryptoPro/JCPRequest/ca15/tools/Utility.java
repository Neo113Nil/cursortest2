package ru.CryptoPro.JCPRequest.ca15.tools;

import defpackage.dt61;
import defpackage.qz40;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Properties;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.JCPRequest.GostCertificateRequest;
import ru.CryptoPro.JCPRequest.RegisteredHttpClient;
import ru.CryptoPro.JCPRequest.ca15.user.CAUser;
import ru.CryptoPro.JCPRequest.ca20.user.CA20CertAuthUser;
import ru.cprocsp.NGate.tools.Constants;
import ru.yandex.video.m3.ott.data.net.impl.ExtFunctionsKt;

/* loaded from: classes4.dex */
public class Utility {
    public static final String DEFAULT_CA15_DATA_ENCODING = "windows-1251";
    public static final String DEFAULT_CA20_DATA_ENCODING = "UTF-8";
    public static final String USER_AGENT = "Mozilla/5.0 (compatible; MSIE 9.0; Windows NT 6.1; WOW64; Trident/5.0)";
    public static final Properties a;
    public static final Properties b;

    static {
        Properties properties = new Properties();
        a = properties;
        Properties properties2 = new Properties();
        b = properties2;
        properties.put(ExtFunctionsKt.HEADER_USER_AGENT, USER_AGENT);
        properties.put("Content-Type", "application/x-www-form-urlencoded");
        properties2.put(ExtFunctionsKt.HEADER_USER_AGENT, USER_AGENT);
        properties2.put("Content-Type", "application/json; charset=UTF-8");
    }

    public static Properties FORM_HEADERS() {
        return (Properties) a.clone();
    }

    public static Properties JSON_HEADERS() {
        return (Properties) b.clone();
    }

    public static String cleanCertificateRequest(String str) {
        return (str + Constants.LINE_SEPARATOR).replaceAll(GostCertificateRequest.BEGIN_STRING, "").replaceAll(GostCertificateRequest.END_STRING, "").replaceAll(Constants.LINE_SEPARATOR, "");
    }

    public static String decodeP7B(byte[] bArr) {
        String str = new String(bArr);
        return str.substring(str.indexOf("-----BEGIN CERTIFICATE-----") + 27, str.indexOf("-----END CERTIFICATE-----"));
    }

    public static String getDefaultCharset() {
        return new OutputStreamWriter(new ByteArrayOutputStream()).getEncoding();
    }

    public static String getHttpPostFile(String str, String str2, CAUser cAUser, Properties properties, Properties properties2, byte[] bArr) throws Exception {
        HttpURLConnection httpURLConnection;
        dt61 dt61Var = null;
        try {
            dt61Var = RegisteredHttpClient.getHttpInstance(new URL(str + str2), cAUser.isCA20());
            if (cAUser instanceof CA20CertAuthUser) {
                ((qz40) dt61Var).e = ((CA20CertAuthUser) cAUser).getCertAuthInfo();
            }
            String str3 = "UTF-8";
            if (properties != null) {
                dt61Var.getClass();
                properties.put("Encoding-Type", "UTF-8");
            }
            if (properties2 != null) {
                ((qz40) dt61Var).d("POST", properties, properties2);
            } else {
                ((qz40) dt61Var).e("POST", properties, bArr);
            }
            qz40 qz40Var = (qz40) dt61Var;
            InputStream j = qz40Var.j();
            try {
                if (j == null) {
                    throw new IOException("Invalid input stream");
                }
                int i = qz40Var.a;
                if (!qz40Var.b) {
                    str3 = "windows-1251";
                }
                String str4 = (String) qz40Var.d;
                if (str4 != null) {
                    str3 = str4;
                }
                JCPLogger.fineFormat("Response code: {0}, response message: {1}", Integer.valueOf(i), (String) qz40Var.c);
                JCPLogger.fineFormat("Response content encoding: {0}, default output stream charset: {1}", str3, getDefaultCharset());
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(j, str3));
                String str5 = "";
                String str6 = "";
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    str6 = str6 + readLine;
                    str5 = str5 + readLine + Constants.LINE_SEPARATOR;
                }
                bufferedReader.close();
                JCPLogger.fine(str5);
                if (i == 200) {
                    HttpURLConnection httpURLConnection2 = (HttpURLConnection) qz40Var.f;
                    if (httpURLConnection2 != null) {
                        httpURLConnection2.disconnect();
                    }
                    return str6;
                }
                throw new Exception("Server has returned an invalid http code: " + i + ", message: " + str5);
            } catch (Throwable th) {
                th = th;
                dt61Var = qz40Var;
                if (dt61Var != null && (httpURLConnection = (HttpURLConnection) ((qz40) dt61Var).f) != null) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static String getHttpPostFileUsingData(String str, String str2, CAUser cAUser, byte[] bArr) throws Exception {
        return getHttpPostFile(str, str2, cAUser, FORM_HEADERS(), null, bArr);
    }

    public static String getHttpPostFileUsingProps(String str, String str2, CAUser cAUser, Properties properties) throws Exception {
        return getHttpPostFile(str, str2, cAUser, FORM_HEADERS(), properties, null);
    }
}
