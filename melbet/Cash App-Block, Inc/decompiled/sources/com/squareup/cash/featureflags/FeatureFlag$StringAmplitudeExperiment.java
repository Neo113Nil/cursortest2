package com.squareup.cash.featureflags;

import androidx.compose.runtime.AbstractApplier;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class FeatureFlag$StringAmplitudeExperiment extends AbstractApplier {

    public final class Value implements FeatureFlag$Option {
        public final String identifier;
        public final String value;

        public Value(String str, String str2) {
            str2.getClass();
            this.identifier = str;
            this.value = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Value)) {
                return false;
            }
            Value value = (Value) obj;
            return Intrinsics.areEqual(this.identifier, value.identifier) && Intrinsics.areEqual(this.value, value.value);
        }

        @Override // com.squareup.cash.featureflags.FeatureFlag$Option
        public final String getIdentifier() {
            return this.identifier;
        }

        public final String getValue() {
            return this.value;
        }

        public final int hashCode() {
            return this.value.hashCode() + (this.identifier.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("Value(identifier=", this.identifier, ", value=", this.value, ")");
        }
    }

    @Override // androidx.compose.runtime.AbstractApplier
    public final FeatureFlag$Option getOption(String str, String str2) {
        if (str2 == null) {
            return null;
        }
        if (str == null) {
            str = str2;
        }
        return new Value(str, str2);
    }
}
