package H3;

import D.x;
import S0.f;
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
    public final /* synthetic */ int f1241a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B.b f1242b;

    public /* synthetic */ c(B.b bVar, int i) {
        this.f1241a = i;
        this.f1242b = bVar;
    }

    @Override // W.d
    public final int clampViewPositionHorizontal(View view, int i, int i4) {
        switch (this.f1241a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f1242b;
                return f.d(i, sideSheetBehavior.f36806a.m(), sideSheetBehavior.f36806a.l());
            default:
                return view.getLeft();
        }
    }

    @Override // W.d
    public final int clampViewPositionVertical(View view, int i, int i4) {
        switch (this.f1241a) {
            case 0:
                return view.getTop();
            default:
                return f.d(i, ((BottomSheetBehavior) this.f1242b).x(), getViewVerticalDragRange(view));
        }
    }

    @Override // W.d
    public int getViewHorizontalDragRange(View view) {
        switch (this.f1241a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f1242b;
                return sideSheetBehavior.f36816l + sideSheetBehavior.f36819o;
            default:
                return super.getViewHorizontalDragRange(view);
        }
    }

    @Override // W.d
    public int getViewVerticalDragRange(View view) {
        switch (this.f1241a) {
            case 1:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f1242b;
                return bottomSheetBehavior.f36606I ? bottomSheetBehavior.f36616T : bottomSheetBehavior.f36604G;
            default:
                return super.getViewVerticalDragRange(view);
        }
    }

    @Override // W.d
    public final void onViewDragStateChanged(int i) {
        switch (this.f1241a) {
            case 0:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f1242b;
                    if (sideSheetBehavior.f36812g) {
                        sideSheetBehavior.r(1);
                        break;
                    }
                }
                break;
            default:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f1242b;
                    if (bottomSheetBehavior.f36607K) {
                        bottomSheetBehavior.C(1);
                        break;
                    }
                }
                break;
        }
    }

    @Override // W.d
    public final void onViewPositionChanged(View view, int i, int i4, int i6, int i9) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.f1241a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f1242b;
                WeakReference weakReference = sideSheetBehavior.f36821q;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.f36806a.B(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.f36825u;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.f36806a.f(i);
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw x.i(it);
                }
                return;
            default:
                ((BottomSheetBehavior) this.f1242b).u(i4);
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        if (r7 > r4.f36602E) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        if (java.lang.Math.abs(r6.getTop() - r4.x()) < java.lang.Math.abs(r6.getTop() - r4.f36602E)) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00be, code lost:
    
        if (java.lang.Math.abs(r7 - r4.f36601D) < java.lang.Math.abs(r7 - r4.f36604G)) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0113, code lost:
    
        if (r0.f36806a.t(r6) == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0143, code lost:
    
        if (java.lang.Math.abs(r7 - r0.f36806a.i()) < java.lang.Math.abs(r7 - r0.f36806a.k())) goto L73;
     */
    @Override // W.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewReleased(View view, float f2, float f9) {
        int i;
        switch (this.f1241a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f1242b;
                if (!sideSheetBehavior.f36806a.s(f2)) {
                    if (sideSheetBehavior.f36806a.A(view, f2)) {
                        if (!sideSheetBehavior.f36806a.u(f2, f9)) {
                            break;
                        }
                        i = 5;
                    } else {
                        if (f2 == 0.0f || Math.abs(f2) <= Math.abs(f9)) {
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
                int i4 = 6;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f1242b;
                if (f9 < 0.0f) {
                    if (!bottomSheetBehavior.f36624b) {
                        int top = view.getTop();
                        System.currentTimeMillis();
                        bottomSheetBehavior.getClass();
                        break;
                    }
                    i4 = 3;
                    bottomSheetBehavior.getClass();
                    bottomSheetBehavior.E(view, i4, true);
                    break;
                } else if (bottomSheetBehavior.f36606I && bottomSheetBehavior.D(view, f9)) {
                    if (Math.abs(f2) >= Math.abs(f9) || f9 <= bottomSheetBehavior.f36628d) {
                        if (view.getTop() <= (bottomSheetBehavior.x() + bottomSheetBehavior.f36616T) / 2) {
                            if (!bottomSheetBehavior.f36624b) {
                                break;
                            }
                            i4 = 3;
                            bottomSheetBehavior.getClass();
                            bottomSheetBehavior.E(view, i4, true);
                        }
                    }
                    i4 = 5;
                    bottomSheetBehavior.getClass();
                    bottomSheetBehavior.E(view, i4, true);
                } else {
                    if (f9 == 0.0f || Math.abs(f2) > Math.abs(f9)) {
                        int top2 = view.getTop();
                        if (bottomSheetBehavior.f36624b) {
                            break;
                        } else {
                            int i6 = bottomSheetBehavior.f36602E;
                            if (top2 < i6) {
                                if (top2 >= Math.abs(top2 - bottomSheetBehavior.f36604G)) {
                                    bottomSheetBehavior.getClass();
                                }
                                i4 = 3;
                            } else {
                                if (Math.abs(top2 - i6) < Math.abs(top2 - bottomSheetBehavior.f36604G)) {
                                    bottomSheetBehavior.getClass();
                                }
                                i4 = 4;
                            }
                        }
                    } else {
                        if (!bottomSheetBehavior.f36624b) {
                            int top3 = view.getTop();
                            if (Math.abs(top3 - bottomSheetBehavior.f36602E) < Math.abs(top3 - bottomSheetBehavior.f36604G)) {
                                bottomSheetBehavior.getClass();
                            }
                        }
                        i4 = 4;
                    }
                    bottomSheetBehavior.getClass();
                    bottomSheetBehavior.E(view, i4, true);
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
        switch (this.f1241a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f1242b;
                if (sideSheetBehavior.f36813h != 1 && (weakReference = sideSheetBehavior.f36820p) != null && weakReference.get() == view) {
                    break;
                }
                break;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f1242b;
                int i4 = bottomSheetBehavior.f36608L;
                if (i4 != 1 && !bottomSheetBehavior.f36623a0) {
                    if (i4 == 3 && bottomSheetBehavior.Y == i) {
                        WeakReference weakReference2 = bottomSheetBehavior.f36618V;
                        View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
                        if (view2 != null) {
                            break;
                        }
                    }
                    System.currentTimeMillis();
                    WeakReference weakReference3 = bottomSheetBehavior.f36617U;
                    if (weakReference3 == null || weakReference3.get() != view) {
                    }
                }
                break;
        }
        return true;
    }
}
