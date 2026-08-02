package com.squareup.cash.genericelements.viewmodels;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;

/* loaded from: classes4.dex */
public abstract class DividerComponentViewModel extends GenericComponentViewModel {

    public final class BlankDividerViewModel extends DividerComponentViewModel {
        public final Size size;

        public enum Size {
            SMALL(8),
            LARGE(16);

            public final int value;

            Size(int i) {
                this.value = i;
            }
        }

        public BlankDividerViewModel(Size size) {
            this.size = size;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BlankDividerViewModel) && this.size == ((BlankDividerViewModel) obj).size;
        }

        public final int hashCode() {
            return this.size.hashCode();
        }

        public final String toString() {
            return "BlankDividerViewModel(size=" + this.size + ")";
        }
    }

    public final class LineDividerViewModel extends DividerComponentViewModel {
        public final boolean usePadding;

        public LineDividerViewModel(boolean z) {
            this.usePadding = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LineDividerViewModel) && this.usePadding == ((LineDividerViewModel) obj).usePadding;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.usePadding);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("LineDividerViewModel(usePadding=", ")", this.usePadding);
        }
    }
}
