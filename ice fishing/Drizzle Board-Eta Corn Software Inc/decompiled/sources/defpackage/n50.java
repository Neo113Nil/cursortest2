package defpackage;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class n50 {
    public static final /* synthetic */ int MdtA4re8 = 0;
    public static final /* synthetic */ int NCTxEWno = 0;
    public static final /* synthetic */ int qoPGr6Ce = 0;
    public static final /* synthetic */ int wxUZMvaN = 0;

    public static final b60 MdtA4re8(Object obj) {
        if (obj != w30.MdtA4re8) {
            return (b60) obj;
        }
        m1.Ey6iv0m0("Does not contain segment");
        return null;
    }

    public static rpbmbhyp NCTxEWno(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        rpbmbhyp rpbmbhypVar;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 >= 28 && i2 <= 31) {
                return new rpbmbhyp(null, null, typedValue.data);
            }
            try {
                rpbmbhypVar = rpbmbhyp.NCTxEWno(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            } catch (Exception e) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
                rpbmbhypVar = null;
            }
            if (rpbmbhypVar != null) {
                return rpbmbhypVar;
            }
        }
        return new rpbmbhyp(null, null, 0);
    }

    public static final void P7K7Inc8(String str) {
        str.getClass();
        throw new IllegalArgumentException(q70.P7K7Inc8("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }

    public static void Qr9iLBAD(Window window) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            Xkz7p5xa.wxUZMvaN(window);
        } else if (i >= 30) {
            Xkz7p5xa.MdtA4re8(window);
        } else {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1792);
        }
    }

    public static final boolean VgvYg0wo(Object obj) {
        return obj == w30.MdtA4re8;
    }

    public static TypedArray b2ZJblxo(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static final Object jb9XjC4I(long j, k4 k4Var, pz pzVar) {
        Object c7Var;
        Object Xkz7p5xa;
        long N8VPGzVC = ej0.N8VPGzVC(j);
        if (N8VPGzVC <= 0) {
            throw new oc0("Timed out immediately", null);
        }
        pc0 pc0Var = new pc0(N8VPGzVC, pzVar);
        le0.WYNAV5pd(pc0Var, true, new ld(ej0.Ey6iv0m0(pc0Var.VgvYg0wo.wxUZMvaN()).VgvYg0wo(pc0Var.P7K7Inc8, pc0Var, pc0Var.wxUZMvaN)));
        try {
            le0.VgvYg0wo(2, k4Var);
            c7Var = k4Var.Qr9iLBAD(pc0Var, pc0Var);
        } catch (Throwable th) {
            c7Var = new c7(th, false);
        }
        Object obj = u9.NCTxEWno;
        if (c7Var == obj || (Xkz7p5xa = pc0Var.Xkz7p5xa(c7Var)) == fn.k3x7lurq) {
            return obj;
        }
        if (Xkz7p5xa instanceof c7) {
            Throwable th2 = ((c7) Xkz7p5xa).qoPGr6Ce;
            if (!(th2 instanceof oc0)) {
                throw th2;
            }
            if (((oc0) th2).NCTxEWno != pc0Var) {
                throw th2;
            }
            if (c7Var instanceof c7) {
                throw ((c7) c7Var).qoPGr6Ce;
            }
        } else {
            c7Var = fn.Xkz7p5xa(Xkz7p5xa);
        }
        return c7Var;
    }

    public static View qoPGr6Ce(View view, int i) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View findViewById = viewGroup.getChildAt(i2).findViewById(i);
            if (findViewById != null) {
                return findViewById;
            }
        }
        return null;
    }

    public static boolean wxUZMvaN(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }
}
