package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.kolosta.rejin.jilosa.R;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class i extends xp implements k {
    public CharSequence Mq3SeTnW;
    public final Rect SgZGMMPL;
    public final /* synthetic */ l eIA6dogk;
    public f euDDoUNr;
    public int ytu5o6f4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l lVar, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle, 0);
        this.eIA6dogk = lVar;
        this.SgZGMMPL = new Rect();
        this.sjUBp5pO = lVar;
        this.DK9slbsy = true;
        this.lwWCatUu.setFocusable(true);
        this.OxcuoDLp = new g(0, this);
    }

    public final void KlHjfFWx() {
        int i;
        E3Msy4Bi e3Msy4Bi = this.lwWCatUu;
        Drawable background = e3Msy4Bi.getBackground();
        l lVar = this.eIA6dogk;
        Rect rect = lVar.jb9XjC4I;
        if (background != null) {
            background.getPadding(rect);
            boolean z = fh0.qoPGr6Ce;
            i = lVar.getLayoutDirection() == 1 ? rect.right : -rect.left;
        } else {
            i = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = lVar.getPaddingLeft();
        int paddingRight = lVar.getPaddingRight();
        int width = lVar.getWidth();
        int i2 = lVar.Qr9iLBAD;
        if (i2 == -2) {
            int qoPGr6Ce = lVar.qoPGr6Ce(this.euDDoUNr, e3Msy4Bi.getBackground());
            int i3 = (lVar.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (qoPGr6Ce > i3) {
                qoPGr6Ce = i3;
            }
            amk52bBQ(Math.max(qoPGr6Ce, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            amk52bBQ((width - paddingLeft) - paddingRight);
        } else {
            amk52bBQ(i2);
        }
        boolean z2 = fh0.qoPGr6Ce;
        this.b2ZJblxo = lVar.getLayoutDirection() == 1 ? (((width - paddingRight) - this.P7K7Inc8) - this.ytu5o6f4) + i : paddingLeft + this.ytu5o6f4 + i;
    }

    @Override // defpackage.xp, defpackage.k
    public final void OxcuoDLp(ListAdapter listAdapter) {
        super.OxcuoDLp(listAdapter);
        this.euDDoUNr = (f) listAdapter;
    }

    @Override // defpackage.k
    public final void P7K7Inc8(CharSequence charSequence) {
        this.Mq3SeTnW = charSequence;
    }

    @Override // defpackage.k
    public final void ow5vqvCr(int i) {
        this.ytu5o6f4 = i;
    }

    @Override // defpackage.k
    public final CharSequence sjUBp5pO() {
        return this.Mq3SeTnW;
    }

    @Override // defpackage.k
    public final void ygLcUYwZ(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        E3Msy4Bi e3Msy4Bi = this.lwWCatUu;
        boolean isShowing = e3Msy4Bi.isShowing();
        KlHjfFWx();
        e3Msy4Bi.setInputMethodMode(2);
        wxUZMvaN();
        fe feVar = this.wxUZMvaN;
        feVar.setChoiceMode(1);
        feVar.setTextDirection(i);
        feVar.setTextAlignment(i2);
        l lVar = this.eIA6dogk;
        int selectedItemPosition = lVar.getSelectedItemPosition();
        fe feVar2 = this.wxUZMvaN;
        if (e3Msy4Bi.isShowing() && feVar2 != null) {
            feVar2.setListSelectionHidden(false);
            feVar2.setSelection(selectedItemPosition);
            if (feVar2.getChoiceMode() != 0) {
                feVar2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (isShowing || (viewTreeObserver = lVar.getViewTreeObserver()) == null) {
            return;
        }
        c cVar = new c(1, this);
        viewTreeObserver.addOnGlobalLayoutListener(cVar);
        e3Msy4Bi.setOnDismissListener(new h(this, cVar));
    }
}
