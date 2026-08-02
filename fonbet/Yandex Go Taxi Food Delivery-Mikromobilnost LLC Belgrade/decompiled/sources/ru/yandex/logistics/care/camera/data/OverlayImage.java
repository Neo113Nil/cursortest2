package ru.yandex.logistics.care.camera.data;

import defpackage.i190;
import defpackage.jyg0;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\b\u0080\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lru/yandex/logistics/care/camera/data/OverlayImage;", "", "", "drawableId", CA20Status.STATUS_USER_I, "a", "()I", "", "key", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Companion", "i190", "FrontLeft", "FrontRight", "RearLeft", "RearRight", "PhoneBackSide", "sdk-care-camera"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OverlayImage {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ OverlayImage[] $VALUES;
    public static final i190 Companion;
    public static final OverlayImage FrontLeft;
    public static final OverlayImage FrontRight;
    public static final OverlayImage PhoneBackSide;
    public static final OverlayImage RearLeft;
    public static final OverlayImage RearRight;
    private final int drawableId;
    private final String key;

    static {
        OverlayImage overlayImage = new OverlayImage("FrontLeft", 0, jyg0.overlay_frame_vehicle_front_left, "vehicle_front_left");
        FrontLeft = overlayImage;
        OverlayImage overlayImage2 = new OverlayImage("FrontRight", 1, jyg0.overlay_frame_vehicle_front_right, "vehicle_front_right");
        FrontRight = overlayImage2;
        OverlayImage overlayImage3 = new OverlayImage("RearLeft", 2, jyg0.overlay_frame_vehicle_rear_left, "vehicle_rear_left");
        RearLeft = overlayImage3;
        OverlayImage overlayImage4 = new OverlayImage("RearRight", 3, jyg0.overlay_frame_vehicle_rear_right, "vehicle_rear_right");
        RearRight = overlayImage4;
        OverlayImage overlayImage5 = new OverlayImage("PhoneBackSide", 4, jyg0.overlay_fram_phone_back, "smartphone_back_side");
        PhoneBackSide = overlayImage5;
        OverlayImage[] overlayImageArr = {overlayImage, overlayImage2, overlayImage3, overlayImage4, overlayImage5};
        $VALUES = overlayImageArr;
        $ENTRIES = a.a(overlayImageArr);
        Companion = new i190();
    }

    public OverlayImage(String str, int i, int i2, String str2) {
        this.drawableId = i2;
        this.key = str2;
    }

    public static k4o b() {
        return $ENTRIES;
    }

    public static OverlayImage valueOf(String str) {
        return (OverlayImage) Enum.valueOf(OverlayImage.class, str);
    }

    public static OverlayImage[] values() {
        return (OverlayImage[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final int getDrawableId() {
        return this.drawableId;
    }

    /* renamed from: c, reason: from getter */
    public final String getKey() {
        return this.key;
    }
}
