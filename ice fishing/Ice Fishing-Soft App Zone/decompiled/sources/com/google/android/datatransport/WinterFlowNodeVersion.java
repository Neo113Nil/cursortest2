package com.google.android.datatransport;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Spanned;
import android.view.View;
import com.android.installreferrer.api.InstallReferrerClient;
import com.icewinter.flow.winter.icecatch.R;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowNodeVersion {
    public final /* synthetic */ int WinterFlowRouterStructure;

    public /* synthetic */ WinterFlowNodeVersion(int i) {
        this.WinterFlowRouterStructure = i;
    }

    public static Parcelable WinterFlowArrayNetwork(Parcel parcel, int i, Parcelable.Creator creator) {
        int WinterFlowConcurrencyThread = WinterFlowConcurrencyThread(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (WinterFlowConcurrencyThread == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + WinterFlowConcurrencyThread);
        return parcelable;
    }

    public static boolean WinterFlowBandwidthObject(Parcel parcel, int i) {
        WinterFlowSerializerStructure(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static int WinterFlowBatchUI(Parcel parcel) {
        int readInt = parcel.readInt();
        int WinterFlowConcurrencyThread = WinterFlowConcurrencyThread(parcel, readInt);
        char c = (char) readInt;
        int dataPosition = parcel.dataPosition();
        if (c != 20293) {
            throw new WinterFlowServerSystem("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))), parcel);
        }
        int i = WinterFlowConcurrencyThread + dataPosition;
        if (i >= dataPosition && i <= parcel.dataSize()) {
            return i;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(dataPosition).length() + 32 + String.valueOf(i).length());
        sb.append("Size read is invalid start=");
        sb.append(dataPosition);
        sb.append(" end=");
        sb.append(i);
        throw new WinterFlowServerSystem(sb.toString(), parcel);
    }

    public static Bundle WinterFlowCacheManagerAgent(Parcel parcel, int i) {
        int WinterFlowConcurrencyThread = WinterFlowConcurrencyThread(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (WinterFlowConcurrencyThread == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + WinterFlowConcurrencyThread);
        return readBundle;
    }

    public static int WinterFlowConcurrencyThread(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    public static final int WinterFlowHookDataSource(float f) {
        return Math.round((float) Math.ceil(f));
    }

    public static int WinterFlowOrchestrationSubsystem(Parcel parcel, int i) {
        WinterFlowSerializerStructure(parcel, i, 4);
        return parcel.readInt();
    }

    public static final Object WinterFlowResponseEngine(WinterFlowJavaDeployment winterFlowJavaDeployment, String str, WinterFlowOrchestrationCompiler winterFlowOrchestrationCompiler) {
        Object WinterFlowRouterStructure = winterFlowJavaDeployment.WinterFlowRouterStructure(str, new WinterFlowSessionManagerAgent(25), winterFlowOrchestrationCompiler);
        return WinterFlowRouterStructure == WinterFlowListenerJava.WinterFlowVariableVersionControl ? WinterFlowRouterStructure : WinterFlowAlgorithmSession.WinterFlowRouterStructure;
    }

    public static final void WinterFlowRouterAdapter(WinterFlowProcessorSystem winterFlowProcessorSystem, int i, WinterFlowJavaResolver winterFlowJavaResolver) {
        WinterFlowProcessorSystem winterFlowProcessorSystem2;
        WinterFlowJSON winterFlowJSON = new WinterFlowJSON(new WinterFlowProcessorSystem[16]);
        List WinterFlowSyntax = winterFlowProcessorSystem.WinterFlowSyntax(false, false);
        while (true) {
            winterFlowJSON.WinterFlowArrayNetwork(winterFlowJSON.WinterFlowUnitTestResponse, WinterFlowSyntax);
            while (true) {
                int i2 = winterFlowJSON.WinterFlowUnitTestResponse;
                if (i2 == 0) {
                    return;
                }
                winterFlowProcessorSystem2 = (WinterFlowProcessorSystem) winterFlowJSON.WinterFlowTransactionAgent(i2 - 1);
                boolean WinterFlowPackageIDE = WinterFlowEncryptionSubsystem.WinterFlowPackageIDE(winterFlowProcessorSystem2);
                WinterFlowDecoratorBackend winterFlowDecoratorBackend = winterFlowProcessorSystem2.WinterFlowArrayNetwork;
                WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure = winterFlowDecoratorBackend.WinterFlowVariableVersionControl;
                if (!WinterFlowPackageIDE && !winterFlowDatabaseSchemaStructure.WinterFlowCacheManagerAgent(WinterFlowRendererJava.WinterFlowResponseEngine)) {
                    WinterFlowUIMicroservice WinterFlowArrayNetwork = winterFlowProcessorSystem2.WinterFlowArrayNetwork();
                    if (WinterFlowArrayNetwork == null) {
                        throw WinterFlowResolverBackend.WinterFlowUnitTestResponse("Expected semantics node to have a coordinator.");
                    }
                    WinterFlowLibraryInterface WinterFlowQueueService = WinterFlowCacheRuntime.WinterFlowQueueService(WinterFlowCloudStack.WinterFlowSyntax(WinterFlowArrayNetwork, true));
                    if (WinterFlowQueueService.WinterFlowRouterStructure < WinterFlowQueueService.WinterFlowCacheManagerAgent && WinterFlowQueueService.WinterFlowHookDataSource < WinterFlowQueueService.WinterFlowArrayNetwork) {
                        Object WinterFlowUnitTestResponse = winterFlowDecoratorBackend.WinterFlowVariableVersionControl.WinterFlowUnitTestResponse(WinterFlowCacheWorker.WinterFlowVariableVersionControl);
                        if (WinterFlowUnitTestResponse == null) {
                            WinterFlowUnitTestResponse = null;
                        }
                        WinterFlowEventEvent winterFlowEventEvent = (WinterFlowEventEvent) WinterFlowUnitTestResponse;
                        Object WinterFlowUnitTestResponse2 = winterFlowDatabaseSchemaStructure.WinterFlowUnitTestResponse(WinterFlowRendererJava.WinterFlowMapperProtocol);
                        WinterFlowExceptionPlatform winterFlowExceptionPlatform = (WinterFlowExceptionPlatform) (WinterFlowUnitTestResponse2 != null ? WinterFlowUnitTestResponse2 : null);
                        if (winterFlowEventEvent != null && winterFlowExceptionPlatform != null && ((Number) winterFlowExceptionPlatform.WinterFlowHookDataSource.WinterFlowRouterStructure()).floatValue() > 0.0f) {
                            int i3 = 1 + i;
                            winterFlowJavaResolver.WinterFlowUnitTestResponse(new WinterFlowRefactoringConsumer(winterFlowProcessorSystem2, i3, WinterFlowQueueService, WinterFlowArrayNetwork));
                            WinterFlowRouterAdapter(winterFlowProcessorSystem2, i3, winterFlowJavaResolver);
                        }
                    }
                }
            }
            WinterFlowSyntax = winterFlowProcessorSystem2.WinterFlowSyntax(false, false);
        }
    }

    public static final void WinterFlowRouterStructure(WinterFlowTransactionStructure winterFlowTransactionStructure, int i) {
        if (winterFlowTransactionStructure.WinterFlowHookDataSource == 0 || !(winterFlowTransactionStructure.WinterFlowHookDataSource(0) == i || winterFlowTransactionStructure.WinterFlowHookDataSource(winterFlowTransactionStructure.WinterFlowHookDataSource - 1) == i)) {
            int i2 = winterFlowTransactionStructure.WinterFlowHookDataSource;
            winterFlowTransactionStructure.WinterFlowRouterStructure(i);
            while (i2 > 0) {
                int i3 = ((i2 + 1) >>> 1) - 1;
                int WinterFlowHookDataSource = winterFlowTransactionStructure.WinterFlowHookDataSource(i3);
                if (i <= WinterFlowHookDataSource) {
                    break;
                }
                winterFlowTransactionStructure.WinterFlowArrayNetwork(i2, WinterFlowHookDataSource);
                i2 = i3;
            }
            winterFlowTransactionStructure.WinterFlowArrayNetwork(i2, i);
        }
    }

    public static void WinterFlowSerializerStructure(Parcel parcel, int i, int i2) {
        int WinterFlowConcurrencyThread = WinterFlowConcurrencyThread(parcel, i);
        if (WinterFlowConcurrencyThread == i2) {
            return;
        }
        String hexString = Integer.toHexString(WinterFlowConcurrencyThread);
        int length = String.valueOf(i2).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(WinterFlowConcurrencyThread).length() + 4 + 1);
        sb.append("Expected size ");
        sb.append(i2);
        sb.append(" got ");
        sb.append(WinterFlowConcurrencyThread);
        sb.append(" (0x");
        sb.append(hexString);
        sb.append(")");
        throw new WinterFlowServerSystem(sb.toString(), parcel);
    }

    public static final WinterFlowExceptionProxy WinterFlowServerProtocol(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
            WinterFlowExceptionProxy winterFlowExceptionProxy = tag instanceof WinterFlowExceptionProxy ? (WinterFlowExceptionProxy) tag : null;
            if (winterFlowExceptionProxy != null) {
                return winterFlowExceptionProxy;
            }
            Object WinterFlowCacheManagerAgent = WinterFlowProtocolNetwork.WinterFlowCacheManagerAgent(view);
            view = WinterFlowCacheManagerAgent instanceof View ? (View) WinterFlowCacheManagerAgent : null;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List WinterFlowServiceUtility(WinterFlowServiceProviderListener winterFlowServiceProviderListener, int i, WinterFlowServiceProviderListener winterFlowServiceProviderListener2, boolean z, boolean z2, boolean z3) {
        WinterFlowDataSourceEngine winterFlowDataSourceEngine;
        boolean z4;
        int i2;
        int i3;
        int WinterFlowBatchUI = winterFlowServiceProviderListener.WinterFlowBatchUI(i);
        int i4 = i + WinterFlowBatchUI;
        int WinterFlowTransactionManagerStrategy = winterFlowServiceProviderListener.WinterFlowTransactionManagerStrategy(winterFlowServiceProviderListener.WinterFlowHookDataSource, winterFlowServiceProviderListener.WinterFlowConcurrencyThread(i));
        int WinterFlowTransactionManagerStrategy2 = winterFlowServiceProviderListener.WinterFlowTransactionManagerStrategy(winterFlowServiceProviderListener.WinterFlowHookDataSource, winterFlowServiceProviderListener.WinterFlowConcurrencyThread(i4));
        int i5 = WinterFlowTransactionManagerStrategy2 - WinterFlowTransactionManagerStrategy;
        boolean z5 = i >= 0 && (winterFlowServiceProviderListener.WinterFlowHookDataSource[(winterFlowServiceProviderListener.WinterFlowConcurrencyThread(i) * 5) + 1] & 201326592) != 0;
        winterFlowServiceProviderListener2.WinterFlowSerializerStructure(WinterFlowBatchUI);
        winterFlowServiceProviderListener2.WinterFlowMapperProtocol(i5, winterFlowServiceProviderListener2.WinterFlowBatchUI);
        if (winterFlowServiceProviderListener.WinterFlowUnitTestResponse < i4) {
            winterFlowServiceProviderListener.WinterFlowEventEmitterController(i4);
        }
        if (winterFlowServiceProviderListener.WinterFlowTransactionAgent < WinterFlowTransactionManagerStrategy2) {
            winterFlowServiceProviderListener.WinterFlowArrayHelper(WinterFlowTransactionManagerStrategy2, i4);
        }
        int[] iArr = winterFlowServiceProviderListener2.WinterFlowHookDataSource;
        int i6 = winterFlowServiceProviderListener2.WinterFlowBatchUI;
        int i7 = i6 * 5;
        WinterFlowProtocolPipeline.WinterFlowCompilerHandler(winterFlowServiceProviderListener.WinterFlowHookDataSource, iArr, i7, i * 5, i4 * 5);
        Object[] objArr = winterFlowServiceProviderListener2.WinterFlowCacheManagerAgent;
        int i8 = winterFlowServiceProviderListener2.WinterFlowSyntax;
        System.arraycopy(winterFlowServiceProviderListener.WinterFlowCacheManagerAgent, WinterFlowTransactionManagerStrategy, objArr, i8, i5);
        int i9 = winterFlowServiceProviderListener2.WinterFlowSerializerStructure;
        iArr[i7 + 2] = i9;
        int i10 = i6 - i;
        int i11 = i6 + WinterFlowBatchUI;
        int WinterFlowTransactionManagerStrategy3 = i8 - winterFlowServiceProviderListener2.WinterFlowTransactionManagerStrategy(iArr, i6);
        int i12 = winterFlowServiceProviderListener2.WinterFlowThreadListener;
        int i13 = winterFlowServiceProviderListener2.WinterFlowServerProtocol;
        int length = objArr.length;
        boolean z6 = z5;
        int i14 = i12;
        int i15 = i6;
        while (i15 < i11) {
            if (i15 != i6) {
                int i16 = (i15 * 5) + 2;
                iArr[i16] = iArr[i16] + i10;
            }
            int[] iArr2 = iArr;
            int WinterFlowTransactionManagerStrategy4 = winterFlowServiceProviderListener2.WinterFlowTransactionManagerStrategy(iArr, i15) + WinterFlowTransactionManagerStrategy3;
            if (i14 < i15) {
                i2 = i6;
                i3 = 0;
            } else {
                i2 = i6;
                i3 = winterFlowServiceProviderListener2.WinterFlowTransactionAgent;
            }
            iArr2[(i15 * 5) + 4] = WinterFlowServiceProviderListener.WinterFlowRouterRouter(WinterFlowTransactionManagerStrategy4, i3, i13, length);
            if (i15 == i14) {
                i14++;
            }
            i15++;
            i6 = i2;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        winterFlowServiceProviderListener2.WinterFlowThreadListener = i14;
        int WinterFlowHookDataSource = WinterFlowQueryTool.WinterFlowHookDataSource(winterFlowServiceProviderListener.WinterFlowArrayNetwork, i, winterFlowServiceProviderListener.WinterFlowBandwidthObject());
        int WinterFlowHookDataSource2 = WinterFlowQueryTool.WinterFlowHookDataSource(winterFlowServiceProviderListener.WinterFlowArrayNetwork, i4, winterFlowServiceProviderListener.WinterFlowBandwidthObject());
        if (WinterFlowHookDataSource < WinterFlowHookDataSource2) {
            ArrayList arrayList = winterFlowServiceProviderListener.WinterFlowArrayNetwork;
            ArrayList arrayList2 = new ArrayList(WinterFlowHookDataSource2 - WinterFlowHookDataSource);
            for (int i17 = WinterFlowHookDataSource; i17 < WinterFlowHookDataSource2; i17++) {
                WinterFlowDatabaseSchemaHandler winterFlowDatabaseSchemaHandler = (WinterFlowDatabaseSchemaHandler) arrayList.get(i17);
                winterFlowDatabaseSchemaHandler.WinterFlowRouterStructure += i10;
                arrayList2.add(winterFlowDatabaseSchemaHandler);
            }
            winterFlowServiceProviderListener2.WinterFlowArrayNetwork.addAll(WinterFlowQueryTool.WinterFlowHookDataSource(winterFlowServiceProviderListener2.WinterFlowArrayNetwork, winterFlowServiceProviderListener2.WinterFlowBatchUI, winterFlowServiceProviderListener2.WinterFlowBandwidthObject()), arrayList2);
            arrayList.subList(WinterFlowHookDataSource, WinterFlowHookDataSource2).clear();
            winterFlowDataSourceEngine = arrayList2;
        } else {
            winterFlowDataSourceEngine = WinterFlowDataSourceEngine.WinterFlowVariableVersionControl;
        }
        if (!winterFlowDataSourceEngine.isEmpty()) {
            HashMap hashMap = winterFlowServiceProviderListener.WinterFlowVariableVersionControl;
            HashMap hashMap2 = winterFlowServiceProviderListener2.WinterFlowVariableVersionControl;
            if (hashMap != null && hashMap2 != null) {
                int size = winterFlowDataSourceEngine.size();
                for (int i18 = 0; i18 < size; i18++) {
                }
            }
        }
        int i19 = winterFlowServiceProviderListener2.WinterFlowSerializerStructure;
        winterFlowServiceProviderListener2.WinterFlowFrontendBackend(i9);
        int WinterFlowConfigurationSubsystem = winterFlowServiceProviderListener.WinterFlowConfigurationSubsystem(winterFlowServiceProviderListener.WinterFlowHookDataSource, i);
        if (!z3) {
            z4 = false;
        } else if (z) {
            boolean z7 = WinterFlowConfigurationSubsystem >= 0;
            if (z7) {
                winterFlowServiceProviderListener.WinterFlowCloudMicroservice();
                winterFlowServiceProviderListener.WinterFlowRouterStructure(WinterFlowConfigurationSubsystem - winterFlowServiceProviderListener.WinterFlowBatchUI);
                winterFlowServiceProviderListener.WinterFlowCloudMicroservice();
            }
            winterFlowServiceProviderListener.WinterFlowRouterStructure(i - winterFlowServiceProviderListener.WinterFlowBatchUI);
            boolean WinterFlowPackageIDE = winterFlowServiceProviderListener.WinterFlowPackageIDE();
            if (z7) {
                winterFlowServiceProviderListener.WinterFlowTestingNode();
                winterFlowServiceProviderListener.WinterFlowSyntax();
                winterFlowServiceProviderListener.WinterFlowTestingNode();
                winterFlowServiceProviderListener.WinterFlowSyntax();
            }
            z4 = WinterFlowPackageIDE;
        } else {
            boolean WinterFlowSoftwareProtocol = winterFlowServiceProviderListener.WinterFlowSoftwareProtocol(i, WinterFlowBatchUI);
            winterFlowServiceProviderListener.WinterFlowUserManagerUserManager(WinterFlowTransactionManagerStrategy, i5, i - 1);
            z4 = WinterFlowSoftwareProtocol;
        }
        if (z4) {
            WinterFlowSessionManagerEntity.WinterFlowRouterStructure("Unexpectedly removed anchors");
        }
        int i20 = winterFlowServiceProviderListener2.WinterFlowBandwidthObject;
        int i21 = iArr3[i7 + 1];
        winterFlowServiceProviderListener2.WinterFlowBandwidthObject = i20 + ((1073741824 & i21) != 0 ? 1 : i21 & 67108863);
        if (z2) {
            winterFlowServiceProviderListener2.WinterFlowBatchUI = i11;
            winterFlowServiceProviderListener2.WinterFlowSyntax = i8 + i5;
        }
        if (z6) {
            winterFlowServiceProviderListener2.WinterFlowProxyStructure(i9);
        }
        return winterFlowDataSourceEngine;
    }

    public static void WinterFlowSingletonPlatform(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + WinterFlowConcurrencyThread(parcel, i));
    }

    public static void WinterFlowSyntax(Parcel parcel, int i) {
        if (parcel.dataPosition() == i) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 26);
        sb.append("Overread allowed size end=");
        sb.append(i);
        throw new WinterFlowServerSystem(sb.toString(), parcel);
    }

    public static final boolean WinterFlowThreadListener(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    public static final WinterFlowStackProvider WinterFlowTransactionAgent(Matcher matcher, int i, CharSequence charSequence) {
        if (matcher.find(i)) {
            return new WinterFlowStackProvider(matcher, charSequence);
        }
        return null;
    }

    public static Object[] WinterFlowTransactionManagerStrategy(Parcel parcel, int i, Parcelable.Creator creator) {
        int WinterFlowConcurrencyThread = WinterFlowConcurrencyThread(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (WinterFlowConcurrencyThread == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + WinterFlowConcurrencyThread);
        return createTypedArray;
    }

    public static final int WinterFlowVariableBandwidth(WinterFlowTransactionStructure winterFlowTransactionStructure) {
        int WinterFlowHookDataSource;
        int i = winterFlowTransactionStructure.WinterFlowHookDataSource;
        int WinterFlowHookDataSource2 = winterFlowTransactionStructure.WinterFlowHookDataSource(0);
        while (winterFlowTransactionStructure.WinterFlowHookDataSource != 0 && winterFlowTransactionStructure.WinterFlowHookDataSource(0) == WinterFlowHookDataSource2) {
            int i2 = winterFlowTransactionStructure.WinterFlowHookDataSource;
            if (i2 == 0) {
                WinterFlowCompilerMechanism.WinterFlowSyntax("IntList is empty.");
                return 0;
            }
            winterFlowTransactionStructure.WinterFlowArrayNetwork(0, winterFlowTransactionStructure.WinterFlowRouterStructure[i2 - 1]);
            winterFlowTransactionStructure.WinterFlowCacheManagerAgent(winterFlowTransactionStructure.WinterFlowHookDataSource - 1);
            int i3 = winterFlowTransactionStructure.WinterFlowHookDataSource;
            int i4 = i3 >>> 1;
            int i5 = 0;
            while (i5 < i4) {
                int WinterFlowHookDataSource3 = winterFlowTransactionStructure.WinterFlowHookDataSource(i5);
                int i6 = (i5 + 1) * 2;
                int i7 = i6 - 1;
                int WinterFlowHookDataSource4 = winterFlowTransactionStructure.WinterFlowHookDataSource(i7);
                if (i6 >= i3 || (WinterFlowHookDataSource = winterFlowTransactionStructure.WinterFlowHookDataSource(i6)) <= WinterFlowHookDataSource4) {
                    if (WinterFlowHookDataSource4 > WinterFlowHookDataSource3) {
                        winterFlowTransactionStructure.WinterFlowArrayNetwork(i5, WinterFlowHookDataSource4);
                        winterFlowTransactionStructure.WinterFlowArrayNetwork(i7, WinterFlowHookDataSource3);
                        i5 = i7;
                    }
                } else if (WinterFlowHookDataSource > WinterFlowHookDataSource3) {
                    winterFlowTransactionStructure.WinterFlowArrayNetwork(i5, WinterFlowHookDataSource);
                    winterFlowTransactionStructure.WinterFlowArrayNetwork(i6, WinterFlowHookDataSource3);
                    i5 = i6;
                }
            }
        }
        return WinterFlowHookDataSource2;
    }

    public static String WinterFlowVariableVersionControl(Parcel parcel, int i) {
        int WinterFlowConcurrencyThread = WinterFlowConcurrencyThread(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (WinterFlowConcurrencyThread == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + WinterFlowConcurrencyThread);
        return readString;
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0184  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int WinterFlowRouterRouter(String str, byte[] bArr, int i, int i2) {
        int i3;
        char charAt;
        int i4;
        char charAt2;
        char c = 2048;
        char c2 = 55296;
        switch (this.WinterFlowRouterStructure) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int length = str.length();
                int i5 = i2 + i;
                int i6 = 0;
                while (i6 < length) {
                    int i7 = i6 + i;
                    if (i7 < i5 && (charAt = str.charAt(i6)) < 128) {
                        bArr[i7] = (byte) charAt;
                        i6++;
                    }
                    if (i6 != length) {
                        return i + length;
                    }
                    int i8 = i + i6;
                    while (i6 < length) {
                        char charAt3 = str.charAt(i6);
                        if (charAt3 < 128 && i8 < i5) {
                            bArr[i8] = (byte) charAt3;
                            i8++;
                        } else if (charAt3 < 2048 && i8 <= i5 - 2) {
                            int i9 = i8 + 1;
                            bArr[i8] = (byte) ((charAt3 >>> 6) | 960);
                            i8 += 2;
                            bArr[i9] = (byte) ((charAt3 & '?') | 128);
                        } else {
                            if ((charAt3 >= 55296 && 57343 >= charAt3) || i8 > i5 - 3) {
                                if (i8 > i5 - 4) {
                                    if (55296 <= charAt3 && charAt3 <= 57343 && ((i3 = i6 + 1) == str.length() || !Character.isSurrogatePair(charAt3, str.charAt(i3)))) {
                                        throw new WinterFlowDataSourceTesting(i6, length);
                                    }
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt3 + " at index " + i8);
                                }
                                int i10 = i6 + 1;
                                if (i10 != str.length()) {
                                    char charAt4 = str.charAt(i10);
                                    if (Character.isSurrogatePair(charAt3, charAt4)) {
                                        int codePoint = Character.toCodePoint(charAt3, charAt4);
                                        bArr[i8] = (byte) ((codePoint >>> 18) | 240);
                                        bArr[i8 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                        int i11 = i8 + 3;
                                        bArr[i8 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                        i8 += 4;
                                        bArr[i11] = (byte) ((codePoint & 63) | 128);
                                        i6 = i10;
                                    } else {
                                        i6 = i10;
                                    }
                                }
                                throw new WinterFlowDataSourceTesting(i6 - 1, length);
                            }
                            bArr[i8] = (byte) ((charAt3 >>> '\f') | 480);
                            int i12 = i8 + 2;
                            bArr[i8 + 1] = (byte) (((charAt3 >>> 6) & 63) | 128);
                            i8 += 3;
                            bArr[i12] = (byte) ((charAt3 & '?') | 128);
                        }
                        i6++;
                    }
                    return i8;
                }
                if (i6 != length) {
                }
                break;
            default:
                long j = i;
                long j2 = i2 + j;
                int length2 = str.length();
                if (length2 > i2 || bArr.length - i2 < i) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length2 - 1) + " at index " + (i + i2));
                }
                int i13 = 0;
                while (i13 < length2 && (charAt2 = str.charAt(i13)) < 128) {
                    WinterFlowRouterModule.WinterFlowResponseEngine(bArr, j, (byte) charAt2);
                    i13++;
                    j++;
                }
                if (i13 != length2) {
                    while (i13 < length2) {
                        char charAt5 = str.charAt(i13);
                        if (charAt5 < 128 && j < j2) {
                            WinterFlowRouterModule.WinterFlowResponseEngine(bArr, j, (byte) charAt5);
                            j++;
                        } else if (charAt5 >= c || j > j2 - 2) {
                            int i14 = i13;
                            if ((charAt5 >= c2 && 57343 >= charAt5) || j > j2 - 3) {
                                if (j > j2 - 4) {
                                    if (55296 <= charAt5 && charAt5 <= 57343 && ((i4 = i14 + 1) == length2 || !Character.isSurrogatePair(charAt5, str.charAt(i4)))) {
                                        throw new WinterFlowDataSourceTesting(i14, length2);
                                    }
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt5 + " at index " + j);
                                }
                                i13 = i14 + 1;
                                if (i13 != length2) {
                                    char charAt6 = str.charAt(i13);
                                    if (Character.isSurrogatePair(charAt5, charAt6)) {
                                        int codePoint2 = Character.toCodePoint(charAt5, charAt6);
                                        WinterFlowRouterModule.WinterFlowResponseEngine(bArr, j, (byte) ((codePoint2 >>> 18) | 240));
                                        WinterFlowRouterModule.WinterFlowResponseEngine(bArr, j + 1, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                        long j3 = j + 3;
                                        WinterFlowRouterModule.WinterFlowResponseEngine(bArr, j + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                        j += 4;
                                        WinterFlowRouterModule.WinterFlowResponseEngine(bArr, j3, (byte) ((codePoint2 & 63) | 128));
                                    }
                                } else {
                                    i13 = i14;
                                }
                                throw new WinterFlowDataSourceTesting(i13 - 1, length2);
                            }
                            WinterFlowRouterModule.WinterFlowResponseEngine(bArr, j, (byte) ((charAt5 >>> '\f') | 480));
                            long j4 = j + 2;
                            WinterFlowRouterModule.WinterFlowResponseEngine(bArr, j + 1, (byte) (((charAt5 >>> 6) & 63) | 128));
                            j += 3;
                            WinterFlowRouterModule.WinterFlowResponseEngine(bArr, j4, (byte) ((charAt5 & '?') | 128));
                            i13 = i14;
                        } else {
                            long j5 = j + 1;
                            WinterFlowRouterModule.WinterFlowResponseEngine(bArr, j, (byte) ((charAt5 >>> 6) | 960));
                            j += 2;
                            WinterFlowRouterModule.WinterFlowResponseEngine(bArr, j5, (byte) ((charAt5 & '?') | 128));
                            i13 = i13;
                        }
                        i13++;
                        c = 2048;
                        c2 = 55296;
                    }
                }
                return (int) j;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String WinterFlowUnitTestResponse(byte[] bArr, int i, int i2) {
        switch (this.WinterFlowRouterStructure) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
                }
                int i3 = i + i2;
                char[] cArr = new char[i2];
                int i4 = 0;
                while (i < i3) {
                    byte b = bArr[i];
                    if (b < 0) {
                        while (i < i3) {
                            int i5 = i + 1;
                            byte b2 = bArr[i];
                            if (b2 >= 0) {
                                int i6 = i4 + 1;
                                cArr[i4] = (char) b2;
                                while (i5 < i3) {
                                    byte b3 = bArr[i5];
                                    if (b3 >= 0) {
                                        i5++;
                                        cArr[i6] = (char) b3;
                                        i6++;
                                    } else {
                                        i4 = i6;
                                        i = i5;
                                    }
                                }
                                i4 = i6;
                                i = i5;
                            } else if (b2 < -32) {
                                if (i5 >= i3) {
                                    throw WinterFlowRouterAgent.WinterFlowRouterStructure();
                                }
                                i += 2;
                                byte b4 = bArr[i5];
                                int i7 = i4 + 1;
                                if (b2 < -62 || WinterFlowHookProcessor.WinterFlowServiceUtility(b4)) {
                                    throw WinterFlowRouterAgent.WinterFlowRouterStructure();
                                }
                                cArr[i4] = (char) ((b4 & 63) | ((b2 & 31) << 6));
                                i4 = i7;
                            } else {
                                if (b2 >= -16) {
                                    if (i5 >= i3 - 2) {
                                        throw WinterFlowRouterAgent.WinterFlowRouterStructure();
                                    }
                                    byte b5 = bArr[i5];
                                    int i8 = i + 3;
                                    byte b6 = bArr[i + 2];
                                    i += 4;
                                    byte b7 = bArr[i8];
                                    int i9 = i4 + 1;
                                    if (!WinterFlowHookProcessor.WinterFlowServiceUtility(b5)) {
                                        if ((((b5 + 112) + (b2 << 28)) >> 30) == 0 && !WinterFlowHookProcessor.WinterFlowServiceUtility(b6) && !WinterFlowHookProcessor.WinterFlowServiceUtility(b7)) {
                                            int i10 = ((b5 & 63) << 12) | ((b2 & 7) << 18) | ((b6 & 63) << 6) | (b7 & 63);
                                            cArr[i4] = (char) ((i10 >>> 10) + 55232);
                                            cArr[i9] = (char) ((i10 & 1023) + 56320);
                                            i4 += 2;
                                        }
                                    }
                                    throw WinterFlowRouterAgent.WinterFlowRouterStructure();
                                }
                                if (i5 >= i3 - 1) {
                                    throw WinterFlowRouterAgent.WinterFlowRouterStructure();
                                }
                                int i11 = i + 2;
                                byte b8 = bArr[i5];
                                i += 3;
                                byte b9 = bArr[i11];
                                int i12 = i4 + 1;
                                if (WinterFlowHookProcessor.WinterFlowServiceUtility(b8) || ((b2 == -32 && b8 < -96) || ((b2 == -19 && b8 >= -96) || WinterFlowHookProcessor.WinterFlowServiceUtility(b9)))) {
                                    throw WinterFlowRouterAgent.WinterFlowRouterStructure();
                                }
                                cArr[i4] = (char) (((b8 & 63) << 6) | ((b2 & 15) << 12) | (b9 & 63));
                                i4 = i12;
                            }
                        }
                        return new String(cArr, 0, i4);
                    }
                    i++;
                    cArr[i4] = (char) b;
                    i4++;
                }
                while (i < i3) {
                }
                return new String(cArr, 0, i4);
            default:
                Charset charset = WinterFlowMapperConcurrency.WinterFlowRouterStructure;
                String str = new String(bArr, i, i2, charset);
                if (str.indexOf(65533) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i, i2 + i))) {
                    throw WinterFlowRouterAgent.WinterFlowRouterStructure();
                }
                return str;
        }
    }
}
