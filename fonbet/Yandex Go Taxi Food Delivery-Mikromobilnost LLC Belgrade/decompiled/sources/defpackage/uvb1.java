package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import com.yandex.go.taxi.order.models.api.cancel.Action$DeeplinkAction;
import com.yandex.go.taxi.order.models.api.cancel.Action$DeeplinkAndCancelAction;
import com.yandex.go.taxi.order.models.api.cancel.Action$DriverCall;
import com.yandex.go.taxi.order.models.api.cancel.Action$ModalViewAction;
import com.yandex.go.taxi.order.models.api.cancel.Action$RideSupportChat;
import com.yandex.go.taxi.order.models.api.cancel.a;
import com.yandex.go.taxi.order.models.api.cancel.b;
import com.yandex.go.taxi.order.models.api.cancel.c;
import com.yandex.go.taxi.order.models.api.cancel.d;
import com.yandex.go.taxi.order.models.api.cancel.e;
import com.yandex.go.taxi.order.models.api.cancel.h;
import com.yandex.go.taxi.order.models.api.cancel.j;
import com.yandex.go.taxi.order.models.api.cancel.m;
import com.yandex.go.taxi.order.models.api.cancel.n;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes11.dex */
public abstract class uvb1 {
    public static j1b1 a;

    public static g4g a(h6r h6rVar, cb50 cb50Var) {
        h6rVar.getClass();
        return new g4g(h6rVar, cb50Var);
    }

    public static int b(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId != 0 ? i : i2;
    }

    public static boolean c(TypedArray typedArray, XmlPullParser xmlPullParser, boolean z) {
        return !h(xmlPullParser, "autoMirrored") ? z : typedArray.getBoolean(5, z);
    }

    public static ColorStateList d(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        if (!h(xmlPullParser, "tint")) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(1, typedValue);
        int i = typedValue.type;
        if (i == 2) {
            throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
        }
        if (i >= 28 && i <= 31) {
            return ColorStateList.valueOf(typedValue.data);
        }
        Resources resources = typedArray.getResources();
        int resourceId = typedArray.getResourceId(1, 0);
        ThreadLocal threadLocal = xgc.a;
        try {
            return xgc.a(resources, resources.getXml(resourceId), theme);
        } catch (Exception e) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
            return null;
        }
    }

    public static o3 e(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        o3 o3Var;
        if (h(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 >= 28 && i2 <= 31) {
                return new o3((Shader) null, (ColorStateList) null, typedValue.data);
            }
            try {
                o3Var = o3.q(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            } catch (Exception e) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
                o3Var = null;
            }
            if (o3Var != null) {
                return o3Var;
            }
        }
        return new o3((Shader) null, (ColorStateList) null, 0);
    }

    public static float f(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        return !h(xmlPullParser, str) ? f : typedArray.getFloat(i, f);
    }

    public static int g(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !h(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    public static boolean h(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static TypedArray i(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static final qj70 j(n nVar) {
        if (nVar instanceof c) {
            return mj70.a;
        }
        if (nVar instanceof d) {
            return kj70.a;
        }
        if (nVar instanceof b) {
            return lj70.a;
        }
        if (nVar instanceof Action$DriverCall) {
            return new hj70(((Action$DriverCall) nVar).a);
        }
        if (nVar instanceof a) {
            return ij70.a;
        }
        if (nVar instanceof h) {
            return nj70.a;
        }
        if (nVar instanceof Action$DeeplinkAction) {
            return new oj70(((Action$DeeplinkAction) nVar).a);
        }
        if (nVar instanceof Action$DeeplinkAndCancelAction) {
            return new jj70(((Action$DeeplinkAndCancelAction) nVar).a);
        }
        if (jl40.l(nVar, e.INSTANCE) || (nVar instanceof Action$ModalViewAction) || (nVar instanceof Action$RideSupportChat) || (nVar instanceof j) || (nVar instanceof m)) {
            return pj70.a;
        }
        w511.b();
        return null;
    }

    public static final n k(qj70 qj70Var) {
        if (qj70Var instanceof mj70) {
            return c.INSTANCE;
        }
        if (qj70Var instanceof kj70) {
            return d.INSTANCE;
        }
        if (qj70Var instanceof lj70) {
            return b.INSTANCE;
        }
        if (qj70Var instanceof hj70) {
            return new Action$DriverCall(((hj70) qj70Var).a);
        }
        if (qj70Var instanceof ij70) {
            return a.INSTANCE;
        }
        if (qj70Var instanceof oj70) {
            return new Action$DeeplinkAction(((oj70) qj70Var).a);
        }
        if (qj70Var instanceof jj70) {
            return new Action$DeeplinkAndCancelAction(((jj70) qj70Var).a);
        }
        if (qj70Var instanceof nj70) {
            return h.INSTANCE;
        }
        if (qj70Var instanceof pj70) {
            return m.INSTANCE;
        }
        w511.b();
        return null;
    }

    public static synchronized com.google.android.gms.internal.mlkit_vision_barcode.n l(String str) {
        com.google.android.gms.internal.mlkit_vision_barcode.n nVar;
        synchronized (uvb1.class) {
            hvb1 hvb1Var = new hvb1();
            hvb1Var.a = str;
            hvb1Var.b = true;
            byte b = (byte) (hvb1Var.d | 1);
            hvb1Var.c = 1;
            hvb1Var.d = (byte) (b | 2);
            ivb1 a2 = hvb1Var.a();
            synchronized (uvb1.class) {
                try {
                    if (a == null) {
                        a = new j1b1(5);
                    }
                    nVar = (com.google.android.gms.internal.mlkit_vision_barcode.n) a.b(a2);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return nVar;
        }
        return nVar;
    }
}
