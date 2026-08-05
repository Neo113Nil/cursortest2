package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class ji0 extends si0 {
    public static boolean OnDfzHZD = false;
    public static Field OxcuoDLp;
    public static Class lDXGDhIF;
    public static Field sjUBp5pO;
    public static Method ygLcUYwZ;
    public final WindowInsets MdtA4re8;
    public wi0 P7K7Inc8;
    public int Qr9iLBAD;
    public bn VgvYg0wo;
    public bn b2ZJblxo;
    public int eVhOlqcC;
    public int jb9XjC4I;
    public Rect[][] k3x7lurq;
    public Rect[][] ow5vqvCr;
    public bn[] wxUZMvaN;

    public ji0(wi0 wi0Var, WindowInsets windowInsets) {
        super(wi0Var);
        this.VgvYg0wo = null;
        this.k3x7lurq = new Rect[10][];
        this.ow5vqvCr = new Rect[10][];
        this.MdtA4re8 = windowInsets;
    }

    private id DK9slbsy(View view) {
        Display display;
        if (view == null || (display = view.getDisplay()) == null) {
            return null;
        }
        Point point = new Point();
        display.getRealSize(point);
        if (this.qoPGr6Ce.qoPGr6Ce.amk52bBQ()) {
            return id.qoPGr6Ce(point.x, point.y, true, 0, 0, 0, 0);
        }
        b40 i7xS8jrb = w30.i7xS8jrb(display, 0);
        b40 i7xS8jrb2 = w30.i7xS8jrb(display, 1);
        b40 i7xS8jrb3 = w30.i7xS8jrb(display, 2);
        b40 i7xS8jrb4 = w30.i7xS8jrb(display, 3);
        return id.qoPGr6Ce(point.x, point.y, false, i7xS8jrb != null ? i7xS8jrb.NCTxEWno : 0, i7xS8jrb2 != null ? i7xS8jrb2.NCTxEWno : 0, i7xS8jrb3 != null ? i7xS8jrb3.NCTxEWno : 0, i7xS8jrb4 != null ? i7xS8jrb4.NCTxEWno : 0);
    }

    private bn SgZGMMPL() {
        wi0 wi0Var = this.P7K7Inc8;
        return wi0Var != null ? wi0Var.qoPGr6Ce.eVhOlqcC() : bn.VgvYg0wo;
    }

    private Rect[] U0LaHZX7(bn bnVar) {
        ArrayList arrayList = new ArrayList();
        int i = bnVar.qoPGr6Ce;
        int i2 = bnVar.wxUZMvaN;
        int i3 = bnVar.MdtA4re8;
        int i4 = bnVar.NCTxEWno;
        if (i != 0) {
            arrayList.add(new Rect(0, 0, bnVar.qoPGr6Ce, this.jb9XjC4I));
        }
        if (i4 != 0) {
            arrayList.add(new Rect(0, 0, this.eVhOlqcC, i4));
        }
        if (i3 != 0) {
            int i5 = this.eVhOlqcC;
            arrayList.add(new Rect(i5 - i3, 0, i5, this.jb9XjC4I));
        }
        if (i2 != 0) {
            int i6 = this.jb9XjC4I;
            arrayList.add(new Rect(0, i6 - i2, this.eVhOlqcC, i6));
        }
        return (Rect[]) arrayList.toArray(new Rect[arrayList.size()]);
    }

    public static boolean VhgXwMj9(int i, int i2) {
        return (i & 6) == (i2 & 6);
    }

    private static void eIA6dogk() {
        try {
            ygLcUYwZ = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            lDXGDhIF = cls;
            sjUBp5pO = cls.getDeclaredField("mVisibleInsets");
            OxcuoDLp = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            sjUBp5pO.setAccessible(true);
            OxcuoDLp.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        }
        OnDfzHZD = true;
    }

    private bn i7xS8jrb(int i, boolean z) {
        bn bnVar = bn.VgvYg0wo;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                bn Mq3SeTnW = Mq3SeTnW(i2, z);
                bnVar = bn.qoPGr6Ce(Math.max(bnVar.qoPGr6Ce, Mq3SeTnW.qoPGr6Ce), Math.max(bnVar.NCTxEWno, Mq3SeTnW.NCTxEWno), Math.max(bnVar.MdtA4re8, Mq3SeTnW.MdtA4re8), Math.max(bnVar.wxUZMvaN, Mq3SeTnW.wxUZMvaN));
            }
        }
        return bnVar;
    }

    private static List<Rect> lwWCatUu(Rect[][] rectArr, int i) {
        Rect[] rectArr2;
        Rect[] rectArr3 = null;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && (rectArr2 = rectArr[e50.eVhOlqcC(i2)]) != null) {
                if (rectArr3 == null) {
                    rectArr3 = rectArr2;
                } else {
                    Rect[] rectArr4 = new Rect[rectArr3.length + rectArr2.length];
                    System.arraycopy(rectArr3, 0, rectArr4, 0, rectArr3.length);
                    System.arraycopy(rectArr2, 0, rectArr4, rectArr3.length, rectArr2.length);
                    rectArr3 = rectArr4;
                }
            }
        }
        return rectArr3 == null ? Collections.EMPTY_LIST : Arrays.asList(rectArr3);
    }

    private bn ytu5o6f4(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            m1.b2ZJblxo("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            return null;
        }
        if (!OnDfzHZD) {
            eIA6dogk();
        }
        Method method = ygLcUYwZ;
        if (method != null && lDXGDhIF != null && sjUBp5pO != null) {
            try {
                Object invoke = method.invoke(view, null);
                if (invoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) sjUBp5pO.get(OxcuoDLp.get(invoke));
                if (rect != null) {
                    return bn.qoPGr6Ce(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
        }
        return null;
    }

    @Override // defpackage.si0
    public void Ey6iv0m0(bn[] bnVarArr) {
        this.wxUZMvaN = bnVarArr;
    }

    @Override // defpackage.si0
    public void FySoLYna(int i) {
        this.Qr9iLBAD = i;
    }

    @Override // defpackage.si0
    public void I5GHvsYW(wi0 wi0Var) {
        this.P7K7Inc8 = wi0Var;
    }

    public bn Mq3SeTnW(int i, boolean z) {
        bn eVhOlqcC;
        int i2;
        bn bnVar = bn.VgvYg0wo;
        if (i != 1) {
            if (i != 2) {
                if (i == 8) {
                    bn[] bnVarArr = this.wxUZMvaN;
                    eVhOlqcC = bnVarArr != null ? bnVarArr[e50.eVhOlqcC(8)] : null;
                    if (eVhOlqcC != null) {
                        return eVhOlqcC;
                    }
                    bn ow5vqvCr = ow5vqvCr();
                    bn SgZGMMPL = SgZGMMPL();
                    int i3 = ow5vqvCr.wxUZMvaN;
                    if (i3 > SgZGMMPL.wxUZMvaN) {
                        return bn.qoPGr6Ce(0, 0, 0, i3);
                    }
                    bn bnVar2 = this.b2ZJblxo;
                    if (bnVar2 != null && !bnVar2.equals(bnVar) && (i2 = this.b2ZJblxo.wxUZMvaN) > SgZGMMPL.wxUZMvaN) {
                        return bn.qoPGr6Ce(0, 0, 0, i2);
                    }
                } else {
                    if (i == 16) {
                        return k3x7lurq();
                    }
                    if (i == 32) {
                        return jb9XjC4I();
                    }
                    if (i == 64) {
                        return OnDfzHZD();
                    }
                    if (i == 128) {
                        wi0 wi0Var = this.P7K7Inc8;
                        gd b2ZJblxo = wi0Var != null ? wi0Var.qoPGr6Ce.b2ZJblxo() : b2ZJblxo();
                        if (b2ZJblxo != null) {
                            int i4 = Build.VERSION.SDK_INT;
                            return bn.qoPGr6Ce(i4 >= 28 ? fd.wxUZMvaN(b2ZJblxo.qoPGr6Ce) : 0, i4 >= 28 ? fd.P7K7Inc8(b2ZJblxo.qoPGr6Ce) : 0, i4 >= 28 ? fd.VgvYg0wo(b2ZJblxo.qoPGr6Ce) : 0, i4 >= 28 ? fd.MdtA4re8(b2ZJblxo.qoPGr6Ce) : 0);
                        }
                    }
                }
            } else {
                if (z) {
                    bn SgZGMMPL2 = SgZGMMPL();
                    bn eVhOlqcC2 = eVhOlqcC();
                    return bn.qoPGr6Ce(Math.max(SgZGMMPL2.qoPGr6Ce, eVhOlqcC2.qoPGr6Ce), 0, Math.max(SgZGMMPL2.MdtA4re8, eVhOlqcC2.MdtA4re8), Math.max(SgZGMMPL2.wxUZMvaN, eVhOlqcC2.wxUZMvaN));
                }
                if ((this.Qr9iLBAD & 2) == 0) {
                    bn ow5vqvCr2 = ow5vqvCr();
                    wi0 wi0Var2 = this.P7K7Inc8;
                    eVhOlqcC = wi0Var2 != null ? wi0Var2.qoPGr6Ce.eVhOlqcC() : null;
                    int i5 = ow5vqvCr2.wxUZMvaN;
                    if (eVhOlqcC != null) {
                        i5 = Math.min(i5, eVhOlqcC.wxUZMvaN);
                    }
                    return bn.qoPGr6Ce(ow5vqvCr2.qoPGr6Ce, 0, ow5vqvCr2.MdtA4re8, i5);
                }
            }
        } else {
            if (z) {
                return bn.qoPGr6Ce(0, Math.max(SgZGMMPL().NCTxEWno, ow5vqvCr().NCTxEWno), 0, 0);
            }
            if ((this.Qr9iLBAD & 4) == 0) {
                return bn.qoPGr6Ce(0, ow5vqvCr().NCTxEWno, 0, 0);
            }
        }
        return bnVar;
    }

    @Override // defpackage.si0
    public List<Rect> P7K7Inc8(int i) {
        return lwWCatUu(this.ow5vqvCr, i);
    }

    @Override // defpackage.si0
    public bn Qr9iLBAD(int i) {
        return i7xS8jrb(i, false);
    }

    @Override // defpackage.si0
    public List<Rect> VgvYg0wo(int i) {
        return lwWCatUu(this.k3x7lurq, i);
    }

    @Override // defpackage.si0
    public void WYNAV5pd(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.ow5vqvCr = (Rect[][]) rectArr.clone();
    }

    @Override // defpackage.si0
    public boolean amk52bBQ() {
        return this.MdtA4re8.isRound();
    }

    @Override // defpackage.si0
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        ji0 ji0Var = (ji0) obj;
        return Objects.equals(this.b2ZJblxo, ji0Var.b2ZJblxo) && VhgXwMj9(this.Qr9iLBAD, ji0Var.Qr9iLBAD);
    }

    public bn euDDoUNr(int i) {
        return i7xS8jrb(i, true);
    }

    @Override // defpackage.si0
    public void gjV1z5T1(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.k3x7lurq = (Rect[][]) rectArr.clone();
    }

    @Override // defpackage.si0
    public void lDXGDhIF() {
        for (int i = 1; i <= 512; i <<= 1) {
            int eVhOlqcC = e50.eVhOlqcC(i);
            this.k3x7lurq[eVhOlqcC] = U0LaHZX7(Qr9iLBAD(i));
            if (i != 8) {
                this.ow5vqvCr[eVhOlqcC] = U0LaHZX7(euDDoUNr(i));
            }
        }
    }

    @Override // defpackage.si0
    public final bn ow5vqvCr() {
        bn bnVar = this.VgvYg0wo;
        if (bnVar != null) {
            return bnVar;
        }
        WindowInsets windowInsets = this.MdtA4re8;
        bn qoPGr6Ce = bn.qoPGr6Ce(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        this.VgvYg0wo = qoPGr6Ce;
        return qoPGr6Ce;
    }

    public void pRiPUEwG(bn bnVar) {
        this.b2ZJblxo = bnVar;
    }

    @Override // defpackage.si0
    public wi0 sjUBp5pO(int i, int i2, int i3, int i4) {
        wi0 VgvYg0wo = wi0.VgvYg0wo(this.MdtA4re8, null);
        int i5 = Build.VERSION.SDK_INT;
        ii0 hi0Var = i5 >= 36 ? new hi0(VgvYg0wo) : i5 >= 35 ? new gi0(VgvYg0wo) : i5 >= 34 ? new fi0(VgvYg0wo) : i5 >= 31 ? new ei0(VgvYg0wo) : i5 >= 30 ? new di0(VgvYg0wo) : i5 >= 29 ? new ci0(VgvYg0wo) : new ai0(VgvYg0wo);
        hi0Var.VgvYg0wo(wi0.MdtA4re8(ow5vqvCr(), i, i2, i3, i4));
        hi0Var.wxUZMvaN(wi0.MdtA4re8(eVhOlqcC(), i, i2, i3, i4));
        return hi0Var.NCTxEWno();
    }

    @Override // defpackage.si0
    public void wxUZMvaN(View view) {
        this.eVhOlqcC = view.getWidth();
        this.jb9XjC4I = view.getHeight();
        bn ytu5o6f4 = ytu5o6f4(view);
        if (ytu5o6f4 == null) {
            ytu5o6f4 = bn.VgvYg0wo;
        }
        pRiPUEwG(ytu5o6f4);
    }

    @Override // defpackage.si0
    public void ygLcUYwZ(View view) {
        DK9slbsy(view);
    }

    @Override // defpackage.si0
    public void KlHjfFWx(id idVar) {
    }
}
