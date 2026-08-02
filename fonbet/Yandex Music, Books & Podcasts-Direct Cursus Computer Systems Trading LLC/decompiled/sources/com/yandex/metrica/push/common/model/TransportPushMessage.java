package com.yandex.metrica.push.common.model;

import android.os.Bundle;
import com.connectsdk.discovery.provider.ssdp.Service;
import com.yandex.metrica.push.common.CoreConstants;
import com.yandex.metrica.push.common.utils.JsonUtils;
import defpackage.arf;
import defpackage.btf;
import defpackage.uif;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001b\u0010\u000b\u001a\u00020\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/yandex/metrica/push/common/model/TransportPushMessage;", "Lcom/yandex/metrica/push/common/model/BasePushMessage;", "Landroid/os/Bundle;", "bundle", "<init>", "(Landroid/os/Bundle;)V", "Lcom/yandex/metrica/push/common/model/ServiceType;", "d", "Larf;", "getServiceType", "()Lcom/yandex/metrica/push/common/model/ServiceType;", Service.TAG_SERVICE_TYPE, "appmetricapush-core_internalRelease"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class TransportPushMessage extends BasePushMessage {

    /* renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final arf serviceType;

    public static final class a extends uif implements Function0<ServiceType> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ServiceType invoke() {
            ServiceType fromValue;
            Integer extractIntegerSafely = JsonUtils.extractIntegerSafely(TransportPushMessage.this.getRoot(), CoreConstants.PushMessage.SERVICE_TYPE);
            return (extractIntegerSafely == null || (fromValue = ServiceType.INSTANCE.fromValue(extractIntegerSafely.intValue())) == null) ? ServiceType.UNKNOWN : fromValue;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransportPushMessage(@NotNull Bundle bundle) {
        super(bundle);
        bundle.getClass();
        this.serviceType = btf.b(new a());
    }

    @NotNull
    public final ServiceType getServiceType() {
        return (ServiceType) this.serviceType.getValue();
    }
}
