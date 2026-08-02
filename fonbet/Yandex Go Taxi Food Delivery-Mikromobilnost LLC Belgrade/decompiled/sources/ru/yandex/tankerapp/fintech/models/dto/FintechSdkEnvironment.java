package ru.yandex.tankerapp.fintech.models.dto;

import com.adjust.sdk.AdjustConfig;
import defpackage.k4o;
import defpackage.ysq0;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/tankerapp/fintech/models/dto/FintechSdkEnvironment;", "", "<init>", "(Ljava/lang/String;I)V", "Production", "Testing", "fintech_sdk_interface_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class FintechSdkEnvironment {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FintechSdkEnvironment[] $VALUES;

    @ysq0(AdjustConfig.ENVIRONMENT_PRODUCTION)
    public static final FintechSdkEnvironment Production = new FintechSdkEnvironment("Production", 0);

    @ysq0("testing")
    public static final FintechSdkEnvironment Testing = new FintechSdkEnvironment("Testing", 1);

    private static final /* synthetic */ FintechSdkEnvironment[] $values() {
        return new FintechSdkEnvironment[]{Production, Testing};
    }

    static {
        FintechSdkEnvironment[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private FintechSdkEnvironment(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static FintechSdkEnvironment valueOf(String str) {
        return (FintechSdkEnvironment) Enum.valueOf(FintechSdkEnvironment.class, str);
    }

    public static FintechSdkEnvironment[] values() {
        return (FintechSdkEnvironment[]) $VALUES.clone();
    }
}
