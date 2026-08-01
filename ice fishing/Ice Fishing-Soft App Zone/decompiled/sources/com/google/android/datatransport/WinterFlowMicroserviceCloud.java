package com.google.android.datatransport;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public class WinterFlowMicroserviceCloud implements Iterable, Serializable {
    public static final WinterFlowListenerSubsystem WinterFlowRouterRouter;
    public static final WinterFlowMicroserviceCloud WinterFlowUnitTestResponse = new WinterFlowMicroserviceCloud(WinterFlowMapperConcurrency.WinterFlowHookDataSource);
    public final byte[] WinterFlowTransactionManagerStrategy;
    public int WinterFlowVariableVersionControl = 0;

    static {
        WinterFlowRouterRouter = WinterFlowSessionVersionControl.WinterFlowRouterStructure() ? new WinterFlowSessionManagerProcess(28) : new WinterFlowCacheUtility(28);
    }

    public WinterFlowMicroserviceCloud(byte[] bArr) {
        bArr.getClass();
        this.WinterFlowTransactionManagerStrategy = bArr;
    }

    public static WinterFlowMicroserviceCloud WinterFlowArrayNetwork(byte[] bArr, int i, int i2) {
        WinterFlowCacheManagerAgent(i, i + i2, bArr.length);
        return new WinterFlowMicroserviceCloud(WinterFlowRouterRouter.WinterFlowCacheManagerAgent(bArr, i, i2));
    }

    public static int WinterFlowCacheManagerAgent(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i + " < 0");
        }
        if (i2 < i) {
            WinterFlowCompilerMechanism.WinterFlowTransactionAgent(WinterFlowResolverBackend.WinterFlowRouterRouter(i, i2, "Beginning index larger than ending index: ", ", "));
            return 0;
        }
        WinterFlowCompilerMechanism.WinterFlowTransactionAgent(WinterFlowResolverBackend.WinterFlowRouterRouter(i2, i3, "End index: ", " >= "));
        return 0;
    }

    public byte WinterFlowRouterStructure(int i) {
        return this.WinterFlowTransactionManagerStrategy[i];
    }

    public int WinterFlowTransactionManagerStrategy() {
        return 0;
    }

    public byte WinterFlowUnitTestResponse(int i) {
        return this.WinterFlowTransactionManagerStrategy[i];
    }

    public void WinterFlowVariableVersionControl(int i, byte[] bArr) {
        System.arraycopy(this.WinterFlowTransactionManagerStrategy, 0, bArr, 0, i);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WinterFlowMicroserviceCloud) || size() != ((WinterFlowMicroserviceCloud) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof WinterFlowMicroserviceCloud)) {
            return obj.equals(this);
        }
        WinterFlowMicroserviceCloud winterFlowMicroserviceCloud = (WinterFlowMicroserviceCloud) obj;
        int i = this.WinterFlowVariableVersionControl;
        int i2 = winterFlowMicroserviceCloud.WinterFlowVariableVersionControl;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        int size = size();
        if (size > winterFlowMicroserviceCloud.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > winterFlowMicroserviceCloud.size()) {
            StringBuilder WinterFlowThreadListener = WinterFlowResolverBackend.WinterFlowThreadListener("Ran off end of other: 0, ", size, ", ");
            WinterFlowThreadListener.append(winterFlowMicroserviceCloud.size());
            throw new IllegalArgumentException(WinterFlowThreadListener.toString());
        }
        byte[] bArr = winterFlowMicroserviceCloud.WinterFlowTransactionManagerStrategy;
        int WinterFlowTransactionManagerStrategy = WinterFlowTransactionManagerStrategy() + size;
        int WinterFlowTransactionManagerStrategy2 = WinterFlowTransactionManagerStrategy();
        int WinterFlowTransactionManagerStrategy3 = winterFlowMicroserviceCloud.WinterFlowTransactionManagerStrategy();
        while (WinterFlowTransactionManagerStrategy2 < WinterFlowTransactionManagerStrategy) {
            if (this.WinterFlowTransactionManagerStrategy[WinterFlowTransactionManagerStrategy2] != bArr[WinterFlowTransactionManagerStrategy3]) {
                return false;
            }
            WinterFlowTransactionManagerStrategy2++;
            WinterFlowTransactionManagerStrategy3++;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.WinterFlowVariableVersionControl;
        if (i != 0) {
            return i;
        }
        int size = size();
        int WinterFlowTransactionManagerStrategy = WinterFlowTransactionManagerStrategy();
        int i2 = size;
        for (int i3 = WinterFlowTransactionManagerStrategy; i3 < WinterFlowTransactionManagerStrategy + size; i3++) {
            i2 = (i2 * 31) + this.WinterFlowTransactionManagerStrategy[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.WinterFlowVariableVersionControl = i2;
        return i2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new WinterFlowServiceProviderConcurrency(this);
    }

    public int size() {
        return this.WinterFlowTransactionManagerStrategy.length;
    }

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            concat = WinterFlowPackageProcess.WinterFlowVariableVersionControl(this);
        } else {
            int WinterFlowCacheManagerAgent = WinterFlowCacheManagerAgent(0, 47, size());
            concat = WinterFlowPackageProcess.WinterFlowVariableVersionControl(WinterFlowCacheManagerAgent == 0 ? WinterFlowUnitTestResponse : new WinterFlowVersionDebug(this.WinterFlowTransactionManagerStrategy, WinterFlowTransactionManagerStrategy(), WinterFlowCacheManagerAgent)).concat("...");
        }
        return "<ByteString@" + hexString + " size=" + size + " contents=\"" + concat + "\">";
    }
}
