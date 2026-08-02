package com.squareup.cash.offers.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class OffersTimelineViewModelV2 {
    public final String buttonText;
    public final List items;
    public final String title;

    public final class Item {
        public final String description;
        public final String title;

        public Item(String str, String str2) {
            str.getClass();
            this.title = str;
            this.description = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            return Intrinsics.areEqual(this.title, item.title) && Intrinsics.areEqual(this.description, item.description);
        }

        public final int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            String str = this.description;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("Item(title=", this.title, ", description=", this.description, ")");
        }
    }

    public OffersTimelineViewModelV2(String str, String str2, List list) {
        str.getClass();
        list.getClass();
        str2.getClass();
        this.title = str;
        this.items = list;
        this.buttonText = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffersTimelineViewModelV2)) {
            return false;
        }
        OffersTimelineViewModelV2 offersTimelineViewModelV2 = (OffersTimelineViewModelV2) obj;
        return Intrinsics.areEqual(this.title, offersTimelineViewModelV2.title) && Intrinsics.areEqual(this.items, offersTimelineViewModelV2.items) && Intrinsics.areEqual(this.buttonText, offersTimelineViewModelV2.buttonText);
    }

    public final int hashCode() {
        return this.buttonText.hashCode() + Recorder$$ExternalSyntheticOutline2.m(this.title.hashCode() * 31, 31, this.items);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(NavAction$$ExternalSyntheticOutline0.m("OffersTimelineViewModelV2(title=", this.title, ", items=", ", buttonText=", this.items), this.buttonText, ")");
    }
}
