package com.squareup.cash.card.onboarding;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class CollapsibleDetailsSection implements ProductDetailsPageSection {
    public final List collapsibleDetails;

    public final class CollapsibleDetail {
        public final String content;
        public final String title;

        public CollapsibleDetail(String str, String str2) {
            this.title = str;
            this.content = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CollapsibleDetail)) {
                return false;
            }
            CollapsibleDetail collapsibleDetail = (CollapsibleDetail) obj;
            return this.title.equals(collapsibleDetail.title) && this.content.equals(collapsibleDetail.content);
        }

        public final int hashCode() {
            return this.content.hashCode() + (this.title.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("CollapsibleDetail(title=", this.title, ", content=", this.content, ")");
        }
    }

    public CollapsibleDetailsSection(List list) {
        list.getClass();
        this.collapsibleDetails = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CollapsibleDetailsSection) && Intrinsics.areEqual(this.collapsibleDetails, ((CollapsibleDetailsSection) obj).collapsibleDetails);
    }

    public final int hashCode() {
        return this.collapsibleDetails.hashCode();
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m("CollapsibleDetailsSection(collapsibleDetails=", ")", this.collapsibleDetails);
    }
}
