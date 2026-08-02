package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.glance.appwidget.BoxChildSelector;
import androidx.glance.appwidget.ContainerInfo;
import androidx.glance.appwidget.ContainerSelector;
import androidx.glance.appwidget.LayoutInfo;
import androidx.glance.appwidget.RowColumnChildSelector;
import androidx.glance.appwidget.SizeSelector;
import androidx.media3.common.util.Util;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KMutableProperty1;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class Fragment$5$$ExternalSyntheticOutline0 {
    public static final void _applyState(int i, View view, ViewGroup viewGroup) {
        view.getClass();
        viewGroup.getClass();
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Calling apply state");
        }
        int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(i);
        if (ordinal == 0) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup2);
                }
                viewGroup2.removeView(view);
                return;
            }
            return;
        }
        if (ordinal == 1) {
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            ViewParent parent2 = view.getParent();
            if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Adding view " + view + " to Container " + viewGroup);
                }
                viewGroup.addView(view);
            }
            view.setVisibility(0);
            return;
        }
        if (ordinal == 2) {
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
            }
            view.setVisibility(8);
            return;
        }
        if (ordinal != 3) {
            return;
        }
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
        }
        view.setVisibility(4);
    }

    public static int[] _values() {
        return CameraSelector$$ExternalSyntheticOutline0.values(9);
    }

    public static String m(String str, Fragment fragment, String str2) {
        return str + fragment + str2;
    }

    public static void m$1(int i, int i2, int i3, int i4, int i5) {
        Util.intToStringMaxRadix(i);
        Util.intToStringMaxRadix(i2);
        Util.intToStringMaxRadix(i3);
        Util.intToStringMaxRadix(i4);
        Util.intToStringMaxRadix(i5);
    }

    public static /* synthetic */ String name(int i) {
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

    public static /* synthetic */ String stringValueOf$1(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "REMOVING" : "ADDING" : "NONE";
    }

    public static /* synthetic */ String stringValueOf$2(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "INVISIBLE" : "GONE" : "VISIBLE" : "REMOVED";
    }

    public static /* synthetic */ String stringValueOf$3(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "MatchParent" : "Expand" : "Fixed" : "Wrap";
    }

    public static String m(int i, int i2, String str) {
        return str.substring(str.indexOf(i) + i2);
    }

    public static int m$1(int i, int i2, int i3, int i4) {
        return ((i * i2) + i3) * i4;
    }

    public static String m(Exception exc, StringBuilder sb) {
        sb.append(exc.getMessage());
        return sb.toString();
    }

    public static int m(double d, int i, int i2) {
        return (Double.hashCode(d) + i) * i2;
    }

    public static String m(String str, String str2, boolean z) {
        return str + z + str2;
    }

    public static Pair m(int i, int i2, Integer num) {
        return new Pair(new SizeSelector(i, i2), num);
    }

    public static Pair m(int i, BoxChildSelector boxChildSelector) {
        return new Pair(boxChildSelector, new LayoutInfo(i));
    }

    public static Pair m(int i, ContainerSelector containerSelector) {
        return new Pair(containerSelector, new ContainerInfo(i));
    }

    public static Pair m(int i, RowColumnChildSelector rowColumnChildSelector) {
        return new Pair(rowColumnChildSelector, new LayoutInfo(i));
    }

    public static KMutableProperty1 m(Class cls, String str, String str2, int i, ReflectionFactory reflectionFactory) {
        return reflectionFactory.mutableProperty1(new MutablePropertyReference1Impl(cls, str, str2, i));
    }

    public static /* synthetic */ void m() {
    }

    public static void m(int i, int i2, int i3, int i4, int i5) {
        KeyEventType.Key(i);
        KeyEventType.Key(i2);
        KeyEventType.Key(i3);
        KeyEventType.Key(i4);
        KeyEventType.Key(i5);
    }

    public static void m(int i, int i2, String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
    }

    public static void m(int i, Integer num, String str, String str2, HashMap hashMap) {
        hashMap.put(str, num);
        hashMap.put(str2, Integer.valueOf(i));
    }

    public static void m(int i, String str, String str2) {
        androidx.media3.common.util.Log.w(str2, str + i);
    }

    public static void m(int i, HashMap hashMap, String str, int i2, String str2) {
        hashMap.put(str, Integer.valueOf(i));
        hashMap.put(str2, Integer.valueOf(i2));
    }

    public static void m(long j, String str, String str2, StringBuilder sb) {
        sb.append(j);
        sb.append(str);
        sb.append(str2);
    }

    public static /* synthetic */ void m(View view) {
        if (view == null) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$1();
    }

    public static void m(String str, String str2, String str3) {
        androidx.media3.common.util.Log.w(str3, str + str2);
    }

    public static /* synthetic */ void m(List list) {
        if (list == null) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$1();
    }

    public static int m(int i, int i2, int i3, int i4) {
        return ((i + i2) - i3) / i4;
    }
}
