package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class wxo extends geu {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wxo(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.geu
    public int a(View view, int i) {
        ccq ccqVar;
        ccq ccqVar2;
        switch (this.a) {
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.b;
                ccqVar = sideSheetBehavior.sheetDelegate;
                int g = ccqVar.g();
                ccqVar2 = sideSheetBehavior.sheetDelegate;
                return hyf.y(i, g, ccqVar2.f());
            default:
                return super.a(view, i);
        }
    }

    @Override // defpackage.geu
    public int b(View view, int i) {
        switch (this.a) {
            case 1:
                return view.getTop();
            default:
                return super.b(view, i);
        }
    }

    @Override // defpackage.geu
    public int c(View view) {
        int i;
        switch (this.a) {
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.b;
                i = sideSheetBehavior.childWidth;
                return sideSheetBehavior.getInnerMargin() + i;
            default:
                return super.c(view);
        }
    }

    @Override // defpackage.geu
    public void e(int i) {
        switch (this.a) {
            case 0:
                xxo xxoVar = (xxo) this.b;
                boolean z = true;
                if ((i & 2) == 0 && (i & 1) == 0) {
                    z = false;
                }
                xxoVar.R0 = z;
                break;
        }
    }

    @Override // defpackage.geu
    public void g(int i) {
        boolean z;
        switch (this.a) {
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.b;
                if (i == 1) {
                    z = sideSheetBehavior.draggable;
                    if (z) {
                        sideSheetBehavior.setStateInternal(1);
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.geu
    public void h(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ccq ccqVar;
        switch (this.a) {
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.b;
                View coplanarSiblingView = sideSheetBehavior.getCoplanarSiblingView();
                if (coplanarSiblingView != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) coplanarSiblingView.getLayoutParams()) != null) {
                    ccqVar = sideSheetBehavior.sheetDelegate;
                    ccqVar.p(marginLayoutParams, view.getLeft(), view.getRight());
                    coplanarSiblingView.setLayoutParams(marginLayoutParams);
                }
                sideSheetBehavior.dispatchOnSlide(view, i);
                break;
        }
    }

    @Override // defpackage.geu
    public void i(View view, float f, float f2) {
        int calculateTargetStateOnViewReleased;
        switch (this.a) {
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.b;
                calculateTargetStateOnViewReleased = sideSheetBehavior.calculateTargetStateOnViewReleased(view, f, f2);
                sideSheetBehavior.startSettling(view, calculateTargetStateOnViewReleased, sideSheetBehavior.shouldSkipSmoothAnimation());
                break;
        }
    }

    @Override // defpackage.geu
    public final boolean j(int i, View view) {
        int i2;
        WeakReference weakReference;
        WeakReference weakReference2;
        switch (this.a) {
            case 0:
                return false;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.b;
                i2 = sideSheetBehavior.state;
                if (i2 != 1) {
                    weakReference = sideSheetBehavior.viewRef;
                    if (weakReference != null) {
                        weakReference2 = sideSheetBehavior.viewRef;
                        if (weakReference2.get() == view) {
                            return true;
                        }
                    }
                }
                return false;
        }
    }
}
