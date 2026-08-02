package androidx.compose.ui.text;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.compose.ui.text.AnnotatedString;
import com.squareup.cash.activity.views.receipts.ReceiptUiKt$$ExternalSyntheticLambda47;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class LinkAnnotation implements AnnotatedString.Annotation {

    public final class Clickable extends LinkAnnotation {
        public final LinkInteractionListener linkInteractionListener;
        public final TextLinkStyles styles;
        public final String tag;

        public Clickable(String str, TextLinkStyles textLinkStyles, LinkInteractionListener linkInteractionListener) {
            this.tag = str;
            this.styles = textLinkStyles;
            this.linkInteractionListener = linkInteractionListener;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Clickable)) {
                return false;
            }
            Clickable clickable = (Clickable) obj;
            return Intrinsics.areEqual(this.tag, clickable.tag) && Intrinsics.areEqual(this.styles, clickable.styles) && Intrinsics.areEqual(this.linkInteractionListener, clickable.linkInteractionListener);
        }

        @Override // androidx.compose.ui.text.LinkAnnotation
        public final LinkInteractionListener getLinkInteractionListener() {
            return this.linkInteractionListener;
        }

        @Override // androidx.compose.ui.text.LinkAnnotation
        public final TextLinkStyles getStyles() {
            return this.styles;
        }

        public final String getTag() {
            return this.tag;
        }

        public final int hashCode() {
            int hashCode = this.tag.hashCode() * 31;
            TextLinkStyles textLinkStyles = this.styles;
            int hashCode2 = (hashCode + (textLinkStyles != null ? textLinkStyles.hashCode() : 0)) * 31;
            LinkInteractionListener linkInteractionListener = this.linkInteractionListener;
            return hashCode2 + (linkInteractionListener != null ? linkInteractionListener.hashCode() : 0);
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m(new StringBuilder("LinkAnnotation.Clickable(tag="), this.tag, ')');
        }
    }

    public abstract LinkInteractionListener getLinkInteractionListener();

    public abstract TextLinkStyles getStyles();

    public final class Url extends LinkAnnotation {
        public final LinkInteractionListener linkInteractionListener;
        public final TextLinkStyles styles;
        public final String url;

        public /* synthetic */ Url(String str, TextLinkStyles textLinkStyles, ReceiptUiKt$$ExternalSyntheticLambda47 receiptUiKt$$ExternalSyntheticLambda47, int i) {
            this(str, (i & 2) != 0 ? null : textLinkStyles, (i & 4) != 0 ? null : receiptUiKt$$ExternalSyntheticLambda47);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Url)) {
                return false;
            }
            Url url = (Url) obj;
            return Intrinsics.areEqual(this.url, url.url) && Intrinsics.areEqual(this.styles, url.styles) && Intrinsics.areEqual(this.linkInteractionListener, url.linkInteractionListener);
        }

        @Override // androidx.compose.ui.text.LinkAnnotation
        public final LinkInteractionListener getLinkInteractionListener() {
            return this.linkInteractionListener;
        }

        @Override // androidx.compose.ui.text.LinkAnnotation
        public final TextLinkStyles getStyles() {
            return this.styles;
        }

        public final String getUrl() {
            return this.url;
        }

        public final int hashCode() {
            int hashCode = this.url.hashCode() * 31;
            TextLinkStyles textLinkStyles = this.styles;
            int hashCode2 = (hashCode + (textLinkStyles != null ? textLinkStyles.hashCode() : 0)) * 31;
            LinkInteractionListener linkInteractionListener = this.linkInteractionListener;
            return hashCode2 + (linkInteractionListener != null ? linkInteractionListener.hashCode() : 0);
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m(new StringBuilder("LinkAnnotation.Url(url="), this.url, ')');
        }

        public Url(String str, TextLinkStyles textLinkStyles, LinkInteractionListener linkInteractionListener) {
            this.url = str;
            this.styles = textLinkStyles;
            this.linkInteractionListener = linkInteractionListener;
        }
    }
}
