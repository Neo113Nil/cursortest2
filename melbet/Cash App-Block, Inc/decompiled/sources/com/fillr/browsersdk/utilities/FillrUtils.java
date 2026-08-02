package com.fillr.browsersdk.utilities;

import com.caverock.androidsvg.SVG;
import com.fillr.browsersdk.Fillr;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Scanner;

/* loaded from: classes4.dex */
public abstract class FillrUtils {
    public static final String[] EXCLUDED_DOMAINS = {".*\\.mplore\\.com"};

    public static boolean isWebContentLikelyHtml(String str, String str2) {
        return (str2 == null || str2.contains("html")) && !(str.matches("^\\s*\\{(.|\\R)*\\}\\s*$") || str.matches("^\\s*\\[(.|\\R)*\\]\\s*$"));
    }

    public static String sanitiseJsonString(String str) {
        return str.replaceAll("(\\\\t|\\\\n|\\\\r|%0A)", " ").replaceAll("(?<!\\\\)'", "\\\\'").replaceAll("\\\\\"", "").replaceAll("%([a-fA-F0-9]{2})", "%25$1");
    }

    public static byte[] streamToBytes(InputStream inputStream) {
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } catch (Exception unused) {
                SVG svg = Fillr.getInstance().fillrConfig;
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static String streamToString(InputStream inputStream) {
        try {
            String next = new Scanner(inputStream, "UTF-8").useDelimiter("\\A").next();
            inputStream.close();
            return next;
        } catch (Exception unused) {
            return null;
        }
    }
}
