package ru.yandex.taxi.logistics.sdk.permissions.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/logistics/sdk/permissions/api/Permission;", "", "CALL", "LOCATION", "CAMERA", "NOTIFICATION", "READ_CONTACTS", "sdk-permissions"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Permission {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Permission[] $VALUES;
    public static final Permission CALL;
    public static final Permission CAMERA;
    public static final Permission LOCATION;
    public static final Permission NOTIFICATION;
    public static final Permission READ_CONTACTS;

    static {
        Permission permission = new Permission("CALL", 0);
        CALL = permission;
        Permission permission2 = new Permission("LOCATION", 1);
        LOCATION = permission2;
        Permission permission3 = new Permission("CAMERA", 2);
        CAMERA = permission3;
        Permission permission4 = new Permission("NOTIFICATION", 3);
        NOTIFICATION = permission4;
        Permission permission5 = new Permission("READ_CONTACTS", 4);
        READ_CONTACTS = permission5;
        Permission[] permissionArr = {permission, permission2, permission3, permission4, permission5};
        $VALUES = permissionArr;
        $ENTRIES = a.a(permissionArr);
    }

    public static Permission valueOf(String str) {
        return (Permission) Enum.valueOf(Permission.class, str);
    }

    public static Permission[] values() {
        return (Permission[]) $VALUES.clone();
    }
}
