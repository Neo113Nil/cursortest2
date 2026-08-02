package com.squareup.cash.investing.viewmodels.categories;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.protos.franklin.common.SyncInvestmentFilterGroup;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class SubFilterViewModel {

    public final class SubFilterIncrementalViewModel extends SubFilterViewModel {
        public final boolean decrementButtonEnabled;
        public final boolean incrementButtonEnabled;
        public final List options;
        public final int placeholderIndex;
        public final String placeholderText;
        public final String selectedOptionToken;
        public final String subFilterToken;
        public final String title;

        public SubFilterIncrementalViewModel(String str, String str2, List list, String str3, int i, boolean z, boolean z2, String str4) {
            str.getClass();
            str2.getClass();
            list.getClass();
            str3.getClass();
            this.subFilterToken = str;
            this.title = str2;
            this.options = list;
            this.placeholderText = str3;
            this.placeholderIndex = i;
            this.decrementButtonEnabled = z;
            this.incrementButtonEnabled = z2;
            this.selectedOptionToken = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SubFilterIncrementalViewModel)) {
                return false;
            }
            SubFilterIncrementalViewModel subFilterIncrementalViewModel = (SubFilterIncrementalViewModel) obj;
            return Intrinsics.areEqual(this.subFilterToken, subFilterIncrementalViewModel.subFilterToken) && Intrinsics.areEqual(this.title, subFilterIncrementalViewModel.title) && Intrinsics.areEqual(this.options, subFilterIncrementalViewModel.options) && Intrinsics.areEqual(this.placeholderText, subFilterIncrementalViewModel.placeholderText) && this.placeholderIndex == subFilterIncrementalViewModel.placeholderIndex && this.decrementButtonEnabled == subFilterIncrementalViewModel.decrementButtonEnabled && this.incrementButtonEnabled == subFilterIncrementalViewModel.incrementButtonEnabled && Intrinsics.areEqual(this.selectedOptionToken, subFilterIncrementalViewModel.selectedOptionToken);
        }

        @Override // com.squareup.cash.investing.viewmodels.categories.SubFilterViewModel
        public final String getSelectedOptionToken() {
            return this.selectedOptionToken;
        }

        @Override // com.squareup.cash.investing.viewmodels.categories.SubFilterViewModel
        public final String getSubFilterToken() {
            return this.subFilterToken;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.placeholderIndex, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.subFilterToken.hashCode() * 31, 31, this.title), 31, this.options), 31, this.placeholderText), 31), 31, this.decrementButtonEnabled), 31, this.incrementButtonEnabled);
            String str = this.selectedOptionToken;
            return m + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SubFilterIncrementalViewModel(subFilterToken=", this.subFilterToken, ", title=", this.title, ", options=");
            Recorder$$ExternalSyntheticOutline2.m(", placeholderText=", this.placeholderText, ", placeholderIndex=", m, this.options);
            m.append(this.placeholderIndex);
            m.append(", decrementButtonEnabled=");
            m.append(this.decrementButtonEnabled);
            m.append(", incrementButtonEnabled=");
            m.append(this.incrementButtonEnabled);
            m.append(", selectedOptionToken=");
            m.append(this.selectedOptionToken);
            m.append(")");
            return m.toString();
        }
    }

    public final class SubFilterSelectionViewModel extends SubFilterViewModel {
        public final ColorModel accentColor;
        public final List options;
        public final String selectedOptionToken;
        public final String subFilterToken;
        public final String title;

        public SubFilterSelectionViewModel(ColorModel colorModel, String str, String str2, String str3, List list) {
            str.getClass();
            str2.getClass();
            list.getClass();
            colorModel.getClass();
            this.subFilterToken = str;
            this.title = str2;
            this.options = list;
            this.accentColor = colorModel;
            this.selectedOptionToken = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SubFilterSelectionViewModel)) {
                return false;
            }
            SubFilterSelectionViewModel subFilterSelectionViewModel = (SubFilterSelectionViewModel) obj;
            return Intrinsics.areEqual(this.subFilterToken, subFilterSelectionViewModel.subFilterToken) && Intrinsics.areEqual(this.title, subFilterSelectionViewModel.title) && Intrinsics.areEqual(this.options, subFilterSelectionViewModel.options) && Intrinsics.areEqual(this.accentColor, subFilterSelectionViewModel.accentColor) && Intrinsics.areEqual(this.selectedOptionToken, subFilterSelectionViewModel.selectedOptionToken);
        }

        @Override // com.squareup.cash.investing.viewmodels.categories.SubFilterViewModel
        public final String getSelectedOptionToken() {
            return this.selectedOptionToken;
        }

        @Override // com.squareup.cash.investing.viewmodels.categories.SubFilterViewModel
        public final String getSubFilterToken() {
            return this.subFilterToken;
        }

        public final int hashCode() {
            int hashCode = (this.accentColor.hashCode() + Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.subFilterToken.hashCode() * 31, 31, this.title), 31, this.options)) * 31;
            String str = this.selectedOptionToken;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SubFilterSelectionViewModel(subFilterToken=", this.subFilterToken, ", title=", this.title, ", options=");
            m.append(this.options);
            m.append(", accentColor=");
            m.append(this.accentColor);
            m.append(", selectedOptionToken=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.selectedOptionToken, ")");
        }
    }

    public final SubFilterViewModel copyWithSelectedOption(String str) {
        if (this instanceof SubFilterSelectionViewModel) {
            SubFilterSelectionViewModel subFilterSelectionViewModel = (SubFilterSelectionViewModel) this;
            String str2 = subFilterSelectionViewModel.subFilterToken;
            str2.getClass();
            String str3 = subFilterSelectionViewModel.title;
            str3.getClass();
            List list = subFilterSelectionViewModel.options;
            list.getClass();
            ColorModel colorModel = subFilterSelectionViewModel.accentColor;
            colorModel.getClass();
            return new SubFilterSelectionViewModel(colorModel, str2, str3, str, list);
        }
        if (!(this instanceof SubFilterIncrementalViewModel)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        SubFilterIncrementalViewModel subFilterIncrementalViewModel = (SubFilterIncrementalViewModel) this;
        List list2 = subFilterIncrementalViewModel.options;
        List list3 = list2;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(((SyncInvestmentFilterGroup.SubfilterOption) it.next()).token);
        }
        boolean z = arrayList.indexOf(str) != 0;
        List list4 = list2;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
        Iterator it2 = list4.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((SyncInvestmentFilterGroup.SubfilterOption) it2.next()).token);
        }
        boolean z2 = arrayList2.indexOf(str) != list2.size() - 1;
        String str4 = subFilterIncrementalViewModel.subFilterToken;
        str4.getClass();
        String str5 = subFilterIncrementalViewModel.title;
        str5.getClass();
        list2.getClass();
        String str6 = subFilterIncrementalViewModel.placeholderText;
        str6.getClass();
        return new SubFilterIncrementalViewModel(str4, str5, list2, str6, subFilterIncrementalViewModel.placeholderIndex, z, z2, str);
    }

    public abstract String getSelectedOptionToken();

    public abstract String getSubFilterToken();
}
