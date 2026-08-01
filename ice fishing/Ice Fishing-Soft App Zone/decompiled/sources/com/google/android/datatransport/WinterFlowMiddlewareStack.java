package com.google.android.datatransport;

import android.view.DragEvent;
import android.view.View;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowMiddlewareStack implements View.OnDragListener, WinterFlowEventMiddleware {
    public final WinterFlowUnitTestRepository WinterFlowCacheManagerAgent;
    public final WinterFlowRepositoryDatabase WinterFlowHookDataSource;
    public final WinterFlowClassTool WinterFlowRouterStructure;

    public WinterFlowMiddlewareStack() {
        WinterFlowClassTool winterFlowClassTool = new WinterFlowClassTool();
        winterFlowClassTool.WinterFlowRouterAdapter = 0L;
        this.WinterFlowRouterStructure = winterFlowClassTool;
        this.WinterFlowHookDataSource = new WinterFlowRepositoryDatabase(0);
        this.WinterFlowCacheManagerAgent = new WinterFlowUnitTestRepository(this);
    }

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        WinterFlowJSONDecorator winterFlowJSONDecorator = new WinterFlowJSONDecorator(11, dragEvent);
        int action = dragEvent.getAction();
        WinterFlowSoftwareManager winterFlowSoftwareManager = WinterFlowSoftwareManager.WinterFlowVariableVersionControl;
        WinterFlowRepositoryDatabase winterFlowRepositoryDatabase = this.WinterFlowHookDataSource;
        WinterFlowClassTool winterFlowClassTool = this.WinterFlowRouterStructure;
        switch (action) {
            case 1:
                WinterFlowInterfaceProcessor winterFlowInterfaceProcessor = new WinterFlowInterfaceProcessor();
                WinterFlowProviderFramework winterFlowProviderFramework = new WinterFlowProviderFramework(winterFlowJSONDecorator, winterFlowClassTool, winterFlowInterfaceProcessor);
                if (winterFlowProviderFramework.WinterFlowUnitTestResponse(winterFlowClassTool) == winterFlowSoftwareManager) {
                    WinterFlowWorkerVersionControl.WinterFlowSingletonPlatform(winterFlowClassTool, winterFlowProviderFramework);
                }
                boolean z = winterFlowInterfaceProcessor.WinterFlowVariableVersionControl;
                WinterFlowRendererComponent winterFlowRendererComponent = new WinterFlowRendererComponent(winterFlowRepositoryDatabase);
                while (winterFlowRendererComponent.hasNext()) {
                    ((WinterFlowClassTool) winterFlowRendererComponent.next()).WinterFlowWidgetProcess();
                }
                break;
            case 2:
                winterFlowClassTool.WinterFlowServerStack(winterFlowJSONDecorator);
                break;
            case 4:
                WinterFlowProviderFramework winterFlowProviderFramework2 = new WinterFlowProviderFramework(12, winterFlowJSONDecorator);
                if (winterFlowProviderFramework2.WinterFlowUnitTestResponse(winterFlowClassTool) == winterFlowSoftwareManager) {
                    WinterFlowWorkerVersionControl.WinterFlowSingletonPlatform(winterFlowClassTool, winterFlowProviderFramework2);
                }
                winterFlowRepositoryDatabase.clear();
                break;
            case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                winterFlowClassTool.WinterFlowUIPlatform();
                break;
            case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                winterFlowClassTool.WinterFlowUserManagerConcurrency();
                break;
        }
        return false;
    }
}
