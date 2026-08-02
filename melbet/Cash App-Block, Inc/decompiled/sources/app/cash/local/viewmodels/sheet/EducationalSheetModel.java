package app.cash.local.viewmodels.sheet;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.local.viewmodels.internal.MiniCardModel;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class EducationalSheetModel {
    public final EducationalButtonAction closeButtonAction;
    public final ArrayList collapsedContents;
    public final String expandNudgeText;
    public final boolean forceExpansion;
    public final Button primaryButton;
    public final boolean requiresFullScroll;
    public final ArrayList visibleContents;

    public final class Button {
        public final EducationalButtonAction action;
        public final boolean enabled;
        public final String label;
        public final Style style;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class Style {
            public static final /* synthetic */ Style[] $VALUES;
            public static final Style PRIMARY;
            public static final Style SECONDARY;

            static {
                Style style = new Style("PRIMARY", 0);
                PRIMARY = style;
                Style style2 = new Style("SECONDARY", 1);
                SECONDARY = style2;
                $VALUES = new Style[]{style, style2};
            }

            public static Style valueOf(String str) {
                return (Style) Enum.valueOf(Style.class, str);
            }

            public static Style[] values() {
                return (Style[]) $VALUES.clone();
            }
        }

        public Button(String str, Style style, boolean z, EducationalButtonAction educationalButtonAction) {
            str.getClass();
            this.label = str;
            this.style = style;
            this.enabled = z;
            this.action = educationalButtonAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Button)) {
                return false;
            }
            Button button = (Button) obj;
            return Intrinsics.areEqual(this.label, button.label) && this.style == button.style && this.enabled == button.enabled && this.action.equals(button.action);
        }

        public final int hashCode() {
            return this.action.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.style.hashCode() + (this.label.hashCode() * 31)) * 31, 31, this.enabled);
        }

        public final String toString() {
            return "Button(label=" + this.label + ", style=" + this.style + ", enabled=" + this.enabled + ", action=" + this.action + ")";
        }
    }

    public abstract class Content {
        public abstract String getAnalyticsId();
    }

    public abstract class Image extends Content {

        public final class HeroImage extends Image {
            public final String analyticsId;
            public final boolean bleed;
            public final LocalImage image;

            public HeroImage(LocalImage localImage, boolean z, String str) {
                localImage.getClass();
                this.image = localImage;
                this.bleed = z;
                this.analyticsId = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof HeroImage)) {
                    return false;
                }
                HeroImage heroImage = (HeroImage) obj;
                return Intrinsics.areEqual(this.image, heroImage.image) && this.bleed == heroImage.bleed && Intrinsics.areEqual(this.analyticsId, heroImage.analyticsId);
            }

            @Override // app.cash.local.viewmodels.sheet.EducationalSheetModel.Content
            public final String getAnalyticsId() {
                return this.analyticsId;
            }

            public final int hashCode() {
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.image.hashCode() * 31, 31, this.bleed);
                String str = this.analyticsId;
                return m + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("HeroImage(image=");
                sb.append(this.image);
                sb.append(", bleed=");
                sb.append(this.bleed);
                sb.append(", analyticsId=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.analyticsId, ")");
            }
        }

        public final class MiniCard extends Image {
            public final String analyticsId;
            public final MiniCardModel model;

            public MiniCard(MiniCardModel miniCardModel, String str) {
                this.model = miniCardModel;
                this.analyticsId = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof MiniCard)) {
                    return false;
                }
                MiniCard miniCard = (MiniCard) obj;
                return this.model.equals(miniCard.model) && Intrinsics.areEqual(this.analyticsId, miniCard.analyticsId);
            }

            @Override // app.cash.local.viewmodels.sheet.EducationalSheetModel.Content
            public final String getAnalyticsId() {
                return this.analyticsId;
            }

            public final int hashCode() {
                int hashCode = this.model.hashCode() * 31;
                String str = this.analyticsId;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                return "MiniCard(model=" + this.model + ", analyticsId=" + this.analyticsId + ")";
            }
        }

        public final class TiledHeroImage extends Image {
            public final String analyticsId;
            public final String caption;
            public final LocalImage heroImage;
            public final LocalImage tileImage;

            public TiledHeroImage(LocalImage localImage, LocalImage localImage2, String str, String str2) {
                localImage.getClass();
                str.getClass();
                this.heroImage = localImage;
                this.tileImage = localImage2;
                this.caption = str;
                this.analyticsId = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TiledHeroImage)) {
                    return false;
                }
                TiledHeroImage tiledHeroImage = (TiledHeroImage) obj;
                return Intrinsics.areEqual(this.heroImage, tiledHeroImage.heroImage) && this.tileImage.equals(tiledHeroImage.tileImage) && Intrinsics.areEqual(this.caption, tiledHeroImage.caption) && Intrinsics.areEqual(this.analyticsId, tiledHeroImage.analyticsId);
            }

            @Override // app.cash.local.viewmodels.sheet.EducationalSheetModel.Content
            public final String getAnalyticsId() {
                return this.analyticsId;
            }

            public final int hashCode() {
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.tileImage.hashCode() + (this.heroImage.hashCode() * 31)) * 31, 31, this.caption);
                String str = this.analyticsId;
                return m + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("TiledHeroImage(heroImage=");
                sb.append(this.heroImage);
                sb.append(", tileImage=");
                sb.append(this.tileImage);
                sb.append(", caption=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.caption, ", analyticsId=", this.analyticsId, ")");
            }
        }
    }

    public final class NumberedList extends Content {
        public final String analyticsId;
        public final List items;

        public NumberedList(List list, String str) {
            list.getClass();
            this.items = list;
            this.analyticsId = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NumberedList)) {
                return false;
            }
            NumberedList numberedList = (NumberedList) obj;
            return Intrinsics.areEqual(this.items, numberedList.items) && Intrinsics.areEqual(this.analyticsId, numberedList.analyticsId);
        }

        @Override // app.cash.local.viewmodels.sheet.EducationalSheetModel.Content
        public final String getAnalyticsId() {
            return this.analyticsId;
        }

        public final int hashCode() {
            int hashCode = this.items.hashCode() * 31;
            String str = this.analyticsId;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return "NumberedList(items=" + this.items + ", analyticsId=" + this.analyticsId + ")";
        }
    }

    public final class Text extends Content {
        public final String analyticsId;
        public final Style style;
        public final String value;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class Style {
            public static final /* synthetic */ Style[] $VALUES;
            public static final Style BODY;
            public static final Style BODY_LEGAL;
            public static final Style BRANDED_FOOTNOTE;
            public static final Style HEADING;
            public static final Style HERO;
            public static final Style HERO_SUBTITLE;

            static {
                Style style = new Style("HERO", 0);
                HERO = style;
                Style style2 = new Style("HEADING", 1);
                HEADING = style2;
                Style style3 = new Style("BODY", 2);
                BODY = style3;
                Style style4 = new Style("HERO_SUBTITLE", 3);
                HERO_SUBTITLE = style4;
                Style style5 = new Style("BODY_LEGAL", 4);
                BODY_LEGAL = style5;
                Style style6 = new Style("BRANDED_FOOTNOTE", 5);
                BRANDED_FOOTNOTE = style6;
                $VALUES = new Style[]{style, style2, style3, style4, style5, style6};
            }

            public static Style valueOf(String str) {
                return (Style) Enum.valueOf(Style.class, str);
            }

            public static Style[] values() {
                return (Style[]) $VALUES.clone();
            }
        }

        public Text(String str, Style style, String str2) {
            str.getClass();
            this.value = str;
            this.style = style;
            this.analyticsId = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Text)) {
                return false;
            }
            Text text = (Text) obj;
            return Intrinsics.areEqual(this.value, text.value) && this.style == text.style && Intrinsics.areEqual(this.analyticsId, text.analyticsId);
        }

        @Override // app.cash.local.viewmodels.sheet.EducationalSheetModel.Content
        public final String getAnalyticsId() {
            return this.analyticsId;
        }

        public final int hashCode() {
            int hashCode = (this.style.hashCode() + (this.value.hashCode() * 31)) * 31;
            String str = this.analyticsId;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Text(value=");
            sb.append(this.value);
            sb.append(", style=");
            sb.append(this.style);
            sb.append(", analyticsId=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.analyticsId, ")");
        }
    }

    public EducationalSheetModel(ArrayList arrayList, ArrayList arrayList2, String str, boolean z, Button button, boolean z2, EducationalButtonAction educationalButtonAction) {
        this.visibleContents = arrayList;
        this.collapsedContents = arrayList2;
        this.expandNudgeText = str;
        this.requiresFullScroll = z;
        this.primaryButton = button;
        this.forceExpansion = z2;
        this.closeButtonAction = educationalButtonAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EducationalSheetModel)) {
            return false;
        }
        EducationalSheetModel educationalSheetModel = (EducationalSheetModel) obj;
        return this.visibleContents.equals(educationalSheetModel.visibleContents) && this.collapsedContents.equals(educationalSheetModel.collapsedContents) && Intrinsics.areEqual(this.expandNudgeText, educationalSheetModel.expandNudgeText) && this.requiresFullScroll == educationalSheetModel.requiresFullScroll && this.primaryButton.equals(educationalSheetModel.primaryButton) && this.forceExpansion == educationalSheetModel.forceExpansion && Intrinsics.areEqual(this.closeButtonAction, educationalSheetModel.closeButtonAction);
    }

    public final int hashCode() {
        int m = CameraState$Type$EnumUnboxingLocalUtility.m(this.collapsedContents, this.visibleContents.hashCode() * 31, 31);
        String str = this.expandNudgeText;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.primaryButton.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (str == null ? 0 : str.hashCode())) * 31, 31, this.requiresFullScroll)) * 31, 31, this.forceExpansion);
        EducationalButtonAction educationalButtonAction = this.closeButtonAction;
        return m2 + (educationalButtonAction != null ? educationalButtonAction.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EducationalSheetModel(visibleContents=");
        sb.append(this.visibleContents);
        sb.append(", collapsedContents=");
        sb.append(this.collapsedContents);
        sb.append(", expandNudgeText=");
        NavAction$$ExternalSyntheticOutline0.m(sb, this.expandNudgeText, ", requiresFullScroll=", this.requiresFullScroll, ", primaryButton=");
        sb.append(this.primaryButton);
        sb.append(", forceExpansion=");
        sb.append(this.forceExpansion);
        sb.append(", closeButtonAction=");
        sb.append(this.closeButtonAction);
        sb.append(")");
        return sb.toString();
    }
}
