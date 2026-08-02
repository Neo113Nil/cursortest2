package defpackage;

import android.os.Parcel;
import androidx.datastore.preferences.protobuf.j;
import com.connectsdk.service.webos.lgcast.common.utils.Logger;
import com.google.crypto.tink.shaded.protobuf.a;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class hrg {
    public static String A(String str, String str2, String str3, String str4) {
        str.getClass();
        return str2 + str3 + str4;
    }

    public static int B(int i, int i2, int i3, int i4) {
        return ((i / i2) * i3) + i4;
    }

    public static /* synthetic */ String C(int i) {
        switch (i) {
            case 1:
                return "NATIVE_WITH_FALLBACK";
            case 2:
                return "NATIVE_ONLY";
            case 3:
                return "KATANA_ONLY";
            case 4:
                return "WEB_ONLY";
            case 5:
                return "WEB_VIEW_ONLY";
            case 6:
                return "DIALOG_ONLY";
            case 7:
                return "DEVICE_AUTH";
            default:
                throw null;
        }
    }

    public static final String a(int i) {
        int D = ouj.D(i);
        if (D == 0) {
            return "integrity_detect";
        }
        if (D == 1) {
            return "app_event_pred";
        }
        b6e.s();
        return null;
    }

    public static final String b(int i) {
        int D = ouj.D(i);
        if (D == 0) {
            return "MTML_INTEGRITY_DETECT";
        }
        if (D == 1) {
            return "MTML_APP_EVENT_PRED";
        }
        b6e.s();
        return null;
    }

    public static /* synthetic */ boolean c(int i) {
        switch (i) {
            case 1:
                return true;
            case 2:
            case 3:
                return false;
            case 4:
                return true;
            case 5:
                return false;
            case 6:
                return true;
            case 7:
                return false;
            default:
                throw null;
        }
    }

    public static /* synthetic */ String d(int i) {
        if (i == 1) {
            return "success";
        }
        if (i == 2) {
            return "cancel";
        }
        if (i == 3) {
            return "error";
        }
        throw null;
    }

    public static /* synthetic */ String e(int i) {
        if (i == 1) {
            return "facebook";
        }
        if (i == 2) {
            return "instagram";
        }
        throw null;
    }

    public static float f(Number number, float f, float f2) {
        return (number.floatValue() * f) + f2;
    }

    public static int g(int i, int i2, int i3) {
        return a.h(i) + i2 + i3;
    }

    public static int h(int i, int i2, int i3, int i4) {
        return j.j(i) + i2 + i3 + i4;
    }

    public static xqn i(Object obj) {
        qgg.h0(obj);
        return new xqn();
    }

    public static ClassCastException j(Iterator it) {
        it.next().getClass();
        return new ClassCastException();
    }

    public static Object k(int i) {
        return xz0.E(i, new Throwable().getStackTrace());
    }

    public static String l(char c, String str, String str2) {
        return str + c + str2;
    }

    public static String m(long j, String str, StringBuilder sb) {
        sb.append(j);
        sb.append(str);
        return sb.toString();
    }

    public static String n(Object obj, String str) {
        return str + obj;
    }

    public static String o(String str, int i, char c) {
        return str + i + c;
    }

    public static String p(String str, int i, String str2, String str3) {
        return str + i + str2 + str3;
    }

    public static String q(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String r(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String s(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static String t(String str, boolean z, String str2, boolean z2, String str3) {
        return str + z + str2 + z2 + str3;
    }

    public static StringBuilder u(String str, String str2, Object[] objArr) {
        Logger.debug(str, objArr);
        return new StringBuilder(str2);
    }

    public static Iterator v(Parcel parcel, int i, List list) {
        parcel.writeInt(i);
        parcel.writeInt(list.size());
        return list.iterator();
    }

    public static void w(int i, int i2, String str, String str2, StringBuilder sb) {
        sb.append(i);
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
    }

    public static void x(rsr rsrVar, String str, String str2, String str3, String str4) {
        rsrVar.execSQL(str);
        rsrVar.execSQL(str2);
        rsrVar.execSQL(str3);
        rsrVar.execSQL(str4);
    }

    public static int y(int i, int i2, int i3) {
        return j.i(i) + i2 + i3;
    }

    public static int z(int i, int i2, int i3, int i4) {
        return a.i(i) + i2 + i3 + i4;
    }
}
