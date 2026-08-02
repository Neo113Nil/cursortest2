package ru.yandex.logistics.sdk.cargo_form.impl.model.common;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"ru/yandex/logistics/sdk/cargo_form/impl/model/common/TapAction$ArBoxesSmartCameraAction$Intent", "", "Lru/yandex/logistics/sdk/cargo_form/impl/model/common/TapAction$ArBoxesSmartCameraAction$Intent;", "ROTATE", "RESET", "sdk-delivery-cargo-form"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TapAction$ArBoxesSmartCameraAction$Intent {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TapAction$ArBoxesSmartCameraAction$Intent[] $VALUES;
    public static final TapAction$ArBoxesSmartCameraAction$Intent RESET;
    public static final TapAction$ArBoxesSmartCameraAction$Intent ROTATE;

    static {
        TapAction$ArBoxesSmartCameraAction$Intent tapAction$ArBoxesSmartCameraAction$Intent = new TapAction$ArBoxesSmartCameraAction$Intent("ROTATE", 0);
        ROTATE = tapAction$ArBoxesSmartCameraAction$Intent;
        TapAction$ArBoxesSmartCameraAction$Intent tapAction$ArBoxesSmartCameraAction$Intent2 = new TapAction$ArBoxesSmartCameraAction$Intent("RESET", 1);
        RESET = tapAction$ArBoxesSmartCameraAction$Intent2;
        TapAction$ArBoxesSmartCameraAction$Intent[] tapAction$ArBoxesSmartCameraAction$IntentArr = {tapAction$ArBoxesSmartCameraAction$Intent, tapAction$ArBoxesSmartCameraAction$Intent2};
        $VALUES = tapAction$ArBoxesSmartCameraAction$IntentArr;
        $ENTRIES = a.a(tapAction$ArBoxesSmartCameraAction$IntentArr);
    }

    public static TapAction$ArBoxesSmartCameraAction$Intent valueOf(String str) {
        return (TapAction$ArBoxesSmartCameraAction$Intent) Enum.valueOf(TapAction$ArBoxesSmartCameraAction$Intent.class, str);
    }

    public static TapAction$ArBoxesSmartCameraAction$Intent[] values() {
        return (TapAction$ArBoxesSmartCameraAction$Intent[]) $VALUES.clone();
    }
}
