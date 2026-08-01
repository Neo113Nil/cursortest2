package com.google.android.datatransport;

import android.content.Context;
import android.view.View;
import com.android.installreferrer.api.InstallReferrerClient;
import com.icewinter.flow.winter.icecatch.R;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowMapperComponent implements View.OnAttachStateChangeListener {
    public final /* synthetic */ Object WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowMapperComponent(int i, Object obj) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.WinterFlowVariableVersionControl) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowResponseJava winterFlowResponseJava = (WinterFlowResponseJava) this.WinterFlowTransactionManagerStrategy;
                Context context = view.getContext();
                if (!winterFlowResponseJava.WinterFlowArrayNetwork) {
                    context.getApplicationContext().registerComponentCallbacks(winterFlowResponseJava.WinterFlowVariableVersionControl);
                    winterFlowResponseJava.WinterFlowArrayNetwork = true;
                    break;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i = this.WinterFlowVariableVersionControl;
        Object obj = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowResponseJava winterFlowResponseJava = (WinterFlowResponseJava) obj;
                Context context = view.getContext();
                if (winterFlowResponseJava.WinterFlowArrayNetwork) {
                    context.getApplicationContext().unregisterComponentCallbacks(winterFlowResponseJava.WinterFlowVariableVersionControl);
                    winterFlowResponseJava.WinterFlowArrayNetwork = false;
                    break;
                }
                break;
            case 1:
                WinterFlowLoaderFramework winterFlowLoaderFramework = (WinterFlowLoaderFramework) obj;
                for (Object obj2 : WinterFlowFrontendSubsystem.WinterFlowServiceUtility(winterFlowLoaderFramework.getParent(), WinterFlowAPIEntity.WinterFlowServerProtocol)) {
                    if (obj2 instanceof View) {
                        View view2 = (View) obj2;
                        view2.getClass();
                        Object tag = view2.getTag(R.id.is_pooling_container_tag);
                        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                        if (bool != null ? bool.booleanValue() : false) {
                            break;
                        }
                    }
                }
                winterFlowLoaderFramework.WinterFlowTransactionManagerStrategy();
                break;
            default:
                view.removeOnAttachStateChangeListener(this);
                ((WinterFlowPipelineObject) obj).WinterFlowArrayNetwork(null);
                break;
        }
    }

    private final void WinterFlowHookDataSource(View view) {
    }

    private final void WinterFlowRouterStructure(View view) {
    }
}
