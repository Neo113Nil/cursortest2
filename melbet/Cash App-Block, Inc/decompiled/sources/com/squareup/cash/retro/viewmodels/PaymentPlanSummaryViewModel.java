package com.squareup.cash.retro.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.common.viewmodels.AvatarBadgeViewModel;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.timeline.viewmodels.TimelineWidgetModel;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.ui.Timeline;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class PaymentPlanSummaryViewModel {
    public final ColorModel accentColor;
    public final StackedAvatarViewModel.Single avatar;
    public final AvatarBadgeViewModel avatarBadge;
    public final BottomSheetData bottomSheetData;
    public final ArrayList labeledLinks;
    public final TimelineSection paymentsTimelineSection;
    public final ProgressSection progressSection;
    public final PurchasesSection purchasesSection;
    public final TimelineSection refundsTimelineSection;
    public final String subtitle;
    public final SummarySection summarySection;
    public final String title;

    public final class BottomSheetData {
        public final String closeButtonText;
        public final String description;
        public final String title;

        public BottomSheetData(String str, String str2, String str3) {
            str2.getClass();
            str3.getClass();
            this.title = str;
            this.description = str2;
            this.closeButtonText = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BottomSheetData)) {
                return false;
            }
            BottomSheetData bottomSheetData = (BottomSheetData) obj;
            return Intrinsics.areEqual(this.title, bottomSheetData.title) && Intrinsics.areEqual(this.description, bottomSheetData.description) && Intrinsics.areEqual(this.closeButtonText, bottomSheetData.closeButtonText);
        }

        public final int hashCode() {
            String str = this.title;
            return this.closeButtonText.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 31, this.description);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BottomSheetData(title=", this.title, ", description=", this.description, ", closeButtonText="), this.closeButtonText, ")");
        }
    }

    public final class LabeledLink {
        public final String accessoryText;
        public final Image icon;
        public final String label;
        public final String uri;

        public LabeledLink(Image image, String str, String str2, String str3) {
            image.getClass();
            str.getClass();
            str2.getClass();
            this.icon = image;
            this.label = str;
            this.uri = str2;
            this.accessoryText = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LabeledLink)) {
                return false;
            }
            LabeledLink labeledLink = (LabeledLink) obj;
            return Intrinsics.areEqual(this.icon, labeledLink.icon) && Intrinsics.areEqual(this.label, labeledLink.label) && Intrinsics.areEqual(this.uri, labeledLink.uri) && Intrinsics.areEqual(this.accessoryText, labeledLink.accessoryText);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.icon.hashCode() * 31, 31, this.label), 31, this.uri);
            String str = this.accessoryText;
            return m + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Matcher$$ExternalSyntheticOutline0.m(this.icon, "LabeledLink(icon=", ", label=", this.label, ", uri="), this.uri, ", accessoryText=", this.accessoryText, ")");
        }
    }

    public final class ProgressSection {
        public final String endLabel;
        public final String endText;
        public final float progressPercent;
        public final String startLabel;
        public final String startText;

        public ProgressSection(String str, String str2, String str3, String str4, float f) {
            Request$Priority$EnumUnboxingLocalUtility.m(str, str2, str3, str4);
            this.startText = str;
            this.startLabel = str2;
            this.endText = str3;
            this.endLabel = str4;
            this.progressPercent = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProgressSection)) {
                return false;
            }
            ProgressSection progressSection = (ProgressSection) obj;
            return Intrinsics.areEqual(this.startText, progressSection.startText) && Intrinsics.areEqual(this.startLabel, progressSection.startLabel) && Intrinsics.areEqual(this.endText, progressSection.endText) && Intrinsics.areEqual(this.endLabel, progressSection.endLabel) && Float.compare(this.progressPercent, progressSection.progressPercent) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.progressPercent) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.startText.hashCode() * 31, 31, this.startLabel), 31, this.endText), 31, this.endLabel);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ProgressSection(startText=", this.startText, ", startLabel=", this.startLabel, ", endText=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.endText, ", endLabel=", this.endLabel, ", progressPercent=");
            return Recorder$$ExternalSyntheticOutline1.m(this.progressPercent, ")", m);
        }
    }

    public final class PurchasesSection {
        public final ActionButton button;
        public final ArrayList detailRows;
        public final String title;

        public final class ActionButton {
            public final Image icon;
            public final String text;
            public final String url;

            public ActionButton(Image image, String str, String str2) {
                str.getClass();
                str2.getClass();
                this.text = str;
                this.url = str2;
                this.icon = image;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ActionButton)) {
                    return false;
                }
                ActionButton actionButton = (ActionButton) obj;
                return Intrinsics.areEqual(this.text, actionButton.text) && Intrinsics.areEqual(this.url, actionButton.url) && Intrinsics.areEqual(this.icon, actionButton.icon);
            }

            public final int hashCode() {
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.text.hashCode() * 31, 31, this.url);
                Image image = this.icon;
                return m + (image == null ? 0 : image.hashCode());
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ActionButton(text=", this.text, ", url=", this.url, ", icon=");
                m.append(this.icon);
                m.append(")");
                return m.toString();
            }
        }

        public final class DetailRow {
            public final StackedAvatarViewModel.Single avatar;
            public final AvatarBadgeViewModel avatarBadge;
            public final String detail;
            public final String subtitle;
            public final String title;

            public DetailRow(String str, String str2, String str3, StackedAvatarViewModel.Single single, AvatarBadgeViewModel avatarBadgeViewModel) {
                str.getClass();
                this.title = str;
                this.subtitle = str2;
                this.detail = str3;
                this.avatar = single;
                this.avatarBadge = avatarBadgeViewModel;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof DetailRow)) {
                    return false;
                }
                DetailRow detailRow = (DetailRow) obj;
                return Intrinsics.areEqual(this.title, detailRow.title) && Intrinsics.areEqual(this.subtitle, detailRow.subtitle) && Intrinsics.areEqual(this.detail, detailRow.detail) && Intrinsics.areEqual(this.avatar, detailRow.avatar) && Intrinsics.areEqual(this.avatarBadge, detailRow.avatarBadge);
            }

            public final int hashCode() {
                int hashCode = this.title.hashCode() * 31;
                String str = this.subtitle;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.detail;
                int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                StackedAvatarViewModel.Single single = this.avatar;
                int hashCode4 = (hashCode3 + (single == null ? 0 : single.avatar.hashCode())) * 31;
                AvatarBadgeViewModel avatarBadgeViewModel = this.avatarBadge;
                return hashCode4 + (avatarBadgeViewModel != null ? avatarBadgeViewModel.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DetailRow(title=", this.title, ", subtitle=", this.subtitle, ", detail=");
                m.append(this.detail);
                m.append(", avatar=");
                m.append(this.avatar);
                m.append(", avatarBadge=");
                m.append(this.avatarBadge);
                m.append(")");
                return m.toString();
            }
        }

        public PurchasesSection(String str, ArrayList arrayList, ActionButton actionButton) {
            str.getClass();
            this.title = str;
            this.detailRows = arrayList;
            this.button = actionButton;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PurchasesSection)) {
                return false;
            }
            PurchasesSection purchasesSection = (PurchasesSection) obj;
            return Intrinsics.areEqual(this.title, purchasesSection.title) && this.detailRows.equals(purchasesSection.detailRows) && Intrinsics.areEqual(this.button, purchasesSection.button);
        }

        public final int hashCode() {
            int m = CameraState$Type$EnumUnboxingLocalUtility.m(this.detailRows, this.title.hashCode() * 31, 31);
            ActionButton actionButton = this.button;
            return m + (actionButton == null ? 0 : actionButton.hashCode());
        }

        public final String toString() {
            StringBuilder m = CameraState$Type$EnumUnboxingLocalUtility.m(this.detailRows, "PurchasesSection(title=", this.title, ", detailRows=", ", button=");
            m.append(this.button);
            m.append(")");
            return m.toString();
        }
    }

    public final class SubmitButton {
        public final String id;
        public final Style style;
        public final String text;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes8.dex */
        public final class Style {
            public static final /* synthetic */ Style[] $VALUES;
            public static final Style PROMINENT;
            public static final Style STANDARD;
            public static final Style SUBTLE;

            static {
                Style style = new Style("STANDARD", 0);
                STANDARD = style;
                Style style2 = new Style("PROMINENT", 1);
                PROMINENT = style2;
                Style style3 = new Style("SUBTLE", 2);
                SUBTLE = style3;
                $VALUES = new Style[]{style, style2, style3};
            }

            public static Style valueOf(String str) {
                return (Style) Enum.valueOf(Style.class, str);
            }

            public static Style[] values() {
                return (Style[]) $VALUES.clone();
            }
        }

        public SubmitButton(String str, String str2, Style style) {
            str.getClass();
            str2.getClass();
            this.id = str;
            this.text = str2;
            this.style = style;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SubmitButton)) {
                return false;
            }
            SubmitButton submitButton = (SubmitButton) obj;
            return Intrinsics.areEqual(this.id, submitButton.id) && Intrinsics.areEqual(this.text, submitButton.text) && this.style == submitButton.style;
        }

        public final int hashCode() {
            return this.style.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.text);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SubmitButton(id=", this.id, ", text=", this.text, ", style=");
            m.append(this.style);
            m.append(")");
            return m.toString();
        }
    }

    public final class SummarySection {
        public final ArrayList detailItems;
        public final StackedAvatarViewModel.Single sourceIcon;
        public final String sourceText;
        public final String summaryMarkdownText;
        public final String title;

        public final class DetailItem {
            public final String label;
            public final String value;

            public DetailItem(String str, String str2) {
                str.getClass();
                str2.getClass();
                this.label = str;
                this.value = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof DetailItem)) {
                    return false;
                }
                DetailItem detailItem = (DetailItem) obj;
                return Intrinsics.areEqual(this.label, detailItem.label) && Intrinsics.areEqual(this.value, detailItem.value);
            }

            public final int hashCode() {
                return this.value.hashCode() + (this.label.hashCode() * 31);
            }

            public final String toString() {
                return Boxes$$ExternalSyntheticOutline1.m("DetailItem(label=", this.label, ", value=", this.value, ")");
            }
        }

        public SummarySection(String str, String str2, ArrayList arrayList, String str3, StackedAvatarViewModel.Single single) {
            this.title = str;
            this.summaryMarkdownText = str2;
            this.detailItems = arrayList;
            this.sourceText = str3;
            this.sourceIcon = single;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SummarySection)) {
                return false;
            }
            SummarySection summarySection = (SummarySection) obj;
            return Intrinsics.areEqual(this.title, summarySection.title) && Intrinsics.areEqual(this.summaryMarkdownText, summarySection.summaryMarkdownText) && this.detailItems.equals(summarySection.detailItems) && Intrinsics.areEqual(this.sourceText, summarySection.sourceText) && Intrinsics.areEqual(this.sourceIcon, summarySection.sourceIcon);
        }

        public final int hashCode() {
            String str = this.title;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.summaryMarkdownText;
            int m = CameraState$Type$EnumUnboxingLocalUtility.m(this.detailItems, (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
            String str3 = this.sourceText;
            int hashCode2 = (m + (str3 == null ? 0 : str3.hashCode())) * 31;
            StackedAvatarViewModel.Single single = this.sourceIcon;
            return hashCode2 + (single != null ? single.avatar.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SummarySection(title=", this.title, ", summaryMarkdownText=", this.summaryMarkdownText, ", detailItems=");
            m.append(this.detailItems);
            m.append(", sourceText=");
            m.append(this.sourceText);
            m.append(", sourceIcon=");
            m.append(this.sourceIcon);
            m.append(")");
            return m.toString();
        }
    }

    public final class TimelineSection {
        public final SubmitButton button;
        public final TimelineWidgetModel legacyTimeline;
        public final String subtitle;
        public final Timeline timeline;
        public final String title;

        /* loaded from: classes8.dex */
        public abstract /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;
            public static final /* synthetic */ int[] $EnumSwitchMapping$2;

            static {
                int[] iArr = new int[Timeline.Event.InlineTextFormat.values().length];
                try {
                    iArr[Timeline.Event.InlineTextFormat.PRIMARY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Timeline.Event.InlineTextFormat.SECONDARY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[Timeline.Event.Icon.values().length];
                try {
                    iArr2[Timeline.Event.Icon.NORMAL.ordinal()] = 1;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr2[Timeline.Event.Icon.HIGHLIGHT.ordinal()] = 2;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr2[Timeline.Event.Icon.ALERT.ordinal()] = 3;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[Timeline.Event.Icon.COMPLETED.ordinal()] = 4;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr2[Timeline.Event.Icon.SKIPPED.ordinal()] = 5;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr2[Timeline.Event.Icon.MISSED.ordinal()] = 6;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr2[Timeline.Event.Icon.HIGHLIGHT_COMPLETED.ordinal()] = 7;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr2[Timeline.Event.Icon.FAILED.ordinal()] = 8;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr2[Timeline.Event.Icon.CANCELED.ordinal()] = 9;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr2[Timeline.Event.Icon.REFUNDED.ordinal()] = 10;
                } catch (NoSuchFieldError unused12) {
                }
                $EnumSwitchMapping$1 = iArr2;
                int[] iArr3 = new int[Timeline.Event.State.values().length];
                try {
                    iArr3[Timeline.Event.State.NOT_STARTED.ordinal()] = 1;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr3[Timeline.Event.State.INCOMPLETE.ordinal()] = 2;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr3[Timeline.Event.State.PENDING.ordinal()] = 3;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr3[Timeline.Event.State.DONE.ordinal()] = 4;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr3[Timeline.Event.State.BYPASSED.ordinal()] = 5;
                } catch (NoSuchFieldError unused17) {
                }
                $EnumSwitchMapping$2 = iArr3;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TimelineSection(String str, String str2, Timeline timeline, SubmitButton submitButton) {
            TimelineWidgetModel.Item.State state;
            TimelineWidgetModel.Item.InlineText inlineText;
            TimelineWidgetModel.Item.InlineText.InlineState inlineState;
            timeline.getClass();
            this.title = str;
            this.subtitle = str2;
            this.timeline = timeline;
            this.button = submitButton;
            List<Timeline.Event> list = timeline.events;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    Timeline.CollapseRule collapseRule = this.timeline.collapse_rule;
                    Timeline.CollapseRule.CollapsedSize collapsedSize = collapseRule instanceof Timeline.CollapseRule.CollapsedSize ? (Timeline.CollapseRule.CollapsedSize) collapseRule : null;
                    this.legacyTimeline = new TimelineWidgetModel(collapsedSize != null ? collapsedSize.getValue() : 1, arrayList);
                    return;
                }
                Timeline.Event event = (Timeline.Event) it.next();
                Timeline.Event.Icon icon = event.icon;
                if (icon != null) {
                    switch (WhenMappings.$EnumSwitchMapping$1[icon.ordinal()]) {
                        case 1:
                            state = TimelineWidgetModel.Item.State.UPCOMING;
                            break;
                        case 2:
                            state = TimelineWidgetModel.Item.State.HIGHLIGHT;
                            break;
                        case 3:
                            state = TimelineWidgetModel.Item.State.ALERT;
                            break;
                        case 4:
                            state = TimelineWidgetModel.Item.State.COMPLETED;
                            break;
                        case 5:
                            state = TimelineWidgetModel.Item.State.SKIPPED;
                            break;
                        case 6:
                            state = TimelineWidgetModel.Item.State.MISSED;
                            break;
                        case 7:
                            state = TimelineWidgetModel.Item.State.HIGHLIGHT_COMPLETED;
                            break;
                        case 8:
                            state = TimelineWidgetModel.Item.State.FAILED;
                            break;
                        case 9:
                            state = TimelineWidgetModel.Item.State.CANCELED_ALT;
                            break;
                        case 10:
                            state = TimelineWidgetModel.Item.State.REFUNDED_ALT;
                            break;
                        default:
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            throw null;
                    }
                } else {
                    Timeline.Event.State state2 = event.state;
                    if (state2 != null) {
                        int i = WhenMappings.$EnumSwitchMapping$2[state2.ordinal()];
                        if (i == 1) {
                            state = TimelineWidgetModel.Item.State.UPCOMING;
                        } else if (i == 2) {
                            state = TimelineWidgetModel.Item.State.HIGHLIGHT;
                        } else if (i == 3) {
                            state = TimelineWidgetModel.Item.State.HIGHLIGHT;
                        } else if (i == 4) {
                            state = TimelineWidgetModel.Item.State.COMPLETED;
                        } else {
                            if (i != 5) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                throw null;
                            }
                            state = TimelineWidgetModel.Item.State.SKIPPED;
                        }
                    } else {
                        state = TimelineWidgetModel.Item.State.UPCOMING;
                    }
                }
                TimelineWidgetModel.Item.State state3 = state;
                String str3 = event.title;
                str3.getClass();
                String str4 = event.detail_text;
                String str5 = event.inline_description_text;
                if (str5 != null) {
                    Timeline.Event.InlineTextFormat inlineTextFormat = event.inline_description_text_format;
                    inlineTextFormat.getClass();
                    int i2 = WhenMappings.$EnumSwitchMapping$0[inlineTextFormat.ordinal()];
                    if (i2 == 1) {
                        inlineState = TimelineWidgetModel.Item.InlineText.InlineState.MATCH_PRIMARY;
                    } else {
                        if (i2 != 2) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            throw null;
                        }
                        inlineState = TimelineWidgetModel.Item.InlineText.InlineState.SECONDARY;
                    }
                    inlineText = new TimelineWidgetModel.Item.InlineText(str5, inlineState, true);
                } else {
                    inlineText = null;
                }
                arrayList.add(new TimelineWidgetModel.Item(state3, str3, str4, inlineText, null, state3 != TimelineWidgetModel.Item.State.ALERT ? 0 : 1));
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TimelineSection)) {
                return false;
            }
            TimelineSection timelineSection = (TimelineSection) obj;
            return Intrinsics.areEqual(this.title, timelineSection.title) && Intrinsics.areEqual(this.subtitle, timelineSection.subtitle) && Intrinsics.areEqual(this.timeline, timelineSection.timeline) && Intrinsics.areEqual(this.button, timelineSection.button);
        }

        public final int hashCode() {
            String str = this.title;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.subtitle;
            int hashCode2 = (this.timeline.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            SubmitButton submitButton = this.button;
            return hashCode2 + (submitButton != null ? submitButton.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TimelineSection(title=", this.title, ", subtitle=", this.subtitle, ", timeline=");
            m.append(this.timeline);
            m.append(", button=");
            m.append(this.button);
            m.append(")");
            return m.toString();
        }
    }

    public PaymentPlanSummaryViewModel(ColorModel colorModel, StackedAvatarViewModel.Single single, AvatarBadgeViewModel avatarBadgeViewModel, String str, String str2, ProgressSection progressSection, TimelineSection timelineSection, TimelineSection timelineSection2, SummarySection summarySection, PurchasesSection purchasesSection, ArrayList arrayList, BottomSheetData bottomSheetData) {
        str.getClass();
        this.accentColor = colorModel;
        this.avatar = single;
        this.avatarBadge = avatarBadgeViewModel;
        this.title = str;
        this.subtitle = str2;
        this.progressSection = progressSection;
        this.refundsTimelineSection = timelineSection;
        this.paymentsTimelineSection = timelineSection2;
        this.summarySection = summarySection;
        this.purchasesSection = purchasesSection;
        this.labeledLinks = arrayList;
        this.bottomSheetData = bottomSheetData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentPlanSummaryViewModel)) {
            return false;
        }
        PaymentPlanSummaryViewModel paymentPlanSummaryViewModel = (PaymentPlanSummaryViewModel) obj;
        return this.accentColor.equals(paymentPlanSummaryViewModel.accentColor) && Intrinsics.areEqual(this.avatar, paymentPlanSummaryViewModel.avatar) && Intrinsics.areEqual(this.avatarBadge, paymentPlanSummaryViewModel.avatarBadge) && Intrinsics.areEqual(this.title, paymentPlanSummaryViewModel.title) && Intrinsics.areEqual(this.subtitle, paymentPlanSummaryViewModel.subtitle) && this.progressSection.equals(paymentPlanSummaryViewModel.progressSection) && Intrinsics.areEqual(this.refundsTimelineSection, paymentPlanSummaryViewModel.refundsTimelineSection) && this.paymentsTimelineSection.equals(paymentPlanSummaryViewModel.paymentsTimelineSection) && Intrinsics.areEqual(this.summarySection, paymentPlanSummaryViewModel.summarySection) && Intrinsics.areEqual(this.purchasesSection, paymentPlanSummaryViewModel.purchasesSection) && this.labeledLinks.equals(paymentPlanSummaryViewModel.labeledLinks) && Intrinsics.areEqual(this.bottomSheetData, paymentPlanSummaryViewModel.bottomSheetData);
    }

    public final int hashCode() {
        int hashCode = this.accentColor.hashCode() * 31;
        StackedAvatarViewModel.Single single = this.avatar;
        int hashCode2 = (hashCode + (single == null ? 0 : single.avatar.hashCode())) * 31;
        AvatarBadgeViewModel avatarBadgeViewModel = this.avatarBadge;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode2 + (avatarBadgeViewModel == null ? 0 : avatarBadgeViewModel.hashCode())) * 31, 31, this.title);
        String str = this.subtitle;
        int hashCode3 = (this.progressSection.hashCode() + ((m + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        TimelineSection timelineSection = this.refundsTimelineSection;
        int hashCode4 = (this.paymentsTimelineSection.hashCode() + ((hashCode3 + (timelineSection == null ? 0 : timelineSection.hashCode())) * 31)) * 31;
        SummarySection summarySection = this.summarySection;
        int hashCode5 = (hashCode4 + (summarySection == null ? 0 : summarySection.hashCode())) * 31;
        PurchasesSection purchasesSection = this.purchasesSection;
        int m2 = CameraState$Type$EnumUnboxingLocalUtility.m(this.labeledLinks, (hashCode5 + (purchasesSection == null ? 0 : purchasesSection.hashCode())) * 31, 31);
        BottomSheetData bottomSheetData = this.bottomSheetData;
        return m2 + (bottomSheetData != null ? bottomSheetData.hashCode() : 0);
    }

    public final String toString() {
        return "PaymentPlanSummaryViewModel(accentColor=" + this.accentColor + ", avatar=" + this.avatar + ", avatarBadge=" + this.avatarBadge + ", title=" + this.title + ", subtitle=" + this.subtitle + ", progressSection=" + this.progressSection + ", refundsTimelineSection=" + this.refundsTimelineSection + ", paymentsTimelineSection=" + this.paymentsTimelineSection + ", summarySection=" + this.summarySection + ", purchasesSection=" + this.purchasesSection + ", labeledLinks=" + this.labeledLinks + ", bottomSheetData=" + this.bottomSheetData + ")";
    }
}
