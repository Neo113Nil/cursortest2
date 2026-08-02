package ru.yandex.taxi.object;

import com.samsung.android.sdk.samsungpay.v2.card.Card;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.tvl;
import defpackage.yfm;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lru/yandex/taxi/object/DriveState;", "", "", "analyticsName", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Companion", "yfm", "PREORDER", "SEARCH", "SCHEDULING", "SCHEDULED", "CHECK_IN", "DRIVING", "WAITING", "TRANSPORTING", "COMPLETE", "CANCELLED", "FAILED", Card.EXPIRED, "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class DriveState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DriveState[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final DriveState CANCELLED;
    public static final DriveState CHECK_IN;
    public static final DriveState COMPLETE;
    public static final yfm Companion;
    public static final DriveState DRIVING;
    public static final DriveState EXPIRED;
    public static final DriveState FAILED;
    public static final DriveState PREORDER;
    public static final DriveState SCHEDULED;
    public static final DriveState SCHEDULING;
    public static final DriveState SEARCH;
    public static final DriveState TRANSPORTING;
    public static final DriveState WAITING;
    private final String analyticsName;

    static {
        DriveState driveState = new DriveState("PREORDER", 0, "preorder");
        PREORDER = driveState;
        DriveState driveState2 = new DriveState("SEARCH", 1, "search");
        SEARCH = driveState2;
        DriveState driveState3 = new DriveState("SCHEDULING", 2, "scheduling");
        SCHEDULING = driveState3;
        DriveState driveState4 = new DriveState("SCHEDULED", 3, "scheduled");
        SCHEDULED = driveState4;
        DriveState driveState5 = new DriveState("CHECK_IN", 4, "check_in");
        CHECK_IN = driveState5;
        DriveState driveState6 = new DriveState("DRIVING", 5, "driving");
        DRIVING = driveState6;
        DriveState driveState7 = new DriveState("WAITING", 6, "waiting");
        WAITING = driveState7;
        DriveState driveState8 = new DriveState("TRANSPORTING", 7, "transporting");
        TRANSPORTING = driveState8;
        DriveState driveState9 = new DriveState("COMPLETE", 8, "complete");
        COMPLETE = driveState9;
        DriveState driveState10 = new DriveState("CANCELLED", 9, "cancelled");
        CANCELLED = driveState10;
        DriveState driveState11 = new DriveState("FAILED", 10, "failed");
        FAILED = driveState11;
        DriveState driveState12 = new DriveState(Card.EXPIRED, 11, "expired");
        EXPIRED = driveState12;
        DriveState[] driveStateArr = {driveState, driveState2, driveState3, driveState4, driveState5, driveState6, driveState7, driveState8, driveState9, driveState10, driveState11, driveState12};
        $VALUES = driveStateArr;
        $ENTRIES = a.a(driveStateArr);
        Companion = new yfm();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new tvl(16));
    }

    public DriveState(String str, int i, String str2) {
        this.analyticsName = str2;
    }

    public static k4o c() {
        return $ENTRIES;
    }

    public static DriveState valueOf(String str) {
        return (DriveState) Enum.valueOf(DriveState.class, str);
    }

    public static DriveState[] values() {
        return (DriveState[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getAnalyticsName() {
        return this.analyticsName;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.analyticsName;
    }
}
