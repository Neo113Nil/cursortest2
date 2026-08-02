package ru.yandex.logistics.sdk.cargo_form.core.api.repository;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"ru/yandex/logistics/sdk/cargo_form/core/api/repository/FormLoadingStateRepository$State", "", "Lru/yandex/logistics/sdk/cargo_form/core/api/repository/FormLoadingStateRepository$State;", "LOADING", "READY", "ERROR", "core"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FormLoadingStateRepository$State {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FormLoadingStateRepository$State[] $VALUES;
    public static final FormLoadingStateRepository$State ERROR;
    public static final FormLoadingStateRepository$State LOADING;
    public static final FormLoadingStateRepository$State READY;

    static {
        FormLoadingStateRepository$State formLoadingStateRepository$State = new FormLoadingStateRepository$State("LOADING", 0);
        LOADING = formLoadingStateRepository$State;
        FormLoadingStateRepository$State formLoadingStateRepository$State2 = new FormLoadingStateRepository$State("READY", 1);
        READY = formLoadingStateRepository$State2;
        FormLoadingStateRepository$State formLoadingStateRepository$State3 = new FormLoadingStateRepository$State("ERROR", 2);
        ERROR = formLoadingStateRepository$State3;
        FormLoadingStateRepository$State[] formLoadingStateRepository$StateArr = {formLoadingStateRepository$State, formLoadingStateRepository$State2, formLoadingStateRepository$State3};
        $VALUES = formLoadingStateRepository$StateArr;
        $ENTRIES = kotlin.enums.a.a(formLoadingStateRepository$StateArr);
    }

    public static FormLoadingStateRepository$State valueOf(String str) {
        return (FormLoadingStateRepository$State) Enum.valueOf(FormLoadingStateRepository$State.class, str);
    }

    public static FormLoadingStateRepository$State[] values() {
        return (FormLoadingStateRepository$State[]) $VALUES.clone();
    }
}
