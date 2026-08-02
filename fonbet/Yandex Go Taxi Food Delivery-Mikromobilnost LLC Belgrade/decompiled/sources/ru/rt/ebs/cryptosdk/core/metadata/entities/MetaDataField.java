package ru.rt.ebs.cryptosdk.core.metadata.entities;

import defpackage.j73;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lru/rt/ebs/cryptosdk/core/metadata/entities/MetaDataField;", "", "<init>", "()V", "TIME_ZONE_FIELD", "", "OPERATING_SYSTEM_FIELD", "ISP_FIELD", "SCREEN_FIELD", "DPI_FIELD", "CAMERA_ID_FIELD", "LOCALE_FIELD", "DEVICE_SERIAL_FIELD", "IMEI_FIELD", "DEVICE_ID_FIELD", "DEVICE_MANUFACTURER_FIELD", "DEVICE_MODEL_FIELD", "GEOLOCATION_FIELD", "ADVERTISING_ID_FIELD", "DATE_FIELD", "DEVICE_CPU", "SIM", "ROOTED", "ERROR_VALUE", "EMPTY_VALUE", "UNKNOWN_VALUE", "NOT_PERMISSIONS_VALUE", "isMetaDataValue", "", "value", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MetaDataField {
    public static final String ADVERTISING_ID_FIELD = "advertising_id";
    public static final String CAMERA_ID_FIELD = "camera_id";
    public static final String DATE_FIELD = "date";
    public static final String DEVICE_CPU = "device_cpu";
    public static final String DEVICE_ID_FIELD = "device_id";
    public static final String DEVICE_MANUFACTURER_FIELD = "device_manufacturer";
    public static final String DEVICE_MODEL_FIELD = "device_model";
    public static final String DEVICE_SERIAL_FIELD = "device_serial";
    public static final String DPI_FIELD = "dpi";
    public static final String EMPTY_VALUE = "empty";
    public static final String ERROR_VALUE = "error";
    public static final String GEOLOCATION_FIELD = "geolocation";
    public static final String IMEI_FIELD = "imei";
    public static final MetaDataField INSTANCE = new MetaDataField();
    public static final String ISP_FIELD = "isp";
    public static final String LOCALE_FIELD = "locale";
    public static final String NOT_PERMISSIONS_VALUE = "not_perm";
    public static final String OPERATING_SYSTEM_FIELD = "operating_system";
    public static final String ROOTED = "rooted";
    public static final String SCREEN_FIELD = "screen";
    public static final String SIM = "sim";
    public static final String TIME_ZONE_FIELD = "time_zone";
    public static final String UNKNOWN_VALUE = "unknown";

    private MetaDataField() {
    }

    public final boolean isMetaDataValue(String value) {
        return j73.y(new String[]{"error", "empty", "unknown", NOT_PERMISSIONS_VALUE}, value);
    }
}
