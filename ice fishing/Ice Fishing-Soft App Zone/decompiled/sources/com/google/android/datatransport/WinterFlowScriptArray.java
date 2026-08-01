package com.google.android.datatransport;

import java.util.Iterator;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowScriptArray implements Iterator, WinterFlowLoaderProcess {
    public int WinterFlowRouterRouter;
    public int WinterFlowSyntax;
    public int WinterFlowTransactionManagerStrategy;
    public int WinterFlowUnitTestResponse;
    public final CharSequence WinterFlowVariableVersionControl;

    public WinterFlowScriptArray(CharSequence charSequence) {
        this.WinterFlowVariableVersionControl = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2;
        int i3 = this.WinterFlowTransactionManagerStrategy;
        if (i3 != 0) {
            return i3 == 1;
        }
        if (this.WinterFlowSyntax < 0) {
            this.WinterFlowTransactionManagerStrategy = 2;
            return false;
        }
        CharSequence charSequence = this.WinterFlowVariableVersionControl;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i4 = this.WinterFlowUnitTestResponse; i4 < length2; i4++) {
            char charAt = charSequence.charAt(i4);
            if (charAt == '\n' || charAt == '\r') {
                i = (charAt == '\r' && (i2 = i4 + 1) < charSequence.length() && charSequence.charAt(i2) == '\n') ? 2 : 1;
                length = i4;
                this.WinterFlowTransactionManagerStrategy = 1;
                this.WinterFlowSyntax = i;
                this.WinterFlowRouterRouter = length;
                return true;
            }
        }
        i = -1;
        this.WinterFlowTransactionManagerStrategy = 1;
        this.WinterFlowSyntax = i;
        this.WinterFlowRouterRouter = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            WinterFlowEventEmitterOrchestration.WinterFlowThreadListener();
            return null;
        }
        this.WinterFlowTransactionManagerStrategy = 0;
        int i = this.WinterFlowRouterRouter;
        int i2 = this.WinterFlowUnitTestResponse;
        this.WinterFlowUnitTestResponse = this.WinterFlowSyntax + i;
        return this.WinterFlowVariableVersionControl.subSequence(i2, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
