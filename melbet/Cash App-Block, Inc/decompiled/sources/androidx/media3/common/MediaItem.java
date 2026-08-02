package androidx.media3.common;

import android.net.Uri;
import androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.video.internal.utils.StorageUtil;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.semantics.Role;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.common.util.Util;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.RegularImmutableList;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.theme.RippleKt;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.moneybot.genie.TextViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.moneybot.widgets.ComposerKt$$ExternalSyntheticLambda14;
import com.squareup.cash.payments.views.ToViewKt$$ExternalSyntheticLambda0;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import net.idrnd.misnap.iad.IadFrame;

/* loaded from: classes3.dex */
public final class MediaItem {
    public final ClippingProperties clippingConfiguration;
    public final LiveConfiguration liveConfiguration;
    public final LocalConfiguration localConfiguration;
    public final String mediaId;
    public final MediaMetadata mediaMetadata;
    public final RequestMetadata requestMetadata;

    public class ClippingConfiguration {
        public final long endPositionUs;

        static {
            new ClippingConfiguration(new IadFrame());
            Util.intToStringMaxRadix(0);
            Util.intToStringMaxRadix(1);
            Util.intToStringMaxRadix(2);
            Util.intToStringMaxRadix(3);
            Util.intToStringMaxRadix(4);
            Util.intToStringMaxRadix(5);
            Util.intToStringMaxRadix(6);
            Util.intToStringMaxRadix(7);
        }

        public ClippingConfiguration(IadFrame iadFrame) {
            String str = Util.DEVICE_DEBUG_INFO;
            this.endPositionUs = iadFrame.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ClippingConfiguration) && this.endPositionUs == ((ClippingConfiguration) obj).endPositionUs;
        }

        public final int hashCode() {
            long j = this.endPositionUs;
            return ((int) (j ^ (j >>> 32))) * 923521;
        }
    }

    public final class ClippingProperties extends ClippingConfiguration {
        static {
            new IadFrame().buildClippingProperties();
        }
    }

    public abstract class DrmConfiguration {
        public static final void DiscardAttachmentButton(int i, Composer composer, Modifier modifier, Function0 function0) {
            Function0 function02;
            function0.getClass();
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.startRestartGroup(-2117192574);
            int i2 = 16;
            int i3 = (gapComposer.changed(modifier) ? 4 : 2) | i | (gapComposer.changedInstance(function0) ? 32 : 16);
            if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                if (gapComposer.applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, 24.0f);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                BoxKt.Box(ImageKt.m177backgroundbw27NRU(m285size3ABfNKs, colors.semantic.background.f1047app, RoundedCornerShapeKt.CircleShape), gapComposer, 0);
                function02 = function0;
                StorageUtil.ButtonIcon(Icons.FailedFill24, Room.stringResource(gapComposer, R.string.support_chat_remove_file_button_content_description), function02, null, false, null, gapComposer, ((i3 << 3) & 896) | 6, 56);
                gapComposer.end(true);
            } else {
                function02 = function0;
                gapComposer.skipToGroupEnd();
            }
            RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.block = new ComposerKt$$ExternalSyntheticLambda14(modifier, function02, i, i2);
            }
        }

        public static final void ScrollToBottomButton(int i, Composer composer, String str, Function0 function0) {
            String str2;
            Function0 function02;
            function0.getClass();
            str.getClass();
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.startRestartGroup(-2057115954);
            int i2 = (gapComposer.changedInstance(function0) ? 4 : 2) | i | (gapComposer.changed(str) ? 32 : 16);
            if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion, 48.0f);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m285size3ABfNKs);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                if (gapComposer.applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                Modifier clip = ClipKt.clip(SizeKt.m285size3ABfNKs(companion, 32.0f), RoundedCornerShapeKt.CircleShape);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                BoxKt.Box(ImageKt.m177backgroundbw27NRU(clip, colors.component.button.standard.background.f163default, ColorKt.RectangleShape), gapComposer, 0);
                str2 = str;
                function02 = function0;
                StorageUtil.ButtonIcon(Icons.ExpandCentered24, str2, function02, null, false, null, gapComposer, (i2 & 112) | 6 | ((i2 << 6) & 896), 56);
                gapComposer.end(true);
            } else {
                str2 = str;
                function02 = function0;
                gapComposer.skipToGroupEnd();
            }
            RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.block = new ToViewKt$$ExternalSyntheticLambda0(function02, str2, i, 8);
            }
        }

        /* renamed from: SimpleChatButton-cf5BqRc, reason: not valid java name */
        public static final void m1139SimpleChatButtoncf5BqRc(Function0 function0, Modifier modifier, long j, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
            Function3 function3;
            Modifier modifier2;
            long j2;
            Modifier modifier3;
            long j3;
            function0.getClass();
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.startRestartGroup(-397967352);
            int i2 = i | (gapComposer.changedInstance(function0) ? 4 : 2) | EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE;
            int i3 = 1;
            if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
                gapComposer.startDefaults();
                if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    long j4 = colors.base.cashGreen10;
                    modifier3 = Modifier.Companion.$$INSTANCE;
                    j3 = j4;
                } else {
                    gapComposer.skipToGroupEnd();
                    modifier3 = modifier;
                    j3 = j;
                }
                gapComposer.endDefaults();
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                Object obj = DefaultSizes.border.entries;
                RoundedCornerShape m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(9999.0f);
                Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(4.0f, true, new OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0(Alignment.Companion.CenterHorizontally, i3));
                BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
                Modifier clip = ClipKt.clip(ImageKt.m177backgroundbw27NRU(SizeKt.m275defaultMinSizeVpY3zN4(modifier3, 48.0f, 48.0f), j3, m340RoundedCornerShape0680j_4), m340RoundedCornerShape0680j_4);
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
                }
                MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue;
                Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                long j5 = j3;
                Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(ImageKt.m182clickableO2vRcR0$default(clip, mutableInteractionSourceImpl, RippleKt.m3400rippleYJYuY3k(colors2.semantic.background.ripple, false, RecyclerView.DECELERATION_RATE, null, gapComposer, 0, 14), false, null, new Role(0), function0, 12), 16.0f, 4.0f);
                RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$SpacedAligned, vertical, gapComposer, 54);
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m299paddingVpY3zN4);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                if (gapComposer.applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                function3 = composableLambdaImpl;
                function3.invoke(RowScopeInstance.INSTANCE, gapComposer, 54);
                gapComposer.end(true);
                j2 = j5;
                modifier2 = modifier3;
            } else {
                function3 = composableLambdaImpl;
                gapComposer.skipToGroupEnd();
                modifier2 = modifier;
                j2 = j;
            }
            RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.block = new TextViewKt$$ExternalSyntheticLambda0(function0, modifier2, j2, function3, i, 8);
            }
        }

        public static EmptyList getDeepLinkSpecs() {
            return ClientRoute.ViewAddCashAmountWithInstrument.deepLinkSpecs;
        }
    }

    public final class LiveConfiguration {
        public final long maxOffsetMs;
        public final float maxPlaybackSpeed;
        public final long minOffsetMs;
        public final float minPlaybackSpeed;
        public final long targetOffsetMs;

        public final class Builder {
            public long targetOffsetMs = -9223372036854775807L;
            public long minOffsetMs = -9223372036854775807L;
            public long maxOffsetMs = -9223372036854775807L;
            public float minPlaybackSpeed = -3.4028235E38f;
            public float maxPlaybackSpeed = -3.4028235E38f;

            public final LiveConfiguration build() {
                return new LiveConfiguration(this);
            }
        }

        static {
            new Builder().build();
            Util.intToStringMaxRadix(0);
            Util.intToStringMaxRadix(1);
            Util.intToStringMaxRadix(2);
            Util.intToStringMaxRadix(3);
            Util.intToStringMaxRadix(4);
        }

        public LiveConfiguration(Builder builder) {
            long j = builder.targetOffsetMs;
            long j2 = builder.minOffsetMs;
            long j3 = builder.maxOffsetMs;
            float f = builder.minPlaybackSpeed;
            float f2 = builder.maxPlaybackSpeed;
            this.targetOffsetMs = j;
            this.minOffsetMs = j2;
            this.maxOffsetMs = j3;
            this.minPlaybackSpeed = f;
            this.maxPlaybackSpeed = f2;
        }

        public final Builder buildUpon() {
            Builder builder = new Builder();
            builder.targetOffsetMs = this.targetOffsetMs;
            builder.minOffsetMs = this.minOffsetMs;
            builder.maxOffsetMs = this.maxOffsetMs;
            builder.minPlaybackSpeed = this.minPlaybackSpeed;
            builder.maxPlaybackSpeed = this.maxPlaybackSpeed;
            return builder;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LiveConfiguration)) {
                return false;
            }
            LiveConfiguration liveConfiguration = (LiveConfiguration) obj;
            return this.targetOffsetMs == liveConfiguration.targetOffsetMs && this.minOffsetMs == liveConfiguration.minOffsetMs && this.maxOffsetMs == liveConfiguration.maxOffsetMs && this.minPlaybackSpeed == liveConfiguration.minPlaybackSpeed && this.maxPlaybackSpeed == liveConfiguration.maxPlaybackSpeed;
        }

        public final int hashCode() {
            long j = this.targetOffsetMs;
            long j2 = this.minOffsetMs;
            int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.maxOffsetMs;
            int i2 = (i + ((int) ((j3 >>> 32) ^ j3))) * 31;
            float f = this.minPlaybackSpeed;
            int floatToIntBits = (i2 + (f != RecyclerView.DECELERATION_RATE ? Float.floatToIntBits(f) : 0)) * 31;
            float f2 = this.maxPlaybackSpeed;
            return floatToIntBits + (f2 != RecyclerView.DECELERATION_RATE ? Float.floatToIntBits(f2) : 0);
        }
    }

    public final class LocalConfiguration {
        public final long imageDurationMs;
        public final String mimeType;
        public final List streamKeys;
        public final ImmutableList subtitleConfigurations;
        public final Uri uri;

        static {
            Fragment$5$$ExternalSyntheticOutline0.m$1(0, 1, 2, 3, 4);
            Util.intToStringMaxRadix(5);
            Util.intToStringMaxRadix(6);
            Util.intToStringMaxRadix(7);
        }

        public LocalConfiguration(Uri uri, String str, DrmConfiguration drmConfiguration, List list, ImmutableList immutableList, long j) {
            this.uri = uri;
            this.mimeType = MimeTypes.normalizeMimeType(str);
            this.streamKeys = list;
            this.subtitleConfigurations = immutableList;
            ImmutableList.Builder builder = ImmutableList.builder();
            for (int i = 0; i < immutableList.size(); i++) {
                ((Subtitle) immutableList.get(i)).getClass();
                builder.m2032add((Object) new Subtitle());
            }
            builder.build();
            this.imageDurationMs = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LocalConfiguration)) {
                return false;
            }
            LocalConfiguration localConfiguration = (LocalConfiguration) obj;
            if (!this.uri.equals(localConfiguration.uri) || !Objects.equals(this.mimeType, localConfiguration.mimeType) || !Objects.equals(null, null) || !this.streamKeys.equals(localConfiguration.streamKeys)) {
                return false;
            }
            ImmutableList immutableList = localConfiguration.subtitleConfigurations;
            ImmutableList immutableList2 = this.subtitleConfigurations;
            immutableList2.getClass();
            return Maps.equalsImpl(immutableList, immutableList2) && this.imageDurationMs == localConfiguration.imageDurationMs;
        }

        public final int hashCode() {
            int hashCode = this.uri.hashCode() * 31;
            return (int) (((this.subtitleConfigurations.hashCode() + ((this.streamKeys.hashCode() + ((hashCode + (this.mimeType == null ? 0 : r1.hashCode())) * 29791)) * 961)) * 31 * 31) + this.imageDurationMs);
        }
    }

    public final class RequestMetadata {
        public static final RequestMetadata EMPTY = new RequestMetadata();

        static {
            Util.intToStringMaxRadix(0);
            Util.intToStringMaxRadix(1);
            Util.intToStringMaxRadix(2);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RequestMetadata);
        }

        public final int hashCode() {
            return 0;
        }
    }

    public final class Subtitle {
        static {
            Fragment$5$$ExternalSyntheticOutline0.m$1(0, 1, 2, 3, 4);
            Util.intToStringMaxRadix(5);
            Util.intToStringMaxRadix(6);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Subtitle) {
                throw null;
            }
            return false;
        }

        public final int hashCode() {
            throw null;
        }
    }

    static {
        IadFrame iadFrame = new IadFrame();
        ImmutableList.Itr itr = ImmutableList.EMPTY_ITR;
        RegularImmutableList regularImmutableList = RegularImmutableList.EMPTY;
        List list = Collections.EMPTY_LIST;
        RegularImmutableList regularImmutableList2 = RegularImmutableList.EMPTY;
        LiveConfiguration.Builder builder = new LiveConfiguration.Builder();
        RequestMetadata requestMetadata = RequestMetadata.EMPTY;
        iadFrame.buildClippingProperties();
        builder.build();
        MediaMetadata mediaMetadata = MediaMetadata.EMPTY;
        Fragment$5$$ExternalSyntheticOutline0.m$1(0, 1, 2, 3, 4);
        Util.intToStringMaxRadix(5);
    }

    public MediaItem(String str, ClippingProperties clippingProperties, LocalConfiguration localConfiguration, LiveConfiguration liveConfiguration, MediaMetadata mediaMetadata, RequestMetadata requestMetadata) {
        this.mediaId = str;
        this.localConfiguration = localConfiguration;
        this.liveConfiguration = liveConfiguration;
        this.mediaMetadata = mediaMetadata;
        this.clippingConfiguration = clippingProperties;
        this.requestMetadata = requestMetadata;
    }

    public static MediaItem fromUri(String str) {
        IadFrame iadFrame = new IadFrame();
        ImmutableList.Itr itr = ImmutableList.EMPTY_ITR;
        RegularImmutableList regularImmutableList = RegularImmutableList.EMPTY;
        List list = Collections.EMPTY_LIST;
        RegularImmutableList regularImmutableList2 = RegularImmutableList.EMPTY;
        LiveConfiguration.Builder builder = new LiveConfiguration.Builder();
        RequestMetadata requestMetadata = RequestMetadata.EMPTY;
        Uri parse = str == null ? null : Uri.parse(str);
        return new MediaItem("", new ClippingProperties(iadFrame), parse != null ? new LocalConfiguration(parse, null, null, list, regularImmutableList2, -9223372036854775807L) : null, new LiveConfiguration(builder), MediaMetadata.EMPTY, requestMetadata);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaItem)) {
            return false;
        }
        MediaItem mediaItem = (MediaItem) obj;
        return Objects.equals(this.mediaId, mediaItem.mediaId) && this.clippingConfiguration.equals(mediaItem.clippingConfiguration) && Objects.equals(this.localConfiguration, mediaItem.localConfiguration) && this.liveConfiguration.equals(mediaItem.liveConfiguration) && Objects.equals(this.mediaMetadata, mediaItem.mediaMetadata) && Objects.equals(this.requestMetadata, mediaItem.requestMetadata);
    }

    public final int hashCode() {
        int hashCode = this.mediaId.hashCode() * 31;
        LocalConfiguration localConfiguration = this.localConfiguration;
        int hashCode2 = (this.mediaMetadata.hashCode() + ((this.clippingConfiguration.hashCode() + ((this.liveConfiguration.hashCode() + ((hashCode + (localConfiguration != null ? localConfiguration.hashCode() : 0)) * 31)) * 31)) * 31)) * 31;
        this.requestMetadata.getClass();
        return hashCode2;
    }

    public static MediaItem fromUri(Uri uri) {
        IadFrame iadFrame = new IadFrame();
        ImmutableList.Itr itr = ImmutableList.EMPTY_ITR;
        RegularImmutableList regularImmutableList = RegularImmutableList.EMPTY;
        List list = Collections.EMPTY_LIST;
        RegularImmutableList regularImmutableList2 = RegularImmutableList.EMPTY;
        LiveConfiguration.Builder builder = new LiveConfiguration.Builder();
        return new MediaItem("", new ClippingProperties(iadFrame), uri != null ? new LocalConfiguration(uri, null, null, list, regularImmutableList2, -9223372036854775807L) : null, new LiveConfiguration(builder), MediaMetadata.EMPTY, RequestMetadata.EMPTY);
    }
}
