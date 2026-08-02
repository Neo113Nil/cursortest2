package com.squareup.cash.shopping.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.squareup.protos.cash.discover.api.app.v1.model.HorizontalAlignment;
import com.squareup.protos.cash.discover.api.app.v1.model.Text;
import com.squareup.protos.cash.genericelements.ui.Alignment;
import com.squareup.protos.cash.ui.Color;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class ShoppingInfoSheetViewModel$BulletedListInfoSheetViewModel {

    public final class Loading extends ShoppingInfoSheetViewModel$BulletedListInfoSheetViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 36899688;
        }

        public final String toString() {
            return "Loading";
        }
    }

    /* loaded from: classes6.dex */
    public final class Loaded extends ShoppingInfoSheetViewModel$BulletedListInfoSheetViewModel {
        public final List bullets;
        public final ButtonModel button;
        public final Color buttonBackgroundColor;
        public final boolean buttonBelowFooter;
        public final Text footer;
        public final LogoImage logo;
        public final Text subtitle;
        public final Text title;
        public final HorizontalAlignment titleAlignment;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Loaded(Text text, Text text2, List list, ButtonModel buttonModel, Text text3, int i) {
            this(null, text, (i & 8) != 0 ? null : text2, list, buttonModel, null, text3, (i & 256) == 0);
            Alignment.Companion companion = HorizontalAlignment.Companion;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return Intrinsics.areEqual(this.logo, loaded.logo) && this.titleAlignment == loaded.titleAlignment && Intrinsics.areEqual(this.title, loaded.title) && Intrinsics.areEqual(this.subtitle, loaded.subtitle) && Intrinsics.areEqual(this.bullets, loaded.bullets) && Intrinsics.areEqual(this.button, loaded.button) && Intrinsics.areEqual(this.buttonBackgroundColor, loaded.buttonBackgroundColor) && Intrinsics.areEqual(this.footer, loaded.footer) && this.buttonBelowFooter == loaded.buttonBelowFooter;
        }

        public final int hashCode() {
            LogoImage logoImage = this.logo;
            int hashCode = (this.title.hashCode() + ((this.titleAlignment.hashCode() + ((logoImage == null ? 0 : logoImage.hashCode()) * 31)) * 31)) * 31;
            Text text = this.subtitle;
            int hashCode2 = (this.button.hashCode() + Recorder$$ExternalSyntheticOutline2.m((hashCode + (text == null ? 0 : text.hashCode())) * 31, 31, this.bullets)) * 31;
            Color color = this.buttonBackgroundColor;
            int hashCode3 = (hashCode2 + (color == null ? 0 : color.hashCode())) * 31;
            Text text2 = this.footer;
            return Boolean.hashCode(this.buttonBelowFooter) + ((hashCode3 + (text2 != null ? text2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Loaded(logo=");
            sb.append(this.logo);
            sb.append(", titleAlignment=");
            sb.append(this.titleAlignment);
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", subtitle=");
            sb.append(this.subtitle);
            sb.append(", bullets=");
            sb.append(this.bullets);
            sb.append(", button=");
            sb.append(this.button);
            sb.append(", buttonBackgroundColor=");
            sb.append(this.buttonBackgroundColor);
            sb.append(", footer=");
            sb.append(this.footer);
            sb.append(", buttonBelowFooter=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.buttonBelowFooter, ")");
        }

        public Loaded(LogoImage logoImage, Text text, Text text2, List list, ButtonModel buttonModel, Color color, Text text3, boolean z) {
            HorizontalAlignment horizontalAlignment = HorizontalAlignment.LEFT;
            list.getClass();
            this.logo = logoImage;
            this.titleAlignment = horizontalAlignment;
            this.title = text;
            this.subtitle = text2;
            this.bullets = list;
            this.button = buttonModel;
            this.buttonBackgroundColor = color;
            this.footer = text3;
            this.buttonBelowFooter = z;
        }
    }
}
