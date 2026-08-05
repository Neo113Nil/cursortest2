package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.kolosta.rejin.jilosa.R;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class r90 extends hs implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public boolean I5GHvsYW;
    public int KlHjfFWx;
    public final Context MdtA4re8;
    public View OnDfzHZD;
    public boolean OxcuoDLp;
    public final boolean P7K7Inc8;
    public final int Qr9iLBAD;
    public final vr VgvYg0wo;
    public boolean amk52bBQ;
    public final int b2ZJblxo;
    public final ns jb9XjC4I;
    public os lDXGDhIF;
    public PopupWindow.OnDismissListener ow5vqvCr;
    public ViewTreeObserver sjUBp5pO;
    public final yr wxUZMvaN;
    public View ygLcUYwZ;
    public final c eVhOlqcC = new c(3, this);
    public final w3 k3x7lurq = new w3(2, this);
    public int Ey6iv0m0 = 0;

    public r90(Context context, yr yrVar, View view, int i, boolean z) {
        this.MdtA4re8 = context;
        this.wxUZMvaN = yrVar;
        this.P7K7Inc8 = z;
        this.VgvYg0wo = new vr(yrVar, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.Qr9iLBAD = i;
        Resources resources = context.getResources();
        this.b2ZJblxo = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.OnDfzHZD = view;
        this.jb9XjC4I = new ns(context, null, i, 0);
        yrVar.NCTxEWno(this, context);
    }

    @Override // defpackage.hs
    public final void Ey6iv0m0(PopupWindow.OnDismissListener onDismissListener) {
        this.ow5vqvCr = onDismissListener;
    }

    @Override // defpackage.hs
    public final void I5GHvsYW(boolean z) {
        this.I5GHvsYW = z;
    }

    @Override // defpackage.hs
    public final void KlHjfFWx(int i) {
        this.jb9XjC4I.b2ZJblxo = i;
    }

    @Override // defpackage.o70
    public final boolean NCTxEWno() {
        return !this.OxcuoDLp && this.jb9XjC4I.lwWCatUu.isShowing();
    }

    @Override // defpackage.ps
    public final Parcelable OnDfzHZD() {
        return null;
    }

    @Override // defpackage.hs
    public final void OxcuoDLp(boolean z) {
        this.VgvYg0wo.MdtA4re8 = z;
    }

    @Override // defpackage.ps
    public final void P7K7Inc8(os osVar) {
        this.lDXGDhIF = osVar;
    }

    @Override // defpackage.hs
    public final void RXQxj5Oe(int i) {
        this.jb9XjC4I.k3x7lurq(i);
    }

    @Override // defpackage.hs
    public final void amk52bBQ(int i) {
        this.Ey6iv0m0 = i;
    }

    @Override // defpackage.o70
    public final void dismiss() {
        if (NCTxEWno()) {
            this.jb9XjC4I.dismiss();
        }
    }

    @Override // defpackage.ps
    public final void eVhOlqcC(boolean z) {
        this.amk52bBQ = false;
        vr vrVar = this.VgvYg0wo;
        if (vrVar != null) {
            vrVar.notifyDataSetChanged();
        }
    }

    @Override // defpackage.o70
    public final fe jb9XjC4I() {
        return this.jb9XjC4I.wxUZMvaN;
    }

    @Override // defpackage.ps
    public final boolean k3x7lurq(ka0 ka0Var) {
        boolean z;
        if (ka0Var.hasVisibleItems()) {
            js jsVar = new js(this.MdtA4re8, ka0Var, this.ygLcUYwZ, this.P7K7Inc8, this.Qr9iLBAD, 0);
            os osVar = this.lDXGDhIF;
            jsVar.Qr9iLBAD = osVar;
            hs hsVar = jsVar.jb9XjC4I;
            if (hsVar != null) {
                hsVar.P7K7Inc8(osVar);
            }
            int size = ka0Var.P7K7Inc8.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                MenuItem item = ka0Var.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            jsVar.b2ZJblxo = z;
            hs hsVar2 = jsVar.jb9XjC4I;
            if (hsVar2 != null) {
                hsVar2.OxcuoDLp(z);
            }
            jsVar.eVhOlqcC = this.ow5vqvCr;
            this.ow5vqvCr = null;
            this.wxUZMvaN.MdtA4re8(false);
            ns nsVar = this.jb9XjC4I;
            int i2 = nsVar.b2ZJblxo;
            int lDXGDhIF = nsVar.lDXGDhIF();
            if ((Gravity.getAbsoluteGravity(this.Ey6iv0m0, this.OnDfzHZD.getLayoutDirection()) & 7) == 5) {
                i2 += this.OnDfzHZD.getWidth();
            }
            if (!jsVar.NCTxEWno()) {
                if (jsVar.VgvYg0wo != null) {
                    jsVar.wxUZMvaN(i2, lDXGDhIF, true, true);
                }
            }
            os osVar2 = this.lDXGDhIF;
            if (osVar2 != null) {
                osVar2.Ey6iv0m0(ka0Var);
            }
            return true;
        }
        return false;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.OxcuoDLp = true;
        this.wxUZMvaN.MdtA4re8(true);
        ViewTreeObserver viewTreeObserver = this.sjUBp5pO;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.sjUBp5pO = this.ygLcUYwZ.getViewTreeObserver();
            }
            this.sjUBp5pO.removeGlobalOnLayoutListener(this.eVhOlqcC);
            this.sjUBp5pO = null;
        }
        this.ygLcUYwZ.removeOnAttachStateChangeListener(this.k3x7lurq);
        PopupWindow.OnDismissListener onDismissListener = this.ow5vqvCr;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // defpackage.ps
    public final boolean ow5vqvCr() {
        return false;
    }

    @Override // defpackage.ps
    public final void qoPGr6Ce(yr yrVar, boolean z) {
        if (yrVar != this.wxUZMvaN) {
            return;
        }
        dismiss();
        os osVar = this.lDXGDhIF;
        if (osVar != null) {
            osVar.qoPGr6Ce(yrVar, z);
        }
    }

    @Override // defpackage.hs
    public final void sjUBp5pO(View view) {
        this.OnDfzHZD = view;
    }

    @Override // defpackage.o70
    public final void wxUZMvaN() {
        View view;
        if (NCTxEWno()) {
            return;
        }
        if (this.OxcuoDLp || (view = this.OnDfzHZD) == null) {
            m1.Ey6iv0m0("StandardMenuPopup cannot be used without an anchor");
            return;
        }
        this.ygLcUYwZ = view;
        ns nsVar = this.jb9XjC4I;
        E3Msy4Bi e3Msy4Bi = nsVar.lwWCatUu;
        E3Msy4Bi e3Msy4Bi2 = nsVar.lwWCatUu;
        e3Msy4Bi.setOnDismissListener(this);
        nsVar.OxcuoDLp = this;
        nsVar.DK9slbsy = true;
        e3Msy4Bi2.setFocusable(true);
        View view2 = this.ygLcUYwZ;
        boolean z = this.sjUBp5pO == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.sjUBp5pO = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.eVhOlqcC);
        }
        view2.addOnAttachStateChangeListener(this.k3x7lurq);
        nsVar.sjUBp5pO = view2;
        nsVar.OnDfzHZD = this.Ey6iv0m0;
        boolean z2 = this.amk52bBQ;
        Context context = this.MdtA4re8;
        vr vrVar = this.VgvYg0wo;
        if (!z2) {
            this.KlHjfFWx = hs.lDXGDhIF(vrVar, context, this.b2ZJblxo);
            this.amk52bBQ = true;
        }
        nsVar.amk52bBQ(this.KlHjfFWx);
        e3Msy4Bi2.setInputMethodMode(2);
        Rect rect = this.NCTxEWno;
        nsVar.WYNAV5pd = rect != null ? new Rect(rect) : null;
        nsVar.wxUZMvaN();
        fe feVar = nsVar.wxUZMvaN;
        feVar.setOnKeyListener(this);
        if (this.I5GHvsYW) {
            yr yrVar = this.wxUZMvaN;
            if (yrVar.OnDfzHZD != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) feVar, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(yrVar.OnDfzHZD);
                }
                frameLayout.setEnabled(false);
                feVar.addHeaderView(frameLayout, null, false);
            }
        }
        nsVar.OxcuoDLp(vrVar);
        nsVar.wxUZMvaN();
    }

    @Override // defpackage.ps
    public final void VgvYg0wo(Parcelable parcelable) {
    }

    @Override // defpackage.hs
    public final void ygLcUYwZ(yr yrVar) {
    }
}
