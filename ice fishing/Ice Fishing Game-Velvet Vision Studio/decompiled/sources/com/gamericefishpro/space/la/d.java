package com.gamericefishpro.space.la;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.i9.d5;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends com.gamericefishpro.space.k4.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ com.gamericefishpro.space.p3.a b;

    public /* synthetic */ d(com.gamericefishpro.space.p3.a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // com.gamericefishpro.space.k4.d
    public final int clampViewPositionHorizontal(View view, int i, int i2) {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.b;
                return d5.q(i, sideSheetBehavior.a.A(), sideSheetBehavior.a.z());
            default:
                return view.getLeft();
        }
    }

    @Override // com.gamericefishpro.space.k4.d
    public final int clampViewPositionVertical(View view, int i, int i2) {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return view.getTop();
            default:
                return d5.q(i, ((BottomSheetBehavior) this.b).x(), getViewVerticalDragRange(view));
        }
    }

    @Override // com.gamericefishpro.space.k4.d
    public int getViewHorizontalDragRange(View view) {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.b;
                return sideSheetBehavior.l + sideSheetBehavior.o;
            default:
                return super.getViewHorizontalDragRange(view);
        }
    }

    @Override // com.gamericefishpro.space.k4.d
    public int getViewVerticalDragRange(View view) {
        switch (this.a) {
            case 1:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.b;
                return bottomSheetBehavior.I ? bottomSheetBehavior.V : bottomSheetBehavior.G;
            default:
                return super.getViewVerticalDragRange(view);
        }
    }

    @Override // com.gamericefishpro.space.k4.d
    public final void onViewDragStateChanged(int i) {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.b;
                    if (sideSheetBehavior.g) {
                        sideSheetBehavior.r(1);
                    }
                }
                break;
            default:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.b;
                    if (bottomSheetBehavior.K) {
                        bottomSheetBehavior.C(1);
                    }
                }
                break;
        }
    }

    @Override // com.gamericefishpro.space.k4.d
    public final void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.b;
                WeakReference weakReference = sideSheetBehavior.q;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.a.S(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.u;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.a.i(i);
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw com.gamericefishpro.space.m5.a.f(it);
                }
                return;
            default:
                ((BottomSheetBehavior) this.b).u(i2);
                return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0053  */
    /* JADX WARN: Code duplicated, block: B:36:0x008c  */
    /* JADX WARN: Code duplicated, block: B:73:0x0145  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // com.gamericefishpro.space.k4.d
    public final void onViewReleased(View view, float f, float f2) {
        int i;
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.b;
                if (!sideSheetBehavior.a.G(f)) {
                    if (!sideSheetBehavior.a.O(view, f)) {
                        if (f == 0.0f || Math.abs(f) <= Math.abs(f2)) {
                            int left = view.getLeft();
                            i = Math.abs(left - sideSheetBehavior.a.w()) < Math.abs(left - sideSheetBehavior.a.x()) ? 3 : 5;
                        }
                    } else if (sideSheetBehavior.a.J(f, f2) || sideSheetBehavior.a.I(view)) {
                    }
                }
                sideSheetBehavior.t(view, i, true);
                break;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.b;
                int i2 = 6;
                if (f2 < 0.0f) {
                    if (bottomSheetBehavior.b) {
                        i2 = 3;
                    } else {
                        int top = view.getTop();
                        SystemClock.uptimeMillis();
                        bottomSheetBehavior.getClass();
                        if (top <= bottomSheetBehavior.E) {
                            i2 = 3;
                        }
                    }
                } else if (bottomSheetBehavior.I && bottomSheetBehavior.D(view, f2)) {
                    if (Math.abs(f) >= Math.abs(f2) || f2 <= bottomSheetBehavior.d) {
                        if (view.getTop() > (bottomSheetBehavior.x() + bottomSheetBehavior.V) / 2) {
                            i2 = 5;
                        } else if (bottomSheetBehavior.b || Math.abs(view.getTop() - bottomSheetBehavior.x()) < Math.abs(view.getTop() - bottomSheetBehavior.E)) {
                            i2 = 3;
                        }
                    } else {
                        i2 = 5;
                    }
                } else if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
                    int top2 = view.getTop();
                    if (!bottomSheetBehavior.b) {
                        int i3 = bottomSheetBehavior.E;
                        if (top2 < i3) {
                            if (top2 < Math.abs(top2 - bottomSheetBehavior.G)) {
                                i2 = 3;
                            } else {
                                bottomSheetBehavior.getClass();
                            }
                        } else if (Math.abs(top2 - i3) < Math.abs(top2 - bottomSheetBehavior.G)) {
                            bottomSheetBehavior.getClass();
                        } else {
                            i2 = 4;
                        }
                    } else if (Math.abs(top2 - bottomSheetBehavior.D) < Math.abs(top2 - bottomSheetBehavior.G)) {
                        i2 = 3;
                    } else {
                        i2 = 4;
                    }
                } else if (bottomSheetBehavior.b) {
                    i2 = 4;
                } else {
                    int top3 = view.getTop();
                    if (Math.abs(top3 - bottomSheetBehavior.E) < Math.abs(top3 - bottomSheetBehavior.G)) {
                        bottomSheetBehavior.getClass();
                    } else {
                        i2 = 4;
                    }
                }
                bottomSheetBehavior.getClass();
                bottomSheetBehavior.E(view, i2, true);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0031  */
    @Override // com.gamericefishpro.space.k4.d
    public final boolean tryCaptureView(View view, int i) {
        WeakReference weakReference;
        WeakReference weakReference2;
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.b;
                return (sideSheetBehavior.h == 1 || (weakReference = sideSheetBehavior.p) == null || weakReference.get() != view) ? false : true;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.b;
                int i2 = bottomSheetBehavior.N;
                if (i2 != 1 && !bottomSheetBehavior.c0) {
                    if (i2 == 3 && bottomSheetBehavior.a0 == i) {
                        WeakReference weakReference3 = bottomSheetBehavior.X;
                        View view2 = weakReference3 != null ? (View) weakReference3.get() : null;
                        if (view2 == null || !view2.canScrollVertically(-1)) {
                            SystemClock.uptimeMillis();
                            weakReference2 = bottomSheetBehavior.W;
                            if (weakReference2 == null) {
                            }
                        }
                    } else {
                        SystemClock.uptimeMillis();
                        weakReference2 = bottomSheetBehavior.W;
                        if (weakReference2 == null && weakReference2.get() == view) {
                            return true;
                        }
                    }
                }
                return false;
        }
    }
}
