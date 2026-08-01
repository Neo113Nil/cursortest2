package com.google.android.datatransport;

import android.R;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowManagerHandler extends WinterFlowConfigurationModule {
    public final /* synthetic */ WinterFlowBackendEventEmitter WinterFlowResponseEngine;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowManagerHandler(WinterFlowBackendEventEmitter winterFlowBackendEventEmitter) {
        super(2);
        this.WinterFlowResponseEngine = winterFlowBackendEventEmitter;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
    
        if ((android.os.Build.VERSION.SDK_INT >= 34 ? com.google.android.datatransport.WinterFlowThreadPoolHelper.WinterFlowVariableVersionControl(r4) : true) == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x01b3, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:518:0x0733, code lost:
    
        if (r0 != 16) goto L529;
     */
    /* JADX WARN: Removed duplicated region for block: B:320:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x07cd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x013f  */
    @Override // com.google.android.datatransport.WinterFlowConfigurationModule
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean WinterFlowOrchestrationSubsystem(int i, int i2, Bundle bundle) {
        WinterFlowProcessorSystem winterFlowProcessorSystem;
        int i3;
        WinterFlowSchedulerSession winterFlowSchedulerSession;
        int i4;
        int i5;
        WinterFlowConfigurationConfiguration winterFlowConfigurationConfiguration;
        WinterFlowMiddlewareModule WinterFlowUnitTestResponse;
        WinterFlowObjectUI winterFlowObjectUI;
        WinterFlowObjectUI winterFlowObjectUI2;
        WinterFlowObjectUI winterFlowObjectUI3;
        WinterFlowObjectUI winterFlowObjectUI4;
        WinterFlowObjectUI winterFlowObjectUI5;
        WinterFlowObjectUI winterFlowObjectUI6;
        WinterFlowObjectUI winterFlowObjectUI7;
        WinterFlowObjectUI winterFlowObjectUI8;
        WinterFlowObjectUI winterFlowObjectUI9;
        WinterFlowObjectSession winterFlowObjectSession;
        WinterFlowDecoratorStrategy winterFlowDecoratorStrategy;
        long j;
        float f;
        float f2;
        float f3;
        float f4;
        long floatToRawIntBits;
        long floatToRawIntBits2;
        WinterFlowObjectSession winterFlowObjectSession2;
        WinterFlowObjectUI winterFlowObjectUI10;
        long j2;
        WinterFlowDecoratorStrategy winterFlowDecoratorStrategy2;
        WinterFlowObjectUI winterFlowObjectUI11;
        float intBitsToFloat;
        WinterFlowDecoratorStrategy winterFlowDecoratorStrategy3;
        WinterFlowObjectUI winterFlowObjectUI12;
        WinterFlowObjectSession winterFlowObjectSession3;
        WinterFlowObjectUI winterFlowObjectUI13;
        WinterFlowObjectUI winterFlowObjectUI14;
        WinterFlowObjectUI winterFlowObjectUI15;
        WinterFlowObjectUI winterFlowObjectUI16;
        WinterFlowBackendEventEmitter winterFlowBackendEventEmitter = this.WinterFlowResponseEngine;
        AccessibilityManager accessibilityManager = winterFlowBackendEventEmitter.WinterFlowTransactionAgent;
        Float valueOf = Float.valueOf(0.0f);
        WinterFlowSyntaxTransactionManager winterFlowSyntaxTransactionManager = winterFlowBackendEventEmitter.WinterFlowRouterRouter;
        WinterFlowArrayModule winterFlowArrayModule = (WinterFlowArrayModule) winterFlowBackendEventEmitter.WinterFlowServerProtocol().WinterFlowHookDataSource(i);
        if (winterFlowArrayModule != null && (winterFlowProcessorSystem = winterFlowArrayModule.WinterFlowRouterStructure) != null) {
            WinterFlowSchedulerStructure winterFlowSchedulerStructure = winterFlowProcessorSystem.WinterFlowCacheManagerAgent;
            int i6 = winterFlowProcessorSystem.WinterFlowTransactionManagerStrategy;
            WinterFlowDecoratorBackend winterFlowDecoratorBackend = winterFlowProcessorSystem.WinterFlowArrayNetwork;
            WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure = winterFlowDecoratorBackend.WinterFlowVariableVersionControl;
            Object WinterFlowUnitTestResponse2 = winterFlowDatabaseSchemaStructure.WinterFlowUnitTestResponse(WinterFlowRendererJava.WinterFlowBandwidthObject);
            if (WinterFlowUnitTestResponse2 == null) {
                WinterFlowUnitTestResponse2 = null;
            }
            Boolean bool = Boolean.TRUE;
            boolean z = true;
            if (WinterFlowManagerRequest.WinterFlowThreadListener(WinterFlowUnitTestResponse2, bool)) {
            }
            if (i2 == 64) {
                if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i3 = winterFlowBackendEventEmitter.WinterFlowBandwidthObject) == i) {
                    return false;
                }
                if (i3 != Integer.MIN_VALUE) {
                    WinterFlowBackendEventEmitter.WinterFlowResolverController(winterFlowBackendEventEmitter, i3, 65536, null, 12);
                }
                winterFlowBackendEventEmitter.WinterFlowBandwidthObject = i;
                winterFlowSyntaxTransactionManager.invalidate();
                WinterFlowBackendEventEmitter.WinterFlowResolverController(winterFlowBackendEventEmitter, i, 32768, null, 12);
                return true;
            }
            if (i2 == 128) {
                if (winterFlowBackendEventEmitter.WinterFlowBandwidthObject != i) {
                    return false;
                }
                winterFlowBackendEventEmitter.WinterFlowBandwidthObject = Integer.MIN_VALUE;
                winterFlowBackendEventEmitter.WinterFlowConcurrencyThread = null;
                winterFlowSyntaxTransactionManager.invalidate();
                WinterFlowBackendEventEmitter.WinterFlowResolverController(winterFlowBackendEventEmitter, i, 65536, null, 12);
                return true;
            }
            if (i2 == 256 || i2 == 512) {
                if (bundle != null) {
                    int i7 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
                    boolean z2 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
                    boolean z3 = i2 == 256;
                    Integer num = winterFlowBackendEventEmitter.WinterFlowConsumerUserManager;
                    if (num == null || i6 != num.intValue()) {
                        winterFlowBackendEventEmitter.WinterFlowResolverController = -1;
                        winterFlowBackendEventEmitter.WinterFlowConsumerUserManager = Integer.valueOf(i6);
                    }
                    String WinterFlowThreadListener = WinterFlowBackendEventEmitter.WinterFlowThreadListener(winterFlowProcessorSystem);
                    if (WinterFlowThreadListener != null && WinterFlowThreadListener.length() != 0) {
                        String WinterFlowThreadListener2 = WinterFlowBackendEventEmitter.WinterFlowThreadListener(winterFlowProcessorSystem);
                        if (WinterFlowThreadListener2 != null && WinterFlowThreadListener2.length() != 0) {
                            if (i7 == 1) {
                                Locale locale = winterFlowSyntaxTransactionManager.getContext().getResources().getConfiguration().locale;
                                winterFlowConfigurationConfiguration = WinterFlowConfigurationConfiguration.WinterFlowVariableVersionControl;
                                if (winterFlowConfigurationConfiguration == null) {
                                    winterFlowConfigurationConfiguration = new WinterFlowConfigurationConfiguration(0);
                                    winterFlowConfigurationConfiguration.WinterFlowArrayNetwork = BreakIterator.getCharacterInstance(locale);
                                    WinterFlowConfigurationConfiguration.WinterFlowVariableVersionControl = winterFlowConfigurationConfiguration;
                                }
                                winterFlowConfigurationConfiguration.WinterFlowTransactionAgent(WinterFlowThreadListener2);
                            } else if (i7 != 2) {
                                if (i7 != 4) {
                                    if (i7 == 8) {
                                        WinterFlowSerializerProtocol winterFlowSerializerProtocol = WinterFlowSerializerProtocol.WinterFlowCacheManagerAgent;
                                        WinterFlowSerializerProtocol winterFlowSerializerProtocol2 = winterFlowSerializerProtocol;
                                        if (winterFlowSerializerProtocol == null) {
                                            WinterFlowSerializerProtocol winterFlowSerializerProtocol3 = new WinterFlowSerializerProtocol();
                                            WinterFlowSerializerProtocol.WinterFlowCacheManagerAgent = winterFlowSerializerProtocol3;
                                            winterFlowSerializerProtocol2 = winterFlowSerializerProtocol3;
                                        }
                                        winterFlowSerializerProtocol2.WinterFlowRouterStructure = WinterFlowThreadListener2;
                                        winterFlowSchedulerSession = winterFlowSerializerProtocol2;
                                        if (winterFlowSchedulerSession != null) {
                                            int WinterFlowResponseEngine = winterFlowBackendEventEmitter.WinterFlowResponseEngine(winterFlowProcessorSystem);
                                            if (WinterFlowResponseEngine == -1) {
                                                WinterFlowResponseEngine = z3 ? 0 : WinterFlowThreadListener.length();
                                            }
                                            int[] WinterFlowRouterStructure = z3 ? winterFlowSchedulerSession.WinterFlowRouterStructure(WinterFlowResponseEngine) : winterFlowSchedulerSession.WinterFlowSyntax(WinterFlowResponseEngine);
                                            if (WinterFlowRouterStructure != null) {
                                                int i8 = WinterFlowRouterStructure[0];
                                                int i9 = WinterFlowRouterStructure[1];
                                                if (z2 && !winterFlowDatabaseSchemaStructure.WinterFlowCacheManagerAgent(WinterFlowRendererJava.WinterFlowRouterStructure) && winterFlowDatabaseSchemaStructure.WinterFlowCacheManagerAgent(WinterFlowRendererJava.WinterFlowCacheManagerListener)) {
                                                    i4 = winterFlowBackendEventEmitter.WinterFlowTransactionAgent(winterFlowProcessorSystem);
                                                    if (i4 == -1) {
                                                        i4 = z3 ? i8 : i9;
                                                    }
                                                    i5 = z3 ? i9 : i8;
                                                } else {
                                                    i4 = z3 ? i9 : i8;
                                                    i5 = i4;
                                                }
                                                winterFlowBackendEventEmitter.WinterFlowCompilerVariable = new WinterFlowControllerAgent(winterFlowProcessorSystem, z3 ? 256 : 512, i7, i8, i9, SystemClock.uptimeMillis());
                                                winterFlowBackendEventEmitter.WinterFlowConfigurationSubsystem(winterFlowProcessorSystem, i4, i5, true);
                                                return true;
                                            }
                                        }
                                    }
                                }
                                if (winterFlowDatabaseSchemaStructure.WinterFlowCacheManagerAgent(WinterFlowCacheWorker.WinterFlowRouterStructure) && (WinterFlowUnitTestResponse = WinterFlowDecoratorRouter.WinterFlowUnitTestResponse(winterFlowDecoratorBackend)) != null) {
                                    if (i7 == 4) {
                                        WinterFlowConfigurationConfiguration winterFlowConfigurationConfiguration2 = WinterFlowConfigurationConfiguration.WinterFlowUnitTestResponse;
                                        WinterFlowConfigurationConfiguration winterFlowConfigurationConfiguration3 = winterFlowConfigurationConfiguration2;
                                        if (winterFlowConfigurationConfiguration2 == null) {
                                            WinterFlowConfigurationConfiguration winterFlowConfigurationConfiguration4 = new WinterFlowConfigurationConfiguration(2);
                                            WinterFlowConfigurationConfiguration.WinterFlowUnitTestResponse = winterFlowConfigurationConfiguration4;
                                            winterFlowConfigurationConfiguration3 = winterFlowConfigurationConfiguration4;
                                        }
                                        winterFlowConfigurationConfiguration3.WinterFlowRouterStructure = WinterFlowThreadListener2;
                                        winterFlowConfigurationConfiguration3.WinterFlowArrayNetwork = WinterFlowUnitTestResponse;
                                        winterFlowSchedulerSession = winterFlowConfigurationConfiguration3;
                                    } else {
                                        WinterFlowExceptionNode winterFlowExceptionNode = WinterFlowExceptionNode.WinterFlowVariableVersionControl;
                                        WinterFlowExceptionNode winterFlowExceptionNode2 = winterFlowExceptionNode;
                                        if (winterFlowExceptionNode == null) {
                                            WinterFlowExceptionNode winterFlowExceptionNode3 = new WinterFlowExceptionNode();
                                            new Rect();
                                            WinterFlowExceptionNode.WinterFlowVariableVersionControl = winterFlowExceptionNode3;
                                            winterFlowExceptionNode2 = winterFlowExceptionNode3;
                                        }
                                        winterFlowExceptionNode2.WinterFlowRouterStructure = WinterFlowThreadListener2;
                                        winterFlowExceptionNode2.WinterFlowCacheManagerAgent = WinterFlowUnitTestResponse;
                                        winterFlowExceptionNode2.WinterFlowArrayNetwork = winterFlowProcessorSystem;
                                        winterFlowSchedulerSession = winterFlowExceptionNode2;
                                    }
                                    if (winterFlowSchedulerSession != null) {
                                    }
                                }
                            } else {
                                Locale locale2 = winterFlowSyntaxTransactionManager.getContext().getResources().getConfiguration().locale;
                                winterFlowConfigurationConfiguration = WinterFlowConfigurationConfiguration.WinterFlowTransactionManagerStrategy;
                                if (winterFlowConfigurationConfiguration == null) {
                                    winterFlowConfigurationConfiguration = new WinterFlowConfigurationConfiguration(1);
                                    winterFlowConfigurationConfiguration.WinterFlowArrayNetwork = BreakIterator.getWordInstance(locale2);
                                    WinterFlowConfigurationConfiguration.WinterFlowTransactionManagerStrategy = winterFlowConfigurationConfiguration;
                                }
                                winterFlowConfigurationConfiguration.WinterFlowTransactionAgent(WinterFlowThreadListener2);
                            }
                            winterFlowSchedulerSession = winterFlowConfigurationConfiguration;
                            if (winterFlowSchedulerSession != null) {
                            }
                        }
                        winterFlowSchedulerSession = null;
                        if (winterFlowSchedulerSession != null) {
                        }
                    }
                }
            } else if (i2 == 16384) {
                Object WinterFlowUnitTestResponse3 = winterFlowDatabaseSchemaStructure.WinterFlowUnitTestResponse(WinterFlowCacheWorker.WinterFlowOrchestrationSubsystem);
                WinterFlowDecoratorStrategy winterFlowDecoratorStrategy4 = (WinterFlowDecoratorStrategy) (WinterFlowUnitTestResponse3 == null ? null : WinterFlowUnitTestResponse3);
                if (winterFlowDecoratorStrategy4 != null && (winterFlowObjectUI = (WinterFlowObjectUI) winterFlowDecoratorStrategy4.WinterFlowHookDataSource) != null) {
                    return ((Boolean) winterFlowObjectUI.WinterFlowRouterStructure()).booleanValue();
                }
            } else {
                if (i2 == 131072) {
                    boolean WinterFlowConfigurationSubsystem = winterFlowBackendEventEmitter.WinterFlowConfigurationSubsystem(winterFlowProcessorSystem, bundle != null ? bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT", -1) : -1, bundle != null ? bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT", -1) : -1, false);
                    if (WinterFlowConfigurationSubsystem) {
                        WinterFlowBackendEventEmitter.WinterFlowResolverController(winterFlowBackendEventEmitter, winterFlowBackendEventEmitter.WinterFlowBatchUI(i6), 0, null, 12);
                    }
                    return WinterFlowConfigurationSubsystem;
                }
                if (WinterFlowTestingCloud.WinterFlowTransactionAgent(winterFlowProcessorSystem)) {
                    if (i2 == 1) {
                        if (winterFlowSyntaxTransactionManager.isInTouchMode()) {
                            winterFlowSyntaxTransactionManager.requestFocusFromTouch();
                        }
                        Object WinterFlowUnitTestResponse4 = winterFlowDatabaseSchemaStructure.WinterFlowUnitTestResponse(WinterFlowCacheWorker.WinterFlowSerializerStructure);
                        WinterFlowDecoratorStrategy winterFlowDecoratorStrategy5 = (WinterFlowDecoratorStrategy) (WinterFlowUnitTestResponse4 == null ? null : WinterFlowUnitTestResponse4);
                        if (winterFlowDecoratorStrategy5 != null && (winterFlowObjectUI2 = (WinterFlowObjectUI) winterFlowDecoratorStrategy5.WinterFlowHookDataSource) != null) {
                            return ((Boolean) winterFlowObjectUI2.WinterFlowRouterStructure()).booleanValue();
                        }
                    } else if (i2 != 2) {
                        WinterFlowCacheManagerConfiguration winterFlowCacheManagerConfiguration = WinterFlowCacheManagerConfiguration.WinterFlowTransactionManagerStrategy;
                        switch (i2) {
                            case 16:
                                Object WinterFlowUnitTestResponse5 = winterFlowDatabaseSchemaStructure.WinterFlowUnitTestResponse(WinterFlowCacheWorker.WinterFlowHookDataSource);
                                if (WinterFlowUnitTestResponse5 == null) {
                                    WinterFlowUnitTestResponse5 = null;
                                }
                                WinterFlowDecoratorStrategy winterFlowDecoratorStrategy6 = (WinterFlowDecoratorStrategy) WinterFlowUnitTestResponse5;
                                Boolean bool2 = (winterFlowDecoratorStrategy6 == null || (winterFlowObjectUI3 = (WinterFlowObjectUI) winterFlowDecoratorStrategy6.WinterFlowHookDataSource) == null) ? null : (Boolean) winterFlowObjectUI3.WinterFlowRouterStructure();
                                WinterFlowBackendEventEmitter.WinterFlowResolverController(winterFlowBackendEventEmitter, i, 1, null, 12);
                                if (bool2 != null) {
                                    return bool2.booleanValue();
                                }
                                break;
                            case 32:
                                Object WinterFlowUnitTestResponse6 = winterFlowDatabaseSchemaStructure.WinterFlowUnitTestResponse(WinterFlowCacheWorker.WinterFlowCacheManagerAgent);
                                WinterFlowDecoratorStrategy winterFlowDecoratorStrategy7 = (WinterFlowDecoratorStrategy) (WinterFlowUnitTestResponse6 == null ? null : WinterFlowUnitTestResponse6);
                                if (winterFlowDecoratorStrategy7 != null && (winterFlowObjectUI4 = (WinterFlowObjectUI) winterFlowDecoratorStrategy7.WinterFlowHookDataSource) != null) {
                                    return ((Boolean) winterFlowObjectUI4.WinterFlowRouterStructure()).booleanValue();
                                }
                                break;
                            case 4096:
                            case 8192:
                                boolean z4 = i2 == 4096;
                                boolean z5 = i2 == 8192;
                                boolean z6 = i2 == 16908345;
                                boolean z7 = i2 == 16908347;
                                boolean z8 = i2 == 16908344;
                                boolean z9 = i2 == 16908346;
                                boolean z10 = z6 || z7 || z4 || z5;
                                if (!z8 && !z9 && !z4 && !z5) {
                                    z = false;
                                }
                                if (z4 || z5) {
                                    Object WinterFlowUnitTestResponse7 = winterFlowDatabaseSchemaStructure.WinterFlowUnitTestResponse(WinterFlowRendererJava.WinterFlowCacheManagerAgent);
                                    if (WinterFlowUnitTestResponse7 == null) {
                                        WinterFlowUnitTestResponse7 = null;
                                    }
                                    WinterFlowRendererGateway winterFlowRendererGateway = (WinterFlowRendererGateway) WinterFlowUnitTestResponse7;
                                    Object WinterFlowUnitTestResponse8 = winterFlowDatabaseSchemaStructure.WinterFlowUnitTestResponse(WinterFlowCacheWorker.WinterFlowSyntax);
                                    if (WinterFlowUnitTestResponse8 == null) {
                                        WinterFlowUnitTestResponse8 = null;
                                    }
                                    WinterFlowDecoratorStrategy winterFlowDecoratorStrategy8 = (WinterFlowDecoratorStrategy) WinterFlowUnitTestResponse8;
                                    if (winterFlowRendererGateway != null) {
                                        WinterFlowArrayStructure winterFlowArrayStructure = winterFlowRendererGateway.WinterFlowHookDataSource;
                                        if (winterFlowDecoratorStrategy8 != null) {
                                            float f5 = winterFlowArrayStructure.WinterFlowHookDataSource;
                                            float f6 = winterFlowArrayStructure.WinterFlowRouterStructure;
                                            float f7 = f5 < f6 ? f6 : f5;
                                            if (f6 <= f5) {
                                                f5 = f6;
                                            }
                                            float f8 = (f7 - f5) / 20.0f;
                                            if (z5) {
                                                f8 = -f8;
                                            }
                                            WinterFlowObjectSession winterFlowObjectSession4 = (WinterFlowObjectSession) winterFlowDecoratorStrategy8.WinterFlowHookDataSource;
                                            if (winterFlowObjectSession4 != null) {
                                                return ((Boolean) winterFlowObjectSession4.WinterFlowUnitTestResponse(Float.valueOf(winterFlowRendererGateway.WinterFlowRouterStructure + f8))).booleanValue();
                                            }
                                        }
                                    }
                                }
                                long WinterFlowHookDataSource = WinterFlowCloudStack.WinterFlowRouterRouter(winterFlowSchedulerStructure.WinterFlowUserManagerUserManager.WinterFlowCacheManagerAgent).WinterFlowHookDataSource();
                                ArrayList arrayList = new ArrayList();
                                Object WinterFlowUnitTestResponse9 = winterFlowDatabaseSchemaStructure.WinterFlowUnitTestResponse(WinterFlowCacheWorker.WinterFlowArrayHelper);
                                if (WinterFlowUnitTestResponse9 == null) {
                                    WinterFlowUnitTestResponse9 = null;
                                }
                                WinterFlowDecoratorStrategy winterFlowDecoratorStrategy9 = (WinterFlowDecoratorStrategy) WinterFlowUnitTestResponse9;
                                Float f9 = (winterFlowDecoratorStrategy9 == null || (winterFlowObjectSession3 = (WinterFlowObjectSession) winterFlowDecoratorStrategy9.WinterFlowHookDataSource) == null || !((Boolean) winterFlowObjectSession3.WinterFlowUnitTestResponse(arrayList)).booleanValue()) ? null : (Float) arrayList.get(0);
                                Object WinterFlowUnitTestResponse10 = winterFlowDatabaseSchemaStructure.WinterFlowUnitTestResponse(WinterFlowCacheWorker.WinterFlowArrayNetwork);
                                if (WinterFlowUnitTestResponse10 == null) {
                                    WinterFlowUnitTestResponse10 = null;
                                }
                                WinterFlowDecoratorStrategy winterFlowDecoratorStrategy10 = (WinterFlowDecoratorStrategy) WinterFlowUnitTestResponse10;
                                if (winterFlowDecoratorStrategy10 != null) {
                                    WinterFlowOrchestrationIDE winterFlowOrchestrationIDE = winterFlowDecoratorStrategy10.WinterFlowHookDataSource;
                                    Object WinterFlowUnitTestResponse11 = winterFlowDatabaseSchemaStructure.WinterFlowUnitTestResponse(WinterFlowRendererJava.WinterFlowSerializerStructure);
                                    if (WinterFlowUnitTestResponse11 == null) {
                                        WinterFlowUnitTestResponse11 = null;
                                    }
                                    WinterFlowExceptionPlatform winterFlowExceptionPlatform = (WinterFlowExceptionPlatform) WinterFlowUnitTestResponse11;
                                    if (winterFlowExceptionPlatform == null || !z10) {
                                        j2 = WinterFlowHookDataSource;
                                    } else {
                                        if (f9 != null) {
                                            intBitsToFloat = f9.floatValue();
                                            j2 = WinterFlowHookDataSource;
                                        } else {
                                            j2 = WinterFlowHookDataSource;
                                            intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
                                        }
                                        if (z6 || z5) {
                                            intBitsToFloat = -intBitsToFloat;
                                        }
                                        if (winterFlowSchedulerStructure.WinterFlowCompilerVariable == winterFlowCacheManagerConfiguration && (z6 || z7)) {
                                            intBitsToFloat = -intBitsToFloat;
                                        }
                                        if (WinterFlowBackendEventEmitter.WinterFlowConcurrencyThread(winterFlowExceptionPlatform, intBitsToFloat)) {
                                            WinterFlowRendererOrchestration winterFlowRendererOrchestration = WinterFlowCacheWorker.WinterFlowConsumerUserManager;
                                            if (winterFlowDatabaseSchemaStructure.WinterFlowCacheManagerAgent(winterFlowRendererOrchestration) || winterFlowDatabaseSchemaStructure.WinterFlowCacheManagerAgent(WinterFlowCacheWorker.WinterFlowEventEmitterController)) {
                                                if (intBitsToFloat > 0.0f) {
                                                    Object WinterFlowUnitTestResponse12 = winterFlowDatabaseSchemaStructure.WinterFlowUnitTestResponse(WinterFlowCacheWorker.WinterFlowEventEmitterController);
                                                    winterFlowDecoratorStrategy3 = (WinterFlowDecoratorStrategy) (WinterFlowUnitTestResponse12 == null ? null : WinterFlowUnitTestResponse12);
                                                } else {
                                                    Object WinterFlowUnitTestResponse13 = winterFlowDatabaseSchemaStructure.WinterFlowUnitTestResponse(winterFlowRendererOrchestration);
                                                    winterFlowDecoratorStrategy3 = (WinterFlowDecoratorStrategy) (WinterFlowUnitTestResponse13 == null ? null : WinterFlowUnitTestResponse13);
                                                }
                                                if (winterFlowDecoratorStrategy3 != null && (winterFlowObjectUI12 = (WinterFlowObjectUI) winterFlowDecoratorStrategy3.WinterFlowHookDataSource) != null) {
                                                    return ((Boolean) winterFlowObjectUI12.WinterFlowRouterStructure()).booleanValue();
                                                }
                                            } else {
                                                WinterFlowEventEvent winterFlowEventEvent = (WinterFlowEventEvent) winterFlowOrchestrationIDE;
                                                if (winterFlowEventEvent != null) {
                                                    return ((Boolean) winterFlowEventEvent.WinterFlowVariableVersionControl(Float.valueOf(intBitsToFloat), valueOf)).booleanValue();
                                                }
                                            }
                                        }
                                    }
                                    Object WinterFlowUnitTestResponse14 = winterFlowDatabaseSchemaStructure.WinterFlowUnitTestResponse(WinterFlowRendererJava.WinterFlowMapperProtocol);
                                    if (WinterFlowUnitTestResponse14 == null) {
                                        WinterFlowUnitTestResponse14 = null;
                                    }
                                    WinterFlowExceptionPlatform winterFlowExceptionPlatform2 = (WinterFlowExceptionPlatform) WinterFlowUnitTestResponse14;
                                    if (winterFlowExceptionPlatform2 != null && z) {
                                        float floatValue = f9 != null ? f9.floatValue() : Float.intBitsToFloat((int) (j2 & 4294967295L));
                                        if (z8 || z5) {
                                            floatValue = -floatValue;
                                        }
                                        if (WinterFlowBackendEventEmitter.WinterFlowConcurrencyThread(winterFlowExceptionPlatform2, floatValue)) {
                                            WinterFlowRendererOrchestration winterFlowRendererOrchestration2 = WinterFlowCacheWorker.WinterFlowResolverController;
                                            if (winterFlowDatabaseSchemaStructure.WinterFlowCacheManagerAgent(winterFlowRendererOrchestration2) || winterFlowDatabaseSchemaStructure.WinterFlowCacheManagerAgent(WinterFlowCacheWorker.WinterFlowBackendCacheManager)) {
                                                if (floatValue > 0.0f) {
                                                    Object WinterFlowUnitTestResponse15 = winterFlowDatabaseSchemaStructure.WinterFlowUnitTestResponse(WinterFlowCacheWorker.WinterFlowBackendCacheManager);
                                                    winterFlowDecoratorStrategy2 = (WinterFlowDecoratorStrategy) (WinterFlowUnitTestResponse15 == null ? null : WinterFlowUnitTestResponse15);
                                                } else {
                                                    Object WinterFlowUnitTestResponse16 = winterFlowDatabaseSchemaStructure.WinterFlowUnitTestResponse(winterFlowRendererOrchestration2);
                                                    winterFlowDecoratorStrategy2 = (WinterFlowDecoratorStrategy) (WinterFlowUnitTestResponse16 == null ? null : WinterFlowUnitTestResponse16);
                                                }
                                                if (winterFlowDecoratorStrategy2 != null && (winterFlowObjectUI11 = (WinterFlowObjectUI) winterFlowDecoratorStrategy2.WinterFlowHookDataSource) != null) {
                                                    return ((Boolean) winterFlowObjectUI11.WinterFlowRouterStructure()).booleanValue();
                                                }
                                            } else {
                                                WinterFlowEventEvent winterFlowEventEvent2 = (WinterFlowEventEvent) winterFlowOrchestrationIDE;
                                                if (winterFlowEventEvent2 != null) {
                                                    return ((Boolean) winterFlowEventEvent2.WinterFlowVariableVersionControl(valueOf, Float.valueOf(floatValue))).booleanValue();
                                                }
                                            }
                                        }
                                    }
                                }
                                break;
                            case 32768:
                                Object WinterFlowUnitTestResponse17 = winterFlowDatabaseSchemaStructure.WinterFlowUnitTestResponse(WinterFlowCacheWorker.WinterFlowSingletonPlatform);
                                WinterFlowDecoratorStrategy winterFlowDecoratorStrategy11 = (WinterFlowDecoratorStrategy) (WinterFlowUnitTestResponse17 == null ? null : WinterFlowUnitTestResponse17);
                                if (winterFlowDecoratorStrategy11 != null && (winterFlowObjectUI5 = (WinterFlowObjectUI) winterFlowDecoratorStrategy11.WinterFlowHookDataSource) != null) {
                                    return ((Boolean) winterFlowObjectUI5.WinterFlowRouterStructure()).booleanValue();
                                }
                                break;
                            case 65536:
                                Object WinterFlowUnitTestResponse18 = winterFlowDatabaseSchemaStructure.WinterFlowUnitTestResponse(WinterFlowCacheWorker.WinterFlowConcurrencyThread);
                                WinterFlowDecoratorStrategy winterFlowDecoratorStrategy12 = (WinterFlowDecoratorStrategy) (WinterFlowUnitTestResponse18 == null ? null : WinterFlowUnitTestResponse18);
                                if (winterFlowDecoratorStrategy12 != null && (winterFlowObjectUI6 = (WinterFlowObjectUI) winterFlowDecoratorStrategy12.WinterFlowHookDataSource) != null) {
                                    return ((Boolean) winterFlowObjectUI6.WinterFlowRouterStructure()).booleanValue();
                                }
                                break;
                            case 262144:
                                Object WinterFlowUnitTestResponse19 = winterFlowDatabaseSchemaStructure.WinterFlowUnitTestResponse(WinterFlowCacheWorker.WinterFlowVariableBandwidth);
                                WinterFlowDecoratorStrategy winterFlowDecoratorStrategy13 = (WinterFlowDecoratorStrategy) (WinterFlowUnitTestResponse19 == null ? null : WinterFlowUnitTestResponse19);
                                if (winterFlowDecoratorStrategy13 != null && (winterFlowObjectUI7 = (WinterFlowObjectUI) winterFlowDecoratorStrategy13.WinterFlowHookDataSource) != null) {
                                    return ((Boolean) winterFlowObjectUI7.WinterFlowRouterStructure()).booleanValue();
                                }
                                break;
                            case 524288:
                                Object WinterFlowUnitTestResponse20 = winterFlowDatabaseSchemaStructure.WinterFlowUnitTestResponse(WinterFlowCacheWorker.WinterFlowBatchUI);
                                WinterFlowDecoratorStrategy winterFlowDecoratorStrategy14 = (WinterFlowDecoratorStrategy) (WinterFlowUnitTestResponse20 == null ? null : WinterFlowUnitTestResponse20);
                                if (winterFlowDecoratorStrategy14 != null && (winterFlowObjectUI8 = (WinterFlowObjectUI) winterFlowDecoratorStrategy14.WinterFlowHookDataSource) != null) {
                                    return ((Boolean) winterFlowObjectUI8.WinterFlowRouterStructure()).booleanValue();
                                }
                                break;
                            case 1048576:
                                Object WinterFlowUnitTestResponse21 = winterFlowDatabaseSchemaStructure.WinterFlowUnitTestResponse(WinterFlowCacheWorker.WinterFlowRouterAdapter);
                                WinterFlowDecoratorStrategy winterFlowDecoratorStrategy15 = (WinterFlowDecoratorStrategy) (WinterFlowUnitTestResponse21 == null ? null : WinterFlowUnitTestResponse21);
                                if (winterFlowDecoratorStrategy15 != null && (winterFlowObjectUI9 = (WinterFlowObjectUI) winterFlowDecoratorStrategy15.WinterFlowHookDataSource) != null) {
                                    return ((Boolean) winterFlowObjectUI9.WinterFlowRouterStructure()).booleanValue();
                                }
                                break;
                            case 2097152:
                                String string = bundle != null ? bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE") : null;
                                Object WinterFlowUnitTestResponse22 = winterFlowDatabaseSchemaStructure.WinterFlowUnitTestResponse(WinterFlowCacheWorker.WinterFlowTransactionAgent);
                                WinterFlowDecoratorStrategy winterFlowDecoratorStrategy16 = (WinterFlowDecoratorStrategy) (WinterFlowUnitTestResponse22 == null ? null : WinterFlowUnitTestResponse22);
                                if (winterFlowDecoratorStrategy16 != null && (winterFlowObjectSession = (WinterFlowObjectSession) winterFlowDecoratorStrategy16.WinterFlowHookDataSource) != null) {
                                    if (string == null) {
                                        string = "";
                                    }
                                    return ((Boolean) winterFlowObjectSession.WinterFlowUnitTestResponse(new WinterFlowCompilerStructure(string))).booleanValue();
                                }
                                break;
                            case R.id.accessibilityActionShowOnScreen:
                                WinterFlowProcessorSystem WinterFlowServerProtocol = winterFlowProcessorSystem.WinterFlowServerProtocol();
                                if (WinterFlowServerProtocol != null) {
                                    Object WinterFlowUnitTestResponse23 = WinterFlowServerProtocol.WinterFlowArrayNetwork.WinterFlowVariableVersionControl.WinterFlowUnitTestResponse(WinterFlowCacheWorker.WinterFlowArrayNetwork);
                                    if (WinterFlowUnitTestResponse23 == null) {
                                        WinterFlowUnitTestResponse23 = null;
                                    }
                                    winterFlowDecoratorStrategy = (WinterFlowDecoratorStrategy) WinterFlowUnitTestResponse23;
                                    while (winterFlowDecoratorStrategy == null && WinterFlowServerProtocol != null) {
                                        WinterFlowServerProtocol = WinterFlowServerProtocol.WinterFlowServerProtocol();
                                        if (WinterFlowServerProtocol != null) {
                                            Object WinterFlowUnitTestResponse24 = WinterFlowServerProtocol.WinterFlowArrayNetwork.WinterFlowVariableVersionControl.WinterFlowUnitTestResponse(WinterFlowCacheWorker.WinterFlowArrayNetwork);
                                            if (WinterFlowUnitTestResponse24 == null) {
                                                WinterFlowUnitTestResponse24 = null;
                                            }
                                            winterFlowDecoratorStrategy = (WinterFlowDecoratorStrategy) WinterFlowUnitTestResponse24;
                                        }
                                    }
                                    if (WinterFlowServerProtocol == null) {
                                        WinterFlowVersionParser WinterFlowUnitTestResponse25 = winterFlowProcessorSystem.WinterFlowUnitTestResponse();
                                        return winterFlowSyntaxTransactionManager.requestRectangleOnScreen(new Rect((int) Math.floor(WinterFlowUnitTestResponse25.WinterFlowRouterStructure), (int) Math.floor(WinterFlowUnitTestResponse25.WinterFlowHookDataSource), WinterFlowCloudStack.WinterFlowFrontendBackend((float) Math.ceil(WinterFlowUnitTestResponse25.WinterFlowCacheManagerAgent)), WinterFlowCloudStack.WinterFlowFrontendBackend((float) Math.ceil(WinterFlowUnitTestResponse25.WinterFlowArrayNetwork))));
                                    }
                                    long j3 = 0;
                                    long j4 = 0;
                                    boolean z11 = false;
                                    while (WinterFlowServerProtocol != null) {
                                        WinterFlowSchedulerStructure winterFlowSchedulerStructure2 = WinterFlowServerProtocol.WinterFlowCacheManagerAgent;
                                        WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure2 = WinterFlowServerProtocol.WinterFlowArrayNetwork.WinterFlowVariableVersionControl;
                                        Object WinterFlowUnitTestResponse26 = winterFlowDatabaseSchemaStructure2.WinterFlowUnitTestResponse(WinterFlowCacheWorker.WinterFlowArrayNetwork);
                                        if (WinterFlowUnitTestResponse26 == null) {
                                            WinterFlowUnitTestResponse26 = null;
                                        }
                                        WinterFlowDecoratorStrategy winterFlowDecoratorStrategy17 = (WinterFlowDecoratorStrategy) WinterFlowUnitTestResponse26;
                                        if (winterFlowDecoratorStrategy17 != null) {
                                            WinterFlowVersionParser WinterFlowRouterRouter = WinterFlowCloudStack.WinterFlowRouterRouter(winterFlowSchedulerStructure2.WinterFlowUserManagerUserManager.WinterFlowCacheManagerAgent);
                                            WinterFlowAlgorithmHandler WinterFlowResponseEngine2 = winterFlowSchedulerStructure2.WinterFlowUserManagerUserManager.WinterFlowCacheManagerAgent.WinterFlowResponseEngine();
                                            WinterFlowVersionParser WinterFlowVariableVersionControl = WinterFlowRouterRouter.WinterFlowVariableVersionControl(WinterFlowResponseEngine2 != null ? ((WinterFlowUIMicroservice) WinterFlowResponseEngine2).WinterFlowPackageIDE(j3) : j3);
                                            WinterFlowUIMicroservice WinterFlowArrayNetwork = winterFlowProcessorSystem.WinterFlowArrayNetwork();
                                            if (WinterFlowArrayNetwork != null) {
                                                if (!WinterFlowArrayNetwork.WinterFlowInheritanceJava().WinterFlowSingletonPlatform) {
                                                    WinterFlowArrayNetwork = null;
                                                }
                                                if (WinterFlowArrayNetwork != null) {
                                                    j = WinterFlowArrayNetwork.WinterFlowPackageIDE(j3);
                                                    long WinterFlowVariableVersionControl2 = WinterFlowHandlerResolver.WinterFlowVariableVersionControl(j, j4);
                                                    WinterFlowUIMicroservice WinterFlowArrayNetwork2 = winterFlowProcessorSystem.WinterFlowArrayNetwork();
                                                    WinterFlowVersionParser WinterFlowHookDataSource2 = WinterFlowHookProcessor.WinterFlowHookDataSource(WinterFlowVariableVersionControl2, WinterFlowServerManager.WinterFlowUserManagerUserManager(WinterFlowArrayNetwork2 == null ? WinterFlowArrayNetwork2.WinterFlowUnitTestResponse : 0L));
                                                    f = WinterFlowHookDataSource2.WinterFlowRouterStructure - WinterFlowVariableVersionControl.WinterFlowRouterStructure;
                                                    f2 = WinterFlowHookDataSource2.WinterFlowCacheManagerAgent - WinterFlowVariableVersionControl.WinterFlowCacheManagerAgent;
                                                    if (Math.signum(f) == Math.signum(f2)) {
                                                        f = 0.0f;
                                                    } else if (Math.abs(f) >= Math.abs(f2)) {
                                                        f = f2;
                                                    }
                                                    f3 = WinterFlowHookDataSource2.WinterFlowHookDataSource - WinterFlowVariableVersionControl.WinterFlowHookDataSource;
                                                    f4 = WinterFlowHookDataSource2.WinterFlowArrayNetwork - WinterFlowVariableVersionControl.WinterFlowArrayNetwork;
                                                    if (Math.signum(f3) == Math.signum(f4)) {
                                                        f3 = 0.0f;
                                                    } else if (Math.abs(f3) >= Math.abs(f4)) {
                                                        f3 = f4;
                                                    }
                                                    floatToRawIntBits = (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L);
                                                    if (WinterFlowHandlerResolver.WinterFlowHookDataSource(floatToRawIntBits, 0L)) {
                                                        float intBitsToFloat2 = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
                                                        float intBitsToFloat3 = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
                                                        Object WinterFlowUnitTestResponse27 = winterFlowDatabaseSchemaStructure2.WinterFlowUnitTestResponse(WinterFlowRendererJava.WinterFlowSerializerStructure);
                                                        if (WinterFlowUnitTestResponse27 == null) {
                                                            WinterFlowUnitTestResponse27 = null;
                                                        }
                                                        if (winterFlowSchedulerStructure.WinterFlowCompilerVariable == winterFlowCacheManagerConfiguration) {
                                                            intBitsToFloat2 = -intBitsToFloat2;
                                                        }
                                                        Object WinterFlowUnitTestResponse28 = winterFlowDatabaseSchemaStructure2.WinterFlowUnitTestResponse(WinterFlowRendererJava.WinterFlowMapperProtocol);
                                                        if (WinterFlowUnitTestResponse28 == null) {
                                                            WinterFlowUnitTestResponse28 = null;
                                                        }
                                                        floatToRawIntBits2 = (Float.floatToRawIntBits(intBitsToFloat3) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat2) << 32);
                                                    } else {
                                                        floatToRawIntBits2 = floatToRawIntBits;
                                                    }
                                                    WinterFlowEventEvent winterFlowEventEvent3 = (WinterFlowEventEvent) winterFlowDecoratorStrategy17.WinterFlowHookDataSource;
                                                    z11 = (winterFlowEventEvent3 == null && ((Boolean) winterFlowEventEvent3.WinterFlowVariableVersionControl(Float.valueOf(Float.intBitsToFloat((int) (floatToRawIntBits2 >> 32))), Float.valueOf(Float.intBitsToFloat((int) (floatToRawIntBits2 & 4294967295L))))).booleanValue()) || z11;
                                                    j4 = WinterFlowHandlerResolver.WinterFlowArrayNetwork(j4, floatToRawIntBits);
                                                }
                                            }
                                            j = j3;
                                            long WinterFlowVariableVersionControl22 = WinterFlowHandlerResolver.WinterFlowVariableVersionControl(j, j4);
                                            WinterFlowUIMicroservice WinterFlowArrayNetwork22 = winterFlowProcessorSystem.WinterFlowArrayNetwork();
                                            WinterFlowVersionParser WinterFlowHookDataSource22 = WinterFlowHookProcessor.WinterFlowHookDataSource(WinterFlowVariableVersionControl22, WinterFlowServerManager.WinterFlowUserManagerUserManager(WinterFlowArrayNetwork22 == null ? WinterFlowArrayNetwork22.WinterFlowUnitTestResponse : 0L));
                                            f = WinterFlowHookDataSource22.WinterFlowRouterStructure - WinterFlowVariableVersionControl.WinterFlowRouterStructure;
                                            f2 = WinterFlowHookDataSource22.WinterFlowCacheManagerAgent - WinterFlowVariableVersionControl.WinterFlowCacheManagerAgent;
                                            if (Math.signum(f) == Math.signum(f2)) {
                                            }
                                            f3 = WinterFlowHookDataSource22.WinterFlowHookDataSource - WinterFlowVariableVersionControl.WinterFlowHookDataSource;
                                            f4 = WinterFlowHookDataSource22.WinterFlowArrayNetwork - WinterFlowVariableVersionControl.WinterFlowArrayNetwork;
                                            if (Math.signum(f3) == Math.signum(f4)) {
                                            }
                                            floatToRawIntBits = (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L);
                                            if (WinterFlowHandlerResolver.WinterFlowHookDataSource(floatToRawIntBits, 0L)) {
                                            }
                                            WinterFlowEventEvent winterFlowEventEvent32 = (WinterFlowEventEvent) winterFlowDecoratorStrategy17.WinterFlowHookDataSource;
                                            if (winterFlowEventEvent32 == null) {
                                            }
                                            j4 = WinterFlowHandlerResolver.WinterFlowArrayNetwork(j4, floatToRawIntBits);
                                        }
                                        WinterFlowServerProtocol = WinterFlowServerProtocol.WinterFlowServerProtocol();
                                        j3 = 0;
                                    }
                                    return z11;
                                }
                                winterFlowDecoratorStrategy = null;
                                break;
                            case R.id.accessibilityActionSetProgress:
                                if (bundle != null && bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                                    Object WinterFlowUnitTestResponse29 = winterFlowDatabaseSchemaStructure.WinterFlowUnitTestResponse(WinterFlowCacheWorker.WinterFlowSyntax);
                                    WinterFlowDecoratorStrategy winterFlowDecoratorStrategy18 = (WinterFlowDecoratorStrategy) (WinterFlowUnitTestResponse29 == null ? null : WinterFlowUnitTestResponse29);
                                    if (winterFlowDecoratorStrategy18 != null && (winterFlowObjectSession2 = (WinterFlowObjectSession) winterFlowDecoratorStrategy18.WinterFlowHookDataSource) != null) {
                                        return ((Boolean) winterFlowObjectSession2.WinterFlowUnitTestResponse(Float.valueOf(bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")))).booleanValue();
                                    }
                                }
                                break;
                            case R.id.accessibilityActionImeEnter:
                                Object WinterFlowUnitTestResponse30 = winterFlowDatabaseSchemaStructure.WinterFlowUnitTestResponse(WinterFlowCacheWorker.WinterFlowBandwidthObject);
                                WinterFlowDecoratorStrategy winterFlowDecoratorStrategy19 = (WinterFlowDecoratorStrategy) (WinterFlowUnitTestResponse30 == null ? null : WinterFlowUnitTestResponse30);
                                if (winterFlowDecoratorStrategy19 != null && (winterFlowObjectUI10 = (WinterFlowObjectUI) winterFlowDecoratorStrategy19.WinterFlowHookDataSource) != null) {
                                    return ((Boolean) winterFlowObjectUI10.WinterFlowRouterStructure()).booleanValue();
                                }
                                break;
                            default:
                                switch (i2) {
                                    case R.id.accessibilityActionScrollUp:
                                    case R.id.accessibilityActionScrollLeft:
                                    case R.id.accessibilityActionScrollDown:
                                    case R.id.accessibilityActionScrollRight:
                                        break;
                                    default:
                                        switch (i2) {
                                            case R.id.accessibilityActionPageUp:
                                                Object WinterFlowUnitTestResponse31 = winterFlowDatabaseSchemaStructure.WinterFlowUnitTestResponse(WinterFlowCacheWorker.WinterFlowResolverController);
                                                WinterFlowDecoratorStrategy winterFlowDecoratorStrategy20 = (WinterFlowDecoratorStrategy) (WinterFlowUnitTestResponse31 == null ? null : WinterFlowUnitTestResponse31);
                                                if (winterFlowDecoratorStrategy20 != null && (winterFlowObjectUI13 = (WinterFlowObjectUI) winterFlowDecoratorStrategy20.WinterFlowHookDataSource) != null) {
                                                    return ((Boolean) winterFlowObjectUI13.WinterFlowRouterStructure()).booleanValue();
                                                }
                                                break;
                                            case R.id.accessibilityActionPageDown:
                                                Object WinterFlowUnitTestResponse32 = winterFlowDatabaseSchemaStructure.WinterFlowUnitTestResponse(WinterFlowCacheWorker.WinterFlowBackendCacheManager);
                                                WinterFlowDecoratorStrategy winterFlowDecoratorStrategy21 = (WinterFlowDecoratorStrategy) (WinterFlowUnitTestResponse32 == null ? null : WinterFlowUnitTestResponse32);
                                                if (winterFlowDecoratorStrategy21 != null && (winterFlowObjectUI14 = (WinterFlowObjectUI) winterFlowDecoratorStrategy21.WinterFlowHookDataSource) != null) {
                                                    return ((Boolean) winterFlowObjectUI14.WinterFlowRouterStructure()).booleanValue();
                                                }
                                                break;
                                            case R.id.accessibilityActionPageLeft:
                                                Object WinterFlowUnitTestResponse33 = winterFlowDatabaseSchemaStructure.WinterFlowUnitTestResponse(WinterFlowCacheWorker.WinterFlowConsumerUserManager);
                                                WinterFlowDecoratorStrategy winterFlowDecoratorStrategy22 = (WinterFlowDecoratorStrategy) (WinterFlowUnitTestResponse33 == null ? null : WinterFlowUnitTestResponse33);
                                                if (winterFlowDecoratorStrategy22 != null && (winterFlowObjectUI15 = (WinterFlowObjectUI) winterFlowDecoratorStrategy22.WinterFlowHookDataSource) != null) {
                                                    return ((Boolean) winterFlowObjectUI15.WinterFlowRouterStructure()).booleanValue();
                                                }
                                                break;
                                            case R.id.accessibilityActionPageRight:
                                                Object WinterFlowUnitTestResponse34 = winterFlowDatabaseSchemaStructure.WinterFlowUnitTestResponse(WinterFlowCacheWorker.WinterFlowEventEmitterController);
                                                WinterFlowDecoratorStrategy winterFlowDecoratorStrategy23 = (WinterFlowDecoratorStrategy) (WinterFlowUnitTestResponse34 == null ? null : WinterFlowUnitTestResponse34);
                                                if (winterFlowDecoratorStrategy23 != null && (winterFlowObjectUI16 = (WinterFlowObjectUI) winterFlowDecoratorStrategy23.WinterFlowHookDataSource) != null) {
                                                    return ((Boolean) winterFlowObjectUI16.WinterFlowRouterStructure()).booleanValue();
                                                }
                                                break;
                                            default:
                                                WinterFlowRequestListener winterFlowRequestListener = winterFlowBackendEventEmitter.WinterFlowSerializerStructure;
                                                winterFlowRequestListener.getClass();
                                                WinterFlowRequestListener winterFlowRequestListener2 = (WinterFlowRequestListener) WinterFlowCloudStack.WinterFlowThreadListener(winterFlowRequestListener, i);
                                                if (winterFlowRequestListener2 != null && ((CharSequence) WinterFlowCloudStack.WinterFlowThreadListener(winterFlowRequestListener2, i2)) != null) {
                                                    Object WinterFlowUnitTestResponse35 = winterFlowDatabaseSchemaStructure.WinterFlowUnitTestResponse(WinterFlowCacheWorker.WinterFlowMapperProtocol);
                                                    List list = (List) (WinterFlowUnitTestResponse35 == null ? null : WinterFlowUnitTestResponse35);
                                                    if (list != null && list.size() > 0) {
                                                        list.get(0).getClass();
                                                        WinterFlowEventEmitterOrchestration.WinterFlowVariableBandwidth();
                                                        return false;
                                                    }
                                                }
                                                break;
                                        }
                                }
                        }
                    } else {
                        Object WinterFlowUnitTestResponse36 = winterFlowDatabaseSchemaStructure.WinterFlowUnitTestResponse(WinterFlowRendererJava.WinterFlowServerProtocol);
                        if (WinterFlowUnitTestResponse36 == null) {
                            WinterFlowUnitTestResponse36 = null;
                        }
                        if (WinterFlowManagerRequest.WinterFlowThreadListener(WinterFlowUnitTestResponse36, bool)) {
                            ((WinterFlowHookMechanism) winterFlowSyntaxTransactionManager.getFocusOwner()).WinterFlowHookDataSource(8, false, true);
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.WinterFlowConfigurationModule
    public final WinterFlowFrameworkDataSource WinterFlowResponseEngine(int i) {
        WinterFlowBackendEventEmitter winterFlowBackendEventEmitter = this.WinterFlowResponseEngine;
        if (i != 1) {
            if (i == 2) {
                return WinterFlowUnitTestResponse(winterFlowBackendEventEmitter.WinterFlowBandwidthObject);
            }
            WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject(WinterFlowResolverBackend.WinterFlowSyntax("Unknown focus type: ", i));
            return null;
        }
        int i2 = winterFlowBackendEventEmitter.WinterFlowOrchestrationSubsystem;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return WinterFlowUnitTestResponse(i2);
    }

    @Override // com.google.android.datatransport.WinterFlowConfigurationModule
    public final void WinterFlowTransactionManagerStrategy(int i, WinterFlowFrameworkDataSource winterFlowFrameworkDataSource, String str, Bundle bundle) {
        this.WinterFlowResponseEngine.WinterFlowCacheManagerAgent(i, winterFlowFrameworkDataSource, str, bundle);
    }

    /* JADX WARN: Code restructure failed: missing block: B:385:0x080e, code lost:
    
        if (r5 == false) goto L393;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x05ca  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x05e3  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0636  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0658  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x065e  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x067c  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x06cd  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x06df  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x076d  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x078c  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x07d9  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x07f8  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x07f4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:394:0x078f  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x082a  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0846  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x0853  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0874  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x08cb  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x08f0  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x08f6  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x0979 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:450:0x0989  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x098d  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x09b5  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x09bf  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x09fe A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:482:0x0a0e  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x0a12  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x0a3a  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x0a44  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x0a68  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x0a77  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x0a8a  */
    /* JADX WARN: Removed duplicated region for block: B:559:0x0bab  */
    /* JADX WARN: Removed duplicated region for block: B:562:0x0bbc  */
    /* JADX WARN: Removed duplicated region for block: B:568:0x0be6  */
    /* JADX WARN: Removed duplicated region for block: B:573:0x0c02  */
    /* JADX WARN: Removed duplicated region for block: B:576:0x0bd9  */
    /* JADX WARN: Removed duplicated region for block: B:577:0x0baf  */
    /* JADX WARN: Removed duplicated region for block: B:578:0x0a7b  */
    /* JADX WARN: Removed duplicated region for block: B:579:0x0903  */
    /* JADX WARN: Removed duplicated region for block: B:603:0x0663  */
    /* JADX WARN: Removed duplicated region for block: B:604:0x065a  */
    /* JADX WARN: Removed duplicated region for block: B:605:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:606:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:608:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:609:0x05e8  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0c0a  */
    /* JADX WARN: Type inference failed for: r2v26, types: [com.google.android.datatransport.WinterFlowDataSourceEngine] */
    /* JADX WARN: Type inference failed for: r2v27, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v28, types: [java.util.ArrayList] */
    @Override // com.google.android.datatransport.WinterFlowConfigurationModule
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final WinterFlowFrameworkDataSource WinterFlowUnitTestResponse(int i) {
        WinterFlowBackendEventEmitter winterFlowBackendEventEmitter;
        WinterFlowSyntaxTransactionManager winterFlowSyntaxTransactionManager;
        WinterFlowRouterNode winterFlowRouterNode;
        WinterFlowProcessorSystem winterFlowProcessorSystem;
        WinterFlowSchedulerStructure winterFlowSchedulerStructure;
        WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure;
        AccessibilityNodeInfo accessibilityNodeInfo;
        WinterFlowFrameworkDataSource winterFlowFrameworkDataSource;
        WinterFlowRequestListener winterFlowRequestListener;
        WinterFlowDecoratorBackend winterFlowDecoratorBackend;
        SpannableString spannableString;
        AccessibilityNodeInfo accessibilityNodeInfo2;
        AccessibilityNodeInfo accessibilityNodeInfo3;
        WinterFlowFrameworkDataSource winterFlowFrameworkDataSource2;
        Object WinterFlowUnitTestResponse;
        int i2;
        Object WinterFlowUnitTestResponse2;
        Object WinterFlowUnitTestResponse3;
        WinterFlowBackendEventEmitter winterFlowBackendEventEmitter2;
        boolean z;
        WinterFlowProcessorSystem winterFlowProcessorSystem2;
        WinterFlowVersionParser WinterFlowThreadListener;
        boolean z2;
        WinterFlowDecoratorStrategy winterFlowDecoratorStrategy;
        WinterFlowDecoratorStrategy winterFlowDecoratorStrategy2;
        WinterFlowDecoratorStrategy winterFlowDecoratorStrategy3;
        String WinterFlowThreadListener2;
        ArrayList arrayList;
        CharSequence WinterFlowVariableVersionControl;
        WinterFlowRendererGateway winterFlowRendererGateway;
        Object WinterFlowUnitTestResponse4;
        WinterFlowDebugResponse winterFlowDebugResponse;
        WinterFlowExceptionPlatform winterFlowExceptionPlatform;
        WinterFlowExceptionPlatform winterFlowExceptionPlatform2;
        int i3;
        int WinterFlowArrayNetwork;
        Bundle bundle;
        WinterFlowSyntaxTransactionManager winterFlowSyntaxTransactionManager2;
        int WinterFlowArrayNetwork2;
        String str;
        WinterFlowFrameworkDataSource winterFlowFrameworkDataSource3;
        WinterFlowRouterLayer WinterFlowResponseEngine;
        Object WinterFlowUnitTestResponse5;
        Object WinterFlowUnitTestResponse6;
        WinterFlowSchedulerStructure winterFlowSchedulerStructure2;
        WinterFlowDecoratorStrategy winterFlowDecoratorStrategy4;
        List list;
        WinterFlowSchedulerStructure WinterFlowVariableBandwidth;
        boolean z3;
        boolean z4;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i4;
        boolean z5;
        WinterFlowProcessorSystem winterFlowProcessorSystem3;
        WinterFlowBackendEventEmitter winterFlowBackendEventEmitter3 = this.WinterFlowResponseEngine;
        AccessibilityManager accessibilityManager = winterFlowBackendEventEmitter3.WinterFlowTransactionAgent;
        WinterFlowSyntaxTransactionManager winterFlowSyntaxTransactionManager3 = winterFlowBackendEventEmitter3.WinterFlowRouterRouter;
        if (winterFlowSyntaxTransactionManager3.getComposeViewContext().WinterFlowCacheManagerAgent.WinterFlowUnitTestResponse().WinterFlowSyntax == WinterFlowDatabaseProtocol.WinterFlowVariableVersionControl) {
            if (!accessibilityManager.isEnabled()) {
                winterFlowFrameworkDataSource3 = new WinterFlowFrameworkDataSource(AccessibilityNodeInfo.obtain());
                winterFlowBackendEventEmitter2 = winterFlowBackendEventEmitter3;
                i2 = i;
                if (winterFlowBackendEventEmitter2.WinterFlowVariableBandwidth) {
                    if (i2 == winterFlowBackendEventEmitter2.WinterFlowBandwidthObject) {
                        winterFlowBackendEventEmitter2.WinterFlowConcurrencyThread = winterFlowFrameworkDataSource3;
                    }
                    if (i2 == winterFlowBackendEventEmitter2.WinterFlowOrchestrationSubsystem) {
                        winterFlowBackendEventEmitter2.WinterFlowSingletonPlatform = winterFlowFrameworkDataSource3;
                    }
                }
                return winterFlowFrameworkDataSource3;
            }
            winterFlowFrameworkDataSource3 = null;
            winterFlowBackendEventEmitter2 = winterFlowBackendEventEmitter3;
            i2 = i;
            if (winterFlowBackendEventEmitter2.WinterFlowVariableBandwidth) {
            }
            return winterFlowFrameworkDataSource3;
        }
        WinterFlowArrayModule winterFlowArrayModule = (WinterFlowArrayModule) winterFlowBackendEventEmitter3.WinterFlowServerProtocol().WinterFlowHookDataSource(i);
        if (winterFlowArrayModule == null) {
            if (!accessibilityManager.isEnabled()) {
                winterFlowFrameworkDataSource3 = new WinterFlowFrameworkDataSource(AccessibilityNodeInfo.obtain());
                winterFlowBackendEventEmitter2 = winterFlowBackendEventEmitter3;
                i2 = i;
                if (winterFlowBackendEventEmitter2.WinterFlowVariableBandwidth) {
                }
                return winterFlowFrameworkDataSource3;
            }
            winterFlowFrameworkDataSource3 = null;
            winterFlowBackendEventEmitter2 = winterFlowBackendEventEmitter3;
            i2 = i;
            if (winterFlowBackendEventEmitter2.WinterFlowVariableBandwidth) {
            }
            return winterFlowFrameworkDataSource3;
        }
        WinterFlowProcessorSystem winterFlowProcessorSystem4 = winterFlowArrayModule.WinterFlowRouterStructure;
        WinterFlowDecoratorBackend WinterFlowTransactionAgent = winterFlowProcessorSystem4.WinterFlowTransactionAgent();
        WinterFlowSchedulerStructure winterFlowSchedulerStructure3 = winterFlowProcessorSystem4.WinterFlowCacheManagerAgent;
        Object WinterFlowUnitTestResponse7 = WinterFlowTransactionAgent.WinterFlowVariableVersionControl.WinterFlowUnitTestResponse(WinterFlowRendererJava.WinterFlowBandwidthObject);
        if (WinterFlowUnitTestResponse7 == null) {
            WinterFlowUnitTestResponse7 = null;
        }
        boolean WinterFlowThreadListener3 = WinterFlowManagerRequest.WinterFlowThreadListener(WinterFlowUnitTestResponse7, Boolean.TRUE);
        if (WinterFlowThreadListener3) {
            if (!(Build.VERSION.SDK_INT >= 34 ? WinterFlowThreadPoolHelper.WinterFlowVariableVersionControl(accessibilityManager) : true)) {
                winterFlowBackendEventEmitter2 = winterFlowBackendEventEmitter3;
                i2 = i;
                winterFlowFrameworkDataSource3 = null;
                if (winterFlowBackendEventEmitter2.WinterFlowVariableBandwidth) {
                }
                return winterFlowFrameworkDataSource3;
            }
        }
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        WinterFlowFrameworkDataSource winterFlowFrameworkDataSource4 = new WinterFlowFrameworkDataSource(obtain);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 34) {
            WinterFlowThreadPoolHelper.WinterFlowUnitTestResponse(obtain, WinterFlowThreadListener3);
        } else {
            winterFlowFrameworkDataSource4.WinterFlowTransactionManagerStrategy(64, WinterFlowThreadListener3);
        }
        if (i == -1) {
            Object parentForAccessibility = winterFlowSyntaxTransactionManager3.getParentForAccessibility();
            View view = parentForAccessibility instanceof View ? (View) parentForAccessibility : null;
            winterFlowFrameworkDataSource4.WinterFlowHookDataSource = -1;
            obtain.setParent(view);
        } else {
            WinterFlowProcessorSystem WinterFlowServerProtocol = winterFlowProcessorSystem4.WinterFlowServerProtocol();
            Integer valueOf = WinterFlowServerProtocol != null ? Integer.valueOf(WinterFlowServerProtocol.WinterFlowTransactionManagerStrategy) : null;
            if (valueOf == null) {
                WinterFlowViewUtility.WinterFlowCacheManagerAgent("semanticsNode " + i + " has null parent");
                throw new WinterFlowServerSystem();
            }
            int intValue = valueOf.intValue();
            if (intValue == winterFlowSyntaxTransactionManager3.getSemanticsOwner().WinterFlowRouterStructure().WinterFlowTransactionManagerStrategy) {
                intValue = -1;
            }
            winterFlowFrameworkDataSource4.WinterFlowHookDataSource = intValue;
            obtain.setParent(winterFlowSyntaxTransactionManager3, intValue);
        }
        winterFlowFrameworkDataSource4.WinterFlowCacheManagerAgent = i;
        obtain.setSource(winterFlowSyntaxTransactionManager3, i);
        obtain.setBoundsInScreen(winterFlowBackendEventEmitter3.WinterFlowArrayNetwork(winterFlowArrayModule));
        WinterFlowRouterNode winterFlowRouterNode2 = winterFlowBackendEventEmitter3.WinterFlowFrontendBackend;
        WinterFlowRequestListener winterFlowRequestListener2 = winterFlowBackendEventEmitter3.WinterFlowMapperProtocol;
        Resources resources = winterFlowSyntaxTransactionManager3.getContext().getResources();
        winterFlowFrameworkDataSource4.WinterFlowUnitTestResponse("android.view.View");
        WinterFlowDecoratorBackend winterFlowDecoratorBackend2 = winterFlowProcessorSystem4.WinterFlowArrayNetwork;
        WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure2 = winterFlowDecoratorBackend2.WinterFlowVariableVersionControl;
        if (winterFlowDatabaseSchemaStructure2.WinterFlowCacheManagerAgent(WinterFlowRendererJava.WinterFlowCacheManagerListener)) {
            winterFlowFrameworkDataSource4.WinterFlowUnitTestResponse("android.widget.EditText");
        }
        if (winterFlowDatabaseSchemaStructure2.WinterFlowCacheManagerAgent(WinterFlowRendererJava.WinterFlowArrayHelper)) {
            winterFlowFrameworkDataSource4.WinterFlowUnitTestResponse("android.widget.TextView");
        }
        Object WinterFlowUnitTestResponse8 = winterFlowDatabaseSchemaStructure2.WinterFlowUnitTestResponse(WinterFlowRendererJava.WinterFlowConsumerUserManager);
        if (WinterFlowUnitTestResponse8 == null) {
            WinterFlowUnitTestResponse8 = null;
        }
        if (((WinterFlowQueueTransaction) WinterFlowUnitTestResponse8) != null && ((winterFlowProcessorSystem4.WinterFlowServiceUtility() || WinterFlowProcessorSystem.WinterFlowResponseEngine(4, winterFlowProcessorSystem4).isEmpty()) && (winterFlowProcessorSystem4.WinterFlowOrchestrationSubsystem() || winterFlowDecoratorBackend2.WinterFlowUnitTestResponse))) {
            winterFlowFrameworkDataSource4.WinterFlowUnitTestResponse("android.widget.ImageView");
        }
        obtain.setPackageName(winterFlowSyntaxTransactionManager3.getContext().getPackageName());
        obtain.setImportantForAccessibility(WinterFlowEncryptionSubsystem.WinterFlowSoftwareProtocol(winterFlowProcessorSystem4));
        boolean WinterFlowVariableVersionControl2 = i5 >= 34 ? WinterFlowThreadPoolHelper.WinterFlowVariableVersionControl(accessibilityManager) : true;
        List WinterFlowResponseEngine2 = WinterFlowProcessorSystem.WinterFlowResponseEngine(4, winterFlowProcessorSystem4);
        int size = WinterFlowResponseEngine2.size();
        boolean z6 = WinterFlowVariableVersionControl2;
        int i6 = 0;
        int i7 = 0;
        while (i7 < size) {
            List list2 = WinterFlowResponseEngine2;
            WinterFlowProcessorSystem winterFlowProcessorSystem5 = (WinterFlowProcessorSystem) WinterFlowResponseEngine2.get(i7);
            int i8 = i7;
            WinterFlowJSONAdapter WinterFlowServerProtocol2 = winterFlowBackendEventEmitter3.WinterFlowServerProtocol();
            int i9 = size;
            int i10 = winterFlowProcessorSystem5.WinterFlowTransactionManagerStrategy;
            if (WinterFlowServerProtocol2.WinterFlowRouterStructure(i10)) {
                WinterFlowRouterLayer winterFlowRouterLayer = winterFlowSyntaxTransactionManager3.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(winterFlowProcessorSystem5.WinterFlowCacheManagerAgent);
                if (i10 != -1) {
                    if (winterFlowRouterLayer != null) {
                        obtain.addChild(winterFlowRouterLayer);
                    } else {
                        WinterFlowArrayModule winterFlowArrayModule2 = (WinterFlowArrayModule) winterFlowBackendEventEmitter3.WinterFlowServerProtocol().WinterFlowHookDataSource(i10);
                        if (winterFlowArrayModule2 == null || (winterFlowProcessorSystem3 = winterFlowArrayModule2.WinterFlowRouterStructure) == null) {
                            z5 = false;
                        } else {
                            Object WinterFlowUnitTestResponse9 = winterFlowProcessorSystem3.WinterFlowTransactionAgent().WinterFlowVariableVersionControl.WinterFlowUnitTestResponse(WinterFlowRendererJava.WinterFlowBandwidthObject);
                            if (WinterFlowUnitTestResponse9 == null) {
                                WinterFlowUnitTestResponse9 = null;
                            }
                            z5 = WinterFlowManagerRequest.WinterFlowThreadListener(WinterFlowUnitTestResponse9, Boolean.TRUE);
                        }
                        if (z6 || !z5) {
                            obtain.addChild(winterFlowSyntaxTransactionManager3, i10);
                        }
                    }
                    winterFlowRouterNode2.WinterFlowTransactionManagerStrategy(i10, i6);
                    i6++;
                }
            }
            i7 = i8 + 1;
            WinterFlowResponseEngine2 = list2;
            size = i9;
        }
        int i11 = winterFlowBackendEventEmitter3.WinterFlowBandwidthObject;
        AccessibilityNodeInfo accessibilityNodeInfo4 = winterFlowFrameworkDataSource4.WinterFlowRouterStructure;
        if (i == i11) {
            accessibilityNodeInfo4.setAccessibilityFocused(true);
            winterFlowFrameworkDataSource4.WinterFlowRouterStructure(WinterFlowStrategyUserManager.WinterFlowArrayNetwork);
        } else {
            accessibilityNodeInfo4.setAccessibilityFocused(false);
            winterFlowFrameworkDataSource4.WinterFlowRouterStructure(WinterFlowStrategyUserManager.WinterFlowCacheManagerAgent);
        }
        WinterFlowCompilerStructure WinterFlowResolverController = WinterFlowTestingCloud.WinterFlowResolverController(winterFlowProcessorSystem4);
        if (WinterFlowResolverController != null) {
            winterFlowSyntaxTransactionManager3.getFontFamilyResolver();
            WinterFlowConcurrencyParser density = winterFlowSyntaxTransactionManager3.getDensity();
            WinterFlowNodeLayer winterFlowNodeLayer = winterFlowBackendEventEmitter3.WinterFlowSoftwareEngine;
            winterFlowSyntaxTransactionManager = winterFlowSyntaxTransactionManager3;
            String str2 = WinterFlowResolverController.WinterFlowTransactionManagerStrategy;
            winterFlowRequestListener = winterFlowRequestListener2;
            List list3 = WinterFlowResolverController.WinterFlowVariableVersionControl;
            SpannableString spannableString2 = new SpannableString(str2);
            ArrayList arrayList4 = WinterFlowResolverController.WinterFlowUnitTestResponse;
            if (arrayList4 != null) {
                int size2 = arrayList4.size();
                winterFlowSchedulerStructure = winterFlowSchedulerStructure3;
                int i12 = 0;
                while (i12 < size2) {
                    ArrayList arrayList5 = arrayList4;
                    WinterFlowVariableTransaction winterFlowVariableTransaction = (WinterFlowVariableTransaction) arrayList4.get(i12);
                    int i13 = size2;
                    WinterFlowDebugUtility winterFlowDebugUtility = (WinterFlowDebugUtility) winterFlowVariableTransaction.WinterFlowRouterStructure;
                    int i14 = i12;
                    int i15 = winterFlowVariableTransaction.WinterFlowHookDataSource;
                    int i16 = winterFlowVariableTransaction.WinterFlowCacheManagerAgent;
                    WinterFlowBackendEventEmitter winterFlowBackendEventEmitter4 = winterFlowBackendEventEmitter3;
                    long WinterFlowArrayNetwork3 = winterFlowDebugUtility.WinterFlowRouterStructure.WinterFlowArrayNetwork();
                    WinterFlowRouterNode winterFlowRouterNode3 = winterFlowRouterNode2;
                    WinterFlowProcessorSystem winterFlowProcessorSystem6 = winterFlowProcessorSystem4;
                    long j = winterFlowDebugUtility.WinterFlowHookDataSource;
                    WinterFlowObjectHook winterFlowObjectHook = winterFlowDebugUtility.WinterFlowCacheManagerAgent;
                    WinterFlowPackageTool winterFlowPackageTool = winterFlowDebugUtility.WinterFlowArrayNetwork;
                    WinterFlowServiceRefactoring winterFlowServiceRefactoring = winterFlowDebugUtility.WinterFlowResponseEngine;
                    WinterFlowFrameworkDataSource winterFlowFrameworkDataSource5 = winterFlowFrameworkDataSource4;
                    WinterFlowRuntimeException winterFlowRuntimeException = winterFlowDebugUtility.WinterFlowTransactionAgent;
                    WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure3 = winterFlowDatabaseSchemaStructure2;
                    AccessibilityNodeInfo accessibilityNodeInfo5 = obtain;
                    long j2 = winterFlowDebugUtility.WinterFlowServerProtocol;
                    WinterFlowProcessorProcess winterFlowProcessorProcess = winterFlowDebugUtility.WinterFlowThreadListener;
                    WinterFlowBatchLayer winterFlowBatchLayer = winterFlowDebugUtility.WinterFlowRouterStructure;
                    WinterFlowDecoratorBackend winterFlowDecoratorBackend3 = winterFlowDecoratorBackend2;
                    AccessibilityNodeInfo accessibilityNodeInfo6 = accessibilityNodeInfo4;
                    long WinterFlowArrayNetwork4 = winterFlowBatchLayer.WinterFlowArrayNetwork();
                    int i17 = WinterFlowInheritanceSubsystem.WinterFlowTransactionAgent;
                    if (!WinterFlowUnitTestSoftware.WinterFlowRouterStructure(WinterFlowArrayNetwork3, WinterFlowArrayNetwork4)) {
                        winterFlowBatchLayer = WinterFlowArrayNetwork3 != 16 ? new WinterFlowConcurrencyInterface(WinterFlowArrayNetwork3) : WinterFlowSessionManagerProcess.WinterFlowConsumerUserManager;
                    }
                    WinterFlowHookProcessor.WinterFlowSingletonPlatform(spannableString2, winterFlowBatchLayer.WinterFlowArrayNetwork(), i15, i16);
                    SpannableString spannableString3 = spannableString2;
                    WinterFlowHookProcessor.WinterFlowVariableBandwidth(spannableString3, j, density, i15, i16);
                    if (winterFlowObjectHook == null && winterFlowPackageTool == null) {
                        i4 = 33;
                    } else {
                        i4 = 33;
                        spannableString3.setSpan(new StyleSpan(WinterFlowHandlerWebsocket.WinterFlowRouterAdapter(winterFlowObjectHook == null ? WinterFlowObjectHook.WinterFlowSyntax : winterFlowObjectHook, winterFlowPackageTool != null ? winterFlowPackageTool.WinterFlowRouterStructure : 0)), i15, i16, 33);
                    }
                    if (winterFlowProcessorProcess != null) {
                        int i18 = winterFlowProcessorProcess.WinterFlowRouterStructure;
                        if ((i18 | 1) == i18) {
                            spannableString3.setSpan(new UnderlineSpan(), i15, i16, i4);
                        }
                        if ((i18 | 2) == i18) {
                            spannableString3.setSpan(new StrikethroughSpan(), i15, i16, i4);
                        }
                    }
                    if (winterFlowServiceRefactoring != null) {
                        spannableString3.setSpan(new ScaleXSpan(winterFlowServiceRefactoring.WinterFlowRouterStructure), i15, i16, i4);
                    }
                    WinterFlowHookProcessor.WinterFlowBatchUI(spannableString3, winterFlowRuntimeException, i15, i16);
                    if (j2 != 16) {
                        spannableString3.setSpan(new BackgroundColorSpan(WinterFlowInvokerComponent.WinterFlowConfiguration(j2)), i15, i16, i4);
                    }
                    i12 = i14 + 1;
                    spannableString2 = spannableString3;
                    winterFlowDecoratorBackend2 = winterFlowDecoratorBackend3;
                    arrayList4 = arrayList5;
                    size2 = i13;
                    winterFlowBackendEventEmitter3 = winterFlowBackendEventEmitter4;
                    winterFlowProcessorSystem4 = winterFlowProcessorSystem6;
                    winterFlowRouterNode2 = winterFlowRouterNode3;
                    winterFlowFrameworkDataSource4 = winterFlowFrameworkDataSource5;
                    obtain = accessibilityNodeInfo5;
                    winterFlowDatabaseSchemaStructure2 = winterFlowDatabaseSchemaStructure3;
                    accessibilityNodeInfo4 = accessibilityNodeInfo6;
                }
            } else {
                winterFlowSchedulerStructure = winterFlowSchedulerStructure3;
            }
            winterFlowBackendEventEmitter = winterFlowBackendEventEmitter3;
            winterFlowRouterNode = winterFlowRouterNode2;
            winterFlowProcessorSystem = winterFlowProcessorSystem4;
            AccessibilityNodeInfo accessibilityNodeInfo7 = accessibilityNodeInfo4;
            winterFlowDatabaseSchemaStructure = winterFlowDatabaseSchemaStructure2;
            accessibilityNodeInfo = obtain;
            winterFlowFrameworkDataSource = winterFlowFrameworkDataSource4;
            SpannableString spannableString4 = spannableString2;
            winterFlowDecoratorBackend = winterFlowDecoratorBackend2;
            int length = str2.length();
            ?? r2 = WinterFlowDataSourceEngine.WinterFlowVariableVersionControl;
            if (list3 != null) {
                arrayList2 = new ArrayList(list3.size());
                int size3 = list3.size();
                for (int i19 = 0; i19 < size3; i19++) {
                    Object obj = list3.get(i19);
                    WinterFlowVariableTransaction winterFlowVariableTransaction2 = (WinterFlowVariableTransaction) obj;
                    if ((winterFlowVariableTransaction2.WinterFlowRouterStructure instanceof WinterFlowNetworkSystem) && WinterFlowAlgorithmStrategy.WinterFlowRouterStructure(0, length, winterFlowVariableTransaction2.WinterFlowHookDataSource, winterFlowVariableTransaction2.WinterFlowCacheManagerAgent)) {
                        arrayList2.add(obj);
                    }
                }
            } else {
                arrayList2 = r2;
            }
            int size4 = arrayList2.size();
            for (int i20 = 0; i20 < size4; i20++) {
                WinterFlowVariableTransaction winterFlowVariableTransaction3 = (WinterFlowVariableTransaction) arrayList2.get(i20);
                WinterFlowNetworkSystem winterFlowNetworkSystem = (WinterFlowNetworkSystem) winterFlowVariableTransaction3.WinterFlowRouterStructure;
                int i21 = winterFlowVariableTransaction3.WinterFlowHookDataSource;
                int i22 = winterFlowVariableTransaction3.WinterFlowCacheManagerAgent;
                if (!(winterFlowNetworkSystem instanceof WinterFlowNetworkSystem)) {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterStructure();
                    return null;
                }
                spannableString4.setSpan(new TtsSpan.VerbatimBuilder(winterFlowNetworkSystem.WinterFlowRouterStructure).build(), i21, i22, 33);
            }
            int length2 = str2.length();
            if (list3 != null) {
                arrayList3 = new ArrayList(list3.size());
                int size5 = list3.size();
                for (int i23 = 0; i23 < size5; i23++) {
                    Object obj2 = list3.get(i23);
                    WinterFlowVariableTransaction winterFlowVariableTransaction4 = (WinterFlowVariableTransaction) obj2;
                    if ((winterFlowVariableTransaction4.WinterFlowRouterStructure instanceof WinterFlowCloudInterface) && WinterFlowAlgorithmStrategy.WinterFlowRouterStructure(0, length2, winterFlowVariableTransaction4.WinterFlowHookDataSource, winterFlowVariableTransaction4.WinterFlowCacheManagerAgent)) {
                        arrayList3.add(obj2);
                    }
                }
            } else {
                arrayList3 = r2;
            }
            int size6 = arrayList3.size();
            for (int i24 = 0; i24 < size6; i24++) {
                WinterFlowVariableTransaction winterFlowVariableTransaction5 = (WinterFlowVariableTransaction) arrayList3.get(i24);
                WinterFlowCloudInterface winterFlowCloudInterface = (WinterFlowCloudInterface) winterFlowVariableTransaction5.WinterFlowRouterStructure;
                int i25 = winterFlowVariableTransaction5.WinterFlowHookDataSource;
                int i26 = winterFlowVariableTransaction5.WinterFlowCacheManagerAgent;
                WeakHashMap weakHashMap = (WeakHashMap) winterFlowNodeLayer.WinterFlowVariableVersionControl;
                Object obj3 = weakHashMap.get(winterFlowCloudInterface);
                if (obj3 == null) {
                    obj3 = new URLSpan(winterFlowCloudInterface.WinterFlowRouterStructure);
                    weakHashMap.put(winterFlowCloudInterface, obj3);
                }
                spannableString4.setSpan((URLSpan) obj3, i25, i26, 33);
            }
            int length3 = str2.length();
            if (list3 != null) {
                r2 = new ArrayList(list3.size());
                int size7 = list3.size();
                for (int i27 = 0; i27 < size7; i27++) {
                    Object obj4 = list3.get(i27);
                    WinterFlowVariableTransaction winterFlowVariableTransaction6 = (WinterFlowVariableTransaction) obj4;
                    if ((winterFlowVariableTransaction6.WinterFlowRouterStructure instanceof WinterFlowSessionScheduler) && WinterFlowAlgorithmStrategy.WinterFlowRouterStructure(0, length3, winterFlowVariableTransaction6.WinterFlowHookDataSource, winterFlowVariableTransaction6.WinterFlowCacheManagerAgent)) {
                        r2.add(obj4);
                    }
                }
            }
            int size8 = r2.size();
            for (int i28 = 0; i28 < size8; i28++) {
                WinterFlowVariableTransaction winterFlowVariableTransaction7 = (WinterFlowVariableTransaction) r2.get(i28);
                int i29 = winterFlowVariableTransaction7.WinterFlowHookDataSource;
                Object obj5 = winterFlowVariableTransaction7.WinterFlowRouterStructure;
                int i30 = winterFlowVariableTransaction7.WinterFlowCacheManagerAgent;
                if (i29 != i30) {
                    WinterFlowSessionScheduler winterFlowSessionScheduler = (WinterFlowSessionScheduler) obj5;
                    if (winterFlowSessionScheduler instanceof WinterFlowEventModule) {
                        obj5.getClass();
                        WinterFlowEventModule winterFlowEventModule = (WinterFlowEventModule) obj5;
                        WinterFlowVariableTransaction winterFlowVariableTransaction8 = new WinterFlowVariableTransaction(i29, i30, winterFlowEventModule);
                        WeakHashMap weakHashMap2 = (WeakHashMap) winterFlowNodeLayer.WinterFlowTransactionManagerStrategy;
                        Object obj6 = weakHashMap2.get(winterFlowVariableTransaction8);
                        if (obj6 == null) {
                            obj6 = new URLSpan(winterFlowEventModule.WinterFlowRouterStructure);
                            weakHashMap2.put(winterFlowVariableTransaction8, obj6);
                        }
                        spannableString4.setSpan((URLSpan) obj6, i29, i30, 33);
                    } else {
                        WeakHashMap weakHashMap3 = (WeakHashMap) winterFlowNodeLayer.WinterFlowUnitTestResponse;
                        Object obj7 = weakHashMap3.get(winterFlowVariableTransaction7);
                        if (obj7 == null) {
                            obj7 = new WinterFlowDeserializationPackage(winterFlowSessionScheduler);
                            weakHashMap3.put(winterFlowVariableTransaction7, obj7);
                        }
                        spannableString4.setSpan((ClickableSpan) obj7, i29, i30, 33);
                    }
                }
            }
            spannableString = (SpannableString) WinterFlowBackendEventEmitter.WinterFlowUserManagerUserManager(spannableString4);
            accessibilityNodeInfo2 = accessibilityNodeInfo7;
        } else {
            winterFlowBackendEventEmitter = winterFlowBackendEventEmitter3;
            winterFlowSyntaxTransactionManager = winterFlowSyntaxTransactionManager3;
            winterFlowRouterNode = winterFlowRouterNode2;
            winterFlowProcessorSystem = winterFlowProcessorSystem4;
            winterFlowSchedulerStructure = winterFlowSchedulerStructure3;
            winterFlowDatabaseSchemaStructure = winterFlowDatabaseSchemaStructure2;
            accessibilityNodeInfo = obtain;
            winterFlowFrameworkDataSource = winterFlowFrameworkDataSource4;
            winterFlowRequestListener = winterFlowRequestListener2;
            winterFlowDecoratorBackend = winterFlowDecoratorBackend2;
            spannableString = null;
            accessibilityNodeInfo2 = accessibilityNodeInfo4;
        }
        accessibilityNodeInfo2.setText(spannableString);
        WinterFlowRendererOrchestration winterFlowRendererOrchestration = WinterFlowRendererJava.WinterFlowSyntaxSubsystem;
        WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure4 = winterFlowDatabaseSchemaStructure;
        if (winterFlowDatabaseSchemaStructure4.WinterFlowCacheManagerAgent(winterFlowRendererOrchestration)) {
            accessibilityNodeInfo3 = accessibilityNodeInfo;
            accessibilityNodeInfo3.setContentInvalid(true);
            Object WinterFlowUnitTestResponse10 = winterFlowDatabaseSchemaStructure4.WinterFlowUnitTestResponse(winterFlowRendererOrchestration);
            if (WinterFlowUnitTestResponse10 == null) {
                WinterFlowUnitTestResponse10 = null;
            }
            accessibilityNodeInfo3.setError((CharSequence) WinterFlowUnitTestResponse10);
        } else {
            accessibilityNodeInfo3 = accessibilityNodeInfo;
        }
        WinterFlowProcessorSystem winterFlowProcessorSystem7 = winterFlowProcessorSystem;
        String WinterFlowMapperProtocol = WinterFlowTestingCloud.WinterFlowMapperProtocol(winterFlowProcessorSystem7, resources);
        if (Build.VERSION.SDK_INT >= 30) {
            WinterFlowDebugPlatform.WinterFlowSyntax(accessibilityNodeInfo2, WinterFlowMapperProtocol);
        } else {
            accessibilityNodeInfo2.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", WinterFlowMapperProtocol);
        }
        accessibilityNodeInfo3.setCheckable(WinterFlowTestingCloud.WinterFlowSerializerStructure(winterFlowProcessorSystem7));
        Object WinterFlowUnitTestResponse11 = winterFlowDatabaseSchemaStructure4.WinterFlowUnitTestResponse(WinterFlowRendererJava.WinterFlowUserManagerUserManager);
        if (WinterFlowUnitTestResponse11 == null) {
            WinterFlowUnitTestResponse11 = null;
        }
        WinterFlowFrameworkCacheManager winterFlowFrameworkCacheManager = (WinterFlowFrameworkCacheManager) WinterFlowUnitTestResponse11;
        if (winterFlowFrameworkCacheManager != null) {
            if (winterFlowFrameworkCacheManager == WinterFlowFrameworkCacheManager.WinterFlowVariableVersionControl) {
                accessibilityNodeInfo2.setChecked(true);
            } else if (winterFlowFrameworkCacheManager == WinterFlowFrameworkCacheManager.WinterFlowTransactionManagerStrategy) {
                accessibilityNodeInfo2.setChecked(false);
            }
        }
        Object WinterFlowUnitTestResponse12 = winterFlowDatabaseSchemaStructure4.WinterFlowUnitTestResponse(WinterFlowRendererJava.WinterFlowSoftwareProtocol);
        if (WinterFlowUnitTestResponse12 == null) {
            WinterFlowUnitTestResponse12 = null;
        }
        Boolean bool = (Boolean) WinterFlowUnitTestResponse12;
        if (bool != null) {
            accessibilityNodeInfo2.setChecked(bool.booleanValue());
        }
        if (!winterFlowDecoratorBackend.WinterFlowUnitTestResponse || WinterFlowProcessorSystem.WinterFlowResponseEngine(4, winterFlowProcessorSystem7).isEmpty()) {
            Object WinterFlowUnitTestResponse13 = winterFlowDatabaseSchemaStructure4.WinterFlowUnitTestResponse(WinterFlowRendererJava.WinterFlowRouterStructure);
            if (WinterFlowUnitTestResponse13 == null) {
                WinterFlowUnitTestResponse13 = null;
            }
            List list4 = (List) WinterFlowUnitTestResponse13;
            accessibilityNodeInfo3.setContentDescription(list4 != null ? (String) WinterFlowSerializerUtility.WinterFlowPipelineSoftware(list4) : null);
        }
        Object WinterFlowUnitTestResponse14 = winterFlowDatabaseSchemaStructure4.WinterFlowUnitTestResponse(WinterFlowRendererJava.WinterFlowBackendCacheManager);
        if (WinterFlowUnitTestResponse14 == null) {
            WinterFlowUnitTestResponse14 = null;
        }
        String str3 = (String) WinterFlowUnitTestResponse14;
        if (str3 != null) {
            WinterFlowProcessorSystem winterFlowProcessorSystem8 = winterFlowProcessorSystem7;
            while (true) {
                if (winterFlowProcessorSystem8 == null) {
                    z4 = false;
                    break;
                }
                WinterFlowDecoratorBackend winterFlowDecoratorBackend4 = winterFlowProcessorSystem8.WinterFlowArrayNetwork;
                WinterFlowRendererOrchestration winterFlowRendererOrchestration2 = WinterFlowSyntaxSession.WinterFlowRouterStructure;
                if (winterFlowDecoratorBackend4.WinterFlowVariableVersionControl.WinterFlowCacheManagerAgent(winterFlowRendererOrchestration2)) {
                    z4 = ((Boolean) winterFlowDecoratorBackend4.WinterFlowArrayNetwork(winterFlowRendererOrchestration2)).booleanValue();
                    break;
                }
                winterFlowProcessorSystem8 = winterFlowProcessorSystem8.WinterFlowServerProtocol();
            }
            if (z4) {
                accessibilityNodeInfo3.setViewIdResourceName(str3);
            }
        }
        Object WinterFlowUnitTestResponse15 = winterFlowDatabaseSchemaStructure4.WinterFlowUnitTestResponse(WinterFlowRendererJava.WinterFlowRouterRouter);
        if (WinterFlowUnitTestResponse15 == null) {
            WinterFlowUnitTestResponse15 = null;
        }
        if (((WinterFlowAlgorithmSession) WinterFlowUnitTestResponse15) != null) {
            if (Build.VERSION.SDK_INT < 28) {
                winterFlowFrameworkDataSource2 = winterFlowFrameworkDataSource;
                winterFlowFrameworkDataSource2.WinterFlowTransactionManagerStrategy(2, true);
                WinterFlowUnitTestResponse = winterFlowDatabaseSchemaStructure4.WinterFlowUnitTestResponse(WinterFlowRendererJava.WinterFlowSyntax);
                if (WinterFlowUnitTestResponse == null) {
                    WinterFlowUnitTestResponse = null;
                }
                if (((WinterFlowAlgorithmSession) WinterFlowUnitTestResponse) != null) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        accessibilityNodeInfo3.setTextEntryKey(true);
                    } else {
                        winterFlowFrameworkDataSource2.WinterFlowTransactionManagerStrategy(8, true);
                    }
                }
                i2 = i;
                if (i2 != -1) {
                    int WinterFlowArrayNetwork5 = winterFlowRouterNode.WinterFlowArrayNetwork(winterFlowProcessorSystem7.WinterFlowTransactionManagerStrategy);
                    if (WinterFlowArrayNetwork5 != -1) {
                        accessibilityNodeInfo3.setDrawingOrder(WinterFlowArrayNetwork5);
                    }
                }
                accessibilityNodeInfo3.setPassword(winterFlowDatabaseSchemaStructure4.WinterFlowCacheManagerAgent(WinterFlowRendererJava.WinterFlowSoftwareEngine));
                WinterFlowUnitTestResponse2 = winterFlowDatabaseSchemaStructure4.WinterFlowUnitTestResponse(WinterFlowRendererJava.WinterFlowCompilerHandler);
                if (WinterFlowUnitTestResponse2 == null) {
                    WinterFlowUnitTestResponse2 = null;
                }
                Boolean bool2 = Boolean.TRUE;
                accessibilityNodeInfo3.setEditable(WinterFlowManagerRequest.WinterFlowThreadListener(WinterFlowUnitTestResponse2, bool2));
                WinterFlowUnitTestResponse3 = winterFlowDatabaseSchemaStructure4.WinterFlowUnitTestResponse(WinterFlowRendererJava.WinterFlowFrontendBackend);
                if (WinterFlowUnitTestResponse3 == null) {
                    WinterFlowUnitTestResponse3 = null;
                }
                Integer num = (Integer) WinterFlowUnitTestResponse3;
                accessibilityNodeInfo3.setMaxTextLength(num == null ? num.intValue() : -1);
                accessibilityNodeInfo3.setEnabled(WinterFlowTestingCloud.WinterFlowTransactionAgent(winterFlowProcessorSystem7));
                WinterFlowRendererOrchestration winterFlowRendererOrchestration3 = WinterFlowRendererJava.WinterFlowServerProtocol;
                accessibilityNodeInfo3.setFocusable(winterFlowDatabaseSchemaStructure4.WinterFlowCacheManagerAgent(winterFlowRendererOrchestration3));
                if (accessibilityNodeInfo3.isFocusable()) {
                    winterFlowBackendEventEmitter2 = winterFlowBackendEventEmitter;
                } else {
                    accessibilityNodeInfo3.setFocused(((Boolean) winterFlowDecoratorBackend.WinterFlowArrayNetwork(winterFlowRendererOrchestration3)).booleanValue());
                    if (!accessibilityNodeInfo3.isFocused()) {
                        winterFlowBackendEventEmitter2 = winterFlowBackendEventEmitter;
                        z = true;
                        accessibilityNodeInfo2.addAction(1);
                        accessibilityNodeInfo2.setVisibleToUser(WinterFlowEncryptionSubsystem.WinterFlowPackageIDE(winterFlowProcessorSystem7) ^ z);
                        if (winterFlowProcessorSystem7.WinterFlowServiceUtility()) {
                            winterFlowProcessorSystem2 = winterFlowProcessorSystem7.WinterFlowServerProtocol();
                            winterFlowProcessorSystem2.getClass();
                        } else {
                            winterFlowProcessorSystem2 = winterFlowProcessorSystem7;
                        }
                        WinterFlowThreadListener = winterFlowProcessorSystem2.WinterFlowThreadListener();
                        if ((WinterFlowThreadListener.WinterFlowRouterStructure >= WinterFlowThreadListener.WinterFlowCacheManagerAgent) || (WinterFlowThreadListener.WinterFlowHookDataSource >= WinterFlowThreadListener.WinterFlowArrayNetwork)) {
                            z2 = false;
                            accessibilityNodeInfo2.setVisibleToUser(false);
                        } else {
                            z2 = false;
                        }
                        WinterFlowResolverBackend.WinterFlowBatchUI(WinterFlowProviderRouter.WinterFlowServerProtocol(winterFlowDecoratorBackend, WinterFlowRendererJava.WinterFlowTransactionAgent));
                        accessibilityNodeInfo2.setClickable(z2);
                        winterFlowDecoratorStrategy = (WinterFlowDecoratorStrategy) WinterFlowProviderRouter.WinterFlowServerProtocol(winterFlowDecoratorBackend, WinterFlowCacheWorker.WinterFlowHookDataSource);
                        if (winterFlowDecoratorStrategy != null) {
                            WinterFlowManagerRequest.WinterFlowThreadListener(WinterFlowProviderRouter.WinterFlowServerProtocol(winterFlowDecoratorBackend, WinterFlowRendererJava.WinterFlowSoftwareProtocol), bool2);
                            accessibilityNodeInfo2.setClickable(true);
                            if (WinterFlowTestingCloud.WinterFlowTransactionAgent(winterFlowProcessorSystem7) && accessibilityNodeInfo3.isClickable()) {
                                winterFlowFrameworkDataSource2.WinterFlowRouterStructure(new WinterFlowStrategyUserManager(winterFlowDecoratorStrategy.WinterFlowRouterStructure, 16));
                            }
                        }
                        accessibilityNodeInfo2.setLongClickable(false);
                        winterFlowDecoratorStrategy2 = (WinterFlowDecoratorStrategy) WinterFlowProviderRouter.WinterFlowServerProtocol(winterFlowDecoratorBackend, WinterFlowCacheWorker.WinterFlowCacheManagerAgent);
                        if (winterFlowDecoratorStrategy2 != null) {
                            accessibilityNodeInfo2.setLongClickable(true);
                            if (WinterFlowTestingCloud.WinterFlowTransactionAgent(winterFlowProcessorSystem7)) {
                                winterFlowFrameworkDataSource2.WinterFlowRouterStructure(new WinterFlowStrategyUserManager(winterFlowDecoratorStrategy2.WinterFlowRouterStructure, 32));
                            }
                        }
                        winterFlowDecoratorStrategy3 = (WinterFlowDecoratorStrategy) WinterFlowProviderRouter.WinterFlowServerProtocol(winterFlowDecoratorBackend, WinterFlowCacheWorker.WinterFlowOrchestrationSubsystem);
                        if (winterFlowDecoratorStrategy3 != null) {
                            winterFlowFrameworkDataSource2.WinterFlowRouterStructure(new WinterFlowStrategyUserManager(winterFlowDecoratorStrategy3.WinterFlowRouterStructure, 16384));
                        }
                        if (WinterFlowTestingCloud.WinterFlowTransactionAgent(winterFlowProcessorSystem7)) {
                            WinterFlowDecoratorStrategy winterFlowDecoratorStrategy5 = (WinterFlowDecoratorStrategy) WinterFlowProviderRouter.WinterFlowServerProtocol(winterFlowDecoratorBackend, WinterFlowCacheWorker.WinterFlowTransactionAgent);
                            if (winterFlowDecoratorStrategy5 != null) {
                                winterFlowFrameworkDataSource2.WinterFlowRouterStructure(new WinterFlowStrategyUserManager(winterFlowDecoratorStrategy5.WinterFlowRouterStructure, 2097152));
                            }
                            WinterFlowDecoratorStrategy winterFlowDecoratorStrategy6 = (WinterFlowDecoratorStrategy) WinterFlowProviderRouter.WinterFlowServerProtocol(winterFlowDecoratorBackend, WinterFlowCacheWorker.WinterFlowBandwidthObject);
                            if (winterFlowDecoratorStrategy6 != null) {
                                winterFlowFrameworkDataSource2.WinterFlowRouterStructure(new WinterFlowStrategyUserManager(winterFlowDecoratorStrategy6.WinterFlowRouterStructure, R.id.accessibilityActionImeEnter));
                            }
                            WinterFlowDecoratorStrategy winterFlowDecoratorStrategy7 = (WinterFlowDecoratorStrategy) WinterFlowProviderRouter.WinterFlowServerProtocol(winterFlowDecoratorBackend, WinterFlowCacheWorker.WinterFlowConcurrencyThread);
                            if (winterFlowDecoratorStrategy7 != null) {
                                winterFlowFrameworkDataSource2.WinterFlowRouterStructure(new WinterFlowStrategyUserManager(winterFlowDecoratorStrategy7.WinterFlowRouterStructure, 65536));
                            }
                            WinterFlowDecoratorStrategy winterFlowDecoratorStrategy8 = (WinterFlowDecoratorStrategy) WinterFlowProviderRouter.WinterFlowServerProtocol(winterFlowDecoratorBackend, WinterFlowCacheWorker.WinterFlowSingletonPlatform);
                            if (winterFlowDecoratorStrategy8 != null && accessibilityNodeInfo3.isFocused()) {
                                WinterFlowViewProvider clipboardManager = winterFlowSyntaxTransactionManager.getClipboardManager();
                                ClipboardManager clipboardManager2 = clipboardManager.WinterFlowHookDataSource;
                                if (clipboardManager2 == null) {
                                    Object systemService = clipboardManager.WinterFlowRouterStructure.getSystemService("clipboard");
                                    systemService.getClass();
                                    clipboardManager2 = (ClipboardManager) systemService;
                                    clipboardManager.WinterFlowHookDataSource = clipboardManager2;
                                }
                                ClipDescription primaryClipDescription = clipboardManager2.getPrimaryClipDescription();
                                if (primaryClipDescription != null ? primaryClipDescription.hasMimeType("text/*") : false) {
                                    winterFlowFrameworkDataSource2.WinterFlowRouterStructure(new WinterFlowStrategyUserManager(winterFlowDecoratorStrategy8.WinterFlowRouterStructure, 32768));
                                }
                            }
                        }
                        WinterFlowThreadListener2 = WinterFlowBackendEventEmitter.WinterFlowThreadListener(winterFlowProcessorSystem7);
                        if (WinterFlowThreadListener2 != null && WinterFlowThreadListener2.length() != 0) {
                            accessibilityNodeInfo3.setTextSelection(winterFlowBackendEventEmitter2.WinterFlowTransactionAgent(winterFlowProcessorSystem7), winterFlowBackendEventEmitter2.WinterFlowResponseEngine(winterFlowProcessorSystem7));
                            WinterFlowDecoratorStrategy winterFlowDecoratorStrategy9 = (WinterFlowDecoratorStrategy) WinterFlowProviderRouter.WinterFlowServerProtocol(winterFlowDecoratorBackend, WinterFlowCacheWorker.WinterFlowResponseEngine);
                            winterFlowFrameworkDataSource2.WinterFlowRouterStructure(new WinterFlowStrategyUserManager(winterFlowDecoratorStrategy9 == null ? winterFlowDecoratorStrategy9.WinterFlowRouterStructure : null, 131072));
                            accessibilityNodeInfo2.addAction(256);
                            accessibilityNodeInfo2.addAction(512);
                            accessibilityNodeInfo2.setMovementGranularities(11);
                            list = (List) WinterFlowProviderRouter.WinterFlowServerProtocol(winterFlowDecoratorBackend, WinterFlowRendererJava.WinterFlowRouterStructure);
                            if ((list != null || list.isEmpty()) && winterFlowDatabaseSchemaStructure4.WinterFlowCacheManagerAgent(WinterFlowCacheWorker.WinterFlowRouterStructure) && (!winterFlowDatabaseSchemaStructure4.WinterFlowCacheManagerAgent(WinterFlowRendererJava.WinterFlowCacheManagerListener) || WinterFlowManagerRequest.WinterFlowThreadListener(WinterFlowProviderRouter.WinterFlowServerProtocol(winterFlowDecoratorBackend, winterFlowRendererOrchestration3), bool2))) {
                                WinterFlowVariableBandwidth = winterFlowSchedulerStructure.WinterFlowVariableBandwidth();
                                while (true) {
                                    if (WinterFlowVariableBandwidth == null) {
                                        WinterFlowVariableBandwidth = null;
                                        break;
                                    }
                                    WinterFlowDecoratorBackend WinterFlowSerializerStructure = WinterFlowVariableBandwidth.WinterFlowSerializerStructure();
                                    if (WinterFlowSerializerStructure != null && WinterFlowSerializerStructure.WinterFlowUnitTestResponse) {
                                        if (WinterFlowSerializerStructure.WinterFlowVariableVersionControl.WinterFlowCacheManagerAgent(WinterFlowRendererJava.WinterFlowCacheManagerListener)) {
                                            break;
                                        }
                                    }
                                    WinterFlowVariableBandwidth = WinterFlowVariableBandwidth.WinterFlowVariableBandwidth();
                                }
                                if (WinterFlowVariableBandwidth != null) {
                                    WinterFlowDecoratorBackend WinterFlowSerializerStructure2 = WinterFlowVariableBandwidth.WinterFlowSerializerStructure();
                                    if (WinterFlowSerializerStructure2 != null) {
                                        Object WinterFlowUnitTestResponse16 = WinterFlowSerializerStructure2.WinterFlowVariableVersionControl.WinterFlowUnitTestResponse(winterFlowRendererOrchestration3);
                                        if (WinterFlowUnitTestResponse16 == null) {
                                            WinterFlowUnitTestResponse16 = null;
                                        }
                                        z3 = WinterFlowManagerRequest.WinterFlowThreadListener(WinterFlowUnitTestResponse16, bool2);
                                    } else {
                                        z3 = false;
                                    }
                                }
                                accessibilityNodeInfo2.setMovementGranularities(accessibilityNodeInfo3.getMovementGranularities() | 20);
                            }
                        }
                        arrayList = new ArrayList();
                        arrayList.add("androidx.compose.ui.semantics.id");
                        WinterFlowVariableVersionControl = winterFlowFrameworkDataSource2.WinterFlowVariableVersionControl();
                        if (WinterFlowVariableVersionControl != null && WinterFlowVariableVersionControl.length() != 0 && winterFlowDatabaseSchemaStructure4.WinterFlowCacheManagerAgent(WinterFlowCacheWorker.WinterFlowRouterStructure)) {
                            arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                        }
                        if (winterFlowDatabaseSchemaStructure4.WinterFlowCacheManagerAgent(WinterFlowRendererJava.WinterFlowBackendCacheManager)) {
                            arrayList.add("androidx.compose.ui.semantics.testTag");
                        }
                        if (winterFlowDatabaseSchemaStructure4.WinterFlowCacheManagerAgent(WinterFlowRendererJava.WinterFlowCloudMicroservice)) {
                            arrayList.add("androidx.compose.ui.semantics.shapeType");
                            arrayList.add("androidx.compose.ui.semantics.shapeRect");
                            arrayList.add("androidx.compose.ui.semantics.shapeCorners");
                            arrayList.add("androidx.compose.ui.semantics.shapeRegion");
                        }
                        accessibilityNodeInfo3.setAvailableExtraData(arrayList);
                        winterFlowRendererGateway = (WinterFlowRendererGateway) WinterFlowProviderRouter.WinterFlowServerProtocol(winterFlowDecoratorBackend, WinterFlowRendererJava.WinterFlowCacheManagerAgent);
                        if (winterFlowRendererGateway != null) {
                            float f = winterFlowRendererGateway.WinterFlowRouterStructure;
                            WinterFlowArrayStructure winterFlowArrayStructure = winterFlowRendererGateway.WinterFlowHookDataSource;
                            float f2 = winterFlowArrayStructure.WinterFlowRouterStructure;
                            float f3 = winterFlowArrayStructure.WinterFlowHookDataSource;
                            WinterFlowRendererOrchestration winterFlowRendererOrchestration4 = WinterFlowCacheWorker.WinterFlowSyntax;
                            if (winterFlowDatabaseSchemaStructure4.WinterFlowCacheManagerAgent(winterFlowRendererOrchestration4)) {
                                winterFlowFrameworkDataSource2.WinterFlowUnitTestResponse("android.widget.SeekBar");
                            } else {
                                winterFlowFrameworkDataSource2.WinterFlowUnitTestResponse("android.widget.ProgressBar");
                            }
                            if (winterFlowRendererGateway != WinterFlowRendererGateway.WinterFlowCacheManagerAgent) {
                                accessibilityNodeInfo3.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, f2, f3, f));
                            }
                            if (winterFlowDatabaseSchemaStructure4.WinterFlowCacheManagerAgent(winterFlowRendererOrchestration4) && WinterFlowTestingCloud.WinterFlowTransactionAgent(winterFlowProcessorSystem7)) {
                                if (f < (f3 < f2 ? f2 : f3)) {
                                    winterFlowFrameworkDataSource2.WinterFlowRouterStructure(WinterFlowStrategyUserManager.WinterFlowVariableVersionControl);
                                }
                                if (f2 > f3) {
                                    f2 = f3;
                                }
                                if (f > f2) {
                                    winterFlowFrameworkDataSource2.WinterFlowRouterStructure(WinterFlowStrategyUserManager.WinterFlowTransactionManagerStrategy);
                                }
                            }
                        }
                        if (WinterFlowTestingCloud.WinterFlowTransactionAgent(winterFlowProcessorSystem7) && (winterFlowDecoratorStrategy4 = (WinterFlowDecoratorStrategy) WinterFlowProviderRouter.WinterFlowServerProtocol(winterFlowDecoratorBackend, WinterFlowCacheWorker.WinterFlowSyntax)) != null) {
                            winterFlowFrameworkDataSource2.WinterFlowRouterStructure(new WinterFlowStrategyUserManager(winterFlowDecoratorStrategy4.WinterFlowRouterStructure, R.id.accessibilityActionSetProgress));
                        }
                        WinterFlowUnitTestResponse4 = winterFlowProcessorSystem7.WinterFlowTransactionAgent().WinterFlowVariableVersionControl.WinterFlowUnitTestResponse(WinterFlowRendererJava.WinterFlowTransactionManagerStrategy);
                        if (WinterFlowUnitTestResponse4 == null) {
                            WinterFlowUnitTestResponse4 = null;
                        }
                        winterFlowDebugResponse = (WinterFlowDebugResponse) WinterFlowUnitTestResponse4;
                        if (winterFlowDebugResponse != null) {
                            accessibilityNodeInfo2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(winterFlowDebugResponse.WinterFlowRouterStructure, winterFlowDebugResponse.WinterFlowHookDataSource, false, 0));
                        } else {
                            ArrayList arrayList6 = new ArrayList();
                            Object WinterFlowUnitTestResponse17 = winterFlowProcessorSystem7.WinterFlowTransactionAgent().WinterFlowVariableVersionControl.WinterFlowUnitTestResponse(WinterFlowRendererJava.WinterFlowVariableVersionControl);
                            if (WinterFlowUnitTestResponse17 == null) {
                                WinterFlowUnitTestResponse17 = null;
                            }
                            if (WinterFlowUnitTestResponse17 != null) {
                                List WinterFlowResponseEngine3 = WinterFlowProcessorSystem.WinterFlowResponseEngine(4, winterFlowProcessorSystem7);
                                int size9 = WinterFlowResponseEngine3.size();
                                for (int i31 = 0; i31 < size9; i31++) {
                                    WinterFlowProcessorSystem winterFlowProcessorSystem9 = (WinterFlowProcessorSystem) WinterFlowResponseEngine3.get(i31);
                                    if (winterFlowProcessorSystem9.WinterFlowTransactionAgent().WinterFlowVariableVersionControl.WinterFlowCacheManagerAgent(WinterFlowRendererJava.WinterFlowSoftwareProtocol)) {
                                        arrayList6.add(winterFlowProcessorSystem9);
                                    }
                                }
                            }
                            if (!arrayList6.isEmpty()) {
                                boolean WinterFlowTransactionManagerStrategy = WinterFlowTestingCloud.WinterFlowTransactionManagerStrategy(arrayList6);
                                accessibilityNodeInfo2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(WinterFlowTransactionManagerStrategy ? 1 : arrayList6.size(), WinterFlowTransactionManagerStrategy ? arrayList6.size() : 1, false, 0));
                            }
                        }
                        WinterFlowTestingCloud.WinterFlowSoftwareProtocol(winterFlowFrameworkDataSource2, winterFlowProcessorSystem7);
                        winterFlowExceptionPlatform = (WinterFlowExceptionPlatform) WinterFlowProviderRouter.WinterFlowServerProtocol(winterFlowDecoratorBackend, WinterFlowRendererJava.WinterFlowSerializerStructure);
                        WinterFlowDecoratorStrategy winterFlowDecoratorStrategy10 = (WinterFlowDecoratorStrategy) WinterFlowProviderRouter.WinterFlowServerProtocol(winterFlowDecoratorBackend, WinterFlowCacheWorker.WinterFlowArrayNetwork);
                        if (winterFlowExceptionPlatform != null && winterFlowDecoratorStrategy10 != null) {
                            WinterFlowUnitTestResponse6 = winterFlowProcessorSystem7.WinterFlowTransactionAgent().WinterFlowVariableVersionControl.WinterFlowUnitTestResponse(WinterFlowRendererJava.WinterFlowTransactionManagerStrategy);
                            if (WinterFlowUnitTestResponse6 == null) {
                                WinterFlowUnitTestResponse6 = null;
                            }
                            if (WinterFlowUnitTestResponse6 == null) {
                                Object WinterFlowUnitTestResponse18 = winterFlowProcessorSystem7.WinterFlowTransactionAgent().WinterFlowVariableVersionControl.WinterFlowUnitTestResponse(WinterFlowRendererJava.WinterFlowVariableVersionControl);
                                if (WinterFlowUnitTestResponse18 == null) {
                                    WinterFlowUnitTestResponse18 = null;
                                }
                                if (WinterFlowUnitTestResponse18 == null) {
                                    winterFlowFrameworkDataSource2.WinterFlowUnitTestResponse("android.widget.HorizontalScrollView");
                                }
                            }
                            if (((Number) winterFlowExceptionPlatform.WinterFlowHookDataSource.WinterFlowRouterStructure()).floatValue() > 0.0f) {
                                accessibilityNodeInfo2.setScrollable(true);
                            }
                            if (WinterFlowTestingCloud.WinterFlowTransactionAgent(winterFlowProcessorSystem7)) {
                                boolean WinterFlowVariableBandwidth2 = WinterFlowBackendEventEmitter.WinterFlowVariableBandwidth(winterFlowExceptionPlatform);
                                WinterFlowCacheManagerConfiguration winterFlowCacheManagerConfiguration = WinterFlowCacheManagerConfiguration.WinterFlowTransactionManagerStrategy;
                                if (WinterFlowVariableBandwidth2) {
                                    winterFlowFrameworkDataSource2.WinterFlowRouterStructure(WinterFlowStrategyUserManager.WinterFlowVariableVersionControl);
                                    winterFlowSchedulerStructure2 = winterFlowSchedulerStructure;
                                    winterFlowFrameworkDataSource2.WinterFlowRouterStructure(winterFlowSchedulerStructure2.WinterFlowCompilerVariable == winterFlowCacheManagerConfiguration ? WinterFlowStrategyUserManager.WinterFlowRouterRouter : WinterFlowStrategyUserManager.WinterFlowResponseEngine);
                                } else {
                                    winterFlowSchedulerStructure2 = winterFlowSchedulerStructure;
                                }
                                if (WinterFlowBackendEventEmitter.WinterFlowSingletonPlatform(winterFlowExceptionPlatform)) {
                                    winterFlowFrameworkDataSource2.WinterFlowRouterStructure(WinterFlowStrategyUserManager.WinterFlowTransactionManagerStrategy);
                                    winterFlowFrameworkDataSource2.WinterFlowRouterStructure(winterFlowSchedulerStructure2.WinterFlowCompilerVariable == winterFlowCacheManagerConfiguration ? WinterFlowStrategyUserManager.WinterFlowResponseEngine : WinterFlowStrategyUserManager.WinterFlowRouterRouter);
                                }
                            }
                        }
                        winterFlowExceptionPlatform2 = (WinterFlowExceptionPlatform) WinterFlowProviderRouter.WinterFlowServerProtocol(winterFlowDecoratorBackend, WinterFlowRendererJava.WinterFlowMapperProtocol);
                        if (winterFlowExceptionPlatform2 != null && winterFlowDecoratorStrategy10 != null) {
                            WinterFlowUnitTestResponse5 = winterFlowProcessorSystem7.WinterFlowTransactionAgent().WinterFlowVariableVersionControl.WinterFlowUnitTestResponse(WinterFlowRendererJava.WinterFlowTransactionManagerStrategy);
                            if (WinterFlowUnitTestResponse5 == null) {
                                WinterFlowUnitTestResponse5 = null;
                            }
                            if (WinterFlowUnitTestResponse5 == null) {
                                Object WinterFlowUnitTestResponse19 = winterFlowProcessorSystem7.WinterFlowTransactionAgent().WinterFlowVariableVersionControl.WinterFlowUnitTestResponse(WinterFlowRendererJava.WinterFlowVariableVersionControl);
                                if (WinterFlowUnitTestResponse19 == null) {
                                    WinterFlowUnitTestResponse19 = null;
                                }
                                if (WinterFlowUnitTestResponse19 == null) {
                                    winterFlowFrameworkDataSource2.WinterFlowUnitTestResponse("android.widget.ScrollView");
                                }
                            }
                            if (((Number) winterFlowExceptionPlatform2.WinterFlowHookDataSource.WinterFlowRouterStructure()).floatValue() > 0.0f) {
                                accessibilityNodeInfo2.setScrollable(true);
                            }
                            if (WinterFlowTestingCloud.WinterFlowTransactionAgent(winterFlowProcessorSystem7)) {
                                if (WinterFlowBackendEventEmitter.WinterFlowVariableBandwidth(winterFlowExceptionPlatform2)) {
                                    winterFlowFrameworkDataSource2.WinterFlowRouterStructure(WinterFlowStrategyUserManager.WinterFlowVariableVersionControl);
                                    winterFlowFrameworkDataSource2.WinterFlowRouterStructure(WinterFlowStrategyUserManager.WinterFlowSyntax);
                                }
                                if (WinterFlowBackendEventEmitter.WinterFlowSingletonPlatform(winterFlowExceptionPlatform2)) {
                                    winterFlowFrameworkDataSource2.WinterFlowRouterStructure(WinterFlowStrategyUserManager.WinterFlowTransactionManagerStrategy);
                                    winterFlowFrameworkDataSource2.WinterFlowRouterStructure(WinterFlowStrategyUserManager.WinterFlowUnitTestResponse);
                                }
                            }
                        }
                        i3 = Build.VERSION.SDK_INT;
                        if (i3 >= 29) {
                            WinterFlowCloudStack.WinterFlowVariableVersionControl(winterFlowFrameworkDataSource2, winterFlowProcessorSystem7);
                        }
                        CharSequence charSequence = (CharSequence) WinterFlowProviderRouter.WinterFlowServerProtocol(winterFlowDecoratorBackend, WinterFlowRendererJava.WinterFlowArrayNetwork);
                        if (i3 >= 28) {
                            accessibilityNodeInfo2.setPaneTitle(charSequence);
                        } else {
                            accessibilityNodeInfo2.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
                        }
                        if (WinterFlowTestingCloud.WinterFlowTransactionAgent(winterFlowProcessorSystem7)) {
                            WinterFlowDecoratorStrategy winterFlowDecoratorStrategy11 = (WinterFlowDecoratorStrategy) WinterFlowProviderRouter.WinterFlowServerProtocol(winterFlowDecoratorBackend, WinterFlowCacheWorker.WinterFlowVariableBandwidth);
                            if (winterFlowDecoratorStrategy11 != null) {
                                winterFlowFrameworkDataSource2.WinterFlowRouterStructure(new WinterFlowStrategyUserManager(winterFlowDecoratorStrategy11.WinterFlowRouterStructure, 262144));
                            }
                            WinterFlowDecoratorStrategy winterFlowDecoratorStrategy12 = (WinterFlowDecoratorStrategy) WinterFlowProviderRouter.WinterFlowServerProtocol(winterFlowDecoratorBackend, WinterFlowCacheWorker.WinterFlowBatchUI);
                            if (winterFlowDecoratorStrategy12 != null) {
                                winterFlowFrameworkDataSource2.WinterFlowRouterStructure(new WinterFlowStrategyUserManager(winterFlowDecoratorStrategy12.WinterFlowRouterStructure, 524288));
                            }
                            WinterFlowDecoratorStrategy winterFlowDecoratorStrategy13 = (WinterFlowDecoratorStrategy) WinterFlowProviderRouter.WinterFlowServerProtocol(winterFlowDecoratorBackend, WinterFlowCacheWorker.WinterFlowRouterAdapter);
                            if (winterFlowDecoratorStrategy13 != null) {
                                winterFlowFrameworkDataSource2.WinterFlowRouterStructure(new WinterFlowStrategyUserManager(winterFlowDecoratorStrategy13.WinterFlowRouterStructure, 1048576));
                            }
                            WinterFlowRendererOrchestration winterFlowRendererOrchestration5 = WinterFlowCacheWorker.WinterFlowMapperProtocol;
                            if (winterFlowDatabaseSchemaStructure4.WinterFlowCacheManagerAgent(winterFlowRendererOrchestration5)) {
                                List list5 = (List) winterFlowDecoratorBackend.WinterFlowArrayNetwork(winterFlowRendererOrchestration5);
                                int size10 = list5.size();
                                WinterFlowTransactionStructure winterFlowTransactionStructure = WinterFlowBackendEventEmitter.WinterFlowCacheTool;
                                if (size10 >= winterFlowTransactionStructure.WinterFlowHookDataSource) {
                                    throw new IllegalStateException("Can't have more than " + winterFlowTransactionStructure.WinterFlowHookDataSource + " custom actions for one widget");
                                }
                                WinterFlowRequestListener winterFlowRequestListener3 = new WinterFlowRequestListener();
                                WinterFlowLibraryCache WinterFlowRouterStructure = WinterFlowProtocolSoftware.WinterFlowRouterStructure();
                                WinterFlowRequestListener winterFlowRequestListener4 = winterFlowRequestListener;
                                if (winterFlowRequestListener4.WinterFlowVariableVersionControl) {
                                    WinterFlowCloudStack.WinterFlowSerializerStructure(winterFlowRequestListener4);
                                }
                                if (WinterFlowHandlerWebsocket.WinterFlowSyntax(winterFlowRequestListener4.WinterFlowTransactionManagerStrategy, winterFlowRequestListener4.WinterFlowRouterRouter, i2) >= 0) {
                                    WinterFlowLibraryCache winterFlowLibraryCache = (WinterFlowLibraryCache) WinterFlowCloudStack.WinterFlowThreadListener(winterFlowRequestListener4, i2);
                                    int[] iArr = winterFlowTransactionStructure.WinterFlowRouterStructure;
                                    int i32 = winterFlowTransactionStructure.WinterFlowHookDataSource;
                                    int[] iArr2 = new int[16];
                                    int i33 = 0;
                                    int i34 = 0;
                                    while (i33 < i32) {
                                        int i35 = iArr[i33];
                                        int i36 = i32;
                                        int i37 = i34 + 1;
                                        int i38 = i33;
                                        if (iArr2.length < i37) {
                                            iArr2 = Arrays.copyOf(iArr2, Math.max(i37, (iArr2.length * 3) / 2));
                                        }
                                        iArr2[i34] = i35;
                                        i33 = i38 + 1;
                                        i34 = i37;
                                        i32 = i36;
                                    }
                                    ArrayList arrayList7 = new ArrayList();
                                    if (list5.size() > 0) {
                                        WinterFlowResolverBackend.WinterFlowBatchUI(list5.get(0));
                                        winterFlowLibraryCache.getClass();
                                        throw null;
                                    }
                                    if (arrayList7.size() > 0) {
                                        WinterFlowResolverBackend.WinterFlowBatchUI(arrayList7.get(0));
                                        if (i34 <= 0) {
                                            WinterFlowCompilerMechanism.WinterFlowTransactionAgent("Index must be between 0 and size");
                                            return null;
                                        }
                                        int i39 = iArr2[0];
                                        throw null;
                                    }
                                } else if (list5.size() > 0) {
                                    WinterFlowResolverBackend.WinterFlowBatchUI(list5.get(0));
                                    winterFlowTransactionStructure.WinterFlowHookDataSource(0);
                                    throw null;
                                }
                                winterFlowBackendEventEmitter2.WinterFlowSerializerStructure.WinterFlowCacheManagerAgent(i2, winterFlowRequestListener3);
                                winterFlowRequestListener4.WinterFlowCacheManagerAgent(i2, WinterFlowRouterStructure);
                            }
                        }
                        boolean WinterFlowBackendCacheManager = WinterFlowTestingCloud.WinterFlowBackendCacheManager(winterFlowProcessorSystem7, resources);
                        if (Build.VERSION.SDK_INT >= 28) {
                            accessibilityNodeInfo2.setScreenReaderFocusable(WinterFlowBackendCacheManager);
                        } else {
                            winterFlowFrameworkDataSource2.WinterFlowTransactionManagerStrategy(1, WinterFlowBackendCacheManager);
                        }
                        WinterFlowArrayNetwork = winterFlowBackendEventEmitter2.WinterFlowCacheManagerListener.WinterFlowArrayNetwork(i2);
                        if (WinterFlowArrayNetwork != -1) {
                            WinterFlowRouterLayer WinterFlowResponseEngine4 = WinterFlowDecoratorRouter.WinterFlowResponseEngine(winterFlowSyntaxTransactionManager.getAndroidViewsHandler$ui(), WinterFlowArrayNetwork);
                            if (WinterFlowResponseEngine4 != null) {
                                accessibilityNodeInfo2.setTraversalBefore(WinterFlowResponseEngine4);
                                winterFlowSyntaxTransactionManager2 = winterFlowSyntaxTransactionManager;
                            } else {
                                winterFlowSyntaxTransactionManager2 = winterFlowSyntaxTransactionManager;
                                accessibilityNodeInfo2.setTraversalBefore(winterFlowSyntaxTransactionManager2, WinterFlowArrayNetwork);
                            }
                            bundle = null;
                            winterFlowBackendEventEmitter2.WinterFlowCacheManagerAgent(i2, winterFlowFrameworkDataSource2, winterFlowBackendEventEmitter2.WinterFlowSoftwareProtocol, null);
                        } else {
                            bundle = null;
                            winterFlowSyntaxTransactionManager2 = winterFlowSyntaxTransactionManager;
                        }
                        WinterFlowArrayNetwork2 = winterFlowBackendEventEmitter2.WinterFlowPackageIDE.WinterFlowArrayNetwork(i2);
                        if (WinterFlowArrayNetwork2 != -1 && (WinterFlowResponseEngine = WinterFlowDecoratorRouter.WinterFlowResponseEngine(winterFlowSyntaxTransactionManager2.getAndroidViewsHandler$ui(), WinterFlowArrayNetwork2)) != null) {
                            accessibilityNodeInfo2.setTraversalAfter(WinterFlowResponseEngine);
                            winterFlowBackendEventEmitter2.WinterFlowCacheManagerAgent(i2, winterFlowFrameworkDataSource2, winterFlowBackendEventEmitter2.WinterFlowUserManagerUserManager, bundle);
                        }
                        str = (String) WinterFlowProviderRouter.WinterFlowServerProtocol(winterFlowDecoratorBackend, WinterFlowSyntaxSession.WinterFlowHookDataSource);
                        if (str != null) {
                            winterFlowFrameworkDataSource2.WinterFlowUnitTestResponse(str);
                        }
                        winterFlowFrameworkDataSource3 = winterFlowFrameworkDataSource2;
                        if (winterFlowBackendEventEmitter2.WinterFlowVariableBandwidth) {
                        }
                        return winterFlowFrameworkDataSource3;
                    }
                    accessibilityNodeInfo2.addAction(2);
                    winterFlowBackendEventEmitter2 = winterFlowBackendEventEmitter;
                    winterFlowBackendEventEmitter2.WinterFlowOrchestrationSubsystem = i2;
                }
                z = true;
                accessibilityNodeInfo2.setVisibleToUser(WinterFlowEncryptionSubsystem.WinterFlowPackageIDE(winterFlowProcessorSystem7) ^ z);
                if (winterFlowProcessorSystem7.WinterFlowServiceUtility()) {
                }
                WinterFlowThreadListener = winterFlowProcessorSystem2.WinterFlowThreadListener();
                if ((WinterFlowThreadListener.WinterFlowRouterStructure >= WinterFlowThreadListener.WinterFlowCacheManagerAgent) | (WinterFlowThreadListener.WinterFlowHookDataSource >= WinterFlowThreadListener.WinterFlowArrayNetwork)) {
                }
                WinterFlowResolverBackend.WinterFlowBatchUI(WinterFlowProviderRouter.WinterFlowServerProtocol(winterFlowDecoratorBackend, WinterFlowRendererJava.WinterFlowTransactionAgent));
                accessibilityNodeInfo2.setClickable(z2);
                winterFlowDecoratorStrategy = (WinterFlowDecoratorStrategy) WinterFlowProviderRouter.WinterFlowServerProtocol(winterFlowDecoratorBackend, WinterFlowCacheWorker.WinterFlowHookDataSource);
                if (winterFlowDecoratorStrategy != null) {
                }
                accessibilityNodeInfo2.setLongClickable(false);
                winterFlowDecoratorStrategy2 = (WinterFlowDecoratorStrategy) WinterFlowProviderRouter.WinterFlowServerProtocol(winterFlowDecoratorBackend, WinterFlowCacheWorker.WinterFlowCacheManagerAgent);
                if (winterFlowDecoratorStrategy2 != null) {
                }
                winterFlowDecoratorStrategy3 = (WinterFlowDecoratorStrategy) WinterFlowProviderRouter.WinterFlowServerProtocol(winterFlowDecoratorBackend, WinterFlowCacheWorker.WinterFlowOrchestrationSubsystem);
                if (winterFlowDecoratorStrategy3 != null) {
                }
                if (WinterFlowTestingCloud.WinterFlowTransactionAgent(winterFlowProcessorSystem7)) {
                }
                WinterFlowThreadListener2 = WinterFlowBackendEventEmitter.WinterFlowThreadListener(winterFlowProcessorSystem7);
                if (WinterFlowThreadListener2 != null) {
                    accessibilityNodeInfo3.setTextSelection(winterFlowBackendEventEmitter2.WinterFlowTransactionAgent(winterFlowProcessorSystem7), winterFlowBackendEventEmitter2.WinterFlowResponseEngine(winterFlowProcessorSystem7));
                    WinterFlowDecoratorStrategy winterFlowDecoratorStrategy92 = (WinterFlowDecoratorStrategy) WinterFlowProviderRouter.WinterFlowServerProtocol(winterFlowDecoratorBackend, WinterFlowCacheWorker.WinterFlowResponseEngine);
                    winterFlowFrameworkDataSource2.WinterFlowRouterStructure(new WinterFlowStrategyUserManager(winterFlowDecoratorStrategy92 == null ? winterFlowDecoratorStrategy92.WinterFlowRouterStructure : null, 131072));
                    accessibilityNodeInfo2.addAction(256);
                    accessibilityNodeInfo2.addAction(512);
                    accessibilityNodeInfo2.setMovementGranularities(11);
                    list = (List) WinterFlowProviderRouter.WinterFlowServerProtocol(winterFlowDecoratorBackend, WinterFlowRendererJava.WinterFlowRouterStructure);
                    if (list != null) {
                    }
                    WinterFlowVariableBandwidth = winterFlowSchedulerStructure.WinterFlowVariableBandwidth();
                    while (true) {
                        if (WinterFlowVariableBandwidth == null) {
                        }
                        WinterFlowVariableBandwidth = WinterFlowVariableBandwidth.WinterFlowVariableBandwidth();
                    }
                    if (WinterFlowVariableBandwidth != null) {
                    }
                    accessibilityNodeInfo2.setMovementGranularities(accessibilityNodeInfo3.getMovementGranularities() | 20);
                }
                arrayList = new ArrayList();
                arrayList.add("androidx.compose.ui.semantics.id");
                WinterFlowVariableVersionControl = winterFlowFrameworkDataSource2.WinterFlowVariableVersionControl();
                if (WinterFlowVariableVersionControl != null) {
                    arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                }
                if (winterFlowDatabaseSchemaStructure4.WinterFlowCacheManagerAgent(WinterFlowRendererJava.WinterFlowBackendCacheManager)) {
                }
                if (winterFlowDatabaseSchemaStructure4.WinterFlowCacheManagerAgent(WinterFlowRendererJava.WinterFlowCloudMicroservice)) {
                }
                accessibilityNodeInfo3.setAvailableExtraData(arrayList);
                winterFlowRendererGateway = (WinterFlowRendererGateway) WinterFlowProviderRouter.WinterFlowServerProtocol(winterFlowDecoratorBackend, WinterFlowRendererJava.WinterFlowCacheManagerAgent);
                if (winterFlowRendererGateway != null) {
                }
                if (WinterFlowTestingCloud.WinterFlowTransactionAgent(winterFlowProcessorSystem7)) {
                    winterFlowFrameworkDataSource2.WinterFlowRouterStructure(new WinterFlowStrategyUserManager(winterFlowDecoratorStrategy4.WinterFlowRouterStructure, R.id.accessibilityActionSetProgress));
                }
                WinterFlowUnitTestResponse4 = winterFlowProcessorSystem7.WinterFlowTransactionAgent().WinterFlowVariableVersionControl.WinterFlowUnitTestResponse(WinterFlowRendererJava.WinterFlowTransactionManagerStrategy);
                if (WinterFlowUnitTestResponse4 == null) {
                }
                winterFlowDebugResponse = (WinterFlowDebugResponse) WinterFlowUnitTestResponse4;
                if (winterFlowDebugResponse != null) {
                }
                WinterFlowTestingCloud.WinterFlowSoftwareProtocol(winterFlowFrameworkDataSource2, winterFlowProcessorSystem7);
                winterFlowExceptionPlatform = (WinterFlowExceptionPlatform) WinterFlowProviderRouter.WinterFlowServerProtocol(winterFlowDecoratorBackend, WinterFlowRendererJava.WinterFlowSerializerStructure);
                WinterFlowDecoratorStrategy winterFlowDecoratorStrategy102 = (WinterFlowDecoratorStrategy) WinterFlowProviderRouter.WinterFlowServerProtocol(winterFlowDecoratorBackend, WinterFlowCacheWorker.WinterFlowArrayNetwork);
                if (winterFlowExceptionPlatform != null) {
                    WinterFlowUnitTestResponse6 = winterFlowProcessorSystem7.WinterFlowTransactionAgent().WinterFlowVariableVersionControl.WinterFlowUnitTestResponse(WinterFlowRendererJava.WinterFlowTransactionManagerStrategy);
                    if (WinterFlowUnitTestResponse6 == null) {
                    }
                    if (WinterFlowUnitTestResponse6 == null) {
                    }
                    if (((Number) winterFlowExceptionPlatform.WinterFlowHookDataSource.WinterFlowRouterStructure()).floatValue() > 0.0f) {
                    }
                    if (WinterFlowTestingCloud.WinterFlowTransactionAgent(winterFlowProcessorSystem7)) {
                    }
                }
                winterFlowExceptionPlatform2 = (WinterFlowExceptionPlatform) WinterFlowProviderRouter.WinterFlowServerProtocol(winterFlowDecoratorBackend, WinterFlowRendererJava.WinterFlowMapperProtocol);
                if (winterFlowExceptionPlatform2 != null) {
                    WinterFlowUnitTestResponse5 = winterFlowProcessorSystem7.WinterFlowTransactionAgent().WinterFlowVariableVersionControl.WinterFlowUnitTestResponse(WinterFlowRendererJava.WinterFlowTransactionManagerStrategy);
                    if (WinterFlowUnitTestResponse5 == null) {
                    }
                    if (WinterFlowUnitTestResponse5 == null) {
                    }
                    if (((Number) winterFlowExceptionPlatform2.WinterFlowHookDataSource.WinterFlowRouterStructure()).floatValue() > 0.0f) {
                    }
                    if (WinterFlowTestingCloud.WinterFlowTransactionAgent(winterFlowProcessorSystem7)) {
                    }
                }
                i3 = Build.VERSION.SDK_INT;
                if (i3 >= 29) {
                }
                CharSequence charSequence2 = (CharSequence) WinterFlowProviderRouter.WinterFlowServerProtocol(winterFlowDecoratorBackend, WinterFlowRendererJava.WinterFlowArrayNetwork);
                if (i3 >= 28) {
                }
                if (WinterFlowTestingCloud.WinterFlowTransactionAgent(winterFlowProcessorSystem7)) {
                }
                boolean WinterFlowBackendCacheManager2 = WinterFlowTestingCloud.WinterFlowBackendCacheManager(winterFlowProcessorSystem7, resources);
                if (Build.VERSION.SDK_INT >= 28) {
                }
                WinterFlowArrayNetwork = winterFlowBackendEventEmitter2.WinterFlowCacheManagerListener.WinterFlowArrayNetwork(i2);
                if (WinterFlowArrayNetwork != -1) {
                }
                WinterFlowArrayNetwork2 = winterFlowBackendEventEmitter2.WinterFlowPackageIDE.WinterFlowArrayNetwork(i2);
                if (WinterFlowArrayNetwork2 != -1) {
                    accessibilityNodeInfo2.setTraversalAfter(WinterFlowResponseEngine);
                    winterFlowBackendEventEmitter2.WinterFlowCacheManagerAgent(i2, winterFlowFrameworkDataSource2, winterFlowBackendEventEmitter2.WinterFlowUserManagerUserManager, bundle);
                }
                str = (String) WinterFlowProviderRouter.WinterFlowServerProtocol(winterFlowDecoratorBackend, WinterFlowSyntaxSession.WinterFlowHookDataSource);
                if (str != null) {
                }
                winterFlowFrameworkDataSource3 = winterFlowFrameworkDataSource2;
                if (winterFlowBackendEventEmitter2.WinterFlowVariableBandwidth) {
                }
                return winterFlowFrameworkDataSource3;
            }
            accessibilityNodeInfo2.setHeading(true);
        }
        winterFlowFrameworkDataSource2 = winterFlowFrameworkDataSource;
        WinterFlowUnitTestResponse = winterFlowDatabaseSchemaStructure4.WinterFlowUnitTestResponse(WinterFlowRendererJava.WinterFlowSyntax);
        if (WinterFlowUnitTestResponse == null) {
        }
        if (((WinterFlowAlgorithmSession) WinterFlowUnitTestResponse) != null) {
        }
        i2 = i;
        if (i2 != -1) {
        }
        accessibilityNodeInfo3.setPassword(winterFlowDatabaseSchemaStructure4.WinterFlowCacheManagerAgent(WinterFlowRendererJava.WinterFlowSoftwareEngine));
        WinterFlowUnitTestResponse2 = winterFlowDatabaseSchemaStructure4.WinterFlowUnitTestResponse(WinterFlowRendererJava.WinterFlowCompilerHandler);
        if (WinterFlowUnitTestResponse2 == null) {
        }
        Boolean bool22 = Boolean.TRUE;
        accessibilityNodeInfo3.setEditable(WinterFlowManagerRequest.WinterFlowThreadListener(WinterFlowUnitTestResponse2, bool22));
        WinterFlowUnitTestResponse3 = winterFlowDatabaseSchemaStructure4.WinterFlowUnitTestResponse(WinterFlowRendererJava.WinterFlowFrontendBackend);
        if (WinterFlowUnitTestResponse3 == null) {
        }
        Integer num2 = (Integer) WinterFlowUnitTestResponse3;
        accessibilityNodeInfo3.setMaxTextLength(num2 == null ? num2.intValue() : -1);
        accessibilityNodeInfo3.setEnabled(WinterFlowTestingCloud.WinterFlowTransactionAgent(winterFlowProcessorSystem7));
        WinterFlowRendererOrchestration winterFlowRendererOrchestration32 = WinterFlowRendererJava.WinterFlowServerProtocol;
        accessibilityNodeInfo3.setFocusable(winterFlowDatabaseSchemaStructure4.WinterFlowCacheManagerAgent(winterFlowRendererOrchestration32));
        if (accessibilityNodeInfo3.isFocusable()) {
        }
        z = true;
        accessibilityNodeInfo2.setVisibleToUser(WinterFlowEncryptionSubsystem.WinterFlowPackageIDE(winterFlowProcessorSystem7) ^ z);
        if (winterFlowProcessorSystem7.WinterFlowServiceUtility()) {
        }
        WinterFlowThreadListener = winterFlowProcessorSystem2.WinterFlowThreadListener();
        if ((WinterFlowThreadListener.WinterFlowRouterStructure >= WinterFlowThreadListener.WinterFlowCacheManagerAgent) | (WinterFlowThreadListener.WinterFlowHookDataSource >= WinterFlowThreadListener.WinterFlowArrayNetwork)) {
        }
        WinterFlowResolverBackend.WinterFlowBatchUI(WinterFlowProviderRouter.WinterFlowServerProtocol(winterFlowDecoratorBackend, WinterFlowRendererJava.WinterFlowTransactionAgent));
        accessibilityNodeInfo2.setClickable(z2);
        winterFlowDecoratorStrategy = (WinterFlowDecoratorStrategy) WinterFlowProviderRouter.WinterFlowServerProtocol(winterFlowDecoratorBackend, WinterFlowCacheWorker.WinterFlowHookDataSource);
        if (winterFlowDecoratorStrategy != null) {
        }
        accessibilityNodeInfo2.setLongClickable(false);
        winterFlowDecoratorStrategy2 = (WinterFlowDecoratorStrategy) WinterFlowProviderRouter.WinterFlowServerProtocol(winterFlowDecoratorBackend, WinterFlowCacheWorker.WinterFlowCacheManagerAgent);
        if (winterFlowDecoratorStrategy2 != null) {
        }
        winterFlowDecoratorStrategy3 = (WinterFlowDecoratorStrategy) WinterFlowProviderRouter.WinterFlowServerProtocol(winterFlowDecoratorBackend, WinterFlowCacheWorker.WinterFlowOrchestrationSubsystem);
        if (winterFlowDecoratorStrategy3 != null) {
        }
        if (WinterFlowTestingCloud.WinterFlowTransactionAgent(winterFlowProcessorSystem7)) {
        }
        WinterFlowThreadListener2 = WinterFlowBackendEventEmitter.WinterFlowThreadListener(winterFlowProcessorSystem7);
        if (WinterFlowThreadListener2 != null) {
        }
        arrayList = new ArrayList();
        arrayList.add("androidx.compose.ui.semantics.id");
        WinterFlowVariableVersionControl = winterFlowFrameworkDataSource2.WinterFlowVariableVersionControl();
        if (WinterFlowVariableVersionControl != null) {
        }
        if (winterFlowDatabaseSchemaStructure4.WinterFlowCacheManagerAgent(WinterFlowRendererJava.WinterFlowBackendCacheManager)) {
        }
        if (winterFlowDatabaseSchemaStructure4.WinterFlowCacheManagerAgent(WinterFlowRendererJava.WinterFlowCloudMicroservice)) {
        }
        accessibilityNodeInfo3.setAvailableExtraData(arrayList);
        winterFlowRendererGateway = (WinterFlowRendererGateway) WinterFlowProviderRouter.WinterFlowServerProtocol(winterFlowDecoratorBackend, WinterFlowRendererJava.WinterFlowCacheManagerAgent);
        if (winterFlowRendererGateway != null) {
        }
        if (WinterFlowTestingCloud.WinterFlowTransactionAgent(winterFlowProcessorSystem7)) {
        }
        WinterFlowUnitTestResponse4 = winterFlowProcessorSystem7.WinterFlowTransactionAgent().WinterFlowVariableVersionControl.WinterFlowUnitTestResponse(WinterFlowRendererJava.WinterFlowTransactionManagerStrategy);
        if (WinterFlowUnitTestResponse4 == null) {
        }
        winterFlowDebugResponse = (WinterFlowDebugResponse) WinterFlowUnitTestResponse4;
        if (winterFlowDebugResponse != null) {
        }
        WinterFlowTestingCloud.WinterFlowSoftwareProtocol(winterFlowFrameworkDataSource2, winterFlowProcessorSystem7);
        winterFlowExceptionPlatform = (WinterFlowExceptionPlatform) WinterFlowProviderRouter.WinterFlowServerProtocol(winterFlowDecoratorBackend, WinterFlowRendererJava.WinterFlowSerializerStructure);
        WinterFlowDecoratorStrategy winterFlowDecoratorStrategy1022 = (WinterFlowDecoratorStrategy) WinterFlowProviderRouter.WinterFlowServerProtocol(winterFlowDecoratorBackend, WinterFlowCacheWorker.WinterFlowArrayNetwork);
        if (winterFlowExceptionPlatform != null) {
        }
        winterFlowExceptionPlatform2 = (WinterFlowExceptionPlatform) WinterFlowProviderRouter.WinterFlowServerProtocol(winterFlowDecoratorBackend, WinterFlowRendererJava.WinterFlowMapperProtocol);
        if (winterFlowExceptionPlatform2 != null) {
        }
        i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
        }
        CharSequence charSequence22 = (CharSequence) WinterFlowProviderRouter.WinterFlowServerProtocol(winterFlowDecoratorBackend, WinterFlowRendererJava.WinterFlowArrayNetwork);
        if (i3 >= 28) {
        }
        if (WinterFlowTestingCloud.WinterFlowTransactionAgent(winterFlowProcessorSystem7)) {
        }
        boolean WinterFlowBackendCacheManager22 = WinterFlowTestingCloud.WinterFlowBackendCacheManager(winterFlowProcessorSystem7, resources);
        if (Build.VERSION.SDK_INT >= 28) {
        }
        WinterFlowArrayNetwork = winterFlowBackendEventEmitter2.WinterFlowCacheManagerListener.WinterFlowArrayNetwork(i2);
        if (WinterFlowArrayNetwork != -1) {
        }
        WinterFlowArrayNetwork2 = winterFlowBackendEventEmitter2.WinterFlowPackageIDE.WinterFlowArrayNetwork(i2);
        if (WinterFlowArrayNetwork2 != -1) {
        }
        str = (String) WinterFlowProviderRouter.WinterFlowServerProtocol(winterFlowDecoratorBackend, WinterFlowSyntaxSession.WinterFlowHookDataSource);
        if (str != null) {
        }
        winterFlowFrameworkDataSource3 = winterFlowFrameworkDataSource2;
        if (winterFlowBackendEventEmitter2.WinterFlowVariableBandwidth) {
        }
        return winterFlowFrameworkDataSource3;
    }
}
