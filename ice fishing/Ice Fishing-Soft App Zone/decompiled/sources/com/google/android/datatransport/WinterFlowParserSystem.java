package com.google.android.datatransport;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowParserSystem implements WinterFlowEncryptionComponent {
    public final WinterFlowDatabaseSchemaStructure WinterFlowTransactionManagerStrategy;
    public WinterFlowDatabaseSchemaStructure WinterFlowUnitTestResponse;
    public final WinterFlowObjectSession WinterFlowVariableVersionControl;

    public WinterFlowParserSystem(Map map, WinterFlowObjectSession winterFlowObjectSession) {
        WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure;
        this.WinterFlowVariableVersionControl = winterFlowObjectSession;
        if (map == null || map.isEmpty()) {
            winterFlowDatabaseSchemaStructure = null;
        } else {
            winterFlowDatabaseSchemaStructure = new WinterFlowDatabaseSchemaStructure(map.size());
            for (Map.Entry entry : map.entrySet()) {
                winterFlowDatabaseSchemaStructure.WinterFlowThreadListener(entry.getKey(), entry.getValue());
            }
        }
        this.WinterFlowTransactionManagerStrategy = winterFlowDatabaseSchemaStructure;
    }

    @Override // com.google.android.datatransport.WinterFlowEncryptionComponent
    public final WinterFlowLoaderHook WinterFlowArrayNetwork(String str, WinterFlowObjectUI winterFlowObjectUI) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!WinterFlowQuerySyntax.WinterFlowBatchUI(str.charAt(i))) {
                WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure = this.WinterFlowUnitTestResponse;
                if (winterFlowDatabaseSchemaStructure == null) {
                    long[] jArr = WinterFlowDatabaseSchemaUtility.WinterFlowRouterStructure;
                    winterFlowDatabaseSchemaStructure = new WinterFlowDatabaseSchemaStructure();
                    this.WinterFlowUnitTestResponse = winterFlowDatabaseSchemaStructure;
                }
                Object WinterFlowUnitTestResponse = winterFlowDatabaseSchemaStructure.WinterFlowUnitTestResponse(str);
                if (WinterFlowUnitTestResponse == null) {
                    WinterFlowUnitTestResponse = new ArrayList();
                    winterFlowDatabaseSchemaStructure.WinterFlowThreadListener(str, WinterFlowUnitTestResponse);
                }
                ((List) WinterFlowUnitTestResponse).add(winterFlowObjectUI);
                return new WinterFlowObjectPackage(winterFlowDatabaseSchemaStructure, str, winterFlowObjectUI, 22);
            }
        }
        WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("Registered key is empty or blank");
        return null;
    }

    @Override // com.google.android.datatransport.WinterFlowEncryptionComponent
    public final boolean WinterFlowCacheManagerAgent(Object obj) {
        return ((Boolean) this.WinterFlowVariableVersionControl.WinterFlowUnitTestResponse(obj)).booleanValue();
    }

    @Override // com.google.android.datatransport.WinterFlowEncryptionComponent
    public final Object WinterFlowTransactionManagerStrategy(String str) {
        WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure = this.WinterFlowTransactionManagerStrategy;
        List list = winterFlowDatabaseSchemaStructure != null ? (List) winterFlowDatabaseSchemaStructure.WinterFlowTransactionAgent(str) : null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && winterFlowDatabaseSchemaStructure != null) {
            List subList = list.subList(1, list.size());
            int WinterFlowTransactionManagerStrategy = winterFlowDatabaseSchemaStructure.WinterFlowTransactionManagerStrategy(str);
            if (WinterFlowTransactionManagerStrategy < 0) {
                WinterFlowTransactionManagerStrategy = ~WinterFlowTransactionManagerStrategy;
            }
            Object[] objArr = winterFlowDatabaseSchemaStructure.WinterFlowCacheManagerAgent;
            Object obj = objArr[WinterFlowTransactionManagerStrategy];
            winterFlowDatabaseSchemaStructure.WinterFlowHookDataSource[WinterFlowTransactionManagerStrategy] = str;
            objArr[WinterFlowTransactionManagerStrategy] = subList;
        }
        return list.get(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009a  */
    @Override // com.google.android.datatransport.WinterFlowEncryptionComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map WinterFlowVariableVersionControl() {
        char c;
        long j;
        long j2;
        long j3;
        WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure;
        long[] jArr;
        int i;
        long[] jArr2;
        int i2;
        char c2;
        long j4;
        WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure2 = this.WinterFlowTransactionManagerStrategy;
        if (winterFlowDatabaseSchemaStructure2 == null && this.WinterFlowUnitTestResponse == null) {
            return WinterFlowFrontendNode.WinterFlowVariableVersionControl;
        }
        int i3 = 0;
        int i4 = winterFlowDatabaseSchemaStructure2 != null ? winterFlowDatabaseSchemaStructure2.WinterFlowVariableVersionControl : 0;
        WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure3 = this.WinterFlowUnitTestResponse;
        HashMap hashMap = new HashMap(i4 + (winterFlowDatabaseSchemaStructure3 != null ? winterFlowDatabaseSchemaStructure3.WinterFlowVariableVersionControl : 0));
        char c3 = 7;
        long j5 = -9187201950435737472L;
        int i5 = 8;
        if (winterFlowDatabaseSchemaStructure2 != null) {
            Object[] objArr = winterFlowDatabaseSchemaStructure2.WinterFlowHookDataSource;
            Object[] objArr2 = winterFlowDatabaseSchemaStructure2.WinterFlowCacheManagerAgent;
            long[] jArr3 = winterFlowDatabaseSchemaStructure2.WinterFlowRouterStructure;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i6 = 0;
                j2 = 128;
                while (true) {
                    long j6 = jArr3[i6];
                    j3 = 255;
                    if ((((~j6) << c3) & j6 & j5) != j5) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j6 & 255) < 128) {
                                int i9 = (i6 << 3) + i8;
                                c2 = c3;
                                j4 = j5;
                                hashMap.put((String) objArr[i9], (List) objArr2[i9]);
                            } else {
                                c2 = c3;
                                j4 = j5;
                            }
                            j6 >>= 8;
                            i8++;
                            c3 = c2;
                            j5 = j4;
                        }
                        c = c3;
                        j = j5;
                        if (i7 != 8) {
                            break;
                        }
                    } else {
                        c = c3;
                        j = j5;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    c3 = c;
                    j5 = j;
                }
                winterFlowDatabaseSchemaStructure = this.WinterFlowUnitTestResponse;
                if (winterFlowDatabaseSchemaStructure != null) {
                    Object[] objArr3 = winterFlowDatabaseSchemaStructure.WinterFlowHookDataSource;
                    Object[] objArr4 = winterFlowDatabaseSchemaStructure.WinterFlowCacheManagerAgent;
                    long[] jArr4 = winterFlowDatabaseSchemaStructure.WinterFlowRouterStructure;
                    int length2 = jArr4.length - 2;
                    if (length2 >= 0) {
                        int i10 = 0;
                        while (true) {
                            long j7 = jArr4[i10];
                            if ((((~j7) << c) & j7 & j) != j) {
                                int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                int i12 = i3;
                                while (i12 < i11) {
                                    if ((j7 & j3) < j2) {
                                        int i13 = (i10 << 3) + i12;
                                        Object obj = objArr3[i13];
                                        List list = (List) objArr4[i13];
                                        String str = (String) obj;
                                        i2 = i5;
                                        if (list.size() == 1) {
                                            Object WinterFlowRouterStructure = ((WinterFlowObjectUI) list.get(i3)).WinterFlowRouterStructure();
                                            if (WinterFlowRouterStructure != null) {
                                                if (!WinterFlowCacheManagerAgent(WinterFlowRouterStructure)) {
                                                    throw new IllegalStateException(WinterFlowWorkerVersionControl.WinterFlowCacheManagerAgent(WinterFlowRouterStructure).toString());
                                                }
                                                hashMap.put(str, WinterFlowUnitTestLibrary.WinterFlowRouterRouter(WinterFlowRouterStructure));
                                            }
                                            jArr2 = jArr4;
                                        } else {
                                            int size = list.size();
                                            ArrayList arrayList = new ArrayList(size);
                                            while (i3 < size) {
                                                long[] jArr5 = jArr4;
                                                Object WinterFlowRouterStructure2 = ((WinterFlowObjectUI) list.get(i3)).WinterFlowRouterStructure();
                                                if (WinterFlowRouterStructure2 != null && !WinterFlowCacheManagerAgent(WinterFlowRouterStructure2)) {
                                                    throw new IllegalStateException(WinterFlowWorkerVersionControl.WinterFlowCacheManagerAgent(WinterFlowRouterStructure2).toString());
                                                }
                                                arrayList.add(WinterFlowRouterStructure2);
                                                i3++;
                                                jArr4 = jArr5;
                                            }
                                            jArr2 = jArr4;
                                            hashMap.put(str, arrayList);
                                        }
                                    } else {
                                        jArr2 = jArr4;
                                        i2 = i5;
                                    }
                                    j7 >>= i2;
                                    i12++;
                                    i5 = i2;
                                    jArr4 = jArr2;
                                    i3 = 0;
                                }
                                jArr = jArr4;
                                i = i5;
                                if (i11 != i) {
                                    break;
                                }
                            } else {
                                jArr = jArr4;
                                i = i5;
                            }
                            if (i10 == length2) {
                                break;
                            }
                            i10++;
                            i5 = i;
                            jArr4 = jArr;
                            i3 = 0;
                        }
                    }
                }
                return hashMap;
            }
        }
        c = 7;
        j = -9187201950435737472L;
        j2 = 128;
        j3 = 255;
        winterFlowDatabaseSchemaStructure = this.WinterFlowUnitTestResponse;
        if (winterFlowDatabaseSchemaStructure != null) {
        }
        return hashMap;
    }
}
