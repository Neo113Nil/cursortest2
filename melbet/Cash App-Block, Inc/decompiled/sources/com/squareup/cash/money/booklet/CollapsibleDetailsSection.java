package com.squareup.cash.money.booklet;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class CollapsibleDetailsSection implements MoneyTabBookletSection {
    public final ArrayList collapsibleDetails;

    public final class CollapsibleDetail {
        public final String description;
        public final String title;

        public CollapsibleDetail(String str, String str2) {
            this.title = str;
            this.description = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CollapsibleDetail)) {
                return false;
            }
            CollapsibleDetail collapsibleDetail = (CollapsibleDetail) obj;
            return this.title.equals(collapsibleDetail.title) && this.description.equals(collapsibleDetail.description);
        }

        public final int hashCode() {
            return this.description.hashCode() + (this.title.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("CollapsibleDetail(title=", this.title, ", description=", this.description, ")");
        }
    }

    public CollapsibleDetailsSection(ArrayList arrayList) {
        this.collapsibleDetails = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CollapsibleDetailsSection) && this.collapsibleDetails.equals(((CollapsibleDetailsSection) obj).collapsibleDetails);
    }

    public final int hashCode() {
        return this.collapsibleDetails.hashCode();
    }

    public final String toString() {
        return Request$Priority$EnumUnboxingLocalUtility.m("CollapsibleDetailsSection(collapsibleDetails=", ")", this.collapsibleDetails);
    }
}
