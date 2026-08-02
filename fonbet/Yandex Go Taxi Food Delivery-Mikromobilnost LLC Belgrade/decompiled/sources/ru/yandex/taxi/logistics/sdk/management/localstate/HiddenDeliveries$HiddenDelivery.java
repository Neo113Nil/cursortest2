package ru.yandex.taxi.logistics.sdk.management.localstate;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"ru/yandex/taxi/logistics/sdk/management/localstate/HiddenDeliveries$HiddenDelivery", "", "", MetaDataField.DATE_FIELD, "", "deliveryId", "", "revision", "<init>", "(JLjava/lang/String;I)V", "J", "getDate", "()J", "Ljava/lang/String;", "getDeliveryId", "()Ljava/lang/String;", CA20Status.STATUS_USER_I, "getRevision", "()I", "sdk-management-impl"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class HiddenDeliveries$HiddenDelivery {
    public static final int $stable = 0;
    private final long date;
    private final String deliveryId;
    private final int revision;

    public HiddenDeliveries$HiddenDelivery(@Json(name = "date") long j, @Json(name = "id") String str, @Json(name = "revision") int i) {
        this.date = j;
        this.deliveryId = str;
        this.revision = i;
    }

    public final long getDate() {
        return this.date;
    }

    public final String getDeliveryId() {
        return this.deliveryId;
    }

    public final int getRevision() {
        return this.revision;
    }

    public /* synthetic */ HiddenDeliveries$HiddenDelivery(long j, String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, (i2 & 4) != 0 ? 0 : i);
    }
}
