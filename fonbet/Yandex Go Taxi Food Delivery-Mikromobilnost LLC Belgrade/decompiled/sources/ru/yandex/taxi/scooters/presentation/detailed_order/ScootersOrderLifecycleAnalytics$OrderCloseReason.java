package ru.yandex.taxi.scooters.presentation.detailed_order;

import com.adjust.sdk.Constants;
import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"ru/yandex/taxi/scooters/presentation/detailed_order/ScootersOrderLifecycleAnalytics$OrderCloseReason", "", "Lru/yandex/taxi/scooters/presentation/detailed_order/ScootersOrderLifecycleAnalytics$OrderCloseReason;", "", CRLReasonCodeExtension.REASON, "Ljava/lang/String;", "a", "()Ljava/lang/String;", "CANCEL_RIDING", "NORMAL", "FORCE_COMPLETION", "FIX_FORCE_COMPLETION", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScootersOrderLifecycleAnalytics$OrderCloseReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersOrderLifecycleAnalytics$OrderCloseReason[] $VALUES;
    public static final ScootersOrderLifecycleAnalytics$OrderCloseReason CANCEL_RIDING;
    public static final ScootersOrderLifecycleAnalytics$OrderCloseReason FIX_FORCE_COMPLETION;
    public static final ScootersOrderLifecycleAnalytics$OrderCloseReason FORCE_COMPLETION;
    public static final ScootersOrderLifecycleAnalytics$OrderCloseReason NORMAL;
    private final String reason;

    static {
        ScootersOrderLifecycleAnalytics$OrderCloseReason scootersOrderLifecycleAnalytics$OrderCloseReason = new ScootersOrderLifecycleAnalytics$OrderCloseReason("CANCEL_RIDING", 0, "cancel_riding");
        CANCEL_RIDING = scootersOrderLifecycleAnalytics$OrderCloseReason;
        ScootersOrderLifecycleAnalytics$OrderCloseReason scootersOrderLifecycleAnalytics$OrderCloseReason2 = new ScootersOrderLifecycleAnalytics$OrderCloseReason("NORMAL", 1, Constants.NORMAL);
        NORMAL = scootersOrderLifecycleAnalytics$OrderCloseReason2;
        ScootersOrderLifecycleAnalytics$OrderCloseReason scootersOrderLifecycleAnalytics$OrderCloseReason3 = new ScootersOrderLifecycleAnalytics$OrderCloseReason("FORCE_COMPLETION", 2, "force_completion");
        FORCE_COMPLETION = scootersOrderLifecycleAnalytics$OrderCloseReason3;
        ScootersOrderLifecycleAnalytics$OrderCloseReason scootersOrderLifecycleAnalytics$OrderCloseReason4 = new ScootersOrderLifecycleAnalytics$OrderCloseReason("FIX_FORCE_COMPLETION", 3, "fix_force_completion");
        FIX_FORCE_COMPLETION = scootersOrderLifecycleAnalytics$OrderCloseReason4;
        ScootersOrderLifecycleAnalytics$OrderCloseReason[] scootersOrderLifecycleAnalytics$OrderCloseReasonArr = {scootersOrderLifecycleAnalytics$OrderCloseReason, scootersOrderLifecycleAnalytics$OrderCloseReason2, scootersOrderLifecycleAnalytics$OrderCloseReason3, scootersOrderLifecycleAnalytics$OrderCloseReason4};
        $VALUES = scootersOrderLifecycleAnalytics$OrderCloseReasonArr;
        $ENTRIES = kotlin.enums.a.a(scootersOrderLifecycleAnalytics$OrderCloseReasonArr);
    }

    public ScootersOrderLifecycleAnalytics$OrderCloseReason(String str, int i, String str2) {
        this.reason = str2;
    }

    public static ScootersOrderLifecycleAnalytics$OrderCloseReason valueOf(String str) {
        return (ScootersOrderLifecycleAnalytics$OrderCloseReason) Enum.valueOf(ScootersOrderLifecycleAnalytics$OrderCloseReason.class, str);
    }

    public static ScootersOrderLifecycleAnalytics$OrderCloseReason[] values() {
        return (ScootersOrderLifecycleAnalytics$OrderCloseReason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getReason() {
        return this.reason;
    }
}
