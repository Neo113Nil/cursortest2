package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class m50 {
    public static final /* synthetic */ int MdtA4re8 = 0;
    public static final /* synthetic */ int NCTxEWno = 0;
    public static boolean P7K7Inc8 = true;
    public static boolean Qr9iLBAD;
    public static Thread VgvYg0wo;
    public static Field b2ZJblxo;
    public static final /* synthetic */ int qoPGr6Ce = 0;
    public static final /* synthetic */ int wxUZMvaN = 0;

    public static int MdtA4re8(d20 d20Var, we weVar, View view, View view2, t10 t10Var, boolean z) {
        if (t10Var.I5GHvsYW() == 0 || d20Var.NCTxEWno() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return d20Var.NCTxEWno();
        }
        return (int) (((weVar.wxUZMvaN(view2) - weVar.b2ZJblxo(view)) / (Math.abs(t10.ytu5o6f4(view) - t10.ytu5o6f4(view2)) + 1)) * d20Var.NCTxEWno());
    }

    public static int NCTxEWno(d20 d20Var, we weVar, View view, View view2, t10 t10Var, boolean z, boolean z2) {
        if (t10Var.I5GHvsYW() == 0 || d20Var.NCTxEWno() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z2 ? Math.max(0, (d20Var.NCTxEWno() - Math.max(t10.ytu5o6f4(view), t10.ytu5o6f4(view2))) - 1) : Math.max(0, Math.min(t10.ytu5o6f4(view), t10.ytu5o6f4(view2)));
        if (z) {
            return Math.round((max * (Math.abs(weVar.wxUZMvaN(view2) - weVar.b2ZJblxo(view)) / (Math.abs(t10.ytu5o6f4(view) - t10.ytu5o6f4(view2)) + 1))) + (weVar.OnDfzHZD() - weVar.b2ZJblxo(view)));
        }
        return max;
    }

    public static final ArrayList VgvYg0wo(String str, Bundle bundle) {
        Class cls = m20.qoPGr6Ce(Bundle.class).qoPGr6Ce;
        cls.getClass();
        ArrayList NCTxEWno2 = Build.VERSION.SDK_INT >= 34 ? fVMzMhyS.NCTxEWno(bundle, str, cls) : bundle.getParcelableArrayList(str);
        if (NCTxEWno2 != null) {
            return NCTxEWno2;
        }
        n50.P7K7Inc8(str);
        throw null;
    }

    public static final boolean b2ZJblxo(String str, Bundle bundle) {
        str.getClass();
        return bundle.containsKey(str) && bundle.get(str) == null;
    }

    public static final Object jb9XjC4I(v50 v50Var, v50 v50Var2, dl dlVar) {
        Object c7Var;
        Object Xkz7p5xa;
        try {
            le0.VgvYg0wo(2, dlVar);
            c7Var = dlVar.Qr9iLBAD(v50Var2, v50Var);
        } catch (Throwable th) {
            c7Var = new c7(th, false);
        }
        u9 u9Var = u9.NCTxEWno;
        if (c7Var == u9Var || (Xkz7p5xa = v50Var.Xkz7p5xa(c7Var)) == fn.k3x7lurq) {
            return u9Var;
        }
        if (Xkz7p5xa instanceof c7) {
            throw ((c7) Xkz7p5xa).qoPGr6Ce;
        }
        return fn.Xkz7p5xa(Xkz7p5xa);
    }

    public static int qoPGr6Ce(d20 d20Var, we weVar, View view, View view2, t10 t10Var, boolean z) {
        if (t10Var.I5GHvsYW() == 0 || d20Var.NCTxEWno() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(t10.ytu5o6f4(view) - t10.ytu5o6f4(view2)) + 1;
        }
        return Math.min(weVar.ygLcUYwZ(), weVar.wxUZMvaN(view2) - weVar.b2ZJblxo(view));
    }

    public static final int wxUZMvaN(String str, Bundle bundle) {
        int i = bundle.getInt(str, Integer.MIN_VALUE);
        if (i != Integer.MIN_VALUE || bundle.getInt(str, Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i;
        }
        n50.P7K7Inc8(str);
        throw null;
    }

    public float P7K7Inc8(View view) {
        if (P7K7Inc8) {
            try {
                return gh0.qoPGr6Ce(view);
            } catch (NoSuchMethodError unused) {
                P7K7Inc8 = false;
            }
        }
        return view.getAlpha();
    }

    public void Qr9iLBAD(View view, float f) {
        if (P7K7Inc8) {
            try {
                gh0.NCTxEWno(view, f);
                return;
            } catch (NoSuchMethodError unused) {
                P7K7Inc8 = false;
            }
        }
        view.setAlpha(f);
    }
}
