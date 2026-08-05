package defpackage;

import android.R;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeMap;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class fn {
    public static boolean DK9slbsy = false;
    public static Method Ey6iv0m0 = null;
    public static boolean I5GHvsYW = false;
    public static final lf OnDfzHZD;
    public static final lf OxcuoDLp;
    public static final lf Qr9iLBAD;
    public static Method WYNAV5pd = null;
    public static final lf amk52bBQ;
    public static final lf eVhOlqcC;
    public static boolean gjV1z5T1 = false;
    public static final lf jb9XjC4I;
    public static final lf k3x7lurq;
    public static Field lwWCatUu;
    public static final lf ow5vqvCr;
    public static final lf ygLcUYwZ;
    public static final int[] qoPGr6Ce = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};
    public static final int[] NCTxEWno = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};
    public static final int[] MdtA4re8 = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
    public static final int[] wxUZMvaN = {R.attr.name, R.attr.pathData, R.attr.fillType};
    public static final int[] VgvYg0wo = {R.attr.drawable};
    public static final int[] P7K7Inc8 = {R.attr.name, R.attr.animation};
    public static final Object[] b2ZJblxo = new Object[0];
    public static final sf lDXGDhIF = new sf(false);
    public static final sf sjUBp5pO = new sf(true);
    public static final Object KlHjfFWx = new Object();
    public static final int[] RXQxj5Oe = {com.kolosta.rejin.jilosa.R.attr.colorPrimary};
    public static final int[] FySoLYna = {com.kolosta.rejin.jilosa.R.attr.colorPrimaryVariant};

    static {
        int i = 1;
        Qr9iLBAD = new lf("UNDEFINED", i);
        jb9XjC4I = new lf("REUSABLE_CLAIMED", i);
        eVhOlqcC = new lf("COMPLETING_ALREADY", i);
        k3x7lurq = new lf("COMPLETING_WAITING_CHILDREN", i);
        ow5vqvCr = new lf("COMPLETING_RETRY", i);
        OnDfzHZD = new lf("TOO_LATE_TO_CANCEL", i);
        ygLcUYwZ = new lf("SEALED", i);
        OxcuoDLp = new lf("NULL", i);
        amk52bBQ = new lf("UNINITIALIZED", i);
    }

    public static final Object DK9slbsy(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static q90 Ey6iv0m0(t9 t9Var, eVhOlqcC evholqcc, dl dlVar, int i) {
        l9 l9Var = evholqcc;
        if ((i & 1) != 0) {
            l9Var = uf.NCTxEWno;
        }
        return KlHjfFWx(t9Var, l9Var, (i & 2) != 0 ? w9.NCTxEWno : w9.VgvYg0wo, dlVar);
    }

    public static TypedArray FySoLYna(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        NCTxEWno(context, attributeSet, i, i2);
        wxUZMvaN(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    public static int I5GHvsYW(int i, int i2, float f) {
        return g6.NCTxEWno(g6.wxUZMvaN(i2, Math.round(Color.alpha(i2) * f)), i);
    }

    public static final q90 KlHjfFWx(t9 t9Var, l9 l9Var, w9 w9Var, dl dlVar) {
        l9 I5GHvsYW2 = w30.I5GHvsYW(t9Var.VgvYg0wo(), l9Var, true);
        hb hbVar = ed.qoPGr6Ce;
        if (I5GHvsYW2 != hbVar && I5GHvsYW2.OnDfzHZD(re.MdtA4re8) == null) {
            I5GHvsYW2 = I5GHvsYW2.eVhOlqcC(hbVar);
        }
        w9Var.getClass();
        q90 hoVar = w9Var == w9.MdtA4re8 ? new ho(I5GHvsYW2, dlVar) : new q90(I5GHvsYW2, true);
        hoVar.ESscZ9M1(w9Var, hoVar, dlVar);
        return hoVar;
    }

    public static void MdtA4re8(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void Mq3SeTnW(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    public static void NCTxEWno(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y00.DK9slbsy, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(com.kolosta.rejin.jilosa.R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                VgvYg0wo(context, FySoLYna, "Theme.MaterialComponents");
            }
        }
        VgvYg0wo(context, RXQxj5Oe, "Theme.AppCompat");
    }

    public static int OnDfzHZD(Context context, int i, int i2) {
        Integer num;
        TypedValue SgZGMMPL = ra.SgZGMMPL(context.getTheme(), i);
        if (SgZGMMPL != null) {
            int i3 = SgZGMMPL.resourceId;
            num = Integer.valueOf(i3 != 0 ? context.getColor(i3) : SgZGMMPL.data);
        } else {
            num = null;
        }
        return num != null ? num.intValue() : i2;
    }

    public static String OxcuoDLp(Class cls) {
        LinkedHashMap linkedHashMap = xv.NCTxEWno;
        String str = (String) linkedHashMap.get(cls);
        if (str == null) {
            vv vvVar = (vv) cls.getAnnotation(vv.class);
            str = vvVar != null ? vvVar.value() : null;
            if (str == null || str.length() <= 0) {
                m1.NCTxEWno("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()));
                return null;
            }
            linkedHashMap.put(cls, str);
        }
        str.getClass();
        return str;
    }

    public static final Object P7K7Inc8(g9 g9Var, yg ygVar, el elVar, xg[] xgVarArr) {
        k6 k6Var = new k6(null, ygVar, elVar, xgVarArr);
        zg zgVar = new zg(g9Var, g9Var.wxUZMvaN());
        Object jb9XjC4I2 = m50.jb9XjC4I(zgVar, zgVar, k6Var);
        return jb9XjC4I2 == u9.NCTxEWno ? jb9XjC4I2 : xe0.qoPGr6Ce;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008b A[EDGE_INSN: B:47:0x008b->B:31:0x008b BREAK  A[LOOP:0: B:9:0x0011->B:32:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List Qr9iLBAD(vm vmVar, int i, int i2) {
        hx hxVar;
        boolean z;
        if (i == i2) {
            return wf.NCTxEWno;
        }
        boolean z2 = i2 > i;
        ArrayList arrayList = new ArrayList();
        do {
            if (z2) {
                if (i >= i2) {
                    return arrayList;
                }
                LinkedHashMap linkedHashMap = vmVar.qoPGr6Ce;
                if (z2) {
                    TreeMap treeMap = (TreeMap) linkedHashMap.get(Integer.valueOf(i));
                    if (treeMap != null) {
                        hxVar = new hx(treeMap, treeMap.keySet());
                        if (hxVar != null) {
                        }
                    }
                    hxVar = null;
                    if (hxVar != null) {
                    }
                } else {
                    TreeMap treeMap2 = (TreeMap) linkedHashMap.get(Integer.valueOf(i));
                    if (treeMap2 != null) {
                        hxVar = new hx(treeMap2, treeMap2.descendingKeySet());
                        if (hxVar != null) {
                            break;
                        }
                        Map map = (Map) hxVar.NCTxEWno;
                        Iterator it = ((Iterable) hxVar.MdtA4re8).iterator();
                        while (it.hasNext()) {
                            int intValue = ((Number) it.next()).intValue();
                            if (!z2) {
                                if (i2 <= intValue && intValue < i) {
                                    Object obj = map.get(Integer.valueOf(intValue));
                                    obj.getClass();
                                    arrayList.add(obj);
                                    z = true;
                                    i = intValue;
                                    break;
                                    break;
                                }
                            } else if (i + 1 <= intValue && intValue <= i2) {
                                Object obj2 = map.get(Integer.valueOf(intValue));
                                obj2.getClass();
                                arrayList.add(obj2);
                                z = true;
                                i = intValue;
                                break;
                            }
                        }
                        z = false;
                    }
                    hxVar = null;
                    if (hxVar != null) {
                    }
                }
            } else {
                if (i <= i2) {
                    return arrayList;
                }
                LinkedHashMap linkedHashMap2 = vmVar.qoPGr6Ce;
                if (z2) {
                }
            }
        } while (z);
        return null;
    }

    public static l9 RXQxj5Oe(j9 j9Var, k9 k9Var) {
        k9Var.getClass();
        return qoPGr6Ce(j9Var.getKey(), k9Var) ? uf.NCTxEWno : j9Var;
    }

    public static final void SgZGMMPL(Object obj) {
        if (obj instanceof k30) {
            throw ((k30) obj).NCTxEWno;
        }
    }

    public static final void U0LaHZX7(m3 m3Var, g9 g9Var, boolean z) {
        Object ow5vqvCr2 = m3Var.ow5vqvCr();
        Throwable b2ZJblxo2 = m3Var.b2ZJblxo(ow5vqvCr2);
        Object k30Var = b2ZJblxo2 != null ? new k30(b2ZJblxo2) : m3Var.Qr9iLBAD(ow5vqvCr2);
        if (!z) {
            g9Var.P7K7Inc8(k30Var);
            return;
        }
        g9Var.getClass();
        ad adVar = (ad) g9Var;
        h9 h9Var = adVar.P7K7Inc8;
        Object obj = adVar.Qr9iLBAD;
        l9 wxUZMvaN2 = h9Var.wxUZMvaN();
        Object gmkaJpmS = w30.gmkaJpmS(wxUZMvaN2, obj);
        we0 TrssYQ34 = gmkaJpmS != w30.eVhOlqcC ? w30.TrssYQ34(h9Var, wxUZMvaN2, gmkaJpmS) : null;
        try {
            h9Var.P7K7Inc8(k30Var);
            if (TrssYQ34 == null || TrssYQ34.VGmz0ccI()) {
                w30.FXJmAAN1(wxUZMvaN2, gmkaJpmS);
            }
        } catch (Throwable th) {
            if (TrssYQ34 == null || TrssYQ34.VGmz0ccI()) {
                w30.FXJmAAN1(wxUZMvaN2, gmkaJpmS);
            }
            throw th;
        }
    }

    public static void VgvYg0wo(Context context, int[] iArr, String str) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i = 0; i < iArr.length; i++) {
            if (!obtainStyledAttributes.hasValue(i)) {
                obtainStyledAttributes.recycle();
                m1.sjUBp5pO(q70.P7K7Inc8("The style on this component requires your app theme to be ", str, " (or a descendant)."));
                return;
            }
        }
        obtainStyledAttributes.recycle();
    }

    public static final Object[] VhgXwMj9(Collection collection, Object[] objArr) {
        Object[] objArr2;
        int size = collection.size();
        int i = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArr2 = objArr;
                } else {
                    Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    newInstance.getClass();
                    objArr2 = (Object[]) newInstance;
                }
                while (true) {
                    int i2 = i + 1;
                    objArr2[i] = it.next();
                    if (i2 >= objArr2.length) {
                        if (!it.hasNext()) {
                            return objArr2;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            i3 = 2147483645;
                            if (i2 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr2 = Arrays.copyOf(objArr2, i3);
                    } else if (!it.hasNext()) {
                        if (objArr2 != objArr) {
                            return Arrays.copyOf(objArr2, i2);
                        }
                        objArr[i2] = null;
                        return objArr;
                    }
                    i = i2;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }

    public static l9 WYNAV5pd(j9 j9Var, l9 l9Var) {
        l9Var.getClass();
        return l9Var == uf.NCTxEWno ? j9Var : (l9) l9Var.Qr9iLBAD(j9Var, new l6(1));
    }

    public static final Object Xkz7p5xa(Object obj) {
        rm rmVar = obj instanceof rm ? (rm) obj : null;
        return rmVar != null ? rmVar.qoPGr6Ce : obj;
    }

    public static final xx aZz0PFXp(oy oyVar) {
        oyVar.getClass();
        List U0LaHZX7 = ba0.U0LaHZX7(oyVar.ygLcUYwZ, new String[]{";"});
        ArrayList arrayList = new ArrayList();
        for (Object obj : U0LaHZX7) {
            if (!ba0.WYNAV5pd((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(z5.bvfAo0eO(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            List U0LaHZX72 = ba0.U0LaHZX7((String) obj2, new String[]{"|"});
            Object obj3 = "";
            String str = (String) (U0LaHZX72.size() > 0 ? U0LaHZX72.get(0) : "");
            if (1 < U0LaHZX72.size()) {
                obj3 = U0LaHZX72.get(1);
            }
            arrayList2.add(new kh(str, (String) obj3));
        }
        long j = oyVar.qoPGr6Ce;
        String str2 = oyVar.NCTxEWno;
        String str3 = oyVar.MdtA4re8;
        String str4 = oyVar.wxUZMvaN;
        String str5 = oyVar.VgvYg0wo;
        String str6 = oyVar.P7K7Inc8;
        String str7 = oyVar.b2ZJblxo;
        int i2 = oyVar.Qr9iLBAD;
        int i3 = oyVar.jb9XjC4I;
        String str8 = oyVar.eVhOlqcC;
        String str9 = oyVar.k3x7lurq;
        List U0LaHZX73 = ba0.U0LaHZX7(oyVar.ow5vqvCr, new String[]{","});
        ArrayList arrayList3 = new ArrayList();
        for (Object obj4 : U0LaHZX73) {
            ArrayList arrayList4 = arrayList2;
            if (!ba0.WYNAV5pd((String) obj4)) {
                arrayList3.add(obj4);
            }
            arrayList2 = arrayList4;
        }
        ArrayList arrayList5 = arrayList2;
        return new xx(j, str2, str3, str4, str5, str6, str7, i2, i3, str8, str9, arrayList3, oyVar.OnDfzHZD, arrayList5, arrayList5.size(), oyVar.lDXGDhIF, oyVar.sjUBp5pO, oyVar.OxcuoDLp, oyVar.amk52bBQ);
    }

    public static final int amk52bBQ(z0 z0Var, Object obj, int i) {
        int i2 = z0Var.wxUZMvaN;
        if (i2 == 0) {
            return -1;
        }
        try {
            int P7K7Inc82 = le0.P7K7Inc8(i2, i, z0Var.NCTxEWno);
            if (P7K7Inc82 < 0 || qoPGr6Ce(obj, z0Var.MdtA4re8[P7K7Inc82])) {
                return P7K7Inc82;
            }
            int i3 = P7K7Inc82 + 1;
            while (i3 < i2 && z0Var.NCTxEWno[i3] == i) {
                if (qoPGr6Ce(obj, z0Var.MdtA4re8[i3])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = P7K7Inc82 - 1; i4 >= 0 && z0Var.NCTxEWno[i4] == i; i4--) {
                if (qoPGr6Ce(obj, z0Var.MdtA4re8[i4])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean b2ZJblxo(bo boVar, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        Window window;
        boolean z = false;
        if (boVar != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                return boVar.MdtA4re8(keyEvent);
            }
            if (callback instanceof Activity) {
                Activity activity = (Activity) callback;
                activity.onUserInteraction();
                Window window2 = activity.getWindow();
                if (window2.hasFeature(8)) {
                    ActionBar actionBar = activity.getActionBar();
                    if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                        if (!gjV1z5T1) {
                            try {
                                WYNAV5pd = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                            } catch (NoSuchMethodException unused) {
                            }
                            gjV1z5T1 = true;
                        }
                        Method method = WYNAV5pd;
                        if (method != null) {
                            try {
                                Object invoke = method.invoke(actionBar, keyEvent);
                                if (invoke != null) {
                                    z = ((Boolean) invoke).booleanValue();
                                }
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                        if (z) {
                            return true;
                        }
                    }
                }
                if (window2.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView = window2.getDecorView();
                if (hg0.MdtA4re8(decorView, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
            }
            if (callback instanceof Dialog) {
                Dialog dialog = (Dialog) callback;
                if (!DK9slbsy) {
                    try {
                        Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                        lwWCatUu = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException unused3) {
                    }
                    DK9slbsy = true;
                }
                Field field = lwWCatUu;
                if (field != null) {
                    try {
                        onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
                    } catch (IllegalAccessException unused4) {
                    }
                    if (onKeyListener == null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                        return true;
                    }
                    window = dialog.getWindow();
                    if (!window.superDispatchKeyEvent(keyEvent)) {
                        return true;
                    }
                    View decorView2 = window.getDecorView();
                    if (hg0.MdtA4re8(decorView2, keyEvent)) {
                        return true;
                    }
                    return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
                }
                onKeyListener = null;
                if (onKeyListener == null) {
                }
                window = dialog.getWindow();
                if (!window.superDispatchKeyEvent(keyEvent)) {
                }
            } else if ((view != null && hg0.MdtA4re8(view, keyEvent)) || boVar.MdtA4re8(keyEvent)) {
                return true;
            }
        }
        return false;
    }

    public static int eIA6dogk(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object eVhOlqcC(la0 la0Var, ih ihVar, h9 h9Var) {
        hh hhVar;
        int i;
        lf lfVar;
        ih ihVar2;
        l20 l20Var;
        qoPGr6Ce e;
        nd ndVar;
        Object obj;
        if (h9Var instanceof hh) {
            hhVar = (hh) h9Var;
            int i2 = hhVar.jb9XjC4I;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hhVar.jb9XjC4I = i2 - Integer.MIN_VALUE;
                Object obj2 = hhVar.Qr9iLBAD;
                i = hhVar.jb9XjC4I;
                lfVar = OxcuoDLp;
                int i3 = 1;
                if (i == 0) {
                    if (i != 1) {
                        m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ndVar = hhVar.b2ZJblxo;
                    l20Var = hhVar.P7K7Inc8;
                    ihVar2 = hhVar.VgvYg0wo;
                    try {
                        SgZGMMPL(obj2);
                    } catch (qoPGr6Ce e2) {
                        e = e2;
                    }
                    obj = l20Var.NCTxEWno;
                    if (obj != lfVar) {
                        return obj;
                    }
                    throw new NoSuchElementException("Expected at least one element matching the predicate " + ihVar2);
                }
                SgZGMMPL(obj2);
                l20 l20Var2 = new l20();
                l20Var2.NCTxEWno = lfVar;
                nd ndVar2 = new nd(ihVar, i3, l20Var2);
                try {
                    hhVar.VgvYg0wo = ihVar;
                    hhVar.P7K7Inc8 = l20Var2;
                    hhVar.b2ZJblxo = ndVar2;
                    hhVar.jb9XjC4I = 1;
                    la0Var.NCTxEWno(ndVar2, hhVar);
                    return u9.NCTxEWno;
                } catch (qoPGr6Ce e3) {
                    ihVar2 = ihVar;
                    l20Var = l20Var2;
                    e = e3;
                    ndVar = ndVar2;
                }
                if (e.NCTxEWno != ndVar) {
                    throw e;
                }
                obj = l20Var.NCTxEWno;
                if (obj != lfVar) {
                }
            }
        }
        hhVar = new hh(h9Var);
        Object obj22 = hhVar.Qr9iLBAD;
        i = hhVar.jb9XjC4I;
        lfVar = OxcuoDLp;
        int i32 = 1;
        if (i == 0) {
        }
        if (e.NCTxEWno != ndVar) {
        }
        obj = l20Var.NCTxEWno;
        if (obj != lfVar) {
        }
    }

    public static final String euDDoUNr(Object[] objArr, int i, int i2, sjUBp5pO sjubp5po) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i3];
            if (obj == sjubp5po) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object fVMzMhyS(l9 l9Var, dl dlVar, g9 g9Var) {
        Unsafe unsafe;
        long j;
        l9 wxUZMvaN2 = g9Var.wxUZMvaN();
        l9 eVhOlqcC2 = !((Boolean) l9Var.Qr9iLBAD(Boolean.FALSE, new l6(2))).booleanValue() ? wxUZMvaN2.eVhOlqcC(l9Var) : w30.I5GHvsYW(wxUZMvaN2, l9Var, false);
        le0.lDXGDhIF(eVhOlqcC2);
        if (eVhOlqcC2 == wxUZMvaN2) {
            v50 v50Var = new v50(g9Var, eVhOlqcC2);
            return m50.jb9XjC4I(v50Var, v50Var, dlVar);
        }
        re reVar = re.MdtA4re8;
        if (qoPGr6Ce(eVhOlqcC2.OnDfzHZD(reVar), wxUZMvaN2.OnDfzHZD(reVar))) {
            we0 we0Var = new we0(g9Var, eVhOlqcC2);
            l9 l9Var2 = we0Var.wxUZMvaN;
            Object gmkaJpmS = w30.gmkaJpmS(l9Var2, null);
            try {
                return m50.jb9XjC4I(we0Var, we0Var, dlVar);
            } finally {
                w30.FXJmAAN1(l9Var2, gmkaJpmS);
            }
        }
        bd bdVar = new bd(g9Var, eVhOlqcC2);
        try {
            i7xS8jrb(w30.SgZGMMPL(((h9) dlVar).lDXGDhIF(bdVar, bdVar)), xe0.qoPGr6Ce);
            do {
                unsafe = b1.qoPGr6Ce;
                j = bd.P7K7Inc8;
                int intVolatile = unsafe.getIntVolatile(bdVar, j);
                if (intVolatile != 0) {
                    if (intVolatile != 2) {
                        m1.Ey6iv0m0("Already suspended");
                        return null;
                    }
                    Object Xkz7p5xa = Xkz7p5xa(bdVar.euDDoUNr());
                    if (Xkz7p5xa instanceof c7) {
                        throw ((c7) Xkz7p5xa).qoPGr6Ce;
                    }
                    return Xkz7p5xa;
                }
            } while (!unsafe.compareAndSwapInt(bdVar, j, 0, 1));
            return u9.NCTxEWno;
        } catch (Throwable th) {
            bdVar.P7K7Inc8(new k30(th));
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object gjV1z5T1(g9 g9Var, zk zkVar, v30 v30Var, boolean z, boolean z2) {
        da daVar;
        int i;
        boolean z3;
        zk zkVar2;
        v30 v30Var2;
        boolean z4;
        if (g9Var instanceof da) {
            daVar = (da) g9Var;
            int i2 = daVar.eVhOlqcC;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                daVar.eVhOlqcC = i2 - Integer.MIN_VALUE;
                da daVar2 = daVar;
                Object obj = daVar2.jb9XjC4I;
                i = daVar2.eVhOlqcC;
                u9 u9Var = u9.NCTxEWno;
                if (i != 0) {
                    SgZGMMPL(obj);
                    if (v30Var.b2ZJblxo() && v30Var.jb9XjC4I() && v30Var.Qr9iLBAD()) {
                        fa faVar = new fa(null, zkVar, v30Var, z2, z);
                        daVar2.eVhOlqcC = 1;
                        Object eVhOlqcC2 = v30Var.eVhOlqcC(z, faVar, daVar2);
                        if (eVhOlqcC2 != u9Var) {
                            return eVhOlqcC2;
                        }
                    } else {
                        z3 = z2;
                        daVar2.VgvYg0wo = v30Var;
                        daVar2.P7K7Inc8 = zkVar;
                        daVar2.b2ZJblxo = z;
                        daVar2.Qr9iLBAD = z3;
                        daVar2.eVhOlqcC = 2;
                        l9 lDXGDhIF2 = lDXGDhIF(v30Var, z3, daVar2);
                        if (lDXGDhIF2 != u9Var) {
                            zkVar2 = zkVar;
                            v30Var2 = v30Var;
                            obj = lDXGDhIF2;
                            z4 = z;
                        }
                    }
                }
                if (i == 1) {
                    SgZGMMPL(obj);
                    return obj;
                }
                if (i != 2) {
                    if (i == 3) {
                        SgZGMMPL(obj);
                        return obj;
                    }
                    m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z3 = daVar2.Qr9iLBAD;
                boolean z5 = daVar2.b2ZJblxo;
                zk zkVar3 = daVar2.P7K7Inc8;
                v30 v30Var3 = daVar2.VgvYg0wo;
                SgZGMMPL(obj);
                z4 = z5;
                zkVar2 = zkVar3;
                v30Var2 = v30Var3;
                ca caVar = new ca(null, zkVar2, v30Var2, z4, z3);
                daVar2.VgvYg0wo = null;
                daVar2.P7K7Inc8 = null;
                daVar2.eVhOlqcC = 3;
                Object fVMzMhyS = fVMzMhyS((l9) obj, caVar, daVar2);
                return fVMzMhyS != u9Var ? u9Var : fVMzMhyS;
            }
        }
        daVar = new da(g9Var);
        da daVar22 = daVar;
        Object obj2 = daVar22.jb9XjC4I;
        i = daVar22.eVhOlqcC;
        u9 u9Var2 = u9.NCTxEWno;
        if (i != 0) {
        }
        ca caVar2 = new ca(null, zkVar2, v30Var2, z4, z3);
        daVar22.VgvYg0wo = null;
        daVar22.P7K7Inc8 = null;
        daVar22.eVhOlqcC = 3;
        Object fVMzMhyS2 = fVMzMhyS((l9) obj2, caVar2, daVar22);
        if (fVMzMhyS2 != u9Var2) {
        }
    }

    public static final Object hzgxAD8d(l9 l9Var, Object obj, Object obj2, dl dlVar, g9 g9Var) {
        Object gmkaJpmS = w30.gmkaJpmS(l9Var, obj2);
        try {
            j90 j90Var = new j90(g9Var, l9Var);
            le0.VgvYg0wo(2, dlVar);
            Object Qr9iLBAD2 = dlVar.Qr9iLBAD(obj, j90Var);
            w30.FXJmAAN1(l9Var, gmkaJpmS);
            if (Qr9iLBAD2 == u9.NCTxEWno) {
                g9Var.getClass();
            }
            return Qr9iLBAD2;
        } catch (Throwable th) {
            w30.FXJmAAN1(l9Var, gmkaJpmS);
            throw th;
        }
    }

    public static final void i7xS8jrb(g9 g9Var, Object obj) {
        if (!(g9Var instanceof ad)) {
            g9Var.P7K7Inc8(obj);
            return;
        }
        ad adVar = (ad) g9Var;
        n9 n9Var = adVar.VgvYg0wo;
        h9 h9Var = adVar.P7K7Inc8;
        Throwable qoPGr6Ce2 = l30.qoPGr6Ce(obj);
        Object c7Var = qoPGr6Ce2 == null ? obj : new c7(qoPGr6Ce2, false);
        if (n9Var.gjV1z5T1(h9Var.wxUZMvaN())) {
            adVar.b2ZJblxo = c7Var;
            adVar.wxUZMvaN = 1;
            n9Var.RXQxj5Oe(h9Var.wxUZMvaN(), adVar);
            return;
        }
        cg qoPGr6Ce3 = kc0.qoPGr6Ce();
        if (qoPGr6Ce3.wxUZMvaN >= 4294967296L) {
            adVar.b2ZJblxo = c7Var;
            adVar.wxUZMvaN = 1;
            qoPGr6Ce3.lwWCatUu(adVar);
            return;
        }
        qoPGr6Ce3.U0LaHZX7(true);
        try {
            vn vnVar = (vn) h9Var.wxUZMvaN().OnDfzHZD(re.VgvYg0wo);
            if (vnVar == null || vnVar.VhgXwMj9()) {
                Object obj2 = adVar.Qr9iLBAD;
                l9 wxUZMvaN2 = h9Var.wxUZMvaN();
                Object gmkaJpmS = w30.gmkaJpmS(wxUZMvaN2, obj2);
                we0 TrssYQ34 = gmkaJpmS != w30.eVhOlqcC ? w30.TrssYQ34(h9Var, wxUZMvaN2, gmkaJpmS) : null;
                try {
                    h9Var.P7K7Inc8(obj);
                } finally {
                    if (TrssYQ34 == null || TrssYQ34.VGmz0ccI()) {
                        w30.FXJmAAN1(wxUZMvaN2, gmkaJpmS);
                    }
                }
            } else {
                adVar.P7K7Inc8(new k30(vnVar.DK9slbsy()));
            }
            while (qoPGr6Ce3.Mq3SeTnW()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public static pu jb9XjC4I(ru ruVar) {
        Iterator it = l60.RXQxj5Oe(ruVar, new tKaxLBvG(17)).iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return (pu) next;
    }

    public static j9 k3x7lurq(j9 j9Var, k9 k9Var) {
        k9Var.getClass();
        if (qoPGr6Ce(j9Var.getKey(), k9Var)) {
            return j9Var;
        }
        return null;
    }

    public static final l9 lDXGDhIF(v30 v30Var, boolean z, h9 h9Var) {
        kd0 kd0Var = (kd0) h9Var.wxUZMvaN().OnDfzHZD(kd0.MdtA4re8);
        l9 l9Var = kd0Var != null ? kd0Var.NCTxEWno : null;
        if (!v30Var.b2ZJblxo()) {
            e9 e9Var = v30Var.qoPGr6Ce;
            if (e9Var == null) {
                ytu5o6f4("coroutineScope");
                throw null;
            }
            l9 l9Var2 = e9Var.NCTxEWno;
            if (l9Var == null) {
                l9Var = uf.NCTxEWno;
            }
            return l9Var2.eVhOlqcC(l9Var);
        }
        if (l9Var != null) {
            e9 e9Var2 = v30Var.qoPGr6Ce;
            if (e9Var2 != null) {
                return e9Var2.NCTxEWno.eVhOlqcC(l9Var);
            }
            ytu5o6f4("coroutineScope");
            throw null;
        }
        if (z) {
            l9 l9Var3 = v30Var.NCTxEWno;
            if (l9Var3 != null) {
                return l9Var3;
            }
            ytu5o6f4("transactionContext");
            throw null;
        }
        e9 e9Var3 = v30Var.qoPGr6Ce;
        if (e9Var3 != null) {
            return e9Var3.NCTxEWno;
        }
        ytu5o6f4("coroutineScope");
        throw null;
    }

    public static final void lwWCatUu(Object[] objArr, int i, int i2) {
        objArr.getClass();
        while (i < i2) {
            objArr[i] = null;
            i++;
        }
    }

    public static Object ow5vqvCr(Object obj, Class cls) {
        if (obj instanceof tl) {
            return cls.cast(obj);
        }
        if (obj instanceof ul) {
            return ow5vqvCr(((ul) obj).NCTxEWno(), cls);
        }
        throw new IllegalStateException("Given component holder " + obj.getClass() + " does not implement " + tl.class + " or " + ul.class);
    }

    public static final Object[] pRiPUEwG(Collection collection) {
        int size = collection.size();
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArr = new Object[size];
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    objArr[i] = it.next();
                    if (i2 >= objArr.length) {
                        if (!it.hasNext()) {
                            return objArr;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            i3 = 2147483645;
                            if (i2 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr = Arrays.copyOf(objArr, i3);
                    } else if (!it.hasNext()) {
                        return Arrays.copyOf(objArr, i2);
                    }
                    i = i2;
                }
            }
        }
        return b2ZJblxo;
    }

    public static boolean qoPGr6Ce(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static Set sjUBp5pO() {
        try {
            Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (invoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) invoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        if (r0.getResourceId(0, -1) != (-1)) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void wxUZMvaN(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y00.DK9slbsy, i, i2);
        boolean z = false;
        if (!obtainStyledAttributes.getBoolean(2, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        if (iArr2.length != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
            for (int i3 : iArr2) {
                if (obtainStyledAttributes2.getResourceId(i3, -1) == -1) {
                    obtainStyledAttributes2.recycle();
                    break;
                }
            }
            obtainStyledAttributes2.recycle();
            z = true;
            obtainStyledAttributes.recycle();
            if (z) {
                return;
            }
            m1.sjUBp5pO("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    public static int ygLcUYwZ(View view, int i) {
        Context context = view.getContext();
        Context context2 = view.getContext();
        String canonicalName = view.getClass().getCanonicalName();
        TypedValue SgZGMMPL = ra.SgZGMMPL(context2.getTheme(), i);
        if (SgZGMMPL == null) {
            throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", canonicalName, context2.getResources().getResourceName(i)));
        }
        int i2 = SgZGMMPL.resourceId;
        return i2 != 0 ? context.getColor(i2) : SgZGMMPL.data;
    }

    public static void ytu5o6f4(String str) {
        d7 d7Var = new d7(q70.P7K7Inc8("lateinit property ", str, " has not been initialized"));
        Mq3SeTnW(d7Var, fn.class.getName());
        throw d7Var;
    }
}
