package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowSerializerProtocol extends WinterFlowSchedulerSession {
    public static WinterFlowSerializerProtocol WinterFlowCacheManagerAgent;

    public final boolean WinterFlowResponseEngine(int i) {
        if (i <= 0 || WinterFlowCacheManagerAgent().charAt(i - 1) == '\n') {
            return false;
        }
        return i == WinterFlowCacheManagerAgent().length() || WinterFlowCacheManagerAgent().charAt(i) == '\n';
    }

    @Override // com.google.android.datatransport.WinterFlowSchedulerSession
    public final int[] WinterFlowRouterStructure(int i) {
        int length = WinterFlowCacheManagerAgent().length();
        if (length <= 0 || i >= length) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        while (i < length && WinterFlowCacheManagerAgent().charAt(i) == '\n' && (WinterFlowCacheManagerAgent().charAt(i) == '\n' || (i != 0 && WinterFlowCacheManagerAgent().charAt(i - 1) != '\n'))) {
            i++;
        }
        if (i >= length) {
            return null;
        }
        int i2 = i + 1;
        while (i2 < length && !WinterFlowResponseEngine(i2)) {
            i2++;
        }
        return WinterFlowHookDataSource(i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        return null;
     */
    @Override // com.google.android.datatransport.WinterFlowSchedulerSession
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int[] WinterFlowSyntax(int i) {
        int length = WinterFlowCacheManagerAgent().length();
        if (length <= 0 || i <= 0) {
            return null;
        }
        if (i > length) {
            i = length;
        }
        while (i > 0 && WinterFlowCacheManagerAgent().charAt(i - 1) == '\n' && !WinterFlowResponseEngine(i)) {
            i--;
        }
        int i2 = i - 1;
        while (i2 > 0 && (WinterFlowCacheManagerAgent().charAt(i2) == '\n' || (i2 != 0 && WinterFlowCacheManagerAgent().charAt(i2 - 1) != '\n'))) {
            i2--;
        }
        return WinterFlowHookDataSource(i2, i);
    }
}
