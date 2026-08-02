package ru.yandex.taxi.am;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/yandex/taxi/am/SupportedPushPlatform;", "", "", "errorPrefix", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "FCM", "HMS", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SupportedPushPlatform {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SupportedPushPlatform[] $VALUES;
    public static final SupportedPushPlatform FCM;
    public static final SupportedPushPlatform HMS;
    private final String errorPrefix;

    static {
        SupportedPushPlatform supportedPushPlatform = new SupportedPushPlatform("FCM", 0, "PASSPORT_FCM_ERROR");
        FCM = supportedPushPlatform;
        SupportedPushPlatform supportedPushPlatform2 = new SupportedPushPlatform("HMS", 1, "PASSPORT_HMS_ERROR");
        HMS = supportedPushPlatform2;
        SupportedPushPlatform[] supportedPushPlatformArr = {supportedPushPlatform, supportedPushPlatform2};
        $VALUES = supportedPushPlatformArr;
        $ENTRIES = kotlin.enums.a.a(supportedPushPlatformArr);
    }

    public SupportedPushPlatform(String str, int i, String str2) {
        this.errorPrefix = str2;
    }

    public static SupportedPushPlatform valueOf(String str) {
        return (SupportedPushPlatform) Enum.valueOf(SupportedPushPlatform.class, str);
    }

    public static SupportedPushPlatform[] values() {
        return (SupportedPushPlatform[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getErrorPrefix() {
        return this.errorPrefix;
    }
}
