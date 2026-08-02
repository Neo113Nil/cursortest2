package defpackage;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;
import ru.cprocsp.NGate.tools.Constants;

/* loaded from: classes4.dex */
public abstract class r3x0 {
    public static final i3y a;
    public static final i3y b;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        a = a.b(lazyThreadSafetyMode, new dvw0(5));
        b = a.b(lazyThreadSafetyMode, new dvw0(6));
    }

    public static String a(String str) {
        Method method = (Method) b.getValue();
        String str2 = null;
        r2 = null;
        Object obj = null;
        if (method != null) {
            try {
                Object invoke = method.invoke(null, new Object[]{str});
                if (invoke != null ? invoke instanceof String : true) {
                    obj = invoke;
                }
            } catch (Throwable unused) {
            }
            str2 = (String) obj;
        }
        if (str2 != null) {
            return str2;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop ".concat(str)).getInputStream(), uza.a), 8192);
            try {
                String readLine = bufferedReader.readLine();
                bufferedReader.close();
                return readLine;
            } finally {
            }
        } catch (Throwable unused2) {
            return "";
        }
    }

    public static Boolean b(String str) {
        String a2 = a(str);
        switch (a2.hashCode()) {
            case 48:
                if (!a2.equals("0")) {
                    return null;
                }
                return Boolean.FALSE;
            case 49:
                if (!a2.equals("1")) {
                    return null;
                }
                break;
            case 110:
                if (!a2.equals("n")) {
                    return null;
                }
                return Boolean.FALSE;
            case Constants.VPN_TRAFFIC /* 121 */:
                if (!a2.equals(RemoteBioParameters.Y)) {
                    return null;
                }
                break;
            case 3521:
                if (!a2.equals("no")) {
                    return null;
                }
                return Boolean.FALSE;
            case 3551:
                if (!a2.equals("on")) {
                    return null;
                }
                break;
            case 109935:
                if (!a2.equals("off")) {
                    return null;
                }
                return Boolean.FALSE;
            case 119527:
                if (!a2.equals("yes")) {
                    return null;
                }
                break;
            case 3569038:
                if (!a2.equals("true")) {
                    return null;
                }
                break;
            case 97196323:
                if (!a2.equals("false")) {
                    return null;
                }
                return Boolean.FALSE;
            default:
                return null;
        }
        return Boolean.TRUE;
    }
}
