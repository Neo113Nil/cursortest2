package androidx.versionedparcelable;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class SolarMeshResponseForeachQpTViIm9P1uXfawhKh25240715431966 extends ViewGroup {
    public final HashMap LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public final HashMap RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;

    public SolarMeshResponseForeachQpTViIm9P1uXfawhKh25240715431966(Context context) {
        super(context);
        setClipChildren(false);
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = new HashMap();
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = new HashMap();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<DeltaSignalDispatcherNormalizationDYlxsjeyEo876BgN5h37814260387863, PhotonFrameGatewayRegistryFHftqQUS8T03y9qWeo72112553481870> getHolderToLayoutNode() {
        return this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
    }

    public final HashMap<PhotonFrameGatewayRegistryFHftqQUS8T03y9qWeo72112553481870, DeltaSignalDispatcherNormalizationDYlxsjeyEo876BgN5h37814260387863> getLayoutNodeToHolder() {
        return this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (DeltaSignalDispatcherNormalizationDYlxsjeyEo876BgN5h37814260387863 deltaSignalDispatcherNormalizationDYlxsjeyEo876BgN5h37814260387863 : this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.keySet()) {
            deltaSignalDispatcherNormalizationDYlxsjeyEo876BgN5h37814260387863.layout(deltaSignalDispatcherNormalizationDYlxsjeyEo876BgN5h37814260387863.getLeft(), deltaSignalDispatcherNormalizationDYlxsjeyEo876BgN5h37814260387863.getTop(), deltaSignalDispatcherNormalizationDYlxsjeyEo876BgN5h37814260387863.getRight(), deltaSignalDispatcherNormalizationDYlxsjeyEo876BgN5h37814260387863.getBottom());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (!(View.MeasureSpec.getMode(i) == 1073741824)) {
            ObsidianEngineLambdaValidationGvCNBIpXin5KgPbxID14685439027799.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800("widthMeasureSpec should be EXACTLY");
        }
        if (!(View.MeasureSpec.getMode(i2) == 1073741824)) {
            ObsidianEngineLambdaValidationGvCNBIpXin5KgPbxID14685439027799.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800("heightMeasureSpec should be EXACTLY");
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        for (DeltaSignalDispatcherNormalizationDYlxsjeyEo876BgN5h37814260387863 deltaSignalDispatcherNormalizationDYlxsjeyEo876BgN5h37814260387863 : this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.keySet()) {
            int i4 = deltaSignalDispatcherNormalizationDYlxsjeyEo876BgN5h37814260387863.LunarNodeAsyncCompressionXhW6Mr3UFps5CRaeph11269602575390;
            if (i4 != Integer.MIN_VALUE && (i3 = deltaSignalDispatcherNormalizationDYlxsjeyEo876BgN5h37814260387863.KryptonFlowJSONControllerMMV4nnkiUvsQudoSQI12761857557216) != Integer.MIN_VALUE) {
                deltaSignalDispatcherNormalizationDYlxsjeyEo876BgN5h37814260387863.measure(i4, i3);
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            PhotonFrameGatewayRegistryFHftqQUS8T03y9qWeo72112553481870 photonFrameGatewayRegistryFHftqQUS8T03y9qWeo72112553481870 = (PhotonFrameGatewayRegistryFHftqQUS8T03y9qWeo72112553481870) this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.get(childAt);
            if (childAt.isLayoutRequested() && photonFrameGatewayRegistryFHftqQUS8T03y9qWeo72112553481870 != null) {
                PhotonFrameGatewayRegistryFHftqQUS8T03y9qWeo72112553481870.VertexLinkProviderDependencyKKfth2vVCV2iqzAPu071258294892353(photonFrameGatewayRegistryFHftqQUS8T03y9qWeo72112553481870, false, 7);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
    }
}
