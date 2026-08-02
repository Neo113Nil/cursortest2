package ru.yandex.taxi.scooters.presentation.ontheway.completion.force;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"ru/yandex/taxi/scooters/presentation/ontheway/completion/force/ScootersForceCompletionViewAnalytics$TappedButton", "", "Lru/yandex/taxi/scooters/presentation/ontheway/completion/force/ScootersForceCompletionViewAnalytics$TappedButton;", "", "buttonName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "BACK", "FORCE_COMPLETE", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScootersForceCompletionViewAnalytics$TappedButton {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersForceCompletionViewAnalytics$TappedButton[] $VALUES;
    public static final ScootersForceCompletionViewAnalytics$TappedButton BACK;
    public static final ScootersForceCompletionViewAnalytics$TappedButton FORCE_COMPLETE;
    private final String buttonName;

    static {
        ScootersForceCompletionViewAnalytics$TappedButton scootersForceCompletionViewAnalytics$TappedButton = new ScootersForceCompletionViewAnalytics$TappedButton("BACK", 0, "back");
        BACK = scootersForceCompletionViewAnalytics$TappedButton;
        ScootersForceCompletionViewAnalytics$TappedButton scootersForceCompletionViewAnalytics$TappedButton2 = new ScootersForceCompletionViewAnalytics$TappedButton("FORCE_COMPLETE", 1, "force_complete");
        FORCE_COMPLETE = scootersForceCompletionViewAnalytics$TappedButton2;
        ScootersForceCompletionViewAnalytics$TappedButton[] scootersForceCompletionViewAnalytics$TappedButtonArr = {scootersForceCompletionViewAnalytics$TappedButton, scootersForceCompletionViewAnalytics$TappedButton2};
        $VALUES = scootersForceCompletionViewAnalytics$TappedButtonArr;
        $ENTRIES = kotlin.enums.a.a(scootersForceCompletionViewAnalytics$TappedButtonArr);
    }

    public ScootersForceCompletionViewAnalytics$TappedButton(String str, int i, String str2) {
        this.buttonName = str2;
    }

    public static ScootersForceCompletionViewAnalytics$TappedButton valueOf(String str) {
        return (ScootersForceCompletionViewAnalytics$TappedButton) Enum.valueOf(ScootersForceCompletionViewAnalytics$TappedButton.class, str);
    }

    public static ScootersForceCompletionViewAnalytics$TappedButton[] values() {
        return (ScootersForceCompletionViewAnalytics$TappedButton[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getButtonName() {
        return this.buttonName;
    }
}
