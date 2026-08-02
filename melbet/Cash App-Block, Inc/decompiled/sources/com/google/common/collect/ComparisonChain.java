package com.google.common.collect;

import java.util.Comparator;

/* loaded from: classes4.dex */
public abstract class ComparisonChain {
    public static final AnonymousClass1 ACTIVE = new AnonymousClass1();
    public static final InactiveComparisonChain LESS = new InactiveComparisonChain(-1);
    public static final InactiveComparisonChain GREATER = new InactiveComparisonChain(1);

    public final class InactiveComparisonChain extends ComparisonChain {
        public final int result;

        public InactiveComparisonChain(int i) {
            this.result = i;
        }

        @Override // com.google.common.collect.ComparisonChain
        public final ComparisonChain compare(int i, int i2) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public final ComparisonChain compare(Object obj, Object obj2, Comparator comparator) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public final ComparisonChain compareFalseFirst(boolean z, boolean z2) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public final ComparisonChain compareTrueFirst(boolean z, boolean z2) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public final int result() {
            return this.result;
        }

        @Override // com.google.common.collect.ComparisonChain
        public final ComparisonChain compare(Cut cut, Cut cut2) {
            return this;
        }
    }

    public abstract ComparisonChain compare(int i, int i2);

    public abstract ComparisonChain compare(Cut cut, Cut cut2);

    public abstract ComparisonChain compare(Object obj, Object obj2, Comparator comparator);

    public abstract ComparisonChain compareFalseFirst(boolean z, boolean z2);

    public abstract ComparisonChain compareTrueFirst(boolean z, boolean z2);

    public abstract int result();

    /* renamed from: com.google.common.collect.ComparisonChain$1, reason: invalid class name */
    public final class AnonymousClass1 extends ComparisonChain {
        public static ComparisonChain classify(int i) {
            return i < 0 ? ComparisonChain.LESS : i > 0 ? ComparisonChain.GREATER : ComparisonChain.ACTIVE;
        }

        @Override // com.google.common.collect.ComparisonChain
        public final ComparisonChain compare(Cut cut, Cut cut2) {
            return classify(cut.compareTo(cut2));
        }

        @Override // com.google.common.collect.ComparisonChain
        public final ComparisonChain compareFalseFirst(boolean z, boolean z2) {
            return classify(Boolean.compare(z, z2));
        }

        @Override // com.google.common.collect.ComparisonChain
        public final ComparisonChain compareTrueFirst(boolean z, boolean z2) {
            return classify(Boolean.compare(z2, z));
        }

        @Override // com.google.common.collect.ComparisonChain
        public final int result() {
            return 0;
        }

        @Override // com.google.common.collect.ComparisonChain
        public final ComparisonChain compare(Object obj, Object obj2, Comparator comparator) {
            return classify(comparator.compare(obj, obj2));
        }

        @Override // com.google.common.collect.ComparisonChain
        public final ComparisonChain compare(int i, int i2) {
            return classify(Integer.compare(i, i2));
        }
    }
}
