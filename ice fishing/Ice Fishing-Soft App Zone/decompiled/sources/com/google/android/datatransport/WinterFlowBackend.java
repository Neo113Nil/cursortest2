package com.google.android.datatransport;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowBackend {
    public static final ThreadLocal WinterFlowArrayNetwork = new ThreadLocal();
    public volatile int WinterFlowCacheManagerAgent = 0;
    public final WinterFlowStackProvider WinterFlowHookDataSource;
    public final int WinterFlowRouterStructure;

    public WinterFlowBackend(WinterFlowStackProvider winterFlowStackProvider, int i) {
        this.WinterFlowHookDataSource = winterFlowStackProvider;
        this.WinterFlowRouterStructure = i;
    }

    public final WinterFlowSoftwareVersion WinterFlowHookDataSource() {
        ThreadLocal threadLocal = WinterFlowArrayNetwork;
        WinterFlowSoftwareVersion winterFlowSoftwareVersion = (WinterFlowSoftwareVersion) threadLocal.get();
        if (winterFlowSoftwareVersion == null) {
            winterFlowSoftwareVersion = new WinterFlowSoftwareVersion();
            threadLocal.set(winterFlowSoftwareVersion);
        }
        WinterFlowInheritanceQuery winterFlowInheritanceQuery = (WinterFlowInheritanceQuery) this.WinterFlowHookDataSource.WinterFlowVariableVersionControl;
        int WinterFlowRouterStructure = winterFlowInheritanceQuery.WinterFlowRouterStructure(6);
        if (WinterFlowRouterStructure != 0) {
            int i = WinterFlowRouterStructure + winterFlowInheritanceQuery.WinterFlowVariableVersionControl;
            int i2 = (this.WinterFlowRouterStructure * 4) + ((ByteBuffer) winterFlowInheritanceQuery.WinterFlowRouterRouter).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) winterFlowInheritanceQuery.WinterFlowRouterRouter).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) winterFlowInheritanceQuery.WinterFlowRouterRouter;
            winterFlowSoftwareVersion.WinterFlowRouterRouter = byteBuffer;
            if (byteBuffer != null) {
                winterFlowSoftwareVersion.WinterFlowVariableVersionControl = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                winterFlowSoftwareVersion.WinterFlowTransactionManagerStrategy = i4;
                winterFlowSoftwareVersion.WinterFlowUnitTestResponse = ((ByteBuffer) winterFlowSoftwareVersion.WinterFlowRouterRouter).getShort(i4);
                return winterFlowSoftwareVersion;
            }
            winterFlowSoftwareVersion.WinterFlowVariableVersionControl = 0;
            winterFlowSoftwareVersion.WinterFlowTransactionManagerStrategy = 0;
            winterFlowSoftwareVersion.WinterFlowUnitTestResponse = 0;
        }
        return winterFlowSoftwareVersion;
    }

    public final int WinterFlowRouterStructure(int i) {
        WinterFlowSoftwareVersion WinterFlowHookDataSource = WinterFlowHookDataSource();
        int WinterFlowRouterStructure = WinterFlowHookDataSource.WinterFlowRouterStructure(16);
        if (WinterFlowRouterStructure == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) WinterFlowHookDataSource.WinterFlowRouterRouter;
        int i2 = WinterFlowRouterStructure + WinterFlowHookDataSource.WinterFlowVariableVersionControl;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        WinterFlowSoftwareVersion WinterFlowHookDataSource = WinterFlowHookDataSource();
        int WinterFlowRouterStructure = WinterFlowHookDataSource.WinterFlowRouterStructure(4);
        sb.append(Integer.toHexString(WinterFlowRouterStructure != 0 ? ((ByteBuffer) WinterFlowHookDataSource.WinterFlowRouterRouter).getInt(WinterFlowRouterStructure + WinterFlowHookDataSource.WinterFlowVariableVersionControl) : 0));
        sb.append(", codepoints:");
        WinterFlowSoftwareVersion WinterFlowHookDataSource2 = WinterFlowHookDataSource();
        int WinterFlowRouterStructure2 = WinterFlowHookDataSource2.WinterFlowRouterStructure(16);
        if (WinterFlowRouterStructure2 != 0) {
            int i2 = WinterFlowRouterStructure2 + WinterFlowHookDataSource2.WinterFlowVariableVersionControl;
            i = ((ByteBuffer) WinterFlowHookDataSource2.WinterFlowRouterRouter).getInt(((ByteBuffer) WinterFlowHookDataSource2.WinterFlowRouterRouter).getInt(i2) + i2);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(Integer.toHexString(WinterFlowRouterStructure(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
