package D;

import a4.C0437a;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import com.IceFishing.LiveIceFishing.GzopActiongamesActivity;
import com.IceFishing.LiveIceFishing.GzopAdventuregamesActivity;
import com.IceFishing.LiveIceFishing.GzopArcadegamesActivity;
import com.IceFishing.LiveIceFishing.GzopPuzzleLogicActivity;
import com.IceFishing.LiveIceFishing.GzopSportsRacinggamesActivity;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import u.AbstractC5050e;

/* loaded from: classes.dex */
public abstract /* synthetic */ class x {
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
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
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
        if (d9 == 1) {
            if (androidx.fragment.app.N.E(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            view.setVisibility(0);
            return;
        }
        if (d9 == 2) {
            if (androidx.fragment.app.N.E(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
            }
            view.setVisibility(8);
            return;
        }
        if (d9 != 3) {
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

    public static L1.a f(String str, com.bumptech.glide.p pVar) {
        return pVar.k(Uri.parse(str)).o();
    }

    public static com.bumptech.glide.p g(com.bumptech.glide.n nVar, ImageView imageView, GzopAdventuregamesActivity gzopAdventuregamesActivity) {
        nVar.E(imageView);
        return com.bumptech.glide.c.c(gzopAdventuregamesActivity.getApplicationContext());
    }

    public static ClassCastException h(Object obj) {
        obj.getClass();
        return new ClassCastException();
    }

    public static ClassCastException i(Iterator it) {
        it.next().getClass();
        return new ClassCastException();
    }

    public static String j(int i, String str, String str2) {
        return str + i + str2;
    }

    public static String k(int i, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(i);
        return sb.toString();
    }

    public static String l(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String m(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static String n(StringBuilder sb, int i, char c9) {
        sb.append(i);
        sb.append(c9);
        return sb.toString();
    }

    public static String o(StringBuilder sb, String str, int i, String str2, int i4) {
        sb.append(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i4);
        return sb.toString();
    }

    public static String p(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    public static HashMap q(Class cls, C0437a c0437a) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, c0437a);
        return hashMap;
    }

    public static Map r(HashMap hashMap) {
        return Collections.unmodifiableMap(new HashMap(hashMap));
    }

    public static void s(GzopActiongamesActivity gzopActiongamesActivity, int i, View view) {
        view.startAnimation(AnimationUtils.loadAnimation(gzopActiongamesActivity.getApplicationContext(), i));
    }

    public static void t(GzopAdventuregamesActivity gzopAdventuregamesActivity, int i, View view) {
        view.startAnimation(AnimationUtils.loadAnimation(gzopAdventuregamesActivity.getApplicationContext(), i));
    }

    public static void u(GzopArcadegamesActivity gzopArcadegamesActivity, int i, View view) {
        view.startAnimation(AnimationUtils.loadAnimation(gzopArcadegamesActivity.getApplicationContext(), i));
    }

    public static void v(GzopPuzzleLogicActivity gzopPuzzleLogicActivity, int i, View view) {
        view.startAnimation(AnimationUtils.loadAnimation(gzopPuzzleLogicActivity.getApplicationContext(), i));
    }

    public static void w(GzopSportsRacinggamesActivity gzopSportsRacinggamesActivity, int i, View view) {
        view.startAnimation(AnimationUtils.loadAnimation(gzopSportsRacinggamesActivity.getApplicationContext(), i));
    }

    public static /* synthetic */ void x(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
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
