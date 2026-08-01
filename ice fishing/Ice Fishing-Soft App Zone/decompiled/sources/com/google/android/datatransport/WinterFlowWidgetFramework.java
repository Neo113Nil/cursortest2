package com.google.android.datatransport;

import java.util.Iterator;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public class WinterFlowWidgetFramework implements Iterable, WinterFlowLoaderProcess {
    public final int WinterFlowTransactionManagerStrategy;
    public final int WinterFlowUnitTestResponse;
    public final int WinterFlowVariableVersionControl;

    public WinterFlowWidgetFramework(int i, int i2, int i3) {
        if (i3 == 0) {
            WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("Step must be non-zero.");
            throw null;
        }
        if (i3 == Integer.MIN_VALUE) {
            WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        this.WinterFlowVariableVersionControl = i;
        if (i3 > 0) {
            if (i < i2) {
                int i4 = i2 % i3;
                int i5 = i % i3;
                int i6 = ((i4 < 0 ? i4 + i3 : i4) - (i5 < 0 ? i5 + i3 : i5)) % i3;
                i2 -= i6 < 0 ? i6 + i3 : i6;
            }
        } else {
            if (i3 >= 0) {
                WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("Step is zero.");
                throw null;
            }
            if (i > i2) {
                int i7 = -i3;
                int i8 = i % i7;
                int i9 = i2 % i7;
                int i10 = ((i8 < 0 ? i8 + i7 : i8) - (i9 < 0 ? i9 + i7 : i9)) % i7;
                i2 += i10 < 0 ? i10 + i7 : i10;
            }
        }
        this.WinterFlowTransactionManagerStrategy = i2;
        this.WinterFlowUnitTestResponse = i3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof WinterFlowWidgetFramework)) {
            return false;
        }
        if (isEmpty() && ((WinterFlowWidgetFramework) obj).isEmpty()) {
            return true;
        }
        WinterFlowWidgetFramework winterFlowWidgetFramework = (WinterFlowWidgetFramework) obj;
        return this.WinterFlowVariableVersionControl == winterFlowWidgetFramework.WinterFlowVariableVersionControl && this.WinterFlowTransactionManagerStrategy == winterFlowWidgetFramework.WinterFlowTransactionManagerStrategy && this.WinterFlowUnitTestResponse == winterFlowWidgetFramework.WinterFlowUnitTestResponse;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.WinterFlowVariableVersionControl * 31) + this.WinterFlowTransactionManagerStrategy) * 31) + this.WinterFlowUnitTestResponse;
    }

    public boolean isEmpty() {
        int i = this.WinterFlowTransactionManagerStrategy;
        int i2 = this.WinterFlowUnitTestResponse;
        int i3 = this.WinterFlowVariableVersionControl;
        return i2 > 0 ? i3 > i : i3 < i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new WinterFlowObjectBandwidth(this.WinterFlowVariableVersionControl, this.WinterFlowTransactionManagerStrategy, this.WinterFlowUnitTestResponse);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.WinterFlowTransactionManagerStrategy;
        int i2 = this.WinterFlowUnitTestResponse;
        int i3 = this.WinterFlowVariableVersionControl;
        if (i2 > 0) {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i2);
        } else {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i2);
        }
        return sb.toString();
    }
}
