package com.squareup.cash.offers.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.Image;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList;

/* loaded from: classes6.dex */
public final class OffersFilterGroupSheetViewModel {
    public final ImmutableList applyTapEventSpecs;
    public final List filters;
    public final Layout layout;
    public final String selectedFilterToken;
    public final String title;

    public final class FilterViewModel {
        public final Image image;
        public final String name;
        public final ImmutableList tapEventSpecs;
        public final String token;

        public FilterViewModel(String str, String str2, Image image, AbstractPersistentList abstractPersistentList) {
            str.getClass();
            str2.getClass();
            abstractPersistentList.getClass();
            this.token = str;
            this.name = str2;
            this.image = image;
            this.tapEventSpecs = abstractPersistentList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FilterViewModel)) {
                return false;
            }
            FilterViewModel filterViewModel = (FilterViewModel) obj;
            return Intrinsics.areEqual(this.token, filterViewModel.token) && Intrinsics.areEqual(this.name, filterViewModel.name) && Intrinsics.areEqual(this.image, filterViewModel.image) && Intrinsics.areEqual(this.tapEventSpecs, filterViewModel.tapEventSpecs);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.token.hashCode() * 31, 31, this.name);
            Image image = this.image;
            return this.tapEventSpecs.hashCode() + ((m + (image == null ? 0 : image.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("FilterViewModel(token=", this.token, ", name=", this.name, ", image=");
            m.append(this.image);
            m.append(", tapEventSpecs=");
            m.append(this.tapEventSpecs);
            m.append(")");
            return m.toString();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes7.dex */
    public final class Layout {
        public static final /* synthetic */ Layout[] $VALUES;
        public static final Layout PILL;
        public static final Layout TILE;

        static {
            Layout layout = new Layout("PILL", 0);
            PILL = layout;
            Layout layout2 = new Layout("TILE", 1);
            TILE = layout2;
            $VALUES = new Layout[]{layout, layout2};
        }

        public static Layout valueOf(String str) {
            return (Layout) Enum.valueOf(Layout.class, str);
        }

        public static Layout[] values() {
            return (Layout[]) $VALUES.clone();
        }
    }

    public OffersFilterGroupSheetViewModel(String str, List list, String str2, Layout layout, ImmutableList immutableList) {
        list.getClass();
        immutableList.getClass();
        this.title = str;
        this.filters = list;
        this.selectedFilterToken = str2;
        this.layout = layout;
        this.applyTapEventSpecs = immutableList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffersFilterGroupSheetViewModel)) {
            return false;
        }
        OffersFilterGroupSheetViewModel offersFilterGroupSheetViewModel = (OffersFilterGroupSheetViewModel) obj;
        return this.title.equals(offersFilterGroupSheetViewModel.title) && Intrinsics.areEqual(this.filters, offersFilterGroupSheetViewModel.filters) && Intrinsics.areEqual(this.selectedFilterToken, offersFilterGroupSheetViewModel.selectedFilterToken) && this.layout == offersFilterGroupSheetViewModel.layout && Intrinsics.areEqual(this.applyTapEventSpecs, offersFilterGroupSheetViewModel.applyTapEventSpecs);
    }

    public final int hashCode() {
        int m = Recorder$$ExternalSyntheticOutline2.m(this.title.hashCode() * 31, 31, this.filters);
        String str = this.selectedFilterToken;
        return this.applyTapEventSpecs.hashCode() + ((this.layout.hashCode() + ((m + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("OffersFilterGroupSheetViewModel(title=", this.title, ", filters=", ", selectedFilterToken=", this.filters);
        m.append(this.selectedFilterToken);
        m.append(", layout=");
        m.append(this.layout);
        m.append(", applyTapEventSpecs=");
        m.append(this.applyTapEventSpecs);
        m.append(")");
        return m.toString();
    }
}
