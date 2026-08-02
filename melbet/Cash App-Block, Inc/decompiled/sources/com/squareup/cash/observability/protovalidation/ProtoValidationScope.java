package com.squareup.cash.observability.protovalidation;

import androidx.compose.ui.draw.RotateKt;
import com.squareup.cash.observability.protovalidation.ProtoParsingError;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.protos.cash.localization.LocalizedString;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public final class ProtoValidationScope implements HasObservability {
    public final HasObservability observability;
    public final Object proto;
    public final ProtoParsingError.Factory protoParsingExceptionFactory;

    public ProtoValidationScope(Object obj, ProtoParsingError.Factory factory, HasObservability hasObservability) {
        factory.getClass();
        hasObservability.getClass();
        this.proto = obj;
        this.protoParsingExceptionFactory = factory;
        this.observability = hasObservability;
    }

    public static String required(LocalizedString localizedString, String str) {
        if (localizedString == null) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) str);
            return null;
        }
        String str2 = localizedString.translated_value;
        if (str2 != null) {
            return str2;
        }
        Path$$ExternalSyntheticBUOutline0.m$1((Object) str.concat(" translated_value"));
        return null;
    }

    public static void requiredCount(ProtoValidationScope protoValidationScope, Collection collection, String str, Integer num, Integer num2) {
        collection.getClass();
        if (collection.size() < num.intValue()) {
            throw new IllegalArgumentCountException(str + " does not meet required count (min=" + num + ",actual=" + collection.size() + ")", str);
        }
        if (num2 == null || collection.size() <= num2.intValue()) {
            return;
        }
        throw new IllegalArgumentCountException(str + " does not meet required count (max=" + num2 + ",actual=" + collection.size() + ")", str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProtoValidationScope)) {
            return false;
        }
        ProtoValidationScope protoValidationScope = (ProtoValidationScope) obj;
        return Intrinsics.areEqual(this.proto, protoValidationScope.proto) && Intrinsics.areEqual(this.protoParsingExceptionFactory, protoValidationScope.protoParsingExceptionFactory) && Intrinsics.areEqual(this.observability, protoValidationScope.observability);
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public final ErrorReporter getErrorReporter() {
        return this.observability.getErrorReporter();
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public final SampleStrategy getOneErrorPerAppSessionStrategy() {
        return this.observability.getOneErrorPerAppSessionStrategy();
    }

    public final int hashCode() {
        Object obj = this.proto;
        int hashCode = obj == null ? 0 : obj.hashCode();
        return this.observability.hashCode() + ((this.protoParsingExceptionFactory.hashCode() + (hashCode * 31)) * 31);
    }

    public final String reportIfNullAndContinue(LocalizedString localizedString, String str, String str2) {
        KClass kClass;
        try {
            String required = required(localizedString, str);
            str.concat(" translated_value");
            return required;
        } catch (Exception e) {
            Object obj = this.proto;
            if (obj != null) {
                kClass = Reflection.factory.getOrCreateKotlinClass(obj.getClass());
            } else {
                kClass = null;
            }
            HasObservability hasObservability = this.observability;
            hasObservability.getErrorReporter().report(RotateKt.toProtoParsingExceptionFor(e, kClass, this.protoParsingExceptionFactory, str2), hasObservability.getOneErrorPerAppSessionStrategy());
            return null;
        }
    }

    public final String toString() {
        return "ProtoValidationScope(proto=" + this.proto + ", protoParsingExceptionFactory=" + this.protoParsingExceptionFactory + ", observability=" + this.observability + ")";
    }

    public static void required(Object obj, String str) {
        if (obj != null) {
            return;
        }
        Path$$ExternalSyntheticBUOutline0.m$1((Object) str);
    }

    public final Object reportIfNullAndContinue(String str, String str2, Object obj) {
        KClass kClass;
        try {
            required(obj, str);
            return obj;
        } catch (Exception e) {
            Object obj2 = this.proto;
            if (obj2 != null) {
                kClass = Reflection.factory.getOrCreateKotlinClass(obj2.getClass());
            } else {
                kClass = null;
            }
            HasObservability hasObservability = this.observability;
            hasObservability.getErrorReporter().report(RotateKt.toProtoParsingExceptionFor(e, kClass, this.protoParsingExceptionFactory, str2), hasObservability.getOneErrorPerAppSessionStrategy());
            return null;
        }
    }
}
