package com.google.android.datatransport;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import com.icewinter.flow.winter.icecatch.R;
import java.util.Objects;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowProtocolHelper implements View.OnApplyWindowInsetsListener {
    public WinterFlowWebsocketInterface WinterFlowHookDataSource;
    public final WinterFlowWorkerCompiler WinterFlowRouterStructure;

    public WinterFlowProtocolHelper(View view, WinterFlowWorkerCompiler winterFlowWorkerCompiler) {
        WinterFlowWebsocketInterface winterFlowWebsocketInterface;
        this.WinterFlowRouterStructure = winterFlowWorkerCompiler;
        int i = WinterFlowIDEComponent.WinterFlowRouterStructure;
        WinterFlowWebsocketInterface WinterFlowRouterStructure = WinterFlowVariableMechanism.WinterFlowRouterStructure(view);
        if (WinterFlowRouterStructure != null) {
            int i2 = Build.VERSION.SDK_INT;
            winterFlowWebsocketInterface = (i2 >= 36 ? new WinterFlowParserServiceProvider(WinterFlowRouterStructure) : i2 >= 35 ? new WinterFlowHookWorker(WinterFlowRouterStructure) : i2 >= 34 ? new WinterFlowSerializerTool(WinterFlowRouterStructure) : i2 >= 31 ? new WinterFlowClassTransaction(WinterFlowRouterStructure) : i2 >= 30 ? new WinterFlowServerModule(WinterFlowRouterStructure) : i2 >= 29 ? new WinterFlowRouterCache(WinterFlowRouterStructure) : new WinterFlowPipelineConfiguration(WinterFlowRouterStructure)).WinterFlowHookDataSource();
        } else {
            winterFlowWebsocketInterface = null;
        }
        this.WinterFlowHookDataSource = winterFlowWebsocketInterface;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int[] iArr;
        boolean z;
        if (!view.isLaidOut()) {
            this.WinterFlowHookDataSource = WinterFlowWebsocketInterface.WinterFlowCacheManagerAgent(windowInsets, view);
            return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }
        WinterFlowWebsocketInterface WinterFlowCacheManagerAgent = WinterFlowWebsocketInterface.WinterFlowCacheManagerAgent(windowInsets, view);
        WinterFlowWidgetEntity winterFlowWidgetEntity = WinterFlowCacheManagerAgent.WinterFlowRouterStructure;
        WinterFlowWebsocketInterface winterFlowWebsocketInterface = this.WinterFlowHookDataSource;
        if (winterFlowWebsocketInterface == null) {
            int i = WinterFlowIDEComponent.WinterFlowRouterStructure;
            winterFlowWebsocketInterface = WinterFlowVariableMechanism.WinterFlowRouterStructure(view);
            this.WinterFlowHookDataSource = winterFlowWebsocketInterface;
        }
        if (winterFlowWebsocketInterface == null) {
            this.WinterFlowHookDataSource = WinterFlowCacheManagerAgent;
            if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        } else {
            WinterFlowWorkerCompiler WinterFlowResponseEngine = WinterFlowControllerDataSource.WinterFlowResponseEngine(view);
            if (WinterFlowResponseEngine == null || !Objects.equals((WinterFlowWebsocketInterface) WinterFlowResponseEngine.WinterFlowTransactionManagerStrategy, WinterFlowCacheManagerAgent)) {
                int[] iArr2 = new int[1];
                int[] iArr3 = new int[1];
                WinterFlowWebsocketInterface winterFlowWebsocketInterface2 = this.WinterFlowHookDataSource;
                int i2 = 1;
                while (i2 <= 512) {
                    WinterFlowVariableDataSource WinterFlowSyntax = winterFlowWidgetEntity.WinterFlowSyntax(i2);
                    WinterFlowVariableDataSource WinterFlowSyntax2 = winterFlowWebsocketInterface2.WinterFlowRouterStructure.WinterFlowSyntax(i2);
                    int i3 = WinterFlowSyntax.WinterFlowRouterStructure;
                    int i4 = WinterFlowSyntax.WinterFlowArrayNetwork;
                    int i5 = WinterFlowSyntax.WinterFlowCacheManagerAgent;
                    int i6 = WinterFlowSyntax.WinterFlowHookDataSource;
                    int i7 = WinterFlowSyntax2.WinterFlowRouterStructure;
                    int i8 = WinterFlowSyntax2.WinterFlowArrayNetwork;
                    int[] iArr4 = iArr2;
                    int i9 = WinterFlowSyntax2.WinterFlowCacheManagerAgent;
                    int i10 = WinterFlowSyntax2.WinterFlowHookDataSource;
                    if (i3 > i7 || i6 > i10 || i5 > i9 || i4 > i8) {
                        iArr = iArr3;
                        z = true;
                    } else {
                        iArr = iArr3;
                        z = false;
                    }
                    if (z != (i3 < i7 || i6 < i10 || i5 < i9 || i4 < i8)) {
                        if (z) {
                            iArr4[0] = iArr4[0] | i2;
                        } else {
                            iArr[0] = iArr[0] | i2;
                        }
                    }
                    i2 <<= 1;
                    iArr2 = iArr4;
                    iArr3 = iArr;
                }
                int i11 = iArr2[0];
                int i12 = iArr3[0];
                int i13 = i11 | i12;
                if (i13 == 0) {
                    this.WinterFlowHookDataSource = WinterFlowCacheManagerAgent;
                    if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                } else {
                    WinterFlowWebsocketInterface winterFlowWebsocketInterface3 = this.WinterFlowHookDataSource;
                    WinterFlowValidatorEngine winterFlowValidatorEngine = new WinterFlowValidatorEngine(i13, (i11 & 8) != 0 ? WinterFlowControllerDataSource.WinterFlowVariableVersionControl : (i12 & 8) != 0 ? WinterFlowControllerDataSource.WinterFlowTransactionManagerStrategy : (i11 & 519) != 0 ? WinterFlowControllerDataSource.WinterFlowUnitTestResponse : (i12 & 519) != 0 ? WinterFlowControllerDataSource.WinterFlowRouterRouter : null, (i13 & 8) != 0 ? 160L : 250L);
                    winterFlowValidatorEngine.WinterFlowRouterStructure.WinterFlowVariableVersionControl(0.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(winterFlowValidatorEngine.WinterFlowRouterStructure.WinterFlowHookDataSource());
                    WinterFlowVariableDataSource WinterFlowSyntax3 = winterFlowWidgetEntity.WinterFlowSyntax(i13);
                    WinterFlowVariableDataSource WinterFlowSyntax4 = winterFlowWebsocketInterface3.WinterFlowRouterStructure.WinterFlowSyntax(i13);
                    int min = Math.min(WinterFlowSyntax3.WinterFlowRouterStructure, WinterFlowSyntax4.WinterFlowRouterStructure);
                    int i14 = WinterFlowSyntax3.WinterFlowHookDataSource;
                    int i15 = WinterFlowSyntax4.WinterFlowHookDataSource;
                    int min2 = Math.min(i14, i15);
                    int i16 = WinterFlowSyntax3.WinterFlowCacheManagerAgent;
                    int i17 = WinterFlowSyntax4.WinterFlowCacheManagerAgent;
                    int min3 = Math.min(i16, i17);
                    int i18 = WinterFlowSyntax3.WinterFlowArrayNetwork;
                    int i19 = WinterFlowSyntax4.WinterFlowArrayNetwork;
                    WinterFlowCacheManagerVersionControl winterFlowCacheManagerVersionControl = new WinterFlowCacheManagerVersionControl(7, WinterFlowVariableDataSource.WinterFlowHookDataSource(min, min2, min3, Math.min(i18, i19)), WinterFlowVariableDataSource.WinterFlowHookDataSource(Math.max(WinterFlowSyntax3.WinterFlowRouterStructure, WinterFlowSyntax4.WinterFlowRouterStructure), Math.max(i14, i15), Math.max(i16, i17), Math.max(i18, i19)));
                    WinterFlowControllerDataSource.WinterFlowUnitTestResponse(view, winterFlowValidatorEngine, WinterFlowCacheManagerAgent, false);
                    duration.addUpdateListener(new WinterFlowThreadCloud(winterFlowValidatorEngine, WinterFlowCacheManagerAgent, winterFlowWebsocketInterface3, i13, view));
                    duration.addListener(new WinterFlowThreadMechanism(view, winterFlowValidatorEngine));
                    WinterFlowAPIService winterFlowAPIService = new WinterFlowAPIService(view, winterFlowValidatorEngine, winterFlowCacheManagerVersionControl, duration);
                    if (view != null) {
                        WinterFlowNodeUserManager winterFlowNodeUserManager = new WinterFlowNodeUserManager(view, winterFlowAPIService);
                        view.getViewTreeObserver().addOnPreDrawListener(winterFlowNodeUserManager);
                        view.addOnAttachStateChangeListener(winterFlowNodeUserManager);
                    } else {
                        WinterFlowCompilerMechanism.WinterFlowTransactionManagerStrategy("view == null");
                    }
                    this.WinterFlowHookDataSource = WinterFlowCacheManagerAgent;
                    if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                }
            } else if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        }
        return windowInsets;
    }
}
