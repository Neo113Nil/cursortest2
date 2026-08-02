package com.squareup.cash.arcade.components.avatar;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.ContentScale$Companion$Fit$1;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.CopyCodeKt$$ExternalSyntheticLambda5;
import com.squareup.cash.arcade.components.internal.UtilsKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.treehouse.NavBarBinding$$ExternalSyntheticLambda2;
import com.squareup.cash.composeUi.foundation.image.PainterRequest;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.ULong;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface AvatarImage {

    public interface Local extends AvatarImage {
    }

    public final class LocalIcon implements Local {
        public final boolean colorizeImage;
        public final Icons icon;
        public final CopyCodeKt$$ExternalSyntheticLambda5 onStateChange;
        public final long tintColor;

        public LocalIcon(Icons icons, long j, int i) {
            j = (i & 2) != 0 ? Remote.Defaults.tintColor : j;
            CopyCodeKt$$ExternalSyntheticLambda5 copyCodeKt$$ExternalSyntheticLambda5 = new CopyCodeKt$$ExternalSyntheticLambda5(28);
            icons.getClass();
            this.icon = icons;
            this.tintColor = j;
            this.onStateChange = copyCodeKt$$ExternalSyntheticLambda5;
            this.colorizeImage = true;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LocalIcon)) {
                return false;
            }
            LocalIcon localIcon = (LocalIcon) obj;
            return this.icon == localIcon.icon && Color.m676equalsimpl0(this.tintColor, localIcon.tintColor) && Intrinsics.areEqual(this.onStateChange, localIcon.onStateChange);
        }

        @Override // com.squareup.cash.arcade.components.avatar.AvatarImage
        public final boolean getColorizeImage() {
            return this.colorizeImage;
        }

        @Override // com.squareup.cash.arcade.components.avatar.AvatarImage
        public final Function1 getOnStateChange() {
            return this.onStateChange;
        }

        @Override // com.squareup.cash.arcade.components.avatar.AvatarImage
        /* renamed from: getTintColor-0d7_KjU */
        public final long mo3383getTintColor0d7_KjU() {
            return this.tintColor;
        }

        public final int hashCode() {
            int hashCode = this.icon.hashCode() * 31;
            int i = Color.$r8$clinit;
            ULong.Companion companion = ULong.Companion;
            return this.onStateChange.hashCode() + Recorder$$ExternalSyntheticOutline2.m(hashCode, 31, this.tintColor);
        }

        public final String toString() {
            return "LocalIcon(icon=" + this.icon + ", tintColor=" + Color.m682toStringimpl(this.tintColor) + ", onStateChange=" + this.onStateChange + ")";
        }
    }

    public interface Remote extends AvatarImage {

        public abstract class Defaults {
            public static final ContentScale$Companion$Fit$1 contentScale = ContentScale.Companion.Fit;
            public static final long tintColor = Color.Unspecified;
        }

        public final class Icon implements Remote {
            public final boolean colorizeImage;
            public final String imageUrl;
            public final Function3 loadPainter;
            public final Function1 onStateChange;
            public final LocalIcon placeholder;
            public final long tintColor;

            public Icon(String str, boolean z, LocalIcon localIcon, Function3 function3, int i) {
                z = (i & 2) != 0 ? false : z;
                long j = Defaults.tintColor;
                NavBarBinding$$ExternalSyntheticLambda2 navBarBinding$$ExternalSyntheticLambda2 = new NavBarBinding$$ExternalSyntheticLambda2(1);
                this.imageUrl = str;
                this.colorizeImage = z;
                this.placeholder = localIcon;
                this.tintColor = j;
                this.onStateChange = navBarBinding$$ExternalSyntheticLambda2;
                this.loadPainter = function3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Icon)) {
                    return false;
                }
                Icon icon = (Icon) obj;
                return Intrinsics.areEqual(this.imageUrl, icon.imageUrl) && this.colorizeImage == icon.colorizeImage && Intrinsics.areEqual(this.placeholder, icon.placeholder) && Color.m676equalsimpl0(this.tintColor, icon.tintColor) && Intrinsics.areEqual(this.onStateChange, icon.onStateChange) && Intrinsics.areEqual(this.loadPainter, icon.loadPainter);
            }

            @Override // com.squareup.cash.arcade.components.avatar.AvatarImage
            public final boolean getColorizeImage() {
                return this.colorizeImage;
            }

            @Override // com.squareup.cash.arcade.components.avatar.AvatarImage.Remote
            public final String getImageUrl() {
                return this.imageUrl;
            }

            @Override // com.squareup.cash.arcade.components.avatar.AvatarImage.Remote
            public final Function3 getLoadPainter() {
                return this.loadPainter;
            }

            @Override // com.squareup.cash.arcade.components.avatar.AvatarImage
            public final Function1 getOnStateChange() {
                return this.onStateChange;
            }

            @Override // com.squareup.cash.arcade.components.avatar.AvatarImage.Remote
            public final Local getPlaceholder$1() {
                return this.placeholder;
            }

            @Override // com.squareup.cash.arcade.components.avatar.AvatarImage
            /* renamed from: getTintColor-0d7_KjU */
            public final long mo3383getTintColor0d7_KjU() {
                return this.tintColor;
            }

            public final int hashCode() {
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.imageUrl.hashCode() * 31, 31, this.colorizeImage);
                LocalIcon localIcon = this.placeholder;
                int hashCode = (m + (localIcon == null ? 0 : localIcon.hashCode())) * 31;
                int i = Color.$r8$clinit;
                ULong.Companion companion = ULong.Companion;
                return this.loadPainter.hashCode() + Recorder$$ExternalSyntheticOutline1.m(Recorder$$ExternalSyntheticOutline2.m(hashCode, 31, this.tintColor), 31, this.onStateChange);
            }

            public final String toString() {
                String m682toStringimpl = Color.m682toStringimpl(this.tintColor);
                StringBuilder m1540m = Request$Priority$EnumUnboxingLocalUtility.m1540m("Icon(imageUrl=", this.imageUrl, ", colorizeImage=", ", placeholder=", this.colorizeImage);
                m1540m.append(this.placeholder);
                m1540m.append(", tintColor=");
                m1540m.append(m682toStringimpl);
                m1540m.append(", onStateChange=");
                m1540m.append(this.onStateChange);
                m1540m.append(", loadPainter=");
                m1540m.append(this.loadPainter);
                m1540m.append(")");
                return m1540m.toString();
            }
        }

        public final class Image implements Remote {
            public final boolean colorizeImage;
            public final ContentScale contentScale;
            public final String imageUrl;
            public final Function3 loadPainter;
            public final Function1 onStateChange;
            public final Local placeholder;
            public final long tintColor;

            public Image(String str, boolean z, Local local, long j, Function3 function3, int i) {
                z = (i & 2) != 0 ? false : z;
                local = (i & 4) != 0 ? null : local;
                ContentScale$Companion$Fit$1 contentScale$Companion$Fit$1 = (i & 8) != 0 ? Defaults.contentScale : ContentScale.Companion.Crop;
                j = (i & 16) != 0 ? Color.Unspecified : j;
                NavBarBinding$$ExternalSyntheticLambda2 navBarBinding$$ExternalSyntheticLambda2 = new NavBarBinding$$ExternalSyntheticLambda2(2);
                str.getClass();
                contentScale$Companion$Fit$1.getClass();
                function3.getClass();
                this.imageUrl = str;
                this.colorizeImage = z;
                this.placeholder = local;
                this.contentScale = contentScale$Companion$Fit$1;
                this.tintColor = j;
                this.onStateChange = navBarBinding$$ExternalSyntheticLambda2;
                this.loadPainter = function3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Image)) {
                    return false;
                }
                Image image = (Image) obj;
                return Intrinsics.areEqual(this.imageUrl, image.imageUrl) && this.colorizeImage == image.colorizeImage && Intrinsics.areEqual(this.placeholder, image.placeholder) && Intrinsics.areEqual(this.contentScale, image.contentScale) && Color.m676equalsimpl0(this.tintColor, image.tintColor) && Intrinsics.areEqual(this.onStateChange, image.onStateChange) && Intrinsics.areEqual(this.loadPainter, image.loadPainter);
            }

            @Override // com.squareup.cash.arcade.components.avatar.AvatarImage
            public final boolean getColorizeImage() {
                return this.colorizeImage;
            }

            @Override // com.squareup.cash.arcade.components.avatar.AvatarImage
            public final ContentScale getContentScale() {
                return this.contentScale;
            }

            @Override // com.squareup.cash.arcade.components.avatar.AvatarImage.Remote
            public final String getImageUrl() {
                return this.imageUrl;
            }

            @Override // com.squareup.cash.arcade.components.avatar.AvatarImage.Remote
            public final Function3 getLoadPainter() {
                return this.loadPainter;
            }

            @Override // com.squareup.cash.arcade.components.avatar.AvatarImage
            public final Function1 getOnStateChange() {
                return this.onStateChange;
            }

            @Override // com.squareup.cash.arcade.components.avatar.AvatarImage.Remote
            public final Local getPlaceholder$1() {
                return this.placeholder;
            }

            @Override // com.squareup.cash.arcade.components.avatar.AvatarImage
            /* renamed from: getTintColor-0d7_KjU */
            public final long mo3383getTintColor0d7_KjU() {
                return this.tintColor;
            }

            public final int hashCode() {
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.imageUrl.hashCode() * 31, 31, this.colorizeImage);
                Local local = this.placeholder;
                int hashCode = (this.contentScale.hashCode() + ((m + (local == null ? 0 : local.hashCode())) * 31)) * 31;
                int i = Color.$r8$clinit;
                ULong.Companion companion = ULong.Companion;
                return this.loadPainter.hashCode() + Recorder$$ExternalSyntheticOutline1.m(Recorder$$ExternalSyntheticOutline2.m(hashCode, 31, this.tintColor), 31, this.onStateChange);
            }

            public final String toString() {
                String m682toStringimpl = Color.m682toStringimpl(this.tintColor);
                StringBuilder m1540m = Request$Priority$EnumUnboxingLocalUtility.m1540m("Image(imageUrl=", this.imageUrl, ", colorizeImage=", ", placeholder=", this.colorizeImage);
                m1540m.append(this.placeholder);
                m1540m.append(", contentScale=");
                m1540m.append(this.contentScale);
                m1540m.append(", tintColor=");
                m1540m.append(m682toStringimpl);
                m1540m.append(", onStateChange=");
                m1540m.append(this.onStateChange);
                m1540m.append(", loadPainter=");
                m1540m.append(this.loadPainter);
                m1540m.append(")");
                return m1540m.toString();
            }
        }

        String getImageUrl();

        Function3 getLoadPainter();

        Local getPlaceholder$1();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class State {
        public static final /* synthetic */ State[] $VALUES;
        public static final State Loading;
        public static final State NoPainterFound;
        public static final State Success;

        static {
            State state = new State("Loading", 0);
            Loading = state;
            State state2 = new State("Success", 1);
            Success = state2;
            State state3 = new State("NoPainterFound", 2);
            NoPainterFound = state3;
            $VALUES = new State[]{state, state2, state3};
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    default BlendModeColorFilter colorFilter(Composer composer) {
        BlendModeColorFilter blendModeColorFilter;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-973080110);
        if (getColorizeImage()) {
            gapComposer.startReplaceGroup(1999750388);
            long mo3383getTintColor0d7_KjU = mo3383getTintColor0d7_KjU();
            if (mo3383getTintColor0d7_KjU == 16) {
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                mo3383getTintColor0d7_KjU = colors.semantic.icon.inverse;
            }
            blendModeColorFilter = UtilsKt.m3398tintFilter8_81llA(mo3383getTintColor0d7_KjU);
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(1999845310);
            gapComposer.end(false);
            blendModeColorFilter = null;
        }
        gapComposer.end(false);
        return blendModeColorFilter;
    }

    boolean getColorizeImage();

    default ContentScale getContentScale() {
        return ContentScale.Companion.Fit;
    }

    Function1 getOnStateChange();

    /* renamed from: getTintColor-0d7_KjU, reason: not valid java name */
    long mo3383getTintColor0d7_KjU();

    default Painter painter(PainterRequest painterRequest, Composer composer) {
        Painter painterResource;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1468665341);
        getOnStateChange().invoke(State.Loading);
        if (this instanceof Remote) {
            gapComposer.startReplaceGroup(1656853304);
            Remote remote = (Remote) this;
            painterResource = (Painter) remote.getLoadPainter().invoke(painterRequest != null ? PainterRequest.copy$default(painterRequest, painterRequest.onError) : new PainterRequest(remote.getImageUrl(), remote.getImageUrl(), null), gapComposer, 0);
            gapComposer.end(false);
        } else if (this instanceof LocalIcon) {
            gapComposer.startReplaceGroup(1656859852);
            painterResource = ((LocalIcon) this).icon.painter(gapComposer);
            gapComposer.end(false);
        } else {
            if (!(this instanceof LocalResource)) {
                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1656852212, false);
            }
            gapComposer.startReplaceGroup(1656863273);
            painterResource = Countries.painterResource(((LocalResource) this).drawableResource, 0, gapComposer);
            gapComposer.end(false);
        }
        if (painterResource == null) {
            getOnStateChange().invoke(State.NoPainterFound);
        } else {
            getOnStateChange().invoke(State.Success);
        }
        gapComposer.end(false);
        return painterResource;
    }

    public final class LocalResource implements Local {
        public final boolean colorizeImage;
        public final ContentScale contentScale;
        public final int drawableResource;
        public final Function1 onStateChange;
        public final long tintColor;

        public LocalResource(int i, long j, boolean z, ContentScale contentScale, Function1 function1) {
            contentScale.getClass();
            function1.getClass();
            this.drawableResource = i;
            this.tintColor = j;
            this.colorizeImage = z;
            this.contentScale = contentScale;
            this.onStateChange = function1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LocalResource)) {
                return false;
            }
            LocalResource localResource = (LocalResource) obj;
            return this.drawableResource == localResource.drawableResource && Color.m676equalsimpl0(this.tintColor, localResource.tintColor) && this.colorizeImage == localResource.colorizeImage && Intrinsics.areEqual(this.contentScale, localResource.contentScale) && Intrinsics.areEqual(this.onStateChange, localResource.onStateChange);
        }

        @Override // com.squareup.cash.arcade.components.avatar.AvatarImage
        public final boolean getColorizeImage() {
            return this.colorizeImage;
        }

        @Override // com.squareup.cash.arcade.components.avatar.AvatarImage
        public final ContentScale getContentScale() {
            return this.contentScale;
        }

        @Override // com.squareup.cash.arcade.components.avatar.AvatarImage
        public final Function1 getOnStateChange() {
            return this.onStateChange;
        }

        @Override // com.squareup.cash.arcade.components.avatar.AvatarImage
        /* renamed from: getTintColor-0d7_KjU */
        public final long mo3383getTintColor0d7_KjU() {
            return this.tintColor;
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.drawableResource) * 31;
            int i = Color.$r8$clinit;
            ULong.Companion companion = ULong.Companion;
            return this.onStateChange.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.contentScale.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(hashCode, 31, this.tintColor), 31, this.colorizeImage)) * 31, 31, false);
        }

        public final String toString() {
            StringBuilder m = re$$ExternalSyntheticOutline0.m("LocalResource(drawableResource=", this.drawableResource, ", tintColor=", Color.m682toStringimpl(this.tintColor), ", colorizeImage=");
            m.append(this.colorizeImage);
            m.append(", contentScale=");
            m.append(this.contentScale);
            m.append(", isIcon=false, onStateChange=");
            m.append(this.onStateChange);
            m.append(")");
            return m.toString();
        }

        public LocalResource(int i) {
            this(i, Remote.Defaults.tintColor, false, Remote.Defaults.contentScale, new CopyCodeKt$$ExternalSyntheticLambda5(29));
        }
    }
}
