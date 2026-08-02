package androidx.compose.material.ripple;

import android.content.Context;
import android.view.ViewGroup;
import androidx.camera.video.Recorder;
import androidx.compose.ui.node.DepthSortedSetKt;
import com.squareup.cash.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes3.dex */
public final class RippleContainer extends ViewGroup {
    public final int MaxRippleHosts;
    public int nextHostIndex;
    public final Recorder.AnonymousClass4 rippleHostMap;
    public final ArrayList rippleHosts;
    public final ArrayList unusedRippleHosts;

    public RippleContainer(Context context) {
        super(context);
        this.MaxRippleHosts = 5;
        ArrayList arrayList = new ArrayList();
        this.rippleHosts = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.unusedRippleHosts = arrayList2;
        this.rippleHostMap = new Recorder.AnonymousClass4(17);
        setClipChildren(false);
        RippleHostView rippleHostView = new RippleHostView(context);
        addView(rippleHostView);
        arrayList.add(rippleHostView);
        arrayList2.add(rippleHostView);
        this.nextHostIndex = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    public final void disposeRippleIfNeeded(AndroidRippleNode androidRippleNode) {
        androidRippleNode.rippleHostView = null;
        DepthSortedSetKt.invalidateDraw(androidRippleNode);
        Recorder.AnonymousClass4 anonymousClass4 = this.rippleHostMap;
        RippleHostView rippleHostView = (RippleHostView) ((LinkedHashMap) anonymousClass4.val$audioErrorConsumer).get(androidRippleNode);
        if (rippleHostView != null) {
            rippleHostView.disposeRipple();
            LinkedHashMap linkedHashMap = (LinkedHashMap) anonymousClass4.val$audioErrorConsumer;
            RippleHostView rippleHostView2 = (RippleHostView) linkedHashMap.get(androidRippleNode);
            if (rippleHostView2 != null) {
            }
            linkedHashMap.remove(androidRippleNode);
            this.unusedRippleHosts.add(rippleHostView);
        }
    }

    public final RippleHostView getRippleHostView(AndroidRippleNode androidRippleNode) {
        Recorder.AnonymousClass4 anonymousClass4 = this.rippleHostMap;
        LinkedHashMap linkedHashMap = (LinkedHashMap) anonymousClass4.val$audioErrorConsumer;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) anonymousClass4.val$audioErrorConsumer;
        LinkedHashMap linkedHashMap3 = (LinkedHashMap) anonymousClass4.this$0;
        RippleHostView rippleHostView = (RippleHostView) linkedHashMap.get(androidRippleNode);
        if (rippleHostView != null) {
            return rippleHostView;
        }
        ArrayList arrayList = this.unusedRippleHosts;
        arrayList.getClass();
        RippleHostView rippleHostView2 = (RippleHostView) (arrayList.isEmpty() ? null : arrayList.remove(0));
        if (rippleHostView2 == null) {
            int i = this.nextHostIndex;
            ArrayList arrayList2 = this.rippleHosts;
            if (i > CollectionsKt__CollectionsKt.getLastIndex(arrayList2)) {
                rippleHostView2 = new RippleHostView(getContext());
                addView(rippleHostView2);
                arrayList2.add(rippleHostView2);
            } else {
                rippleHostView2 = (RippleHostView) arrayList2.get(this.nextHostIndex);
                AndroidRippleNode androidRippleNode2 = (AndroidRippleNode) linkedHashMap3.get(rippleHostView2);
                if (androidRippleNode2 != null) {
                    androidRippleNode2.rippleHostView = null;
                    DepthSortedSetKt.invalidateDraw(androidRippleNode2);
                    RippleHostView rippleHostView3 = (RippleHostView) linkedHashMap2.get(androidRippleNode2);
                    if (rippleHostView3 != null) {
                    }
                    linkedHashMap2.remove(androidRippleNode2);
                    rippleHostView2.disposeRipple();
                }
            }
            int i2 = this.nextHostIndex;
            if (i2 < this.MaxRippleHosts - 1) {
                this.nextHostIndex = i2 + 1;
            } else {
                this.nextHostIndex = 0;
            }
        }
        linkedHashMap2.put(androidRippleNode, rippleHostView2);
        linkedHashMap3.put(rippleHostView2, androidRippleNode);
        return rippleHostView2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }
}
