package defpackage;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class b9xEq24R1 implements i7, fh, fl, y70, s8, wu0, k41, r61 {
    public static v5 rezfBrjOrqK;
    public final /* synthetic */ int OOA6hdeuvCS;
    public static final r6 EljAMC1QTz = new r6(-1.0f, -1.0f);
    public static final r6 AvO7iQsrTN = new r6(0.0f, -1.0f);
    public static final r6 encWxUiV2 = new r6(1.0f, -1.0f);
    public static final r6 mOu10nynGul = new r6(-1.0f, 0.0f);
    public static final r6 JFJ3QoxA = new r6(0.0f, 0.0f);
    public static final r6 rQPn8YBR = new r6(1.0f, 0.0f);
    public static final r6 E7jCp8Ls = new r6(-1.0f, 1.0f);
    public static final r6 XnEVoBF0td1l = new r6(0.0f, 1.0f);
    public static final r6 uFEq9NpZ = new r6(1.0f, 1.0f);
    public static final q6 iwATDS1i01k = new q6(-1.0f);
    public static final q6 WIEu4Ya2g8 = new q6(0.0f);
    public static final p6 YmKjaVtbfp5Z = new p6(-1.0f);
    public static final p6 Mjvvu5DE = new p6(0.0f);
    public static final p6 mE4lRynR = new p6(1.0f);
    public static final b9xEq24R1 jivtDDk9H = new b9xEq24R1(1);
    public static final b9xEq24R1 Y6hRI1cF8 = new b9xEq24R1(2);
    public static final b9xEq24R1 cilMamHF = new b9xEq24R1(3);
    public static final o4 lv06NcmrQ = new o4(3);
    public static final x WdrkLMV3xh = new x(1);
    public static final x WRKkgoJXwDn = new x(2);
    public static final /* synthetic */ b9xEq24R1 arNh8D4Z5gB = new b9xEq24R1(6);
    public static final /* synthetic */ b9xEq24R1 pog2g9KITJA = new b9xEq24R1(7);
    public static final b9xEq24R1 M3K9sHhK = new b9xEq24R1(8);
    public static final b9xEq24R1 k8h8IjolWQ = new b9xEq24R1(9);
    public static final b9xEq24R1 EXrPz3p7hFb = new b9xEq24R1(10);
    public static final b9xEq24R1 ozMwhSAI = new b9xEq24R1(11);
    public static final p50 AEn1Rrio = p50.OOA6hdeuvCS;
    public static final hl YZjbz8VdP5 = new hl(1.0f, 1.0f);
    public static final b9xEq24R1 eUH21U3apd = new b9xEq24R1(12);
    public static final b9xEq24R1 A1EKNP6CxJ = new b9xEq24R1(13);
    public static final kt0 MZhzXH72 = new kt0(Float.NaN, Float.NaN, Float.NaN, Float.NaN);
    public static final b9xEq24R1 DmJncFq5 = new b9xEq24R1(15);
    public static final b9xEq24R1 HFYAaqMd6 = new b9xEq24R1(16);
    public static final /* synthetic */ b9xEq24R1 TpUsjqg3bxO = new b9xEq24R1(17);
    public static final /* synthetic */ b9xEq24R1 dqB83aoLBB = new b9xEq24R1(18);
    public static final /* synthetic */ b9xEq24R1 VeqTn1PQw7 = new b9xEq24R1(19);
    public static final /* synthetic */ b9xEq24R1 z19UFEN2I = new b9xEq24R1(20);
    public static final /* synthetic */ b9xEq24R1 YXi2hvwn7WL = new b9xEq24R1(21);
    public static final b9xEq24R1 CMh55RymNfS = new b9xEq24R1(22);
    public static final b9xEq24R1 qugwajBSa59j = new b9xEq24R1(23);
    public static final b9xEq24R1 J3Xc8BaqpN8 = new b9xEq24R1(24);
    public static final b9xEq24R1 MItybXapHX = new b9xEq24R1(25);
    public static final /* synthetic */ b9xEq24R1 MjxSquD6Av = new b9xEq24R1(26);
    public static final b9xEq24R1 Uxq83abb04 = new b9xEq24R1(28);
    public static final b9xEq24R1 Fm8W7vP7q = new b9xEq24R1(29);

    public /* synthetic */ b9xEq24R1(int i) {
        this.OOA6hdeuvCS = i;
    }

    public static void JFJ3QoxA(Object obj, fc1 fc1Var) {
        ay GWasM1elztuh;
        Map GWasM1elztuh2 = ((eg0) obj).GWasM1elztuh();
        gr0 uFEq9NpZ2 = ir0.uFEq9NpZ();
        for (Map.Entry entry : GWasM1elztuh2.entrySet()) {
            dr0 dr0Var = (dr0) entry.getKey();
            Object value = entry.getValue();
            String str = dr0Var.GWasM1elztuh;
            if (value instanceof Boolean) {
                lr0 EXrPz3p7hFb2 = nr0.EXrPz3p7hFb();
                boolean booleanValue = ((Boolean) value).booleanValue();
                EXrPz3p7hFb2.X1lG3V04pd();
                nr0.YmKjaVtbfp5Z((nr0) EXrPz3p7hFb2.EljAMC1QTz, booleanValue);
                GWasM1elztuh = EXrPz3p7hFb2.GWasM1elztuh();
            } else if (value instanceof Float) {
                lr0 EXrPz3p7hFb3 = nr0.EXrPz3p7hFb();
                float floatValue = ((Number) value).floatValue();
                EXrPz3p7hFb3.X1lG3V04pd();
                nr0.Mjvvu5DE((nr0) EXrPz3p7hFb3.EljAMC1QTz, floatValue);
                GWasM1elztuh = EXrPz3p7hFb3.GWasM1elztuh();
            } else if (value instanceof Double) {
                lr0 EXrPz3p7hFb4 = nr0.EXrPz3p7hFb();
                double doubleValue = ((Number) value).doubleValue();
                EXrPz3p7hFb4.X1lG3V04pd();
                nr0.iwATDS1i01k((nr0) EXrPz3p7hFb4.EljAMC1QTz, doubleValue);
                GWasM1elztuh = EXrPz3p7hFb4.GWasM1elztuh();
            } else if (value instanceof Integer) {
                lr0 EXrPz3p7hFb5 = nr0.EXrPz3p7hFb();
                int intValue = ((Number) value).intValue();
                EXrPz3p7hFb5.X1lG3V04pd();
                nr0.mE4lRynR((nr0) EXrPz3p7hFb5.EljAMC1QTz, intValue);
                GWasM1elztuh = EXrPz3p7hFb5.GWasM1elztuh();
            } else if (value instanceof Long) {
                lr0 EXrPz3p7hFb6 = nr0.EXrPz3p7hFb();
                long longValue = ((Number) value).longValue();
                EXrPz3p7hFb6.X1lG3V04pd();
                nr0.E7jCp8Ls((nr0) EXrPz3p7hFb6.EljAMC1QTz, longValue);
                GWasM1elztuh = EXrPz3p7hFb6.GWasM1elztuh();
            } else if (value instanceof String) {
                lr0 EXrPz3p7hFb7 = nr0.EXrPz3p7hFb();
                EXrPz3p7hFb7.X1lG3V04pd();
                nr0.XnEVoBF0td1l((nr0) EXrPz3p7hFb7.EljAMC1QTz, (String) value);
                GWasM1elztuh = EXrPz3p7hFb7.GWasM1elztuh();
            } else if (value instanceof Set) {
                lr0 EXrPz3p7hFb8 = nr0.EXrPz3p7hFb();
                jr0 iwATDS1i01k2 = kr0.iwATDS1i01k();
                iwATDS1i01k2.X1lG3V04pd();
                kr0.E7jCp8Ls((kr0) iwATDS1i01k2.EljAMC1QTz, (Set) value);
                EXrPz3p7hFb8.X1lG3V04pd();
                nr0.uFEq9NpZ((nr0) EXrPz3p7hFb8.EljAMC1QTz, (kr0) iwATDS1i01k2.GWasM1elztuh());
                GWasM1elztuh = EXrPz3p7hFb8.GWasM1elztuh();
            } else {
                if (!(value instanceof byte[])) {
                    o4.jivtDDk9H("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                    return;
                }
                lr0 EXrPz3p7hFb9 = nr0.EXrPz3p7hFb();
                byte[] bArr = (byte[]) value;
                c9 X1lG3V04pd = c9.X1lG3V04pd(bArr, 0, bArr.length);
                EXrPz3p7hFb9.X1lG3V04pd();
                nr0.WIEu4Ya2g8((nr0) EXrPz3p7hFb9.EljAMC1QTz, X1lG3V04pd);
                GWasM1elztuh = EXrPz3p7hFb9.GWasM1elztuh();
            }
            uFEq9NpZ2.getClass();
            uFEq9NpZ2.X1lG3V04pd();
            ir0.E7jCp8Ls((ir0) uFEq9NpZ2.EljAMC1QTz).put(str, (nr0) GWasM1elztuh);
        }
        ir0 ir0Var = (ir0) uFEq9NpZ2.GWasM1elztuh();
        int GWasM1elztuh3 = ir0Var.GWasM1elztuh(null);
        Logger logger = pb.EljAMC1QTz;
        if (GWasM1elztuh3 > 4096) {
            GWasM1elztuh3 = 4096;
        }
        pb pbVar = new pb(fc1Var, GWasM1elztuh3);
        ir0Var.Yi7zF1RB1(pbVar);
        if (pbVar.xqGvceK5x > 0) {
            pbVar.rQPn8YBR();
        }
    }

    public static eg0 mOu10nynGul(FileInputStream fileInputStream) {
        byte[] bArr;
        try {
            ir0 iwATDS1i01k2 = ir0.iwATDS1i01k(fileInputStream);
            eg0 eg0Var = new eg0(false);
            er0[] er0VarArr = (er0[]) Arrays.copyOf(new er0[0], 0);
            eg0Var.Yi7zF1RB1();
            if (er0VarArr.length > 0) {
                er0 er0Var = er0VarArr[0];
                throw null;
            }
            Map XnEVoBF0td1l2 = iwATDS1i01k2.XnEVoBF0td1l();
            XnEVoBF0td1l2.getClass();
            for (Map.Entry entry : XnEVoBF0td1l2.entrySet()) {
                String str = (String) entry.getKey();
                nr0 nr0Var = (nr0) entry.getValue();
                str.getClass();
                nr0Var.getClass();
                int k8h8IjolWQ2 = nr0Var.k8h8IjolWQ();
                switch (k8h8IjolWQ2 == 0 ? -1 : fr0.GWasM1elztuh[mr0.YmKjaVtbfp5Z(k8h8IjolWQ2)]) {
                    case -1:
                        throw new uh("Value case is null.", null);
                    case 0:
                    default:
                        o4.xqGvceK5x();
                        return null;
                    case 1:
                        eg0Var.OOA6hdeuvCS(new dr0(str), Boolean.valueOf(nr0Var.jivtDDk9H()));
                        break;
                    case 2:
                        eg0Var.OOA6hdeuvCS(new dr0(str), Float.valueOf(nr0Var.WdrkLMV3xh()));
                        break;
                    case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                        eg0Var.OOA6hdeuvCS(new dr0(str), Double.valueOf(nr0Var.lv06NcmrQ()));
                        break;
                    case 4:
                        eg0Var.OOA6hdeuvCS(new dr0(str), Integer.valueOf(nr0Var.WRKkgoJXwDn()));
                        break;
                    case 5:
                        eg0Var.OOA6hdeuvCS(new dr0(str), Long.valueOf(nr0Var.arNh8D4Z5gB()));
                        break;
                    case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                        eg0Var.OOA6hdeuvCS(new dr0(str), nr0Var.pog2g9KITJA());
                        break;
                    case nr0.DOUBLE_FIELD_NUMBER /* 7 */:
                        dr0 dr0Var = new dr0(str);
                        h30 uFEq9NpZ2 = nr0Var.M3K9sHhK().uFEq9NpZ();
                        uFEq9NpZ2.getClass();
                        eg0Var.OOA6hdeuvCS(dr0Var, rb.Hc2GqxcqBiX(uFEq9NpZ2));
                        break;
                    case 8:
                        dr0 dr0Var2 = new dr0(str);
                        c9 Y6hRI1cF82 = nr0Var.Y6hRI1cF8();
                        int size = Y6hRI1cF82.size();
                        if (size == 0) {
                            bArr = i30.Yi7zF1RB1;
                        } else {
                            byte[] bArr2 = new byte[size];
                            Y6hRI1cF82.OOA6hdeuvCS(bArr2, size);
                            bArr = bArr2;
                        }
                        eg0Var.OOA6hdeuvCS(dr0Var2, bArr);
                        break;
                    case 9:
                        throw new uh("Value not set.", null);
                }
            }
            return new eg0(new LinkedHashMap(eg0Var.GWasM1elztuh()), true);
        } catch (w30 e) {
            throw new uh("Unable to parse preferences proto.", e);
        }
    }

    @Override // defpackage.fl
    public float AvO7iQsrTN(ContextWrapper contextWrapper) {
        return contextWrapper.getResources().getDisplayMetrics().density;
    }

    @Override // defpackage.i7
    public Rect EljAMC1QTz(Activity activity) {
        int safeInsetLeft;
        int safeInsetRight;
        int safeInsetTop;
        int safeInsetBottom;
        int safeInsetBottom2;
        int safeInsetRight2;
        int i = this.OOA6hdeuvCS;
        h7 h7Var = i7.GWasM1elztuh;
        DisplayCutout displayCutout = null;
        switch (i) {
            case 1:
                Rect rect = new Rect();
                Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
                defaultDisplay.getRectSize(rect);
                if (!activity.isInMultiWindowMode()) {
                    Point point = new Point();
                    defaultDisplay.getRealSize(point);
                    Resources resources = activity.getResources();
                    int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    int i2 = rect.bottom + dimensionPixelSize;
                    if (i2 == point.y) {
                        rect.bottom = i2;
                    } else {
                        int i3 = rect.right + dimensionPixelSize;
                        if (i3 == point.x) {
                            rect.right = i3;
                        }
                    }
                }
                return rect;
            case 2:
                Rect rect2 = new Rect();
                Configuration configuration = activity.getResources().getConfiguration();
                try {
                    Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(configuration);
                    if (activity.isInMultiWindowMode()) {
                        Object invoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                        invoke.getClass();
                        rect2.set((Rect) invoke);
                    } else {
                        Object invoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                        invoke2.getClass();
                        rect2.set((Rect) invoke2);
                    }
                } catch (Exception e) {
                    if (!(e instanceof NoSuchFieldException) && !(e instanceof NoSuchMethodException) && !(e instanceof IllegalAccessException) && !(e instanceof InvocationTargetException)) {
                        throw e;
                    }
                    h7Var.getClass();
                    Log.w(h7.Yi7zF1RB1, e);
                    activity.getWindowManager().getDefaultDisplay().getRectSize(rect2);
                }
                Display defaultDisplay2 = activity.getWindowManager().getDefaultDisplay();
                Point point2 = new Point();
                defaultDisplay2.getRealSize(point2);
                if (!activity.isInMultiWindowMode()) {
                    Resources resources2 = activity.getResources();
                    int identifier2 = resources2.getIdentifier("navigation_bar_height", "dimen", "android");
                    int dimensionPixelSize2 = identifier2 > 0 ? resources2.getDimensionPixelSize(identifier2) : 0;
                    int i4 = rect2.bottom + dimensionPixelSize2;
                    if (i4 == point2.y) {
                        rect2.bottom = i4;
                    } else {
                        int i5 = rect2.right + dimensionPixelSize2;
                        if (i5 == point2.x) {
                            rect2.right = i5;
                        } else if (rect2.left == dimensionPixelSize2) {
                            rect2.left = 0;
                        }
                    }
                }
                if ((rect2.width() < point2.x || rect2.height() < point2.y) && !activity.isInMultiWindowMode()) {
                    try {
                        Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
                        constructor.setAccessible(true);
                        Object newInstance = constructor.newInstance(null);
                        Method declaredMethod = defaultDisplay2.getClass().getDeclaredMethod("getDisplayInfo", newInstance.getClass());
                        declaredMethod.setAccessible(true);
                        declaredMethod.invoke(defaultDisplay2, newInstance);
                        Field declaredField2 = newInstance.getClass().getDeclaredField("displayCutout");
                        declaredField2.setAccessible(true);
                        Object obj2 = declaredField2.get(newInstance);
                        if (c4eaifQP.YmKjaVtbfp5Z(obj2)) {
                            displayCutout = c4eaifQP.OOA6hdeuvCS(obj2);
                        }
                    } catch (Exception e2) {
                        if (!(e2 instanceof ClassNotFoundException) && !(e2 instanceof NoSuchMethodException) && !(e2 instanceof NoSuchFieldException) && !(e2 instanceof IllegalAccessException) && !(e2 instanceof InvocationTargetException) && !(e2 instanceof InstantiationException)) {
                            throw e2;
                        }
                        h7Var.getClass();
                        Log.w(h7.Yi7zF1RB1, e2);
                    }
                    if (displayCutout != null) {
                        int i6 = rect2.left;
                        safeInsetLeft = displayCutout.getSafeInsetLeft();
                        if (i6 == safeInsetLeft) {
                            rect2.left = 0;
                        }
                        int i7 = point2.x - rect2.right;
                        safeInsetRight = displayCutout.getSafeInsetRight();
                        if (i7 == safeInsetRight) {
                            int i8 = rect2.right;
                            safeInsetRight2 = displayCutout.getSafeInsetRight();
                            rect2.right = safeInsetRight2 + i8;
                        }
                        int i9 = rect2.top;
                        safeInsetTop = displayCutout.getSafeInsetTop();
                        if (i9 == safeInsetTop) {
                            rect2.top = 0;
                        }
                        int i10 = point2.y - rect2.bottom;
                        safeInsetBottom = displayCutout.getSafeInsetBottom();
                        if (i10 == safeInsetBottom) {
                            int i11 = rect2.bottom;
                            safeInsetBottom2 = displayCutout.getSafeInsetBottom();
                            rect2.bottom = safeInsetBottom2 + i11;
                        }
                    }
                }
                return rect2;
            default:
                Configuration configuration2 = activity.getResources().getConfiguration();
                try {
                    Field declaredField3 = Configuration.class.getDeclaredField("windowConfiguration");
                    declaredField3.setAccessible(true);
                    Object obj3 = declaredField3.get(configuration2);
                    Object invoke3 = obj3.getClass().getDeclaredMethod("getBounds", null).invoke(obj3, null);
                    invoke3.getClass();
                    return new Rect((Rect) invoke3);
                } catch (Exception e3) {
                    if (!(e3 instanceof NoSuchFieldException) && !(e3 instanceof NoSuchMethodException) && !(e3 instanceof IllegalAccessException) && !(e3 instanceof InvocationTargetException)) {
                        throw e3;
                    }
                    h7Var.getClass();
                    Log.w(h7.Yi7zF1RB1, e3);
                    return Y6hRI1cF8.EljAMC1QTz(activity);
                }
        }
    }

    @Override // defpackage.r61
    public void OOA6hdeuvCS(q61 q61Var) {
        q61Var.clear();
    }

    @Override // defpackage.k41
    public boolean X1lG3V04pd(Object obj, Object obj2) {
        switch (this.OOA6hdeuvCS) {
            case 23:
                break;
            default:
                if (obj == obj2) {
                }
                break;
        }
        return false;
    }

    @Override // defpackage.s8
    public el Yi7zF1RB1() {
        return YZjbz8VdP5;
    }

    @Override // defpackage.r61
    public boolean encWxUiV2(Object obj, Object obj2) {
        return false;
    }

    @Override // defpackage.s8
    public p50 getLayoutDirection() {
        return AEn1Rrio;
    }

    public String toString() {
        switch (this.OOA6hdeuvCS) {
            case 23:
                return "NeverEqualPolicy";
            case 28:
                return "ReferentialEqualityPolicy";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.s8
    public long xqGvceK5x() {
        return 9205357640488583168L;
    }

    @Override // defpackage.y70
    public void GWasM1elztuh() {
    }

    @Override // defpackage.y70
    public void cancel() {
    }
}
