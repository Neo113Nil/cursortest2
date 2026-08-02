package com.squareup.cash.savings.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.arcade.values.ButtonProminence;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.savings.viewmodels.SavingsScreenViewEvent;
import com.squareup.cash.savings.viewmodels.UpsellCardEvent;
import com.squareup.protos.cash.ui.Icon;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import squareup.cash.savings.bespoke_elements.CardImage;
import squareup.cash.ui.arcade.elements.BetweenSection;
import squareup.cash.ui.arcade.elements.WithinSection;

/* loaded from: classes7.dex */
public interface SavingsScreenViewModel {

    public final class Content implements SavingsScreenViewModel {
        public final CelebrationViewModel celebration;
        public final ArrayList elements;
        public final String title;

        public final class CellDefaultElement implements SavingsScreenElement {
            public final CellDefaultViewModel cell;

            public CellDefaultElement(CellDefaultViewModel cellDefaultViewModel) {
                this.cell = cellDefaultViewModel;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CellDefaultElement) && this.cell.equals(((CellDefaultElement) obj).cell);
            }

            public final int hashCode() {
                return this.cell.hashCode();
            }

            public final String toString() {
                return "CellDefaultElement(cell=" + this.cell + ")";
            }
        }

        public interface SavingsScreenElement {

            public final class ActivitySection implements SavingsScreenElement {
                public final UiCallbackModel activitySectionViewModel;
                public final String title;

                public ActivitySection(UiCallbackModel uiCallbackModel, String str) {
                    this.title = str;
                    this.activitySectionViewModel = uiCallbackModel;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof ActivitySection)) {
                        return false;
                    }
                    ActivitySection activitySection = (ActivitySection) obj;
                    if (!this.title.equals(activitySection.title) || !this.activitySectionViewModel.equals(activitySection.activitySectionViewModel)) {
                        return false;
                    }
                    SavingsScreenViewEvent.SeeAllActivitiesEvent seeAllActivitiesEvent = SavingsScreenViewEvent.SeeAllActivitiesEvent.INSTANCE;
                    return seeAllActivitiesEvent.equals(seeAllActivitiesEvent);
                }

                public final int hashCode() {
                    return ((this.activitySectionViewModel.hashCode() + (this.title.hashCode() * 31)) * 31) + 1060980313;
                }

                public final String toString() {
                    return "ActivitySection(title=" + this.title + ", activitySectionViewModel=" + this.activitySectionViewModel + ", action=" + SavingsScreenViewEvent.SeeAllActivitiesEvent.INSTANCE + ")";
                }
            }

            public final class BetweenSection implements SavingsScreenElement {
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

            public final class ButtonGroup implements SavingsScreenElement {
                public final ButtonGroupDirection direction;
                public final Button primaryButton;
                public final Button secondaryButton;
                public final Button tertiaryButton;

                public final class Button {
                    public final SavingsScreenViewEvent action;
                    public final Icon icon;
                    public final ButtonProminence.Id prominence;
                    public final String text;

                    public Button(String str, Icon icon, ButtonProminence.Id id, SavingsScreenViewEvent.Clicked clicked) {
                        id.getClass();
                        this.text = str;
                        this.icon = icon;
                        this.prominence = id;
                        this.action = clicked;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Button)) {
                            return false;
                        }
                        Button button = (Button) obj;
                        return this.text.equals(button.text) && Intrinsics.areEqual(this.icon, button.icon) && Intrinsics.areEqual(this.prominence, button.prominence) && Intrinsics.areEqual(this.action, button.action);
                    }

                    public final int hashCode() {
                        int hashCode = this.text.hashCode() * 31;
                        Icon icon = this.icon;
                        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.prominence.id, (hashCode + (icon == null ? 0 : icon.hashCode())) * 31, 31);
                        SavingsScreenViewEvent savingsScreenViewEvent = this.action;
                        return m + (savingsScreenViewEvent != null ? savingsScreenViewEvent.hashCode() : 0);
                    }

                    public final String toString() {
                        return "Button(text=" + this.text + ", icon=" + this.icon + ", prominence=" + this.prominence + ", action=" + this.action + ")";
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

            public final class Card implements SavingsScreenElement {
                public final UpsellCardModel$Loaded upsellCardModel;

                public Card(UpsellCardModel$Loaded upsellCardModel$Loaded) {
                    this.upsellCardModel = upsellCardModel$Loaded;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Card) && this.upsellCardModel.equals(((Card) obj).upsellCardModel);
                }

                public final int hashCode() {
                    return this.upsellCardModel.hashCode();
                }

                public final String toString() {
                    return "Card(upsellCardModel=" + this.upsellCardModel + ")";
                }
            }

            public final class CompactCard implements SavingsScreenElement {
                public final String body;
                public final Button button;
                public final CardImage image;

                public final class Button {
                    public final UpsellCardEvent.RouterClicked action;
                    public final Icon icon;
                    public final ButtonProminence.Id prominence;
                    public final String text;

                    public Button(String str, Icon icon, ButtonProminence.Id id, UpsellCardEvent.RouterClicked routerClicked) {
                        id.getClass();
                        this.text = str;
                        this.icon = icon;
                        this.prominence = id;
                        this.action = routerClicked;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Button)) {
                            return false;
                        }
                        Button button = (Button) obj;
                        return this.text.equals(button.text) && Intrinsics.areEqual(this.icon, button.icon) && Intrinsics.areEqual(this.prominence, button.prominence) && this.action.equals(button.action);
                    }

                    public final int hashCode() {
                        int hashCode = this.text.hashCode() * 31;
                        Icon icon = this.icon;
                        return this.action.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.prominence.id, (hashCode + (icon == null ? 0 : icon.hashCode())) * 31, 31);
                    }

                    public final String toString() {
                        return "Button(text=" + this.text + ", icon=" + this.icon + ", prominence=" + this.prominence + ", action=" + this.action + ")";
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

            public final class Disclosure implements SavingsScreenElement {
                public final boolean showIcon;
                public final String text;

                public Disclosure(boolean z, String str) {
                    this.showIcon = z;
                    this.text = str;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Disclosure)) {
                        return false;
                    }
                    Disclosure disclosure = (Disclosure) obj;
                    return this.showIcon == disclosure.showIcon && this.text.equals(disclosure.text);
                }

                public final int hashCode() {
                    return this.text.hashCode() + (Boolean.hashCode(this.showIcon) * 31);
                }

                public final String toString() {
                    return "Disclosure(showIcon=" + this.showIcon + ", text=" + this.text + ")";
                }
            }

            public final class GoalFolderList implements SavingsScreenElement {
                public final ArrayList folders;

                public final class Folder {
                    public final SavingsScreenViewEvent.Clicked action;
                    public final String amount;
                    public final FolderIcon icon;
                    public final String subtitle;
                    public final String title;

                    public interface FolderIcon {

                        public final class Default implements FolderIcon {
                            public final boolean equals(Object obj) {
                                return this == obj || (obj instanceof Default);
                            }

                            @Override // com.squareup.cash.savings.viewmodels.SavingsScreenViewModel.Content.SavingsScreenElement.GoalFolderList.Folder.FolderIcon
                            public final String getIconId() {
                                return "extra_cash";
                            }

                            public final int hashCode() {
                                return 747350530;
                            }

                            public final String toString() {
                                return "Default(iconId=extra_cash)";
                            }
                        }

                        public final class ProgressIcon implements FolderIcon {
                            public final String iconId;
                            public final float progress;

                            public ProgressIcon(String str, float f) {
                                this.iconId = str;
                                this.progress = f;
                            }

                            public final boolean equals(Object obj) {
                                if (this == obj) {
                                    return true;
                                }
                                if (!(obj instanceof ProgressIcon)) {
                                    return false;
                                }
                                ProgressIcon progressIcon = (ProgressIcon) obj;
                                return this.iconId.equals(progressIcon.iconId) && Float.compare(this.progress, progressIcon.progress) == 0;
                            }

                            @Override // com.squareup.cash.savings.viewmodels.SavingsScreenViewModel.Content.SavingsScreenElement.GoalFolderList.Folder.FolderIcon
                            public final String getIconId() {
                                return this.iconId;
                            }

                            public final int hashCode() {
                                return Float.hashCode(this.progress) + (this.iconId.hashCode() * 31);
                            }

                            public final String toString() {
                                return "ProgressIcon(iconId=" + this.iconId + ", progress=" + this.progress + ")";
                            }
                        }

                        String getIconId();
                    }

                    public Folder(FolderIcon folderIcon, String str, String str2, String str3, SavingsScreenViewEvent.Clicked clicked) {
                        str.getClass();
                        str3.getClass();
                        this.icon = folderIcon;
                        this.title = str;
                        this.subtitle = str2;
                        this.amount = str3;
                        this.action = clicked;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Folder)) {
                            return false;
                        }
                        Folder folder = (Folder) obj;
                        return this.icon.equals(folder.icon) && Intrinsics.areEqual(this.title, folder.title) && Intrinsics.areEqual(this.subtitle, folder.subtitle) && Intrinsics.areEqual(this.amount, folder.amount) && this.action.equals(folder.action);
                    }

                    public final int hashCode() {
                        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.icon.hashCode() * 31, 31, this.title);
                        String str = this.subtitle;
                        return this.action.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (str == null ? 0 : str.hashCode())) * 31, 31, this.amount);
                    }

                    public final String toString() {
                        StringBuilder sb = new StringBuilder("Folder(icon=");
                        sb.append(this.icon);
                        sb.append(", title=");
                        sb.append(this.title);
                        sb.append(", subtitle=");
                        Boxes$$ExternalSyntheticOutline1.m(sb, this.subtitle, ", amount=", this.amount, ", action=");
                        sb.append(this.action);
                        sb.append(")");
                        return sb.toString();
                    }
                }

                public GoalFolderList(ArrayList arrayList) {
                    this.folders = arrayList;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof GoalFolderList) && this.folders.equals(((GoalFolderList) obj).folders);
                }

                public final int hashCode() {
                    return this.folders.hashCode();
                }

                public final String toString() {
                    return Request$Priority$EnumUnboxingLocalUtility.m("GoalFolderList(folders=", ")", this.folders);
                }
            }

            public final class SectionHeader implements SavingsScreenElement {
                public final String title;

                public SectionHeader(String str) {
                    this.title = str;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof SectionHeader) && this.title.equals(((SectionHeader) obj).title);
                }

                public final int hashCode() {
                    return this.title.hashCode();
                }

                public final String toString() {
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SectionHeader(title=", this.title, ")");
                }
            }

            public final class TransferButtons implements SavingsScreenElement {
                public final ButtonGroupDirection direction;
                public final TransferButton primaryButton;
                public final TransferButton secondaryButton;

                public final class TransferButton {
                    public final boolean enabled;
                    public final OnPressBehavior onPressBehavior;
                    public final ButtonProminence.Id prominence;
                    public final String text;

                    public interface OnPressBehavior {

                        public final class SendEvent implements OnPressBehavior {
                            public final SavingsScreenViewEvent event;

                            public SendEvent(SavingsScreenViewEvent savingsScreenViewEvent) {
                                this.event = savingsScreenViewEvent;
                            }

                            public final boolean equals(Object obj) {
                                if (this == obj) {
                                    return true;
                                }
                                return (obj instanceof SendEvent) && this.event.equals(((SendEvent) obj).event);
                            }

                            public final int hashCode() {
                                return this.event.hashCode();
                            }

                            public final String toString() {
                                return "SendEvent(event=" + this.event + ")";
                            }
                        }

                        public final class Shake implements OnPressBehavior {
                            public final String accessibilityAnnouncement;

                            public Shake(String str) {
                                this.accessibilityAnnouncement = str;
                            }

                            public final boolean equals(Object obj) {
                                if (this == obj) {
                                    return true;
                                }
                                return (obj instanceof Shake) && Intrinsics.areEqual(this.accessibilityAnnouncement, ((Shake) obj).accessibilityAnnouncement);
                            }

                            public final int hashCode() {
                                String str = this.accessibilityAnnouncement;
                                if (str == null) {
                                    return 0;
                                }
                                return str.hashCode();
                            }

                            public final String toString() {
                                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Shake(accessibilityAnnouncement=", this.accessibilityAnnouncement, ")");
                            }
                        }
                    }

                    public TransferButton(String str, ButtonProminence.Id id, boolean z, OnPressBehavior onPressBehavior) {
                        id.getClass();
                        this.text = str;
                        this.prominence = id;
                        this.enabled = z;
                        this.onPressBehavior = onPressBehavior;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof TransferButton)) {
                            return false;
                        }
                        TransferButton transferButton = (TransferButton) obj;
                        return this.text.equals(transferButton.text) && Intrinsics.areEqual(this.prominence, transferButton.prominence) && this.enabled == transferButton.enabled && this.onPressBehavior.equals(transferButton.onPressBehavior);
                    }

                    public final int hashCode() {
                        return this.onPressBehavior.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.prominence.id, this.text.hashCode() * 31, 31), 31, this.enabled);
                    }

                    public final String toString() {
                        return "TransferButton(text=" + this.text + ", prominence=" + this.prominence + ", enabled=" + this.enabled + ", onPressBehavior=" + this.onPressBehavior + ")";
                    }
                }

                public TransferButtons(TransferButton transferButton, TransferButton transferButton2, ButtonGroupDirection buttonGroupDirection) {
                    this.primaryButton = transferButton;
                    this.secondaryButton = transferButton2;
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
                    return this.primaryButton.equals(transferButtons.primaryButton) && this.secondaryButton.equals(transferButtons.secondaryButton) && this.direction == transferButtons.direction;
                }

                public final int hashCode() {
                    return this.direction.hashCode() + ((this.secondaryButton.hashCode() + (this.primaryButton.hashCode() * 31)) * 31);
                }

                public final String toString() {
                    return "TransferButtons(primaryButton=" + this.primaryButton + ", secondaryButton=" + this.secondaryButton + ", direction=" + this.direction + ")";
                }
            }

            public final class WithinSection implements SavingsScreenElement {
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

        public Content(String str, ArrayList arrayList, CelebrationViewModel celebrationViewModel) {
            str.getClass();
            this.title = str;
            this.elements = arrayList;
            this.celebration = celebrationViewModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return Intrinsics.areEqual(this.title, content.title) && this.elements.equals(content.elements) && Intrinsics.areEqual(this.celebration, content.celebration);
        }

        public final int hashCode() {
            int m = CameraState$Type$EnumUnboxingLocalUtility.m(this.elements, this.title.hashCode() * 31, 31);
            CelebrationViewModel celebrationViewModel = this.celebration;
            return m + (celebrationViewModel == null ? 0 : celebrationViewModel.hashCode());
        }

        public final String toString() {
            StringBuilder m = CameraState$Type$EnumUnboxingLocalUtility.m(this.elements, "Content(title=", this.title, ", elements=", ", celebration=");
            m.append(this.celebration);
            m.append(")");
            return m.toString();
        }
    }

    /* loaded from: classes6.dex */
    public final class Loading implements SavingsScreenViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 1291850277;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
