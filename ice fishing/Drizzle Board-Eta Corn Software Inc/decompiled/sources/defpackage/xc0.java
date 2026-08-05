package defpackage;

import android.content.Context;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class xc0 implements ps {
    public cs MdtA4re8;
    public yr NCTxEWno;
    public final /* synthetic */ Toolbar wxUZMvaN;

    public xc0(Toolbar toolbar) {
        this.wxUZMvaN = toolbar;
    }

    @Override // defpackage.ps
    public final boolean MdtA4re8(cs csVar) {
        Toolbar toolbar = this.wxUZMvaN;
        KeyEvent.Callback callback = toolbar.eVhOlqcC;
        if (callback instanceof w5) {
            ((es) ((w5) callback)).NCTxEWno.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.eVhOlqcC);
        toolbar.removeView(toolbar.jb9XjC4I);
        toolbar.eVhOlqcC = null;
        ArrayList arrayList = toolbar.SgZGMMPL;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.MdtA4re8 = null;
        toolbar.requestLayout();
        csVar.i7xS8jrb = false;
        csVar.ygLcUYwZ.sjUBp5pO(false);
        toolbar.Ey6iv0m0();
        return true;
    }

    @Override // defpackage.ps
    public final Parcelable OnDfzHZD() {
        return null;
    }

    @Override // defpackage.ps
    public final void Qr9iLBAD(Context context, yr yrVar) {
        cs csVar;
        yr yrVar2 = this.NCTxEWno;
        if (yrVar2 != null && (csVar = this.MdtA4re8) != null) {
            yrVar2.wxUZMvaN(csVar);
        }
        this.NCTxEWno = yrVar;
    }

    @Override // defpackage.ps
    public final boolean b2ZJblxo(cs csVar) {
        Toolbar toolbar = this.wxUZMvaN;
        toolbar.MdtA4re8();
        ViewParent parent = toolbar.jb9XjC4I.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.jb9XjC4I);
            }
            toolbar.addView(toolbar.jb9XjC4I);
        }
        View actionView = csVar.getActionView();
        toolbar.eVhOlqcC = actionView;
        this.MdtA4re8 = csVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.eVhOlqcC);
            }
            yc0 Qr9iLBAD = Toolbar.Qr9iLBAD();
            Qr9iLBAD.qoPGr6Ce = (toolbar.lDXGDhIF & 112) | 8388611;
            Qr9iLBAD.NCTxEWno = 2;
            toolbar.eVhOlqcC.setLayoutParams(Qr9iLBAD);
            toolbar.addView(toolbar.eVhOlqcC);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((yc0) childAt.getLayoutParams()).NCTxEWno != 2 && childAt != toolbar.NCTxEWno) {
                toolbar.removeViewAt(childCount);
                toolbar.SgZGMMPL.add(childAt);
            }
        }
        toolbar.requestLayout();
        csVar.i7xS8jrb = true;
        csVar.ygLcUYwZ.sjUBp5pO(false);
        KeyEvent.Callback callback = toolbar.eVhOlqcC;
        if (callback instanceof w5) {
            ((es) ((w5) callback)).NCTxEWno.onActionViewExpanded();
        }
        toolbar.Ey6iv0m0();
        return true;
    }

    @Override // defpackage.ps
    public final void eVhOlqcC(boolean z) {
        if (this.MdtA4re8 != null) {
            yr yrVar = this.NCTxEWno;
            if (yrVar != null) {
                int size = yrVar.P7K7Inc8.size();
                for (int i = 0; i < size; i++) {
                    if (this.NCTxEWno.getItem(i) == this.MdtA4re8) {
                        return;
                    }
                }
            }
            MdtA4re8(this.MdtA4re8);
        }
    }

    @Override // defpackage.ps
    public final int getId() {
        return 0;
    }

    @Override // defpackage.ps
    public final boolean k3x7lurq(ka0 ka0Var) {
        return false;
    }

    @Override // defpackage.ps
    public final boolean ow5vqvCr() {
        return false;
    }

    @Override // defpackage.ps
    public final void VgvYg0wo(Parcelable parcelable) {
    }

    @Override // defpackage.ps
    public final void qoPGr6Ce(yr yrVar, boolean z) {
    }
}
