package com.squareup.cash.appmessages.sheet;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface SheetAppMessageEvent {

    public final class BackClicked implements SheetAppMessageEvent {
        public static final BackClicked INSTANCE = new BackClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BackClicked);
        }

        public final int hashCode() {
            return -1368523703;
        }

        public final String toString() {
            return "BackClicked";
        }
    }

    /* loaded from: classes4.dex */
    public final class CtaButtonClicked implements SheetAppMessageEvent {
        public final String buttonText;
        public final boolean isHeroContent;
        public final String urlToOpen;

        public CtaButtonClicked(String str, String str2, boolean z) {
            str.getClass();
            str2.getClass();
            this.urlToOpen = str;
            this.buttonText = str2;
            this.isHeroContent = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CtaButtonClicked)) {
                return false;
            }
            CtaButtonClicked ctaButtonClicked = (CtaButtonClicked) obj;
            return Intrinsics.areEqual(this.urlToOpen, ctaButtonClicked.urlToOpen) && Intrinsics.areEqual(this.buttonText, ctaButtonClicked.buttonText) && this.isHeroContent == ctaButtonClicked.isHeroContent;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isHeroContent) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.urlToOpen.hashCode() * 31, 31, this.buttonText);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CtaButtonClicked(urlToOpen=", this.urlToOpen, ", buttonText=", this.buttonText, ", isHeroContent="), this.isHeroContent, ")");
        }
    }

    public final class ShareClicked implements SheetAppMessageEvent {
        public static final ShareClicked INSTANCE = new ShareClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ShareClicked);
        }

        public final int hashCode() {
            return 841127263;
        }

        public final String toString() {
            return "ShareClicked";
        }
    }

    public final class ViewedTreehouseContent implements SheetAppMessageEvent {
        public static final ViewedTreehouseContent INSTANCE = new ViewedTreehouseContent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ViewedTreehouseContent);
        }

        public final int hashCode() {
            return -98124974;
        }

        public final String toString() {
            return "ViewedTreehouseContent";
        }
    }
}
