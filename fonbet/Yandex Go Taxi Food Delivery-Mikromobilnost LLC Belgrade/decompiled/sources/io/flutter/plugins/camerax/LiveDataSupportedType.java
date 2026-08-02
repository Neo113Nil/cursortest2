package io.flutter.plugins.camerax;

import defpackage.gvy;
import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lio/flutter/plugins/camerax/LiveDataSupportedType;", "", "", "raw", CA20Status.STATUS_USER_I, "a", "()I", "Companion", "gvy", "CAMERA_STATE", "ZOOM_STATE", "camera_android_camerax_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LiveDataSupportedType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ LiveDataSupportedType[] $VALUES;
    public static final LiveDataSupportedType CAMERA_STATE;
    public static final gvy Companion;
    public static final LiveDataSupportedType ZOOM_STATE;
    private final int raw;

    static {
        LiveDataSupportedType liveDataSupportedType = new LiveDataSupportedType("CAMERA_STATE", 0, 0);
        CAMERA_STATE = liveDataSupportedType;
        LiveDataSupportedType liveDataSupportedType2 = new LiveDataSupportedType("ZOOM_STATE", 1, 1);
        ZOOM_STATE = liveDataSupportedType2;
        LiveDataSupportedType[] liveDataSupportedTypeArr = {liveDataSupportedType, liveDataSupportedType2};
        $VALUES = liveDataSupportedTypeArr;
        $ENTRIES = kotlin.enums.a.a(liveDataSupportedTypeArr);
        Companion = new gvy();
    }

    public LiveDataSupportedType(String str, int i, int i2) {
        this.raw = i2;
    }

    public static LiveDataSupportedType valueOf(String str) {
        return (LiveDataSupportedType) Enum.valueOf(LiveDataSupportedType.class, str);
    }

    public static LiveDataSupportedType[] values() {
        return (LiveDataSupportedType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final int getRaw() {
        return this.raw;
    }
}
