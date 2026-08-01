package com.google.android.datatransport;

import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowJSON implements RandomAccess {
    public WinterFlowDecoratorLayer WinterFlowTransactionManagerStrategy;
    public int WinterFlowUnitTestResponse = 0;
    public Object[] WinterFlowVariableVersionControl;

    public WinterFlowJSON(Object[] objArr) {
        this.WinterFlowVariableVersionControl = objArr;
    }

    public final void WinterFlowArrayNetwork(int i, List list) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i2 = this.WinterFlowUnitTestResponse + size;
        if (this.WinterFlowVariableVersionControl.length < i2) {
            WinterFlowThreadListener(i2);
        }
        Object[] objArr = this.WinterFlowVariableVersionControl;
        int i3 = this.WinterFlowUnitTestResponse;
        if (i != i3) {
            System.arraycopy(objArr, i, objArr, i + size, i3 - i);
        }
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            objArr[i + i4] = list.get(i4);
        }
        this.WinterFlowUnitTestResponse += size;
    }

    public final void WinterFlowCacheManagerAgent(int i, WinterFlowJSON winterFlowJSON) {
        int i2 = winterFlowJSON.WinterFlowUnitTestResponse;
        if (i2 == 0) {
            return;
        }
        int i3 = this.WinterFlowUnitTestResponse + i2;
        if (this.WinterFlowVariableVersionControl.length < i3) {
            WinterFlowThreadListener(i3);
        }
        Object[] objArr = this.WinterFlowVariableVersionControl;
        int i4 = this.WinterFlowUnitTestResponse;
        if (i != i4) {
            System.arraycopy(objArr, i, objArr, i + i2, i4 - i);
        }
        System.arraycopy(winterFlowJSON.WinterFlowVariableVersionControl, 0, objArr, i, i2);
        this.WinterFlowUnitTestResponse += i2;
    }

    public final void WinterFlowHookDataSource(Object obj) {
        int i = this.WinterFlowUnitTestResponse + 1;
        if (this.WinterFlowVariableVersionControl.length < i) {
            WinterFlowThreadListener(i);
        }
        Object[] objArr = this.WinterFlowVariableVersionControl;
        int i2 = this.WinterFlowUnitTestResponse;
        objArr[i2] = obj;
        this.WinterFlowUnitTestResponse = i2 + 1;
    }

    public final boolean WinterFlowResponseEngine(Object obj) {
        int WinterFlowSyntax = WinterFlowSyntax(obj);
        if (WinterFlowSyntax < 0) {
            return false;
        }
        WinterFlowTransactionAgent(WinterFlowSyntax);
        return true;
    }

    public final boolean WinterFlowRouterRouter(Object obj) {
        int i = this.WinterFlowUnitTestResponse - 1;
        if (i >= 0) {
            for (int i2 = 0; !WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowVariableVersionControl[i2], obj); i2++) {
                if (i2 != i) {
                }
            }
            return true;
        }
        return false;
    }

    public final void WinterFlowRouterStructure(int i, Object obj) {
        int i2 = this.WinterFlowUnitTestResponse + 1;
        if (this.WinterFlowVariableVersionControl.length < i2) {
            WinterFlowThreadListener(i2);
        }
        Object[] objArr = this.WinterFlowVariableVersionControl;
        int i3 = this.WinterFlowUnitTestResponse;
        if (i != i3) {
            System.arraycopy(objArr, i, objArr, i + 1, i3 - i);
        }
        objArr[i] = obj;
        this.WinterFlowUnitTestResponse++;
    }

    public final void WinterFlowServerProtocol(int i, int i2) {
        if (i2 > i) {
            int i3 = this.WinterFlowUnitTestResponse;
            if (i2 < i3) {
                Object[] objArr = this.WinterFlowVariableVersionControl;
                System.arraycopy(objArr, i2, objArr, i, i3 - i2);
            }
            int i4 = this.WinterFlowUnitTestResponse;
            int i5 = i4 - (i2 - i);
            int i6 = i4 - 1;
            if (i5 <= i6) {
                int i7 = i5;
                while (true) {
                    this.WinterFlowVariableVersionControl[i7] = null;
                    if (i7 == i6) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            this.WinterFlowUnitTestResponse = i5;
        }
    }

    public final int WinterFlowSyntax(Object obj) {
        Object[] objArr = this.WinterFlowVariableVersionControl;
        int i = this.WinterFlowUnitTestResponse;
        for (int i2 = 0; i2 < i; i2++) {
            if (WinterFlowManagerRequest.WinterFlowThreadListener(obj, objArr[i2])) {
                return i2;
            }
        }
        return -1;
    }

    public final void WinterFlowThreadListener(int i) {
        Object[] objArr = this.WinterFlowVariableVersionControl;
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, length * 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.WinterFlowVariableVersionControl = objArr2;
    }

    public final Object WinterFlowTransactionAgent(int i) {
        Object[] objArr = this.WinterFlowVariableVersionControl;
        Object obj = objArr[i];
        int i2 = this.WinterFlowUnitTestResponse;
        if (i != i2 - 1) {
            int i3 = i + 1;
            System.arraycopy(objArr, i3, objArr, i, i2 - i3);
        }
        int i4 = this.WinterFlowUnitTestResponse - 1;
        this.WinterFlowUnitTestResponse = i4;
        objArr[i4] = null;
        return obj;
    }

    public final List WinterFlowTransactionManagerStrategy() {
        WinterFlowDecoratorLayer winterFlowDecoratorLayer = this.WinterFlowTransactionManagerStrategy;
        if (winterFlowDecoratorLayer != null) {
            return winterFlowDecoratorLayer;
        }
        WinterFlowDecoratorLayer winterFlowDecoratorLayer2 = new WinterFlowDecoratorLayer(this);
        this.WinterFlowTransactionManagerStrategy = winterFlowDecoratorLayer2;
        return winterFlowDecoratorLayer2;
    }

    public final void WinterFlowUnitTestResponse() {
        Object[] objArr = this.WinterFlowVariableVersionControl;
        int i = this.WinterFlowUnitTestResponse;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.WinterFlowUnitTestResponse = 0;
    }

    public final boolean WinterFlowVariableVersionControl(int i, Collection collection) {
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i3 = this.WinterFlowUnitTestResponse + size;
        if (this.WinterFlowVariableVersionControl.length < i3) {
            WinterFlowThreadListener(i3);
        }
        Object[] objArr = this.WinterFlowVariableVersionControl;
        int i4 = this.WinterFlowUnitTestResponse;
        if (i != i4) {
            System.arraycopy(objArr, i, objArr, i + size, i4 - i);
        }
        for (Object obj : collection) {
            int i5 = i2 + 1;
            if (i2 < 0) {
                WinterFlowUnitTestLibrary.WinterFlowProxyStructure();
                throw null;
            }
            objArr[i2 + i] = obj;
            i2 = i5;
        }
        this.WinterFlowUnitTestResponse += size;
        return true;
    }
}
