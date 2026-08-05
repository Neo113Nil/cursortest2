package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class lg extends tg0 {
    public final /* synthetic */ e5 VgvYg0wo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lg(e5 e5Var) {
        super(1, (byte) 0);
        this.VgvYg0wo = e5Var;
    }

    @Override // defpackage.tg0
    public final nSmgoSB5 DK9slbsy(int i) {
        e5 e5Var = this.VgvYg0wo;
        int i2 = i == 2 ? e5Var.k3x7lurq : e5Var.ow5vqvCr;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return WYNAV5pd(i2);
    }

    @Override // defpackage.tg0
    public final nSmgoSB5 WYNAV5pd(int i) {
        return new nSmgoSB5(AccessibilityNodeInfo.obtain(this.VgvYg0wo.ygLcUYwZ(i).qoPGr6Ce));
    }

    @Override // defpackage.tg0
    public final boolean ytu5o6f4(int i, int i2, Bundle bundle) {
        int i3;
        e5 e5Var = this.VgvYg0wo;
        Chip chip = e5Var.jb9XjC4I;
        if (i == -1) {
            return chip.performAccessibilityAction(i2, bundle);
        }
        if (i2 == 1) {
            return e5Var.sjUBp5pO(i);
        }
        if (i2 == 2) {
            return e5Var.eVhOlqcC(i);
        }
        boolean z = false;
        if (i2 == 64) {
            AccessibilityManager accessibilityManager = e5Var.Qr9iLBAD;
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i3 = e5Var.k3x7lurq) == i) {
                return false;
            }
            if (i3 != Integer.MIN_VALUE) {
                e5Var.k3x7lurq = Integer.MIN_VALUE;
                chip.invalidate();
                e5Var.OxcuoDLp(i3, 65536);
            }
            e5Var.k3x7lurq = i;
            chip.invalidate();
            e5Var.OxcuoDLp(i, 32768);
            return true;
        }
        if (i2 == 128) {
            if (e5Var.k3x7lurq != i) {
                return false;
            }
            e5Var.k3x7lurq = Integer.MIN_VALUE;
            chip.invalidate();
            e5Var.OxcuoDLp(i, 65536);
            return true;
        }
        Chip chip2 = e5Var.ygLcUYwZ;
        if (i2 == 16) {
            if (i == 0) {
                return chip2.performClick();
            }
            if (i == 1) {
                chip2.playSoundEffect(0);
                View.OnClickListener onClickListener = chip2.jb9XjC4I;
                if (onClickListener != null) {
                    onClickListener.onClick(chip2);
                    z = true;
                }
                if (chip2.Ey6iv0m0) {
                    chip2.KlHjfFWx.OxcuoDLp(1, 1);
                }
            }
        }
        return z;
    }
}
