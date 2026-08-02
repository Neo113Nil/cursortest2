package com.squareup.cash.appmessages.sheet;

import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.protos.cash.messagingplatformcommon.app.Image;
import com.squareup.protos.cash.ui.Color;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface SheetAppMessageModel {

    public final class CtaButton {
        public final String text;
        public final Color textColor;
        public final String urlToOpen;

        public CtaButton(Color color, String str, String str2) {
            str.getClass();
            color.getClass();
            str2.getClass();
            this.text = str;
            this.textColor = color;
            this.urlToOpen = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CtaButton)) {
                return false;
            }
            CtaButton ctaButton = (CtaButton) obj;
            return Intrinsics.areEqual(this.text, ctaButton.text) && Intrinsics.areEqual(this.textColor, ctaButton.textColor) && Intrinsics.areEqual(this.urlToOpen, ctaButton.urlToOpen);
        }

        public final int hashCode() {
            return this.urlToOpen.hashCode() + SVG$Unit$EnumUnboxingLocalUtility.m(this.textColor, this.text.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CtaButton(text=");
            sb.append(this.text);
            sb.append(", textColor=");
            sb.append(this.textColor);
            sb.append(", urlToOpen=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.urlToOpen, ")");
        }
    }

    public final class Loaded implements SheetAppMessageModel {
        public final Color headerGradient;
        public final Image headerImage;
        public final boolean isSolid;
        public final BetterNavigator.ScreenNavigator navigator;
        public final CtaButton primaryCta;
        public final CtaButton secondaryCta;
        public final ShareSheet shareSheet;
        public final String subtitle;
        public final String title;
        public final String treehouseContentToken;

        public Loaded(Image image, String str, String str2, Color color, CtaButton ctaButton, CtaButton ctaButton2, String str3, ShareSheet shareSheet, boolean z, BetterNavigator.ScreenNavigator screenNavigator) {
            str.getClass();
            color.getClass();
            this.headerImage = image;
            this.title = str;
            this.subtitle = str2;
            this.headerGradient = color;
            this.primaryCta = ctaButton;
            this.secondaryCta = ctaButton2;
            this.treehouseContentToken = str3;
            this.shareSheet = shareSheet;
            this.isSolid = z;
            this.navigator = screenNavigator;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Loaded) {
                Loaded loaded = (Loaded) obj;
                return this.headerImage.equals(loaded.headerImage) && Intrinsics.areEqual(this.title, loaded.title) && Intrinsics.areEqual(this.subtitle, loaded.subtitle) && Intrinsics.areEqual(this.headerGradient, loaded.headerGradient) && this.primaryCta.equals(loaded.primaryCta) && Intrinsics.areEqual(this.secondaryCta, loaded.secondaryCta) && Intrinsics.areEqual(this.treehouseContentToken, loaded.treehouseContentToken) && Intrinsics.areEqual(this.shareSheet, loaded.shareSheet) && this.isSolid == loaded.isSolid && this.navigator == loaded.navigator;
            }
            return false;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.headerImage.hashCode() * 31, 31, this.title);
            String str = this.subtitle;
            int hashCode = (this.primaryCta.hashCode() + SVG$Unit$EnumUnboxingLocalUtility.m(this.headerGradient, (m + (str == null ? 0 : str.hashCode())) * 31, 31)) * 31;
            CtaButton ctaButton = this.secondaryCta;
            int hashCode2 = (hashCode + (ctaButton == null ? 0 : ctaButton.hashCode())) * 31;
            String str2 = this.treehouseContentToken;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            ShareSheet shareSheet = this.shareSheet;
            return this.navigator.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode3 + (shareSheet != null ? shareSheet.message.hashCode() : 0)) * 31, 31, this.isSolid);
        }

        public final String toString() {
            return "Loaded(headerImage=" + this.headerImage + ", title=" + this.title + ", subtitle=" + this.subtitle + ", headerGradient=" + this.headerGradient + ", primaryCta=" + this.primaryCta + ", secondaryCta=" + this.secondaryCta + ", treehouseContentToken=" + this.treehouseContentToken + ", shareSheet=" + this.shareSheet + ", isSolid=" + this.isSolid + ", navigator=" + this.navigator + ")";
        }
    }

    public final class Loading implements SheetAppMessageModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -757648812;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public final class ShareSheet {
        public final String message;

        public ShareSheet(String str) {
            this.message = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShareSheet) && this.message.equals(((ShareSheet) obj).message);
        }

        public final int hashCode() {
            return this.message.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ShareSheet(message=", this.message, ")");
        }
    }
}
