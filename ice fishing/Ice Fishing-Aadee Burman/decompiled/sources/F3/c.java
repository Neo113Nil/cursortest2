package F3;

import D.y;
import a.AbstractC0422a;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes2.dex */
public final class c extends W.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f956a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B.b f957b;

    public /* synthetic */ c(B.b bVar, int i) {
        this.f956a = i;
        this.f957b = bVar;
    }

    @Override // W.d
    public final int clampViewPositionHorizontal(View view, int i, int i6) {
        switch (this.f956a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f957b;
                return AbstractC0422a.h(i, sideSheetBehavior.f36038a.s(), sideSheetBehavior.f36038a.r());
            default:
                return view.getLeft();
        }
    }

    @Override // W.d
    public final int clampViewPositionVertical(View view, int i, int i6) {
        switch (this.f956a) {
            case 0:
                return view.getTop();
            default:
                return AbstractC0422a.h(i, ((BottomSheetBehavior) this.f957b).x(), getViewVerticalDragRange(view));
        }
    }

    @Override // W.d
    public int getViewHorizontalDragRange(View view) {
        switch (this.f956a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f957b;
                return sideSheetBehavior.f36048l + sideSheetBehavior.f36051o;
            default:
                return super.getViewHorizontalDragRange(view);
        }
    }

    @Override // W.d
    public int getViewVerticalDragRange(View view) {
        switch (this.f956a) {
            case 1:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f957b;
                return bottomSheetBehavior.f35838I ? bottomSheetBehavior.f35848T : bottomSheetBehavior.f35836G;
            default:
                return super.getViewVerticalDragRange(view);
        }
    }

    @Override // W.d
    public final void onViewDragStateChanged(int i) {
        switch (this.f956a) {
            case 0:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f957b;
                    if (sideSheetBehavior.f36044g) {
                        sideSheetBehavior.r(1);
                        break;
                    }
                }
                break;
            default:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f957b;
                    if (bottomSheetBehavior.f35839K) {
                        bottomSheetBehavior.C(1);
                        break;
                    }
                }
                break;
        }
    }

    @Override // W.d
    public final void onViewPositionChanged(View view, int i, int i6, int i9, int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.f956a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f957b;
                WeakReference weakReference = sideSheetBehavior.f36053q;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.f36038a.F(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.f36057u;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.f36038a.g(i);
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw y.j(it);
                }
                return;
            default:
                ((BottomSheetBehavior) this.f957b).u(i6);
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        if (r7 > r4.f35834E) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        if (java.lang.Math.abs(r6.getTop() - r4.x()) < java.lang.Math.abs(r6.getTop() - r4.f35834E)) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00be, code lost:
    
        if (java.lang.Math.abs(r7 - r4.f35833D) < java.lang.Math.abs(r7 - r4.f35836G)) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0113, code lost:
    
        if (r0.f36038a.z(r6) == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0143, code lost:
    
        if (java.lang.Math.abs(r7 - r0.f36038a.p()) < java.lang.Math.abs(r7 - r0.f36038a.q())) goto L73;
     */
    @Override // W.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewReleased(View view, float f3, float f9) {
        int i;
        switch (this.f956a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f957b;
                if (!sideSheetBehavior.f36038a.x(f3)) {
                    if (sideSheetBehavior.f36038a.D(view, f3)) {
                        if (!sideSheetBehavior.f36038a.A(f3, f9)) {
                            break;
                        }
                        i = 5;
                    } else {
                        if (f3 == 0.0f || Math.abs(f3) <= Math.abs(f9)) {
                            int left = view.getLeft();
                            break;
                        }
                        i = 5;
                    }
                    sideSheetBehavior.t(view, i, true);
                    break;
                }
                i = 3;
                sideSheetBehavior.t(view, i, true);
                break;
            default:
                int i6 = 6;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f957b;
                if (f9 < 0.0f) {
                    if (!bottomSheetBehavior.f35856b) {
                        int top = view.getTop();
                        System.currentTimeMillis();
                        bottomSheetBehavior.getClass();
                        break;
                    }
                    i6 = 3;
                    bottomSheetBehavior.getClass();
                    bottomSheetBehavior.E(view, i6, true);
                    break;
                } else if (bottomSheetBehavior.f35838I && bottomSheetBehavior.D(view, f9)) {
                    if (Math.abs(f3) >= Math.abs(f9) || f9 <= bottomSheetBehavior.f35860d) {
                        if (view.getTop() <= (bottomSheetBehavior.x() + bottomSheetBehavior.f35848T) / 2) {
                            if (!bottomSheetBehavior.f35856b) {
                                break;
                            }
                            i6 = 3;
                            bottomSheetBehavior.getClass();
                            bottomSheetBehavior.E(view, i6, true);
                        }
                    }
                    i6 = 5;
                    bottomSheetBehavior.getClass();
                    bottomSheetBehavior.E(view, i6, true);
                } else {
                    if (f9 == 0.0f || Math.abs(f3) > Math.abs(f9)) {
                        int top2 = view.getTop();
                        if (bottomSheetBehavior.f35856b) {
                            break;
                        } else {
                            int i9 = bottomSheetBehavior.f35834E;
                            if (top2 < i9) {
                                if (top2 >= Math.abs(top2 - bottomSheetBehavior.f35836G)) {
                                    bottomSheetBehavior.getClass();
                                }
                                i6 = 3;
                            } else {
                                if (Math.abs(top2 - i9) < Math.abs(top2 - bottomSheetBehavior.f35836G)) {
                                    bottomSheetBehavior.getClass();
                                }
                                i6 = 4;
                            }
                        }
                    } else {
                        if (!bottomSheetBehavior.f35856b) {
                            int top3 = view.getTop();
                            if (Math.abs(top3 - bottomSheetBehavior.f35834E) < Math.abs(top3 - bottomSheetBehavior.f35836G)) {
                                bottomSheetBehavior.getClass();
                            }
                        }
                        i6 = 4;
                    }
                    bottomSheetBehavior.getClass();
                    bottomSheetBehavior.E(view, i6, true);
                }
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        if (r6.canScrollVertically(-1) != false) goto L27;
     */
    @Override // W.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean tryCaptureView(View view, int i) {
        WeakReference weakReference;
        switch (this.f956a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f957b;
                if (sideSheetBehavior.f36045h != 1 && (weakReference = sideSheetBehavior.f36052p) != null && weakReference.get() == view) {
                    break;
                }
                break;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f957b;
                int i6 = bottomSheetBehavior.f35840L;
                if (i6 != 1 && !bottomSheetBehavior.f35855a0) {
                    if (i6 == 3 && bottomSheetBehavior.Y == i) {
                        WeakReference weakReference2 = bottomSheetBehavior.f35850V;
                        View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
                        if (view2 != null) {
                            break;
                        }
                    }
                    System.currentTimeMillis();
                    WeakReference weakReference3 = bottomSheetBehavior.f35849U;
                    if (weakReference3 == null || weakReference3.get() != view) {
                    }
                }
                break;
        }
        return true;
    }
}
