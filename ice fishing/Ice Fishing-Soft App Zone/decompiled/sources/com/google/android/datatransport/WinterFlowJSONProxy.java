package com.google.android.datatransport;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.adjust.sdk.Constants;
import com.android.installreferrer.api.InstallReferrerClient;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowJSONProxy {
    public final Object WinterFlowArrayNetwork;
    public final Object WinterFlowCacheManagerAgent;
    public Object WinterFlowHookDataSource;
    public final Object WinterFlowRouterRouter;
    public final Object WinterFlowRouterStructure;
    public final Object WinterFlowSyntax;
    public final Object WinterFlowTransactionManagerStrategy;
    public final Object WinterFlowUnitTestResponse;
    public final Object WinterFlowVariableVersionControl;

    public WinterFlowJSONProxy() {
        long[] jArr = WinterFlowDatabaseSchemaUtility.WinterFlowRouterStructure;
        this.WinterFlowRouterStructure = new WinterFlowDatabaseSchemaStructure();
        WinterFlowCacheManagerTransactionManager winterFlowCacheManagerTransactionManager = WinterFlowLoaderSessionManager.WinterFlowRouterStructure;
        this.WinterFlowCacheManagerAgent = new WinterFlowCacheManagerTransactionManager();
        this.WinterFlowArrayNetwork = new ArrayList();
        this.WinterFlowVariableVersionControl = new ArrayList();
        this.WinterFlowTransactionManagerStrategy = new ArrayList();
        this.WinterFlowUnitTestResponse = new ArrayList();
        this.WinterFlowRouterRouter = new ArrayList();
        this.WinterFlowSyntax = new WinterFlowRuntimeValidator(this);
    }

    public static int WinterFlowTransactionManagerStrategy(int[] iArr, WinterFlowServiceSyntax winterFlowServiceSyntax) {
        winterFlowServiceSyntax.getClass();
        int i = iArr[0] + winterFlowServiceSyntax.WinterFlowServerProtocol;
        iArr[0] = i;
        return Math.max(0, i);
    }

    public void WinterFlowArrayNetwork() {
        WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure = (WinterFlowDatabaseSchemaStructure) this.WinterFlowRouterStructure;
        if (winterFlowDatabaseSchemaStructure.WinterFlowResponseEngine()) {
            Object[] objArr = winterFlowDatabaseSchemaStructure.WinterFlowCacheManagerAgent;
            long[] jArr = winterFlowDatabaseSchemaStructure.WinterFlowRouterStructure;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                WinterFlowResolverBackend.WinterFlowBatchUI(objArr[(i << 3) + i3]);
                                throw null;
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            winterFlowDatabaseSchemaStructure.WinterFlowRouterStructure();
        }
    }

    public void WinterFlowCacheManagerAgent(int i, int i2, ArrayList arrayList, WinterFlowBandwidthServer winterFlowBandwidthServer, WinterFlowLibraryQueue winterFlowLibraryQueue, boolean z, boolean z2, int i3, int i4) {
        ArrayList arrayList2;
        ArrayList arrayList3;
        Throwable th;
        WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure;
        int i5;
        WinterFlowJSONProxy winterFlowJSONProxy;
        int i6;
        Object[] objArr;
        Object[] objArr2;
        int i7;
        int i8;
        ArrayList arrayList4 = (ArrayList) this.WinterFlowVariableVersionControl;
        ArrayList arrayList5 = (ArrayList) this.WinterFlowArrayNetwork;
        WinterFlowCacheManagerTransactionManager winterFlowCacheManagerTransactionManager = (WinterFlowCacheManagerTransactionManager) this.WinterFlowCacheManagerAgent;
        Object obj = this.WinterFlowRouterStructure;
        WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure2 = (WinterFlowDatabaseSchemaStructure) obj;
        ArrayList arrayList6 = (ArrayList) this.WinterFlowUnitTestResponse;
        ArrayList arrayList7 = (ArrayList) this.WinterFlowTransactionManagerStrategy;
        WinterFlowBandwidthServer winterFlowBandwidthServer2 = (WinterFlowBandwidthServer) this.WinterFlowHookDataSource;
        this.WinterFlowHookDataSource = winterFlowBandwidthServer;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            WinterFlowServiceSyntax winterFlowServiceSyntax = (WinterFlowServiceSyntax) arrayList.get(i9);
            Object obj2 = obj;
            int i10 = size;
            int i11 = 0;
            for (int size2 = winterFlowServiceSyntax.WinterFlowHookDataSource.size(); i11 < size2; size2 = size2) {
                ((WinterFlowViewTesting) winterFlowServiceSyntax.WinterFlowHookDataSource.get(i11)).WinterFlowSyntax();
                i11++;
            }
            i9++;
            size = i10;
            obj = obj2;
        }
        Object obj3 = obj;
        if (winterFlowDatabaseSchemaStructure2.WinterFlowSyntax()) {
            WinterFlowArrayNetwork();
            return;
        }
        boolean z3 = z || !z2;
        Object[] objArr3 = winterFlowDatabaseSchemaStructure2.WinterFlowHookDataSource;
        long[] jArr = winterFlowDatabaseSchemaStructure2.WinterFlowRouterStructure;
        int i12 = 2;
        int length = jArr.length - 2;
        boolean z4 = z3;
        if (length >= 0) {
            int i13 = 0;
            while (true) {
                long j = jArr[i13];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((j & 255) < 128) {
                            i8 = i15;
                            winterFlowCacheManagerTransactionManager.WinterFlowRouterStructure(objArr3[(i13 << 3) + i15]);
                        } else {
                            i8 = i15;
                        }
                        j >>= 8;
                        i15 = i8 + 1;
                    }
                    if (i14 != 8) {
                        break;
                    }
                }
                if (i13 == length) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        int size3 = arrayList.size();
        for (int i16 = 0; i16 < size3; i16++) {
            WinterFlowServiceSyntax winterFlowServiceSyntax2 = (WinterFlowServiceSyntax) arrayList.get(i16);
            Object obj4 = winterFlowServiceSyntax2.WinterFlowUnitTestResponse;
            List list = winterFlowServiceSyntax2.WinterFlowHookDataSource;
            winterFlowCacheManagerTransactionManager.WinterFlowServerProtocol(obj4);
            int size4 = list.size();
            for (int i17 = 0; i17 < size4; i17++) {
                ((WinterFlowViewTesting) list.get(i17)).WinterFlowSyntax();
            }
            WinterFlowResolverBackend.WinterFlowBatchUI(((WinterFlowDatabaseSchemaStructure) obj3).WinterFlowTransactionAgent(winterFlowServiceSyntax2.WinterFlowUnitTestResponse));
        }
        int[] iArr = new int[1];
        if (z4 && winterFlowBandwidthServer2 != null) {
            if (arrayList5.isEmpty()) {
                i7 = 0;
            } else {
                if (arrayList5.size() > 1) {
                    WinterFlowObjectHelper.WinterFlowSessionManagerInterface(arrayList5, new WinterFlowDatabaseSchemaRefactoring(winterFlowBandwidthServer2, i12));
                }
                if (arrayList5.size() > 0) {
                    WinterFlowServiceSyntax winterFlowServiceSyntax3 = (WinterFlowServiceSyntax) arrayList5.get(0);
                    WinterFlowTransactionManagerStrategy(iArr, winterFlowServiceSyntax3);
                    Object WinterFlowUnitTestResponse = winterFlowDatabaseSchemaStructure2.WinterFlowUnitTestResponse(winterFlowServiceSyntax3.WinterFlowUnitTestResponse);
                    WinterFlowUnitTestResponse.getClass();
                    WinterFlowResolverBackend.WinterFlowBatchUI(WinterFlowUnitTestResponse);
                    winterFlowServiceSyntax3.WinterFlowRouterStructure(0);
                    throw null;
                }
                i7 = 0;
                Arrays.fill(iArr, 0, 1, 0);
            }
            if (!arrayList4.isEmpty()) {
                if (arrayList4.size() > 1) {
                    WinterFlowObjectHelper.WinterFlowSessionManagerInterface(arrayList4, new WinterFlowDatabaseSchemaRefactoring(winterFlowBandwidthServer2, i7));
                }
                if (arrayList4.size() > 0) {
                    WinterFlowServiceSyntax winterFlowServiceSyntax4 = (WinterFlowServiceSyntax) arrayList4.get(i7);
                    WinterFlowTransactionManagerStrategy(iArr, winterFlowServiceSyntax4);
                    Object WinterFlowUnitTestResponse2 = winterFlowDatabaseSchemaStructure2.WinterFlowUnitTestResponse(winterFlowServiceSyntax4.WinterFlowUnitTestResponse);
                    WinterFlowUnitTestResponse2.getClass();
                    WinterFlowResolverBackend.WinterFlowBatchUI(WinterFlowUnitTestResponse2);
                    winterFlowServiceSyntax4.WinterFlowRouterStructure(i7);
                    throw null;
                }
                Arrays.fill(iArr, i7, 1, i7);
            }
        }
        Object[] objArr4 = winterFlowCacheManagerTransactionManager.WinterFlowHookDataSource;
        long[] jArr2 = winterFlowCacheManagerTransactionManager.WinterFlowRouterStructure;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            th = null;
            winterFlowDatabaseSchemaStructure = winterFlowDatabaseSchemaStructure2;
            int i18 = 0;
            while (true) {
                long j2 = jArr2[i18];
                arrayList2 = arrayList4;
                arrayList3 = arrayList5;
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i19 = 8 - ((~(i18 - length2)) >>> 31);
                    int i20 = 0;
                    while (i20 < i19) {
                        if ((j2 & 255) < 128) {
                            objArr2 = objArr4;
                            WinterFlowResolverBackend.WinterFlowBatchUI(winterFlowDatabaseSchemaStructure.WinterFlowUnitTestResponse(objArr2[(i18 << 3) + i20]));
                        } else {
                            objArr2 = objArr4;
                        }
                        j2 >>= 8;
                        i20++;
                        objArr4 = objArr2;
                    }
                    objArr = objArr4;
                    if (i19 != 8) {
                        break;
                    }
                } else {
                    objArr = objArr4;
                }
                if (i18 == length2) {
                    break;
                }
                i18++;
                arrayList4 = arrayList2;
                arrayList5 = arrayList3;
                objArr4 = objArr;
            }
        } else {
            arrayList2 = arrayList4;
            arrayList3 = arrayList5;
            th = null;
            winterFlowDatabaseSchemaStructure = winterFlowDatabaseSchemaStructure2;
        }
        if (arrayList7.isEmpty()) {
            i5 = 1;
            winterFlowJSONProxy = this;
            i6 = i;
        } else {
            if (arrayList7.size() > 1) {
                WinterFlowObjectHelper.WinterFlowSessionManagerInterface(arrayList7, new WinterFlowDatabaseSchemaRefactoring(winterFlowBandwidthServer, 3));
            }
            int size5 = arrayList7.size();
            for (int i21 = 0; i21 < size5; i21++) {
                WinterFlowServiceSyntax winterFlowServiceSyntax5 = (WinterFlowServiceSyntax) arrayList7.get(i21);
                Object WinterFlowUnitTestResponse3 = winterFlowDatabaseSchemaStructure.WinterFlowUnitTestResponse(winterFlowServiceSyntax5.WinterFlowUnitTestResponse);
                WinterFlowUnitTestResponse3.getClass();
                WinterFlowResolverBackend.WinterFlowBatchUI(WinterFlowUnitTestResponse3);
                winterFlowServiceSyntax5.WinterFlowCacheManagerAgent((z ? (int) (((WinterFlowServiceSyntax) WinterFlowSerializerUtility.WinterFlowStrategyHook(arrayList)).WinterFlowRouterStructure(0) & 4294967295L) : 0) - WinterFlowTransactionManagerStrategy(iArr, winterFlowServiceSyntax5), i, i2);
                if (z4) {
                    WinterFlowVariableVersionControl(winterFlowServiceSyntax5, true);
                    throw th;
                }
            }
            winterFlowJSONProxy = this;
            i6 = i;
            i5 = 1;
            Arrays.fill(iArr, 0, 1, 0);
        }
        if (!arrayList6.isEmpty()) {
            if (arrayList6.size() > i5) {
                WinterFlowObjectHelper.WinterFlowSessionManagerInterface(arrayList6, new WinterFlowDatabaseSchemaRefactoring(winterFlowBandwidthServer, i5));
            }
            int size6 = arrayList6.size();
            for (int i22 = 0; i22 < size6; i22++) {
                WinterFlowServiceSyntax winterFlowServiceSyntax6 = (WinterFlowServiceSyntax) arrayList6.get(i22);
                Object WinterFlowUnitTestResponse4 = winterFlowDatabaseSchemaStructure.WinterFlowUnitTestResponse(winterFlowServiceSyntax6.WinterFlowUnitTestResponse);
                WinterFlowUnitTestResponse4.getClass();
                WinterFlowResolverBackend.WinterFlowBatchUI(WinterFlowUnitTestResponse4);
                winterFlowServiceSyntax6.WinterFlowCacheManagerAgent((0 - winterFlowServiceSyntax6.WinterFlowServerProtocol) + WinterFlowTransactionManagerStrategy(iArr, winterFlowServiceSyntax6), i6, i2);
                if (z4) {
                    winterFlowJSONProxy.WinterFlowVariableVersionControl(winterFlowServiceSyntax6, true);
                    throw th;
                }
            }
        }
        Collections.reverse(arrayList7);
        arrayList.addAll(0, arrayList7);
        arrayList.addAll(arrayList6);
        arrayList3.clear();
        arrayList2.clear();
        arrayList7.clear();
        arrayList6.clear();
        winterFlowCacheManagerTransactionManager.WinterFlowHookDataSource();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x03cb A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void WinterFlowHookDataSource(WinterFlowViewNode winterFlowViewNode, int i) {
        byte[] bArr;
        WinterFlowServiceProviderGateway winterFlowServiceProviderGateway;
        long j;
        WinterFlowNodeEntity winterFlowNodeEntity;
        String str;
        WinterFlowNodeEntity winterFlowNodeEntity2;
        int i2;
        WinterFlowMapperNode WinterFlowCacheManagerAgent;
        String str2;
        Integer num;
        long j2;
        WinterFlowDeserializationNode winterFlowDeserializationNode;
        byte[] bArr2;
        int i3;
        final WinterFlowJSONProxy winterFlowJSONProxy = this;
        final WinterFlowViewNode winterFlowViewNode2 = winterFlowViewNode;
        byte[] bArr3 = winterFlowViewNode2.WinterFlowHookDataSource;
        WinterFlowFrameworkManager winterFlowFrameworkManager = (WinterFlowFrameworkManager) winterFlowJSONProxy.WinterFlowTransactionManagerStrategy;
        WinterFlowServiceProviderGateway WinterFlowRouterStructure = ((WinterFlowDataSource) winterFlowJSONProxy.WinterFlowHookDataSource).WinterFlowRouterStructure(winterFlowViewNode2.WinterFlowRouterStructure);
        long j3 = 0;
        while (true) {
            final int i4 = 0;
            if (!((Boolean) winterFlowFrameworkManager.WinterFlowThreadListener(new WinterFlowUserManagerSubsystem(winterFlowJSONProxy) { // from class: com.google.android.datatransport.WinterFlowSessionUtility
                public final /* synthetic */ WinterFlowJSONProxy WinterFlowTransactionManagerStrategy;

                {
                    this.WinterFlowTransactionManagerStrategy = winterFlowJSONProxy;
                }

                @Override // com.google.android.datatransport.WinterFlowUserManagerSubsystem
                public final Object WinterFlowHookDataSource() {
                    Boolean bool;
                    int i5 = i4;
                    WinterFlowViewNode winterFlowViewNode3 = winterFlowViewNode2;
                    WinterFlowJSONProxy winterFlowJSONProxy2 = this.WinterFlowTransactionManagerStrategy;
                    switch (i5) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            WinterFlowFrameworkManager winterFlowFrameworkManager2 = (WinterFlowFrameworkManager) winterFlowJSONProxy2.WinterFlowCacheManagerAgent;
                            SQLiteDatabase WinterFlowHookDataSource = winterFlowFrameworkManager2.WinterFlowHookDataSource();
                            WinterFlowHookDataSource.beginTransaction();
                            try {
                                Long WinterFlowArrayNetwork = WinterFlowFrameworkManager.WinterFlowArrayNetwork(WinterFlowHookDataSource, winterFlowViewNode3);
                                if (WinterFlowArrayNetwork == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor rawQuery = winterFlowFrameworkManager2.WinterFlowHookDataSource().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{WinterFlowArrayNetwork.toString()});
                                    try {
                                        Boolean valueOf = Boolean.valueOf(rawQuery.moveToNext());
                                        rawQuery.close();
                                        bool = valueOf;
                                    } catch (Throwable th) {
                                        rawQuery.close();
                                        throw th;
                                    }
                                }
                                WinterFlowHookDataSource.setTransactionSuccessful();
                                return bool;
                            } finally {
                                WinterFlowHookDataSource.endTransaction();
                            }
                        default:
                            WinterFlowFrameworkManager winterFlowFrameworkManager3 = (WinterFlowFrameworkManager) winterFlowJSONProxy2.WinterFlowCacheManagerAgent;
                            winterFlowFrameworkManager3.getClass();
                            return (Iterable) winterFlowFrameworkManager3.WinterFlowTransactionManagerStrategy(new WinterFlowStackInterface(7, winterFlowFrameworkManager3, winterFlowViewNode3));
                    }
                }
            })).booleanValue()) {
                winterFlowFrameworkManager.WinterFlowThreadListener(new WinterFlowPackageService(j3, winterFlowJSONProxy, winterFlowViewNode2));
                return;
            }
            final int i5 = 1;
            Iterable iterable = (Iterable) winterFlowFrameworkManager.WinterFlowThreadListener(new WinterFlowUserManagerSubsystem(winterFlowJSONProxy) { // from class: com.google.android.datatransport.WinterFlowSessionUtility
                public final /* synthetic */ WinterFlowJSONProxy WinterFlowTransactionManagerStrategy;

                {
                    this.WinterFlowTransactionManagerStrategy = winterFlowJSONProxy;
                }

                @Override // com.google.android.datatransport.WinterFlowUserManagerSubsystem
                public final Object WinterFlowHookDataSource() {
                    Boolean bool;
                    int i52 = i5;
                    WinterFlowViewNode winterFlowViewNode3 = winterFlowViewNode2;
                    WinterFlowJSONProxy winterFlowJSONProxy2 = this.WinterFlowTransactionManagerStrategy;
                    switch (i52) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            WinterFlowFrameworkManager winterFlowFrameworkManager2 = (WinterFlowFrameworkManager) winterFlowJSONProxy2.WinterFlowCacheManagerAgent;
                            SQLiteDatabase WinterFlowHookDataSource = winterFlowFrameworkManager2.WinterFlowHookDataSource();
                            WinterFlowHookDataSource.beginTransaction();
                            try {
                                Long WinterFlowArrayNetwork = WinterFlowFrameworkManager.WinterFlowArrayNetwork(WinterFlowHookDataSource, winterFlowViewNode3);
                                if (WinterFlowArrayNetwork == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor rawQuery = winterFlowFrameworkManager2.WinterFlowHookDataSource().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{WinterFlowArrayNetwork.toString()});
                                    try {
                                        Boolean valueOf = Boolean.valueOf(rawQuery.moveToNext());
                                        rawQuery.close();
                                        bool = valueOf;
                                    } catch (Throwable th) {
                                        rawQuery.close();
                                        throw th;
                                    }
                                }
                                WinterFlowHookDataSource.setTransactionSuccessful();
                                return bool;
                            } finally {
                                WinterFlowHookDataSource.endTransaction();
                            }
                        default:
                            WinterFlowFrameworkManager winterFlowFrameworkManager3 = (WinterFlowFrameworkManager) winterFlowJSONProxy2.WinterFlowCacheManagerAgent;
                            winterFlowFrameworkManager3.getClass();
                            return (Iterable) winterFlowFrameworkManager3.WinterFlowTransactionManagerStrategy(new WinterFlowStackInterface(7, winterFlowFrameworkManager3, winterFlowViewNode3));
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            if (WinterFlowRouterStructure == null) {
                WinterFlowServerManager.WinterFlowBandwidthObject("Uploader", "Unknown backend for %s, deleting event batch for it...", winterFlowViewNode2);
                winterFlowNodeEntity2 = new WinterFlowNodeEntity(3, -1L);
                bArr = bArr3;
                winterFlowServiceProviderGateway = WinterFlowRouterStructure;
                j = j3;
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((WinterFlowBackendEngine) it.next()).WinterFlowCacheManagerAgent);
                }
                if (bArr3 != null) {
                    WinterFlowFrameworkManager winterFlowFrameworkManager2 = (WinterFlowFrameworkManager) winterFlowJSONProxy.WinterFlowSyntax;
                    Objects.requireNonNull(winterFlowFrameworkManager2);
                    WinterFlowObjectAgent winterFlowObjectAgent = (WinterFlowObjectAgent) winterFlowFrameworkManager.WinterFlowThreadListener(new WinterFlowXMLFrontend(winterFlowFrameworkManager2, i4));
                    WinterFlowSchedulerParser winterFlowSchedulerParser = new WinterFlowSchedulerParser();
                    winterFlowSchedulerParser.WinterFlowTransactionManagerStrategy = new HashMap();
                    winterFlowSchedulerParser.WinterFlowArrayNetwork = Long.valueOf(((WinterFlowFunctionProcessor) winterFlowJSONProxy.WinterFlowUnitTestResponse).WinterFlowTransactionManagerStrategy());
                    winterFlowSchedulerParser.WinterFlowVariableVersionControl = Long.valueOf(((WinterFlowFunctionProcessor) winterFlowJSONProxy.WinterFlowRouterRouter).WinterFlowTransactionManagerStrategy());
                    winterFlowSchedulerParser.WinterFlowRouterStructure = "GDT_CLIENT_METRICS";
                    WinterFlowFrontendCache winterFlowFrontendCache = new WinterFlowFrontendCache("proto");
                    winterFlowObjectAgent.getClass();
                    WinterFlowAlgorithmArray winterFlowAlgorithmArray = WinterFlowFrontendEncryption.WinterFlowRouterStructure;
                    winterFlowAlgorithmArray.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        winterFlowAlgorithmArray.WinterFlowConcurrencyThread(winterFlowObjectAgent, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    winterFlowSchedulerParser.WinterFlowCacheManagerAgent = new WinterFlowBatchSubsystem(winterFlowFrontendCache, byteArrayOutputStream.toByteArray());
                    arrayList.add(((WinterFlowDebugDeployment) WinterFlowRouterStructure).WinterFlowRouterStructure(winterFlowSchedulerParser.WinterFlowUnitTestResponse()));
                }
                WinterFlowDebugDeployment winterFlowDebugDeployment = (WinterFlowDebugDeployment) WinterFlowRouterStructure;
                HashMap hashMap = new HashMap();
                int size = arrayList.size();
                int i6 = 0;
                while (i6 < size) {
                    Object obj = arrayList.get(i6);
                    i6++;
                    WinterFlowObjectFrontend winterFlowObjectFrontend = (WinterFlowObjectFrontend) obj;
                    String str3 = winterFlowObjectFrontend.WinterFlowRouterStructure;
                    if (hashMap.containsKey(str3)) {
                        bArr2 = bArr3;
                        ((List) hashMap.get(str3)).add(winterFlowObjectFrontend);
                    } else {
                        bArr2 = bArr3;
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(winterFlowObjectFrontend);
                        hashMap.put(str3, arrayList2);
                    }
                    bArr3 = bArr2;
                }
                bArr = bArr3;
                ArrayList arrayList3 = new ArrayList();
                for (Map.Entry entry : hashMap.entrySet()) {
                    WinterFlowObjectFrontend winterFlowObjectFrontend2 = (WinterFlowObjectFrontend) ((List) entry.getValue()).get(0);
                    WinterFlowDeserializationSubsystem winterFlowDeserializationSubsystem = WinterFlowDeserializationSubsystem.WinterFlowVariableVersionControl;
                    long WinterFlowTransactionManagerStrategy = winterFlowDebugDeployment.WinterFlowTransactionManagerStrategy.WinterFlowTransactionManagerStrategy();
                    long WinterFlowTransactionManagerStrategy2 = winterFlowDebugDeployment.WinterFlowVariableVersionControl.WinterFlowTransactionManagerStrategy();
                    WinterFlowMiddleware winterFlowMiddleware = new WinterFlowMiddleware(new WinterFlowBatchDataSource(Integer.valueOf(winterFlowObjectFrontend2.WinterFlowHookDataSource("sdk-version")), winterFlowObjectFrontend2.WinterFlowRouterStructure("model"), winterFlowObjectFrontend2.WinterFlowRouterStructure("hardware"), winterFlowObjectFrontend2.WinterFlowRouterStructure("device"), winterFlowObjectFrontend2.WinterFlowRouterStructure("product"), winterFlowObjectFrontend2.WinterFlowRouterStructure("os-uild"), winterFlowObjectFrontend2.WinterFlowRouterStructure("manufacturer"), winterFlowObjectFrontend2.WinterFlowRouterStructure("fingerprint"), winterFlowObjectFrontend2.WinterFlowRouterStructure("locale"), winterFlowObjectFrontend2.WinterFlowRouterStructure("country"), winterFlowObjectFrontend2.WinterFlowRouterStructure("mcc_mnc"), winterFlowObjectFrontend2.WinterFlowRouterStructure("application_build")));
                    try {
                        num = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                        str2 = null;
                    } catch (NumberFormatException unused2) {
                        str2 = (String) entry.getKey();
                        num = null;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (WinterFlowObjectFrontend winterFlowObjectFrontend3 : (List) entry.getValue()) {
                        WinterFlowBatchSubsystem winterFlowBatchSubsystem = winterFlowObjectFrontend3.WinterFlowCacheManagerAgent;
                        WinterFlowServiceProviderGateway winterFlowServiceProviderGateway2 = WinterFlowRouterStructure;
                        WinterFlowFrontendCache winterFlowFrontendCache2 = winterFlowBatchSubsystem.WinterFlowRouterStructure;
                        byte[] bArr4 = winterFlowBatchSubsystem.WinterFlowHookDataSource;
                        if (winterFlowFrontendCache2.equals(new WinterFlowFrontendCache("proto"))) {
                            winterFlowDeserializationNode = new WinterFlowDeserializationNode();
                            winterFlowDeserializationNode.WinterFlowRouterRouter = bArr4;
                            j2 = j3;
                        } else {
                            j2 = j3;
                            if (winterFlowFrontendCache2.equals(new WinterFlowFrontendCache("json"))) {
                                String str4 = new String(bArr4, Charset.forName(Constants.ENCODING));
                                WinterFlowDeserializationNode winterFlowDeserializationNode2 = new WinterFlowDeserializationNode();
                                winterFlowDeserializationNode2.WinterFlowSyntax = str4;
                                winterFlowDeserializationNode = winterFlowDeserializationNode2;
                            } else {
                                if (Log.isLoggable("TRuntime.".concat("CctTransportBackend"), 5)) {
                                    winterFlowFrontendCache2.toString();
                                }
                                WinterFlowRouterStructure = winterFlowServiceProviderGateway2;
                                j3 = j2;
                            }
                        }
                        winterFlowDeserializationNode.WinterFlowVariableVersionControl = Long.valueOf(winterFlowObjectFrontend3.WinterFlowArrayNetwork);
                        winterFlowDeserializationNode.WinterFlowUnitTestResponse = Long.valueOf(winterFlowObjectFrontend3.WinterFlowVariableVersionControl);
                        String str5 = (String) winterFlowObjectFrontend3.WinterFlowTransactionManagerStrategy.get("tz-offset");
                        winterFlowDeserializationNode.WinterFlowResponseEngine = Long.valueOf(str5 == null ? 0L : Long.valueOf(str5).longValue());
                        winterFlowDeserializationNode.WinterFlowTransactionAgent = new WinterFlowControllerAdapter((WinterFlowListenerHelper) WinterFlowListenerHelper.WinterFlowVariableVersionControl.get(winterFlowObjectFrontend3.WinterFlowHookDataSource("net-type")), (WinterFlowBatchStructure) WinterFlowBatchStructure.WinterFlowVariableVersionControl.get(winterFlowObjectFrontend3.WinterFlowHookDataSource("mobile-subtype")));
                        Integer num2 = winterFlowObjectFrontend3.WinterFlowHookDataSource;
                        if (num2 != null) {
                            winterFlowDeserializationNode.WinterFlowTransactionManagerStrategy = num2;
                        }
                        String str6 = ((Long) winterFlowDeserializationNode.WinterFlowVariableVersionControl) == null ? " eventTimeMs" : "";
                        if (((Long) winterFlowDeserializationNode.WinterFlowUnitTestResponse) == null) {
                            str6 = str6.concat(" eventUptimeMs");
                        }
                        if (((Long) winterFlowDeserializationNode.WinterFlowResponseEngine) == null) {
                            str6 = str6.concat(" timezoneOffsetSeconds");
                        }
                        if (!str6.isEmpty()) {
                            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Missing required properties:".concat(str6));
                            return;
                        } else {
                            arrayList4.add(new WinterFlowVersionDeserialization(((Long) winterFlowDeserializationNode.WinterFlowVariableVersionControl).longValue(), (Integer) winterFlowDeserializationNode.WinterFlowTransactionManagerStrategy, ((Long) winterFlowDeserializationNode.WinterFlowUnitTestResponse).longValue(), (byte[]) winterFlowDeserializationNode.WinterFlowRouterRouter, (String) winterFlowDeserializationNode.WinterFlowSyntax, ((Long) winterFlowDeserializationNode.WinterFlowResponseEngine).longValue(), (WinterFlowControllerAdapter) winterFlowDeserializationNode.WinterFlowTransactionAgent));
                            WinterFlowRouterStructure = winterFlowServiceProviderGateway2;
                            j3 = j2;
                        }
                    }
                    arrayList3.add(new WinterFlowProcessorJava(WinterFlowTransactionManagerStrategy, WinterFlowTransactionManagerStrategy2, winterFlowMiddleware, num, str2, arrayList4));
                }
                winterFlowServiceProviderGateway = WinterFlowRouterStructure;
                j = j3;
                WinterFlowStrategy winterFlowStrategy = new WinterFlowStrategy(arrayList3);
                URL url = winterFlowDebugDeployment.WinterFlowArrayNetwork;
                if (bArr != null) {
                    try {
                        WinterFlowCacheTransaction WinterFlowRouterStructure2 = WinterFlowCacheTransaction.WinterFlowRouterStructure(bArr);
                        str = WinterFlowRouterStructure2.WinterFlowHookDataSource;
                        if (str == null) {
                            str = null;
                        }
                        url = WinterFlowDebugDeployment.WinterFlowHookDataSource(WinterFlowRouterStructure2.WinterFlowRouterStructure);
                    } catch (IllegalArgumentException unused3) {
                        winterFlowNodeEntity = new WinterFlowNodeEntity(3, -1L);
                    }
                } else {
                    str = null;
                }
                try {
                    WinterFlowObjectPackage winterFlowObjectPackage = new WinterFlowObjectPackage(url, winterFlowStrategy, str, 5);
                    WinterFlowExceptionBandwidth winterFlowExceptionBandwidth = new WinterFlowExceptionBandwidth(1, winterFlowDebugDeployment);
                    int i7 = 5;
                    do {
                        WinterFlowCacheManagerAgent = winterFlowExceptionBandwidth.WinterFlowCacheManagerAgent(winterFlowObjectPackage);
                        URL url2 = WinterFlowCacheManagerAgent.WinterFlowHookDataSource;
                        if (url2 != null) {
                            WinterFlowServerManager.WinterFlowBandwidthObject("CctTransportBackend", "Following redirect to: %s", url2);
                            winterFlowObjectPackage = new WinterFlowObjectPackage(url2, (WinterFlowStrategy) winterFlowObjectPackage.WinterFlowUnitTestResponse, (String) winterFlowObjectPackage.WinterFlowRouterRouter, 5);
                        } else {
                            winterFlowObjectPackage = null;
                        }
                        if (winterFlowObjectPackage == null) {
                            break;
                        } else {
                            i7--;
                        }
                    } while (i7 >= 1);
                    int i8 = WinterFlowCacheManagerAgent.WinterFlowRouterStructure;
                    if (i8 == 200) {
                        winterFlowNodeEntity2 = new WinterFlowNodeEntity(1, WinterFlowCacheManagerAgent.WinterFlowCacheManagerAgent);
                    } else {
                        if (i8 >= 500 || i8 == 404) {
                            winterFlowNodeEntity = new WinterFlowNodeEntity(2, -1L);
                        } else if (i8 == 400) {
                            try {
                                winterFlowNodeEntity = new WinterFlowNodeEntity(4, -1L);
                            } catch (IOException unused4) {
                                WinterFlowServerManager.WinterFlowMapperProtocol("CctTransportBackend");
                                i2 = 2;
                                winterFlowNodeEntity2 = new WinterFlowNodeEntity(2, -1L);
                                i3 = winterFlowNodeEntity2.WinterFlowRouterStructure;
                                if (i3 != i2) {
                                }
                            }
                        } else {
                            winterFlowNodeEntity = new WinterFlowNodeEntity(3, -1L);
                        }
                        winterFlowNodeEntity2 = winterFlowNodeEntity;
                    }
                } catch (IOException unused5) {
                }
            }
            i2 = 2;
            i3 = winterFlowNodeEntity2.WinterFlowRouterStructure;
            if (i3 != i2) {
                winterFlowFrameworkManager.WinterFlowThreadListener(new WinterFlowDecoratorModule(this, iterable, winterFlowViewNode, j));
                ((WinterFlowObjectPackage) this.WinterFlowArrayNetwork).WinterFlowRouterAdapter(winterFlowViewNode, i + 1, true);
                return;
            }
            winterFlowJSONProxy = this;
            winterFlowViewNode2 = winterFlowViewNode;
            long j4 = j;
            winterFlowFrameworkManager.WinterFlowThreadListener(new WinterFlowStackInterface(8, winterFlowJSONProxy, iterable));
            if (i3 == 1) {
                j3 = Math.max(j4, winterFlowNodeEntity2.WinterFlowHookDataSource);
                if (bArr != null) {
                    winterFlowFrameworkManager.WinterFlowThreadListener(new WinterFlowExceptionBandwidth(7, winterFlowJSONProxy));
                }
            } else {
                if (i3 == 4) {
                    HashMap hashMap2 = new HashMap();
                    Iterator it2 = iterable.iterator();
                    while (it2.hasNext()) {
                        String str7 = ((WinterFlowBackendEngine) it2.next()).WinterFlowCacheManagerAgent.WinterFlowRouterStructure;
                        if (hashMap2.containsKey(str7)) {
                            hashMap2.put(str7, Integer.valueOf(((Integer) hashMap2.get(str7)).intValue() + 1));
                        } else {
                            hashMap2.put(str7, 1);
                        }
                    }
                    winterFlowFrameworkManager.WinterFlowThreadListener(new WinterFlowStackInterface(9, winterFlowJSONProxy, hashMap2));
                }
                j3 = j4;
            }
            bArr3 = bArr;
            WinterFlowRouterStructure = winterFlowServiceProviderGateway;
        }
    }

    public long WinterFlowRouterStructure() {
        ArrayList arrayList = (ArrayList) this.WinterFlowRouterRouter;
        if (arrayList.size() <= 0) {
            return 0L;
        }
        WinterFlowResolverBackend.WinterFlowBatchUI(arrayList.get(0));
        throw null;
    }

    public void WinterFlowVariableVersionControl(WinterFlowServiceSyntax winterFlowServiceSyntax, boolean z) {
        Object WinterFlowUnitTestResponse = ((WinterFlowDatabaseSchemaStructure) this.WinterFlowRouterStructure).WinterFlowUnitTestResponse(winterFlowServiceSyntax.WinterFlowUnitTestResponse);
        WinterFlowUnitTestResponse.getClass();
        WinterFlowResolverBackend.WinterFlowBatchUI(WinterFlowUnitTestResponse);
        throw null;
    }

    public WinterFlowJSONProxy(Context context, WinterFlowDataSource winterFlowDataSource, WinterFlowFrameworkManager winterFlowFrameworkManager, WinterFlowObjectPackage winterFlowObjectPackage, Executor executor, WinterFlowFrameworkManager winterFlowFrameworkManager2, WinterFlowFunctionProcessor winterFlowFunctionProcessor, WinterFlowFunctionProcessor winterFlowFunctionProcessor2, WinterFlowFrameworkManager winterFlowFrameworkManager3) {
        this.WinterFlowRouterStructure = context;
        this.WinterFlowHookDataSource = winterFlowDataSource;
        this.WinterFlowCacheManagerAgent = winterFlowFrameworkManager;
        this.WinterFlowArrayNetwork = winterFlowObjectPackage;
        this.WinterFlowVariableVersionControl = executor;
        this.WinterFlowTransactionManagerStrategy = winterFlowFrameworkManager2;
        this.WinterFlowUnitTestResponse = winterFlowFunctionProcessor;
        this.WinterFlowRouterRouter = winterFlowFunctionProcessor2;
        this.WinterFlowSyntax = winterFlowFrameworkManager3;
    }
}
