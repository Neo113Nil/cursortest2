package ru.yandex.tankerapp.fintech.models.results;

import defpackage.k4o;
import defpackage.ysq0;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/tankerapp/fintech/models/results/FintechStatusResult;", "", "<init>", "(Ljava/lang/String;I)V", "Success", "Failure", "Cancel", "fintech_sdk_interface_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FintechStatusResult {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FintechStatusResult[] $VALUES;

    @ysq0("success")
    public static final FintechStatusResult Success = new FintechStatusResult("Success", 0);

    @ysq0("failed")
    public static final FintechStatusResult Failure = new FintechStatusResult("Failure", 1);

    @ysq0("cancelled")
    public static final FintechStatusResult Cancel = new FintechStatusResult("Cancel", 2);

    private static final /* synthetic */ FintechStatusResult[] $values() {
        return new FintechStatusResult[]{Success, Failure, Cancel};
    }

    static {
        FintechStatusResult[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private FintechStatusResult(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static FintechStatusResult valueOf(String str) {
        return (FintechStatusResult) Enum.valueOf(FintechStatusResult.class, str);
    }

    public static FintechStatusResult[] values() {
        return (FintechStatusResult[]) $VALUES.clone();
    }
}
