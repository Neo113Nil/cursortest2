package ru.yandex.taxi.persuggest.repository;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/persuggest/repository/AutoFsSessionPhase;", "", "AwaitingCycleStart", "WarmUp", "Silent", "ReadyForAutoFs", "go-client-android.features.persuggest:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AutoFsSessionPhase {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AutoFsSessionPhase[] $VALUES;
    public static final AutoFsSessionPhase AwaitingCycleStart;
    public static final AutoFsSessionPhase ReadyForAutoFs;
    public static final AutoFsSessionPhase Silent;
    public static final AutoFsSessionPhase WarmUp;

    static {
        AutoFsSessionPhase autoFsSessionPhase = new AutoFsSessionPhase("AwaitingCycleStart", 0);
        AwaitingCycleStart = autoFsSessionPhase;
        AutoFsSessionPhase autoFsSessionPhase2 = new AutoFsSessionPhase("WarmUp", 1);
        WarmUp = autoFsSessionPhase2;
        AutoFsSessionPhase autoFsSessionPhase3 = new AutoFsSessionPhase("Silent", 2);
        Silent = autoFsSessionPhase3;
        AutoFsSessionPhase autoFsSessionPhase4 = new AutoFsSessionPhase("ReadyForAutoFs", 3);
        ReadyForAutoFs = autoFsSessionPhase4;
        AutoFsSessionPhase[] autoFsSessionPhaseArr = {autoFsSessionPhase, autoFsSessionPhase2, autoFsSessionPhase3, autoFsSessionPhase4};
        $VALUES = autoFsSessionPhaseArr;
        $ENTRIES = kotlin.enums.a.a(autoFsSessionPhaseArr);
    }

    public static AutoFsSessionPhase valueOf(String str) {
        return (AutoFsSessionPhase) Enum.valueOf(AutoFsSessionPhase.class, str);
    }

    public static AutoFsSessionPhase[] values() {
        return (AutoFsSessionPhase[]) $VALUES.clone();
    }
}
