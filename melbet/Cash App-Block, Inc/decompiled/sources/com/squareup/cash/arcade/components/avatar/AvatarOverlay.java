package com.squareup.cash.arcade.components.avatar;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.internal.UtilsKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.image.PainterRequest;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.ULong;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface AvatarOverlay {

    public interface Local extends AvatarOverlay {
    }

    public final class LocalResource implements Local {
        public final long backgroundColor;
        public final boolean colorizeImage;
        public final int drawableResId;
        public final long tintColor;

        public LocalResource(int i, long j, long j2, boolean z) {
            this.drawableResId = i;
            this.backgroundColor = j;
            this.tintColor = j2;
            this.colorizeImage = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LocalResource)) {
                return false;
            }
            LocalResource localResource = (LocalResource) obj;
            return this.drawableResId == localResource.drawableResId && Color.m676equalsimpl0(this.backgroundColor, localResource.backgroundColor) && Color.m676equalsimpl0(this.tintColor, localResource.tintColor) && this.colorizeImage == localResource.colorizeImage;
        }

        @Override // com.squareup.cash.arcade.components.avatar.AvatarOverlay
        /* renamed from: getBackgroundColor-0d7_KjU */
        public final long mo3385getBackgroundColor0d7_KjU() {
            return this.backgroundColor;
        }

        @Override // com.squareup.cash.arcade.components.avatar.AvatarOverlay
        public final boolean getColorizeImage() {
            return this.colorizeImage;
        }

        @Override // com.squareup.cash.arcade.components.avatar.AvatarOverlay
        /* renamed from: getTintColor-0d7_KjU */
        public final long mo3386getTintColor0d7_KjU() {
            return this.tintColor;
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.drawableResId) * 31;
            int i = Color.$r8$clinit;
            ULong.Companion companion = ULong.Companion;
            return Boolean.hashCode(this.colorizeImage) + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(hashCode, 31, this.backgroundColor), 31, this.tintColor);
        }

        public final String toString() {
            String m682toStringimpl = Color.m682toStringimpl(this.backgroundColor);
            return re$$ExternalSyntheticOutline0.m(re$$ExternalSyntheticOutline0.m("LocalResource(drawableResId=", this.drawableResId, ", backgroundColor=", m682toStringimpl, ", tintColor="), Color.m682toStringimpl(this.tintColor), ", colorizeImage=", this.colorizeImage, ")");
        }
    }

    public final class RemoteImage implements AvatarOverlay {
        public final long backgroundColor;
        public final boolean colorizeImage;
        public final String imageUrl;
        public final Function3 loadPainter;
        public final Local placeholder;
        public final long tintColor;

        public RemoteImage(String str, boolean z, long j, long j2, LocalIcon localIcon, Function3 function3, int i) {
            j = (i & 4) != 0 ? Color.Unspecified : j;
            j2 = (i & 8) != 0 ? Color.Unspecified : j2;
            localIcon = (i & 16) != 0 ? null : localIcon;
            function3.getClass();
            this.imageUrl = str;
            this.colorizeImage = z;
            this.backgroundColor = j;
            this.tintColor = j2;
            this.placeholder = localIcon;
            this.loadPainter = function3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RemoteImage)) {
                return false;
            }
            RemoteImage remoteImage = (RemoteImage) obj;
            return Intrinsics.areEqual(this.imageUrl, remoteImage.imageUrl) && this.colorizeImage == remoteImage.colorizeImage && Color.m676equalsimpl0(this.backgroundColor, remoteImage.backgroundColor) && Color.m676equalsimpl0(this.tintColor, remoteImage.tintColor) && Intrinsics.areEqual(this.placeholder, remoteImage.placeholder) && Intrinsics.areEqual(this.loadPainter, remoteImage.loadPainter);
        }

        @Override // com.squareup.cash.arcade.components.avatar.AvatarOverlay
        /* renamed from: getBackgroundColor-0d7_KjU */
        public final long mo3385getBackgroundColor0d7_KjU() {
            return this.backgroundColor;
        }

        @Override // com.squareup.cash.arcade.components.avatar.AvatarOverlay
        public final boolean getColorizeImage() {
            return this.colorizeImage;
        }

        @Override // com.squareup.cash.arcade.components.avatar.AvatarOverlay
        /* renamed from: getTintColor-0d7_KjU */
        public final long mo3386getTintColor0d7_KjU() {
            return this.tintColor;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.imageUrl.hashCode() * 31, 31, this.colorizeImage);
            int i = Color.$r8$clinit;
            ULong.Companion companion = ULong.Companion;
            int m2 = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(m, 31, this.backgroundColor), 31, this.tintColor);
            Local local = this.placeholder;
            return this.loadPainter.hashCode() + ((m2 + (local == null ? 0 : local.hashCode())) * 31);
        }

        public final String toString() {
            String m682toStringimpl = Color.m682toStringimpl(this.backgroundColor);
            String m682toStringimpl2 = Color.m682toStringimpl(this.tintColor);
            StringBuilder m1540m = Request$Priority$EnumUnboxingLocalUtility.m1540m("RemoteImage(imageUrl=", this.imageUrl, ", colorizeImage=", ", backgroundColor=", this.colorizeImage);
            Boxes$$ExternalSyntheticOutline1.m(m1540m, m682toStringimpl, ", tintColor=", m682toStringimpl2, ", placeholder=");
            m1540m.append(this.placeholder);
            m1540m.append(", loadPainter=");
            m1540m.append(this.loadPainter);
            m1540m.append(")");
            return m1540m.toString();
        }
    }

    /* renamed from: backgroundColor-WaAFU9c, reason: not valid java name */
    default long m3384backgroundColorWaAFU9c(Composer composer) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-302516139);
        long mo3385getBackgroundColor0d7_KjU = mo3385getBackgroundColor0d7_KjU();
        if (mo3385getBackgroundColor0d7_KjU == 16) {
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            mo3385getBackgroundColor0d7_KjU = colors.semantic.background.subtle;
        }
        gapComposer.end(false);
        return mo3385getBackgroundColor0d7_KjU;
    }

    default BlendModeColorFilter colorFilter(Composer composer) {
        Color color;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(586928647);
        if (getColorizeImage()) {
            gapComposer.startReplaceGroup(379506023);
            long mo3386getTintColor0d7_KjU = mo3386getTintColor0d7_KjU();
            if (mo3386getTintColor0d7_KjU == 16) {
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                mo3386getTintColor0d7_KjU = colors.semantic.icon.standard;
            }
            color = Recorder$$ExternalSyntheticOutline1.m(gapComposer, false, mo3386getTintColor0d7_KjU);
        } else {
            gapComposer.startReplaceGroup(379593381);
            gapComposer.end(false);
            color = null;
        }
        BlendModeColorFilter m3398tintFilter8_81llA = color != null ? UtilsKt.m3398tintFilter8_81llA(color.value) : null;
        gapComposer.end(false);
        return m3398tintFilter8_81llA;
    }

    /* renamed from: getBackgroundColor-0d7_KjU, reason: not valid java name */
    long mo3385getBackgroundColor0d7_KjU();

    boolean getColorizeImage();

    /* renamed from: getTintColor-0d7_KjU, reason: not valid java name */
    long mo3386getTintColor0d7_KjU();

    default Painter painter(PainterRequest painterRequest, GapComposer gapComposer) {
        Painter painterResource;
        PainterRequest painterRequest2;
        gapComposer.startReplaceGroup(1070891512);
        if (this instanceof RemoteImage) {
            gapComposer.startReplaceGroup(-1665403091);
            RemoteImage remoteImage = (RemoteImage) this;
            if (painterRequest != null) {
                painterRequest2 = PainterRequest.copy$default(painterRequest, painterRequest.onError);
            } else {
                String str = remoteImage.imageUrl;
                painterRequest2 = new PainterRequest(str, str, null);
            }
            painterResource = (Painter) remoteImage.loadPainter.invoke(painterRequest2, gapComposer, 0);
            gapComposer.end(false);
        } else if (this instanceof LocalIcon) {
            gapComposer.startReplaceGroup(-1665396543);
            painterResource = ((LocalIcon) this).icon.painter(gapComposer);
            gapComposer.end(false);
        } else {
            if (!(this instanceof LocalResource)) {
                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -1665404411, false);
            }
            gapComposer.startReplaceGroup(-1665395365);
            painterResource = Countries.painterResource(((LocalResource) this).drawableResId, 0, gapComposer);
            gapComposer.end(false);
        }
        gapComposer.end(false);
        return painterResource;
    }

    public final class LocalIcon implements Local {
        public final long backgroundColor;
        public final boolean colorizeImage;
        public final Icons icon;
        public final long tintColor;

        public LocalIcon(int i, long j, long j2, Icons icons) {
            this(icons, (i & 2) != 0 ? Color.Unspecified : j, (i & 4) != 0 ? Color.Unspecified : j2, true);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LocalIcon)) {
                return false;
            }
            LocalIcon localIcon = (LocalIcon) obj;
            return this.icon == localIcon.icon && Color.m676equalsimpl0(this.backgroundColor, localIcon.backgroundColor) && Color.m676equalsimpl0(this.tintColor, localIcon.tintColor) && this.colorizeImage == localIcon.colorizeImage;
        }

        @Override // com.squareup.cash.arcade.components.avatar.AvatarOverlay
        /* renamed from: getBackgroundColor-0d7_KjU */
        public final long mo3385getBackgroundColor0d7_KjU() {
            return this.backgroundColor;
        }

        @Override // com.squareup.cash.arcade.components.avatar.AvatarOverlay
        public final boolean getColorizeImage() {
            return this.colorizeImage;
        }

        @Override // com.squareup.cash.arcade.components.avatar.AvatarOverlay
        /* renamed from: getTintColor-0d7_KjU */
        public final long mo3386getTintColor0d7_KjU() {
            return this.tintColor;
        }

        public final int hashCode() {
            int hashCode = this.icon.hashCode() * 31;
            int i = Color.$r8$clinit;
            ULong.Companion companion = ULong.Companion;
            return Boolean.hashCode(this.colorizeImage) + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(hashCode, 31, this.backgroundColor), 31, this.tintColor);
        }

        public final String toString() {
            String m682toStringimpl = Color.m682toStringimpl(this.backgroundColor);
            String m682toStringimpl2 = Color.m682toStringimpl(this.tintColor);
            StringBuilder sb = new StringBuilder("LocalIcon(icon=");
            sb.append(this.icon);
            sb.append(", backgroundColor=");
            sb.append(m682toStringimpl);
            sb.append(", tintColor=");
            return re$$ExternalSyntheticOutline0.m(sb, m682toStringimpl2, ", colorizeImage=", this.colorizeImage, ")");
        }

        public LocalIcon(Icons icons, long j, long j2, boolean z) {
            icons.getClass();
            this.icon = icons;
            this.backgroundColor = j;
            this.tintColor = j2;
            this.colorizeImage = z;
        }
    }
}
