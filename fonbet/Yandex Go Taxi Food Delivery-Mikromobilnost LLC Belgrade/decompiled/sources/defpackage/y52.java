package defpackage;

import android.view.View;
import ru.yandex.taxi.coordinator.AnchorBottomSheetBehavior;

/* loaded from: classes2.dex */
public final class y52 implements Runnable {
    public final boolean a;
    public final View b;
    public final int c;
    public final boolean w;
    public final /* synthetic */ AnchorBottomSheetBehavior x;

    public y52(AnchorBottomSheetBehavior anchorBottomSheetBehavior, boolean z, View view, int i, boolean z2) {
        this.x = anchorBottomSheetBehavior;
        this.a = z;
        this.b = view;
        this.c = i;
        this.w = z2;
    }

    public final int a() {
        return this.c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        boolean z = this.a;
        AnchorBottomSheetBehavior anchorBottomSheetBehavior = this.x;
        if (z) {
            anchorBottomSheetBehavior.S(i, this.b, this.w);
        } else {
            anchorBottomSheetBehavior.Q(i, false);
        }
        if (jl40.l(anchorBottomSheetBehavior.T, this)) {
            anchorBottomSheetBehavior.T = null;
        }
    }
}
