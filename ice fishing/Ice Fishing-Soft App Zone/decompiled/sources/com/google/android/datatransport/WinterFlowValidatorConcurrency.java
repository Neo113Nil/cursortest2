package com.google.android.datatransport;

import android.content.Context;
import android.view.ViewGroup;
import com.icewinter.flow.winter.icecatch.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowValidatorConcurrency extends ViewGroup {
    public final WinterFlowAlgorithmArray WinterFlowRouterRouter;
    public int WinterFlowSyntax;
    public final ArrayList WinterFlowTransactionManagerStrategy;
    public final ArrayList WinterFlowUnitTestResponse;
    public final int WinterFlowVariableVersionControl;

    public WinterFlowValidatorConcurrency(Context context) {
        super(context);
        this.WinterFlowVariableVersionControl = 5;
        ArrayList arrayList = new ArrayList();
        this.WinterFlowTransactionManagerStrategy = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.WinterFlowUnitTestResponse = arrayList2;
        this.WinterFlowRouterRouter = new WinterFlowAlgorithmArray(27);
        setClipChildren(false);
        WinterFlowQueryService winterFlowQueryService = new WinterFlowQueryService(context);
        addView(winterFlowQueryService);
        arrayList.add(winterFlowQueryService);
        arrayList2.add(winterFlowQueryService);
        this.WinterFlowSyntax = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
