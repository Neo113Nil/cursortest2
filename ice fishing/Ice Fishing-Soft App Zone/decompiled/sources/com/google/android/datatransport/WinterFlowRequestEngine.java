package com.google.android.datatransport;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.Layout;
import android.text.TextUtils;
import com.icewinter.flow.winter.icecatch.ColdActivity;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowRequestEngine implements WinterFlowSoftwareStrategy, WinterFlowDataSourceVersion, WinterFlowCloudCache {
    public Object WinterFlowRouterRouter;
    public Object WinterFlowSyntax;
    public Object WinterFlowTransactionManagerStrategy;
    public final Object WinterFlowUnitTestResponse;
    public final Object WinterFlowVariableVersionControl;

    public WinterFlowRequestEngine(WinterFlowQueueManager winterFlowQueueManager, WinterFlowDataSourceVersion winterFlowDataSourceVersion) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        Set<WinterFlowOrchestrationConcurrency> set = winterFlowQueueManager.WinterFlowCacheManagerAgent;
        Set set2 = winterFlowQueueManager.WinterFlowUnitTestResponse;
        for (WinterFlowOrchestrationConcurrency winterFlowOrchestrationConcurrency : set) {
            int i = winterFlowOrchestrationConcurrency.WinterFlowCacheManagerAgent;
            int i2 = winterFlowOrchestrationConcurrency.WinterFlowHookDataSource;
            boolean z = i == 0;
            WinterFlowValidatorProcess winterFlowValidatorProcess = winterFlowOrchestrationConcurrency.WinterFlowRouterStructure;
            if (z) {
                if (i2 == 2) {
                    hashSet4.add(winterFlowValidatorProcess);
                } else {
                    hashSet.add(winterFlowValidatorProcess);
                }
            } else if (i == 2) {
                hashSet3.add(winterFlowValidatorProcess);
            } else if (i2 == 2) {
                hashSet5.add(winterFlowValidatorProcess);
            } else {
                hashSet2.add(winterFlowValidatorProcess);
            }
        }
        if (!set2.isEmpty()) {
            hashSet.add(WinterFlowValidatorProcess.WinterFlowRouterStructure(WinterFlowServiceProviderEngine.class));
        }
        this.WinterFlowVariableVersionControl = Collections.unmodifiableSet(hashSet);
        this.WinterFlowTransactionManagerStrategy = Collections.unmodifiableSet(hashSet2);
        Collections.unmodifiableSet(hashSet3);
        this.WinterFlowUnitTestResponse = Collections.unmodifiableSet(hashSet4);
        this.WinterFlowRouterRouter = Collections.unmodifiableSet(hashSet5);
        this.WinterFlowSyntax = winterFlowDataSourceVersion;
    }

    @Override // com.google.android.datatransport.WinterFlowDataSourceVersion
    public WinterFlowHookInheritance WinterFlowArrayNetwork(Class cls) {
        return WinterFlowTransactionManagerStrategy(WinterFlowValidatorProcess.WinterFlowRouterStructure(cls));
    }

    @Override // com.google.android.datatransport.WinterFlowDataSourceVersion
    public Set WinterFlowCacheManagerAgent(WinterFlowValidatorProcess winterFlowValidatorProcess) {
        if (((Set) this.WinterFlowUnitTestResponse).contains(winterFlowValidatorProcess)) {
            return ((WinterFlowDataSourceVersion) this.WinterFlowSyntax).WinterFlowCacheManagerAgent(winterFlowValidatorProcess);
        }
        WinterFlowEventEmitterOrchestration.WinterFlowOrchestrationSubsystem("Attempting to request an undeclared dependency Set<", winterFlowValidatorProcess, ">.");
        return null;
    }

    @Override // com.google.android.datatransport.WinterFlowDataSourceVersion
    public WinterFlowHookInheritance WinterFlowHookDataSource(WinterFlowValidatorProcess winterFlowValidatorProcess) {
        if (((Set) this.WinterFlowRouterRouter).contains(winterFlowValidatorProcess)) {
            return ((WinterFlowDataSourceVersion) this.WinterFlowSyntax).WinterFlowHookDataSource(winterFlowValidatorProcess);
        }
        WinterFlowEventEmitterOrchestration.WinterFlowOrchestrationSubsystem("Attempting to request an undeclared dependency Provider<Set<", winterFlowValidatorProcess, ">>.");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:168:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public float WinterFlowResponseEngine(int i, boolean z, boolean z2) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z3;
        Bidi bidi;
        boolean z4;
        int i6;
        int i7;
        ArrayList arrayList = (ArrayList) this.WinterFlowTransactionManagerStrategy;
        Layout layout = (Layout) this.WinterFlowVariableVersionControl;
        if (!z2) {
            return WinterFlowSyntax(i, z);
        }
        int WinterFlowArrayHelper = WinterFlowManagerRequest.WinterFlowArrayHelper(layout, i, z2);
        int lineStart = layout.getLineStart(WinterFlowArrayHelper);
        int lineEnd = layout.getLineEnd(WinterFlowArrayHelper);
        if (i != lineStart && i != lineEnd) {
            return WinterFlowSyntax(i, z);
        }
        if (i == 0 || i == layout.getText().length()) {
            return WinterFlowSyntax(i, z);
        }
        Integer valueOf = Integer.valueOf(i);
        int size = arrayList.size();
        arrayList.getClass();
        int size2 = arrayList.size();
        if (size < 0) {
            throw new IllegalArgumentException("fromIndex (0) is greater than toIndex (" + size + ").");
        }
        if (size > size2) {
            WinterFlowEventEmitterOrchestration.WinterFlowArrayNetwork(size, size2, ") is greater than size (", "toIndex (");
            return 0.0f;
        }
        int i8 = size - 1;
        int i9 = 0;
        while (true) {
            if (i9 > i8) {
                i2 = -(i9 + 1);
                break;
            }
            i2 = (i9 + i8) >>> 1;
            int WinterFlowUnitTestResponse = WinterFlowQuerySyntax.WinterFlowUnitTestResponse((Comparable) arrayList.get(i2), valueOf);
            if (WinterFlowUnitTestResponse >= 0) {
                if (WinterFlowUnitTestResponse <= 0) {
                    break;
                }
                i8 = i2 - 1;
            } else {
                i9 = i2 + 1;
            }
        }
        int i10 = i2 < 0 ? -(i2 + 1) : i2 + 1;
        if (z2 && i10 > 0) {
            int i11 = i10 - 1;
            if (i == ((Number) arrayList.get(i11)).intValue()) {
                i10 = i11;
            }
        }
        boolean z5 = layout.getParagraphDirection(layout.getLineForOffset(i10 == 0 ? 0 : ((Number) arrayList.get(i10 + (-1))).intValue())) == -1;
        int WinterFlowServerProtocol = WinterFlowServerProtocol(lineEnd, lineStart);
        int intValue = i10 == 0 ? 0 : ((Number) arrayList.get(i10 - 1)).intValue();
        int i12 = lineStart - intValue;
        int i13 = WinterFlowServerProtocol - intValue;
        ArrayList arrayList2 = (ArrayList) this.WinterFlowUnitTestResponse;
        boolean[] zArr = (boolean[]) this.WinterFlowRouterRouter;
        if (zArr[i10]) {
            bidi = (Bidi) arrayList2.get(i10);
            i4 = WinterFlowArrayHelper;
            i3 = WinterFlowServerProtocol;
            i5 = -1;
        } else {
            int intValue2 = i10 == 0 ? 0 : ((Number) arrayList.get(i10 - 1)).intValue();
            int intValue3 = ((Number) arrayList.get(i10)).intValue();
            int i14 = intValue3 - intValue2;
            char[] cArr = (char[]) this.WinterFlowSyntax;
            i3 = WinterFlowServerProtocol;
            if (cArr == null || cArr.length < i14) {
                cArr = new char[i14];
            }
            i4 = WinterFlowArrayHelper;
            TextUtils.getChars(layout.getText(), intValue2, intValue3, cArr, 0);
            if (Bidi.requiresBidi(cArr, 0, i14)) {
                i5 = -1;
                Bidi bidi2 = new Bidi(cArr, 0, null, 0, i14, layout.getParagraphDirection(layout.getLineForOffset(i10 == 0 ? 0 : ((Number) arrayList.get(i10 + (-1))).intValue())) == -1 ? 1 : 0);
                z3 = true;
                if (bidi2.getRunCount() != 1) {
                    bidi = bidi2;
                    arrayList2.set(i10, bidi);
                    zArr[i10] = z3;
                    if (bidi != null) {
                        char[] cArr2 = (char[]) this.WinterFlowSyntax;
                        cArr = cArr == cArr2 ? null : cArr2;
                    }
                    this.WinterFlowSyntax = cArr;
                }
            } else {
                i5 = -1;
                z3 = true;
            }
            bidi = null;
            arrayList2.set(i10, bidi);
            zArr[i10] = z3;
            if (bidi != null) {
            }
            this.WinterFlowSyntax = cArr;
        }
        Bidi createLineBidi = bidi != null ? bidi.createLineBidi(i12, i13) : null;
        if (createLineBidi == null) {
            z4 = true;
        } else {
            if (createLineBidi.getRunCount() != 1) {
                int runCount = createLineBidi.getRunCount();
                WinterFlowEventEmitterArray[] winterFlowEventEmitterArrayArr = new WinterFlowEventEmitterArray[runCount];
                for (int i15 = 0; i15 < runCount; i15++) {
                    winterFlowEventEmitterArrayArr[i15] = new WinterFlowEventEmitterArray(createLineBidi.getRunStart(i15) + lineStart, createLineBidi.getRunLimit(i15) + lineStart, createLineBidi.getRunLevel(i15) % 2 == 1);
                }
                int runCount2 = createLineBidi.getRunCount();
                byte[] bArr = new byte[runCount2];
                for (int i16 = 0; i16 < runCount2; i16++) {
                    bArr[i16] = (byte) createLineBidi.getRunLevel(i16);
                }
                boolean z6 = false;
                Bidi.reorderVisually(bArr, 0, winterFlowEventEmitterArrayArr, 0, runCount);
                if (i != lineStart) {
                    int i17 = i4;
                    int WinterFlowServerProtocol2 = i > i3 ? WinterFlowServerProtocol(i, lineStart) : i;
                    int i18 = 0;
                    while (true) {
                        if (i18 >= runCount) {
                            i6 = i5;
                            break;
                        }
                        if (winterFlowEventEmitterArrayArr[i18].WinterFlowHookDataSource == WinterFlowServerProtocol2) {
                            i6 = i18;
                            break;
                        }
                        i18++;
                    }
                    WinterFlowEventEmitterArray winterFlowEventEmitterArray = winterFlowEventEmitterArrayArr[i6];
                    if (z || z5 == winterFlowEventEmitterArray.WinterFlowCacheManagerAgent) {
                        z6 = z5;
                    } else if (!z5) {
                        z6 = true;
                    }
                    return (i6 == 0 && z6) ? layout.getLineLeft(i17) : (i6 != runCount + (-1) || z6) ? z6 ? layout.getPrimaryHorizontal(winterFlowEventEmitterArrayArr[i6 - 1].WinterFlowHookDataSource) : layout.getPrimaryHorizontal(winterFlowEventEmitterArrayArr[i6 + 1].WinterFlowHookDataSource) : layout.getLineRight(i17);
                }
                int i19 = 0;
                while (true) {
                    if (i19 >= runCount) {
                        i7 = i5;
                        break;
                    }
                    if (winterFlowEventEmitterArrayArr[i19].WinterFlowRouterStructure == i) {
                        i7 = i19;
                        break;
                    }
                    i19++;
                }
                WinterFlowEventEmitterArray winterFlowEventEmitterArray2 = winterFlowEventEmitterArrayArr[i7];
                if (!z && z5 != winterFlowEventEmitterArray2.WinterFlowCacheManagerAgent) {
                    z6 = z5;
                } else if (!z5) {
                    z6 = true;
                }
                if (i7 == 0 && z6) {
                    return layout.getLineLeft(i4);
                }
                return (i7 != runCount + (-1) || z6) ? z6 ? layout.getPrimaryHorizontal(winterFlowEventEmitterArrayArr[i7 - 1].WinterFlowRouterStructure) : layout.getPrimaryHorizontal(winterFlowEventEmitterArrayArr[i7 + 1].WinterFlowRouterStructure) : layout.getLineRight(i4);
            }
            z4 = true;
        }
        int i20 = i4;
        boolean isRtlCharAt = layout.isRtlCharAt(lineStart);
        if (z || z5 == isRtlCharAt) {
            z5 = !z5 ? z4 : false;
        }
        return i == lineStart ? z5 : !z5 ? z4 : false ? layout.getLineLeft(i20) : layout.getLineRight(i20);
    }

    public void WinterFlowRouterRouter(WinterFlowObjectSession winterFlowObjectSession) {
        int i;
        synchronized (this.WinterFlowVariableVersionControl) {
            try {
                WinterFlowMicroserviceFunction winterFlowMicroserviceFunction = (WinterFlowMicroserviceFunction) this.WinterFlowRouterRouter;
                this.WinterFlowRouterRouter = (WinterFlowMicroserviceFunction) this.WinterFlowSyntax;
                this.WinterFlowSyntax = winterFlowMicroserviceFunction;
                WinterFlowFunctionEncryption winterFlowFunctionEncryption = (WinterFlowFunctionEncryption) this.WinterFlowUnitTestResponse;
                do {
                    i = winterFlowFunctionEncryption.get();
                } while (!winterFlowFunctionEncryption.compareAndSet(i, ((((i >>> 27) & 15) + 1) & 15) << 27));
                int i2 = winterFlowMicroserviceFunction.WinterFlowHookDataSource;
                for (int i3 = 0; i3 < i2; i3++) {
                    winterFlowObjectSession.WinterFlowUnitTestResponse(winterFlowMicroserviceFunction.WinterFlowTransactionManagerStrategy(i3));
                }
                winterFlowMicroserviceFunction.WinterFlowArrayNetwork();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.datatransport.WinterFlowDataSourceVersion
    public Object WinterFlowRouterStructure(Class cls) {
        if (!((Set) this.WinterFlowVariableVersionControl).contains(WinterFlowValidatorProcess.WinterFlowRouterStructure(cls))) {
            WinterFlowEventEmitterOrchestration.WinterFlowOrchestrationSubsystem("Attempting to request an undeclared dependency ", cls, ".");
            return null;
        }
        Object WinterFlowRouterStructure = ((WinterFlowDataSourceVersion) this.WinterFlowSyntax).WinterFlowRouterStructure(cls);
        if (!cls.equals(WinterFlowServiceProviderEngine.class)) {
            return WinterFlowRouterStructure;
        }
        return new WinterFlowResponseScheduler();
    }

    public int WinterFlowServerProtocol(int i, int i2) {
        while (i > i2) {
            char charAt = ((Layout) this.WinterFlowVariableVersionControl).getText().charAt(i - 1);
            if (charAt != ' ' && charAt != '\n' && charAt != 5760 && ((WinterFlowManagerRequest.WinterFlowBatchUI(charAt, 8192) < 0 || WinterFlowManagerRequest.WinterFlowBatchUI(charAt, 8202) > 0 || charAt == 8199) && charAt != 8287 && charAt != 12288)) {
                return i;
            }
            i--;
        }
        return i;
    }

    public float WinterFlowSyntax(int i, boolean z) {
        Layout layout = (Layout) this.WinterFlowVariableVersionControl;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i));
        if (i > lineEnd) {
            i = lineEnd;
        }
        return z ? layout.getPrimaryHorizontal(i) : layout.getSecondaryHorizontal(i);
    }

    public void WinterFlowThreadListener(Object obj, String str) {
        str.getClass();
        ((LinkedHashMap) this.WinterFlowVariableVersionControl).put(str, obj);
        WinterFlowHandlerPlatform winterFlowHandlerPlatform = (WinterFlowHandlerPlatform) ((LinkedHashMap) this.WinterFlowUnitTestResponse).get(str);
        if (winterFlowHandlerPlatform != null) {
            winterFlowHandlerPlatform.WinterFlowResponseEngine(obj);
        }
        WinterFlowHandlerPlatform winterFlowHandlerPlatform2 = (WinterFlowHandlerPlatform) ((LinkedHashMap) this.WinterFlowRouterRouter).get(str);
        if (winterFlowHandlerPlatform2 != null) {
            winterFlowHandlerPlatform2.WinterFlowResponseEngine(obj);
        }
    }

    public boolean WinterFlowTransactionAgent() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        com.google.firebase.WinterFlowSyntaxEvent winterFlowSyntaxEvent = (com.google.firebase.WinterFlowSyntaxEvent) this.WinterFlowTransactionManagerStrategy;
        winterFlowSyntaxEvent.WinterFlowRouterStructure();
        Context context = winterFlowSyntaxEvent.WinterFlowRouterStructure;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (bundle = (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)).metaData) == null || !bundle.containsKey("firebase_messaging_installation_id_enabled")) {
                return false;
            }
            return applicationInfo.metaData.getBoolean("firebase_messaging_installation_id_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    @Override // com.google.android.datatransport.WinterFlowDataSourceVersion
    public WinterFlowHookInheritance WinterFlowTransactionManagerStrategy(WinterFlowValidatorProcess winterFlowValidatorProcess) {
        if (((Set) this.WinterFlowTransactionManagerStrategy).contains(winterFlowValidatorProcess)) {
            return ((WinterFlowDataSourceVersion) this.WinterFlowSyntax).WinterFlowTransactionManagerStrategy(winterFlowValidatorProcess);
        }
        WinterFlowEventEmitterOrchestration.WinterFlowOrchestrationSubsystem("Attempting to request an undeclared dependency Provider<", winterFlowValidatorProcess, ">.");
        return null;
    }

    public WinterFlowClassNetwork WinterFlowUnitTestResponse(WinterFlowConsumerComponent winterFlowConsumerComponent, WinterFlowObjectUI winterFlowObjectUI) {
        int i;
        int i2;
        int i3;
        WinterFlowTransactionInterface winterFlowTransactionInterface = new WinterFlowTransactionInterface();
        winterFlowTransactionInterface.WinterFlowVariableVersionControl = -1;
        synchronized (this.WinterFlowVariableVersionControl) {
            Throwable th = (Throwable) this.WinterFlowTransactionManagerStrategy;
            if (th != null) {
                winterFlowConsumerComponent.WinterFlowHookDataSource(th);
                return WinterFlowCacheUtility.WinterFlowSerializerStructure;
            }
            WinterFlowFunctionEncryption winterFlowFunctionEncryption = (WinterFlowFunctionEncryption) this.WinterFlowUnitTestResponse;
            do {
                i = winterFlowFunctionEncryption.get();
                i2 = i + 1;
            } while (!winterFlowFunctionEncryption.compareAndSet(i, i2));
            int i4 = 0;
            boolean z = (134217727 & i2) == 1;
            winterFlowTransactionInterface.WinterFlowVariableVersionControl = (i2 >>> 27) & 15;
            ((WinterFlowMicroserviceFunction) this.WinterFlowRouterRouter).WinterFlowRouterStructure(winterFlowConsumerComponent);
            if (z) {
                try {
                    winterFlowObjectUI.WinterFlowRouterStructure();
                } catch (Throwable th2) {
                    synchronized (this.WinterFlowVariableVersionControl) {
                        try {
                            if (((Throwable) this.WinterFlowTransactionManagerStrategy) == null) {
                                this.WinterFlowTransactionManagerStrategy = th2;
                                WinterFlowMicroserviceFunction winterFlowMicroserviceFunction = (WinterFlowMicroserviceFunction) this.WinterFlowRouterRouter;
                                Object[] objArr = winterFlowMicroserviceFunction.WinterFlowRouterStructure;
                                int i5 = winterFlowMicroserviceFunction.WinterFlowHookDataSource;
                                for (int i6 = 0; i6 < i5; i6++) {
                                    ((WinterFlowConsumerComponent) objArr[i6]).WinterFlowHookDataSource(th2);
                                }
                                ((WinterFlowMicroserviceFunction) this.WinterFlowRouterRouter).WinterFlowArrayNetwork();
                                WinterFlowFunctionEncryption winterFlowFunctionEncryption2 = (WinterFlowFunctionEncryption) this.WinterFlowUnitTestResponse;
                                do {
                                    i3 = winterFlowFunctionEncryption2.get();
                                } while (!winterFlowFunctionEncryption2.compareAndSet(i3, ((((i3 >>> 27) & 15) + 1) & 15) << 27));
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            }
            return new WinterFlowAlgorithmArray(new WinterFlowRouterHelper(winterFlowConsumerComponent, this, winterFlowTransactionInterface, i4));
        }
    }

    @Override // com.google.android.datatransport.WinterFlowDataSourceVersion
    public Object WinterFlowVariableVersionControl(WinterFlowValidatorProcess winterFlowValidatorProcess) {
        if (((Set) this.WinterFlowVariableVersionControl).contains(winterFlowValidatorProcess)) {
            return ((WinterFlowDataSourceVersion) this.WinterFlowSyntax).WinterFlowVariableVersionControl(winterFlowValidatorProcess);
        }
        WinterFlowEventEmitterOrchestration.WinterFlowOrchestrationSubsystem("Attempting to request an undeclared dependency ", winterFlowValidatorProcess, ".");
        return null;
    }

    @Override // com.google.android.datatransport.WinterFlowSoftwareStrategy
    public Object get() {
        return new WinterFlowDatabaseSchemaBatch((Executor) ((WinterFlowSoftwareStrategy) this.WinterFlowVariableVersionControl).get(), (WinterFlowDataSource) ((WinterFlowSoftwareStrategy) this.WinterFlowTransactionManagerStrategy).get(), (WinterFlowObjectPackage) ((WinterFlowObjectPackage) this.WinterFlowUnitTestResponse).get(), (WinterFlowFrameworkManager) ((WinterFlowSoftwareStrategy) this.WinterFlowRouterRouter).get(), (WinterFlowFrameworkManager) ((WinterFlowSoftwareStrategy) this.WinterFlowSyntax).get());
    }

    @Override // com.google.android.datatransport.WinterFlowCloudCache
    public Object getValue() {
        WinterFlowTransactionVariable winterFlowTransactionVariable = (WinterFlowTransactionVariable) this.WinterFlowSyntax;
        if (winterFlowTransactionVariable != null) {
            return winterFlowTransactionVariable;
        }
        WinterFlowStackProvider winterFlowStackProvider = new WinterFlowStackProvider(((ColdActivity) ((WinterFlowUserManagerDatabase) this.WinterFlowTransactionManagerStrategy).WinterFlowTransactionManagerStrategy).WinterFlowTransactionManagerStrategy(), (WinterFlowUserManagerUserManager) ((WinterFlowQueueProcess) this.WinterFlowUnitTestResponse).WinterFlowRouterStructure(), ((ColdActivity) ((WinterFlowUserManagerDatabase) this.WinterFlowRouterRouter).WinterFlowTransactionManagerStrategy).WinterFlowVariableVersionControl());
        WinterFlowEventEmitterCacheManager winterFlowEventEmitterCacheManager = (WinterFlowEventEmitterCacheManager) this.WinterFlowVariableVersionControl;
        String WinterFlowHookDataSource = winterFlowEventEmitterCacheManager.WinterFlowHookDataSource();
        if (WinterFlowHookDataSource == null) {
            WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("Local and anonymous classes can not be ViewModels");
            return null;
        }
        WinterFlowTransactionVariable WinterFlowConcurrencyThread = winterFlowStackProvider.WinterFlowConcurrencyThread(winterFlowEventEmitterCacheManager, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(WinterFlowHookDataSource));
        this.WinterFlowSyntax = WinterFlowConcurrencyThread;
        return WinterFlowConcurrencyThread;
    }

    public WinterFlowRequestEngine(Map map) {
        map.getClass();
        this.WinterFlowVariableVersionControl = new LinkedHashMap(map);
        this.WinterFlowTransactionManagerStrategy = new LinkedHashMap();
        this.WinterFlowUnitTestResponse = new LinkedHashMap();
        this.WinterFlowRouterRouter = new LinkedHashMap();
        this.WinterFlowSyntax = new WinterFlowTestingRepository(2, this);
    }

    public WinterFlowRequestEngine(WinterFlowSoftwareStrategy winterFlowSoftwareStrategy, WinterFlowSoftwareStrategy winterFlowSoftwareStrategy2, WinterFlowObjectPackage winterFlowObjectPackage, WinterFlowSoftwareStrategy winterFlowSoftwareStrategy3, WinterFlowSoftwareStrategy winterFlowSoftwareStrategy4) {
        this.WinterFlowVariableVersionControl = winterFlowSoftwareStrategy;
        this.WinterFlowTransactionManagerStrategy = winterFlowSoftwareStrategy2;
        this.WinterFlowUnitTestResponse = winterFlowObjectPackage;
        this.WinterFlowRouterRouter = winterFlowSoftwareStrategy3;
        this.WinterFlowSyntax = winterFlowSoftwareStrategy4;
    }

    public WinterFlowRequestEngine() {
        this.WinterFlowVariableVersionControl = new Object();
        this.WinterFlowUnitTestResponse = new WinterFlowFunctionEncryption(0);
        this.WinterFlowRouterRouter = new WinterFlowMicroserviceFunction();
        this.WinterFlowSyntax = new WinterFlowMicroserviceFunction();
    }

    public WinterFlowRequestEngine(Layout layout) {
        this.WinterFlowVariableVersionControl = layout;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        do {
            int WinterFlowEventEmitterController = WinterFlowFrameworkStrategy.WinterFlowEventEmitterController(((Layout) this.WinterFlowVariableVersionControl).getText(), '\n', i, 4);
            i = WinterFlowEventEmitterController < 0 ? ((Layout) this.WinterFlowVariableVersionControl).getText().length() : WinterFlowEventEmitterController + 1;
            arrayList.add(Integer.valueOf(i));
        } while (i < ((Layout) this.WinterFlowVariableVersionControl).getText().length());
        this.WinterFlowTransactionManagerStrategy = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList2.add(null);
        }
        this.WinterFlowUnitTestResponse = arrayList2;
        this.WinterFlowRouterRouter = new boolean[((ArrayList) this.WinterFlowTransactionManagerStrategy).size()];
        ((ArrayList) this.WinterFlowTransactionManagerStrategy).size();
    }

    public WinterFlowRequestEngine(WinterFlowEventEmitterCacheManager winterFlowEventEmitterCacheManager, WinterFlowUserManagerDatabase winterFlowUserManagerDatabase, WinterFlowQueueProcess winterFlowQueueProcess, WinterFlowUserManagerDatabase winterFlowUserManagerDatabase2) {
        this.WinterFlowVariableVersionControl = winterFlowEventEmitterCacheManager;
        this.WinterFlowTransactionManagerStrategy = winterFlowUserManagerDatabase;
        this.WinterFlowUnitTestResponse = winterFlowQueueProcess;
        this.WinterFlowRouterRouter = winterFlowUserManagerDatabase2;
    }

    public WinterFlowRequestEngine(Context context, com.google.firebase.WinterFlowSyntaxEvent winterFlowSyntaxEvent, WinterFlowDatabaseSchemaBandwidth winterFlowDatabaseSchemaBandwidth, WinterFlowSchedulerParser winterFlowSchedulerParser, WinterFlowAdapterUnitTest winterFlowAdapterUnitTest) {
        this.WinterFlowVariableVersionControl = new WinterFlowConsumerStrategy(context, WinterFlowConsumerStrategy.WinterFlowServerProtocol, WinterFlowEventEmitterLayer.WinterFlowRouterStructure, WinterFlowMiddlewareSubsystem.WinterFlowHookDataSource);
        this.WinterFlowTransactionManagerStrategy = winterFlowSyntaxEvent;
        this.WinterFlowUnitTestResponse = winterFlowDatabaseSchemaBandwidth;
        this.WinterFlowRouterRouter = winterFlowSchedulerParser;
        this.WinterFlowSyntax = winterFlowAdapterUnitTest;
    }
}
