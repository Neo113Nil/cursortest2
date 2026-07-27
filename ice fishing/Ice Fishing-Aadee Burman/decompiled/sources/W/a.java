package W;

import O.X;
import P.k;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import g1.C4522b;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class a extends C4522b {

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f3361w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar) {
        super(7);
        this.f3361w = bVar;
    }

    @Override // g1.C4522b
    public final k B(int i) {
        b bVar = this.f3361w;
        int i6 = i == 2 ? bVar.f3371k : bVar.f3372l;
        if (i6 == Integer.MIN_VALUE) {
            return null;
        }
        return y(i6);
    }

    @Override // g1.C4522b
    public final boolean T(int i, int i6, Bundle bundle) {
        int i9;
        b bVar = this.f3361w;
        Chip chip = bVar.i;
        if (i == -1) {
            WeakHashMap weakHashMap = X.f2054a;
            return chip.performAccessibilityAction(i6, bundle);
        }
        if (i6 == 1) {
            return bVar.p(i);
        }
        if (i6 == 2) {
            return bVar.j(i);
        }
        boolean z3 = false;
        if (i6 == 64) {
            AccessibilityManager accessibilityManager = bVar.f3369h;
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i9 = bVar.f3371k) == i) {
                return false;
            }
            if (i9 != Integer.MIN_VALUE) {
                bVar.f3371k = Integer.MIN_VALUE;
                bVar.i.invalidate();
                bVar.q(i9, com.anythink.basead.exoplayer.b.aX);
            }
            bVar.f3371k = i;
            chip.invalidate();
            bVar.q(i, 32768);
            return true;
        }
        if (i6 == 128) {
            if (bVar.f3371k != i) {
                return false;
            }
            bVar.f3371k = Integer.MIN_VALUE;
            chip.invalidate();
            bVar.q(i, com.anythink.basead.exoplayer.b.aX);
            return true;
        }
        t3.d dVar = (t3.d) bVar;
        if (i6 == 16) {
            Chip chip2 = dVar.f40861q;
            if (i == 0) {
                return chip2.performClick();
            }
            if (i == 1) {
                chip2.playSoundEffect(0);
                View.OnClickListener onClickListener = chip2.f35915A;
                if (onClickListener != null) {
                    onClickListener.onClick(chip2);
                    z3 = true;
                }
                if (chip2.f35925L) {
                    chip2.f35924K.q(1, 1);
                }
            }
        }
        return z3;
    }

    @Override // g1.C4522b
    public final k y(int i) {
        return new k(AccessibilityNodeInfo.obtain(this.f3361w.n(i).f2409a));
    }
}
