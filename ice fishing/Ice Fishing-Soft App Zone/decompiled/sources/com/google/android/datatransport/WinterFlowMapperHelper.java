package com.google.android.datatransport;

import java.text.CharacterIterator;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowMapperHelper implements CharacterIterator {
    public final int WinterFlowTransactionManagerStrategy;
    public int WinterFlowUnitTestResponse = 0;
    public final CharSequence WinterFlowVariableVersionControl;

    public WinterFlowMapperHelper(CharSequence charSequence, int i) {
        this.WinterFlowVariableVersionControl = charSequence;
        this.WinterFlowTransactionManagerStrategy = i;
    }

    @Override // java.text.CharacterIterator
    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i = this.WinterFlowUnitTestResponse;
        if (i == this.WinterFlowTransactionManagerStrategy) {
            return (char) 65535;
        }
        return this.WinterFlowVariableVersionControl.charAt(i);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.WinterFlowUnitTestResponse = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.WinterFlowTransactionManagerStrategy;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.WinterFlowUnitTestResponse;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i = this.WinterFlowTransactionManagerStrategy;
        if (i == 0) {
            this.WinterFlowUnitTestResponse = i;
            return (char) 65535;
        }
        int i2 = i - 1;
        this.WinterFlowUnitTestResponse = i2;
        return this.WinterFlowVariableVersionControl.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i = this.WinterFlowUnitTestResponse + 1;
        this.WinterFlowUnitTestResponse = i;
        int i2 = this.WinterFlowTransactionManagerStrategy;
        if (i < i2) {
            return this.WinterFlowVariableVersionControl.charAt(i);
        }
        this.WinterFlowUnitTestResponse = i2;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i = this.WinterFlowUnitTestResponse;
        if (i <= 0) {
            return (char) 65535;
        }
        int i2 = i - 1;
        this.WinterFlowUnitTestResponse = i2;
        return this.WinterFlowVariableVersionControl.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i) {
        if (i > this.WinterFlowTransactionManagerStrategy || i < 0) {
            WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("invalid position");
            return (char) 0;
        }
        this.WinterFlowUnitTestResponse = i;
        return current();
    }
}
