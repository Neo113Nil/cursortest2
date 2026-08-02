package ru.yandex.taxi.logistics.sdk.tracking.uuid_store;

import com.squareup.moshi.FromJson;
import com.squareup.moshi.ToJson;
import java.util.UUID;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0007¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/tracking/uuid_store/UuidJsonAdapter;", "", "<init>", "()V", "fromJson", "Ljava/util/UUID;", "json", "", "toJson", "uuid", "uuid-store"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class UuidJsonAdapter {
    public static final UuidJsonAdapter INSTANCE = new UuidJsonAdapter();

    private UuidJsonAdapter() {
    }

    @FromJson
    public final UUID fromJson(String json2) {
        return UUID.fromString(json2);
    }

    @ToJson
    public final String toJson(UUID uuid) {
        return uuid.toString();
    }
}
