package defpackage;

import androidx.fragment.app.a;
import androidx.fragment.app.y;
import com.connectsdk.core.Util;
import com.connectsdk.service.capability.listeners.ResponseListener;
import com.connectsdk.service.command.ServiceCommandError;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class su4 {
    public static /* synthetic */ String A(int i) {
        switch (i) {
            case 1:
                return "INITIALIZE";
            case 2:
                return "RESOURCE_CACHE";
            case 3:
                return "DATA_CACHE";
            case 4:
                return "SOURCE";
            case 5:
                return "ENCODE";
            case 6:
                return "FINISHED";
            default:
                return "null";
        }
    }

    public static int a(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            default:
                return 0;
        }
    }

    public static final int b(int i) {
        if (i == 11) {
            xq0.x("Can't get the number of an unknown enum value.");
            return 0;
        }
        switch (i) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 9;
            case 11:
                return -1;
            default:
                throw null;
        }
    }

    public static /* synthetic */ int c(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    if (i == 4) {
                        return 4;
                    }
                    throw null;
                }
            }
        }
        return i2;
    }

    public static /* synthetic */ String d(int i) {
        if (i == 1) {
            return null;
        }
        if (i == 2) {
            return "only_me";
        }
        if (i == 3) {
            return "friends";
        }
        if (i == 4) {
            return "everyone";
        }
        throw null;
    }

    public static float e(float f, float f2, float f3, float f4) {
        return ((f - f2) * f3) + f4;
    }

    public static int f(Set set, int i, int i2) {
        return (set.hashCode() + i) * i2;
    }

    public static long g(int i, long j) {
        return up6.z(Integer.valueOf(i)) + j;
    }

    public static long h(long j, long j2, long j3, long j4, long j5) {
        return (((j * j2) + j3) * j4) + j5;
    }

    public static pjc i(Object obj, v55 v55Var) {
        qgg.h0(obj);
        return v55Var.r().getData();
    }

    public static qne j(vtm vtmVar, String str, String str2, String str3, vtm vtmVar2) {
        vtmVar.w(str, str2);
        return new qne(str3, vtmVar2);
    }

    public static vtm k(String str, LinkedHashMap linkedHashMap, String str2, LinkedHashMap linkedHashMap2) {
        linkedHashMap.put(str2, new jkr(str));
        return new vtm((Map) linkedHashMap2);
    }

    public static a l(y yVar, y yVar2) {
        yVar.getClass();
        return new a(yVar2);
    }

    public static String m(float f, String str, StringBuilder sb) {
        sb.append(f);
        sb.append(str);
        return sb.toString();
    }

    public static String n(String str, StringBuilder sb) {
        return str + ((Object) sb);
    }

    public static String o(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static String p(Throwable th, StringBuilder sb) {
        sb.append(th.getMessage());
        return sb.toString();
    }

    public static ArrayList q(Object obj) {
        qgg.h0(obj);
        return new ArrayList();
    }

    public static LinkedHashMap r(String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(str, str2);
        return linkedHashMap;
    }

    public static void s(int i, Object obj, String str, String str2) {
        Assertions.throwOrSkip$default(new FailedAssertionException(str), str2, i, obj);
    }

    public static void t(int i, String str, Object obj, ResponseListener responseListener) {
        Util.postError(responseListener, new ServiceCommandError(i, str, obj));
    }

    public static void u(int i, HashMap hashMap, String str, int i2, String str2) {
        hashMap.put(str, Integer.valueOf(i));
        hashMap.put(str2, Integer.valueOf(i2));
    }

    public static void v(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    public static void w(HashMap hashMap, String str, Integer num, int i, String str2) {
        hashMap.put(str, num);
        hashMap.put(str2, Integer.valueOf(i));
    }

    public static /* synthetic */ String x(int i) {
        switch (i) {
            case 1:
                return "NONE";
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            case 9:
                return "CENTER_Y";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String y(int i) {
        if (i == 1) {
            return "NONE";
        }
        if (i == 2) {
            return "ONLY_ME";
        }
        if (i == 3) {
            return "FRIENDS";
        }
        if (i == 4) {
            return "EVERYONE";
        }
        throw null;
    }

    public static /* synthetic */ String z(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "MEMORY_CACHE" : "RESOURCE_DISK_CACHE" : "DATA_DISK_CACHE" : "REMOTE" : "LOCAL";
    }
}
