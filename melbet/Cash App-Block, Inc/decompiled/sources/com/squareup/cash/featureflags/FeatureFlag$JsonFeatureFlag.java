package com.squareup.cash.featureflags;

import androidx.compose.runtime.AbstractApplier;
import java.lang.reflect.Type;
import kotlin.collections.EmptyList;

/* loaded from: classes.dex */
public abstract class FeatureFlag$JsonFeatureFlag extends AbstractApplier {

    /* renamed from: type, reason: collision with root package name */
    public final Type f1132type;

    public final class Options implements FeatureFlag$Option {
        public final String identifier;
        public final Object value;

        public Options(String str, Object obj) {
            this.identifier = str;
            this.value = obj;
        }

        @Override // com.squareup.cash.featureflags.FeatureFlag$Option
        public final String getIdentifier() {
            return this.identifier;
        }
    }

    public FeatureFlag$JsonFeatureFlag(Type type2, Options options, String str) {
        super(str, options, EmptyList.INSTANCE);
        this.f1132type = type2;
    }

    @Override // androidx.compose.runtime.AbstractApplier
    public final FeatureFlag$Option getOption(String str, String str2) {
        throw new IllegalStateException("not implemented. implementation in RealFeatureFlagManager");
    }
}
