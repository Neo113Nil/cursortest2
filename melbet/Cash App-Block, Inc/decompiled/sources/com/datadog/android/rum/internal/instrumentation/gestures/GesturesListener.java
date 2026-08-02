package com.datadog.android.rum.internal.instrumentation.gestures;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import coil3.request.OneShotDisposable;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.InternalSdkCore;
import com.datadog.android.rum.GlobalRumMonitor;
import com.datadog.android.rum.RumActionType;
import com.datadog.android.rum.RumMonitor;
import com.datadog.android.rum.internal.tracking.JetpackViewAttributesProvider;
import com.datadog.android.rum.internal.tracking.NoOpInteractionPredicate;
import com.datadog.android.rum.tracking.ActionTrackingStrategy;
import com.datadog.android.rum.tracking.ViewTarget;
import com.google.android.gms.internal.mlkit_vision_common.zzib;
import com.squareup.workflow1.Workflows__WorkflowActionKt$action$1;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes4.dex */
public final class GesturesListener implements GestureDetector.OnGestureListener {
    public final ActionTrackingStrategy androidActionTrackingStrategy;
    public final JetpackViewAttributesProvider[] attributesProviders;
    public final ActionTrackingStrategy composeActionTrackingStrategy;
    public final WeakReference contextRef;
    public final NoOpInteractionPredicate interactionPredicate;
    public final InternalLogger internalLogger;
    public float onTouchDownXPos;
    public float onTouchDownYPos;
    public RumActionType scrollEventType;
    public ViewTarget scrollTargetReference;
    public final InternalSdkCore sdkCore;
    public final WeakReference windowReference;

    public GesturesListener(InternalSdkCore internalSdkCore, WeakReference weakReference, JetpackViewAttributesProvider[] jetpackViewAttributesProviderArr, NoOpInteractionPredicate noOpInteractionPredicate, WeakReference weakReference2, InternalLogger internalLogger, ActionTrackingStrategy actionTrackingStrategy) {
        OneShotDisposable oneShotDisposable = new OneShotDisposable(13);
        internalSdkCore.getClass();
        internalLogger.getClass();
        this.sdkCore = internalSdkCore;
        this.windowReference = weakReference;
        this.attributesProviders = jetpackViewAttributesProviderArr;
        this.interactionPredicate = noOpInteractionPredicate;
        this.contextRef = weakReference2;
        this.internalLogger = internalLogger;
        this.composeActionTrackingStrategy = actionTrackingStrategy;
        this.androidActionTrackingStrategy = oneShotDisposable;
        Context context = (Context) weakReference2.get();
        if (context != null) {
            actionTrackingStrategy.register(internalSdkCore, context);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
    
        if (r9 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
    
        r10 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005f, code lost:
    
        if (r10 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
    
        r6 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0066, code lost:
    
        if (r8.getVisibility() != 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
    
        if ((r8 instanceof android.view.ViewGroup) == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006c, code lost:
    
        r8 = (android.view.ViewGroup) r8;
        r9 = r8.getChildCount();
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0073, code lost:
    
        if (r10 >= r9) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
    
        r3.add(r8.getChildAt(r10));
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005c, code lost:
    
        if (r9 != null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ViewTarget findTarget(View view, float f, float f2, boolean z) {
        ViewTarget findTargetForTap;
        ViewTarget findTargetForTap2;
        LinkedList linkedList = new LinkedList();
        linkedList.add(0, view);
        boolean z2 = false;
        ViewTarget viewTarget = null;
        while (!linkedList.isEmpty()) {
            Object remove = linkedList.remove(0);
            remove.getClass();
            View view2 = (View) remove;
            z2 = z2 || StringsKt__StringsJVMKt.startsWith(view2.getClass().getName(), "androidx.compose.ui.platform.ComposeView", false);
            ActionTrackingStrategy actionTrackingStrategy = this.composeActionTrackingStrategy;
            ActionTrackingStrategy actionTrackingStrategy2 = this.androidActionTrackingStrategy;
            if (z) {
                findTargetForTap = actionTrackingStrategy2.findTargetForScroll(view2, f, f2);
                if (findTargetForTap == null) {
                    findTargetForTap = null;
                }
                findTargetForTap2 = actionTrackingStrategy.findTargetForScroll(view2, f, f2);
            } else {
                findTargetForTap = actionTrackingStrategy2.findTargetForTap(view2, f, f2);
                if (findTargetForTap == null) {
                    findTargetForTap = null;
                }
                findTargetForTap2 = actionTrackingStrategy.findTargetForTap(view2, f, f2);
            }
        }
        if (viewTarget == null) {
            DBUtil.log$default(this.internalLogger, 3, InternalLogger.Target.USER, new Workflows__WorkflowActionKt$action$1(z2 ? "We could not find a valid target for the gesture event. Compose actions tracking not enabled, or the compose view is not tagged." : "We could not find a valid target for the gesture event. The DecorView was empty and either transparent or not clickable for this Activity.", 1), null, false, 56);
        }
        return viewTarget;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        motionEvent.getClass();
        this.scrollTargetReference = null;
        this.scrollEventType = null;
        this.onTouchDownYPos = RecyclerView.DECELERATION_RATE;
        this.onTouchDownXPos = RecyclerView.DECELERATION_RATE;
        this.onTouchDownXPos = motionEvent.getX();
        this.onTouchDownYPos = motionEvent.getY();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        motionEvent2.getClass();
        this.scrollEventType = RumActionType.SWIPE;
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        motionEvent.getClass();
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        View decorView;
        motionEvent2.getClass();
        RumMonitor rumMonitor = GlobalRumMonitor.get(this.sdkCore);
        Window window = (Window) this.windowReference.get();
        if (window != null && (decorView = window.getDecorView()) != null && this.scrollEventType == null) {
            ViewTarget findTarget = motionEvent != null ? findTarget(decorView, motionEvent.getX(), motionEvent.getY(), true) : null;
            if (findTarget != null) {
                this.scrollTargetReference = findTarget;
                LinkedHashMap resolveAttributes = resolveAttributes(findTarget, null);
                zzib.resolveViewTargetName(this.interactionPredicate, findTarget);
                rumMonitor.startAction(resolveAttributes);
                this.scrollEventType = RumActionType.SCROLL;
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
        motionEvent.getClass();
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        ViewTarget findTarget;
        motionEvent.getClass();
        Window window = (Window) this.windowReference.get();
        View decorView = window != null ? window.getDecorView() : null;
        if (decorView == null || (findTarget = findTarget(decorView, motionEvent.getX(), motionEvent.getY(), false)) == null) {
            return true;
        }
        sendTapEventWithTarget(findTarget);
        return true;
    }

    public final LinkedHashMap resolveAttributes(ViewTarget viewTarget, MotionEvent motionEvent) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        View view = (View) viewTarget.viewRef.get();
        if (view != null) {
            String resourceIdName = zzib.resourceIdName((Context) this.contextRef.get(), view.getId());
            linkedHashMap.put("action.target.classname", zzib.targetClassName(view));
            linkedHashMap.put("action.target.resource_id", resourceIdName);
            for (JetpackViewAttributesProvider jetpackViewAttributesProvider : this.attributesProviders) {
                jetpackViewAttributesProvider.getClass();
                JetpackViewAttributesProvider.extractAttributes(view, linkedHashMap);
            }
        }
        if (motionEvent != null) {
            float x = motionEvent.getX() - this.onTouchDownXPos;
            float y = motionEvent.getY() - this.onTouchDownYPos;
            linkedHashMap.put("action.gesture.direction", Math.abs(x) > Math.abs(y) ? x > RecyclerView.DECELERATION_RATE ? "right" : "left" : y > RecyclerView.DECELERATION_RATE ? "down" : "up");
        }
        return linkedHashMap;
    }

    public final void sendTapEventWithTarget(ViewTarget viewTarget) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        View view = (View) viewTarget.viewRef.get();
        if (view != null) {
            String resourceIdName = zzib.resourceIdName((Context) this.contextRef.get(), view.getId());
            linkedHashMap.put("action.target.classname", zzib.targetClassName(view));
            linkedHashMap.put("action.target.resource_id", resourceIdName);
            for (JetpackViewAttributesProvider jetpackViewAttributesProvider : this.attributesProviders) {
                jetpackViewAttributesProvider.getClass();
                JetpackViewAttributesProvider.extractAttributes(view, linkedHashMap);
            }
        }
        RumMonitor rumMonitor = GlobalRumMonitor.get(this.sdkCore);
        zzib.resolveViewTargetName(this.interactionPredicate, viewTarget);
        rumMonitor.addAction(RumActionType.TAP, "", linkedHashMap);
    }
}
