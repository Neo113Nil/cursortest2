package defpackage;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class ai0 extends ii0 {
    public static boolean P7K7Inc8 = false;
    public static boolean Qr9iLBAD = false;
    public static Field VgvYg0wo;
    public static Constructor b2ZJblxo;
    public WindowInsets MdtA4re8;
    public bn wxUZMvaN;

    public ai0() {
        this.MdtA4re8 = P7K7Inc8();
    }

    private static WindowInsets P7K7Inc8() {
        if (!P7K7Inc8) {
            try {
                VgvYg0wo = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e);
            }
            P7K7Inc8 = true;
        }
        Field field = VgvYg0wo;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e2) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e2);
            }
        }
        if (!Qr9iLBAD) {
            try {
                b2ZJblxo = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e3) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e3);
            }
            Qr9iLBAD = true;
        }
        Constructor constructor = b2ZJblxo;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e4);
            }
        }
        return null;
    }

    @Override // defpackage.ii0
    public wi0 NCTxEWno() {
        qoPGr6Ce();
        wi0 VgvYg0wo2 = wi0.VgvYg0wo(this.MdtA4re8, null);
        si0 si0Var = VgvYg0wo2.qoPGr6Ce;
        si0Var.Ey6iv0m0(null);
        si0Var.RXQxj5Oe(this.wxUZMvaN);
        si0Var.KlHjfFWx(null);
        si0Var.gjV1z5T1(this.qoPGr6Ce);
        si0Var.WYNAV5pd(this.NCTxEWno);
        return VgvYg0wo2;
    }

    @Override // defpackage.ii0
    public void VgvYg0wo(bn bnVar) {
        WindowInsets windowInsets = this.MdtA4re8;
        if (windowInsets != null) {
            this.MdtA4re8 = windowInsets.replaceSystemWindowInsets(bnVar.qoPGr6Ce, bnVar.NCTxEWno, bnVar.MdtA4re8, bnVar.wxUZMvaN);
        }
    }

    @Override // defpackage.ii0
    public void wxUZMvaN(bn bnVar) {
        this.wxUZMvaN = bnVar;
    }

    public ai0(wi0 wi0Var) {
        super(wi0Var);
        this.MdtA4re8 = wi0Var.wxUZMvaN();
    }
}
