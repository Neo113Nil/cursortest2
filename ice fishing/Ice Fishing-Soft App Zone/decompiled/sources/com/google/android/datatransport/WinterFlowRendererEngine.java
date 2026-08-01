package com.google.android.datatransport;

import android.graphics.Typeface;
import android.os.LocaleList;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.ScaleXSpan;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.PriorityQueue;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowRendererEngine implements WinterFlowBatchSession {
    public final boolean WinterFlowBandwidthObject;
    public final int WinterFlowOrchestrationSubsystem;
    public final WinterFlowConcurrencyParser WinterFlowResponseEngine;
    public final List WinterFlowRouterRouter;
    public final CharSequence WinterFlowServerProtocol;
    public WinterFlowObjectPackage WinterFlowServiceUtility;
    public final WinterFlowDatabaseGateway WinterFlowSyntax;
    public final WinterFlowParserComponent WinterFlowThreadListener;
    public final WinterFlowRendererTransactionManager WinterFlowTransactionAgent;
    public final WinterFlowEncryptionServer WinterFlowTransactionManagerStrategy;
    public final List WinterFlowUnitTestResponse;
    public final String WinterFlowVariableVersionControl;

    /* JADX WARN: Code restructure failed: missing block: B:156:0x04b7, code lost:
    
        if ((r5.WinterFlowHookDataSource.WinterFlowCacheManagerAgent & 1095216660480L) == 0) goto L503;
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x009b, code lost:
    
        if (r7 == 1) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x063b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x066f  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0786  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x08d2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0946  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0970 A[LOOP:7: B:317:0x096e->B:318:0x0970, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0981  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x09ab  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x06ed  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0560  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x0101 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:492:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02d2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00ab  */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.datatransport.WinterFlowRendererEngine, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v84, types: [android.text.Spannable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public WinterFlowRendererEngine(String str, WinterFlowEncryptionServer winterFlowEncryptionServer, List list, List list2, WinterFlowDatabaseGateway winterFlowDatabaseGateway, WinterFlowConcurrencyParser winterFlowConcurrencyParser) {
        boolean booleanValue;
        Locale locale;
        int i;
        WinterFlowDataSourceLibrary winterFlowDataSourceLibrary;
        int i2;
        WinterFlowDebugUtility winterFlowDebugUtility;
        int size;
        int i3;
        Object obj;
        boolean z;
        String str2;
        WinterFlowRuntimeException winterFlowRuntimeException;
        WinterFlowBatchLayer winterFlowBatchLayer;
        WinterFlowServiceRefactoring winterFlowServiceRefactoring;
        long j;
        long WinterFlowHookDataSource;
        WinterFlowRendererSystem winterFlowRendererSystem;
        boolean z2;
        WinterFlowDataSourceLibrary winterFlowDataSourceLibrary2;
        WinterFlowBatchLayer winterFlowBatchLayer2;
        WinterFlowControllerInvoker WinterFlowHookDataSource2;
        Typeface typeface;
        WinterFlowDebugUtility winterFlowDebugUtility2;
        List list3;
        ?? r1;
        WinterFlowEncryptionServer winterFlowEncryptionServer2;
        boolean z3;
        String str3;
        float f;
        CharSequence charSequence;
        long j2;
        WinterFlowRendererEngine winterFlowRendererEngine;
        WinterFlowUnitTestStructure winterFlowUnitTestStructure;
        float WinterFlowConcurrencyThread;
        int i4;
        int length;
        WinterFlowHandlerComponent winterFlowHandlerComponent;
        List list4;
        Object obj2;
        ArrayList arrayList;
        int size2;
        int i5;
        ArrayList arrayList2;
        WinterFlowDebugUtility winterFlowDebugUtility3;
        int i6;
        int size3;
        boolean z4;
        int i7;
        List list5;
        WinterFlowHandlerComponent winterFlowHandlerComponent2;
        int size4;
        int i8;
        List list6;
        int i9;
        boolean z5;
        int i10;
        int i11;
        WinterFlowObjectBackend winterFlowObjectBackend;
        int i12;
        WinterFlowMapperTool winterFlowMapperTool;
        int i13;
        WinterFlowHandlerHandler[] winterFlowHandlerHandlerArr;
        WinterFlowObjectBackend winterFlowObjectBackend2;
        ?? obj3 = new Object();
        obj3.WinterFlowVariableVersionControl = str;
        obj3.WinterFlowTransactionManagerStrategy = winterFlowEncryptionServer;
        obj3.WinterFlowUnitTestResponse = list;
        obj3.WinterFlowRouterRouter = list2;
        obj3.WinterFlowSyntax = winterFlowDatabaseGateway;
        obj3.WinterFlowResponseEngine = winterFlowConcurrencyParser;
        float WinterFlowHookDataSource3 = winterFlowConcurrencyParser.WinterFlowHookDataSource();
        WinterFlowRendererTransactionManager winterFlowRendererTransactionManager = new WinterFlowRendererTransactionManager(1);
        ((TextPaint) winterFlowRendererTransactionManager).density = WinterFlowHookDataSource3;
        winterFlowRendererTransactionManager.WinterFlowHookDataSource = WinterFlowProcessorProcess.WinterFlowHookDataSource;
        winterFlowRendererTransactionManager.WinterFlowCacheManagerAgent = 3;
        winterFlowRendererTransactionManager.WinterFlowArrayNetwork = WinterFlowMicroserviceScheduler.WinterFlowArrayNetwork;
        obj3.WinterFlowTransactionAgent = winterFlowRendererTransactionManager;
        int i14 = 0;
        if (WinterFlowManagerRequest.WinterFlowBackendCacheManager(winterFlowEncryptionServer)) {
            WinterFlowConfigurationModule winterFlowConfigurationModule = WinterFlowServiceService.WinterFlowRouterStructure;
            WinterFlowConfigurationModule winterFlowConfigurationModule2 = WinterFlowServiceService.WinterFlowRouterStructure;
            WinterFlowBatchCacheManager winterFlowBatchCacheManager = (WinterFlowBatchCacheManager) winterFlowConfigurationModule2.WinterFlowTransactionManagerStrategy;
            if (winterFlowBatchCacheManager == null) {
                if (WinterFlowIDEEngine.WinterFlowTransactionAgent != null) {
                    winterFlowBatchCacheManager = winterFlowConfigurationModule2.WinterFlowTransactionAgent();
                    winterFlowConfigurationModule2.WinterFlowTransactionManagerStrategy = winterFlowBatchCacheManager;
                } else {
                    winterFlowBatchCacheManager = WinterFlowEncryptionSubsystem.WinterFlowTransactionManagerStrategy;
                }
            }
            booleanValue = ((Boolean) winterFlowBatchCacheManager.getValue()).booleanValue();
        } else {
            booleanValue = false;
        }
        obj3.WinterFlowBandwidthObject = booleanValue;
        int i15 = winterFlowEncryptionServer.WinterFlowHookDataSource.WinterFlowHookDataSource;
        WinterFlowRuntimeException winterFlowRuntimeException2 = winterFlowEncryptionServer.WinterFlowRouterStructure.WinterFlowTransactionAgent;
        if (i15 != 4) {
            if (i15 != 5) {
                if (i15 == 1) {
                    i = 0;
                } else if (i15 == 2) {
                    i = 1;
                } else {
                    if (i15 != 3 && i15 != 0) {
                        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Invalid TextDirection.");
                        throw null;
                    }
                    int layoutDirectionFromLocale = TextUtils.getLayoutDirectionFromLocale((winterFlowRuntimeException2 == null || (locale = ((WinterFlowGatewayEngine) winterFlowRuntimeException2.WinterFlowVariableVersionControl.get(0)).WinterFlowRouterStructure) == null) ? Locale.getDefault() : locale);
                    if (layoutDirectionFromLocale != 0) {
                    }
                }
                obj3.WinterFlowOrchestrationSubsystem = i;
                winterFlowDataSourceLibrary = new WinterFlowDataSourceLibrary(i14, obj3);
                WinterFlowPipelineLibrary winterFlowPipelineLibrary = winterFlowEncryptionServer.WinterFlowHookDataSource.WinterFlowSyntax;
                winterFlowPipelineLibrary = winterFlowPipelineLibrary == null ? WinterFlowPipelineLibrary.WinterFlowCacheManagerAgent : winterFlowPipelineLibrary;
                winterFlowRendererTransactionManager.setFlags(winterFlowPipelineLibrary.WinterFlowHookDataSource ? winterFlowRendererTransactionManager.getFlags() | 128 : winterFlowRendererTransactionManager.getFlags() & (-129));
                i2 = winterFlowPipelineLibrary.WinterFlowRouterStructure;
                if (i2 == 1) {
                    winterFlowRendererTransactionManager.setFlags(winterFlowRendererTransactionManager.getFlags() | 64);
                    winterFlowRendererTransactionManager.setHinting(0);
                } else if (i2 == 2) {
                    winterFlowRendererTransactionManager.getFlags();
                    winterFlowRendererTransactionManager.setHinting(1);
                } else if (i2 == 3) {
                    winterFlowRendererTransactionManager.getFlags();
                    winterFlowRendererTransactionManager.setHinting(0);
                } else {
                    winterFlowRendererTransactionManager.getFlags();
                }
                winterFlowDebugUtility = winterFlowEncryptionServer.WinterFlowRouterStructure;
                size = list.size();
                i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        obj = null;
                        break;
                    }
                    obj = list.get(i3);
                    if (((WinterFlowVariableTransaction) obj).WinterFlowRouterStructure instanceof WinterFlowDebugUtility) {
                        break;
                    } else {
                        i3++;
                    }
                }
                z = obj != null;
                long j3 = winterFlowDebugUtility.WinterFlowHookDataSource;
                str2 = winterFlowDebugUtility.WinterFlowUnitTestResponse;
                winterFlowRuntimeException = winterFlowDebugUtility.WinterFlowTransactionAgent;
                winterFlowBatchLayer = winterFlowDebugUtility.WinterFlowRouterStructure;
                winterFlowServiceRefactoring = winterFlowDebugUtility.WinterFlowResponseEngine;
                j = winterFlowDebugUtility.WinterFlowRouterRouter;
                WinterFlowHookDataSource = WinterFlowOrchestrationPlatform.WinterFlowHookDataSource(j3);
                if (WinterFlowInheritanceValidator.WinterFlowRouterStructure(WinterFlowHookDataSource, 4294967296L)) {
                    winterFlowRendererTransactionManager.setTextSize(winterFlowConcurrencyParser.WinterFlowValidatorHandler(j3));
                } else if (WinterFlowInheritanceValidator.WinterFlowRouterStructure(WinterFlowHookDataSource, 8589934592L)) {
                    winterFlowRendererTransactionManager.setTextSize(WinterFlowOrchestrationPlatform.WinterFlowCacheManagerAgent(j3) * winterFlowRendererTransactionManager.getTextSize());
                }
                winterFlowRendererSystem = winterFlowDebugUtility.WinterFlowTransactionManagerStrategy;
                if (winterFlowRendererSystem != null && winterFlowDebugUtility.WinterFlowArrayNetwork == null && winterFlowDebugUtility.WinterFlowCacheManagerAgent == null) {
                    z2 = z;
                    winterFlowDataSourceLibrary2 = winterFlowDataSourceLibrary;
                    winterFlowBatchLayer2 = winterFlowBatchLayer;
                } else {
                    WinterFlowObjectHook winterFlowObjectHook = winterFlowDebugUtility.WinterFlowCacheManagerAgent;
                    winterFlowObjectHook = winterFlowObjectHook == null ? WinterFlowObjectHook.WinterFlowSyntax : winterFlowObjectHook;
                    WinterFlowPackageTool winterFlowPackageTool = winterFlowDebugUtility.WinterFlowArrayNetwork;
                    int i16 = winterFlowPackageTool != null ? winterFlowPackageTool.WinterFlowRouterStructure : 0;
                    WinterFlowManagerResponse winterFlowManagerResponse = winterFlowDebugUtility.WinterFlowVariableVersionControl;
                    int i17 = winterFlowManagerResponse != null ? winterFlowManagerResponse.WinterFlowRouterStructure : 65535;
                    z2 = z;
                    winterFlowDataSourceLibrary2 = winterFlowDataSourceLibrary;
                    WinterFlowRendererEngine winterFlowRendererEngine2 = (WinterFlowRendererEngine) winterFlowDataSourceLibrary2.WinterFlowTransactionManagerStrategy;
                    winterFlowBatchLayer2 = winterFlowBatchLayer;
                    WinterFlowHookDataSource2 = ((WinterFlowObjectUtility) winterFlowRendererEngine2.WinterFlowSyntax).WinterFlowHookDataSource(winterFlowRendererSystem, winterFlowObjectHook, i16, i17);
                    if (WinterFlowHookDataSource2 instanceof WinterFlowCacheNode) {
                        Object obj4 = ((WinterFlowCacheNode) WinterFlowHookDataSource2).WinterFlowVariableVersionControl;
                        obj4.getClass();
                        typeface = (Typeface) obj4;
                    } else {
                        WinterFlowObjectPackage winterFlowObjectPackage = new WinterFlowObjectPackage(WinterFlowHookDataSource2, winterFlowRendererEngine2.WinterFlowServiceUtility);
                        winterFlowRendererEngine2.WinterFlowServiceUtility = winterFlowObjectPackage;
                        Object obj5 = winterFlowObjectPackage.WinterFlowRouterRouter;
                        obj5.getClass();
                        typeface = (Typeface) obj5;
                    }
                    winterFlowRendererTransactionManager.setTypeface(typeface);
                }
                if (winterFlowRuntimeException != null) {
                    WinterFlowRuntimeException winterFlowRuntimeException3 = WinterFlowRuntimeException.WinterFlowUnitTestResponse;
                    if (!winterFlowRuntimeException.equals(WinterFlowCacheRuntime.WinterFlowConsumerUserManager())) {
                        ArrayList arrayList3 = new ArrayList(WinterFlowModuleThread.WinterFlowModuleAgent(winterFlowRuntimeException, 10));
                        Iterator it = winterFlowRuntimeException.WinterFlowVariableVersionControl.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(((WinterFlowGatewayEngine) it.next()).WinterFlowRouterStructure);
                        }
                        Locale[] localeArr = (Locale[]) arrayList3.toArray(new Locale[0]);
                        winterFlowRendererTransactionManager.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
                    }
                }
                if (str2 != null && !str2.equals("")) {
                    winterFlowRendererTransactionManager.setFontFeatureSettings(str2);
                }
                if (winterFlowServiceRefactoring != null && !winterFlowServiceRefactoring.equals(WinterFlowServiceRefactoring.WinterFlowCacheManagerAgent)) {
                    winterFlowRendererTransactionManager.setTextScaleX(winterFlowRendererTransactionManager.getTextScaleX() * winterFlowServiceRefactoring.WinterFlowRouterStructure);
                    winterFlowRendererTransactionManager.setTextSkewX(winterFlowRendererTransactionManager.getTextSkewX() + winterFlowServiceRefactoring.WinterFlowHookDataSource);
                }
                winterFlowRendererTransactionManager.WinterFlowArrayNetwork(winterFlowBatchLayer2.WinterFlowArrayNetwork());
                winterFlowRendererTransactionManager.WinterFlowCacheManagerAgent(winterFlowBatchLayer2.WinterFlowTransactionAgent(), 9205357640488583168L, winterFlowBatchLayer2.WinterFlowHookDataSource());
                winterFlowRendererTransactionManager.WinterFlowTransactionManagerStrategy(winterFlowDebugUtility.WinterFlowServiceUtility);
                winterFlowRendererTransactionManager.WinterFlowUnitTestResponse(winterFlowDebugUtility.WinterFlowThreadListener);
                winterFlowRendererTransactionManager.WinterFlowVariableVersionControl(winterFlowDebugUtility.WinterFlowBandwidthObject);
                if (!WinterFlowInheritanceValidator.WinterFlowRouterStructure(WinterFlowOrchestrationPlatform.WinterFlowHookDataSource(j), 4294967296L) && WinterFlowOrchestrationPlatform.WinterFlowCacheManagerAgent(j) != 0.0f) {
                    float textScaleX = winterFlowRendererTransactionManager.getTextScaleX() * winterFlowRendererTransactionManager.getTextSize();
                    float WinterFlowValidatorHandler = winterFlowConcurrencyParser.WinterFlowValidatorHandler(j);
                    if (textScaleX != 0.0f) {
                        winterFlowRendererTransactionManager.setLetterSpacing(WinterFlowValidatorHandler / textScaleX);
                    }
                } else if (WinterFlowInheritanceValidator.WinterFlowRouterStructure(WinterFlowOrchestrationPlatform.WinterFlowHookDataSource(j), 8589934592L)) {
                    winterFlowRendererTransactionManager.setLetterSpacing(WinterFlowOrchestrationPlatform.WinterFlowCacheManagerAgent(j));
                }
                long j4 = winterFlowDebugUtility.WinterFlowServerProtocol;
                WinterFlowEventEmitterThreadPool winterFlowEventEmitterThreadPool = winterFlowDebugUtility.WinterFlowSyntax;
                boolean z6 = (z2 || !WinterFlowInheritanceValidator.WinterFlowRouterStructure(WinterFlowOrchestrationPlatform.WinterFlowHookDataSource(j), 4294967296L) || WinterFlowOrchestrationPlatform.WinterFlowCacheManagerAgent(j) == 0.0f) ? false : true;
                long j5 = WinterFlowInheritanceSubsystem.WinterFlowResponseEngine;
                boolean z7 = WinterFlowUnitTestSoftware.WinterFlowRouterStructure(j4, j5) && !WinterFlowUnitTestSoftware.WinterFlowRouterStructure(j4, WinterFlowInheritanceSubsystem.WinterFlowSyntax);
                boolean z8 = winterFlowEventEmitterThreadPool == null && Float.compare(winterFlowEventEmitterThreadPool.WinterFlowRouterStructure, 0.0f) != 0;
                winterFlowDebugUtility2 = (!z6 || z7 || z8) ? new WinterFlowDebugUtility(0L, 0L, (WinterFlowObjectHook) null, (WinterFlowPackageTool) null, (WinterFlowManagerResponse) null, (WinterFlowRendererSystem) null, (String) null, z6 ? j : WinterFlowOrchestrationPlatform.WinterFlowCacheManagerAgent, z8 ? winterFlowEventEmitterThreadPool : null, (WinterFlowServiceRefactoring) null, (WinterFlowRuntimeException) null, z7 ? j4 : j5, (WinterFlowProcessorProcess) null, (WinterFlowMicroserviceScheduler) null, 63103) : null;
                list3 = obj3.WinterFlowUnitTestResponse;
                if (winterFlowDebugUtility2 != null) {
                    int size5 = list3.size() + 1;
                    ArrayList arrayList4 = new ArrayList(size5);
                    int i18 = 0;
                    while (i18 < size5) {
                        arrayList4.add(i18 == 0 ? new WinterFlowVariableTransaction(0, obj3.WinterFlowVariableVersionControl.length(), winterFlowDebugUtility2) : (WinterFlowVariableTransaction) obj3.WinterFlowUnitTestResponse.get(i18 - 1));
                        i18++;
                    }
                    list3 = arrayList4;
                }
                r1 = obj3.WinterFlowVariableVersionControl;
                float textSize = obj3.WinterFlowTransactionAgent.getTextSize();
                winterFlowEncryptionServer2 = obj3.WinterFlowTransactionManagerStrategy;
                List list7 = obj3.WinterFlowRouterRouter;
                WinterFlowConcurrencyParser winterFlowConcurrencyParser2 = obj3.WinterFlowResponseEngine;
                z3 = obj3.WinterFlowBandwidthObject;
                WinterFlowServiceUserManager winterFlowServiceUserManager = WinterFlowSoftwareInterface.WinterFlowRouterStructure;
                if (z3 || WinterFlowIDEEngine.WinterFlowTransactionAgent == null) {
                    str3 = r1;
                    f = 0.0f;
                    charSequence = str3;
                } else {
                    WinterFlowUnitTestStructure winterFlowUnitTestStructure2 = winterFlowEncryptionServer2.WinterFlowCacheManagerAgent;
                    WinterFlowProcessorProcessor winterFlowProcessorProcessor = (winterFlowUnitTestStructure2 == null || (winterFlowObjectBackend2 = winterFlowUnitTestStructure2.WinterFlowRouterStructure) == null) ? null : new WinterFlowProcessorProcessor(winterFlowObjectBackend2.WinterFlowHookDataSource);
                    boolean z9 = winterFlowProcessorProcessor != null && winterFlowProcessorProcessor.WinterFlowRouterStructure == 2;
                    WinterFlowIDEEngine WinterFlowRouterStructure = WinterFlowIDEEngine.WinterFlowRouterStructure();
                    int length2 = r1.length();
                    if (!(WinterFlowRouterStructure.WinterFlowHookDataSource() == 1)) {
                        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Not initialized yet");
                        throw null;
                    }
                    if (length2 < 0) {
                        WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("end cannot be negative");
                        throw null;
                    }
                    if (!(length2 >= 0)) {
                        WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("start should be <= than end");
                        throw null;
                    }
                    if (!(r1.length() >= 0)) {
                        WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("start should be < than charSequence length");
                        throw null;
                    }
                    if (!(length2 <= r1.length())) {
                        WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("end should be < than charSequence length");
                        throw null;
                    }
                    if (r1.length() == 0 || length2 == 0) {
                        str3 = r1;
                        f = 0.0f;
                    } else {
                        boolean z10 = z9;
                        WinterFlowObjectPackage winterFlowObjectPackage2 = WinterFlowRouterStructure.WinterFlowVariableVersionControl.WinterFlowHookDataSource;
                        winterFlowObjectPackage2.getClass();
                        if (r1 instanceof Spannable) {
                            winterFlowMapperTool = new WinterFlowMapperTool((Spannable) r1);
                            i12 = 0;
                        } else if (!(r1 instanceof Spanned) || ((Spanned) r1).nextSpanTransition(-1, length2 + 1, WinterFlowHandlerHandler.class) > length2) {
                            i12 = 0;
                            winterFlowMapperTool = null;
                        } else {
                            winterFlowMapperTool = new WinterFlowMapperTool();
                            i12 = 0;
                            winterFlowMapperTool.WinterFlowVariableVersionControl = false;
                            winterFlowMapperTool.WinterFlowTransactionManagerStrategy = new SpannableString(r1);
                        }
                        if (winterFlowMapperTool == null || (winterFlowHandlerHandlerArr = (WinterFlowHandlerHandler[]) winterFlowMapperTool.WinterFlowTransactionManagerStrategy.getSpans(i12, length2, WinterFlowHandlerHandler.class)) == null || winterFlowHandlerHandlerArr.length <= 0) {
                            str3 = r1;
                            f = 0.0f;
                            i13 = 0;
                        } else {
                            int length3 = winterFlowHandlerHandlerArr.length;
                            f = 0.0f;
                            i13 = 0;
                            int i19 = 0;
                            String str4 = r1;
                            while (true) {
                                str3 = str4;
                                if (i19 >= length3) {
                                    break;
                                }
                                WinterFlowHandlerHandler winterFlowHandlerHandler = winterFlowHandlerHandlerArr[i19];
                                int i20 = i19;
                                int spanStart = winterFlowMapperTool.WinterFlowTransactionManagerStrategy.getSpanStart(winterFlowHandlerHandler);
                                int i21 = length3;
                                int spanEnd = winterFlowMapperTool.WinterFlowTransactionManagerStrategy.getSpanEnd(winterFlowHandlerHandler);
                                if (spanStart != length2) {
                                    winterFlowMapperTool.removeSpan(winterFlowHandlerHandler);
                                }
                                i13 = Math.min(spanStart, i13);
                                length2 = Math.max(spanEnd, length2);
                                i19 = i20 + 1;
                                length3 = i21;
                                str4 = str3;
                            }
                        }
                        if (i13 != length2 && i13 < str3.length()) {
                            WinterFlowMapperTool winterFlowMapperTool2 = (WinterFlowMapperTool) winterFlowObjectPackage2.WinterFlowVariableBandwidth(str3, i13, length2, Integer.MAX_VALUE, z10, new WinterFlowAlgorithmArray(9, winterFlowMapperTool, (WinterFlowThreadPoolProcess) winterFlowObjectPackage2.WinterFlowTransactionManagerStrategy));
                            if (winterFlowMapperTool2 != null) {
                                charSequence = winterFlowMapperTool2.WinterFlowTransactionManagerStrategy;
                                charSequence.getClass();
                            }
                        }
                    }
                    charSequence = str3;
                    charSequence.getClass();
                }
                if (!list3.isEmpty() && list7.isEmpty() && WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowEncryptionServer2.WinterFlowHookDataSource.WinterFlowArrayNetwork, WinterFlowHandlerComponent.WinterFlowCacheManagerAgent)) {
                    j2 = 0;
                    winterFlowRendererEngine = obj3;
                } else {
                    j2 = 0;
                }
                SpannableString spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence);
                if (WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowEncryptionServer2.WinterFlowRouterStructure.WinterFlowThreadListener, WinterFlowProcessorProcess.WinterFlowCacheManagerAgent)) {
                    spannableString.setSpan(WinterFlowSoftwareInterface.WinterFlowRouterStructure, 0, str3.length(), 33);
                }
                winterFlowUnitTestStructure = winterFlowEncryptionServer2.WinterFlowCacheManagerAgent;
                if ((winterFlowUnitTestStructure != null || (winterFlowObjectBackend = winterFlowUnitTestStructure.WinterFlowRouterStructure) == null) ? false : winterFlowObjectBackend.WinterFlowRouterStructure) {
                    WinterFlowFrameworkArray winterFlowFrameworkArray = winterFlowEncryptionServer2.WinterFlowHookDataSource;
                    if (winterFlowFrameworkArray.WinterFlowTransactionManagerStrategy == null) {
                        float WinterFlowConcurrencyThread2 = WinterFlowHookProcessor.WinterFlowConcurrencyThread(winterFlowFrameworkArray.WinterFlowCacheManagerAgent, textSize, winterFlowConcurrencyParser2);
                        if (!Float.isNaN(WinterFlowConcurrencyThread2)) {
                            spannableString.setSpan(new WinterFlowDebugDataSource(WinterFlowConcurrencyThread2), 0, spannableString.length(), 33);
                        }
                        winterFlowHandlerComponent = winterFlowEncryptionServer2.WinterFlowHookDataSource.WinterFlowArrayNetwork;
                        if (winterFlowHandlerComponent == null) {
                            long j6 = winterFlowHandlerComponent.WinterFlowRouterStructure;
                            list4 = list3;
                            long j7 = winterFlowHandlerComponent.WinterFlowHookDataSource;
                            if ((!WinterFlowOrchestrationPlatform.WinterFlowRouterStructure(j6, WinterFlowDecoratorUI.WinterFlowBatchUI(0)) || !WinterFlowOrchestrationPlatform.WinterFlowRouterStructure(j7, WinterFlowDecoratorUI.WinterFlowBatchUI(0))) && (j6 & 1095216660480L) != j2 && (j7 & 1095216660480L) != j2) {
                                long WinterFlowHookDataSource4 = WinterFlowOrchestrationPlatform.WinterFlowHookDataSource(j6);
                                obj2 = WinterFlowHandlerHandler.class;
                                float WinterFlowValidatorHandler2 = WinterFlowInheritanceValidator.WinterFlowRouterStructure(WinterFlowHookDataSource4, 4294967296L) ? winterFlowConcurrencyParser2.WinterFlowValidatorHandler(j6) : WinterFlowInheritanceValidator.WinterFlowRouterStructure(WinterFlowHookDataSource4, 8589934592L) ? WinterFlowOrchestrationPlatform.WinterFlowCacheManagerAgent(j6) * textSize : f;
                                long WinterFlowHookDataSource5 = WinterFlowOrchestrationPlatform.WinterFlowHookDataSource(j7);
                                spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(WinterFlowValidatorHandler2), (int) Math.ceil(WinterFlowInheritanceValidator.WinterFlowRouterStructure(WinterFlowHookDataSource5, 4294967296L) ? winterFlowConcurrencyParser2.WinterFlowValidatorHandler(j7) : WinterFlowInheritanceValidator.WinterFlowRouterStructure(WinterFlowHookDataSource5, 8589934592L) ? WinterFlowOrchestrationPlatform.WinterFlowCacheManagerAgent(j7) * textSize : f)), 0, spannableString.length(), 33);
                                arrayList = new ArrayList(list4.size());
                                size2 = list4.size();
                                i5 = 0;
                                while (i5 < size2) {
                                    List list8 = list4;
                                    WinterFlowVariableTransaction winterFlowVariableTransaction = (WinterFlowVariableTransaction) list8.get(i5);
                                    Object obj6 = winterFlowVariableTransaction.WinterFlowRouterStructure;
                                    if (obj6 instanceof WinterFlowDebugUtility) {
                                        WinterFlowDebugUtility winterFlowDebugUtility4 = (WinterFlowDebugUtility) obj6;
                                        if (winterFlowDebugUtility4.WinterFlowTransactionManagerStrategy != null || winterFlowDebugUtility4.WinterFlowArrayNetwork != null || winterFlowDebugUtility4.WinterFlowCacheManagerAgent != null || ((WinterFlowDebugUtility) obj6).WinterFlowVariableVersionControl != null) {
                                            arrayList.add(winterFlowVariableTransaction);
                                        }
                                    }
                                    i5++;
                                    list4 = list8;
                                }
                                List list9 = list4;
                                WinterFlowDebugUtility winterFlowDebugUtility5 = winterFlowEncryptionServer2.WinterFlowRouterStructure;
                                WinterFlowRendererSystem winterFlowRendererSystem2 = winterFlowDebugUtility5.WinterFlowTransactionManagerStrategy;
                                WinterFlowDebugUtility winterFlowDebugUtility6 = (winterFlowRendererSystem2 != null && winterFlowDebugUtility5.WinterFlowArrayNetwork == null && winterFlowDebugUtility5.WinterFlowCacheManagerAgent == null && winterFlowDebugUtility5.WinterFlowVariableVersionControl == null) ? null : new WinterFlowDebugUtility(0L, 0L, winterFlowDebugUtility5.WinterFlowCacheManagerAgent, winterFlowDebugUtility5.WinterFlowArrayNetwork, winterFlowDebugUtility5.WinterFlowVariableVersionControl, winterFlowRendererSystem2, (String) null, 0L, (WinterFlowEventEmitterThreadPool) null, (WinterFlowServiceRefactoring) null, (WinterFlowRuntimeException) null, 0L, (WinterFlowProcessorProcess) null, (WinterFlowMicroserviceScheduler) null, 65475);
                                WinterFlowInvokerWebsocket winterFlowInvokerWebsocket = new WinterFlowInvokerWebsocket(1, spannableString, winterFlowDataSourceLibrary2);
                                if (arrayList.size() > 1) {
                                    int size6 = arrayList.size();
                                    int i22 = size6 * 2;
                                    int[] iArr = new int[i22];
                                    int size7 = arrayList.size();
                                    for (int i23 = 0; i23 < size7; i23++) {
                                        WinterFlowVariableTransaction winterFlowVariableTransaction2 = (WinterFlowVariableTransaction) arrayList.get(i23);
                                        iArr[i23] = winterFlowVariableTransaction2.WinterFlowHookDataSource;
                                        iArr[i23 + size6] = winterFlowVariableTransaction2.WinterFlowCacheManagerAgent;
                                    }
                                    if (i22 > 1) {
                                        Arrays.sort(iArr);
                                    }
                                    if (i22 == 0) {
                                        WinterFlowCompilerMechanism.WinterFlowSyntax("Array is empty.");
                                        throw null;
                                    }
                                    int i24 = iArr[0];
                                    int i25 = 0;
                                    while (i25 < i22) {
                                        int i26 = iArr[i25];
                                        if (i26 == i24) {
                                            arrayList2 = arrayList;
                                            winterFlowDebugUtility3 = winterFlowDebugUtility6;
                                            i6 = i22;
                                        } else {
                                            int size8 = arrayList.size();
                                            WinterFlowDebugUtility winterFlowDebugUtility7 = winterFlowDebugUtility6;
                                            int i27 = 0;
                                            while (i27 < size8) {
                                                ArrayList arrayList5 = arrayList;
                                                WinterFlowVariableTransaction winterFlowVariableTransaction3 = (WinterFlowVariableTransaction) arrayList.get(i27);
                                                WinterFlowDebugUtility winterFlowDebugUtility8 = winterFlowDebugUtility6;
                                                int i28 = winterFlowVariableTransaction3.WinterFlowHookDataSource;
                                                int i29 = i22;
                                                int i30 = winterFlowVariableTransaction3.WinterFlowCacheManagerAgent;
                                                if (i28 != i30 && WinterFlowAlgorithmStrategy.WinterFlowRouterStructure(i24, i26, i28, i30)) {
                                                    WinterFlowDebugUtility winterFlowDebugUtility9 = (WinterFlowDebugUtility) winterFlowVariableTransaction3.WinterFlowRouterStructure;
                                                    winterFlowDebugUtility7 = winterFlowDebugUtility7 != null ? winterFlowDebugUtility7.WinterFlowCacheManagerAgent(winterFlowDebugUtility9) : winterFlowDebugUtility9;
                                                }
                                                i27++;
                                                arrayList = arrayList5;
                                                winterFlowDebugUtility6 = winterFlowDebugUtility8;
                                                i22 = i29;
                                            }
                                            arrayList2 = arrayList;
                                            winterFlowDebugUtility3 = winterFlowDebugUtility6;
                                            i6 = i22;
                                            if (winterFlowDebugUtility7 != null) {
                                                winterFlowInvokerWebsocket.WinterFlowArrayNetwork(winterFlowDebugUtility7, Integer.valueOf(i24), Integer.valueOf(i26));
                                            }
                                            i24 = i26;
                                        }
                                        i25++;
                                        arrayList = arrayList2;
                                        winterFlowDebugUtility6 = winterFlowDebugUtility3;
                                        i22 = i6;
                                    }
                                } else if (!arrayList.isEmpty()) {
                                    WinterFlowDebugUtility winterFlowDebugUtility10 = (WinterFlowDebugUtility) ((WinterFlowVariableTransaction) arrayList.get(0)).WinterFlowRouterStructure;
                                    winterFlowInvokerWebsocket.WinterFlowArrayNetwork(winterFlowDebugUtility6 != null ? winterFlowDebugUtility6.WinterFlowCacheManagerAgent(winterFlowDebugUtility10) : winterFlowDebugUtility10, Integer.valueOf(((WinterFlowVariableTransaction) arrayList.get(0)).WinterFlowHookDataSource), Integer.valueOf(((WinterFlowVariableTransaction) arrayList.get(0)).WinterFlowCacheManagerAgent));
                                }
                                size3 = list9.size();
                                z4 = false;
                                i7 = 0;
                                while (i7 < size3) {
                                    WinterFlowVariableTransaction winterFlowVariableTransaction4 = (WinterFlowVariableTransaction) list9.get(i7);
                                    Object obj7 = winterFlowVariableTransaction4.WinterFlowRouterStructure;
                                    if (obj7 instanceof WinterFlowDebugUtility) {
                                        int i31 = winterFlowVariableTransaction4.WinterFlowHookDataSource;
                                        int i32 = winterFlowVariableTransaction4.WinterFlowCacheManagerAgent;
                                        if (i31 >= 0 && i31 < spannableString.length() && i32 > i31 && i32 <= spannableString.length()) {
                                            WinterFlowDebugUtility winterFlowDebugUtility11 = (WinterFlowDebugUtility) obj7;
                                            WinterFlowEventEmitterThreadPool winterFlowEventEmitterThreadPool2 = winterFlowDebugUtility11.WinterFlowSyntax;
                                            WinterFlowBatchLayer winterFlowBatchLayer3 = winterFlowDebugUtility11.WinterFlowRouterStructure;
                                            if (winterFlowEventEmitterThreadPool2 != null) {
                                                spannableString.setSpan(new WinterFlowVersionControlSystem(winterFlowEventEmitterThreadPool2.WinterFlowRouterStructure, 0), i31, i32, 33);
                                            }
                                            WinterFlowHookProcessor.WinterFlowSingletonPlatform(spannableString, winterFlowBatchLayer3.WinterFlowArrayNetwork(), i31, i32);
                                            WinterFlowHandlerWebsocket WinterFlowTransactionAgent = winterFlowBatchLayer3.WinterFlowTransactionAgent();
                                            float WinterFlowHookDataSource6 = winterFlowBatchLayer3.WinterFlowHookDataSource();
                                            if (WinterFlowTransactionAgent != null) {
                                                if (WinterFlowTransactionAgent instanceof WinterFlowRouterFramework) {
                                                    WinterFlowHookProcessor.WinterFlowSingletonPlatform(spannableString, ((WinterFlowRouterFramework) WinterFlowTransactionAgent).WinterFlowBatchUI, i31, i32);
                                                } else {
                                                    spannableString.setSpan(new WinterFlowBandwidthUtility((WinterFlowTransactionManagerEvent) WinterFlowTransactionAgent, WinterFlowHookDataSource6), i31, i32, 33);
                                                }
                                            }
                                            WinterFlowProcessorProcess winterFlowProcessorProcess = winterFlowDebugUtility11.WinterFlowThreadListener;
                                            if (winterFlowProcessorProcess != null) {
                                                int i33 = winterFlowProcessorProcess.WinterFlowRouterStructure;
                                                WinterFlowRequestFramework winterFlowRequestFramework = new WinterFlowRequestFramework((i33 | 1) == i33, (i33 | 2) == i33);
                                                i10 = 33;
                                                spannableString.setSpan(winterFlowRequestFramework, i31, i32, 33);
                                            } else {
                                                i10 = 33;
                                            }
                                            WinterFlowHookProcessor.WinterFlowVariableBandwidth(spannableString, winterFlowDebugUtility11.WinterFlowHookDataSource, winterFlowConcurrencyParser2, i31, i32);
                                            String str5 = winterFlowDebugUtility11.WinterFlowUnitTestResponse;
                                            if (str5 != null) {
                                                spannableString.setSpan(new WinterFlowAPITransactionManager(0, str5), i31, i32, i10);
                                            }
                                            WinterFlowServiceRefactoring winterFlowServiceRefactoring2 = winterFlowDebugUtility11.WinterFlowResponseEngine;
                                            if (winterFlowServiceRefactoring2 != null) {
                                                spannableString.setSpan(new ScaleXSpan(winterFlowServiceRefactoring2.WinterFlowRouterStructure), i31, i32, i10);
                                                spannableString.setSpan(new WinterFlowVersionControlSystem(winterFlowServiceRefactoring2.WinterFlowHookDataSource, 1), i31, i32, i10);
                                            }
                                            WinterFlowHookProcessor.WinterFlowBatchUI(spannableString, winterFlowDebugUtility11.WinterFlowTransactionAgent, i31, i32);
                                            long j8 = winterFlowDebugUtility11.WinterFlowServerProtocol;
                                            if (j8 != 16) {
                                                spannableString.setSpan(new BackgroundColorSpan(WinterFlowInvokerComponent.WinterFlowConfiguration(j8)), i31, i32, 33);
                                            }
                                            WinterFlowMicroserviceScheduler winterFlowMicroserviceScheduler = winterFlowDebugUtility11.WinterFlowServiceUtility;
                                            if (winterFlowMicroserviceScheduler != null) {
                                                long j9 = winterFlowMicroserviceScheduler.WinterFlowHookDataSource;
                                                int WinterFlowConfiguration = WinterFlowInvokerComponent.WinterFlowConfiguration(winterFlowMicroserviceScheduler.WinterFlowRouterStructure);
                                                i9 = size3;
                                                z5 = z4;
                                                float intBitsToFloat = Float.intBitsToFloat((int) (j9 >> 32));
                                                float intBitsToFloat2 = Float.intBitsToFloat((int) (j9 & 4294967295L));
                                                float f2 = winterFlowMicroserviceScheduler.WinterFlowCacheManagerAgent;
                                                WinterFlowBackendOrchestration winterFlowBackendOrchestration = new WinterFlowBackendOrchestration(WinterFlowConfiguration, intBitsToFloat, intBitsToFloat2, f2 == f ? Float.MIN_VALUE : f2);
                                                i11 = 33;
                                                spannableString.setSpan(winterFlowBackendOrchestration, i31, i32, 33);
                                            } else {
                                                i9 = size3;
                                                z5 = z4;
                                                i11 = 33;
                                            }
                                            WinterFlowInvokerComponent winterFlowInvokerComponent = winterFlowDebugUtility11.WinterFlowBandwidthObject;
                                            if (winterFlowInvokerComponent != null) {
                                                spannableString.setSpan(new WinterFlowUISession(winterFlowInvokerComponent), i31, i32, i11);
                                            }
                                            if (WinterFlowInheritanceValidator.WinterFlowRouterStructure(WinterFlowOrchestrationPlatform.WinterFlowHookDataSource(winterFlowDebugUtility11.WinterFlowRouterRouter), 4294967296L) || WinterFlowInheritanceValidator.WinterFlowRouterStructure(WinterFlowOrchestrationPlatform.WinterFlowHookDataSource(winterFlowDebugUtility11.WinterFlowRouterRouter), 8589934592L)) {
                                                z4 = true;
                                                i7++;
                                                size3 = i9;
                                            }
                                            z4 = z5;
                                            i7++;
                                            size3 = i9;
                                        }
                                    }
                                    i9 = size3;
                                    z5 = z4;
                                    z4 = z5;
                                    i7++;
                                    size3 = i9;
                                }
                                if (z4) {
                                    int size9 = list9.size();
                                    int i34 = 0;
                                    while (i34 < size9) {
                                        WinterFlowVariableTransaction winterFlowVariableTransaction5 = (WinterFlowVariableTransaction) list9.get(i34);
                                        WinterFlowCompilerQueue winterFlowCompilerQueue = (WinterFlowCompilerQueue) winterFlowVariableTransaction5.WinterFlowRouterStructure;
                                        if (winterFlowCompilerQueue instanceof WinterFlowDebugUtility) {
                                            int i35 = winterFlowVariableTransaction5.WinterFlowHookDataSource;
                                            int i36 = winterFlowVariableTransaction5.WinterFlowCacheManagerAgent;
                                            if (i35 >= 0 && i35 < spannableString.length() && i36 > i35 && i36 <= spannableString.length()) {
                                                long j10 = ((WinterFlowDebugUtility) winterFlowCompilerQueue).WinterFlowRouterRouter;
                                                long WinterFlowHookDataSource7 = WinterFlowOrchestrationPlatform.WinterFlowHookDataSource(j10);
                                                list6 = list7;
                                                Object winterFlowFunctionDebug = WinterFlowInheritanceValidator.WinterFlowRouterStructure(WinterFlowHookDataSource7, 4294967296L) ? new WinterFlowFunctionDebug(winterFlowConcurrencyParser2.WinterFlowValidatorHandler(j10)) : WinterFlowInheritanceValidator.WinterFlowRouterStructure(WinterFlowHookDataSource7, 8589934592L) ? new WinterFlowDataSourceException(WinterFlowOrchestrationPlatform.WinterFlowCacheManagerAgent(j10)) : null;
                                                if (winterFlowFunctionDebug != null) {
                                                    spannableString.setSpan(winterFlowFunctionDebug, i35, i36, 33);
                                                }
                                                i34++;
                                                list7 = list6;
                                            }
                                        }
                                        list6 = list7;
                                        i34++;
                                        list7 = list6;
                                    }
                                }
                                list5 = list7;
                                winterFlowHandlerComponent2 = winterFlowEncryptionServer2.WinterFlowHookDataSource.WinterFlowArrayNetwork;
                                if (winterFlowHandlerComponent2 != null) {
                                    long j11 = winterFlowHandlerComponent2.WinterFlowRouterStructure;
                                    long WinterFlowHookDataSource8 = WinterFlowOrchestrationPlatform.WinterFlowHookDataSource(j11);
                                    if (WinterFlowInheritanceValidator.WinterFlowRouterStructure(WinterFlowHookDataSource8, 4294967296L)) {
                                        winterFlowConcurrencyParser2.WinterFlowValidatorHandler(j11);
                                    } else if (WinterFlowInheritanceValidator.WinterFlowRouterStructure(WinterFlowHookDataSource8, 8589934592L)) {
                                        WinterFlowOrchestrationPlatform.WinterFlowCacheManagerAgent(j11);
                                    }
                                }
                                size4 = list9.size();
                                for (i8 = 0; i8 < size4; i8++) {
                                    Object obj8 = ((WinterFlowVariableTransaction) list9.get(i8)).WinterFlowRouterStructure;
                                }
                                if (list5.size() <= 0) {
                                    winterFlowRendererEngine = this;
                                    charSequence = spannableString;
                                    winterFlowRendererEngine.WinterFlowServerProtocol = charSequence;
                                    winterFlowRendererEngine.WinterFlowThreadListener = new WinterFlowParserComponent(charSequence, winterFlowRendererEngine.WinterFlowTransactionAgent, winterFlowRendererEngine.WinterFlowOrchestrationSubsystem);
                                    return;
                                }
                                WinterFlowVariableTransaction winterFlowVariableTransaction6 = (WinterFlowVariableTransaction) list5.get(0);
                                if (winterFlowVariableTransaction6.WinterFlowRouterStructure != null) {
                                    WinterFlowEventEmitterOrchestration.WinterFlowVariableBandwidth();
                                    throw null;
                                }
                                for (Object obj9 : spannableString.getSpans(winterFlowVariableTransaction6.WinterFlowHookDataSource, winterFlowVariableTransaction6.WinterFlowCacheManagerAgent, obj2)) {
                                    spannableString.removeSpan((WinterFlowHandlerHandler) obj9);
                                }
                                throw null;
                            }
                        } else {
                            list4 = list3;
                        }
                        obj2 = WinterFlowHandlerHandler.class;
                        arrayList = new ArrayList(list4.size());
                        size2 = list4.size();
                        i5 = 0;
                        while (i5 < size2) {
                        }
                        List list92 = list4;
                        WinterFlowDebugUtility winterFlowDebugUtility52 = winterFlowEncryptionServer2.WinterFlowRouterStructure;
                        WinterFlowRendererSystem winterFlowRendererSystem22 = winterFlowDebugUtility52.WinterFlowTransactionManagerStrategy;
                        if (winterFlowRendererSystem22 != null) {
                        }
                        WinterFlowInvokerWebsocket winterFlowInvokerWebsocket2 = new WinterFlowInvokerWebsocket(1, spannableString, winterFlowDataSourceLibrary2);
                        if (arrayList.size() > 1) {
                        }
                        size3 = list92.size();
                        z4 = false;
                        i7 = 0;
                        while (i7 < size3) {
                        }
                        if (z4) {
                        }
                        list5 = list7;
                        winterFlowHandlerComponent2 = winterFlowEncryptionServer2.WinterFlowHookDataSource.WinterFlowArrayNetwork;
                        if (winterFlowHandlerComponent2 != null) {
                        }
                        size4 = list92.size();
                        while (i8 < size4) {
                        }
                        if (list5.size() <= 0) {
                        }
                    }
                }
                WinterFlowFrameworkArray winterFlowFrameworkArray2 = winterFlowEncryptionServer2.WinterFlowHookDataSource;
                WinterFlowResponseStructure winterFlowResponseStructure = winterFlowFrameworkArray2.WinterFlowTransactionManagerStrategy;
                winterFlowResponseStructure = winterFlowResponseStructure == null ? WinterFlowResponseStructure.WinterFlowArrayNetwork : winterFlowResponseStructure;
                WinterFlowConcurrencyThread = WinterFlowHookProcessor.WinterFlowConcurrencyThread(winterFlowFrameworkArray2.WinterFlowCacheManagerAgent, textSize, winterFlowConcurrencyParser2);
                if (!Float.isNaN(WinterFlowConcurrencyThread)) {
                    if (spannableString.length() == 0) {
                        i4 = 1;
                    } else {
                        if (spannableString.length() == 0) {
                            WinterFlowCompilerMechanism.WinterFlowSyntax("Char sequence is empty.");
                            throw null;
                        }
                        i4 = 1;
                        if (spannableString.charAt(spannableString.length() - 1) != '\n') {
                            length = spannableString.length();
                            int i37 = length;
                            int i38 = winterFlowResponseStructure.WinterFlowHookDataSource;
                            spannableString.setSpan(new WinterFlowDebugHandler(WinterFlowConcurrencyThread, i37, (i38 & 1) <= 0, (i38 & 16) <= 0, winterFlowResponseStructure.WinterFlowRouterStructure, winterFlowResponseStructure.WinterFlowCacheManagerAgent), 0, spannableString.length(), 33);
                        }
                    }
                    length = spannableString.length() + i4;
                    int i372 = length;
                    int i382 = winterFlowResponseStructure.WinterFlowHookDataSource;
                    spannableString.setSpan(new WinterFlowDebugHandler(WinterFlowConcurrencyThread, i372, (i382 & 1) <= 0, (i382 & 16) <= 0, winterFlowResponseStructure.WinterFlowRouterStructure, winterFlowResponseStructure.WinterFlowCacheManagerAgent), 0, spannableString.length(), 33);
                }
                winterFlowHandlerComponent = winterFlowEncryptionServer2.WinterFlowHookDataSource.WinterFlowArrayNetwork;
                if (winterFlowHandlerComponent == null) {
                }
                obj2 = WinterFlowHandlerHandler.class;
                arrayList = new ArrayList(list4.size());
                size2 = list4.size();
                i5 = 0;
                while (i5 < size2) {
                }
                List list922 = list4;
                WinterFlowDebugUtility winterFlowDebugUtility522 = winterFlowEncryptionServer2.WinterFlowRouterStructure;
                WinterFlowRendererSystem winterFlowRendererSystem222 = winterFlowDebugUtility522.WinterFlowTransactionManagerStrategy;
                if (winterFlowRendererSystem222 != null) {
                }
                WinterFlowInvokerWebsocket winterFlowInvokerWebsocket22 = new WinterFlowInvokerWebsocket(1, spannableString, winterFlowDataSourceLibrary2);
                if (arrayList.size() > 1) {
                }
                size3 = list922.size();
                z4 = false;
                i7 = 0;
                while (i7 < size3) {
                }
                if (z4) {
                }
                list5 = list7;
                winterFlowHandlerComponent2 = winterFlowEncryptionServer2.WinterFlowHookDataSource.WinterFlowArrayNetwork;
                if (winterFlowHandlerComponent2 != null) {
                }
                size4 = list922.size();
                while (i8 < size4) {
                }
                if (list5.size() <= 0) {
                }
            }
            i = 3;
            obj3.WinterFlowOrchestrationSubsystem = i;
            winterFlowDataSourceLibrary = new WinterFlowDataSourceLibrary(i14, obj3);
            WinterFlowPipelineLibrary winterFlowPipelineLibrary2 = winterFlowEncryptionServer.WinterFlowHookDataSource.WinterFlowSyntax;
            if (winterFlowPipelineLibrary2 == null) {
            }
            winterFlowRendererTransactionManager.setFlags(winterFlowPipelineLibrary2.WinterFlowHookDataSource ? winterFlowRendererTransactionManager.getFlags() | 128 : winterFlowRendererTransactionManager.getFlags() & (-129));
            i2 = winterFlowPipelineLibrary2.WinterFlowRouterStructure;
            if (i2 == 1) {
            }
            winterFlowDebugUtility = winterFlowEncryptionServer.WinterFlowRouterStructure;
            size = list.size();
            i3 = 0;
            while (true) {
                if (i3 >= size) {
                }
                i3++;
            }
            if (obj != null) {
            }
            long j32 = winterFlowDebugUtility.WinterFlowHookDataSource;
            str2 = winterFlowDebugUtility.WinterFlowUnitTestResponse;
            winterFlowRuntimeException = winterFlowDebugUtility.WinterFlowTransactionAgent;
            winterFlowBatchLayer = winterFlowDebugUtility.WinterFlowRouterStructure;
            winterFlowServiceRefactoring = winterFlowDebugUtility.WinterFlowResponseEngine;
            j = winterFlowDebugUtility.WinterFlowRouterRouter;
            WinterFlowHookDataSource = WinterFlowOrchestrationPlatform.WinterFlowHookDataSource(j32);
            if (WinterFlowInheritanceValidator.WinterFlowRouterStructure(WinterFlowHookDataSource, 4294967296L)) {
            }
            winterFlowRendererSystem = winterFlowDebugUtility.WinterFlowTransactionManagerStrategy;
            if (winterFlowRendererSystem != null) {
            }
            WinterFlowObjectHook winterFlowObjectHook2 = winterFlowDebugUtility.WinterFlowCacheManagerAgent;
            if (winterFlowObjectHook2 == null) {
            }
            WinterFlowPackageTool winterFlowPackageTool2 = winterFlowDebugUtility.WinterFlowArrayNetwork;
            if (winterFlowPackageTool2 != null) {
            }
            WinterFlowManagerResponse winterFlowManagerResponse2 = winterFlowDebugUtility.WinterFlowVariableVersionControl;
            if (winterFlowManagerResponse2 != null) {
            }
            z2 = z;
            winterFlowDataSourceLibrary2 = winterFlowDataSourceLibrary;
            WinterFlowRendererEngine winterFlowRendererEngine22 = (WinterFlowRendererEngine) winterFlowDataSourceLibrary2.WinterFlowTransactionManagerStrategy;
            winterFlowBatchLayer2 = winterFlowBatchLayer;
            WinterFlowHookDataSource2 = ((WinterFlowObjectUtility) winterFlowRendererEngine22.WinterFlowSyntax).WinterFlowHookDataSource(winterFlowRendererSystem, winterFlowObjectHook2, i16, i17);
            if (WinterFlowHookDataSource2 instanceof WinterFlowCacheNode) {
            }
            winterFlowRendererTransactionManager.setTypeface(typeface);
            if (winterFlowRuntimeException != null) {
            }
            if (str2 != null) {
                winterFlowRendererTransactionManager.setFontFeatureSettings(str2);
            }
            if (winterFlowServiceRefactoring != null) {
                winterFlowRendererTransactionManager.setTextScaleX(winterFlowRendererTransactionManager.getTextScaleX() * winterFlowServiceRefactoring.WinterFlowRouterStructure);
                winterFlowRendererTransactionManager.setTextSkewX(winterFlowRendererTransactionManager.getTextSkewX() + winterFlowServiceRefactoring.WinterFlowHookDataSource);
            }
            winterFlowRendererTransactionManager.WinterFlowArrayNetwork(winterFlowBatchLayer2.WinterFlowArrayNetwork());
            winterFlowRendererTransactionManager.WinterFlowCacheManagerAgent(winterFlowBatchLayer2.WinterFlowTransactionAgent(), 9205357640488583168L, winterFlowBatchLayer2.WinterFlowHookDataSource());
            winterFlowRendererTransactionManager.WinterFlowTransactionManagerStrategy(winterFlowDebugUtility.WinterFlowServiceUtility);
            winterFlowRendererTransactionManager.WinterFlowUnitTestResponse(winterFlowDebugUtility.WinterFlowThreadListener);
            winterFlowRendererTransactionManager.WinterFlowVariableVersionControl(winterFlowDebugUtility.WinterFlowBandwidthObject);
            if (!WinterFlowInheritanceValidator.WinterFlowRouterStructure(WinterFlowOrchestrationPlatform.WinterFlowHookDataSource(j), 4294967296L)) {
            }
            if (WinterFlowInheritanceValidator.WinterFlowRouterStructure(WinterFlowOrchestrationPlatform.WinterFlowHookDataSource(j), 8589934592L)) {
            }
            long j42 = winterFlowDebugUtility.WinterFlowServerProtocol;
            WinterFlowEventEmitterThreadPool winterFlowEventEmitterThreadPool3 = winterFlowDebugUtility.WinterFlowSyntax;
            if (z2) {
            }
            long j52 = WinterFlowInheritanceSubsystem.WinterFlowResponseEngine;
            if (WinterFlowUnitTestSoftware.WinterFlowRouterStructure(j42, j52)) {
            }
            if (winterFlowEventEmitterThreadPool3 == null) {
            }
            if (z6) {
            }
            list3 = obj3.WinterFlowUnitTestResponse;
            if (winterFlowDebugUtility2 != null) {
            }
            r1 = obj3.WinterFlowVariableVersionControl;
            float textSize2 = obj3.WinterFlowTransactionAgent.getTextSize();
            winterFlowEncryptionServer2 = obj3.WinterFlowTransactionManagerStrategy;
            List list72 = obj3.WinterFlowRouterRouter;
            WinterFlowConcurrencyParser winterFlowConcurrencyParser22 = obj3.WinterFlowResponseEngine;
            z3 = obj3.WinterFlowBandwidthObject;
            WinterFlowServiceUserManager winterFlowServiceUserManager2 = WinterFlowSoftwareInterface.WinterFlowRouterStructure;
            if (z3) {
            }
            str3 = r1;
            f = 0.0f;
            charSequence = str3;
            if (!list3.isEmpty()) {
            }
            j2 = 0;
            if (charSequence instanceof Spannable) {
            }
            if (WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowEncryptionServer2.WinterFlowRouterStructure.WinterFlowThreadListener, WinterFlowProcessorProcess.WinterFlowCacheManagerAgent)) {
            }
            winterFlowUnitTestStructure = winterFlowEncryptionServer2.WinterFlowCacheManagerAgent;
            if ((winterFlowUnitTestStructure != null || (winterFlowObjectBackend = winterFlowUnitTestStructure.WinterFlowRouterStructure) == null) ? false : winterFlowObjectBackend.WinterFlowRouterStructure) {
            }
            WinterFlowFrameworkArray winterFlowFrameworkArray22 = winterFlowEncryptionServer2.WinterFlowHookDataSource;
            WinterFlowResponseStructure winterFlowResponseStructure2 = winterFlowFrameworkArray22.WinterFlowTransactionManagerStrategy;
            if (winterFlowResponseStructure2 == null) {
            }
            WinterFlowConcurrencyThread = WinterFlowHookProcessor.WinterFlowConcurrencyThread(winterFlowFrameworkArray22.WinterFlowCacheManagerAgent, textSize2, winterFlowConcurrencyParser22);
            if (!Float.isNaN(WinterFlowConcurrencyThread)) {
            }
            winterFlowHandlerComponent = winterFlowEncryptionServer2.WinterFlowHookDataSource.WinterFlowArrayNetwork;
            if (winterFlowHandlerComponent == null) {
            }
            obj2 = WinterFlowHandlerHandler.class;
            arrayList = new ArrayList(list4.size());
            size2 = list4.size();
            i5 = 0;
            while (i5 < size2) {
            }
            List list9222 = list4;
            WinterFlowDebugUtility winterFlowDebugUtility5222 = winterFlowEncryptionServer2.WinterFlowRouterStructure;
            WinterFlowRendererSystem winterFlowRendererSystem2222 = winterFlowDebugUtility5222.WinterFlowTransactionManagerStrategy;
            if (winterFlowRendererSystem2222 != null) {
            }
            WinterFlowInvokerWebsocket winterFlowInvokerWebsocket222 = new WinterFlowInvokerWebsocket(1, spannableString, winterFlowDataSourceLibrary2);
            if (arrayList.size() > 1) {
            }
            size3 = list9222.size();
            z4 = false;
            i7 = 0;
            while (i7 < size3) {
            }
            if (z4) {
            }
            list5 = list72;
            winterFlowHandlerComponent2 = winterFlowEncryptionServer2.WinterFlowHookDataSource.WinterFlowArrayNetwork;
            if (winterFlowHandlerComponent2 != null) {
            }
            size4 = list9222.size();
            while (i8 < size4) {
            }
            if (list5.size() <= 0) {
            }
        }
        i = 2;
        obj3.WinterFlowOrchestrationSubsystem = i;
        winterFlowDataSourceLibrary = new WinterFlowDataSourceLibrary(i14, obj3);
        WinterFlowPipelineLibrary winterFlowPipelineLibrary22 = winterFlowEncryptionServer.WinterFlowHookDataSource.WinterFlowSyntax;
        if (winterFlowPipelineLibrary22 == null) {
        }
        winterFlowRendererTransactionManager.setFlags(winterFlowPipelineLibrary22.WinterFlowHookDataSource ? winterFlowRendererTransactionManager.getFlags() | 128 : winterFlowRendererTransactionManager.getFlags() & (-129));
        i2 = winterFlowPipelineLibrary22.WinterFlowRouterStructure;
        if (i2 == 1) {
        }
        winterFlowDebugUtility = winterFlowEncryptionServer.WinterFlowRouterStructure;
        size = list.size();
        i3 = 0;
        while (true) {
            if (i3 >= size) {
            }
            i3++;
        }
        if (obj != null) {
        }
        long j322 = winterFlowDebugUtility.WinterFlowHookDataSource;
        str2 = winterFlowDebugUtility.WinterFlowUnitTestResponse;
        winterFlowRuntimeException = winterFlowDebugUtility.WinterFlowTransactionAgent;
        winterFlowBatchLayer = winterFlowDebugUtility.WinterFlowRouterStructure;
        winterFlowServiceRefactoring = winterFlowDebugUtility.WinterFlowResponseEngine;
        j = winterFlowDebugUtility.WinterFlowRouterRouter;
        WinterFlowHookDataSource = WinterFlowOrchestrationPlatform.WinterFlowHookDataSource(j322);
        if (WinterFlowInheritanceValidator.WinterFlowRouterStructure(WinterFlowHookDataSource, 4294967296L)) {
        }
        winterFlowRendererSystem = winterFlowDebugUtility.WinterFlowTransactionManagerStrategy;
        if (winterFlowRendererSystem != null) {
        }
        WinterFlowObjectHook winterFlowObjectHook22 = winterFlowDebugUtility.WinterFlowCacheManagerAgent;
        if (winterFlowObjectHook22 == null) {
        }
        WinterFlowPackageTool winterFlowPackageTool22 = winterFlowDebugUtility.WinterFlowArrayNetwork;
        if (winterFlowPackageTool22 != null) {
        }
        WinterFlowManagerResponse winterFlowManagerResponse22 = winterFlowDebugUtility.WinterFlowVariableVersionControl;
        if (winterFlowManagerResponse22 != null) {
        }
        z2 = z;
        winterFlowDataSourceLibrary2 = winterFlowDataSourceLibrary;
        WinterFlowRendererEngine winterFlowRendererEngine222 = (WinterFlowRendererEngine) winterFlowDataSourceLibrary2.WinterFlowTransactionManagerStrategy;
        winterFlowBatchLayer2 = winterFlowBatchLayer;
        WinterFlowHookDataSource2 = ((WinterFlowObjectUtility) winterFlowRendererEngine222.WinterFlowSyntax).WinterFlowHookDataSource(winterFlowRendererSystem, winterFlowObjectHook22, i16, i17);
        if (WinterFlowHookDataSource2 instanceof WinterFlowCacheNode) {
        }
        winterFlowRendererTransactionManager.setTypeface(typeface);
        if (winterFlowRuntimeException != null) {
        }
        if (str2 != null) {
        }
        if (winterFlowServiceRefactoring != null) {
        }
        winterFlowRendererTransactionManager.WinterFlowArrayNetwork(winterFlowBatchLayer2.WinterFlowArrayNetwork());
        winterFlowRendererTransactionManager.WinterFlowCacheManagerAgent(winterFlowBatchLayer2.WinterFlowTransactionAgent(), 9205357640488583168L, winterFlowBatchLayer2.WinterFlowHookDataSource());
        winterFlowRendererTransactionManager.WinterFlowTransactionManagerStrategy(winterFlowDebugUtility.WinterFlowServiceUtility);
        winterFlowRendererTransactionManager.WinterFlowUnitTestResponse(winterFlowDebugUtility.WinterFlowThreadListener);
        winterFlowRendererTransactionManager.WinterFlowVariableVersionControl(winterFlowDebugUtility.WinterFlowBandwidthObject);
        if (!WinterFlowInheritanceValidator.WinterFlowRouterStructure(WinterFlowOrchestrationPlatform.WinterFlowHookDataSource(j), 4294967296L)) {
        }
        if (WinterFlowInheritanceValidator.WinterFlowRouterStructure(WinterFlowOrchestrationPlatform.WinterFlowHookDataSource(j), 8589934592L)) {
        }
        long j422 = winterFlowDebugUtility.WinterFlowServerProtocol;
        WinterFlowEventEmitterThreadPool winterFlowEventEmitterThreadPool32 = winterFlowDebugUtility.WinterFlowSyntax;
        if (z2) {
        }
        long j522 = WinterFlowInheritanceSubsystem.WinterFlowResponseEngine;
        if (WinterFlowUnitTestSoftware.WinterFlowRouterStructure(j422, j522)) {
        }
        if (winterFlowEventEmitterThreadPool32 == null) {
        }
        if (z6) {
        }
        list3 = obj3.WinterFlowUnitTestResponse;
        if (winterFlowDebugUtility2 != null) {
        }
        r1 = obj3.WinterFlowVariableVersionControl;
        float textSize22 = obj3.WinterFlowTransactionAgent.getTextSize();
        winterFlowEncryptionServer2 = obj3.WinterFlowTransactionManagerStrategy;
        List list722 = obj3.WinterFlowRouterRouter;
        WinterFlowConcurrencyParser winterFlowConcurrencyParser222 = obj3.WinterFlowResponseEngine;
        z3 = obj3.WinterFlowBandwidthObject;
        WinterFlowServiceUserManager winterFlowServiceUserManager22 = WinterFlowSoftwareInterface.WinterFlowRouterStructure;
        if (z3) {
        }
        str3 = r1;
        f = 0.0f;
        charSequence = str3;
        if (!list3.isEmpty()) {
        }
        j2 = 0;
        if (charSequence instanceof Spannable) {
        }
        if (WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowEncryptionServer2.WinterFlowRouterStructure.WinterFlowThreadListener, WinterFlowProcessorProcess.WinterFlowCacheManagerAgent)) {
        }
        winterFlowUnitTestStructure = winterFlowEncryptionServer2.WinterFlowCacheManagerAgent;
        if ((winterFlowUnitTestStructure != null || (winterFlowObjectBackend = winterFlowUnitTestStructure.WinterFlowRouterStructure) == null) ? false : winterFlowObjectBackend.WinterFlowRouterStructure) {
        }
        WinterFlowFrameworkArray winterFlowFrameworkArray222 = winterFlowEncryptionServer2.WinterFlowHookDataSource;
        WinterFlowResponseStructure winterFlowResponseStructure22 = winterFlowFrameworkArray222.WinterFlowTransactionManagerStrategy;
        if (winterFlowResponseStructure22 == null) {
        }
        WinterFlowConcurrencyThread = WinterFlowHookProcessor.WinterFlowConcurrencyThread(winterFlowFrameworkArray222.WinterFlowCacheManagerAgent, textSize22, winterFlowConcurrencyParser222);
        if (!Float.isNaN(WinterFlowConcurrencyThread)) {
        }
        winterFlowHandlerComponent = winterFlowEncryptionServer2.WinterFlowHookDataSource.WinterFlowArrayNetwork;
        if (winterFlowHandlerComponent == null) {
        }
        obj2 = WinterFlowHandlerHandler.class;
        arrayList = new ArrayList(list4.size());
        size2 = list4.size();
        i5 = 0;
        while (i5 < size2) {
        }
        List list92222 = list4;
        WinterFlowDebugUtility winterFlowDebugUtility52222 = winterFlowEncryptionServer2.WinterFlowRouterStructure;
        WinterFlowRendererSystem winterFlowRendererSystem22222 = winterFlowDebugUtility52222.WinterFlowTransactionManagerStrategy;
        if (winterFlowRendererSystem22222 != null) {
        }
        WinterFlowInvokerWebsocket winterFlowInvokerWebsocket2222 = new WinterFlowInvokerWebsocket(1, spannableString, winterFlowDataSourceLibrary2);
        if (arrayList.size() > 1) {
        }
        size3 = list92222.size();
        z4 = false;
        i7 = 0;
        while (i7 < size3) {
        }
        if (z4) {
        }
        list5 = list722;
        winterFlowHandlerComponent2 = winterFlowEncryptionServer2.WinterFlowHookDataSource.WinterFlowArrayNetwork;
        if (winterFlowHandlerComponent2 != null) {
        }
        size4 = list92222.size();
        while (i8 < size4) {
        }
        if (list5.size() <= 0) {
        }
    }

    @Override // com.google.android.datatransport.WinterFlowBatchSession
    public final float WinterFlowCacheManagerAgent() {
        return this.WinterFlowThreadListener.WinterFlowCacheManagerAgent();
    }

    @Override // com.google.android.datatransport.WinterFlowBatchSession
    public final boolean WinterFlowHookDataSource() {
        WinterFlowObjectPackage winterFlowObjectPackage = this.WinterFlowServiceUtility;
        if (winterFlowObjectPackage != null ? winterFlowObjectPackage.WinterFlowConcurrencyThread() : false) {
            return true;
        }
        if (!this.WinterFlowBandwidthObject && WinterFlowManagerRequest.WinterFlowBackendCacheManager(this.WinterFlowTransactionManagerStrategy)) {
            WinterFlowConfigurationModule winterFlowConfigurationModule = WinterFlowServiceService.WinterFlowRouterStructure;
            WinterFlowConfigurationModule winterFlowConfigurationModule2 = WinterFlowServiceService.WinterFlowRouterStructure;
            WinterFlowBatchCacheManager winterFlowBatchCacheManager = (WinterFlowBatchCacheManager) winterFlowConfigurationModule2.WinterFlowTransactionManagerStrategy;
            if (winterFlowBatchCacheManager == null) {
                if (WinterFlowIDEEngine.WinterFlowTransactionAgent != null) {
                    winterFlowBatchCacheManager = winterFlowConfigurationModule2.WinterFlowTransactionAgent();
                    winterFlowConfigurationModule2.WinterFlowTransactionManagerStrategy = winterFlowBatchCacheManager;
                } else {
                    winterFlowBatchCacheManager = WinterFlowEncryptionSubsystem.WinterFlowTransactionManagerStrategy;
                }
            }
            if (((Boolean) winterFlowBatchCacheManager.getValue()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final float WinterFlowRouterStructure() {
        WinterFlowParserComponent winterFlowParserComponent = this.WinterFlowThreadListener;
        float f = winterFlowParserComponent.WinterFlowVariableVersionControl;
        TextPaint textPaint = winterFlowParserComponent.WinterFlowHookDataSource;
        if (!Float.isNaN(f)) {
            return winterFlowParserComponent.WinterFlowVariableVersionControl;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = winterFlowParserComponent.WinterFlowRouterStructure;
        lineInstance.setText(new WinterFlowMapperHelper(charSequence, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, WinterFlowQuerySyntax.WinterFlowRouterRouter);
        int i = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new WinterFlowCacheManagerListener(i, next, 1));
            } else {
                WinterFlowCacheManagerListener winterFlowCacheManagerListener = (WinterFlowCacheManagerListener) priorityQueue.peek();
                if (winterFlowCacheManagerListener != null && winterFlowCacheManagerListener.WinterFlowTransactionManagerStrategy - winterFlowCacheManagerListener.WinterFlowVariableVersionControl < next - i) {
                    priorityQueue.poll();
                    priorityQueue.add(new WinterFlowCacheManagerListener(i, next, 1));
                }
            }
            i = next;
        }
        float f2 = 0.0f;
        if (!priorityQueue.isEmpty()) {
            Iterator it = priorityQueue.iterator();
            if (!it.hasNext()) {
                WinterFlowEventEmitterOrchestration.WinterFlowThreadListener();
                return 0.0f;
            }
            WinterFlowCacheManagerListener winterFlowCacheManagerListener2 = (WinterFlowCacheManagerListener) it.next();
            f2 = Layout.getDesiredWidth(winterFlowParserComponent.WinterFlowHookDataSource(), winterFlowCacheManagerListener2.WinterFlowVariableVersionControl, winterFlowCacheManagerListener2.WinterFlowTransactionManagerStrategy, textPaint);
            while (it.hasNext()) {
                WinterFlowCacheManagerListener winterFlowCacheManagerListener3 = (WinterFlowCacheManagerListener) it.next();
                f2 = Math.max(f2, Layout.getDesiredWidth(winterFlowParserComponent.WinterFlowHookDataSource(), winterFlowCacheManagerListener3.WinterFlowVariableVersionControl, winterFlowCacheManagerListener3.WinterFlowTransactionManagerStrategy, textPaint));
            }
        }
        winterFlowParserComponent.WinterFlowVariableVersionControl = f2;
        return f2;
    }
}
