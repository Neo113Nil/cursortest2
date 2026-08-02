package com.google.android.material.bottomsheet;

import android.os.SystemClock;
import android.view.View;
import defpackage.geu;
import defpackage.hyf;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class b extends geu {
    public long a;
    public final /* synthetic */ BottomSheetBehavior b;

    public b(BottomSheetBehavior bottomSheetBehavior) {
        this.b = bottomSheetBehavior;
    }

    @Override // defpackage.geu
    public final int a(View view, int i) {
        return view.getLeft();
    }

    @Override // defpackage.geu
    public final int b(View view, int i) {
        return hyf.y(i, this.b.getExpandedOffset(), d());
    }

    @Override // defpackage.geu
    public final int d() {
        boolean canBeHiddenByDragging;
        BottomSheetBehavior bottomSheetBehavior = this.b;
        canBeHiddenByDragging = bottomSheetBehavior.canBeHiddenByDragging();
        return canBeHiddenByDragging ? bottomSheetBehavior.parentHeight : bottomSheetBehavior.collapsedOffset;
    }

    @Override // defpackage.geu
    public final void g(int i) {
        boolean z;
        if (i == 1) {
            BottomSheetBehavior bottomSheetBehavior = this.b;
            z = bottomSheetBehavior.draggable;
            if (z) {
                bottomSheetBehavior.setStateInternal(1);
            }
        }
    }

    @Override // defpackage.geu
    public final void h(View view, int i, int i2) {
        this.b.dispatchOnSlide(i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        if (r5.shouldExpandOnUpwardDrag(r0, (r10 * 100.0f) / r5.parentHeight) != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
    
        if (r10 > r5.halfExpandedOffset) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0056, code lost:
    
        if (r11 <= r10) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0089, code lost:
    
        if (java.lang.Math.abs(r9.getTop() - r5.getExpandedOffset()) < java.lang.Math.abs(r9.getTop() - r5.halfExpandedOffset)) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00be, code lost:
    
        if (r5.shouldSkipHalfExpandedStateWhenDragging() == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00da, code lost:
    
        if (java.lang.Math.abs(r10 - r5.fitToContentsOffset) < java.lang.Math.abs(r10 - r5.collapsedOffset)) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f2, code lost:
    
        if (r5.shouldSkipHalfExpandedStateWhenDragging() != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0108, code lost:
    
        if (r5.shouldSkipHalfExpandedStateWhenDragging() == false) goto L63;
     */
    @Override // defpackage.geu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(View view, float f, float f2) {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        boolean z4;
        int i2 = 6;
        BottomSheetBehavior bottomSheetBehavior = this.b;
        if (f2 < 0.0f) {
            z4 = bottomSheetBehavior.fitToContents;
            if (!z4) {
                int top = view.getTop();
                long uptimeMillis = SystemClock.uptimeMillis() - this.a;
                if (bottomSheetBehavior.shouldSkipHalfExpandedStateWhenDragging()) {
                }
            }
            i2 = 3;
        } else if (bottomSheetBehavior.hideable && bottomSheetBehavior.shouldHide(view, f2)) {
            if (Math.abs(f) < Math.abs(f2)) {
                i = bottomSheetBehavior.significantVelocityThreshold;
            }
            if (view.getTop() <= (bottomSheetBehavior.getExpandedOffset() + bottomSheetBehavior.parentHeight) / 2) {
                z3 = bottomSheetBehavior.fitToContents;
                if (!z3) {
                }
                i2 = 3;
            }
            i2 = 5;
        } else if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
            int top2 = view.getTop();
            z = bottomSheetBehavior.fitToContents;
            if (!z) {
                int i3 = bottomSheetBehavior.halfExpandedOffset;
                if (top2 < i3) {
                    if (top2 >= Math.abs(top2 - bottomSheetBehavior.collapsedOffset)) {
                    }
                    i2 = 3;
                } else {
                    if (Math.abs(top2 - i3) < Math.abs(top2 - bottomSheetBehavior.collapsedOffset)) {
                    }
                    i2 = 4;
                }
            }
        } else {
            z2 = bottomSheetBehavior.fitToContents;
            if (!z2) {
                int top3 = view.getTop();
                if (Math.abs(top3 - bottomSheetBehavior.halfExpandedOffset) < Math.abs(top3 - bottomSheetBehavior.collapsedOffset)) {
                }
            }
            i2 = 4;
        }
        bottomSheetBehavior.startSettling(view, i2, bottomSheetBehavior.shouldSkipSmoothAnimation());
    }

    @Override // defpackage.geu
    public final boolean j(int i, View view) {
        BottomSheetBehavior bottomSheetBehavior = this.b;
        int i2 = bottomSheetBehavior.state;
        if (i2 == 1 || bottomSheetBehavior.touchingScrollingChild) {
            return false;
        }
        if (i2 == 3 && bottomSheetBehavior.activePointerId == i) {
            WeakReference<View> weakReference = bottomSheetBehavior.nestedScrollingChildRef;
            View view2 = weakReference != null ? weakReference.get() : null;
            if (view2 != null && view2.canScrollVertically(-1)) {
                return false;
            }
        }
        this.a = SystemClock.uptimeMillis();
        Reference reference = bottomSheetBehavior.viewRef;
        return reference != null && reference.get() == view;
    }
}
