package app.cash.local.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class CardManagementSheetModel {
    public final String body;
    public final boolean loading;
    public final ArrayList sources;
    public final String title;

    public final class Card {
        public final String bylineText;
        public final String id;
        public final LocalImage image;
        public final boolean linked;
        public final String primaryText;
        public final String secondaryText;

        public Card(String str, LocalImage localImage, String str2, String str3, String str4, boolean z) {
            str.getClass();
            this.id = str;
            this.image = localImage;
            this.primaryText = str2;
            this.secondaryText = str3;
            this.bylineText = str4;
            this.linked = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Card)) {
                return false;
            }
            Card card = (Card) obj;
            return Intrinsics.areEqual(this.id, card.id) && Intrinsics.areEqual(this.image, card.image) && Intrinsics.areEqual(this.primaryText, card.primaryText) && Intrinsics.areEqual(this.secondaryText, card.secondaryText) && Intrinsics.areEqual(this.bylineText, card.bylineText) && this.linked == card.linked;
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode() * 31;
            LocalImage localImage = this.image;
            int hashCode2 = (hashCode + (localImage == null ? 0 : localImage.hashCode())) * 31;
            String str = this.primaryText;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.secondaryText;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.bylineText;
            return Boolean.hashCode(this.linked) + ((hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Card(id=");
            sb.append(this.id);
            sb.append(", image=");
            sb.append(this.image);
            sb.append(", primaryText=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.primaryText, ", secondaryText=", this.secondaryText, ", bylineText=");
            return re$$ExternalSyntheticOutline0.m(sb, this.bylineText, ", linked=", this.linked, ")");
        }
    }

    public final class Source {
        public final ArrayList cards;
        public final String label;

        public Source(String str, ArrayList arrayList) {
            str.getClass();
            this.label = str;
            this.cards = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Source)) {
                return false;
            }
            Source source = (Source) obj;
            return Intrinsics.areEqual(this.label, source.label) && this.cards.equals(source.cards);
        }

        public final int hashCode() {
            return this.cards.hashCode() + (this.label.hashCode() * 31);
        }

        public final String toString() {
            return NavAction$$ExternalSyntheticOutline0.m(this.cards, "Source(label=", this.label, ", cards=", ")");
        }
    }

    public CardManagementSheetModel(String str, String str2, ArrayList arrayList, boolean z) {
        str.getClass();
        this.title = str;
        this.body = str2;
        this.sources = arrayList;
        this.loading = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardManagementSheetModel)) {
            return false;
        }
        CardManagementSheetModel cardManagementSheetModel = (CardManagementSheetModel) obj;
        return Intrinsics.areEqual(this.title, cardManagementSheetModel.title) && Intrinsics.areEqual(this.body, cardManagementSheetModel.body) && this.sources.equals(cardManagementSheetModel.sources) && this.loading == cardManagementSheetModel.loading;
    }

    public final int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.body;
        return Boolean.hashCode(this.loading) + CameraState$Type$EnumUnboxingLocalUtility.m(this.sources, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CardManagementSheetModel(title=", this.title, ", body=", this.body, ", sources=");
        m.append(this.sources);
        m.append(", loading=");
        m.append(this.loading);
        m.append(")");
        return m.toString();
    }
}
