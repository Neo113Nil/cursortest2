package com.squareup.cash.investing.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.protos.common.Money;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class TransferStockViewModel {

    public abstract class Content extends TransferStockViewModel {

        public final class BottomSheetContent extends Content {
            public final List amountSelections;
            public final String keypadRawAmount;
            public final Money maxAmount;
            public final boolean orderTypeButtonVisible;
            public final String restoreKeypadAmount;
            public final boolean submitButtonEnabled;
            public final String submitLabel;
            public final Subtitle subtitle;
            public final String title;

            public BottomSheetContent(String str, Subtitle subtitle, boolean z, List list, String str2, Money money, String str3, boolean z2, String str4) {
                list.getClass();
                str2.getClass();
                str3.getClass();
                this.title = str;
                this.subtitle = subtitle;
                this.orderTypeButtonVisible = z;
                this.amountSelections = list;
                this.keypadRawAmount = str2;
                this.maxAmount = money;
                this.submitLabel = str3;
                this.submitButtonEnabled = z2;
                this.restoreKeypadAmount = str4;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof BottomSheetContent)) {
                    return false;
                }
                BottomSheetContent bottomSheetContent = (BottomSheetContent) obj;
                return this.title.equals(bottomSheetContent.title) && this.subtitle.equals(bottomSheetContent.subtitle) && this.orderTypeButtonVisible == bottomSheetContent.orderTypeButtonVisible && Intrinsics.areEqual(this.amountSelections, bottomSheetContent.amountSelections) && Intrinsics.areEqual(this.keypadRawAmount, bottomSheetContent.keypadRawAmount) && this.maxAmount.equals(bottomSheetContent.maxAmount) && Intrinsics.areEqual(this.submitLabel, bottomSheetContent.submitLabel) && this.submitButtonEnabled == bottomSheetContent.submitButtonEnabled && Intrinsics.areEqual(this.restoreKeypadAmount, bottomSheetContent.restoreKeypadAmount);
            }

            public final int hashCode() {
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(NavAction$$ExternalSyntheticOutline0.m(this.maxAmount, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.subtitle.hashCode() + (this.title.hashCode() * 31)) * 31, 31, this.orderTypeButtonVisible), 31, this.amountSelections), 31, this.keypadRawAmount), 31), 31, this.submitLabel), 31, this.submitButtonEnabled);
                String str = this.restoreKeypadAmount;
                return m + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("BottomSheetContent(title=");
                sb.append(this.title);
                sb.append(", subtitle=");
                sb.append(this.subtitle);
                sb.append(", orderTypeButtonVisible=");
                sb.append(this.orderTypeButtonVisible);
                sb.append(", amountSelections=");
                sb.append(this.amountSelections);
                sb.append(", keypadRawAmount=");
                sb.append(this.keypadRawAmount);
                sb.append(", maxAmount=");
                sb.append(this.maxAmount);
                sb.append(", submitLabel=");
                NavAction$$ExternalSyntheticOutline0.m(sb, this.submitLabel, ", submitButtonEnabled=", this.submitButtonEnabled, ", restoreKeypadAmount=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.restoreKeypadAmount, ")");
            }
        }

        public final class FullScreenContent extends Content {
            public final DialogContent dialogContent;
            public final String keypadRawAmount;
            public final Money maxAmount;
            public final boolean orderTypeButtonVisible;
            public final String restoreKeypadAmount;
            public final boolean submitButtonEnabled;
            public final String submitLabel;
            public final Subtitle subtitle;
            public final String title;

            public final class DialogContent {
                public final ColorModel accentColor;
                public final String content;

                /* renamed from: type, reason: collision with root package name */
                public final Type f1163type;

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                public final class Type {
                    public static final /* synthetic */ Type[] $VALUES;
                    public static final Type AGREE_OR_CANCEL;
                    public static final Type OK;

                    static {
                        Type type2 = new Type("AGREE_OR_CANCEL", 0);
                        AGREE_OR_CANCEL = type2;
                        Type type3 = new Type("OK", 1);
                        OK = type3;
                        $VALUES = new Type[]{type2, type3};
                    }

                    public static Type valueOf(String str) {
                        return (Type) Enum.valueOf(Type.class, str);
                    }

                    public static Type[] values() {
                        return (Type[]) $VALUES.clone();
                    }
                }

                public DialogContent(String str, ColorModel colorModel, Type type2) {
                    str.getClass();
                    colorModel.getClass();
                    this.content = str;
                    this.accentColor = colorModel;
                    this.f1163type = type2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof DialogContent)) {
                        return false;
                    }
                    DialogContent dialogContent = (DialogContent) obj;
                    return Intrinsics.areEqual(this.content, dialogContent.content) && Intrinsics.areEqual(this.accentColor, dialogContent.accentColor) && this.f1163type == dialogContent.f1163type;
                }

                public final int hashCode() {
                    return this.f1163type.hashCode() + ((this.accentColor.hashCode() + (this.content.hashCode() * 31)) * 31);
                }

                public final String toString() {
                    return "DialogContent(content=" + this.content + ", accentColor=" + this.accentColor + ", type=" + this.f1163type + ")";
                }
            }

            public FullScreenContent(String str, Subtitle subtitle, boolean z, String str2, Money money, String str3, boolean z2, String str4, DialogContent dialogContent) {
                str2.getClass();
                str3.getClass();
                this.title = str;
                this.subtitle = subtitle;
                this.orderTypeButtonVisible = z;
                this.keypadRawAmount = str2;
                this.maxAmount = money;
                this.submitLabel = str3;
                this.submitButtonEnabled = z2;
                this.restoreKeypadAmount = str4;
                this.dialogContent = dialogContent;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof FullScreenContent)) {
                    return false;
                }
                FullScreenContent fullScreenContent = (FullScreenContent) obj;
                return this.title.equals(fullScreenContent.title) && this.subtitle.equals(fullScreenContent.subtitle) && this.orderTypeButtonVisible == fullScreenContent.orderTypeButtonVisible && Intrinsics.areEqual(this.keypadRawAmount, fullScreenContent.keypadRawAmount) && this.maxAmount.equals(fullScreenContent.maxAmount) && Intrinsics.areEqual(this.submitLabel, fullScreenContent.submitLabel) && this.submitButtonEnabled == fullScreenContent.submitButtonEnabled && Intrinsics.areEqual(this.restoreKeypadAmount, fullScreenContent.restoreKeypadAmount) && Intrinsics.areEqual(this.dialogContent, fullScreenContent.dialogContent);
            }

            public final int hashCode() {
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(NavAction$$ExternalSyntheticOutline0.m(this.maxAmount, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.subtitle.hashCode() + (this.title.hashCode() * 31)) * 31, 31, this.orderTypeButtonVisible), 31, this.keypadRawAmount), 31), 31, this.submitLabel), 31, this.submitButtonEnabled);
                String str = this.restoreKeypadAmount;
                int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
                DialogContent dialogContent = this.dialogContent;
                return hashCode + (dialogContent != null ? dialogContent.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("FullScreenContent(title=");
                sb.append(this.title);
                sb.append(", subtitle=");
                sb.append(this.subtitle);
                sb.append(", orderTypeButtonVisible=");
                NavAction$$ExternalSyntheticOutline0.m(sb, this.orderTypeButtonVisible, ", keypadRawAmount=", this.keypadRawAmount, ", maxAmount=");
                sb.append(this.maxAmount);
                sb.append(", submitLabel=");
                sb.append(this.submitLabel);
                sb.append(", submitButtonEnabled=");
                NavAction$$ExternalSyntheticOutline0.m(sb, this.submitButtonEnabled, ", restoreKeypadAmount=", this.restoreKeypadAmount, ", dialogContent=");
                sb.append(this.dialogContent);
                sb.append(")");
                return sb.toString();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class Icon {
            public static final /* synthetic */ Icon[] $VALUES;
            public static final Icon RECURRING;

            static {
                Icon icon = new Icon("RECURRING", 0);
                RECURRING = icon;
                $VALUES = new Icon[]{icon};
            }

            public static Icon valueOf(String str) {
                return (Icon) Enum.valueOf(Icon.class, str);
            }

            public static Icon[] values() {
                return (Icon[]) $VALUES.clone();
            }
        }

        public final class Subtitle {
            public final Icon icon;
            public final String informationText;
            public final String label;

            public Subtitle(String str, Icon icon, String str2, int i) {
                icon = (i & 2) != 0 ? null : icon;
                str2 = (i & 4) != 0 ? null : str2;
                str.getClass();
                this.label = str;
                this.icon = icon;
                this.informationText = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Subtitle)) {
                    return false;
                }
                Subtitle subtitle = (Subtitle) obj;
                return Intrinsics.areEqual(this.label, subtitle.label) && this.icon == subtitle.icon && Intrinsics.areEqual(this.informationText, subtitle.informationText);
            }

            public final int hashCode() {
                int hashCode = this.label.hashCode() * 31;
                Icon icon = this.icon;
                int hashCode2 = (hashCode + (icon == null ? 0 : icon.hashCode())) * 31;
                String str = this.informationText;
                return hashCode2 + (str != null ? str.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Subtitle(label=");
                sb.append(this.label);
                sb.append(", icon=");
                sb.append(this.icon);
                sb.append(", informationText=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.informationText, ")");
            }
        }
    }

    public final class DefaultEmptyModel extends TransferStockViewModel {
        public static final DefaultEmptyModel INSTANCE = new DefaultEmptyModel();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DefaultEmptyModel);
        }

        public final int hashCode() {
            return 721896212;
        }

        public final String toString() {
            return "DefaultEmptyModel";
        }
    }

    public final class Loading extends TransferStockViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 217293331;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
