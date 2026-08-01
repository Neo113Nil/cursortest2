package U;

import O.K;
import P.f;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class a extends B.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b f1157d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar) {
        super(9);
        this.f1157d = bVar;
    }

    @Override // B.b
    public final f A(int i) {
        b bVar = this.f1157d;
        int i2 = i == 2 ? bVar.f1165k : bVar.f1166l;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return z(i2);
    }

    @Override // B.b
    public final boolean D(int i, int i2, Bundle bundle) {
        int i3;
        b bVar = this.f1157d;
        Chip chip = bVar.i;
        if (i == -1) {
            WeakHashMap weakHashMap = K.f747a;
            return chip.performAccessibilityAction(i2, bundle);
        }
        boolean z2 = true;
        if (i2 == 1) {
            return bVar.p(i);
        }
        if (i2 == 2) {
            return bVar.j(i);
        }
        boolean z3 = false;
        if (i2 == 64) {
            AccessibilityManager accessibilityManager = bVar.f1164h;
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i3 = bVar.f1165k) != i) {
                if (i3 != Integer.MIN_VALUE) {
                    bVar.f1165k = Integer.MIN_VALUE;
                    bVar.i.invalidate();
                    bVar.q(i3, 65536);
                }
                bVar.f1165k = i;
                chip.invalidate();
                bVar.q(i, 32768);
            }
            z2 = false;
        } else {
            if (i2 != 128) {
                G0.d dVar = (G0.d) bVar;
                if (i2 != 16) {
                    return false;
                }
                Chip chip2 = dVar.f282q;
                if (i == 0) {
                    return chip2.performClick();
                }
                if (i != 1) {
                    return false;
                }
                chip2.playSoundEffect(0);
                View.OnClickListener onClickListener = chip2.f2453h;
                if (onClickListener != null) {
                    onClickListener.onClick(chip2);
                    z3 = true;
                }
                if (!chip2.f2462s) {
                    return z3;
                }
                chip2.f2461r.q(1, 1);
                return z3;
            }
            if (bVar.f1165k == i) {
                bVar.f1165k = Integer.MIN_VALUE;
                chip.invalidate();
                bVar.q(i, 65536);
            }
            z2 = false;
        }
        return z2;
    }

    @Override // B.b
    public final f z(int i) {
        return new f(AccessibilityNodeInfo.obtain(this.f1157d.n(i).f891a));
    }
}
