package com.squareup.cash.money.viewmodels;

import com.squareup.cash.common.viewmodels.CashTagSymbol;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class HypeWelcomeModel {
    public final String customNotifyButtonText;
    public final String dateLabel;
    public final NotifyButtonState notifyButtonState;
    public final boolean showToast;
    public final CashTagSymbol symbol;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class NotifyButtonState {
        public static final /* synthetic */ NotifyButtonState[] $VALUES;
        public static final NotifyButtonState Disabled;
        public static final NotifyButtonState Enabled;
        public static final NotifyButtonState Hidden;

        static {
            NotifyButtonState notifyButtonState = new NotifyButtonState("Enabled", 0);
            Enabled = notifyButtonState;
            NotifyButtonState notifyButtonState2 = new NotifyButtonState("Disabled", 1);
            Disabled = notifyButtonState2;
            NotifyButtonState notifyButtonState3 = new NotifyButtonState("Hidden", 2);
            Hidden = notifyButtonState3;
            $VALUES = new NotifyButtonState[]{notifyButtonState, notifyButtonState2, notifyButtonState3};
        }

        public static NotifyButtonState valueOf(String str) {
            return (NotifyButtonState) Enum.valueOf(NotifyButtonState.class, str);
        }

        public static NotifyButtonState[] values() {
            return (NotifyButtonState[]) $VALUES.clone();
        }
    }

    public HypeWelcomeModel(String str, CashTagSymbol cashTagSymbol, boolean z, NotifyButtonState notifyButtonState, String str2) {
        str.getClass();
        cashTagSymbol.getClass();
        this.dateLabel = str;
        this.symbol = cashTagSymbol;
        this.showToast = z;
        this.notifyButtonState = notifyButtonState;
        this.customNotifyButtonText = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HypeWelcomeModel)) {
            return false;
        }
        HypeWelcomeModel hypeWelcomeModel = (HypeWelcomeModel) obj;
        return Intrinsics.areEqual(this.dateLabel, hypeWelcomeModel.dateLabel) && this.symbol == hypeWelcomeModel.symbol && this.showToast == hypeWelcomeModel.showToast && this.notifyButtonState == hypeWelcomeModel.notifyButtonState && Intrinsics.areEqual(this.customNotifyButtonText, hypeWelcomeModel.customNotifyButtonText);
    }

    public final int hashCode() {
        int hashCode = (this.notifyButtonState.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.symbol.hashCode() + (this.dateLabel.hashCode() * 31)) * 31, 31, this.showToast)) * 31;
        String str = this.customNotifyButtonText;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HypeWelcomeModel(dateLabel=");
        sb.append(this.dateLabel);
        sb.append(", symbol=");
        sb.append(this.symbol);
        sb.append(", showToast=");
        sb.append(this.showToast);
        sb.append(", notifyButtonState=");
        sb.append(this.notifyButtonState);
        sb.append(", customNotifyButtonText=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.customNotifyButtonText, ")");
    }
}
