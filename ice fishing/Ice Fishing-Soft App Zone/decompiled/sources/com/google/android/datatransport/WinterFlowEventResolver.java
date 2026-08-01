package com.google.android.datatransport;

import java.util.Arrays;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowEventResolver {
    public static final /* synthetic */ long WinterFlowHookDataSource = WinterFlowQueueThreadPool.WinterFlowRouterStructure.objectFieldOffset(WinterFlowEventResolver.class.getDeclaredField("_size$volatile"));
    public WinterFlowCompilerNode[] WinterFlowRouterStructure;
    private volatile /* synthetic */ int _size$volatile;

    public final void WinterFlowArrayNetwork(int i) {
        while (i > 0) {
            WinterFlowCompilerNode[] winterFlowCompilerNodeArr = this.WinterFlowRouterStructure;
            winterFlowCompilerNodeArr.getClass();
            int i2 = (i - 1) / 2;
            WinterFlowCompilerNode winterFlowCompilerNode = winterFlowCompilerNodeArr[i2];
            winterFlowCompilerNode.getClass();
            WinterFlowCompilerNode winterFlowCompilerNode2 = winterFlowCompilerNodeArr[i];
            winterFlowCompilerNode2.getClass();
            if (winterFlowCompilerNode.compareTo(winterFlowCompilerNode2) <= 0) {
                return;
            }
            WinterFlowVariableVersionControl(i, i2);
            i = i2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0062, code lost:
    
        if (r5.compareTo(r6) < 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final WinterFlowCompilerNode WinterFlowCacheManagerAgent(int i) {
        Object[] objArr = this.WinterFlowRouterStructure;
        objArr.getClass();
        WinterFlowQueueThreadPool.WinterFlowRouterStructure.putIntVolatile(this, WinterFlowHookDataSource, WinterFlowHookDataSource() - 1);
        if (i < WinterFlowHookDataSource()) {
            WinterFlowVariableVersionControl(i, WinterFlowHookDataSource());
            int i2 = (i - 1) / 2;
            if (i > 0) {
                WinterFlowCompilerNode winterFlowCompilerNode = objArr[i];
                winterFlowCompilerNode.getClass();
                Object obj = objArr[i2];
                obj.getClass();
                if (winterFlowCompilerNode.compareTo(obj) < 0) {
                    WinterFlowVariableVersionControl(i, i2);
                    WinterFlowArrayNetwork(i2);
                }
            }
            while (true) {
                int i3 = i * 2;
                int i4 = i3 + 1;
                if (i4 >= WinterFlowHookDataSource()) {
                    break;
                }
                Object[] objArr2 = this.WinterFlowRouterStructure;
                objArr2.getClass();
                int i5 = i3 + 2;
                if (i5 < WinterFlowHookDataSource()) {
                    Comparable comparable = objArr2[i5];
                    comparable.getClass();
                    Object obj2 = objArr2[i4];
                    obj2.getClass();
                }
                i5 = i4;
                Comparable comparable2 = objArr2[i];
                comparable2.getClass();
                Comparable comparable3 = objArr2[i5];
                comparable3.getClass();
                if (comparable2.compareTo(comparable3) <= 0) {
                    break;
                }
                WinterFlowVariableVersionControl(i, i5);
                i = i5;
            }
        }
        WinterFlowCompilerNode winterFlowCompilerNode2 = objArr[WinterFlowHookDataSource()];
        winterFlowCompilerNode2.getClass();
        winterFlowCompilerNode2.WinterFlowArrayNetwork(null);
        winterFlowCompilerNode2.WinterFlowTransactionManagerStrategy = -1;
        objArr[WinterFlowHookDataSource()] = null;
        return winterFlowCompilerNode2;
    }

    public final int WinterFlowHookDataSource() {
        return WinterFlowQueueThreadPool.WinterFlowRouterStructure.getIntVolatile(this, WinterFlowHookDataSource);
    }

    public final void WinterFlowRouterStructure(WinterFlowCompilerNode winterFlowCompilerNode) {
        winterFlowCompilerNode.WinterFlowArrayNetwork((WinterFlowThreadLayer) this);
        WinterFlowCompilerNode[] winterFlowCompilerNodeArr = this.WinterFlowRouterStructure;
        if (winterFlowCompilerNodeArr == null) {
            winterFlowCompilerNodeArr = new WinterFlowCompilerNode[4];
            this.WinterFlowRouterStructure = winterFlowCompilerNodeArr;
        } else if (WinterFlowHookDataSource() >= winterFlowCompilerNodeArr.length) {
            winterFlowCompilerNodeArr = (WinterFlowCompilerNode[]) Arrays.copyOf(winterFlowCompilerNodeArr, WinterFlowHookDataSource() * 2);
            this.WinterFlowRouterStructure = winterFlowCompilerNodeArr;
        }
        int WinterFlowHookDataSource2 = WinterFlowHookDataSource();
        WinterFlowQueueThreadPool.WinterFlowRouterStructure.putIntVolatile(this, WinterFlowHookDataSource, WinterFlowHookDataSource2 + 1);
        winterFlowCompilerNodeArr[WinterFlowHookDataSource2] = winterFlowCompilerNode;
        winterFlowCompilerNode.WinterFlowTransactionManagerStrategy = WinterFlowHookDataSource2;
        WinterFlowArrayNetwork(WinterFlowHookDataSource2);
    }

    public final void WinterFlowVariableVersionControl(int i, int i2) {
        WinterFlowCompilerNode[] winterFlowCompilerNodeArr = this.WinterFlowRouterStructure;
        winterFlowCompilerNodeArr.getClass();
        WinterFlowCompilerNode winterFlowCompilerNode = winterFlowCompilerNodeArr[i2];
        winterFlowCompilerNode.getClass();
        WinterFlowCompilerNode winterFlowCompilerNode2 = winterFlowCompilerNodeArr[i];
        winterFlowCompilerNode2.getClass();
        winterFlowCompilerNodeArr[i] = winterFlowCompilerNode;
        winterFlowCompilerNodeArr[i2] = winterFlowCompilerNode2;
        winterFlowCompilerNode.WinterFlowTransactionManagerStrategy = i;
        winterFlowCompilerNode2.WinterFlowTransactionManagerStrategy = i2;
    }
}
