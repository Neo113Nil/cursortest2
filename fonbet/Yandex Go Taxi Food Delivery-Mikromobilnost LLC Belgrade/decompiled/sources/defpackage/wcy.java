package defpackage;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes11.dex */
public final class wcy {
    public static final ga0 b = new ga0("LibraryVersion", "");
    public static final wcy c = new wcy();
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    /* JADX WARN: Removed duplicated region for block: B:15:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String a(String str) {
        IOException e;
        String str2;
        InputStream inputStream;
        ga0 ga0Var = b;
        cvw.j(str, "Please provide a valid libraryName");
        ConcurrentHashMap concurrentHashMap = this.a;
        if (concurrentHashMap.containsKey(str)) {
            return (String) concurrentHashMap.get(str);
        }
        Properties properties = new Properties();
        InputStream inputStream2 = null;
        r5 = null;
        String str3 = null;
        InputStream inputStream3 = null;
        try {
            try {
                inputStream = wcy.class.getResourceAsStream("/" + str + ".properties");
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e2) {
            e = e2;
            str2 = null;
        }
        try {
            if (inputStream != null) {
                properties.load(inputStream);
                str3 = properties.getProperty("version", null);
                new StringBuilder(String.valueOf(str).length() + 12 + String.valueOf(str3).length());
                Log.isLoggable(ga0Var.a, 2);
            } else {
                new StringBuilder(String.valueOf(str).length() + 43);
                Log.isLoggable(ga0Var.a, 5);
            }
        } catch (IOException e3) {
            e = e3;
            String str4 = str3;
            inputStream2 = inputStream;
            str2 = str4;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 43);
            sb.append("Failed to get app version for libraryName: ");
            sb.append(str);
            String sb2 = sb.toString();
            if (Log.isLoggable(ga0Var.a, 6)) {
                String str5 = ga0Var.b;
                if (str5 != null) {
                    sb2 = str5.concat(sb2);
                }
                Log.e("LibraryVersion", sb2, e);
            }
            InputStream inputStream4 = inputStream2;
            str3 = str2;
            inputStream = inputStream4;
            if (inputStream != null) {
            }
            if (str3 == null) {
            }
            concurrentHashMap.put(str, str3);
            return str3;
        } catch (Throwable th2) {
            th = th2;
            inputStream3 = inputStream;
            if (inputStream3 != null) {
                b3b1.b(inputStream3);
            }
            throw th;
        }
        if (inputStream != null) {
            b3b1.b(inputStream);
        }
        if (str3 == null) {
            Log.isLoggable(ga0Var.a, 3);
            str3 = "UNKNOWN";
        }
        concurrentHashMap.put(str, str3);
        return str3;
    }
}
