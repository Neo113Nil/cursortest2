package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions;

import com.squareup.moshi.Json;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/ClientImageTypeDto;", "", "<init>", "(Ljava/lang/String;I)V", "POSTCARD", "COMMENT_IMAGE", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ClientImageTypeDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ClientImageTypeDto[] $VALUES;

    @Json(name = "postcard")
    public static final ClientImageTypeDto POSTCARD = new ClientImageTypeDto("POSTCARD", 0);

    @Json(name = "comment-image")
    public static final ClientImageTypeDto COMMENT_IMAGE = new ClientImageTypeDto("COMMENT_IMAGE", 1);

    private static final /* synthetic */ ClientImageTypeDto[] $values() {
        return new ClientImageTypeDto[]{POSTCARD, COMMENT_IMAGE};
    }

    static {
        ClientImageTypeDto[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private ClientImageTypeDto(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static ClientImageTypeDto valueOf(String str) {
        return (ClientImageTypeDto) Enum.valueOf(ClientImageTypeDto.class, str);
    }

    public static ClientImageTypeDto[] values() {
        return (ClientImageTypeDto[]) $VALUES.clone();
    }
}
