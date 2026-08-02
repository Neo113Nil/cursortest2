package com.squareup.cash.featureflags;

import androidx.compose.runtime.AbstractApplier;
import bo.app.re$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public abstract class FeatureFlag$LongFeatureFlag extends AbstractApplier {
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FeatureFlag$LongFeatureFlag(String str, int i) {
        super(str, r3, CollectionsKt__CollectionsKt.listOf((Object[]) new FeatureFlag$ControlTreatmentAmplitudeExperiment$Options[]{r3, FeatureFlag$ControlTreatmentAmplitudeExperiment$Options.Treatment}));
        this.$r8$classId = i;
        switch (i) {
            case 2:
                FeatureFlag$EnabledDisabledAmplitudeExperiment$Options featureFlag$EnabledDisabledAmplitudeExperiment$Options = FeatureFlag$EnabledDisabledAmplitudeExperiment$Options.Disabled;
                super(str, featureFlag$EnabledDisabledAmplitudeExperiment$Options, CollectionsKt__CollectionsKt.listOf((Object[]) new FeatureFlag$EnabledDisabledAmplitudeExperiment$Options[]{FeatureFlag$EnabledDisabledAmplitudeExperiment$Options.Enabled, featureFlag$EnabledDisabledAmplitudeExperiment$Options}));
                break;
            default:
                FeatureFlag$ControlTreatmentAmplitudeExperiment$Options featureFlag$ControlTreatmentAmplitudeExperiment$Options = FeatureFlag$ControlTreatmentAmplitudeExperiment$Options.Control;
                break;
        }
    }

    @Override // androidx.compose.runtime.AbstractApplier
    public FeatureFlag$Option getOption(String str, String str2) {
        Long longOrNull;
        FeatureFlag$StringFeatureFlag$Value featureFlag$StringFeatureFlag$Value = null;
        switch (this.$r8$classId) {
            case 0:
                if (str2 == null || (longOrNull = StringsKt.toLongOrNull(10, str2)) == null) {
                    return null;
                }
                long longValue = longOrNull.longValue();
                if (str == null) {
                    str = str2;
                }
                return new Value(str, longValue);
            case 5:
                if (str2 != null) {
                    if (str == null) {
                        str = str2;
                    }
                    featureFlag$StringFeatureFlag$Value = new FeatureFlag$StringFeatureFlag$Value(str, str2);
                }
                return featureFlag$StringFeatureFlag$Value;
            default:
                return super.getOption(str, str2);
        }
    }

    public final class Value implements FeatureFlag$Option {
        public final String identifier;
        public final long value;

        public Value(String str) {
            long parseLong = Long.parseLong(str);
            this.identifier = str;
            this.value = parseLong;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Value)) {
                return false;
            }
            Value value = (Value) obj;
            return Intrinsics.areEqual(this.identifier, value.identifier) && this.value == value.value;
        }

        @Override // com.squareup.cash.featureflags.FeatureFlag$Option
        public final String getIdentifier() {
            return this.identifier;
        }

        public final int hashCode() {
            return Long.hashCode(this.value) + (this.identifier.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder m = re$$ExternalSyntheticOutline0.m("Value(identifier=", this.identifier, ", value=", this.value);
            m.append(")");
            return m.toString();
        }

        public Value(String str, long j) {
            this.identifier = str;
            this.value = j;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeatureFlag$LongFeatureFlag(String str, FeatureFlag$EnabledDisabledFeatureFlag$Options featureFlag$EnabledDisabledFeatureFlag$Options) {
        super(str, featureFlag$EnabledDisabledFeatureFlag$Options, CollectionsKt__CollectionsKt.listOf((Object[]) new FeatureFlag$EnabledDisabledFeatureFlag$Options[]{FeatureFlag$EnabledDisabledFeatureFlag$Options.Disabled, FeatureFlag$EnabledDisabledFeatureFlag$Options.Enabled}));
        this.$r8$classId = 3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeatureFlag$LongFeatureFlag(String str, FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options featureFlag$EnabledDisabledUnassignedFeatureFlag$Options) {
        super(str, featureFlag$EnabledDisabledUnassignedFeatureFlag$Options, CollectionsKt__CollectionsKt.listOf((Object[]) new FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options[]{FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options.Unassigned, FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options.Disabled, FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options.Enabled}));
        this.$r8$classId = 4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FeatureFlag$LongFeatureFlag(String str, FeatureFlag$Option featureFlag$Option, List list, int i) {
        super(str, featureFlag$Option, list);
        this.$r8$classId = i;
    }
}
