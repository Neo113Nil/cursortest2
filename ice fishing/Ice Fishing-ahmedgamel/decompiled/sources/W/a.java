package W;

import O.X;
import P.k;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import i1.C4585b;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class a extends C4585b {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ b f3491v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar) {
        super(11);
        this.f3491v = bVar;
    }

    @Override // i1.C4585b
    public final k k(int i) {
        return new k(AccessibilityNodeInfo.obtain(this.f3491v.n(i).f2340a));
    }

    @Override // i1.C4585b
    public final k m(int i) {
        b bVar = this.f3491v;
        int i4 = i == 2 ? bVar.f3501k : bVar.f3502l;
        if (i4 == Integer.MIN_VALUE) {
            return null;
        }
        return k(i4);
    }

    @Override // i1.C4585b
    public final boolean r(int i, int i4, Bundle bundle) {
        int i6;
        b bVar = this.f3491v;
        Chip chip = bVar.i;
        if (i == -1) {
            WeakHashMap weakHashMap = X.f2142a;
            return chip.performAccessibilityAction(i4, bundle);
        }
        if (i4 == 1) {
            return bVar.p(i);
        }
        if (i4 == 2) {
            return bVar.j(i);
        }
        boolean z6 = false;
        if (i4 == 64) {
            AccessibilityManager accessibilityManager = bVar.f3499h;
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i6 = bVar.f3501k) == i) {
                return false;
            }
            if (i6 != Integer.MIN_VALUE) {
                bVar.f3501k = Integer.MIN_VALUE;
                bVar.i.invalidate();
                bVar.q(i6, com.anythink.basead.exoplayer.b.aX);
            }
            bVar.f3501k = i;
            chip.invalidate();
            bVar.q(i, 32768);
            return true;
        }
        if (i4 == 128) {
            if (bVar.f3501k != i) {
                return false;
            }
            bVar.f3501k = Integer.MIN_VALUE;
            chip.invalidate();
            bVar.q(i, com.anythink.basead.exoplayer.b.aX);
            return true;
        }
        v3.c cVar = (v3.c) bVar;
        if (i4 == 16) {
            Chip chip2 = cVar.f41149q;
            if (i == 0) {
                return chip2.performClick();
            }
            if (i == 1) {
                chip2.playSoundEffect(0);
                View.OnClickListener onClickListener = chip2.f36683A;
                if (onClickListener != null) {
                    onClickListener.onClick(chip2);
                    z6 = true;
                }
                if (chip2.f36693L) {
                    chip2.f36692K.q(1, 1);
                }
            }
        }
        return z6;
    }
}
