package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipDrawable;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class xpb extends xso {
    public final /* synthetic */ Chip G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xpb(Chip chip, Chip chip2) {
        super(chip2);
        this.G = chip;
    }

    @Override // defpackage.xso
    public final int e(float f, float f2) {
        boolean hasCloseIcon;
        RectF closeIconTouchBounds;
        Chip chip = this.G;
        hasCloseIcon = chip.hasCloseIcon();
        if (!hasCloseIcon) {
            return 0;
        }
        closeIconTouchBounds = chip.getCloseIconTouchBounds();
        return closeIconTouchBounds.contains(f, f2) ? 1 : 0;
    }

    @Override // defpackage.xso
    public final void f(ArrayList arrayList) {
        boolean hasCloseIcon;
        View.OnClickListener onClickListener;
        arrayList.add(0);
        Chip chip = this.G;
        hasCloseIcon = chip.hasCloseIcon();
        if (hasCloseIcon && chip.isCloseIconVisible()) {
            onClickListener = chip.onCloseIconClickListener;
            if (onClickListener != null) {
                arrayList.add(1);
            }
        }
    }

    @Override // defpackage.xso
    public final boolean k(int i, int i2, Bundle bundle) {
        if (i2 != 16) {
            return false;
        }
        Chip chip = this.G;
        if (i == 0) {
            return chip.performClick();
        }
        if (i == 1) {
            return chip.performCloseIconClick();
        }
        return false;
    }

    @Override // defpackage.xso
    public final void l(wh whVar) {
        Chip chip = this.G;
        whVar.m(chip.isCheckable());
        whVar.q(chip.isClickable());
        whVar.p(chip.getAccessibilityClassName());
        whVar.E(chip.getText());
    }

    @Override // defpackage.xso
    public final void m(int i, wh whVar) {
        Rect rect;
        Rect closeIconTouchBoundsInt;
        if (i != 1) {
            whVar.t("");
            rect = Chip.EMPTY_BOUNDS;
            whVar.k(rect);
            return;
        }
        Chip chip = this.G;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            whVar.t(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            whVar.t(chip.getContext().getString(kxh0.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
        }
        closeIconTouchBoundsInt = chip.getCloseIconTouchBoundsInt();
        whVar.k(closeIconTouchBoundsInt);
        whVar.b(ph.g);
        whVar.v(chip.isEnabled());
        whVar.p(Button.class.getName());
    }

    @Override // defpackage.xso
    public final void n(int i, boolean z) {
        boolean z2;
        Chip chip = this.G;
        if (i == 1) {
            chip.closeIconFocused = z;
        }
        ChipDrawable chipDrawable = chip.chipDrawable;
        z2 = chip.closeIconFocused;
        if (chipDrawable.refreshCloseIconFocus(z2)) {
            chip.refreshDrawableState();
        }
    }
}
