package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import com.kolosta.rejin.jilosa.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class nEk3tCGF implements rw, x8, os {
    public final /* synthetic */ SJ7tYVsF MdtA4re8;
    public final /* synthetic */ int NCTxEWno;

    public /* synthetic */ nEk3tCGF(SJ7tYVsF sJ7tYVsF, int i) {
        this.NCTxEWno = i;
        this.MdtA4re8 = sJ7tYVsF;
    }

    @Override // defpackage.os
    public boolean Ey6iv0m0(yr yrVar) {
        Window.Callback callback;
        int i = this.NCTxEWno;
        SJ7tYVsF sJ7tYVsF = this.MdtA4re8;
        switch (i) {
            case 2:
                Window.Callback callback2 = sJ7tYVsF.OnDfzHZD.getCallback();
                if (callback2 != null) {
                    callback2.onMenuOpened(108, yrVar);
                    break;
                }
                break;
            default:
                if (yrVar == yrVar.k3x7lurq() && sJ7tYVsF.ytu5o6f4 && (callback = sJ7tYVsF.OnDfzHZD.getCallback()) != null && !sJ7tYVsF.N8VPGzVC) {
                    callback.onMenuOpened(108, yrVar);
                    break;
                }
                break;
        }
        return true;
    }

    @Override // defpackage.rw
    public wi0 MdtA4re8(View view, wi0 wi0Var) {
        int i;
        boolean z;
        wi0 wi0Var2;
        boolean z2;
        si0 si0Var = wi0Var.qoPGr6Ce;
        int i2 = si0Var.ow5vqvCr().NCTxEWno;
        SJ7tYVsF sJ7tYVsF = this.MdtA4re8;
        Context context = sJ7tYVsF.ow5vqvCr;
        int i3 = si0Var.ow5vqvCr().NCTxEWno;
        ActionBarContextView actionBarContextView = sJ7tYVsF.RXQxj5Oe;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            i = 0;
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) sJ7tYVsF.RXQxj5Oe.getLayoutParams();
            if (sJ7tYVsF.RXQxj5Oe.isShown()) {
                if (sJ7tYVsF.tef3qNMP == null) {
                    sJ7tYVsF.tef3qNMP = new Rect();
                    sJ7tYVsF.Sjrx9cEN = new Rect();
                }
                Rect rect = sJ7tYVsF.tef3qNMP;
                Rect rect2 = sJ7tYVsF.Sjrx9cEN;
                rect.set(wi0Var.qoPGr6Ce(), si0Var.ow5vqvCr().NCTxEWno, wi0Var.NCTxEWno(), si0Var.ow5vqvCr().wxUZMvaN);
                ViewGroup viewGroup = sJ7tYVsF.U0LaHZX7;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z3 = fh0.qoPGr6Ce;
                    ch0.qoPGr6Ce(viewGroup, rect, rect2);
                } else {
                    if (!fh0.qoPGr6Ce) {
                        fh0.qoPGr6Ce = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            fh0.NCTxEWno = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                fh0.NCTxEWno.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = fh0.NCTxEWno;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect, rect2);
                        } catch (Exception e) {
                            Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
                        }
                    }
                }
                int i4 = rect.top;
                int i5 = rect.left;
                int i6 = rect.right;
                ViewGroup viewGroup2 = sJ7tYVsF.U0LaHZX7;
                WeakHashMap weakHashMap = hg0.qoPGr6Ce;
                wi0 qoPGr6Ce = ag0.qoPGr6Ce(viewGroup2);
                int qoPGr6Ce2 = qoPGr6Ce == null ? 0 : qoPGr6Ce.qoPGr6Ce();
                int NCTxEWno = qoPGr6Ce == null ? 0 : qoPGr6Ce.NCTxEWno();
                if (marginLayoutParams.topMargin == i4 && marginLayoutParams.leftMargin == i5 && marginLayoutParams.rightMargin == i6) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i4;
                    marginLayoutParams.leftMargin = i5;
                    marginLayoutParams.rightMargin = i6;
                    z2 = true;
                }
                if (i4 <= 0 || sJ7tYVsF.Mq3SeTnW != null) {
                    View view2 = sJ7tYVsF.Mq3SeTnW;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i7 = marginLayoutParams2.height;
                        int i8 = marginLayoutParams.topMargin;
                        if (i7 != i8 || marginLayoutParams2.leftMargin != qoPGr6Ce2 || marginLayoutParams2.rightMargin != NCTxEWno) {
                            marginLayoutParams2.height = i8;
                            marginLayoutParams2.leftMargin = qoPGr6Ce2;
                            marginLayoutParams2.rightMargin = NCTxEWno;
                            sJ7tYVsF.Mq3SeTnW.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    sJ7tYVsF.Mq3SeTnW = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = qoPGr6Ce2;
                    layoutParams.rightMargin = NCTxEWno;
                    sJ7tYVsF.U0LaHZX7.addView(sJ7tYVsF.Mq3SeTnW, -1, layoutParams);
                }
                View view4 = sJ7tYVsF.Mq3SeTnW;
                r12 = view4 != null;
                if (r12 && view4.getVisibility() != 0) {
                    View view5 = sJ7tYVsF.Mq3SeTnW;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? context.getColor(R.color.abc_decor_view_status_guard_light) : context.getColor(R.color.abc_decor_view_status_guard));
                }
                if (!sJ7tYVsF.pRiPUEwG && r12) {
                    i3 = 0;
                }
                i = 0;
                z = r12;
                r12 = z2;
            } else {
                i = 0;
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    z = false;
                } else {
                    z = false;
                    r12 = false;
                }
            }
            if (r12) {
                sJ7tYVsF.RXQxj5Oe.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = sJ7tYVsF.Mq3SeTnW;
        if (view6 != null) {
            view6.setVisibility(z ? i : 8);
        }
        if (i2 != i3) {
            int qoPGr6Ce3 = wi0Var.qoPGr6Ce();
            int NCTxEWno2 = wi0Var.NCTxEWno();
            int i9 = si0Var.ow5vqvCr().wxUZMvaN;
            int i10 = Build.VERSION.SDK_INT;
            ii0 hi0Var = i10 >= 36 ? new hi0(wi0Var) : i10 >= 35 ? new gi0(wi0Var) : i10 >= 34 ? new fi0(wi0Var) : i10 >= 31 ? new ei0(wi0Var) : i10 >= 30 ? new di0(wi0Var) : i10 >= 29 ? new ci0(wi0Var) : new ai0(wi0Var);
            hi0Var.VgvYg0wo(bn.qoPGr6Ce(qoPGr6Ce3, i3, NCTxEWno2, i9));
            wi0Var2 = hi0Var.NCTxEWno();
        } else {
            wi0Var2 = wi0Var;
        }
        WeakHashMap weakHashMap2 = hg0.qoPGr6Ce;
        WindowInsets wxUZMvaN = wi0Var2.wxUZMvaN();
        if (wxUZMvaN == null) {
            return wi0Var2;
        }
        WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(wxUZMvaN);
        return !onApplyWindowInsets.equals(wxUZMvaN) ? wi0.VgvYg0wo(onApplyWindowInsets, view) : wi0Var2;
    }

    @Override // defpackage.os
    public void qoPGr6Ce(yr yrVar, boolean z) {
        nBenlUV4 nbenluv4;
        int i = this.NCTxEWno;
        SJ7tYVsF sJ7tYVsF = this.MdtA4re8;
        switch (i) {
            case 2:
                sJ7tYVsF.OxcuoDLp(yrVar);
                break;
            default:
                yr k3x7lurq = yrVar.k3x7lurq();
                int i2 = 0;
                boolean z2 = k3x7lurq != yrVar;
                if (z2) {
                    yrVar = k3x7lurq;
                }
                nBenlUV4[] nbenluv4Arr = sJ7tYVsF.fVMzMhyS;
                int length = nbenluv4Arr != null ? nbenluv4Arr.length : 0;
                while (true) {
                    if (i2 >= length) {
                        nbenluv4 = null;
                    } else {
                        nbenluv4 = nbenluv4Arr[i2];
                        if (nbenluv4 == null || nbenluv4.Qr9iLBAD != yrVar) {
                            i2++;
                        }
                    }
                }
                if (nbenluv4 != null) {
                    if (!z2) {
                        sJ7tYVsF.amk52bBQ(nbenluv4, z);
                        break;
                    } else {
                        sJ7tYVsF.sjUBp5pO(nbenluv4.qoPGr6Ce, nbenluv4, k3x7lurq);
                        sJ7tYVsF.amk52bBQ(nbenluv4, true);
                        break;
                    }
                }
                break;
        }
    }
}
