package ru.yandex.taxi.ui.routing;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"ru/yandex/taxi/ui/routing/DriverFullNameCopyRouter$CopySource", "", "Lru/yandex/taxi/ui/routing/DriverFullNameCopyRouter$CopySource;", "", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "Ljava/lang/String;", "getEvent", "()Ljava/lang/String;", "setEvent", "(Ljava/lang/String;)V", "DETAIL", "PROFILE", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DriverFullNameCopyRouter$CopySource {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DriverFullNameCopyRouter$CopySource[] $VALUES;
    public static final DriverFullNameCopyRouter$CopySource DETAIL;
    public static final DriverFullNameCopyRouter$CopySource PROFILE;
    private String event;

    static {
        DriverFullNameCopyRouter$CopySource driverFullNameCopyRouter$CopySource = new DriverFullNameCopyRouter$CopySource("DETAIL", 0, "OrderInfo.DriverNameCopy.Tapped");
        DETAIL = driverFullNameCopyRouter$CopySource;
        DriverFullNameCopyRouter$CopySource driverFullNameCopyRouter$CopySource2 = new DriverFullNameCopyRouter$CopySource("PROFILE", 1, "DriverProfile.DriverNameCopy.Tapped");
        PROFILE = driverFullNameCopyRouter$CopySource2;
        DriverFullNameCopyRouter$CopySource[] driverFullNameCopyRouter$CopySourceArr = {driverFullNameCopyRouter$CopySource, driverFullNameCopyRouter$CopySource2};
        $VALUES = driverFullNameCopyRouter$CopySourceArr;
        $ENTRIES = a.a(driverFullNameCopyRouter$CopySourceArr);
    }

    public DriverFullNameCopyRouter$CopySource(String str, int i, String str2) {
        this.event = str2;
    }

    public static DriverFullNameCopyRouter$CopySource valueOf(String str) {
        return (DriverFullNameCopyRouter$CopySource) Enum.valueOf(DriverFullNameCopyRouter$CopySource.class, str);
    }

    public static DriverFullNameCopyRouter$CopySource[] values() {
        return (DriverFullNameCopyRouter$CopySource[]) $VALUES.clone();
    }
}
