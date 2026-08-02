package com.squareup.cash.featureflags;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class FeatureFlag$StringFeatureFlag$Value implements FeatureFlag$Option {
    public final String identifier;
    public final String value;

    public FeatureFlag$StringFeatureFlag$Value(String str, String str2) {
        str2.getClass();
        this.identifier = str;
        this.value = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeatureFlag$StringFeatureFlag$Value)) {
            return false;
        }
        FeatureFlag$StringFeatureFlag$Value featureFlag$StringFeatureFlag$Value = (FeatureFlag$StringFeatureFlag$Value) obj;
        return Intrinsics.areEqual(this.identifier, featureFlag$StringFeatureFlag$Value.identifier) && Intrinsics.areEqual(this.value, featureFlag$StringFeatureFlag$Value.value);
    }

    @Override // com.squareup.cash.featureflags.FeatureFlag$Option
    public final String getIdentifier() {
        return this.identifier;
    }

    public final int hashCode() {
        return this.value.hashCode() + (this.identifier.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("Value(identifier=", this.identifier, ", value=", this.value, ")");
    }
}
