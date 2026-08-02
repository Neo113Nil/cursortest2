package com.google.android.material.sidesheet;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Property;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.BackEventCompat;
import androidx.camera.video.Recorder$$ExternalSyntheticLambda14;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.ViewDragHelper;
import androidx.media3.exoplayer.ExoPlayerImpl$$ExternalSyntheticLambda4;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.material.R$styleable;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.motion.MaterialBackHandler;
import com.google.android.material.motion.MaterialSideContainerBackHelper;
import com.google.android.material.shape.AbsoluteCornerSize;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.common.base.Splitter;
import com.nimbusds.jose.jwk.JWK$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.RealBugReportSenderFactory;
import com.withpersona.sdk2.inquiry.shared.ContextUtilsKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.Behavior implements MaterialBackHandler {
    public final ColorStateList backgroundTint;
    public final LinkedHashSet callbacks;
    public int childWidth;
    public final int coplanarSiblingViewId;
    public WeakReference coplanarSiblingViewRef;
    public final AnonymousClass1 dragCallback;
    public final boolean draggable;
    public final float elevation;
    public final float hideFriction;
    public boolean ignoreEvents;
    public int initialX;
    public int innerMargin;
    public final MaterialShapeDrawable materialShapeDrawable;
    public int parentInnerEdge;
    public int parentWidth;
    public final ShapeAppearanceModel shapeAppearanceModel;
    public LeftSheetDelegate sheetDelegate;
    public MaterialSideContainerBackHelper sideContainerBackHelper;
    public int state;
    public final Splitter stateSettlingTracker;
    public VelocityTracker velocityTracker;
    public ViewDragHelper viewDragHelper;
    public WeakReference viewRef;

    /* renamed from: com.google.android.material.sidesheet.SideSheetBehavior$1, reason: invalid class name */
    public final class AnonymousClass1 extends ViewDragHelper.Callback {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ CoordinatorLayout.Behavior this$0;

        public /* synthetic */ AnonymousClass1(CoordinatorLayout.Behavior behavior, int i) {
            this.$r8$classId = i;
            this.this$0 = behavior;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final int clampViewPositionHorizontal(View view, int i) {
            int i2;
            int i3;
            switch (this.$r8$classId) {
                case 0:
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.this$0;
                    LeftSheetDelegate leftSheetDelegate = sideSheetBehavior.sheetDelegate;
                    switch (leftSheetDelegate.$r8$classId) {
                        case 0:
                            i2 = -leftSheetDelegate.sheetBehavior.childWidth;
                            break;
                        default:
                            i2 = leftSheetDelegate.getExpandedOffset();
                            break;
                    }
                    LeftSheetDelegate leftSheetDelegate2 = sideSheetBehavior.sheetDelegate;
                    switch (leftSheetDelegate2.$r8$classId) {
                        case 0:
                            i3 = leftSheetDelegate2.sheetBehavior.innerMargin;
                            break;
                        default:
                            i3 = leftSheetDelegate2.sheetBehavior.parentWidth;
                            break;
                    }
                    return MathUtils.clamp(i, i2, i3);
                default:
                    return view.getLeft();
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final int clampViewPositionVertical(View view, int i) {
            switch (this.$r8$classId) {
                case 0:
                    return view.getTop();
                default:
                    return MathUtils.clamp(i, ((BottomSheetBehavior) this.this$0).getExpandedOffset(), getViewVerticalDragRange());
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int getViewHorizontalDragRange(View view) {
            switch (this.$r8$classId) {
                case 0:
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.this$0;
                    return sideSheetBehavior.childWidth + sideSheetBehavior.innerMargin;
                default:
                    return super.getViewHorizontalDragRange(view);
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int getViewVerticalDragRange() {
            switch (this.$r8$classId) {
                case 1:
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.this$0;
                    return bottomSheetBehavior.hideable ? bottomSheetBehavior.parentHeight : bottomSheetBehavior.collapsedOffset;
                default:
                    return super.getViewVerticalDragRange();
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onViewDragStateChanged(int i) {
            int i2 = this.$r8$classId;
            CoordinatorLayout.Behavior behavior = this.this$0;
            switch (i2) {
                case 0:
                    if (i == 1) {
                        SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) behavior;
                        if (sideSheetBehavior.draggable) {
                            sideSheetBehavior.setStateInternal(1);
                            break;
                        }
                    }
                    break;
                default:
                    if (i == 1) {
                        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) behavior;
                        if (bottomSheetBehavior.draggable) {
                            bottomSheetBehavior.setStateInternal(1);
                            break;
                        }
                    }
                    break;
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onViewPositionChanged(View view, int i, int i2) {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            int i3 = this.$r8$classId;
            CoordinatorLayout.Behavior behavior = this.this$0;
            switch (i3) {
                case 0:
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) behavior;
                    WeakReference weakReference = sideSheetBehavior.coplanarSiblingViewRef;
                    View view2 = weakReference != null ? (View) weakReference.get() : null;
                    if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                        LeftSheetDelegate leftSheetDelegate = sideSheetBehavior.sheetDelegate;
                        int left = view.getLeft();
                        int right = view.getRight();
                        switch (leftSheetDelegate.$r8$classId) {
                            case 0:
                                if (left <= leftSheetDelegate.sheetBehavior.parentWidth) {
                                    marginLayoutParams.leftMargin = right;
                                    break;
                                }
                                break;
                            default:
                                int i4 = leftSheetDelegate.sheetBehavior.parentWidth;
                                if (left <= i4) {
                                    marginLayoutParams.rightMargin = i4 - left;
                                    break;
                                }
                                break;
                        }
                        view2.setLayoutParams(marginLayoutParams);
                    }
                    LinkedHashSet linkedHashSet = sideSheetBehavior.callbacks;
                    if (linkedHashSet.isEmpty()) {
                        return;
                    }
                    LeftSheetDelegate leftSheetDelegate2 = sideSheetBehavior.sheetDelegate;
                    switch (leftSheetDelegate2.$r8$classId) {
                        case 0:
                            leftSheetDelegate2.getHiddenOffset();
                            leftSheetDelegate2.getExpandedOffset();
                            break;
                        default:
                            int i5 = leftSheetDelegate2.sheetBehavior.parentWidth;
                            leftSheetDelegate2.getExpandedOffset();
                            break;
                    }
                    Iterator it = linkedHashSet.iterator();
                    if (it.hasNext()) {
                        throw Recorder$$ExternalSyntheticOutline2.m(it);
                    }
                    return;
                default:
                    ((BottomSheetBehavior) behavior).dispatchOnSlide(i2);
                    return;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
        
            if (r10 > r8.halfExpandedOffset) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0070, code lost:
        
            if (java.lang.Math.abs(r9.getTop() - r8.getExpandedOffset()) < java.lang.Math.abs(r9.getTop() - r8.halfExpandedOffset)) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x009f, code lost:
        
            if (java.lang.Math.abs(r10 - r8.halfExpandedOffset) < java.lang.Math.abs(r10 - r8.collapsedOffset)) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00b9, code lost:
        
            if (java.lang.Math.abs(r10 - r8.fitToContentsOffset) < java.lang.Math.abs(r10 - r8.collapsedOffset)) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00c9, code lost:
        
            if (r10 < java.lang.Math.abs(r10 - r8.collapsedOffset)) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00da, code lost:
        
            if (java.lang.Math.abs(r10 - r11) < java.lang.Math.abs(r10 - r8.collapsedOffset)) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00ed, code lost:
        
            if (r10 < androidx.recyclerview.widget.RecyclerView.DECELERATION_RATE) goto L60;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x00ef, code lost:
        
            r0 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x0116, code lost:
        
            if (java.lang.Math.abs((r0.sheetBehavior.hideFriction * r10) + r9.getRight()) > 0.5f) goto L71;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x0118, code lost:
        
            r0 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x014d, code lost:
        
            if (java.lang.Math.abs(r10) > 500.0f) goto L83;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x014f, code lost:
        
            r10 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x0180, code lost:
        
            if (r9.getLeft() > ((r10.getExpandedOffset() + r10.sheetBehavior.parentWidth) / 2)) goto L95;
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x0182, code lost:
        
            r5 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:71:0x0196, code lost:
        
            if (r5 != false) goto L109;
         */
        /* JADX WARN: Code restructure failed: missing block: B:73:0x0193, code lost:
        
            if (r9.getRight() < ((r10.getExpandedOffset() - r10.getHiddenOffset()) / 2)) goto L95;
         */
        /* JADX WARN: Code restructure failed: missing block: B:80:0x0165, code lost:
        
            if (java.lang.Math.abs(r10) > 500.0f) goto L83;
         */
        /* JADX WARN: Code restructure failed: missing block: B:86:0x01c5, code lost:
        
            if (java.lang.Math.abs(r10 - r8.sheetDelegate.getExpandedOffset()) < java.lang.Math.abs(r10 - r8.sheetDelegate.getHiddenOffset())) goto L108;
         */
        /* JADX WARN: Code restructure failed: missing block: B:87:0x011a, code lost:
        
            r0 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:89:0x012d, code lost:
        
            if (java.lang.Math.abs((r0.sheetBehavior.hideFriction * r10) + r9.getLeft()) > 0.5f) goto L71;
         */
        /* JADX WARN: Code restructure failed: missing block: B:91:0x00f1, code lost:
        
            r0 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:93:0x00f5, code lost:
        
            if (r10 > androidx.recyclerview.widget.RecyclerView.DECELERATION_RATE) goto L60;
         */
        /* JADX WARN: Failed to find 'out' block for switch in B:47:0x00e8. Please report as an issue. */
        /* JADX WARN: Failed to find 'out' block for switch in B:53:0x0102. Please report as an issue. */
        @Override // androidx.customview.widget.ViewDragHelper.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onViewReleased(View view, float f, float f2) {
            boolean z;
            boolean z2;
            int i = this.$r8$classId;
            int i2 = 5;
            CoordinatorLayout.Behavior behavior = this.this$0;
            switch (i) {
                case 0:
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) behavior;
                    boolean z3 = false;
                    switch (sideSheetBehavior.sheetDelegate.$r8$classId) {
                    }
                    if (!z) {
                        LeftSheetDelegate leftSheetDelegate = sideSheetBehavior.sheetDelegate;
                        switch (leftSheetDelegate.$r8$classId) {
                            case 0:
                                break;
                            default:
                                break;
                        }
                        if (!z2) {
                            if (f == RecyclerView.DECELERATION_RATE || Math.abs(f) <= Math.abs(f2)) {
                                int left = view.getLeft();
                                break;
                            }
                        } else {
                            switch (sideSheetBehavior.sheetDelegate.$r8$classId) {
                                case 0:
                                    if (Math.abs(f) > Math.abs(f2)) {
                                        break;
                                    }
                                    break;
                                default:
                                    if (Math.abs(f) > Math.abs(f2)) {
                                        break;
                                    }
                                    break;
                            }
                            boolean z4 = false;
                            if (!z4) {
                                LeftSheetDelegate leftSheetDelegate2 = sideSheetBehavior.sheetDelegate;
                                switch (leftSheetDelegate2.$r8$classId) {
                                    case 0:
                                        break;
                                    default:
                                        break;
                                }
                            }
                        }
                        sideSheetBehavior.startSettling$1(view, i2, true);
                        break;
                    }
                    i2 = 3;
                    sideSheetBehavior.startSettling$1(view, i2, true);
                    break;
                default:
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) behavior;
                    if (f2 < RecyclerView.DECELERATION_RATE) {
                        if (!bottomSheetBehavior.fitToContents) {
                            int top = view.getTop();
                            SystemClock.uptimeMillis();
                            break;
                        }
                        i2 = 3;
                    } else if (!bottomSheetBehavior.hideable || !bottomSheetBehavior.shouldHide(view, f2)) {
                        i2 = 4;
                        if (f2 != RecyclerView.DECELERATION_RATE && Math.abs(f) <= Math.abs(f2)) {
                            if (!bottomSheetBehavior.fitToContents) {
                                int top2 = view.getTop();
                                break;
                            }
                        } else {
                            int top3 = view.getTop();
                            if (bottomSheetBehavior.fitToContents) {
                                break;
                            } else {
                                int i3 = bottomSheetBehavior.halfExpandedOffset;
                                if (top3 >= i3) {
                                    break;
                                } else {
                                    break;
                                }
                                i2 = 6;
                            }
                        }
                    } else if (Math.abs(f) >= Math.abs(f2) || f2 <= bottomSheetBehavior.significantVelocityThreshold) {
                        if (view.getTop() <= (bottomSheetBehavior.getExpandedOffset() + bottomSheetBehavior.parentHeight) / 2) {
                            if (!bottomSheetBehavior.fitToContents) {
                                break;
                            }
                            i2 = 3;
                        }
                    }
                    bottomSheetBehavior.startSettling(view, i2, true);
                    break;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
        
            if (r0.canScrollVertically(-1) != false) goto L31;
         */
        @Override // androidx.customview.widget.ViewDragHelper.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean tryCaptureView(View view, int i) {
            WeakReference weakReference;
            int i2 = this.$r8$classId;
            CoordinatorLayout.Behavior behavior = this.this$0;
            switch (i2) {
                case 0:
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) behavior;
                    if (sideSheetBehavior.state == 1 || (weakReference = sideSheetBehavior.viewRef) == null || weakReference.get() != view) {
                        break;
                    }
                    break;
                default:
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) behavior;
                    int i3 = bottomSheetBehavior.state;
                    if (i3 != 1 && !bottomSheetBehavior.touchingScrollingChild) {
                        if (i3 == 3 && bottomSheetBehavior.activePointerId == i) {
                            View view2 = null;
                            if (bottomSheetBehavior.multipleScrollingChildrenSupported) {
                                WeakReference weakReference2 = bottomSheetBehavior.currentTouchedScrollChildRef;
                                if (weakReference2 != null) {
                                    view2 = (View) weakReference2.get();
                                }
                            } else {
                                ArrayList arrayList = bottomSheetBehavior.nestedScrollingChildrenRef;
                                if (!arrayList.isEmpty()) {
                                    view2 = (View) ((WeakReference) arrayList.get(0)).get();
                                }
                            }
                            if (view2 != null) {
                                break;
                            }
                        }
                        SystemClock.uptimeMillis();
                        WeakReference weakReference3 = bottomSheetBehavior.viewRef;
                        if (weakReference3 != null && weakReference3.get() == view) {
                        }
                    }
                    break;
            }
            return false;
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.stateSettlingTracker = new Splitter(this);
        this.draggable = true;
        this.state = 5;
        this.hideFriction = 0.1f;
        this.coplanarSiblingViewId = -1;
        this.callbacks = new LinkedHashSet();
        this.dragCallback = new AnonymousClass1(this, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SideSheetBehavior_Layout);
        if (obtainStyledAttributes.hasValue(3)) {
            this.backgroundTint = ContextUtilsKt.getColorStateList(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.shapeAppearanceModel = ShapeAppearanceModel.builder(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).build();
        }
        if (obtainStyledAttributes.hasValue(5)) {
            int resourceId = obtainStyledAttributes.getResourceId(5, -1);
            this.coplanarSiblingViewId = resourceId;
            WeakReference weakReference = this.coplanarSiblingViewRef;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.coplanarSiblingViewRef = null;
            WeakReference weakReference2 = this.viewRef;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1 && view.isLaidOut()) {
                    view.requestLayout();
                }
            }
        }
        ShapeAppearanceModel shapeAppearanceModel = this.shapeAppearanceModel;
        if (shapeAppearanceModel != null) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(shapeAppearanceModel);
            this.materialShapeDrawable = materialShapeDrawable;
            materialShapeDrawable.initializeElevationOverlay(context);
            ColorStateList colorStateList = this.backgroundTint;
            if (colorStateList != null) {
                this.materialShapeDrawable.setFillColor(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.materialShapeDrawable.setTint(typedValue.data);
            }
        }
        this.elevation = obtainStyledAttributes.getDimension(2, -1.0f);
        this.draggable = obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public final void cancelBackProgress() {
        MaterialSideContainerBackHelper materialSideContainerBackHelper = this.sideContainerBackHelper;
        if (materialSideContainerBackHelper == null) {
            return;
        }
        View view = materialSideContainerBackHelper.view;
        if (materialSideContainerBackHelper.onCancelBackProgress() == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(materialSideContainerBackHelper.cancelDuration);
        animatorSet.start();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.google.android.material.motion.MaterialSideContainerBackHelper.1.<init>(com.google.android.material.motion.MaterialSideContainerBackHelper, boolean, int):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:290)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:193)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    @Override // com.google.android.material.motion.MaterialBackHandler
    public final void handleBackInvoked() {
        /*
            r12 = this;
            com.google.android.material.motion.MaterialSideContainerBackHelper r0 = r12.sideContainerBackHelper
            if (r0 != 0) goto L5
            return
        L5:
            androidx.activity.BackEventCompat r1 = r0.backEvent
            r2 = 0
            r0.backEvent = r2
            r3 = 5
            if (r1 == 0) goto Lc2
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 34
            if (r4 >= r5) goto L15
            goto Lc2
        L15:
            com.google.android.material.sidesheet.LeftSheetDelegate r4 = r12.sheetDelegate
            r5 = 3
            if (r4 == 0) goto L22
            int r4 = r4.getSheetEdge()
            if (r4 != 0) goto L21
            goto L22
        L21:
            r3 = r5
        L22:
            androidx.transition.Transition$3 r4 = new androidx.transition.Transition$3
            r6 = 10
            r4.<init>(r12, r6)
            java.lang.ref.WeakReference r6 = r12.coplanarSiblingViewRef
            if (r6 == 0) goto L34
            java.lang.Object r6 = r6.get()
            android.view.View r6 = (android.view.View) r6
            goto L35
        L34:
            r6 = r2
        L35:
            if (r6 != 0) goto L38
            goto L53
        L38:
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r7 = (android.view.ViewGroup.MarginLayoutParams) r7
            if (r7 != 0) goto L41
            goto L53
        L41:
            com.google.android.material.sidesheet.LeftSheetDelegate r2 = r12.sheetDelegate
            int r2 = r2.$r8$classId
            switch(r2) {
                case 0: goto L4b;
                default: goto L48;
            }
        L48:
            int r2 = r7.rightMargin
            goto L4d
        L4b:
            int r2 = r7.leftMargin
        L4d:
            com.google.android.material.sidesheet.SideSheetBehavior$$ExternalSyntheticLambda2 r8 = new com.google.android.material.sidesheet.SideSheetBehavior$$ExternalSyntheticLambda2
            r8.<init>()
            r2 = r8
        L53:
            android.view.View r12 = r0.view
            int r6 = r1.swipeEdge
            r7 = 1
            r8 = 0
            if (r6 != 0) goto L5d
            r6 = r7
            goto L5e
        L5d:
            r6 = r8
        L5e:
            int r9 = r12.getLayoutDirection()
            int r9 = android.view.Gravity.getAbsoluteGravity(r3, r9)
            r9 = r9 & r5
            if (r9 != r5) goto L6b
            r5 = r7
            goto L6c
        L6b:
            r5 = r8
        L6c:
            int r9 = r12.getWidth()
            float r9 = (float) r9
            float r10 = r12.getScaleX()
            float r10 = r10 * r9
            android.view.ViewGroup$LayoutParams r9 = r12.getLayoutParams()
            boolean r11 = r9 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r11 == 0) goto L88
            android.view.ViewGroup$MarginLayoutParams r9 = (android.view.ViewGroup.MarginLayoutParams) r9
            if (r5 == 0) goto L85
            int r9 = r9.leftMargin
            goto L89
        L85:
            int r9 = r9.rightMargin
            goto L89
        L88:
            r9 = r8
        L89:
            float r9 = (float) r9
            float r10 = r10 + r9
            android.util.Property r9 = android.view.View.TRANSLATION_X
            if (r5 == 0) goto L90
            float r10 = -r10
        L90:
            float[] r5 = new float[r7]
            r5[r8] = r10
            android.animation.ObjectAnimator r12 = android.animation.ObjectAnimator.ofFloat(r12, r9, r5)
            if (r2 == 0) goto L9d
            r12.addUpdateListener(r2)
        L9d:
            androidx.interpolator.view.animation.FastOutSlowInInterpolator r2 = new androidx.interpolator.view.animation.FastOutSlowInInterpolator
            r2.<init>(r8)
            r12.setInterpolator(r2)
            int r2 = r0.hideDurationMax
            int r5 = r0.hideDurationMin
            float r1 = r1.progress
            int r1 = com.google.android.material.animation.AnimationUtils.lerp(r2, r5, r1)
            long r1 = (long) r1
            r12.setDuration(r1)
            com.google.android.material.motion.MaterialSideContainerBackHelper$1 r1 = new com.google.android.material.motion.MaterialSideContainerBackHelper$1
            r1.<init>()
            r12.addListener(r1)
            r12.addListener(r4)
            r12.start()
            return
        Lc2:
            r12.setState(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.handleBackInvoked():void");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void onAttachedToLayoutParams(CoordinatorLayout.LayoutParams layoutParams) {
        this.viewRef = null;
        this.viewDragHelper = null;
        this.sideContainerBackHelper = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void onDetachedFromLayoutParams() {
        this.viewRef = null;
        this.viewDragHelper = null;
        this.sideContainerBackHelper = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (androidx.core.view.ViewCompat.Api28Impl.getAccessibilityPaneTitle(r4) != null) goto L6;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        ViewDragHelper viewDragHelper;
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        }
        if (this.draggable) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0 && (velocityTracker = this.velocityTracker) != null) {
                velocityTracker.recycle();
                this.velocityTracker = null;
            }
            if (this.velocityTracker == null) {
                this.velocityTracker = VelocityTracker.obtain();
            }
            this.velocityTracker.addMovement(motionEvent);
            if (actionMasked == 0) {
                this.initialX = (int) motionEvent.getX();
            } else if ((actionMasked == 1 || actionMasked == 3) && this.ignoreEvents) {
                this.ignoreEvents = false;
                return false;
            }
            return (this.ignoreEvents || (viewDragHelper = this.viewDragHelper) == null || !viewDragHelper.shouldInterceptTouchEvent(motionEvent)) ? false : true;
        }
        this.ignoreEvents = true;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        View view2;
        View view3;
        int left;
        int i2;
        int outerEdge;
        int i3;
        View findViewById;
        int i4 = 1;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        WeakReference weakReference = this.viewRef;
        MaterialShapeDrawable materialShapeDrawable = this.materialShapeDrawable;
        int i5 = 0;
        if (weakReference == null) {
            this.viewRef = new WeakReference(view);
            this.sideContainerBackHelper = new MaterialSideContainerBackHelper(view);
            if (materialShapeDrawable != null) {
                view.setBackground(materialShapeDrawable);
                float f = this.elevation;
                if (f == -1.0f) {
                    f = view.getElevation();
                }
                materialShapeDrawable.setElevation(f);
            } else {
                ColorStateList colorStateList = this.backgroundTint;
                if (colorStateList != null) {
                    WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
                    view.setBackgroundTintList(colorStateList);
                }
            }
            int i6 = this.state == 5 ? 4 : 0;
            if (view.getVisibility() != i6) {
                view.setVisibility(i6);
            }
            updateAccessibilityActions$1();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            WeakHashMap weakHashMap2 = ViewCompat.sViewPropertyAnimatorMap;
            if (ViewCompat.Api28Impl.getAccessibilityPaneTitle(view) == null) {
                ViewCompat.setAccessibilityPaneTitle(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i7 = Gravity.getAbsoluteGravity(((CoordinatorLayout.LayoutParams) view.getLayoutParams()).gravity, i) == 3 ? 1 : 0;
        LeftSheetDelegate leftSheetDelegate = this.sheetDelegate;
        if (leftSheetDelegate == null || leftSheetDelegate.getSheetEdge() != i7) {
            CoordinatorLayout.LayoutParams layoutParams = null;
            ShapeAppearanceModel shapeAppearanceModel = this.shapeAppearanceModel;
            if (i7 == 0) {
                this.sheetDelegate = new LeftSheetDelegate(this, i4);
                if (shapeAppearanceModel != null) {
                    WeakReference weakReference2 = this.viewRef;
                    if (weakReference2 != null && (view3 = (View) weakReference2.get()) != null && (view3.getLayoutParams() instanceof CoordinatorLayout.LayoutParams)) {
                        layoutParams = (CoordinatorLayout.LayoutParams) view3.getLayoutParams();
                    }
                    if (layoutParams == null || ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin <= 0) {
                        RealBugReportSenderFactory builder = shapeAppearanceModel.toBuilder();
                        builder.backStackDumper = new AbsoluteCornerSize(RecyclerView.DECELERATION_RATE);
                        builder.featureEligibilityDumper = new AbsoluteCornerSize(RecyclerView.DECELERATION_RATE);
                        ShapeAppearanceModel build = builder.build();
                        if (materialShapeDrawable != null) {
                            materialShapeDrawable.setShapeAppearanceModel(build);
                        }
                    }
                }
            } else {
                if (i7 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i7, "Invalid sheet edge position value: ", ". Must be 0 or 1."));
                    return false;
                }
                this.sheetDelegate = new LeftSheetDelegate(this, i5);
                if (shapeAppearanceModel != null) {
                    WeakReference weakReference3 = this.viewRef;
                    if (weakReference3 != null && (view2 = (View) weakReference3.get()) != null && (view2.getLayoutParams() instanceof CoordinatorLayout.LayoutParams)) {
                        layoutParams = (CoordinatorLayout.LayoutParams) view2.getLayoutParams();
                    }
                    if (layoutParams == null || ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin <= 0) {
                        RealBugReportSenderFactory builder2 = shapeAppearanceModel.toBuilder();
                        builder2.endpoint = new AbsoluteCornerSize(RecyclerView.DECELERATION_RATE);
                        builder2.cashDatabase = new AbsoluteCornerSize(RecyclerView.DECELERATION_RATE);
                        ShapeAppearanceModel build2 = builder2.build();
                        if (materialShapeDrawable != null) {
                            materialShapeDrawable.setShapeAppearanceModel(build2);
                        }
                    }
                }
            }
        }
        if (this.viewDragHelper == null) {
            this.viewDragHelper = new ViewDragHelper(coordinatorLayout.getContext(), coordinatorLayout, this.dragCallback);
        }
        int outerEdge2 = this.sheetDelegate.getOuterEdge(view);
        coordinatorLayout.onLayoutChild(view, i);
        this.parentWidth = coordinatorLayout.getWidth();
        switch (this.sheetDelegate.$r8$classId) {
            case 0:
                left = coordinatorLayout.getLeft();
                break;
            default:
                left = coordinatorLayout.getRight();
                break;
        }
        this.parentInnerEdge = left;
        this.childWidth = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams != null) {
            switch (this.sheetDelegate.$r8$classId) {
                case 0:
                    i2 = marginLayoutParams.leftMargin;
                    break;
                default:
                    i2 = marginLayoutParams.rightMargin;
                    break;
            }
        } else {
            i2 = 0;
        }
        this.innerMargin = i2;
        int i8 = this.state;
        if (i8 == 1 || i8 == 2) {
            outerEdge = outerEdge2 - this.sheetDelegate.getOuterEdge(view);
        } else if (i8 == 3) {
            outerEdge = 0;
        } else {
            if (i8 != 5) {
                JWK$$ExternalSyntheticBUOutline0.m(this.state, "Unexpected value: ");
                return false;
            }
            outerEdge = this.sheetDelegate.getHiddenOffset();
        }
        WeakHashMap weakHashMap3 = ViewCompat.sViewPropertyAnimatorMap;
        view.offsetLeftAndRight(outerEdge);
        if (this.coplanarSiblingViewRef == null && (i3 = this.coplanarSiblingViewId) != -1 && (findViewById = coordinatorLayout.findViewById(i3)) != null) {
            this.coplanarSiblingViewRef = new WeakReference(findViewById);
        }
        Iterator it = this.callbacks.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                a$$ExternalSyntheticBUOutline0.m$1();
                return false;
            }
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void onRestoreInstanceState(View view, Parcelable parcelable) {
        int i = ((SavedState) parcelable).state;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.state = i;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final Parcelable onSaveInstanceState(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new SavedState(this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.state == 1 && actionMasked == 0) {
            return true;
        }
        if (shouldHandleDraggingWithHelper$1()) {
            this.viewDragHelper.processTouchEvent(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.velocityTracker) != null) {
            velocityTracker.recycle();
            this.velocityTracker = null;
        }
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
        this.velocityTracker.addMovement(motionEvent);
        if (shouldHandleDraggingWithHelper$1() && actionMasked == 2 && !this.ignoreEvents && shouldHandleDraggingWithHelper$1()) {
            float abs = Math.abs(this.initialX - motionEvent.getX());
            ViewDragHelper viewDragHelper = this.viewDragHelper;
            if (abs > viewDragHelper.mTouchSlop) {
                viewDragHelper.captureChildView(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.ignoreEvents;
    }

    public final void setState(int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        WeakReference weakReference = this.viewRef;
        if (weakReference == null || weakReference.get() == null) {
            setStateInternal(i);
            return;
        }
        View view = (View) this.viewRef.get();
        Recorder$$ExternalSyntheticLambda14 recorder$$ExternalSyntheticLambda14 = new Recorder$$ExternalSyntheticLambda14(this, i, 12);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
            view.post(recorder$$ExternalSyntheticLambda14);
        } else {
            recorder$$ExternalSyntheticLambda14.run();
        }
    }

    public final void setStateInternal(int i) {
        View view;
        if (this.state == i) {
            return;
        }
        this.state = i;
        WeakReference weakReference = this.viewRef;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i2 = this.state == 5 ? 4 : 0;
        if (view.getVisibility() != i2) {
            view.setVisibility(i2);
        }
        Iterator it = this.callbacks.iterator();
        if (it.hasNext()) {
            throw Recorder$$ExternalSyntheticOutline2.m(it);
        }
        updateAccessibilityActions$1();
    }

    public final boolean shouldHandleDraggingWithHelper$1() {
        if (this.viewDragHelper != null) {
            return this.draggable || this.state == 1;
        }
        return false;
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public final void startBackProgress(BackEventCompat backEventCompat) {
        MaterialSideContainerBackHelper materialSideContainerBackHelper = this.sideContainerBackHelper;
        if (materialSideContainerBackHelper == null) {
            return;
        }
        materialSideContainerBackHelper.backEvent = backEventCompat;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        if (r1.settleCapturedViewAt(r0, r3.getTop()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004b, code lost:
    
        setStateInternal(2);
        r2.stateSettlingTracker.continueSettlingToState(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0054, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        if (r3 != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void startSettling$1(View view, int i, boolean z) {
        int expandedOffset;
        if (i == 3) {
            expandedOffset = this.sheetDelegate.getExpandedOffset();
        } else {
            if (i != 5) {
                a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Invalid state to get outer edge offset: "));
                return;
            }
            expandedOffset = this.sheetDelegate.getHiddenOffset();
        }
        ViewDragHelper viewDragHelper = this.viewDragHelper;
        if (viewDragHelper != null) {
            if (!z) {
                int top = view.getTop();
                viewDragHelper.mCapturedView = view;
                viewDragHelper.mActivePointerId = -1;
                boolean forceSettleCapturedViewAt = viewDragHelper.forceSettleCapturedViewAt(expandedOffset, top, 0, 0);
                if (!forceSettleCapturedViewAt && viewDragHelper.mDragState == 0 && viewDragHelper.mCapturedView != null) {
                    viewDragHelper.mCapturedView = null;
                }
            }
        }
        setStateInternal(i);
    }

    public final void updateAccessibilityActions$1() {
        View view;
        WeakReference weakReference = this.viewRef;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        ViewCompat.removeActionWithId(view, PKIFailureInfo.transactionIdInUse);
        ViewCompat.notifyViewAccessibilityStateChangedIfNeeded(view, 0);
        ViewCompat.removeActionWithId(view, PKIFailureInfo.badCertTemplate);
        ViewCompat.notifyViewAccessibilityStateChangedIfNeeded(view, 0);
        int i = 3;
        int i2 = 5;
        if (this.state != 5) {
            ViewCompat.replaceAccessibilityAction(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_DISMISS, null, new ExoPlayerImpl$$ExternalSyntheticLambda4(this, i2, i));
        }
        if (this.state != 3) {
            ViewCompat.replaceAccessibilityAction(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_EXPAND, null, new ExoPlayerImpl$$ExternalSyntheticLambda4(this, i, i));
        }
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public final void updateBackProgress(BackEventCompat backEventCompat) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        MaterialSideContainerBackHelper materialSideContainerBackHelper = this.sideContainerBackHelper;
        if (materialSideContainerBackHelper == null) {
            return;
        }
        LeftSheetDelegate leftSheetDelegate = this.sheetDelegate;
        int i = (leftSheetDelegate == null || leftSheetDelegate.getSheetEdge() == 0) ? 5 : 3;
        if (materialSideContainerBackHelper.backEvent == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        BackEventCompat backEventCompat2 = materialSideContainerBackHelper.backEvent;
        materialSideContainerBackHelper.backEvent = backEventCompat;
        if (backEventCompat2 != null) {
            materialSideContainerBackHelper.updateBackProgress(i, backEventCompat.progress, backEventCompat.swipeEdge == 0);
        }
        WeakReference weakReference = this.viewRef;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = (View) this.viewRef.get();
        WeakReference weakReference2 = this.coplanarSiblingViewRef;
        View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
        if (view2 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) == null) {
            return;
        }
        this.sheetDelegate.updateCoplanarSiblingAdjacentMargin(marginLayoutParams, (int) ((view.getScaleX() * this.childWidth) + this.innerMargin));
        view2.requestLayout();
    }

    public final class SavedState extends androidx.customview.view.AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new AbsSavedState.AnonymousClass2(15);
        public final int state;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.state = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.state);
        }

        public SavedState(SideSheetBehavior sideSheetBehavior) {
            super(android.view.AbsSavedState.EMPTY_STATE);
            this.state = sideSheetBehavior.state;
        }
    }

    public SideSheetBehavior() {
        this.stateSettlingTracker = new Splitter(this);
        this.draggable = true;
        this.state = 5;
        this.hideFriction = 0.1f;
        this.coplanarSiblingViewId = -1;
        this.callbacks = new LinkedHashSet();
        this.dragCallback = new AnonymousClass1(this, 0);
    }
}
