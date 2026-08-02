package com.squareup.cash.savings.backend.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.arcade.values.ButtonProminence;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.recipients.data.Recipient;
import com.squareup.cash.savings.backend.api.model.SavingsAction;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Icon;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import squareup.cash.analytics.CdfEvent;
import squareup.cash.savings.bespoke_elements.CardImage;
import squareup.cash.ui.arcade.elements.BetweenSection;
import squareup.cash.ui.arcade.elements.WithinSection;

/* loaded from: classes7.dex */
public final class SavingsScreen {
    public final ArrayList elements;
    public final String title;

    /* renamed from: type, reason: collision with root package name */
    public final ScreenType f1196type;
    public final boolean useSingleGoalRules;

    public interface Element {

        public final class ActivitySection implements Element {
            public final String errorSubtitle;
            public final SectionHeader header;
            public final String noActivitySubtitle;

            public ActivitySection(SectionHeader sectionHeader, String str, String str2) {
                this.header = sectionHeader;
                this.noActivitySubtitle = str;
                this.errorSubtitle = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ActivitySection)) {
                    return false;
                }
                ActivitySection activitySection = (ActivitySection) obj;
                return this.header.equals(activitySection.header) && Intrinsics.areEqual(this.noActivitySubtitle, activitySection.noActivitySubtitle) && Intrinsics.areEqual(this.errorSubtitle, activitySection.errorSubtitle);
            }

            public final int hashCode() {
                int hashCode = this.header.hashCode() * 31;
                String str = this.noActivitySubtitle;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.errorSubtitle;
                return hashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ActivitySection(header=");
                sb.append(this.header);
                sb.append(", noActivitySubtitle=");
                sb.append(this.noActivitySubtitle);
                sb.append(", errorSubtitle=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.errorSubtitle, ")");
            }
        }

        public final class BetweenSection implements Element {
            public final BetweenSection.Variant variant;

            public BetweenSection(BetweenSection.Variant variant) {
                variant.getClass();
                this.variant = variant;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof BetweenSection) && this.variant == ((BetweenSection) obj).variant;
            }

            public final int hashCode() {
                return this.variant.hashCode();
            }

            public final String toString() {
                return "BetweenSection(variant=" + this.variant + ")";
            }
        }

        public final class BodyText {
            public final String accessibilityText;
            public final SavingsAction action;
            public final Color color;
            public final Icon icon;
            public final String markdownText;
            public final String text;

            public BodyText(String str, String str2, Icon icon, Color color, SavingsAction savingsAction, String str3) {
                this.text = str;
                this.markdownText = str2;
                this.icon = icon;
                this.color = color;
                this.action = savingsAction;
                this.accessibilityText = str3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof BodyText)) {
                    return false;
                }
                BodyText bodyText = (BodyText) obj;
                return this.text.equals(bodyText.text) && Intrinsics.areEqual(this.markdownText, bodyText.markdownText) && Intrinsics.areEqual(this.icon, bodyText.icon) && Intrinsics.areEqual(this.color, bodyText.color) && Intrinsics.areEqual(this.action, bodyText.action) && Intrinsics.areEqual(this.accessibilityText, bodyText.accessibilityText);
            }

            public final int hashCode() {
                int hashCode = this.text.hashCode() * 31;
                String str = this.markdownText;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                Icon icon = this.icon;
                int hashCode3 = (hashCode2 + (icon == null ? 0 : icon.hashCode())) * 31;
                Color color = this.color;
                int hashCode4 = (hashCode3 + (color == null ? 0 : color.hashCode())) * 31;
                SavingsAction savingsAction = this.action;
                int hashCode5 = (hashCode4 + (savingsAction == null ? 0 : savingsAction.hashCode())) * 31;
                String str2 = this.accessibilityText;
                return hashCode5 + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BodyText(text=", this.text, ", markdownText=", this.markdownText, ", icon=");
                m.append(this.icon);
                m.append(", color=");
                m.append(this.color);
                m.append(", action=");
                m.append(this.action);
                m.append(", accessibilityText=");
                m.append(this.accessibilityText);
                m.append(")");
                return m.toString();
            }
        }

        public final class ButtonGroup implements Element {
            public final ButtonGroupDirection direction;
            public final Button primaryButton;
            public final Button secondaryButton;
            public final Button tertiaryButton;

            public final class Button {
                public final CdfEvent cdfEvent;
                public final String clientRoute;
                public final Icon icon;
                public final ButtonProminence.Id prominence;
                public final String text;

                public Button(String str, Icon icon, ButtonProminence.Id id, String str2, CdfEvent cdfEvent) {
                    id.getClass();
                    this.text = str;
                    this.icon = icon;
                    this.prominence = id;
                    this.clientRoute = str2;
                    this.cdfEvent = cdfEvent;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Button)) {
                        return false;
                    }
                    Button button = (Button) obj;
                    return this.text.equals(button.text) && Intrinsics.areEqual(this.icon, button.icon) && Intrinsics.areEqual(this.prominence, button.prominence) && Intrinsics.areEqual(this.clientRoute, button.clientRoute) && Intrinsics.areEqual(this.cdfEvent, button.cdfEvent);
                }

                public final int hashCode() {
                    int hashCode = this.text.hashCode() * 31;
                    Icon icon = this.icon;
                    int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.prominence.id, (hashCode + (icon == null ? 0 : icon.hashCode())) * 31, 31);
                    String str = this.clientRoute;
                    int hashCode2 = (m + (str == null ? 0 : str.hashCode())) * 31;
                    CdfEvent cdfEvent = this.cdfEvent;
                    return hashCode2 + (cdfEvent != null ? cdfEvent.hashCode() : 0);
                }

                public final String toString() {
                    return "Button(text=" + this.text + ", icon=" + this.icon + ", prominence=" + this.prominence + ", clientRoute=" + this.clientRoute + ", cdfEvent=" + this.cdfEvent + ")";
                }
            }

            public ButtonGroup(Button button, Button button2, Button button3, ButtonGroupDirection buttonGroupDirection) {
                this.primaryButton = button;
                this.secondaryButton = button2;
                this.tertiaryButton = button3;
                this.direction = buttonGroupDirection;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ButtonGroup)) {
                    return false;
                }
                ButtonGroup buttonGroup = (ButtonGroup) obj;
                return this.primaryButton.equals(buttonGroup.primaryButton) && Intrinsics.areEqual(this.secondaryButton, buttonGroup.secondaryButton) && Intrinsics.areEqual(this.tertiaryButton, buttonGroup.tertiaryButton) && this.direction == buttonGroup.direction;
            }

            public final int hashCode() {
                int hashCode = this.primaryButton.hashCode() * 31;
                Button button = this.secondaryButton;
                int hashCode2 = (hashCode + (button == null ? 0 : button.hashCode())) * 31;
                Button button2 = this.tertiaryButton;
                return this.direction.hashCode() + ((hashCode2 + (button2 != null ? button2.hashCode() : 0)) * 31);
            }

            public final String toString() {
                return "ButtonGroup(primaryButton=" + this.primaryButton + ", secondaryButton=" + this.secondaryButton + ", tertiaryButton=" + this.tertiaryButton + ", direction=" + this.direction + ")";
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes10.dex */
        public final class ButtonGroupDirection {
            public static final /* synthetic */ ButtonGroupDirection[] $VALUES;
            public static final ButtonGroupDirection HORIZONTAL;
            public static final ButtonGroupDirection VERTICAL;

            static {
                ButtonGroupDirection buttonGroupDirection = new ButtonGroupDirection("HORIZONTAL", 0);
                HORIZONTAL = buttonGroupDirection;
                ButtonGroupDirection buttonGroupDirection2 = new ButtonGroupDirection("VERTICAL", 1);
                VERTICAL = buttonGroupDirection2;
                $VALUES = new ButtonGroupDirection[]{buttonGroupDirection, buttonGroupDirection2};
            }

            public static ButtonGroupDirection valueOf(String str) {
                return (ButtonGroupDirection) Enum.valueOf(ButtonGroupDirection.class, str);
            }

            public static ButtonGroupDirection[] values() {
                return (ButtonGroupDirection[]) $VALUES.clone();
            }
        }

        public final class CardElement implements Element {
            public final SavingsCard card;

            public CardElement(SavingsCard savingsCard) {
                this.card = savingsCard;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CardElement) && this.card.equals(((CardElement) obj).card);
            }

            public final int hashCode() {
                return this.card.hashCode();
            }

            public final String toString() {
                return "CardElement(card=" + this.card + ")";
            }
        }

        public final class CellDefault implements Element {
            public final Accessory accessory;
            public final SavingsAction action;
            public final String body;
            public final Icon icon;
            public final String label;
            public final TemplateClientRoute templateClientRoute;

            public interface Accessory {

                /* loaded from: classes10.dex */
                public final class Checkbox implements Accessory {
                    public static final Checkbox INSTANCE = new Checkbox();

                    public final boolean equals(Object obj) {
                        return this == obj || (obj instanceof Checkbox);
                    }

                    public final int hashCode() {
                        return 483669667;
                    }

                    public final String toString() {
                        return "Checkbox";
                    }
                }

                public final class CompactButton implements Accessory {
                    public final ButtonProminence.Id prominence;
                    public final String text;

                    public CompactButton(String str, ButtonProminence.Id id) {
                        id.getClass();
                        this.text = str;
                        this.prominence = id;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof CompactButton)) {
                            return false;
                        }
                        CompactButton compactButton = (CompactButton) obj;
                        return this.text.equals(compactButton.text) && Intrinsics.areEqual(this.prominence, compactButton.prominence);
                    }

                    public final int hashCode() {
                        return Integer.hashCode(this.prominence.id) + (this.text.hashCode() * 31);
                    }

                    public final String toString() {
                        return "CompactButton(text=" + this.text + ", prominence=" + this.prominence + ")";
                    }
                }

                public final class Label implements Accessory {
                    public final String text;

                    public Label(String str) {
                        this.text = str;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof Label) && this.text.equals(((Label) obj).text);
                    }

                    public final int hashCode() {
                        return this.text.hashCode();
                    }

                    public final String toString() {
                        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Label(text=", this.text, ")");
                    }
                }

                public final class LabeledPush implements Accessory {
                    public final String text;
                    public final Color textColor;

                    public LabeledPush(Color color, String str) {
                        this.text = str;
                        this.textColor = color;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof LabeledPush)) {
                            return false;
                        }
                        LabeledPush labeledPush = (LabeledPush) obj;
                        return this.text.equals(labeledPush.text) && Intrinsics.areEqual(this.textColor, labeledPush.textColor);
                    }

                    public final int hashCode() {
                        int hashCode = this.text.hashCode() * 31;
                        Color color = this.textColor;
                        return hashCode + (color == null ? 0 : color.hashCode());
                    }

                    public final String toString() {
                        return "LabeledPush(text=" + this.text + ", textColor=" + this.textColor + ")";
                    }
                }

                /* loaded from: classes10.dex */
                public final class Push implements Accessory {
                    public static final Push INSTANCE = new Push();

                    public final boolean equals(Object obj) {
                        return this == obj || (obj instanceof Push);
                    }

                    public final int hashCode() {
                        return 552483322;
                    }

                    public final String toString() {
                        return "Push";
                    }
                }

                /* loaded from: classes10.dex */
                public final class Radio implements Accessory {
                    public static final Radio INSTANCE = new Radio();

                    public final boolean equals(Object obj) {
                        return this == obj || (obj instanceof Radio);
                    }

                    public final int hashCode() {
                        return -51649253;
                    }

                    public final String toString() {
                        return "Radio";
                    }
                }

                /* loaded from: classes10.dex */
                public final class Toggle implements Accessory {
                    public static final Toggle INSTANCE = new Toggle();

                    public final boolean equals(Object obj) {
                        return this == obj || (obj instanceof Toggle);
                    }

                    public final int hashCode() {
                        return -1530851788;
                    }

                    public final String toString() {
                        return "Toggle";
                    }
                }
            }

            public interface Icon {

                public final class DefaultIcon implements Icon {
                    public final com.squareup.protos.cash.ui.Icon icon;

                    public DefaultIcon(com.squareup.protos.cash.ui.Icon icon) {
                        icon.getClass();
                        this.icon = icon;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof DefaultIcon) && Intrinsics.areEqual(this.icon, ((DefaultIcon) obj).icon);
                    }

                    public final int hashCode() {
                        return this.icon.hashCode();
                    }

                    public final String toString() {
                        return "DefaultIcon(icon=" + this.icon + ")";
                    }
                }

                public final class TintedIcon implements Icon {
                    public final Color backgroundTint;
                    public final com.squareup.protos.cash.ui.Icon icon;
                    public final Color tint;

                    public TintedIcon(com.squareup.protos.cash.ui.Icon icon, Color color, Color color2) {
                        this.icon = icon;
                        this.backgroundTint = color;
                        this.tint = color2;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof TintedIcon)) {
                            return false;
                        }
                        TintedIcon tintedIcon = (TintedIcon) obj;
                        return this.icon.equals(tintedIcon.icon) && this.backgroundTint.equals(tintedIcon.backgroundTint) && Intrinsics.areEqual(this.tint, tintedIcon.tint);
                    }

                    public final int hashCode() {
                        int m = SVG$Unit$EnumUnboxingLocalUtility.m(this.backgroundTint, this.icon.hashCode() * 31, 31);
                        Color color = this.tint;
                        return m + (color == null ? 0 : color.hashCode());
                    }

                    public final String toString() {
                        return "TintedIcon(icon=" + this.icon + ", backgroundTint=" + this.backgroundTint + ", tint=" + this.tint + ")";
                    }
                }
            }

            public final class TemplateClientRoute {
                public final CdfEvent cdfEvent;
                public final String clientRouteTemplate;

                public TemplateClientRoute(String str, CdfEvent cdfEvent) {
                    this.clientRouteTemplate = str;
                    this.cdfEvent = cdfEvent;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof TemplateClientRoute)) {
                        return false;
                    }
                    TemplateClientRoute templateClientRoute = (TemplateClientRoute) obj;
                    return this.clientRouteTemplate.equals(templateClientRoute.clientRouteTemplate) && Intrinsics.areEqual(this.cdfEvent, templateClientRoute.cdfEvent);
                }

                public final int hashCode() {
                    int hashCode = this.clientRouteTemplate.hashCode() * 31;
                    CdfEvent cdfEvent = this.cdfEvent;
                    return hashCode + (cdfEvent == null ? 0 : cdfEvent.hashCode());
                }

                public final String toString() {
                    return "TemplateClientRoute(clientRouteTemplate=" + this.clientRouteTemplate + ", cdfEvent=" + this.cdfEvent + ")";
                }
            }

            public CellDefault(String str, String str2, Icon icon, Accessory accessory, SavingsAction.ClientRoute clientRoute, TemplateClientRoute templateClientRoute) {
                this.label = str;
                this.body = str2;
                this.icon = icon;
                this.accessory = accessory;
                this.action = clientRoute;
                this.templateClientRoute = templateClientRoute;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CellDefault)) {
                    return false;
                }
                CellDefault cellDefault = (CellDefault) obj;
                return this.label.equals(cellDefault.label) && Intrinsics.areEqual(this.body, cellDefault.body) && Intrinsics.areEqual(this.icon, cellDefault.icon) && Intrinsics.areEqual(this.accessory, cellDefault.accessory) && Intrinsics.areEqual(this.action, cellDefault.action) && Intrinsics.areEqual(this.templateClientRoute, cellDefault.templateClientRoute);
            }

            public final int hashCode() {
                int hashCode = this.label.hashCode() * 31;
                String str = this.body;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                Icon icon = this.icon;
                int hashCode3 = (hashCode2 + (icon == null ? 0 : icon.hashCode())) * 31;
                Accessory accessory = this.accessory;
                int hashCode4 = (hashCode3 + (accessory == null ? 0 : accessory.hashCode())) * 31;
                SavingsAction savingsAction = this.action;
                int hashCode5 = (hashCode4 + (savingsAction == null ? 0 : savingsAction.hashCode())) * 31;
                TemplateClientRoute templateClientRoute = this.templateClientRoute;
                return hashCode5 + (templateClientRoute != null ? templateClientRoute.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CellDefault(label=", this.label, ", body=", this.body, ", icon=");
                m.append(this.icon);
                m.append(", accessory=");
                m.append(this.accessory);
                m.append(", action=");
                m.append(this.action);
                m.append(", templateClientRoute=");
                m.append(this.templateClientRoute);
                m.append(")");
                return m.toString();
            }
        }

        public final class CompactCard implements Element {
            public final String body;
            public final Button button;
            public final CardImage image;

            public final class Button {
                public final CdfEvent cdfEvent;
                public final String clientRoute;
                public final Icon icon;
                public final ButtonProminence.Id prominence;
                public final String text;

                public Button(String str, Icon icon, ButtonProminence.Id id, String str2, CdfEvent cdfEvent) {
                    id.getClass();
                    this.text = str;
                    this.icon = icon;
                    this.prominence = id;
                    this.clientRoute = str2;
                    this.cdfEvent = cdfEvent;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Button)) {
                        return false;
                    }
                    Button button = (Button) obj;
                    return this.text.equals(button.text) && Intrinsics.areEqual(this.icon, button.icon) && Intrinsics.areEqual(this.prominence, button.prominence) && this.clientRoute.equals(button.clientRoute) && Intrinsics.areEqual(this.cdfEvent, button.cdfEvent);
                }

                public final int hashCode() {
                    int hashCode = this.text.hashCode() * 31;
                    Icon icon = this.icon;
                    int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.prominence.id, (hashCode + (icon == null ? 0 : icon.hashCode())) * 31, 31), 31, this.clientRoute);
                    CdfEvent cdfEvent = this.cdfEvent;
                    return m + (cdfEvent != null ? cdfEvent.hashCode() : 0);
                }

                public final String toString() {
                    return "Button(text=" + this.text + ", icon=" + this.icon + ", prominence=" + this.prominence + ", clientRoute=" + this.clientRoute + ", cdfEvent=" + this.cdfEvent + ")";
                }
            }

            public CompactCard(String str, CardImage cardImage, Button button) {
                this.body = str;
                this.image = cardImage;
                this.button = button;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CompactCard)) {
                    return false;
                }
                CompactCard compactCard = (CompactCard) obj;
                return this.body.equals(compactCard.body) && this.image == compactCard.image && this.button.equals(compactCard.button);
            }

            public final int hashCode() {
                int hashCode = this.body.hashCode() * 31;
                CardImage cardImage = this.image;
                return this.button.hashCode() + ((hashCode + (cardImage == null ? 0 : cardImage.hashCode())) * 31);
            }

            public final String toString() {
                return "CompactCard(body=" + this.body + ", image=" + this.image + ", button=" + this.button + ")";
            }
        }

        public final class Disclosure implements Element {
            public static final Disclosure INSTANCE = new Disclosure();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Disclosure);
            }

            public final int hashCode() {
                return -1089420830;
            }

            public final String toString() {
                return "Disclosure";
            }
        }

        public final class FolderList implements Element {
            public final String generalSavingsBody;
            public final String generalSavingsClientRoute;
            public final String generalSavingsLabel;
            public final String goalFolderBodyTemplate;
            public final String goalFolderClientRouteTemplate;
            public final String goalFolderCompletedBody;
            public final CdfEvent tapCdfEvent;

            public FolderList(String str, String str2, String str3, String str4, String str5, String str6, CdfEvent cdfEvent) {
                this.generalSavingsLabel = str;
                this.generalSavingsBody = str2;
                this.generalSavingsClientRoute = str3;
                this.goalFolderBodyTemplate = str4;
                this.goalFolderCompletedBody = str5;
                this.goalFolderClientRouteTemplate = str6;
                this.tapCdfEvent = cdfEvent;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof FolderList)) {
                    return false;
                }
                FolderList folderList = (FolderList) obj;
                return Intrinsics.areEqual(this.generalSavingsLabel, folderList.generalSavingsLabel) && Intrinsics.areEqual(this.generalSavingsBody, folderList.generalSavingsBody) && this.generalSavingsClientRoute.equals(folderList.generalSavingsClientRoute) && this.goalFolderBodyTemplate.equals(folderList.goalFolderBodyTemplate) && this.goalFolderCompletedBody.equals(folderList.goalFolderCompletedBody) && this.goalFolderClientRouteTemplate.equals(folderList.goalFolderClientRouteTemplate) && Intrinsics.areEqual(this.tapCdfEvent, folderList.tapCdfEvent);
            }

            public final int hashCode() {
                String str = this.generalSavingsLabel;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.generalSavingsBody;
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.generalSavingsClientRoute), 31, this.goalFolderBodyTemplate), 31, this.goalFolderCompletedBody), 31, this.goalFolderClientRouteTemplate);
                CdfEvent cdfEvent = this.tapCdfEvent;
                return m + (cdfEvent != null ? cdfEvent.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("FolderList(generalSavingsLabel=", this.generalSavingsLabel, ", generalSavingsBody=", this.generalSavingsBody, ", generalSavingsClientRoute=");
                Boxes$$ExternalSyntheticOutline1.m(m, this.generalSavingsClientRoute, ", goalFolderBodyTemplate=", this.goalFolderBodyTemplate, ", goalFolderCompletedBody=");
                Boxes$$ExternalSyntheticOutline1.m(m, this.goalFolderCompletedBody, ", goalFolderClientRouteTemplate=", this.goalFolderClientRouteTemplate, ", tapCdfEvent=");
                m.append(this.tapCdfEvent);
                m.append(")");
                return m.toString();
            }
        }

        public final class GoalHeader implements Element {
            public final BodyText goalFolderBalanceBody;
            public final String goalMetText;
            public final BetweenSection pageHeaderBottomSpacing;
            public final String remainingGoalAmountSubtitle;
            public final String removeGoalButtonText;
            public final String removeGoalClientRouteTemplate;
            public final boolean showPageHeader;

            public GoalHeader(boolean z, BetweenSection betweenSection, BodyText bodyText, String str, String str2, String str3, String str4) {
                this.showPageHeader = z;
                this.pageHeaderBottomSpacing = betweenSection;
                this.goalFolderBalanceBody = bodyText;
                this.remainingGoalAmountSubtitle = str;
                this.removeGoalButtonText = str2;
                this.goalMetText = str3;
                this.removeGoalClientRouteTemplate = str4;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof GoalHeader)) {
                    return false;
                }
                GoalHeader goalHeader = (GoalHeader) obj;
                return this.showPageHeader == goalHeader.showPageHeader && Intrinsics.areEqual(this.pageHeaderBottomSpacing, goalHeader.pageHeaderBottomSpacing) && Intrinsics.areEqual(this.goalFolderBalanceBody, goalHeader.goalFolderBalanceBody) && this.remainingGoalAmountSubtitle.equals(goalHeader.remainingGoalAmountSubtitle) && this.removeGoalButtonText.equals(goalHeader.removeGoalButtonText) && this.goalMetText.equals(goalHeader.goalMetText) && Intrinsics.areEqual(this.removeGoalClientRouteTemplate, goalHeader.removeGoalClientRouteTemplate);
            }

            public final int hashCode() {
                int hashCode = Boolean.hashCode(this.showPageHeader) * 31;
                BetweenSection betweenSection = this.pageHeaderBottomSpacing;
                int hashCode2 = (hashCode + (betweenSection == null ? 0 : betweenSection.variant.hashCode())) * 31;
                BodyText bodyText = this.goalFolderBalanceBody;
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode2 + (bodyText == null ? 0 : bodyText.hashCode())) * 31, 31, this.remainingGoalAmountSubtitle), 31, this.removeGoalButtonText), 31, this.goalMetText);
                String str = this.removeGoalClientRouteTemplate;
                return m + (str != null ? str.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("GoalHeader(showPageHeader=");
                sb.append(this.showPageHeader);
                sb.append(", pageHeaderBottomSpacing=");
                sb.append(this.pageHeaderBottomSpacing);
                sb.append(", goalFolderBalanceBody=");
                sb.append(this.goalFolderBalanceBody);
                sb.append(", remainingGoalAmountSubtitle=");
                sb.append(this.remainingGoalAmountSubtitle);
                sb.append(", removeGoalButtonText=");
                Boxes$$ExternalSyntheticOutline1.m(sb, this.removeGoalButtonText, ", goalMetText=", this.goalMetText, ", removeGoalClientRouteTemplate=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.removeGoalClientRouteTemplate, ")");
            }
        }

        public final class NoGoalHeader implements Element {
            public final String additionalBody;
            public final BodyText body;
            public final String sectionTitleText;

            public NoGoalHeader(String str, BodyText bodyText, String str2) {
                this.sectionTitleText = str;
                this.body = bodyText;
                this.additionalBody = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof NoGoalHeader)) {
                    return false;
                }
                NoGoalHeader noGoalHeader = (NoGoalHeader) obj;
                return Intrinsics.areEqual(this.sectionTitleText, noGoalHeader.sectionTitleText) && Intrinsics.areEqual(this.body, noGoalHeader.body) && Intrinsics.areEqual(this.additionalBody, noGoalHeader.additionalBody);
            }

            public final int hashCode() {
                String str = this.sectionTitleText;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                BodyText bodyText = this.body;
                int hashCode2 = (hashCode + (bodyText == null ? 0 : bodyText.hashCode())) * 31;
                String str2 = this.additionalBody;
                return hashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("NoGoalHeader(sectionTitleText=");
                sb.append(this.sectionTitleText);
                sb.append(", body=");
                sb.append(this.body);
                sb.append(", additionalBody=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.additionalBody, ")");
            }
        }

        public final class SectionHeader implements Element {
            public final String ctaText;
            public final String title;

            public SectionHeader(String str, String str2) {
                this.title = str;
                this.ctaText = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SectionHeader)) {
                    return false;
                }
                SectionHeader sectionHeader = (SectionHeader) obj;
                return this.title.equals(sectionHeader.title) && Intrinsics.areEqual(this.ctaText, sectionHeader.ctaText);
            }

            public final int hashCode() {
                int hashCode = this.title.hashCode() * 31;
                String str = this.ctaText;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                return Boxes$$ExternalSyntheticOutline1.m("SectionHeader(title=", this.title, ", ctaText=", this.ctaText, ")");
            }
        }

        public final class TransferButtons implements Element {
            public final ButtonGroupDirection direction;
            public final TransferButton transferInButton;
            public final TransferButton transferOutButton;

            public final class TransferButton {
                public final TransferConfig config;
                public final ButtonProminence.Id prominence;
                public final String text;

                public TransferButton(String str, ButtonProminence.Id id, TransferConfig transferConfig) {
                    id.getClass();
                    this.text = str;
                    this.prominence = id;
                    this.config = transferConfig;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof TransferButton)) {
                        return false;
                    }
                    TransferButton transferButton = (TransferButton) obj;
                    return this.text.equals(transferButton.text) && Intrinsics.areEqual(this.prominence, transferButton.prominence) && this.config.equals(transferButton.config);
                }

                public final int hashCode() {
                    return this.config.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.prominence.id, this.text.hashCode() * 31, 31);
                }

                public final String toString() {
                    return "TransferButton(text=" + this.text + ", prominence=" + this.prominence + ", config=" + this.config + ")";
                }
            }

            public TransferButtons(TransferButton transferButton, TransferButton transferButton2, ButtonGroupDirection buttonGroupDirection) {
                this.transferInButton = transferButton;
                this.transferOutButton = transferButton2;
                this.direction = buttonGroupDirection;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TransferButtons)) {
                    return false;
                }
                TransferButtons transferButtons = (TransferButtons) obj;
                return this.transferInButton.equals(transferButtons.transferInButton) && this.transferOutButton.equals(transferButtons.transferOutButton) && this.direction == transferButtons.direction;
            }

            public final int hashCode() {
                return this.direction.hashCode() + ((this.transferOutButton.hashCode() + (this.transferInButton.hashCode() * 31)) * 31);
            }

            public final String toString() {
                return "TransferButtons(transferInButton=" + this.transferInButton + ", transferOutButton=" + this.transferOutButton + ", direction=" + this.direction + ")";
            }
        }

        public final class WithinSection implements Element {
            public final WithinSection.Variant variant;

            public WithinSection(WithinSection.Variant variant) {
                variant.getClass();
                this.variant = variant;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof WithinSection) && this.variant == ((WithinSection) obj).variant;
            }

            public final int hashCode() {
                return this.variant.hashCode();
            }

            public final String toString() {
                return "WithinSection(variant=" + this.variant + ")";
            }
        }
    }

    public interface ScreenType extends Parcelable {

        /* loaded from: classes6.dex */
        public final class GeneralSavings implements ScreenType {
            public static final GeneralSavings INSTANCE = new GeneralSavings();
            public static final Parcelable.Creator<GeneralSavings> CREATOR = new Recipient.Creator(21);

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof GeneralSavings);
            }

            public final int hashCode() {
                return 608458998;
            }

            public final String toString() {
                return "GeneralSavings";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeInt(1);
            }
        }

        public final class GoalDetail implements ScreenType {
            public static final Parcelable.Creator<GoalDetail> CREATOR = new Recipient.Creator(22);
            public final String token;

            public GoalDetail(String str) {
                str.getClass();
                this.token = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof GoalDetail) && Intrinsics.areEqual(this.token, ((GoalDetail) obj).token);
            }

            public final int hashCode() {
                return this.token.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("GoalDetail(token=", this.token, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.token);
            }
        }

        /* loaded from: classes6.dex */
        public final class Home implements ScreenType {
            public static final Home INSTANCE = new Home();
            public static final Parcelable.Creator<Home> CREATOR = new Recipient.Creator(23);

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Home);
            }

            public final int hashCode() {
                return 1518553444;
            }

            public final String toString() {
                return "Home";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeInt(1);
            }
        }
    }

    public SavingsScreen(String str, ArrayList arrayList, ScreenType screenType, boolean z) {
        screenType.getClass();
        this.title = str;
        this.elements = arrayList;
        this.f1196type = screenType;
        this.useSingleGoalRules = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SavingsScreen)) {
            return false;
        }
        SavingsScreen savingsScreen = (SavingsScreen) obj;
        return Intrinsics.areEqual(this.title, savingsScreen.title) && this.elements.equals(savingsScreen.elements) && Intrinsics.areEqual(this.f1196type, savingsScreen.f1196type) && this.useSingleGoalRules == savingsScreen.useSingleGoalRules;
    }

    public final int hashCode() {
        String str = this.title;
        return Boolean.hashCode(this.useSingleGoalRules) + ((this.f1196type.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.elements, (str == null ? 0 : str.hashCode()) * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder m = CameraState$Type$EnumUnboxingLocalUtility.m(this.elements, "SavingsScreen(title=", this.title, ", elements=", ", type=");
        m.append(this.f1196type);
        m.append(", useSingleGoalRules=");
        m.append(this.useSingleGoalRules);
        m.append(")");
        return m.toString();
    }

    /* loaded from: classes4.dex */
    public final class ElementList implements List, KMappedMarker {
        public final List elements;

        public ElementList(List list) {
            list.getClass();
            this.elements = list;
        }

        @Override // java.util.List
        public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final boolean addAll(int i, Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final /* bridge */ /* synthetic */ void addLast(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            if (!(obj instanceof Element)) {
                return false;
            }
            return this.elements.contains((Element) obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(Collection collection) {
            collection.getClass();
            return this.elements.containsAll(collection);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ElementList) && Intrinsics.areEqual(this.elements, ((ElementList) obj).elements);
        }

        @Override // java.util.List
        public final Object get(int i) {
            return (Element) this.elements.get(i);
        }

        @Override // java.util.List, java.util.Collection
        public final int hashCode() {
            return this.elements.hashCode();
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            if (!(obj instanceof Element)) {
                return -1;
            }
            return this.elements.indexOf((Element) obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return this.elements.isEmpty();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return this.elements.iterator();
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            if (!(obj instanceof Element)) {
                return -1;
            }
            return this.elements.lastIndexOf((Element) obj);
        }

        @Override // java.util.List
        public final ListIterator listIterator() {
            return this.elements.listIterator();
        }

        @Override // java.util.List
        public final /* bridge */ /* synthetic */ Object remove(int i) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final /* bridge */ /* synthetic */ Object removeFirst() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final /* bridge */ /* synthetic */ Object removeLast() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final void replaceAll(UnaryOperator unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.elements.size();
        }

        @Override // java.util.List
        public final void sort(Comparator comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final List subList(int i, int i2) {
            return this.elements.subList(i, i2);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray(Object[] objArr) {
            objArr.getClass();
            return ArrayIteratorKt.toArray(this, objArr);
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("ElementList(elements=", ")", this.elements);
        }

        @Override // java.util.List
        public final ListIterator listIterator(int i) {
            return this.elements.listIterator(i);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ /* synthetic */ boolean add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return ArrayIteratorKt.toArray(this);
        }
    }
}
