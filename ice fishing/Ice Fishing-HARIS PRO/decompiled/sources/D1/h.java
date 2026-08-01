package D1;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import u.AbstractC0357e;

/* loaded from: classes.dex */
public abstract /* synthetic */ class h {
    public static final void a(View view, int i) {
        i.e(view, "view");
        int a2 = AbstractC0357e.a(i);
        if (a2 == 0) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                }
                viewGroup.removeView(view);
                return;
            }
            return;
        }
        if (a2 == 1) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            view.setVisibility(0);
            return;
        }
        if (a2 == 2) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
            }
            view.setVisibility(8);
            return;
        }
        if (a2 != 3) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
        }
        view.setVisibility(4);
    }

    public static int b(String str, int i, int i2) {
        return (str.hashCode() + i) * i2;
    }

    public static Object c(Bundle bundle, String str, String str2, String str3, String str4) {
        i.e(bundle, str);
        i.e(str2, str3);
        return bundle.get(str4);
    }

    public static String d(RecyclerView recyclerView, StringBuilder sb) {
        sb.append(recyclerView.B());
        return sb.toString();
    }

    public static String e(String str, int i) {
        return str + i;
    }

    public static String f(String str, String str2) {
        return str + str2;
    }

    public static String g(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String h(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static /* synthetic */ void i(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ void j(String str, int i) {
        if (i != 0) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(i.f(str));
        i.g(nullPointerException, i.class.getName());
        throw nullPointerException;
    }

    public static /* synthetic */ String k(int i) {
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

    public static /* synthetic */ String l(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "REMOVING" : "ADDING" : "NONE";
    }

    public static /* synthetic */ String m(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "INVISIBLE" : "GONE" : "VISIBLE" : "REMOVED";
    }
}
