package app.cash.local.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.local.primitives.ComboSlotToken;
import app.cash.local.primitives.MenuItemToken;
import app.cash.local.primitives.MenuItemVariationToken;
import app.cash.local.viewmodels.LocalMenuComboDetailsViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public interface LocalMenuComboDetailsViewEvent {

    public final class BackClicked implements LocalMenuComboDetailsViewEvent {
        public static final BackClicked INSTANCE = new BackClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BackClicked);
        }

        public final int hashCode() {
            return -605475145;
        }

        public final String toString() {
            return "BackClicked";
        }
    }

    public final class CustomizeSlot implements LocalMenuComboDetailsViewEvent {
        public final int sectionIndex;
        public final String token;

        public CustomizeSlot(int i, String str) {
            str.getClass();
            this.sectionIndex = i;
            this.token = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CustomizeSlot)) {
                return false;
            }
            CustomizeSlot customizeSlot = (CustomizeSlot) obj;
            return this.sectionIndex == customizeSlot.sectionIndex && Intrinsics.areEqual(this.token, customizeSlot.token);
        }

        public final int hashCode() {
            return this.token.hashCode() + (Integer.hashCode(this.sectionIndex) * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("CustomizeSlot(sectionIndex=", LocalMenuComboDetailsViewModel.SectionIndex.m1294toStringimpl(this.sectionIndex), ", token=", ComboSlotToken.m1233toStringimpl(this.token), ")");
        }
    }

    public final class MissingSlotSelections implements LocalMenuComboDetailsViewEvent {
        public static final MissingSlotSelections INSTANCE = new MissingSlotSelections();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof MissingSlotSelections);
        }

        public final int hashCode() {
            return -1547212606;
        }

        public final String toString() {
            return "MissingSlotSelections";
        }
    }

    public final class SelectSlotOption implements LocalMenuComboDetailsViewEvent {
        public final String itemToken;
        public final int sectionIndex;
        public final String slotToken;
        public final String variationToken;

        public SelectSlotOption(int i, String str, String str2, String str3) {
            str.getClass();
            str2.getClass();
            this.sectionIndex = i;
            this.slotToken = str;
            this.itemToken = str2;
            this.variationToken = str3;
        }

        public final boolean equals(Object obj) {
            boolean areEqual;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SelectSlotOption)) {
                return false;
            }
            SelectSlotOption selectSlotOption = (SelectSlotOption) obj;
            if (this.sectionIndex != selectSlotOption.sectionIndex || !Intrinsics.areEqual(this.slotToken, selectSlotOption.slotToken) || !Intrinsics.areEqual(this.itemToken, selectSlotOption.itemToken)) {
                return false;
            }
            String str = selectSlotOption.variationToken;
            String str2 = this.variationToken;
            if (str2 == null) {
                if (str == null) {
                    areEqual = true;
                }
                areEqual = false;
            } else {
                if (str != null) {
                    areEqual = Intrinsics.areEqual(str2, str);
                }
                areEqual = false;
            }
            return areEqual;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Integer.hashCode(this.sectionIndex) * 31, 31, this.slotToken), 31, this.itemToken);
            String str = this.variationToken;
            return m + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            String m1294toStringimpl = LocalMenuComboDetailsViewModel.SectionIndex.m1294toStringimpl(this.sectionIndex);
            String m1233toStringimpl = ComboSlotToken.m1233toStringimpl(this.slotToken);
            String m1264toStringimpl = MenuItemToken.m1264toStringimpl(this.itemToken);
            String str = this.variationToken;
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SelectSlotOption(sectionIndex=", m1294toStringimpl, ", slotToken=", m1233toStringimpl, ", itemToken="), m1264toStringimpl, ", variationToken=", str == null ? "null" : MenuItemVariationToken.m1265toStringimpl(str), ")");
        }
    }
}
