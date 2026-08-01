package com.google.android.datatransport;

import android.view.View;
import android.view.ViewGroup;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public class WinterFlowSoftware implements Iterator, WinterFlowLoaderProcess {
    public int WinterFlowTransactionManagerStrategy;
    public final Object WinterFlowUnitTestResponse;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public WinterFlowSoftware(Object[] objArr) {
        this.WinterFlowVariableVersionControl = 1;
        objArr.getClass();
        this.WinterFlowUnitTestResponse = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.WinterFlowVariableVersionControl;
        Object obj = this.WinterFlowUnitTestResponse;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (this.WinterFlowTransactionManagerStrategy < ((WinterFlowConcurrencyQueue) obj).WinterFlowRouterStructure()) {
                    break;
                }
                break;
            case 1:
                if (this.WinterFlowTransactionManagerStrategy < ((Object[]) obj).length) {
                    break;
                }
                break;
            case 2:
                if (this.WinterFlowTransactionManagerStrategy < ((WinterFlowRequestListener) obj).WinterFlowArrayNetwork()) {
                    break;
                }
                break;
            default:
                if (this.WinterFlowTransactionManagerStrategy < ((ViewGroup) obj).getChildCount()) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.WinterFlowVariableVersionControl;
        Object obj = this.WinterFlowUnitTestResponse;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (!hasNext()) {
                    WinterFlowEventEmitterOrchestration.WinterFlowThreadListener();
                    return null;
                }
                int i2 = this.WinterFlowTransactionManagerStrategy;
                this.WinterFlowTransactionManagerStrategy = i2 + 1;
                return ((WinterFlowConcurrencyQueue) obj).get(i2);
            case 1:
                try {
                    int i3 = this.WinterFlowTransactionManagerStrategy;
                    this.WinterFlowTransactionManagerStrategy = i3 + 1;
                    return ((Object[]) obj)[i3];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.WinterFlowTransactionManagerStrategy--;
                    WinterFlowCompilerMechanism.WinterFlowSyntax(e.getMessage());
                    return null;
                }
            case 2:
                int i4 = this.WinterFlowTransactionManagerStrategy;
                this.WinterFlowTransactionManagerStrategy = i4 + 1;
                return ((WinterFlowRequestListener) obj).WinterFlowVariableVersionControl(i4);
            default:
                int i5 = this.WinterFlowTransactionManagerStrategy;
                this.WinterFlowTransactionManagerStrategy = i5 + 1;
                View childAt = ((ViewGroup) obj).getChildAt(i5);
                if (childAt != null) {
                    return childAt;
                }
                throw new IndexOutOfBoundsException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.WinterFlowVariableVersionControl) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                ViewGroup viewGroup = (ViewGroup) this.WinterFlowUnitTestResponse;
                int i = this.WinterFlowTransactionManagerStrategy - 1;
                this.WinterFlowTransactionManagerStrategy = i;
                viewGroup.removeViewAt(i);
                return;
        }
    }

    public /* synthetic */ WinterFlowSoftware(int i, Object obj) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowUnitTestResponse = obj;
    }
}
