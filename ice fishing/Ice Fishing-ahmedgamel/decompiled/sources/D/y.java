package D;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import u.AbstractC5049e;

/* loaded from: classes.dex */
public abstract /* synthetic */ class y {
    public static /* synthetic */ String A(int i) {
        return i != 1 ? i != 2 ? "null" : "LATEST" : "LEGACY";
    }

    public static /* synthetic */ String B(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "REMOVING" : "ADDING" : "NONE";
    }

    public static /* synthetic */ String C(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "INVISIBLE" : "GONE" : "VISIBLE" : "REMOVED";
    }

    public static final void a(int i, View view) {
        kotlin.jvm.internal.h.e(view, "view");
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                if (androidx.fragment.app.N.E(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                }
                viewGroup.removeView(view);
                return;
            }
            return;
        }
        if (d2 == 1) {
            if (androidx.fragment.app.N.E(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            view.setVisibility(0);
            return;
        }
        if (d2 == 2) {
            if (androidx.fragment.app.N.E(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
            }
            view.setVisibility(8);
            return;
        }
        if (d2 != 3) {
            return;
        }
        if (androidx.fragment.app.N.E(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
        }
        view.setVisibility(4);
    }

    public static final boolean b(int i) {
        return i == 3 || i == 4 || i == 6;
    }

    public static /* synthetic */ String c(int i) {
        if (i == 1) {
            return "otel.sdk.exporter.span";
        }
        if (i == 2) {
            return "otel.sdk.exporter.metric_data_point";
        }
        if (i == 3) {
            return "otel.sdk.exporter.log";
        }
        if (i == 4) {
            return "TBD";
        }
        throw null;
    }

    public static /* synthetic */ boolean d(int i) {
        if (i == 1 || i == 2 || i == 3) {
            return false;
        }
        if (i == 4 || i == 5) {
            return true;
        }
        throw null;
    }

    public static /* synthetic */ String e(int i) {
        if (i == 1) {
            return "span";
        }
        if (i == 2) {
            return "data_point";
        }
        if (i == 3) {
            return "log_record";
        }
        if (i == 4) {
            return "TBD";
        }
        throw null;
    }

    public static com.anythink.core.common.res.b f() {
        return com.anythink.core.common.res.b.a(com.anythink.core.common.d.t.b().g());
    }

    public static com.anythink.core.d.b g(com.anythink.core.d.d dVar) {
        return dVar.b(com.anythink.core.common.d.t.b().p());
    }

    public static com.anythink.core.d.d h() {
        return com.anythink.core.d.d.a(com.anythink.core.common.d.t.b().g());
    }

    public static ClassCastException i(Object obj) {
        obj.getClass();
        return new ClassCastException();
    }

    public static ClassCastException j(Iterator it) {
        it.next().getClass();
        return new ClassCastException();
    }

    public static String k(int i, String str, String str2) {
        return str + i + str2;
    }

    public static String l(int i, String str, String str2, StringBuilder sb) {
        sb.append(i);
        return str.replaceAll(str2, sb.toString());
    }

    public static String m(int i, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(i);
        return sb.toString();
    }

    public static String n(Context context, float f3, StringBuilder sb, String str, String str2) {
        sb.append(com.anythink.core.common.v.q.b(context, f3));
        return str.replaceAll(str2, sb.toString());
    }

    public static String o(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String p(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static String q(StringBuilder sb, int i, char c9) {
        sb.append(i);
        sb.append(c9);
        return sb.toString();
    }

    public static String r(StringBuilder sb, String str, int i, String str2, int i6) {
        sb.append(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i6);
        return sb.toString();
    }

    public static String s(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    public static HashMap t(Class cls, Y3.a aVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, aVar);
        return hashMap;
    }

    public static Map u(HashMap hashMap) {
        return Collections.unmodifiableMap(new HashMap(hashMap));
    }

    public static /* synthetic */ void v(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static void w(String str, String str2) {
        com.anythink.core.common.u.e.b(str, str2, com.anythink.core.common.d.t.b().r());
    }

    public static void x(StringBuilder sb, String str, long j6, String str2) {
        sb.append(str);
        sb.append(j6);
        sb.append(str2);
    }

    public static /* synthetic */ String y(int i) {
        switch (i) {
            case 1:
                return "NOT_REQUIRED";
            case 2:
                return "CONNECTED";
            case 3:
                return "UNMETERED";
            case 4:
                return "NOT_ROAMING";
            case 5:
                return "METERED";
            case 6:
                return "TEMPORARILY_UNMETERED";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String z(int i) {
        switch (i) {
            case 1:
                return "ENQUEUED";
            case 2:
                return "RUNNING";
            case 3:
                return "SUCCEEDED";
            case 4:
                return "FAILED";
            case 5:
                return "BLOCKED";
            case 6:
                return "CANCELLED";
            default:
                return "null";
        }
    }
}
