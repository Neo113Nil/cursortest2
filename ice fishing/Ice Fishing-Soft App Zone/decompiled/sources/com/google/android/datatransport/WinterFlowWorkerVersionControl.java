package com.google.android.datatransport;

import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.StrictMode;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import com.icewinter.flow.winter.icecatch.R;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowWorkerVersionControl {
    public static Boolean WinterFlowCacheManagerAgent;
    public static int WinterFlowHookDataSource;
    public static String WinterFlowRouterStructure;

    public static final WinterFlowProviderCacheManager WinterFlowArrayNetwork(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
            WinterFlowProviderCacheManager winterFlowProviderCacheManager = tag instanceof WinterFlowProviderCacheManager ? (WinterFlowProviderCacheManager) tag : null;
            if (winterFlowProviderCacheManager != null) {
                return winterFlowProviderCacheManager;
            }
            Object WinterFlowCacheManagerAgent2 = WinterFlowProtocolNetwork.WinterFlowCacheManagerAgent(view);
            view = WinterFlowCacheManagerAgent2 instanceof View ? (View) WinterFlowCacheManagerAgent2 : null;
        }
        return null;
    }

    public static void WinterFlowBackendCacheManager(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    public static void WinterFlowBandwidthObject(WinterFlowJSONModule winterFlowJSONModule, WinterFlowJSONModule winterFlowJSONModule2, WinterFlowObjectSession winterFlowObjectSession) {
        if (winterFlowJSONModule != winterFlowJSONModule2) {
            winterFlowJSONModule2.getClass();
            WinterFlowJSONModule.WinterFlowConcurrencyThread(winterFlowJSONModule);
            winterFlowJSONModule2.WinterFlowCacheManagerAgent();
        } else if (winterFlowJSONModule instanceof WinterFlowRefactoringTool) {
            ((WinterFlowRefactoringTool) winterFlowJSONModule).WinterFlowSingletonPlatform = winterFlowObjectSession;
        } else if (winterFlowJSONModule instanceof WinterFlowUnitTestHelper) {
            ((WinterFlowUnitTestHelper) winterFlowJSONModule).WinterFlowRouterRouter = winterFlowObjectSession;
        } else {
            WinterFlowCompilerMechanism.WinterFlowVariableVersionControl(winterFlowJSONModule, "Non-transparent snapshot was reused: ");
        }
    }

    public static void WinterFlowBatchUI(Parcel parcel, int i, Parcelable parcelable, int i2) {
        if (parcelable == null) {
            return;
        }
        int WinterFlowConsumerUserManager = WinterFlowConsumerUserManager(parcel, i);
        parcelable.writeToParcel(parcel, i2);
        WinterFlowBackendCacheManager(parcel, WinterFlowConsumerUserManager);
    }

    public static final String WinterFlowCacheManagerAgent(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [com.google.android.datatransport.WinterFlowObjectSession] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.google.android.datatransport.WinterFlowUserManagerController] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [com.google.android.datatransport.WinterFlowUserManagerController] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [com.google.android.datatransport.WinterFlowJSON] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [com.google.android.datatransport.WinterFlowJSON] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public static final void WinterFlowConcurrencyThread(WinterFlowUserManagerController winterFlowUserManagerController, String str, WinterFlowObjectSession winterFlowObjectSession) {
        if (!winterFlowUserManagerController.WinterFlowVariableVersionControl.WinterFlowSingletonPlatform) {
            WinterFlowViewUtility.WinterFlowHookDataSource("visitSubtreeIf called on an unattached node");
        }
        WinterFlowJSON winterFlowJSON = new WinterFlowJSON(new WinterFlowUserManagerController[16]);
        WinterFlowUserManagerController winterFlowUserManagerController2 = winterFlowUserManagerController.WinterFlowVariableVersionControl;
        WinterFlowUserManagerController winterFlowUserManagerController3 = winterFlowUserManagerController2.WinterFlowResponseEngine;
        if (winterFlowUserManagerController3 == null) {
            WinterFlowCloudStack.WinterFlowArrayNetwork(winterFlowJSON, winterFlowUserManagerController2);
        } else {
            winterFlowJSON.WinterFlowHookDataSource(winterFlowUserManagerController3);
        }
        while (true) {
            int i = winterFlowJSON.WinterFlowUnitTestResponse;
            if (i == 0) {
                return;
            }
            WinterFlowUserManagerController winterFlowUserManagerController4 = (WinterFlowUserManagerController) winterFlowJSON.WinterFlowTransactionAgent(i - 1);
            if ((winterFlowUserManagerController4.WinterFlowRouterRouter & 262144) != 0) {
                for (WinterFlowUserManagerController winterFlowUserManagerController5 = winterFlowUserManagerController4; winterFlowUserManagerController5 != null && winterFlowUserManagerController5.WinterFlowSingletonPlatform; winterFlowUserManagerController5 = winterFlowUserManagerController5.WinterFlowResponseEngine) {
                    if ((winterFlowUserManagerController5.WinterFlowUnitTestResponse & 262144) != 0) {
                        WinterFlowTestingEntity winterFlowTestingEntity = winterFlowUserManagerController5;
                        ?? r6 = 0;
                        while (winterFlowTestingEntity != 0) {
                            if (winterFlowTestingEntity instanceof WinterFlowAlgorithmEntity) {
                                WinterFlowAlgorithmEntity winterFlowAlgorithmEntity = (WinterFlowAlgorithmEntity) winterFlowTestingEntity;
                                WinterFlowSoftwareManager winterFlowSoftwareManager = str.equals(winterFlowAlgorithmEntity.WinterFlowResponseEngine()) ? (WinterFlowSoftwareManager) winterFlowObjectSession.WinterFlowUnitTestResponse(winterFlowAlgorithmEntity) : WinterFlowSoftwareManager.WinterFlowVariableVersionControl;
                                if (winterFlowSoftwareManager == WinterFlowSoftwareManager.WinterFlowUnitTestResponse) {
                                    return;
                                }
                                if (winterFlowSoftwareManager == WinterFlowSoftwareManager.WinterFlowTransactionManagerStrategy) {
                                    break;
                                }
                            } else if ((winterFlowTestingEntity.WinterFlowUnitTestResponse & 262144) != 0 && (winterFlowTestingEntity instanceof WinterFlowTestingEntity)) {
                                WinterFlowUserManagerController winterFlowUserManagerController6 = winterFlowTestingEntity.WinterFlowBatchUI;
                                int i2 = 0;
                                winterFlowTestingEntity = winterFlowTestingEntity;
                                r6 = r6;
                                while (winterFlowUserManagerController6 != null) {
                                    if ((winterFlowUserManagerController6.WinterFlowUnitTestResponse & 262144) != 0) {
                                        i2++;
                                        r6 = r6;
                                        if (i2 == 1) {
                                            winterFlowTestingEntity = winterFlowUserManagerController6;
                                        } else {
                                            if (r6 == 0) {
                                                r6 = new WinterFlowJSON(new WinterFlowUserManagerController[16]);
                                            }
                                            if (winterFlowTestingEntity != 0) {
                                                r6.WinterFlowHookDataSource(winterFlowTestingEntity);
                                                winterFlowTestingEntity = 0;
                                            }
                                            r6.WinterFlowHookDataSource(winterFlowUserManagerController6);
                                        }
                                    }
                                    winterFlowUserManagerController6 = winterFlowUserManagerController6.WinterFlowResponseEngine;
                                    winterFlowTestingEntity = winterFlowTestingEntity;
                                    r6 = r6;
                                }
                                if (i2 == 1) {
                                }
                            }
                            winterFlowTestingEntity = WinterFlowCloudStack.WinterFlowPackageIDE(r6);
                        }
                    }
                }
            }
            WinterFlowCloudStack.WinterFlowArrayNetwork(winterFlowJSON, winterFlowUserManagerController4);
        }
    }

    public static int WinterFlowConsumerUserManager(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static final WinterFlowAlgorithmEntity WinterFlowHookDataSource(WinterFlowTestingEntity winterFlowTestingEntity, Object obj) {
        WinterFlowExceptionStrategy winterFlowExceptionStrategy;
        if (!winterFlowTestingEntity.WinterFlowVariableVersionControl.WinterFlowSingletonPlatform) {
            WinterFlowViewUtility.WinterFlowHookDataSource("visitAncestors called on an unattached node");
        }
        WinterFlowUserManagerController winterFlowUserManagerController = winterFlowTestingEntity.WinterFlowVariableVersionControl.WinterFlowSyntax;
        WinterFlowSchedulerStructure WinterFlowSyntaxSubsystem = WinterFlowCloudStack.WinterFlowSyntaxSubsystem(winterFlowTestingEntity);
        while (WinterFlowSyntaxSubsystem != null) {
            if ((WinterFlowSyntaxSubsystem.WinterFlowUserManagerUserManager.WinterFlowTransactionManagerStrategy.WinterFlowRouterRouter & 262144) != 0) {
                while (winterFlowUserManagerController != null) {
                    if ((winterFlowUserManagerController.WinterFlowUnitTestResponse & 262144) != 0) {
                        WinterFlowUserManagerController winterFlowUserManagerController2 = winterFlowUserManagerController;
                        WinterFlowJSON winterFlowJSON = null;
                        while (winterFlowUserManagerController2 != null) {
                            if (winterFlowUserManagerController2 instanceof WinterFlowAlgorithmEntity) {
                                WinterFlowAlgorithmEntity winterFlowAlgorithmEntity = (WinterFlowAlgorithmEntity) winterFlowUserManagerController2;
                                if (obj.equals(winterFlowAlgorithmEntity.WinterFlowResponseEngine())) {
                                    return winterFlowAlgorithmEntity;
                                }
                            }
                            if ((winterFlowUserManagerController2.WinterFlowUnitTestResponse & 262144) != 0 && (winterFlowUserManagerController2 instanceof WinterFlowTestingEntity)) {
                                int i = 0;
                                for (WinterFlowUserManagerController winterFlowUserManagerController3 = ((WinterFlowTestingEntity) winterFlowUserManagerController2).WinterFlowBatchUI; winterFlowUserManagerController3 != null; winterFlowUserManagerController3 = winterFlowUserManagerController3.WinterFlowResponseEngine) {
                                    if ((winterFlowUserManagerController3.WinterFlowUnitTestResponse & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
                                            winterFlowUserManagerController2 = winterFlowUserManagerController3;
                                        } else {
                                            if (winterFlowJSON == null) {
                                                winterFlowJSON = new WinterFlowJSON(new WinterFlowUserManagerController[16]);
                                            }
                                            if (winterFlowUserManagerController2 != null) {
                                                winterFlowJSON.WinterFlowHookDataSource(winterFlowUserManagerController2);
                                                winterFlowUserManagerController2 = null;
                                            }
                                            winterFlowJSON.WinterFlowHookDataSource(winterFlowUserManagerController3);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            winterFlowUserManagerController2 = WinterFlowCloudStack.WinterFlowPackageIDE(winterFlowJSON);
                        }
                    }
                    winterFlowUserManagerController = winterFlowUserManagerController.WinterFlowSyntax;
                }
            }
            WinterFlowSyntaxSubsystem = WinterFlowSyntaxSubsystem.WinterFlowVariableBandwidth();
            winterFlowUserManagerController = (WinterFlowSyntaxSubsystem == null || (winterFlowExceptionStrategy = WinterFlowSyntaxSubsystem.WinterFlowUserManagerUserManager) == null) ? null : winterFlowExceptionStrategy.WinterFlowVariableVersionControl;
        }
        return null;
    }

    public static void WinterFlowMapperProtocol(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int WinterFlowConsumerUserManager = WinterFlowConsumerUserManager(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            Parcelable parcelable = (Parcelable) list.get(i2);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        WinterFlowBackendCacheManager(parcel, WinterFlowConsumerUserManager);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.google.android.datatransport.WinterFlowObjectSession] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [com.google.android.datatransport.WinterFlowUserManagerController] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [com.google.android.datatransport.WinterFlowUserManagerController] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [com.google.android.datatransport.WinterFlowJSON] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [com.google.android.datatransport.WinterFlowJSON] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static final void WinterFlowOrchestrationSubsystem(WinterFlowUserManagerController winterFlowUserManagerController, Object obj, WinterFlowObjectSession winterFlowObjectSession) {
        WinterFlowExceptionStrategy winterFlowExceptionStrategy;
        if (!winterFlowUserManagerController.WinterFlowVariableVersionControl.WinterFlowSingletonPlatform) {
            WinterFlowViewUtility.WinterFlowHookDataSource("visitAncestors called on an unattached node");
        }
        WinterFlowUserManagerController winterFlowUserManagerController2 = winterFlowUserManagerController.WinterFlowVariableVersionControl.WinterFlowSyntax;
        WinterFlowSchedulerStructure WinterFlowSyntaxSubsystem = WinterFlowCloudStack.WinterFlowSyntaxSubsystem(winterFlowUserManagerController);
        while (WinterFlowSyntaxSubsystem != null) {
            if ((WinterFlowSyntaxSubsystem.WinterFlowUserManagerUserManager.WinterFlowTransactionManagerStrategy.WinterFlowRouterRouter & 262144) != 0) {
                while (winterFlowUserManagerController2 != null) {
                    if ((winterFlowUserManagerController2.WinterFlowUnitTestResponse & 262144) != 0) {
                        WinterFlowTestingEntity winterFlowTestingEntity = winterFlowUserManagerController2;
                        ?? r4 = 0;
                        while (winterFlowTestingEntity != 0) {
                            if (winterFlowTestingEntity instanceof WinterFlowAlgorithmEntity) {
                                WinterFlowAlgorithmEntity winterFlowAlgorithmEntity = (WinterFlowAlgorithmEntity) winterFlowTestingEntity;
                                if (!(obj.equals(winterFlowAlgorithmEntity.WinterFlowResponseEngine()) ? ((Boolean) winterFlowObjectSession.WinterFlowUnitTestResponse(winterFlowAlgorithmEntity)).booleanValue() : true)) {
                                    return;
                                }
                            } else if ((winterFlowTestingEntity.WinterFlowUnitTestResponse & 262144) != 0 && (winterFlowTestingEntity instanceof WinterFlowTestingEntity)) {
                                WinterFlowUserManagerController winterFlowUserManagerController3 = winterFlowTestingEntity.WinterFlowBatchUI;
                                int i = 0;
                                winterFlowTestingEntity = winterFlowTestingEntity;
                                r4 = r4;
                                while (winterFlowUserManagerController3 != null) {
                                    if ((winterFlowUserManagerController3.WinterFlowUnitTestResponse & 262144) != 0) {
                                        i++;
                                        r4 = r4;
                                        if (i == 1) {
                                            winterFlowTestingEntity = winterFlowUserManagerController3;
                                        } else {
                                            if (r4 == 0) {
                                                r4 = new WinterFlowJSON(new WinterFlowUserManagerController[16]);
                                            }
                                            if (winterFlowTestingEntity != 0) {
                                                r4.WinterFlowHookDataSource(winterFlowTestingEntity);
                                                winterFlowTestingEntity = 0;
                                            }
                                            r4.WinterFlowHookDataSource(winterFlowUserManagerController3);
                                        }
                                    }
                                    winterFlowUserManagerController3 = winterFlowUserManagerController3.WinterFlowResponseEngine;
                                    winterFlowTestingEntity = winterFlowTestingEntity;
                                    r4 = r4;
                                }
                                if (i == 1) {
                                }
                            }
                            winterFlowTestingEntity = WinterFlowCloudStack.WinterFlowPackageIDE(r4);
                        }
                    }
                    winterFlowUserManagerController2 = winterFlowUserManagerController2.WinterFlowSyntax;
                }
            }
            WinterFlowSyntaxSubsystem = WinterFlowSyntaxSubsystem.WinterFlowVariableBandwidth();
            winterFlowUserManagerController2 = (WinterFlowSyntaxSubsystem == null || (winterFlowExceptionStrategy = WinterFlowSyntaxSubsystem.WinterFlowUserManagerUserManager) == null) ? null : winterFlowExceptionStrategy.WinterFlowVariableVersionControl;
        }
    }

    public static void WinterFlowResolverController(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }

    public static WinterFlowJSONModule WinterFlowResponseEngine(WinterFlowJSONModule winterFlowJSONModule) {
        if (winterFlowJSONModule instanceof WinterFlowRefactoringTool) {
            WinterFlowRefactoringTool winterFlowRefactoringTool = (WinterFlowRefactoringTool) winterFlowJSONModule;
            if (winterFlowRefactoringTool.WinterFlowBatchUI == WinterFlowConfigurationException.WinterFlowRouterStructure()) {
                winterFlowRefactoringTool.WinterFlowSingletonPlatform = null;
                return winterFlowJSONModule;
            }
        }
        if (winterFlowJSONModule instanceof WinterFlowUnitTestHelper) {
            WinterFlowUnitTestHelper winterFlowUnitTestHelper = (WinterFlowUnitTestHelper) winterFlowJSONModule;
            if (winterFlowUnitTestHelper.WinterFlowSyntax == WinterFlowConfigurationException.WinterFlowRouterStructure()) {
                winterFlowUnitTestHelper.WinterFlowRouterRouter = null;
                return winterFlowJSONModule;
            }
        }
        WinterFlowJSONModule WinterFlowVariableVersionControl = WinterFlowVersionProtocol.WinterFlowVariableVersionControl(winterFlowJSONModule, null, false);
        WinterFlowVariableVersionControl.WinterFlowResponseEngine();
        return WinterFlowVariableVersionControl;
    }

    public static void WinterFlowRouterAdapter(Parcel parcel, int i, String str) {
        if (str == null) {
            return;
        }
        int WinterFlowConsumerUserManager = WinterFlowConsumerUserManager(parcel, i);
        parcel.writeString(str);
        WinterFlowBackendCacheManager(parcel, WinterFlowConsumerUserManager);
    }

    public static final int WinterFlowRouterRouter(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static StaticLayout WinterFlowRouterStructure(CharSequence charSequence, TextPaint textPaint, int i, int i2, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i3, TextUtils.TruncateAt truncateAt, int i4, int i5, boolean z, int i6, int i7, int i8, int i9) {
        if (i2 < 0) {
            WinterFlowWorkerPipeline.WinterFlowRouterStructure("invalid start value");
        }
        int length = charSequence.length();
        if (i2 < 0 || i2 > length) {
            WinterFlowWorkerPipeline.WinterFlowRouterStructure("invalid end value");
        }
        if (i3 < 0) {
            WinterFlowWorkerPipeline.WinterFlowRouterStructure("invalid maxLines value");
        }
        if (i < 0) {
            WinterFlowWorkerPipeline.WinterFlowRouterStructure("invalid width value");
        }
        if (i4 < 0) {
            WinterFlowWorkerPipeline.WinterFlowRouterStructure("invalid ellipsizedWidth value");
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, i2, textPaint, i);
        obtain.setTextDirection(textDirectionHeuristic);
        obtain.setAlignment(alignment);
        obtain.setMaxLines(i3);
        obtain.setEllipsize(truncateAt);
        obtain.setEllipsizedWidth(i4);
        obtain.setLineSpacing(0.0f, 1.0f);
        obtain.setIncludePad(z);
        obtain.setBreakStrategy(i6);
        obtain.setHyphenationFrequency(i9);
        obtain.setIndents(null, null);
        obtain.setJustificationMode(i5);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            obtain.setUseLineSpacingFromFallbacks(true);
        }
        if (i10 >= 33) {
            WinterFlowBackendThreadPool.WinterFlowTransactionManagerStrategy(obtain, i7, i8);
        }
        if (i10 >= 35) {
            obtain.setUseBoundsForWidth(false);
        }
        return obtain.build();
    }

    public static void WinterFlowSerializerStructure(Parcel parcel, int i, Parcelable[] parcelableArr, int i2) {
        if (parcelableArr == null) {
            return;
        }
        int WinterFlowConsumerUserManager = WinterFlowConsumerUserManager(parcel, i);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i2);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        WinterFlowBackendCacheManager(parcel, WinterFlowConsumerUserManager);
    }

    public static Object WinterFlowServerProtocol(WinterFlowLoaderEngine winterFlowLoaderEngine, WinterFlowObjectUI winterFlowObjectUI) {
        WinterFlowJSONModule winterFlowRefactoringTool;
        WinterFlowJSONModule winterFlowJSONModule = (WinterFlowJSONModule) WinterFlowVersionProtocol.WinterFlowHookDataSource.get();
        if (winterFlowJSONModule instanceof WinterFlowRefactoringTool) {
            WinterFlowRefactoringTool winterFlowRefactoringTool2 = (WinterFlowRefactoringTool) winterFlowJSONModule;
            if (winterFlowRefactoringTool2.WinterFlowBatchUI == WinterFlowConfigurationException.WinterFlowRouterStructure()) {
                WinterFlowObjectSession winterFlowObjectSession = winterFlowRefactoringTool2.WinterFlowSingletonPlatform;
                WinterFlowObjectSession winterFlowObjectSession2 = winterFlowRefactoringTool2.WinterFlowVariableBandwidth;
                try {
                    ((WinterFlowRefactoringTool) winterFlowJSONModule).WinterFlowSingletonPlatform = WinterFlowVersionProtocol.WinterFlowSyntax(winterFlowLoaderEngine, winterFlowObjectSession, true);
                    ((WinterFlowRefactoringTool) winterFlowJSONModule).WinterFlowVariableBandwidth = winterFlowObjectSession2;
                    return winterFlowObjectUI.WinterFlowRouterStructure();
                } finally {
                    winterFlowRefactoringTool2.WinterFlowSingletonPlatform = winterFlowObjectSession;
                    winterFlowRefactoringTool2.WinterFlowVariableBandwidth = winterFlowObjectSession2;
                }
            }
        }
        if (winterFlowJSONModule == null || (winterFlowJSONModule instanceof WinterFlowSchedulerTesting)) {
            winterFlowRefactoringTool = new WinterFlowRefactoringTool(winterFlowJSONModule instanceof WinterFlowSchedulerTesting ? (WinterFlowSchedulerTesting) winterFlowJSONModule : null, winterFlowLoaderEngine, null, true, false);
        } else {
            winterFlowRefactoringTool = winterFlowJSONModule.WinterFlowRouterAdapter(winterFlowLoaderEngine);
        }
        try {
            WinterFlowJSONModule WinterFlowResponseEngine = winterFlowRefactoringTool.WinterFlowResponseEngine();
            try {
                Object WinterFlowRouterStructure2 = winterFlowObjectUI.WinterFlowRouterStructure();
                WinterFlowJSONModule.WinterFlowConcurrencyThread(WinterFlowResponseEngine);
                winterFlowRefactoringTool.WinterFlowCacheManagerAgent();
                return WinterFlowRouterStructure2;
            } catch (Throwable th) {
                WinterFlowJSONModule.WinterFlowConcurrencyThread(WinterFlowResponseEngine);
                throw th;
            }
        } catch (Throwable th2) {
            winterFlowRefactoringTool.WinterFlowCacheManagerAgent();
            throw th2;
        }
    }

    public static final Object WinterFlowServiceUtility(Object[] objArr, WinterFlowLoaderConsumer winterFlowLoaderConsumer, WinterFlowObjectUI winterFlowObjectUI, WinterFlowResolverLibrary winterFlowResolverLibrary, int i, int i2) {
        Object[] objArr2;
        WinterFlowLoaderConsumer winterFlowLoaderConsumer2;
        final Object obj;
        Object WinterFlowTransactionManagerStrategy;
        long j = winterFlowResolverLibrary.WinterFlowConfiguration;
        WinterFlowQuerySyntax.WinterFlowArrayNetwork(36);
        final String l = Long.toString(j, 36);
        l.getClass();
        winterFlowLoaderConsumer.getClass();
        final WinterFlowEncryptionComponent winterFlowEncryptionComponent = (WinterFlowEncryptionComponent) winterFlowResolverLibrary.WinterFlowSyntax(WinterFlowModuleEngine.WinterFlowRouterStructure);
        Object WinterFlowSyntaxSubsystem = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
        Object obj2 = WinterFlowModuleModule.WinterFlowRouterStructure;
        if (WinterFlowSyntaxSubsystem == obj2) {
            Object WinterFlowCacheManagerAgent2 = (winterFlowEncryptionComponent == null || (WinterFlowTransactionManagerStrategy = winterFlowEncryptionComponent.WinterFlowTransactionManagerStrategy(l)) == null) ? null : winterFlowLoaderConsumer.WinterFlowCacheManagerAgent(WinterFlowTransactionManagerStrategy);
            if (WinterFlowCacheManagerAgent2 == null) {
                WinterFlowCacheManagerAgent2 = winterFlowObjectUI.WinterFlowRouterStructure();
            }
            objArr2 = objArr;
            winterFlowLoaderConsumer2 = winterFlowLoaderConsumer;
            Object winterFlowWebsocketPipeline = new WinterFlowWebsocketPipeline(winterFlowLoaderConsumer2, winterFlowEncryptionComponent, l, WinterFlowCacheManagerAgent2, objArr2);
            winterFlowResolverLibrary.WinterFlowArrayFramework(winterFlowWebsocketPipeline);
            WinterFlowSyntaxSubsystem = winterFlowWebsocketPipeline;
        } else {
            objArr2 = objArr;
            winterFlowLoaderConsumer2 = winterFlowLoaderConsumer;
        }
        final WinterFlowWebsocketPipeline winterFlowWebsocketPipeline2 = (WinterFlowWebsocketPipeline) WinterFlowSyntaxSubsystem;
        Object obj3 = Arrays.equals(objArr2, winterFlowWebsocketPipeline2.WinterFlowSyntax) ? winterFlowWebsocketPipeline2.WinterFlowRouterRouter : null;
        if (obj3 == null) {
            obj3 = winterFlowObjectUI.WinterFlowRouterStructure();
        }
        boolean WinterFlowUnitTestResponse = winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowWebsocketPipeline2) | ((((i & 112) ^ 48) > 32 && winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowLoaderConsumer2)) || (i & 48) == 32) | winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowEncryptionComponent) | winterFlowResolverLibrary.WinterFlowVariableVersionControl(l) | winterFlowResolverLibrary.WinterFlowUnitTestResponse(obj3) | winterFlowResolverLibrary.WinterFlowUnitTestResponse(objArr2);
        Object WinterFlowSyntaxSubsystem2 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
        if (WinterFlowUnitTestResponse || WinterFlowSyntaxSubsystem2 == obj2) {
            final Object[] objArr3 = objArr2;
            obj = obj3;
            final WinterFlowLoaderConsumer winterFlowLoaderConsumer3 = winterFlowLoaderConsumer2;
            Object obj4 = new WinterFlowObjectUI() { // from class: com.google.android.datatransport.WinterFlowLoaderResponse
                @Override // com.google.android.datatransport.WinterFlowObjectUI
                public final Object WinterFlowRouterStructure() {
                    boolean z;
                    WinterFlowWebsocketPipeline winterFlowWebsocketPipeline3 = WinterFlowWebsocketPipeline.this;
                    WinterFlowEncryptionComponent winterFlowEncryptionComponent2 = winterFlowWebsocketPipeline3.WinterFlowTransactionManagerStrategy;
                    WinterFlowEncryptionComponent winterFlowEncryptionComponent3 = winterFlowEncryptionComponent;
                    boolean z2 = true;
                    if (winterFlowEncryptionComponent2 != winterFlowEncryptionComponent3) {
                        winterFlowWebsocketPipeline3.WinterFlowTransactionManagerStrategy = winterFlowEncryptionComponent3;
                        z = true;
                    } else {
                        z = false;
                    }
                    String str = winterFlowWebsocketPipeline3.WinterFlowUnitTestResponse;
                    String str2 = l;
                    if (WinterFlowManagerRequest.WinterFlowThreadListener(str, str2)) {
                        z2 = z;
                    } else {
                        winterFlowWebsocketPipeline3.WinterFlowUnitTestResponse = str2;
                    }
                    winterFlowWebsocketPipeline3.WinterFlowVariableVersionControl = winterFlowLoaderConsumer3;
                    winterFlowWebsocketPipeline3.WinterFlowRouterRouter = obj;
                    winterFlowWebsocketPipeline3.WinterFlowSyntax = objArr3;
                    WinterFlowLoaderHook winterFlowLoaderHook = winterFlowWebsocketPipeline3.WinterFlowResponseEngine;
                    if (winterFlowLoaderHook != null && z2) {
                        ((WinterFlowObjectPackage) winterFlowLoaderHook).WinterFlowCompilerVariable();
                        winterFlowWebsocketPipeline3.WinterFlowResponseEngine = null;
                        winterFlowWebsocketPipeline3.WinterFlowHookDataSource();
                    }
                    return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                }
            };
            winterFlowResolverLibrary.WinterFlowArrayFramework(obj4);
            WinterFlowSyntaxSubsystem2 = obj4;
        } else {
            obj = obj3;
        }
        WinterFlowSoftwareException.WinterFlowTransactionAgent((WinterFlowObjectUI) WinterFlowSyntaxSubsystem2, winterFlowResolverLibrary);
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [com.google.android.datatransport.WinterFlowAlgorithmEntity, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [com.google.android.datatransport.WinterFlowObjectSession] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.google.android.datatransport.WinterFlowUserManagerController] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [com.google.android.datatransport.WinterFlowUserManagerController] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [com.google.android.datatransport.WinterFlowJSON] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [com.google.android.datatransport.WinterFlowJSON] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public static final void WinterFlowSingletonPlatform(WinterFlowAlgorithmEntity winterFlowAlgorithmEntity, WinterFlowObjectSession winterFlowObjectSession) {
        WinterFlowUserManagerController winterFlowUserManagerController = (WinterFlowUserManagerController) winterFlowAlgorithmEntity;
        if (!winterFlowUserManagerController.WinterFlowVariableVersionControl.WinterFlowSingletonPlatform) {
            WinterFlowViewUtility.WinterFlowHookDataSource("visitSubtreeIf called on an unattached node");
        }
        WinterFlowJSON winterFlowJSON = new WinterFlowJSON(new WinterFlowUserManagerController[16]);
        WinterFlowUserManagerController winterFlowUserManagerController2 = winterFlowUserManagerController.WinterFlowVariableVersionControl;
        WinterFlowUserManagerController winterFlowUserManagerController3 = winterFlowUserManagerController2.WinterFlowResponseEngine;
        if (winterFlowUserManagerController3 == null) {
            WinterFlowCloudStack.WinterFlowArrayNetwork(winterFlowJSON, winterFlowUserManagerController2);
        } else {
            winterFlowJSON.WinterFlowHookDataSource(winterFlowUserManagerController3);
        }
        while (true) {
            int i = winterFlowJSON.WinterFlowUnitTestResponse;
            if (i == 0) {
                return;
            }
            WinterFlowUserManagerController winterFlowUserManagerController4 = (WinterFlowUserManagerController) winterFlowJSON.WinterFlowTransactionAgent(i - 1);
            if ((winterFlowUserManagerController4.WinterFlowRouterRouter & 262144) != 0) {
                for (WinterFlowUserManagerController winterFlowUserManagerController5 = winterFlowUserManagerController4; winterFlowUserManagerController5 != null && winterFlowUserManagerController5.WinterFlowSingletonPlatform; winterFlowUserManagerController5 = winterFlowUserManagerController5.WinterFlowResponseEngine) {
                    if ((winterFlowUserManagerController5.WinterFlowUnitTestResponse & 262144) != 0) {
                        WinterFlowTestingEntity winterFlowTestingEntity = winterFlowUserManagerController5;
                        ?? r7 = 0;
                        while (winterFlowTestingEntity != 0) {
                            if (winterFlowTestingEntity instanceof WinterFlowAlgorithmEntity) {
                                WinterFlowAlgorithmEntity winterFlowAlgorithmEntity2 = (WinterFlowAlgorithmEntity) winterFlowTestingEntity;
                                WinterFlowSoftwareManager winterFlowSoftwareManager = (WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowAlgorithmEntity.WinterFlowResponseEngine(), winterFlowAlgorithmEntity2.WinterFlowResponseEngine()) && winterFlowAlgorithmEntity.getClass() == winterFlowAlgorithmEntity2.getClass()) ? (WinterFlowSoftwareManager) winterFlowObjectSession.WinterFlowUnitTestResponse(winterFlowAlgorithmEntity2) : WinterFlowSoftwareManager.WinterFlowVariableVersionControl;
                                if (winterFlowSoftwareManager == WinterFlowSoftwareManager.WinterFlowUnitTestResponse) {
                                    return;
                                }
                                if (winterFlowSoftwareManager == WinterFlowSoftwareManager.WinterFlowTransactionManagerStrategy) {
                                    break;
                                }
                            } else if ((winterFlowTestingEntity.WinterFlowUnitTestResponse & 262144) != 0 && (winterFlowTestingEntity instanceof WinterFlowTestingEntity)) {
                                WinterFlowUserManagerController winterFlowUserManagerController6 = winterFlowTestingEntity.WinterFlowBatchUI;
                                int i2 = 0;
                                winterFlowTestingEntity = winterFlowTestingEntity;
                                r7 = r7;
                                while (winterFlowUserManagerController6 != null) {
                                    if ((winterFlowUserManagerController6.WinterFlowUnitTestResponse & 262144) != 0) {
                                        i2++;
                                        r7 = r7;
                                        if (i2 == 1) {
                                            winterFlowTestingEntity = winterFlowUserManagerController6;
                                        } else {
                                            if (r7 == 0) {
                                                r7 = new WinterFlowJSON(new WinterFlowUserManagerController[16]);
                                            }
                                            if (winterFlowTestingEntity != 0) {
                                                r7.WinterFlowHookDataSource(winterFlowTestingEntity);
                                                winterFlowTestingEntity = 0;
                                            }
                                            r7.WinterFlowHookDataSource(winterFlowUserManagerController6);
                                        }
                                    }
                                    winterFlowUserManagerController6 = winterFlowUserManagerController6.WinterFlowResponseEngine;
                                    winterFlowTestingEntity = winterFlowTestingEntity;
                                    r7 = r7;
                                }
                                if (i2 == 1) {
                                }
                            }
                            winterFlowTestingEntity = WinterFlowCloudStack.WinterFlowPackageIDE(r7);
                        }
                    }
                }
            }
            WinterFlowCloudStack.WinterFlowArrayNetwork(winterFlowJSON, winterFlowUserManagerController4);
        }
    }

    public static final boolean WinterFlowSyntax(Object obj) {
        return obj == WinterFlowEncryptionSubsystem.WinterFlowVariableVersionControl;
    }

    public static final Object WinterFlowThreadListener(Object[] objArr, WinterFlowLoaderConsumer winterFlowLoaderConsumer, WinterFlowObjectUI winterFlowObjectUI, WinterFlowResolverLibrary winterFlowResolverLibrary, int i) {
        return WinterFlowServiceUtility(Arrays.copyOf(objArr, objArr.length), winterFlowLoaderConsumer, winterFlowObjectUI, winterFlowResolverLibrary, 384 | ((i << 3) & 7168), 0);
    }

    public static final long WinterFlowTransactionAgent(long j, float f) {
        return (Float.isNaN(f) || f >= 1.0f) ? j : WinterFlowInheritanceSubsystem.WinterFlowHookDataSource(j, WinterFlowInheritanceSubsystem.WinterFlowCacheManagerAgent(j) * f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0070, code lost:
    
        if (r2 == null) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String WinterFlowTransactionManagerStrategy() {
        BufferedReader bufferedReader;
        String processName;
        String str = WinterFlowRouterStructure;
        if (str != null) {
            return str;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            processName = Application.getProcessName();
            WinterFlowRouterStructure = processName;
            return processName;
        }
        int i = WinterFlowHookDataSource;
        if (i == 0) {
            i = Process.myPid();
            WinterFlowHookDataSource = i;
        }
        String str2 = null;
        str2 = null;
        str2 = null;
        BufferedReader bufferedReader2 = null;
        if (i > 0) {
            try {
                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 14);
                sb.append("/proc/");
                sb.append(i);
                sb.append("/cmdline");
                String sb2 = sb.toString();
                StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                try {
                    bufferedReader = new BufferedReader(new FileReader(sb2));
                } finally {
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                }
            } catch (IOException unused) {
                bufferedReader = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                String readLine = bufferedReader.readLine();
                WinterFlowUnitTestLibrary.WinterFlowConcurrencyThread(readLine);
                str2 = readLine.trim();
            } catch (IOException unused2) {
            } catch (Throwable th2) {
                th = th2;
                bufferedReader2 = bufferedReader;
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th;
            }
            try {
                bufferedReader.close();
            } catch (IOException unused4) {
            }
        }
        WinterFlowRouterStructure = str2;
        return str2;
    }

    public static final WinterFlowDatabaseDeserialization WinterFlowUnitTestResponse(Object obj) {
        if (obj != WinterFlowEncryptionSubsystem.WinterFlowVariableVersionControl) {
            return (WinterFlowDatabaseDeserialization) obj;
        }
        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Does not contain segment");
        return null;
    }

    public static void WinterFlowVariableBandwidth(Parcel parcel, int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int WinterFlowConsumerUserManager = WinterFlowConsumerUserManager(parcel, i);
        parcel.writeBundle(bundle);
        WinterFlowBackendCacheManager(parcel, WinterFlowConsumerUserManager);
    }

    public static WinterFlowJSONModule WinterFlowVariableVersionControl() {
        return (WinterFlowJSONModule) WinterFlowVersionProtocol.WinterFlowHookDataSource.get();
    }
}
