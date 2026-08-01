package com.google.android.datatransport;

import java.util.Arrays;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowRequestListener implements Cloneable {
    public /* synthetic */ int WinterFlowRouterRouter;
    public /* synthetic */ int[] WinterFlowTransactionManagerStrategy;
    public /* synthetic */ Object[] WinterFlowUnitTestResponse;
    public /* synthetic */ boolean WinterFlowVariableVersionControl;

    public WinterFlowRequestListener() {
        int i;
        int i2 = 4;
        while (true) {
            i = 40;
            if (i2 >= 32) {
                break;
            }
            int i3 = (1 << i2) - 12;
            if (40 <= i3) {
                i = i3;
                break;
            }
            i2++;
        }
        int i4 = i / 4;
        this.WinterFlowTransactionManagerStrategy = new int[i4];
        this.WinterFlowUnitTestResponse = new Object[i4];
    }

    public final int WinterFlowArrayNetwork() {
        if (this.WinterFlowVariableVersionControl) {
            WinterFlowCloudStack.WinterFlowSerializerStructure(this);
        }
        return this.WinterFlowRouterRouter;
    }

    public final void WinterFlowCacheManagerAgent(int i, Object obj) {
        int WinterFlowSyntax = WinterFlowHandlerWebsocket.WinterFlowSyntax(this.WinterFlowTransactionManagerStrategy, this.WinterFlowRouterRouter, i);
        if (WinterFlowSyntax >= 0) {
            this.WinterFlowUnitTestResponse[WinterFlowSyntax] = obj;
            return;
        }
        int i2 = ~WinterFlowSyntax;
        int i3 = this.WinterFlowRouterRouter;
        if (i2 < i3) {
            Object[] objArr = this.WinterFlowUnitTestResponse;
            if (objArr[i2] == WinterFlowCloudStack.WinterFlowUnitTestResponse) {
                this.WinterFlowTransactionManagerStrategy[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.WinterFlowVariableVersionControl && i3 >= this.WinterFlowTransactionManagerStrategy.length) {
            WinterFlowCloudStack.WinterFlowSerializerStructure(this);
            i2 = ~WinterFlowHandlerWebsocket.WinterFlowSyntax(this.WinterFlowTransactionManagerStrategy, this.WinterFlowRouterRouter, i);
        }
        int i4 = this.WinterFlowRouterRouter;
        if (i4 >= this.WinterFlowTransactionManagerStrategy.length) {
            int i5 = (i4 + 1) * 4;
            int i6 = 4;
            while (true) {
                if (i6 >= 32) {
                    break;
                }
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
                i6++;
            }
            int i8 = i5 / 4;
            this.WinterFlowTransactionManagerStrategy = Arrays.copyOf(this.WinterFlowTransactionManagerStrategy, i8);
            this.WinterFlowUnitTestResponse = Arrays.copyOf(this.WinterFlowUnitTestResponse, i8);
        }
        int i9 = this.WinterFlowRouterRouter;
        if (i9 - i2 != 0) {
            int[] iArr = this.WinterFlowTransactionManagerStrategy;
            int i10 = i2 + 1;
            WinterFlowProtocolPipeline.WinterFlowCompilerHandler(iArr, iArr, i10, i2, i9);
            Object[] objArr2 = this.WinterFlowUnitTestResponse;
            WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(objArr2, objArr2, i10, i2, this.WinterFlowRouterRouter);
        }
        this.WinterFlowTransactionManagerStrategy[i2] = i;
        this.WinterFlowUnitTestResponse[i2] = obj;
        this.WinterFlowRouterRouter++;
    }

    public final int WinterFlowHookDataSource(int i) {
        if (this.WinterFlowVariableVersionControl) {
            WinterFlowCloudStack.WinterFlowSerializerStructure(this);
        }
        return this.WinterFlowTransactionManagerStrategy[i];
    }

    /* renamed from: WinterFlowRouterStructure, reason: merged with bridge method [inline-methods] */
    public final WinterFlowRequestListener clone() {
        Object clone = super.clone();
        clone.getClass();
        WinterFlowRequestListener winterFlowRequestListener = (WinterFlowRequestListener) clone;
        winterFlowRequestListener.WinterFlowTransactionManagerStrategy = (int[]) this.WinterFlowTransactionManagerStrategy.clone();
        winterFlowRequestListener.WinterFlowUnitTestResponse = (Object[]) this.WinterFlowUnitTestResponse.clone();
        return winterFlowRequestListener;
    }

    public final Object WinterFlowVariableVersionControl(int i) {
        if (this.WinterFlowVariableVersionControl) {
            WinterFlowCloudStack.WinterFlowSerializerStructure(this);
        }
        Object[] objArr = this.WinterFlowUnitTestResponse;
        if (i < objArr.length) {
            return objArr[i];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final String toString() {
        if (WinterFlowArrayNetwork() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.WinterFlowRouterRouter * 28);
        sb.append('{');
        int i = this.WinterFlowRouterRouter;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(WinterFlowHookDataSource(i2));
            sb.append('=');
            Object WinterFlowVariableVersionControl = WinterFlowVariableVersionControl(i2);
            if (WinterFlowVariableVersionControl != this) {
                sb.append(WinterFlowVariableVersionControl);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
