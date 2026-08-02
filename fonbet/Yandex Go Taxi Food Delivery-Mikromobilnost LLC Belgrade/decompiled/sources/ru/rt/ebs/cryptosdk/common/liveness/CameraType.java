package ru.rt.ebs.cryptosdk.common.liveness;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/rt/ebs/cryptosdk/common/liveness/CameraType;", "", "FRONT", "BACK", "cryptosdk_prodRelease"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes4.dex */
public final class CameraType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CameraType[] $VALUES;
    public static final CameraType BACK;
    public static final CameraType FRONT;

    static {
        CameraType cameraType = new CameraType("FRONT", 0);
        FRONT = cameraType;
        CameraType cameraType2 = new CameraType("BACK", 1);
        BACK = cameraType2;
        CameraType[] cameraTypeArr = {cameraType, cameraType2};
        $VALUES = cameraTypeArr;
        $ENTRIES = kotlin.enums.a.a(cameraTypeArr);
    }

    public static CameraType valueOf(String str) {
        return (CameraType) Enum.valueOf(CameraType.class, str);
    }

    public static CameraType[] values() {
        return (CameraType[]) $VALUES.clone();
    }
}
