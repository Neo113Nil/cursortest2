package com.squareup.cash.amountslider.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import com.knotapi.knot.utilities.Constants;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.common.Money;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public interface AmountPickerViewModel {

    public final class InitialLoading implements AmountPickerViewModel {
        public static final InitialLoading INSTANCE = new InitialLoading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof InitialLoading);
        }

        public final int hashCode() {
            return 917834340;
        }

        public final String toString() {
            return "InitialLoading";
        }
    }

    public final class Ready implements AmountPickerViewModel {
        public final String amountCaption;
        public final AmountSelectorWidgetModel amountSelections;
        public final boolean buttonEnabled;
        public final String buttonText;
        public final CloseAction closeAction;
        public final String errorLabel;
        public final Amount maxAmount;
        public final Amount minAmount;
        public final String presetAmount;
        public final boolean showHelpButton;
        public final boolean showKeypadDecimalSeparator;
        public final String subtitle;
        public final Color tintOverride;
        public final String title;

        public interface Amount {

            /* loaded from: classes7.dex */
            public final class MoneyAmount implements Amount {
                public final Money money;

                public MoneyAmount(Money money) {
                    money.getClass();
                    this.money = money;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof MoneyAmount) && Intrinsics.areEqual(this.money, ((MoneyAmount) obj).money);
                }

                public final int hashCode() {
                    return this.money.hashCode();
                }

                public final String toString() {
                    return SVG$Unit$EnumUnboxingLocalUtility.m(this.money, "MoneyAmount(money=", ")");
                }
            }

            public final class PercentAmount implements Amount {
                public final BigDecimal percent;

                public PercentAmount(BigDecimal bigDecimal) {
                    this.percent = bigDecimal;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof PercentAmount) && this.percent.equals(((PercentAmount) obj).percent);
                }

                public final int hashCode() {
                    return this.percent.hashCode();
                }

                public final String toString() {
                    return "PercentAmount(percent=" + this.percent + ")";
                }
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class CloseAction {
            public static final /* synthetic */ CloseAction[] $VALUES;
            public static final CloseAction Back;
            public static final CloseAction Close;

            static {
                CloseAction closeAction = new CloseAction(Constants.META_BACK_BUTTON, 0);
                Back = closeAction;
                CloseAction closeAction2 = new CloseAction(Constants.META_CLOSE, 1);
                Close = closeAction2;
                $VALUES = new CloseAction[]{closeAction, closeAction2};
            }

            public static CloseAction valueOf(String str) {
                return (CloseAction) Enum.valueOf(CloseAction.class, str);
            }

            public static CloseAction[] values() {
                return (CloseAction[]) $VALUES.clone();
            }
        }

        public Ready(String str, String str2, String str3, Amount amount, Amount amount2, boolean z, Color color, AmountSelectorWidgetModel amountSelectorWidgetModel, String str4, String str5, boolean z2, boolean z3, String str6, CloseAction closeAction, int i) {
            amount2 = (i & 16) != 0 ? null : amount2;
            boolean z4 = (i & 32) != 0 ? true : z;
            Color color2 = (i & 64) != 0 ? null : color;
            String str7 = (i & 256) != 0 ? null : str4;
            String str8 = (i & 512) != 0 ? null : str5;
            boolean z5 = (i & 1024) == 0 ? z2 : true;
            boolean z6 = (i & 2048) != 0 ? false : z3;
            String str9 = (i & 4096) == 0 ? str6 : null;
            CloseAction closeAction2 = (i & PKIFailureInfo.certRevoked) != 0 ? CloseAction.Close : closeAction;
            str.getClass();
            str3.getClass();
            this.title = str;
            this.subtitle = str2;
            this.buttonText = str3;
            this.minAmount = amount;
            this.maxAmount = amount2;
            this.showKeypadDecimalSeparator = z4;
            this.tintOverride = color2;
            this.amountSelections = amountSelectorWidgetModel;
            this.amountCaption = str7;
            this.presetAmount = str8;
            this.buttonEnabled = z5;
            this.showHelpButton = z6;
            this.errorLabel = str9;
            this.closeAction = closeAction2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Ready)) {
                return false;
            }
            Ready ready = (Ready) obj;
            return Intrinsics.areEqual(this.title, ready.title) && Intrinsics.areEqual(this.subtitle, ready.subtitle) && Intrinsics.areEqual(this.buttonText, ready.buttonText) && Intrinsics.areEqual(this.minAmount, ready.minAmount) && Intrinsics.areEqual(this.maxAmount, ready.maxAmount) && this.showKeypadDecimalSeparator == ready.showKeypadDecimalSeparator && Intrinsics.areEqual(this.tintOverride, ready.tintOverride) && Intrinsics.areEqual(this.amountSelections, ready.amountSelections) && Intrinsics.areEqual(this.amountCaption, ready.amountCaption) && Intrinsics.areEqual(this.presetAmount, ready.presetAmount) && this.buttonEnabled == ready.buttonEnabled && this.showHelpButton == ready.showHelpButton && Intrinsics.areEqual(this.errorLabel, ready.errorLabel) && this.closeAction == ready.closeAction;
        }

        public final int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            String str = this.subtitle;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.buttonText);
            Amount amount = this.minAmount;
            int hashCode2 = (m + (amount == null ? 0 : amount.hashCode())) * 31;
            Amount amount2 = this.maxAmount;
            int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode2 + (amount2 == null ? 0 : amount2.hashCode())) * 31, 31, this.showKeypadDecimalSeparator);
            Color color = this.tintOverride;
            int m3 = Recorder$$ExternalSyntheticOutline2.m((m2 + (color == null ? 0 : color.hashCode())) * 31, 31, this.amountSelections.items);
            String str2 = this.amountCaption;
            int hashCode3 = (m3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.presetAmount;
            int m4 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.buttonEnabled), 31, this.showHelpButton);
            String str4 = this.errorLabel;
            return this.closeAction.hashCode() + ((m4 + (str4 != null ? str4.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Ready(title=", this.title, ", subtitle=", this.subtitle, ", buttonText=");
            m.append(this.buttonText);
            m.append(", minAmount=");
            m.append(this.minAmount);
            m.append(", maxAmount=");
            m.append(this.maxAmount);
            m.append(", showKeypadDecimalSeparator=");
            m.append(this.showKeypadDecimalSeparator);
            m.append(", tintOverride=");
            m.append(this.tintOverride);
            m.append(", amountSelections=");
            m.append(this.amountSelections);
            m.append(", amountCaption=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.amountCaption, ", presetAmount=", this.presetAmount, ", buttonEnabled=");
            re$$ExternalSyntheticOutline0.m(m, this.buttonEnabled, ", showHelpButton=", this.showHelpButton, ", errorLabel=");
            m.append(this.errorLabel);
            m.append(", closeAction=");
            m.append(this.closeAction);
            m.append(")");
            return m.toString();
        }
    }

    /* loaded from: classes4.dex */
    public final class Loading implements AmountPickerViewModel {
        public final AnimationDirection animationDirection;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes5.dex */
        public final class AnimationDirection {
            public static final /* synthetic */ AnimationDirection[] $VALUES;
            public static final AnimationDirection BACKWARD;
            public static final AnimationDirection FORWARD;

            static {
                AnimationDirection animationDirection = new AnimationDirection("FORWARD", 0);
                FORWARD = animationDirection;
                AnimationDirection animationDirection2 = new AnimationDirection("BACKWARD", 1);
                BACKWARD = animationDirection2;
                $VALUES = new AnimationDirection[]{animationDirection, animationDirection2};
            }

            public static AnimationDirection valueOf(String str) {
                return (AnimationDirection) Enum.valueOf(AnimationDirection.class, str);
            }

            public static AnimationDirection[] values() {
                return (AnimationDirection[]) $VALUES.clone();
            }
        }

        public /* synthetic */ Loading() {
            this(AnimationDirection.FORWARD);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loading) && this.animationDirection == ((Loading) obj).animationDirection;
        }

        public final int hashCode() {
            return this.animationDirection.hashCode();
        }

        public final String toString() {
            return "Loading(animationDirection=" + this.animationDirection + ")";
        }

        public Loading(AnimationDirection animationDirection) {
            this.animationDirection = animationDirection;
        }
    }
}
