package ru.yandex.taxi.scooters.presentation.detailed_order.show_navigation;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"ru/yandex/taxi/scooters/presentation/detailed_order/show_navigation/ScootersShowNavigationBubbleAnalytics$BubbleButton", "", "Lru/yandex/taxi/scooters/presentation/detailed_order/show_navigation/ScootersShowNavigationBubbleAnalytics$BubbleButton;", "", "buttonName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "YES", "NO", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScootersShowNavigationBubbleAnalytics$BubbleButton {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersShowNavigationBubbleAnalytics$BubbleButton[] $VALUES;
    public static final ScootersShowNavigationBubbleAnalytics$BubbleButton NO;
    public static final ScootersShowNavigationBubbleAnalytics$BubbleButton YES;
    private final String buttonName;

    static {
        ScootersShowNavigationBubbleAnalytics$BubbleButton scootersShowNavigationBubbleAnalytics$BubbleButton = new ScootersShowNavigationBubbleAnalytics$BubbleButton("YES", 0, "yes");
        YES = scootersShowNavigationBubbleAnalytics$BubbleButton;
        ScootersShowNavigationBubbleAnalytics$BubbleButton scootersShowNavigationBubbleAnalytics$BubbleButton2 = new ScootersShowNavigationBubbleAnalytics$BubbleButton("NO", 1, "no");
        NO = scootersShowNavigationBubbleAnalytics$BubbleButton2;
        ScootersShowNavigationBubbleAnalytics$BubbleButton[] scootersShowNavigationBubbleAnalytics$BubbleButtonArr = {scootersShowNavigationBubbleAnalytics$BubbleButton, scootersShowNavigationBubbleAnalytics$BubbleButton2};
        $VALUES = scootersShowNavigationBubbleAnalytics$BubbleButtonArr;
        $ENTRIES = kotlin.enums.a.a(scootersShowNavigationBubbleAnalytics$BubbleButtonArr);
    }

    public ScootersShowNavigationBubbleAnalytics$BubbleButton(String str, int i, String str2) {
        this.buttonName = str2;
    }

    public static ScootersShowNavigationBubbleAnalytics$BubbleButton valueOf(String str) {
        return (ScootersShowNavigationBubbleAnalytics$BubbleButton) Enum.valueOf(ScootersShowNavigationBubbleAnalytics$BubbleButton.class, str);
    }

    public static ScootersShowNavigationBubbleAnalytics$BubbleButton[] values() {
        return (ScootersShowNavigationBubbleAnalytics$BubbleButton[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getButtonName() {
        return this.buttonName;
    }
}
