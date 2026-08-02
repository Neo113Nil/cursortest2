package ru.yandex.taxi.scooters.presentation.ontheway.bluetooth;

import com.yandex.go.scooters.analytics.ScootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName;
import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"ru/yandex/taxi/scooters/presentation/ontheway/bluetooth/ScootersBluetoothModalViewAnalytics$TappedButton", "", "Lru/yandex/taxi/scooters/presentation/ontheway/bluetooth/ScootersBluetoothModalViewAnalytics$TappedButton;", "Lcom/yandex/go/scooters/analytics/ScootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName;", "buttonName", "Lcom/yandex/go/scooters/analytics/ScootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName;", "a", "()Lcom/yandex/go/scooters/analytics/ScootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName;", "OK", "CANCEL", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScootersBluetoothModalViewAnalytics$TappedButton {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersBluetoothModalViewAnalytics$TappedButton[] $VALUES;
    public static final ScootersBluetoothModalViewAnalytics$TappedButton CANCEL;
    public static final ScootersBluetoothModalViewAnalytics$TappedButton OK;
    private final ScootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName buttonName;

    static {
        ScootersBluetoothModalViewAnalytics$TappedButton scootersBluetoothModalViewAnalytics$TappedButton = new ScootersBluetoothModalViewAnalytics$TappedButton("OK", 0, ScootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName.Ok);
        OK = scootersBluetoothModalViewAnalytics$TappedButton;
        ScootersBluetoothModalViewAnalytics$TappedButton scootersBluetoothModalViewAnalytics$TappedButton2 = new ScootersBluetoothModalViewAnalytics$TappedButton("CANCEL", 1, ScootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName.Cancel);
        CANCEL = scootersBluetoothModalViewAnalytics$TappedButton2;
        ScootersBluetoothModalViewAnalytics$TappedButton[] scootersBluetoothModalViewAnalytics$TappedButtonArr = {scootersBluetoothModalViewAnalytics$TappedButton, scootersBluetoothModalViewAnalytics$TappedButton2};
        $VALUES = scootersBluetoothModalViewAnalytics$TappedButtonArr;
        $ENTRIES = kotlin.enums.a.a(scootersBluetoothModalViewAnalytics$TappedButtonArr);
    }

    public ScootersBluetoothModalViewAnalytics$TappedButton(String str, int i, ScootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName scootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName) {
        this.buttonName = scootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName;
    }

    public static ScootersBluetoothModalViewAnalytics$TappedButton valueOf(String str) {
        return (ScootersBluetoothModalViewAnalytics$TappedButton) Enum.valueOf(ScootersBluetoothModalViewAnalytics$TappedButton.class, str);
    }

    public static ScootersBluetoothModalViewAnalytics$TappedButton[] values() {
        return (ScootersBluetoothModalViewAnalytics$TappedButton[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final ScootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName getButtonName() {
        return this.buttonName;
    }
}
