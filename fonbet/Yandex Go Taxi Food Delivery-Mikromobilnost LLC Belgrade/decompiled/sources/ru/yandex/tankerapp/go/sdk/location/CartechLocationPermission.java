package ru.yandex.tankerapp.go.sdk.location;

import defpackage.k4o;
import defpackage.ysq0;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lru/yandex/tankerapp/go/sdk/location/CartechLocationPermission;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Always", "WhileInUse", CA20Status.STATUS_REQUEST_DESCRIPTION_D, "DeniedForever", "UnableToDetermine", "tanker_go_sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CartechLocationPermission {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CartechLocationPermission[] $VALUES;

    @ysq0("always")
    public static final CartechLocationPermission Always;

    @ysq0("denied")
    public static final CartechLocationPermission Denied;

    @ysq0("deniedForever")
    public static final CartechLocationPermission DeniedForever;

    @ysq0("unableToDetermine")
    public static final CartechLocationPermission UnableToDetermine;

    @ysq0("whileInUse")
    public static final CartechLocationPermission WhileInUse;
    private final String value;

    static {
        CartechLocationPermission cartechLocationPermission = new CartechLocationPermission("Always", 0, "always");
        Always = cartechLocationPermission;
        CartechLocationPermission cartechLocationPermission2 = new CartechLocationPermission("WhileInUse", 1, "whileInUse");
        WhileInUse = cartechLocationPermission2;
        CartechLocationPermission cartechLocationPermission3 = new CartechLocationPermission(CA20Status.STATUS_REQUEST_DESCRIPTION_D, 2, "denied");
        Denied = cartechLocationPermission3;
        CartechLocationPermission cartechLocationPermission4 = new CartechLocationPermission("DeniedForever", 3, "deniedForever");
        DeniedForever = cartechLocationPermission4;
        CartechLocationPermission cartechLocationPermission5 = new CartechLocationPermission("UnableToDetermine", 4, "unableToDetermine");
        UnableToDetermine = cartechLocationPermission5;
        CartechLocationPermission[] cartechLocationPermissionArr = {cartechLocationPermission, cartechLocationPermission2, cartechLocationPermission3, cartechLocationPermission4, cartechLocationPermission5};
        $VALUES = cartechLocationPermissionArr;
        $ENTRIES = a.a(cartechLocationPermissionArr);
    }

    private CartechLocationPermission(String str, int i, String str2) {
        this.value = str2;
    }

    public static CartechLocationPermission valueOf(String str) {
        return (CartechLocationPermission) Enum.valueOf(CartechLocationPermission.class, str);
    }

    public static CartechLocationPermission[] values() {
        return (CartechLocationPermission[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
