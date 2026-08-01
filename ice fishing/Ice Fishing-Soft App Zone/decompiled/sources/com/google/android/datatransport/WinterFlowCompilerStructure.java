package com.google.android.datatransport;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowCompilerStructure implements CharSequence {
    public final ArrayList WinterFlowRouterRouter;
    public final String WinterFlowTransactionManagerStrategy;
    public final ArrayList WinterFlowUnitTestResponse;
    public final List WinterFlowVariableVersionControl;

    static {
        WinterFlowCacheManagerVersionControl winterFlowCacheManagerVersionControl = WinterFlowLoaderHelper.WinterFlowRouterStructure;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b2, code lost:
    
        r0.WinterFlowRouterStructure(r2.WinterFlowCacheManagerAgent);
        r1 = r1 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public WinterFlowCompilerStructure(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.WinterFlowVariableVersionControl = list;
        this.WinterFlowTransactionManagerStrategy = str;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i = 0; i < size; i++) {
                WinterFlowVariableTransaction winterFlowVariableTransaction = (WinterFlowVariableTransaction) list.get(i);
                Object obj = winterFlowVariableTransaction.WinterFlowRouterStructure;
                if (obj instanceof WinterFlowDebugUtility) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(winterFlowVariableTransaction);
                } else if (obj instanceof WinterFlowFrameworkArray) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(winterFlowVariableTransaction);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.WinterFlowUnitTestResponse = arrayList;
        this.WinterFlowRouterRouter = arrayList2;
        List WinterFlowUIThreadPool = arrayList2 != null ? WinterFlowSerializerUtility.WinterFlowUIThreadPool(arrayList2, new WinterFlowClassSystem(5)) : null;
        if (WinterFlowUIThreadPool == null || WinterFlowUIThreadPool.isEmpty()) {
            return;
        }
        int i2 = ((WinterFlowVariableTransaction) WinterFlowSerializerUtility.WinterFlowStrategyHook(WinterFlowUIThreadPool)).WinterFlowCacheManagerAgent;
        WinterFlowTransactionStructure winterFlowTransactionStructure = WinterFlowFunctionScheduler.WinterFlowRouterStructure;
        int i3 = 1;
        WinterFlowTransactionStructure winterFlowTransactionStructure2 = new WinterFlowTransactionStructure(1);
        winterFlowTransactionStructure2.WinterFlowRouterStructure(i2);
        int size2 = WinterFlowUIThreadPool.size();
        while (i3 < size2) {
            WinterFlowVariableTransaction winterFlowVariableTransaction2 = (WinterFlowVariableTransaction) WinterFlowUIThreadPool.get(i3);
            while (true) {
                int i4 = winterFlowTransactionStructure2.WinterFlowHookDataSource;
                if (i4 == 0) {
                    break;
                }
                if (i4 == 0) {
                    WinterFlowCompilerMechanism.WinterFlowSyntax("IntList is empty.");
                    throw null;
                }
                int i5 = winterFlowTransactionStructure2.WinterFlowRouterStructure[i4 - 1];
                int i6 = winterFlowVariableTransaction2.WinterFlowHookDataSource;
                int i7 = winterFlowVariableTransaction2.WinterFlowCacheManagerAgent;
                if (i6 >= i5) {
                    winterFlowTransactionStructure2.WinterFlowCacheManagerAgent(i4 - 1);
                } else if (i7 > i5) {
                    WinterFlowWorkerPipeline.WinterFlowRouterStructure("Paragraph overlap not allowed, end " + i7 + " should be less than or equal to " + i5);
                }
            }
        }
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.WinterFlowTransactionManagerStrategy.charAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowCompilerStructure)) {
            return false;
        }
        WinterFlowCompilerStructure winterFlowCompilerStructure = (WinterFlowCompilerStructure) obj;
        return WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowTransactionManagerStrategy, winterFlowCompilerStructure.WinterFlowTransactionManagerStrategy) && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowVariableVersionControl, winterFlowCompilerStructure.WinterFlowVariableVersionControl);
    }

    public final int hashCode() {
        int hashCode = this.WinterFlowTransactionManagerStrategy.hashCode() * 31;
        List list = this.WinterFlowVariableVersionControl;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.WinterFlowTransactionManagerStrategy.length();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        if (i > i2) {
            WinterFlowWorkerPipeline.WinterFlowRouterStructure("start (" + i + ") should be less or equal to end (" + i2 + ')');
        }
        String str = this.WinterFlowTransactionManagerStrategy;
        if (i == 0 && i2 == str.length()) {
            return this;
        }
        String substring = str.substring(i, i2);
        int i3 = WinterFlowAlgorithmStrategy.WinterFlowRouterStructure;
        if (i > i2) {
            WinterFlowWorkerPipeline.WinterFlowRouterStructure("start (" + i + ") should be less than or equal to end (" + i2 + ')');
        }
        List list = this.WinterFlowVariableVersionControl;
        ArrayList arrayList = null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                WinterFlowVariableTransaction winterFlowVariableTransaction = (WinterFlowVariableTransaction) list.get(i4);
                int i5 = winterFlowVariableTransaction.WinterFlowHookDataSource;
                int i6 = winterFlowVariableTransaction.WinterFlowCacheManagerAgent;
                if (WinterFlowAlgorithmStrategy.WinterFlowRouterStructure(i, i2, i5, i6)) {
                    arrayList2.add(new WinterFlowVariableTransaction(Math.max(i, winterFlowVariableTransaction.WinterFlowHookDataSource) - i, Math.min(i2, i6) - i, winterFlowVariableTransaction.WinterFlowRouterStructure, winterFlowVariableTransaction.WinterFlowArrayNetwork));
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList = arrayList2;
            }
        }
        return new WinterFlowCompilerStructure(arrayList, substring);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.WinterFlowTransactionManagerStrategy;
    }

    public /* synthetic */ WinterFlowCompilerStructure(String str) {
        this(str, WinterFlowDataSourceEngine.WinterFlowVariableVersionControl);
    }

    public WinterFlowCompilerStructure(String str, List list) {
        this(list.isEmpty() ? null : list, str);
    }
}
