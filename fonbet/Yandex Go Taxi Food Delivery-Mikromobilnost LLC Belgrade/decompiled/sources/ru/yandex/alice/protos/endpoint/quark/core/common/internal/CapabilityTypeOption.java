package ru.yandex.alice.protos.endpoint.quark.core.common.internal;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import ru.yandex.alice.protos.endpoint.quark.core.common.internal.TCapability;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\u0002\u0018\u00002\u00020\u0001B\b\u0012\u0006\u0010\u0002\u001a\u00020\u0003R\u000f\u0010\u0002\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/alice/protos/endpoint/quark/core/common/internal/CapabilityTypeOption;", "", "value", "Lru/yandex/alice/protos/endpoint/quark/core/common/internal/TCapability$ECapabilityType;", "()Lru/yandex/alice/protos/endpoint/quark/core/common/internal/TCapability$ECapabilityType;", "quark-core-common-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public @interface CapabilityTypeOption {
    TCapability.ECapabilityType value();
}
