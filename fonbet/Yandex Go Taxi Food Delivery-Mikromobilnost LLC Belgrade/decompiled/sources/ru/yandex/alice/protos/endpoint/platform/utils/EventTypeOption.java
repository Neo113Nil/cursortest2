package ru.yandex.alice.protos.endpoint.platform.utils;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import ru.yandex.alice.protos.endpoint.platform.utils.TCapability;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0002\u0018\u00002\u00020\u0001B\b\u0012\u0006\u0010\u0002\u001a\u00020\u0003R\u000f\u0010\u0002\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/alice/protos/endpoint/platform/utils/EventTypeOption;", "", "value", "Lru/yandex/alice/protos/endpoint/platform/utils/TCapability$EEventType;", "()Lru/yandex/alice/protos/endpoint/platform/utils/TCapability$EEventType;", "quark-platform-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public @interface EventTypeOption {
    TCapability.EEventType value();
}
