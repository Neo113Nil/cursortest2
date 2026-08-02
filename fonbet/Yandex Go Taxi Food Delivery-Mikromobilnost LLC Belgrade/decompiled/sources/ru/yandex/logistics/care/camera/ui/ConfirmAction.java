package ru.yandex.logistics.care.camera.ui;

import defpackage.k4o;
import kotlin.Metadata;
import ru.yandex.video.m3.list_player_manager.impl.image.GlideBitmapDownloader;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/logistics/care/camera/ui/ConfirmAction;", "", "Reject", GlideBitmapDownloader.ACCEPT_HEADER, "sdk-care-camera"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ConfirmAction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ConfirmAction[] $VALUES;
    public static final ConfirmAction Accept;
    public static final ConfirmAction Reject;

    static {
        ConfirmAction confirmAction = new ConfirmAction("Reject", 0);
        Reject = confirmAction;
        ConfirmAction confirmAction2 = new ConfirmAction(GlideBitmapDownloader.ACCEPT_HEADER, 1);
        Accept = confirmAction2;
        ConfirmAction[] confirmActionArr = {confirmAction, confirmAction2};
        $VALUES = confirmActionArr;
        $ENTRIES = kotlin.enums.a.a(confirmActionArr);
    }

    public static ConfirmAction valueOf(String str) {
        return (ConfirmAction) Enum.valueOf(ConfirmAction.class, str);
    }

    public static ConfirmAction[] values() {
        return (ConfirmAction[]) $VALUES.clone();
    }
}
