package com.google.android.datatransport;

import android.app.Notification;
import android.content.Context;
import android.graphics.Path;
import android.util.LongSparseArray;
import android.view.DisplayCutout;
import android.view.translation.TranslationRequestValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import android.widget.EdgeEffect;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowProtocolDecorator {
    public static float WinterFlowArrayNetwork(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    public static Path WinterFlowCacheManagerAgent(DisplayCutout displayCutout) {
        return displayCutout.getCutoutPath();
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        r4 = r4.getValue("android:text");
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        r4 = r4.getText();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void WinterFlowHookDataSource(WinterFlowVariableAgent winterFlowVariableAgent, LongSparseArray longSparseArray) {
        TranslationResponseValue value;
        CharSequence text;
        WinterFlowArrayModule winterFlowArrayModule;
        WinterFlowProcessorSystem winterFlowProcessorSystem;
        WinterFlowObjectSession winterFlowObjectSession;
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            long keyAt = longSparseArray.keyAt(i);
            ViewTranslationResponse WinterFlowServiceUtility = WinterFlowUserManagerPlatform.WinterFlowServiceUtility(longSparseArray.get(keyAt));
            if (WinterFlowServiceUtility != null && value != null && text != null && (winterFlowArrayModule = (WinterFlowArrayModule) winterFlowVariableAgent.WinterFlowVariableVersionControl().WinterFlowHookDataSource((int) keyAt)) != null && (winterFlowProcessorSystem = winterFlowArrayModule.WinterFlowRouterStructure) != null) {
                Object WinterFlowUnitTestResponse = winterFlowProcessorSystem.WinterFlowArrayNetwork.WinterFlowVariableVersionControl.WinterFlowUnitTestResponse(WinterFlowCacheWorker.WinterFlowServerProtocol);
                if (WinterFlowUnitTestResponse == null) {
                    WinterFlowUnitTestResponse = null;
                }
                WinterFlowDecoratorStrategy winterFlowDecoratorStrategy = (WinterFlowDecoratorStrategy) WinterFlowUnitTestResponse;
                if (winterFlowDecoratorStrategy != null && (winterFlowObjectSession = (WinterFlowObjectSession) winterFlowDecoratorStrategy.WinterFlowHookDataSource) != null) {
                }
            }
        }
    }

    public static EdgeEffect WinterFlowRouterStructure(Context context) {
        try {
            return new EdgeEffect(context, null);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    public static float WinterFlowTransactionManagerStrategy(EdgeEffect edgeEffect, float f, float f2) {
        try {
            return edgeEffect.onPullDistance(f, f2);
        } catch (Throwable unused) {
            edgeEffect.onPull(f, f2);
            return 0.0f;
        }
    }

    public static void WinterFlowUnitTestResponse(Notification.Action.Builder builder) {
        builder.setAuthenticationRequired(false);
    }

    public static void WinterFlowVariableVersionControl(WinterFlowVariableAgent winterFlowVariableAgent, long[] jArr, Consumer consumer) {
        WinterFlowProcessorSystem winterFlowProcessorSystem;
        for (long j : jArr) {
            WinterFlowArrayModule winterFlowArrayModule = (WinterFlowArrayModule) winterFlowVariableAgent.WinterFlowVariableVersionControl().WinterFlowHookDataSource((int) j);
            if (winterFlowArrayModule != null && (winterFlowProcessorSystem = winterFlowArrayModule.WinterFlowRouterStructure) != null) {
                ViewTranslationRequest.Builder builder = new ViewTranslationRequest.Builder(winterFlowVariableAgent.WinterFlowVariableVersionControl.getAutofillId(), winterFlowProcessorSystem.WinterFlowTransactionManagerStrategy);
                Object WinterFlowUnitTestResponse = winterFlowProcessorSystem.WinterFlowArrayNetwork.WinterFlowVariableVersionControl.WinterFlowUnitTestResponse(WinterFlowRendererJava.WinterFlowArrayHelper);
                if (WinterFlowUnitTestResponse == null) {
                    WinterFlowUnitTestResponse = null;
                }
                List list = (List) WinterFlowUnitTestResponse;
                if (list != null) {
                    builder.setValue("android:text", TranslationRequestValue.forText(new WinterFlowCompilerStructure(WinterFlowBackendTool.WinterFlowRouterStructure(list, "\n", null, 62))));
                    consumer.accept(builder.build());
                }
            }
        }
    }
}
